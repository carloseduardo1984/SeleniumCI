package example;



import org.testng.annotations.Test;

public class RegularExpressionGroupTest {	
	
	

	
	 @Test(groups = { "include-test-one" })
	    public void testMethodOne() {
	        System.out.println("Test method one");
	        
//	        String expectedTitle = "Welcome: Mercury Tours";
//	            System.out.println("launching firefox browser"); 
//	            System.setProperty("webdriver.gecko.driver", driverPath);
//	            driver = new FirefoxDriver();
//	            driver.get(baseUrl);
//	            String actualTitle = driver.getTitle();
//	            Assert.assertEquals(actualTitle, expectedTitle);
            
		    
		   
	    }
	 
	    @Test(groups = { "include-test-two" })
	    public void testMethodTwo() {
	        System.out.println("Test method two");
	    }
	 
	    @Test(groups = { "test-one-exclude" })
	    public void testMethodThree() {
	        System.out.println("Test method three");
	    	
		   
	        
	    }
	 
	    @Test(groups = { "test-two-exclude" })
	    public void testMethodFour() {
	        System.out.println("Test method Four");
	    }
}	