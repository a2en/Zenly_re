package com.facebook.common.internal;

/* renamed from: com.facebook.common.internal.l */
public class C9538l {

    /* renamed from: com.facebook.common.internal.l$a */
    static class C9539a implements Supplier<T> {

        /* renamed from: a */
        final /* synthetic */ Object f24715a;

        C9539a(Object obj) {
            this.f24715a = obj;
        }

        public T get() {
            return this.f24715a;
        }
    }

    /* renamed from: com.facebook.common.internal.l$b */
    static class C9540b implements Supplier<Boolean> {
        C9540b() {
        }

        public Boolean get() {
            return Boolean.valueOf(true);
        }
    }

    /* renamed from: com.facebook.common.internal.l$c */
    static class C9541c implements Supplier<Boolean> {
        C9541c() {
        }

        public Boolean get() {
            return Boolean.valueOf(false);
        }
    }

    static {
        new C9540b();
        new C9541c();
    }

    /* renamed from: a */
    public static <T> Supplier<T> m23284a(T t) {
        return new C9539a(t);
    }
}
