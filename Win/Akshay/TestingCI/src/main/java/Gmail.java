import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail
{
    public static void main(String[] args) {
        // Create a new instance of the html unit driver
        // Notice that the remainder of the code relies on the interface, 
        // not the implementation.
        WebDriver driver = null;
        try{

            System.setProperty("webdriver.chrome.driver", "C:\\Eclipse Automation\\chrome prerequisites\\chromedriver.exe");

            driver = new ChromeDriver();

            // And now use this to visit Google
            driver.get("http://www.gmail.com");
            WebElement element = driver.findElement(By.id("Email"));
            element.sendKeys("connectwithme11@gmail.com");
            driver.findElement(By.id("next")).click();
        /*driver.findElement(By.id("Passwd")).sendKeys("Akshay11");
        driver.findElement(By.id("signIn")).click();
        driver.navigate().to("https://www.google.co.in/intl/en/options/");*/
            driver.navigate().back();
            driver.quit();
        }
        catch(Exception e)
        {
            driver.quit();
        }
    }
}