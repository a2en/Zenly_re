package app.zenly.locator.map.p112k1;

import android.content.res.ColorStateList;
import android.view.View;
import android.widget.ImageView;
import app.zenly.locator.R;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.map.k1.d */
public final class C4105d {

    /* renamed from: a */
    private ImageView f10746a;

    /* renamed from: b */
    private ImageView f10747b;

    /* renamed from: c */
    private int f10748c;

    /* renamed from: d */
    private boolean f10749d = true;

    public C4105d(View view) {
        C12932j.m33818b(view, "view");
        View findViewById = view.findViewById(R.id.gradient_bottom);
        C12932j.m33815a((Object) findViewById, "view.findViewById(R.id.gradient_bottom)");
        this.f10746a = (ImageView) findViewById;
        View findViewById2 = view.findViewById(R.id.gradient_top);
        C12932j.m33815a((Object) findViewById2, "view.findViewById(R.id.gradient_top)");
        this.f10747b = (ImageView) findViewById2;
    }

    /* renamed from: a */
    public final void mo10771a(int i) {
        this.f10748c = i;
        ColorStateList valueOf = ColorStateList.valueOf(this.f10748c);
        C12932j.m33815a((Object) valueOf, "ColorStateList.valueOf(tint)");
        this.f10746a.setImageTintList(valueOf);
        this.f10747b.setImageTintList(valueOf);
    }

    /* renamed from: a */
    public final void mo10772a(boolean z) {
        this.f10749d = z;
        if (this.f10749d) {
            this.f10746a.setVisibility(0);
            this.f10747b.setVisibility(0);
            return;
        }
        this.f10746a.setVisibility(8);
        this.f10747b.setVisibility(8);
    }
}
