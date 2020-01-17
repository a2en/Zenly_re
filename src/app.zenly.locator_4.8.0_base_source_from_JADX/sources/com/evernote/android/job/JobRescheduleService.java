package com.evernote.android.job;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import androidx.core.app.JobIntentService;
import com.evernote.android.job.util.C9469c;
import java.util.Collection;
import java.util.Set;
import java.util.concurrent.CountDownLatch;

public final class JobRescheduleService extends JobIntentService {

    /* renamed from: m */
    private static final C9469c f24411m = new C9469c("JobRescheduleService", false);

    /* renamed from: n */
    static CountDownLatch f24412n;

    /* renamed from: a */
    static void m22831a(Context context) {
        try {
            JobIntentService.m2361a(context, JobRescheduleService.class, 2147480000, new Intent());
            f24412n = new CountDownLatch(1);
        } catch (Exception e) {
            f24411m.mo25410a((Throwable) e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo2940a(Intent intent) {
        try {
            f24411m.mo25408a("Reschedule service started");
            SystemClock.sleep(C9441d.m22857d());
            try {
                C9447g a = C9447g.m22878a((Context) this);
                Set a2 = a.mo25310a(null, true, true);
                f24411m.mo25409a("Reschedule %d jobs of %d jobs", Integer.valueOf(mo25257a(a, a2)), Integer.valueOf(a2.size()));
            } catch (JobManagerCreateException unused) {
                CountDownLatch countDownLatch = f24412n;
                if (countDownLatch != null) {
                    countDownLatch.countDown();
                }
            }
        } finally {
            CountDownLatch countDownLatch2 = f24412n;
            if (countDownLatch2 != null) {
                countDownLatch2.countDown();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo25257a(C9447g gVar, Collection<C9450h> collection) {
        int i = 0;
        boolean z = false;
        for (C9450h hVar : collection) {
            boolean z2 = hVar.mo25356s() ? gVar.mo25314b(hVar.mo25348k()) == null : !gVar.mo25308a(hVar.mo25347j()).isPlatformJobScheduled(hVar);
            if (z2) {
                try {
                    hVar.mo25331a().mo25371a().mo25329B();
                } catch (Exception e) {
                    if (!z) {
                        f24411m.mo25410a((Throwable) e);
                        z = true;
                    }
                }
                i++;
            }
        }
        return i;
    }
}
