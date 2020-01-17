package kotlin.text;

import java.nio.charset.Charset;
import kotlin.jvm.internal.C12932j;

/* renamed from: kotlin.text.c */
public final class C13005c {

    /* renamed from: a */
    public static final Charset f33594a;

    static {
        new C13005c();
        Charset forName = Charset.forName("UTF-8");
        C12932j.m33815a((Object) forName, "Charset.forName(\"UTF-8\")");
        f33594a = forName;
        C12932j.m33815a((Object) Charset.forName("UTF-16"), "Charset.forName(\"UTF-16\")");
        C12932j.m33815a((Object) Charset.forName("UTF-16BE"), "Charset.forName(\"UTF-16BE\")");
        C12932j.m33815a((Object) Charset.forName("UTF-16LE"), "Charset.forName(\"UTF-16LE\")");
        C12932j.m33815a((Object) Charset.forName("US-ASCII"), "Charset.forName(\"US-ASCII\")");
        C12932j.m33815a((Object) Charset.forName("ISO-8859-1"), "Charset.forName(\"ISO-8859-1\")");
    }

    private C13005c() {
    }
}
