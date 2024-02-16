package week4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Snapdeal_Action {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.snapdeal.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        
        WebElement allcata = driver.findElement(By.xpath("//span[@class='catText']"));
		Actions builder =new Actions(driver);
		builder.moveToElement(allcata).perform();
		
	    WebElement sportsshoe = driver.findElement(By.xpath("(//span[text()='Sports Shoes'])[1]"));
			Actions builder1 =new Actions(driver);
			builder1.moveToElement(sportsshoe).click().perform();
			String count = driver.findElement(By.xpath("(//div[@class='child-cat-count '])[1]")).getText();
			System.out.println("The shoes count is:"+count);
			driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
			driver.findElement(By.xpath("//span[text()='Sort by:']")).click();
			driver.findElement(By.xpath("(//li[@class='search-li'])[1]")).click();
			WebElement from = driver.findElement(By.xpath("//input[@name='fromVal']"));
			Thread.sleep(3000);
			WebElement to = driver.findElement(By.xpath("//input[@name='toVal']"));
			Actions action = new Actions(driver);
			//action.dragAndDrop(from  , to).build().perform();
			
			action.dragAndDropBy(from, 100, 0).build().perform();
			action.dragAndDropBy(to, 50, 0).build().perform();
			driver.findElement(By.xpath("//label[@for='Color_s-White & Blue']")).click();
			 WebElement quickview = driver.findElement(By.xpath("(//div[@class='clearfix row-disc'])[1]"));
			Actions builder2 =new Actions(driver);
			builder2.moveToElement(quickview).click().perform();
			Thread.sleep(3000);
			String discount = driver.findElement(By.xpath("(//span[@class='lfloat product-desc-price strike '])[1]")).getText();
			System.out.println("The discount is:"+discount);
			Thread.sleep(3000);
			String cost = driver.findElement(By.xpath("(//span[@class='lfloat product-price'])[1]")).getText();
			System.out.println("The Rate of the shoe is:"+cost);
			driver.close();
	}

}
