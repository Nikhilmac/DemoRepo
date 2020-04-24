package testNG;

import org.testng.annotations.Test;

public class Priority {

@Test ( priority = 1)
public void cmethod(){
System.out.println("I'm in method C");
}
@Test  ( priority =3)
public void bmethod(){
System.out.println("I'm in method B");
}
@Test
public void amethod(){
System.out.println("I'm in method A");
}
@Test ( priority = 2)
public void emethod(){
System.out.println("I'm in method E");
}
@Test
public void method(){
System.out.println("I'm in method D");
}

}