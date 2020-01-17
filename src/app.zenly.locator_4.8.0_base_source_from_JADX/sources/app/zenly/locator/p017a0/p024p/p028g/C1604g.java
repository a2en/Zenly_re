package app.zenly.locator.p017a0.p024p.p028g;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import app.zenly.android.base.widget.C1315a;
import app.zenly.locator.C3891l;
import app.zenly.locator.core.widget.C3275i;
import app.zenly.locator.p017a0.p024p.p029h.C1613h;
import java.util.HashMap;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p263b.p264a.p272j.C7709b;

/* renamed from: app.zenly.locator.a0.p.g.g */
public final class C1604g extends C1601e<C1613h> {

    /* renamed from: e */
    private HashMap f5575e;

    /* renamed from: a */
    public View mo7169a(int i) {
        if (this.f5575e == null) {
            this.f5575e = new HashMap();
        }
        View view = (View) this.f5575e.get(Integer.valueOf(i));
        if (view == null) {
            View containerView = getContainerView();
            if (containerView == null) {
                return null;
            }
            view = containerView.findViewById(i);
            this.f5575e.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo6953b(View view) {
        C12932j.m33818b(view, "itemView");
    }

    /* renamed from: a */
    public void mo7156a(C1613h hVar, C1613h hVar2) {
        C12932j.m33818b(hVar, "model");
        TextView textView = (TextView) mo7169a(C3891l.title_text_view);
        C12932j.m33815a((Object) textView, "title_text_view");
        Context context = mo34493b().getContext();
        C12932j.m33815a((Object) context, "itemView.context");
        textView.setText(C7709b.m18762a(context, hVar.mo7191j()));
        TextView textView2 = (TextView) mo7169a(C3891l.description_text_view);
        C12932j.m33815a((Object) textView2, "description_text_view");
        C3275i.m10386a(textView2, (CharSequence) hVar.mo7190i());
        AppCompatTextView appCompatTextView = (AppCompatTextView) mo7169a(C3891l.accessory_text_view);
        C3275i.m10386a((TextView) appCompatTextView, (CharSequence) hVar.mo7189h());
        C1315a.m6316a((TextView) appCompatTextView, 0, 0, hVar.mo7188g(), 0, 11, (Object) null);
    }
}
