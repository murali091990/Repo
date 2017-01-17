package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ConfigureAllScreensObjects {
	private static WebDriver obj=null;
	
	
	//Page title
	By getToolbarTitle=By.xpath("//*[@id='toolbar']/div/div[2]/div/span");
	
	//Back button
	By backBtn=By.xpath("//*[@id='toolbar']/div/div[1]/button");
	
	//Home Button
	By homeBtn=By.xpath("//*[@id='toolbar']/div/div[1]/a/md-icon");
	
	public ConfigureAllScreensObjects(WebDriver obj){
		ConfigureAllScreensObjects.obj = obj;
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
	
	/*
	 * System Identification & Access Objects 
	 */
	
	//Boiler name
	By boilerName=By.xpath("/html/body/div/div/md-content/div/div/div[1]/div/md-input-container[1]/input");	
	//Installation 
	By installation=By.xpath("/html/body/div/div/md-content/div/div/div[1]/div/md-input-container[2]/input");
	
	
	// All widget objects
	By productType=By.xpath("//*[@id='content']/div/div/div[2]/div/ms-widget[1]/ms-widget-front/div[2]");//Product type
	By osNumber=By.xpath("//*[@id='content']/div/div/div[3]/div/ms-widget[1]/ms-widget-front/div[2]");//OS Number
	By swVersion=By.xpath("//*[@id='content']/div/div/div[2]/div/ms-widget[2]/ms-widget-front/div[2]");//Software version
	By dateCode=By.xpath("//*[@id='content']/div/div/div[3]/div/ms-widget[2]/ms-widget-front/div[2]");//Date code
	By appVersion=By.xpath("//*[@id='content']/div/div/div[2]/div/ms-widget[3]/ms-widget-front/div[2]");//Application revision
	By safetyRevision=By.xpath("//*[@id='content']/div/div/div[3]/div/ms-widget[3]/ms-widget-front/div[2]");//Safety revision
	By mb1Add=By.xpath("//*[@id='content']/div/div/div[2]/div/ms-widget[4]/ms-widget-front/div[2]");//MB1 modbus address
	By mb2Add=By.xpath("//*[@id='content']/div/div/div[3]/div/ms-widget[4]/ms-widget-front/div[2]");//MB2 modbus address
	By model=By.xpath("//*[@id='content']/div/div/div[2]/div/ms-widget[5]/ms-widget-front/div[2]");//Model
	
	  
	//Get Boiler name type  
	  public String getBoilerName(){
		  return obj.findElement(boilerName).getAttribute("value");
	  }
	//Get Installation name 
	  public String getInstalltionName(){
		  return obj.findElement(installation).getAttribute("value");
	  }
	
	
	 // Get values from widgets
	 
	//Get Product Type widget text
	  public String getProductType(){
			return obj.findElement(productType).getText();
	  }
	//Get OS Number widget text
	  public String getOSNumber(){
			return obj.findElement(osNumber).getText();
	  }
	//Get SW Version widget text
	  public String getSWVersion(){
			return obj.findElement(swVersion).getText();
	  }
	//Get Date Code widget text
	  public String getDateCode(){
			return obj.findElement(dateCode).getText();
	  }	
	//Get App Version widget text
	  public String getAppVersion(){
			return obj.findElement(appVersion).getText();
		}
	//Get Safety Revision widget text
	  public String getSafetyRevision(){
			return obj.findElement(safetyRevision).getText();
		}
	//Get MB1 Add widget text
	  public String getMb1Add(){
			return obj.findElement(mb1Add).getText();
		}
	//Get MB2 Add widget text
	  public String getMb2Add(){
			return obj.findElement(mb2Add).getText();
		}
	//Get Model widget text  
	  public String getmodel(){
			return obj.findElement(model).getText();
		}
	 
	  
	/*
	 * Central Heat Configuration Objects
	 */
	  //Select field elements
	  By chEnable=By.xpath("/html/body/div/div/md-content/div/div/div[1]/div[3]/div[1]/div/md-input-container/md-select");
	  By chDemandSwitch=By.xpath("/html/body/div/div/md-content/div/div/div[1]/div[3]/div[2]/div/md-input-container/md-select");
	  By modulationSensor=By.xpath("/html/body/div/div/md-content/div/div/div[1]/div[4]/div[1]/div/md-input-container/md-select");
	  By modulationRateSource=By.xpath("/html/body/div/div/md-content/div/div/div[1]/div[4]/div[2]/div/md-input-container/md-select");
	  //Input field elements
	  By setPoint=By.xpath("/html/body/div/div/md-content/div/div/div[1]/div[1]/div[1]/div/md-input-container/input");
	  By offDifferential=By.xpath("/html/body/div/div/md-content/div/div/div[1]/div[1]/div[2]/div/md-input-container/input");
	  By setpointSource=By.xpath("/html/body/div/div/md-content/div/div/div[1]/div[2]/div[1]/div/md-input-container/input");
	  By onDifferential=By.xpath("/html/body/div/div/md-content/div/div/div[1]/div[2]/div[2]/div/md-input-container/input");
	 
	  
	  //Get CH Enable selection value
	  public String getChEnable(){
		  return obj.findElement(chEnable).getAttribute("value");
	  }
	  //Get CH Demand Switch selection value
	  public String getChDemandSwitch(){
		  return obj.findElement(chDemandSwitch).getAttribute("value");
	  }
	  //Get Modulation Sensor selection value
	  public String getModulationSensor(){
		  return obj.findElement(modulationSensor).getAttribute("value");
	  }
	  //Get Modulation Rate Source selection value
	  public String getModulationRateSource(){
		  return obj.findElement(modulationRateSource).getAttribute("value");
	  }
	  
	//get setpoint value
	  public String getSetPoint(){
			return obj.findElement(setPoint).getAttribute("value");
	  }
	  //get Off Differential value
	  public String getOffDifferential(){
			return obj.findElement(offDifferential).getAttribute("value");
	  }
	  //get Setpoint Source value
	  public String getSetpointSource(){
			return obj.findElement(setpointSource).getAttribute("value");
	  }
	  //get On Differential value
	  public String getOnDifferencial(){
			return obj.findElement(onDifferential).getAttribute("value");
	  }
	  
	  
	  
	/*
	 * Outdoor reset Configuration objects
	 */
	  //ch eanble select field in outdoor reset
	  By orChEnable=By.xpath("/html/body/div/div/md-content/div/div/div[1]/div[1]/div[1]/div/md-input-container/md-select");
	  
	  //all input fields
	  By outdoorBoostTime= By.xpath("/html/body/div/div/md-content/div/div/div[1]/div[1]/div[2]/div/md-input-container/input");
	  By minOutdoorTemp= By.xpath("/html/body/div/div/md-content/div/div/div[1]/div[2]/div[1]/div/md-input-container/input");
	  By outdoorBoostStep= By.xpath("/html/body/div/div/md-content/div/div/div[1]/div[2]/div[2]/div/md-input-container/input");
	  By maxOutdoorTemp= By.xpath("/html/body/div/div/md-content/div/div/div[1]/div[3]/div[1]/div/md-input-container/input");
	  By outdoorBoostMaxOffPoint= By.xpath("/html/body/div/div/md-content/div/div/div[1]/div[3]/div[2]/div/md-input-container/input");
	  By lowWaterTemp= By.xpath("/html/body/div/div/md-content/div/div/div[1]/div[4]/div[1]/div/md-input-container/input");
	 
	//Get CH Enable selection value
	  public String getORChEnable(){
		  return obj.findElement(orChEnable).getAttribute("value");
	  }
	
	//  
	//get Outdoor boost time value
	  public String getOutdoorBoostTime(){
			return obj.findElement(outdoorBoostTime).getAttribute("value");
	  }
	//get min outdoor temp value
	  public String getMinOutdoorTemp(){
			return obj.findElement(minOutdoorTemp).getAttribute("value");
	  }
	//get Outdoor boost step value
	  public String getOutdoorBoostStep(){
			return obj.findElement(outdoorBoostStep).getAttribute("value");
	  }
	//get Max outdoor temp value
	  public String getMaxOutdoorTemp(){
			return obj.findElement(maxOutdoorTemp).getAttribute("value");
	  }
	//get Outdoor boost max off point value
	  public String getOutdoorBoostMaxOffPoint(){
			return obj.findElement(outdoorBoostMaxOffPoint).getAttribute("value");
	  }
	//get low water temp value
	  public String getLowWaterTemp(){
			return obj.findElement(lowWaterTemp).getAttribute("value");
	  }
	  
	 
	/*
	 * DHW Config
	 */
	  
	  //Select field elements
	  By dhwEnable=By.xpath("/html/body/div[1]/div/md-content/div/div/div[1]/div[1]/div[1]/div/md-input-container/md-select");
	  By dhwDemandSwitch=By.xpath("/html/body/div[1]/div/md-content/div/div/div[1]/div[2]/div[1]/div/md-input-container/md-select");
	  By dhwModulationSensor=By.xpath("/html/body/div[1]/div/md-content/div/div/div[1]/div[4]/div/div/md-input-container/md-select");
	  
	  //Input field elements
	  By dhwSetPoint=By.xpath("/html/body/div[1]/div/md-content/div/div/div[1]/div[1]/div[2]/div/md-input-container/input");
	  By dhwOnDifferential=By.xpath("/html/body/div[1]/div/md-content/div/div/div[1]/div[2]/div[2]/div/md-input-container/input");
	  By dhwPriorityOverrideTime=By.xpath("/html/body/div[1]/div/md-content/div/div/div[1]/div[3]/div[1]/div/md-input-container/input");
	  By dhwOffDifferential=By.xpath("/html/body/div[1]/div/md-content/div/div/div[1]/div[3]/div[2]/div/md-input-container/input");
	  By dhwDemandOnTemp=By.xpath("/html/body/div[1]/div/md-content/div/div/div[1]/div[6]/div[1]/div/md-input-container/input");
	  By dhwDemandOffTemp=By.xpath("/html/body/div[1]/div/md-content/div/div/div[1]/div[6]/div[2]/div/md-input-container/input");
	  
	//Get ghw Enable selection field value
	  public String getDhwEnable(){
		  return obj.findElement(dhwEnable).getAttribute("value");
	  }
	//Get Demand switch selection field value
	  public String getDhwDemandSwitch(){
		  return obj.findElement(dhwDemandSwitch).getAttribute("value");
	  }
	//Get DHW Modulation sensor selection field value
	  public String getDhwModulationSensor(){
		  return obj.findElement(dhwModulationSensor).getAttribute("value");
	  }
	  
	  
	//get Dhw setpoint value
	  public String getDhwSetPoint(){
			return obj.findElement(dhwSetPoint).getAttribute("value");
	  }
	//get On Differential value
	  public String getDhwOnDifferential(){
			return obj.findElement(dhwOnDifferential).getAttribute("value");
	  }
	//get priority override time value
	  public String getDhwPriorityOverrideTime(){
			return obj.findElement(dhwPriorityOverrideTime).getAttribute("value");
	  }
	//get Off Differential value
	  public String getDhwOffDifferential(){
			return obj.findElement(dhwOffDifferential).getAttribute("value");
	  }
	//get Demand on Temp value
	  public String getDhwDemandOnTemp(){
			return obj.findElement(dhwDemandOnTemp).getAttribute("value");
	  }
	//get Demand off temp value
	  public String getDhwDemandOffTemp(){
			return obj.findElement(dhwDemandOffTemp).getAttribute("value");
	  }
	
	  
    /*
     * Warm weather shut down objects
     */
	  //Input fields
	  By wwsEnable=By.xpath("/html/body/div/div/md-content/div/div/div[1]/div/md-input-container[1]/input");
	  By wwsSetpoint=By.xpath("/html/body/div/div/md-content/div/div/div[1]/div/md-input-container[2]/input");
	  
	//get wws enable value
	  public String getWwsEnable(){
			return obj.findElement(wwsEnable).getAttribute("value");
	  }
	//get wws setpoint value
	  public String getWwsSetpoint(){
			return obj.findElement(wwsSetpoint).getAttribute("value");
	  }
	  
	/*
	 * Modulation Configuration objects
	 */
	  //Select fields
	  By chSlowStartEnable=By.xpath("/html/body/div/div/md-content/div/div/div[1]/div[1]/div[2]/div/md-input-container/md-select");
	  //Input fields
	  By chMaximumModulationRate=By.xpath("/html/body/div/div/md-content/div/div/div[1]/div[1]/div[1]/div/md-input-container/input");
	  By dhwMaximumModulationRate=By.xpath("/html/body/div/div/md-content/div/div/div[1]/div[2]/div[1]/div/md-input-container/input");
	  By slowStartDegrees=By.xpath("/html/body/div/div/md-content/div/div/div[1]/div[2]/div[2]/div/md-input-container/input");
	  By minimumModulationRate=By.xpath("/html/body/div/div/md-content/div/div/div[1]/div[3]/div[1]/div/md-input-container/input");
	  By slowStartRamp=By.xpath("/html/body/div/div/md-content/div/div/div[1]/div[3]/div[2]/div/md-input-container/input");
	  
	//Get DHW Modulation sensor selection field value
	  public String getChSlowStartEnable(){
		  return obj.findElement(chSlowStartEnable).getAttribute("value");
	  }
	  
	//get CH Maximum Modulation Rate value
	  public String getChMaximumModulationRate(){
			return obj.findElement(chMaximumModulationRate).getAttribute("value");
	  }
	//get DHW Maximum Modulation Rate value
	  public String getDhwMaximumModulationRate(){
			return obj.findElement(dhwMaximumModulationRate).getAttribute("value");
	  }
	//get Slow start degrees Rate value
	  public String getSlowStartDegrees(){
			return obj.findElement(slowStartDegrees).getAttribute("value");
	  }
	//get Min Modulation Rate value
	  public String getMinimumModulationRate(){
			return obj.findElement(minimumModulationRate).getAttribute("value");
	  }
	//get Slow start ramp Rate value
	  public String getSlowStartRamp(){
			return obj.findElement(slowStartRamp).getAttribute("value");
	  }
	  
	  
	  
	  
	  
	  
	  
	/*
	 * Modulation Configuration objects
	 */
	  /*Central Heat Tab*/
	  By ch_tab=By.xpath("//*[@id='content']/div/md-tabs/md-tabs-wrapper/md-tabs-canvas/md-pagination-wrapper/md-tab-item[1]");
	  
	  //Select fields
	  By chPumpControl=By.xpath("/html/body/div/div/md-content/div/md-tabs/md-tabs-content-wrapper/md-tab-content[1]/div/div/div/div[1]/div[1]/div[1]/div/md-input-container/md-select");
	  
	  //Input fields
	  By chUseForLocalDemands=By.xpath("/html/body/div/div/md-content/div/md-tabs/md-tabs-content-wrapper/md-tab-content[1]/div/div/div/div[1]/div[1]/div[2]/div/md-input-container/input");
	  By chpumpStartDelay=By.xpath("/html/body/div/div/md-content/div/md-tabs/md-tabs-content-wrapper/md-tab-content[1]/div/div/div/div[1]/div[2]/div[1]/div/md-input-container/input");
	  By chUseForLeadLagMasterDemands=By.xpath("/html/body/div/div/md-content/div/md-tabs/md-tabs-content-wrapper/md-tab-content[1]/div/div/div/div[1]/div[2]/div[2]/div/md-input-container/input");
	  By chOverRunTime=By.xpath("/html/body/div/div/md-content/div/md-tabs/md-tabs-content-wrapper/md-tab-content[1]/div/div/div/div[1]/div[3]/div[1]/div/md-input-container/input");
	  By chUseForDelayedOverRun=By.xpath("/html/body/div/div/md-content/div/md-tabs/md-tabs-content-wrapper/md-tab-content[1]/div/div/div/div[1]/div[3]/div[2]/div/md-input-container/input");
	  By chForcePumpOffWhenDHWPriorityIsActive=By.xpath("/html/body/div/div/md-content/div/md-tabs/md-tabs-content-wrapper/md-tab-content[1]/div/div/div/div[1]/div[3]/div[3]/div/md-input-container/input");
	  
	//get ch-tab aria selected attribute
	  public String getchTab_attr(){
		  return obj.findElement(ch_tab).getAttribute("aria-selected");
	  }
	//click ch-tab 
	  public void clickChTab(){
		   obj.findElement(ch_tab).click();
	  }
	  
	//get Ch pump control selection field value
	  public String getChPumpContrlo(){
		  return obj.findElement(chPumpControl).getAttribute("value");
	  }
	  
	//get Ch Use For Local Demands value
	  public String getChUseForLocalDemands(){
			return obj.findElement(chUseForLocalDemands).getAttribute("value");
	  }
	//get Ch pump Start Delay value
	  public String getChpumpStartDelay(){
			return obj.findElement(chpumpStartDelay).getAttribute("value");
	  }
	//get Ch Use For LeadLag Master Demands value
	  public String getChUseForLeadLagMasterDemands(){
			return obj.findElement(chUseForLeadLagMasterDemands).getAttribute("value");
	  }
	//get Ch Over run Time value
	  public String getChOverRunTime(){
			return obj.findElement(chOverRunTime).getAttribute("value");
	  }
	//get Ch Use For Delayed Over Run value
	  public String getChUseForDelayedOverRun(){
			return obj.findElement(chUseForDelayedOverRun).getAttribute("value");
	  }
	//get Ch Force Pump Off When DHW Priority Is Active value
	  public String getChForcePumpOffWhenDHWPriorityIsActive(){
			return obj.findElement(chForcePumpOffWhenDHWPriorityIsActive).getAttribute("value");
	  }
	  
	  
	  
	  /* DHW Tab */
	  By dhw_tab=By.xpath("//*[@id='content']/div/md-tabs/md-tabs-wrapper/md-tabs-canvas/md-pagination-wrapper/md-tab-item[2]");
	  
	  //Select fields
	  By dhwPumpControl=By.xpath("/html/body/div/div/md-content/div/md-tabs/md-tabs-content-wrapper/md-tab-content[2]/div/div/div/div[1]/div[1]/div[1]/div/md-input-container/md-select");
	  
	  //Input fields
	  By dhwUseForLocalDemands=By.xpath("/html/body/div/div/md-content/div/md-tabs/md-tabs-content-wrapper/md-tab-content[2]/div/div/div/div[1]/div[1]/div[2]/div/md-input-container/input");
	  By dhwPumpStartDelay=By.xpath("/html/body/div/div/md-content/div/md-tabs/md-tabs-content-wrapper/md-tab-content[2]/div/div/div/div[1]/div[2]/div[1]/div/md-input-container/input");
	  By dhwUseForLeadLagMasterDemands=By.xpath("/html/body/div/div/md-content/div/md-tabs/md-tabs-content-wrapper/md-tab-content[2]/div/div/div/div[1]/div[2]/div[2]/div/md-input-container/input");
	  By dhwOverRunTime=By.xpath("/html/body/div/div/md-content/div/md-tabs/md-tabs-content-wrapper/md-tab-content[2]/div/div/div/div[1]/div[3]/div[1]/div/md-input-container/input");
	  By dhwUseForDelayedOverRun=By.xpath("/html/body/div/div/md-content/div/md-tabs/md-tabs-content-wrapper/md-tab-content[2]/div/div/div/div[1]/div[3]/div[2]/div/md-input-container/input");
	  By dhwForcePumpOffWhenDHWPriorityIsActive=By.xpath("/html/body/div/div/md-content/div/md-tabs/md-tabs-content-wrapper/md-tab-content[2]/div/div/div/div[1]/div[3]/div[3]/div/md-input-container/input");
	  
	//get dhw-tab aria selected attribute
	  public String getDhwTab_attr(){
		  return obj.findElement(dhw_tab).getAttribute("aria-selected");
	  }
	//click dhw-tab 
	  public void clickDhwTab(){
		   obj.findElement(dhw_tab).click();
	  }
	  
	//get Dhw pump control selection field value
	  public String getDhwPumpContrlo(){
		  return obj.findElement(dhwPumpControl).getAttribute("value");
	  }
	  
	//get DHw Use For Local Demands value
	  public String getDhwUseForLocalDemands(){
			return obj.findElement(dhwUseForLocalDemands).getAttribute("value");
	  }
	//get DHW pump Start Delay value
	  public String getDhwpumpStartDelay(){
			return obj.findElement(dhwPumpStartDelay).getAttribute("value");
	  }
	//get DHW Use For LeadLag Master Demands value
	  public String getDhwUseForLeadLagMasterDemands(){
			return obj.findElement(dhwUseForLeadLagMasterDemands).getAttribute("value");
	  }
	//get DHW Over run Time value
	  public String getDhwOverRunTime(){
			return obj.findElement(dhwOverRunTime).getAttribute("value");
	  }
	//get DHW Use For Delayed Over Run value
	  public String getDhwUseForDelayedOverRun(){
			return obj.findElement(dhwUseForDelayedOverRun).getAttribute("value");
	  }
	//get DHW Force Pump Off When DHW Priority Is Active value
	  public String getDhwForcePumpOffWhenDHWPriorityIsActive(){
			return obj.findElement(dhwForcePumpOffWhenDHWPriorityIsActive).getAttribute("value");
	  }
	  
	  /* Boiler Tab */
	  By boiler_tab=By.xpath("//*[@id='content']/div/md-tabs/md-tabs-wrapper/md-tabs-canvas/md-pagination-wrapper/md-tab-item[3]");
	  
	  //Select fields
	  By boilerPumpControl=By.xpath("/html/body/div[1]/div/md-content/div/md-tabs/md-tabs-content-wrapper/md-tab-content[3]/div/div/div/div/div/div[1]/div/md-input-container/md-select");
	  
	  //Input fields
	  By boilerOverrunTime=By.xpath("/html/body/div[1]/div/md-content/div/md-tabs/md-tabs-content-wrapper/md-tab-content[3]/div/div/div/div/div/div[2]/div/md-input-container/input");
	  
	//get boiler-tab aria selected attribute
	  public String getBoilerTab_Attr(){
		  return obj.findElement(boiler_tab).getAttribute("aria-selected");
	  }
	//click boiler-tab 
	  public void clickBoilerTab(){
		   obj.findElement(boiler_tab).click();
	  }
	  
	//Get boiler pump control select field value
	  public String getBoilerPumpControl(){
			return obj.findElement(boilerPumpControl).getAttribute("value");
	  }
	  
	//Get boiler Overrun Time value
	  public String getBoilerOverrunTime(){
			return obj.findElement(boilerOverrunTime).getAttribute("value");
	  }
	  
	  
	/*
	 * Statistics configuration Objects
	 */
	  //Input fields
	  By burnerCycle=By.xpath("/html/body/div/div/md-content/div/div/div/div[1]/div[1]/div/md-input-container/input");
	  By burnerRuntime=By.xpath("/html/body/div/div/md-content/div/div/div/div[1]/div[2]/div/md-input-container/input");
	  By chPumpCycles=By.xpath("/html/body/div/div/md-content/div/div/div/div[2]/div[1]/div/md-input-container/input");
	  By dhwPumpCycles=By.xpath("/html/body/div/div/md-content/div/div/div/div[2]/div[2]/div/md-input-container/input");
	  By boilerPumpCycles=By.xpath("/html/body/div/div/md-content/div/div/div/div[3]/div/div/md-input-container/input");
	  
	  //Clear all button
	  By clearAllBtn=By.xpath("//*[@id='content']/section/button");
	  
	//Get burner cycle value
	  public String getBurnerCycle(){
			return obj.findElement(burnerCycle).getAttribute("value");
	  }
	//Get burner runtime value
	  public String getBurnerRuntime(){
			return obj.findElement(burnerRuntime).getAttribute("value");
	  }
	//Get Ch pump cycle value
	  public String getChPumpCycles(){
			return obj.findElement(chPumpCycles).getAttribute("value");
	  }
	//Get Dhw pump cycles value
	  public String getDhwPumpCycles(){
			return obj.findElement(dhwPumpCycles).getAttribute("value");
	  }
	//Get boiler pump cycles value
	  public String getBoilerPumpCycles(){
			return obj.findElement(boilerPumpCycles).getAttribute("value");
	  }
	
	  //Click Clear all button  
	  public void getClearAllBtn(){
			 obj.findElement(clearAllBtn).click();
	  }
	  
	  
	  
	  
	/*
	 * Safety Limits Objects
	 */
	  //Input fields
	  By outletHighLimitSetpoint=By.xpath("/html/body/div/div/md-content/div/div/div/div[1]/div[1]/div/md-input-container/input");
	  By deltaTLimitSetpoint=By.xpath("/html/body/div/div/md-content/div/div/div/div[1]/div[2]/div/md-input-container/input");
	  By stackLimit=By.xpath("/html/body/div/div/md-content/div/div/div/div[2]/div[1]/div/md-input-container/input");
	  By tempRiseDealy=By.xpath("/html/body/div/div/md-content/div/div/div/div[2]/div[2]/div/md-input-container/input");
	  
	//Get Outlet High Limit Setpoint value
	  public String getOutletHighLimitSetpoint(){
			return obj.findElement(outletHighLimitSetpoint).getAttribute("value");
	  }
	//Get Delta T Limit Setpoint value
	  public String getDeltaTLimitSetpoint(){
			return obj.findElement(deltaTLimitSetpoint).getAttribute("value");
	  }
	//Get Stack Limit value
	  public String getStackLimit(){
			return obj.findElement(stackLimit).getAttribute("value");
	  }
	//Get Temp Rise Dealy value
	  public String getTempRiseDealy(){
			return obj.findElement(tempRiseDealy).getAttribute("value");
	  }
	  
	  
	  
	/*
	 * Frost Protection Configuration
	 */
	  //Select fields
	  By chFrostProtectionEnable=By.xpath("/html/body/div/div/md-content/div/div/div/div[1]/div[1]/div/md-input-container/md-select");
	  By dhwFrostProtectionEnable=By.xpath("/html/body/div/div/md-content/div/div/div/div[1]/div[2]/div/md-input-container/md-select");
	  By leadLagFrostProtectionEnable=By.xpath("/html/body/div/div/md-content/div/div/div/div[2]/div/div/md-input-container/md-select");
	  
	//Get Ch Frost Protection Enable value
	  public String getChFrostProtectionEnable(){
			return obj.findElement(chFrostProtectionEnable).getAttribute("value");
	  }
	//Get Dhw Frost Protection Enable value
	  public String getDhwFrostProtectionEnable(){
			return obj.findElement(dhwFrostProtectionEnable).getAttribute("value");
	  }
	//Get Lead Lag Frost Protection Enable value
	  public String getLeadLagFrostProtectionEnable(){
			return obj.findElement(leadLagFrostProtectionEnable).getAttribute("value");
	  }
	  
	  
	/*
	 * Burner Control Configuration
	 */
	  //Input field
	  By lightoffRate=By.xpath("/html/body/div/div/md-content/div/div/div/div[1]/div[1]/div/md-input-container/input");
	  By postPurgeRate=By.xpath("/html/body/div/div/md-content/div/div/div/div[1]/div[2]/div/md-input-container/input");
	  By postPurgeTime=By.xpath("/html/body/div/div/md-content/div/div/div/div[2]/div/div/md-input-container/input");
	  
	//Get Light off Rate value
	  public String getLightoffRate(){
			return obj.findElement(lightoffRate).getAttribute("value");
	  }
	//Get Post Purge Rate value
	  public String getPostPurgeRate(){
			return obj.findElement(postPurgeRate).getAttribute("value");
	  }
	//Get Post Purge Time value
	  public String getPostPurgeTime(){
			return obj.findElement(postPurgeTime).getAttribute("value");
	  }
	  
	  
	/*
	 * Sensor Configuration
	 */
	  //Input field
	  By outdoorTempCorrectionOffset=By.xpath("/html/body/div/div/md-content/div/div/div/div/div/div/md-input-container/input");
	//Get Outdoor Temperature Correction Offset value
	  public String getOutdoorTempCorrectionOffset(){
			return obj.findElement(outdoorTempCorrectionOffset).getAttribute("value");
	  }
	  
	/*
	 * System Configuration
	 */
	  //Input fields
	  By tempUnits=By.xpath("/html/body/div/div/md-content/div/div/div/div[1]/div[1]/div/md-input-container/input");
	  By antiShortCycleTime=By.xpath("/html/body/div/div/md-content/div/div/div/div[1]/div[2]/div/md-input-container/input");
	  By burnerOffInhibitTime=By.xpath("/html/body/div/div/md-content/div/div/div/div[2]/div[1]/div/md-input-container/input");
	  By alarmSilenceTime=By.xpath("/html/body/div/div/md-content/div/div/div/div[2]/div[2]/div/md-input-container/input");
	  
	//Get temperature units value
	  public String getTempUnits(){
			return obj.findElement(tempUnits).getAttribute("value");
	  }
	//Get Anti short cycle time value
	  public String getAntiShortCycleTime(){
			return obj.findElement(antiShortCycleTime).getAttribute("value");
	  }
	//Get Burner Off Inhibit Time value
	  public String getBurnerOffInhibitTime(){
			return obj.findElement(burnerOffInhibitTime).getAttribute("value");
	  }
	//Get Alarm Silence Time value
	  public String getAlarmSilenceTime(){
			return obj.findElement(alarmSilenceTime).getAttribute("value");
	  }
	  
	/*
	 * Display Configuration
	 */
	  /*General Tab*/
	  By general_Tab=By.xpath("//*[@id='content']/div/md-tabs/md-tabs-wrapper/md-tabs-canvas/md-pagination-wrapper/md-tab-item[1]");
	  
	  //Radio button
	  By genDisplayAlert=By.xpath("/html/body/div/div/md-content/div/md-tabs/md-tabs-content-wrapper/md-tab-content[1]/div/div/div/div/div/md-radio-group/md-radio-button");
	  
	  /*Screen saver Tab*/
	   By screenSaver_Tab=By.xpath("//*[@id='content']/div/md-tabs/md-tabs-wrapper/md-tabs-canvas/md-pagination-wrapper/md-tab-item[2]");
	 //Radio buttons
	   
     //Get gen_tab aria-selected attribute
	   public String getGeneralTab_Attr(){
			return obj.findElement(general_Tab).getAttribute("aria-selected");
	   } 
	 //Click General Tab
	   public void clickGeneralTab(){
			 obj.findElement(general_Tab).click();
	   } 
	 //get genDisplayAlert radio button aria-checked attribute
	   public String getGenDisplayAlert_Attr(){
			return obj.findElement(genDisplayAlert).getAttribute("aria-checked");
	   } 
	 //Click display alert radio button
	   public void clickGenDisplayAlert(){
			 obj.findElement(genDisplayAlert).click();
	   } 
	   
	 //Get screen saver tab aria-selected attribute
	   public String getScreenSaverTab_Attr(){
			return obj.findElement(screenSaver_Tab).getAttribute("aria-selected");
	   } 
	 //Click screen saver Tab
	   public void clickScreenSaver_Tab(){
			 obj.findElement(screenSaver_Tab).click();
	   } 
	   
	   
	/*
	 * Cascade Configuration
	 */
	  //Select fields
	   By casModbusAddress=By.xpath("/html/body/div/div/md-content/div/div/div/div[1]/div[1]/div/md-input-container/md-select");
	   By cascadingMasterEnable=By.xpath("/html/body/div/div/md-content/div/div/div/div[2]/div[1]/div/md-input-container/md-select");
	   By cascadingOperation=By.xpath("/html/body/div/div/md-content/div/div/div/div[3]/div/div/md-input-container/md-select");
	  //Input fields
	   By casChSetpoint=By.xpath("/html/body/div/div/md-content/div/div/div/div[1]/div[2]/div/md-input-container/input");
	   By casDhwSetpoint=By.xpath("/html/body/div/div/md-content/div/div/div/div[2]/div[2]/div/md-input-container/input");
	  //Manager Settings button
	   By casManagerSettingBtn=By.xpath("//*[@id='content']/section/button");
	  
	  //Get Modbus Address selection value
	   public String getCasModbusAddress(){
		   	return obj.findElement(casModbusAddress).getAttribute("value");
	   }
	   //Get Cascading master enable selection value
	   public String getCascadingMasterEnable(){
		   	return obj.findElement(cascadingMasterEnable).getAttribute("value");
	   }
	   //Get Cascading operation selection value
	   public String getCascadingOperation(){
		   	return obj.findElement(cascadingOperation).getAttribute("value");
	   }
	   
	 //Get Ch Setpoint value
	   public String getCasChSetpoint(){
		   	return obj.findElement(casChSetpoint).getAttribute("value");
	   }
	 //Get dhw Setpoint value
	   public String getCasDhwSetpoint(){
		   	return obj.findElement(casDhwSetpoint).getAttribute("value");
	   }
	   
	   //click manager setting button
	   public void clickCasManagerSettingBtn(){
		   obj.findElement(casManagerSettingBtn).click();
	   }
	  
	  
	  
	  
	  
}
