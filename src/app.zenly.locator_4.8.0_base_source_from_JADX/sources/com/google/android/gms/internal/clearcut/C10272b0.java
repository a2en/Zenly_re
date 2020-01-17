package com.google.android.gms.internal.clearcut;

/* renamed from: com.google.android.gms.internal.clearcut.b0 */
final class C10272b0 extends C10305f0 {

    /* renamed from: i */
    private final int f26882i;

    /* renamed from: j */
    private final int f26883j;

    C10272b0(byte[] bArr, int i, int i2) {
        super(bArr);
        C10431y.m26594b(i, i + i2, bArr.length);
        this.f26882i = i;
        this.f26883j = i2;
    }

    /* renamed from: a */
    public final byte mo27798a(int i) {
        int size = size();
        if (((size - (i + 1)) | i) >= 0) {
            return this.f26988h[this.f26882i + i];
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(22);
            sb.append("Index < 0: ");
            sb.append(i);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("Index > length: ");
        sb2.append(i);
        sb2.append(", ");
        sb2.append(size);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final int mo27799d() {
        return this.f26882i;
    }

    public final int size() {
        return this.f26883j;
    }
}
