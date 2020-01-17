package com.evernote.android.job.v14;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.core.app.JobIntentService;
import com.evernote.android.job.C9450h;
import com.evernote.android.job.JobProxy.C9433a;
import com.evernote.android.job.util.C9469c;

public final class PlatformAlarmService extends JobIntentService {

    /* renamed from: m */
    private static final C9469c f24549m = new C9469c("PlatformAlarmService");

    /* renamed from: a */
    public static void m23093a(Context context, int i, Bundle bundle) {
        Intent intent = new Intent();
        intent.putExtra("EXTRA_JOB_ID", i);
        if (bundle != null) {
            intent.putExtra("EXTRA_TRANSIENT_EXTRAS", bundle);
        }
        JobIntentService.m2361a(context, PlatformAlarmService.class, 2147480001, intent);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo2940a(Intent intent) {
        m23094a(intent, (Service) this, f24549m);
    }

    /* renamed from: a */
    static void m23094a(Intent intent, Service service, C9469c cVar) {
        if (intent == null) {
            cVar.mo25415c("Delivered intent is null");
            return;
        }
        int intExtra = intent.getIntExtra("EXTRA_JOB_ID", -1);
        Bundle bundleExtra = intent.getBundleExtra("EXTRA_TRANSIENT_EXTRAS");
        C9433a aVar = new C9433a(service, cVar, intExtra);
        C9450h a = aVar.mo25255a(true, true);
        if (a != null) {
            aVar.mo25254a(a, bundleExtra);
        }
    }
}
