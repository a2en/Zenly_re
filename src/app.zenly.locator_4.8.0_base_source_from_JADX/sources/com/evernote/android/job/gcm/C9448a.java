package com.evernote.android.job.gcm;

import android.content.Context;
import com.evernote.android.job.C9450h;
import com.evernote.android.job.C9450h.C9454d;
import com.evernote.android.job.JobProxy;
import com.evernote.android.job.JobProxy.C9433a;
import com.evernote.android.job.util.C9469c;
import com.evernote.android.job.util.C9471e;
import com.google.android.gms.gcm.C10210a;
import com.google.android.gms.gcm.OneoffTask.C10207a;
import com.google.android.gms.gcm.PeriodicTask.C10208a;
import com.google.android.gms.gcm.Task;
import com.google.android.gms.gcm.Task.C10209a;

/* renamed from: com.evernote.android.job.gcm.a */
public class C9448a implements JobProxy {

    /* renamed from: c */
    private static final C9469c f24464c = new C9469c("JobProxyGcm");

    /* renamed from: a */
    private final Context f24465a;

    /* renamed from: b */
    private final C10210a f24466b;

    /* renamed from: com.evernote.android.job.gcm.a$a */
    static /* synthetic */ class C9449a {

        /* renamed from: a */
        static final /* synthetic */ int[] f24467a = new int[C9454d.values().length];

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
                f24467a = r0
                int[] r0 = f24467a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.evernote.android.job.h$d r1 = com.evernote.android.job.C9450h.C9454d.ANY     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f24467a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.evernote.android.job.h$d r1 = com.evernote.android.job.C9450h.C9454d.CONNECTED     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f24467a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.evernote.android.job.h$d r1 = com.evernote.android.job.C9450h.C9454d.UNMETERED     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f24467a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.evernote.android.job.h$d r1 = com.evernote.android.job.C9450h.C9454d.NOT_ROAMING     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.evernote.android.job.gcm.C9448a.C9449a.<clinit>():void");
        }
    }

    public C9448a(Context context) {
        this.f24465a = context;
        this.f24466b = C10210a.m25815a(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public <T extends C10209a> T mo25325a(T t, C9450h hVar) {
        t.mo27686a(mo25327a(hVar)).mo27685a(PlatformGcmService.class).mo27691c(true).mo27682a(mo25324a(hVar.mo25360v())).mo27687a(C9471e.m23049a(this.f24465a)).mo27689b(hVar.mo25363y()).mo27684a(hVar.mo25352o());
        return t;
    }

    public void cancel(int i) {
        this.f24466b.mo27704a(mo25326a(i), PlatformGcmService.class);
    }

    public boolean isPlatformJobScheduled(C9450h hVar) {
        return true;
    }

    public void plantOneOff(C9450h hVar) {
        long g = C9433a.m22826g(hVar);
        long j = g / 1000;
        long d = C9433a.m22823d(hVar);
        long max = Math.max(d / 1000, 1 + j);
        C10207a aVar = new C10207a();
        mo25325a(aVar, hVar);
        C10207a aVar2 = aVar;
        aVar2.mo27683a(j, max);
        this.f24466b.mo27703a((Task) aVar2.mo27690b());
        f24464c.mo25409a("Scheduled OneoffTask, %s, start %s, end %s (from now), reschedule count %d", hVar, C9471e.m23048a(g), C9471e.m23048a(d), Integer.valueOf(C9433a.m22825f(hVar)));
    }

    public void plantPeriodic(C9450h hVar) {
        C10208a aVar = new C10208a();
        mo25325a(aVar, hVar);
        C10208a aVar2 = aVar;
        aVar2.mo27698b(hVar.mo25346i() / 1000);
        aVar2.mo27697a(hVar.mo25344h() / 1000);
        this.f24466b.mo27703a((Task) aVar2.mo27699b());
        f24464c.mo25409a("Scheduled PeriodicTask, %s, interval %s, flex %s", hVar, C9471e.m23048a(hVar.mo25346i()), C9471e.m23048a(hVar.mo25344h()));
    }

    public void plantPeriodicFlexSupport(C9450h hVar) {
        f24464c.mo25417d("plantPeriodicFlexSupport called although flex is supported");
        long h = C9433a.m22827h(hVar);
        long e = C9433a.m22824e(hVar);
        C10207a aVar = new C10207a();
        mo25325a(aVar, hVar);
        C10207a aVar2 = aVar;
        aVar2.mo27683a(h / 1000, e / 1000);
        this.f24466b.mo27703a((Task) aVar2.mo27690b());
        f24464c.mo25409a("Scheduled periodic (flex support), %s, start %s, end %s, flex %s", hVar, C9471e.m23048a(h), C9471e.m23048a(e), C9471e.m23048a(hVar.mo25344h()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo25327a(C9450h hVar) {
        return mo25326a(hVar.mo25348k());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo25326a(int i) {
        return String.valueOf(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo25324a(C9454d dVar) {
        int i = C9449a.f24467a[dVar.ordinal()];
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 0;
        }
        if (i == 3 || i == 4) {
            return 1;
        }
        throw new IllegalStateException("not implemented");
    }
}
