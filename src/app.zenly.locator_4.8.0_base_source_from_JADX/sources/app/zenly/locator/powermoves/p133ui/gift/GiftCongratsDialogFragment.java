package app.zenly.locator.powermoves.p133ui.gift;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.navigation.fragment.C0957a;
import app.zenly.android.feature.base.app.C1320a;
import app.zenly.locator.C3891l;
import app.zenly.locator.R;
import app.zenly.locator.powermoves.p126a.C4965a;
import app.zenly.locator.powermoves.p128c.C4993a;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import kotlin.C12956q;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12933k;
import p389io.reactivex.C12291g;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.p390h.p392c.C12295a;
import p389io.reactivex.p405m.C12779d;
import p389io.reactivex.schedulers.C12802a;

/* renamed from: app.zenly.locator.powermoves.ui.gift.GiftCongratsDialogFragment */
public final class GiftCongratsDialogFragment extends C1320a {

    /* renamed from: r */
    private Disposable f13089r;

    /* renamed from: s */
    private HashMap f13090s;

    /* renamed from: app.zenly.locator.powermoves.ui.gift.GiftCongratsDialogFragment$a */
    static final class C5036a extends C12933k implements Function1<Long, C12956q> {

        /* renamed from: f */
        final /* synthetic */ GiftCongratsDialogFragment f13091f;

        C5036a(GiftCongratsDialogFragment giftCongratsDialogFragment) {
            this.f13091f = giftCongratsDialogFragment;
            super(1);
        }

        /* renamed from: a */
        public final void mo12291a(Long l) {
            C4965a.m14325a(C0957a.m4290a(this.f13091f), C5042a.f13101a.mo12298a(), null, 2, null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo12291a((Long) obj);
            return C12956q.f33541a;
        }
    }

    /* renamed from: f */
    private final void m14422f() {
        C12291g a = C12291g.m32766b(2000, TimeUnit.MILLISECONDS).mo36544b(C12802a.m33491b()).mo36535a(C12295a.m32802a());
        C12932j.m33815a((Object) a, "Single.timer(2000, TimeU…dSchedulers.mainThread())");
        this.f13089r = C12779d.m33441a(a, (Function1) null, (Function1) new C5036a(this), 1, (Object) null);
    }

    /* renamed from: a */
    public View mo12290a(int i) {
        if (this.f13090s == null) {
            this.f13090s = new HashMap();
        }
        View view = (View) this.f13090s.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f13090s.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: c */
    public int mo4208c() {
        return 2132083176;
    }

    /* renamed from: e */
    public void mo6506e() {
        HashMap hashMap = this.f13090s;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C12932j.m33818b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.dialog_fragment_gift_congrats, viewGroup, false);
    }

    public void onDestroyView() {
        Disposable disposable = this.f13089r;
        if (disposable != null) {
            disposable.dispose();
        }
        super.onDestroyView();
        mo6506e();
    }

    public void onViewCreated(View view, Bundle bundle) {
        C12932j.m33818b(view, "view");
        super.onViewCreated(view, bundle);
        m14422f();
        C4993a aVar = C4993a.f13022a;
        ImageView imageView = (ImageView) mo12290a(C3891l.giftIconImageView);
        C12932j.m33815a((Object) imageView, "giftIconImageView");
        aVar.mo12236a(imageView, 100.0f).mo3622d();
        C4993a aVar2 = C4993a.f13022a;
        TextView textView = (TextView) mo12290a(C3891l.giftCaptionTextView);
        C12932j.m33815a((Object) textView, "giftCaptionTextView");
        aVar2.mo12236a(textView, 200.0f).mo3622d();
    }

    public void onWindowInsetsChanged(View view, Rect rect) {
        C12932j.m33818b(view, "view");
        C12932j.m33818b(rect, "insets");
        view.setPadding(rect.left, rect.top, rect.right, rect.bottom);
    }
}
