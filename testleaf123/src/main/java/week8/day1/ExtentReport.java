package week8.day1;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReport {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		ExtentHtmlReporter er= new ExtentHtmlReporter("./reports/extentreport.html");
		
		ExtentReports repo= new ExtentReports();
		
		repo.attachReporter(er);
		
		
		ExtentTest test = repo.createTest("login", "login with valid data");
		test.assignAuthor("karthik");
		test.assignCategory("regression");
		
		test.pass("enter username",MediaEntityBuilder.createScreenCaptureFromPath("../").build());
		test.pass("enter username");
		test.pass("enter username");
		
		repo.flush();
		System.out.println("done");
		

	}

}
