package app.zenly.locator.p195t;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import androidx.browser.customtabs.C0303c.C0304a;
import app.zenly.locator.R;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p253a.p255e.C7660b;
import p250f.p251a.p252a.p253a.p256f.p257a.C7678c;

/* renamed from: app.zenly.locator.t.a */
public final class C5941a {

    /* renamed from: a */
    public static final C5941a f14959a = new C5941a();

    private C5941a() {
    }

    /* renamed from: a */
    private final boolean m16477a(PackageManager packageManager) {
        for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com")), 0)) {
            Intent intent = new Intent();
            intent.setAction("android.support.customtabs.action.CustomTabsService");
            intent.setPackage(resolveInfo.activityInfo.packageName);
            if (packageManager.resolveService(intent, 0) != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private final C0304a m16475a(Context context) {
        C0304a aVar = new C0304a();
        aVar.mo2148b(context, R.anim.fade_in, R.anim.stay_still);
        aVar.mo2145a(context, R.anim.stay_still, R.anim.fade_out);
        aVar.mo2144a(C7678c.m18702a(context, (int) R.attr.colorPrimary));
        return aVar;
    }

    /* renamed from: a */
    public static final void m16476a(Context context, String str) {
        C12932j.m33818b(context, "context");
        C12932j.m33818b(str, "url");
        Uri parse = Uri.parse(str);
        C5941a aVar = f14959a;
        PackageManager packageManager = context.getPackageManager();
        C12932j.m33815a((Object) packageManager, "context.packageManager");
        if (aVar.m16477a(packageManager)) {
            f14959a.m16475a(context).mo2147a().mo2143a(context, parse);
        } else {
            C7660b.m18653a(context, new Intent("android.intent.action.VIEW", parse));
        }
    }
}
