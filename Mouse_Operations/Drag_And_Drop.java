package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_And_Drop 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("http://www.dhtmlgoodies.com/packages/dhtml-suite-for-applications/demos/demo-drag-drop-3.html");
		WebElement Drag = Driver.findElement(By.id("box6"));   //rome
		WebElement Drop = Driver.findElement(By.id("box106")); //Italy
		
		Actions act = new Actions(Driver);
		act.dragAndDrop(Drag, Drop).perform(); //drag and drop (source Element and targeted Element) 
	}
}
