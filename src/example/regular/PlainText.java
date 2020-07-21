package example.regular;

public class PlainText implements LatexRenderable {
	
	private final String text;
	
	public PlainText(final String text) {
		this.text = text;
	}
	
	public String toLaTex() {
		return text;
	}
	
}
