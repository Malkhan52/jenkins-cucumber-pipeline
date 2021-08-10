package com.techprimers.testing;

import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;

//plugin = {"pretty", "html:target/cucumber", "json:target/cucumber.json"}



@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features", plugin = {"pretty","html:target/cucumber.html","json:target/cucumber.json"})
public class CucumberTest {

}

