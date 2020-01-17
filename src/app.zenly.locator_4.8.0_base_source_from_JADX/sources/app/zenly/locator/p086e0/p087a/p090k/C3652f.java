package app.zenly.locator.p086e0.p087a.p090k;

import android.view.View;
import android.widget.TextView;
import app.zenly.locator.C3891l;
import app.zenly.locator.p086e0.p087a.p091l.C3660e;
import java.util.HashMap;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p263b.p264a.p272j.p273g.C7717d;

/* renamed from: app.zenly.locator.e0.a.k.f */
public final class C3652f extends C7717d<C3660e> {

    /* renamed from: e */
    private HashMap f9787e;

    /* renamed from: a */
    public View mo10140a(int i) {
        if (this.f9787e == null) {
            this.f9787e = new HashMap();
        }
        View view = (View) this.f9787e.get(Integer.valueOf(i));
        if (view == null) {
            View containerView = getContainerView();
            if (containerView == null) {
                return null;
            }
            view = containerView.findViewById(i);
            this.f9787e.put(Integer.valueOf(i), view);
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
    public void mo6952a(C3660e eVar, C3660e eVar2) {
        C12932j.m33818b(eVar, "model");
        ((TextView) mo10140a(C3891l.title)).setText(eVar.mo10166f());
    }
}
