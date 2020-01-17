package p213co.znly.core.romutils;

import android.content.Context;
import java.util.List;

/* renamed from: co.znly.core.romutils.Checker */
abstract class Checker {
    private final String manufacturer;

    Checker(String str) {
        this.manufacturer = str;
    }

    /* access modifiers changed from: protected */
    public void autoResolve(Context context) {
    }

    /* access modifiers changed from: 0000 */
    public String getManufacturer() {
        return this.manufacturer;
    }

    /* access modifiers changed from: protected */
    public abstract List<Resolution> getResolutions(Context context);
}
