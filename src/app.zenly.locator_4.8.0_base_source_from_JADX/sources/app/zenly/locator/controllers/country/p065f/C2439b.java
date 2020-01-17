package app.zenly.locator.controllers.country.p065f;

import android.view.View;
import android.widget.TextView;
import app.zenly.locator.C3891l;
import app.zenly.locator.controllers.country.p066g.C2441b;
import java.util.HashMap;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p263b.p264a.p272j.p273g.C7717d;

/* renamed from: app.zenly.locator.controllers.country.f.b */
public final class C2439b extends C7717d<C2441b> {

    /* renamed from: e */
    private HashMap f7327e;

    /* renamed from: a */
    public View mo8402a(int i) {
        if (this.f7327e == null) {
            this.f7327e = new HashMap();
        }
        View view = (View) this.f7327e.get(Integer.valueOf(i));
        if (view == null) {
            View containerView = getContainerView();
            if (containerView == null) {
                return null;
            }
            view = containerView.findViewById(i);
            this.f7327e.put(Integer.valueOf(i), view);
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
    public void mo6952a(C2441b bVar, C2441b bVar2) {
        C12932j.m33818b(bVar, "model");
        ((TextView) mo8402a(C3891l.title)).setText(bVar.mo8409f());
    }
}
