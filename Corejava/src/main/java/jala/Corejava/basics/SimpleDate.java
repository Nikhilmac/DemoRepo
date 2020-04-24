package jala.Corejava.basics;
import java.util.Date;
import java.text.SimpleDateFormat;

public class SimpleDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		String Date=sdf.format(new Date());
		System.out.println(Date);

	}

}
