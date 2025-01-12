package ourJavaTest;

import java.util.ArrayList;

public class ourArraylistTest {

	public static void main(String[] args) {
		ArrayList<String> name = new ArrayList<>();
		ArrayList<Integer> name1 = new ArrayList<>();
		
		name.add("Moni");
		name.add("Anwar");
		name.add("Robiul");
		name.add("Nahid");
		name.add("Mou");
		name.add("Nadia");
		name.add(3, "King");
		name.remove(3);
		name.isEmpty();
		name.size();
		
		
		
		
		name1.add(2);
		name1.add(8);
		name1.add(41);
		System.out.println(name);
		System.out.println(name.size());

	}

}
