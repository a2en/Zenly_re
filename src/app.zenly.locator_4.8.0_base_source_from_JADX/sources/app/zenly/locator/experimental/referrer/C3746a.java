package app.zenly.locator.experimental.referrer;

import android.content.Context;
import app.zenly.android.feature.base.decision.C1322a;
import app.zenly.locator.R;
import app.zenly.locator.core.manager.MeUserManager;
import app.zenly.locator.core.manager.p069di.C2666b;
import app.zenly.locator.decision.C3444a;
import app.zenly.locator.experimental.referrer.ReferrerDetails.C3739a;
import app.zenly.locator.experimental.referrer.ReferrerDetails.C3744d;
import java.util.Arrays;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12948z;

/* renamed from: app.zenly.locator.experimental.referrer.a */
public final class C3746a {

    /* renamed from: e */
    public static final C3747a f10026e = new C3747a(null);

    /* renamed from: a */
    private final Context f10027a;

    /* renamed from: b */
    private final MeUserManager f10028b;

    /* renamed from: c */
    private final C1322a f10029c;

    /* renamed from: d */
    private final C3756e f10030d;

    /* renamed from: app.zenly.locator.experimental.referrer.a$a */
    public static final class C3747a {
        private C3747a() {
        }

        /* renamed from: a */
        public final C3746a mo10297a(Context context) {
            C12932j.m33818b(context, "context");
            return new C3746a(context, C2666b.m9049a(context).mo8764b(), C3444a.m10686a(context), new C3756e());
        }

        public /* synthetic */ C3747a(C12928f fVar) {
            this();
        }
    }

    public C3746a(Context context, MeUserManager meUserManager, C1322a aVar, C3756e eVar) {
        C12932j.m33818b(context, "context");
        C12932j.m33818b(meUserManager, "userManager");
        C12932j.m33818b(aVar, "decisionApi");
        C12932j.m33818b(eVar, "referrerEncryption");
        this.f10027a = context;
        this.f10028b = meUserManager;
        this.f10029c = aVar;
        this.f10030d = eVar;
    }

    /* renamed from: a */
    public static /* synthetic */ String m11181a(C3746a aVar, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = C3744d.Other.mo10293b();
        }
        if ((i2 & 2) != 0) {
            str = null;
        }
        return aVar.mo10296a(i, str);
    }

    /* renamed from: a */
    public final String mo10296a(int i, String str) {
        return m11182a(this.f10028b.mo8756b().f8250a.mo8945g(), i, str);
    }

    /* renamed from: a */
    private final String m11182a(String str, int i, String str2) {
        if (this.f10029c.mo6511a("feature:targetedDownloadLinkFeature")) {
            ReferrerDetails referrerDetails = new ReferrerDetails(str, C3739a.f10002k.mo10286a(this.f10027a, str2), C3744d.f10023r.mo10294a(i), null, 8, null);
            C12948z zVar = C12948z.f33530a;
            C3756e eVar = this.f10030d;
            String uri = referrerDetails.mo10279e().toString();
            C12932j.m33815a((Object) uri, "referrerDetails.toUri().toString()");
            Object[] objArr = {eVar.mo10313b(uri)};
            String format = String.format("https://zenlyapp.com/r/%s", Arrays.copyOf(objArr, objArr.length));
            C12932j.m33815a((Object) format, "java.lang.String.format(format, *args)");
            String string = this.f10027a.getString(R.string.z_track5exp1var1_sms_conversion, new Object[]{format});
            C12932j.m33815a((Object) string, "context.getString(R.stri…ar1_sms_conversion, link)");
            return string;
        }
        String string2 = this.f10027a.getString(R.string.sms_conversion);
        C12932j.m33815a((Object) string2, "context.getString(R.string.sms_conversion)");
        return string2;
    }
}
