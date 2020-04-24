package coreja.thissuper;

public class ThisDemmo
{
	int x=77;
	String nam="mm";
	public void show()
	{
		int x=0000;
		String nam="tttttttttt";
		System.out.println(x+"=x  nam="+nam);
		System.out.println(this.x+"=x  nam="+nam);

	}
public static void main(String[] args)
{
	ThisDemmo obj=new ThisDemmo();
	obj.show();
}
}
