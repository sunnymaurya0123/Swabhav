var module1 = angular.module('modA', ['ngRoute'])

module1.factory("productDataService",["$http","$routeParams",function($http,$routeParams){
    service={}
    service.getProduct=function(){
        return $http.get("products.json")
    }
    service.getSingleProduct=function(productslist){
        for (var i = 0; i < productslist.length; i++) {
            // console.log("variable:"+i)
            if (productslist[i].productCode == $routeParams.productCode){
            // console.log("variable:"+$scope.productslist[i].productCode)
            var singleproduct =  productslist[i];
            return singleproduct
            }
          }
    }
    return service
}])

module1.config(["$routeProvider",function($routeProvider){
    $routeProvider
    .when("/",{
        templateUrl : "./fragments/home.html",
        controller : 'homeController'

    })
    .when("/home",{
        templateUrl : "./fragments/home.html",
        controller : 'homeController'

    })
    .when("/productlist",{
        templateUrl : "./fragments/productlist.html",
        controller : 'productlistController'
    })
    .when("/productdetails/:productCode",{
        templateUrl : "./fragments/productdetails.html",
        controller : 'productdetailsController'
    })    
}])

module1.controller("homeController",["$scope",function($scope){
    $scope.home={
        data : "Home Controller"
    }
}])

module1.controller("productdetailsController",["$scope","productDataService",function($scope,productDataService){
    
    productDataService.getProduct().then(function(product){
        // console.log(product)
        $scope.productslist=product.data
        // console.log($scope.productslist)
        $scope.Singleproduct=productDataService.getSingleProduct($scope.productslist)
    })

    $scope.getStars = function(rating) {
    var val = parseFloat(rating);
    var size = val/5*100;
    return size + '%';
    }

}])


module1.controller("productlistController",["$scope","productDataService",function($scope,productDataService){

    $scope.data1="hello"
    $scope.isVisible=true
    $scope.hideShow_image="Hide Image"

    productDataService.getProduct().then(function(product){
        console.log(product)
        $scope.productslist=product.data
    })
    
    $scope.getStars = function(rating) {
        var val = parseFloat(rating);
        var size = val/5*100;
        return size + '%';
      }

    $scope.showHide=function(){
        if ($scope.isVisible) {
            $scope.isVisible=false
            $scope.hideShow_image="Show Image"
        } else {
            $scope.isVisible=true
            $scope.hideShow_image="Hide Image"
        }
    }
}])

module1.directive("averageStarRating", function () {
    return {
        template: "<div class='average-rating-container'>" +
            "  <ul class='rating'>" +
            "    <li ng-repeat='star in stars' class='star'>" +
            "    </li>" +
            "  </ul>" +
            "  <ul class='rating foreground' style='width:{{filledInStarsContainerWidth}}%'>" +
            "    <li ng-repeat='star in stars' class='filled'>" +
            "      <i class='glyphicon glyphicon-star'></i>" +
            "    </li>" +
            "  </ul>" +
            "</div>",
        scope: {
            bindStarRating: "=ngModel",
            max: "="
        },
        link: function (scope) {
            //  scope.max = 5;
            scope.stars = [];
            for (var i = 0; i < scope.max; i++) {
                scope.stars.push({});
            }
            var starContainerMaxWidth = 100; //%
            console.log(scope.bindStarRating)
            scope.filledInStarsContainerWidth = scope.bindStarRating / scope.max * starContainerMaxWidth;
        }
    };
});