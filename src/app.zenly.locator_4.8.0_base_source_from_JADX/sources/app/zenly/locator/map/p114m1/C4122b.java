package app.zenly.locator.map.p114m1;

import android.content.Context;
import app.zenly.locator.C4958p;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.map.m1.b */
public final class C4122b {

    /* renamed from: a */
    private C4120a f10795a;

    /* renamed from: b */
    private C4958p f10796b;

    /* renamed from: a */
    public final C4120a mo10797a(Context context) {
        C12932j.m33818b(context, "context");
        C4958p a = C4958p.f12964b.mo12157a(context);
        a.mo12155a("prefs:tweaks:tharpCityLandmarkEnabled", false);
        C4120a aVar = new C4120a(context, false);
        a.mo12154a(aVar.mo10795c());
        aVar.mo10795c().onSharedPreferenceChanged(null, "prefs:tweaks:tharpLandmarksScale");
        aVar.mo10795c().onSharedPreferenceChanged(null, "prefs:tweaks:tharpStyle");
        aVar.mo10795c().onSharedPreferenceChanged(null, "prefs:tweaks:tharpPostProcess");
        this.f10795a = aVar;
        this.f10796b = a;
        return aVar;
    }

    /* renamed from: a */
    public final void mo10798a() {
        C4120a aVar = this.f10795a;
        if (aVar != null) {
            C4958p pVar = this.f10796b;
            if (pVar != null) {
                pVar.mo12156b(aVar.mo10795c());
            }
        }
        this.f10795a = null;
        this.f10796b = null;
    }
}
