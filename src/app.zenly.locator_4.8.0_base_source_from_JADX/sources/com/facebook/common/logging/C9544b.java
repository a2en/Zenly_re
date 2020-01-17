package com.facebook.common.logging;

import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;

/* renamed from: com.facebook.common.logging.b */
public class C9544b implements LoggingDelegate {

    /* renamed from: c */
    public static final C9544b f24717c = new C9544b();

    /* renamed from: a */
    private String f24718a = "unknown";

    /* renamed from: b */
    private int f24719b = 5;

    private C9544b() {
    }

    /* renamed from: a */
    public static C9544b m23326a() {
        return f24717c;
    }

    /* renamed from: d */
    public void mo25670d(String str, String str2) {
        m23330a(3, str, str2);
    }

    /* renamed from: e */
    public void mo25672e(String str, String str2) {
        m23330a(6, str, str2);
    }

    public int getMinimumLoggingLevel() {
        return this.f24719b;
    }

    /* renamed from: i */
    public void mo25675i(String str, String str2) {
        m23330a(4, str, str2);
    }

    public boolean isLoggable(int i) {
        return this.f24719b <= i;
    }

    public void log(int i, String str, String str2) {
        m23330a(i, str, str2);
    }

    public void setMinimumLoggingLevel(int i) {
        this.f24719b = i;
    }

    /* renamed from: v */
    public void mo25680v(String str, String str2) {
        m23330a(2, str, str2);
    }

    /* renamed from: w */
    public void mo25682w(String str, String str2) {
        m23330a(5, str, str2);
    }

    public void wtf(String str, String str2) {
        m23330a(6, str, str2);
    }

    /* renamed from: a */
    private void m23330a(int i, String str, String str2) {
        Log.println(i, m23327a(str), str2);
    }

    /* renamed from: d */
    public void mo25671d(String str, String str2, Throwable th) {
        m23331a(3, str, str2, th);
    }

    /* renamed from: e */
    public void mo25673e(String str, String str2, Throwable th) {
        m23331a(6, str, str2, th);
    }

    /* renamed from: i */
    public void mo25676i(String str, String str2, Throwable th) {
        m23331a(4, str, str2, th);
    }

    /* renamed from: v */
    public void mo25681v(String str, String str2, Throwable th) {
        m23331a(2, str, str2, th);
    }

    /* renamed from: w */
    public void mo25683w(String str, String str2, Throwable th) {
        m23331a(5, str, str2, th);
    }

    public void wtf(String str, String str2, Throwable th) {
        m23331a(6, str, str2, th);
    }

    /* renamed from: a */
    private void m23331a(int i, String str, String str2, Throwable th) {
        Log.println(i, m23327a(str), m23328a(str2, th));
    }

    /* renamed from: a */
    private String m23327a(String str) {
        if (this.f24718a == null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f24718a);
        sb.append(":");
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: a */
    private static String m23328a(String str, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(10);
        sb.append(m23329a(th));
        return sb.toString();
    }

    /* renamed from: a */
    private static String m23329a(Throwable th) {
        if (th == null) {
            return "";
        }
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }
}
