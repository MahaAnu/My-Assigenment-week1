package week3.homeass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Button_Interaction {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/button.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[1]")).click();
		//System.out.println(driver.getTitle());
     boolean enabled = driver.findElement(By.xpath("//div[@class='card']")).isEnabled();
     System.out.println(enabled);
     WebElement ele = driver.findElement(By.xpath("//span[text()='Save']"));
     System.out.print(ele.getCssValue("color"));
     WebElement postion = driver.findElement(By.xpath("(//span[text()='Submit'])[1]"));
     
     Point location = postion.getLocation();
     System.out.println(location.getX());
     System.out.println(location.getY());
     
     driver.findElement(By.xpath("//span[text()='Image']")).click();
     
		

	}

}
