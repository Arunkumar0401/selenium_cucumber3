package stepdefenitions;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.URL;

public class StepDefenition
{
    public WebDriver driver;
    @Given("User navigate to the test website {string}")
    public void user_navigate_to_the_test_website(String Testing_Url)
    {
        System.out.println("\n\nJava configuration is fine \n\n\n lets go with the automation \n\n");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(Testing_Url);
        driver.close();
        System.out.println("\n\nAutomation testing completed \n\n\n Thanks\nArun \n\n");
    }
}
