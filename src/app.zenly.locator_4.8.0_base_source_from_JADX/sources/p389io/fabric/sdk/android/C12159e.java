package p389io.fabric.sdk.android;

import android.os.SystemClock;
import android.text.TextUtils;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Callable;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import p389io.fabric.sdk.android.services.common.C12180h;

/* renamed from: io.fabric.sdk.android.e */
class C12159e implements Callable<Map<String, C12162h>> {

    /* renamed from: e */
    final String f31604e;

    C12159e(String str) {
        this.f31604e = str;
    }

    /* renamed from: a */
    private C12162h m32132a(ZipEntry zipEntry, ZipFile zipFile) {
        InputStream inputStream;
        try {
            inputStream = zipFile.getInputStream(zipEntry);
            try {
                Properties properties = new Properties();
                properties.load(inputStream);
                String property = properties.getProperty("fabric-identifier");
                String property2 = properties.getProperty("fabric-version");
                String property3 = properties.getProperty("fabric-build-type");
                if (TextUtils.isEmpty(property) || TextUtils.isEmpty(property2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid format of fabric file,");
                    sb.append(zipEntry.getName());
                    throw new IllegalStateException(sb.toString());
                }
                C12162h hVar = new C12162h(property, property2, property3);
                C12180h.m32253a((Closeable) inputStream);
                return hVar;
            } catch (IOException e) {
                e = e;
                try {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Error when parsing fabric properties ");
                    sb2.append(zipEntry.getName());
                    C12154c.m32113f().mo35957e("Fabric", sb2.toString(), e);
                    C12180h.m32253a((Closeable) inputStream);
                    return null;
                } catch (Throwable th) {
                    th = th;
                    C12180h.m32253a((Closeable) inputStream);
                    throw th;
                }
            }
        } catch (IOException e2) {
            e = e2;
            inputStream = null;
            StringBuilder sb22 = new StringBuilder();
            sb22.append("Error when parsing fabric properties ");
            sb22.append(zipEntry.getName());
            C12154c.m32113f().mo35957e("Fabric", sb22.toString(), e);
            C12180h.m32253a((Closeable) inputStream);
            return null;
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
            C12180h.m32253a((Closeable) inputStream);
            throw th;
        }
    }

    /* renamed from: b */
    private Map<String, C12162h> m32133b() {
        HashMap hashMap = new HashMap();
        try {
            Class.forName("com.google.android.gms.ads.AdView");
            C12162h hVar = new C12162h("com.google.firebase.firebase-ads", "0.0.0", "binary");
            hashMap.put(hVar.mo36019b(), hVar);
            C12154c.m32113f().mo35965v("Fabric", "Found kit: com.google.firebase.firebase-ads");
        } catch (Exception unused) {
        }
        return hashMap;
    }

    /* renamed from: c */
    private Map<String, C12162h> m32134c() throws Exception {
        HashMap hashMap = new HashMap();
        ZipFile a = mo35998a();
        Enumeration entries = a.entries();
        while (entries.hasMoreElements()) {
            ZipEntry zipEntry = (ZipEntry) entries.nextElement();
            if (zipEntry.getName().startsWith("fabric/") && zipEntry.getName().length() > 7) {
                C12162h a2 = m32132a(zipEntry, a);
                if (a2 != null) {
                    hashMap.put(a2.mo36019b(), a2);
                    C12154c.m32113f().mo35965v("Fabric", String.format("Found kit:[%s] version:[%s]", new Object[]{a2.mo36019b(), a2.mo36020c()}));
                }
            }
        }
        if (a != null) {
            try {
                a.close();
            } catch (IOException unused) {
            }
        }
        return hashMap;
    }

    public Map<String, C12162h> call() throws Exception {
        HashMap hashMap = new HashMap();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        hashMap.putAll(m32133b());
        hashMap.putAll(m32134c());
        Logger f = C12154c.m32113f();
        StringBuilder sb = new StringBuilder();
        sb.append("finish scanning in ");
        sb.append(SystemClock.elapsedRealtime() - elapsedRealtime);
        f.mo35965v("Fabric", sb.toString());
        return hashMap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public ZipFile mo35998a() throws IOException {
        return new ZipFile(this.f31604e);
    }
}
