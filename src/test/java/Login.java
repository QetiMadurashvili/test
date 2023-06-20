import Browser.ChromeRunner;
import StepObject.LoginStep;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



import static DataObject.LoginData.*;

public class Login extends ChromeRunner {

    @Test

    public void invalidEmailData() throws InterruptedException {

        LoginStep step1 = new LoginStep(ChromeRunner.driver);
        step1.emailInput(invalidEmailData);
        step1.passwordInput(invalidPasswordData);
        step1.Button();
        Thread.sleep(5000);

    }

    @Test

    public void correctEmailData() throws InterruptedException {

        LoginStep step2 = new LoginStep(ChromeRunner.driver);
        step2.emailInput(correctEmailData);
        step2.passwordInput(invalidPasswordData);
        step2.Button();
        Thread.sleep(5000);


    }

}


