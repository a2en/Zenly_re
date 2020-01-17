package com.google.android.gms.maps.internal;

/* renamed from: com.google.android.gms.maps.internal.a */
public final class C10612a {
    /* renamed from: a */
    public static Boolean m27082a(byte b) {
        if (b == 0) {
            return Boolean.FALSE;
        }
        if (b != 1) {
            return null;
        }
        return Boolean.TRUE;
    }

    /* renamed from: a */
    public static byte m27081a(Boolean bool) {
        if (bool != null) {
            return bool.booleanValue() ? (byte) 1 : 0;
        }
        return -1;
    }
}
