package LearningFetchElement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchWindowAddress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		String Parentaddress = driver.getWindowHandle();
		System.out.println(Parentaddress);
		driver.navigate().refresh();
		System.out.println(driver.getWindowHandle());
		//driver.switchTo().newWindow(WindowType.WINDOW);
        driver.close();
	}

}
