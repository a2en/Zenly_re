package app.zenly.locator.map.text;

import app.zenly.locator.core.models.C2872b0;
import app.zenly.locator.core.models.C2890k;
import app.zenly.locator.core.models.C2916z.C2918b;
import app.zenly.locator.map.p111j1.C4081c;
import app.zenly.locator.map.text.ContextualLabelingFormatterCommon.C4293a;
import kotlin.jvm.internal.C12932j;

public interface ContextualLabelingFormatterVariant extends ContextualLabelingFormatterCommon {

    /* renamed from: app.zenly.locator.map.text.ContextualLabelingFormatterVariant$a */
    public static final class C4294a {

        /* renamed from: app.zenly.locator.map.text.ContextualLabelingFormatterVariant$a$a */
        public static final class C4295a implements ContextualLabelingFormatterVariant {
            C4295a() {
            }

            public String format(C2890k kVar) {
                C12932j.m33818b(kVar, "bubble");
                return C4294a.m12746a((ContextualLabelingFormatterVariant) this, kVar);
            }

            public String formatMeta(C4081c cVar, String str) {
                C12932j.m33818b(str, "timeZone");
                return C4294a.m12749a((ContextualLabelingFormatterVariant) this, cVar, str);
            }

            public String formatSignificantPlace(C2918b bVar) {
                C12932j.m33818b(bVar, "significantPlace");
                return C4294a.m12748a((ContextualLabelingFormatterVariant) this, bVar);
            }

            public String format(C2890k kVar, String str) {
                C12932j.m33818b(kVar, "bubble");
                C12932j.m33818b(str, "street");
                return C4294a.m12747a((ContextualLabelingFormatterVariant) this, kVar, str);
            }

            public String format(C2872b0 b0Var) {
                C12932j.m33818b(b0Var, "place");
                C4294a.m12745a((ContextualLabelingFormatterVariant) this, b0Var);
                throw null;
            }

            public String format(String str) {
                C12932j.m33818b(str, "str");
                C4294a.m12750a((ContextualLabelingFormatterVariant) this, str);
                return str;
            }
        }

        /* renamed from: a */
        public static String m12745a(ContextualLabelingFormatterVariant contextualLabelingFormatterVariant, C2872b0 b0Var) {
            C12932j.m33818b(b0Var, "place");
            C4293a.m12739a((ContextualLabelingFormatterCommon) contextualLabelingFormatterVariant, b0Var);
            throw null;
        }

        /* renamed from: a */
        public static String m12746a(ContextualLabelingFormatterVariant contextualLabelingFormatterVariant, C2890k kVar) {
            C12932j.m33818b(kVar, "bubble");
            return C4293a.m12740a((ContextualLabelingFormatterCommon) contextualLabelingFormatterVariant, kVar);
        }

        /* renamed from: a */
        public static String m12747a(ContextualLabelingFormatterVariant contextualLabelingFormatterVariant, C2890k kVar, String str) {
            C12932j.m33818b(kVar, "bubble");
            C12932j.m33818b(str, "street");
            return C4293a.m12741a((ContextualLabelingFormatterCommon) contextualLabelingFormatterVariant, kVar, str);
        }

        /* renamed from: a */
        public static String m12748a(ContextualLabelingFormatterVariant contextualLabelingFormatterVariant, C2918b bVar) {
            C12932j.m33818b(bVar, "significantPlace");
            return C4293a.m12742a((ContextualLabelingFormatterCommon) contextualLabelingFormatterVariant, bVar);
        }

        /* renamed from: a */
        public static String m12749a(ContextualLabelingFormatterVariant contextualLabelingFormatterVariant, C4081c cVar, String str) {
            C12932j.m33818b(str, "timeZone");
            return C4293a.m12743a((ContextualLabelingFormatterCommon) contextualLabelingFormatterVariant, cVar, str);
        }

        /* renamed from: a */
        public static String m12750a(ContextualLabelingFormatterVariant contextualLabelingFormatterVariant, String str) {
            C12932j.m33818b(str, "str");
            C4293a.m12744a((ContextualLabelingFormatterCommon) contextualLabelingFormatterVariant, str);
            return str;
        }
    }

    /* renamed from: app.zenly.locator.map.text.ContextualLabelingFormatterVariant$b */
    public static final class C4296b {
        private C4296b() {
        }

        public /* synthetic */ C4296b(C12928f fVar) {
            this();
        }
    }

    static {
        new C4296b(null);
        new C4295a();
    }
}
