package StepObject;



import PageObject.LoginPage;
import org.openqa.selenium.WebDriver;

public class LoginStep extends LoginPage {

     WebDriver driver;
     public LoginStep(WebDriver driver1){
         driver = driver1;

     }

    public void emailInput (String s){
        driver.findElement(email).sendKeys(s);
    }
     public void passwordInput (String s){
        driver.findElement(password);
    }
     public void Button(){
        driver.findElement(loginButton).click();
     }

}

