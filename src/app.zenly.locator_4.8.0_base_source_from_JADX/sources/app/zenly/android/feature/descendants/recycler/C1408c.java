package app.zenly.android.feature.descendants.recycler;

import android.util.SparseArray;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1112g.C1116d;
import androidx.recyclerview.widget.C1132m;
import androidx.recyclerview.widget.RecyclerView.C1085v;
import kotlin.jvm.internal.C12932j;
import p333g.p378f.p380b.p381a.C12119a;

/* renamed from: app.zenly.android.feature.descendants.recycler.c */
public final class C1408c extends C1132m<C1406a<? extends Object>, C1085v> {

    /* renamed from: c */
    private final C12119a f5073c = new C12119a();

    /* renamed from: d */
    private final SparseArray<ViewRenderer<Object, C1085v>> f5074d = new SparseArray<>();

    public C1408c(C1116d<C1406a<Object>> dVar, boolean z) {
        C12932j.m33818b(dVar, "diffUtil");
        super(dVar);
        setHasStableIds(z);
    }

    /* renamed from: a */
    public final <T> void mo6676a(ViewRenderer<T, C1085v> viewRenderer) {
        C12932j.m33818b(viewRenderer, "renderer");
        int type = viewRenderer.getType();
        if (this.f5074d.get(type) == null) {
            this.f5074d.put(type, viewRenderer);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("ViewRenderer already exist with this type: ");
        sb.append(type);
        throw new RuntimeException(sb.toString());
    }

    public long getItemId(int i) {
        return hasStableIds() ? this.f5073c.mo35844a(((C1406a) mo5739a(i)).mo6669b()) : super.getItemId(i);
    }

    public int getItemViewType(int i) {
        return ((C1406a) mo5739a(i)).mo6670c();
    }

    public void onBindViewHolder(C1085v vVar, int i) {
        C12932j.m33818b(vVar, "holder");
        C1406a aVar = (C1406a) mo5739a(i);
        ViewRenderer viewRenderer = (ViewRenderer) this.f5074d.get(aVar.mo6670c());
        if (viewRenderer != null) {
            C12932j.m33815a((Object) aVar, "item");
            viewRenderer.bindView(aVar, vVar);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Not supported View Holder: ");
        sb.append(vVar);
        throw new RuntimeException(sb.toString());
    }

    public C1085v onCreateViewHolder(ViewGroup viewGroup, int i) {
        C12932j.m33818b(viewGroup, "parent");
        ViewRenderer viewRenderer = (ViewRenderer) this.f5074d.get(i);
        if (viewRenderer != null) {
            return viewRenderer.createViewHolder(viewGroup);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Not supported Item View Type: ");
        sb.append(i);
        throw new RuntimeException(sb.toString());
    }
}
