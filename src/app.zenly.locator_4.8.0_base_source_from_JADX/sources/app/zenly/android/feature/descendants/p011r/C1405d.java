package app.zenly.android.feature.descendants.p011r;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.C0540a;
import androidx.recyclerview.widget.RecyclerView.C1085v;
import app.zenly.android.feature.base.model.AvatarLoader;
import app.zenly.android.feature.base.model.AvatarLoader.Request;
import app.zenly.android.feature.descendants.C1383h;
import app.zenly.android.feature.descendants.C1385j;
import app.zenly.android.feature.descendants.C1386k;
import app.zenly.android.feature.descendants.model.C1389a;
import app.zenly.android.feature.descendants.model.RankedDescendant;
import com.bumptech.glide.C8867j;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p263b.p264a.p269h.p270a.C7706a;

/* renamed from: app.zenly.android.feature.descendants.r.d */
public final class C1405d extends C1085v {

    /* renamed from: a */
    private final TextView f5060a;

    /* renamed from: b */
    private final ImageView f5061b;

    /* renamed from: c */
    private final TextView f5062c;

    /* renamed from: d */
    private final View f5063d;

    /* renamed from: e */
    private final TextView f5064e;

    /* renamed from: f */
    private final ImageView f5065f;

    /* renamed from: g */
    private final AvatarLoader f5066g;

    /* renamed from: h */
    private final C8867j f5067h;

    /* renamed from: i */
    private final View f5068i;

    /* renamed from: j */
    private final boolean f5069j;

    public /* synthetic */ C1405d(AvatarLoader avatarLoader, C8867j jVar, View view, boolean z, int i, C12928f fVar) {
        if ((i & 8) != 0) {
            z = false;
        }
        this(avatarLoader, jVar, view, z);
    }

    /* renamed from: a */
    public final void mo6664a(RankedDescendant rankedDescendant) {
        C12932j.m33818b(rankedDescendant, "rankedPop");
        TextView textView = this.f5060a;
        C12932j.m33815a((Object) textView, "title");
        textView.setText(rankedDescendant.getDisplayName());
        Request load = this.f5066g.load(rankedDescendant.getAvatar());
        ImageView imageView = this.f5061b;
        C12932j.m33815a((Object) imageView, "avatar");
        load.into(imageView);
        TextView textView2 = this.f5062c;
        C12932j.m33815a((Object) textView2, "rank");
        Context context = this.f5068i.getContext();
        String str = "root.context";
        C12932j.m33815a((Object) context, str);
        textView2.setText(C7706a.m18754a(context, rankedDescendant.getRank(), 0, 4, (Object) null));
        TextView textView3 = this.f5064e;
        C12932j.m33815a((Object) textView3, "descendantCount");
        Context context2 = this.f5068i.getContext();
        C12932j.m33815a((Object) context2, str);
        textView3.setText(C7706a.m18754a(context2, rankedDescendant.getDescendantCount(), 0, 4, (Object) null));
        this.f5067h.mo8548a(Integer.valueOf(C1389a.m6432a(rankedDescendant.getDescendantCount()).mo6655b())).mo24173a(this.f5065f);
        if (this.f5069j) {
            this.f5063d.setBackgroundResource(C1385j.circle_cerulean_blue_dark);
            this.f5062c.setTextColor(C0540a.m2536a(this.f5068i.getContext(), C1383h.blue));
            return;
        }
        this.f5063d.setBackgroundResource(C1385j.circle_gray_light);
        this.f5062c.setTextColor(C0540a.m2536a(this.f5068i.getContext(), C1383h.gray_dark));
    }

    public C1405d(AvatarLoader avatarLoader, C8867j jVar, View view, boolean z) {
        C12932j.m33818b(avatarLoader, "avatarLoader");
        C12932j.m33818b(jVar, "requestManager");
        C12932j.m33818b(view, "root");
        super(view);
        this.f5066g = avatarLoader;
        this.f5067h = jVar;
        this.f5068i = view;
        this.f5069j = z;
        this.f5060a = (TextView) this.f5068i.findViewById(C1386k.title);
        this.f5061b = (ImageView) this.f5068i.findViewById(C1386k.avatar);
        this.f5062c = (TextView) this.f5068i.findViewById(C1386k.rank);
        this.f5063d = this.f5068i.findViewById(C1386k.rank_circle);
        this.f5064e = (TextView) this.f5068i.findViewById(C1386k.descendant_count);
        this.f5065f = (ImageView) this.f5068i.findViewById(C1386k.descendant_icon);
    }
}
