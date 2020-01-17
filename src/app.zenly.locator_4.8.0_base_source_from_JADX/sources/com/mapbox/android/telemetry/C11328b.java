package com.mapbox.android.telemetry;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.IntentFilter;

/* renamed from: com.mapbox.android.telemetry.b */
class C11328b implements C11385p0 {

    /* renamed from: a */
    private final Context f29412a;

    /* renamed from: b */
    private final AlarmManager f29413b;

    /* renamed from: c */
    private final C11322a f29414c;

    /* renamed from: d */
    private PendingIntent f29415d;

    C11328b(Context context, AlarmManager alarmManager, C11322a aVar) {
        this.f29412a = context;
        this.f29413b = alarmManager;
        this.f29414c = aVar;
    }

    /* renamed from: a */
    public void mo32970a(long j) {
        long j2 = C11387q0.f29480c;
        this.f29413b.setInexactRepeating(3, j + j2, j2, this.f29415d);
    }

    public void register() {
        this.f29415d = PendingIntent.getBroadcast(this.f29412a, 0, this.f29414c.mo32967a(), 0);
        this.f29412a.registerReceiver(this.f29414c, new IntentFilter("com.mapbox.scheduler_flusher"));
    }

    public void unregister() {
        PendingIntent pendingIntent = this.f29415d;
        if (pendingIntent != null) {
            this.f29413b.cancel(pendingIntent);
        }
        try {
            this.f29412a.unregisterReceiver(this.f29414c);
        } catch (IllegalArgumentException unused) {
        }
    }
}
