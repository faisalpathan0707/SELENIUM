package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_Click_MouseOperations 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://demoqa.com/buttons");
		WebElement button = Driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		
		Actions act =new Actions(Driver);
		act.doubleClick(button).perform();
	}
}
