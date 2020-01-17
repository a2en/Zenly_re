package com.evernote.android.job.util;

import android.content.Context;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* renamed from: com.evernote.android.job.util.e */
public final class C9471e {

    /* renamed from: a */
    private static final ThreadLocal<SimpleDateFormat> f24532a = new ThreadLocal<>();

    /* renamed from: b */
    private static final long f24533b = TimeUnit.DAYS.toMillis(1);

    /* renamed from: c */
    private static final C9469c f24534c = new C9469c("JobUtil");

    /* renamed from: a */
    public static String m23048a(long j) {
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) f24532a.get();
        if (simpleDateFormat == null) {
            simpleDateFormat = new SimpleDateFormat("HH:mm:ss", Locale.US);
            f24532a.set(simpleDateFormat);
        }
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        String format = simpleDateFormat.format(new Date(j));
        long j2 = j / f24533b;
        int i = (j2 > 1 ? 1 : (j2 == 1 ? 0 : -1));
        if (i == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(format);
            sb.append(" (+1 day)");
            return sb.toString();
        } else if (i <= 0) {
            return format;
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(format);
            sb2.append(" (+");
            sb2.append(j2);
            sb2.append(" days)");
            return sb2.toString();
        }
    }

    /* renamed from: b */
    public static boolean m23051b(Context context) {
        return m23050a(context, "android.permission.WAKE_LOCK", 0);
    }

    /* renamed from: a */
    public static boolean m23049a(Context context) {
        return m23050a(context, "android.permission.RECEIVE_BOOT_COMPLETED", 0);
    }

    /* renamed from: a */
    private static boolean m23050a(Context context, String str, int i) {
        boolean z = false;
        try {
            if (context.getPackageManager().checkPermission(str, context.getPackageName()) == 0) {
                z = true;
            }
            return z;
        } catch (Exception e) {
            f24534c.mo25410a((Throwable) e);
            if (i < 1 && m23050a(context.getApplicationContext(), str, i + 1)) {
                z = true;
            }
            return z;
        }
    }
}
