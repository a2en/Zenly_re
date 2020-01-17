package com.facebook.common.internal;

import java.util.Arrays;

/* renamed from: com.facebook.common.internal.i */
public final class C9532i {

    /* renamed from: com.facebook.common.internal.i$b */
    public static final class C9534b {

        /* renamed from: a */
        private final String f24708a;

        /* renamed from: b */
        private C9535a f24709b;

        /* renamed from: c */
        private C9535a f24710c;

        /* renamed from: d */
        private boolean f24711d;

        /* renamed from: com.facebook.common.internal.i$b$a */
        private static final class C9535a {

            /* renamed from: a */
            String f24712a;

            /* renamed from: b */
            Object f24713b;

            /* renamed from: c */
            C9535a f24714c;

            private C9535a() {
            }
        }

        /* renamed from: b */
        private C9534b m23266b(String str, Object obj) {
            C9535a a = m23265a();
            a.f24713b = obj;
            C9536j.m23271a(str);
            a.f24712a = str;
            return this;
        }

        /* renamed from: a */
        public C9534b mo25665a(String str, Object obj) {
            m23266b(str, obj);
            return this;
        }

        public String toString() {
            boolean z = this.f24711d;
            StringBuilder sb = new StringBuilder(32);
            sb.append(this.f24708a);
            sb.append('{');
            String str = "";
            for (C9535a aVar = this.f24709b.f24714c; aVar != null; aVar = aVar.f24714c) {
                if (!z || aVar.f24713b != null) {
                    sb.append(str);
                    String str2 = aVar.f24712a;
                    if (str2 != null) {
                        sb.append(str2);
                        sb.append('=');
                    }
                    sb.append(aVar.f24713b);
                    str = ", ";
                }
            }
            sb.append('}');
            return sb.toString();
        }

        private C9534b(String str) {
            this.f24709b = new C9535a();
            this.f24710c = this.f24709b;
            this.f24711d = false;
            C9536j.m23271a(str);
            this.f24708a = str;
        }

        /* renamed from: a */
        public C9534b mo25666a(String str, boolean z) {
            m23266b(str, String.valueOf(z));
            return this;
        }

        /* renamed from: a */
        public C9534b mo25664a(String str, int i) {
            m23266b(str, String.valueOf(i));
            return this;
        }

        /* renamed from: a */
        private C9535a m23265a() {
            C9535a aVar = new C9535a();
            this.f24710c.f24714c = aVar;
            this.f24710c = aVar;
            return aVar;
        }
    }

    /* renamed from: a */
    public static boolean m23264a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: a */
    public static int m23261a(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    /* renamed from: a */
    public static C9534b m23262a(Object obj) {
        return new C9534b(m23263a(obj.getClass()));
    }

    /* renamed from: a */
    private static String m23263a(Class<?> cls) {
        String replaceAll = cls.getName().replaceAll("\\$[0-9]+", "\\$");
        int lastIndexOf = replaceAll.lastIndexOf(36);
        if (lastIndexOf == -1) {
            lastIndexOf = replaceAll.lastIndexOf(46);
        }
        return replaceAll.substring(lastIndexOf + 1);
    }
}
