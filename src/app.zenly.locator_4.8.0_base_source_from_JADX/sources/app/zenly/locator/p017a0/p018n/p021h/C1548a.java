package app.zenly.locator.p017a0.p018n.p021h;

import android.view.View;
import android.widget.TextView;
import app.zenly.locator.C3891l;
import app.zenly.locator.R;
import app.zenly.locator.p017a0.p018n.p022i.C1551a;
import java.util.HashMap;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p263b.p264a.p272j.p273g.C7717d;

/* renamed from: app.zenly.locator.a0.n.h.a */
public final class C1548a extends C7717d<C1551a> {

    /* renamed from: e */
    private HashMap f5463e;

    /* renamed from: a */
    public View mo7083a(int i) {
        if (this.f5463e == null) {
            this.f5463e = new HashMap();
        }
        View view = (View) this.f5463e.get(Integer.valueOf(i));
        if (view == null) {
            View containerView = getContainerView();
            if (containerView == null) {
                return null;
            }
            view = containerView.findViewById(i);
            this.f5463e.put(Integer.valueOf(i), view);
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
    public void mo6952a(C1551a aVar, C1551a aVar2) {
        C12932j.m33818b(aVar, "model");
        TextView textView = (TextView) mo7083a(C3891l.text);
        String str = "text";
        C12932j.m33815a((Object) textView, str);
        TextView textView2 = (TextView) mo7083a(C3891l.text);
        C12932j.m33815a((Object) textView2, str);
        textView.setText(textView2.getResources().getQuantityString(R.plurals.settings_blocked_subtitle, aVar.mo7090f(), new Object[]{Integer.valueOf(aVar.mo7090f())}));
    }
}
