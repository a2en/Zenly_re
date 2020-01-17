package p250f.p251a.p252a.p263b.p279d.p280h.p281a;

import android.content.res.Resources.Theme;
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

/* renamed from: f.a.a.b.d.h.a.c */
public final class C7776c {

    /* renamed from: a */
    static final /* synthetic */ KProperty[] f19447a;

    /* renamed from: b */
    private static final Lazy f19448b = C12896f.m33751a(C7777a.f19450f);

    /* renamed from: c */
    public static final C7776c f19449c = new C7776c();

    /* renamed from: f.a.a.b.d.h.a.c$a */
    static final class C7777a extends C12933k implements Function0<Method> {

        /* renamed from: f */
        public static final C7777a f19450f = new C7777a();

        C7777a() {
            super(0);
        }

        public final Method invoke() {
            Class<int[]> cls = int[].class;
            return C7775b.f19446a.mo19982a(Theme.class, "resolveAttributes", (Class<?>[]) new Class[]{cls, cls});
        }
    }

    static {
        C12941s sVar = new C12941s(C12946x.m33834a(C7776c.class), "resolveAttributesMethod", "getResolveAttributesMethod()Ljava/lang/reflect/Method;");
        C12946x.m33839a((C12940r) sVar);
        f19447a = new KProperty[]{sVar};
    }

    private C7776c() {
    }

    /* renamed from: a */
    public static final TypedArray m18880a(Theme theme, int[] iArr, int[] iArr2) {
        C12932j.m33818b(theme, "$this$resolveAttributes");
        C12932j.m33818b(iArr, "values");
        C12932j.m33818b(iArr2, "attrs");
        return (TypedArray) C7775b.f19446a.mo19981a((Object) theme, f19449c.m18881a(), iArr, iArr2);
    }

    /* renamed from: a */
    private final Method m18881a() {
        Lazy lazy = f19448b;
        KProperty kProperty = f19447a[0];
        return (Method) lazy.getValue();
    }
}
