package p389io.fabric.sdk.android.services.common;

import android.os.Process;

/* renamed from: io.fabric.sdk.android.services.common.g */
public abstract class C12179g implements Runnable {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo25215a();

    public final void run() {
        Process.setThreadPriority(10);
        mo25215a();
    }
}
