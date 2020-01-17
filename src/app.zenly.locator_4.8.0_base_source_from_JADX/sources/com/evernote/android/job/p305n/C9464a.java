package com.evernote.android.job.p305n;

import android.annotation.TargetApi;
import android.app.job.JobInfo;
import android.app.job.JobInfo.Builder;
import android.content.Context;
import com.evernote.android.job.C9450h;
import com.evernote.android.job.C9450h.C9454d;
import com.evernote.android.job.p304m.C9462a;

@TargetApi(26)
/* renamed from: com.evernote.android.job.n.a */
public class C9464a extends C9462a {

    /* renamed from: com.evernote.android.job.n.a$a */
    static /* synthetic */ class C9465a {

        /* renamed from: a */
        static final /* synthetic */ int[] f24523a = new int[C9454d.values().length];

        static {
            try {
                f24523a[C9454d.METERED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public C9464a(Context context) {
        super(context, "JobProxy26");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Builder mo25400a(C9450h hVar, Builder builder) {
        return builder.setTransientExtras(hVar.mo25352o());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo25402a(JobInfo jobInfo, C9450h hVar) {
        return jobInfo != null && jobInfo.getId() == hVar.mo25348k();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Builder mo25401a(C9450h hVar, boolean z) {
        return super.mo25401a(hVar, z).setRequiresBatteryNotLow(hVar.mo25362x()).setRequiresStorageNotLow(hVar.mo25328A());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo25398a(C9454d dVar) {
        if (C9465a.f24523a[dVar.ordinal()] != 1) {
            return super.mo25398a(dVar);
        }
        return 4;
    }
}
