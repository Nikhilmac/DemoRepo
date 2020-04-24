package jala.Corejava.arrays;
import java.util.Date;

import java.text.SimpleDateFormat;

public class DateSimple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyy");
		System.out.println(sdf.format(d));
	

	}

}
