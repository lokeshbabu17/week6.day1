package week6.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Createlead {
	public ChromeDriver driver;
	@Given("open the chrome browser")
	public void open_the_chrome_browser() {
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	@Given("Load the application url")
	public void load_the_application_url() {
		driver.get("http://leaftaps.com/opentaps/");
	}
	@Given("Enter the username as {string}")
	public void enter_the_username_as(String Uname) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys(Uname);
	}
	@Given("Enter the password as {string}")
	public void enter_the_password_as(String Upass) {
		driver.findElement(By.id("password")).sendKeys(Upass);
	}
	@When("click on login button")
	public void click_on_login_button() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	@Then("homepage should be displayed")
	public void homepage_should_be_displayed() {
	   String title = driver.getTitle();
	   if (title.equals("LeafTaps-TestLeaf Automation Platform")) {
		   System.out.println("homepage login succesfully");
	}else
		System.out.println("homepage login unsuccesfully");
	}
	@Given("click on CRM\\/SFA")
	public void click_on_crm_sfa() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
	@Then("my home is displayed")
	public void my_home_is_displayed() {
		  String title = driver.getTitle();
		   if (title.equals("My Home | opentaps CRM")) {
			   System.out.println("home login succesfully");
		}else
			System.out.println("home login unsuccesfully");
		}
	
	@Given("click on leads")
	public void click_on_leads() {
		driver.findElement(By.linkText("Leads")).click();
	}
	@Then("leads page is displayed")
	public void leads_page_is_displayed() {
		  String title = driver.getTitle();
		   if (title.equals("My Lead | opentaps CRM")) {
			   System.out.println("leadpage login succesfully");
		}else
			System.out.println("leadpage login unsuccesfully");
		}
	
	@Given("click on createLead")
	public void click_on_create_lead() {
		driver.findElement(By.linkText("Create Lead")).click();
	}
	@Then("createLead page is displayed")
	public void create_lead_page_is_displayed() {
		  String title = driver.getTitle();
		   if (title.equals("My CreateLead | opentaps CRM")) {
			   System.out.println("createleadpage login succesfully");
		}else
			System.out.println("createleadpage login unsuccesfully");
		}
	
	@Given("Enter the companyname as naveen")
	public void enter_the_companyname_as_naveen() {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
	}
	@Given("Enter the firstname as hari")
	public void enter_the_firstname_as_hari() {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hari");
	}
	@Given("Enter the lastname as r")
	public void enter_the_lastname_as_r() {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
		
	}
	@Given("click on createlead")
	public void click_on_createlead() {
		driver.findElement(By.name("submitButton")).click();
	}
	@Then("viewlead page is displayed")
	public void viewlead_page_is_displayed() {
		  String title = driver.getTitle();
		   if (title.equals("My ViewLead | opentaps CRM")) {
			   System.out.println("viewleadpage login succesfully");
		}else
			System.out.println("viewleadpage login unsuccesfully");
		}
	
	@Given("click on findlead")
	public void click_on_findlead() {
		driver.findElement(By.linkText("Find Leads")).click();
	}
	@Then("FindLead page is displayed")
	public void find_lead_page_is_displayed() {
		  String title = driver.getTitle();
		   if (title.equals("My FindLead | opentaps CRM")) {
			   System.out.println("findleadpage login succesfully");
		}else
			System.out.println("findleadpage login unsuccesfully");
		}
	
	@Given("click on phonenumber")
	public void click_on_phonenumber() {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
	}
	@Given("Enter thre phonenumber as {int}")
	public void enter_thre_phonenumber_as(Integer int1) {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9");
	}
	@Then("Get leadid text")
	public void get_leadid_text() throws InterruptedException {
		Thread.sleep(2000);
		String leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
	}
	@Given("click on firstnumber")
	public void click_on_firstnumber() {
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	}
	@Given("click on delete")
	public void click_on_delete() {
		driver.findElement(By.linkText("Delete")).click();
	}
	@Given("click on findLead")
	public void click_on_find_lead() {
		driver.findElement(By.linkText("Find Leads")).click();
	}
	@Given("Enter the leadId")
	public void enter_the_lead_id() {
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys("1008");
	}
	
	@When("Error message should be displayed")
	public void error_message_should_be_displayed() {
	    System.out.println("error is detected");
	}
	
	
	
}
