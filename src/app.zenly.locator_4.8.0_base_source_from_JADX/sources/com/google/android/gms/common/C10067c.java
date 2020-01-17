package com.google.android.gms.common;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.TypedValue;
import android.widget.ProgressBar;
import androidx.core.app.NotificationCompat.C0509b;
import androidx.core.app.NotificationCompat.C0511d;
import androidx.core.app.NotificationCompat.C0512e;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.C10064z;
import com.google.android.gms.common.api.internal.LifecycleFragment;
import com.google.android.gms.common.api.internal.zabq;
import com.google.android.gms.common.internal.C10107e;
import com.google.android.gms.common.internal.C10109f;
import com.google.android.gms.common.internal.C10123l;
import com.google.android.gms.common.util.C10170g;
import com.google.android.gms.common.util.C10174k;
import com.google.android.gms.internal.base.C10263e;
import p333g.p357d.p358a.p359a.p360a.C12064a;
import p333g.p357d.p358a.p359a.p360a.C12065b;

/* renamed from: com.google.android.gms.common.c */
public class C10067c extends C10069d {

    /* renamed from: d */
    private static final Object f26454d = new Object();

    /* renamed from: e */
    private static final C10067c f26455e = new C10067c();

    /* renamed from: c */
    private String f26456c;

    @SuppressLint({"HandlerLeak"})
    /* renamed from: com.google.android.gms.common.c$a */
    private class C10068a extends C10263e {

        /* renamed from: a */
        private final Context f26457a;

        public C10068a(Context context) {
            super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
            this.f26457a = context.getApplicationContext();
        }

        public final void handleMessage(Message message) {
            int i = message.what;
            if (i != 1) {
                StringBuilder sb = new StringBuilder(50);
                sb.append("Don't know how to handle this message: ");
                sb.append(i);
                Log.w("GoogleApiAvailability", sb.toString());
                return;
            }
            int a = C10067c.this.mo27284a(this.f26457a);
            if (C10067c.this.mo27296b(a)) {
                C10067c.this.mo27295b(this.f26457a, a);
            }
        }
    }

    /* renamed from: a */
    public static C10067c m25293a() {
        return f26455e;
    }

    /* renamed from: b */
    public boolean mo27297b(Activity activity, int i, int i2, OnCancelListener onCancelListener) {
        Dialog a = mo27286a(activity, i, i2, onCancelListener);
        if (a == null) {
            return false;
        }
        m25294a(activity, a, GooglePlayServicesUtil.GMS_ERROR_DIALOG, onCancelListener);
        return true;
    }

    /* renamed from: a */
    public Dialog mo27286a(Activity activity, int i, int i2, OnCancelListener onCancelListener) {
        return m25292a((Context) activity, i, C10109f.m25455a(activity, mo27289a((Context) activity, i, "d"), i2), onCancelListener);
    }

    /* renamed from: b */
    public void mo27295b(Context context, int i) {
        m25295a(context, i, (String) null, mo27299a(context, i, 0, "n"));
    }

    /* renamed from: b */
    private final String m25296b() {
        String str;
        synchronized (f26454d) {
            str = this.f26456c;
        }
        return str;
    }

    /* renamed from: a */
    public final boolean mo27292a(Activity activity, LifecycleFragment lifecycleFragment, int i, int i2, OnCancelListener onCancelListener) {
        Dialog a = m25292a((Context) activity, i, C10109f.m25457a(lifecycleFragment, mo27289a((Context) activity, i, "d"), 2), onCancelListener);
        if (a == null) {
            return false;
        }
        m25294a(activity, a, GooglePlayServicesUtil.GMS_ERROR_DIALOG, onCancelListener);
        return true;
    }

    /* renamed from: b */
    public final boolean mo27296b(int i) {
        return super.mo27296b(i);
    }

    /* renamed from: a */
    public final boolean mo27293a(Context context, ConnectionResult connectionResult, int i) {
        PendingIntent a = mo27288a(context, connectionResult);
        if (a == null) {
            return false;
        }
        m25295a(context, connectionResult.getErrorCode(), (String) null, GoogleApiActivity.m25042a(context, a, i));
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo27294b(Context context) {
        new C10068a(context).sendEmptyMessageDelayed(1, 120000);
    }

    /* renamed from: a */
    public static Dialog m25291a(Activity activity, OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, null, 16842874);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        Builder builder = new Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(C10107e.m25451b(activity, 18));
        builder.setPositiveButton("", null);
        AlertDialog create = builder.create();
        m25294a(activity, (Dialog) create, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return create;
    }

    /* renamed from: a */
    public final zabq mo27290a(Context context, C10064z zVar) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        zabq zabq = new zabq(zVar);
        context.registerReceiver(zabq, intentFilter);
        zabq.mo27263a(context);
        if (mo27300a(context, "com.google.android.gms")) {
            return zabq;
        }
        zVar.mo27236a();
        zabq.mo27262a();
        return null;
    }

