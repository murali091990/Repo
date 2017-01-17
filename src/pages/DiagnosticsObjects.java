package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DiagnosticsObjects {
	private static WebDriver obj=null;
	
	public DiagnosticsObjects(WebDriver obj){
		DiagnosticsObjects.obj=obj;
	}
	
	By burnerCtrlIO_Tab=By.xpath("//*[@id='content']/div/md-tabs/md-tabs-wrapper/md-tabs-canvas/md-pagination-wrapper/md-tab-item[1]");
	
	By highLimit=By.xpath("/html/body/div/div/md-content/div/md-tabs/md-tabs-content-wrapper/md-tab-content[1]/div/div/md-switch[1]");
	By stat=By.xpath("/html/body/div/div/md-content/div/md-tabs/md-tabs-content-wrapper/md-tab-content[1]/div/div/md-switch[2]");
	By loadCtrlInput=By.xpath("/html/body/div/div/md-content/div/md-tabs/md-tabs-content-wrapper/md-tab-content[1]/div/div/md-switch[3]");
	By pilotValve=By.xpath("/html/body/div/div/md-content/div/md-tabs/md-tabs-content-wrapper/md-tab-content[1]/div/div/md-switch[4]");
	By interruptedAirSwitch=By.xpath("/html/body/div/div/md-content/div/md-tabs/md-tabs-content-wrapper/md-tab-content[1]/div/div/md-switch[5]");
	By rolloutSwitch=By.xpath("/html/body/div/div/md-content/div/md-tabs/md-tabs-content-wrapper/md-tab-content[1]/div/div/md-switch[6]");
	
	By diagnosticTestsBtn=By.xpath("//*[@id='content']/section/button[1]");
	By analogIOBtn=By.xpath("//*[@id='content']/section/button[2]");
	
	
	
	By digitalIO_Tab=By.xpath("//*[@id='content']/div/md-tabs/md-tabs-wrapper/md-tabs-canvas/md-pagination-wrapper/md-tab-item[2]");
	
	By pumpA=By.xpath("/html/body/div/div/md-content/div/md-tabs/md-tabs-content-wrapper/md-tab-content[2]/div/div/div[1]/md-switch[1]");
	By pumpB=By.xpath("/html/body/div/div/md-content/div/md-tabs/md-tabs-content-wrapper/md-tab-content[2]/div/div/div[2]/md-switch[1]");
  	By pumpC=By.xpath("/html/body/div/div/md-content/div/md-tabs/md-tabs-content-wrapper/md-tab-content[2]/div/div/div[3]/md-switch[1]");
  	By blowerHsi=By.xpath("/html/body/div/div/md-content/div/md-tabs/md-tabs-content-wrapper/md-tab-content[2]/div/div/div[4]/md-switch[1]");
  	By apilotValve=By.xpath("/html/body/div/div/md-content/div/md-tabs/md-tabs-content-wrapper/md-tab-content[2]/div/div/div[5]/md-switch[1]");
  	By ldCtrlInout=By.xpath("/html/body/div/div/md-content/div/md-tabs/md-tabs-content-wrapper/md-tab-content[2]/div/div/div[6]/md-switch[1]");
  	By dHighLimit=By.xpath("/html/body/div/div/md-content/div/md-tabs/md-tabs-content-wrapper/md-tab-content[2]/div/div/div[7]/md-switch[1]");
  	By dStat=By.xpath("/html/body/div/div/md-content/div/md-tabs/md-tabs-content-wrapper/md-tab-content[2]/div/div/div[1]/md-switch[2]");
	By chRemoteState=By.xpath("/html/body/div/div/md-content/div/md-tabs/md-tabs-content-wrapper/md-tab-content[2]/div/div/div[2]/md-switch[2]");
	By dInterruptedAirSwitch=By.xpath("/html/body/div/div/md-content/div/md-tabs/md-tabs-content-wrapper/md-tab-content[2]/div/div/div[3]/md-switch[2]");
	By dRolloutSwitch=By.xpath("/html/body/div/div/md-content/div/md-tabs/md-tabs-content-wrapper/md-tab-content[2]/div/div/div[4]/md-switch[2]");
	By alarm=By.xpath("/html/body/div/div/md-content/div/md-tabs/md-tabs-content-wrapper/md-tab-content[2]/div/div/div[5]/md-switch[2]");
	By safetyRelay=By.xpath("/html/body/div/div/md-content/div/md-tabs/md-tabs-content-wrapper/md-tab-content[2]/div/div/div[6]/md-switch[2]");
	By dhwRemoteStat=By.xpath("/html/body/div/div/md-content/div/md-tabs/md-tabs-content-wrapper/md-tab-content[2]/div/div/div[7]/md-switch[2]");
	By pm=By.xpath("/html/body/div/div/md-content/div/md-tabs/md-tabs-content-wrapper/md-tab-content[2]/div/div/div[1]/md-switch[3]");
	
	//get Burner control I/O aria-selected attr value
	public String getBurnerCntlIOTab_Attr(){
		return obj.findElement(burnerCtrlIO_Tab).getAttribute("aria-selected");
	}
	//Click Burner control I/O Tab
	public void clickBurnerCntlIOTab(){
		obj.findElement(burnerCtrlIO_Tab).click();
	}

	//get high limit aria-disabled attr value
	public String getHighLimit_Attr(){
		return obj.findElement(highLimit).getAttribute("aria-disabled");
	}	
	//get stat aria-disabled attr value
	public String getStat_Attr(){
		return obj.findElement(stat).getAttribute("aria-disabled");
	}
	//get load control I/P aria-disabled attr value
	public String getLoadCtrlInput_Attr(){
		return obj.findElement(loadCtrlInput).getAttribute("aria-disabled");
	}
	//get pilot valve aria-disabled attr value
	public String getPilotValve_Attr(){
		return obj.findElement(pilotValve).getAttribute("aria-disabled");
	}
	//get interrupted air switch aria-disabled attr value
	public String getInterruptedAirSwitch_Attr(){
		return obj.findElement(interruptedAirSwitch).getAttribute("aria-disabled");
	}
	//get roll out switch aria-disabled attr value
	public String getRolloutSwitch_Attr(){
		return obj.findElement(rolloutSwitch).getAttribute("aria-disabled");
	}
	
	
	
	//get Digital I/O aria-selected attr value
	public String getDigitalIOTab_Attr(){
		return obj.findElement(digitalIO_Tab).getAttribute("aria-disabled");
	}
	//Click Digital I/O Tab
	public void clickDigitalIOTab(){
		 obj.findElement(digitalIO_Tab).click();
	}
	
	//get Pump A aria-disabled attr value
	public String getPumpA_Attr(){
		return obj.findElement(pumpA).getAttribute("aria-disabled");
	}
	//get Pump B aria-disabled attr value
	public String getPumpB_Attr(){
		return obj.findElement(pumpB).getAttribute("aria-disabled");
	}
	//get Pump C aria-disabled attr value
	public String getPumpC_Attr(){
		return obj.findElement(pumpC).getAttribute("aria-disabled");
	}
	//get Blower Hsi aria-disabled attr value
	public String getBlowerHsi_Attr(){
		return obj.findElement(blowerHsi).getAttribute("aria-disabled");
	}
	//get Apilot Valve aria-disabled attr value
	public String getApilotValve_Attr(){
		return obj.findElement(apilotValve).getAttribute("aria-disabled");
	}
	//get load Ctrl Inout aria-disabled attr value
	public String getLdCtrlInout_Attr(){
		return obj.findElement(ldCtrlInout).getAttribute("aria-disabled");
	}
	//get DHighLimit aria-disabled attr value
	public String getDHighLimit_Attr(){
		return obj.findElement(dHighLimit).getAttribute("aria-disabled");
	}
	//get DStat aria-disabled attr value
	public String getDStat_Attr(){
		return obj.findElement(dStat).getAttribute("aria-disabled");
	}
	//get ChRemoteState aria-disabled attr value
	public String getChRemoteState_Attr(){
		return obj.findElement(chRemoteState).getAttribute("aria-disabled");
	}
	//get DInterruptedAirSwitch aria-disabled attr value
	public String getDInterruptedAirSwitch_Attr(){
		return obj.findElement(dInterruptedAirSwitch).getAttribute("aria-disabled");
	}
	//get ChRemoteState aria-disabled attr value
	public String getDRolloutSwitch_Attr(){
		return obj.findElement(dRolloutSwitch).getAttribute("aria-disabled");
	}
	//get ChRemoteState aria-disabled attr value
	public String getAlarm_Attr(){
		return obj.findElement(alarm).getAttribute("aria-disabled");
	}
	//get SafetyRelay aria-disabled attr value
	public String getSafetyRelay_Attr(){
		return obj.findElement(safetyRelay).getAttribute("aria-disabled");
	}
	//get dhwRemoteStat aria-disabled attr value
	public String getDhwRemoteStat_Attr(){
		return obj.findElement(dhwRemoteStat).getAttribute("aria-disabled");
	}
	//get ChRemoteState aria-disabled attr value
	public String getPm_Attr(){
		return obj.findElement(pm).getAttribute("aria-disabled");
	}
	
	
	//Click Diagnostic Tests Btn
	public void clickDiagnosticTestsBtn(){
		 obj.findElement(diagnosticTestsBtn).click();
	}
	//Click Analog IO Btn
	public void clickAnalogIOBtn(){
		 obj.findElement(analogIOBtn).click();
	}
	
	
	
	
}
