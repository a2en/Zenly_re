package p213co.znly.core.romutils;

import android.content.Context;
import android.os.Build.VERSION;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p213co.znly.core.romutils.Resolution.C6615Id;

/* renamed from: co.znly.core.romutils.OppoChecker */
final class OppoChecker extends Checker {
    OppoChecker(String str) {
        super(str);
    }

    /* access modifiers changed from: protected */
    public void autoResolve(Context context) {
        try {
            MobileAndWifiAccess.enableAccess(context);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: protected */
    public List<Resolution> getResolutions(Context context) {
        if (VERSION.SDK_INT != 27) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Resolution(C6615Id.AUTO_START_OPPO_APP_DETAILS, AutoStart.newAppDetailsIntent(context), false));
        if (!PowerAppsBgSetting.isDisabled(context)) {
            arrayList.add(new Resolution(C6615Id.POWER_SAVING_OPPO_APPS_BG_SETTINGS, PowerAppsBgSetting.newIntent(context), true));
        }
        return arrayList;
    }
}
