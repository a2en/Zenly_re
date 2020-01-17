package app.zenly.locator.dashboard.p080y;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import app.zenly.locator.C3891l;
import app.zenly.locator.dashboard.p081z.C3430i;
import java.util.HashMap;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p263b.p264a.p272j.C7709b;
import p250f.p251a.p252a.p263b.p264a.p272j.p273g.C7717d;

/* renamed from: app.zenly.locator.dashboard.y.i */
public final class C3405i extends C7717d<C3430i> {

    /* renamed from: e */
    private HashMap f9393e;

    /* renamed from: a */
    public View mo9906a(int i) {
        if (this.f9393e == null) {
            this.f9393e = new HashMap();
        }
        View view = (View) this.f9393e.get(Integer.valueOf(i));
        if (view == null) {
            View containerView = getContainerView();
            if (containerView == null) {
                return null;
            }
            view = containerView.findViewById(i);
            this.f9393e.put(Integer.valueOf(i), view);
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
    public void mo6952a(C3430i iVar, C3430i iVar2) {
        C12932j.m33818b(iVar, "model");
        TextView textView = (TextView) mo9906a(C3891l.explanation_text);
        C12932j.m33815a((Object) textView, "explanation_text");
        Context context = mo34493b().getContext();
        C12932j.m33815a((Object) context, "itemView.context");
        textView.setText(C7709b.m18762a(context, iVar.mo9942f()));
    }
}
