package practise;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Upload_File_with_RobotClass 
{
	public static void main(String[] args) throws AWTException 
	{
		// TODO Auto-generated method stub
		
		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://demoqa.com/upload-download");
		WebElement button = Driver.findElement(By.xpath("//input[@id='uploadFile']"));
		
		Actions act = new Actions(Driver);
		act.moveToElement(button).click();
		
		Robot rb = new Robot();  //When type='file' is not available in inspect 
		rb.delay(2000);
		
		//Copy file to clipboard (ctrl+c)
		StringSelection ss = new StringSelection("C:\\\\Users\\\\mange\\\\OneDrive\\\\Desktop\\\\Faisal_Pathan_(QA).pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);
		
		//to paste file (Ctrl+v ) Action
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);  //press Method
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);  //Release Method
		
		rb.keyPress(KeyEvent.VK_ENTER);  //to Enter the button 
    }
}
