package LearningHandlingJScode;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningJScode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         WebDriver driver = new ChromeDriver();
         
         driver.manage().window().maximize();
         
         JavascriptExecutor jseobj = (JavascriptExecutor)driver;
         
         jseobj.executeScript("window.location = arguments[0]", "https://automationexercise.com/");
         
         jseobj.executeScript("history.go[0]");
         
         System.out.println( jseobj.executeScript("return document.title"));
         
         System.out.println( jseobj.executeScript("return document.URL"));
         
         jseobj.executeScript("aruguments[0].click",driver.findElement(By.partialLinkText("Log")));
         
         jseobj.executeScript("aruguments[0].value='living'",driver.findElement(By.name("name")));
         
         jseobj.executeScript("aruguments[0].value='living@gmail.com'",driver.findElement(By.xpath("//input[@data-qa='signup-email']")));
         
         jseobj.executeScript("aruguments[0].click",driver.findElement(By.xpath("//button[text()='Signup']")));
         
         
         
         
         
         
         
         
         
         
	}

}
