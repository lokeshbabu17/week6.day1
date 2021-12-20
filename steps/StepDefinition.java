package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {
	public ChromeDriver driver;
	@Given("open the chrome browser")
	public void openBrowser1()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}
	@Given("Load the application url")
	public void LoadApplicationurl()
	{
		driver.get("http://leaftaps.com/opentaps");
	}
	@Given("Enter the username as {string}")
	public void enterUserName(String uName)
	{
		driver.findElement(By.id("username")).sendKeys(uName);
		
	}
	@Given("Enter the password as {string}")
	public void enterPassword(String pass)
	{
		driver.findElement(By.id("password")).sendKeys(pass);
		
	}
	@When("CLick on Login button")
	public void clickLogin()
	{
		driver.findElement(By.className("decorativeSubmit")).click();
		
	}
	@Then("Homepage should be displayed")
	public void openBrowser()
	{
		String text = driver.getTitle();
		System.out.println(text);
		
	}
	@But("error message should be displayed")
	public void verifyerrorMessage() {
		System.out.println("error message is displayed");
	}

	@When("click on CRMSFA")
	public void click_on_crmsfa() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		   
	}
	@When("click on Leads")
	public void click_on_leads() {
		driver.findElement(By.linkText("Leads")).click();
		
	}
	@When("click  on create lead")
	public void click_on_create_lead() {
		driver.findElement(By.linkText("Create Lead")).click();
		
	}
	@Given("type company name")
	public void type_company_name() {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		
	}
	@Given("type first name")
	public void type_first_name() {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("lokesh");
		
	}
	@Given("type last name")
	public void type_last_name() {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("babu");
		 
	}
	@When("click create lead button")
	public void click_create_lead_button() {
		driver.findElement(By.name("submitButton")).click();
		
	}
	@When("click on FindLeads")
	public void click_on_find_leads() {
		driver.findElement(By.linkText("Find Leads")).click();
		
	}
	@When("click on Pnone")
	public void click_on_pnone() {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		  
	}
	@Given("Enter the number")
	public void enter_the_number() {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9");
		   
	}
	@When("click on FindLeads Button")
	public void ClickFindLeads() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
	}

@Given("Enter the given number")
public void enter_the_given_number() {
	driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("99");
   
}
@When("CLick")
public void c_lick() {
	driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	
}
@When("Click on DuplicateLead")
public void click_on_duplicate_lead() {
	driver.findElement(By.linkText("Duplicate Lead")).click();
	
}
@When("Click on Submit")
public void click_on_submit() {
	driver.findElement(By.name("submitButton")).click();
	
}

	}