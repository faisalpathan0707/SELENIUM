package Pop_ups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class notification_popup  //We can't move
								//we can't inspect
{
	public static void main(String[] args) 
	{
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
	
		WebDriver Driver = new ChromeDriver(option);
		Driver.manage().window().maximize();
		Driver.get("htpps://skillrary.com");
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
}
