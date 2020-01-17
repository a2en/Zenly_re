package com.google.android.gms.internal.clearcut;

/* renamed from: com.google.android.gms.internal.clearcut.p3 */
final class C10378p3 extends IllegalArgumentException {
    C10378p3(int i, int i2) {
        StringBuilder sb = new StringBuilder(54);
        sb.append("Unpaired surrogate at index ");
        sb.append(i);
        sb.append(" of ");
        sb.append(i2);
        super(sb.toString());
    }
}
