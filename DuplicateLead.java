package week2.day1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;


public class DuplicateLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		WebElement elementUsername = driver.findElement(By.id("username"));
		elementUsername.sendKeys("Demosalesmanager");
		WebElement elementPassword = driver.findElement(By.id("password"));
		elementPassword.sendKeys("crmsfa");
		WebElement elementLoginButton = driver.findElement(By.className("decorativeSubmit"));
		elementLoginButton.click();
		WebElement elementCRMSFA = driver.findElement(By.linkText("CRM/SFA"));
		elementCRMSFA.click();
		WebElement elementLeads = driver.findElement(By.linkText("Leads"));
		elementLeads.click();
		WebElement elementCreateLead = driver.findElement(By.linkText("Create Lead"));
		elementCreateLead.click();
		WebElement elementCompanyName = driver.findElement(By.id("createLeadForm_companyName"));
		elementCompanyName.sendKeys("Sutherland Global Services");
		WebElement elementFirstName = driver.findElement(By.id("createLeadForm_firstName"));
		elementFirstName.sendKeys("Sankar Kumar");
		WebElement elementLastName = driver.findElement(By.id("createLeadForm_lastName"));
		elementLastName.sendKeys("S");
		
		
		WebElement elementFirstNamelocal = driver.findElement(By.id("createLeadForm_firstNameLocal"));
		elementFirstNamelocal.sendKeys("XYZ");
		WebElement elementDepartmentName = driver.findElement(By.id("createLeadForm_departmentName"));
		elementDepartmentName.sendKeys("General Service Company");
		WebElement elementDescription = driver.findElement(By.id("createLeadForm_description"));
		elementDescription.sendKeys("Service Based Company");
		WebElement elementPrimaryEmail = driver.findElement(By.id("createLeadForm_primaryEmail"));
		elementPrimaryEmail.sendKeys("xyz@gmail.com");
		
		WebElement elementStateProvince = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dd = new Select(elementStateProvince);
		dd.selectByVisibleText("New York");
		
		WebElement elementCreateLeadButton1 = driver.findElement(By.className("smallSubmit"));
		elementCreateLeadButton1.click();
		
		System.out.println("Title of Resulting Page is :" + driver.getTitle());
		
		WebElement elementDuplicateButton = driver.findElement(By.linkText("Duplicate Lead"));
		elementDuplicateButton.click();
		
		WebElement elementCompanyNameClear = driver.findElement(By.id("createLeadForm_companyName"));
		elementCompanyNameClear.clear();
		
		WebElement elementRenameCompanyName = driver.findElement(By.id("createLeadForm_companyName"));
		elementRenameCompanyName.sendKeys("Sutherland Global Services");
		
		WebElement elementFirstNameClear = driver.findElement(By.id("createLeadForm_firstName"));
		elementFirstNameClear.clear();
		
		WebElement elementRenameFirstName = driver.findElement(By.id("createLeadForm_firstName"));
		elementRenameFirstName.sendKeys("Sankar Kumar");

		WebElement elementDupCreateLeadButton2 = driver.findElement(By.className("smallSubmit"));
		elementDupCreateLeadButton2.click();
		
		System.out.println("Title of Resulting Page is :" + driver.getTitle());


	}

}
