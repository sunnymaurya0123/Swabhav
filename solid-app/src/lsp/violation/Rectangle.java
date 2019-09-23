package lsp.violation;

public class Rectangle {
	protected int width;
	protected int height;
	
	public Rectangle(int width,int height) {
		this.width=height;
		this.height=height;
	}
	
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
