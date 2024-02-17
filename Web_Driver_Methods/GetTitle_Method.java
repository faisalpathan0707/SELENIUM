package WebDriver_Practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetTitle_Method 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		
		WebDriver Driver = new ChromeDriver(option);
		Driver.get("https://www.flipkart.com");
		System.out.println(Driver.getTitle());		
	}
}
