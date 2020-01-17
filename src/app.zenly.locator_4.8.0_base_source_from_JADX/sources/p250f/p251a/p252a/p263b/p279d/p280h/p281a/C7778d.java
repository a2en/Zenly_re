package p250f.p251a.p252a.p263b.p279d.p280h.p281a;

import android.content.res.TypedArray;
import java.lang.reflect.Method;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12933k;
import kotlin.jvm.internal.C12940r;
import kotlin.jvm.internal.C12941s;
import kotlin.jvm.internal.C12946x;
import kotlin.reflect.KProperty;

/* renamed from: f.a.a.b.d.h.a.d */
public final class C7778d {

    /* renamed from: a */
    static final /* synthetic */ KProperty[] f19451a;

    /* renamed from: b */
    private static final Lazy f19452b = C12896f.m33751a(C7779a.f19454f);

    /* renamed from: c */
    public static final C7778d f19453c = new C7778d();

    /* renamed from: f.a.a.b.d.h.a.d$a */
    static final class C7779a extends C12933k implements Function0<Method> {

        /* renamed from: f */
        public static final C7779a f19454f = new C7779a();

        C7779a() {
            super(0);
        }

        public final Method invoke() {
            return C7775b.f19446a.mo19982a(TypedArray.class, "extractThemeAttrs", (Class<?>[]) new Class[0]);
        }
    }

    static {
        C12941s sVar = new C12941s(C12946x.m33834a(C7778d.class), "extractThemeAttrsMethod", "getExtractThemeAttrsMethod()Ljava/lang/reflect/Method;");
        C12946x.m33839a((C12940r) sVar);
        f19451a = new KProperty[]{sVar};
    }

    private C7778d() {
    }

    /* renamed from: a */
    private final Method m18882a() {
        Lazy lazy = f19452b;
        KProperty kProperty = f19451a[0];
        return (Method) lazy.getValue();
    }

    /* renamed from: a */
    public static final int[] m18883a(TypedArray typedArray) {
        C12932j.m33818b(typedArray, "$this$extractThemeAttrs");
        return (int[]) C7775b.f19446a.mo19981a((Object) typedArray, f19453c.m18882a(), new Object[0]);
    }
}
