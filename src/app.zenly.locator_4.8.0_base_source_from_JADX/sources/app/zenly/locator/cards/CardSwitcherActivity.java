package app.zenly.locator.cards;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import app.zenly.locator.R;
import app.zenly.locator.cards.framework.CardFragment;
import app.zenly.locator.cards.framework.CardFragment.ActionHandler;
import app.zenly.locator.cards.models.Card;
import app.zenly.locator.core.app.BaseActivity;
import app.zenly.locator.core.util.C3227n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C12932j;

public final class CardSwitcherActivity extends BaseActivity {

    /* renamed from: p */
    public static final C1767a f5873p = new C1767a(null);
    /* access modifiers changed from: private */

    /* renamed from: n */
    public String f5874n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public boolean f5875o;

    /* renamed from: app.zenly.locator.cards.CardSwitcherActivity$a */
    public static final class C1767a {
        private C1767a() {
        }

        /* renamed from: a */
        static /* synthetic */ Intent m7167a(C1767a aVar, Context context, List list, int i, int i2, Object obj) {
            if ((i2 & 4) != 0) {
                i = 0;
            }
            return aVar.m7166a(context, list, i);
        }

        public /* synthetic */ C1767a(C12928f fVar) {
            this();
        }

        /* renamed from: a */
        private final Intent m7166a(Context context, List<? extends Card> list, int i) {
            Intent putExtra = new Intent(context, CardSwitcherActivity.class).putExtra("arg:models", C3227n.m10228a(list)).putExtra("arg:startPosition", i);
            C12932j.m33815a((Object) putExtra, "Intent(context, CardSwit…_POSITION, startPosition)");
            return putExtra;
        }

        /* renamed from: a */
        private final Intent m7165a(Context context, Card card, Card... cardArr) {
            List c = C12848o.m33645c(card);
            C12854t.m33652a((Collection) c, (Object[]) cardArr);
            return m7167a(this, context, c, 0, 4, (Object) null);
        }

        /* renamed from: a */
        private final ActivityOptions m7164a(Activity activity) {
            ActivityOptions makeCustomAnimation = ActivityOptions.makeCustomAnimation(activity, R.anim.fade_in, R.anim.stay_still);
            C12932j.m33815a((Object) makeCustomAnimation, "ActivityOptions.makeCust…de_in, R.anim.stay_still)");
            return makeCustomAnimation;
        }

        /* renamed from: a */
        private final void m7168a(Activity activity, Intent intent) {
            activity.startActivity(intent, m7164a(activity).toBundle());
        }

        /* renamed from: a */
        private final void m7169a(Activity activity, Intent intent, int i) {
            activity.startActivityForResult(intent, i, m7164a(activity).toBundle());
        }

        /* renamed from: a */
        public static /* synthetic */ void m7170a(C1767a aVar, Activity activity, List list, int i, int i2, Object obj) {
            if ((i2 & 4) != 0) {
                i = 0;
            }
            aVar.mo7357a(activity, list, i);
        }

        /* renamed from: a */
        public final void mo7357a(Activity activity, List<? extends Card> list, int i) {
            C12932j.m33818b(activity, "activity");
            C12932j.m33818b(list, "models");
            m7168a(activity, m7166a((Context) activity, list, i));
        }

        /* renamed from: a */
        public final void mo7356a(Activity activity, Card card, Card... cardArr) {
            C12932j.m33818b(activity, "activity");
            C12932j.m33818b(card, "model");
            C12932j.m33818b(cardArr, "otherModels");
            m7168a(activity, m7165a((Context) activity, card, (Card[]) Arrays.copyOf(cardArr, cardArr.length)));
        }

        /* renamed from: a */
        public final void mo7358a(Activity activity, List<? extends Card> list, int i, int i2) {
            C12932j.m33818b(activity, "activity");
            C12932j.m33818b(list, "models");
            m7169a(activity, m7166a((Context) activity, list, i), i2);
        }
    }

    /* renamed from: app.zenly.locator.cards.CardSwitcherActivity$b */
    public static final class C1768b implements ActionHandler {

        /* renamed from: a */
        final /* synthetic */ CardSwitcherActivity f5876a;

        C1768b(CardSwitcherActivity cardSwitcherActivity) {
            this.f5876a = cardSwitcherActivity;
        }

        public void onUserSelected(String str) {
            C12932j.m33818b(str, "userUuid");
            this.f5876a.f5874n = str;
            this.f5876a.f5875o = true;
            this.f5876a.finish();
        }
    }

    /* renamed from: a */
    public boolean mo6505a() {
        return true;
    }

    public void finish() {
        String str = "app.zenly.locator.extra.NEED_TO_OPEN_CHAT";
        setResult(-1, new Intent().putExtra("app.zenly.locator.extra.TARGET_UUID", this.f5874n).putExtra(str, this.f5875o));
        super.finish();
        overridePendingTransition(R.anim.stay_still, R.anim.fade_out);
    }

    public void onAttachFragment(Fragment fragment) {
        C12932j.m33818b(fragment, "fragment");
        if (fragment instanceof CardFragment) {
            ((CardFragment) fragment).mo7410a((ActionHandler) new C1768b(this));
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        CardSwitcherFragment a = C1799b.m7230a(this);
        ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("arg:models");
        C12932j.m33815a((Object) parcelableArrayListExtra, "intent.getParcelableArrayListExtra(ARG_MODELS)");
        a.mo7363a((List<Card>) parcelableArrayListExtra);
        a.mo7364b(getIntent().getIntExtra("arg:startPosition", 0));
    }
}
