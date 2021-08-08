package com.techprimers.testing;

//plugin = {"pretty", "html:target/cucumber", "json:target/cucumber.json"}

import io.cucumber.junit.platform.engine.Cucumber;
import io.cucumber.junit.CucumberOptions;

@Cucumber
@CucumberOptions(
        features = {"src/test/resources"},
        glue = {"com.techprimers.testing"},
        plugin = {"pretty", "html:target/cucumber"}

		)
public class CucumberTest {
}
