package basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RahulshettyDriverMethods {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		
		driver.findElement(By.xpath("//*[@id=\"radio-btn-example\"]/fieldset/label[3]/input")).click();
		
		
		
		driver.findElement(By.id("checkBoxOption1")).click();
        driver.findElement(By.id("checkBoxOption3")).click();
        
        
     

	}

}
