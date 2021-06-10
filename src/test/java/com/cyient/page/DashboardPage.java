package com.cyient.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashboardPage {
	private By patientClientLocator=By.xpath("//div[text()='Patient/Client']");
	private By patientsLocator=By.xpath("//div[text()='Patients']");
	private By logoutLocator=By.xpath("//li[text()='Logout']");

	private WebDriver driver;

	public DashboardPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void waitForLogoutPresence()
	{
		WebDriverWait wait=new WebDriverWait(driver,50);
		wait.until(ExpectedConditions.presenceOfElementLocated(logoutLocator));
	}

	public String getDashboardPageTitle()
	{
		return driver.getTitle().trim();
	}
	
	
	public void mousehoverOnPatientClient()
	{
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(patientClientLocator)).perform();
	}
	
	public void clickOnPatients()
	{
		driver.findElement(patientsLocator).click();
	}

}
