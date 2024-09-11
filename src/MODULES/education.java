package MODULES;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class education {
	@BeforeMethod
	public void method()
	{
		System.out.println("I am education!!");
	}
	@BeforeSuite
	public void bfre()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://dreamzcmms.freshdesk.com/");
		driver.close();
	}
    @Test(groups= {"Play"})
	public void eduLogin()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.udemy.com/");
		String login=driver.findElement(By.xpath("//*[text()='Log in']")).getText();
		System.out.println(login);
		driver.close();
	}
    @Parameters({"Book Flight3","Book Hotel3"})
    @Test(groups= {"Play"})
    public void eduSignup(String url, String hotel)
    {
    	WebDriver driver=new ChromeDriver();
		driver.get("https://www.udemy.com/");
		String signup=driver.findElement(By.xpath("//*[text()='Sign up']")).getText();
		System.out.println(signup);
		 System.out.println("I am education's  parameter: "+url);
		 System.out.println("Hi I am test level hotel: "+hotel);
		driver.close();
    }
    
    @Test(enabled=true)
    public void categories()
    {
    	WebDriver driver=new ChromeDriver();
		driver.get("https://www.udemy.com/");
		String categories=driver.findElement(By.xpath("//*[@id='popper-trigger--5']")).getText();
		System.out.println(categories);
		driver.close();
    }
  //  @BeforeTest
    public void beginTest()
    {

    	WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println("Beginning of education!!");
		driver.close();
    }
   // @AfterTest
    public void endTest()
    {

    	WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println("End of education!!");
		driver.close();
    }
    @AfterMethod
	public void methodAf()
	{
    	WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.close();
	}
    @AfterClass
	public void begg()
	{
		WebDriver driver = new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	     driver.get("https://in.bookmyshow.com/");
	     driver.close();
	}

}
