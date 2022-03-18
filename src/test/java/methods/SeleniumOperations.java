package methods;

import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumOperations 
{
	public static WebDriver Punjab = null;
	
	public static Hashtable<String,Object> outputParameters = new Hashtable<String,Object> ();
	
	public static Hashtable<String,Object> LaunchBrowser(Object[]chromi)
	{
		try
		{
		String browserName = (String) chromi[0];
		String exe = (String) chromi[1];
		
		if(browserName.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver",exe);
			 Punjab = new ChromeDriver();
			Punjab.manage().window().maximize();
			Punjab.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", exe);
			 Punjab = new FirefoxDriver();
			Punjab.manage().window().maximize();
			Punjab.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "methodUsed:LaunchBrowser , Input_Data : " + chromi[1].toString());
		
		
		
		}
		catch(Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "methodUsed:LaunchBrowser , Input_Data : " + chromi[1].toString());
		}
		return outputParameters;
	}
	
	public static Hashtable<String,Object> OpenApplication(Object[]site)
	{
		try
		{
			Punjab.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String url = (String) site[0];
		Punjab.get(url);
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "methodUsed:OpenApplication , Input_Data : " +  site[0].toString());
		
		}
		catch(Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "methodUsed:OpenApplication , Input_Data : " +  site[0].toString());
			
		}
		return outputParameters;
	}
	
	public static Hashtable<String,Object> ClickonElements(Object[]clicky) 
	{
		try
		{
			Punjab.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String tap = (String) clicky[0];
		Punjab.findElement(By.xpath(tap)).click();
		
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "methodUsed:ClickonElements , Input_Data : " + clicky[0].toString());
		
		}
		catch(Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "methodUsed:ClickonElements , Input_Data : " + clicky[0].toString());
		}
		return outputParameters;
		
	}
	
	public static Hashtable<String,Object> CursoronLogin(Object [] cursor) 
	{
		try
		{
			Punjab.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String move = (String) cursor[0];
		Actions act = new Actions(Punjab);
		WebElement abc = Punjab.findElement(By.xpath(move));
		act.moveToElement(abc).build().perform();
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "methodUsed:CursoronLogin , Input_Data : " + cursor[0].toString());
		
		}
		catch(Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "methodUsed:CursoronLogin , Input_Data : " + cursor[0].toString());
		}
		return outputParameters;
	
	}
	
	public static Hashtable<String,Object> SendText(Object[] codes) 
	{
		try
		{
			Punjab.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String text = (String) codes[0];
		String send = (String) codes[1];
		Punjab.findElement(By.xpath(text)).sendKeys(send);
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "methodUsed:SendText , Input_Data : " + codes[1].toString());
		}
		catch(Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "methodUsed:SendText , Input_Data : " + codes[1].toString());
		}
		return outputParameters;
		
	}
	
	public static Hashtable<String,Object> Validation(Object [] name) 
	{
		try
		{
			Punjab.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String givenText = (String) name[0];
		String xpath = (String) name[1];
		
		String actualText = Punjab.findElement(By.xpath(xpath)).getText();
		
		if(givenText.equalsIgnoreCase(actualText))
		{
			System.out.println("Test Case Pass");
		}
		else
		{
			System.out.println("Test Case Fail");
		}
		
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "methodUsed:Validation , Input_Data : " + name[1].toString());
		}
		catch(Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "methodUsed:Validation , Input_Data : " + name[1].toString());
		}
		return outputParameters;
	}
	




}
	
	
	
	
	