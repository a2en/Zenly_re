package p250f.p251a.p252a.p263b.p264a.p272j;

import android.content.Context;
import java.util.Locale;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p263b.p264a.C7695c;

/* renamed from: f.a.a.b.a.j.f */
public final class C7713f {
    static {
        new C7713f();
    }

    private C7713f() {
    }

    /* renamed from: a */
    public static final Locale m18776a(Context context) {
        C12932j.m33818b(context, "context");
        Locale forLanguageTag = Locale.forLanguageTag(context.getString(C7695c.language_tag));
        C12932j.m33815a((Object) forLanguageTag, "Locale.forLanguageTag(co…g(R.string.language_tag))");
        return forLanguageTag;
    }
}
