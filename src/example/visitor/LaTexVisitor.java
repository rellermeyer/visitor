package example.visitor;

public class LaTexVisitor implements Visitor {

	private StringBuilder builder = new StringBuilder();
	
	@Override
	public void visit(final PlainText plainText) {
		builder.append(plainText.text);
		builder.append('\n');
	}

	@Override
	public void visit(final Formula formula) {
		builder.append("$" + formula.formString + "$");
		builder.append('\n');		
	}

	@Override
	public void visit(final Graphic graphic) {
		builder.append("\\includegraphics[width=" + graphic.width + "]{" + graphic.filePath + "}");
		builder.append('\n');
	}

	public String getOutput() {
		return builder.toString();
	}
	
}
