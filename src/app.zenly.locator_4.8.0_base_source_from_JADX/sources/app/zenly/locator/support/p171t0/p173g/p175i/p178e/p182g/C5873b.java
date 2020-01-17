package app.zenly.locator.support.p171t0.p173g.p175i.p178e.p182g;

import android.view.View;
import android.widget.TextView;
import app.zenly.locator.C3891l;
import app.zenly.locator.support.p171t0.p173g.p175i.p178e.p183h.C5877b;
import java.util.HashMap;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p263b.p264a.p272j.p273g.C7717d;

/* renamed from: app.zenly.locator.support.t0.g.i.e.g.b */
public final class C5873b extends C7717d<C5877b> {

    /* renamed from: e */
    private HashMap f14854e;

    /* renamed from: a */
    public View mo13556a(int i) {
        if (this.f14854e == null) {
            this.f14854e = new HashMap();
        }
        View view = (View) this.f14854e.get(Integer.valueOf(i));
        if (view == null) {
            View containerView = getContainerView();
            if (containerView == null) {
                return null;
            }
            view = containerView.findViewById(i);
            this.f14854e.put(Integer.valueOf(i), view);
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
    public void mo6952a(C5877b bVar, C5877b bVar2) {
        C12932j.m33818b(bVar, "model");
        ((TextView) mo13556a(C3891l.title)).setText(bVar.mo13565f());
    }
}
