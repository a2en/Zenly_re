package com.facebook.imagepipeline.platform;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import com.facebook.common.internal.C9536j;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.memory.C9759o;
import com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder;

@TargetApi(19)
/* renamed from: com.facebook.imagepipeline.platform.d */
public class C9782d extends DalvikPurgeableDecoder {

    /* renamed from: c */
    private final C9759o f25694c;

    public C9782d(C9759o oVar) {
        this.f25694c = oVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Bitmap mo26558a(CloseableReference<PooledByteBuffer> closeableReference, Options options) {
        PooledByteBuffer pooledByteBuffer = (PooledByteBuffer) closeableReference.mo25724b();
        int size = pooledByteBuffer.size();
        CloseableReference a = this.f25694c.mo26544a(size);
        try {
            byte[] bArr = (byte[]) a.mo25724b();
            pooledByteBuffer.read(0, bArr, 0, size);
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, size, options);
            C9536j.m23272a(decodeByteArray, (Object) "BitmapFactory returned null");
            return decodeByteArray;
        } finally {
            CloseableReference.m23355b(a);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Bitmap mo26557a(CloseableReference<PooledByteBuffer> closeableReference, int i, Options options) {
        byte[] bArr = DalvikPurgeableDecoder.m24263a(closeableReference, i) ? null : DalvikPurgeableDecoder.f25677b;
        PooledByteBuffer pooledByteBuffer = (PooledByteBuffer) closeableReference.mo25724b();
        C9536j.m23275a(i <= pooledByteBuffer.size());
        int i2 = i + 2;
        CloseableReference a = this.f25694c.mo26544a(i2);
        try {
            byte[] bArr2 = (byte[]) a.mo25724b();
            pooledByteBuffer.read(0, bArr2, 0, i);
            if (bArr != null) {
                m24286a(bArr2, i);
                i = i2;
            }
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr2, 0, i, options);
            C9536j.m23272a(decodeByteArray, (Object) "BitmapFactory returned null");
            return decodeByteArray;
        } finally {
            CloseableReference.m23355b(a);
        }
    }

    /* renamed from: a */
    private static void m24286a(byte[] bArr, int i) {
        bArr[i] = -1;
        bArr[i + 1] = -39;
    }
}
