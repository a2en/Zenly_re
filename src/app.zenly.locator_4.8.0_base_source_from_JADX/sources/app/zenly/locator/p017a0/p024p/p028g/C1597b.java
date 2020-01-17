package app.zenly.locator.p017a0.p024p.p028g;

import android.view.View;
import android.widget.TextView;
import app.zenly.locator.C3891l;
import app.zenly.locator.p017a0.p024p.p029h.C1606b;
import java.util.HashMap;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p263b.p264a.p272j.p273g.C7717d;

/* renamed from: app.zenly.locator.a0.p.g.b */
public final class C1597b extends C7717d<C1606b> {

    /* renamed from: e */
    private HashMap f5566e;

    /* renamed from: a */
    public View mo7157a(int i) {
        if (this.f5566e == null) {
            this.f5566e = new HashMap();
        }
        View view = (View) this.f5566e.get(Integer.valueOf(i));
        if (view == null) {
            View containerView = getContainerView();
            if (containerView == null) {
                return null;
            }
            view = containerView.findViewById(i);
            this.f5566e.put(Integer.valueOf(i), view);
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
    public void mo6952a(C1606b bVar, C1606b bVar2) {
        C12932j.m33818b(bVar, "model");
        TextView textView = (TextView) mo7157a(C3891l.text);
        C12932j.m33815a((Object) textView, "text");
        textView.setText(bVar.mo7174f());
    }
}
