package TestNG;

import org.testng.annotations.Test;

public class TestNGDemo {

	@Test
  public void sample1() {
	   
	  System.out.println("First program");
  }
    // For skipping test case 
	//throw new skipException("Skipping Test");   
	
	@Test
	  public void sample2() {
		   
		  System.out.println("Second program");
	  }
	
}
