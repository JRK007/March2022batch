package plainTest;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UnitTestCase 
{
	public static void main(String [] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "J:\\FLIPKART PROJECT\\Flipkart\\src\\test\\resources\\DRIVERS\\chromedriver.exe");
		
		ChromeDriver AAP = new ChromeDriver();
		
		AAP.manage().window().maximize();
		
		AAP.get("https://www.flipkart.com");
		
		AAP.findElementByXPath("//*[@class='_2KpZ6l _2doB4z']").click();
		Thread.sleep(2000);
		
		Actions act = new Actions(AAP);
		WebElement abc = AAP.findElementByXPath("//*[@class='_1_3w1N']");
		act.moveToElement(abc).build().perform();
		Thread.sleep(2000);
		
		AAP.findElementByXPath("(//*[@class='_3vhnxf'])[1]").click();
		Thread.sleep(2000);
		
		AAP.findElementByXPath("(//*[@type='text'])[2]").sendKeys("7769959097");
		Thread.sleep(2000);
		
		AAP.findElementByXPath("//*[@type='password']").sendKeys("jkhappythoughts@007");
		Thread.sleep(2000);
		
		AAP.findElementByXPath("(//*[@type='submit'])[2]").click();
		
		AAP.close();
		
		AAP.quit();
		
		
		
		
		
	}
	
	
	
	

}
