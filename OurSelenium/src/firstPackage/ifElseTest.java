package firstPackage;

public class ifElseTest {

	public static void main(String[] args) {
		ifElseTest obj = new ifElseTest();
		obj.firstMethod();
	}

	String day = "Friday";

	public void firstMethod() {
		if (day == "Sunday") {
			System.out.println("Today is Sunday");		
		}else if(day == "Monday") {
			System.out.println("Today is Monday");
		}else if(day == "Tuesday") {
			System.out.println("Today is Tuesday");
		}else if(day == "Wednesday") {
			System.out.println("Today is Wednesday");
		}else if(day == "Thursday") {
			System.out.println("Today is Thursday");
		}else if(day == "Friday") {
			System.out.println("Today is Friday");
		}else {
			System.out.println("Something went wrong check the code");
		}
		
	}

}
