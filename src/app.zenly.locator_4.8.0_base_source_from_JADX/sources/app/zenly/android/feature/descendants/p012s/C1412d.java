package app.zenly.android.feature.descendants.p012s;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.C1085v;
import app.zenly.android.feature.base.model.AvatarLoader;
import app.zenly.android.feature.descendants.C1387l;
import app.zenly.android.feature.descendants.model.RankedDescendant;
import app.zenly.android.feature.descendants.p011r.C1405d;
import app.zenly.android.feature.descendants.recycler.C1406a;
import app.zenly.android.feature.descendants.recycler.ViewRenderer;
import com.bumptech.glide.C8867j;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.android.feature.descendants.s.d */
public final class C1412d implements ViewRenderer<RankedDescendant, C1085v> {

    /* renamed from: a */
    private final AvatarLoader f5078a;

    /* renamed from: b */
    private final C8867j f5079b;

    public C1412d(AvatarLoader avatarLoader, C8867j jVar) {
        C12932j.m33818b(avatarLoader, "avatarLoader");
        C12932j.m33818b(jVar, "requestManager");
        this.f5078a = avatarLoader;
        this.f5079b = jVar;
    }

    public void bindView(C1406a<? extends RankedDescendant> aVar, C1085v vVar) {
        C12932j.m33818b(aVar, "model");
        C12932j.m33818b(vVar, "holder");
        ((C1405d) vVar).mo6664a((RankedDescendant) aVar.mo6668a());
    }

    public C1085v createViewHolder(ViewGroup viewGroup) {
        C12932j.m33818b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C1387l.list_item_top_descendant, viewGroup, false);
        AvatarLoader avatarLoader = this.f5078a;
        C8867j jVar = this.f5079b;
        C12932j.m33815a((Object) inflate, "view");
        C1405d dVar = new C1405d(avatarLoader, jVar, inflate, false, 8, null);
        return dVar;
    }

    public int getType() {
        return 4;
    }
}
