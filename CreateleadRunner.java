package week6.day1;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features="src/main/java/features/createLead.feature",glue="stepdefinition",monochrome=true,publish=true)

public class CreateleadRunner extends AbstractTestNGCucumberTests {

}
