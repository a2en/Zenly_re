package app.zenly.locator.p135r.p136a1;

import android.content.Context;
import android.telephony.PhoneNumberUtils;
import app.zenly.locator.core.util.C3221j;
import kotlin.jvm.internal.C12932j;
import p213co.znly.core.ZenlyCore;
import p213co.znly.models.UserProto$User;
import p213co.znly.models.core.C7123i2;
import p389io.reactivex.functions.Predicate;

/* renamed from: app.zenly.locator.r.a1.a */
public final class C5133a {

    /* renamed from: a */
    private final ZenlyCore f13312a;

    /* renamed from: app.zenly.locator.r.a1.a$a */
    static final class C5134a<T> implements Predicate<C7123i2> {

        /* renamed from: e */
        final /* synthetic */ Long f13313e;

        C5134a(Long l) {
            this.f13313e = l;
        }

        /* renamed from: a */
        public final boolean test(C7123i2 i2Var) {
            C12932j.m33818b(i2Var, "it");
            long countryDialingCode = (long) i2Var.getCountryDialingCode();
            Long l = this.f13313e;
            return l != null && countryDialingCode == l.longValue();
        }
    }

    /* renamed from: app.zenly.locator.r.a1.a$b */
    static final class C5135b<T> implements Predicate<C7123i2> {

        /* renamed from: e */
        final /* synthetic */ String f13314e;

        C5135b(String str) {
            this.f13314e = str;
        }

        /* renamed from: a */
        public final boolean test(C7123i2 i2Var) {
            C12932j.m33818b(i2Var, "it");
            return C12932j.m33817a((Object) i2Var.getIsoCountryCode(), (Object) this.f13314e);
        }
    }

    public C5133a(ZenlyCore zenlyCore) {
        C12932j.m33818b(zenlyCore, "core");
        this.f13312a = zenlyCore;
    }

    /* renamed from: g */
    private final C7123i2 m14641g(String str) {
        Object a = this.f13312a.phoneNumberSupportedRegions().mo36459b((Predicate<? super T>) new C5135b<Object>(str)).mo36487e(1).mo36446a(C7123i2.getDefaultInstance());
        C12932j.m33815a(a, "core.phoneNumberSupporte…ion.getDefaultInstance())");
        return (C7123i2) a;
    }

    /* renamed from: a */
    public final C7123i2 mo12462a(Context context) {
        C12932j.m33818b(context, "context");
        C7123i2 a = m14640a();
        return a != null ? a : m14641g(C3221j.m10213a(context));
    }

    /* renamed from: b */
    public final boolean mo12464b(String str) {
        C12932j.m33818b(str, "phoneNumber");
        String phoneNumberNormalizeE164 = this.f13312a.phoneNumberNormalizeE164(str);
        C12932j.m33815a((Object) phoneNumberNormalizeE164, "core.phoneNumberNormalizeE164(phoneNumber)");
        UserProto$User userMeCache = this.f13312a.userMeCache();
        return userMeCache != null && C12932j.m33817a((Object) phoneNumberNormalizeE164, (Object) userMeCache.getPhoneNumber());
    }

    /* renamed from: c */
    public final String mo12465c(String str) {
        C12932j.m33818b(str, "phoneNumber");
        String phoneNumberNormalizeE164 = this.f13312a.phoneNumberNormalizeE164(str);
        C12932j.m33815a((Object) phoneNumberNormalizeE164, "core.phoneNumberNormalizeE164(phoneNumber)");
        return phoneNumberNormalizeE164;
    }

    /* renamed from: d */
    public final String mo12466d(String str) {
        C12932j.m33818b(str, "phoneNumber");
        String phoneNumberNormalizeInternational = this.f13312a.phoneNumberNormalizeInternational(str);
        C12932j.m33815a((Object) phoneNumberNormalizeInternational, "core.phoneNumberNormaliz…nternational(phoneNumber)");
        return phoneNumberNormalizeInternational;
    }

    /* renamed from: e */
    public final String mo12467e(String str) {
        C12932j.m33818b(str, "phoneNumber");
        String phoneNumberNormalizeNational = this.f13312a.phoneNumberNormalizeNational(str);
        C12932j.m33815a((Object) phoneNumberNormalizeNational, "core.phoneNumberNormalizeNational(phoneNumber)");
        return phoneNumberNormalizeNational;
    }

    /* renamed from: f */
    public final C7123i2 mo12468f(String str) {
        C12932j.m33818b(str, "phoneNumber");
        return this.f13312a.phoneNumberGetRegion(str);
    }

    /* renamed from: a */
    private final C7123i2 m14640a() {
        return (C7123i2) this.f13312a.phoneNumberSupportedRegions().mo36459b((Predicate<? super T>) new C5134a<Object>((Long) this.f13312a.deviceCountryCode().mo36487e(1).mo36446a(null))).mo36487e(1).mo36446a(null);
    }

    /* renamed from: a */
    public final boolean mo12463a(String str) {
        C12932j.m33818b(str, "phoneNumber");
        return PhoneNumberUtils.toaFromString(str) == 145;
    }
}
