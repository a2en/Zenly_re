package com.google.android.gms.common;

import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.common.n */
abstract class C10147n extends C10146m {

    /* renamed from: c */
    private static final WeakReference<byte[]> f26664c = new WeakReference<>(null);

    /* renamed from: b */
    private WeakReference<byte[]> f26665b = f26664c;

    C10147n(byte[] bArr) {
        super(bArr);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final byte[] mo27522a() {
        byte[] bArr;
        synchronized (this) {
            bArr = (byte[]) this.f26665b.get();
            if (bArr == null) {
                bArr = mo27525b();
                this.f26665b = new WeakReference<>(bArr);
            }
        }
        return bArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract byte[] mo27525b();
}
