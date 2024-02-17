package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ID_and_Name 
{
	public static void main(String[] args)
	{
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		
		WebDriver Driver = new ChromeDriver(option);
		Driver.get("https://demo.actitime.com/login.do");
		Driver.findElement(By.id("username")).sendKeys("pune");
		Driver.findElement(By.name("pwd")).sendKeys("12345678");
		Driver.findElement(By.name("Login ")).click();
	}
}
