//Runtime Polymorphism 

package jala.Corejava.Inheritance;
class animal
{      int x=45;
		public void move() {
		System.out.println("animal are in forest");
	}
}
class tiger extends animal
{
	int x=68;
	
public void move(){
		
	System.out.println("tiger can run fast"); 
}
}
class deer extends animal {
	int x=778989;
	public void move() {
	System.out.println("deer can eat");
}
}
public class Overiden
{
	public static void main(String[] args) {
		//animal obj=new tiger();
		//obj.move();
		//System.out.println(obj.x);
	//tiger obj1=new tiger();
	animal obj2=new deer();
	System.out.println(obj2.x);
		//obj.move();
		//obj1.move();
		//obj2.move();
		/* r;
		
		r = obj;
		
		r.move();
		
	    r =obj1;
	    r.move();
	
     	r=obj2;
		
		r.move();*/
		
	}
}
