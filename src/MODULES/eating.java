package MODULES;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class eating {
	
	@BeforeClass(groups= {"Play"})
	public void begg()
	{
		WebDriver driver = new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	     driver.get("https://in.bookmyshow.com/");
	     driver.close();
	}
	
	@Test(groups= {"Play"})
	public void tropiDashboard()
	{
		 WebDriver driver = new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	     driver.get("https://admintropicartdev.myteamconnector.com/");
	     driver.findElement(By.xpath("//input[@data-val='true']")).sendKeys("info@tropicart242.com");
	     driver.findElement(By.cssSelector("input#Password")).sendKeys("Host@1234");
	     driver.findElement(By.className("btn")).click();
	     String dashboard=driver.findElement(By.xpath("//*[text()='Dashboard']")).getText();
	     System.out.println(dashboard);
	    
	     driver.close();
	     
	}
	@Parameters({"Book Flight1","Book Hotel1"})
	@AfterSuite
	public void bfre(String url, String hotel)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://dreamzcmms.freshdesk.com/");
		 System.out.println("I am suite level parameter: "+url);
	     System.out.println("Hi I am test level hotel: "+hotel);
		driver.close();
		

	}
	@Parameters({"Book Flight2","Book Hotel2"})
	@Test(timeOut=30000)
	public void tropiOrders(String url, String hotel)
	{
		 WebDriver driver = new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	     driver.get("https://admintropicartdev.myteamconnector.com/");
	     driver.findElement(By.xpath("//input[@data-val='true']")).sendKeys("info@tropicart242.com");
	     driver.findElement(By.cssSelector("input#Password")).sendKeys("Host@1234");
	     driver.findElement(By.className("btn")).click();
	     String orders=driver.findElement(By.xpath("//*[@href=\"/Dashboard/OrderPaymentBreakdown\"]")).getText();
	     System.out.println(orders);
	     System.out.println("I am eating's  parameter: "+url);
	     System.out.println("Hi I am test level hotel: "+hotel);
	     driver.close();
	}
	@Test(dependsOnMethods= {"tropiDashboard"})
	public void credit()
	{
		 WebDriver driver = new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	     driver.get("https://admintropicartdev.myteamconnector.com/");
	     driver.findElement(By.xpath("//input[@data-val='true']")).sendKeys("info@tropicart242.com");
	     driver.findElement(By.cssSelector("input#Password")).sendKeys("Host@1234");
	     driver.findElement(By.className("btn")).click();
	     String credit=driver.findElement(By.xpath("//*[@href=\"/Dashboard/Credit\"]")).getText();
	     System.out.println(credit);
	     driver.close();
	}   
	    
        @BeforeTest
        public void beginTest()
        {

        	WebDriver driver=new ChromeDriver();
    		driver.get("https://www.google.com/");
    		System.out.println("Beginning of eating!!");
    		driver.close();
    		
        }
        @AfterTest
        public void endTest()
        {

        	WebDriver driver=new ChromeDriver();
    		driver.get("https://www.google.com/");
    		System.out.println("End of eating!!");
    		driver.close();
        }
    
    }



