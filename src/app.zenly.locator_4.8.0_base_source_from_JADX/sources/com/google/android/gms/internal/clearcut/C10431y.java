package com.google.android.gms.internal.clearcut;

import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.clearcut.y */
public abstract class C10431y implements Serializable, Iterable<Byte> {

    /* renamed from: f */
    public static final C10431y f27328f = new C10305f0(C10292d1.f26952b);

    /* renamed from: g */
    private static final C10284c0 f27329g = (C10395s.m26492a() ? new C10312g0(null) : new C10265a0(null));

    /* renamed from: e */
    private int f27330e = 0;

    C10431y() {
    }

    /* renamed from: a */
    public static C10431y m26592a(String str) {
        return new C10305f0(str.getBytes(C10292d1.f26951a));
    }

    /* renamed from: a */
    public static C10431y m26593a(byte[] bArr, int i, int i2) {
        return new C10305f0(f27329g.mo27789a(bArr, i, i2));
    }

    /* renamed from: b */
    static int m26594b(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Beginning index: ");
            sb.append(i);
            sb.append(" < 0");
            throw new IndexOutOfBoundsException(sb.toString());
        } else if (i2 < i) {
            StringBuilder sb2 = new StringBuilder(66);
            sb2.append("Beginning index larger than ending index: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            throw new IndexOutOfBoundsException(sb2.toString());
        } else {
            StringBuilder sb3 = new StringBuilder(37);
            sb3.append("End index: ");
            sb3.append(i2);
            sb3.append(" >= ");
            sb3.append(i3);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
    }

    /* renamed from: b */
    static C10291d0 m26595b(int i) {
        return new C10291d0(i, null);
    }

    /* renamed from: a */
    public abstract byte mo27798a(int i);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo27900a(int i, int i2, int i3);

    /* renamed from: a */
    public abstract C10431y mo27901a(int i, int i2);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo27902a(Charset charset);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo27903a(C10425x xVar) throws IOException;

    /* renamed from: a */
    public abstract boolean mo27904a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo28190b() {
        return this.f27330e;
    }

    /* renamed from: c */
    public final String mo28191c() {
        return size() == 0 ? "" : mo27902a(C10292d1.f26951a);
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i = this.f27330e;
        if (i == 0) {
            int size = size();
            i = mo27900a(size, 0, size);
            if (i == 0) {
                i = 1;
            }
            this.f27330e = i;
        }
        return i;
    }

    public /* synthetic */ Iterator iterator() {
        return new C10437z(this);
    }

    public abstract int size();

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size())});
    }
}
