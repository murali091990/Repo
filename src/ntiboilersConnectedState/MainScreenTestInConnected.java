package ntiboilersConnectedState;

import org.testng.annotations.Test;

import pages.ConfigureAllScreensObjects;
import pages.ConfigureObjects;
import pages.HomePageObjects;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class MainScreenTestInConnected {
	private static WebDriver obj=null;
	private static HomePageObjects hp=null;
	private static ConfigureObjects co=null;
	private static ConfigureAllScreensObjects cao=null;
	String bTName1;
	String bTName2;
	String bTName3;
	String selectedbT;
	Scanner reader = new Scanner(System.in);  // Reading from System.in
	 @BeforeTest
	  public void launch() throws Exception {
//		 System.out.println("Enter a username: ");
//		 String username = reader.nextLine();
//		 System.out.println("Enter a password: ");
//		 String passwd=reader.nextLine();
		 
		 System.setProperty("webdriver.gecko.driver", "/Users/Murali/Documents/Murali_Workpace/Softwares/All jar files/geckodriver");
//		 System.setProperty("webdriver.chrome.driver", "/Users/Murali/Documents/Murali_Workpace/Softwares/All jar files/chromedriver");
		 obj =new FirefoxDriver();
//		 obj =new ChromeDriver();
		 obj.get("https://nti.blueapp.io/");
		 Thread.sleep(5000);
		 obj.findElement(By.id("input_0")).sendKeys("muralidhara.g@vensi.com");
		 Thread.sleep(500);
		 obj.findElement(By.id("input_1")).sendKeys("V3nsi@123");
		 Thread.sleep(500);
		 obj.findElement(By.xpath("//*[@id='root']/div[2]/div[1]/button")).click();
		 Thread.sleep(4000);
		 try{
			 String orgName=obj.findElement(By.xpath("//*[@id='sidebar']/md-sidenav/md-content/div/div[2]/div[2]/p")).getText();
			 if(orgName.equalsIgnoreCase("nti")){
				 System.out.println("NTI is current organization");
			 }else{
				 obj.findElement(By.xpath("//*[@id='topbar']/div[2]/div[2]/md-menu/button")).click();
				 Thread.sleep(3000);
				 obj.findElement(By.xpath("(//button[@type='button'])[55]")).click();
				 Thread.sleep(10000);
			 }
		 
		 try{
			 String gatewayStatus=obj.findElement(By.xpath("//*[@id='page-wrapper']/div[1]/div[3]/div/div/div/div/div[1]/div[1]/span")).getAttribute("ng-if");
			 System.out.println(gatewayStatus);
			 if(gatewayStatus.equalsIgnoreCase("device.device_status == 1")){
				 System.out.println("Gateway is in busy state, do you want to continue? enter yes/no:");
//				 String busyApprove=reader.nextLine();
				 String busyApprove="yes";
				 for(;;){
					 if(busyApprove.equalsIgnoreCase("yes")||busyApprove.equalsIgnoreCase("no")){
						 if(busyApprove.equalsIgnoreCase("yes")){
							 obj.findElement(By.className("e-link")).click();
							 Thread.sleep(10000);
							 break;
						 }
					 }else{
						 System.out.println("Plz enter 'yes' or 'no' only"); 
						 busyApprove=reader.nextLine();
					 }
				 }
			 }else{
				 try{
					 String bTName_01=obj.findElement(By.xpath("//*[@id='page-wrapper']/div[1]/div[3]/div[2]/div/div[1]/div/div/div[1]/div[2]/div")).getText();
					 if(bTName_01.equalsIgnoreCase("BluTerm-6DDF")||bTName_01.equalsIgnoreCase("BluTerm-F4CC")||bTName_01.equalsIgnoreCase("BluTerm-76C7")){
						 System.out.println("Gateway in green status & directly scanned peripherals");
					 }
				 }catch(Exception e2){
						 System.out.println("No Gateway is available");
				 }
			 }
		 }catch(Exception e1){
			 Thread.sleep(5000);
			 try{
				 String bTName_01=obj.findElement(By.xpath("//*[@id='page-wrapper']/div[1]/div[3]/div[2]/div/div[1]/div/div/div[1]/div[2]/div")).getText();
				 if(bTName_01.equalsIgnoreCase("BluTerm-6DDF")||bTName_01.equalsIgnoreCase("BluTerm-F4CC")||bTName_01.equalsIgnoreCase("BluTerm-76C7")){
					 System.out.println("Gateway in green status & directly scanned peripherals");
				 }
			 }catch(Exception e2){
					 System.out.println("No Gateway is available");
			 }
		 }
		 
		 try{
			 bTName1=obj.findElement(By.xpath("//*[@id='page-wrapper']/div[1]/div[3]/div[2]/div/div[1]/div/div/div[1]/div[2]/div")).getText();
			 System.out.println(bTName1);
			 if(bTName1.equalsIgnoreCase("BluTerm-6DDF")||bTName1.equalsIgnoreCase("BluTerm-F4CC")||bTName1.equalsIgnoreCase("BluTerm-76C7")){
				 System.out.println(bTName1+" peripheral is showing at first place.Do you want to continue?enter yes/no:");
//				 String busyApprove1=reader.nextLine();
				 String busyApprove1="yes";
				 for(;;){
					 if(busyApprove1.equalsIgnoreCase("yes")||busyApprove1.equalsIgnoreCase("no")){
						 if(busyApprove1.equalsIgnoreCase("yes")){
							 selectedbT="Boiler1";
							 obj.findElement(By.xpath("//*[@id='page-wrapper']/div[1]/div[3]/div[2]/div/div[1]/div/a")).click();
						 }else{
							 try{
								 String bTName2=obj.findElement(By.xpath("//*[@id='page-wrapper']/div[1]/div[3]/div[2]/div/div[2]/div/div/div[1]/div[2]/div")).getText(); 
								 System.out.println(bTName2+" peripheral is showing at second place.Do you want to continue?enter yes/no:");
								 String busyApprove2=reader.nextLine();
								 for(;;){
									 if(busyApprove2.equalsIgnoreCase("yes")||busyApprove2.equalsIgnoreCase("no")){
										 if(busyApprove2.equalsIgnoreCase("yes")){
											 selectedbT="Als boiler";
											 obj.findElement(By.xpath("//*[@id='page-wrapper']/div[1]/div[3]/div[2]/div/div[2]/div/a")).click();
										 }else{
											 try{
												 String bTName3=obj.findElement(By.xpath("//*[@id='page-wrapper']/div[1]/div[3]/div[2]/div/div[3]/div/div/div[1]/div[2]/div")).getText(); 
												 System.out.println(bTName3+" peripheral is showing at third place.Do you want to continue?enter yes/no:");
												 String busyApprove3=reader.nextLine();
												 for(;;){
													 if(busyApprove3.equalsIgnoreCase("yes")||busyApprove3.equalsIgnoreCase("no")){
														 if(busyApprove3.equalsIgnoreCase("yes")){
															 selectedbT="Boiler 4";
															 obj.findElement(By.xpath("//*[@id='page-wrapper']/div[1]/div[3]/div[2]/div/div[3]/div/a")).click();
														 }
														 break;
													 }else{
														 System.out.println("Plz enter 'yes' or 'no' only");
														 busyApprove3=reader.nextLine();
													 }
												 }
											 }catch(Exception e6){
												 System.out.println("No blueterm is available at third place");
											 }
										 }
										 break;
									 }else{
										 System.out.println("Plz enter 'yes' or 'no' only");
										 busyApprove2=reader.nextLine();
									 }
								 }
							 }catch(Exception e6){
								 System.out.println("No blueterm is available at second place");
							 }
						 }
						 break;
					 }else{
						 System.out.println("Plz enter 'yes' or 'no' only");
						 busyApprove1=reader.nextLine();
					 }
				 }
			 }else{
				 System.out.println("Showing other than 6DDF,F4CC,76C7 boilers");
			 }
		 }catch(Exception e3){
			 System.out.println(e3);
		 }
		 }catch(Exception e5){
			 System.out.println(e5);
		 }
		 
	  }
	 
	 @Test(priority=0)
	  public void mainScreenWidgetTest() throws Exception {
	      Thread.sleep(200000);
		  obj.switchTo().frame("appFrame");
		  Thread.sleep(2000);
		  System.out.println("********We are switch to the iframe*******");
		  hp = new HomePageObjects(obj);
		  
		  //get page title & compare
		  System.out.println(hp.getConnectionStatus());
		  if(hp.getConnectionStatus().equalsIgnoreCase("assets/images/dot-red.png")){
			  System.out.println("There is connection lost are you gng close testing?enter 'yes/'no'...");
			  String closeCall=reader.nextLine();
			  if(closeCall.equalsIgnoreCase("yes")){
				  obj.close();
			  }
		  }
		  String pageTitle=hp.getToolbarTitle();
		  System.out.println(pageTitle);
//		  hp.clickConfigureBtn();
//		  Thread.sleep(2000);
//		  co.clickSystemIdentification();
//		  Thread.sleep(2000);
//		  String boilerName=cao.getBoilerName();
//		  Thread.sleep(2000);
//		  cao.clickHomeBtn();
//		  Thread.sleep(2000);
		  Assert.assertTrue(pageTitle.equalsIgnoreCase(selectedbT));
		  
		 
		  //All widgets test in disconnected state
		  Assert.assertTrue(hp.getFiringRateText().toLowerCase().contains("firing rate"));
		  Assert.assertTrue(hp.getInletText().toLowerCase().contains("inlet"));
		  Assert.assertTrue(hp.getOutletText().toLowerCase().contains("outlet"));
		  Assert.assertTrue(hp.getStackText().toLowerCase().contains("stack"));
		  Assert.assertTrue(hp.getOutdoorText().toLowerCase().contains("outdoor"));
		  Assert.assertTrue(hp.getFanSpeedText().toLowerCase().contains("fan speed"));
		  Assert.assertTrue(hp.getDHWText().toLowerCase().contains("dhw"));
		  Assert.assertTrue(hp.get4t20mAText().toLowerCase().contains("4-20ma"));
		  Assert.assertTrue(hp.getFlameText().toLowerCase().contains("flame"));
		  Assert.assertTrue(hp.getSetPointText().toLowerCase().contains("setpoint"));
		  try{
			  hp.systemCHisDisplayed();
		  }catch(Exception e){
			  System.out.println("No system/CH widget showing");
		  }
		  System.out.println("All widgets are showing");

		  
		  
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
//		  try{
//			  Assert.assertTrue(firingRateValue.toLowerCase().contains("rpm"));
//			  Assert.assertTrue(fanSpeedValue.toLowerCase().contains("rpm"));
//			  Assert.assertTrue(widget4t20mAValue.toLowerCase().contains("ma"));
//			  Assert.assertTrue(flameValue.toLowerCase().contains("µamps"));
//			  Assert.assertTrue(inletValue.toLowerCase().contains("f"));
//			  Assert.assertTrue(outletValue.toLowerCase().contains("f"));
//			  Assert.assertTrue(stackValue.toLowerCase().contains("f"));
//			  Assert.assertTrue(outdoorValue.toLowerCase().contains("f"));
//			  Assert.assertTrue(dhwValue.toLowerCase().contains("f"));
//			  Assert.assertTrue(setPointValue.toLowerCase().contains("f"));
//		  }catch(Exception e){
//			  System.out.println("some thng happen in comparison");
//		  }
 
	  }
	
	//Setpoints tab
	  @Test(priority=1)
	  public void setPointsTab() throws Exception {
		  hp = new HomePageObjects(obj);
		  System.out.println("***Set Points tab***");
		  if(hp.getSetpointAttr().equals("false")){
			  hp.clickSetPointTab();
			  Thread.sleep(2000);
		  }
		  //getting the values from setpoint tab
		  String chON=hp.setChON();
		  String chModulation=hp.setChModulation();
		  String chOFF=hp.setChOFF();
		  System.out.println("Central Heat:- On: "+chON+", Modulation: "+chModulation+", chOff: "+chOFF);
		  //checking CH values are empty or not
//		  Assert.assertTrue(chON.toLowerCase().contains("ºf"));
//		  Assert.assertTrue(chModulation.toLowerCase().contains("ºf"));
//		  Assert.assertTrue(chOFF.toLowerCase().contains("ºf"));
		  
		  String dhwON=hp.setDhwON();
		  String dhwModulation=hp.setDhwModulation();
		  String dhwOFF=hp.setDhwOFF();	  
		  System.out.println("Domestic Hot water:- On: "+dhwON+", Modulation: "+dhwModulation+", chOff: "+dhwOFF);
		//checking DHW values are empty or not
//		  Assert.assertTrue(dhwON.toLowerCase().contains("ºf"));
//		  Assert.assertTrue(dhwModulation.toLowerCase().contains("ºf"));
//		  Assert.assertTrue(dhwOFF.toLowerCase().contains("ºf"));
		  try{
			  hp.isLLDisplayed();
			  String llON=hp.setllON();
			  String llModulation=hp.setllModulation();
			  String llOFF=hp.setllOFF();
			  System.out.println("Lead lag:- On: "+llON+", Modulation: "+llModulation+", chOff: "+llOFF);
		  }catch(Exception e){
			  System.out.println("No lead lag row is displayed");
		  }
	  }
	  
	  //Modulation Tab
	  @Test(priority=2)
	  public void modulationTab() throws Exception{
		  hp = new HomePageObjects(obj);
		  System.out.println("Modulation tab");
		  String modAtt=hp.getModulationAttr();
		  System.out.println(modAtt);
		  if(modAtt.equals("false")){
			  hp.clickModulationTab();
			  Thread.sleep(1500);
		  }
		//getting the values from modulation tab
		  String demandRateValue=hp.modDemandRateValue();
		  String limitedRateValue=hp.modLimitedRateValue();
		  String overrideRateValue=hp.modOverrideRateValue();
		  System.out.println("Demand Rate: "+demandRateValue+", Limited Rate: "+limitedRateValue+", Override Rate: "+overrideRateValue);
	  }
//	  
//	  //Pump Status tab
//	  @Test(priority=3)
//	  public void pumpStatusTab() throws Exception{
//		  hp = new HomePageObjects(obj);
//		  System.out.println("Pump Status tab");
//		  String ps=hp.getPumpStatusAttr();
//		  System.out.println("ps");
//		  if(ps.equals("false")){
//			  hp.clickPumpStatusTab();
//			  Thread.sleep(2000);
//		  }
//		//getting the values from pump status tab
//		  String dhwPumpValue=hp.pumpModDhwPumpValue();
//		  String boilerPumpValue=hp.pumpModBoilerPumpValue();
//		  String chPumpValue=hp.pumpModChPumpValue();
//		  System.out.println("DHW Pump: "+dhwPumpValue+", Boiler Pump: "+boilerPumpValue+", Central Heat Pump: "+chPumpValue);
//	  }
//
	  @AfterTest
	  public void close() {
		  obj.quit();
	  }


}
