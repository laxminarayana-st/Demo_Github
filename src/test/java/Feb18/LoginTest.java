package Feb18;

import org.testng.annotations.Test;

public class LoginTest extends BaseClass
{	
	@Test
	public void verifyLogin()
	{	
		test.assignAuthor("Laxminarayana Gardasu");
		
		driver.get("https://google.com");
		Thread.sleep(2000);

		String Expected = "Google";
		String Actual = driver.getTitle();
		test.info(Expected+" "+Actual);

		if(Actual.equalsIgnoreCase(Expected))
		{
			test.pass("Title is Matching "+ Expected+"-----------------"+Actual);
		}else
		{
			test.fail("Title is not Matching "+ Expected+"-----------------"+Actual);
			test.addScreenCaptureFromPath("path");
		}

	}

	@Test
	public void verifyTitle() throws Throwable
	{	
		test.assignAuthor("Laxminarayana Gardasu");
		driver.get("https://google.com");
		Thread.sleep(2000);		

		String Expected = "Gmail";
		String Actual = driver.getTitle();
		test.info(Expected+" "+Actual);

		if(Actual.equalsIgnoreCase(Expected))
		{
			test.pass("Title is Matching "+ Expected+"-----------------"+Actual);
		}else
		{
			test.fail("Title is not Matching "+ Expected+"-----------------"+Actual);
			test.addScreenCaptureFromPath("path");
		}

	}


	@Test
	public void verifyTitle1() throws Throwable
	{	
		test.assignAuthor("Laxminarayana Gardasu");
		driver.get("https://gmail.com");
		Thread.sleep(2000);		
		
		String Expected = "Gmail";
		String Actual = driver.getTitle();
		test.info(Expected+" "+Actual);

		if(Actual.equalsIgnoreCase(Expected))
		{
			test.pass("Title is Matching "+ Expected+"-----------------"+Actual);
		}else
		{
			test.fail("Title is not Matching "+ Expected+"-----------------"+Actual);
			test.addScreenCaptureFromPath("path");
		}	

	}
}
