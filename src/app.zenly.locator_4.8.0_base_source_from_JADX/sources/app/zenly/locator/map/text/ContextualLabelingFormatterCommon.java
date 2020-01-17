package app.zenly.locator.map.text;

import app.zenly.locator.core.models.C2872b0;
import app.zenly.locator.core.models.C2890k;
import app.zenly.locator.core.models.C2916z.C2918b;
import app.zenly.locator.map.p111j1.C4081c;
import kotlin.jvm.internal.C12932j;
import p213co.znly.models.bubble.C6971b;

public interface ContextualLabelingFormatterCommon {

    /* renamed from: app.zenly.locator.map.text.ContextualLabelingFormatterCommon$a */
    public static final class C4293a {
        /* renamed from: a */
        public static String m12740a(ContextualLabelingFormatterCommon contextualLabelingFormatterCommon, C2890k kVar) {
            C12932j.m33818b(kVar, "bubble");
            C6971b b = kVar.mo8962b();
            C12932j.m33815a((Object) b, "bubble.bubble");
            String bubbleName = b.getBubbleName();
            C12932j.m33815a((Object) bubbleName, "bubble.bubble.bubbleName");
            return bubbleName;
        }

        /* renamed from: a */
        public static String m12743a(ContextualLabelingFormatterCommon contextualLabelingFormatterCommon, C4081c cVar, String str) {
            C12932j.m33818b(str, "timeZone");
            return "";
        }

        /* renamed from: a */
        public static String m12744a(ContextualLabelingFormatterCommon contextualLabelingFormatterCommon, String str) {
            C12932j.m33818b(str, "str");
            return str;
        }

        /* renamed from: a */
        public static String m12741a(ContextualLabelingFormatterCommon contextualLabelingFormatterCommon, C2890k kVar, String str) {
            C12932j.m33818b(kVar, "bubble");
            C12932j.m33818b(str, "street");
            StringBuilder sb = new StringBuilder();
            sb.append(contextualLabelingFormatterCommon.format(kVar));
            sb.append(", ");
            sb.append(str);
            return sb.toString();
        }

        /* renamed from: a */
        public static String m12739a(ContextualLabelingFormatterCommon contextualLabelingFormatterCommon, C2872b0 b0Var) {
            C12932j.m33818b(b0Var, "place");
            b0Var.mo8924a();
            throw null;
        }

        /* renamed from: a */
        public static String m12742a(ContextualLabelingFormatterCommon contextualLabelingFormatterCommon, C2918b bVar) {
            C12932j.m33818b(bVar, "significantPlace");
            StringBuilder sb = new StringBuilder();
            sb.append("place_");
            sb.append(bVar.name());
            return sb.toString();
        }
    }

    String format(C2872b0 b0Var);

    String format(C2890k kVar);

    String format(C2890k kVar, String str);

    String format(String str);

    String formatMeta(C4081c cVar, String str);

    String formatSignificantPlace(C2918b bVar);
}
