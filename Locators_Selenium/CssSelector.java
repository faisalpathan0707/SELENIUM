package Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CssSelector
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-access-origin=*");
		
		WebDriver Driver = new ChromeDriver(option);
		Driver.manage().window().maximize();
		
		Driver.get("https://www.flipkart.com");
		Driver.findElement(By.cssSelector("img[alt=\"Top Offers\"]")).click();  //css locator is available for all element, it is faster than other locators 
		Thread.sleep(3500);                                                     // Disadvantage- when source code is only text it cant support
		
		Driver.findElement(By.cssSelector("img[alt=\"Fashion\"]")).click();
		Thread.sleep(4000);
	}
}
