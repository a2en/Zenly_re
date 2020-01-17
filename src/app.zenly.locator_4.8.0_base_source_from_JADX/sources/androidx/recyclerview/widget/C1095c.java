package androidx.recyclerview.widget;

import androidx.recyclerview.widget.C1112g.C1116d;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: androidx.recyclerview.widget.c */
public final class C1095c<T> {

    /* renamed from: a */
    private final Executor f4202a;

    /* renamed from: b */
    private final Executor f4203b;

    /* renamed from: c */
    private final C1116d<T> f4204c;

    /* renamed from: androidx.recyclerview.widget.c$a */
    public static final class C1096a<T> {

        /* renamed from: d */
        private static final Object f4205d = new Object();

        /* renamed from: e */
        private static Executor f4206e;

        /* renamed from: a */
        private Executor f4207a;

        /* renamed from: b */
        private Executor f4208b;

        /* renamed from: c */
        private final C1116d<T> f4209c;

        public C1096a(C1116d<T> dVar) {
            this.f4209c = dVar;
        }

        /* renamed from: a */
        public C1095c<T> mo5640a() {
            if (this.f4208b == null) {
                synchronized (f4205d) {
                    if (f4206e == null) {
                        f4206e = Executors.newFixedThreadPool(2);
                    }
                }
                this.f4208b = f4206e;
            }
            return new C1095c<>(this.f4207a, this.f4208b, this.f4209c);
        }
    }

    C1095c(Executor executor, Executor executor2, C1116d<T> dVar) {
        this.f4202a = executor;
        this.f4203b = executor2;
        this.f4204c = dVar;
    }

    /* renamed from: a */
    public Executor mo5637a() {
        return this.f4203b;
    }

    /* renamed from: b */
    public C1116d<T> mo5638b() {
        return this.f4204c;
    }

    /* renamed from: c */
    public Executor mo5639c() {
        return this.f4202a;
    }
}
