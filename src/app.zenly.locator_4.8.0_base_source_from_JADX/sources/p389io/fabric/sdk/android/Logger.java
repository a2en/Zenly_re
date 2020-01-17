package p389io.fabric.sdk.android;

/* renamed from: io.fabric.sdk.android.Logger */
public interface Logger {
    /* renamed from: d */
    void mo35954d(String str, String str2);

    /* renamed from: d */
    void mo35955d(String str, String str2, Throwable th);

    /* renamed from: e */
    void mo35956e(String str, String str2);

    /* renamed from: e */
    void mo35957e(String str, String str2, Throwable th);

    int getLogLevel();

    /* renamed from: i */
    void mo35959i(String str, String str2);

    /* renamed from: i */
    void mo35960i(String str, String str2, Throwable th);

    boolean isLoggable(String str, int i);

    void log(int i, String str, String str2);

    void log(int i, String str, String str2, boolean z);

    void setLogLevel(int i);

    /* renamed from: v */
    void mo35965v(String str, String str2);

    /* renamed from: v */
    void mo35966v(String str, String str2, Throwable th);

    /* renamed from: w */
    void mo35967w(String str, String str2);

    /* renamed from: w */
    void mo35968w(String str, String str2, Throwable th);
}
