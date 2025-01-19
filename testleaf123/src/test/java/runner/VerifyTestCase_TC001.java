package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import stepdef.PSM;

@CucumberOptions(features ="src/test/java/features/Verify_Test_Cases_Page.feature",
glue = {"stepdef"},tags = "@karthik")

public class VerifyTestCase_TC001 extends PSM {

}
