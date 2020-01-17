package app.zenly.locator.p143s;

import app.zenly.locator.p143s.p150n.C5458c;
import app.zenly.locator.p143s.p150n.C5459d;
import p213co.znly.models.C6950b0;
import p213co.znly.models.C6950b0.C6951a;
import p213co.znly.models.reversegeocoder.C7923h;
import p213co.znly.models.reversegeocoder.C7923h.C7924a;
import p213co.znly.models.services.C8268s1;
import p213co.znly.models.services.C8268s1.C8270b;
import p213co.znly.models.services.C8303u1;

/* renamed from: app.zenly.locator.s.e */
public final class C5404e {
    /* renamed from: a */
    public static C8268s1 m15382a(C5458c cVar, int i, int i2) {
        C7924a newBuilder = C7923h.newBuilder();
        C6951a newBuilder2 = C6950b0.newBuilder();
        newBuilder2.setLatitude(cVar.f14041b);
        newBuilder2.setLongitude(cVar.f14042c);
        newBuilder.mo20390a(newBuilder2);
        newBuilder.mo20388a(cVar.f14040a);
        newBuilder.mo20391b(cVar.f14043d);
        newBuilder.mo20392b(i);
        newBuilder.mo20389a(i2);
        C8270b newBuilder3 = C8268s1.newBuilder();
        newBuilder3.mo22231a(C8303u1.REVERSE_GEOCODE_VIEWPORT);
        newBuilder3.mo22230a(newBuilder);
        return (C8268s1) newBuilder3.build();
    }

    /* renamed from: a */
    public static C8268s1 m15383a(C5459d dVar, int i, int i2) {
        C7924a newBuilder = C7923h.newBuilder();
        C6951a newBuilder2 = C6950b0.newBuilder();
        newBuilder2.setLatitude(dVar.mo13060b());
        newBuilder2.setLongitude(dVar.mo13062c());
        newBuilder.mo20390a(newBuilder2);
        newBuilder.mo20392b(i);
        newBuilder.mo20389a(i2);
        C8270b newBuilder3 = C8268s1.newBuilder();
        newBuilder3.mo22231a(C8303u1.REVERSE_GEOCODE_VIEWPORT);
        newBuilder3.mo22230a(newBuilder);
        return (C8268s1) newBuilder3.build();
    }
}
