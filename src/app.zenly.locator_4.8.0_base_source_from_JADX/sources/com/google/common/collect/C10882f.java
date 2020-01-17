package com.google.common.collect;

import com.google.common.base.C10850i;

/* renamed from: com.google.common.collect.f */
final class C10882f {
    /* renamed from: a */
    static void m28057a(Object obj, Object obj2) {
        if (obj == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("null key in entry: null=");
            sb.append(obj2);
            throw new NullPointerException(sb.toString());
        } else if (obj2 == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("null value in entry: ");
            sb2.append(obj);
            sb2.append("=null");
            throw new NullPointerException(sb2.toString());
        }
    }

    /* renamed from: a */
    static int m28056a(int i, String str) {
        if (i >= 0) {
            return i;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" cannot be negative but was: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    static void m28058a(boolean z) {
        C10850i.m28017b(z, (Object) "no calls to next() since the last call to remove()");
    }
}
