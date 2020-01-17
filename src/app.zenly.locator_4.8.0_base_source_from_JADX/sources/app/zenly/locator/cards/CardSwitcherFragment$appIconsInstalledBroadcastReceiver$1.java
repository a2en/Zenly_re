package app.zenly.locator.cards;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
import app.zenly.locator.R;
import kotlin.jvm.internal.C12932j;

public final class CardSwitcherFragment$appIconsInstalledBroadcastReceiver$1 extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ CardSwitcherFragment f5936a;

    CardSwitcherFragment$appIconsInstalledBroadcastReceiver$1(CardSwitcherFragment cardSwitcherFragment) {
        this.f5936a = cardSwitcherFragment;
    }

    public void onReceive(Context context, Intent intent) {
        C12932j.m33818b(context, "context");
        C12932j.m33818b(intent, "intent");
        if (this.f5936a.m7190f().mo13874a()) {
            CardSwitcherFragment cardSwitcherFragment = this.f5936a;
            cardSwitcherFragment.m7183c(CardSwitcherFragment.m7193h(cardSwitcherFragment).getCurrentItem());
            return;
        }
        Toast.makeText(this.f5936a.requireContext(), R.string.cards_shortcut_toast, 1).show();
    }
}
