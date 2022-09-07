package dcs.test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class MainDriver {
    public static AndroidDriver driver;

    @BeforeTest
    @Parameters({ "deviceName", "platformVersion" })
    public static void setupAndroidDriver(String deviceName, String platformVersion) throws MalformedURLException {

        UiAutomator2Options options = new UiAutomator2Options();
        options.setCapability("platformName", "Android");
        options.setCapability("appium:automationName", "UiAutomator2");
        options.setCapability("deviceName", deviceName);
        options.setCapability("--session-override", "true");

        options.setCapability("platformVersion", platformVersion);
        options.setCapability("appPackage", "com.android.contacts");
        options.setCapability("appActivity",
                "com.android.contacts.activities.PeopleActivity");

        driver = new AndroidDriver(new URL("http://192.168.178.24:4444/"), options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @AfterTest
    public static void kill() {
        driver.quit();
    }
}
