package firstPackage;

public class encapsulationDemo {
	private int SSN;
	private String Name;
	private int AGE;

	public int getSSN() {
		return SSN;
	}

	public void setSSN(int sSN) {
		SSN = sSN;
	}

	public void printResult() {
		System.out.println("This is my SSN = "+getSSN());
		System.out.println("This is my NAME = "+getName());
		System.out.println("This is my AGE = "+getAGE());
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getAGE() {
		return AGE;
	}

	public void setAGE(int aGE) {
		AGE = aGE;
	}
}
