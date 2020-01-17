package app.zenly.locator.p086e0.p087a.p090k;

import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import app.zenly.locator.C3891l;
import app.zenly.locator.R;
import app.zenly.locator.p086e0.p087a.p091l.C3659d;
import java.util.HashMap;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p263b.p264a.p269h.p270a.C7706a;
import p250f.p251a.p252a.p263b.p264a.p272j.p273g.C7717d;

/* renamed from: app.zenly.locator.e0.a.k.e */
public final class C3651e extends C7717d<C3659d> {

    /* renamed from: e */
    private HashMap f9786e;

    /* renamed from: a */
    public View mo10138a(int i) {
        if (this.f9786e == null) {
            this.f9786e = new HashMap();
        }
        View view = (View) this.f9786e.get(Integer.valueOf(i));
        if (view == null) {
            View containerView = getContainerView();
            if (containerView == null) {
                return null;
            }
            view = containerView.findViewById(i);
            this.f9786e.put(Integer.valueOf(i), view);
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
    public void mo6952a(C3659d dVar, C3659d dVar2) {
        C12932j.m33818b(dVar, "model");
        AppCompatTextView appCompatTextView = (AppCompatTextView) mo10138a(C3891l.title);
        String str = "title";
        C12932j.m33815a((Object) appCompatTextView, str);
        AppCompatTextView appCompatTextView2 = (AppCompatTextView) mo10138a(C3891l.title);
        C12932j.m33815a((Object) appCompatTextView2, str);
        Context context = appCompatTextView2.getContext();
        C12932j.m33815a((Object) context, "title.context");
        appCompatTextView.setText(C7706a.m18756c(context, dVar.mo10162f()));
        AppCompatTextView appCompatTextView3 = (AppCompatTextView) mo10138a(C3891l.subtitle);
        String str2 = "subtitle";
        C12932j.m33815a((Object) appCompatTextView3, str2);
        AppCompatTextView appCompatTextView4 = (AppCompatTextView) mo10138a(C3891l.subtitle);
        C12932j.m33815a((Object) appCompatTextView4, str2);
        appCompatTextView3.setText(appCompatTextView4.getResources().getQuantityString(R.plurals.newfriend_request_mutualfriends, dVar.mo10163g(), new Object[]{Integer.valueOf(dVar.mo10163g())}));
    }
}
