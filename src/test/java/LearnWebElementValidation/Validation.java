package LearnWebElementValidation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.WebElementToJsonConverter;

public class Validation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://automationexercise.com/");
		
		System.out.println("Home page title is  "+driver.getTitle());
		
		WebElement  Signup = driver.findElement(By.partialLinkText("Log"));
		
		Signup.click();
		
		System.out.println("Home page title is  "+driver.getTitle());
		
		WebElement name= driver.findElement(By.xpath("//input[@type='text']"));
		
		name.sendKeys("vijay");
		
		WebElement Email= driver.findElement(By.xpath("//input [@data-qa='signup-email']"));
		
		Email.sendKeys("vijay1285445994@gmail.com");
		
		WebElement sign = driver.findElement(By.xpath("//button[text()='Signup']"));
		
		sign.click();
		
		System.out.println("Home page title is  "+driver.getTitle());
		
		WebElement select = driver.findElement(By.xpath("//input[@value='Mr']"));
		
		select.click();
		
		WebElement pass = driver.findElement(By.xpath("//input[contains(@data-qa,'pass')]"));
		
		pass.sendKeys("abcd4525");
		
		System.out.println(Email);
		
		
		WebElement radiobtn = driver.findElement(By.cssSelector("#id_gender1"));
		
		radiobtn.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
