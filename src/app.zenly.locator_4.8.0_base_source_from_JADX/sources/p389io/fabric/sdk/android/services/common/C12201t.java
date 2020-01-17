package p389io.fabric.sdk.android.services.common;

import android.os.SystemClock;
import android.util.Log;

/* renamed from: io.fabric.sdk.android.services.common.t */
public class C12201t {

    /* renamed from: a */
    private final String f31725a;

    /* renamed from: b */
    private final String f31726b;

    /* renamed from: c */
    private final boolean f31727c;

    /* renamed from: d */
    private long f31728d;

    /* renamed from: e */
    private long f31729e;

    public C12201t(String str, String str2) {
        this.f31725a = str;
        this.f31726b = str2;
        this.f31727c = !Log.isLoggable(str2, 2);
    }

    /* renamed from: c */
    private void m32328c() {
        String str = this.f31726b;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f31725a);
        sb.append(": ");
        sb.append(this.f31729e);
        sb.append("ms");
        Log.v(str, sb.toString());
    }

    /* renamed from: a */
    public synchronized void mo36096a() {
        if (!this.f31727c) {
            this.f31728d = SystemClock.elapsedRealtime();
            this.f31729e = 0;
        }
    }

    /* renamed from: b */
    public synchronized void mo36097b() {
        if (!this.f31727c) {
            if (this.f31729e == 0) {
                this.f31729e = SystemClock.elapsedRealtime() - this.f31728d;
                m32328c();
            }
        }
    }
}
