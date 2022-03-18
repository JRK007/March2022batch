package cucumbermap;

import java.util.Hashtable;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import methods.HTMLReportGenerator;
import methods.SeleniumOperations;

public class Login
{
	
	@When ("^user opens \"(.*)\" browser with exe as \"(.*)\"$")
	public void OpenBrowser(String bname , String exe)
	{
		Object [] Boss = new Object [2];
		Boss[0]= bname;
		Boss[1] = exe;
		SeleniumOperations.LaunchBrowser(Boss); 
	}
	
	@When ("^user opens URL as \"(.*)\"$")
	public void OpenApplications(String url)
	{
		Object [] Boss1 = new Object [1];
		Boss1[0] = url;
		SeleniumOperations.OpenApplication(Boss1);
	}
	
	@When ("^user click on cancel login window$")
	public void clickoncancel()
	{
		Object [] Boss2 = new Object [1];
		Boss2[0] = "//*[@class='_2KpZ6l _2doB4z']";
		Hashtable<String,Object> output2 = SeleniumOperations.ClickonElements(Boss2); 
HTMLReportGenerator.StepDetails(output2.get("STATUS"), "^user click on cancel login window$", output2.get("MESSAGE").toString());		
	}
	
	@When ("^use move cursor to login$")
	public void movecursor() 
	{
		  Object [] Boss3 = new Object [1];
			Boss3[0] = "//*[@class='_1_3w1N']";
			Hashtable<String,Object> output3 = SeleniumOperations.CursoronLogin(Boss3);
HTMLReportGenerator.StepDetails(output3.get("STATUS"), "^use move cursor to login$", output3.get("MESSAGE").toString());
	}
	
	@When ("^user click on MyProfile$")
	public void clickonprofile() 
	{
		Object [] Boss4 = new Object [1];
		Boss4 [0] = "//*[text()='My Profile']";
		Hashtable<String,Object> output4 = SeleniumOperations.ClickonElements(Boss4);
HTMLReportGenerator.StepDetails(output4.get("STATUS"), "^user click on MyProfile$", output4.get("MESSAGE").toString());
	}
	
	@When ("^user enter \"(.*)\" as a username$")
	public void enterusername(String uname) 
	{
		Object [] Boss5 = new Object [2];
		Boss5 [0] = "//*[@class='_2IX_2- VJZDxU']";
		Boss5 [1] = uname;
		Hashtable<String,Object> output5 = SeleniumOperations.SendText(Boss5); 
		HTMLReportGenerator.StepDetails(output5.get("STATUS"), "^user enter \"(.*)\" as a username$", output5.get("MESSAGE").toString());
		
	}
	
	@When ("^user enter \"(.*)\" as a password$")
	public void enterpassword(String pass) 
	{
		Object [] Boss6 = new Object [2];
		Boss6 [0] = "//*[@class='_2IX_2- _3mctLh VJZDxU']";
		Boss6 [1] = pass;
		Hashtable<String,Object> output6 =SeleniumOperations.SendText(Boss6);
		HTMLReportGenerator.StepDetails(output6.get("STATUS"), "^user enter \"(.*)\" as a password$", output6.get("MESSAGE").toString());
		
		
	}
	
	@When ("^user click on login button$")
	public void clickonlogin() 
	{
		Object[] Boss7 = new Object[1];
		Boss7[0] = "//*[@class='_2KpZ6l _2HKlqd _3AWRsL']";
		Hashtable<String,Object> output7 = SeleniumOperations.ClickonElements(Boss7);
		HTMLReportGenerator.StepDetails(output7.get("STATUS"), "^user click on login button$", output7.get("MESSAGE").toString());
		
	}
	
	@Then ("^Application show login successfully$")
	public void valdidation() throws InterruptedException 
	{
		Thread.sleep(2000);
		Object [] Boss8 = new Object [2];
		Boss8[0] = "Jayesh Kadus";
		Boss8[1] = "//*[text()='Jayesh Kadus']";
		Hashtable<String,Object> output8 = SeleniumOperations.Validation(Boss8);
		HTMLReportGenerator.StepDetails(output8.get("STATUS"), "^Application show login successfully$", output8.get("MESSAGE").toString());
		
	}
	

}
