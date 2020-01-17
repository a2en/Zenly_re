package app.zenly.locator.p017a0.p035r.p038h;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import app.zenly.locator.C3891l;
import app.zenly.locator.p017a0.p035r.p039i.C1672a;
import java.util.HashMap;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p263b.p264a.p272j.C7709b;
import p250f.p251a.p252a.p263b.p264a.p272j.p273g.C7717d;

/* renamed from: app.zenly.locator.a0.r.h.a */
public final class C1666a extends C7717d<C1672a> {

    /* renamed from: e */
    private HashMap f5706e;

    /* renamed from: a */
    public View mo7266a(int i) {
        if (this.f5706e == null) {
            this.f5706e = new HashMap();
        }
        View view = (View) this.f5706e.get(Integer.valueOf(i));
        if (view == null) {
            View containerView = getContainerView();
            if (containerView == null) {
                return null;
            }
            view = containerView.findViewById(i);
            this.f5706e.put(Integer.valueOf(i), view);
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
    public void mo6952a(C1672a aVar, C1672a aVar2) {
        C12932j.m33818b(aVar, "model");
        TextView textView = (TextView) mo7266a(C3891l.explanation_text);
        C12932j.m33815a((Object) textView, "explanation_text");
        Context context = mo34493b().getContext();
        C12932j.m33815a((Object) context, "itemView.context");
        textView.setText(C7709b.m18762a(context, aVar.mo7275f()));
    }
}
