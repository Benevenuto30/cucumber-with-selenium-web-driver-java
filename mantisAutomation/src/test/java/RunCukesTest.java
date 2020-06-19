import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"/users/larafael.benevenuto/Desktop/mantisAutomation/src/test"}
)
public class RunCukesTest {
}
