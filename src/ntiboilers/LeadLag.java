package ntiboilers;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class LeadLag {
	WebDriver obj;

	  @BeforeTest
	  public void launch() throws Exception {
			obj = new FirefoxDriver();
			obj.get("http://localhost:3000");
			Thread.sleep(5000);
//			obj.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  }
	  
	  @Test(priority=0)
	  public void leadLag() throws Exception {
		  //Click on 'Lead Lag' button
		  obj.findElement(By.xpath("//*[@id='home-screen']/section/a[2]")).click();
		  Thread.sleep(2000);
		  String title=getToolbarTitle();
		  if(title.equalsIgnoreCase("lead"))
			  System.out.println("By click on Leadlag button opened window title is:"+title);
	  }
	  
	  @Test(priority=1)
	  public void clickBoilerImage() throws Exception {
		  obj.findElement(By.xpath("//*[@id='content']/div/div/ms-widget/ms-widget-front/a/div")).click();
		  String title=getToolbarTitle();
		  if(title.equalsIgnoreCase("home"))
			  System.out.println("By click on boiler image then home screen is opened");
		  else
			  System.out.println("Err:Not opening Diagnostics screen");
	  }
	  
	  @Test(priority=2)
	  public void testBack() throws Exception{
		  System.out.println("Testing back button functionality");
		  leadLag();
		  //click back button
		  back();
		  String title=getToolbarTitle();
		  if(title.equalsIgnoreCase("home")){
			  System.out.println("susccess:By click on back button then its going to previous screen(home)");
		  }else{
			  System.out.println("Err:Failed back button functionality in lead lag");
		  }
		  
	  }
	  
	  @Test(priority=3)
	  public void testHome() throws Exception{
		  System.out.println("Testing home button functionality");
		  leadLag();
		  //click home button
		  home();
		  String title=getToolbarTitle();
		  if(title.equalsIgnoreCase("home")){
			  System.out.println("susccess:By click on home button then its going home screen");
		  }else{
			  System.out.println("Err:Failed home button functionality in lead lag");
		  }
		  
	  }
	  
	  @AfterTest
	  public void close() {
		  obj.close();
	  }
	  
	  //Tap on back button 
	  public void back(){
		  obj.findElement(By.xpath("//*[@id='toolbar']/div/div[1]/button")).click();
		  obj.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	  }
	  
	  //Tap on Home button
	  public void home(){
		  obj.findElement(By.xpath("//*[@id='toolbar']/div/div[1]/a/md-icon")).click();
		  obj.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	  }
	  
	  //get the title of opened window 
	  public String getToolbarTitle() throws Exception {
		  String title=obj.findElement(By.xpath("//*[@id='toolbar']/div/div[2]/div/span")).getText();
		  return title;
	  }
	
	 
  

  
}
