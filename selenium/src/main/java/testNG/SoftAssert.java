package testNG;
import org.testng.Assert;
import org.testng.annotations.Test;
public class SoftAssert {
	//	SoftAssert soft = new SoftAssert();
          @Test
       public void show() {
	                System.out.println("open browser");
	                Assert.assertEquals(true, true);
	                System.out.println(" username");
	                System.out.println(" password");          
	                System.out.println(" click to login");
	                Assert.assertEquals(true, false);
	                System.out.println(" validate home page");
	                Assert.assertEquals(true, false);
	                System.out.println(" go to deals page");
	                System.out.println(" contact page");
	                Assert.assertEquals(true, false);
	                System.out.println(" create a contact");
	                Assert.assertEquals(true, false);
	                System.out.println(" About info");
	                System.out.println(" Ask detailsSSS");
}
}
