package week3.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browserlanuch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoCsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.partialLinkText("Create")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Wipro");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Aathimuthu");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("T");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Lovelyaathi");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Tutycorin");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Tuty");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Assignment");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Developer");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("4.0LPA");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("15"); 
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("4455");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("nothing");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Software Tester Engineer");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("No");
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("+91");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("04639");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9789112678");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Lovely");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("%%%");
	    driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("aathimuthu@gmail.com");
	    driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("http://leaftaps.com/crmsfa/control/createLeadForm");
	    driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("aathi");
	    driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Manager of Wipro");
	    driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("Anukulapuram");
	    driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Kulasekarapatinam");
	    driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Tuticorin");
	    driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("628206");
	    driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("628206");
	    driver.findElement(By.name("submitButton")).click();
	    

	}

}

