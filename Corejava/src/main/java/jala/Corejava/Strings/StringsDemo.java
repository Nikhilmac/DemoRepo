package jala.Corejava.Strings;

public class StringsDemo {
	public static void main(String[] args) {
		String name="Nikhil";
		System.out.println(name.hashCode());
		System.out.println(name.charAt(1));//returns character at index position o/p:i
		System.out.println(name.length());//returns length of string
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		String nam="who is MAhesh babu in babu film";
		System.out.println(nam.indexOf("babu"));
		System.out.println(name.concat(" is a good employee"));
		System.out.println(name.replace('i', 'm'));
		System.out.println(name.replaceAll("Nikhil", "Akhil"));
		char[] c=name.toCharArray();
		for(char n:c) {
		System.out.println(n);
		//System.out.println(name.hashCode());
				
	}
	}
}
