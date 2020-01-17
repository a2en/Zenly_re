package com.google.common.collect;

import java.io.Serializable;
import java.lang.Comparable;
import p333g.p357d.p367b.p368a.C12093a;

/* renamed from: com.google.common.collect.i */
abstract class C10888i<C extends Comparable> implements Comparable<C10888i<C>>, Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: e */
    final C f28448e;

    /* renamed from: com.google.common.collect.i$a */
    private static final class C10889a extends C10888i<Comparable<?>> {
        /* access modifiers changed from: private */

        /* renamed from: f */
        public static final C10889a f28449f = new C10889a();
        private static final long serialVersionUID = 0;

        private C10889a() {
            super(null);
        }

        private Object readResolve() {
            return f28449f;
        }

        /* renamed from: a */
        public int compareTo(C10888i<Comparable<?>> iVar) {
            return iVar == this ? 0 : 1;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo31699a(StringBuilder sb) {
            throw new AssertionError();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo31700a(Comparable<?> comparable) {
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo31701b(StringBuilder sb) {
            sb.append("+∞)");
        }

        public int hashCode() {
            return System.identityHashCode(this);
        }

        public String toString() {
            return "+∞";
        }
    }

    /* renamed from: com.google.common.collect.i$b */
    private static final class C10890b extends C10888i<Comparable<?>> {
        /* access modifiers changed from: private */

        /* renamed from: f */
        public static final C10890b f28450f = new C10890b();
        private static final long serialVersionUID = 0;

        private C10890b() {
            super(null);
        }

        private Object readResolve() {
            return f28450f;
        }

        /* renamed from: a */
        public int compareTo(C10888i<Comparable<?>> iVar) {
            return iVar == this ? 0 : -1;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo31699a(StringBuilder sb) {
            sb.append("(-∞");
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo31700a(Comparable<?> comparable) {
            return true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo31701b(StringBuilder sb) {
            throw new AssertionError();
        }

        public int hashCode() {
            return System.identityHashCode(this);
        }

        public String toString() {
            return "-∞";
        }
    }

    C10888i(C c) {
        this.f28448e = c;
    }

    /* renamed from: b */
    static <C extends Comparable> C10888i<C> m28069b() {
        return C10890b.f28450f;
    }

    /* renamed from: a */
    public int compareTo(C10888i<C> iVar) {
        if (iVar == m28069b()) {
            return 1;
        }
        if (iVar == m28068a()) {
            return -1;
        }
        int a = C10871b0.m28037a((Comparable) this.f28448e, (Comparable) iVar.f28448e);
        if (a != 0) {
            return a;
        }
        return C12093a.m31910a(false, false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo31699a(StringBuilder sb);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract boolean mo31700a(C c);

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public abstract void mo31701b(StringBuilder sb);

    public boolean equals(Object obj) {
        if (!(obj instanceof C10888i)) {
            return false;
        }
        try {
            if (compareTo((C10888i) obj) == 0) {
                return true;
            }
            return false;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public abstract int hashCode();

    /* renamed from: a */
    static <C extends Comparable> C10888i<C> m28068a() {
        return C10889a.f28449f;
    }
}
