package firstPackage;

public class ClassA {
	int x = 50;
	int y = 60;
	public void aaa() {
		System.out.println("I am inside class A");
	}
	public void aaa(int a, int b) {
		int c= a+b;
		System.out.println("I am inside class A= " +c);
	}
	public void qqq(int x, int y) {
		int c= x+y;
		System.out.println("Hello World = " +c);
	}
	public void displayResults() {
		System.out.println("just Print nothing");
	}
}
