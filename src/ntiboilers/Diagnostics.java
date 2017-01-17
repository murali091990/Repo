package ntiboilers;

import org.testng.annotations.Test;

import pages.ConfigureAllScreensObjects;
import pages.DiagnosticsObjects;
import pages.HomePageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Diagnostics {
	private static WebDriver obj;
	private static DiagnosticsObjects ds;
	private static HomePageObjects hp=null;
	private static ConfigureAllScreensObjects cas=null;

	  @BeforeTest
	  public void launch() throws Exception {
			obj = new FirefoxDriver();
			obj.manage().window().maximize();
			obj.get("http://localhost:3000");
			Thread.sleep(5000);
	  }
	  
	  @Test(priority=0)
	  public void diagnostics() throws Exception {
		  ds= new DiagnosticsObjects(obj);
		  hp=new HomePageObjects(obj);
		  
		  //Click on 'Diagnostics' button
		  hp.clickDiagnosticsBtn();
		  Thread.sleep(2000);
		  Assert.assertTrue(hp.getToolbarTitle().equalsIgnoreCase("Diagnostics"));
	  }
	  
	  @Test(priority=1)
	  public void burnerControlIO() throws Exception {
		  
		//Burner Control IO Tab
		  System.out.println("*Burner Control IO tab*");
		  String burnerCtrl=ds.getBurnerCntlIOTab_Attr();
		  if(!burnerCtrl.equals("true")){
			  ds.clickBurnerCntlIOTab();
			  Thread.sleep(5000);
		  }
		  //check switches in disable mode
		  String highLimit=ds.getHighLimit_Attr();
		  String stat=ds.getStat_Attr();
		  String loadCtrlInput=ds.getLoadCtrlInput_Attr();
		  String pilotValve=ds.getPilotValve_Attr();
		  String interruptedAirSwitch=ds.getInterruptedAirSwitch_Attr();
		  String rolloutSwitch=ds.getRolloutSwitch_Attr();
		  if(highLimit.equals("true")&&stat.equals("true")&&loadCtrlInput.equals("true")&&pilotValve.equals("true")&&interruptedAirSwitch.equals("true")&&rolloutSwitch.equals("true"))
			  System.out.println("All Burner control IO switches are in disable mode");
		  else
			  System.out.println("Err:Some Burner control IO switches are in enable mode");
		  
		  //click on diagnostic tests button
		  ds.clickDiagnosticTestsBtn();
		  String title1=hp.getToolbarTitle();
		  if(title1.equalsIgnoreCase("diagnostics")){
			  System.out.println("Susccess:Diagnostic tests button is not functioning");
		  }else{
			  System.out.println("Err:click Diagnostic tests button is going to other screens");
		  }
		//click on Analog IO button
		  ds.clickAnalogIOBtn();
		  String title2=hp.getToolbarTitle();
		  if(title2.equalsIgnoreCase("Analog IO")){
			  System.out.println("susccess:Analog IO button is not functioning");
		  }else{
			  System.out.println("Err:click Analog IO button is going to other screens");
		  }
		  
		  
		//Digital IO Tab
		  System.out.println("*Digital IO tab*");
		  String digitalIO=ds.getDigitalIOTab_Attr();
		  if(!digitalIO.equals("true")){
			  ds.clickDigitalIOTab();
			  Thread.sleep(5000);
		  }
		  //check switches are in disable mode
		  String pumpA=ds.getPumpA_Attr();
		  String pumpB=ds.getPumpB_Attr();
		  String pumpC=ds.getPumpC_Attr();
		  String blowerHsi=ds.getBlowerHsi_Attr();
		  String apilotValve=ds.getApilotValve_Attr();
		  String ldCtrlInout=ds.getLdCtrlInout_Attr();
		  String dHighLimit=ds.getDHighLimit_Attr();
		  String dStat=ds.getDStat_Attr();
		  String chRemoteState=ds.getChRemoteState_Attr();
		  String dInterruptedAirSwitch=ds.getDInterruptedAirSwitch_Attr();
		  String dRolloutSwitch=ds.getDRolloutSwitch_Attr();
		  String alarm=ds.getAlarm_Attr();
		  String safetyRelay=ds.getSafetyRelay_Attr();
		  String dhwRemoteStat=ds.getDhwRemoteStat_Attr();
		  String pm=ds.getPm_Attr();
		  if(pumpA.equals("true") && pumpB.equals("true") && pumpC.equals("true") && blowerHsi.equals("true") && apilotValve.equals("true") && ldCtrlInout.equals("true") && dHighLimit.equals("true") && dStat.equals("true") && chRemoteState.equals("true") && dInterruptedAirSwitch.equals("true") && dRolloutSwitch.equals("true") && alarm.equals("true") && safetyRelay.equals("true") && dhwRemoteStat.equals("true") && pm.equals("true"))
			  System.out.println("All Digital IO switches are in disable mode");
		  else
			  System.out.println("Err:Some Digital IO switches are in enable mode");
		  //click on diagnostic tests button
		  ds.clickDiagnosticTestsBtn();
		  String title3=hp.getToolbarTitle();
		  if(title3.equalsIgnoreCase("diagnostics")){
			  System.out.println("Susccess:Diagnostic tests button is not functioning");
		  }else{
			  System.out.println("Err:click Diagnostic tests button is going to other screens");
		  }
		//click on Analog IO button
		  ds.clickAnalogIOBtn();
		  String title4=hp.getToolbarTitle();
		  if(title4.equalsIgnoreCase("diagnostics")){
			  System.out.println("Susccess:Analog IO button is not functioning");
		  }else{
			  System.out.println("Err:click Analog IO button is going to other screens");
		  }
		  
	  }
	  
	  
	  
	  @Test(priority=2)
	  public void testBack() throws Exception{
		  cas = new ConfigureAllScreensObjects(obj);
		  System.out.println("Testing back button functionality");
		  //click back button
		  cas.clickBackBtn();
		  Thread.sleep(2000);
		  String title=hp.getToolbarTitle();
		  if(title.equalsIgnoreCase("home")){
			  System.out.println("susccess:By click on back button then its going to previous screen(home)");
		  }else{
			  System.out.println("Err:Failed back button functionality in Diagnostics screen");
		  }
		  
	  }
	  
	  @Test(priority=3)
	  public void testHome() throws Exception{
		  System.out.println("Testing home button functionality");
		  hp.clickDiagnosticsBtn();
		  //click home button
		  cas.clickHomeBtn();
		  Thread.sleep(2000);
		  String title=hp.getToolbarTitle();
		  if(title.equalsIgnoreCase("home")){
			  System.out.println("susccess:By click on home button then its going home screen");
		  }else{
			  System.out.println("Err:Failed home button functionality in Diagnostics screen");
		  }
		  
	  }
	  @AfterTest
	  public void close() {
		  obj.close();
	  }

}
