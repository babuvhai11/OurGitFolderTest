package ourJavaTest;

public class ourArrayTest {

	public static void main(String[] args) {
		int[] a = { 2, 8, 41, 65, 80, 90 };

//		System.out.println(a[2]);
//		System.out.println("The array value is = " + a[4]);
//		System.out.println("The array value is = " + a[0]);
//
//		int[] a1 = new int[5];
//		a1[0] = 2;
//		a1[1] = 8;
//		a1[2] = 41;
//		a1[3] = 65;
//		a1[4] = 80;
//		a1[5] = 90;

		// System.out.println(a1);

		int[][] a2 = { { 23, 5, 46, 25, 78, 9 }, 
				       { 65, 7, 5, 15, 58, 53 }, 
				       { 89, 63, 67, 27, 37, 0 } };

//		System.out.println("The multydimentional array value ="+a2[1][3]);
//		System.out.println("The multydimentional array value ="+a2[2][4]);
//		System.out.println("The multydimentional array value ="+a2[1][5]);
//		
//		int [][] a3 = new int[2][5];
//		a3[0][0]=23;
		System.out.println("--------------------------------------");
		for (int i = 0; i < 3; i++) {
			for (int y = 0; y < 6; y++) {
				System.out.println(a2[i][y]);
			}
		}
	}

}
