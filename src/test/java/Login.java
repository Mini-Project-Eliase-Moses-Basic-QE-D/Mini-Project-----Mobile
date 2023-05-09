import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebElement;

import java.net.URL;


public class Login {
    public static void main(String[] args) throws Exception {
        // Set capabilities
        UiAutomator2Options options = new UiAutomator2Options()
                .setUdid("123456")
                .setApp("/home/myapp.apk");
        AndroidDriver driver = new AndroidDriver(
                // The default URL in Appium 1 is http://127.0.0.1:4723/wd/hub
                new URL("http://127.0.0.1:4723"), options
        );
        try {
            WebElement buttonlogin = driver.findElement(AppiumBy.xpath("//Button"));
            buttonlogin.click();
            driver.getPageSource();
        } finally {
            driver.quit();
        }
    }
}

