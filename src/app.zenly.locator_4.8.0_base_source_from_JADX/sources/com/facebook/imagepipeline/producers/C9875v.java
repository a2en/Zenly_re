package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import android.database.Cursor;
import android.graphics.Rect;
import android.media.ExifInterface;
import android.net.Uri;
import com.facebook.common.logging.C9543a;
import com.facebook.common.memory.PooledByteBufferFactory;
import com.facebook.common.util.C9559e;
import com.facebook.imagepipeline.common.C9701e;
import com.facebook.imagepipeline.image.C9732e;
import com.facebook.imagepipeline.request.C9884a;
import com.facebook.imageutils.C9899c;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.imagepipeline.producers.v */
public class C9875v extends C9879x implements ThumbnailProducer<C9732e> {

    /* renamed from: d */
    private static final Class<?> f25930d = C9875v.class;

    /* renamed from: e */
    private static final String[] f25931e;

    /* renamed from: f */
    private static final String[] f25932f;

    /* renamed from: g */
    private static final Rect f25933g = new Rect(0, 0, 512, 384);

    /* renamed from: h */
    private static final Rect f25934h = new Rect(0, 0, 96, 96);

    /* renamed from: c */
    private final ContentResolver f25935c;

    static {
        String str = "_data";
        f25931e = new String[]{"_id", str};
        f25932f = new String[]{str};
    }

    public C9875v(Executor executor, PooledByteBufferFactory pooledByteBufferFactory, ContentResolver contentResolver) {
        super(executor, pooledByteBufferFactory);
        this.f25935c = contentResolver;
    }

    /* renamed from: b */
    private static int m24615b(String str) {
        if (str != null) {
            try {
                return C9899c.m24738a(new ExifInterface(str).getAttributeInt("Orientation", 1));
            } catch (IOException e) {
                C9543a.m23307a(f25930d, (Throwable) e, "Unable to retrieve thumbnail rotation for %s", str);
            }
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C9732e mo26645a(C9884a aVar) throws IOException {
        Uri p = aVar.mo26743p();
        if (C9559e.m23388d(p)) {
            C9732e a = m24613a(p, aVar.mo26739l());
            if (a != null) {
                return a;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo26646a() {
        return "LocalContentUriThumbnailFetchProducer";
    }

    public boolean canProvideImageForSize(C9701e eVar) {
        return C9861o0.m24554a(f25933g.width(), f25933g.height(), eVar);
    }

    /* renamed from: a */
    private C9732e m24613a(Uri uri, C9701e eVar) throws IOException {
        Cursor query = this.f25935c.query(uri, f25931e, null, null, null);
        if (query == null) {
            return null;
        }
        try {
            if (query.getCount() == 0) {
                return null;
            }
            query.moveToFirst();
            String string = query.getString(query.getColumnIndex("_data"));
            if (eVar != null) {
                C9732e a = m24614a(eVar, query.getInt(query.getColumnIndex("_id")));
                if (a != null) {
                    a.mo26429e(m24615b(string));
                    query.close();
                    return a;
                }
            }
            query.close();
            return null;
        } finally {
            query.close();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0056  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.facebook.imagepipeline.image.C9732e m24614a(com.facebook.imagepipeline.common.C9701e r5, int r6) throws java.io.IOException {
        /*
            r4 = this;
            int r5 = m24611a(r5)
            r0 = 0
            if (r5 != 0) goto L_0x0008
            return r0
        L_0x0008:
            android.content.ContentResolver r1 = r4.f25935c     // Catch:{ all -> 0x0052 }
            long r2 = (long) r6     // Catch:{ all -> 0x0052 }
            java.lang.String[] r6 = f25932f     // Catch:{ all -> 0x0052 }
            android.database.Cursor r5 = android.provider.MediaStore.Images.Thumbnails.queryMiniThumbnail(r1, r2, r5, r6)     // Catch:{ all -> 0x0052 }
            if (r5 != 0) goto L_0x0019
            if (r5 == 0) goto L_0x0018
            r5.close()
        L_0x0018:
            return r0
        L_0x0019:
            r5.moveToFirst()     // Catch:{ all -> 0x0050 }
            int r6 = r5.getCount()     // Catch:{ all -> 0x0050 }
            if (r6 <= 0) goto L_0x004a
            java.lang.String r6 = "_data"
            int r6 = r5.getColumnIndex(r6)     // Catch:{ all -> 0x0050 }
            java.lang.String r6 = r5.getString(r6)     // Catch:{ all -> 0x0050 }
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x0050 }
            r1.<init>(r6)     // Catch:{ all -> 0x0050 }
            boolean r1 = r1.exists()     // Catch:{ all -> 0x0050 }
            if (r1 == 0) goto L_0x004a
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ all -> 0x0050 }
            r0.<init>(r6)     // Catch:{ all -> 0x0050 }
            int r6 = m24612a(r6)     // Catch:{ all -> 0x0050 }
            com.facebook.imagepipeline.image.e r6 = r4.mo26688b(r0, r6)     // Catch:{ all -> 0x0050 }
            if (r5 == 0) goto L_0x0049
            r5.close()
        L_0x0049:
            return r6
        L_0x004a:
            if (r5 == 0) goto L_0x004f
            r5.close()
        L_0x004f:
            return r0
        L_0x0050:
            r6 = move-exception
            goto L_0x0054
        L_0x0052:
            r6 = move-exception
            r5 = r0
        L_0x0054:
            if (r5 == 0) goto L_0x0059
            r5.close()
        L_0x0059:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.producers.C9875v.m24614a(com.facebook.imagepipeline.common.e, int):com.facebook.imagepipeline.image.e");
    }

    /* renamed from: a */
    private static int m24611a(C9701e eVar) {
        if (C9861o0.m24554a(f25934h.width(), f25934h.height(), eVar)) {
            return 3;
        }
        return C9861o0.m24554a(f25933g.width(), f25933g.height(), eVar) ? 1 : 0;
    }

    /* renamed from: a */
    private static int m24612a(String str) {
        if (str == null) {
            return -1;
        }
        return (int) new File(str).length();
    }
}
