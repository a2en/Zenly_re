package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.C0862g.C0863a;

/* renamed from: androidx.lifecycle.p */
public class C0876p implements LifecycleOwner {

    /* renamed from: m */
    private static final C0876p f3480m = new C0876p();

    /* renamed from: e */
    private int f3481e = 0;

    /* renamed from: f */
    private int f3482f = 0;

    /* renamed from: g */
    private boolean f3483g = true;

    /* renamed from: h */
    private boolean f3484h = true;

    /* renamed from: i */
    private Handler f3485i;

    /* renamed from: j */
    private final C0869k f3486j = new C0869k(this);

    /* renamed from: k */
    private Runnable f3487k = new C0877a();

    /* renamed from: l */
    C0883b f3488l = new C0878b();

    /* renamed from: androidx.lifecycle.p$a */
    class C0877a implements Runnable {
        C0877a() {
        }

        public void run() {
            C0876p.this.mo4460e();
            C0876p.this.mo4461f();
        }
    }

    /* renamed from: androidx.lifecycle.p$b */
    class C0878b implements C0883b {
        C0878b() {
        }

        public void onCreate() {
        }

        public void onResume() {
            C0876p.this.mo4457b();
        }

        public void onStart() {
            C0876p.this.mo4458c();
        }
    }

    /* renamed from: androidx.lifecycle.p$c */
    class C0879c extends C0860e {

        /* renamed from: androidx.lifecycle.p$c$a */
        class C0880a extends C0860e {
            C0880a() {
            }

            public void onActivityPostResumed(Activity activity) {
                C0876p.this.mo4457b();
            }

            public void onActivityPostStarted(Activity activity) {
                C0876p.this.mo4458c();
            }
        }

        C0879c() {
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (VERSION.SDK_INT < 29) {
                C0881q.m4073a(activity).mo4469a(C0876p.this.f3488l);
            }
        }

        public void onActivityPaused(Activity activity) {
            C0876p.this.mo4455a();
        }

        public void onActivityPreCreated(Activity activity, Bundle bundle) {
            activity.registerActivityLifecycleCallbacks(new C0880a());
        }

        public void onActivityStopped(Activity activity) {
            C0876p.this.mo4459d();
        }
    }

    private C0876p() {
    }

    /* renamed from: b */
    static void m4064b(Context context) {
        f3480m.mo4456a(context);
    }

    /* renamed from: g */
    public static LifecycleOwner m4065g() {
        return f3480m;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4455a() {
        this.f3482f--;
        if (this.f3482f == 0) {
            this.f3485i.postDelayed(this.f3487k, 700);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo4458c() {
        this.f3481e++;
        if (this.f3481e == 1 && this.f3484h) {
            this.f3486j.mo4450a(C0863a.ON_START);
            this.f3484h = false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo4459d() {
        this.f3481e--;
        mo4461f();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo4460e() {
        if (this.f3482f == 0) {
            this.f3483g = true;
            this.f3486j.mo4450a(C0863a.ON_PAUSE);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo4461f() {
        if (this.f3481e == 0 && this.f3483g) {
            this.f3486j.mo4450a(C0863a.ON_STOP);
            this.f3484h = true;
        }
    }

    public C0862g getLifecycle() {
        return this.f3486j;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo4457b() {
        this.f3482f++;
        if (this.f3482f != 1) {
            return;
        }
        if (this.f3483g) {
            this.f3486j.mo4450a(C0863a.ON_RESUME);
            this.f3483g = false;
            return;
        }
        this.f3485i.removeCallbacks(this.f3487k);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4456a(Context context) {
        this.f3485i = new Handler();
        this.f3486j.mo4450a(C0863a.ON_CREATE);
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new C0879c());
    }
}
