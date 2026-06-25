package LearnWebelementFetchValue;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fetchvalues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		
		WebElement elements = driver.findElement(By.xpath("//div[contains(@class,'login_logo')]"));
		
		if(elements.isDisplayed()) {
			System.out.println("element is displayed");
			
		}
		else {
			System.out.println("element is not displayed");
			
		}
	    String actualtext=elements.getText();
	    System.out.println(actualtext);
	    
	   String  actualtagname=elements.getTagName();
	   System.out.println(actualtagname);
	   
	   String actualattribute= elements.getAttribute("class");
	   System.out.println(actualattribute);
	   
	   String actualCssprop = elements.getAttribute("font-family");
	   System.out.println(actualCssprop);
	   
	   Dimension actualsize = elements.getSize();	
	   int actualwidth = actualsize.getWidth();
	   int actualheight = actualsize.getHeight(); 
	   System.out.println(actualsize);
	   System.out.println(actualwidth);
	   System.out.println(actualheight);
	   
	   Point actuallocation = elements.getLocation();
	   System.out.println(actuallocation);
	   
	   int actuallocationX = elements.getLocation().getX();
	   int actuallocationY = actuallocation.getY();
	   
	   System.out.println(actuallocationX);
	   System.out.println(actuallocationY);
	   
	    
	    
		

	}

}
