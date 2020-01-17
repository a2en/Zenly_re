package app.zenly.android.feature.descendants.p012s;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.C1085v;
import app.zenly.android.feature.descendants.C1387l;
import app.zenly.android.feature.descendants.Navigation;
import app.zenly.android.feature.descendants.model.C1391b;
import app.zenly.android.feature.descendants.p011r.C1401a;
import app.zenly.android.feature.descendants.recycler.C1406a;
import app.zenly.android.feature.descendants.recycler.ViewRenderer;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.android.feature.descendants.s.a */
public final class C1409a implements ViewRenderer<C1391b, C1085v> {

    /* renamed from: a */
    private final Activity f5075a;

    /* renamed from: b */
    private final Navigation f5076b;

    public C1409a(Activity activity, Navigation navigation) {
        C12932j.m33818b(activity, "activity");
        C12932j.m33818b(navigation, "navigation");
        this.f5075a = activity;
        this.f5076b = navigation;
    }

    public void bindView(C1406a<C1391b> aVar, C1085v vVar) {
        C12932j.m33818b(aVar, "model");
        C12932j.m33818b(vVar, "holder");
    }

    public C1085v createViewHolder(ViewGroup viewGroup) {
        C12932j.m33818b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C1387l.list_item_invite, viewGroup, false);
        Activity activity = this.f5075a;
        Navigation navigation = this.f5076b;
        C12932j.m33815a((Object) inflate, "view");
        return new C1401a(activity, navigation, inflate);
    }

    public int getType() {
        return 2;
    }
}