    /* renamed from: a */
    public int mo27284a(Context context) {
        return super.mo27284a(context);
    }

    /* renamed from: a */
    public int mo27285a(Context context, int i) {
        return super.mo27285a(context, i);
    }

    /* renamed from: a */
    public Intent mo27289a(Context context, int i, String str) {
        return super.mo27289a(context, i, str);
    }

    /* renamed from: a */
    public PendingIntent mo27287a(Context context, int i, int i2) {
        return super.mo27287a(context, i, i2);
    }

    /* renamed from: a */
    public PendingIntent mo27288a(Context context, ConnectionResult connectionResult) {
        if (connectionResult.hasResolution()) {
            return connectionResult.getResolution();
        }
        return mo27287a(context, connectionResult.getErrorCode(), 0);
    }

    /* renamed from: a */
    public final String mo27291a(int i) {
        return super.mo27291a(i);
    }

    /* renamed from: a */
    static Dialog m25292a(Context context, int i, C10109f fVar, OnCancelListener onCancelListener) {
        Builder builder = null;
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843529, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new Builder(context, 5);
        }
        if (builder == null) {
            builder = new Builder(context);
        }
        builder.setMessage(C10107e.m25451b(context, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String a = C10107e.m25447a(context, i);
        if (a != null) {
            builder.setPositiveButton(a, fVar);
        }
        String e = C10107e.m25454e(context, i);
        if (e != null) {
            builder.setTitle(e);
        }
        return builder.create();
    }

    /* renamed from: a */
    static void m25294a(Activity activity, Dialog dialog, String str, OnCancelListener onCancelListener) {
        if (activity instanceof FragmentActivity) {
            C10077h.m25329a(dialog, onCancelListener).mo4204a(((FragmentActivity) activity).getSupportFragmentManager(), str);
            return;
        }
        C10066b.m25290a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    @TargetApi(20)
    /* renamed from: a */
    private final void m25295a(Context context, int i, String str, PendingIntent pendingIntent) {
        int i2;
        if (i == 18) {
            mo27294b(context);
        } else if (pendingIntent == null) {
            if (i == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
            }
        } else {
            String d = C10107e.m25453d(context, i);
            String c = C10107e.m25452c(context, i);
            Resources resources = context.getResources();
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            C0511d dVar = new C0511d(context);
            dVar.mo2999b(true);
            dVar.mo2994a(true);
            dVar.mo2998b((CharSequence) d);
            C0509b bVar = new C0509b();
            bVar.mo2982a((CharSequence) c);
            dVar.mo2991a((C0512e) bVar);
            if (C10170g.m25667b(context)) {
                C10123l.m25516b(C10174k.m25683f());
                dVar.mo3000c(context.getApplicationInfo().icon);
                dVar.mo2996b(2);
                if (C10170g.m25668c(context)) {
                    dVar.mo2986a(C12064a.common_full_open_on_phone, resources.getString(C12065b.common_open_on_phone), pendingIntent);
                } else {
                    dVar.mo2988a(pendingIntent);
                }
            } else {
                dVar.mo3000c(17301642);
                dVar.mo3001c((CharSequence) resources.getString(C12065b.common_google_play_services_notification_ticker));
                dVar.mo2987a(System.currentTimeMillis());
                dVar.mo2988a(pendingIntent);
                dVar.mo2992a((CharSequence) c);
            }
            if (C10174k.m25686i()) {
                C10123l.m25516b(C10174k.m25686i());
                String b = m25296b();
                if (b == null) {
                    b = "com.google.android.gms.availability";
                    NotificationChannel notificationChannel = notificationManager.getNotificationChannel(b);
                    String b2 = C10107e.m25450b(context);
                    if (notificationChannel == null) {
                        notificationManager.createNotificationChannel(new NotificationChannel(b, b2, 4));
                    } else if (!b2.contentEquals(notificationChannel.getName())) {
                        notificationChannel.setName(b2);
                        notificationManager.createNotificationChannel(notificationChannel);
                    }
                }
                dVar.mo2993a(b);
            }
            Notification a = dVar.mo2984a();
            if (i == 1 || i == 2 || i == 3) {
                i2 = 10436;
                C10074e.sCanceledAvailabilityNotification.set(false);
            } else {
                i2 = 39789;
            }
            notificationManager.notify(i2, a);
        }
    }
}
