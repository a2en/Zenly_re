package app.zenly.locator.support.p171t0.p192j;

import android.view.View;
import android.view.View.OnClickListener;
import androidx.appcompat.widget.AppCompatTextView;
import app.zenly.locator.C3891l;
import app.zenly.locator.R;
import app.zenly.locator.support.p171t0.p172f.C5825c;
import app.zenly.locator.support.p171t0.p193k.C5904b;
import java.util.HashMap;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p263b.p264a.p272j.p273g.C7717d;

/* renamed from: app.zenly.locator.support.t0.j.b */
public final class C5896b extends C7717d<C5904b> {

    /* renamed from: e */
    private HashMap f14889e;

    /* renamed from: app.zenly.locator.support.t0.j.b$a */
    static final class C5897a implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C5896b f14890e;

        C5897a(C5896b bVar) {
            this.f14890e = bVar;
        }

        public final void onClick(View view) {
            this.f14890e.mo34491a().dispatch(C5825c.f14728a);
        }
    }

    /* renamed from: a */
    public View mo13592a(int i) {
        if (this.f14889e == null) {
            this.f14889e = new HashMap();
        }
        View view = (View) this.f14889e.get(Integer.valueOf(i));
        if (view == null) {
            View containerView = getContainerView();
            if (containerView == null) {
                return null;
            }
            view = containerView.findViewById(i);
            this.f14889e.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo6953b(View view) {
        C12932j.m33818b(view, "itemView");
        view.setOnClickListener(new C5897a(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6952a(C5904b bVar, C5904b bVar2) {
        C12932j.m33818b(bVar, "model");
        AppCompatTextView appCompatTextView = (AppCompatTextView) mo13592a(C3891l.support_more_places_subtitle);
        String str = "support_more_places_subtitle";
        C12932j.m33815a((Object) appCompatTextView, str);
        AppCompatTextView appCompatTextView2 = (AppCompatTextView) mo13592a(C3891l.support_more_places_subtitle);
        C12932j.m33815a((Object) appCompatTextView2, str);
        appCompatTextView.setText(appCompatTextView2.getResources().getQuantityString(R.plurals.support_places_main_more_subtitle, bVar.mo13604f(), new Object[]{Integer.valueOf(bVar.mo13604f())}));
    }
}
