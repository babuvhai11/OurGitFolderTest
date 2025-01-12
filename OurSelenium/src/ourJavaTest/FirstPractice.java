package ourJavaTest;

public class FirstPractice {

	int i = 20;
	int j = 10;
	static int x = 10;
	static int y = 20;
	String fName = "Md";
	String lName = " Islam";

	public static void main(String[] args) {
		FirstPractice obj = new FirstPractice();
//		obj.firstMethod();
//		obj.secondMethod();
		//obj.abcMethod(50,20);
		obj.abcMethod(20, 30);
		obj.abcMethod();
//		obj.www();
//		obj.XYZ();
//		obj.rrr();
//		obj.abc();
//		obj.uuu();
//		
		System.out.println(obj.ooo());
	}

	public void firstMethod() {
		int h = i + j;
		System.out.println("The result is: " + h);
	}

	public void secondMethod() {
		int l = 15;
		int k = 5;
		int j = l - k;
		int h = i + j;
		System.out.println("The result number 2 : " + h);
		System.out.println("The result for MOU vabi: "+ j);
	}
	public void abcMethod() {
		int n =10;
		int B = 20;
		int m = n+B;
		System.out.println("The result for method paramiter: "+ m);
	}
	public void abcMethod(int n, int B) {
		int m = n+B;
		System.out.println("The result for method paramiter: "+ m);
	}

	public void abcMethod(int n, int B, int c) {
		int m = n+B;
		System.out.println("The result for method paramiter: "+ m);
	}
	public static void www() {
		int a = x+y;
		System.out.println("this is the static result: "+ a);
	}
	
	public void XYZ() {
		
		System.out.println("My Name Is: "+fName +" "+ lName);
	}
	public void rrr() {
		int w = (i*j)+ 89;
		System.out.println("The answer is: "+ w);
	}
	
	public int abc(){
		int l = i-j;
		System.out.println("I am in return type method: "+ l);
		return l;
	}
	
	public void uuu() {
		int p = abc()+12;
		System.out.println("Just Print: "+ p);
	}
	public String ooo() {
		String myName = fName + lName;
		return myName;
	}
	
}
