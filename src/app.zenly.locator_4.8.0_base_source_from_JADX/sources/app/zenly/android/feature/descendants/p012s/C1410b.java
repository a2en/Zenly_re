package app.zenly.android.feature.descendants.p012s;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.C1085v;
import app.zenly.android.feature.base.model.AvatarLoader;
import app.zenly.android.feature.descendants.C1387l;
import app.zenly.android.feature.descendants.model.Descendant;
import app.zenly.android.feature.descendants.p011r.C1403b;
import app.zenly.android.feature.descendants.recycler.C1406a;
import app.zenly.android.feature.descendants.recycler.ViewRenderer;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.android.feature.descendants.s.b */
public final class C1410b implements ViewRenderer<Descendant, C1085v> {

    /* renamed from: a */
    private final AvatarLoader f5077a;

    public C1410b(AvatarLoader avatarLoader) {
        C12932j.m33818b(avatarLoader, "avatarLoader");
        this.f5077a = avatarLoader;
    }

    public void bindView(C1406a<? extends Descendant> aVar, C1085v vVar) {
        C12932j.m33818b(aVar, "model");
        C12932j.m33818b(vVar, "holder");
        ((C1403b) vVar).mo6662a((Descendant) aVar.mo6668a());
    }

    public C1085v createViewHolder(ViewGroup viewGroup) {
        C12932j.m33818b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C1387l.list_item_descendant, viewGroup, false);
        AvatarLoader avatarLoader = this.f5077a;
        C12932j.m33815a((Object) inflate, "view");
        return new C1403b(avatarLoader, inflate);
    }

    public int getType() {
        return 1;
    }
}
