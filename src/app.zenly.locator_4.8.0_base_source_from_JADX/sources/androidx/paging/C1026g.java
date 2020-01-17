package androidx.paging;

import androidx.recyclerview.widget.C1112g.C1116d;
import androidx.recyclerview.widget.RecyclerView.C1069g;
import androidx.recyclerview.widget.RecyclerView.C1085v;

/* renamed from: androidx.paging.g */
public abstract class C1026g<T, VH extends C1085v> extends C1069g<VH> {

    /* renamed from: a */
    private final C1003a<T> f3854a;

    /* renamed from: b */
    private final C1007c<T> f3855b = new C1027a();

    /* renamed from: androidx.paging.g$a */
    class C1027a implements C1007c<T> {
        C1027a() {
        }

        /* renamed from: a */
        public void mo4819a(C1018f<T> fVar) {
            C1026g.this.mo4870a(fVar);
        }
    }

    protected C1026g(C1116d<T> dVar) {
        this.f3854a = new C1003a<>(this, dVar);
        this.f3854a.f3773d = this.f3855b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public T mo4869a(int i) {
        return this.f3854a.mo4812a(i);
    }

    /* renamed from: a */
    public void mo4870a(C1018f<T> fVar) {
    }

    /* renamed from: b */
    public void mo4871b(C1018f<T> fVar) {
        this.f3854a.mo4813a(fVar);
    }

    public int getItemCount() {
        return this.f3854a.mo4811a();
    }
}
