package p213co.znly.core.romutils;

import android.content.Context;
import android.os.Build.VERSION;
import java.util.Collections;
import java.util.List;
import p213co.znly.core.romutils.Resolution.C6615Id;

/* renamed from: co.znly.core.romutils.XiaomiChecker */
final class XiaomiChecker extends Checker {
    XiaomiChecker(String str) {
        super(str);
    }

    /* access modifiers changed from: protected */
    public List<Resolution> getResolutions(Context context) {
        if (VERSION.SDK_INT > 28 || AutoStart.hasAutoStartOp(context) == Boolean.TRUE) {
            return Collections.emptyList();
        }
        return Collections.singletonList(new Resolution(C6615Id.AUTO_START_XIAOMI, AutoStart.newIntent(context), false));
    }
}
