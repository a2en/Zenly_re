package app.zenly.locator.p135r.p137b1;

import app.zenly.locator.core.util.C3220i;
import p213co.znly.models.C7339i;

/* renamed from: app.zenly.locator.r.b1.a */
public class C5138a {

    /* renamed from: a */
    public String f13317a;

    /* renamed from: b */
    public String f13318b;

    /* renamed from: c */
    public String f13319c;

    /* renamed from: d */
    public C7339i f13320d;

    /* renamed from: a */
    public static C5138a m14651a(C7339i iVar) {
        C5138a aVar = new C5138a();
        aVar.f13319c = iVar.getDeviceContactId();
        aVar.f13318b = iVar.getPhoneNumbersCount() > 0 ? iVar.getPhoneNumbers(0) : null;
        aVar.f13317a = C3220i.m10211a(iVar);
        aVar.f13320d = iVar;
        return aVar;
    }
}
