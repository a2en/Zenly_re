package com.bumptech.glide.load.model;

import com.bumptech.glide.p301o.C9213g;
import com.bumptech.glide.p301o.C9217k;
import java.util.Queue;

/* renamed from: com.bumptech.glide.load.model.f */
public class C9060f<A, B> {

    /* renamed from: a */
    private final C9213g<C9062b<A>, B> f23605a;

    /* renamed from: com.bumptech.glide.load.model.f$a */
    class C9061a extends C9213g<C9062b<A>, B> {
        C9061a(C9060f fVar, long j) {
            super(j);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo24386a(C9062b<A> bVar, B b) {
            bVar.mo24575a();
        }
    }

    /* renamed from: com.bumptech.glide.load.model.f$b */
    static final class C9062b<A> {

        /* renamed from: d */
        private static final Queue<C9062b<?>> f23606d = C9217k.m22099a(0);

        /* renamed from: a */
        private int f23607a;

        /* renamed from: b */
        private int f23608b;

        /* renamed from: c */
        private A f23609c;

        private C9062b() {
        }

        /* renamed from: a */
        static <A> C9062b<A> m21727a(A a, int i, int i2) {
            C9062b<A> bVar;
            synchronized (f23606d) {
                bVar = (C9062b) f23606d.poll();
            }
            if (bVar == null) {
                bVar = new C9062b<>();
            }
            bVar.m21728b(a, i, i2);
            return bVar;
        }

        /* renamed from: b */
        private void m21728b(A a, int i, int i2) {
            this.f23609c = a;
            this.f23608b = i;
            this.f23607a = i2;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C9062b)) {
                return false;
            }
            C9062b bVar = (C9062b) obj;
            if (this.f23608b == bVar.f23608b && this.f23607a == bVar.f23607a && this.f23609c.equals(bVar.f23609c)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((this.f23607a * 31) + this.f23608b) * 31) + this.f23609c.hashCode();
        }

        /* renamed from: a */
        public void mo24575a() {
            synchronized (f23606d) {
                f23606d.offer(this);
            }
        }
    }

    public C9060f(long j) {
        this.f23605a = new C9061a(this, j);
    }

    /* renamed from: a */
    public B mo24572a(A a, int i, int i2) {
        C9062b a2 = C9062b.m21727a(a, i, i2);
        B a3 = this.f23605a.mo24822a(a2);
        a2.mo24575a();
        return a3;
    }

    /* renamed from: a */
    public void mo24573a(A a, int i, int i2, B b) {
        this.f23605a.mo24824b(C9062b.m21727a(a, i, i2), b);
    }
}
