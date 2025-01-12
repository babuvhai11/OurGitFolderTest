package ourJavaTest;

public class ifElseClass {

	public static void main(String[] args) {
		ifElseClass obj = new ifElseClass();
		obj.selectVoter();
	}

	public void selectVoter() {
		int age = 25;
		String status = "Citizen";
		if (status == "Citizen") {
			System.out.println("You are a Citizen");
			if (age >= 18 && age <= 62) {
				System.out.println("I am a voter");
				if(age >=18 && age <=21) {
					System.out.println("First time voter");
				}
			} else if (age >= 63 && age <= 110) {
				System.out.println("I am a sinior voter");
			} else if (age >= 111) {
				System.out.println("Error: something went wrong, please check your age.");
			} else {
				System.out.println("you are not a voter");
			}
		}else {
			System.out.println("Please check you Status");
		}
	}
}
