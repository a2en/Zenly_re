package app.zenly.locator.experimental.referrer;

import android.util.Base64;
import kotlin.jvm.internal.C12932j;
import kotlin.text.C13005c;

/* renamed from: app.zenly.locator.experimental.referrer.e */
public final class C3756e {
    /* renamed from: a */
    public final String mo10312a(String str) {
        C12932j.m33818b(str, "data");
        try {
            byte[] bytes = str.getBytes(C13005c.f33594a);
            C12932j.m33815a((Object) bytes, "(this as java.lang.String).getBytes(charset)");
            byte[] decode = Base64.decode(bytes, 9);
            C12932j.m33815a((Object) decode, "Base64.decode(data.toByt…AFE or Base64.NO_PADDING)");
            return new String(decode, C13005c.f33594a);
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: b */
    public final String mo10313b(String str) {
        C12932j.m33818b(str, "data");
        byte[] bytes = str.getBytes(C13005c.f33594a);
        C12932j.m33815a((Object) bytes, "(this as java.lang.String).getBytes(charset)");
        String encodeToString = Base64.encodeToString(bytes, 9);
        C12932j.m33815a((Object) encodeToString, "Base64.encodeToString(da…AFE or Base64.NO_PADDING)");
        return encodeToString;
    }
}
