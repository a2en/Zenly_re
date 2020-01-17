package app.zenly.locator.userprofile.p198me.p203k;

import android.view.View;
import android.widget.TextView;
import app.zenly.locator.C3891l;
import app.zenly.locator.userprofile.p198me.p204l.C6143j;
import java.util.HashMap;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p263b.p264a.p272j.p273g.C7717d;

/* renamed from: app.zenly.locator.userprofile.me.k.h */
public final class C6129h extends C7717d<C6143j> {

    /* renamed from: e */
    private HashMap f15397e;

    /* renamed from: a */
    public View mo13963a(int i) {
        if (this.f15397e == null) {
            this.f15397e = new HashMap();
        }
        View view = (View) this.f15397e.get(Integer.valueOf(i));
        if (view == null) {
            View containerView = getContainerView();
            if (containerView == null) {
                return null;
            }
            view = containerView.findViewById(i);
            this.f15397e.put(Integer.valueOf(i), view);
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
    public void mo6952a(C6143j jVar, C6143j jVar2) {
        C12932j.m33818b(jVar, "model");
        ((TextView) mo13963a(C3891l.title)).setText(jVar.mo13983f());
    }
}
