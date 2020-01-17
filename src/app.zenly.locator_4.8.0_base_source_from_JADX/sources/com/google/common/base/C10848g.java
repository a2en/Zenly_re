package com.google.common.base;

import java.util.Arrays;

/* renamed from: com.google.common.base.g */
public final class C10848g extends C10841d {
    /* renamed from: a */
    public static boolean m28000a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: a */
    public static int m27999a(Object... objArr) {
        return Arrays.hashCode(objArr);
    }
}
