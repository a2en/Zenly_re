package app.zenly.locator.p017a0.p035r.p038h;

import android.view.View;
import app.zenly.locator.C3891l;
import app.zenly.locator.p017a0.p035r.p036f.C1659a;
import app.zenly.locator.p017a0.p035r.p039i.C1673b;
import app.zenly.locator.settings.view.SwitchMenuItem;
import app.zenly.locator.settings.view.SwitchMenuItem.OnCheckChangedListener;
import java.util.HashMap;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p263b.p264a.p272j.p273g.C7717d;

/* renamed from: app.zenly.locator.a0.r.h.b */
public final class C1667b extends C7717d<C1673b> {

    /* renamed from: e */
    private HashMap f5707e;

    /* renamed from: app.zenly.locator.a0.r.h.b$a */
    public static final class C1668a implements OnCheckChangedListener {

        /* renamed from: e */
        final /* synthetic */ C1667b f5708e;

        C1668a(C1667b bVar) {
            this.f5708e = bVar;
        }

        public void onCheckChanged(SwitchMenuItem switchMenuItem, boolean z) {
            C12932j.m33818b(switchMenuItem, "view");
            this.f5708e.mo34491a().dispatch(new C1659a(C1667b.m6985a(this.f5708e), z));
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ C1673b m6985a(C1667b bVar) {
        return (C1673b) bVar.mo34494c();
    }

    /* renamed from: a */
    public View mo7268a(int i) {
        if (this.f5707e == null) {
            this.f5707e = new HashMap();
        }
        View view = (View) this.f5707e.get(Integer.valueOf(i));
        if (view == null) {
            View containerView = getContainerView();
            if (containerView == null) {
                return null;
            }
            view = containerView.findViewById(i);
            this.f5707e.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo6953b(View view) {
        C12932j.m33818b(view, "itemView");
        ((SwitchMenuItem) mo7268a(C3891l.switch_menu_item)).setOnCheckChangedListener(new C1668a(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6952a(C1673b bVar, C1673b bVar2) {
        C12932j.m33818b(bVar, "model");
        SwitchMenuItem switchMenuItem = (SwitchMenuItem) mo7268a(C3891l.switch_menu_item);
        switchMenuItem.setTitle(switchMenuItem.getContext().getString(bVar.mo7280g()));
        switchMenuItem.setDescription(null);
        switchMenuItem.setChecked(bVar.mo7281h());
    }
}
