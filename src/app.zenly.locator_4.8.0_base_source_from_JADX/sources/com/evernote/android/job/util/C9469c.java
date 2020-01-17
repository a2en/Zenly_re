package com.evernote.android.job.util;

import android.util.Log;

/* renamed from: com.evernote.android.job.util.c */
public class C9469c implements JobLogger {

    /* renamed from: c */
    private static volatile JobLogger[] f24528c = new JobLogger[0];

    /* renamed from: d */
    private static volatile boolean f24529d = true;

    /* renamed from: a */
    protected final String f24530a;

    /* renamed from: b */
    protected final boolean f24531b;

    public C9469c(String str) {
        this(str, true);
    }

    /* renamed from: a */
    public void mo25408a(String str) {
        log(3, this.f24530a, str, null);
    }

    /* renamed from: b */
    public void mo25414b(Throwable th, String str, Object... objArr) {
        log(5, this.f24530a, String.format(str, objArr), th);
    }

    /* renamed from: c */
    public void mo25415c(String str) {
        log(4, this.f24530a, str, null);
    }

    /* renamed from: d */
    public void mo25417d(String str) {
        log(5, this.f24530a, str, null);
    }

    public void log(int i, String str, String str2, Throwable th) {
        String str3;
        if (this.f24531b) {
            if (f24529d) {
                if (th == null) {
                    str3 = "";
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append(10);
                    sb.append(Log.getStackTraceString(th));
                    str3 = sb.toString();
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str2);
                sb2.append(str3);
                Log.println(i, str, sb2.toString());
            }
            JobLogger[] jobLoggerArr = f24528c;
            if (jobLoggerArr.length > 0) {
                for (JobLogger jobLogger : jobLoggerArr) {
                    if (jobLogger != null) {
                        jobLogger.log(i, str, str2, th);
                    }
                }
            }
        }
    }

    public C9469c(String str, boolean z) {
        this.f24530a = str;
        this.f24531b = z;
    }

    /* renamed from: a */
    public void mo25409a(String str, Object... objArr) {
        log(3, this.f24530a, String.format(str, objArr), null);
    }

    /* renamed from: b */
    public void mo25412b(String str) {
        log(6, this.f24530a, str, null);
    }

    /* renamed from: c */
    public void mo25416c(String str, Object... objArr) {
        log(4, this.f24530a, String.format(str, objArr), null);
    }

    /* renamed from: d */
    public void mo25418d(String str, Object... objArr) {
        log(5, this.f24530a, String.format(str, objArr), null);
    }

    /* renamed from: a */
    public void mo25410a(Throwable th) {
        String message = th.getMessage();
        String str = this.f24530a;
        if (message == null) {
            message = "empty message";
        }
        log(6, str, message, th);
    }

    /* renamed from: b */
    public void mo25413b(String str, Object... objArr) {
        log(6, this.f24530a, String.format(str, objArr), null);
    }

    /* renamed from: a */
    public void mo25411a(Throwable th, String str, Object... objArr) {
        log(6, this.f24530a, String.format(str, objArr), th);
    }
}
