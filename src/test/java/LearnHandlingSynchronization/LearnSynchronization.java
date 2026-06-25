package LearnHandlingSynchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnSynchronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30l));
        
        driver.get(" https://www.shoppersstack.com/");
        
        WebElement title = driver.findElement(By.xpath("//h3"));
        
        System.out.println(title.getText());
        
        
        
        WebElement login = driver.findElement(By.cssSelector("#loginBtn"));
        
        login.click();
        
        
        
        driver.close();
        
        
	}

}
