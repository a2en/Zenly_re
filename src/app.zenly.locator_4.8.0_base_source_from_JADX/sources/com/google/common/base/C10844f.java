package com.google.common.base;

import java.util.Arrays;

/* renamed from: com.google.common.base.f */
public final class C10844f {

    /* renamed from: com.google.common.base.f$b */
    public static final class C10846b {

        /* renamed from: a */
        private final String f28387a;

        /* renamed from: b */
        private final C10847a f28388b;

        /* renamed from: c */
        private C10847a f28389c;

        /* renamed from: d */
        private boolean f28390d;

        /* renamed from: com.google.common.base.f$b$a */
        private static final class C10847a {

            /* renamed from: a */
            String f28391a;

            /* renamed from: b */
            Object f28392b;

            /* renamed from: c */
            C10847a f28393c;

            private C10847a() {
            }
        }

        /* renamed from: b */
        private C10846b m27994b(Object obj) {
            m27993a().f28392b = obj;
            return this;
        }

        /* renamed from: a */
        public C10846b mo31474a(String str, Object obj) {
            m27995b(str, obj);
            return this;
        }

        public String toString() {
            boolean z = this.f28390d;
            StringBuilder sb = new StringBuilder(32);
            sb.append(this.f28387a);
            sb.append('{');
            String str = "";
            for (C10847a aVar = this.f28388b.f28393c; aVar != null; aVar = aVar.f28393c) {
                Object obj = aVar.f28392b;
                if (!z || obj != null) {
                    sb.append(str);
                    String str2 = aVar.f28391a;
                    if (str2 != null) {
                        sb.append(str2);
                        sb.append('=');
                    }
                    if (obj == null || !obj.getClass().isArray()) {
                        sb.append(obj);
                    } else {
                        String deepToString = Arrays.deepToString(new Object[]{obj});
                        sb.append(deepToString, 1, deepToString.length() - 1);
                    }
                    str = ", ";
                }
            }
            sb.append('}');
            return sb.toString();
        }

        private C10846b(String str) {
            this.f28388b = new C10847a();
            this.f28389c = this.f28388b;
            this.f28390d = false;
            C10850i.m28004a(str);
            this.f28387a = str;
        }

        /* renamed from: a */
        public C10846b mo31473a(String str, int i) {
            m27995b(str, String.valueOf(i));
            return this;
        }

        /* renamed from: b */
        private C10846b m27995b(String str, Object obj) {
            C10847a a = m27993a();
            a.f28392b = obj;
            C10850i.m28004a(str);
            a.f28391a = str;
            return this;
        }

        /* renamed from: a */
        public C10846b mo31472a(Object obj) {
            m27994b(obj);
            return this;
        }

        /* renamed from: a */
        private C10847a m27993a() {
            C10847a aVar = new C10847a();
            this.f28389c.f28393c = aVar;
            this.f28389c = aVar;
            return aVar;
        }
    }

    /* renamed from: a */
    public static <T> T m27992a(T t, T t2) {
        if (t != null) {
            return t;
        }
        if (t2 != null) {
            return t2;
        }
        throw new NullPointerException("Both parameters are null");
    }

    /* renamed from: a */
    public static C10846b m27991a(Object obj) {
        return new C10846b(obj.getClass().getSimpleName());
    }
}
