package dcs.specialaction;

import dcs.object.CreateContact;
import dcs.test.MainDriver;

public final class GetCancel extends MainDriver {

    public static final void actionGetCancel() {

        CreateContact createconobj = new CreateContact(driver);

        try {
            if (createconobj.getCancelBtn().isDisplayed()) {
                createconobj.getCancelBtn().click();
                System.out.println("Cancel catched");
            }
        } catch (Exception e) {
        }

    }

}
