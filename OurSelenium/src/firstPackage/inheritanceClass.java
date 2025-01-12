package firstPackage;

public class inheritanceClass {

	public static void main(String[] args) {
		//ClassB obj = new ClassB();
		ClassC obj = new ClassC();
		obj.aaa();
		obj.aaa(20, 30);
		obj.aaa(50, 60);
		obj.cbc();
		obj.xyz();
		obj.displayResults();
	}

}
