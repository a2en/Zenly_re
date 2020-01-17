package com.wonderkiln.camerakit;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

/* renamed from: com.wonderkiln.camerakit.g */
public class C11972g extends C11970e {

    /* renamed from: d */
    private byte[] f31211d;

    C11972g(byte[] bArr) {
        super("CKImageCapturedEvent");
        this.f31211d = bArr;
    }

    /* renamed from: d */
    public Bitmap mo35559d() {
        byte[] bArr = this.f31211d;
        return BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
    }

    /* renamed from: e */
    public byte[] mo35560e() {
        return this.f31211d;
    }
}
