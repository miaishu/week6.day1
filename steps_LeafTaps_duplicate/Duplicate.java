package steps_LeafTaps_duplicate;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Duplicate extends BaseClass{
	@Given("Enter Username as {string}")
	public void userName(String uname) {
	driver.findElement(By.id("username")).sendKeys(uname);
	}

	@Given("Enter Password as {string}")
	public void passWord(String pword) {
		driver.findElement(By.id("password")).sendKeys(pword);	
	}
	@Then ("Click on Login")
	public void login() {
		driver.findElement(By.className("decorativeSubmit")).click();
		}

	@Then("Click on {string}")
	public void select(String value) {
		driver.findElement(By.linkText(value)).click();
		}
	@When("Verify {string} page")
	public void verify(String title) {
	boolean displayed = driver.findElement(By.linkText(title)).isDisplayed();	
	//Assert.assertTrue(displayed);
		}
	
	@Then ("Click Phone")	
	public void mobno() {
		//driver.findElement(By.xpath("//span[text()=Phone]")).click();
		driver.findElement(By.linkText("Phone")).click();
		}

	@Given("Enter {string}")
	public void enterno(String no) throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(no);
		Thread.sleep(2000);
	}

	@Then("Click first data")
	public void firstData() {
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	}

	@Then("Click the submitButton")
	public void submit1() {
	driver.findElement(By.name("submitButton")).click();
	}
	
	
}
		
		