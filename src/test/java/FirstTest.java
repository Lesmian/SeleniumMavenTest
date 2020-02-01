import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.nio.file.Paths;

public class FirstTest {

    @Test
    public void ExampleTest(){
        String path = Paths.get(".", "src/main/resources/executables.drivers", "chromedriver.exe").normalize().toString();
        System.setProperty("webdriver.chrome.driver", path);
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://google.com");
        driver.quit();
    }
}
