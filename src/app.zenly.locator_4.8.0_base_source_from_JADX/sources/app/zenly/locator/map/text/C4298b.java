package app.zenly.locator.map.text;

import android.content.Context;
import app.zenly.locator.R;
import app.zenly.locator.core.models.C2872b0;
import app.zenly.locator.core.models.C2890k;
import app.zenly.locator.core.models.C2916z.C2918b;
import app.zenly.locator.core.util.C3244y;
import app.zenly.locator.map.p111j1.C4081c;
import app.zenly.locator.map.text.ContextualLabelingFormatterCommon.C4293a;
import app.zenly.locator.p143s.p160v.p161b.C5518b;
import app.zenly.locator.p143s.p160v.p161b.C5553m;
import java.util.TimeZone;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.map.text.b */
public final class C4298b implements ContextualLabelingFormatterCommon {

    /* renamed from: a */
    private final C3244y f11495a = new C3244y();

    /* renamed from: b */
    private final Context f11496b;

    /* renamed from: app.zenly.locator.map.text.b$a */
    private enum C4299a {
        AT_PLACE(R.string.contextualLabeling_home, R.string.contextualLabeling_work, R.string.contextualLabeling_school);
        

        /* renamed from: e */
        private final int f11499e;

        /* renamed from: f */
        private final int f11500f;

        /* renamed from: g */
        private final int f11501g;

        private C4299a(int i, int i2, int i3) {
            this.f11499e = i;
            this.f11500f = i2;
            this.f11501g = i3;
        }

        /* renamed from: a */
        public final String mo11333a(Context context, C2918b bVar) {
            C12932j.m33818b(context, "context");
            C12932j.m33818b(bVar, "tag");
            int i = C4297a.f11494a[bVar.ordinal()];
            if (i == 1) {
                String string = context.getString(this.f11499e);
                C12932j.m33815a((Object) string, "context.getString(home)");
                return string;
            } else if (i == 2) {
                String string2 = context.getString(this.f11500f);
                C12932j.m33815a((Object) string2, "context.getString(work)");
                return string2;
            } else if (i == 3) {
                String string3 = context.getString(this.f11501g);
                C12932j.m33815a((Object) string3, "context.getString(school)");
                return string3;
            } else if (i == 4) {
                return "";
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public C4298b(Context context) {
        C12932j.m33818b(context, "context");
        this.f11496b = context;
    }

    /* renamed from: a */
    private final boolean m12751a(TimeZone timeZone, long j) {
        return timeZone.getOffset(j) != TimeZone.getDefault().getOffset(j);
    }

    public String format(C2890k kVar) {
        C12932j.m33818b(kVar, "bubble");
        return C4293a.m12740a((ContextualLabelingFormatterCommon) this, kVar);
    }

    public String formatMeta(C4081c cVar, String str) {
        TimeZone timeZone;
        C12932j.m33818b(str, "timeZone");
        if (cVar != null) {
            String a = C5553m.m15739a(this.f11496b, cVar.f10711h);
            if (str.length() == 0) {
                timeZone = TimeZone.getDefault();
            } else {
                timeZone = this.f11495a.mo9657a(str);
            }
            long currentTimeMillis = System.currentTimeMillis();
            C12932j.m33815a((Object) timeZone, "tz");
            if (m12751a(timeZone, currentTimeMillis)) {
                a = this.f11496b.getString(R.string.contextualLabeling_weatherWithTime, new Object[]{a, C5518b.m15656c(this.f11496b, currentTimeMillis, timeZone)});
            }
            if (a != null) {
                return a;
            }
        }
        return "";
    }

    public String formatSignificantPlace(C2918b bVar) {
        C12932j.m33818b(bVar, "significantPlace");
        return C4299a.AT_PLACE.mo11333a(this.f11496b, bVar);
    }

    public String format(C2872b0 b0Var) {
        C12932j.m33818b(b0Var, "place");
        C4293a.m12739a((ContextualLabelingFormatterCommon) this, b0Var);
        throw null;
    }

    public String format(String str) {
        C12932j.m33818b(str, "str");
        C4293a.m12744a((ContextualLabelingFormatterCommon) this, str);
        return str;
    }

    public String format(C2890k kVar, String str) {
        C12932j.m33818b(kVar, "bubble");
        C12932j.m33818b(str, "street");
        String string = this.f11496b.getString(R.string.contextualLabeling_bubbleWithStreet, new Object[]{format(kVar), str});
        C12932j.m33815a((Object) string, "context.getString(R.stri…, format(bubble), street)");
        return string;
    }
}
