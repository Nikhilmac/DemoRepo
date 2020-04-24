package jala.Corejava.Inheritance;

public class SuperDe
{

	public static void main(String[] args) 
{
		// TODO Auto-generated method stub
    bike obj=new bike();
    obj.display();
}

}
class vehicle
{
	int speed=45;
	
}
class bike extends vehicle
{
	int speed=35;
	void display() 
	{
		System.out.println(super.speed);
	}
}
