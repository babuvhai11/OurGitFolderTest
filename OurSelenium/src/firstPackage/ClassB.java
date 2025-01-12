package firstPackage;

public class ClassB extends ClassA {
	int x = 10;
	int y = 20;

	public void cbc() {
		System.out.println("I am inside class B");
	}
	
	public void aaa() {
		System.out.println("I am inside class B with same method name");
	}
	public void displayResults() {
		System.out.println(x);
		super.displayResults();
	}
	
	
}
