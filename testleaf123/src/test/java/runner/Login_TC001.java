package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import stepdef.ProjectSpecificMethod;


@CucumberOptions(features="src/test/java/features/Login.feature",
glue = {"stepdef"} ,monochrome = true , publish = true
)

public class Login_TC001 extends ProjectSpecificMethod{
	
	

}
