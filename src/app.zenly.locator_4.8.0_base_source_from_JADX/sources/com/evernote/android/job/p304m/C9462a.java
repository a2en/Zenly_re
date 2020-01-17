package com.evernote.android.job.p304m;

import android.annotation.TargetApi;
import android.app.job.JobInfo.Builder;
import android.content.Context;
import com.evernote.android.job.C9450h;
import com.evernote.android.job.C9450h.C9454d;
import com.evernote.android.job.v21.C9477a;

@TargetApi(24)
/* renamed from: com.evernote.android.job.m.a */
public class C9462a extends C9477a {

    /* renamed from: com.evernote.android.job.m.a$a */
    static /* synthetic */ class C9463a {

        /* renamed from: a */
        static final /* synthetic */ int[] f24522a = new int[C9454d.values().length];

        static {
            try {
                f24522a[C9454d.NOT_ROAMING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public C9462a(Context context) {
        this(context, "JobProxy24");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo25398a(C9454d dVar) {
        if (C9463a.f24522a[dVar.ordinal()] != 1) {
            return super.mo25398a(dVar);
        }
        return 3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Builder mo25399b(Builder builder, long j, long j2) {
        return builder.setPeriodic(j, j2);
    }

    public boolean isPlatformJobScheduled(C9450h hVar) {
        try {
            return mo25402a(mo25469a().getPendingJob(hVar.mo25348k()), hVar);
        } catch (Exception e) {
            this.f24566b.mo25410a((Throwable) e);
            return false;
        }
    }

    public void plantPeriodicFlexSupport(C9450h hVar) {
        this.f24566b.mo25417d("plantPeriodicFlexSupport called although flex is supported");
        super.plantPeriodicFlexSupport(hVar);
    }

    public C9462a(Context context, String str) {
        super(context, str);
    }
}
