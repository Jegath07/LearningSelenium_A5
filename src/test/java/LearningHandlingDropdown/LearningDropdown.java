package LearningHandlingDropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearningDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30l));

		driver.get("file:///C:/Users/Acer/Downloads/EmbededWebpage.html");
		
		WebElement countrydropdown = driver.findElement(By.cssSelector("select[name='country2']"));
		
		WebElement countrydropdown1 = driver.findElement(By.cssSelector("select[name='country1']"));
		
		
		Select selectobj = new Select(countrydropdown);
		
		boolean state = selectobj.isMultiple();
		
		if(state) {
			System.out.println("it's multiple dropdown");
		}
		else{
			System.out.println("it's single dropdown");
		}
		
		selectobj.selectByIndex(3);
		selectobj.selectByContainsVisibleText("US");
		selectobj.selectByValue("ind");
		selectobj.getAllSelectedOptions();
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
	}

}
