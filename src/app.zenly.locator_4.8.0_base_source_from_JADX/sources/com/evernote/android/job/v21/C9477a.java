package com.evernote.android.job.v21;

import android.annotation.TargetApi;
import android.app.job.JobInfo;
import android.app.job.JobInfo.Builder;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import com.evernote.android.job.C9450h;
import com.evernote.android.job.C9450h.C9454d;
import com.evernote.android.job.JobProxy;
import com.evernote.android.job.JobProxy.C9433a;
import com.evernote.android.job.JobProxyIllegalStateException;
import com.evernote.android.job.util.C9469c;
import com.evernote.android.job.util.C9471e;
import java.util.List;

@TargetApi(21)
/* renamed from: com.evernote.android.job.v21.a */
public class C9477a implements JobProxy {

    /* renamed from: a */
    protected final Context f24565a;

    /* renamed from: b */
    protected final C9469c f24566b;

    /* renamed from: com.evernote.android.job.v21.a$a */
    static /* synthetic */ class C9478a {

        /* renamed from: a */
        static final /* synthetic */ int[] f24567a = new int[C9454d.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                com.evernote.android.job.h$d[] r0 = com.evernote.android.job.C9450h.C9454d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f24567a = r0
                int[] r0 = f24567a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.evernote.android.job.h$d r1 = com.evernote.android.job.C9450h.C9454d.ANY     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f24567a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.evernote.android.job.h$d r1 = com.evernote.android.job.C9450h.C9454d.CONNECTED     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f24567a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.evernote.android.job.h$d r1 = com.evernote.android.job.C9450h.C9454d.UNMETERED     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f24567a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.evernote.android.job.h$d r1 = com.evernote.android.job.C9450h.C9454d.NOT_ROAMING     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f24567a     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.evernote.android.job.h$d r1 = com.evernote.android.job.C9450h.C9454d.METERED     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.evernote.android.job.v21.C9477a.C9478a.<clinit>():void");
        }
    }

    public C9477a(Context context) {
        this(context, "JobProxy21");
    }

    /* renamed from: a */
    protected static String m23113a(int i) {
        return i == 1 ? "success" : "failure";
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo25402a(JobInfo jobInfo, C9450h hVar) {
        boolean z = true;
        if (!(jobInfo != null && jobInfo.getId() == hVar.mo25348k())) {
            return false;
        }
        if (hVar.mo25357t() && !C9479b.m23124a(this.f24565a, hVar.mo25348k())) {
            z = false;
        }
        return z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Builder mo25399b(Builder builder, long j, long j2) {
        return builder.setPeriodic(j);
    }

    public void cancel(int i) {
        try {
            mo25469a().cancel(i);
        } catch (Exception e) {
            this.f24566b.mo25410a((Throwable) e);
        }
        C9479b.m23122a(this.f24565a, i, null);
    }

    public boolean isPlatformJobScheduled(C9450h hVar) {
        try {
            List<JobInfo> allPendingJobs = mo25469a().getAllPendingJobs();
            if (allPendingJobs != null && !allPendingJobs.isEmpty()) {
                for (JobInfo a : allPendingJobs) {
                    if (mo25402a(a, hVar)) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Exception e) {
            this.f24566b.mo25410a((Throwable) e);
            return false;
        }
    }

    public void plantOneOff(C9450h hVar) {
        long g = C9433a.m22826g(hVar);
        long d = C9433a.m22823d(hVar);
        int a = mo25467a(mo25468a(mo25401a(hVar, true), g, d).build());
        if (a == -123) {
            a = mo25467a(mo25468a(mo25401a(hVar, false), g, d).build());
        }
        this.f24566b.mo25409a("Schedule one-off jobInfo %s, %s, start %s, end %s (from now), reschedule count %d", m23113a(a), hVar, C9471e.m23048a(g), C9471e.m23048a(d), Integer.valueOf(C9433a.m22825f(hVar)));
    }

    public void plantPeriodic(C9450h hVar) {
        long i = hVar.mo25346i();
        long h = hVar.mo25344h();
        int a = mo25467a(mo25399b(mo25401a(hVar, true), i, h).build());
        if (a == -123) {
            a = mo25467a(mo25399b(mo25401a(hVar, false), i, h).build());
        }
        this.f24566b.mo25409a("Schedule periodic jobInfo %s, %s, interval %s, flex %s", m23113a(a), hVar, C9471e.m23048a(i), C9471e.m23048a(h));
    }

    public void plantPeriodicFlexSupport(C9450h hVar) {
        long h = C9433a.m22827h(hVar);
        long e = C9433a.m22824e(hVar);
        int a = mo25467a(mo25468a(mo25401a(hVar, true), h, e).build());
        if (a == -123) {
            a = mo25467a(mo25468a(mo25401a(hVar, false), h, e).build());
        }
        this.f24566b.mo25409a("Schedule periodic (flex support) jobInfo %s, %s, start %s, end %s, flex %s", m23113a(a), hVar, C9471e.m23048a(h), C9471e.m23048a(e), C9471e.m23048a(hVar.mo25344h()));
    }

    protected C9477a(Context context, String str) {
        this.f24565a = context;
        this.f24566b = new C9469c(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Builder mo25401a(C9450h hVar, boolean z) {
        return mo25400a(hVar, new Builder(hVar.mo25348k(), new ComponentName(this.f24565a, PlatformJobService.class)).setRequiresCharging(hVar.mo25363y()).setRequiresDeviceIdle(hVar.mo25364z()).setRequiredNetworkType(mo25398a(hVar.mo25360v())).setPersisted(z && !hVar.mo25357t() && C9471e.m23049a(this.f24565a)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Builder mo25468a(Builder builder, long j, long j2) {
        return builder.setMinimumLatency(j).setOverrideDeadline(j2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Builder mo25400a(C9450h hVar, Builder builder) {
        if (hVar.mo25357t()) {
            C9479b.m23123a(this.f24565a, hVar);
        }
        return builder;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo25398a(C9454d dVar) {
        int i = C9478a.f24567a[dVar.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3 || i == 4) {
            return 2;
        }
        if (i == 5) {
            return 1;
        }
        throw new IllegalStateException("not implemented");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final JobScheduler mo25469a() {
        return (JobScheduler) this.f24565a.getSystemService("jobscheduler");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo25467a(JobInfo jobInfo) {
        JobScheduler a = mo25469a();
        if (a != null) {
            try {
                return a.schedule(jobInfo);
            } catch (IllegalArgumentException e) {
                this.f24566b.mo25410a((Throwable) e);
                String message = e.getMessage();
                if (message != null && message.contains("RECEIVE_BOOT_COMPLETED")) {
                    return -123;
                }
                if (message == null || !message.contains("No such service ComponentInfo")) {
                    throw e;
                }
                throw new JobProxyIllegalStateException((Throwable) e);
            } catch (NullPointerException e2) {
                this.f24566b.mo25410a((Throwable) e2);
                throw new JobProxyIllegalStateException((Throwable) e2);
            }
        } else {
            throw new JobProxyIllegalStateException("JobScheduler is null");
        }
    }
}
