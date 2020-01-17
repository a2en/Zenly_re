package p389io.fabric.sdk.android.services.events;

import android.content.Context;
import p389io.fabric.sdk.android.services.common.C12180h;

/* renamed from: io.fabric.sdk.android.services.events.d */
public class C12232d implements Runnable {

    /* renamed from: e */
    private final Context f31797e;

    /* renamed from: f */
    private final FileRollOverManager f31798f;

    public C12232d(Context context, FileRollOverManager fileRollOverManager) {
        this.f31797e = context;
        this.f31798f = fileRollOverManager;
    }

    public void run() {
        try {
            C12180h.m32267c(this.f31797e, "Performing time based file roll over.");
            if (!this.f31798f.rollFileOver()) {
                this.f31798f.cancelTimeBasedFileRollOver();
            }
        } catch (Exception e) {
            C12180h.m32252a(this.f31797e, "Failed to roll over file", (Throwable) e);
        }
    }
}
