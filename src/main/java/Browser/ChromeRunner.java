package Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class ChromeRunner {
   public static WebDriver driver = new ChromeDriver();
    @BeforeTest
    public void openChrome(){
     driver.manage().window().maximize();
     driver.get("https://www.facebook.com/");
    }

    @AfterTest
    public void closeChrome(){
        driver.close();
    }
}
