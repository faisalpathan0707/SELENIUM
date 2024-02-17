package navigation_API;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class navigate_To 
{
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		
		
		WebDriver Driver =new ChromeDriver(option);
    	Driver.manage().window().maximize();
    	Driver.get("https://www.linkedin.com/feed/");
    	Thread.sleep(2000);
    	
     Driver.navigate().to("https://www.flipkart.com/");   //To switch from one application to another Application 
	}
}
