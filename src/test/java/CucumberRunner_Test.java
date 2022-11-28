

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/com",
        dryRun = false,
        snippets = CucumberOptions.SnippetType.UNDERSCORE,
        glue = {"com.steps","co.hooks"}
)

public class CucumberRunner_Test {
}
