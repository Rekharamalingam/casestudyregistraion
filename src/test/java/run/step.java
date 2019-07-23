package run;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class step {
	WebDriver driver;
	@Given("open browser")
	public void open_browser() {
	   System.setProperty("webdriver.chrome.driver", "C:\\Selium 3.0\\Selium 3.0\\chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.get("http://10.232.237.143:443/TestMeApp/RegisterUser.htm");
	}

	@And("enter username {string}")
	public void enter_username(String un) {
	    driver.findElement(By.name("userName")).sendKeys(un);
	}

	@And("enter firstname {string}")
	public void enter_firstname(String fname) {
	   driver.findElement(By.name("firstName")).sendKeys(fname);
	}

	@And("enter lastname {string}")
	public void enter_lastname(String lname) {
		 driver.findElement(By.name("lastName")).sendKeys(lname);
	}

	@And("enter password {string}")
	public void enter_password(String pwd) {
	    driver.findElement(By.name("password")).sendKeys(pwd);
	}

	@And("Enter confirm password {string}")
	public void enter_confirm_password(String cpwd) {
		 driver.findElement(By.name("confirmPassword")).sendKeys(cpwd);
	}

	@And("Enter gender female")
	public void enter_gender_female() {
		List <WebElement> allradio= driver.findElements(By.name("gender"));
		allradio.get(1).click();
	}

	@And("enter email {string}")
	public void enter_email(String email) {
		 driver.findElement(By.name("emailAddress")).sendKeys(email);
	}

	@And("mobile number {string}")
	public void mobile_number(String num) {
		 driver.findElement(By.name("mobileNumber")).sendKeys(num);
	}

	@And("DOB {string}")
	public void dob(String dob) {
		 driver.findElement(By.name("dob")).sendKeys(dob);
	}

	@And("Address {string}")
	public void address(String addr) {
		 driver.findElement(By.name("address")).sendKeys(addr);
	}

	@And("choose security question")
	public void choose_security_question() {
	   WebElement dropdown=driver.findElement(By.name("securityQuestion"));
	   Select s=new Select(dropdown);                           
		s.selectByIndex(1);	
	}

	@Then("type {string}")
	public void type(String blue) {
		driver.findElement(By.name("answer")).sendKeys(blue);
		driver.findElement(By.name("Submit")).click();
	}
}
