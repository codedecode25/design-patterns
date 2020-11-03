
public interface MyInterface {
	
	String s1 = "HELLO";
	
	void myAbstractMeth1();
	
	default void myAbstractMeth2() {
		System.out.println("M Brand New Default Method");
	}
	
	static void myAbstractMeth3() {
		System.out.println("M Static Method");
	}

}
