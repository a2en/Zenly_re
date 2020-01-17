package com.google.android.gms.internal.clearcut;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.clearcut.d4 */
final class C10295d4 implements Cloneable {

    /* renamed from: e */
    private C10281b4<?, ?> f26953e;

    /* renamed from: f */
    private Object f26954f;

    /* renamed from: g */
    private List<Object> f26955g = new ArrayList();

    C10295d4() {
    }

    /* renamed from: b */
    private final byte[] m26036b() throws IOException {
        byte[] bArr = new byte[mo27877a()];
        mo27878a(C10441z3.m26632a(bArr));
        return bArr;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final C10295d4 clone() {
        Object clone;
        C10295d4 d4Var = new C10295d4();
        try {
            d4Var.f26953e = this.f26953e;
            if (this.f26955g == null) {
                d4Var.f26955g = null;
            } else {
                d4Var.f26955g.addAll(this.f26955g);
            }
            if (this.f26954f != null) {
                if (this.f26954f instanceof C10309f4) {
                    clone = (C10309f4) ((C10309f4) this.f26954f).clone();
                } else if (this.f26954f instanceof byte[]) {
                    clone = ((byte[]) this.f26954f).clone();
                } else {
                    int i = 0;
                    if (this.f26954f instanceof byte[][]) {
                        byte[][] bArr = (byte[][]) this.f26954f;
                        byte[][] bArr2 = new byte[bArr.length][];
                        d4Var.f26954f = bArr2;
                        while (i < bArr.length) {
                            bArr2[i] = (byte[]) bArr[i].clone();
                            i++;
                        }
                    } else if (this.f26954f instanceof boolean[]) {
                        clone = ((boolean[]) this.f26954f).clone();
                    } else if (this.f26954f instanceof int[]) {
                        clone = ((int[]) this.f26954f).clone();
                    } else if (this.f26954f instanceof long[]) {
                        clone = ((long[]) this.f26954f).clone();
                    } else if (this.f26954f instanceof float[]) {
                        clone = ((float[]) this.f26954f).clone();
                    } else if (this.f26954f instanceof double[]) {
                        clone = ((double[]) this.f26954f).clone();
                    } else if (this.f26954f instanceof C10309f4[]) {
                        C10309f4[] f4VarArr = (C10309f4[]) this.f26954f;
                        C10309f4[] f4VarArr2 = new C10309f4[f4VarArr.length];
                        d4Var.f26954f = f4VarArr2;
                        while (i < f4VarArr.length) {
                            f4VarArr2[i] = (C10309f4) f4VarArr[i].clone();
                            i++;
                        }
                    }
                }
                d4Var.f26954f = clone;
            }
            return d4Var;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final int mo27877a() {
        if (this.f26954f == null) {
            Iterator it = this.f26955g.iterator();
            if (!it.hasNext()) {
                return 0;
            }
            it.next();
            throw new NoSuchMethodError();
        }
        throw new NoSuchMethodError();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo27878a(C10441z3 z3Var) throws IOException {
        if (this.f26954f == null) {
            Iterator it = this.f26955g.iterator();
            if (it.hasNext()) {
                it.next();
                throw new NoSuchMethodError();
            }
            return;
        }
        throw new NoSuchMethodError();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C10295d4)) {
            return false;
        }
        C10295d4 d4Var = (C10295d4) obj;
        if (this.f26954f == null || d4Var.f26954f == null) {
            List<Object> list = this.f26955g;
            if (list != null) {
                List<Object> list2 = d4Var.f26955g;
                if (list2 != null) {
                    return list.equals(list2);
                }
            }
            try {
                return Arrays.equals(m26036b(), d4Var.m26036b());
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        } else {
            C10281b4<?, ?> b4Var = this.f26953e;
            if (b4Var != d4Var.f26953e) {
                return false;
            }
            if (!b4Var.f26920a.isArray()) {
                return this.f26954f.equals(d4Var.f26954f);
            }
            Object obj2 = this.f26954f;
            return obj2 instanceof byte[] ? Arrays.equals((byte[]) obj2, (byte[]) d4Var.f26954f) : obj2 instanceof int[] ? Arrays.equals((int[]) obj2, (int[]) d4Var.f26954f) : obj2 instanceof long[] ? Arrays.equals((long[]) obj2, (long[]) d4Var.f26954f) : obj2 instanceof float[] ? Arrays.equals((float[]) obj2, (float[]) d4Var.f26954f) : obj2 instanceof double[] ? Arrays.equals((double[]) obj2, (double[]) d4Var.f26954f) : obj2 instanceof boolean[] ? Arrays.equals((boolean[]) obj2, (boolean[]) d4Var.f26954f) : Arrays.deepEquals((Object[]) obj2, (Object[]) d4Var.f26954f);
        }
    }

    public final int hashCode() {
        try {
            return Arrays.hashCode(m26036b()) + 527;
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }
}
