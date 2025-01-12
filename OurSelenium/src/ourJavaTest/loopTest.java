package ourJavaTest;

public class loopTest {

	public loopTest() {
		System.out.println("I am inside the constractor");
	}
//	public loopTest(int i, int j) {
//		int l = i+j;
//		System.out.println("The addition inside constractor = "+l);
//	}
//	public loopTest(int i, int j, int r) {
//		int l = i+j+r;
//		System.out.println("The addition inside constractor = "+l);
//	}

	public static void main(String[] args) {
		loopTest obj = new loopTest();
		//loopTest obj1 = new loopTest(20, 30);
		//loopTest obj2 = new loopTest(50, 60, 40);
		//obj.firstloop();
		//obj.doWhileLoopTest();
		obj.reminderMethod();
	}

	public void firstloop() {
		int i;

		for (i = 11; i <= 10; i++) {
			System.out.println("The number is =" + i);
			String name = "Nahid";
			if (name == "Mou") {
				System.out.println("Inside If " + name);
				break;
			} else {
				System.out.println("Outside If " + name);
			}
		}
	}

	public void doWhileLoopTest() {
		int i = 11;
		do {
			System.out.println("Do While =" + i);
			String name = "Mou";
			if (name == "Mou") {
				System.out.println("Inside If " + name);
				break;
			} else {
				System.out.println("Outside If " + name);
			}
			i++;
		} while (i < 10);
	}
	
	public void reminderMethod() {
		int i;
		for (i = 1; i <= 10; i++) {
			System.out.println("The number is =" + i);
			if (i%2==0) {
				System.out.println("Even Number");	
			} else {
				System.out.println("Odd Number");
			}
		}
	}
	
	
	
}
