package androidx.recyclerview.widget;

import androidx.core.util.C0605g;
import androidx.core.util.Pools$Pool;
import androidx.recyclerview.widget.RecyclerView.C1085v;
import androidx.recyclerview.widget.RecyclerView.ItemAnimator.C1057b;
import p214e.p228e.C7571a;
import p214e.p228e.C7576d;

/* renamed from: androidx.recyclerview.widget.y */
class C1156y {

    /* renamed from: a */
    final C7571a<C1085v, C1157a> f4381a = new C7571a<>();

    /* renamed from: b */
    final C7576d<C1085v> f4382b = new C7576d<>();

    /* renamed from: androidx.recyclerview.widget.y$a */
    static class C1157a {

        /* renamed from: d */
        static Pools$Pool<C1157a> f4383d = new C0605g(20);

        /* renamed from: a */
        int f4384a;

        /* renamed from: b */
        C1057b f4385b;

        /* renamed from: c */
        C1057b f4386c;

        private C1157a() {
        }

        /* renamed from: a */
        static void m5670a(C1157a aVar) {
            aVar.f4384a = 0;
            aVar.f4385b = null;
            aVar.f4386c = null;
            f4383d.release(aVar);
        }

        /* renamed from: b */
        static C1157a m5671b() {
            C1157a aVar = (C1157a) f4383d.acquire();
            return aVar == null ? new C1157a() : aVar;
        }

        /* renamed from: a */
        static void m5669a() {
            do {
            } while (f4383d.acquire() != null);
        }
    }

    /* renamed from: androidx.recyclerview.widget.y$b */
    interface C1158b {
        /* renamed from: a */
        void mo5360a(C1085v vVar);

        /* renamed from: a */
        void mo5361a(C1085v vVar, C1057b bVar, C1057b bVar2);

        /* renamed from: b */
        void mo5362b(C1085v vVar, C1057b bVar, C1057b bVar2);

        /* renamed from: c */
        void mo5363c(C1085v vVar, C1057b bVar, C1057b bVar2);
    }

    C1156y() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5810a() {
        this.f4381a.clear();
        this.f4382b.clear();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo5817b(C1085v vVar) {
        C1157a aVar = (C1157a) this.f4381a.get(vVar);
        if (aVar == null || (aVar.f4384a & 1) == 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo5818c(C1085v vVar, C1057b bVar) {
        C1157a aVar = (C1157a) this.f4381a.get(vVar);
        if (aVar == null) {
            aVar = C1157a.m5671b();
            this.f4381a.put(vVar, aVar);
        }
        aVar.f4385b = bVar;
        aVar.f4384a |= 4;
    }

    /* renamed from: d */
    public void mo5820d(C1085v vVar) {
        mo5823g(vVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public C1057b mo5821e(C1085v vVar) {
        return m5652a(vVar, 8);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public C1057b mo5822f(C1085v vVar) {
        return m5652a(vVar, 4);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo5823g(C1085v vVar) {
        C1157a aVar = (C1157a) this.f4381a.get(vVar);
        if (aVar != null) {
            aVar.f4384a &= -2;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public void mo5824h(C1085v vVar) {
        int a = this.f4382b.mo19504a() - 1;
        while (true) {
            if (a < 0) {
                break;
            } else if (vVar == this.f4382b.mo19512c(a)) {
                this.f4382b.mo19510b(a);
                break;
            } else {
                a--;
            }
        }
        C1157a aVar = (C1157a) this.f4381a.remove(vVar);
        if (aVar != null) {
            C1157a.m5670a(aVar);
        }
    }

    /* renamed from: a */
    private C1057b m5652a(C1085v vVar, int i) {
        C1057b bVar;
        int b = this.f4381a.mo19594b((Object) vVar);
        if (b < 0) {
            return null;
        }
        C1157a aVar = (C1157a) this.f4381a.mo19601d(b);
        if (aVar != null) {
            int i2 = aVar.f4384a;
            if ((i2 & i) != 0) {
                aVar.f4384a = (~i) & i2;
                if (i == 4) {
                    bVar = aVar.f4385b;
                } else if (i == 8) {
                    bVar = aVar.f4386c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((aVar.f4384a & 12) == 0) {
                    this.f4381a.mo19597c(b);
                    C1157a.m5670a(aVar);
                }
                return bVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo5816b(C1085v vVar, C1057b bVar) {
        C1157a aVar = (C1157a) this.f4381a.get(vVar);
        if (aVar == null) {
            aVar = C1157a.m5671b();
            this.f4381a.put(vVar, aVar);
        }
        aVar.f4386c = bVar;
        aVar.f4384a |= 8;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo5819c(C1085v vVar) {
        C1157a aVar = (C1157a) this.f4381a.get(vVar);
        return (aVar == null || (aVar.f4384a & 4) == 0) ? false : true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo5815b() {
        C1157a.m5669a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5811a(long j, C1085v vVar) {
        this.f4382b.mo19514c(j, vVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5813a(C1085v vVar, C1057b bVar) {
        C1157a aVar = (C1157a) this.f4381a.get(vVar);
        if (aVar == null) {
            aVar = C1157a.m5671b();
            this.f4381a.put(vVar, aVar);
        }
        aVar.f4384a |= 2;
        aVar.f4385b = bVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C1085v mo5809a(long j) {
        return (C1085v) this.f4382b.mo19513c(j);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5812a(C1085v vVar) {
        C1157a aVar = (C1157a) this.f4381a.get(vVar);
        if (aVar == null) {
            aVar = C1157a.m5671b();
            this.f4381a.put(vVar, aVar);
        }
        aVar.f4384a |= 1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5814a(C1158b bVar) {
        for (int size = this.f4381a.size() - 1; size >= 0; size--) {
            C1085v vVar = (C1085v) this.f4381a.mo19595b(size);
            C1157a aVar = (C1157a) this.f4381a.mo19597c(size);
            int i = aVar.f4384a;
            if ((i & 3) == 3) {
                bVar.mo5360a(vVar);
            } else if ((i & 1) != 0) {
                C1057b bVar2 = aVar.f4385b;
                if (bVar2 == null) {
                    bVar.mo5360a(vVar);
                } else {
                    bVar.mo5362b(vVar, bVar2, aVar.f4386c);
                }
            } else if ((i & 14) == 14) {
                bVar.mo5361a(vVar, aVar.f4385b, aVar.f4386c);
            } else if ((i & 12) == 12) {
                bVar.mo5363c(vVar, aVar.f4385b, aVar.f4386c);
            } else if ((i & 4) != 0) {
                bVar.mo5362b(vVar, aVar.f4385b, null);
            } else if ((i & 8) != 0) {
                bVar.mo5361a(vVar, aVar.f4385b, aVar.f4386c);
            }
            C1157a.m5670a(aVar);
        }
    }
}
