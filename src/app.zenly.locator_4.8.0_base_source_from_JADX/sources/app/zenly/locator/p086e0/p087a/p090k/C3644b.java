package app.zenly.locator.p086e0.p087a.p090k;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import app.zenly.locator.C3891l;
import app.zenly.locator.p086e0.p087a.p091l.C3656a;
import java.util.HashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p253a.p256f.p257a.C7674a;
import p250f.p251a.p252a.p263b.p264a.p272j.p273g.C7717d;

/* renamed from: app.zenly.locator.e0.a.k.b */
public final class C3644b extends C7717d<C3656a> {

    /* renamed from: e */
    private HashMap f9778e;

    /* renamed from: a */
    public View mo10128a(int i) {
        if (this.f9778e == null) {
            this.f9778e = new HashMap();
        }
        View view = (View) this.f9778e.get(Integer.valueOf(i));
        if (view == null) {
            View containerView = getContainerView();
            if (containerView == null) {
                return null;
            }
            view = containerView.findViewById(i);
            this.f9778e.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo6953b(View view) {
        C12932j.m33818b(view, "itemView");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6952a(C3656a aVar, C3656a aVar2) {
        int i;
        C12932j.m33818b(aVar, "model");
        AppCompatImageView appCompatImageView = (AppCompatImageView) mo10128a(C3891l.image);
        int i2 = C3643a.f9777a[aVar.mo10146d().ordinal()];
        if (i2 == 1) {
            i = 2131231392;
        } else if (i2 == 2) {
            i = 2131231503;
        } else if (i2 == 3) {
            i = C7674a.f19294a;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        appCompatImageView.setImageResource(i);
    }
}
