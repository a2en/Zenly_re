package app.zenly.locator.support.p171t0.p173g.p175i.p185g;

import android.view.View;
import android.view.View.OnClickListener;
import androidx.appcompat.widget.AppCompatTextView;
import app.zenly.locator.C3891l;
import app.zenly.locator.R;
import app.zenly.locator.core.models.C2916z.C2918b;
import app.zenly.locator.support.p171t0.p173g.p175i.p176c.C5853b;
import app.zenly.locator.support.p171t0.p173g.p175i.p186h.C5884a;
import java.util.HashMap;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p263b.p264a.p272j.p273g.C7717d;

/* renamed from: app.zenly.locator.support.t0.g.i.g.b */
public final class C5882b extends C7717d<C5884a> {

    /* renamed from: e */
    private HashMap f14865e;

    /* renamed from: app.zenly.locator.support.t0.g.i.g.b$a */
    static final class C5883a implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C5882b f14866e;

        C5883a(C5882b bVar) {
            this.f14866e = bVar;
        }

        public final void onClick(View view) {
            C2918b bVar;
            int i = C5881a.f14863a[C5882b.m16361a(this.f14866e).mo13572f().mo13534a().ordinal()];
            if (i == 1) {
                bVar = C2918b.HOME;
            } else if (i == 2) {
                bVar = C2918b.SCHOOL;
            } else if (i != 3) {
                bVar = C2918b.NONE;
            } else {
                bVar = C2918b.WORK;
            }
            this.f14866e.mo34491a().dispatch(new C5853b(bVar, C5882b.m16361a(this.f14866e).mo13572f().mo13534a()));
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ C5884a m16361a(C5882b bVar) {
        return (C5884a) bVar.mo34494c();
    }

    /* renamed from: a */
    public View mo13568a(int i) {
        if (this.f14865e == null) {
            this.f14865e = new HashMap();
        }
        View view = (View) this.f14865e.get(Integer.valueOf(i));
        if (view == null) {
            View containerView = getContainerView();
            if (containerView == null) {
                return null;
            }
            view = containerView.findViewById(i);
            this.f14865e.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo6953b(View view) {
        C12932j.m33818b(view, "itemView");
        view.setOnClickListener(new C5883a(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6952a(C5884a aVar, C5884a aVar2) {
        C12932j.m33818b(aVar, "model");
        AppCompatTextView appCompatTextView = (AppCompatTextView) mo13568a(C3891l.option_name);
        int i = C5881a.f14864b[aVar.mo13572f().mo13534a().ordinal()];
        int i2 = i != 1 ? i != 2 ? i != 3 ? aVar.mo13572f().mo13534a().mo13440b() : R.string.support_places_main_work : R.string.support_places_main_school : R.string.support_places_main_home;
        appCompatTextView.setText(i2);
        AppCompatTextView appCompatTextView2 = (AppCompatTextView) mo13568a(C3891l.option_description);
        C12932j.m33815a((Object) appCompatTextView2, "option_description");
        appCompatTextView2.setVisibility(8);
    }
}
