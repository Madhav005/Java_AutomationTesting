package implicit_explicit;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ImplicitWaitTest {
  @Test
  public void doImplicitWait() {
	  WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.advantageonlineshopping.com/#/");
			//Thread.sleep(5000);// to wait for 5sec ( shouln't use thread since it takes more secs for more testcases,the thing is to reduce time thats why using automation so no thread is used)
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			String text=driver.findElement(By.id("speakersTxt")).getText();
			System.out.println(text);
  }
}
