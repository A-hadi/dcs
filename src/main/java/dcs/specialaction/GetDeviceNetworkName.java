package dcs.specialaction;

import java.util.HashMap;
import java.util.Map;

import com.google.common.collect.Lists;

import dcs.test.MainDriver;

public final class GetDeviceNetworkName extends MainDriver {

    public static final String actionGetDeviceNetworkName() {
        Map<String, Object> argv = new HashMap<>();
        argv.put("command", "dumpsys ");
        argv.put("args", Lists.newArrayList("netstats", "|", "grep", "-E", "'iface=wlan.*networkId'"));
        String networkID = driver.executeScript("mobile: shell", argv).toString();

        return (networkID);
    }

}
