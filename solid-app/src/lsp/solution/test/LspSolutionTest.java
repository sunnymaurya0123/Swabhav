package lsp.solution.test;

import lsp.solution.Rectangle;
import lsp.violation.Square;

public class LspSolutionTest {

	public static void main(String[] args) {
		Rectangle rect=new Rectangle(20,30);
		Square square=new Square(20);
		shouldNotChangeHeightIfWidthChanges(rect);
		//shouldNotChangeHeightIfWidthChanges(square);

	}

	static void shouldNotChangeHeightIfWidthChanges(Rectangle rect) {
		int before=rect.getHeight();
		rect.setWidth(rect.getWidth()+10);
		int after=rect.getHeight();
		System.out.println(after==before);
		System.out.println(after);
		System.out.println(before);
	}
}
