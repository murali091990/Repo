package ntiboilers;

import org.testng.annotations.Test;

import pages.HomePageObjects;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class MainScreenTest {
	private static WebDriver obj=null;
	private static HomePageObjects hp=null;
	
	
  @BeforeTest
  public void launch() throws Exception {
	  obj = new FirefoxDriver();
	  obj.manage().window().maximize();
	  obj.get("localhost:3000/?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJvcmdpZCI6NDQ4MjA2NDcwLCJnYXRld2F5SWQiOjM0NjcwODUyOSwiaXNHYXRld2F5IjpmYWxzZSwiZmlsdGVyU2NhbiI6ZmFsc2UsImlhdCI6MTQ2MzM2ODA5Mn0.LEYH2gO0CTyFX574bNnI_GgBoyBuWzONifCfEjUBnWk&uuid=F0:52:08:9F:D9:C0&proxyUrl=ws://dev-proxy.blueapp.io#/home");
	  Thread.sleep(5000);
//	  obj.get("http://localhost:3000/?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJvcmdpZCI6NDQ4MjA2NDcwLCJnYXRld2F5SWQiOjM0NjcwODUyOSwiaXNHYXRld2F5IjpmYWxzZSwiZmlsdGVyU2NhbiI6ZmFsc2UsImlhdCI6MTQ2MzM2ODA5Mn0.LEYH2gO0CTyFX574bNnI_GgBoyBuWzONifCfEjUBnWk&uuid=F0:52:08:9F:D9:C0&proxyUrl=ws://dev-proxy.blueapp.io#/home");
//	  obj.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	  Thread.sleep(60000);
  }
	
	
  @Test(priority=0)
  public void mainScreenWidgetTest() throws Exception {
	  
	  hp = new HomePageObjects(obj);
	  //test opened title
	  String pageTitle=hp.getToolbarTitle();
	  System.out.println(pageTitle);
	  Assert.assertTrue(pageTitle.equalsIgnoreCase("home")||pageTitle.equalsIgnoreCase(""));
	  //All widgets test in disconnected state
	  Assert.assertTrue(hp.getFiringRateText().toLowerCase().contains("firing rate"));
	  Assert.assertTrue(hp.getInletText().toLowerCase().contains("inlet"));
	  Assert.assertTrue(hp.getOutletText().toLowerCase().contains("outlet"));
	  Assert.assertTrue(hp.getStackText().toLowerCase().contains("stack"));
	  Assert.assertTrue(hp.getOutdoorText().toLowerCase().contains("outdoor"));
	  Assert.assertTrue(hp.getFanSpeedText().toLowerCase().contains("fan speed"));
	  Assert.assertTrue(hp.getDHWText().toLowerCase().contains("dhw"));
	  Assert.assertTrue(hp.get4t20mAText().toLowerCase().contains("4-20 ma"));
	  Assert.assertTrue(hp.getFlameText().toLowerCase().contains("flame"));
	  Assert.assertTrue(hp.getSetPointText().toLowerCase().contains("setpoint"));
	  
	  
	  //getting all the values from each widget
	  String firingRateValue=hp.getFiringRateValue();
	  System.out.println("Firing rate widget value is: "+firingRateValue);
	  String fanSpeedValue=hp.getFanSpeedValue();
	  System.out.println("Fan speed widget value is: "+fanSpeedValue);
	  String widget4t20mAValue=hp.get4t20mAValue();
	  System.out.println("'4-20 mA' widget value is: "+widget4t20mAValue);
	  String flameValue=hp.getFlameValue();
	  System.out.println("Flame widget value is: "+flameValue);
	  String inletValue=hp.getInletValue();
	  System.out.println("Inlet widget value is: "+inletValue);
	  String outletValue=hp.getOutdoorValue();
	  System.out.println("Outlet widget value is: "+outletValue);
	  String stackValue=hp.getStackValue();
	  System.out.println("Stack widget value is: "+stackValue);
	  String outdoorValue=hp.getOutdoorValue();
	  System.out.println("Outdoor widget value is: "+outdoorValue);
	  String dhwValue=hp.getDHWValue();
	  System.out.println("DHW widget value is: "+dhwValue);
	  String setPointValue=hp.getSetPointValue();
	  System.out.println("Set point widget value is: "+setPointValue);
	 try{ 
	  Assert.assertTrue(firingRateValue.equalsIgnoreCase("rpm"));
	  Assert.assertTrue(fanSpeedValue.equalsIgnoreCase("rpm"));
	  Assert.assertTrue(widget4t20mAValue.equalsIgnoreCase("mA"));
	  Assert.assertTrue(flameValue.equalsIgnoreCase("µAmps"));
	  if(firingRateValue.equalsIgnoreCase("RPM") && fanSpeedValue.equalsIgnoreCase("RPM") && widget4t20mAValue.equalsIgnoreCase("mA") && flameValue.equalsIgnoreCase("µAmps") && inletValue.equalsIgnoreCase("") && outletValue.equalsIgnoreCase("") && stackValue.equalsIgnoreCase("") && outdoorValue.equalsIgnoreCase("") && dhwValue.equalsIgnoreCase("") && setPointValue.equalsIgnoreCase(""))
		  System.out.println("Widgets test is passed");
	  else {
		  System.out.println("Widgets test is failed");
	  }
	 }catch(Exception e){
		 System.out.println("Got error");
	 }
	 
  }
  
//Setpoints tab
  @Test(priority=1)
  public void setPointsTab() throws Exception {
	  hp = new HomePageObjects(obj);
	  System.out.println("Set Points tab");
	  if(hp.getSetpointAttr().equalsIgnoreCase("false")){
		  hp.clickSetPointTab();
		  Thread.sleep(2000);
	  }
	  //getting the values from setpoint tab
	  String chON=hp.setChON();
	  String chModulation=hp.setChModulation();
	  String chOFF=hp.setChOFF();
	  System.out.println("Central Heat:- On: "+chON+", Modulation: "+chModulation+", chOff: "+chOFF);
	  Assert.assertTrue(chON.equalsIgnoreCase("0"));
	  Assert.assertTrue(chModulation.isEmpty());
	  Assert.assertTrue(chOFF.isEmpty());
	  
	  String dhwON=hp.setDhwON();
	  String dhwModulation=hp.setDhwModulation();
	  String dhwOFF=hp.setDhwOFF();	  
	  System.out.println("Domestic Hot water:- On: "+dhwON+", Modulation: "+dhwModulation+", chOff: "+dhwOFF);
	  Assert.assertTrue(dhwON.equalsIgnoreCase("0"));
	  Assert.assertTrue(dhwModulation.isEmpty());
	  Assert.assertTrue(dhwOFF.isEmpty());

  }
  
  //Modulation Tab
  @Test(priority=2)
  public void modulationTab() throws Exception{
	  hp = new HomePageObjects(obj);
	  System.out.println("Modulation tab");
	  if(hp.getModulationAttr().equalsIgnoreCase("false")){
		  hp.clickModulationTab();
		  Thread.sleep(2000);
	  }
	//getting the values from modulation tab
	  String demandRateValue=hp.modDemandRateValue();
	  String limitedRateValue=hp.modLimitedRateValue();
	  String overrideRateValue=hp.modOverrideRateValue();
	  System.out.println("Demand Rate: "+demandRateValue+", Limited Rate: "+limitedRateValue+", Override Rate: "+overrideRateValue);
  }
  
  //Pump Status tab
  @Test(priority=3)
  public void pumpStatusTab() throws Exception{
	  hp = new HomePageObjects(obj);
	  System.out.println("Pump Status tab");
	  if(hp.getPumpStatusAttr().equalsIgnoreCase("false")){
		  hp.clickPumpStatusTab();
		  Thread.sleep(2000);
	  }
	//getting the values from pump status tab
	  String dhwPumpValue=hp.pumpModDhwPumpValue();
	  String boilerPumpValue=hp.pumpModBoilerPumpValue();
	  String chPumpValue=hp.pumpModChPumpValue();
	  System.out.println("DHW Pump: "+dhwPumpValue+", Boiler Pump: "+boilerPumpValue+", Central Heat Pump: "+chPumpValue);
  }

  @AfterTest
  public void close() {
	  obj.close();
  }

}
