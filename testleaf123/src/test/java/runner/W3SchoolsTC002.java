package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features/W3Schoolsregister.feature",glue="stepdef",
publish = true,
monochrome = true)


public class W3SchoolsTC002 extends AbstractTestNGCucumberTests{

}
