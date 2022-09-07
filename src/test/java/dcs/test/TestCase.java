package dcs.test;

import org.testng.annotations.Test;

import dcs.object.CreateContact;
import dcs.specialaction.GetCancel;
import dcs.specialaction.GetDeviceNetworkName;
import dcs.specialaction.GetWifiStatus;
import dcs.specialaction.TurnOffWifi;

public class TestCase extends MainDriver {

    @Test
    public void runtest() throws InterruptedException {

        System.out.println(GetDeviceNetworkName.actionGetDeviceNetworkName());
        System.out.println(GetWifiStatus.actionGetWifiStatus());

        CreateContact createconobj = new CreateContact(driver);

        createconobj.getCreateMainBtn().click();

        GetCancel.actionGetCancel();

        if (GetWifiStatus.actionGetWifiStatus() == "1") {
            TurnOffWifi.actionTurnOffWifi();
        }

    }

}