package com.google.common.base;

import java.io.Serializable;

/* renamed from: com.google.common.base.j */
public final class C10851j {

    /* renamed from: com.google.common.base.j$b */
    private static class C10853b<T> implements Predicate<T>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: e */
        private final T f28394e;

        public boolean apply(T t) {
            return this.f28394e.equals(t);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C10853b)) {
                return false;
            }
            return this.f28394e.equals(((C10853b) obj).f28394e);
        }

        public int hashCode() {
            return this.f28394e.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Predicates.equalTo(");
            sb.append(this.f28394e);
            sb.append(")");
            return sb.toString();
        }

        private C10853b(T t) {
            this.f28394e = t;
        }
    }

    /* renamed from: com.google.common.base.j$c */
    private static class C10854c<T> implements Predicate<T>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: e */
        final Predicate<T> f28395e;

        C10854c(Predicate<T> predicate) {
            C10850i.m28004a(predicate);
            this.f28395e = predicate;
        }

        public boolean apply(T t) {
            return !this.f28395e.apply(t);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C10854c)) {
                return false;
            }
            return this.f28395e.equals(((C10854c) obj).f28395e);
        }

        public int hashCode() {
            return ~this.f28395e.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Predicates.not(");
            sb.append(this.f28395e);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: com.google.common.base.j$d */
    enum C10855d implements Predicate<Object> {
        ALWAYS_TRUE {
            public boolean apply(Object obj) {
                return true;
            }

            public String toString() {
                return "Predicates.alwaysTrue()";
            }
        },
        ALWAYS_FALSE {
            public boolean apply(Object obj) {
                return false;
            }

            public String toString() {
                return "Predicates.alwaysFalse()";
            }
        },
        IS_NULL {
            public boolean apply(Object obj) {
                return obj == null;
            }

            public String toString() {
                return "Predicates.isNull()";
            }
        },
        NOT_NULL {
            public boolean apply(Object obj) {
                return obj != null;
            }

            public String toString() {
                return "Predicates.notNull()";
            }
        };

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public <T> Predicate<T> mo31480a() {
            return this;
        }
    }

    /* renamed from: a */
    public static <T> Predicate<T> m28021a() {
        C10855d dVar = C10855d.IS_NULL;
        dVar.mo31480a();
        return dVar;
    }

    /* renamed from: a */
    public static <T> Predicate<T> m28022a(Predicate<T> predicate) {
        return new C10854c(predicate);
    }

    /* renamed from: a */
    public static <T> Predicate<T> m28023a(T t) {
        return t == null ? m28021a() : new C10853b(t);
    }
}
