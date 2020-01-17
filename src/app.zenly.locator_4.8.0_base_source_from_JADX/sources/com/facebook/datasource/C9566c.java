package com.facebook.datasource;

import com.facebook.common.internal.Supplier;

/* renamed from: com.facebook.datasource.c */
public class C9566c {

    /* renamed from: com.facebook.datasource.c$a */
    static class C9567a implements Supplier<DataSource<T>> {

        /* renamed from: a */
        final /* synthetic */ Throwable f24785a;

        C9567a(Throwable th) {
            this.f24785a = th;
        }

        public DataSource<T> get() {
            return C9566c.m23420b(this.f24785a);
        }
    }

    /* renamed from: a */
    public static <T> Supplier<DataSource<T>> m23419a(Throwable th) {
        return new C9567a(th);
    }

    /* renamed from: b */
    public static <T> DataSource<T> m23420b(Throwable th) {
        C9575f b = C9575f.m23449b();
        b.mo25769a(th);
        return b;
    }
}
