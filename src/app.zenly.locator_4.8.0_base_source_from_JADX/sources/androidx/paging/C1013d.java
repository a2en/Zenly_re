package androidx.paging;

import androidx.lifecycle.C0855c;
import androidx.lifecycle.LiveData;
import androidx.paging.C1018f.C1021c;
import androidx.paging.C1018f.C1022d;
import androidx.paging.C1018f.C1024f;
import androidx.paging.C1018f.C1024f.C1025a;
import androidx.paging.DataSource.C1000a;
import androidx.paging.DataSource.InvalidatedCallback;
import java.util.concurrent.Executor;
import p214e.p222b.p223a.p224a.C7551a;

/* renamed from: androidx.paging.d */
public final class C1013d<Key, Value> {

    /* renamed from: a */
    private Key f3800a;

    /* renamed from: b */
    private C1024f f3801b;

    /* renamed from: c */
    private C1000a<Key, Value> f3802c;

    /* renamed from: d */
    private C1021c f3803d;

    /* renamed from: e */
    private Executor f3804e;

    /* renamed from: androidx.paging.d$a */
    static class C1014a extends C0855c<C1018f<Value>> {

        /* renamed from: g */
        private C1018f<Value> f3805g;

        /* renamed from: h */
        private DataSource<Key, Value> f3806h;

        /* renamed from: i */
        private final InvalidatedCallback f3807i = new C1015a();

        /* renamed from: j */
        final /* synthetic */ Object f3808j;

        /* renamed from: k */
        final /* synthetic */ C1000a f3809k;

        /* renamed from: l */
        final /* synthetic */ C1024f f3810l;

        /* renamed from: m */
        final /* synthetic */ Executor f3811m;

        /* renamed from: n */
        final /* synthetic */ Executor f3812n;

        /* renamed from: o */
        final /* synthetic */ C1021c f3813o;

        /* renamed from: androidx.paging.d$a$a */
        class C1015a implements InvalidatedCallback {
            C1015a() {
            }

            public void onInvalidated() {
                C1014a.this.mo4427c();
            }
        }

        C1014a(Executor executor, Object obj, C1000a aVar, C1024f fVar, Executor executor2, Executor executor3, C1021c cVar) {
            this.f3808j = obj;
            this.f3809k = aVar;
            this.f3810l = fVar;
            this.f3811m = executor2;
            this.f3812n = executor3;
            this.f3813o = cVar;
            super(executor);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C1018f<Value> m4552a() {
            Object obj = this.f3808j;
            C1018f<Value> fVar = this.f3805g;
            if (fVar != null) {
                obj = fVar.mo4831c();
            }
            do {
                DataSource<Key, Value> dataSource = this.f3806h;
                if (dataSource != null) {
                    dataSource.mo4802b(this.f3807i);
                }
                this.f3806h = this.f3809k.mo4806a();
                this.f3806h.mo4801a(this.f3807i);
                C1022d dVar = new C1022d(this.f3806h, this.f3810l);
                dVar.mo4863b(this.f3811m);
                dVar.mo4861a(this.f3812n);
                dVar.mo4859a(this.f3813o);
                dVar.mo4860a(obj);
                this.f3805g = dVar.mo4862a();
            } while (this.f3805g.mo4849f());
            return this.f3805g;
        }
    }

    public C1013d(C1000a<Key, Value> aVar, C1024f fVar) {
        this.f3804e = C7551a.m18217b();
        if (fVar == null) {
            throw new IllegalArgumentException("PagedList.Config must be provided");
        } else if (aVar != null) {
            this.f3802c = aVar;
            this.f3801b = fVar;
        } else {
            throw new IllegalArgumentException("DataSource.Factory must be provided");
        }
    }

    /* renamed from: a */
    public LiveData<C1018f<Value>> mo4837a() {
        return m4549a(this.f3800a, this.f3801b, this.f3803d, this.f3802c, C7551a.m18219d(), this.f3804e);
    }

    /* renamed from: a */
    private static <Key, Value> LiveData<C1018f<Value>> m4549a(Key key, C1024f fVar, C1021c cVar, C1000a<Key, Value> aVar, Executor executor, Executor executor2) {
        C1014a aVar2 = new C1014a(executor2, key, aVar, fVar, executor, executor2, cVar);
        return aVar2.mo4426b();
    }

    public C1013d(C1000a<Key, Value> aVar, int i) {
        C1025a aVar2 = new C1025a();
        aVar2.mo4867b(i);
        this(aVar, aVar2.mo4866a());
    }
}
