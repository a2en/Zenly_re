package app.zenly.locator.core.util;

import app.zenly.locator.p143s.p148l.C5447b;
import kotlin.jvm.internal.C12932j;
import p213co.znly.core.ZenlyCore;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.models.UserAnnotationProto$UserAnnotation;
import p213co.znly.models.UserAnnotationProto$UserAnnotation.C6911a;

/* renamed from: app.zenly.locator.core.util.a0 */
public final class C3192a0 {
    /* renamed from: a */
    public static final boolean m10161a(UserAnnotationProto$UserAnnotation userAnnotationProto$UserAnnotation, ZenlyCore zenlyCore) {
        C12932j.m33818b(userAnnotationProto$UserAnnotation, "$this$hasBrump");
        C12932j.m33818b(zenlyCore, "core");
        if (userAnnotationProto$UserAnnotation.getBrumpAnnotation() == null) {
            return false;
        }
        C6911a brumpAnnotation = userAnnotationProto$UserAnnotation.getBrumpAnnotation();
        C12932j.m33815a((Object) brumpAnnotation, "brumpAnnotation");
        Timestamp validUntil = brumpAnnotation.getValidUntil();
        C12932j.m33815a((Object) validUntil, "brumpAnnotation.validUntil");
        if (System.currentTimeMillis() <= C5447b.m15473a(zenlyCore, C3245z.m10288g(validUntil))) {
            return true;
        }
        return false;
    }
}
