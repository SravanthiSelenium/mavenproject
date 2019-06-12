package selenium.maven;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class testNGgroupTest {
  @Test(groups="fmonthd",enabled=false)
  public void f() {
	  System.out.println(" f monthd");
  }
  @Test(groups="fmonthd")
  public void f1() {
	  System.out.println("1st f monthd");
  }
  @Test(groups="gmonthd",dependsOnGroups="fmonthd")
  public void g() {
	  System.out.println("st g monthd");
  }
  @Test(groups="gmonthd")
  public void g1() {
	  System.out.println("1st g monthd");
  }
  
  @BeforeClass
  public void beforeClass() {
	  System.out.println("BeforeClass monthd");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("@AfterClass monthd");
  }

}
