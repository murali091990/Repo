package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DetailsObjects {
private static WebDriver obj=null;
	
	public DetailsObjects(WebDriver obj){
		DetailsObjects.obj=obj;
	}
	
	By outletTemp=By.xpath("//*[@id='content']/div/div/div[1]/div[1]/ms-widget/ms-widget-front/div");
	
	By dhwEnable=By.xpath("//*[@id='content']/div/div/div[2]/div[2]/div[2]");
	By status=By.xpath("//*[@id='content']/div/div/div[2]/div[3]/div[2]");
	By demandSource=By.xpath("//*[@id='content']/div/div/div[2]/div[4]/div[2]");
	By burnerDemand=By.xpath("//*[@id='content']/div/div/div[2]/div[5]/div[2]");
	By heatDemand=By.xpath("//*[@id='content']/div/div/div[2]/div[6]/div[2]");
	By requestedRate=By.xpath("//*[@id='content']/div/div/div[2]/div[7]/div[2]");
	By setpointSource=By.xpath("//*[@id='content']/div/div/div[2]/div[8]/div[2]");
	By offSetpoint=By.xpath("//*[@id='content']/div/div/div[2]/div[9]/div[2]");
	By setpoint=By.xpath("//*[@id='content']/div/div/div[2]/div[10]/div[2]");
	By onSetpoint=By.xpath("//*[@id='content']/div/div/div[2]/div[11]/div[2]");
	By operatingTemperature=By.xpath("//*[@id='content']/div/div/div[2]/div[12]/div[2]");
	By dhwPump=By.xpath("//*[@id='content']/div/div/div[2]/div[13]/div[2]");
	By dhwPumpOverrunTime=By.xpath("//*[@id='content']/div/div/div[2]/div[14]/div[2]");
	By dhwPumpFrostOverrunTime=By.xpath("//*[@id='content']/div/div/div[2]/div[15]/div[2]");
	By dhwPriorityOverrideTime=By.xpath("//*[@id='content']/div/div/div[2]/div[16]/div[2]");
	
	By diagnosticsBtn=By.xpath("//*[@id='content']/section/button[1]");
	By historyBtn=By.xpath("//*[@id='content']/section/button[2]");
	By analysisBtn=By.xpath("//*[@id='content']/section/button[3]");
	
	//get outlet tem value
	public String getOutletTemp(){
		return obj.findElement(outletTemp).getText();
	}
	
	//get all fields values from DHW
	public String getDhwEnable(){
		return obj.findElement(dhwEnable).getText();
	}
	public String getStatus(){
		return obj.findElement(status).getText();
	}
	public String getDemandSource(){
		return obj.findElement(demandSource).getText();
	}
	public String getBurnerDemand(){
		return obj.findElement(burnerDemand).getText();
	}
	public String getHeatDemand(){
		return obj.findElement(heatDemand).getText();
	}
	public String getRequestedRate(){
		return obj.findElement(requestedRate).getText();
	}
	public String getSetpointSource(){
		return obj.findElement(setpointSource).getText();
	}
	public String getOffSetpoint(){
		return obj.findElement(offSetpoint).getText();
	}
	public String getSetpoint(){
		return obj.findElement(setpoint).getText();
	}
	public String getOnSetpoint(){
		return obj.findElement(onSetpoint).getText();
	}
	public String getOperatingTemperature(){
		return obj.findElement(operatingTemperature).getText();
	}
	public String getDhwPump(){
		return obj.findElement(dhwPump).getText();
	}
	public String getDhwPumpOverrunTime(){
		return obj.findElement(dhwPumpOverrunTime).getText();
	}
	public String getDhwPumpFrostOverrunTime(){
		return obj.findElement(dhwPumpFrostOverrunTime).getText();
	}
	public String getDhwPriorityOverrideTime(){
		return obj.findElement(dhwPriorityOverrideTime).getText();
	}
	
	//click diagnostic button
	public void clickDiagnosticsBtn(){
		obj.findElement(diagnosticsBtn).click();
	}
	//click history button
	public void clickHistoryBtn(){
		obj.findElement(historyBtn).click();
	}
	//click analysis button
	public void clickAnalysisBtn(){
		obj.findElement(analysisBtn).click();
	}
	
	
	
	
}
