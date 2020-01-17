package com.google.android.gms.internal.location;

import android.os.Looper;
import com.google.android.gms.common.internal.C10123l;

/* renamed from: com.google.android.gms.internal.location.f0 */
public final class C10495f0 {
    /* renamed from: a */
    public static Looper m26874a() {
        C10123l.m25517b(Looper.myLooper() != null, "Can't create handler inside thread that has not called Looper.prepare()");
        return Looper.myLooper();
    }

    /* renamed from: a */
    public static Looper m26875a(Looper looper) {
        return looper != null ? looper : m26874a();
    }
}
