package app.zenly.locator.support.p171t0.p173g.p175i.p178e.p182g;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import app.zenly.locator.C3891l;
import app.zenly.locator.support.p171t0.p173g.p175i.p178e.p183h.C5876a;
import java.util.HashMap;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p263b.p264a.p272j.C7709b;
import p250f.p251a.p252a.p263b.p264a.p272j.p273g.C7717d;

/* renamed from: app.zenly.locator.support.t0.g.i.e.g.a */
public final class C5872a extends C7717d<C5876a> {

    /* renamed from: e */
    private HashMap f14853e;

    /* renamed from: a */
    public View mo13554a(int i) {
        if (this.f14853e == null) {
            this.f14853e = new HashMap();
        }
        View view = (View) this.f14853e.get(Integer.valueOf(i));
        if (view == null) {
            View containerView = getContainerView();
            if (containerView == null) {
                return null;
            }
            view = containerView.findViewById(i);
            this.f14853e.put(Integer.valueOf(i), view);
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
    public void mo6952a(C5876a aVar, C5876a aVar2) {
        C12932j.m33818b(aVar, "model");
        TextView textView = (TextView) mo13554a(C3891l.explanation_text);
        C12932j.m33815a((Object) textView, "explanation_text");
        Context context = mo34493b().getContext();
        C12932j.m33815a((Object) context, "itemView.context");
        textView.setText(C7709b.m18762a(context, aVar.mo13562f()));
    }
}
