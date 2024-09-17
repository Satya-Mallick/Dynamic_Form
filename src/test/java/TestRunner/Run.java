package TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
  (
		//features=".//Feature/Login.feature",
	    features=".//Feature/Manage_Department.feature",
		//features=".//Feature/Manage_Role.feature",
	    //features=".//Feature/Manage_Groups.feature",
	    //features=".//Feature/Manage_Employee_Type.feature",
		  //features=".//Feature/Manage_User.feature",
		//features=".//Feature/Set_Role_Permission.feature",
		 // features=".//Feature/Manage_Designation.feature",
	   	glue = "StepDefination",
		dryRun = false, //feature file or stepdefination maping 
		monochrome = true,
		//tags="@sanity or @somke or @functional",
		plugin= {"pretty","html:target/cucumber.reports/reports.html"},
		//plugin=		{ "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
		stepNotifications = true
   )

public class Run {
//	@AfterClass
//	public static void writeExtentReport() {
//		Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));
	}

