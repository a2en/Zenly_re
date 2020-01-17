package app.zenly.locator.core.util;

import android.location.Location;
import app.zenly.locator.p143s.p150n.C5459d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12933k;
import kotlin.jvm.internal.C12940r;
import kotlin.jvm.internal.C12941s;
import kotlin.jvm.internal.C12946x;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import p250f.p251a.p252a.p253a.p259h.C7683c;

/* renamed from: app.zenly.locator.core.util.m */
public final class C3225m {

    /* renamed from: a */
    static final /* synthetic */ KProperty[] f8999a;

    /* renamed from: b */
    private static final ReadWriteProperty f9000b = C7683c.m18707a(C3226a.f9002f);

    /* renamed from: c */
    public static final C3225m f9001c = new C3225m();

    /* renamed from: app.zenly.locator.core.util.m$a */
    static final class C3226a extends C12933k implements Function0<float[]> {

        /* renamed from: f */
        public static final C3226a f9002f = new C3226a();

        C3226a() {
            super(0);
        }

        public final float[] invoke() {
            return new float[1];
        }
    }

    static {
        C12941s sVar = new C12941s(C12946x.m33834a(C3225m.class), "tempFloatArray", "getTempFloatArray()[F");
        C12946x.m33839a((C12940r) sVar);
        f8999a = new KProperty[]{sVar};
    }

    private C3225m() {
    }

    /* renamed from: a */
    public static final float m10225a(double d, double d2, double d3, double d4) {
        Location.distanceBetween(d, d2, d3, d4, f9001c.m10227a());
        return f9001c.m10227a()[0];
    }

    /* renamed from: a */
    private final float[] m10227a() {
        return (float[]) f9000b.getValue(this, f8999a[0]);
    }

    /* renamed from: a */
    public static final float m10226a(C5459d dVar, C5459d dVar2) {
        C12932j.m33818b(dVar, "start");
        C12932j.m33818b(dVar2, "end");
        Location.distanceBetween(dVar.mo13060b(), dVar.mo13062c(), dVar2.mo13060b(), dVar2.mo13062c(), f9001c.m10227a());
        return f9001c.m10227a()[0];
    }
}
