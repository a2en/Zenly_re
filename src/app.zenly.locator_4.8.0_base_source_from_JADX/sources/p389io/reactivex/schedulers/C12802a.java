package p389io.reactivex.schedulers;

import java.util.concurrent.Callable;
import p389io.reactivex.C12286f;
import p389io.reactivex.internal.schedulers.C12720b;
import p389io.reactivex.internal.schedulers.C12725d;
import p389io.reactivex.internal.schedulers.C12729e;
import p389io.reactivex.internal.schedulers.C12739l;
import p389io.reactivex.internal.schedulers.C12741m;
import p389io.reactivex.p403k.C12768a;

/* renamed from: io.reactivex.schedulers.a */
public final class C12802a {

    /* renamed from: a */
    static final C12286f f33396a = C12768a.m33421e(new C12810h());

    /* renamed from: b */
    static final C12286f f33397b = C12768a.m33412b((Callable<C12286f>) new C12804b<C12286f>());

    /* renamed from: c */
    static final C12286f f33398c = C12768a.m33418c((Callable<C12286f>) new C12805c<C12286f>());

    /* renamed from: d */
    static final C12286f f33399d = C12741m.m33321b();

    /* renamed from: io.reactivex.schedulers.a$a */
    static final class C12803a {

        /* renamed from: a */
        static final C12286f f33400a = new C12720b();
    }

    /* renamed from: io.reactivex.schedulers.a$b */
    static final class C12804b implements Callable<C12286f> {
        C12804b() {
        }

        public C12286f call() throws Exception {
            return C12803a.f33400a;
        }
    }

    /* renamed from: io.reactivex.schedulers.a$c */
    static final class C12805c implements Callable<C12286f> {
        C12805c() {
        }

        public C12286f call() throws Exception {
            return C12806d.f33401a;
        }
    }

    /* renamed from: io.reactivex.schedulers.a$d */
    static final class C12806d {

        /* renamed from: a */
        static final C12286f f33401a = new C12725d();
    }

    /* renamed from: io.reactivex.schedulers.a$e */
    static final class C12807e {

        /* renamed from: a */
        static final C12286f f33402a = new C12729e();
    }

    /* renamed from: io.reactivex.schedulers.a$f */
    static final class C12808f implements Callable<C12286f> {
        C12808f() {
        }

        public C12286f call() throws Exception {
            return C12807e.f33402a;
        }
    }

    /* renamed from: io.reactivex.schedulers.a$g */
    static final class C12809g {

        /* renamed from: a */
        static final C12286f f33403a = new C12739l();
    }

    /* renamed from: io.reactivex.schedulers.a$h */
    static final class C12810h implements Callable<C12286f> {
        C12810h() {
        }

        public C12286f call() throws Exception {
            return C12809g.f33403a;
        }
    }

    static {
        C12768a.m33420d(new C12808f());
    }

    /* renamed from: a */
    public static C12286f m33490a() {
        return C12768a.m33397a(f33397b);
    }

    /* renamed from: b */
    public static C12286f m33491b() {
        return C12768a.m33411b(f33398c);
    }

    /* renamed from: c */
    public static C12286f m33492c() {
        return C12768a.m33417c(f33396a);
    }

    /* renamed from: d */
    public static C12286f m33493d() {
        return f33399d;
    }
}
