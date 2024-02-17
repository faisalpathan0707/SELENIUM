package Pop_ups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText_popUp 
{
	public static void main(String[] args)throws InterruptedException 
	{
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://letcode.in/alert");
		driver.findElement(By.id("modern")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().getText();
	}
}
