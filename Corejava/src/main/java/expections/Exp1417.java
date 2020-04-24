package expections;

public class Exp1417 {

	public static void main(String[] args) {
		try {
			String name="Nikhil";
		System.out.println(name.length());
		char c=name.charAt(10);
		System.out.println(c);
		System.out.println("perfect");
		}catch(Exception e) {
			System.out.println(e);
			System.out.println("problem");
		}
		System.out.println("Nikhil");

	}

}
