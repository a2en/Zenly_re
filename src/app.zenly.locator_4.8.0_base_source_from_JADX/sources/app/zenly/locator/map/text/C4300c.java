package app.zenly.locator.map.text;

import android.content.Context;
import app.zenly.locator.core.models.C2872b0;
import app.zenly.locator.core.models.C2890k;
import app.zenly.locator.core.models.C2916z.C2918b;
import app.zenly.locator.map.p111j1.C4081c;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.map.text.c */
public final class C4300c implements ContextualLabelingFormatterCommon, ContextualLabelingFormatterVariant {

    /* renamed from: a */
    private final /* synthetic */ C4298b f11502a;

    public C4300c(Context context) {
        C12932j.m33818b(context, "context");
        this.f11502a = new C4298b(context);
    }

    public String format(C2872b0 b0Var) {
        C12932j.m33818b(b0Var, "place");
        this.f11502a.format(b0Var);
        throw null;
    }

    public String format(C2890k kVar) {
        C12932j.m33818b(kVar, "bubble");
        return this.f11502a.format(kVar);
    }

    public String format(C2890k kVar, String str) {
        C12932j.m33818b(kVar, "bubble");
        C12932j.m33818b(str, "street");
        return this.f11502a.format(kVar, str);
    }

    public String format(String str) {
        C12932j.m33818b(str, "str");
        this.f11502a.format(str);
        return str;
    }

    public String formatMeta(C4081c cVar, String str) {
        C12932j.m33818b(str, "timeZone");
        return this.f11502a.formatMeta(cVar, str);
    }

    public String formatSignificantPlace(C2918b bVar) {
        C12932j.m33818b(bVar, "significantPlace");
        return this.f11502a.formatSignificantPlace(bVar);
    }
}
