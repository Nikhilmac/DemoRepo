package jala.Corejava.Inheritance;

public class SuperDemo {

	public static void main(String[] args) {
       B obj=new B(15);
	}
	}
	class A{
		
		public A() {
			System.out.println("const A");
		}
		public A(int i) {
			System.out.println("const A parameter");
		}
	}
	class B extends A{
		public B() {
			System.out.println("const B");
		}
		public B(int i) {
			super(i);
			System.out.println("const B parameter");
		}
	}


