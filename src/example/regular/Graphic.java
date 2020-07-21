package example.regular;

public class Graphic implements LatexRenderable {
	
	private String filePath;
	private int width;

	public Graphic(final String file, final int width) {
		this.filePath = file; 
		this.width = width;
	}
	
	public String toLaTex() {
		return "\\includegraphics[width=" + width + "]{" + filePath + "}";
	}
	
}
