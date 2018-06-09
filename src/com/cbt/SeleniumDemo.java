package com.cbt;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumDemo {
	public static void main(String[] args) {
		
		//we always need to tell
		//1.what driver we will be using
		//2. where that driver is
		
		//System is a class
		//setProperty is a static method..takes two parameters
	//Chrome

	System.setProperty("webdriver.chrome.driver",
			"/Users/Jonathanguadron/Documents/selenium dependencies/drivers/chromedriver");// the last part we put it
	//Firefox
	
//	System.setProperty("webdriver.gecko.driver",
//			"/Users/Jonathanguadron/Documents/selenium dependencies/drivers/geckodriver");
	
	
	
	/*Test case 1: Google Title Verification
	 * 1.Open  a chrome browser
	 * go to http://google.com
	 * 3. Verify title: means equals ..it is the same
	 * Expected: google
	 * 
	 * 
	 */
	
	
	
//	WebDriver driver = new ChromeDriver();
	
//	driver.get("http://google.com");
//	String expected = "Google";
//	String actual = driver.getTitle();
//	
//	if(expected.equals(actual)) {
//		System.out.println("pass");
//	}else {
//		System.out.println("fail");
//		System.out.println("Expected :" + expected);
//		System.out.println("actual :" + actual);
//	}
//	
//	
//	
//	driver.close();
	
	
//	
	//WebDriver driver = new ChromeDriver();
	//get - goes to a certain website
	
	
//	driver.get("http://www.cybertekschool.com");
//	//getTitle()- gets the title of the current page
//	driver.get("http://google.com");
	
//	String expected ="Google";
//	String actual = driver.getTitle();
//	System.out.println(actual);
//	if(expected.equals(actual)) {
//		System.out.println("pass");
//	}else {
//		System.out.println("fail");
//		System.out.println("Expected: "+ expected);
//		System.out.println("Actual: "+actual);
//	}
//	
	//((((((((((((((((((((((((((((((TASK NUMBER 2)))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))
	//close the driver
	//driver.close();
	/*test case 2: Cybertek url Verification
	 * 1.open a chrome browser
	 * 2' got to http://Cybertekschool.com
	 * 3.verify title contains:
	 * Expected: cybertekschool
	 * 
	 * 
	 * 
	 * 
	 */
	
	
//	
//WebDriver driver = new ChromeDriver();
//	
//	//driver.navigate().to("");// another way of calling the driver.get(); it is the same.
//
//	driver.navigate().to("http://cybertekschool.com");
//	
//	String expected = "cybertekschool";
//	String actual = driver.getCurrentUrl();
//	
//	if(actual.contains(expected)) {
//		System.out.println("pass");
//	}else {
//		System.out.println("fail");
//		System.out.println("Expected: "+ expected);
//		System.out.println("Actual: "+actual);
//	}
//	driver.close();
//	
//	
//	driver.navigate().to("http:cybertekschool.com");
//	String expected = "cybertekschool";
//	//getCurrentUrl = gets the url of the currently open page
//	String actual = driver.getCurrentUrl();
//	if(actual.contains(expected)) {
//		System.out.println("pass");
//	}else {
//		System.out.println("fail");
//		System.out.println("Expected: "+ expected);
//		System.out.println("Actual: "+actual);
	//System.out.println("Expected ur " + expected);
//		
//	}
	
	//((((((((((((((((((((((((((((((TASK NUMBER 3)))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))
		//close the driver
		//driver.close();
		/*test case 3: BACK AND FORTH NAVIGATION
		 * 1. open chrome
		 * got ot google.com
		 * click on link "Gmail"
		 * 4.Verify title contains:
		 * Expected: Gmail
		 * 5. Go back to google by using the baack button
		 * 6.Expected: Google
		 * 7. Go back to Gmail using the forward button
		 * 8. Verify title contains:
		 * Expected: Gmail
		
		 * 
		 * 
		 * 
		 */
	
//	WebDriver driver = new ChromeDriver();
//	
//	driver.get("http://google.com");
//	driver.findElement(By.linkText("Gmail")).click();
//	String expected = "Gmail";
//	String actual = driver.getTitle();
//	
//	if(actual.contains(expected)) {
//		System.out.println("pass");
//	}else {
//		System.out.println("fail");
//		System.out.println("expected : "+ expected);
//		System.out.println("actual :" + actual);
//		
//	}
//	
//	driver.navigate().back();
//	expected = "Google";
//	actual = driver.getTitle();
//	if(actual.contains(expected)) {
//		System.out.println("pass");
//	}else {
//		System.out.println("fail");
//		System.out.println("expected : "+ expected);
//		System.out.println("actual :" + actual);
//		
//	}
//	
//	driver.navigate().forward();
//	expected = "Gmail";
//	actual = driver.getTitle();
//	if(actual.contains(expected)) {
//		System.out.println("pass");
//	}else {
//		System.out.println("fail");
//		System.out.println("expected : "+ expected);
//		System.out.println("actual :" + actual);
//		
//	}
//	
	
//	
//	driver.get("http://google.com");
//	//click on the gmail link
//	driver.findElement(By.linkText("Gmail")).click();
//	String expected = "Google";
//	
//	String actual = driver.getTitle();
//	if(actual.contains(expected)) {
//		System.out.println("pass");
//	}else {
//		System.out.println("fail");
//		System.out.println("Expected: "+ expected);
//		System.out.println("Actual: "+actual);
//		
//	}
//	
//	//goes back to previous page
//	driver.navigate().back();
// expected = "Google";
//	
//	 actual = driver.getTitle();
//	if(actual.contains(expected)) {
//		System.out.println("pass");
//	}else {
//		System.out.println("fail");
//		System.out.println("Expected: "+ expected);
//		System.out.println("Actual: "+actual);
//		
//	}
//	
//	//goes forward to [page where back button was clicked
//	driver.navigate().forward();
//	 expected = "Gmail";
//		
//		 actual = driver.getTitle();
//		if(actual.contains(expected)) {
//			System.out.println("pass");
//		}else {
//			System.out.println("fail");
//			System.out.println("Expected: "+ expected);
//			System.out.println("Actual: "+actual);
//			
//		}
//		
		//((((((((((((((((((((((((((((((TASK NUMBER 4)))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))
				
				/*test case 4: BACK AND FORTH NAVIGATION
				 * 1.open browser chrome
				 * 2go to website http://newtours.demoaut.com/
				 * 3enter username: tutorial
				 * 4enter password: tutorial
				 * 5click Sign in button
				 * 6Verify title contains:
				 * expected : Find a Flight
				
				 * 
				 * 
				 * 
				 */
	WebDriver driver = new ChromeDriver();
	
	///cybertek
//	
//	driver.get("https://learn.cybertekschool.com/login/canvas");
//	
//	driver.findElement(By.name("pseudonym_session[unique_id]")).sendKeys("jonathanguadron");
//	driver.findElement(By.name("pseudonym_session[password]")).sendKeys("Realmadrid45?");
//	driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
//	
//	
	driver.get("https://www.facebook.com/");
	
	driver.findElement(By.name("firstname")).sendKeys("jonathan");
	driver.findElement(By.name("lastname")).sendKeys("guadron");
	driver.findElement(By.name("reg_email__")).sendKeys("7032316878");
	driver.findElement(By.name("reg_passwd__")).sendKeys("Realllllll");
	driver.findElement(By.name("birthday_month")).sendKeys("sep");
	driver.findElement(By.name("birthday_day")).sendKeys("14");
	driver.findElement(By.name("birthday_year")).sendKeys("1992");
	driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();;
	driver.findElement(By.className("websubmit")).click();
	
	
//		driver.get("https://cybertekschool.com/");
//		//sendkeys - types text to input box
////		driver.findElement(By.name("userName")).sendKeys("tutorial");
////		driver.findElement(By.name("password")).sendKeys("tutorial");
//		//click - clicks
//		driver.findElement(By.name("LOG IN")).click();
//		String expected = "Find a Flight";
//		
//		String actual = driver.getTitle();
//		if(actual.contains(expected)) {
//			System.out.println("pass");
//		}else {
//			System.out.println("fail");
//			System.out.println("Expected: "+ expected);
//			System.out.println("Actual: "+actual);
//			
//		}
	
		//driver.close();
		
		
	
	}

}
