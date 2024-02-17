package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upload_File 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://demoqa.com/upload-download");
		Driver.findElement(By.xpath("//input[@id='uploadFile']")).sendKeys("C:\\Users\\mange\\OneDrive\\Desktop\\Faisal_Pathan_(QA).pdf");  //when type ='file' is available in inspect 
	}
}
