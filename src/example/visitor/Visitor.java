package example.visitor;

public interface Visitor {
	
	public void visit(final PlainText text);

	public void visit(final Formula formula);
	
	public void visit(final Graphic graphic);
	
}
