package example.singledispatch;

public class MyBuffer {
	public void append(String s) {
		System.out.println("append(String) was called");
	}
	
	public void append(Object o) {
		System.out.println("append(Object) was called");
	}

}
