package Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		
		Driver.get("ttps://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Driver.findElement(By.tagName("a")).click();  //Duplicates are their it executes 1st matching Element i.e-Login
	}
}
