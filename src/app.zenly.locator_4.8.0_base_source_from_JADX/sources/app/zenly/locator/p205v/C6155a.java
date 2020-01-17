package app.zenly.locator.p205v;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import androidx.browser.customtabs.C0296b;
import androidx.browser.customtabs.C0303c;
import androidx.browser.customtabs.C0303c.C0304a;
import androidx.browser.customtabs.C0305d;
import androidx.browser.customtabs.C0310g;
import app.zenly.locator.core.manager.MeUserManager;
import app.zenly.locator.p143s.p148l.C5447b;
import app.zenly.locator.p143s.p150n.C5459d;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12948z;
import p213co.znly.core.ZenlyCore;

/* renamed from: app.zenly.locator.v.a */
public final class C6155a extends C0305d {

    /* renamed from: a */
    private final Context f15455a;

    /* renamed from: b */
    private final ZenlyCore f15456b;

    /* renamed from: c */
    private final MeUserManager f15457c;

    /* renamed from: d */
    private final String f15458d;

    /* renamed from: app.zenly.locator.v.a$a */
    public static final class C6156a {
        private C6156a() {
        }

        public /* synthetic */ C6156a(C12928f fVar) {
            this();
        }
    }

    static {
        new C6156a(null);
    }

    public C6155a(Context context, ZenlyCore zenlyCore, MeUserManager meUserManager, String str) {
        C12932j.m33818b(context, "context");
        C12932j.m33818b(zenlyCore, "core");
        C12932j.m33818b(meUserManager, "meUserManager");
        C12932j.m33818b(str, "footstepsUrl");
        this.f15455a = context;
        this.f15456b = zenlyCore;
        this.f15457c = meUserManager;
        this.f15458d = str;
    }

    /* renamed from: a */
    public void mo2149a(ComponentName componentName, C0296b bVar) {
        String str;
        C12932j.m33818b(componentName, "name");
        C12932j.m33818b(bVar, "client");
        C0304a aVar = new C0304a(bVar.mo2137a(null));
        aVar.mo2146a(false);
        C0303c a = aVar.mo2147a();
        C5459d dVar = this.f15457c.mo8756b().f8252c;
        if (dVar == null) {
            str = this.f15458d;
        } else {
            C12948z zVar = C12948z.f33530a;
            Locale locale = Locale.US;
            C12932j.m33815a((Object) locale, "Locale.US");
            Object[] objArr = {this.f15458d, Long.valueOf(C5447b.m15475b(this.f15456b)), Double.valueOf(dVar.mo13062c()), Double.valueOf(dVar.mo13060b())};
            str = String.format(locale, "%s?ts=%s#%.2f/%.2f/0.48", Arrays.copyOf(objArr, objArr.length));
            C12932j.m33815a((Object) str, "java.lang.String.format(locale, format, *args)");
        }
        C0310g.m1249a(this.f15455a, a, Uri.parse(str));
    }

    public void onServiceDisconnected(ComponentName componentName) {
        C12932j.m33818b(componentName, "name");
    }
}
