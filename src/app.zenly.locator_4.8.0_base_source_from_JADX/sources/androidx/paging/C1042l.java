package androidx.paging;

import androidx.paging.C1018f.C1021c;
import androidx.paging.C1018f.C1023e;
import androidx.paging.C1018f.C1024f;
import java.util.concurrent.Executor;

/* renamed from: androidx.paging.l */
class C1042l<T> extends C1018f<T> implements C1029a {
    /* access modifiers changed from: private */

    /* renamed from: r */
    public final C1033j<T> f3888r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public C1017a<T> f3889s = new C1043a();

    /* renamed from: androidx.paging.l$a */
    class C1043a extends C1017a<T> {
        C1043a() {
        }

        /* renamed from: a */
        public void mo4834a(int i, C1016e<T> eVar) {
            if (eVar.mo4838a()) {
                C1042l.this.mo4840a();
            } else if (!C1042l.this.mo4849f()) {
                if (i == 0 || i == 3) {
                    if (C1042l.this.f3824i.mo4888h() == 0) {
                        C1042l lVar = C1042l.this;
                        lVar.f3824i.mo4875a(eVar.f3817b, eVar.f3816a, eVar.f3818c, eVar.f3819d, lVar.f3823h.f3846a, lVar);
                    } else {
                        C1042l lVar2 = C1042l.this;
                        lVar2.f3824i.mo4877a(eVar.f3819d, eVar.f3816a, lVar2);
                    }
                    C1042l lVar3 = C1042l.this;
                    if (lVar3.f3822g != null) {
                        boolean z = true;
                        boolean z2 = lVar3.f3824i.size() == 0;
                        boolean z3 = !z2 && eVar.f3817b == 0 && eVar.f3819d == 0;
                        int size = C1042l.this.size();
                        if (z2 || (!(i == 0 && eVar.f3818c == 0) && (i != 3 || eVar.f3819d + C1042l.this.f3823h.f3846a < size))) {
                            z = false;
                        }
                        C1042l.this.mo4843a(z2, z3, z);
                    }
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("unexpected resultType");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
            }
        }
    }

    /* renamed from: androidx.paging.l$b */
    class C1044b implements Runnable {

        /* renamed from: e */
        final /* synthetic */ int f3891e;

        C1044b(int i) {
            this.f3891e = i;
        }

        public void run() {
            if (!C1042l.this.mo4849f()) {
                C1042l lVar = C1042l.this;
                int i = lVar.f3823h.f3846a;
                if (lVar.f3888r.mo4804c()) {
                    C1042l.this.mo4840a();
                } else {
                    int i2 = this.f3891e * i;
                    int min = Math.min(i, C1042l.this.f3824i.size() - i2);
                    C1033j a = C1042l.this.f3888r;
                    C1042l lVar2 = C1042l.this;
                    a.mo4905a(3, i2, min, lVar2.f3820e, lVar2.f3889s);
                }
            }
        }
    }

    C1042l(C1033j<T> jVar, Executor executor, Executor executor2, C1021c<T> cVar, C1024f fVar, int i) {
        super(new C1028h(), executor, executor2, cVar, fVar);
        this.f3888r = jVar;
        int i2 = this.f3823h.f3846a;
        this.f3825j = i;
        if (this.f3888r.mo4804c()) {
            mo4840a();
            return;
        }
        int max = Math.max(Math.round((float) (this.f3823h.f3849d / i2)), 2) * i2;
        this.f3888r.mo4908a(true, Math.max(0, Math.round((float) ((i - (max / 2)) / i2)) * i2), max, i2, this.f3820e, this.f3889s);
    }

    /* renamed from: c */
    public Object mo4831c() {
        return Integer.valueOf(this.f3825j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo4832d(int i) {
        C1028h<T> hVar = this.f3824i;
        C1024f fVar = this.f3823h;
        hVar.mo4874a(i, fVar.f3847b, fVar.f3846a, (C1029a) this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public boolean mo4833e() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo4827a(C1018f<T> fVar, C1023e eVar) {
        C1028h<T> hVar = fVar.f3824i;
        if (hVar.isEmpty() || this.f3824i.size() != hVar.size()) {
            throw new IllegalArgumentException("Invalid snapshot provided - doesn't appear to be a snapshot of this PagedList");
        }
        int i = this.f3823h.f3846a;
        int e = this.f3824i.mo4884e() / i;
        int h = this.f3824i.mo4888h();
        int i2 = 0;
        while (i2 < h) {
            int i3 = i2 + e;
            int i4 = 0;
            while (i4 < this.f3824i.mo4888h()) {
                int i5 = i3 + i4;
                if (!this.f3824i.mo4879a(i, i5) || hVar.mo4879a(i, i5)) {
                    break;
                }
                i4++;
            }
            if (i4 > 0) {
                eVar.mo4815a(i3 * i, i * i4);
                i2 += i4 - 1;
            }
            i2++;
        }
    }

    /* renamed from: b */
    public DataSource<?, T> mo4828b() {
        return this.f3888r;
    }

    /* renamed from: b */
    public void mo4830b(int i, int i2, int i3) {
        throw new IllegalStateException("Contiguous callback on TiledPagedList");
    }

    /* renamed from: b */
    public void mo4829b(int i) {
        this.f3821f.execute(new C1044b(i));
    }

    /* renamed from: a */
    public void mo4824a(int i) {
        mo4846c(0, i);
    }

    /* renamed from: a */
    public void mo4826a(int i, int i2, int i3) {
        throw new IllegalStateException("Contiguous callback on TiledPagedList");
    }

    /* renamed from: a */
    public void mo4825a(int i, int i2) {
        mo4844b(i, i2);
    }
}
