package app.zenly.locator.support.p171t0.p192j;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import app.zenly.locator.C3891l;
import app.zenly.locator.R;
import app.zenly.locator.core.p072ui.view.StatefulLayout;
import app.zenly.locator.core.p072ui.view.StatefulLayout.C3131a;
import app.zenly.locator.support.p171t0.p172f.C5824b;
import app.zenly.locator.support.p171t0.p193k.C5903a;
import java.util.HashMap;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p263b.p264a.p272j.p273g.C7717d;

/* renamed from: app.zenly.locator.support.t0.j.a */
public final class C5894a extends C7717d<C5903a> {

    /* renamed from: e */
    private HashMap f14887e;

    /* renamed from: app.zenly.locator.support.t0.j.a$a */
    static final class C5895a implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C5894a f14888e;

        C5895a(C5894a aVar) {
            this.f14888e = aVar;
        }

        public final void onClick(View view) {
            this.f14888e.mo34491a().dispatch(C5824b.f14727a);
        }
    }

    /* renamed from: a */
    public View mo13589a(int i) {
        if (this.f14887e == null) {
            this.f14887e = new HashMap();
        }
        View view = (View) this.f14887e.get(Integer.valueOf(i));
        if (view == null) {
            View containerView = getContainerView();
            if (containerView == null) {
                return null;
            }
            view = containerView.findViewById(i);
            this.f14887e.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6952a(C5903a aVar, C5903a aVar2) {
        C12932j.m33818b(aVar, "model");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo6953b(View view) {
        C12932j.m33818b(view, "itemView");
        ((ImageView) mo13589a(C3891l.support_ticket_place_icon)).setImageResource(2131230931);
        ((AppCompatTextView) mo13589a(C3891l.support_ticket_place_title)).setText(R.string.support_places_missing);
        ((StatefulLayout) mo13589a(C3891l.support_ticket_place_subtitle_layout)).setState(C3131a.DATA);
        ((AppCompatTextView) mo13589a(C3891l.support_ticket_place_subtitle)).setText(R.string.support_places_main_missing_subtitle);
        view.setOnClickListener(new C5895a(this));
    }
}
