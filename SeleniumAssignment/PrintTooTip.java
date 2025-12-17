package SeleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintToolTip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();

	        
	        driver.get("https://www.google.com");

	        
	        WebElement searchButton = driver.findElement(By.className("gLFyf"));

	       
	        String tooltipText = searchButton.getAttribute("title");

	        System.out.println("Tooltip text is: " + tooltipText);

	        //driver.quit();

	}

}
