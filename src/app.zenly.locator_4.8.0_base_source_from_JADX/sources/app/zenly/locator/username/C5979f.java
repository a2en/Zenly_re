package app.zenly.locator.username;

import android.content.Context;
import android.content.res.AssetManager;
import app.zenly.android.base.util.C1296a;
import app.zenly.locator.cards.C1815k;
import app.zenly.locator.core.util.C3231q;
import app.zenly.locator.core.util.C3231q.C3232a;
import java.util.Locale;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.username.f */
public final class C5979f {

    /* renamed from: a */
    public static final C5979f f15037a = new C5979f();

    private C5979f() {
    }

    /* renamed from: a */
    public final String mo13714a(Context context, int i) {
        C12932j.m33818b(context, "context");
        AssetManager assets = context.getAssets();
        C12932j.m33815a((Object) assets, "context.assets");
        String a = C1296a.m6235a(assets, C5968a.f15017k.mo13702a(i).mo13700b());
        StringBuilder sb = new StringBuilder();
        sb.append("cards/username/");
        sb.append(i);
        sb.append('/');
        sb.append(a);
        return sb.toString();
    }

    /* renamed from: a */
    public final String mo13715a(String str, C1815k kVar) {
        C12932j.m33818b(str, "username");
        C12932j.m33818b(kVar, "renderingOutput");
        Locale locale = Locale.ROOT;
        C12932j.m33815a((Object) locale, "Locale.ROOT");
        String lowerCase = str.toLowerCase(locale);
        C12932j.m33815a((Object) lowerCase, "(this as java.lang.String).toLowerCase(locale)");
        StringBuilder sb = new StringBuilder();
        sb.append(kVar.mo7475b());
        sb.append('_');
        sb.append(kVar.mo7474a());
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(lowerCase);
        sb3.append('+');
        sb3.append(sb2);
        return sb3.toString();
    }

    /* renamed from: a */
    public final void mo13716a(Context context) {
        C12932j.m33818b(context, "context");
        C3231q.m10244b(context, C3232a.VIDEOS, "cards/username");
    }
}
