package example.visitor;

public class HTMLVisitor implements Visitor {

	private StringBuilder builder = new StringBuilder();
	
	@Override
	public void visit(final PlainText plainText) {
		builder.append("<p>" + plainText.text + "</p>");
		builder.append('\n');
	}

	@Override
	public void visit(final Formula formula) {
		builder.append("<mrow>" + formula.formString + "<mrow>");
		builder.append('\n');		
	}

	@Override
	public void visit(final Graphic graphic) {
		builder.append("<img width=\'" + graphic.width + "\' src=\\'" + graphic.filePath + "\\'/>");
		builder.append('\n');
	}

	public String getOutput() {
		return builder.toString();
	}
	
}
