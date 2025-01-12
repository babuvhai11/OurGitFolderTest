package firstPackage;

public class firstTestClass {

	int a = 20;
	int b = 10;
	
	static int r = 50;
	static int e = 50;
	
	

	public static void main(String[] args) {
		firstTestClass obj = new firstTestClass();
		obj.abc();
		obj.xyz();
		obj.hhh();
		obj.www(15, 25);
		obj.www(10, 20);
		obj.www(30, 40);
		obj.vvv();
		obj.name();
		
		int q = 10 + obj.vvv();
		System.out.println(q);
		firstTestClass.hjk();
		
	}

	public void abc() {
		int x = a + b;
		System.out.println("The value of X = " + x);
	}

	public void xyz() {
		int o = 20;
		int p = 30;
		int u = p-o;
		int y= p+a;
		System.out.println("The value of u = "+u);
		System.out.println("Print the value of y = "+ y);
	}
	
	public void hhh() {
		String fName = "MD";
		String lName = "Islam";
		String myName = fName+" "+lName;
		System.out.println("My Name Is = "+ myName );
	}
	
	public void www(int a, int b) {
		int r= a+b;
		System.out.println("The value of r = "+ r);
	}
	
	public static void hjk() {
		int l = r+e;
		System.out.println("the static value + "+ l);
	}
	public int vvv() {
		int x = a + b;
		System.out.println("I am in return method = "+ x);
		return x;
	}
	
	public void name() {
		int w = 10 + vvv();
		System.out.println("I am the name method = " + w);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
