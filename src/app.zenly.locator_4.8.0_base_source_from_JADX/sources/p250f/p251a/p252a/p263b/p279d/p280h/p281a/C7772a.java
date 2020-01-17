package p250f.p251a.p252a.p263b.p279d.p280h.p281a;

import android.content.res.ColorStateList;
import android.content.res.Resources.Theme;
import java.lang.reflect.Method;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12933k;
import kotlin.jvm.internal.C12940r;
import kotlin.jvm.internal.C12941s;
import kotlin.jvm.internal.C12946x;
import kotlin.reflect.KProperty;

/* renamed from: f.a.a.b.d.h.a.a */
public final class C7772a {

    /* renamed from: a */
    static final /* synthetic */ KProperty[] f19440a;

    /* renamed from: b */
    private static final Lazy f19441b = C12896f.m33751a(C7773a.f19444f);

    /* renamed from: c */
    private static final Lazy f19442c = C12896f.m33751a(C7774b.f19445f);

    /* renamed from: d */
    public static final C7772a f19443d = new C7772a();

    /* renamed from: f.a.a.b.d.h.a.a$a */
    static final class C7773a extends C12933k implements Function0<Method> {

        /* renamed from: f */
        public static final C7773a f19444f = new C7773a();

        C7773a() {
            super(0);
        }

        public final Method invoke() {
            return C7775b.f19446a.mo19982a(ColorStateList.class, "canApplyTheme", (Class<?>[]) new Class[0]);
        }
    }

    /* renamed from: f.a.a.b.d.h.a.a$b */
    static final class C7774b extends C12933k implements Function0<Method> {

        /* renamed from: f */
        public static final C7774b f19445f = new C7774b();

        C7774b() {
            super(0);
        }

        public final Method invoke() {
            return C7775b.f19446a.mo19982a(ColorStateList.class, "obtainForTheme", (Class<?>[]) new Class[0]);
        }
    }

    static {
        Class<C7772a> cls = C7772a.class;
        C12941s sVar = new C12941s(C12946x.m33834a((Class) cls), "canApplyThemeMethod", "getCanApplyThemeMethod()Ljava/lang/reflect/Method;");
        C12946x.m33839a((C12940r) sVar);
        C12941s sVar2 = new C12941s(C12946x.m33834a((Class) cls), "obtainForThemeMethod", "getObtainForThemeMethod()Ljava/lang/reflect/Method;");
        C12946x.m33839a((C12940r) sVar2);
        f19440a = new KProperty[]{sVar, sVar2};
    }

    private C7772a() {
    }

    /* renamed from: a */
    private final Method m18875a() {
        Lazy lazy = f19441b;
        KProperty kProperty = f19440a[0];
        return (Method) lazy.getValue();
    }

    /* renamed from: a */
    public static final boolean m18876a(ColorStateList colorStateList) {
        C12932j.m33818b(colorStateList, "$this$canApplyTheme");
        return ((Boolean) C7775b.f19446a.mo19981a((Object) colorStateList, f19443d.m18875a(), new Object[0])).booleanValue();
    }

    /* renamed from: b */
    private final Method m18877b() {
        Lazy lazy = f19442c;
        KProperty kProperty = f19440a[1];
        return (Method) lazy.getValue();
    }

    /* renamed from: a */
    public static final ColorStateList m18874a(ColorStateList colorStateList, Theme theme) {
        C12932j.m33818b(colorStateList, "$this$obtainForTheme");
        C12932j.m33818b(theme, "t");
        return (ColorStateList) C7775b.f19446a.mo19981a((Object) colorStateList, f19443d.m18877b(), theme);
    }
}
