package ntiboilers;

import org.testng.annotations.Test;

import pages.ConfigureAllScreensObjects;
import pages.ConfigureObjects;
import pages.HomePageObjects;


import org.junit.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Configure {
	private static WebDriver obj=null;
	private static HomePageObjects hp=null;
	private static ConfigureObjects co=null;
	private static ConfigureAllScreensObjects caso=null;
  
	
  @BeforeTest
  public void launch() throws Exception {
		obj = new FirefoxDriver();
		obj.get("http://localhost:3000");
		Thread.sleep(3000);
//		obj.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }
  
  //click configure on main screen
  @Test(priority=0)
  public void configureOnMain() throws Exception {
	  hp=new HomePageObjects(obj);
	  hp.clickConfigureBtn();
	  Thread.sleep(2000);
	  Assert.assertTrue(hp.getToolbarTitle().equalsIgnoreCase("Configuration"));
	 
  }
	
  //System Identification & Access Configuration
  @Test(priority=1)
  public void systemIdentificationAccess() throws Exception {
	  co=new ConfigureObjects(obj);
	  caso=new ConfigureAllScreensObjects(obj);
	  
	  System.out.println("**System Identification Address**");
	  co.clickSystemIdentification(); //click on system identification tab
	  Thread.sleep(2000);
	  Assert.assertTrue(hp.getToolbarTitle().equalsIgnoreCase("System Identification & Access"));
	  
	  //To get boiler name,Installation input fields
	  String boilerName=caso.getBoilerName();
	  boilerName=caso.getBoilerName();
	  if(!boilerName.equalsIgnoreCase("")){
		  System.out.println("Boiler Name:"+boilerName);
  	  }else{
  		  System.out.println("In disconnected state BoilerName not showing default value");
  	  }
	  
	  String installation=caso.getInstalltionName();
	  if(!installation.equalsIgnoreCase("")){
		  System.out.println("Installation:"+installation);
	  }else{
		  System.out.println("In disconnected state Installation not showing default value");
	  }
	  
	  
	  System.out.println("Boiler name: "+boilerName+",\nInstallation: "+installation+"\n");
	  
	  //To get the values from all widgets 
	  System.out.println("Widget values");
	  String productType=caso.getProductType();//product type
	  String osNumber=caso.getOSNumber();//OS number
	  String swVersion=caso.getSWVersion();//Software version
	  String dateCode=caso.getDateCode();//Date code
	  String appVersion=caso.getAppVersion();//Application revision
	  String safetyRevision=caso.getSafetyRevision();//Safety revision
	  String mb1Add=caso.getMb1Add();//MB1 modbus address
	  String mb2Add=caso.getMb2Add();//MB2 modbus address
	  String model=caso.getmodel();//Model
	  
	  System.out.println("Product Type: "+productType+"\nOS Number: "+osNumber+"\nSW Version: "+swVersion+"\nDate Code: "+dateCode+"\nAppVersion: "+appVersion+"\nSafetyRevision: "+safetyRevision+"\nMb1Add: "+mb1Add+"\nMb2Add: "+mb2Add+"\nModel: "+model+"\n\n");
	  
	//back to configure
	  caso.clickBackBtn();
	  Assert.assertTrue(hp.getToolbarTitle().equalsIgnoreCase("Configuration"));
  }
  
 // Central Heat Configuration 
  @Test(priority=2)
  public void centralHeatConfiguration() throws Exception {
	  co=new ConfigureObjects(obj);
	  caso=new ConfigureAllScreensObjects(obj);
	  
	  System.out.println("**Central Heat Configuration**");
	  co.clickChConfig();//Click on central heat configuration
	  Thread.sleep(2000);
	  Assert.assertTrue(hp.getToolbarTitle().equalsIgnoreCase("Central Heat Configuration"));
	  
	  //To get values from selection fields
	  System.out.println("Select fields default values:");
	  String chEnable=caso.getChEnable();
	  if(!(chEnable == null)){
		  System.out.println("CH Enable:"+chEnable);
  	  }else{
  		  System.out.println("In disconnected state CH Enable not showing default value");
  	  }
	  
	  String chDemandSwitch=caso.getChDemandSwitch();
	  if(!(chDemandSwitch == null)){
		  System.out.println("CH Demand Switch:"+chDemandSwitch);
	  }else{
		  System.out.println("In disconnected state CH demand switch not showing default value");
	  }
	  
	  String modulationSensor=caso.getModulationSensor();
	  if(!(modulationSensor == null)){
		  System.out.println("Modulation Sensor:"+modulationSensor);
	  }else{
		  System.out.println("In disconnected state modulation sensor not showing default value");
	  }
	  
	  String modulationRateSource=caso.getModulationRateSource();
	  if(!(modulationRateSource == null)){
		  System.out.println("Modulation Rate Source:"+modulationRateSource+"\n");
	  }else{
		  System.out.println("In disconnected state modulation rate source not showing default value\n\n");
	  }
	  
	//To get values from input fields
	  System.out.println("Input fields default values");
	  
	  String setPoint=caso.getSetPoint();
	  String offDifferential=caso.getOffDifferential();
	  String setpointSource=caso.getSetpointSource();
	  String onDifferencial=caso.getOnDifferencial();
	  
	  Assert.assertTrue(setPoint.equalsIgnoreCase(""));
	  Assert.assertTrue(offDifferential.equalsIgnoreCase(""));
	  Assert.assertTrue(setpointSource.equalsIgnoreCase(""));
	  Assert.assertTrue(onDifferencial.equalsIgnoreCase(""));
	  
	  System.out.println("Set point:"+setPoint+",\nOff differential:"+offDifferential+",\nSetpoint Source:"+setpointSource+",\nOn differential:"+onDifferencial+"\n\n");
	  
	  //back to configure 
	  caso.clickBackBtn();
	  Assert.assertTrue(hp.getToolbarTitle().equalsIgnoreCase("Configuration"));
	  
  }
  
  //Outdoor Reset Configuration
  @Test(priority=3)
  public void outdoorResetConfiguration() throws Exception {
	  co=new ConfigureObjects(obj);
	  caso=new ConfigureAllScreensObjects(obj);
	  
	  System.out.println("**Outdoor Reset Configuration**");
	  co.clickOutdoorReset();//click outdoor reset in configure page
	  Thread.sleep(2000);
	  Assert.assertTrue(hp.getToolbarTitle().equalsIgnoreCase("Outdoor Reset Configuration"));
	  
	//To get values from selection field
	  System.out.println("Select fields default values:");
	  String chEnable=caso.getORChEnable();
	  if(!(chEnable == null)){
		  System.out.println("CH Enable:"+chEnable+"\n");
  	  }else{
  		  System.out.println("In disconnected state CH Enable not showing default value");
  	  }
	  
	  //To get values from input fields
	  System.out.println("Input fields default values:");
	  
	  String outdoorBoostTime=caso.getOutdoorBoostTime();
	  String minOutdoorTemp=caso.getMaxOutdoorTemp();
	  String outdoorBoostStep=caso.getOutdoorBoostStep();
	  String maxOutdoorTemp=caso.getMaxOutdoorTemp();
	  String outdoorBoostMaxOffPoint=caso.getOutdoorBoostMaxOffPoint();
	  String lowWaterTemp=caso.getLowWaterTemp();
	  
	  Assert.assertTrue(outdoorBoostTime.equalsIgnoreCase(""));
	  Assert.assertTrue(minOutdoorTemp.equalsIgnoreCase(""));
	  Assert.assertTrue(outdoorBoostStep.equalsIgnoreCase(""));
	  Assert.assertTrue(maxOutdoorTemp.equalsIgnoreCase(""));
	  Assert.assertTrue(outdoorBoostMaxOffPoint.equalsIgnoreCase(""));
	  Assert.assertTrue(lowWaterTemp.equalsIgnoreCase(""));
	  
	  System.out.println("Outdoor Boost Time:"+outdoorBoostTime+",\nMin Outdoor Temp:"+minOutdoorTemp+",\nOutdoor Boost Step:"+outdoorBoostStep+",\nMax Outdoor Temp:"+maxOutdoorTemp+",\nOutdoor Boost Max Off Point:"+outdoorBoostMaxOffPoint+",\nLow Water Temp:"+lowWaterTemp+"\n\n");
	  
	  //click back button
	  caso.clickBackBtn();
	  Assert.assertTrue(hp.getToolbarTitle().equalsIgnoreCase("Configuration"));
  }
  
  //DHW Configuration
  @Test(priority=4)
  public void dhwConfiguration() throws Exception {
	  co=new ConfigureObjects(obj);
	  caso=new ConfigureAllScreensObjects(obj);
	  
	  System.out.println("**Domestic Hot Water Configurations**");
	  co.clickDomesticHotWater();
	  Thread.sleep(2000);
	  Assert.assertTrue(hp.getToolbarTitle().equalsIgnoreCase("Domestic Hot Water Configurations"));
	  
	//To get values from selection field
	  System.out.println("Select fields default values:");
	  String dhwEnable=caso.getDhwEnable();
	  if(!(dhwEnable == null)){
		  System.out.println("DHW Enable:"+dhwEnable);
  	  }else{
  		  System.out.println("In disconnected state 'DHW Enable' not showing default value");
  	  }
	//get demand switch select field value
	  String dhwDemandSwitch=caso.getDhwDemandSwitch();
	  if(!(dhwDemandSwitch == null)){
		  System.out.println("Demand Switch:"+dhwDemandSwitch);
  	  }else{
  		  System.out.println("In disconnected state 'Demand Switch' not showing default value");
  	  }
	  
	  String dhwModulationSensor=caso.getDhwModulationSensor();
	  if(!(dhwModulationSensor == null)){
		  System.out.println("Modulation Sensor:"+dhwModulationSensor+"\n");
  	  }else{
  		  System.out.println("In disconnected state 'Modualtion Seanor' not showing default value");
  	  }
	  
	  //To get values from input fields
	  System.out.println("Input fields default values:");
	  
	  String dhwSetPoint=caso.getDhwSetPoint();
	  String dhwOnDifferential=caso.getDhwOnDifferential();
	  String dhwPriorityOverrideTime=caso.getDhwPriorityOverrideTime();
	  String dhwOffDifferential=caso.getDhwOffDifferential();
	  String dhwDemandOnTemp=caso.getDhwDemandOnTemp();
	  String dhwDemandOffTemp=caso.getDhwDemandOffTemp();
	  
	  Assert.assertTrue(dhwSetPoint.equalsIgnoreCase(""));
	  Assert.assertTrue(dhwOnDifferential.equalsIgnoreCase(""));
	  Assert.assertTrue(dhwPriorityOverrideTime.equalsIgnoreCase(""));
	  Assert.assertTrue(dhwOffDifferential.equalsIgnoreCase(""));
	  Assert.assertTrue(dhwDemandOnTemp.equalsIgnoreCase(""));
	  Assert.assertTrue(dhwDemandOffTemp.equalsIgnoreCase(""));
	  
	  System.out.println("SetPoint:"+dhwSetPoint+",\nOn Differential:"+dhwOnDifferential+",\nDhw Priority OverrideT ime:"+dhwPriorityOverrideTime+",\nOff Differential:"+dhwOffDifferential+",\nDemand On Temp:"+dhwDemandOnTemp+",\nDemand Off Temp:"+dhwDemandOffTemp+"\n\n");
	  
	  caso.clickBackBtn();
	  Assert.assertTrue(hp.getToolbarTitle().equalsIgnoreCase("Configuration"));
  }
  
  //Warm Weather Shutdown Configuration
  @Test(priority=5)
  public void wwsConfiguration() throws Exception {
	  co=new ConfigureObjects(obj);
	  caso=new ConfigureAllScreensObjects(obj);
	  
	  System.out.println("**Warm Weather Shutdown Configuration**");
	  co.clickWarmWeatherShutdown();
	  Thread.sleep(2000);
	  Assert.assertTrue(hp.getToolbarTitle().equalsIgnoreCase("Warm Weather Shutdown Configuration"));
	  
	  //To get values from input fields
	  System.out.println("Input fields default values:");
	  String wwsEnable=caso.getWwsEnable();
	  String wwsSetpoint=caso.getWwsSetpoint();
	  Assert.assertTrue(wwsEnable.equalsIgnoreCase(""));
	  Assert.assertTrue(wwsSetpoint.equalsIgnoreCase(""));
	 
	  System.out.println("Warm Weather Shoutdown Enable:"+wwsEnable+",\nWarm Weather Shoutdown Setpoint:"+wwsSetpoint+"\n\n");
	  
	  caso.clickBackBtn();
	  Assert.assertTrue(hp.getToolbarTitle().equalsIgnoreCase("Configuration"));
  }
  
  //Modulation Configuration
  @Test(priority=6)
  public void modulationConfiguration() throws Exception {
	  co=new ConfigureObjects(obj);
	  caso=new ConfigureAllScreensObjects(obj);
	  
	  System.out.println("**Modulation Configuration**");
	  co.clickModulationConfig();
	  Thread.sleep(2000);
	  Assert.assertTrue(hp.getToolbarTitle().equalsIgnoreCase("Modulation Configuration"));
	  
	//To get values from selection field
	  System.out.println("Select fields default values:");
	  String chSlowStartEnable=caso.getChSlowStartEnable();
	  if(!(chSlowStartEnable == null)){
		  System.out.println("CH slow start Enable:"+chSlowStartEnable+"\n");
  	  }else{
  		  System.out.println("In disconnected state 'CH Slow Start Enable' not showing default value");
  	  }
	  
	  //To get values from input fields
	  System.out.println("Input fields default values:");
	  String chMaximumModulationRate=caso.getChMaximumModulationRate();
	  String dhwMaximumModulationRate=caso.getDhwMaximumModulationRate();
	  String slowStartDegrees=caso.getSlowStartDegrees();
	  String minimumModulationRate=caso.getMinimumModulationRate();
	  String slowStartRamp=caso.getSlowStartRamp();
	  
	  Assert.assertTrue(chMaximumModulationRate.equalsIgnoreCase(""));
	  Assert.assertTrue(dhwMaximumModulationRate.equalsIgnoreCase(""));
	  Assert.assertTrue(slowStartDegrees.equalsIgnoreCase(""));
	  Assert.assertTrue(minimumModulationRate.equalsIgnoreCase(""));
	  Assert.assertTrue(slowStartRamp.equalsIgnoreCase(""));
	  
	  System.out.println("CH Maximum Modulation Rate:"+chMaximumModulationRate+",\nDHW Maximum Modulation Rate:"+dhwMaximumModulationRate+",\nSlow Start Degrees:"+slowStartDegrees+",\nMinimum Modulation Rate:"+minimumModulationRate+",\nSlow Start Ramp:"+slowStartRamp+"\n\n");
	  
	  caso.clickBackBtn();
	  Assert.assertTrue(hp.getToolbarTitle().equalsIgnoreCase("Configuration"));
  }
  
  //Pump Configuration
  @Test(priority=7)
  public void pumpConfiguration() throws Exception {
	  co=new ConfigureObjects(obj);
	  caso=new ConfigureAllScreensObjects(obj);
	  
	  System.out.println("**Pump Configuration**");
	  co.clickPumpConfig();
	  Thread.sleep(2000);
	  Assert.assertTrue(hp.getToolbarTitle().equalsIgnoreCase("Pump Configuration"));
	 
	 //Central Heat Tab
	  System.out.println("*Central Heat tab*");
	  String ch_tab=caso.getchTab_attr();
	  if(ch_tab.equals("false")){
		  caso.clickChTab();
		  Thread.sleep(2000);
	  }
	  
	  //To get values from selection field
	  System.out.println("Select fields default values:");
	  String chPumpControl=caso.getChPumpContrlo();
	  if(!(chPumpControl == null)){
		  System.out.println("Pump Control:"+chPumpControl+"\n");
  	  }else{
  		  System.out.println("In disconnected state 'Pump Control' not showing default value");
  	  }
	  
	  //To get values from input fields
	  System.out.println("Input fields default values:");
	  String chUseForLocalDemands=caso.getChUseForLocalDemands();
	  String chPumpStartDelay=caso.getChpumpStartDelay();
	  String chUseForLeadLagMasterDemands=caso.getChUseForLeadLagMasterDemands();
	  String chOverRunTime=caso.getChOverRunTime();
	  String chUseForDelayedOverRun=caso.getChUseForDelayedOverRun();
	  String chForcePumpOffWhenDHWPriorityIsActive=caso.getChForcePumpOffWhenDHWPriorityIsActive();
	  
	  Assert.assertTrue(chUseForLocalDemands.equalsIgnoreCase(""));
	  Assert.assertTrue(chPumpStartDelay.equalsIgnoreCase(""));
	  Assert.assertTrue(chUseForLeadLagMasterDemands.equalsIgnoreCase(""));
	  Assert.assertTrue(chOverRunTime.equalsIgnoreCase(""));
	  Assert.assertTrue(chUseForDelayedOverRun.equalsIgnoreCase(""));
	  Assert.assertTrue(chForcePumpOffWhenDHWPriorityIsActive.equalsIgnoreCase(""));
	  
	  System.out.println("Use For Local Demands:"+chUseForLocalDemands+",\nPump Start Delay:"+chPumpStartDelay+",\nUse For Lead Lag Master Demands:"+chUseForLeadLagMasterDemands+",\nOverrun Time:"+chOverRunTime+",\nUse For Delayed Overrun:"+chUseForDelayedOverRun+",\nForce Pump Off When DHW Priority Is Active:"+chForcePumpOffWhenDHWPriorityIsActive+"\n");
	  
	 //DHW Tab
	  System.out.println("*DHW tab*");
	  String dhw=caso.getDhwTab_attr();
	  if(dhw.equals("false")){
		  caso.clickDhwTab();
		  Thread.sleep(2000);
	  }
	  
	  //To get values from selection field
	  System.out.println("Select fields default values:");
	  String dhwPumpControl=caso.getDhwPumpContrlo();
	  if(!(dhwPumpControl == null)){
		  System.out.println("Pump Control:"+dhwPumpControl+"\n");
  	  }else{
  		  System.out.println("In disconnected state 'Pump Control' not showing default value");
  	  }
	  
	  //To get values from input fields
	  System.out.println("Input fields default values:");
	  String dhwUseForLocalDemands=caso.getDhwUseForLocalDemands();
	  String dhwPumpStartDelay=caso.getDhwpumpStartDelay();
	  String dhwUseForLeadLagMasterDemands=caso.getDhwUseForLeadLagMasterDemands();
	  String dhwOverRunTime=caso.getDhwOverRunTime();
	  String dhwUseForDelayedOverRun=caso.getDhwUseForDelayedOverRun();
	  String dhwForcePumpOffWhenDHWPriorityIsActive=caso.getDhwForcePumpOffWhenDHWPriorityIsActive();
	  
	  Assert.assertTrue(dhwUseForLocalDemands.equalsIgnoreCase(""));
	  Assert.assertTrue(dhwPumpStartDelay.equalsIgnoreCase(""));
	  Assert.assertTrue(dhwUseForLeadLagMasterDemands.equalsIgnoreCase(""));
	  Assert.assertTrue(dhwOverRunTime.equalsIgnoreCase(""));
	  Assert.assertTrue(dhwUseForDelayedOverRun.equalsIgnoreCase(""));
	  Assert.assertTrue(dhwForcePumpOffWhenDHWPriorityIsActive.equalsIgnoreCase(""));
	  
	  System.out.println("Use For Local Demands:"+dhwUseForLocalDemands+",\nPump Start Delay:"+dhwPumpStartDelay+",\nUse For Lead Lag Master Demands:"+dhwUseForLeadLagMasterDemands+",\nOverrun Time:"+dhwOverRunTime+",\nUse For Delayed Overrun:"+dhwUseForDelayedOverRun+",\nForce Pump Off When DHW Priority Is Active:"+dhwForcePumpOffWhenDHWPriorityIsActive+"\n");
	  
	//Boiler Tab
	  System.out.println("*Boiler tab*");
	  String boiler=caso.getBoilerTab_Attr();
	  if(boiler.equals("false")){
		  caso.clickBoilerTab();
		  Thread.sleep(2000);
	  }
	  
	  //To get values from selection field
	  System.out.println("Select fields default values:");
	  String boilerPumpControl=caso.getBoilerPumpControl();
	  if(!(boilerPumpControl == null)){
		  System.out.println("Boiler Control:"+boilerPumpControl+"\n");
  	  }else{
  		  System.out.println("In disconnected state 'Boiler Control' not showing default value");
  	  }
	  
	  //To get values from input fields
	  System.out.println("Input fields default values:");
	  String boilerOverrunTime=caso.getBoilerOverrunTime();
	  
	  Assert.assertTrue(boilerOverrunTime.equalsIgnoreCase(""));
	  
	  System.out.println("Overrun Time:"+boilerOverrunTime+"\n\n");
	  
	  caso.clickBackBtn();
	  Assert.assertTrue(hp.getToolbarTitle().equalsIgnoreCase("Configuration"));
  }
  
  //Statistics Configuration
  @Test(priority=8)
  public void statisticsConfiguration() throws Exception {
	  co=new ConfigureObjects(obj);
	  caso=new ConfigureAllScreensObjects(obj);
	  
	  System.out.println("**Statistics Configuration**");
	  co.clickStatisticsConfig();
	  Thread.sleep(2000);
	  Assert.assertTrue(hp.getToolbarTitle().equalsIgnoreCase("Statistics Configuration"));
	  
	  //To get values from input fields
	  System.out.println("Input fields default values:");
	  
	  String burnerCycle=caso.getBurnerCycle();
	  String burnerRuntime=caso.getBurnerRuntime();
	  String chPumpCycles=caso.getChPumpCycles();
	  String dhwPumpCycles=caso.getDhwPumpCycles();
	  String boilerPumpCycles=caso.getBoilerPumpCycles();
	  
	  Assert.assertTrue(burnerCycle.equalsIgnoreCase(""));
	  Assert.assertTrue(burnerRuntime.equalsIgnoreCase(""));
	  Assert.assertTrue(chPumpCycles.equalsIgnoreCase(""));
	  Assert.assertTrue(dhwPumpCycles.equalsIgnoreCase(""));
	  Assert.assertTrue(boilerPumpCycles.equalsIgnoreCase(""));
	  
	  System.out.println("Burner Cycle:"+burnerCycle+",\nBurner Runtime:"+burnerRuntime+",\nCH Pump Cycles:"+chPumpCycles+",\nDHW Pump Cycles:"+dhwPumpCycles+",\nBoiler Pump Cycles:"+boilerPumpCycles+"\n\n");
	  
	  //Click on clear all
	  caso.getClearAllBtn();
	  
	  caso.clickBackBtn();
	  Assert.assertTrue(hp.getToolbarTitle().equalsIgnoreCase("Configuration"));
  }
  
  //Safety Limits
  @Test(priority=9)
  public void safetyLimits() throws Exception {
	  co=new ConfigureObjects(obj);
	  caso=new ConfigureAllScreensObjects(obj);
	  
	  System.out.println("**Safety Limits**");
	  co.clickSafetyLimits();
	  Thread.sleep(2000);
	  Assert.assertTrue(hp.getToolbarTitle().equalsIgnoreCase("Safety Limits"));
	  
	  //To get values from input fields
	  System.out.println("Input fields default values:");
	  
	  String outletHighLimitSetpoint=caso.getOutletHighLimitSetpoint();
	  String deltaTLimitSetpoint=caso.getDeltaTLimitSetpoint();
	  String stackLimit=caso.getStackLimit();
	  String tempRiseDealy=caso.getTempRiseDealy();
	  
	  Assert.assertTrue(outletHighLimitSetpoint.equalsIgnoreCase(""));
	  Assert.assertTrue(deltaTLimitSetpoint.equalsIgnoreCase(""));
	  Assert.assertTrue(stackLimit.equalsIgnoreCase(""));
	  Assert.assertTrue(tempRiseDealy.equalsIgnoreCase(""));
	  
	  System.out.println("Outlet Hight Limit Setpoint:"+outletHighLimitSetpoint+",\nDelta T Limit Delay:"+deltaTLimitSetpoint+",\nStack Limit:"+stackLimit+",\nTemperature Rise Delay:"+tempRiseDealy+"\n\n");
	  
	  caso.clickBackBtn();
	  Assert.assertTrue(hp.getToolbarTitle().equalsIgnoreCase("Configuration"));
  }
  
  //Frost Protection Configuration
  @Test(priority=10)
  public void frostProtectionConfiguration() throws Exception {
	  co=new ConfigureObjects(obj);
	  caso=new ConfigureAllScreensObjects(obj);
	  
	  System.out.println("**Frost Protection Configuration**");
	  co.clickFrostProtection();
	  Thread.sleep(2000);
	  Assert.assertTrue(hp.getToolbarTitle().equalsIgnoreCase("Frost Protection Configuration"));
	  
	//To get values from selection field
	  System.out.println("Select fields default values:");
	  String chFrostProtectionEnable=caso.getChFrostProtectionEnable();
	  if(!(chFrostProtectionEnable == null)){
		  System.out.println("CH Frost protection enable:"+chFrostProtectionEnable+"\n");
  	  }else{
  		  System.out.println("In disconnected state 'CH Frost protection enable' not showing default value");
  	  }
	  
	  String dhwFrostProtectionEnable=caso.getDhwFrostProtectionEnable();
	  if(!(dhwFrostProtectionEnable == null)){
		  System.out.println("DHW Frost protection enable:"+dhwFrostProtectionEnable+"\n");
  	  }else{
  		  System.out.println("In disconnected state 'DHW Frost protection enable' not showing default value");
  	  }
	  
	  String leadLagFrostProtectionEnable=caso.getLeadLagFrostProtectionEnable();
	  if(!(leadLagFrostProtectionEnable == null)){
		  System.out.println("Lead Lag Frost protection enable:"+leadLagFrostProtectionEnable+"\n");
  	  }else{
  		  System.out.println("In disconnected state 'Lead Lag Frost protection enable' not showing default value");
  	  }
	  
	  caso.clickBackBtn();
	  Assert.assertTrue(hp.getToolbarTitle().equalsIgnoreCase("Configuration"));
  }
  
  //Burner Control
  @Test(priority=11)
  public void burnerContol() throws Exception {
	  co=new ConfigureObjects(obj);
	  caso=new ConfigureAllScreensObjects(obj);
	  
	  System.out.println("**Burner Control**");
	  co.clickBurnerControl();
	  Thread.sleep(2000);
	  Assert.assertTrue(hp.getToolbarTitle().equalsIgnoreCase("Burner Control"));
	  
	  //To get values from input fields
	  System.out.println("Input fields default values:");
	  
	  String lightoffRate=caso.getLightoffRate();
	  String postpurgeRate=caso.getPostPurgeRate();
	  String postpurgeTime=caso.getPostPurgeTime();
	  
	  Assert.assertTrue(lightoffRate.equalsIgnoreCase(""));
	  Assert.assertTrue(postpurgeRate.equalsIgnoreCase(""));
	  Assert.assertTrue(postpurgeTime.equalsIgnoreCase(""));
	  
	  System.out.println("Lightoff Rate:"+lightoffRate+",\nPostpurge Rate:"+postpurgeRate+",\nPostpurge Time:"+postpurgeTime+"\n\n");
	  
	  caso.clickBackBtn();
	  Assert.assertTrue(hp.getToolbarTitle().equalsIgnoreCase("Configuration"));
  }
  
  //Sensor Configuration
  @Test(priority=12)
  public void sensorConfiguration() throws Exception {
	  co=new ConfigureObjects(obj);
	  caso=new ConfigureAllScreensObjects(obj);
	  
	  System.out.println("**Sensor Configuration**");
	  co.clickSensorConfig();
	  Thread.sleep(2000);
	  Assert.assertTrue(hp.getToolbarTitle().equalsIgnoreCase("Sensor Configuration"));
	  
	//To get values from input fields
	  System.out.println("Input fields default values:");
	  
	  String outdoorTemperatureCorrectionOffset=caso.getOutdoorTempCorrectionOffset();
	  
	  Assert.assertTrue(outdoorTemperatureCorrectionOffset.equalsIgnoreCase(""));
	  
	  System.out.println("Outdoor temperature correction offset:"+outdoorTemperatureCorrectionOffset+"\n\n");
	  
	  caso.clickBackBtn();
	  Assert.assertTrue(hp.getToolbarTitle().equalsIgnoreCase("Configuration"));
  }
  
  //System Configuration
  @Test(priority=13)
  public void systemConfiguration() throws Exception {
	  co=new ConfigureObjects(obj);
	  caso=new ConfigureAllScreensObjects(obj);
	  
	  System.out.println("**System Configuration**");
	  co.clickSystemConfig();
	  Thread.sleep(2000);
	  Assert.assertTrue(hp.getToolbarTitle().equalsIgnoreCase("System Configuration"));
	  
	//To get values from input fields
	  System.out.println("Input fields default values:");
	  String tempUnits=caso.getTempUnits();
	  String antiShortCycleTime=caso.getAntiShortCycleTime();
	  String burnerOffInhibitTime=caso.getBurnerOffInhibitTime();
	  String alarmSilenceTime=caso.getAlarmSilenceTime();
	  
	  Assert.assertTrue(tempUnits.equalsIgnoreCase(""));
	  Assert.assertTrue(antiShortCycleTime.equalsIgnoreCase(""));
	  Assert.assertTrue(burnerOffInhibitTime.equalsIgnoreCase(""));
	  Assert.assertTrue(alarmSilenceTime.equalsIgnoreCase(""));
	  
	  System.out.println("Temperature units:"+tempUnits+",\nAnti short-cycle time:"+antiShortCycleTime+",\nBurner off inhibit time:"+burnerOffInhibitTime+",\nAlarm silence time:"+alarmSilenceTime+"\n\n");
	  
	  caso.clickBackBtn();
	  Assert.assertTrue(hp.getToolbarTitle().equalsIgnoreCase("Configuration"));
  }
  
  //Display Configuration(***Under Construction***)
  @Test(priority=14)
  public void displayConfiguration() throws Exception {
	  co=new ConfigureObjects(obj);
	  caso=new ConfigureAllScreensObjects(obj);
	  
	  System.out.println("**Display Configuration**");
	  co.clickDisplayConfig();
	  Thread.sleep(2000);
	  Assert.assertTrue(hp.getToolbarTitle().equalsIgnoreCase("Display Configuration"));
	  
	//General Tab
	  System.out.println("*General tab*");
	  String gen_Tab=caso.getGeneralTab_Attr();
	  if(gen_Tab.equals("false")){
		  caso.clickGeneralTab();
		  Thread.sleep(2000);
	  }
	  //Checking Radio button is checked or not
	  String genDisplayAlert=caso.getGenDisplayAlert_Attr();
	  if(genDisplayAlert.equalsIgnoreCase("true"))
		  System.out.println("Error:In disconnected state the radio button should be in un-checked but it is in checked state\n");
	  else
		  System.out.println("Success:In disconnected state the 'Display alert' radio button is un-checked state\n");
	  
	  
	//Screen saver Tab
	  System.out.println("*Screen saver tab*");
	  String screenSaver=caso.getScreenSaverTab_Attr();
	  if(screenSaver.equals("false")){
		  caso.clickScreenSaver_Tab();
		  Thread.sleep(2000);
		  System.out.println("@@@@@ This Page Under Construction @@@@@\n");
	  }
	  
	  caso.clickBackBtn();
	  Assert.assertTrue(hp.getToolbarTitle().equalsIgnoreCase("Configuration"));
  }
  
  //Cascade Configuration
  @Test(priority=15)
  public void cascadeConfiguration() throws Exception {
	  co=new ConfigureObjects(obj);
	  caso=new ConfigureAllScreensObjects(obj);
	  
	  System.out.println("**Cascade Configuration**");
	  co.clickCascadeConfig();
	  Thread.sleep(2000);
	  Assert.assertTrue(hp.getToolbarTitle().equalsIgnoreCase("Cascade Configuration"));
	  
	//To get values from selection field
	  System.out.println("Select fields default values:");
	  String modbusAddress=caso.getCasModbusAddress();
	  if(!(modbusAddress == null)){
		  System.out.println("Modbus Address:"+modbusAddress+"\n");
  	  }else{
  		  System.out.println("In disconnected state 'Modbus Address' not showing default value");
  	  }
	  
	  String cascadingMasterEnable=caso.getCascadingMasterEnable();
	  if(!(cascadingMasterEnable == null)){
		  System.out.println("Cascading Master enable:"+cascadingMasterEnable+"\n");
  	  }else{
  		  System.out.println("In disconnected state 'Cascading Master enable' not showing default value");
  	  }
	  
	  String cascadingOperation=caso.getCascadingOperation();
	  if(!(cascadingOperation == null)){
		  System.out.println("Cascading Operation:"+cascadingOperation+"\n");
  	  }else{
  		  System.out.println("In disconnected state 'Cascading Operation' not showing default value");
  	  }
	  
	  //To get values from input fields
	  System.out.println("Input fields default values:");
	  String chSetpoint=caso.getCasChSetpoint();
	  String dhwSetpoint=caso.getCasDhwSetpoint();
	  
	  Assert.assertTrue(chSetpoint.equalsIgnoreCase(""));
	  Assert.assertTrue(chSetpoint.equalsIgnoreCase(""));
	  
	  System.out.println("CH Setpoint:"+chSetpoint+",\nDHW Setpoint:"+dhwSetpoint+"\n\n");
	  
	  //Click on 'Manager settings' button
	  caso.clickCasManagerSettingBtn();
	  
	  caso.clickBackBtn();
	  Assert.assertTrue(hp.getToolbarTitle().equalsIgnoreCase("Configuration"));
  }
  
  //Wifi Configuration
  @Test(priority=16)
  public void wifiConfiguration() throws Exception {
	  co=new ConfigureObjects(obj);
	  caso=new ConfigureAllScreensObjects(obj);
	  
	  System.out.println("**Wifi Configuration**");
	  co.clickWifiConfig();
	  Thread.sleep(2000);
	  Assert.assertTrue(hp.getToolbarTitle().equalsIgnoreCase("Wi-Fi Configuration"));
	  System.out.println("@@@@@ This Page Under Construction @@@@@\n");
	  
	  //Click back button
	  caso.clickBackBtn();
	  Assert.assertTrue(hp.getToolbarTitle().equalsIgnoreCase("Configuration"));
	  //click home button
	  caso.clickHomeBtn();
	  Assert.assertTrue(hp.getToolbarTitle().equalsIgnoreCase("Home"));
  }
 
  @AfterTest
  public void close() {
	  obj.close();
  }
  


}
