package week4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Frame {

	public static void main(String[] args) throws InterruptedException {
		
			
		ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        
        driver.switchTo().frame(1);//switch the driver control
        driver.findElement(By.xpath("//button[text()='Try it']")).click();
        
        Alert alert = driver.switchTo().alert();
        String msg = alert.getText();
       alert.accept();
       System.out.println(msg);
driver.close();
	}

}
