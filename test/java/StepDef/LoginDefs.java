package StepDef;

import config.env;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginDefs extends env {
    @Given("User accessed the website url https:\\/\\/www.saucedemo.com\\/")
    public void userAccessedTheWebsiteUrlHttpsWwwSaucedemoCom() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(WebURL);
    }

    @When("User entered registered username")
    public void userEnteredRegisteredUsername() {
        driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
    }

    @And("User entered registered password")
    public void userEnteredRegisteredPassword() {
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
    }

    @And("User press login button")
    public void userPressLoginButton() {
        driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
    }

    @Then("User successfully login")
    public void userSuccessfullyLogin() {
        driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span[contains(text(),'Products')]"));
        driver.quit();
    }



    @And("User entered unregistered password")
    public void userEnteredUnregisteredPassword() {
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("s3cr3t_sauce");
    }

    @Then("User getting error message")
    public void userGettingErrorMessage() {
        driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3[contains(text(),'Epic sadface: Username and password do not match any user in this service')]"));
        driver.quit();
    }



    @When("User entered uregistered username")
    public void userEnteredUregisteredUsername() {
        driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standarUser");
    }

    @Then("User failed to login")
    public void userFailedToLogin() {
        driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3[contains(text(),'Epic sadface: Username and password do not match any user in this service')]"));
        driver.quit();
    }

}
