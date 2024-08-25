package StepDef;

import base.config;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

public class SignUpFeature extends config {
    Faker f=new Faker();
    @Given("Customer at BestBuy Homepage")
    public void customerAtBestBuyHomepage() {
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div[2]/a[2]")).click();
        String exp="Best Buy | Official Online Store | Shop Now & Save";
        String act=driver.getTitle();
        Assert.assertEquals(act,exp);
    }

    @And("Customer click Account button")
    public void customerClickAccountButton() {
        driver.findElement(By.xpath("//*[@id='account-menu-account-button']/span")).click();
    }

    @And("Customer click on Create Account")
    public void customerClickOnCreateAccount() {
        driver.findElement(By.linkText("Create Account")).click();
    }

    @And("Customer enter the firstName")
    public void customerEnterTheFirstName() {
        driver.findElement(By.xpath("//*[@id='firstName']")).sendKeys("Jannatul");
    }

    @And("Customer enter the LastName")
    public void customerEnterTheLastName() {
        driver.findElement(By.xpath("//*[@id='lastName']")).sendKeys("Mawya");
    }

    @And("Customer enter their email")
    public void customerEnterTheirEmail() {
       // String random=f.internet().emailAddress();
        driver.findElement(By.xpath("//*[@id='email']")).sendKeys("jmawya07@gmail.com");
    }

    @And("Customer enter their Password")
    public void customerEnterTheirPassword() {
        driver.findElement(By.xpath("//*[@id='fld-p1']")).sendKeys("Test12345@");
    }

    @And("Customer enter their confirm password")
    public void customerEnterTheirConfirmPassword() {
        driver.findElement(By.xpath("//*[@id='reenterPassword']")).sendKeys("Test12345@");
    }

    @And("Customer enter their Telephone")
    public void customerEnterTheirTelephone() {
        driver.findElement(By.xpath("//*[@id='phone']")).sendKeys("9293318658");

        driver.findElement(By.xpath("//*[@id='is-recovery-phone']")).click();
    }

    @When("customer click on create account button from sign up page")
    public void customerClickOnCreateAccountButtonFromSignUpPage() {

        driver.findElement(By.xpath("/html/body/div[1]/div/section/main/div[2]/div/div/div[1]/div/div/div/div/div/form/div[8]/button")).click();
    }
}
