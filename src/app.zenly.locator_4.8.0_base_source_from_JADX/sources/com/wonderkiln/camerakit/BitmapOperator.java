package com.wonderkiln.camerakit;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;

public class BitmapOperator {

    /* renamed from: a */
    private ByteBuffer f31128a;

    static {
        System.loadLibrary("JniBitmapOperator");
    }

    private BitmapOperator() {
    }

    /* renamed from: a */
    private void m31433a(Bitmap bitmap) {
        if (this.f31128a != null) {
            m31434c();
        }
        this.f31128a = jniStoreBitmapData(bitmap);
    }

    private native void jniCropBitmap(ByteBuffer byteBuffer, int i, int i2, int i3, int i4);

    private native void jniFlipBitmapHorizontal(ByteBuffer byteBuffer);

    private native void jniFlipBitmapVertical(ByteBuffer byteBuffer);

    private native void jniFreeBitmapData(ByteBuffer byteBuffer);

    private native Bitmap jniGetBitmapFromStoredBitmapData(ByteBuffer byteBuffer);

    private native byte[] jniGetJpegData(ByteBuffer byteBuffer, int i);

    private native void jniRotateBitmap180(ByteBuffer byteBuffer);

    private native void jniRotateBitmapCcw90(ByteBuffer byteBuffer);

    private native void jniRotateBitmapCw90(ByteBuffer byteBuffer);

    private native ByteBuffer jniStoreBitmapData(Bitmap bitmap);

    /* renamed from: b */
    public void mo35466b() {
        ByteBuffer byteBuffer = this.f31128a;
        if (byteBuffer != null) {
            jniFlipBitmapVertical(byteBuffer);
        }
    }

    /* renamed from: c */
    public void mo35468c(int i) {
        ByteBuffer byteBuffer = this.f31128a;
        if (byteBuffer != null) {
            if (i == 90) {
                jniRotateBitmapCw90(byteBuffer);
            } else if (i == 180) {
                jniRotateBitmap180(byteBuffer);
            } else if (i == 270) {
                jniRotateBitmapCcw90(byteBuffer);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        super.finalize();
        if (this.f31128a != null) {
            m31434c();
        }
    }

    public BitmapOperator(Bitmap bitmap) {
        m31433a(bitmap);
    }

    /* renamed from: a */
    public void mo35464a(int i, int i2, int i3, int i4) {
        ByteBuffer byteBuffer = this.f31128a;
        if (byteBuffer != null) {
            jniCropBitmap(byteBuffer, i, i2, i3, i4);
        }
    }

    /* renamed from: b */
    public byte[] mo35467b(int i) {
        byte[] a = mo35465a(i);
        m31434c();
        return a;
    }

    /* renamed from: c */
    private void m31434c() {
        ByteBuffer byteBuffer = this.f31128a;
        if (byteBuffer != null) {
            jniFreeBitmapData(byteBuffer);
            this.f31128a = null;
        }
    }

    /* renamed from: a */
    public void mo35463a() {
        ByteBuffer byteBuffer = this.f31128a;
        if (byteBuffer != null) {
            jniFlipBitmapHorizontal(byteBuffer);
        }
    }

    /* renamed from: a */
    public byte[] mo35465a(int i) {
        ByteBuffer byteBuffer = this.f31128a;
        if (byteBuffer == null) {
            return null;
        }
        return jniGetJpegData(byteBuffer, i);
    }
}
