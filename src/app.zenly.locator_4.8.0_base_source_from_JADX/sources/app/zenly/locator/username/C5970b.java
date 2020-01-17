package app.zenly.locator.username;

import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.username.b */
public final class C5970b {
    static {
        new C5970b();
    }

    private C5970b() {
    }

    /* renamed from: a */
    public static final String m16566a(CharSequence charSequence) {
        C12932j.m33818b(charSequence, "username");
        Locale locale = Locale.ENGLISH;
        C12932j.m33815a((Object) locale, "Locale.ENGLISH");
        Object[] objArr = {charSequence};
        String format = String.format(locale, "zen.ly/%s", Arrays.copyOf(objArr, objArr.length));
        C12932j.m33815a((Object) format, "java.lang.String.format(locale, this, *args)");
        return format;
    }

    /* renamed from: b */
    public static final String m16567b(CharSequence charSequence) {
        C12932j.m33818b(charSequence, "username");
        Locale locale = Locale.ENGLISH;
        C12932j.m33815a((Object) locale, "Locale.ENGLISH");
        Object[] objArr = {charSequence};
        String format = String.format(locale, "https://zen.ly/%s", Arrays.copyOf(objArr, objArr.length));
        C12932j.m33815a((Object) format, "java.lang.String.format(locale, this, *args)");
        return format;
    }
}
