

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/com",
        glue = {"com.steps","com.hooks"}
)

public class CucumberRunner_Test {
}
