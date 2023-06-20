package stepdefinations;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/test/resources/Test.feature",
        glue={"stepdefinations"},
       // tags = "@Test1",
        monochrome = true,
        plugin = {"pretty:target/Cucumber-pretty.txt",
                  "html:target/Reports/cucumber-html-report",
                  "json:target/cucumber.json"
        }
)

public class TestRunner {
}
