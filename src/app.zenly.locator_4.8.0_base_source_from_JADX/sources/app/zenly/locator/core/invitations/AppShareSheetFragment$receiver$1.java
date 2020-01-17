package app.zenly.locator.core.invitations;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import app.zenly.locator.p143s.C5343a;
import kotlin.jvm.internal.C12932j;

public final class AppShareSheetFragment$receiver$1 extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ AppShareSheetFragment f7554a;

    AppShareSheetFragment$receiver$1(AppShareSheetFragment appShareSheetFragment) {
        this.f7554a = appShareSheetFragment;
    }

    public void onReceive(Context context, Intent intent) {
        C12932j.m33818b(context, "context");
        C12932j.m33818b(intent, "intent");
        ComponentName componentName = (ComponentName) intent.getParcelableExtra("android.intent.extra.CHOSEN_COMPONENT");
        String packageName = componentName != null ? componentName.getPackageName() : null;
        if (packageName != null) {
            if (!this.f7554a.m8784g()) {
                C5343a.m15160U().mo12890h(packageName);
            }
            this.f7554a.f7547j.mo8630a(packageName);
        }
    }
}
