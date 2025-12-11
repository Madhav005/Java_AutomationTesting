package implicit_explicit;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExplicitWait {
  @Test
  public void doExplicitWait() {
	  ChromeOptions options=new ChromeOptions();
	  options.addArguments("--disable-notifications");
	  
	  WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.easemytrip.com/");
		//Thread.sleep(5000);// to wait for 5sec ( shouln't use thread since it takes more secs for more testcases,the thing is to reduce time thats why using automation so no thread is used)
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(100));
		
		driver.findElement(By.id("FromSector_show")).click();
		driver.findElement(By.id("a_FromSector_show")).sendKeys("Beng");
		
		//explicit wait for element
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("spnBengaluru")));
		
		driver.findElement(By.id("spnBengaluru")).click();
  }
}
