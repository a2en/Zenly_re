package app.zenly.locator.username.idcard;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.C0819o;
import androidx.fragment.app.Fragment;
import app.zenly.locator.core.app.BaseActivity;
import app.zenly.locator.username.idcard.CardPickerFragment.C5995b;
import app.zenly.locator.username.idcard.CardPickerFragment.Callback;
import app.zenly.locator.username.idcard.CardPickerFragment.Callback.C5993a;
import kotlin.jvm.internal.C12932j;

public final class CardPickerActivity extends BaseActivity {
    /* access modifiers changed from: private */

    /* renamed from: q */
    public static final int[] f15072q = {0, 4, 1, 3, 5, 2};

    /* renamed from: r */
    public static final C5991a f15073r = new C5991a(null);

    /* renamed from: n */
    private String f15074n;

    /* renamed from: o */
    private boolean f15075o;

    /* renamed from: p */
    private final C5992b f15076p = new C5992b(this);

    /* renamed from: app.zenly.locator.username.idcard.CardPickerActivity$a */
    public static final class C5991a {
        private C5991a() {
        }

        /* renamed from: a */
        public final Intent mo13753a(Context context, String str, int i) {
            C12932j.m33818b(context, "context");
            C12932j.m33818b(str, "username");
            Intent putExtra = new Intent(context, CardPickerActivity.class).putExtra("app.zenly.locator.extra..ID_CARD_STYLES", CardPickerActivity.f15072q).putExtra("app.zenly.locator.extra..SELECTED_ID_CARD_STYLE", i).putExtra("app.zenly.locator.extra..USERNAME", str).putExtra("app.zenly.locator.extra..IS_ME", true);
            C12932j.m33815a((Object) putExtra, "Intent(context, CardPick…tExtra(EXTRA_IS_ME, true)");
            return putExtra;
        }

        /* renamed from: b */
        public final Intent mo13754b(Context context, String str, int i) {
            C12932j.m33818b(context, "context");
            C12932j.m33818b(str, "username");
            Intent putExtra = new Intent(context, CardPickerActivity.class).putExtra("app.zenly.locator.extra..ID_CARD_STYLES", new int[]{i}).putExtra("app.zenly.locator.extra..SELECTED_ID_CARD_STYLE", i).putExtra("app.zenly.locator.extra..USERNAME", str).putExtra("app.zenly.locator.extra..IS_ME", false);
            C12932j.m33815a((Object) putExtra, "Intent(context, CardPick…Extra(EXTRA_IS_ME, false)");
            return putExtra;
        }

        public /* synthetic */ C5991a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.locator.username.idcard.CardPickerActivity$b */
    public static final class C5992b implements Callback {

        /* renamed from: a */
        final /* synthetic */ CardPickerActivity f15077a;

        C5992b(CardPickerActivity cardPickerActivity) {
            this.f15077a = cardPickerActivity;
        }

        public void onCardSelected(CardPickerFragment cardPickerFragment, int i) {
            C12932j.m33818b(cardPickerFragment, "fragment");
            C5993a.m16677a(this, cardPickerFragment, i);
        }

        public void onFinish(CardPickerFragment cardPickerFragment) {
            C12932j.m33818b(cardPickerFragment, "fragment");
            this.f15077a.finish();
        }
    }

    /* renamed from: a */
    public static final Intent m16616a(Context context, String str, int i) {
        return f15073r.mo13753a(context, str, i);
    }

    /* renamed from: b */
    public static final Intent m16617b(Context context, String str, int i) {
        return f15073r.mo13754b(context, str, i);
    }

    /* renamed from: a */
    public boolean mo6505a() {
        return true;
    }

    /* renamed from: d */
    public boolean mo6993d() {
        CardPickerFragment cardPickerFragment = (CardPickerFragment) getSupportFragmentManager().mo4083b("fragment:cardPicker");
        return cardPickerFragment != null ? cardPickerFragment.mo13759c() : super.mo6993d();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("app.zenly.locator.extra..USERNAME");
        C12932j.m33815a((Object) stringExtra, "intent.getStringExtra(EXTRA_USERNAME)");
        this.f15074n = stringExtra;
        this.f15075o = getIntent().getBooleanExtra("app.zenly.locator.extra..IS_ME", false);
        String str = "fragment:cardPicker";
        CardPickerFragment cardPickerFragment = (CardPickerFragment) getSupportFragmentManager().mo4083b(str);
        if (cardPickerFragment == null) {
            C5995b bVar = CardPickerFragment.f15079z;
            String str2 = this.f15074n;
            if (str2 != null) {
                int[] intArrayExtra = getIntent().getIntArrayExtra("app.zenly.locator.extra..ID_CARD_STYLES");
                C12932j.m33815a((Object) intArrayExtra, "intent.getIntArrayExtra(EXTRA_ID_CARD_STYLES)");
                cardPickerFragment = bVar.mo13764a(str2, intArrayExtra, getIntent().getIntExtra("app.zenly.locator.extra..SELECTED_ID_CARD_STYLE", 0), this.f15075o);
                C0819o b = getSupportFragmentManager().mo4084b();
                b.mo4312a(16908290, (Fragment) cardPickerFragment, str);
                b.mo4176a();
            } else {
                C12932j.m33820c("username");
                throw null;
            }
        }
        cardPickerFragment.mo13758a((Callback) this.f15076p);
    }
}
