package com.facebook.common.logging;

public interface LoggingDelegate {
    /* renamed from: d */
    void mo25670d(String str, String str2);

    /* renamed from: d */
    void mo25671d(String str, String str2, Throwable th);

    /* renamed from: e */
    void mo25672e(String str, String str2);

    /* renamed from: e */
    void mo25673e(String str, String str2, Throwable th);

    int getMinimumLoggingLevel();

    /* renamed from: i */
    void mo25675i(String str, String str2);

    /* renamed from: i */
    void mo25676i(String str, String str2, Throwable th);

    boolean isLoggable(int i);

    void log(int i, String str, String str2);

    void setMinimumLoggingLevel(int i);

    /* renamed from: v */
    void mo25680v(String str, String str2);

    /* renamed from: v */
    void mo25681v(String str, String str2, Throwable th);

    /* renamed from: w */
    void mo25682w(String str, String str2);

    /* renamed from: w */
    void mo25683w(String str, String str2, Throwable th);

    void wtf(String str, String str2);

    void wtf(String str, String str2, Throwable th);
}
