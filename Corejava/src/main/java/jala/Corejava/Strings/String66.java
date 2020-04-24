package jala.Corejava.Strings;

public class String66 {
	public static void main(String[] args) {
		String name="nikhil is good";
		System.out.println(name.matches("(.*)nikhil"));
		System.out.println(name.matches("nikhil(.*)"));
		System.out.println(name.matches("(.*)is(.*)"));
		System.out.println(name.matches("is(.*)"));
		System.out.println(name.matches("(.*)good(.*)"));
	}

}
