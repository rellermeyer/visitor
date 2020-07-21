package example.singledispatch;

public class Main {

	public static void main(String ...args) {
		final MyBuffer buf = new MyBuffer();
		String s = new String("foo");
		Object o = new String("bar");
		
		buf.append(s);
		buf.append(o);
	}
	
}
