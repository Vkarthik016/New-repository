package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import stepdef.PSM;
import stepdef.ProjectSpecificMethod;

@CucumberOptions(features ="src/test/java/features/Verify_All_Products_and_product_detail_page.feature",
glue = "stepdef")

public class Verifyproductsanddetails extends PSM{

}
