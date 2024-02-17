package WebDriver_Practise;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetWindow_handle_Method 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
			
		WebDriver Driver = new ChromeDriver(option);
		Driver.manage().window().maximize();
		Driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		Driver.findElement(By.id("newWindowBtn"));
		Set<String> ele = Driver.getWindowHandles();
		System.out.println(ele);
	}
}
