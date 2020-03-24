package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RemoteWebDriver {

    public static WebDriver driver;

    public static RemoteWebDriver hisBrowser()
    {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--ignore-certificate-errors");
        options.addArguments("--disable-infobars");

        driver = new ChromeDriver(options);
        return new RemoteWebDriver();
    }

    public WebDriver get(String url) {
        driver.get(url);
        return driver;
    }
}
