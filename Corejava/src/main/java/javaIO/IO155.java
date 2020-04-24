package javaIO;

import java.io.FileReader;
import java.io.IOException;

public class IO155 {
public static void main(String[] args) throws IOException {
  FileReader fr=null;
  try {
	  fr=new FileReader("Sagar");
	  int x;
	  while((x=fr.read())!=-1) {
		  System.out.print((char)x);
	  }
	  
  }
catch(Exception e) {
	e.printStackTrace();
}
  finally {
	  fr.close();
  }

}


}
