package app.zenly.android.feature.descendants.p012s;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.C1085v;
import app.zenly.android.feature.descendants.C1387l;
import app.zenly.android.feature.descendants.p011r.C1404c;
import app.zenly.android.feature.descendants.recycler.C1406a;
import app.zenly.android.feature.descendants.recycler.ViewRenderer;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.android.feature.descendants.s.c */
public final class C1411c implements ViewRenderer<Integer, C1085v> {
    public void bindView(C1406a<Integer> aVar, C1085v vVar) {
        C12932j.m33818b(aVar, "model");
        C12932j.m33818b(vVar, "holder");
        ((C1404c) vVar).mo6663a(((Number) aVar.mo6668a()).intValue());
    }

    public C1085v createViewHolder(ViewGroup viewGroup) {
        C12932j.m33818b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C1387l.list_item_descendant_old, viewGroup, false);
        C12932j.m33815a((Object) inflate, "view");
        return new C1404c(inflate);
    }

    public int getType() {
        return 3;
    }
}
