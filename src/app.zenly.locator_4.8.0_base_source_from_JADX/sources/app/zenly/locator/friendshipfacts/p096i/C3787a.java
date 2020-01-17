package app.zenly.locator.friendshipfacts.p096i;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import app.zenly.locator.C3891l;
import app.zenly.locator.friendshipfacts.p100m.C3811a;
import java.util.HashMap;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p263b.p264a.p272j.p273g.C7717d;

/* renamed from: app.zenly.locator.friendshipfacts.i.a */
public final class C3787a extends C7717d<C3811a> {

    /* renamed from: e */
    private HashMap f10115e;

    /* renamed from: a */
    public View mo10349a(int i) {
        if (this.f10115e == null) {
            this.f10115e = new HashMap();
        }
        View view = (View) this.f10115e.get(Integer.valueOf(i));
        if (view == null) {
            View containerView = getContainerView();
            if (containerView == null) {
                return null;
            }
            view = containerView.findViewById(i);
            this.f10115e.put(Integer.valueOf(i), view);
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
    public void mo6952a(C3811a aVar, C3811a aVar2) {
        C12932j.m33818b(aVar, "model");
        ((ImageView) mo10349a(C3891l.placeholder)).setImageResource(aVar.mo10394g());
        TextView textView = (TextView) mo10349a(C3891l.section_description);
        C12932j.m33815a((Object) textView, "section_description");
        textView.setText(aVar.mo10393f());
    }
}
