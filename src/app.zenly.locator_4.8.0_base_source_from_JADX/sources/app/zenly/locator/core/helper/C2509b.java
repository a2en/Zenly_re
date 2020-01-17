package app.zenly.locator.core.helper;

import android.os.SystemClock;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: app.zenly.locator.core.helper.b */
public abstract class C2509b implements OnClickListener {

    /* renamed from: e */
    private final long f7520e;

    /* renamed from: f */
    private long f7521f;

    public C2509b() {
        this(1000);
    }

    /* renamed from: a */
    public abstract void mo7322a(View view);

    public void onClick(View view) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.f7521f;
        if (j <= 0 || j + this.f7520e < elapsedRealtime) {
            mo7322a(view);
            this.f7521f = elapsedRealtime;
        }
    }

    public C2509b(long j) {
        this.f7521f = -1;
        this.f7520e = j;
    }
}
