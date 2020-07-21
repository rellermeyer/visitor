package example.visitor;

import java.util.Arrays;
import java.util.List;


public class Main {

	public static void main(final String...args) {
		final List<Visitable> elements = Arrays.<Visitable>asList(new PlainText("Foo"), new Formula("x + y"), new Graphic("plot.jpg", 100));
		
	//	final LaTexVisitor visitor = new LaTexVisitor();
		final HTMLVisitor visitor = new HTMLVisitor();

		
		for (final Visitable elem : elements) {
			elem.accept(visitor);
		}
		
		System.out.println(visitor.getOutput());
	}
	
}
