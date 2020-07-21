package example.visitor;

public class Formula implements Visitable {

	protected final String formString;
	
	public Formula(final String formula) {
		this.formString = formula;
	}

	@Override
	public void accept(final Visitor visitor) {
		visitor.visit(this);
	}
	
}
