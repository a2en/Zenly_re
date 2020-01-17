package com.bumptech.glide.load.data.p293m;

import android.content.ContentResolver;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.load.C8885d;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* renamed from: com.bumptech.glide.load.data.m.e */
class C8909e {

    /* renamed from: f */
    private static final C8903a f23218f = new C8903a();

    /* renamed from: a */
    private final C8903a f23219a;

    /* renamed from: b */
    private final C8908d f23220b;

    /* renamed from: c */
    private final ArrayPool f23221c;

    /* renamed from: d */
    private final ContentResolver f23222d;

    /* renamed from: e */
    private final List<ImageHeaderParser> f23223e;

    C8909e(List<ImageHeaderParser> list, C8908d dVar, ArrayPool arrayPool, ContentResolver contentResolver) {
        this(list, f23218f, dVar, arrayPool, contentResolver);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0030 A[Catch:{ all -> 0x004a }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x004d  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m21383c(android.net.Uri r7) {
        /*
            r6 = this;
            java.lang.String r0 = "ThumbStreamOpener"
            r1 = 0
            com.bumptech.glide.load.data.m.d r2 = r6.f23220b     // Catch:{ SecurityException -> 0x0027, all -> 0x0024 }
            android.database.Cursor r2 = r2.mo24271a(r7)     // Catch:{ SecurityException -> 0x0027, all -> 0x0024 }
            if (r2 == 0) goto L_0x001e
            boolean r3 = r2.moveToFirst()     // Catch:{ SecurityException -> 0x001c }
            if (r3 == 0) goto L_0x001e
            r3 = 0
            java.lang.String r7 = r2.getString(r3)     // Catch:{ SecurityException -> 0x001c }
            if (r2 == 0) goto L_0x001b
            r2.close()
        L_0x001b:
            return r7
        L_0x001c:
            r3 = move-exception
            goto L_0x0029
        L_0x001e:
            if (r2 == 0) goto L_0x0023
            r2.close()
        L_0x0023:
            return r1
        L_0x0024:
            r7 = move-exception
            r2 = r1
            goto L_0x004b
        L_0x0027:
            r3 = move-exception
            r2 = r1
        L_0x0029:
            r4 = 3
            boolean r4 = android.util.Log.isLoggable(r0, r4)     // Catch:{ all -> 0x004a }
            if (r4 == 0) goto L_0x0044
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x004a }
            r4.<init>()     // Catch:{ all -> 0x004a }
            java.lang.String r5 = "Failed to query for thumbnail for Uri: "
            r4.append(r5)     // Catch:{ all -> 0x004a }
            r4.append(r7)     // Catch:{ all -> 0x004a }
            java.lang.String r7 = r4.toString()     // Catch:{ all -> 0x004a }
            android.util.Log.d(r0, r7, r3)     // Catch:{ all -> 0x004a }
        L_0x0044:
            if (r2 == 0) goto L_0x0049
            r2.close()
        L_0x0049:
            return r1
        L_0x004a:
            r7 = move-exception
        L_0x004b:
            if (r2 == 0) goto L_0x0050
            r2.close()
        L_0x0050:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.data.p293m.C8909e.m21383c(android.net.Uri):java.lang.String");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo24272a(Uri uri) {
        String str = "ThumbStreamOpener";
        InputStream inputStream = null;
        try {
            inputStream = this.f23222d.openInputStream(uri);
            int a = C8885d.m21327a(this.f23223e, inputStream, this.f23221c);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused) {
                }
            }
            return a;
        } catch (IOException | NullPointerException e) {
            inputStream = Log.isLoggable(str, 3);
            if (inputStream) {
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to open uri: ");
                sb.append(uri);
                Log.d(str, sb.toString(), e);
            }
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused2) {
                }
            }
            return -1;
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused3) {
                }
            }
        }
    }

    /* renamed from: b */
    public InputStream mo24273b(Uri uri) throws FileNotFoundException {
        String c = m21383c(uri);
        if (TextUtils.isEmpty(c)) {
            return null;
        }
        File a = this.f23219a.mo24268a(c);
        if (!m21382a(a)) {
            return null;
        }
        Uri fromFile = Uri.fromFile(a);
        try {
            return this.f23222d.openInputStream(fromFile);
        } catch (NullPointerException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("NPE opening uri: ");
            sb.append(uri);
            sb.append(" -> ");
            sb.append(fromFile);
            throw ((FileNotFoundException) new FileNotFoundException(sb.toString()).initCause(e));
        }
    }

    C8909e(List<ImageHeaderParser> list, C8903a aVar, C8908d dVar, ArrayPool arrayPool, ContentResolver contentResolver) {
        this.f23219a = aVar;
        this.f23220b = dVar;
        this.f23221c = arrayPool;
        this.f23222d = contentResolver;
        this.f23223e = list;
    }

    /* renamed from: a */
    private boolean m21382a(File file) {
        return this.f23219a.mo24269a(file) && 0 < this.f23219a.mo24270b(file);
    }
}
