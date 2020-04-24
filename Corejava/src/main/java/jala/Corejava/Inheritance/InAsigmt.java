package jala.Corejava.Inheritance;

public class InAsigmt {

	public static void main(String[] args) {
		students a=new students();
		a.maintain();
		a.check();
			}
}

class dean{
	void maintain() {
		String name="staff";
		int emmpid=78;
		System.out.println(name);
	}
	void check() {
		String name="Students";
		int marks=77;
		System.out.println(name);

	}
}
class Teacher extends dean
{
   void maintain() {
	   String name="Assingments";
	   int empid=45;
	   super.maintain();
	   System.out.println(name);
   }
   void exams() {
	   int marks=74;
	   String d="exams";
   }
}
class students extends Teacher{
	void maintain() {
		
		 //  String name="notes";
		   super.maintain();
		  // int rolllno=100;
		 //  System.out.println(name);
	   }
	void games() {
		
		String n="cri";
		
	}
}