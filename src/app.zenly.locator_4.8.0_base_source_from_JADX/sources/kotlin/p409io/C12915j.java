package kotlin.p409io;

import java.io.File;
import kotlin.jvm.internal.C12932j;

/* renamed from: kotlin.io.j */
class C12915j extends C12914i {
    /* renamed from: a */
    public static final C12903d m33778a(File file, C12911f fVar) {
        C12932j.m33818b(file, "$this$walk");
        C12932j.m33818b(fVar, "direction");
        return new C12903d(file, fVar);
    }

    /* renamed from: a */
    public static final C12903d m33777a(File file) {
        C12932j.m33818b(file, "$this$walkBottomUp");
        return m33778a(file, C12911f.BOTTOM_UP);
    }
}
