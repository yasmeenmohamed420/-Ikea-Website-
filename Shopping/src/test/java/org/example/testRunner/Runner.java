package org.example.testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/main/resources/Feature",
        glue = "org.example.stepDefs",
        tags = "@happy",
        plugin ={
                "pretty",
                "html:Reports/report.html"
        }
)

public class Runner extends AbstractTestNGCucumberTests
{
}
