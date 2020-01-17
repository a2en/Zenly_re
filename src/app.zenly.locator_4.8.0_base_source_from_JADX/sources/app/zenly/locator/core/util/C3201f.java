package app.zenly.locator.core.util;

import java.util.Comparator;

/* renamed from: app.zenly.locator.core.util.f */
public abstract class C3201f<T> implements Comparator<T> {

    /* renamed from: app.zenly.locator.core.util.f$a */
    class C3202a extends C3201f<T> {

        /* renamed from: e */
        final /* synthetic */ C3201f f8968e;

        C3202a(C3201f fVar, C3201f fVar2) {
            this.f8968e = fVar2;
        }

        public int compare(T t, T t2) {
            return -this.f8968e.compare(t, t2);
        }

        public /* bridge */ /* synthetic */ Comparator reversed() {
            return C3201f.super.reversed();
        }
    }

    /* renamed from: app.zenly.locator.core.util.f$b */
    class C3203b extends C3201f<T> {

        /* renamed from: e */
        final /* synthetic */ C3201f f8969e;

        /* renamed from: f */
        final /* synthetic */ C3201f f8970f;

        C3203b(C3201f fVar, C3201f fVar2, C3201f fVar3) {
            this.f8969e = fVar2;
            this.f8970f = fVar3;
        }

        public int compare(T t, T t2) {
            int compare = this.f8969e.compare(t, t2);
            if (compare != 0) {
                return compare;
            }
            return this.f8970f.compare(t, t2);
        }

        public /* bridge */ /* synthetic */ Comparator reversed() {
            return C3201f.super.reversed();
        }
    }

    /* renamed from: app.zenly.locator.core.util.f$c */
    private static final class C3204c<T extends Comparable<T>> extends C3201f<T> {
        private C3204c() {
        }

        /* renamed from: a */
        public int compare(T t, T t2) {
            return t.compareTo(t2);
        }

        public /* bridge */ /* synthetic */ Comparator reversed() {
            return C3201f.super.reversed();
        }

        /* synthetic */ C3204c(C3202a aVar) {
            this();
        }
    }

    static {
        new C3204c(null);
    }

    /* renamed from: a */
    public C3201f<T> mo9614a(C3201f<T> fVar) {
        return new C3203b(this, this, fVar);
    }

    public C3201f<T> reversed() {
        return new C3202a(this, this);
    }
}
