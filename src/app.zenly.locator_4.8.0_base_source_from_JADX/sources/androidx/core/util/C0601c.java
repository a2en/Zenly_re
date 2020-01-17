package androidx.core.util;

import android.util.Log;
import java.io.Writer;

/* renamed from: androidx.core.util.c */
public class C0601c extends Writer {

    /* renamed from: e */
    private final String f2727e;

    /* renamed from: f */
    private StringBuilder f2728f = new StringBuilder(128);

    public C0601c(String str) {
        this.f2727e = str;
    }

    /* renamed from: a */
    private void m2766a() {
        if (this.f2728f.length() > 0) {
            Log.d(this.f2727e, this.f2728f.toString());
            StringBuilder sb = this.f2728f;
            sb.delete(0, sb.length());
        }
    }

    public void close() {
        m2766a();
    }

    public void flush() {
        m2766a();
    }

    public void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == 10) {
                m2766a();
            } else {
                this.f2728f.append(c);
            }
        }
    }
}
