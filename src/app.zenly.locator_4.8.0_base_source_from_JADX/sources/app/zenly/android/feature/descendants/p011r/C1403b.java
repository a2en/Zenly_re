package app.zenly.android.feature.descendants.p011r;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.C1085v;
import app.zenly.android.feature.base.model.AvatarLoader;
import app.zenly.android.feature.descendants.C1386k;
import app.zenly.android.feature.descendants.model.Descendant;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.android.feature.descendants.r.b */
public final class C1403b extends C1085v {

    /* renamed from: a */
    private final ImageView f5054a;

    /* renamed from: b */
    private final TextView f5055b;

    /* renamed from: c */
    private final TextView f5056c;

    /* renamed from: d */
    private final AvatarLoader f5057d;

    public C1403b(AvatarLoader avatarLoader, View view) {
        C12932j.m33818b(avatarLoader, "avatarLoader");
        C12932j.m33818b(view, "root");
        super(view);
        this.f5057d = avatarLoader;
        View findViewById = view.findViewById(C1386k.avatar);
        C12932j.m33815a((Object) findViewById, "root.findViewById(R.id.avatar)");
        this.f5054a = (ImageView) findViewById;
        View findViewById2 = view.findViewById(C1386k.title);
        C12932j.m33815a((Object) findViewById2, "root.findViewById(R.id.title)");
        this.f5055b = (TextView) findViewById2;
        View findViewById3 = view.findViewById(C1386k.new_pop);
        C12932j.m33815a((Object) findViewById3, "root.findViewById(R.id.new_pop)");
        this.f5056c = (TextView) findViewById3;
    }

    /* renamed from: a */
    public final void mo6662a(Descendant descendant) {
        C12932j.m33818b(descendant, "data");
        this.f5055b.setText(descendant.getDisplayName());
        this.f5056c.setVisibility(descendant.getNewPop() ? 0 : 8);
        this.f5057d.load(descendant.getAvatar()).into(this.f5054a);
    }
}
