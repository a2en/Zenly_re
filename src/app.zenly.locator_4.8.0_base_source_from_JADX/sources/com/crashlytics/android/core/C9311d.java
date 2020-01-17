package com.crashlytics.android.core;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

/* renamed from: com.crashlytics.android.core.d */
final class C9311d {

    /* renamed from: a */
    private final byte[] f24169a;

    /* renamed from: b */
    private volatile int f24170b = 0;

    static {
        new C9311d(new byte[0]);
    }

    private C9311d(byte[] bArr) {
        this.f24169a = bArr;
    }

    /* renamed from: a */
    public static C9311d m22451a(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new C9311d(bArr2);
    }

    /* renamed from: b */
    public int mo25073b() {
        return this.f24169a.length;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C9311d)) {
            return false;
        }
        C9311d dVar = (C9311d) obj;
        byte[] bArr = this.f24169a;
        int length = bArr.length;
        byte[] bArr2 = dVar.f24169a;
        if (length != bArr2.length) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = this.f24170b;
        if (i == 0) {
            int i2 = r1;
            for (byte b : this.f24169a) {
                i2 = (i2 * 31) + b;
            }
            i = i2 == 0 ? 1 : i2;
            this.f24170b = i;
        }
        return i;
    }

    /* renamed from: a */
    public static C9311d m22450a(String str) {
        try {
            return new C9311d(str.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported.", e);
        }
    }

    /* renamed from: a */
    public void mo25072a(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.f24169a, i, bArr, i2, i3);
    }

    /* renamed from: a */
    public InputStream mo25071a() {
        return new ByteArrayInputStream(this.f24169a);
    }
}
