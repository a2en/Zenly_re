package app.zenly.locator.experimental.inbox.p094k;

import android.view.View;
import android.widget.TextView;
import app.zenly.locator.C3891l;
import app.zenly.locator.experimental.inbox.p095l.C3722c;
import java.util.HashMap;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p263b.p264a.p272j.p273g.C7717d;

/* renamed from: app.zenly.locator.experimental.inbox.k.d */
public final class C3719d extends C7717d<C3722c> {

    /* renamed from: e */
    private HashMap f9967e;

    /* renamed from: a */
    public View mo10249a(int i) {
        if (this.f9967e == null) {
            this.f9967e = new HashMap();
        }
        View view = (View) this.f9967e.get(Integer.valueOf(i));
        if (view == null) {
            View containerView = getContainerView();
            if (containerView == null) {
                return null;
            }
            view = containerView.findViewById(i);
            this.f9967e.put(Integer.valueOf(i), view);
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
    public void mo6952a(C3722c cVar, C3722c cVar2) {
        C12932j.m33818b(cVar, "model");
        TextView textView = (TextView) mo10249a(C3891l.title);
        C12932j.m33815a((Object) textView, "title");
        textView.setText(cVar.mo10256f());
    }
}
