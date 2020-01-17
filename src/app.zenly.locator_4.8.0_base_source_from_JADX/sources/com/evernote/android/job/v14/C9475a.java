package com.evernote.android.job.v14;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import com.evernote.android.job.C9441d;
import com.evernote.android.job.C9450h;
import com.evernote.android.job.JobProxy;
import com.evernote.android.job.JobProxy.C9433a;
import com.evernote.android.job.util.C9469c;
import com.evernote.android.job.util.C9471e;

/* renamed from: com.evernote.android.job.v14.a */
public class C9475a implements JobProxy {

    /* renamed from: a */
    protected final Context f24557a;

    /* renamed from: b */
    protected final C9469c f24558b;

    /* renamed from: c */
    private AlarmManager f24559c;

    public C9475a(Context context) {
        this(context, "JobProxy14");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo25456a(boolean z) {
        return !z ? 1207959552 : 134217728;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo25462a(C9450h hVar, AlarmManager alarmManager, PendingIntent pendingIntent) {
        long a = mo25457a(hVar);
        int i = VERSION.SDK_INT;
        if (i >= 23) {
            alarmManager.setExactAndAllowWhileIdle(mo25463b(true), a, pendingIntent);
        } else if (i >= 19) {
            alarmManager.setExact(mo25463b(true), a, pendingIntent);
        } else {
            alarmManager.set(mo25463b(true), a, pendingIntent);
        }
        m23100b(hVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo25396b(C9450h hVar, AlarmManager alarmManager, PendingIntent pendingIntent) {
        alarmManager.set(1, C9441d.m22853a().currentTimeMillis() + C9433a.m22822c(hVar), pendingIntent);
        this.f24558b.mo25409a("Scheduled repeating alarm (flex support), %s, interval %s, flex %s", hVar, C9471e.m23048a(hVar.mo25346i()), C9471e.m23048a(hVar.mo25344h()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo25397c(C9450h hVar, AlarmManager alarmManager, PendingIntent pendingIntent) {
        alarmManager.set(mo25463b(false), mo25457a(hVar), pendingIntent);
        m23100b(hVar);
    }

    public void cancel(int i) {
        AlarmManager a = mo25458a();
        if (a != null) {
            try {
                a.cancel(mo25459a(i, false, null, mo25456a(true)));
                a.cancel(mo25459a(i, false, null, mo25456a(false)));
            } catch (Exception e) {
                this.f24558b.mo25410a((Throwable) e);
            }
        }
    }

    public boolean isPlatformJobScheduled(C9450h hVar) {
        return mo25460a(hVar, 536870912) != null;
    }

    public void plantOneOff(C9450h hVar) {
        PendingIntent a = mo25461a(hVar, false);
        AlarmManager a2 = mo25458a();
        if (a2 != null) {
            try {
                if (!hVar.mo25353p()) {
                    mo25397c(hVar, a2, a);
                } else if (hVar.mo25350m() != 1 || hVar.mo25343g() > 0) {
                    mo25462a(hVar, a2, a);
                } else {
                    PlatformAlarmService.m23093a(this.f24557a, hVar.mo25348k(), hVar.mo25352o());
                }
            } catch (Exception e) {
                this.f24558b.mo25410a((Throwable) e);
            }
        }
    }

    public void plantPeriodic(C9450h hVar) {
        PendingIntent a = mo25461a(hVar, true);
        AlarmManager a2 = mo25458a();
        if (a2 != null) {
            a2.setRepeating(mo25463b(true), mo25457a(hVar), hVar.mo25346i(), a);
        }
        this.f24558b.mo25409a("Scheduled repeating alarm, %s, interval %s", hVar, C9471e.m23048a(hVar.mo25346i()));
    }

    public void plantPeriodicFlexSupport(C9450h hVar) {
        PendingIntent a = mo25461a(hVar, false);
        AlarmManager a2 = mo25458a();
        if (a2 != null) {
            try {
                mo25396b(hVar, a2, a);
            } catch (Exception e) {
                this.f24558b.mo25410a((Throwable) e);
            }
        }
    }

    protected C9475a(Context context, String str) {
        this.f24557a = context;
        this.f24558b = new C9469c(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo25463b(boolean z) {
        if (z) {
            return C9441d.m22860g() ? 0 : 2;
        }
        return C9441d.m22860g() ? 1 : 3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public long mo25457a(C9450h hVar) {
        long elapsedRealtime;
        long b;
        if (C9441d.m22860g()) {
            elapsedRealtime = C9441d.m22853a().currentTimeMillis();
            b = C9433a.m22821b(hVar);
        } else {
            elapsedRealtime = C9441d.m22853a().elapsedRealtime();
            b = C9433a.m22821b(hVar);
        }
        return elapsedRealtime + b;
    }

    /* renamed from: b */
    private void m23100b(C9450h hVar) {
        this.f24558b.mo25409a("Scheduled alarm, %s, delay %s (from now), exact %b, reschedule count %d", hVar, C9471e.m23048a(C9433a.m22821b(hVar)), Boolean.valueOf(hVar.mo25353p()), Integer.valueOf(C9433a.m22825f(hVar)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public PendingIntent mo25461a(C9450h hVar, boolean z) {
        return mo25460a(hVar, mo25456a(z));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public PendingIntent mo25460a(C9450h hVar, int i) {
        return mo25459a(hVar.mo25348k(), hVar.mo25353p(), hVar.mo25352o(), i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public PendingIntent mo25459a(int i, boolean z, Bundle bundle, int i2) {
        try {
            return PendingIntent.getBroadcast(this.f24557a, i, PlatformAlarmReceiver.m23092a(this.f24557a, i, z, bundle), i2);
        } catch (Exception e) {
            this.f24558b.mo25410a((Throwable) e);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AlarmManager mo25458a() {
        if (this.f24559c == null) {
            this.f24559c = (AlarmManager) this.f24557a.getSystemService("alarm");
        }
        if (this.f24559c == null) {
            this.f24558b.mo25412b("AlarmManager is null");
        }
        return this.f24559c;
    }
}
