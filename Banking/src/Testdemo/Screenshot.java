package Testdemo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Screenshot {
	static WebDriver driver;
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
	public void openLogin() throws IOException{
		driver.findElement(By.name("uid")).sendKeys("mngr98520");
		driver.findElement(By.name("password")).sendKeys("jUnyjYn");
		driver.findElement(By.name("btnLogin")).click();
		Screenshot screenshot =new Screenshot();
		screenshot.takeScreenshot();
}
	 private static void takeScreenshot() throws IOException {

	        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

	        //The below method will save the screen shot in d drive with name "screenshot.png"
	        FileUtils.copyFile(scrFile, new File("D:\\Vanitha\\Screenshot.jpg"));

	    }
	 @AfterSuite
	 public void close()
	 {
		 driver.close();
		 
	 }
}