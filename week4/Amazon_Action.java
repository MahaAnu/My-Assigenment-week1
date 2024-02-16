package week4;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_Action {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("(//input[@class='nav-input nav-progressive-attribute'])[2]")).click();
        String text = driver.findElement(By.xpath("  //span[@class='a-price-whole']")).getText();
        System.out.println(text);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        
        WebElement rateing = driver.findElement(By.xpath("(//i[contains(@class,'popover')])[1]"));
        Actions builder1 =new Actions(driver);
		builder1.moveToElement(rateing).click().perform();
		String ratingcount = driver.findElement(By.xpath("(//span[@class='a-size-base s-underline-text'])[1]")).getText();
		System.out.println(ratingcount);
		
		String linktext = driver.findElement(By.xpath("(//span[contains(text(),'OnePlus')])[4]")).getText();
		System.out.println(linktext);
		driver.findElement(By.xpath("(//span[contains(text(),'OnePlus')])[4]")).click();
		
		
		
		
		
    
       

	}

}
