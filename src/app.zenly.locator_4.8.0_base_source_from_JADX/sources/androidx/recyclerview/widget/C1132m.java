package androidx.recyclerview.widget;

import androidx.recyclerview.widget.AsyncListDiffer.ListListener;
import androidx.recyclerview.widget.C1095c.C1096a;
import androidx.recyclerview.widget.C1112g.C1116d;
import androidx.recyclerview.widget.RecyclerView.C1069g;
import androidx.recyclerview.widget.RecyclerView.C1085v;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.m */
public abstract class C1132m<T, VH extends C1085v> extends C1069g<VH> {

    /* renamed from: a */
    final AsyncListDiffer<T> f4343a;

    /* renamed from: b */
    private final ListListener<T> f4344b = new C1133a();

    /* renamed from: androidx.recyclerview.widget.m$a */
    class C1133a implements ListListener<T> {
        C1133a() {
        }

        public void onCurrentListChanged(List<T> list, List<T> list2) {
            C1132m.this.mo5741a(list, list2);
        }
    }

    protected C1132m(C1116d<T> dVar) {
        this.f4343a = new AsyncListDiffer<>(new C1094b(this), new C1096a(dVar).mo5640a());
        this.f4343a.mo4918a(this.f4344b);
    }

    /* renamed from: a */
    public void mo5740a(List<T> list) {
        this.f4343a.mo4919a(list);
    }

    /* renamed from: a */
    public void mo5741a(List<T> list, List<T> list2) {
    }

    public int getItemCount() {
        return this.f4343a.mo4917a().size();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public T mo5739a(int i) {
        return this.f4343a.mo4917a().get(i);
    }
}
