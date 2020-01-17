package com.facebook.common.util;

/* renamed from: com.facebook.common.util.a */
public class C9555a {
    /* renamed from: a */
    public static int m23376a(int i, int i2) {
        return ((i + 31) * 31) + i2;
    }

    /* renamed from: a */
    public static int m23377a(int i, int i2, int i3, int i4, int i5, int i6) {
        return ((((((((((i + 31) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + i5) * 31) + i6;
    }

    /* renamed from: a */
    public static int m23378a(Object obj, Object obj2) {
        int i = 0;
        int hashCode = obj == null ? 0 : obj.hashCode();
        if (obj2 != null) {
            i = obj2.hashCode();
        }
        return m23376a(hashCode, i);
    }

    /* renamed from: a */
    public static int m23379a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int hashCode = obj == null ? 0 : obj.hashCode();
        if (obj2 == null) {
            i = 0;
        } else {
            i = obj2.hashCode();
        }
        if (obj3 == null) {
            i2 = 0;
        } else {
            i2 = obj3.hashCode();
        }
        if (obj4 == null) {
            i3 = 0;
        } else {
            i3 = obj4.hashCode();
        }
        if (obj5 == null) {
            i4 = 0;
        } else {
            i4 = obj5.hashCode();
        }
        if (obj6 == null) {
            i5 = 0;
        } else {
            i5 = obj6.hashCode();
        }
        return m23377a(hashCode, i, i2, i3, i4, i5);
    }
}
