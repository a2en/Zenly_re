package app.zenly.locator.userprofile.p198me.appicons;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.os.Build.VERSION;
import androidx.core.content.p003c.C0542a;
import androidx.core.content.p003c.C0542a.C0543a;
import androidx.core.content.p003c.C0544b;
import androidx.core.graphics.drawable.IconCompat;
import app.zenly.locator.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.userprofile.me.appicons.h */
public final class C6056h {

    /* renamed from: a */
    private final Context f15245a;

    /* renamed from: app.zenly.locator.userprofile.me.appicons.h$a */
    public static final class C6057a {
        private C6057a() {
        }

        public /* synthetic */ C6057a(C12928f fVar) {
            this();
        }
    }

    static {
        new C6057a(null);
    }

    public C6056h(Context context) {
        C12932j.m33818b(context, "context");
        this.f15245a = context;
    }

    /* renamed from: a */
    public final void mo13873a(C6042a aVar) {
        C12932j.m33818b(aVar, "appIcons");
        Intent intent = new Intent();
        intent.setAction("android.intent.action.MAIN");
        String packageName = this.f15245a.getPackageName();
        StringBuilder sb = new StringBuilder();
        sb.append("app.zenly.locator.");
        sb.append(aVar.mo13851a());
        intent.setClassName(packageName, sb.toString());
        C0543a aVar2 = new C0543a(this.f15245a, aVar.mo13854c());
        aVar2.mo3076a(intent);
        aVar2.mo3077a(IconCompat.m2629a(this.f15245a, aVar.getIconResource()));
        aVar2.mo3078a((CharSequence) this.f15245a.getString(R.string.app_name));
        C0542a a = aVar2.mo3080a();
        C12932j.m33815a((Object) a, "ShortcutInfoCompat.Build…me))\n            .build()");
        PendingIntent broadcast = PendingIntent.getBroadcast(this.f15245a, 0, new Intent("app.zenly.locator.action.SHORTCUT_INSTALLED"), 0);
        Context context = this.f15245a;
        C12932j.m33815a((Object) broadcast, "successCallback");
        C0544b.m2560a(context, a, broadcast.getIntentSender());
    }

    /* renamed from: b */
    public final boolean mo13876b(C6042a aVar) {
        C12932j.m33818b(aVar, "appIcons");
        if (aVar == C6042a.f15221k) {
            return true;
        }
        boolean z = false;
        if (!mo13874a()) {
            return false;
        }
        Object systemService = this.f15245a.getSystemService("shortcut");
        if (systemService != null) {
            List pinnedShortcuts = ((ShortcutManager) systemService).getPinnedShortcuts();
            C12932j.m33815a((Object) pinnedShortcuts, "shortcutManager.pinnedShortcuts");
            if (!(pinnedShortcuts instanceof Collection) || !pinnedShortcuts.isEmpty()) {
                Iterator it = pinnedShortcuts.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ShortcutInfo shortcutInfo = (ShortcutInfo) it.next();
                    C12932j.m33815a((Object) shortcutInfo, "it");
                    if (C12932j.m33817a((Object) shortcutInfo.getId(), (Object) aVar.mo13854c())) {
                        z = true;
                        break;
                    }
                }
            }
            return z;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.content.pm.ShortcutManager");
    }

    /* renamed from: b */
    public final boolean mo13875b() {
        return C0544b.m2559a(this.f15245a);
    }

    /* renamed from: a */
    public final boolean mo13874a() {
        return VERSION.SDK_INT >= 25;
    }
}
