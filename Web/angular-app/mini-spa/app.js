var module1 = angular.module('modA', ['ngRoute'])
    module1.config(function($routeProvider){
        $routeProvider
        .when("/",{
            templateUrl : "fragments/home.html",
            controller : 'homeController'

        })
        .when("/home",{
            templateUrl : "fragments/home.html",
            controller : 'homeController'

        })
        .when("/about",{
            templateUrl : "fragments/about.html",
            controller : 'aboutController'
        })
        .when("/career",{
            templateUrl : "fragments/career.html",
            controller : 'careerController'
    })
})

module1.controller("homeController",function($scope){
    $scope.home={
        data : "Home Controller"
    }
})
module1.controller("aboutController",function($scope){
    $scope.about={
        data : "About Controller"
    }
})
module1.controller("careerController",function($scope){
    $scope.career={
        data : "Career Controller"
    }
})

