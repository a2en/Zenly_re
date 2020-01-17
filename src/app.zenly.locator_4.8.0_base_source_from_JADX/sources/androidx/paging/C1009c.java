package androidx.paging;

import androidx.paging.C1018f.C1021c;
import androidx.paging.C1018f.C1023e;
import androidx.paging.C1018f.C1024f;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: androidx.paging.c */
class C1009c<K, V> extends C1018f<V> implements C1029a {
    /* access modifiers changed from: private */

    /* renamed from: r */
    public final C1008b<K, V> f3787r;

    /* renamed from: s */
    private boolean f3788s = false;

    /* renamed from: t */
    private boolean f3789t = false;

    /* renamed from: u */
    private int f3790u = 0;

    /* renamed from: v */
    private int f3791v = 0;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public C1017a<V> f3792w = new C1010a();

    /* renamed from: androidx.paging.c$a */
    class C1010a extends C1017a<V> {
        C1010a() {
        }

        /* renamed from: a */
        public void mo4834a(int i, C1016e<V> eVar) {
            if (eVar.mo4838a()) {
                C1009c.this.mo4840a();
            } else if (!C1009c.this.mo4849f()) {
                List<T> list = eVar.f3816a;
                if (i == 0) {
                    C1009c cVar = C1009c.this;
                    cVar.f3824i.mo4876a(eVar.f3817b, list, eVar.f3818c, eVar.f3819d, cVar);
                    C1009c cVar2 = C1009c.this;
                    if (cVar2.f3825j == -1) {
                        cVar2.f3825j = eVar.f3817b + eVar.f3819d + (list.size() / 2);
                    }
                } else if (i == 1) {
                    C1009c cVar3 = C1009c.this;
                    cVar3.f3824i.mo4878a(list, (C1029a) cVar3);
                } else if (i == 2) {
                    C1009c cVar4 = C1009c.this;
                    cVar4.f3824i.mo4881b(list, (C1029a) cVar4);
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("unexpected resultType ");
                    sb.append(i);
                    throw new IllegalArgumentException(sb.toString());
                }
                C1009c cVar5 = C1009c.this;
                if (cVar5.f3822g != null) {
                    boolean z = false;
                    boolean z2 = cVar5.f3824i.size() == 0;
                    boolean z3 = !z2 && i == 2 && eVar.f3816a.size() == 0;
                    if (!z2 && i == 1 && eVar.f3816a.size() == 0) {
                        z = true;
                    }
                    C1009c.this.mo4843a(z2, z3, z);
                }
            }
        }
    }

    /* renamed from: androidx.paging.c$b */
    class C1011b implements Runnable {

        /* renamed from: e */
        final /* synthetic */ int f3794e;

        /* renamed from: f */
        final /* synthetic */ Object f3795f;

        C1011b(int i, Object obj) {
            this.f3794e = i;
            this.f3795f = obj;
        }

        public void run() {
            if (!C1009c.this.mo4849f()) {
                if (C1009c.this.f3787r.mo4804c()) {
                    C1009c.this.mo4840a();
                } else {
                    C1008b a = C1009c.this.f3787r;
                    int i = this.f3794e;
                    Object obj = this.f3795f;
                    C1009c cVar = C1009c.this;
                    a.mo4823b(i, obj, cVar.f3823h.f3846a, cVar.f3820e, cVar.f3792w);
                }
            }
        }
    }

    /* renamed from: androidx.paging.c$c */
    class C1012c implements Runnable {

        /* renamed from: e */
        final /* synthetic */ int f3797e;

        /* renamed from: f */
        final /* synthetic */ Object f3798f;

        C1012c(int i, Object obj) {
            this.f3797e = i;
            this.f3798f = obj;
        }

        public void run() {
            if (!C1009c.this.mo4849f()) {
                if (C1009c.this.f3787r.mo4804c()) {
                    C1009c.this.mo4840a();
                } else {
                    C1008b a = C1009c.this.f3787r;
                    int i = this.f3797e;
                    Object obj = this.f3798f;
                    C1009c cVar = C1009c.this;
                    a.mo4821a(i, obj, cVar.f3823h.f3846a, cVar.f3820e, cVar.f3792w);
                }
            }
        }
    }

