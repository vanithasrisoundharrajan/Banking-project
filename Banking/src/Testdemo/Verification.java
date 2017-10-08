package Testdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Verification{
	WebDriver driver;
	@BeforeSuite
	public void openBrowser(){
		System.setProperty("webdriver.chrome.driver","D:/Vanitha/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	@Test
	public void openLink(){
		driver.get("http://www.demo.guru99.com/V4/");
		
	}
	@Test
	public void openLogin(){
		driver.findElement(By.name("uid")).sendKeys("mngr98520");
		driver.findElement(By.name("password")).sendKeys("jUnyjYn");
		driver.findElement(By.name("btnLogin")).click();
	  String title=driver.getTitle();
	  System.out.println(title);
	if(title.contains("Guru99 Bank Manager HomePage")){
		System.out.println("passed");
	}
	else{
		System.out.println("failed");
	}
		
		
	
	}
	@AfterSuite
	public void close(){
		driver.quit(); 
	}
	
}
