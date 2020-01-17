package com.google.android.gms.gcm;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.C10074e;

/* renamed from: com.google.android.gms.gcm.l */
final class C10221l implements C10222m {

    /* renamed from: a */
    private final Context f26824a;

    /* renamed from: b */
    private final PendingIntent f26825b;

    C10221l(Context context) {
        this.f26824a = context;
        this.f26825b = PendingIntent.getBroadcast(context, 0, new Intent().setPackage("com.google.example.invalidpackage"), 0);
    }

    /* renamed from: a */
    public final boolean mo27728a(Task task) {
        Intent a = m25838a("SCHEDULE_TASK");
        Bundle bundle = new Bundle();
        task.mo27677a(bundle);
        a.putExtras(bundle);
        this.f26824a.sendBroadcast(a);
        return true;
    }

    /* renamed from: a */
    public final boolean mo27727a(ComponentName componentName, String str) {
        Intent a = m25838a("CANCEL_TASK");
        a.putExtra("component", componentName);
        a.putExtra("tag", str);
        this.f26824a.sendBroadcast(a);
        return true;
    }

    /* renamed from: a */
    private final Intent m25838a(String str) {
        Intent intent = new Intent("com.google.android.gms.gcm.ACTION_SCHEDULE");
        intent.setPackage("com.google.android.gms");
        intent.putExtra("app", this.f26825b);
        intent.putExtra("source", 4);
        intent.putExtra("source_version", C10074e.GOOGLE_PLAY_SERVICES_VERSION_CODE);
        intent.putExtra("scheduler_action", str);
        return intent;
    }
}
