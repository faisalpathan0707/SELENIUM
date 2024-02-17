package navigation_API;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Forword 
{
	public static void main(String[]args)
	{	
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		
		WebDriver Driver=new ChromeDriver(option);
		Driver.manage().window().maximize();
		Driver.get("https://www.flipkart.com");
		Driver.navigate().forward();			
	}
}
