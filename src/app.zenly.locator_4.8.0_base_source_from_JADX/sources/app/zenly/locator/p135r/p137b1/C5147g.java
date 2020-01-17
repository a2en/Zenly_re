package app.zenly.locator.p135r.p137b1;

import android.content.Context;
import android.telephony.PhoneNumberUtils;
import app.zenly.locator.core.util.C3221j;
import kotlin.jvm.internal.C12932j;
import p213co.znly.models.core.C7123i2;

/* renamed from: app.zenly.locator.r.b1.g */
public final class C5147g {

    /* renamed from: a */
    private C7123i2 f13358a;

    public C5147g(C7123i2 i2Var) {
        C12932j.m33818b(i2Var, "region");
        this.f13358a = i2Var;
    }

    /* renamed from: a */
    public final void mo12520a(C7123i2 i2Var) {
        C12932j.m33818b(i2Var, "<set-?>");
        this.f13358a = i2Var;
    }

    /* renamed from: b */
    public final C7123i2 mo12521b() {
        return this.f13358a;
    }

    /* renamed from: a */
    public final int mo12518a(Context context) {
        C12932j.m33818b(context, "context");
        String isoCountryCode = this.f13358a.getIsoCountryCode();
        C12932j.m33815a((Object) isoCountryCode, "region.isoCountryCode");
        return C3221j.m10212a(context, isoCountryCode);
    }

    /* renamed from: a */
    public final String mo12519a() {
        String stringFromStringAndTOA = PhoneNumberUtils.stringFromStringAndTOA(String.valueOf(this.f13358a.getCountryDialingCode()), 145);
        C12932j.m33815a((Object) stringFromStringAndTOA, "PhoneNumberUtils.stringF…s.TOA_International\n    )");
        return stringFromStringAndTOA;
    }
}
