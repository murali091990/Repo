package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePageObjects {
	private static WebDriver obj=null;
	//Page title
	By getToolbarTitle=By.xpath("//*[@id='toolbar']/div[2]/div[2]/div/span");
	
	//Boiler status image
	By status=By.xpath("//*[@id='user-menu']/div/span[3]/img");
	
	//All widget title elements 
	By firingRateText=By.xpath("//*[@id='home-screen']/div[2]/div/ms-widget[1]/ms-widget-front/div[1]/h2");
	By inletText=By.xpath("//*[@id='home-screen']/div[2]/div/ms-widget[2]/ms-widget-front/div[1]/h2");
	By outletText=By.xpath("//*[@id='home-screen']/div[2]/div/ms-widget[3]/ms-widget-front/div[1]/h2");
	By stackText=By.xpath("//*[@id='home-screen']/div[2]/div/ms-widget[4]/ms-widget-front/div[1]/h2");
	By outdoorText=By.xpath("//*[@id='home-screen']/div[2]/div/ms-widget[5]/ms-widget-front/div[1]/h2");
	By fanSpeedText=By.xpath("//*[@id='home-screen']/div[2]/div/ms-widget[6]/ms-widget-front/div[1]/h2");
	By dhwText=By.xpath("//*[@id='home-screen']/div[2]/div/ms-widget[7]/ms-widget-front/div[1]/h2");
	By widget4t20mAText=By.xpath("//*[@id='home-screen']/div[2]/div/ms-widget[8]/ms-widget-front/div[1]/h2");
	By flameText=By.xpath("//*[@id='home-screen']/div[2]/div/ms-widget[9]/ms-widget-front/div[1]/h2");
	By setPointText=By.xpath("//*[@id='home-screen']/div[2]/div/ms-widget[10]/ms-widget-front/div[1]/h2");
	By systemCHText=By.xpath("//*[@id='home-screen']/div[2]/div/ms-widget[11]/ms-widget-front/div[1]/h2");
	
	
	//All widget values
	By firingRateValue=By.xpath("//*[@id='home-screen']/div[2]/div/ms-widget[1]/ms-widget-front/div[2]/div");
	By fanSpeedValue=By.xpath("//*[@id='home-screen']/div[2]/div/ms-widget[6]/ms-widget-front/div[2]/div");
	By widget4t20mAValue=By.xpath("//*[@id='home-screen']/div[2]/div/ms-widget[8]/ms-widget-front/div[2]/div");
	By flameValue=By.xpath("//*[@id='home-screen']/div[2]/div/ms-widget[9]/ms-widget-front/div[2]/div");
	By inletValue=By.xpath("//*[@id='home-screen']/div[2]/div/ms-widget[2]/ms-widget-front/div[2]/div");
	By outletValue=By.xpath("//*[@id='home-screen']/div[2]/div/ms-widget[3]/ms-widget-front/div[2]/div");
	By stackValue=By.xpath("//*[@id='home-screen']/div[2]/div/ms-widget[4]/ms-widget-front/div[2]/div");
	By outdoorValue=By.xpath("//*[@id='home-screen']/div[2]/div/ms-widget[5]/ms-widget-front/div[2]/div");
	By dhwValue=By.xpath("//*[@id='home-screen']/div[2]/div/ms-widget[7]/ms-widget-front/div[2]/div");
	By setPointValue=By.xpath("//*[@id='home-screen']/div[2]/div/ms-widget[10]/ms-widget-front/div[2]/div");
	By systemCHValue=By.xpath("//*[@id='home-screen']/div[2]/div/ms-widget[11]/ms-widget-front/div[2]/div");
	
	//Getting all three tabs
	By setPoint=By.xpath("//*[@id='home-screen']/div[3]/md-tabs/md-tabs-wrapper/md-tabs-canvas/md-pagination-wrapper/md-tab-item[1]");
	By modulation=By.xpath("//*[@id='home-screen']/div[3]/md-tabs/md-tabs-wrapper/md-tabs-canvas/md-pagination-wrapper/md-tab-item[2]");
	By pumpStatus=By.xpath("//*[@id='home-screen']/div[3]/md-tabs/md-tabs-wrapper/md-tabs-canvas/md-pagination-wrapper/md-tab-item[3]");
	
	//get the values for each element in setpoint tab
	By chON=By.xpath("//*[@id='tab-content-0']/div/div/div/table/tbody/tr[1]/td[2]");
	By chModulation=By.xpath("//*[@id='tab-content-0']/div/div/div/table/tbody/tr[1]/td[3]");
	By chOFF=By.xpath("//*[@id='tab-content-0']/div/div/div/table/tbody/tr[1]/td[4]");
	By dhwON=By.xpath("//*[@id='tab-content-0']/div/div/div/table/tbody/tr[2]/td[2]");
	By dhwModulation=By.xpath("//*[@id='tab-content-0']/div/div/div/table/tbody/tr[2]/td[3]");
	By dhwOFF=By.xpath("//*[@id='tab-content-0']/div/div/div/table/tbody/tr[2]/td[4]");
	
	By llAvailable=By.xpath("//*[@id='tab-content-0']/div/div/div/table/tbody/tr[3]/td[1]");//lead lag row
	
	By llON=By.xpath("//*[@id='tab-content-0']/div/div/div/table/tbody/tr[3]/td[2]");
	By llModulation=By.xpath("//*[@id='tab-content-0']/div/div/div/table/tbody/tr[3]/td[3]");
	By llOFF=By.xpath("//*[@id='tab-content-0']/div/div/div/table/tbody/tr[3]/td[4]");
	
	//get the values for each element in modulation tab
	By demandRate=By.xpath("//*[@id='tab-content-2']/div/div/div/div[2]");
	By limitedRate=By.xpath("//*[@id='tab-content-2']/div/div/div/div[4]");
	By overrideRate=By.xpath("//*[@id='tab-content-2']/div/div/div/div[6]");
	
	//get the values for each element in modulation tab
	By dhwPump=By.xpath("//*[@id='tab-content-3']/div/div/div/div[2]");
	By boilerPump=By.xpath("//*[@id='tab-content-3']/div/div/div/div[4]");
	By chPump=By.xpath("//*[@id='tab-content-3']/div/div/div/div[6]");
	
	//Configure button
	By configureBtn=By.xpath("//*[@id='home-screen']/section/a[1]");
	//Diagnostics button
	By diagnosticsBtn=By.xpath("//*[@id='home-screen']/section/a[3]");
	//Details button
	By detailsBtn=By.xpath("//*[@id='home-screen']/section/a[4]");
	//History button
	By historyBtn=By.xpath("//*[@id='home-screen']/section/a[5]");
	
	
	
	public HomePageObjects(WebDriver obj){
		HomePageObjects.obj = obj;
	}
	
	//get the title of opened window 
	  public String getToolbarTitle() throws Exception {
		  return obj.findElement(getToolbarTitle).getText();
	  }
	
	
	/*
	 * getting all the widget titles
	 */
	//get Firing Rate widget text
		public String getFiringRateText(){
			return obj.findElement(firingRateText).getText();
		}
	//get Fan speed widget text
		public String getFanSpeedText(){
			return obj.findElement(fanSpeedText).getText();
		}
	//get 4-20 mA widget text
		public String get4t20mAText(){
			return obj.findElement(widget4t20mAText).getText();
		}
	//get Flame widget text
		public String getFlameText(){
			return obj.findElement(flameText).getText();
		}
	//get Inlet widget text
		public String getInletText(){
			return obj.findElement(inletText).getText();
		}
	//get Outlet widget text
		public String getOutletText(){
			return obj.findElement(outletText).getText();
		}
	//get Stack widget text
		public String getStackText(){
			return obj.findElement(stackText).getText();
		}
	//get Outdoor widget text
		public String getOutdoorText(){
			return obj.findElement(outdoorText).getText();
		}
	//get DHW widget text
		public String getDHWText(){
			return obj.findElement(dhwText).getText();
		}
	//get Setpoint widget text
		public String getSetPointText(){
			return obj.findElement(setPointText).getText();
		}
	//get Setpoint widget text
		public String getSystemCHText(){
			return obj.findElement(systemCHText).getText();
		}
	//System tab is displayed or not
		public boolean systemCHisDisplayed(){
			return obj.findElement(systemCHText).isDisplayed();
		}
		
		
	/*
	 * Get the value from all widgets
	 */

	//get Firing Rate widget Value
		public String getFiringRateValue(){
			return obj.findElement(firingRateValue).getText();
		}
	//get Fan speed widget Value
		public String getFanSpeedValue(){
			return obj.findElement(fanSpeedValue).getText();
		}
	//get 4-20 mA widget Value
		public String get4t20mAValue(){
			return obj.findElement(widget4t20mAValue).getText();
		}
	//get Flame widget Value
		public String getFlameValue(){
			return obj.findElement(flameValue).getText();
		}
	//get Inlet widget Value
		public String getInletValue(){
			return obj.findElement(inletValue).getText();
		}
	//get Outlet widget Value
		public String getOutletValue(){
			return obj.findElement(outletValue).getText();
		}
	//get Stack widget Value
		public String getStackValue(){
			return obj.findElement(stackValue).getText();
		}
	//get Outdoor widget Value
		public String getOutdoorValue(){
			return obj.findElement(outdoorValue).getText();
		}
	//get DHW widget Value
		public String getDHWValue(){
			return obj.findElement(dhwValue).getText();
		}
	//get Setpoint widget Value
		public String getSetPointValue(){
			return obj.findElement(setPointValue).getText();
		}	
		//get System widget Value
		public String getSysteamCHValue(){
			return obj.findElement(systemCHValue).getText();
		}
	/*
	 * Getting info about all tabs	
	 */
		
	//get setpoint tab attribute value
		public String getSetpointAttr(){
			return obj.findElement(setPoint).getAttribute("aria-selected");
		}
	//click setpoint tab
		public void clickSetPointTab(){
			 obj.findElement(setPoint).click();
			 
		}
	//get all values from setpoint tab
		public String setChON(){
			return obj.findElement(chON).getText();
		}
		public String setChModulation(){
			return obj.findElement(chModulation).getText();
		}
		public String setChOFF(){
			return obj.findElement(chOFF).getText();
		}
			
		public String setDhwON(){	  
			return obj.findElement(dhwON).getText();
		}
		public String setDhwModulation(){
			return obj.findElement(dhwModulation).getText();
		}
		public String setDhwOFF(){
			return obj.findElement(dhwOFF).getText();
		}
		
		//get ll row is showing or not
		public boolean isLLDisplayed(){
			return obj.findElement(llAvailable).isDisplayed();
		}
		
		public String setllON(){	  
			return obj.findElement(llON).getText();
		}
		public String setllModulation(){
			return obj.findElement(llModulation).getText();
		}
		public String setllOFF(){
			return obj.findElement(llOFF).getText();
		}
			
		
	
	//get modulation tab attribute value
		public String getModulationAttr(){
			return obj.findElement(modulation).getAttribute("aria-selected");
		}
	//click modulation tab
		public void clickModulationTab(){
			 obj.findElement(modulation).click();
		}	
	//get all values from modulation tab
		public String modDemandRateValue(){
			return obj.findElement(demandRate).getText();
		}
		public String modLimitedRateValue(){
			return obj.findElement(limitedRate).getText();
		}
		public String modOverrideRateValue(){
			return obj.findElement(overrideRate).getText();
		}
			
		
		
	//get pump status tab attribute value
		public String getPumpStatusAttr(){
			return obj.findElement(pumpStatus).getAttribute("aria-selected");
		}
	//click pump status tab
		public void clickPumpStatusTab(){
			 obj.findElement(pumpStatus).click();
		}
	//get all values from pump status tab
		public String pumpModDhwPumpValue(){
			return obj.findElement(dhwPump).getText();
		}
		public String pumpModBoilerPumpValue(){
			return obj.findElement(boilerPump).getText();
		}
		public String pumpModChPumpValue(){
			return obj.findElement(chPump).getText();
		}
			
	/*
	 * Click operation of configure,diagnostics,details and history buttons
	 */
		
	//Click Configure button
		public void clickConfigureBtn(){
			 obj.findElement(configureBtn).click();	 
		}
	//Click Diagnostics button
		public void clickDiagnosticsBtn(){
			 obj.findElement(diagnosticsBtn).click(); 
		}
	//Click Details button
		public void clickDetailsBtn(){
			 obj.findElement(detailsBtn).click(); 
		}
	//Click History button
		public void clickHistoryBtn(){
			 obj.findElement(historyBtn).click();	 
		}
	//get connection status
		public String getConnectionStatus(){
				return obj.findElement(status).getAttribute("src");
		}

			
	
	  
}
