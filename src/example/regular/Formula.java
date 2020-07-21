package example.regular;

public class Formula implements LatexRenderable {

	private final String formString;
	
	public Formula(final String formula) {
		this.formString = formula;
	}
	
	public String toLaTex() {
		return "$" + formString + "$";
	}
	
	
}
