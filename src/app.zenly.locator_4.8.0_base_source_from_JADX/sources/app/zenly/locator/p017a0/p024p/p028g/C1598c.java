package app.zenly.locator.p017a0.p024p.p028g;

import android.view.View;
import android.widget.TextView;
import app.zenly.locator.C3891l;
import app.zenly.locator.p017a0.p024p.p029h.C1607c;
import java.util.HashMap;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p263b.p264a.p272j.p273g.C7717d;

/* renamed from: app.zenly.locator.a0.p.g.c */
public final class C1598c extends C7717d<C1607c> {

    /* renamed from: e */
    private HashMap f5567e;

    /* renamed from: a */
    public View mo7159a(int i) {
        if (this.f5567e == null) {
            this.f5567e = new HashMap();
        }
        View view = (View) this.f5567e.get(Integer.valueOf(i));
        if (view == null) {
            View containerView = getContainerView();
            if (containerView == null) {
                return null;
            }
            view = containerView.findViewById(i);
            this.f5567e.put(Integer.valueOf(i), view);
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
    public void mo6952a(C1607c cVar, C1607c cVar2) {
        C12932j.m33818b(cVar, "model");
        ((TextView) mo7159a(C3891l.title)).setText(cVar.mo7175f());
    }
}
