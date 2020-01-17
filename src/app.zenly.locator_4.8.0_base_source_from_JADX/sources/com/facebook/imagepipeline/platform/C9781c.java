package com.facebook.imagepipeline.platform;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.os.MemoryFile;
import com.facebook.common.internal.C9522a;
import com.facebook.common.internal.C9525b;
import com.facebook.common.internal.C9542m;
import com.facebook.common.memory.C9548d;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.common.references.CloseableReference;
import com.facebook.common.webp.C9560a;
import com.facebook.common.webp.WebpBitmapFactory;
import com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder;
import java.io.Closeable;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Method;
import p333g.p339c.p340a.p343c.C12029a;

/* renamed from: com.facebook.imagepipeline.platform.c */
public class C9781c extends DalvikPurgeableDecoder {

    /* renamed from: d */
    private static Method f25692d;

    /* renamed from: c */
    private final WebpBitmapFactory f25693c = C9560a.m23401b();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Bitmap mo26558a(CloseableReference<PooledByteBuffer> closeableReference, Options options) {
        return m24280a(closeableReference, ((PooledByteBuffer) closeableReference.mo25724b()).size(), null, options);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Bitmap mo26557a(CloseableReference<PooledByteBuffer> closeableReference, int i, Options options) {
        return m24280a(closeableReference, i, DalvikPurgeableDecoder.m24263a(closeableReference, i) ? null : DalvikPurgeableDecoder.f25677b, options);
    }

    /* renamed from: a */
    private static MemoryFile m24281a(CloseableReference<PooledByteBuffer> closeableReference, int i, byte[] bArr) throws IOException {
        Closeable closeable;
        InputStream inputStream;
        InputStream inputStream2 = null;
        MemoryFile memoryFile = new MemoryFile(null, (bArr == null ? 0 : bArr.length) + i);
        memoryFile.allowPurging(false);
        try {
            inputStream = new C9548d((PooledByteBuffer) closeableReference.mo25724b());
            try {
                C12029a aVar = new C12029a(inputStream, i);
                try {
                    OutputStream outputStream = memoryFile.getOutputStream();
                    C9522a.m23248a((InputStream) aVar, outputStream);
                    if (bArr != null) {
                        memoryFile.writeBytes(bArr, 0, i, bArr.length);
                    }
                    CloseableReference.m23355b(closeableReference);
                    C9525b.m23253a(inputStream);
                    C9525b.m23253a(aVar);
                    C9525b.m23252a(outputStream, true);
                    return memoryFile;
                } catch (Throwable th) {
                    th = th;
                    closeable = null;
                    inputStream2 = aVar;
                    CloseableReference.m23355b(closeableReference);
                    C9525b.m23253a(inputStream);
                    C9525b.m23253a(inputStream2);
                    C9525b.m23252a(closeable, true);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                closeable = null;
                CloseableReference.m23355b(closeableReference);
                C9525b.m23253a(inputStream);
                C9525b.m23253a(inputStream2);
                C9525b.m23252a(closeable, true);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            closeable = null;
            inputStream = null;
            CloseableReference.m23355b(closeableReference);
            C9525b.m23253a(inputStream);
            C9525b.m23253a(inputStream2);
            C9525b.m23252a(closeable, true);
            throw th;
        }
    }

    /* renamed from: a */
    private synchronized Method m24283a() {
        if (f25692d == null) {
            try {
                f25692d = MemoryFile.class.getDeclaredMethod("getFileDescriptor", new Class[0]);
            } catch (Exception e) {
                C9542m.m23285a(e);
                throw null;
            }
        }
        return f25692d;
    }

    /* renamed from: a */
    private FileDescriptor m24282a(MemoryFile memoryFile) {
        try {
            return (FileDescriptor) m24283a().invoke(memoryFile, new Object[0]);
        } catch (Exception e) {
            C9542m.m23285a(e);
            throw null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0037  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.Bitmap m24280a(com.facebook.common.references.CloseableReference<com.facebook.common.memory.PooledByteBuffer> r2, int r3, byte[] r4, android.graphics.BitmapFactory.Options r5) {
        /*
            r1 = this;
            r0 = 0
            android.os.MemoryFile r2 = m24281a(r2, r3, r4)     // Catch:{ IOException -> 0x002f, all -> 0x002c }
            java.io.FileDescriptor r3 = r1.m24282a(r2)     // Catch:{ IOException -> 0x002a }
            com.facebook.common.webp.WebpBitmapFactory r4 = r1.f25693c     // Catch:{ IOException -> 0x002a }
            if (r4 == 0) goto L_0x0020
            com.facebook.common.webp.WebpBitmapFactory r4 = r1.f25693c     // Catch:{ IOException -> 0x002a }
            android.graphics.Bitmap r3 = r4.decodeFileDescriptor(r3, r0, r5)     // Catch:{ IOException -> 0x002a }
            java.lang.String r4 = "BitmapFactory returned null"
            com.facebook.common.internal.C9536j.m23272a(r3, r4)     // Catch:{ IOException -> 0x002a }
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3     // Catch:{ IOException -> 0x002a }
            if (r2 == 0) goto L_0x001f
            r2.close()
        L_0x001f:
            return r3
        L_0x0020:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x002a }
            java.lang.String r4 = "WebpBitmapFactory is null"
            r3.<init>(r4)     // Catch:{ IOException -> 0x002a }
            throw r3     // Catch:{ IOException -> 0x002a }
        L_0x0028:
            r3 = move-exception
            goto L_0x0035
        L_0x002a:
            r3 = move-exception
            goto L_0x0031
        L_0x002c:
            r3 = move-exception
            r2 = r0
            goto L_0x0035
        L_0x002f:
            r3 = move-exception
            r2 = r0
        L_0x0031:
            com.facebook.common.internal.C9542m.m23285a(r3)     // Catch:{ all -> 0x0028 }
            throw r0
        L_0x0035:
            if (r2 == 0) goto L_0x003a
            r2.close()
        L_0x003a:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.platform.C9781c.m24280a(com.facebook.common.references.CloseableReference, int, byte[], android.graphics.BitmapFactory$Options):android.graphics.Bitmap");
    }
}
