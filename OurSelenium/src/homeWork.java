
public class homeWork {

	public static void main(String[] args) {
		homeWork obj = new homeWork();
		obj.results();
	}

	public void results() {
		String subject = "Bangla";
		int mark = 88;
		if (subject == "Bangla") {
			System.out.println("The subject is Bangla");
			if (mark >= 0 && mark <= 100) {
				if (mark >= 0 && mark <= 60) {
					System.out.println("And the Grade is F");
				} else if (mark >= 61 && mark <= 70) {
					System.out.println("And the Grade is C");
				} else if (mark >= 71 && mark <= 80) {
					System.out.println("And the Grade is B");
				} else if (mark >= 81 && mark <= 90) {
					System.out.println("And the Grade is A");
				} else if (mark >= 91 && mark <= 100) {
					System.out.println("And the Grade is A+");
				}
			} else {
				System.out.println("Error: something went wrong check your input please");
			}
		} else if (subject == "English") {
			System.out.println("The subject is English");
			if (mark >= 0 && mark <= 100) {
				if (mark >= 0 && mark <= 60) {
					System.out.println("And the Grade is F");
				} else if (mark >= 61 && mark <= 70) {
					System.out.println("And the Grade is C");
				} else if (mark >= 71 && mark <= 80) {
					System.out.println("And the Grade is B");
				} else if (mark >= 81 && mark <= 90) {
					System.out.println("And the Grade is A");
				} else if (mark >= 91 && mark <= 100) {
					System.out.println("And the Grade is A+");
				}
			} else {
				System.out.println("Error: something went wrong check your input please");
			}
		} else if (subject == "Math") {
			System.out.println("The subject is Math");
			if (mark >= 0 && mark <= 100) {
				if (mark >= 0 && mark <= 60) {
					System.out.println("And the Grade is F");
				} else if (mark >= 61 && mark <= 70) {
					System.out.println("And the Grade is C");
				} else if (mark >= 71 && mark <= 80) {
					System.out.println("And the Grade is B");
				} else if (mark >= 81 && mark <= 90) {
					System.out.println("And the Grade is A");
				} else if (mark >= 91 && mark <= 100) {
					System.out.println("And the Grade is A+");
				}
			} else {
				System.out.println("Error: something went wrong check your input please");
			}
		}
	}
}
