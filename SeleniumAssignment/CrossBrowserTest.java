import java.util.Scanner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrossBrowserTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        WebDriver driver = null;

   
        System.out.print("Enter Browser Name (Chrome / Firefox / Edge): ");
        String browser = sc.nextLine();

    
        if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } 
        else if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } 
        else if (browser.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        } 
        else {
            System.out.println("Invalid browser name");
            sc.close();
            return;
        }

        driver.get("https://www.wikipedia.org");
        driver.manage().window().maximize();

        driver.quit();
        sc.close();
    }
}
