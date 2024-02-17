package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class X_Path 
{
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		
		//stpe1:- Open the Browser
		WebDriver Driver=new ChromeDriver(option);
		
		//step2:- maximize the browser
		Driver.manage().window().maximize();
		
		//step3:-Enter the URL
		Driver.get("https://demo.actitime.com/login.do");
		
		//Delay in search for 3second
		Thread.sleep(3000);
		
		//step4:-Enter the username
		Driver.findElement(By.id("username")).sendKeys("admin");
		Thread.sleep(3000);
		
		//step5:-Enter the password
		Driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(3000);
		
		//step6:-click on login button
		Driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
		//step7:- Get Title
		String abc = Driver.getTitle();
		System.out.println(abc);
		
		//step8:-Get Url 
		String url = Driver.getTitle();
		System.out.println(url);
		
		//step9:- Verification
		if(abc.equals("actiTIME - Login"))
		{
			System.out.println("Pass:- Home page is Displayed ");
		}
		else
		{
			System.out.println("Fail:- Home page is not Displayed ");
		}	
		
		//stpe10:- close the Application
		Driver.close();
	}
}
