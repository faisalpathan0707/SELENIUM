package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class partial_linkedtext 
{
	public static void main(String[] args) 
	{
		ChromeOptions option= new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		
		ChromeDriver Driver = new ChromeDriver(option);
		Driver.get("https://demo.actitime.com/login.do");
		Driver.findElement(By.partialLinkText("Forgot your")).click();  // By providing half link still it executes 
	}
}
