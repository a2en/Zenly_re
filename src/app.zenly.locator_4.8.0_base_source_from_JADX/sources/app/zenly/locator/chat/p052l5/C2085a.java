package app.zenly.locator.chat.p052l5;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import androidx.appcompat.widget.AppCompatImageButton;
import app.zenly.locator.C3891l;
import app.zenly.locator.C4958p;
import app.zenly.locator.C4958p.C4959a;
import java.util.HashMap;
import kotlin.jvm.internal.C12932j;
import kotlinx.android.extensions.LayoutContainer;

/* renamed from: app.zenly.locator.chat.l5.a */
public final class C2085a implements LayoutContainer {

    /* renamed from: a */
    private final boolean f6562a;

    /* renamed from: b */
    private C2086a f6563b;

    /* renamed from: c */
    private final View f6564c;

    /* renamed from: d */
    private HashMap f6565d;

    /* renamed from: app.zenly.locator.chat.l5.a$a */
    public static final class C2086a {

        /* renamed from: a */
        private final boolean f6566a;

        /* renamed from: b */
        private final boolean f6567b;

        public C2086a(boolean z, boolean z2) {
            this.f6566a = z;
            this.f6567b = z2;
        }

        /* renamed from: a */
        public final boolean mo7889a() {
            return this.f6567b;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C2086a) {
                    C2086a aVar = (C2086a) obj;
                    if (this.f6566a == aVar.f6566a) {
                        if (this.f6567b == aVar.f6567b) {
                            return true;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            boolean z = this.f6566a;
            int i = 1;
            if (z) {
                z = true;
            }
            int i2 = (z ? 1 : 0) * true;
            boolean z2 = this.f6567b;
            if (!z2) {
                i = z2;
            }
            return i2 + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Header(isFullChat=");
            sb.append(this.f6566a);
            sb.append(", visible=");
            sb.append(this.f6567b);
            sb.append(")");
            return sb.toString();
        }
    }

    public C2085a(View view, boolean z, OnClickListener onClickListener, OnClickListener onClickListener2, OnClickListener onClickListener3, OnClickListener onClickListener4) {
        C12932j.m33818b(view, "containerView");
        C12932j.m33818b(onClickListener, "closeClickListener");
        C12932j.m33818b(onClickListener2, "userClickListener");
        C12932j.m33818b(onClickListener3, "groupClickListener");
        C12932j.m33818b(onClickListener4, "geofencesClickListener");
        this.f6564c = view;
        if (!z) {
            C4959a aVar = C4958p.f12964b;
            Context context = getContainerView().getContext();
            C12932j.m33815a((Object) context, "containerView.context");
            aVar.mo12157a(context).mo12155a("prefs:tweaks:debugGeofencesEnabled", false);
        }
        this.f6562a = false;
        this.f6563b = new C2086a(false, false);
        ((AppCompatImageButton) mo7887a(C3891l.btn_close)).setOnClickListener(onClickListener);
        if (z) {
            ((AppCompatImageButton) mo7887a(C3891l.btn_action)).setOnClickListener(onClickListener3);
        } else {
            ((AppCompatImageButton) mo7887a(C3891l.btn_action)).setOnClickListener(onClickListener2);
        }
        if (this.f6562a) {
            ((AppCompatImageButton) mo7887a(C3891l.btn_debug_geofences)).setOnClickListener(onClickListener4);
        }
        ((AppCompatImageButton) mo7887a(C3891l.btn_action)).setImageResource(z ? 2131231470 : 2131231546);
    }

    /* renamed from: a */
    public View mo7887a(int i) {
        if (this.f6565d == null) {
            this.f6565d = new HashMap();
        }
        View view = (View) this.f6565d.get(Integer.valueOf(i));
        if (view == null) {
            View containerView = getContainerView();
            if (containerView == null) {
                return null;
            }
            view = containerView.findViewById(i);
            this.f6565d.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: a */
    public final void mo7888a(C2086a aVar) {
        C12932j.m33818b(aVar, "value");
        if (!C12932j.m33817a((Object) this.f6563b, (Object) aVar)) {
            this.f6563b = aVar;
            m7837a(this.f6563b.mo7889a());
        }
    }

    public View getContainerView() {
        return this.f6564c;
    }

    /* renamed from: a */
    private final void m7837a(boolean z) {
        int i = 0;
        int i2 = z ? 0 : 8;
        AppCompatImageButton appCompatImageButton = (AppCompatImageButton) mo7887a(C3891l.btn_close);
        C12932j.m33815a((Object) appCompatImageButton, "btn_close");
        appCompatImageButton.setVisibility(i2);
        AppCompatImageButton appCompatImageButton2 = (AppCompatImageButton) mo7887a(C3891l.btn_action);
        C12932j.m33815a((Object) appCompatImageButton2, "btn_action");
        appCompatImageButton2.setVisibility(i2);
        AppCompatImageButton appCompatImageButton3 = (AppCompatImageButton) mo7887a(C3891l.btn_debug_geofences);
        C12932j.m33815a((Object) appCompatImageButton3, "btn_debug_geofences");
        if (!z || !this.f6562a) {
            i = 8;
        }
        appCompatImageButton3.setVisibility(i);
    }
}
