package week1.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Lead {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		//click on leads
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Test Leaf");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Anusuya");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Mahadevan");
		driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("Arts");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Am arts");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("happy@gamil.com");
		
		WebElement element = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select drp = new Select(element);
		drp.selectByVisibleText("New York");
		
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.className("subMenuButton")).click();
		driver.findElement(By.id("createLeadForm_description")).clear();
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Edit the lead");
		driver.findElement(By.name("submitButton")).click();
		
	}

}
