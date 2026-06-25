package LearnHandlingMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWebtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://vinothqaacademy.com/webtable/");
		
	    WebElement tablename = driver.findElement(By.xpath("//table[@id='myTable']//tr[3]/td[2]"));
	    
	    System.out.println(tablename.getText());
	    
	     List<WebElement> allname = driver.findElements(By.xpath("//table[@id='myTable']//tr/td[2]"));
	    
	     for (int i=0;i<allname.size();i++) {
	    	 
	    	 System.out.println(allname.get(i).getText());
	    	 
	     }
	     List<WebElement> allnamerow = driver.findElements(By.xpath("//table[@id='myTable']//tr[3]/td"));
	     for (int i =0;i<allnamerow.size();i++) {
	    	 System.out.println(allnamerow.get(i).getText());
	     }
	     
	    driver.close();

	}

}
