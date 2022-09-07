package dcs.specialaction;

import java.util.HashMap;
import java.util.Map;

import com.google.common.collect.Lists;

import dcs.test.MainDriver;

public final class GetWifiStatus extends MainDriver {

    public static final String actionGetWifiStatus() {
        Map<String, Object> argv = new HashMap<>();
        argv.put("command", "settings");
        argv.put("args", Lists.newArrayList("get", "global", "wifi_on"));
        String networkStatus = driver.executeScript("mobile: shell", argv).toString();
        return (networkStatus);
    }
}
