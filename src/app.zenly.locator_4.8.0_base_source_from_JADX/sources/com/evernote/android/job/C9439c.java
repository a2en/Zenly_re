package com.evernote.android.job;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build.VERSION;
import com.evernote.android.job.gcm.C9448a;
import com.evernote.android.job.p303l.C9461a;
import com.evernote.android.job.p304m.C9462a;
import com.evernote.android.job.p305n.C9464a;
import com.evernote.android.job.v14.C9475a;
import com.evernote.android.job.v14.PlatformAlarmReceiver;
import com.evernote.android.job.v14.PlatformAlarmService;
import com.evernote.android.job.v14.PlatformAlarmServiceExact;
import com.evernote.android.job.v21.C9477a;
import com.evernote.android.job.v21.PlatformJobService;
import java.util.List;

/* renamed from: com.evernote.android.job.c */
public enum C9439c {
    V_26(true, false, true),
    V_24(true, false, false),
    V_21(true, true, false),
    V_19(true, true, true),
    V_14(false, true, true),
    GCM(true, false, true);
    

    /* renamed from: e */
    private volatile JobProxy f24431e;

    /* renamed from: f */
    private final boolean f24432f;

    /* renamed from: g */
    private final boolean f24433g;

    /* renamed from: com.evernote.android.job.c$a */
    static /* synthetic */ class C9440a {

        /* renamed from: a */
        static final /* synthetic */ int[] f24434a = null;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|(3:11|12|14)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                com.evernote.android.job.c[] r0 = com.evernote.android.job.C9439c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f24434a = r0
                int[] r0 = f24434a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.evernote.android.job.c r1 = com.evernote.android.job.C9439c.V_26     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f24434a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.evernote.android.job.c r1 = com.evernote.android.job.C9439c.V_24     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f24434a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.evernote.android.job.c r1 = com.evernote.android.job.C9439c.V_21     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f24434a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.evernote.android.job.c r1 = com.evernote.android.job.C9439c.V_19     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f24434a     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.evernote.android.job.c r1 = com.evernote.android.job.C9439c.V_14     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = f24434a     // Catch:{ NoSuchFieldError -> 0x004b }
                com.evernote.android.job.c r1 = com.evernote.android.job.C9439c.GCM     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.evernote.android.job.C9439c.C9440a.<clinit>():void");
        }
    }

    private C9439c(boolean z, boolean z2, boolean z3) {
        this.f24432f = z;
        this.f24433g = z2;
    }

    /* renamed from: d */
    public static C9439c m22847d(Context context) {
        if (V_26.mo25290b(context) && C9441d.m22854a(V_26)) {
            return V_26;
        }
        if (V_24.mo25290b(context) && C9441d.m22854a(V_24)) {
            return V_24;
        }
        if (V_21.mo25290b(context) && C9441d.m22854a(V_21)) {
            return V_21;
        }
        if (GCM.mo25290b(context) && C9441d.m22854a(GCM)) {
            return GCM;
        }
        if (V_19.mo25290b(context) && C9441d.m22854a(V_19)) {
            return V_19;
        }
        if (C9441d.m22854a(V_14)) {
            return V_14;
        }
        throw new IllegalStateException("All supported APIs are disabled");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized JobProxy mo25287a(Context context) {
        if (this.f24431e == null) {
            this.f24431e = m22846c(context);
        }
        return this.f24431e;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo25289b() {
        return this.f24433g;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo25291c() {
        return this.f24432f;
    }

    /* renamed from: c */
    private JobProxy m22846c(Context context) {
        switch (C9440a.f24434a[ordinal()]) {
            case 1:
                return new C9464a(context);
            case 2:
                return new C9462a(context);
            case 3:
                return new C9477a(context);
            case 4:
                return new C9461a(context);
            case 5:
                return new C9475a(context);
            case 6:
                return new C9448a(context);
            default:
                throw new IllegalStateException("not implemented");
        }
    }

    /* renamed from: b */
    public boolean mo25290b(Context context) {
        String str = "android.permission.BIND_JOB_SERVICE";
        boolean z = true;
        switch (C9440a.f24434a[ordinal()]) {
            case 1:
                if (VERSION.SDK_INT < 26 || !m22845b(context, PlatformJobService.class)) {
                    z = false;
                }
                return z;
            case 2:
                if (VERSION.SDK_INT < 24 || !m22844a(context, PlatformJobService.class, str)) {
                    z = false;
                }
                return z;
            case 3:
                if (VERSION.SDK_INT < 21 || !m22844a(context, PlatformJobService.class, str)) {
                    z = false;
                }
                return z;
            case 4:
                if (VERSION.SDK_INT < 19 || !m22845b(context, PlatformAlarmService.class) || !m22843a(context, PlatformAlarmReceiver.class)) {
                    z = false;
                }
                return z;
            case 5:
                if (!C9441d.m22859f() && (!m22845b(context, PlatformAlarmService.class) || !m22845b(context, PlatformAlarmServiceExact.class) || !m22843a(context, PlatformAlarmReceiver.class))) {
                    z = false;
                }
                return z;
            case 6:
                return C9434a.m22835a(context);
            default:
                throw new IllegalStateException("not implemented");
        }
    }

    /* renamed from: a */
    public synchronized void mo25288a() {
        this.f24431e = null;
    }

    /* renamed from: a */
    private static boolean m22844a(Context context, Class<? extends Service> cls, String str) {
        try {
            List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(new Intent(context, cls), 0);
            if (queryIntentServices != null) {
                if (!queryIntentServices.isEmpty()) {
                    for (ResolveInfo resolveInfo : queryIntentServices) {
                        if (resolveInfo.serviceInfo != null && str.equals(resolveInfo.serviceInfo.permission)) {
                            return true;
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* renamed from: a */
    private boolean m22843a(Context context, Class<? extends BroadcastReceiver> cls) {
        try {
            List queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(new Intent(context, cls), 0);
            if (queryBroadcastReceivers == null || queryBroadcastReceivers.isEmpty()) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: b */
    private boolean m22845b(Context context, Class<? extends Service> cls) {
        try {
            List queryIntentServices = context.getPackageManager().queryIntentServices(new Intent(context, cls), 0);
            if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
