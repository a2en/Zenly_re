package app.zenly.locator.p017a0.p030q.p033e;

import android.view.View;
import android.widget.TextView;
import app.zenly.locator.C3891l;
import app.zenly.locator.p017a0.p030q.p034f.C1649e;
import java.util.HashMap;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p263b.p264a.p272j.p273g.C7717d;

/* renamed from: app.zenly.locator.a0.q.e.e */
public final class C1644e extends C7717d<C1649e> {

    /* renamed from: e */
    private HashMap f5660e;

    /* renamed from: a */
    public View mo7229a(int i) {
        if (this.f5660e == null) {
            this.f5660e = new HashMap();
        }
        View view = (View) this.f5660e.get(Integer.valueOf(i));
        if (view == null) {
            View containerView = getContainerView();
            if (containerView == null) {
                return null;
            }
            view = containerView.findViewById(i);
            this.f5660e.put(Integer.valueOf(i), view);
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
    public void mo6952a(C1649e eVar, C1649e eVar2) {
        C12932j.m33818b(eVar, "model");
        ((TextView) mo7229a(C3891l.title)).setText(eVar.mo7251f());
    }
}
