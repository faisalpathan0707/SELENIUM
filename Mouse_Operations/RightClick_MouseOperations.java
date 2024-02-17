package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick_MouseOperations 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		//launch chrome Browser
		WebDriver Driver = new ChromeDriver();
		
		//maximize the Browser
		Driver.manage().window().maximize();
		
		//Open URL 
		Driver.get("https://demoqa.com/buttons");
		
		//to find WebElment 
		WebElement button = Driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
		
		//To perform right click 
		Actions act = new Actions(Driver);
		act.contextClick(button).perform();  //To right click contextClick
	}
}
