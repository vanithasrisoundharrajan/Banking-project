package Testdemo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Testlogin {
	WebDriver driver;
	@BeforeSuite
	public  void openBrowser(){
		System.setProperty("webdriver.chrome.driver","D:/Vanitha/chromedriver.exe");
	  driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	@Test
	public void openLink(){
		driver.get("http://www.demo.guru99.com/V4/");
	}
	
	
	@Test
	public void openLogin() throws AWTException, InterruptedException{
		driver.findElement(By.name("uid")).sendKeys("mngr985");
		driver.findElement(By.name("password")).sendKeys("jUnyj");
		driver.findElement(By.name("btnLogin"));
		Robot robot=new Robot();
		 robot.keyPress(KeyEvent.VK_ENTER);
		    robot.keyRelease(KeyEvent.VK_ENTER);
		    Thread.sleep(2000);
			Alert alrert1=driver.switchTo().alert();
			alrert1.accept(); 
		
		
		
	
	}
	@AfterSuite
	public void close()
	{
	driver.quit();
	}

}
