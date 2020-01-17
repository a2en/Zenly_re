package app.zenly.locator.dashboard.p080y;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageButton;
import app.zenly.android.feature.polenta.widget.C1447a;
import app.zenly.locator.C3891l;
import app.zenly.locator.dashboard.C3314k;
import app.zenly.locator.dashboard.p081z.C3431j;
import java.util.HashMap;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p263b.p264a.p272j.p273g.C7717d;
import p250f.p251a.p252a.p263b.p279d.C7770f;

/* renamed from: app.zenly.locator.dashboard.y.k */
public final class C3407k extends C7717d<C3431j> {

    /* renamed from: e */
    private HashMap f9396e;

    /* renamed from: app.zenly.locator.dashboard.y.k$a */
    static final class C3408a implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C3407k f9397e;

        C3408a(C3407k kVar) {
            this.f9397e = kVar;
        }

        public final void onClick(View view) {
            if (C3406j.f9394a[C3407k.m10612a(this.f9397e).mo9943f().ordinal()] == 1) {
                this.f9397e.mo34491a().dispatch(new C3314k(true ^ C3407k.m10612a(this.f9397e).mo9945h()));
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ C3431j m10612a(C3407k kVar) {
        return (C3431j) kVar.mo34494c();
    }

    /* renamed from: a */
    public View mo9908a(int i) {
        if (this.f9396e == null) {
            this.f9396e = new HashMap();
        }
        View view = (View) this.f9396e.get(Integer.valueOf(i));
        if (view == null) {
            View containerView = getContainerView();
            if (containerView == null) {
                return null;
            }
            view = containerView.findViewById(i);
            this.f9396e.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo6953b(View view) {
        C12932j.m33818b(view, "itemView");
        ((AppCompatImageButton) mo9908a(C3891l.cta)).setOnClickListener(new C3408a(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6952a(C3431j jVar, C3431j jVar2) {
        C12932j.m33818b(jVar, "model");
        ((TextView) mo9908a(C3891l.title)).setText(jVar.mo9944g());
        int i = C3406j.f9395b[jVar.mo9943f().ordinal()];
        String str = "cta";
        if (i == 1) {
            if (jVar.mo9945h()) {
                AppCompatImageButton appCompatImageButton = (AppCompatImageButton) mo9908a(C3891l.cta);
                C12932j.m33815a((Object) appCompatImageButton, str);
                C1447a.m6543a(appCompatImageButton, C7770f.ImageButton_Small_Secondary, null, 2, null);
                ((AppCompatImageButton) mo9908a(C3891l.cta)).setImageResource(2131231402);
            } else {
                AppCompatImageButton appCompatImageButton2 = (AppCompatImageButton) mo9908a(C3891l.cta);
                C12932j.m33815a((Object) appCompatImageButton2, str);
                C1447a.m6543a(appCompatImageButton2, C7770f.ImageButton_Small_Tertiary, null, 2, null);
                ((AppCompatImageButton) mo9908a(C3891l.cta)).setImageResource(2131231430);
            }
            AppCompatImageButton appCompatImageButton3 = (AppCompatImageButton) mo9908a(C3891l.cta);
            C12932j.m33815a((Object) appCompatImageButton3, str);
            appCompatImageButton3.setVisibility(0);
        } else if (i == 2) {
            AppCompatImageButton appCompatImageButton4 = (AppCompatImageButton) mo9908a(C3891l.cta);
            C12932j.m33815a((Object) appCompatImageButton4, str);
            appCompatImageButton4.setVisibility(8);
        }
    }
}
