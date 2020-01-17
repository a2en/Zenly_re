package p213co.znly.core.romutils;

import android.content.Intent;

/* renamed from: co.znly.core.romutils.Resolution */
public final class Resolution {

    /* renamed from: id */
    private final C6615Id f16200id;
    private final Intent intent;
    private final boolean stateReadable;

    /* renamed from: co.znly.core.romutils.Resolution$Id */
    public enum C6615Id {
        AUTO_START_OPPO_APP_DETAILS,
        AUTO_START_XIAOMI,
        POWER_SAVING_OPPO_APPS_BG_SETTINGS
    }

    public Resolution(C6615Id id, Intent intent2, boolean z) {
        this.f16200id = id;
        this.intent = intent2;
        this.stateReadable = z;
    }

    public C6615Id getId() {
        return this.f16200id;
    }

    public Intent getIntent() {
        return this.intent;
    }

    public boolean isStateReadable() {
        return this.stateReadable;
    }
}
