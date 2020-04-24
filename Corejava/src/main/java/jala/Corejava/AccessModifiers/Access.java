package jala.Corejava.AccessModifiers;
class A
{  
/* private */ protected int x=45;
/* private */ String name="nikhil";
/*private*/  protected void show() 
	{
		System.out.println("excute the menhod");
	}
	}
class B extends A
{  
	
	int y=x;
	String n="jala";
	public void demo() {
		System.out.println("demo B");
	} 
}
class Access{
	public static void main(String[] args) {
			A a=new A();
			B b=new B();
     		System.out.println(a.x);
			a.show();
			b.demo();
	
	}
}
