

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/com",
        tags = "@all",
        dryRun = false,
        strict = false,
        snippets = SnippetType.UNDERSCORE,
        glue = {"com.steps.components","com.steps.pages"}
)

public class CucumberRunner_Test {
}
