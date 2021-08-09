package com.techprimers.testing;

//plugin = {"pretty", "html:target/cucumber", "json:target/cucumber.json"}

import io.cucumber.junit.platform.engine.Cucumber;
import io.cucumber.junit.CucumberOptions;

@Cucumber
//@CucumberOptions(
//		features = "src/test/resources/features/bagbasics",
//		glue= {"io.tpd.springbootcucumber.bagbasics"},		
//		plugin = { "pretty", "json:target/cucumber-reports/cucumber.json",
//						"junit:target/cucumber-reports/cucumber.xml",
//						"html:target/cucumber-reports"},
//		monochrome = true
//	)
@CucumberOptions(
        features = {"src/test/resources"},
        glue = {"com.techprimers.testing"},
        plugin = { "pretty", "json:target/cucumber-reports/cucumber.json",
				"junit:target/cucumber-reports/cucumber.xml",
				"html:target/cucumber-reports"},
        monochrome = true

		)
public class CucumberTest {
}
