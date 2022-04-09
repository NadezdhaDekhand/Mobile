package HomeWork_7.Cucumber.Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions( features = {"RunTest.java"}, glue = {"SwipeSteps.java"})

public class RunTest extends AbstractTestNGCucumberTests {
}