package com.evernote.android.job;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import android.util.SparseArray;
import com.evernote.android.job.C9435b.C9438c;
import com.evernote.android.job.JobCreator.AddJobCreatorReceiver;
import com.evernote.android.job.JobProxy.C9433a;
import com.evernote.android.job.util.C9469c;
import com.evernote.android.job.util.C9470d;
import com.evernote.android.job.util.C9471e;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: com.evernote.android.job.g */
public final class C9447g {

    /* renamed from: e */
    private static final C9469c f24457e = new C9469c("JobManager");
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: f */
    private static volatile C9447g f24458f;

    /* renamed from: a */
    private final Context f24459a;

    /* renamed from: b */
    private final C9443e f24460b = new C9443e();

    /* renamed from: c */
    private final C9455i f24461c;

    /* renamed from: d */
    private final C9444f f24462d;

    private C9447g(Context context) {
        this.f24459a = context;
        this.f24461c = new C9455i(context);
        this.f24462d = new C9444f();
        if (!C9441d.m22861h()) {
            JobRescheduleService.m22831a(this.f24459a);
        }
    }

    /* renamed from: a */
    public static C9447g m22878a(Context context) throws JobManagerCreateException {
        if (f24458f == null) {
            synchronized (C9447g.class) {
                if (f24458f == null) {
                    C9470d.m23046a(context, (Object) "Context cannot be null");
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    C9439c d = C9439c.m22847d(context);
                    if (d == C9439c.V_14) {
                        if (!d.mo25290b(context)) {
                            throw new JobManagerCreateException("All APIs are disabled, cannot schedule any job");
                        }
                    }
                    f24458f = new C9447g(context);
                    if (!C9471e.m23051b(context)) {
                        f24457e.mo25417d("No wake lock permission");
                    }
                    if (!C9471e.m23049a(context)) {
                        f24457e.mo25417d("No boot permission");
                    }
                    m22881b(context);
                }
            }
        }
        return f24458f;
    }

