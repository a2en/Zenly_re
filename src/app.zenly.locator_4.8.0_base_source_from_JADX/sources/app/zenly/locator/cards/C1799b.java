package app.zenly.locator.cards;

import androidx.fragment.app.C0819o;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import app.zenly.locator.cards.framework.CardFragmentFactory;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.cards.b */
public final class C1799b {
    /* renamed from: a */
    public static final CardSwitcherFragment m7230a(FragmentActivity fragmentActivity) {
        C12932j.m33818b(fragmentActivity, "$this$getOrCreateCardSwitcherFragment");
        String str = "fragment:card_picker";
        CardSwitcherFragment cardSwitcherFragment = (CardSwitcherFragment) fragmentActivity.getSupportFragmentManager().mo4083b(str);
        if (cardSwitcherFragment == null) {
            cardSwitcherFragment = CardSwitcherFragment.f5878v.mo7373a();
            C0819o b = fragmentActivity.getSupportFragmentManager().mo4084b();
            b.mo4312a(16908290, (Fragment) cardSwitcherFragment, str);
            b.mo4176a();
        }
        cardSwitcherFragment.mo7361a((CardFragmentFactory) C1800c.f5937a);
        return cardSwitcherFragment;
    }
}
