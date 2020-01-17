package com.evernote.android.job.p303l;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import com.evernote.android.job.C9450h;
import com.evernote.android.job.JobProxy.C9433a;
import com.evernote.android.job.util.C9471e;
import com.evernote.android.job.v14.C9475a;

@TargetApi(19)
/* renamed from: com.evernote.android.job.l.a */
public class C9461a extends C9475a {
    public C9461a(Context context) {
        super(context, "JobProxy19");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo25396b(C9450h hVar, AlarmManager alarmManager, PendingIntent pendingIntent) {
        alarmManager.setWindow(1, System.currentTimeMillis() + C9433a.m22827h(hVar), C9433a.m22824e(hVar) - C9433a.m22827h(hVar), pendingIntent);
        this.f24558b.mo25409a("Scheduled repeating alarm (flex support), %s, start %s, end %s, flex %s", hVar, C9471e.m23048a(C9433a.m22827h(hVar)), C9471e.m23048a(C9433a.m22824e(hVar)), C9471e.m23048a(hVar.mo25344h()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo25397c(C9450h hVar, AlarmManager alarmManager, PendingIntent pendingIntent) {
        alarmManager.setWindow(1, System.currentTimeMillis() + C9433a.m22826g(hVar), C9433a.m22823d(hVar) - C9433a.m22826g(hVar), pendingIntent);
        this.f24558b.mo25409a("Schedule alarm, %s, start %s, end %s", hVar, C9471e.m23048a(C9433a.m22826g(hVar)), C9471e.m23048a(C9433a.m22823d(hVar)));
    }
}
