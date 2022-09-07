package dcs.object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class CreateContact {

    AndroidDriver driver;

    public CreateContact(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "com.android.contacts:id/floating_action_button")
    WebElement getCreateMainBtn;

    public WebElement getCreateMainBtn() {
        return getCreateMainBtn;
    }

    @FindBy(id = "com.android.contacts:id/left_button")
    WebElement getCancelBtn;

    public WebElement getCancelBtn() {
        return getCancelBtn;
    }

}
