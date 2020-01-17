package com.evernote.android.job;

import android.content.Context;
import android.os.Bundle;
import com.evernote.android.job.C9450h.C9454d;
import com.evernote.android.job.util.C9468b;
import com.evernote.android.job.util.C9469c;
import com.evernote.android.job.util.support.C9473b;
import java.lang.ref.WeakReference;

/* renamed from: com.evernote.android.job.b */
public abstract class C9435b {
    private static final C9469c CAT = new C9469c("Job");
    private Context mApplicationContext;
    private boolean mCanceled;
    private WeakReference<Context> mContextReference;
    private boolean mDeleted;
    private long mFinishedTimeStamp = -1;
    private C9437b mParams;
    private C9438c mResult = C9438c.FAILURE;

    /* renamed from: com.evernote.android.job.b$a */
    static /* synthetic */ class C9436a {

        /* renamed from: a */
        static final /* synthetic */ int[] f24417a = new int[C9454d.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        static {
            /*
                com.evernote.android.job.h$d[] r0 = com.evernote.android.job.C9450h.C9454d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f24417a = r0
                int[] r0 = f24417a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.evernote.android.job.h$d r1 = com.evernote.android.job.C9450h.C9454d.CONNECTED     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f24417a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.evernote.android.job.h$d r1 = com.evernote.android.job.C9450h.C9454d.NOT_ROAMING     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f24417a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.evernote.android.job.h$d r1 = com.evernote.android.job.C9450h.C9454d.UNMETERED     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f24417a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.evernote.android.job.h$d r1 = com.evernote.android.job.C9450h.C9454d.METERED     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.evernote.android.job.C9435b.C9436a.<clinit>():void");
        }
    }

    /* renamed from: com.evernote.android.job.b$b */
    public static final class C9437b {

        /* renamed from: a */
        private final C9450h f24418a;

        /* renamed from: b */
        private C9473b f24419b;

        /* synthetic */ C9437b(C9450h hVar, Bundle bundle, C9436a aVar) {
            this(hVar, bundle);
        }

        /* renamed from: a */
        public C9473b mo25280a() {
            if (this.f24419b == null) {
                this.f24419b = this.f24418a.mo25342f();
                if (this.f24419b == null) {
                    this.f24419b = new C9473b();
                }
            }
            return this.f24419b;
        }

        /* renamed from: b */
        public int mo25281b() {
            return this.f24418a.mo25348k();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public C9450h mo25282c() {
            return this.f24418a;
        }

        /* renamed from: d */
        public String mo25283d() {
            return this.f24418a.mo25351n();
        }

        /* renamed from: e */
        public boolean mo25284e() {
            return this.f24418a.mo25355r();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C9437b.class != obj.getClass()) {
                return false;
            }
            return this.f24418a.equals(((C9437b) obj).f24418a);
        }

        public int hashCode() {
            return this.f24418a.hashCode();
        }

        private C9437b(C9450h hVar, Bundle bundle) {
            this.f24418a = hVar;
        }
    }

    /* renamed from: com.evernote.android.job.b$c */
    public enum C9438c {
        SUCCESS,
        FAILURE,
        RESCHEDULE
    }

    public final void cancel() {
        cancel(false);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.mParams.equals(((C9435b) obj).mParams);
    }

    /* access modifiers changed from: protected */
    public final Context getContext() {
        Context context = (Context) this.mContextReference.get();
        return context == null ? this.mApplicationContext : context;
    }

    /* access modifiers changed from: 0000 */
    public final long getFinishedTimeStamp() {
        return this.mFinishedTimeStamp;
    }

    /* access modifiers changed from: protected */
    public final C9437b getParams() {
        return this.mParams;
    }

    /* access modifiers changed from: 0000 */
    public final C9438c getResult() {
        return this.mResult;
    }

    public int hashCode() {
        return this.mParams.hashCode();
    }

    /* access modifiers changed from: protected */
    public final boolean isCanceled() {
        return this.mCanceled;
    }

    /* access modifiers changed from: 0000 */
    public final boolean isDeleted() {
        return this.mDeleted;
    }

    public final boolean isFinished() {
        return this.mFinishedTimeStamp > 0;
    }

    /* access modifiers changed from: protected */
    public boolean isRequirementBatteryNotLowMet() {
        return !getParams().mo25282c().mo25362x() || !C9468b.m23026a(getContext()).mo25406a();
    }

    /* access modifiers changed from: protected */
    public boolean isRequirementChargingMet() {
        return !getParams().mo25282c().mo25363y() || C9468b.m23026a(getContext()).mo25407b();
    }

    /* access modifiers changed from: protected */
    public boolean isRequirementDeviceIdleMet() {
        return !getParams().mo25282c().mo25364z() || C9468b.m23029c(getContext());
    }

    /* access modifiers changed from: protected */
    public boolean isRequirementNetworkTypeMet() {
        C9454d v = getParams().mo25282c().mo25360v();
        boolean z = true;
        if (v == C9454d.ANY) {
            return true;
        }
        C9454d b = C9468b.m23028b(getContext());
        int i = C9436a.f24417a[v.ordinal()];
        if (i == 1) {
            if (b == C9454d.ANY) {
                z = false;
            }
            return z;
        } else if (i == 2) {
            if (!(b == C9454d.NOT_ROAMING || b == C9454d.UNMETERED || b == C9454d.METERED)) {
                z = false;
            }
            return z;
        } else if (i == 3) {
            if (b != C9454d.UNMETERED) {
                z = false;
            }
            return z;
        } else if (i == 4) {
            if (!(b == C9454d.CONNECTED || b == C9454d.NOT_ROAMING)) {
                z = false;
            }
            return z;
        } else {
            throw new IllegalStateException("not implemented");
        }
    }

    /* access modifiers changed from: protected */
    public boolean isRequirementStorageNotLowMet() {
        return !getParams().mo25282c().mo25328A() || !C9468b.m23027a();
    }

    /* access modifiers changed from: 0000 */
    public boolean meetsRequirements() {
        if (!getParams().mo25282c().mo25361w()) {
            return true;
        }
        if (!isRequirementChargingMet()) {
            CAT.mo25417d("Job requires charging, reschedule");
            return false;
        } else if (!isRequirementDeviceIdleMet()) {
            CAT.mo25417d("Job requires device to be idle, reschedule");
            return false;
        } else if (isRequirementNetworkTypeMet()) {
            return true;
        } else {
            CAT.mo25418d("Job requires network to be %s, but was %s", getParams().mo25282c().mo25360v(), C9468b.m23028b(getContext()));
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public void onReschedule(int i) {
    }

    /* access modifiers changed from: protected */
    public abstract C9438c onRunJob(C9437b bVar);

    /* access modifiers changed from: 0000 */
    public final C9438c runJob() {
        try {
            if (meetsRequirements()) {
                this.mResult = onRunJob(getParams());
            } else {
                this.mResult = getParams().mo25284e() ? C9438c.FAILURE : C9438c.RESCHEDULE;
            }
            C9438c cVar = this.mResult;
            this.mFinishedTimeStamp = System.currentTimeMillis();
            return cVar;
        } catch (Throwable th) {
            this.mFinishedTimeStamp = System.currentTimeMillis();
            throw th;
        }
    }

    /* access modifiers changed from: 0000 */
    public final C9435b setContext(Context context) {
        this.mContextReference = new WeakReference<>(context);
        this.mApplicationContext = context.getApplicationContext();
        return this;
    }

    /* access modifiers changed from: 0000 */
    public final C9435b setRequest(C9450h hVar, Bundle bundle) {
        this.mParams = new C9437b(hVar, bundle, null);
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("job{id=");
        sb.append(this.mParams.mo25281b());
        sb.append(", finished=");
        sb.append(isFinished());
        sb.append(", result=");
        sb.append(this.mResult);
        sb.append(", canceled=");
        sb.append(this.mCanceled);
        sb.append(", periodic=");
        sb.append(this.mParams.mo25284e());
        sb.append(", class=");
        sb.append(getClass().getSimpleName());
        sb.append(", tag=");
        sb.append(this.mParams.mo25283d());
        sb.append('}');
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    public final void cancel(boolean z) {
        if (!isFinished()) {
            this.mCanceled = true;
            this.mDeleted = z;
        }
    }
}
