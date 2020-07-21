package example.visitor;

public class PlainText implements Visitable {
	
	protected final String text;
	
	public PlainText(final String text) {
		this.text = text;
	}

	@Override
	public void accept(final Visitor visitor) {
		visitor.visit(this);
	}
	
}
