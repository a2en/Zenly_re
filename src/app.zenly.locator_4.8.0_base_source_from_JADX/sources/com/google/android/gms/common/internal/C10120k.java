package com.google.android.gms.common.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.gms.common.internal.k */
public final class C10120k {

    /* renamed from: com.google.android.gms.common.internal.k$a */
    public static final class C10121a {

        /* renamed from: a */
        private final List<String> f26634a;

        /* renamed from: b */
        private final Object f26635b;

        private C10121a(Object obj) {
            C10123l.m25505a(obj);
            this.f26635b = obj;
            this.f26634a = new ArrayList();
        }

        /* renamed from: a */
        public final C10121a mo27499a(String str, Object obj) {
            List<String> list = this.f26634a;
            C10123l.m25505a(str);
            String str2 = str;
            String valueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(valueOf).length());
            sb.append(str2);
            sb.append("=");
            sb.append(valueOf);
            list.add(sb.toString());
            return this;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(100);
            sb.append(this.f26635b.getClass().getSimpleName());
            sb.append('{');
            int size = this.f26634a.size();
            for (int i = 0; i < size; i++) {
                sb.append((String) this.f26634a.get(i));
                if (i < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: a */
    public static boolean m25501a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: a */
    public static int m25499a(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    /* renamed from: a */
    public static C10121a m25500a(Object obj) {
        return new C10121a(obj);
    }
}
