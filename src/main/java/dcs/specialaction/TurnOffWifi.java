package dcs.specialaction;

import java.util.HashMap;
import java.util.Map;

import com.google.common.collect.Lists;

import dcs.test.MainDriver;

public final class TurnOffWifi extends MainDriver {

    public static final void actionTurnOffWifi() {
        Map<String, Object> argv = new HashMap<>();
        argv.put("command", "svc");
        argv.put("args", Lists.newArrayList("wifi", "disable"));
        driver.executeScript("mobile: shell", argv).toString();
    }
}
