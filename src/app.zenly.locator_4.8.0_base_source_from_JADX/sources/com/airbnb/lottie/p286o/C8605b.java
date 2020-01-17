package com.airbnb.lottie.p286o;

import android.content.Context;
import com.airbnb.lottie.p289q.C8654d;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.airbnb.lottie.o.b */
class C8605b {

    /* renamed from: a */
    private final Context f22128a;

    /* renamed from: b */
    private final String f22129b;

    C8605b(Context context, String str) {
        this.f22128a = context.getApplicationContext();
        this.f22129b = str;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.core.util.C0603e<com.airbnb.lottie.p286o.C8604a, java.io.InputStream> mo23220a() {
        /*
            r5 = this;
            r0 = 0
            java.lang.String r1 = r5.f22129b     // Catch:{ FileNotFoundException -> 0x0048 }
            java.io.File r1 = r5.m20002a(r1)     // Catch:{ FileNotFoundException -> 0x0048 }
            if (r1 != 0) goto L_0x000a
            return r0
        L_0x000a:
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{  }
            r2.<init>(r1)     // Catch:{  }
            java.lang.String r0 = r1.getAbsolutePath()
            java.lang.String r3 = ".zip"
            boolean r0 = r0.endsWith(r3)
            if (r0 == 0) goto L_0x001e
            com.airbnb.lottie.o.a r0 = com.airbnb.lottie.p286o.C8604a.ZIP
            goto L_0x0020
        L_0x001e:
            com.airbnb.lottie.o.a r0 = com.airbnb.lottie.p286o.C8604a.JSON
        L_0x0020:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Cache hit for "
            r3.append(r4)
            java.lang.String r4 = r5.f22129b
            r3.append(r4)
            java.lang.String r4 = " at "
            r3.append(r4)
            java.lang.String r1 = r1.getAbsolutePath()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            com.airbnb.lottie.p289q.C8654d.m20153a(r1)
            androidx.core.util.e r1 = new androidx.core.util.e
            r1.<init>(r0, r2)
            return r1
        L_0x0048:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.p286o.C8605b.mo23220a():androidx.core.util.e");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public File mo23221a(InputStream inputStream, C8604a aVar) throws IOException {
        FileOutputStream fileOutputStream;
        File file = new File(this.f22128a.getCacheDir(), m20003a(this.f22129b, aVar, true));
        try {
            fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    inputStream.close();
                    return file;
                }
            }
        } catch (Throwable th) {
            inputStream.close();
            throw th;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo23222a(C8604a aVar) {
        File file = new File(this.f22128a.getCacheDir(), m20003a(this.f22129b, aVar, true));
        File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
        boolean renameTo = file.renameTo(file2);
        StringBuilder sb = new StringBuilder();
        sb.append("Copying temp file to real file (");
        sb.append(file2);
        sb.append(")");
        C8654d.m20153a(sb.toString());
        if (!renameTo) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unable to rename cache file ");
            sb2.append(file.getAbsolutePath());
            sb2.append(" to ");
            sb2.append(file2.getAbsolutePath());
            sb2.append(".");
            C8654d.m20155b(sb2.toString());
        }
    }

    /* renamed from: a */
    private File m20002a(String str) throws FileNotFoundException {
        File file = new File(this.f22128a.getCacheDir(), m20003a(str, C8604a.JSON, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(this.f22128a.getCacheDir(), m20003a(str, C8604a.ZIP, false));
        if (file2.exists()) {
            return file2;
        }
        return null;
    }

    /* renamed from: a */
    private static String m20003a(String str, C8604a aVar, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("lottie_cache_");
        sb.append(str.replaceAll("\\W+", ""));
        sb.append(z ? aVar.mo23218a() : aVar.f22127e);
        return sb.toString();
    }
}
