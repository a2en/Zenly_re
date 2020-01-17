package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.C10273b1.C10278e;

/* renamed from: com.google.android.gms.internal.clearcut.a1 */
final class C10266a1 implements C10439z1 {

    /* renamed from: a */
    private static final C10266a1 f26878a = new C10266a1();

    private C10266a1() {
    }

    /* renamed from: a */
    public static C10266a1 m25903a() {
        return f26878a;
    }

    public final boolean zza(Class<?> cls) {
        return C10273b1.class.isAssignableFrom(cls);
    }

    public final C10433y1 zzb(Class<?> cls) {
        Class<C10273b1> cls2 = C10273b1.class;
        if (!cls2.isAssignableFrom(cls)) {
            String str = "Unsupported message type: ";
            String valueOf = String.valueOf(cls.getName());
            throw new IllegalArgumentException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        }
        try {
            return (C10433y1) C10273b1.m25920a(cls.asSubclass(cls2)).mo27802a(C10278e.f26891c, (Object) null, (Object) null);
        } catch (Exception e) {
            String str2 = "Unable to get message info for ";
            String valueOf2 = String.valueOf(cls.getName());
            throw new RuntimeException(valueOf2.length() != 0 ? str2.concat(valueOf2) : new String(str2), e);
        }
    }
}
