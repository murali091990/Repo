package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ConfigureObjects {
	private static WebDriver obj=null;
	
	
	//Page title
	By getToolbarTitle=By.xpath("//*[@id='toolbar']/div/div[2]/div/span");
	
	//Back button
	By backBtn=By.xpath("//*[@id='toolbar']/div/div[1]/button");
	
	//Home Button
	By homeBtn=By.xpath("//*[@id='toolbar']/div/div[1]/a/md-icon");
	
	//System Identification & Access
	By systemIdentification=By.xpath("//*[@id='content']/md-list/md-list-item[1]/div[1]/a/h3");
	//Central Heat Configuration
	By chConfig=By.xpath("//*[@id='content']/md-list/md-list-item[2]");
	//Outdoor Reset Configuration
	By outdoorReset=By.xpath("//*[@id='content']/md-list/md-list-item[3]");
	//Domestic Hot Water Configurations
	By domesticHotWater=By.xpath("//*[@id='content']/md-list/md-list-item[4]");
	//Warm Weather Shutdown Configuration
	By warmWeatherShutdown=By.xpath("//*[@id='content']/md-list/md-list-item[5]");
	//Modulation Configuration
	By modulationConfig=By.xpath("//*[@id='content']/md-list/md-list-item[6]");
	//Pump Configuration
	By pumpConfig=By.xpath("//*[@id='content']/md-list/md-list-item[7]");
	//Statistics Configuration
	By statisticsConfig=By.xpath("//*[@id='content']/md-list/md-list-item[8]");
	//Safety Limits
	By safetyLimits=By.xpath("//*[@id='content']/md-list/md-list-item[9]");
	//Frost Protection Configuration
	By frostProtection=By.xpath("//*[@id='content']/md-list/md-list-item[10]");
	//Burner Control
	By burnerControl=By.xpath("//*[@id='content']/md-list/md-list-item[11]");
	//Sensor Configuration
	By sensorConfig=By.xpath("//*[@id='content']/md-list/md-list-item[12]");
	//System Configuration
	By systemConfig=By.xpath("//*[@id='content']/md-list/md-list-item[13]");
	//Display Configuration
	By displayConfig=By.xpath("//*[@id='content']/md-list/md-list-item[14]");
	//Cascade Configuration
	By cascadeConfig=By.xpath("//*[@id='content']/md-list/md-list-item[15]");
	//WIFI Configuration
	By wifiConfig=By.xpath("//*[@id='content']/md-list/md-list-item[16]");
	
	
	public ConfigureObjects(WebDriver obj){
		ConfigureObjects.obj = obj;
	}
	
	//get the title of opened window 
	  public String getToolbarTitle() throws Exception {
		  return obj.findElement(getToolbarTitle).getText();
	  }
	  
	//Click back button
	  public void clickBackBtn(){
		  obj.findElement(backBtn).click();
	  }
	//Click home button
	  public void clickHomeBtn(){
		  obj.findElement(homeBtn).click();
	  }
	  
	  
	//Click system identification& access button
	  public void clickSystemIdentification(){
		  obj.findElement(systemIdentification).click();
	  }
	  
	//Click CH config button
	  public void clickChConfig(){
		  obj.findElement(chConfig).click();
	  }
	  
	//Click outdoor reset button
	  public void clickOutdoorReset(){
		  obj.findElement(outdoorReset).click();
	  }
	  
	//Click Domestic Hot Water button
	  public void clickDomesticHotWater(){
		  obj.findElement(domesticHotWater).click();
	  }
	  
	//Click Warm Weather Shutdown button
	  public void clickWarmWeatherShutdown(){
		  obj.findElement(warmWeatherShutdown).click();
	  }
	  
	//Click Modulation Config button
	  public void clickModulationConfig(){
		  obj.findElement(modulationConfig).click();
	  }
	  
	//Click Pump Config button
	  public void clickPumpConfig(){
		  obj.findElement(pumpConfig).click();
	  }
	  
	//Click Statistics Config button
	  public void clickStatisticsConfig(){
		  obj.findElement(statisticsConfig).click();
	  }
	  
	//Click Safety Limits button
	  public void clickSafetyLimits(){
		  obj.findElement(safetyLimits).click();
	  }
	  
	//Click Frost Protection button
	  public void clickFrostProtection(){
		  obj.findElement(frostProtection).click();
	  }
	  
	//Click Burner Control button
	  public void clickBurnerControl(){
		  obj.findElement(burnerControl).click();
	  }
	  
	//Click Sensor Config button
	  public void clickSensorConfig(){
		  obj.findElement(sensorConfig).click();
	  }
	  
	//Click System Config button
	  public void clickSystemConfig(){
		  obj.findElement(systemConfig).click();
	  }
	  
	//Click Display Config button
	  public void clickDisplayConfig(){
		  obj.findElement(displayConfig).click();
	  }
	  
	//Click Cascade Config button
	  public void clickCascadeConfig(){
		  obj.findElement(cascadeConfig).click();
	  }
	  
	//Click Wifi Config button
	  public void clickWifiConfig(){
		  obj.findElement(wifiConfig).click();
	  }
	  
	
}
