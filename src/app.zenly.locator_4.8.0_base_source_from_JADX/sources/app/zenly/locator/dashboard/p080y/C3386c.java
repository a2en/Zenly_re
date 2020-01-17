package app.zenly.locator.dashboard.p080y;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageButton;
import app.zenly.locator.C3891l;
import app.zenly.locator.dashboard.C3300b;
import app.zenly.locator.dashboard.p081z.C3424c;
import java.util.HashMap;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p263b.p264a.p272j.p273g.C7717d;

/* renamed from: app.zenly.locator.dashboard.y.c */
public final class C3386c extends C7717d<C3424c> {

    /* renamed from: e */
    private HashMap f9368e;

    /* renamed from: app.zenly.locator.dashboard.y.c$a */
    static final class C3387a implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C3386c f9369e;

        C3387a(C3386c cVar) {
            this.f9369e = cVar;
        }

        public final void onClick(View view) {
            this.f9369e.mo34491a().dispatch(new C3300b(C3386c.m10583a(this.f9369e).mo9929f()));
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ C3424c m10583a(C3386c cVar) {
        return (C3424c) cVar.mo34494c();
    }

    /* renamed from: a */
    public View mo9884a(int i) {
        if (this.f9368e == null) {
            this.f9368e = new HashMap();
        }
        View view = (View) this.f9368e.get(Integer.valueOf(i));
        if (view == null) {
            View containerView = getContainerView();
            if (containerView == null) {
                return null;
            }
            view = containerView.findViewById(i);
            this.f9368e.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo6953b(View view) {
        C12932j.m33818b(view, "itemView");
        ((AppCompatImageButton) mo9884a(C3891l.cta)).setOnClickListener(new C3387a(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6952a(C3424c cVar, C3424c cVar2) {
        C12932j.m33818b(cVar, "model");
        ((TextView) mo9884a(C3891l.title)).setText(cVar.mo9930g());
        int i = C3385b.f9367a[cVar.mo9929f().ordinal()];
        String str = "cta";
        if (i == 1 || i == 2) {
            AppCompatImageButton appCompatImageButton = (AppCompatImageButton) mo9884a(C3891l.cta);
            C12932j.m33815a((Object) appCompatImageButton, str);
            appCompatImageButton.setVisibility(0);
            ((AppCompatImageButton) mo9884a(C3891l.cta)).setImageResource(2131231416);
        } else if (i == 3) {
            AppCompatImageButton appCompatImageButton2 = (AppCompatImageButton) mo9884a(C3891l.cta);
            C12932j.m33815a((Object) appCompatImageButton2, str);
            appCompatImageButton2.setVisibility(8);
        }
    }
}
