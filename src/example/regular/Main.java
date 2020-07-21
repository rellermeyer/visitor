package example.regular;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(final String ...args) {
		final List<LatexRenderable> elements = Arrays.<LatexRenderable>asList(new PlainText("Foo"), new Formula("x + y"), new Graphic("plot.jpg", 100));
		
		for (final LatexRenderable elem : elements) {
			System.out.println(elem.toLaTex());
		}
		
	}
	
}
