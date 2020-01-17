package p214e.p234h.p235e;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.core.content.res.C0554e.C0555a;
import androidx.core.content.res.FontResourcesParserCompat.C0546a;
import androidx.core.content.res.FontResourcesParserCompat.C0548c;
import androidx.core.content.res.FontResourcesParserCompat.FamilyResourceEntry;
import androidx.core.p004os.C0563a;
import androidx.core.provider.C0575b;
import androidx.core.provider.C0575b.C0581f;
import p214e.p228e.C7577e;

@SuppressLint({"NewApi"})
/* renamed from: e.h.e.d */
public class C7619d {

    /* renamed from: a */
    private static final C7625j f19191a;

    /* renamed from: b */
    private static final C7577e<String, Typeface> f19192b = new C7577e<>(16);

    static {
        if (C0563a.m2669a()) {
            f19191a = new C7624i();
        } else {
            int i = VERSION.SDK_INT;
            if (i >= 28) {
                f19191a = new C7623h();
            } else if (i >= 26) {
                f19191a = new C7622g();
            } else if (i >= 24 && C7621f.m18526a()) {
                f19191a = new C7621f();
            } else if (VERSION.SDK_INT >= 21) {
                f19191a = new C7620e();
            } else {
                f19191a = new C7625j();
            }
        }
    }

    /* renamed from: a */
    private static String m18515a(Resources resources, int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append(resources.getResourcePackageName(i));
        String str = "-";
        sb.append(str);
        sb.append(i);
        sb.append(str);
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: b */
    public static Typeface m18517b(Resources resources, int i, int i2) {
        return (Typeface) f19192b.mo19526b(m18515a(resources, i, i2));
    }

    /* renamed from: a */
    public static Typeface m18514a(Context context, FamilyResourceEntry familyResourceEntry, Resources resources, int i, int i2, C0555a aVar, Handler handler, boolean z) {
        Typeface typeface;
        if (familyResourceEntry instanceof C0548c) {
            C0548c cVar = (C0548c) familyResourceEntry;
            boolean z2 = false;
            if (!z ? aVar == null : cVar.mo3089a() == 0) {
                z2 = true;
            }
            typeface = C0575b.m2694a(context, cVar.mo3090b(), aVar, handler, z2, z ? cVar.mo3091c() : -1, i2);
        } else {
            typeface = f19191a.mo19730a(context, (C0546a) familyResourceEntry, resources, i2);
            if (aVar != null) {
                if (typeface != null) {
                    aVar.mo3100a(typeface, handler);
                } else {
                    aVar.mo3099a(-3, handler);
                }
            }
        }
        if (typeface != null) {
            f19192b.mo19521a(m18515a(resources, i, i2), typeface);
        }
        return typeface;
    }

    /* renamed from: b */
    private static Typeface m18516b(Context context, Typeface typeface, int i) {
        C0546a a = f19191a.mo19742a(typeface);
        if (a == null) {
            return null;
        }
        return f19191a.mo19730a(context, a, context.getResources(), i);
    }

    /* renamed from: a */
    public static Typeface m18511a(Context context, Resources resources, int i, String str, int i2) {
        Typeface a = f19191a.mo19731a(context, resources, i, str, i2);
        if (a != null) {
            f19192b.mo19521a(m18515a(resources, i, i2), a);
        }
        return a;
    }

    /* renamed from: a */
    public static Typeface m18513a(Context context, CancellationSignal cancellationSignal, C0581f[] fVarArr, int i) {
        return f19191a.mo19729a(context, cancellationSignal, fVarArr, i);
    }

    /* renamed from: a */
    public static Typeface m18512a(Context context, Typeface typeface, int i) {
        if (context != null) {
            if (VERSION.SDK_INT < 21) {
                Typeface b = m18516b(context, typeface, i);
                if (b != null) {
                    return b;
                }
            }
            return Typeface.create(typeface, i);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }
}
