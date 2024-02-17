package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Over_Action 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://www.ebay.com/");
		
		WebElement Obj = Driver.findElement(By.linkText("Electronics"));
		
		Actions act = new Actions(Driver);
		act.moveToElement(Obj).perform();
	}
}
