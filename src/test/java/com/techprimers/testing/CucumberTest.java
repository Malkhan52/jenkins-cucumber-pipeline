package com.techprimers.testing;


import io.cucumber.junit.platform.engine.Cucumber;
import io.cucumber.junit.CucumberOptions;

@Cucumber
@CucumberOptions(
        features = "src/test/resources",
        glue = "com.techprimers.testing",
        plugin = {"json:target/cucumber.json"}
)
public class CucumberTest {
}