    C1009c(C1008b<K, V> bVar, Executor executor, Executor executor2, C1021c<V> cVar, C1024f fVar, K k, int i) {
        super(new C1028h(), executor, executor2, cVar, fVar);
        this.f3787r = bVar;
        this.f3825j = i;
        if (this.f3787r.mo4804c()) {
            mo4840a();
            return;
        }
        C1008b<K, V> bVar2 = this.f3787r;
        C1024f fVar2 = this.f3823h;
        bVar2.mo4822a(k, fVar2.f3849d, fVar2.f3846a, fVar2.f3848c, this.f3820e, this.f3792w);
    }

    /* renamed from: i */
    private void m4536i() {
        if (!this.f3789t) {
            this.f3789t = true;
            this.f3821f.execute(new C1012c(((this.f3824i.mo4884e() + this.f3824i.mo4890j()) - 1) + this.f3824i.mo4889i(), this.f3824i.mo4883d()));
        }
    }

    /* renamed from: j */
    private void m4537j() {
        if (!this.f3788s) {
            this.f3788s = true;
            this.f3821f.execute(new C1011b(this.f3824i.mo4884e() + this.f3824i.mo4889i(), this.f3824i.mo4882c()));
        }
    }

    /* renamed from: c */
    public Object mo4831c() {
        return this.f3787r.mo4820a(this.f3825j, this.f3826k);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo4832d(int i) {
        int e = this.f3823h.f3847b - (i - this.f3824i.mo4884e());
        int e2 = (i + this.f3823h.f3847b) - (this.f3824i.mo4884e() + this.f3824i.mo4890j());
        this.f3790u = Math.max(e, this.f3790u);
        if (this.f3790u > 0) {
            m4537j();
        }
        this.f3791v = Math.max(e2, this.f3791v);
        if (this.f3791v > 0) {
            m4536i();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public boolean mo4833e() {
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4827a(C1018f<V> fVar, C1023e eVar) {
        C1028h<T> hVar = fVar.f3824i;
        int f = this.f3824i.mo4885f() - hVar.mo4885f();
        int g = this.f3824i.mo4886g() - hVar.mo4886g();
        int k = hVar.mo4891k();
        int e = hVar.mo4884e();
        if (hVar.isEmpty() || f < 0 || g < 0 || this.f3824i.mo4891k() != Math.max(k - f, 0) || this.f3824i.mo4884e() != Math.max(e - g, 0) || this.f3824i.mo4890j() != hVar.mo4890j() + f + g) {
            throw new IllegalArgumentException("Invalid snapshot provided - doesn't appear to be a snapshot of this PagedList");
        }
        if (f != 0) {
            int min = Math.min(k, f);
            int i = f - min;
            int e2 = hVar.mo4884e() + hVar.mo4890j();
            if (min != 0) {
                eVar.mo4815a(e2, min);
            }
            if (i != 0) {
                eVar.mo4816b(e2 + min, i);
            }
        }
        if (g != 0) {
            int min2 = Math.min(e, g);
            int i2 = g - min2;
            if (min2 != 0) {
                eVar.mo4815a(e, min2);
            }
            if (i2 != 0) {
                eVar.mo4816b(0, i2);
            }
        }
    }

    /* renamed from: b */
    public DataSource<?, V> mo4828b() {
        return this.f3787r;
    }

    /* renamed from: b */
    public void mo4830b(int i, int i2, int i3) {
        this.f3790u = (this.f3790u - i2) - i3;
        this.f3788s = false;
        if (this.f3790u > 0) {
            m4537j();
        }
        mo4844b(i, i2);
        mo4846c(0, i3);
        mo4848e(i3);
    }

    /* renamed from: b */
    public void mo4829b(int i) {
        throw new IllegalStateException("Tiled callback on ContiguousPagedList");
    }

    /* renamed from: a */
    public void mo4824a(int i) {
        mo4846c(0, i);
    }

    /* renamed from: a */
    public void mo4826a(int i, int i2, int i3) {
        this.f3791v = (this.f3791v - i2) - i3;
        this.f3789t = false;
        if (this.f3791v > 0) {
            m4536i();
        }
        mo4844b(i, i2);
        mo4846c(i + i2, i3);
    }

    /* renamed from: a */
    public void mo4825a(int i, int i2) {
        throw new IllegalStateException("Tiled callback on ContiguousPagedList");
    }
}
