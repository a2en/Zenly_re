package androidx.paging;

import androidx.paging.C1018f.C1023e;
import androidx.recyclerview.widget.C1094b;
import androidx.recyclerview.widget.C1095c;
import androidx.recyclerview.widget.C1095c.C1096a;
import androidx.recyclerview.widget.C1112g.C1115c;
import androidx.recyclerview.widget.C1112g.C1116d;
import androidx.recyclerview.widget.ListUpdateCallback;
import androidx.recyclerview.widget.RecyclerView.C1069g;
import java.util.List;
import java.util.concurrent.Executor;
import p214e.p222b.p223a.p224a.C7551a;

/* renamed from: androidx.paging.a */
public class C1003a<T> {

    /* renamed from: a */
    final ListUpdateCallback f3770a;

    /* renamed from: b */
    final C1095c<T> f3771b;

    /* renamed from: c */
    Executor f3772c = C7551a.m18219d();

    /* renamed from: d */
    C1007c<T> f3773d;

    /* renamed from: e */
    private boolean f3774e;

    /* renamed from: f */
    private C1018f<T> f3775f;

    /* renamed from: g */
    private C1018f<T> f3776g;

    /* renamed from: h */
    int f3777h;

    /* renamed from: i */
    private C1023e f3778i = new C1004a();

    /* renamed from: androidx.paging.a$a */
    class C1004a extends C1023e {
        C1004a() {
        }

        /* renamed from: a */
        public void mo4815a(int i, int i2) {
            C1003a.this.f3770a.onChanged(i, i2, null);
        }

        /* renamed from: b */
        public void mo4816b(int i, int i2) {
            C1003a.this.f3770a.onInserted(i, i2);
        }
    }

    /* renamed from: androidx.paging.a$b */
    class C1005b implements Runnable {

        /* renamed from: e */
        final /* synthetic */ C1018f f3780e;

        /* renamed from: f */
        final /* synthetic */ C1018f f3781f;

        /* renamed from: g */
        final /* synthetic */ int f3782g;

        /* renamed from: h */
        final /* synthetic */ C1018f f3783h;

        /* renamed from: androidx.paging.a$b$a */
        class C1006a implements Runnable {

            /* renamed from: e */
            final /* synthetic */ C1115c f3785e;

            C1006a(C1115c cVar) {
                this.f3785e = cVar;
            }

            public void run() {
                C1005b bVar = C1005b.this;
                C1003a aVar = C1003a.this;
                if (aVar.f3777h == bVar.f3782g) {
                    aVar.mo4814a(bVar.f3783h, bVar.f3781f, this.f3785e, bVar.f3780e.f3825j);
                }
            }
        }

        C1005b(C1018f fVar, C1018f fVar2, int i, C1018f fVar3) {
            this.f3780e = fVar;
            this.f3781f = fVar2;
            this.f3782g = i;
            this.f3783h = fVar3;
        }

        public void run() {
            C1003a.this.f3772c.execute(new C1006a(C1030i.m4628a(this.f3780e.f3824i, this.f3781f.f3824i, C1003a.this.f3771b.mo5638b())));
        }
    }

    /* renamed from: androidx.paging.a$c */
    interface C1007c<T> {
        /* renamed from: a */
        void mo4819a(C1018f<T> fVar);
    }

    public C1003a(C1069g gVar, C1116d<T> dVar) {
        this.f3770a = new C1094b(gVar);
        this.f3771b = new C1096a(dVar).mo5640a();
    }

    /* renamed from: a */
    public T mo4812a(int i) {
        C1018f<T> fVar = this.f3775f;
        if (fVar == null) {
            C1018f<T> fVar2 = this.f3776g;
            if (fVar2 != null) {
                return fVar2.get(i);
            }
            throw new IndexOutOfBoundsException("Item count is zero, getItem() call is invalid");
        }
        fVar.mo4845c(i);
        return this.f3775f.get(i);
    }

    /* renamed from: a */
    public int mo4811a() {
        C1018f<T> fVar = this.f3775f;
        if (fVar != null) {
            return fVar.size();
        }
        C1018f<T> fVar2 = this.f3776g;
        return fVar2 == null ? 0 : fVar2.size();
    }

    /* renamed from: a */
    public void mo4813a(C1018f<T> fVar) {
        if (fVar != null) {
            if (this.f3775f == null && this.f3776g == null) {
                this.f3774e = fVar.mo4833e();
            } else if (fVar.mo4833e() != this.f3774e) {
                throw new IllegalArgumentException("AsyncPagedListDiffer cannot handle both contiguous and non-contiguous lists.");
            }
        }
        int i = this.f3777h + 1;
        this.f3777h = i;
        C1018f<T> fVar2 = this.f3775f;
        if (fVar != fVar2) {
            if (fVar == null) {
                int a = mo4811a();
                C1018f<T> fVar3 = this.f3775f;
                if (fVar3 != null) {
                    fVar3.mo4841a(this.f3778i);
                    this.f3775f = null;
                } else if (this.f3776g != null) {
                    this.f3776g = null;
                }
                this.f3770a.onRemoved(0, a);
                C1007c<T> cVar = this.f3773d;
                if (cVar != null) {
                    cVar.mo4819a(null);
                }
            } else if (fVar2 == null && this.f3776g == null) {
                this.f3775f = fVar;
                fVar.mo4842a(null, this.f3778i);
                this.f3770a.onInserted(0, fVar.size());
                C1007c<T> cVar2 = this.f3773d;
                if (cVar2 != null) {
                    cVar2.mo4819a(fVar);
                }
            } else {
                C1018f<T> fVar4 = this.f3775f;
                if (fVar4 != null) {
                    fVar4.mo4841a(this.f3778i);
                    this.f3776g = (C1018f) this.f3775f.mo4852h();
                    this.f3775f = null;
                }
                C1018f<T> fVar5 = this.f3776g;
                if (fVar5 == null || this.f3775f != null) {
                    throw new IllegalStateException("must be in snapshot state to diff");
                }
                C1018f fVar6 = (C1018f) fVar.mo4852h();
                Executor a2 = this.f3771b.mo5637a();
                C1005b bVar = new C1005b(fVar5, fVar6, i, fVar);
                a2.execute(bVar);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4814a(C1018f<T> fVar, C1018f<T> fVar2, C1115c cVar, int i) {
        C1018f<T> fVar3 = this.f3776g;
        if (fVar3 == null || this.f3775f != null) {
            throw new IllegalStateException("must be in snapshot state to apply diff");
        }
        this.f3775f = fVar;
        this.f3776g = null;
        C1030i.m4629a(this.f3770a, fVar3.f3824i, fVar.f3824i, cVar);
        fVar.mo4842a((List<T>) fVar2, this.f3778i);
        int a = C1030i.m4627a(cVar, (C1028h) fVar3.f3824i, (C1028h) fVar.f3824i, i);
        C1018f<T> fVar4 = this.f3775f;
        fVar4.f3825j = Math.max(0, Math.min(fVar4.size(), a));
        C1007c<T> cVar2 = this.f3773d;
        if (cVar2 != null) {
            cVar2.mo4819a(this.f3775f);
        }
    }
}
