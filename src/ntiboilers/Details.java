package ntiboilers;

import org.testng.annotations.Test;

import pages.ConfigureObjects;
import pages.DetailsObjects;
import pages.HomePageObjects;

import org.testng.annotations.BeforeTest;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class Details {
	
	private static WebDriver obj = null;
	private static DetailsObjects details=null;
	private static HomePageObjects hp=null;
	private static ConfigureObjects co=null;

	  @BeforeTest
	  public void launch() throws Exception {
			obj = new FirefoxDriver();
			obj.manage().window().maximize();
			obj.get("http://localhost:3000");
			Thread.sleep(5000);
//			obj.get("http://localhost:3000/?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJvcmdpZCI6NDQ4MjA2NDcwLCJnYXRld2F5SWQiOjM0NjcwODUyOSwiaXNHYXRld2F5IjpmYWxzZSwiZmlsdGVyU2NhbiI6ZmFsc2UsImlhdCI6MTQ2MzM2ODA5Mn0.LEYH2gO0CTyFX574bNnI_GgBoyBuWzONifCfEjUBnWk&uuid=F0:52:08:9F:D9:C0&proxyUrl=ws://dev-proxy.blueapp.io#");
//			Thread.sleep(120000);
//			obj.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  }
	  
	  @Test(priority=0)
	  public void details() throws Exception {
		  hp =new HomePageObjects(obj);
		 
		  //Click on 'Details' button
		  hp.clickDetailsBtn();
		  Thread.sleep(2000);
		  if(hp.getToolbarTitle().equalsIgnoreCase("details"))
			  System.out.println("By click on details button details window is opened");
		  else
			  System.out.println("Err:Not opening Details screen");
	  }
	  
	  @Test(priority=1)
	  public void getAllValues() throws Exception{
		  hp =new HomePageObjects(obj);
		  details = new DetailsObjects(obj);
		  
		  String outletTemp=details.getOutletTemp();
		  System.out.println("Outlet temperature:"+outletTemp+"\n");
		  
		  System.out.println("Under DHW window:-");
		  String dhwEnable=details.getDhwEnable();
		  System.out.println("DHW Enable:"+dhwEnable);
		  String status=details.getStatus();
		  System.out.println("Staus:"+status);
		  String demandSource=details.getDemandSource();
		  System.out.println("Demand source:"+demandSource);
		  String burnerDemand=details.getBurnerDemand();
		  System.out.println("Burner Demand:"+burnerDemand);
		  String heatDemand=details.getHeatDemand();
		  System.out.println("Heat Demand:"+heatDemand);
		  String requestedRate=details.getRequestedRate();
		  System.out.println("Requested rate:"+requestedRate);
		  String setpointSource=details.getSetpointSource();
		  System.out.println("Setpoint source:"+setpointSource);
		  String offSetpoint=details.getOffSetpoint();
		  System.out.println("OFF Setpoint:"+offSetpoint);
		  String Setpoint=details.getSetpoint();
		  System.out.println("Setpoint:"+Setpoint);
		  String onSetpoint=details.getOnSetpoint();
		  System.out.println("ON Setpoint:"+onSetpoint);
		  String operatingTemperature=details.getOperatingTemperature();
		  System.out.println("Operating temperature:"+operatingTemperature);
		  String dhwPump=details.getDhwPump();
		  System.out.println("DHW Pump:"+dhwPump);
		  String dhwPumpOverrunTime=details.getDhwPumpOverrunTime();
		  System.out.println("DHW pump overrun time:"+dhwPumpOverrunTime);
		  String dhwPumpFrostOverrunTime=details.getDhwPumpFrostOverrunTime();
		  System.out.println("DHW pump frost overrun time:"+dhwPumpFrostOverrunTime);
		  String dhwPriorityOverrideTime=details.getDhwPriorityOverrideTime();
		  System.out.println("DHW priority override time:"+dhwPriorityOverrideTime);
		
		  
		//click on diagnostic button
		  details.clickDiagnosticsBtn();
		  if(hp.getToolbarTitle().equalsIgnoreCase("details")){
			  System.out.println("Susccess:Diagnostic button is not functioning");
		  }else{
			  System.out.println("Err:click Diagnostic button is going to other screens");
		  }
		//click on History button
		  details.clickHistoryBtn();
		  if(hp.getToolbarTitle().equalsIgnoreCase("details")){
			  System.out.println("susccess:history button is not functioning");
		  }else{
			  System.out.println("Err:click history button is going to other screens");
		  }
		//click on Analysis button
		  details.clickAnalysisBtn();		  
		  if(hp.getToolbarTitle().equalsIgnoreCase("details")){
			  System.out.println("susccess:Analysis button is not functioning");
		  }else{
			  System.out.println("Err:click Analysis button is going to other screens");
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
