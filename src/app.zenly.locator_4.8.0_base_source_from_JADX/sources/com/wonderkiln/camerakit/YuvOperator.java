package com.wonderkiln.camerakit;

import java.nio.ByteBuffer;

public class YuvOperator {

    /* renamed from: a */
    private ByteBuffer f31168a;

    static {
        System.loadLibrary("JniYuvOperator");
    }

    private YuvOperator() {
    }

    /* renamed from: a */
    private void m31467a(byte[] bArr, int i, int i2) {
        if (this.f31168a != null) {
            m31468b();
        }
        this.f31168a = jniStoreYuvData(bArr, i, i2);
    }

    /* renamed from: b */
    private void m31468b() {
        ByteBuffer byteBuffer = this.f31168a;
        if (byteBuffer != null) {
            jniFreeYuvData(byteBuffer);
            this.f31168a = null;
        }
    }

    private native void jniFreeYuvData(ByteBuffer byteBuffer);

    private native byte[] jniGetYuvData(ByteBuffer byteBuffer);

    private native void jniRotateYuv180(ByteBuffer byteBuffer);

    private native void jniRotateYuvCcw90(ByteBuffer byteBuffer);

    private native void jniRotateYuvCw90(ByteBuffer byteBuffer);

    private native ByteBuffer jniStoreYuvData(byte[] bArr, int i, int i2);

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        super.finalize();
        if (this.f31168a != null) {
            m31468b();
        }
    }

    public YuvOperator(byte[] bArr, int i, int i2) {
        m31467a(bArr, i, i2);
    }

    /* renamed from: a */
    public void mo35523a(int i) {
        ByteBuffer byteBuffer = this.f31168a;
        if (byteBuffer != null) {
            if (i == 90) {
                jniRotateYuvCw90(byteBuffer);
            } else if (i == 180) {
                jniRotateYuv180(byteBuffer);
            } else if (i == 270) {
                jniRotateYuvCcw90(byteBuffer);
            }
        }
    }

    /* renamed from: a */
    public byte[] mo35524a() {
        byte[] jniGetYuvData = jniGetYuvData(this.f31168a);
        m31468b();
        return jniGetYuvData;
    }
}
