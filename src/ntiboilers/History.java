package ntiboilers;

import org.testng.annotations.Test;

import pages.ConfigureObjects;
import pages.HistoryObjects;
import pages.HomePageObjects;

import org.testng.annotations.BeforeTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class History {
	private static WebDriver obj = null;
	private static HomePageObjects hp=null;
	private static ConfigureObjects co=null;
	private static HistoryObjects ho=null;

	  @BeforeTest
	  public void launch() throws Exception {
			obj = new FirefoxDriver();
			obj.manage().window().maximize();
			obj.get("http://localhost:3000");
			Thread.sleep(5000);
//			obj.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  }
	  
	  @Test(priority=0)
	  public void history() throws Exception {
		  hp=new HomePageObjects(obj);
		  //Click on 'History' button
		  hp.clickHistoryBtn();
		  Thread.sleep(2000);
		  if(hp.getToolbarTitle().equalsIgnoreCase("history"))
			  System.out.println("By click on history button opened window title is:");
		  else
			  System.out.println("Err:Not opening history screen");
	  }
	  
	  @Test(priority=1)
	  public void getInfoFromScreen() throws Exception{
		  ho=new HistoryObjects(obj);
		  String time=ho.getTime();
		  System.out.println("Boiler showing Time is:"+time);
		  String discription=ho.getDescription();
		  System.out.println("Boiler showing Discription is:"+discription);
		  
		//click on clear alerts button
		  ho.clickClearAlertsBtn();
		  if(hp.getToolbarTitle().equalsIgnoreCase("History")){
			  System.out.println("Susccess:clear alerts button is not functioning");
		  }else{
			  System.out.println("Err:click clear alerts button is going to other screens");
		  }
		//click on Lock outs button
		  ho.clickLockoutsBtn();
		  if(hp.getToolbarTitle().equalsIgnoreCase("History")){
			  System.out.println("susccess:Lock outs button is not functioning");
		  }else{
			  System.out.println("Err:click Lock outs button is going to other screens");
		  }
		//click on Alert Filter button
		  ho.clickAlertFilterBtn();
		  if(hp.getToolbarTitle().equalsIgnoreCase("History")){
			  System.out.println("susccess:Alert Filter button is not functioning");
		  }else{
			  System.out.println("Err:click Alert Filter button is going to other screens");
		  }
	  }
	  
	  @Test(priority=2)
	  public void testBack() throws Exception{
		  co=new ConfigureObjects(obj);
		  System.out.println("Testing back button functionality");
		  //click back button
		  co.clickBackBtn();
		  if(hp.getToolbarTitle().equalsIgnoreCase("home")){
			  System.out.println("susccess:By click on back button then its going to previous screen(home)");
		  }else{
			  System.out.println("Err:Failed back button functionality in Detials screen");
		  }
		  
	  }
	  
	  @Test(priority=3)
	  public void testHome() throws Exception{
		  co=new ConfigureObjects(obj);
		  System.out.println("Testing home button functionality");
		  hp.clickHistoryBtn();
		  //click home button
		  co.clickHomeBtn();
		  if(hp.getToolbarTitle().equalsIgnoreCase("home")){
			  System.out.println("susccess:By click on home button then its going home screen");
		  }else{
			  System.out.println("Err:Failed home button functionality in Details screen");
		  }
		  
	  }
		  
	  
	  @AfterTest
	  public void close() {
		  obj.close();
	  }
	

}
