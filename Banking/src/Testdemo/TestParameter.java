package Testdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestParameter {
WebDriver driver;
@BeforeSuite
public  void  openBrowser() {
	System.setProperty("webdriver.chrome.driver","D:/Vanitha/chromedriver.exe");
 	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.demo.guru99.com/V4/");
}
@Test
@Parameters({"username","password"})
public void validLogin(String username,String password){
	driver.findElement(By.name("uid")).sendKeys(username);
	driver.findElement(By.name("password")).sendKeys(password);
	driver.findElement(By.name("btnLogin")).click();
	
}
@AfterSuite
public void close() {
	driver.close();
	
}
}
