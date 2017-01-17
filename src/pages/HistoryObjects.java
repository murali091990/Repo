package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HistoryObjects {
private static WebDriver obj=null;
	
	public HistoryObjects(WebDriver obj){
		HistoryObjects.obj=obj;
	}
	
	
	//Time and description text
	By time=By.xpath("//*[@id='content']/div/div[1]/div[1]/div/ms-widget/ms-widget-front/div[2]");
	By discription=By.xpath("//*[@id='content']/div/div[1]/div[2]/div/ms-widget/ms-widget-front/div[2]");
	  
	//click on clear alerts button
	By clearAlertsBtn=By.xpath("//*//*[@id='content']/div/div[2]/div[2]/button[1]");
	  
	//click on Lock outs button
	By lockOutsBtn=By.xpath("//*[@id='content']/div/div[2]/div[2]/button[2]");
	  
	//click on Alert Filter button
	By alertFilterBtn=By.xpath("//*[@id='content']/div/div[2]/div[2]/button[3]");
	
	
	//Get time
	public String getTime(){
		return obj.findElement(time).getText();
	}
	//Get description text
	public String getDescription(){
		return obj.findElement(discription).getText();
	}
	
	//click clear alerts button
	public void clickClearAlertsBtn(){
		obj.findElement(clearAlertsBtn).click();
	}
	//click lock outs button
	public void clickLockoutsBtn(){
		obj.findElement(lockOutsBtn).click();
	}
	//click alert filter button
	public void clickAlertFilterBtn(){
		obj.findElement(alertFilterBtn).click();
	}
}
