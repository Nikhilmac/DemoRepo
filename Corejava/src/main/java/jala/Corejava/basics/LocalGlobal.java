package jala.Corejava.basics;

public class LocalGlobal {
	
	int a=40;
	double b=24.9;
	String c="man";
	
  public static void main(String[] args)
  
  {
	 int i=45;
     System.out.println(i);

     LocalGlobal obj=new LocalGlobal();
     System.out.println(obj.a);
     System.out.println(obj.b);
    obj.show();

}

  public void show()
  { 
	int  i=24;
	double b=2.2;
	System.out.println(i);
  }
}