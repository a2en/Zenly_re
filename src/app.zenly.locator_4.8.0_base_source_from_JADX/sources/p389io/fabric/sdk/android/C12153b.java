package p389io.fabric.sdk.android;

import android.util.Log;

/* renamed from: io.fabric.sdk.android.b */
public class C12153b implements Logger {

    /* renamed from: a */
    private int f31575a;

    public C12153b(int i) {
        this.f31575a = i;
    }

    /* renamed from: d */
    public void mo35955d(String str, String str2, Throwable th) {
        if (isLoggable(str, 3)) {
            Log.d(str, str2, th);
        }
    }

    /* renamed from: e */
    public void mo35957e(String str, String str2, Throwable th) {
        if (isLoggable(str, 6)) {
            Log.e(str, str2, th);
        }
    }

    public int getLogLevel() {
        return this.f31575a;
    }

    /* renamed from: i */
    public void mo35960i(String str, String str2, Throwable th) {
        if (isLoggable(str, 4)) {
            Log.i(str, str2, th);
        }
    }

    public boolean isLoggable(String str, int i) {
        return this.f31575a <= i || Log.isLoggable(str, i);
    }

    public void log(int i, String str, String str2) {
        log(i, str, str2, false);
    }

    public void setLogLevel(int i) {
        this.f31575a = i;
    }

    /* renamed from: v */
    public void mo35966v(String str, String str2, Throwable th) {
        if (isLoggable(str, 2)) {
            Log.v(str, str2, th);
        }
    }

    /* renamed from: w */
    public void mo35968w(String str, String str2, Throwable th) {
        if (isLoggable(str, 5)) {
            Log.w(str, str2, th);
        }
    }

    public void log(int i, String str, String str2, boolean z) {
        if (z || isLoggable(str, i)) {
            Log.println(i, str, str2);
        }
    }

    public C12153b() {
        this.f31575a = 4;
    }

    /* renamed from: d */
    public void mo35954d(String str, String str2) {
        mo35955d(str, str2, null);
    }

    /* renamed from: e */
    public void mo35956e(String str, String str2) {
        mo35957e(str, str2, null);
    }

    /* renamed from: i */
    public void mo35959i(String str, String str2) {
        mo35960i(str, str2, null);
    }

    /* renamed from: v */
    public void mo35965v(String str, String str2) {
        mo35966v(str, str2, null);
    }

    /* renamed from: w */
    public void mo35967w(String str, String str2) {
        mo35968w(str, str2, null);
    }
}
