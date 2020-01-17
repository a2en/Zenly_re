package com.evernote.android.job.v21;

import android.annotation.TargetApi;
import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build.VERSION;
import android.os.Bundle;
import com.evernote.android.job.C9435b;
import com.evernote.android.job.C9441d;
import com.evernote.android.job.C9447g;
import com.evernote.android.job.C9450h;
import com.evernote.android.job.JobProxy.C9433a;
import com.evernote.android.job.util.C9469c;

@TargetApi(21)
public class PlatformJobService extends JobService {

    /* renamed from: e */
    private static final C9469c f24560e = new C9469c("PlatformJobService");

    /* renamed from: com.evernote.android.job.v21.PlatformJobService$a */
    class C9476a implements Runnable {

        /* renamed from: e */
        final /* synthetic */ C9433a f24561e;

        /* renamed from: f */
        final /* synthetic */ C9450h f24562f;

        /* renamed from: g */
        final /* synthetic */ JobParameters f24563g;

        C9476a(C9433a aVar, C9450h hVar, JobParameters jobParameters) {
            this.f24561e = aVar;
            this.f24562f = hVar;
            this.f24563g = jobParameters;
        }

        public void run() {
            try {
                this.f24561e.mo25254a(this.f24562f, PlatformJobService.this.m23111a(this.f24563g));
            } finally {
                PlatformJobService.this.jobFinished(this.f24563g, false);
            }
        }
    }

    public boolean onStartJob(JobParameters jobParameters) {
        C9433a aVar = new C9433a((Service) this, f24560e, jobParameters.getJobId());
        C9450h a = aVar.mo25255a(true, false);
        if (a == null) {
            return false;
        }
        if (a.mo25357t()) {
            if (C9479b.m23125b(this, a)) {
                if (VERSION.SDK_INT >= 26) {
                    f24560e.mo25409a("PendingIntent for transient bundle is not null although running on O, using compat mode, request %s", a);
                }
                return false;
            } else if (VERSION.SDK_INT < 26) {
                f24560e.mo25409a("PendingIntent for transient job %s expired", a);
                return false;
            }
        }
        aVar.mo25256a(a);
        C9441d.m22855b().execute(new C9476a(aVar, a, jobParameters));
        return true;
    }

    public boolean onStopJob(JobParameters jobParameters) {
        C9435b b = C9447g.m22884g().mo25314b(jobParameters.getJobId());
        if (b != null) {
            b.cancel();
            f24560e.mo25409a("Called onStopJob for %s", b);
        } else {
            f24560e.mo25409a("Called onStopJob, job %d not found", Integer.valueOf(jobParameters.getJobId()));
        }
        return false;
    }

    /* access modifiers changed from: private */
    @TargetApi(26)
    /* renamed from: a */
    public Bundle m23111a(JobParameters jobParameters) {
        if (VERSION.SDK_INT >= 26) {
            return jobParameters.getTransientExtras();
        }
        return Bundle.EMPTY;
    }
}
