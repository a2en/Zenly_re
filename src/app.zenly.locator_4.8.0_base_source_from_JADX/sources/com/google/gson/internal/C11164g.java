package com.google.gson.internal;

import java.io.ObjectStreamException;
import java.math.BigDecimal;

/* renamed from: com.google.gson.internal.g */
public final class C11164g extends Number {

    /* renamed from: e */
    private final String f28886e;

    public C11164g(String str) {
        this.f28886e = str;
    }

    private Object writeReplace() throws ObjectStreamException {
        return new BigDecimal(this.f28886e);
    }

    public double doubleValue() {
        return Double.parseDouble(this.f28886e);
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11164g)) {
            return false;
        }
        C11164g gVar = (C11164g) obj;
        String str = this.f28886e;
        String str2 = gVar.f28886e;
        if (str != str2 && !str.equals(str2)) {
            z = false;
        }
        return z;
    }

    public float floatValue() {
        return Float.parseFloat(this.f28886e);
    }

    public int hashCode() {
        return this.f28886e.hashCode();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        return (int) java.lang.Long.parseLong(r2.f28886e);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        return new java.math.BigDecimal(r2.f28886e).intValue();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0007 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int intValue() {
        /*
            r2 = this;
            java.lang.String r0 = r2.f28886e     // Catch:{ NumberFormatException -> 0x0007 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0007 }
            return r0
        L_0x0007:
            java.lang.String r0 = r2.f28886e     // Catch:{ NumberFormatException -> 0x000f }
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x000f }
            int r1 = (int) r0
            return r1
        L_0x000f:
            java.math.BigDecimal r0 = new java.math.BigDecimal
            java.lang.String r1 = r2.f28886e
            r0.<init>(r1)
            int r0 = r0.intValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.C11164g.intValue():int");
    }

    public long longValue() {
        try {
            return Long.parseLong(this.f28886e);
        } catch (NumberFormatException unused) {
            return new BigDecimal(this.f28886e).longValue();
        }
    }

    public String toString() {
        return this.f28886e;
    }
}
