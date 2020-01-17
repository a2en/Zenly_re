package com.evernote.android.job.gcm;

import android.app.Service;
import com.evernote.android.job.C9435b.C9438c;
import com.evernote.android.job.C9447g;
import com.evernote.android.job.C9450h;
import com.evernote.android.job.JobManagerCreateException;
import com.evernote.android.job.JobProxy.C9433a;
import com.evernote.android.job.util.C9469c;
import com.google.android.gms.gcm.C10213d;
import com.google.android.gms.gcm.GcmTaskService;

public class PlatformGcmService extends GcmTaskService {

    /* renamed from: l */
    private static final C9469c f24463l = new C9469c("PlatformGcmService");

    /* renamed from: a */
    public int mo25322a(C10213d dVar) {
        C9433a aVar = new C9433a((Service) this, f24463l, Integer.parseInt(dVar.mo27710b()));
        C9450h a = aVar.mo25255a(true, true);
        if (a == null) {
            return 2;
        }
        if (C9438c.SUCCESS.equals(aVar.mo25254a(a, dVar.mo27709a()))) {
            return 0;
        }
        return 2;
    }

    /* renamed from: a */
    public void mo25323a() {
        super.mo25323a();
        try {
            C9447g.m22878a(getApplicationContext());
        } catch (JobManagerCreateException unused) {
        }
    }
}
