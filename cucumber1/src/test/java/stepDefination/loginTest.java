package stepDefination;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class loginTest {
	public static WebDriver driver;
	pageobjects po;

	@Given("^Navigate to home page$")
	public void navigatetohomepage() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		po = new pageobjects(driver);
	}

	@When("^user enter username and passwsord$")
	public void userenterUnameAndPswd() throws Throwable {
		po.signin.click();
		po.username.sendKeys("lalitha");
		po.password.sendKeys("Password123");
		po.login.click();
	}

	@Then("^user logged in succesfully$")
	public void successfullyLogin() throws Throwable {
		System.out.println("user login successfully");
	}

	@When("^larry searches below products in search box:$")
	public void larrysearchesbelowproductsinsearchbox(DataTable dt) {
		List<String> product = dt.asList(String.class);
		for (String s : product) {
			driver.findElement(By.name("products")).sendKeys(s);
			driver.findElement(By.xpath("//input[@value='FIND DETAILS']")).click();
			driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
			driver.findElement(By.xpath("//*[@href='displayCart.htm']")).click();
			//driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]")).click();
			driver.findElement(By.xpath("/html/body/header/div/b/a[1]")).click();
		}

	}
	@When("^i enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enterunamepwd123(String uname, String pwd) {
		po.signin.click();
		po.username.sendKeys(uname);
		po.password.sendKeys(pwd);
		po.login.click();
		
	}

	@Then("^product should be added in the cart if available$")
	public void productshouldbeaddedinthecartifavailable() {

	}

}
