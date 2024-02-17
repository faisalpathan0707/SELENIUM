package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class linktext 
{
	public static void main(String[] args) 
	{
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(option);
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.linkText("Forgot your password?")).click();	
	}
}
