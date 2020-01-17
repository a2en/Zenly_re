package com.crashlytics.android.core;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import p389io.fabric.sdk.android.C12154c;
import p389io.fabric.sdk.android.Logger;
import p389io.fabric.sdk.android.services.common.C12180h;
import p389io.fabric.sdk.android.services.common.QueueFile;
import p389io.fabric.sdk.android.services.common.QueueFile.ElementReader;

/* renamed from: com.crashlytics.android.core.j0 */
class C9334j0 implements C9423x {

    /* renamed from: a */
    private final File f24203a;

    /* renamed from: b */
    private final int f24204b;

    /* renamed from: c */
    private QueueFile f24205c;

    /* renamed from: com.crashlytics.android.core.j0$a */
    class C9335a implements ElementReader {

        /* renamed from: a */
        final /* synthetic */ byte[] f24206a;

        /* renamed from: b */
        final /* synthetic */ int[] f24207b;

        C9335a(C9334j0 j0Var, byte[] bArr, int[] iArr) {
            this.f24206a = bArr;
            this.f24207b = iArr;
        }

        public void read(InputStream inputStream, int i) throws IOException {
            try {
                inputStream.read(this.f24206a, this.f24207b[0], i);
                int[] iArr = this.f24207b;
                iArr[0] = iArr[0] + i;
            } finally {
                inputStream.close();
            }
        }
    }

    /* renamed from: com.crashlytics.android.core.j0$b */
    public class C9336b {

        /* renamed from: a */
        public final byte[] f24208a;

        /* renamed from: b */
        public final int f24209b;

        public C9336b(C9334j0 j0Var, byte[] bArr, int i) {
            this.f24208a = bArr;
            this.f24209b = i;
        }
    }

    public C9334j0(File file, int i) {
        this.f24203a = file;
        this.f24204b = i;
    }

    /* renamed from: e */
    private C9336b m22544e() {
        if (!this.f24203a.exists()) {
            return null;
        }
        m22545f();
        QueueFile queueFile = this.f24205c;
        if (queueFile == null) {
            return null;
        }
        int[] iArr = {0};
        byte[] bArr = new byte[queueFile.mo36039d()];
        try {
            this.f24205c.mo36032a((ElementReader) new C9335a(this, bArr, iArr));
        } catch (IOException e) {
            C12154c.m32113f().mo35957e("CrashlyticsCore", "A problem occurred while reading the Crashlytics log file.", e);
        }
        return new C9336b(this, bArr, iArr[0]);
    }

    /* renamed from: f */
    private void m22545f() {
        if (this.f24205c == null) {
            try {
                this.f24205c = new QueueFile(this.f24203a);
            } catch (IOException e) {
                Logger f = C12154c.m32113f();
                StringBuilder sb = new StringBuilder();
                sb.append("Could not open log file: ");
                sb.append(this.f24203a);
                f.mo35957e("CrashlyticsCore", sb.toString(), e);
            }
        }
    }

    /* renamed from: a */
    public void mo25054a(long j, String str) {
        m22545f();
        m22543b(j, str);
    }

    /* renamed from: b */
    public C9311d mo25055b() {
        C9336b e = m22544e();
        if (e == null) {
            return null;
        }
        return C9311d.m22451a(e.f24208a, 0, e.f24209b);
    }

    /* renamed from: c */
    public byte[] mo25056c() {
        C9336b e = m22544e();
        if (e == null) {
            return null;
        }
        return e.f24208a;
    }

    /* renamed from: d */
    public void mo25057d() {
        mo25053a();
        this.f24203a.delete();
    }

    /* renamed from: b */
    private void m22543b(long j, String str) {
        String str2 = " ";
        if (this.f24205c != null) {
            if (str == null) {
                str = "null";
            }
            try {
                int i = this.f24204b / 4;
                if (str.length() > i) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("...");
                    sb.append(str.substring(str.length() - i));
                    str = sb.toString();
                }
                this.f24205c.mo36033a(String.format(Locale.US, "%d %s%n", new Object[]{Long.valueOf(j), str.replaceAll("\r", str2).replaceAll("\n", str2)}).getBytes("UTF-8"));
                while (!this.f24205c.mo36036b() && this.f24205c.mo36039d() > this.f24204b) {
                    this.f24205c.mo36037c();
                }
            } catch (IOException e) {
                C12154c.m32113f().mo35957e("CrashlyticsCore", "There was a problem writing to the Crashlytics log.", e);
            }
        }
    }

    /* renamed from: a */
    public void mo25053a() {
        C12180h.m32254a((Closeable) this.f24205c, "There was a problem closing the Crashlytics log file.");
        this.f24205c = null;
    }
}
