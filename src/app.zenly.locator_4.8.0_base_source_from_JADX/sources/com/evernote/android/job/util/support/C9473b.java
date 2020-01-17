package com.evernote.android.job.util.support;

import com.evernote.android.job.util.C9469c;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: com.evernote.android.job.util.support.b */
public final class C9473b {

    /* renamed from: b */
    private static final C9469c f24547b = new C9469c("PersistableBundleCompat");

    /* renamed from: a */
    private final Map<String, Object> f24548a;

    public C9473b() {
        this((Map<String, Object>) new HashMap<String,Object>());
    }

    /* renamed from: a */
    public String mo25446a(String str, String str2) {
        Object obj = this.f24548a.get(str);
        return obj instanceof String ? (String) obj : str2;
    }

    /* renamed from: b */
    public void mo25449b(String str, String str2) {
        this.f24548a.put(str, str2);
    }

    public C9473b(C9473b bVar) {
        this((Map<String, Object>) new HashMap<String,Object>(bVar.f24548a));
    }

    /* renamed from: b */
    public String mo25448b() {
        String str = "";
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            XmlUtils.m23060a((Map) this.f24548a, (OutputStream) byteArrayOutputStream);
            return byteArrayOutputStream.toString("UTF-8");
        } catch (IOException | XmlPullParserException e) {
            f24547b.mo25410a(e);
            return str;
        } catch (Error e2) {
            f24547b.mo25410a((Throwable) e2);
            return str;
        } finally {
            try {
                byteArrayOutputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    private C9473b(Map<String, Object> map) {
        this.f24548a = map;
    }

    /* renamed from: a */
    public Set<String> mo25447a() {
        return this.f24548a.keySet();
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0033 A[SYNTHETIC, Splitter:B:20:0x0033] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0046 A[SYNTHETIC, Splitter:B:28:0x0046] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x004c A[SYNTHETIC, Splitter:B:33:0x004c] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:17:0x0027=Splitter:B:17:0x0027, B:25:0x003a=Splitter:B:25:0x003a} */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.evernote.android.job.util.support.C9473b m23087a(java.lang.String r3) {
        /*
            r0 = 0
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream     // Catch:{ XmlPullParserException -> 0x0039, IOException -> 0x0037, VerifyError -> 0x0026 }
            java.lang.String r2 = "UTF-8"
            byte[] r3 = r3.getBytes(r2)     // Catch:{ XmlPullParserException -> 0x0039, IOException -> 0x0037, VerifyError -> 0x0026 }
            r1.<init>(r3)     // Catch:{ XmlPullParserException -> 0x0039, IOException -> 0x0037, VerifyError -> 0x0026 }
            java.util.HashMap r3 = com.evernote.android.job.util.support.XmlUtils.m23056a(r1)     // Catch:{ XmlPullParserException -> 0x0021, IOException -> 0x001f, VerifyError -> 0x001c, all -> 0x0019 }
            com.evernote.android.job.util.support.b r0 = new com.evernote.android.job.util.support.b     // Catch:{ XmlPullParserException -> 0x0021, IOException -> 0x001f, VerifyError -> 0x001c, all -> 0x0019 }
            r0.<init>(r3)     // Catch:{ XmlPullParserException -> 0x0021, IOException -> 0x001f, VerifyError -> 0x001c, all -> 0x0019 }
            r1.close()     // Catch:{ IOException -> 0x0018 }
        L_0x0018:
            return r0
        L_0x0019:
            r3 = move-exception
            r0 = r1
            goto L_0x004a
        L_0x001c:
            r3 = move-exception
            r0 = r1
            goto L_0x0027
        L_0x001f:
            r3 = move-exception
            goto L_0x0022
        L_0x0021:
            r3 = move-exception
        L_0x0022:
            r0 = r1
            goto L_0x003a
        L_0x0024:
            r3 = move-exception
            goto L_0x004a
        L_0x0026:
            r3 = move-exception
        L_0x0027:
            com.evernote.android.job.util.c r1 = f24547b     // Catch:{ all -> 0x0024 }
            r1.mo25410a(r3)     // Catch:{ all -> 0x0024 }
            com.evernote.android.job.util.support.b r3 = new com.evernote.android.job.util.support.b     // Catch:{ all -> 0x0024 }
            r3.<init>()     // Catch:{ all -> 0x0024 }
            if (r0 == 0) goto L_0x0036
            r0.close()     // Catch:{ IOException -> 0x0036 }
        L_0x0036:
            return r3
        L_0x0037:
            r3 = move-exception
            goto L_0x003a
        L_0x0039:
            r3 = move-exception
        L_0x003a:
            com.evernote.android.job.util.c r1 = f24547b     // Catch:{ all -> 0x0024 }
            r1.mo25410a(r3)     // Catch:{ all -> 0x0024 }
            com.evernote.android.job.util.support.b r3 = new com.evernote.android.job.util.support.b     // Catch:{ all -> 0x0024 }
            r3.<init>()     // Catch:{ all -> 0x0024 }
            if (r0 == 0) goto L_0x0049
            r0.close()     // Catch:{ IOException -> 0x0049 }
        L_0x0049:
            return r3
        L_0x004a:
            if (r0 == 0) goto L_0x004f
            r0.close()     // Catch:{ IOException -> 0x004f }
        L_0x004f:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.evernote.android.job.util.support.C9473b.m23087a(java.lang.String):com.evernote.android.job.util.support.b");
    }
}
