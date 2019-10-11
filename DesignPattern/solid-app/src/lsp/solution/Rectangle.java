package lsp.solution;

public class Rectangle implements IShape {

	private int width;
	private int height;
	
	public Rectangle(int width,int height) {
		this.width=height;
		this.height=height;
	}
	@Override
	public int calculateArea() {
		return width*height;
		
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	

}
