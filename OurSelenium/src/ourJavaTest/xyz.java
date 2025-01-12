package ourJavaTest;

public class xyz {
	xyz(){
		System.out.println("I am inside the constractor");
	}
	xyz(String name, String city){
		System.out.println(name);
	}
	
	int a = 10;
	int b = 20;
	String desh = "Bangladesh";
	String city = "Dhak";

	public static void main(String[] args) {
		xyz obj = new xyz();
		xyz obj1 = new xyz("bangladesh", "Dhaka");
		obj.wwe();
		obj1.wwf();
	}

	public void wwe() {
		int h = a + b;
		System.out.println(h);
	}

	public String wwf() {
		String w = city + ", " + desh;
		System.out.println(w);
		return w;

	}
}
