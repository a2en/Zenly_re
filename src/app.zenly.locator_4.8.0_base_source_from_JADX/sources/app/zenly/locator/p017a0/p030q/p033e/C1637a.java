package app.zenly.locator.p017a0.p030q.p033e;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import app.zenly.locator.C3891l;
import app.zenly.locator.p017a0.p030q.p034f.C1645a;
import java.util.HashMap;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p263b.p264a.p272j.C7709b;
import p250f.p251a.p252a.p263b.p264a.p272j.p273g.C7717d;

/* renamed from: app.zenly.locator.a0.q.e.a */
public final class C1637a extends C7717d<C1645a> {

    /* renamed from: e */
    private HashMap f5651e;

    /* renamed from: a */
    public View mo7218a(int i) {
        if (this.f5651e == null) {
            this.f5651e = new HashMap();
        }
        View view = (View) this.f5651e.get(Integer.valueOf(i));
        if (view == null) {
            View containerView = getContainerView();
            if (containerView == null) {
                return null;
            }
            view = containerView.findViewById(i);
            this.f5651e.put(Integer.valueOf(i), view);
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
    public void mo6952a(C1645a aVar, C1645a aVar2) {
        C12932j.m33818b(aVar, "model");
        TextView textView = (TextView) mo7218a(C3891l.explanation_text);
        C12932j.m33815a((Object) textView, "explanation_text");
        Context context = mo34493b().getContext();
        C12932j.m33815a((Object) context, "itemView.context");
        textView.setText(C7709b.m18762a(context, aVar.mo7232f()));
    }
}