    /* renamed from: d */
    private synchronized int m22883d(String str) {
        int i;
        i = 0;
        for (C9450h b : mo25310a(str, true, false)) {
            if (m22882b(b)) {
                i++;
            }
        }
        for (C9435b a : TextUtils.isEmpty(str) ? mo25315b() : mo25318c(str)) {
            if (m22880a(a)) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: g */
    public static C9447g m22884g() {
        if (f24458f == null) {
            synchronized (C9447g.class) {
                if (f24458f == null) {
                    throw new IllegalStateException("You need to call create() at least once to create the singleton");
                }
            }
        }
        return f24458f;
    }

    /* renamed from: b */
    public Set<C9450h> mo25316b(String str) {
        return mo25310a(str, false, true);
    }

    /* renamed from: c */
    public Set<C9435b> mo25318c(String str) {
        return this.f24462d.mo25298a(str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public C9444f mo25320e() {
        return this.f24462d;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public C9455i mo25321f() {
        return this.f24461c;
    }

    /* renamed from: b */
    public C9435b mo25314b(int i) {
        return this.f24462d.mo25297a(i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public Context mo25317c() {
        return this.f24459a;
    }

    /* renamed from: b */
    public Set<C9435b> mo25315b() {
        return this.f24462d.mo25303b();
    }

    /* renamed from: b */
    private boolean m22882b(C9450h hVar) {
        if (hVar == null) {
            return false;
        }
        f24457e.mo25416c("Found pending job %s, canceling", hVar);
        mo25308a(hVar.mo25347j()).cancel(hVar.mo25348k());
        mo25321f().mo25385b(hVar);
        hVar.mo25333a(0);
        return true;
    }

    /* renamed from: b */
    private static void m22881b(Context context) {
        List<ResolveInfo> list;
        String packageName = context.getPackageName();
        Intent intent = new Intent("com.evernote.android.job.ADD_JOB_CREATOR");
        intent.setPackage(packageName);
        try {
            list = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        } catch (Exception unused) {
            list = Collections.emptyList();
        }
        for (ResolveInfo resolveInfo : list) {
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            if (activityInfo != null && !activityInfo.exported && packageName.equals(activityInfo.packageName) && !TextUtils.isEmpty(activityInfo.name)) {
                try {
                    ((AddJobCreatorReceiver) Class.forName(activityInfo.name).newInstance()).addJobCreator(context, f24458f);
                } catch (Exception unused2) {
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public C9443e mo25319d() {
        return this.f24460b;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x006d */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo25312a(com.evernote.android.job.C9450h r8) {
        /*
            r7 = this;
            com.evernote.android.job.e r0 = r7.f24460b
            boolean r0 = r0.mo25295a()
            if (r0 == 0) goto L_0x000f
            com.evernote.android.job.util.c r0 = f24457e
            java.lang.String r1 = "you haven't registered a JobCreator with addJobCreator(), it's likely that your job never will be executed"
            r0.mo25417d(r1)
        L_0x000f:
            long r0 = r8.mo25349l()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x001a
            return
        L_0x001a:
            boolean r0 = r8.mo25359u()
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = r8.mo25351n()
            r7.mo25306a(r0)
        L_0x0027:
            android.content.Context r0 = r7.f24459a
            int r1 = r8.mo25348k()
            com.evernote.android.job.JobProxy.C9433a.m22818a(r0, r1)
            com.evernote.android.job.c r0 = r8.mo25347j()
            boolean r1 = r8.mo25355r()
            if (r1 == 0) goto L_0x004e
            boolean r2 = r0.mo25289b()
            if (r2 == 0) goto L_0x004e
            long r2 = r8.mo25344h()
            long r4 = r8.mo25346i()
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x004e
            r2 = 1
            goto L_0x004f
        L_0x004e:
            r2 = 0
        L_0x004f:
            com.evernote.android.job.util.Clock r3 = com.evernote.android.job.C9441d.m22853a()
            long r3 = r3.currentTimeMillis()
            r8.mo25333a(r3)
            r8.mo25334a(r2)
            com.evernote.android.job.i r3 = r7.f24461c
            r3.mo25382a(r8)
            r7.m22879a(r8, r0, r1, r2)     // Catch:{ JobProxyIllegalStateException -> 0x006d, Exception -> 0x0066 }
            return
        L_0x0066:
            r0 = move-exception
            com.evernote.android.job.i r1 = r7.f24461c
            r1.mo25385b(r8)
            throw r0
        L_0x006d:
            r0.mo25288a()     // Catch:{ Exception -> 0x0074 }
            r7.m22879a(r8, r0, r1, r2)     // Catch:{ Exception -> 0x0074 }
            return
        L_0x0074:
            r3 = move-exception
            com.evernote.android.job.c r4 = com.evernote.android.job.C9439c.V_14
            if (r0 == r4) goto L_0x0095
            com.evernote.android.job.c r4 = com.evernote.android.job.C9439c.V_19
            if (r0 == r4) goto L_0x0095
            android.content.Context r0 = r7.f24459a
            boolean r0 = r4.mo25290b(r0)
            if (r0 == 0) goto L_0x0088
            com.evernote.android.job.c r0 = com.evernote.android.job.C9439c.V_19
            goto L_0x008a
        L_0x0088:
            com.evernote.android.job.c r0 = com.evernote.android.job.C9439c.V_14
        L_0x008a:
            r7.m22879a(r8, r0, r1, r2)     // Catch:{ Exception -> 0x008e }
            return
        L_0x008e:
            r0 = move-exception
            com.evernote.android.job.i r1 = r7.f24461c
            r1.mo25385b(r8)
            throw r0
        L_0x0095:
            com.evernote.android.job.i r0 = r7.f24461c
            r0.mo25385b(r8)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.evernote.android.job.C9447g.mo25312a(com.evernote.android.job.h):void");
    }

    /* renamed from: a */
    private void m22879a(C9450h hVar, C9439c cVar, boolean z, boolean z2) {
        JobProxy a = mo25308a(cVar);
        if (!z) {
            a.plantOneOff(hVar);
        } else if (z2) {
            a.plantPeriodicFlexSupport(hVar);
        } else {
            a.plantPeriodic(hVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C9450h mo25309a(int i, boolean z) {
        C9450h a = this.f24461c.mo25380a(i);
        if (z || a == null || !a.mo25356s()) {
            return a;
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Set<C9450h> mo25310a(String str, boolean z, boolean z2) {
        Set<C9450h> a = this.f24461c.mo25381a(str, z);
        if (z2) {
            Iterator it = a.iterator();
            while (it.hasNext()) {
                C9450h hVar = (C9450h) it.next();
                if (hVar.mo25357t() && !hVar.mo25347j().mo25287a(this.f24459a).isPlatformJobScheduled(hVar)) {
                    this.f24461c.mo25385b(hVar);
                    it.remove();
                }
            }
        }
        return a;
    }

    /* renamed from: a */
    public SparseArray<C9438c> mo25307a() {
        return this.f24462d.mo25296a();
    }

    /* renamed from: a */
    public boolean mo25313a(int i) {
        boolean b = m22882b(mo25309a(i, true)) | m22880a(mo25314b(i));
        C9433a.m22818a(this.f24459a, i);
        return b;
    }

    /* renamed from: a */
    public int mo25306a(String str) {
        return m22883d(str);
    }

    /* renamed from: a */
    private boolean m22880a(C9435b bVar) {
        if (bVar == null || bVar.isFinished() || bVar.isCanceled()) {
            return false;
        }
        f24457e.mo25416c("Cancel running %s", bVar);
        bVar.cancel(true);
        return true;
    }

    /* renamed from: a */
    public void mo25311a(JobCreator jobCreator) {
        this.f24460b.mo25294a(jobCreator);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public JobProxy mo25308a(C9439c cVar) {
        return cVar.mo25287a(this.f24459a);
    }
}
