package app.zenly.locator.p017a0.p024p.p028g;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import app.zenly.locator.C3891l;
import app.zenly.locator.p017a0.p024p.p029h.C1612g;
import java.util.HashMap;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.a0.p.g.f */
public final class C1603f extends C1601e<C1612g> {

    /* renamed from: e */
    private HashMap f5574e;

    /* renamed from: a */
    public View mo7167a(int i) {
        if (this.f5574e == null) {
            this.f5574e = new HashMap();
        }
        View view = (View) this.f5574e.get(Integer.valueOf(i));
        if (view == null) {
            View containerView = getContainerView();
            if (containerView == null) {
                return null;
            }
            view = containerView.findViewById(i);
            this.f5574e.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo6953b(View view) {
        C12932j.m33818b(view, "itemView");
    }

    /* renamed from: g */
    public void mo7165g() {
        ((SwitchCompat) mo7167a(C3891l.switch_compat)).toggle();
    }

    /* renamed from: a */
    public void mo7156a(C1612g gVar, C1612g gVar2) {
        C12932j.m33818b(gVar, "model");
        TextView textView = (TextView) mo7167a(C3891l.title_text_view);
        C12932j.m33815a((Object) textView, "title_text_view");
        textView.setText(gVar.mo7186h());
        String g = gVar.mo7185g();
        String str = "switch_spacer";
        String str2 = "description_text_view";
        if (!(g == null || g.length() == 0)) {
            TextView textView2 = (TextView) mo7167a(C3891l.switch_spacer);
            C12932j.m33815a((Object) textView2, str);
            textView2.setVisibility(0);
            TextView textView3 = (TextView) mo7167a(C3891l.description_text_view);
            C12932j.m33815a((Object) textView3, str2);
            textView3.setVisibility(0);
            TextView textView4 = (TextView) mo7167a(C3891l.description_text_view);
            C12932j.m33815a((Object) textView4, str2);
            textView4.setText(g);
        } else {
            TextView textView5 = (TextView) mo7167a(C3891l.switch_spacer);
            C12932j.m33815a((Object) textView5, str);
            textView5.setVisibility(8);
            TextView textView6 = (TextView) mo7167a(C3891l.description_text_view);
            C12932j.m33815a((Object) textView6, str2);
            textView6.setVisibility(8);
        }
        SwitchCompat switchCompat = (SwitchCompat) mo7167a(C3891l.switch_compat);
        C12932j.m33815a((Object) switchCompat, "switch_compat");
        switchCompat.setChecked(gVar.mo7187i());
    }
}
