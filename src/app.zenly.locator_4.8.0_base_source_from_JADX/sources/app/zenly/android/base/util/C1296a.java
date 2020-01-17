package app.zenly.android.base.util;

import android.content.res.AssetManager;
import java.io.InputStream;
import kotlin.jvm.internal.C12932j;
import kotlin.p409io.C12900a;
import kotlin.text.C13005c;

/* renamed from: app.zenly.android.base.util.a */
public final class C1296a {
    /* renamed from: a */
    public static final String m6235a(AssetManager assetManager, String str) {
        C12932j.m33818b(assetManager, "$this$readFile");
        C12932j.m33818b(str, "name");
        InputStream open = assetManager.open(str);
        C12932j.m33815a((Object) open, "open(name)");
        return new String(C12900a.m33758a(open), C13005c.f33594a);
    }
}
