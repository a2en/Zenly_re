package app.zenly.locator.onboarding;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.C12932j;

public final class BroadcastInviteOtherAppsController$receiver$1 extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ BroadcastInviteOtherAppsController f12523a;

    BroadcastInviteOtherAppsController$receiver$1(BroadcastInviteOtherAppsController broadcastInviteOtherAppsController) {
        this.f12523a = broadcastInviteOtherAppsController;
    }

    public void onReceive(Context context, Intent intent) {
        C12932j.m33818b(context, "context");
        C12932j.m33818b(intent, "intent");
        ComponentName componentName = (ComponentName) intent.getParcelableExtra("android.intent.extra.CHOSEN_COMPONENT");
        String packageName = componentName != null ? componentName.getPackageName() : null;
        if (packageName != null) {
            this.f12523a.f12515U.mo8630a(packageName);
        }
    }
}
