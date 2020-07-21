package example.visitor;

public class Graphic implements Visitable {
	
	protected String filePath;
	protected int width;

	public Graphic(final String file, final int width) {
		this.filePath = file; 
		this.width = width;
	}
	
	@Override
	public void accept(final Visitor visitor) {
		visitor.visit(this);
	}
}
