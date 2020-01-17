package app.zenly.locator.username.idcard;

import android.animation.AnimatorSet;
import android.annotation.SuppressLint;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Rect;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.FileProvider;
import androidx.fragment.app.C0815l;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C0889u;
import androidx.lifecycle.C0890v;
import androidx.viewpager.widget.ViewPager.OnPageChangeListener;
import androidx.viewpager.widget.ViewPager.PageTransformer;
import app.zenly.android.feature.base.app.C1321b;
import app.zenly.locator.C3891l;
import app.zenly.locator.R;
import app.zenly.locator.cards.C1801d;
import app.zenly.locator.cards.C1802e;
import app.zenly.locator.cards.C1803f;
import app.zenly.locator.cards.C1808g;
import app.zenly.locator.cards.C1809h;
import app.zenly.locator.cards.C1814j;
import app.zenly.locator.cards.C1815k;
import app.zenly.locator.cards.CardSharingFragment;
import app.zenly.locator.cards.framework.CardLayout;
import app.zenly.locator.cards.framework.Tiltable;
import app.zenly.locator.core.config.C2455a.C2456a;
import app.zenly.locator.core.util.C3231q;
import app.zenly.locator.core.util.C3231q.C3232a;
import app.zenly.locator.core.widget.ViewPager;
import app.zenly.locator.core.widget.ViewPager.C3262b;
import app.zenly.locator.p143s.C5343a;
import app.zenly.locator.p143s.p146j.C5430a;
import app.zenly.locator.p143s.p148l.C5448c;
import app.zenly.locator.p143s.p153p.C5471a;
import app.zenly.locator.p143s.p153p.C5476b;
import app.zenly.locator.p143s.p155r.C5498a;
import app.zenly.locator.p143s.p155r.C5498a.C5499a;
import app.zenly.locator.p143s.p155r.C5498a.C5500b;
import app.zenly.locator.p143s.p155r.C5498a.C5501c;
import app.zenly.locator.username.C5970b;
import app.zenly.locator.username.C5979f;
import app.zenly.locator.username.C5980g;
import app.zenly.locator.username.UsernameInputActivity;
import app.zenly.locator.username.UsernameInputActivity.C5951a;
import app.zenly.locator.username.UsernamePreviewRenderListener;
import app.zenly.locator.username.idcard.C6027e.C6028a;
import com.airbnb.lottie.LottieAnimationView;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.C12956q;
import kotlin.Lazy;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12933k;
import kotlin.jvm.internal.C12934l;
import kotlin.jvm.internal.C12935m;
import kotlin.jvm.internal.C12940r;
import kotlin.jvm.internal.C12941s;
import kotlin.jvm.internal.C12946x;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import p213co.znly.models.UserProto$User;
import p250f.p251a.p252a.p253a.p254d.C7657c;
import p250f.p251a.p252a.p253a.p255e.C7662d;
import p250f.p251a.p252a.p263b.p264a.p265d.C7697b;
import p333g.p382g.p383a.C12125b;
import p387h.p388a.C12143a;
import p389io.reactivex.C12273d;
import p389io.reactivex.C12279e;
import p389io.reactivex.MaybeEmitter;
import p389io.reactivex.MaybeOnSubscribe;
import p389io.reactivex.ObservableEmitter;
import p389io.reactivex.ObservableOnSubscribe;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.functions.Action;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.functions.Function;
import p389io.reactivex.p390h.p392c.C12295a;
import p389io.reactivex.schedulers.C12802a;

public final class CardPickerFragment extends C1321b {

    /* renamed from: y */
    static final /* synthetic */ KProperty[] f15078y;

    /* renamed from: z */
    public static final C5995b f15079z = new C5995b(null);

    /* renamed from: f */
    private C6023d f15080f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C5994a f15081g;

    /* renamed from: h */
    private CardSharingFragment f15082h;

    /* renamed from: i */
    private final ReadWriteProperty f15083i = C7662d.m18671c();

    /* renamed from: j */
    private String f15084j;

    /* renamed from: k */
    private final ReadWriteProperty f15085k = C7662d.m18659a();

    /* renamed from: l */
    private final ReadWriteProperty f15086l = C7662d.m18660a(0);

    /* renamed from: m */
    private final ReadWriteProperty f15087m = C7662d.m18669a(false, 1, (Object) null);
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final ArrayList<Tiltable> f15088n = new ArrayList<>();
    /* access modifiers changed from: private */

    /* renamed from: o */
    public C5471a f15089o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public boolean f15090p = true;

    /* renamed from: q */
    private C5980g f15091q;

    /* renamed from: r */
    private final Lazy f15092r = C12896f.m33751a(new C6001g(this));

    /* renamed from: s */
    private final Lazy f15093s = C12896f.m33751a(new C6002h(this));

    /* renamed from: t */
    private Callback f15094t;

    /* renamed from: u */
    private final C6008n f15095u = new C6008n(this);
    /* access modifiers changed from: private */

    /* renamed from: v */
    public final C5997d f15096v = new C5997d(this);

    /* renamed from: w */
    private final OnClickListener f15097w = new C6005k(this);

    /* renamed from: x */
    private HashMap f15098x;

    public interface Callback {

        /* renamed from: app.zenly.locator.username.idcard.CardPickerFragment$Callback$a */
        public static final class C5993a {
            /* renamed from: a */
            public static void m16677a(Callback callback, CardPickerFragment cardPickerFragment, int i) {
                C12932j.m33818b(cardPickerFragment, "fragment");
            }
        }

        void onCardSelected(CardPickerFragment cardPickerFragment, int i);

        void onFinish(CardPickerFragment cardPickerFragment);
    }

    /* renamed from: app.zenly.locator.username.idcard.CardPickerFragment$a */
    private final class C5994a extends C0815l {

        /* renamed from: g */
        private CardFragment f15099g;

        /* renamed from: h */
        private Integer f15100h;

        /* renamed from: i */
        private final int[] f15101i;

        /* renamed from: j */
        final /* synthetic */ CardPickerFragment f15102j;

        public C5994a(CardPickerFragment cardPickerFragment, FragmentManager fragmentManager, int[] iArr) {
            C12932j.m33818b(fragmentManager, "fm");
            C12932j.m33818b(iArr, "cardStyles");
            this.f15102j = cardPickerFragment;
            super(fragmentManager);
            this.f15101i = iArr;
        }

        /* renamed from: b */
        public void mo4289b(ViewGroup viewGroup, int i, Object obj) {
            C12932j.m33818b(viewGroup, "container");
            C12932j.m33818b(obj, "fragment");
            super.mo4289b(viewGroup, i, obj);
            CardFragment cardFragment = (CardFragment) obj;
            if (!C12932j.m33817a((Object) cardFragment, (Object) this.f15099g)) {
                this.f15099g = cardFragment;
                this.f15100h = Integer.valueOf(this.f15101i[i]);
                C6028a aVar = C6027e.f15164E;
                Integer num = this.f15100h;
                if (num != null) {
                    C6027e a = aVar.mo13814a(num.intValue());
                    ((LottieAnimationView) this.f15102j.mo13757a(C3891l.lottie_card)).setAnimation(a.mo13806m());
                    ((TextView) this.f15102j.mo13757a(C3891l.lottie_card_username)).setTextColor(a.mo13807n());
                    return;
                }
                C12932j.m33814a();
                throw null;
            }
        }

        /* renamed from: c */
        public final int[] mo13760c() {
            return this.f15101i;
        }

        /* renamed from: d */
        public final Integer mo13761d() {
            return this.f15100h;
        }

        /* renamed from: e */
        public final CardFragment mo13762e() {
            return this.f15099g;
        }

        public int getCount() {
            return this.f15101i.length;
        }

        /* renamed from: b */
        public Fragment mo4287b(int i) {
            CardFragment a = CardFragment.f15062n.mo13750a(this.f15102j.m16659g(), CardPickerFragment.m16655e(this.f15102j), this.f15101i[i]);
            a.mo13744a((app.zenly.locator.username.idcard.CardFragment.Callback) this.f15102j.f15096v);
            return a;
        }
    }

    /* renamed from: app.zenly.locator.username.idcard.CardPickerFragment$b */
    public static final class C5995b {
        private C5995b() {
        }

        /* renamed from: a */
        public final CardPickerFragment mo13764a(String str, int[] iArr, int i, boolean z) {
            C12932j.m33818b(str, "name");
            C12932j.m33818b(iArr, "styles");
            CardPickerFragment cardPickerFragment = new CardPickerFragment();
            cardPickerFragment.m16640a(str);
            cardPickerFragment.m16644a(iArr);
            cardPickerFragment.m16652c(i);
            cardPickerFragment.m16643a(z);
            return cardPickerFragment;
        }

        public /* synthetic */ C5995b(C12928f fVar) {
            this();
        }

        /* renamed from: a */
        public final Intent mo13763a(String str) {
            C12932j.m33818b(str, "name");
            Intent putExtra = new Intent().putExtra("app.zenly.locator.extra.name", str);
            C12932j.m33815a((Object) putExtra, "Intent().putExtra(EXTRA_NAME, name)");
            return putExtra;
        }
    }

    /* renamed from: app.zenly.locator.username.idcard.CardPickerFragment$c */
    private enum C5996c {
        ;
        

        /* renamed from: e */
        private final int f15104e;

        /* renamed from: f */
        private final C1815k f15105f;

        /* renamed from: g */
        private final String f15106g;

        private C5996c(int i, C1815k kVar, String str) {
            this.f15104e = i;
            this.f15105f = kVar;
            this.f15106g = str;
        }

        /* renamed from: a */
        public final String mo13765a() {
            return this.f15106g;
        }

        /* renamed from: b */
        public final int mo13766b() {
            return this.f15104e;
        }

        /* renamed from: c */
        public final C1815k mo13767c() {
            return this.f15105f;
        }
    }

    /* renamed from: app.zenly.locator.username.idcard.CardPickerFragment$d */
    public static final class C5997d implements app.zenly.locator.username.idcard.CardFragment.Callback {

        /* renamed from: a */
        final /* synthetic */ CardPickerFragment f15107a;

        C5997d(CardPickerFragment cardPickerFragment) {
            this.f15107a = cardPickerFragment;
        }

        public void onCardCreated(Tiltable tiltable) {
            C12932j.m33818b(tiltable, "tiltable");
            if (!this.f15107a.f15088n.contains(tiltable)) {
                this.f15107a.f15088n.add(tiltable);
            }
            C5471a h = this.f15107a.f15089o;
            if (h != null) {
                h.mo13098e();
            }
        }

        public void onCardDestroyed(Tiltable tiltable) {
            C12932j.m33818b(tiltable, "tiltable");
            this.f15107a.f15088n.remove(tiltable);
        }

        public void onCardTapped(CardFragment cardFragment) {
            C12932j.m33818b(cardFragment, "fragment");
            CardPickerFragment.m16653d(this.f15107a).mo7348c();
        }

        public void onCardTappedOutside() {
            FragmentActivity activity = this.f15107a.getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    /* renamed from: app.zenly.locator.username.idcard.CardPickerFragment$e */
    static final class C5998e implements DialogInterface.OnClickListener {

        /* renamed from: e */
        final /* synthetic */ CardPickerFragment f15108e;

        C5998e(CardPickerFragment cardPickerFragment) {
            this.f15108e = cardPickerFragment;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f15108e.m16627a(C5996c.values()[i]);
        }
    }

    /* renamed from: app.zenly.locator.username.idcard.CardPickerFragment$f */
    public static final class C5999f implements UsernamePreviewRenderListener {

        /* renamed from: a */
        final /* synthetic */ FragmentActivity f15109a;

        /* renamed from: b */
        final /* synthetic */ CardPickerFragment f15110b;

        /* renamed from: c */
        final /* synthetic */ List f15111c;

        /* renamed from: d */
        final /* synthetic */ MaybeEmitter f15112d;

        /* renamed from: e */
        final /* synthetic */ C1808g f15113e;

        /* renamed from: f */
        final /* synthetic */ C1809h f15114f;

        /* renamed from: app.zenly.locator.username.idcard.CardPickerFragment$f$a */
        static final class C6000a extends C12933k implements Function0<C12956q> {

            /* renamed from: f */
            final /* synthetic */ C5999f f15115f;

            /* renamed from: g */
            final /* synthetic */ List f15116g;

            C6000a(C5999f fVar, List list) {
                this.f15115f = fVar;
                this.f15116g = list;
                super(0);
            }

            public final void invoke() {
                C5999f fVar = this.f15115f;
                fVar.f15110b.m16641a(this.f15116g, fVar.f15114f, fVar.f15113e, fVar.f15112d);
            }
        }

        C5999f(FragmentActivity fragmentActivity, CardPickerFragment cardPickerFragment, List list, MaybeEmitter maybeEmitter, C1808g gVar, C1809h hVar) {
            this.f15109a = fragmentActivity;
            this.f15110b = cardPickerFragment;
            this.f15111c = list;
            this.f15112d = maybeEmitter;
            this.f15113e = gVar;
            this.f15114f = hVar;
        }

        /* renamed from: a */
        private final void m16688a(List<? extends C1802e> list) {
            this.f15110b.m16642a((Function0<C12956q>) new C6000a<C12956q>(this, list));
        }

        public void onCancel() {
            CardPickerFragment.m16636a(this.f15110b, (Function0) null, 1, (Object) null);
            this.f15112d.onComplete();
        }

        public void onError() {
            List list;
            C12143a.m32030b("Video generation failed", new Object[0]);
            if (!this.f15111c.contains(C1803f.f5940a)) {
                list = C12857w.m33678d((Collection) this.f15111c);
                list.set(0, C1803f.f5940a);
            } else {
                list = C12857w.m33669b((Iterable) this.f15111c, 1);
            }
            m16688a(list);
        }

        public void onProgress(float f) {
            this.f15110b.m16625a(f);
        }

        public void onSuccess(File file) {
            C12932j.m33818b(file, "output");
            C12143a.m32027a("Preview generation succeeded: %s", file.getAbsolutePath());
            FragmentActivity fragmentActivity = this.f15109a;
            C12932j.m33815a((Object) fragmentActivity, "activity");
            String a = C2456a.m8571a(fragmentActivity);
            C1808g gVar = this.f15113e;
            Uri a2 = FileProvider.m2525a(this.f15109a, a, file);
            C12932j.m33815a((Object) a2, "FileProvider.getUriForFi…ivity, authority, output)");
            gVar.mo7463b(new C1801d(a2, file));
            m16688a(C12857w.m33669b((Iterable) this.f15111c, 1));
        }
    }

    /* renamed from: app.zenly.locator.username.idcard.CardPickerFragment$g */
    static final class C6001g extends C12933k implements Function0<View[]> {

        /* renamed from: f */
        final /* synthetic */ CardPickerFragment f15117f;

        C6001g(CardPickerFragment cardPickerFragment) {
            this.f15117f = cardPickerFragment;
            super(0);
        }

        public final View[] invoke() {
            if (this.f15117f.m16665j()) {
                return new View[]{(FrameLayout) this.f15117f.mo13757a(C3891l.card_sharing_layout), (TextView) this.f15117f.mo13757a(C3891l.share_text), (ViewPager) this.f15117f.mo13757a(C3891l.view_pager), (AppCompatImageButton) this.f15117f.mo13757a(C3891l.btn_save), (AppCompatImageButton) this.f15117f.mo13757a(C3891l.btn_edit)};
            }
            return new View[]{(FrameLayout) this.f15117f.mo13757a(C3891l.card_sharing_layout), (TextView) this.f15117f.mo13757a(C3891l.share_text), (ViewPager) this.f15117f.mo13757a(C3891l.view_pager), (AppCompatImageButton) this.f15117f.mo13757a(C3891l.btn_save)};
        }
    }

    /* renamed from: app.zenly.locator.username.idcard.CardPickerFragment$h */
    static final class C6002h extends C12933k implements Function0<AnimatorSet> {

        /* renamed from: f */
        final /* synthetic */ CardPickerFragment f15118f;

        C6002h(CardPickerFragment cardPickerFragment) {
            this.f15118f = cardPickerFragment;
            super(0);
        }

        public final AnimatorSet invoke() {
            C5430a aVar = C5430a.f13983a;
            TextView textView = (TextView) this.f15118f.mo13757a(C3891l.lottie_card_username);
            C12932j.m33815a((Object) textView, "lottie_card_username");
            return aVar.mo13003a(textView);
        }
    }

    /* renamed from: app.zenly.locator.username.idcard.CardPickerFragment$i */
    static final class C6003i extends C12933k implements Function1<C1809h, C12273d<C1808g>> {

        /* renamed from: f */
        final /* synthetic */ CardPickerFragment f15119f;

        C6003i(CardPickerFragment cardPickerFragment) {
            this.f15119f = cardPickerFragment;
            super(1);
        }

        /* renamed from: a */
        public final C12273d<C1808g> invoke(C1809h hVar) {
            C12932j.m33818b(hVar, "it");
            return this.f15119f.m16623a(hVar);
        }
    }

    /* renamed from: app.zenly.locator.username.idcard.CardPickerFragment$j */
    public static final class C6004j implements app.zenly.locator.cards.CardSharingFragment.Callback {

        /* renamed from: a */
        final /* synthetic */ CardPickerFragment f15120a;

        C6004j(CardPickerFragment cardPickerFragment) {
            this.f15120a = cardPickerFragment;
        }

        public void onShare(C1809h hVar) {
            C12932j.m33818b(hVar, "option");
            C5994a b = this.f15120a.f15081g;
            if (b != null) {
                Integer d = b.mo13761d();
                if (d != null) {
                    int intValue = d.intValue();
                    if (this.f15120a.m16665j()) {
                        C5343a.m15160U().mo12810a(intValue, hVar.mo7468a());
                    } else {
                        C5343a.m15160U().mo12900l(hVar.mo7468a());
                    }
                }
            }
        }
    }

    /* renamed from: app.zenly.locator.username.idcard.CardPickerFragment$k */
    static final class C6005k implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ CardPickerFragment f15121e;

        C6005k(CardPickerFragment cardPickerFragment) {
            this.f15121e = cardPickerFragment;
        }

        public final void onClick(View view) {
            C5499a aVar = C5498a.f14119e;
            Context requireContext = this.f15121e.requireContext();
            C12932j.m33815a((Object) requireContext, "requireContext()");
            C5498a.m15602a(aVar.mo13125a(requireContext), C5501c.LIGHT, C5500b.NAV, 0, 4, null);
            C12932j.m33815a((Object) view, "it");
            int id = view.getId();
            if (id != R.id.btn_close) {
                if (id == R.id.btn_edit) {
                    CardPickerFragment cardPickerFragment = this.f15121e;
                    ViewPager viewPager = (ViewPager) cardPickerFragment.mo13757a(C3891l.view_pager);
                    C12932j.m33815a((Object) viewPager, "view_pager");
                    cardPickerFragment.m16646b(viewPager.getCurrentItem());
                } else if (id == R.id.btn_save) {
                    this.f15121e.m16654d();
                }
            } else if (!this.f15121e.mo13759c()) {
                Callback b = this.f15121e.mo6614b();
                if (b != null) {
                    b.onFinish(this.f15121e);
                }
            }
        }
    }

    /* renamed from: app.zenly.locator.username.idcard.CardPickerFragment$l */
    static final class C6006l extends C12933k implements Function3<Float, Float, Float, C12956q> {

        /* renamed from: f */
        final /* synthetic */ CardPickerFragment f15122f;

        C6006l(CardPickerFragment cardPickerFragment) {
            this.f15122f = cardPickerFragment;
            super(3);
        }

        /* renamed from: a */
        public final void mo13771a(float f, float f2, float f3) {
            ArrayList<Tiltable> i = this.f15122f.f15088n;
            ArrayList arrayList = new ArrayList(C12850p.m33647a(i, 10));
            for (Tiltable tilt : i) {
                tilt.setTilt(f, f2, f3);
                arrayList.add(C12956q.f33541a);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            mo13771a(((Number) obj).floatValue(), ((Number) obj2).floatValue(), ((Number) obj3).floatValue());
            return C12956q.f33541a;
        }
    }

    /* renamed from: app.zenly.locator.username.idcard.CardPickerFragment$m */
    static final class C6007m extends C12933k implements Function0<C12956q> {

        /* renamed from: f */
        final /* synthetic */ CardPickerFragment f15123f;

        /* renamed from: g */
        final /* synthetic */ Function0 f15124g;

        C6007m(CardPickerFragment cardPickerFragment, Function0 function0) {
            this.f15123f = cardPickerFragment;
            this.f15124g = function0;
            super(0);
        }

        public final void invoke() {
            if (this.f15123f.getView() != null) {
                C7697b.m18743d((ConstraintLayout) this.f15123f.mo13757a(C3891l.loading_layout), 100, null, 2, null);
                for (View c : this.f15123f.m16656e()) {
                    C7697b.m18740c(c, 100, null, 2, null);
                }
                CardPickerFragment.m16638a(this.f15123f, false, 1, (Object) null);
                Function0 function0 = this.f15124g;
                if (function0 != null) {
                    C12956q qVar = (C12956q) function0.invoke();
                }
            }
        }
    }

    /* renamed from: app.zenly.locator.username.idcard.CardPickerFragment$n */
    public static final class C6008n extends C3262b {

        /* renamed from: a */
        private C6027e f15125a;

        /* renamed from: b */
        final /* synthetic */ CardPickerFragment f15126b;

        C6008n(CardPickerFragment cardPickerFragment) {
            this.f15126b = cardPickerFragment;
        }

        public void onPageScrollStateChanged(int i) {
            super.onPageScrollStateChanged(i);
            if (i == 0) {
                this.f15126b.f15090p = true;
            } else if (i == 1) {
                this.f15126b.f15090p = false;
            }
            CardPickerFragment.m16638a(this.f15126b, false, 1, (Object) null);
        }

        /* JADX WARNING: type inference failed for: r2v13, types: [android.view.View] */
        /* JADX WARNING: type inference failed for: r7v20, types: [app.zenly.locator.username.idcard.GoldView] */
        /* JADX WARNING: type inference failed for: r7v21, types: [app.zenly.locator.username.idcard.JungleView] */
        /* JADX WARNING: type inference failed for: r7v22, types: [app.zenly.locator.username.idcard.LemonadeView] */
        /* JADX WARNING: type inference failed for: r2v18 */
        /* JADX WARNING: type inference failed for: r7v27, types: [app.zenly.locator.username.idcard.GoldView] */
        /* JADX WARNING: type inference failed for: r7v28, types: [app.zenly.locator.username.idcard.JungleView] */
        /* JADX WARNING: type inference failed for: r7v29, types: [app.zenly.locator.username.idcard.LemonadeView] */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r2v18
          assigns: [?[OBJECT, ARRAY], app.zenly.locator.username.idcard.GoldView, app.zenly.locator.username.idcard.JungleView, app.zenly.locator.username.idcard.LemonadeView]
          uses: [?[int, boolean, OBJECT, ARRAY, byte, short, char], android.view.View, app.zenly.locator.username.idcard.GoldView, app.zenly.locator.username.idcard.JungleView, app.zenly.locator.username.idcard.LemonadeView]
          mth insns count: 126
        	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
        	at jadx.core.ProcessClass.process(ProcessClass.java:30)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
        	at jadx.core.ProcessClass.process(ProcessClass.java:35)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Unknown variable types count: 4 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onPageScrolled(int r18, float r19, int r20) {
            /*
                r17 = this;
                r0 = r17
                r1 = r19
                app.zenly.locator.username.idcard.CardPickerFragment r2 = r0.f15126b
                app.zenly.locator.username.idcard.CardPickerFragment$a r2 = r2.f15081g
                r3 = 0
                if (r2 == 0) goto L_0x0167
                int[] r2 = r2.mo13760c()
                app.zenly.locator.username.idcard.e$a r4 = app.zenly.locator.username.idcard.C6027e.f15164E
                r5 = r2[r18]
                app.zenly.locator.username.idcard.e r4 = r4.mo13814a(r5)
                app.zenly.locator.username.idcard.e$a r5 = app.zenly.locator.username.idcard.C6027e.f15164E
                r6 = 1
                int r7 = r18 + 1
                int r8 = r2.length
                int r8 = r8 - r6
                int r7 = kotlin.ranges.C12973l.m33890b(r7, r8)
                r2 = r2[r7]
                app.zenly.locator.username.idcard.e r2 = r5.mo13814a(r2)
                app.zenly.locator.username.idcard.CardPickerFragment r5 = r0.f15126b
                android.content.Context r8 = r5.requireContext()
                java.lang.String r5 = "requireContext()"
                kotlin.jvm.internal.C12932j.m33815a(r8, r5)
                r5 = 2
                int[] r13 = new int[r5]
                int[] r7 = r4.mo13794a()
                r14 = 0
                r7 = r7[r14]
                r13[r14] = r7
                int[] r7 = r4.mo13794a()
                r7 = r7[r6]
                r13[r6] = r7
                int[] r15 = new int[r5]
                int[] r7 = r2.mo13794a()
                r7 = r7[r14]
                r15[r14] = r7
                int[] r7 = r2.mo13794a()
                r7 = r7[r6]
                r15[r6] = r7
                r16 = 1056964608(0x3f000000, float:0.5)
                int r7 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
                if (r7 <= 0) goto L_0x0062
                goto L_0x0063
            L_0x0062:
                r2 = r4
            L_0x0063:
                app.zenly.locator.username.idcard.e r4 = r0.f15125a
                if (r4 == r2) goto L_0x010c
                r0.f15125a = r2
                app.zenly.locator.username.idcard.CardPickerFragment r4 = r0.f15126b
                int r7 = app.zenly.locator.C3891l.bokeh_view
                android.view.View r4 = r4.mo13757a(r7)
                app.zenly.locator.username.idcard.BokehView r4 = (app.zenly.locator.username.idcard.BokehView) r4
                app.zenly.locator.username.idcard.a r7 = r2.mo13795b()
                r4.mo13728a(r7)
                app.zenly.locator.username.idcard.CardPickerFragment r4 = r0.f15126b
                int r7 = app.zenly.locator.C3891l.overlay_view
                android.view.View r4 = r4.mo13757a(r7)
                java.lang.Integer r7 = r2.mo13810q()
                r9 = 8
                if (r7 == 0) goto L_0x009d
                r4.setVisibility(r14)
                java.lang.Integer r7 = r2.mo13810q()
                int r7 = r7.intValue()
                android.content.res.ColorStateList r7 = android.content.res.ColorStateList.valueOf(r7)
                r4.setBackgroundTintList(r7)
                goto L_0x00a0
            L_0x009d:
                r4.setVisibility(r9)
            L_0x00a0:
                app.zenly.locator.username.idcard.CardPickerFragment r4 = r0.f15126b
                int r7 = app.zenly.locator.C3891l.overlay_bokeh_view
                android.view.View r4 = r4.mo13757a(r7)
                app.zenly.locator.username.idcard.BokehView r4 = (app.zenly.locator.username.idcard.BokehView) r4
                app.zenly.locator.username.idcard.a r7 = r2.mo13809p()
                if (r7 == 0) goto L_0x00bb
                r4.setVisibility(r14)
                app.zenly.locator.username.idcard.a r7 = r2.mo13809p()
                r4.mo13728a(r7)
                goto L_0x00be
            L_0x00bb:
                r4.setVisibility(r9)
            L_0x00be:
                app.zenly.locator.username.idcard.CardPickerFragment r4 = r0.f15126b
                int r7 = app.zenly.locator.C3891l.overlay
                android.view.View r4 = r4.mo13757a(r7)
                android.widget.FrameLayout r4 = (android.widget.FrameLayout) r4
                r4.removeAllViews()
                int[] r7 = app.zenly.locator.username.idcard.C6021b.f15156a
                int r2 = r2.ordinal()
                r2 = r7[r2]
                if (r2 == r6) goto L_0x00f2
                if (r2 == r5) goto L_0x00e7
                r5 = 3
                if (r2 == r5) goto L_0x00dc
                r2 = r3
                goto L_0x00fc
            L_0x00dc:
                app.zenly.locator.username.idcard.LemonadeView r2 = new app.zenly.locator.username.idcard.LemonadeView
                r9 = 0
                r10 = 0
                r11 = 6
                r12 = 0
                r7 = r2
                r7.<init>(r8, r9, r10, r11, r12)
                goto L_0x00fc
            L_0x00e7:
                app.zenly.locator.username.idcard.JungleView r2 = new app.zenly.locator.username.idcard.JungleView
                r9 = 0
                r10 = 0
                r11 = 6
                r12 = 0
                r7 = r2
                r7.<init>(r8, r9, r10, r11, r12)
                goto L_0x00fc
            L_0x00f2:
                app.zenly.locator.username.idcard.GoldView r2 = new app.zenly.locator.username.idcard.GoldView
                r9 = 0
                r10 = 0
                r11 = 6
                r12 = 0
                r7 = r2
                r7.<init>(r8, r9, r10, r11, r12)
            L_0x00fc:
                if (r2 == 0) goto L_0x010c
                android.widget.FrameLayout$LayoutParams r5 = new android.widget.FrameLayout$LayoutParams
                r7 = -1
                r5.<init>(r7, r7)
                r4.addView(r2, r5)
                app.zenly.locator.username.idcard.CardPickerFragment r2 = r0.f15126b
                app.zenly.locator.username.idcard.CardPickerFragment.m16638a(r2, r14, r6, r3)
            L_0x010c:
                float r16 = r16 - r1
                float r2 = java.lang.Math.abs(r16)
                r3 = 1073741824(0x40000000, float:2.0)
                float r2 = r2 * r3
                app.zenly.locator.username.idcard.CardPickerFragment r3 = r0.f15126b
                int r4 = app.zenly.locator.C3891l.bokeh_view
                android.view.View r3 = r3.mo13757a(r4)
                app.zenly.locator.username.idcard.BokehView r3 = (app.zenly.locator.username.idcard.BokehView) r3
                java.lang.String r4 = "bokeh_view"
                kotlin.jvm.internal.C12932j.m33815a(r3, r4)
                r3.setAlpha(r2)
                app.zenly.locator.username.idcard.CardPickerFragment r3 = r0.f15126b
                int r4 = app.zenly.locator.C3891l.overlay_view
                android.view.View r3 = r3.mo13757a(r4)
                java.lang.String r4 = "overlay_view"
                kotlin.jvm.internal.C12932j.m33815a(r3, r4)
                r3.setAlpha(r2)
                app.zenly.locator.username.idcard.CardPickerFragment r3 = r0.f15126b
                int r4 = app.zenly.locator.C3891l.overlay_bokeh_view
                android.view.View r3 = r3.mo13757a(r4)
                app.zenly.locator.username.idcard.BokehView r3 = (app.zenly.locator.username.idcard.BokehView) r3
                java.lang.String r4 = "overlay_bokeh_view"
                kotlin.jvm.internal.C12932j.m33815a(r3, r4)
                r3.setAlpha(r2)
                app.zenly.locator.username.idcard.CardPickerFragment r2 = r0.f15126b
                int r3 = app.zenly.locator.C3891l.ambience_view
                android.view.View r2 = r2.mo13757a(r3)
                app.zenly.locator.username.idcard.AmbienceView r2 = (app.zenly.locator.username.idcard.AmbienceView) r2
                android.animation.TypeEvaluator r3 = app.zenly.locator.p143s.p146j.C5433c.m15444a()
                java.lang.Object r1 = r3.evaluate(r1, r13, r15)
                java.lang.String r3 = "TypeEvaluators.argbValue…urrentColors, nextColors)"
                kotlin.jvm.internal.C12932j.m33815a(r1, r3)
                int[] r1 = (int[]) r1
                r2.setColors(r1)
                return
            L_0x0167:
                kotlin.jvm.internal.C12932j.m33814a()
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.username.idcard.CardPickerFragment.C6008n.onPageScrolled(int, float, int):void");
        }

        public void onPageSelected(int i) {
            Callback b = this.f15126b.mo6614b();
            if (b != null) {
                b.onCardSelected(this.f15126b, i);
            }
            C6028a aVar = C6027e.f15164E;
            C5994a b2 = this.f15126b.f15081g;
            if (b2 != null) {
                C6027e a = aVar.mo13814a(b2.mo13760c()[i]);
                ((LottieAnimationView) this.f15126b.mo13757a(C3891l.lottie_card)).setAnimation(a.mo13806m());
                ((TextView) this.f15126b.mo13757a(C3891l.lottie_card_username)).setTextColor(a.mo13807n());
                CardPickerFragment.m16638a(this.f15126b, false, 1, (Object) null);
                return;
            }
            C12932j.m33814a();
            throw null;
        }
    }

    /* renamed from: app.zenly.locator.username.idcard.CardPickerFragment$o */
    static final class C6009o implements PageTransformer {

        /* renamed from: a */
        public static final C6009o f15127a = new C6009o();

        C6009o() {
        }

        public final void transformPage(View view, float f) {
            float f2;
            C12932j.m33818b(view, "page");
            float f3 = 0.9f;
            if (f >= ((float) -1)) {
                float f4 = (float) 1;
                if (f <= f4) {
                    float abs = Math.abs(f);
                    f3 = Math.max(0.9f, f4 - (abs / ((float) 2)));
                    f2 = f4 - abs;
                    CardLayout cardLayout = (CardLayout) view;
                    cardLayout.setScaleX(f3);
                    cardLayout.setScaleY(f3);
                    cardLayout.setTiltRatio(f2);
                }
            }
            f2 = 0.0f;
            CardLayout cardLayout2 = (CardLayout) view;
            cardLayout2.setScaleX(f3);
            cardLayout2.setScaleY(f3);
            cardLayout2.setTiltRatio(f2);
        }
    }

    /* renamed from: app.zenly.locator.username.idcard.CardPickerFragment$p */
    static final class C6010p implements Runnable {

        /* renamed from: e */
        final /* synthetic */ CardPickerFragment f15128e;

        /* renamed from: f */
        final /* synthetic */ Rect f15129f;

        C6010p(CardPickerFragment cardPickerFragment, Rect rect) {
            this.f15128e = cardPickerFragment;
            this.f15129f = rect;
        }

        public final void run() {
            FrameLayout frameLayout = (FrameLayout) this.f15128e.mo13757a(C3891l.overlay);
            C12932j.m33815a((Object) frameLayout, "overlay");
            frameLayout.setPadding(frameLayout.getPaddingLeft(), this.f15129f.top, frameLayout.getPaddingRight(), frameLayout.getPaddingBottom());
        }
    }

    /* renamed from: app.zenly.locator.username.idcard.CardPickerFragment$q */
    static final class C6011q<T, R> implements Function<T, R> {

        /* renamed from: e */
        final /* synthetic */ CardPickerFragment f15130e;

        C6011q(CardPickerFragment cardPickerFragment) {
            this.f15130e = cardPickerFragment;
        }

        /* renamed from: a */
        public final File apply(Boolean bool) {
            C12932j.m33818b(bool, "it");
            this.f15130e.m16667k();
            return C3231q.m10241a(C3232a.VIDEOS, null, 2, null);
        }
    }

    /* renamed from: app.zenly.locator.username.idcard.CardPickerFragment$r */
    static final class C6012r<T, R> implements Function<T, ObservableSource<? extends R>> {

        /* renamed from: e */
        final /* synthetic */ CardPickerFragment f15131e;

        /* renamed from: f */
        final /* synthetic */ C5996c f15132f;

        /* renamed from: app.zenly.locator.username.idcard.CardPickerFragment$r$a */
        static final class C6013a<T> implements ObservableOnSubscribe<T> {

            /* renamed from: a */
            final /* synthetic */ C6012r f15133a;

            /* renamed from: b */
            final /* synthetic */ File f15134b;

            /* renamed from: app.zenly.locator.username.idcard.CardPickerFragment$r$a$a */
            public static final class C6014a implements UsernamePreviewRenderListener {

                /* renamed from: a */
                final /* synthetic */ C6013a f15135a;

                /* renamed from: b */
                final /* synthetic */ ObservableEmitter f15136b;

                C6014a(C6013a aVar, ObservableEmitter observableEmitter) {
                    this.f15135a = aVar;
                    this.f15136b = observableEmitter;
                }

                public void onCancel() {
                    this.f15136b.onComplete();
                }

                public void onError() {
                    this.f15136b.onError(new Exception());
                }

                public void onProgress(float f) {
                    this.f15135a.f15133a.f15131e.m16625a(f);
                }

                public void onSuccess(File file) {
                    C12932j.m33818b(file, "output");
                    this.f15136b.onNext(file);
                    this.f15136b.onComplete();
                }
            }

            C6013a(C6012r rVar, File file) {
                this.f15133a = rVar;
                this.f15134b = file;
            }

            public final void subscribe(ObservableEmitter<File> observableEmitter) {
                C12932j.m33818b(observableEmitter, "emitter");
                C6014a aVar = new C6014a(this, observableEmitter);
                C6012r rVar = this.f15133a;
                CardPickerFragment cardPickerFragment = rVar.f15131e;
                C1815k c = rVar.f15132f.mo13767c();
                File file = this.f15134b;
                C12932j.m33815a((Object) file, "file");
                cardPickerFragment.m16626a(aVar, c, file);
            }
        }

        C6012r(CardPickerFragment cardPickerFragment, C5996c cVar) {
            this.f15131e = cardPickerFragment;
            this.f15132f = cVar;
        }

        /* renamed from: a */
        public final C12279e<File> apply(File file) {
            C12932j.m33818b(file, "file");
            return C12279e.m32602a((ObservableOnSubscribe<T>) new C6013a<T>(this, file));
        }
    }

    /* renamed from: app.zenly.locator.username.idcard.CardPickerFragment$s */
    static final class C6015s implements Action {

        /* renamed from: a */
        final /* synthetic */ CardPickerFragment f15137a;

        C6015s(CardPickerFragment cardPickerFragment) {
            this.f15137a = cardPickerFragment;
        }

        public final void run() {
            CardPickerFragment.m16636a(this.f15137a, (Function0) null, 1, (Object) null);
        }
    }

    /* renamed from: app.zenly.locator.username.idcard.CardPickerFragment$t */
    static final class C6016t<T> implements Consumer<File> {

        /* renamed from: e */
        final /* synthetic */ CardPickerFragment f15138e;

        /* renamed from: f */
        final /* synthetic */ C5996c f15139f;

        C6016t(CardPickerFragment cardPickerFragment, C5996c cVar) {
            this.f15138e = cardPickerFragment;
            this.f15139f = cVar;
        }

        /* renamed from: a */
        public final void accept(File file) {
            if (this.f15138e.m16665j()) {
                C5994a b = this.f15138e.f15081g;
                if (b != null) {
                    Integer d = b.mo13761d();
                    if (d != null) {
                        C5343a.m15160U().mo12810a(d.intValue(), C1809h.SAVE.mo7468a());
                    }
                }
            }
            C5343a.m15160U().mo12898k(this.f15139f.mo13765a());
            if (file != null) {
                Toast.makeText(this.f15138e.getContext(), R.string.username_saveVideo_itWorked, 0).show();
                MediaScannerConnection.scanFile(this.f15138e.getContext(), new String[]{file.toString()}, null, null);
                return;
            }
            Toast.makeText(this.f15138e.getContext(), R.string.commons_content_oopserror, 0).show();
        }
    }

    /* renamed from: app.zenly.locator.username.idcard.CardPickerFragment$u */
    static final class C6017u<T> implements Consumer<Throwable> {

        /* renamed from: e */
        public static final C6017u f15140e = new C6017u();

        C6017u() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C12143a.m32032b(th, "Failed generating video", new Object[0]);
        }
    }

    /* renamed from: app.zenly.locator.username.idcard.CardPickerFragment$v */
    static final class C6018v<T> implements MaybeOnSubscribe<T> {

        /* renamed from: a */
        final /* synthetic */ CardPickerFragment f15141a;

        /* renamed from: b */
        final /* synthetic */ C1809h f15142b;

        C6018v(CardPickerFragment cardPickerFragment, C1809h hVar) {
            this.f15141a = cardPickerFragment;
            this.f15142b = hVar;
        }

        public final void subscribe(MaybeEmitter<C1808g> maybeEmitter) {
            C12932j.m33818b(maybeEmitter, "emitter");
            CardPickerFragment cardPickerFragment = this.f15141a;
            List c = this.f15142b.mo7472c();
            C1809h hVar = this.f15142b;
            C1808g gVar = new C1808g(C5970b.m16567b(this.f15141a.m16659g()), null, null, null, 14, null);
            cardPickerFragment.m16641a(c, hVar, gVar, maybeEmitter);
        }
    }

    static {
        C12935m mVar = new C12935m(C12946x.m33834a(CardPickerFragment.class), "name", "getName()Ljava/lang/String;");
        C12946x.m33837a((C12934l) mVar);
        C12935m mVar2 = new C12935m(C12946x.m33834a(CardPickerFragment.class), "styles", "getStyles()[I");
        C12946x.m33837a((C12934l) mVar2);
        C12935m mVar3 = new C12935m(C12946x.m33834a(CardPickerFragment.class), "selectedStyle", "getSelectedStyle()I");
        C12946x.m33837a((C12934l) mVar3);
        C12935m mVar4 = new C12935m(C12946x.m33834a(CardPickerFragment.class), "isMe", "isMe()Z");
        C12946x.m33837a((C12934l) mVar4);
        C12941s sVar = new C12941s(C12946x.m33834a(CardPickerFragment.class), "interactiveViews", "getInteractiveViews()[Landroid/view/View;");
        C12946x.m33839a((C12940r) sVar);
        C12941s sVar2 = new C12941s(C12946x.m33834a(CardPickerFragment.class), "lottieAnimatorSet", "getLottieAnimatorSet()Landroid/animation/AnimatorSet;");
        C12946x.m33839a((C12940r) sVar2);
        f15078y = new KProperty[]{mVar, mVar2, mVar3, mVar4, sVar, sVar2};
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m16640a(String str) {
        this.f15083i.setValue(this, f15078y[0], str);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m16643a(boolean z) {
        this.f15087m.setValue(this, f15078y[3], Boolean.valueOf(z));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m16644a(int[] iArr) {
        this.f15085k.setValue(this, f15078y[1], iArr);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final void m16652c(int i) {
        this.f15086l.setValue(this, f15078y[2], Integer.valueOf(i));
    }

    /* renamed from: d */
    public static final /* synthetic */ CardSharingFragment m16653d(CardPickerFragment cardPickerFragment) {
        CardSharingFragment cardSharingFragment = cardPickerFragment.f15082h;
        if (cardSharingFragment != null) {
            return cardSharingFragment;
        }
        C12932j.m33820c("cardSharing");
        throw null;
    }

    /* renamed from: e */
    public static final /* synthetic */ String m16655e(CardPickerFragment cardPickerFragment) {
        String str = cardPickerFragment.f15084j;
        if (str != null) {
            return str;
        }
        C12932j.m33820c("displayUrl");
        throw null;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final View[] m16656e() {
        Lazy lazy = this.f15092r;
        KProperty kProperty = f15078y[4];
        return (View[]) lazy.getValue();
    }

    /* renamed from: f */
    private final AnimatorSet m16657f() {
        Lazy lazy = this.f15093s;
        KProperty kProperty = f15078y[5];
        return (AnimatorSet) lazy.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public final String m16659g() {
        return (String) this.f15083i.getValue(this, f15078y[0]);
    }

    /* renamed from: h */
    private final int m16661h() {
        return ((Number) this.f15086l.getValue(this, f15078y[2])).intValue();
    }

    /* renamed from: i */
    private final int[] m16664i() {
        return (int[]) this.f15085k.getValue(this, f15078y[1]);
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public final boolean m16665j() {
        return ((Boolean) this.f15087m.getValue(this, f15078y[3])).booleanValue();
    }

    /* renamed from: l */
    private final void m16669l() {
        if (m16665j()) {
            C5994a aVar = this.f15081g;
            if (aVar != null) {
                Integer d = aVar.mo13761d();
                if (d != null) {
                    int intValue = d.intValue();
                    C6023d dVar = this.f15080f;
                    if (dVar != null) {
                        dVar.mo13791a(intValue);
                    } else {
                        C12932j.m33820c("model");
                        throw null;
                    }
                }
            }
        }
    }

    /* renamed from: m */
    private final void m16670m() {
        TextView textView = (TextView) mo13757a(C3891l.lottie_card_username);
        C12932j.m33815a((Object) textView, "lottie_card_username");
        textView.setText(m16659g());
        LottieAnimationView lottieAnimationView = (LottieAnimationView) mo13757a(C3891l.lottie_card);
        C12932j.m33815a((Object) lottieAnimationView, "lottie_card");
        lottieAnimationView.setRepeatCount(-1);
        ((LottieAnimationView) mo13757a(C3891l.lottie_card)).mo22807d();
        m16657f().start();
        ViewPropertyAnimator animate = ((FrameLayout) mo13757a(C3891l.lottie_card_content)).animate();
        animate.scaleX(2.0f);
        animate.scaleY(2.0f);
        animate.setInterpolator(C7657c.m18650f());
        animate.setDuration(300);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0072, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        kotlin.p409io.C12901b.m33759a(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0076, code lost:
        throw r2;
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.io.File m16671n() {
        /*
            r8 = this;
            androidx.fragment.app.FragmentActivity r0 = r8.requireActivity()
            java.lang.String r1 = "requireActivity()"
            kotlin.jvm.internal.C12932j.m33815a(r0, r1)
            app.zenly.locator.core.util.q$a r1 = app.zenly.locator.core.util.C3231q.C3232a.PICTURES
            java.lang.String r2 = "png"
            java.io.File r0 = app.zenly.locator.core.util.C3231q.m10245c(r0, r1, r2)
            r1 = 0
            if (r0 == 0) goto L_0x0084
            app.zenly.locator.username.idcard.CardPickerFragment$a r2 = r8.f15081g
            if (r2 == 0) goto L_0x0084
            app.zenly.locator.username.idcard.CardFragment r2 = r2.mo13762e()
            if (r2 == 0) goto L_0x0084
            app.zenly.locator.username.idcard.CardPickerFragment$a r3 = r8.f15081g
            if (r3 == 0) goto L_0x0084
            java.lang.Integer r3 = r3.mo13761d()
            if (r3 == 0) goto L_0x0084
            int r3 = r3.intValue()
            app.zenly.locator.username.idcard.e$a r4 = app.zenly.locator.username.idcard.C6027e.f15164E
            app.zenly.locator.username.idcard.e r3 = r4.mo13814a(r3)
            android.graphics.drawable.GradientDrawable r4 = new android.graphics.drawable.GradientDrawable
            r4.<init>()
            r5 = 0
            r4.setShape(r5)
            android.graphics.drawable.GradientDrawable$Orientation r6 = android.graphics.drawable.GradientDrawable.Orientation.TL_BR
            r4.setOrientation(r6)
            r6 = 2
            int[] r6 = new int[r6]
            int[] r7 = r3.mo13794a()
            r7 = r7[r5]
            r6[r5] = r7
            int[] r3 = r3.mo13794a()
            r7 = 1
            r3 = r3[r7]
            r6[r7] = r3
            r4.setColors(r6)
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ Exception -> 0x007b }
            android.graphics.Bitmap r2 = r2.mo13742a(r3, r4)     // Catch:{ Exception -> 0x007b }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x007b }
            r3.<init>(r0)     // Catch:{ Exception -> 0x007b }
            if (r2 == 0) goto L_0x0077
            android.graphics.Bitmap$CompressFormat r4 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ all -> 0x0070 }
            r6 = 80
            boolean r2 = r2.compress(r4, r6, r3)     // Catch:{ all -> 0x0070 }
            java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x0070 }
            goto L_0x0077
        L_0x0070:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0072 }
        L_0x0072:
            r2 = move-exception
            kotlin.p409io.C12901b.m33759a(r3, r1)     // Catch:{ Exception -> 0x007b }
            throw r2     // Catch:{ Exception -> 0x007b }
        L_0x0077:
            kotlin.p409io.C12901b.m33759a(r3, r1)     // Catch:{ Exception -> 0x007b }
            goto L_0x0083
        L_0x007b:
            r1 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r5]
            java.lang.String r3 = "Unable to render the card"
            p387h.p388a.C12143a.m32032b(r1, r3, r2)
        L_0x0083:
            return r0
        L_0x0084:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.username.idcard.CardPickerFragment.m16671n():java.io.File");
    }

    /* renamed from: a */
    public View mo13757a(int i) {
        if (this.f15098x == null) {
            this.f15098x = new HashMap();
        }
        View view = (View) this.f15098x.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f15098x.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: a */
    public void mo6508a() {
        HashMap hashMap = this.f15098x;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 400 && intent != null && i2 == -1) {
            String stringExtra = intent.getStringExtra("app.zenly.locator.extra.name");
            C12932j.m33815a((Object) stringExtra, "data.getStringExtra(EXTRA_NAME)");
            m16640a(stringExtra);
            this.f15084j = C5970b.m16566a(m16659g());
            FragmentManager childFragmentManager = getChildFragmentManager();
            C12932j.m33815a((Object) childFragmentManager, "childFragmentManager");
            for (Fragment fragment : childFragmentManager.mo4122q()) {
                if (fragment instanceof CardFragment) {
                    CardFragment cardFragment = (CardFragment) fragment;
                    String g = m16659g();
                    String str = this.f15084j;
                    if (str != null) {
                        cardFragment.mo13745a(g, str);
                    } else {
                        C12932j.m33820c("displayUrl");
                        throw null;
                    }
                }
            }
        }
    }

    public void onAttachFragment(Fragment fragment) {
        C12932j.m33818b(fragment, "childFragment");
        super.onAttachFragment(fragment);
        if (fragment instanceof CardSharingFragment) {
            this.f15082h = (CardSharingFragment) fragment;
            CardSharingFragment cardSharingFragment = this.f15082h;
            String str = "cardSharing";
            if (cardSharingFragment != null) {
                cardSharingFragment.mo7347a((Function1<? super C1809h, ? extends C12273d<C1808g>>) new C6003i<Object,Object>(this));
                CardSharingFragment cardSharingFragment2 = this.f15082h;
                if (cardSharingFragment2 != null) {
                    cardSharingFragment2.mo7346a((app.zenly.locator.cards.CardSharingFragment.Callback) new C6004j(this));
                } else {
                    C12932j.m33820c(str);
                    throw null;
                }
            } else {
                C12932j.m33820c(str);
                throw null;
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            String str = "INSTANCE_NAME";
            if (bundle.containsKey(str)) {
                String string = bundle.getString(str);
                if (string != null) {
                    m16640a(string);
                } else {
                    C12932j.m33814a();
                    throw null;
                }
            }
        }
        C0889u a = C0890v.m4097a((Fragment) this).mo4415a(C6023d.class);
        C12932j.m33815a((Object) a, "ViewModelProviders.of(th…kerViewModel::class.java)");
        this.f15080f = (C6023d) a;
        this.f15084j = C5970b.m16566a(m16659g());
        Context requireContext = requireContext();
        C12932j.m33815a((Object) requireContext, "requireContext()");
        this.f15089o = new C5476b(requireContext, new C6006l(this));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C12932j.m33818b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_card_picker, viewGroup, false);
    }

    public void onDestroyView() {
        this.f15088n.remove((CardLayout) mo13757a(C3891l.lottie_card_layout));
        super.onDestroyView();
        mo6508a();
    }

    public void onSaveInstanceState(Bundle bundle) {
        C12932j.m33818b(bundle, "outState");
        super.onSaveInstanceState(bundle);
        bundle.putString("INSTANCE_NAME", m16659g());
    }

    public void onViewCreated(View view, Bundle bundle) {
        C12932j.m33818b(view, "view");
        super.onViewCreated(view, bundle);
        FragmentManager childFragmentManager = getChildFragmentManager();
        C12932j.m33815a((Object) childFragmentManager, "childFragmentManager");
        this.f15081g = new C5994a(this, childFragmentManager, m16664i());
        ViewPager viewPager = (ViewPager) mo13757a(C3891l.view_pager);
        String str = "view_pager";
        C12932j.m33815a((Object) viewPager, str);
        viewPager.setAdapter(this.f15081g);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.spacing_200);
        ((ViewPager) mo13757a(C3891l.view_pager)).setPaddingRelative(dimensionPixelSize, 0, dimensionPixelSize, 0);
        ViewPager viewPager2 = (ViewPager) mo13757a(C3891l.view_pager);
        C12932j.m33815a((Object) viewPager2, str);
        viewPager2.setPageMargin((-dimensionPixelSize) * 2);
        ((ViewPager) mo13757a(C3891l.view_pager)).mo6331a((OnPageChangeListener) this.f15095u);
        ((ViewPager) mo13757a(C3891l.view_pager)).mo6332a(true, C6009o.f15127a);
        ((AppCompatImageButton) mo13757a(C3891l.btn_close)).setOnClickListener(this.f15097w);
        ((AppCompatImageButton) mo13757a(C3891l.btn_save)).setOnClickListener(this.f15097w);
        if (m16665j()) {
            ((AppCompatImageButton) mo13757a(C3891l.btn_edit)).setOnClickListener(this.f15097w);
        } else {
            AppCompatImageButton appCompatImageButton = (AppCompatImageButton) mo13757a(C3891l.btn_edit);
            C12932j.m33815a((Object) appCompatImageButton, "btn_edit");
            appCompatImageButton.setVisibility(8);
        }
        int a = C12840k.m33567a(m16664i(), m16661h());
        if (a > 0) {
            ((ViewPager) mo13757a(C3891l.view_pager)).mo6328a(a, false);
        }
        this.f15088n.add((CardLayout) mo13757a(C3891l.lottie_card_layout));
    }

    public void onWindowInsetsChanged(View view, Rect rect) {
        ViewGroup[] viewGroupArr;
        C12932j.m33818b(view, "view");
        C12932j.m33818b(rect, "insets");
        super.onWindowInsetsChanged(view, rect);
        for (ViewGroup viewGroup : new ViewGroup[]{(ConstraintLayout) mo13757a(C3891l.actions), (ViewPager) mo13757a(C3891l.view_pager), (ConstraintLayout) mo13757a(C3891l.loading_layout)}) {
            C12932j.m33815a((Object) viewGroup, "it");
            viewGroup.setPadding(viewGroup.getPaddingLeft(), rect.top, viewGroup.getPaddingRight(), viewGroup.getPaddingBottom());
        }
        ((FrameLayout) mo13757a(C3891l.overlay)).post(new C6010p(this, rect));
        view.setPadding(rect.left, view.getPaddingTop(), rect.right, rect.bottom);
    }

    /* access modifiers changed from: private */
    @SuppressLint({"CheckResult"})
    /* renamed from: d */
    public final void m16654d() {
        C5996c[] values = C5996c.values();
        ArrayList arrayList = new ArrayList(values.length);
        for (C5996c b : values) {
            arrayList.add(requireContext().getString(b.mo13766b()));
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            new Builder(getActivity()).setTitle(R.string.username_saveVideo_options_title).setItems((String[]) array, new C5998e(this)).create().show();
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public final void m16667k() {
        ProgressBar progressBar = (ProgressBar) mo13757a(C3891l.progress);
        C12932j.m33815a((Object) progressBar, "progress");
        progressBar.setProgress(0);
        C7697b.m18740c((ConstraintLayout) mo13757a(C3891l.loading_layout), 0, null, 3, null);
        for (View d : m16656e()) {
            C7697b.m18743d(d, 0, null, 3, null);
        }
        m16650b(false);
        m16670m();
    }

    /* renamed from: c */
    public final boolean mo13759c() {
        C5980g gVar = this.f15091q;
        if (gVar == null || !gVar.mo13718b()) {
            m16669l();
            return false;
        }
        C5343a.m15160U().mo12801P();
        gVar.mo13717a();
        return true;
    }

    /* renamed from: b */
    public final Callback mo6614b() {
        return this.f15094t;
    }

    /* JADX WARNING: type inference failed for: r5v1 */
    /* JADX WARNING: type inference failed for: r1v3, types: [app.zenly.locator.username.idcard.c] */
    /* JADX WARNING: type inference failed for: r5v3 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m16649b(kotlin.jvm.functions.Function0<kotlin.C12956q> r5) {
        /*
            r4 = this;
            android.animation.AnimatorSet r0 = r4.m16657f()
            r0.cancel()
            int r0 = app.zenly.locator.C3891l.lottie_card_username
            android.view.View r0 = r4.mo13757a(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r1 = 0
            android.view.ViewPropertyAnimator r0 = r0.rotation(r1)
            r1 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r0 = r0.scaleX(r1)
            android.view.ViewPropertyAnimator r0 = r0.scaleY(r1)
            android.animation.TimeInterpolator r2 = p250f.p251a.p252a.p253a.p254d.C7657c.m18650f()
            android.view.ViewPropertyAnimator r0 = r0.setInterpolator(r2)
            r2 = 300(0x12c, double:1.48E-321)
            android.view.ViewPropertyAnimator r0 = r0.setDuration(r2)
            r0.start()
            int r0 = app.zenly.locator.C3891l.lottie_card_content
            android.view.View r0 = r4.mo13757a(r0)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            android.view.ViewPropertyAnimator r0 = r0.animate()
            android.view.ViewPropertyAnimator r0 = r0.scaleX(r1)
            android.view.ViewPropertyAnimator r0 = r0.scaleY(r1)
            android.animation.TimeInterpolator r1 = p250f.p251a.p252a.p253a.p254d.C7657c.m18650f()
            android.view.ViewPropertyAnimator r0 = r0.setInterpolator(r1)
            android.view.ViewPropertyAnimator r0 = r0.setDuration(r2)
            if (r5 == 0) goto L_0x005b
            app.zenly.locator.username.idcard.c r1 = new app.zenly.locator.username.idcard.c
            r1.<init>(r5)
            r5 = r1
        L_0x005b:
            java.lang.Runnable r5 = (java.lang.Runnable) r5
            r0.withEndAction(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.username.idcard.CardPickerFragment.m16649b(kotlin.jvm.functions.Function0):void");
    }

    /* renamed from: a */
    public final void mo13758a(Callback callback) {
        this.f15094t = callback;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final C12273d<C1808g> m16623a(C1809h hVar) {
        C12273d<C1808g> b = C12273d.m32558a((MaybeOnSubscribe<T>) new C6018v<T>(this, hVar)).mo36392b(C12295a.m32802a());
        C12932j.m33815a((Object) b, "Maybe.create<SharingInfo…dSchedulers.mainThread())");
        return b;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m16641a(List<? extends C1802e> list, C1809h hVar, C1808g gVar, MaybeEmitter<C1808g> maybeEmitter) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            if (list.isEmpty()) {
                maybeEmitter.onSuccess(gVar);
                return;
            }
            C1802e eVar = (C1802e) list.get(0);
            if (eVar instanceof C1815k) {
                C5999f fVar = new C5999f(activity, this, list, maybeEmitter, gVar, hVar);
                C5979f fVar2 = C5979f.f15037a;
                Context requireContext = requireContext();
                String str = "requireContext()";
                C12932j.m33815a((Object) requireContext, str);
                C5994a aVar = this.f15081g;
                Integer d = aVar != null ? aVar.mo13761d() : null;
                if (d != null) {
                    String a = fVar2.mo13714a(requireContext, d.intValue());
                    C1815k kVar = (C1815k) eVar;
                    String a2 = C5979f.f15037a.mo13715a(m16659g(), kVar);
                    Context requireContext2 = requireContext();
                    C12932j.m33815a((Object) requireContext2, str);
                    File a3 = C3231q.m10238a(requireContext2, C3232a.VIDEOS, a, a2, null, 16, null);
                    if (a3 != null) {
                        fVar.onSuccess(a3);
                        return;
                    }
                    Context requireContext3 = requireContext();
                    C12932j.m33815a((Object) requireContext3, str);
                    File b = C3231q.m10243b(requireContext3, C3232a.VIDEOS, a, a2, null, 16, null);
                    if (b == null) {
                        fVar.onError();
                        return;
                    }
                    C3231q qVar = C3231q.f9010a;
                    Context requireContext4 = requireContext();
                    C12932j.m33815a((Object) requireContext4, str);
                    qVar.mo9650a(requireContext4, C3232a.VIDEOS, a);
                    m16667k();
                    m16626a(fVar, kVar, b);
                } else {
                    C12932j.m33814a();
                    throw null;
                }
            } else if (eVar instanceof C1803f) {
                File n = m16671n();
                if (n != null) {
                    C12932j.m33815a((Object) activity, "activity");
                    Uri a4 = FileProvider.m2525a(activity, C2456a.m8571a(activity), n);
                    C12932j.m33815a((Object) a4, "FileProvider.getUriForFi…uthority, screenshotFile)");
                    gVar.mo7460a(new C1801d(a4, n));
                }
                m16641a(C12857w.m33669b((Iterable) list, 1), hVar, gVar, maybeEmitter);
            } else if (eVar instanceof C1814j) {
                String str2 = this.f15084j;
                if (str2 != null) {
                    gVar.mo7461a(str2);
                    m16641a(C12857w.m33669b((Iterable) list, 1), hVar, gVar, maybeEmitter);
                } else {
                    C12932j.m33820c("displayUrl");
                    throw null;
                }
            }
        }
    }

    /* renamed from: b */
    private final void m16650b(boolean z) {
        FrameLayout frameLayout = (FrameLayout) mo13757a(C3891l.overlay);
        C12932j.m33815a((Object) frameLayout, "it");
        if (frameLayout.getChildCount() != 0) {
            View childAt = frameLayout.getChildAt(0);
            if (!(childAt instanceof Animatable)) {
                return;
            }
            if (z) {
                ((Animatable) childAt).startAnimate();
            } else {
                ((Animatable) childAt).stopAnimate();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m16646b(int i) {
        UserProto$User userMeCache = C5448c.m15478a().userMeCache();
        if (userMeCache != null) {
            C5951a aVar = UsernameInputActivity.f14982p;
            Context requireContext = requireContext();
            C12932j.m33815a((Object) requireContext, "requireContext()");
            String uuid = userMeCache.getUuid();
            C12932j.m33815a((Object) uuid, "user.uuid");
            String username = userMeCache.getUsername();
            C12932j.m33815a((Object) username, "user.username");
            startActivityForResult(aVar.mo13671a(requireContext, uuid, username, m16664i()[i]), 400);
            requireActivity().overridePendingTransition(R.anim.fade_in, R.anim.stay_still);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m16625a(float f) {
        if (getView() != null) {
            float interpolation = C7657c.m18643b().getInterpolation(f);
            ProgressBar progressBar = (ProgressBar) mo13757a(C3891l.progress);
            C12932j.m33815a((Object) progressBar, "progress");
            progressBar.setProgress(C13045c.m34054a(((float) 100) * interpolation));
            LottieAnimationView lottieAnimationView = (LottieAnimationView) mo13757a(C3891l.lottie_card);
            C12932j.m33815a((Object) lottieAnimationView, "lottie_card");
            lottieAnimationView.setSpeed(interpolation + 0.75f);
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m16636a(CardPickerFragment cardPickerFragment, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            function0 = null;
        }
        cardPickerFragment.m16642a(function0);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m16642a(Function0<C12956q> function0) {
        if (getView() != null) {
            m16649b((Function0<C12956q>) new C6007m<C12956q>(this, function0));
        }
    }

    /* access modifiers changed from: private */
    @SuppressLint({"CheckResult"})
    /* renamed from: a */
    public final void m16627a(C5996c cVar) {
        new C12125b(requireActivity()).mo35910c("android.permission.WRITE_EXTERNAL_STORAGE").mo36428a(C12295a.m32802a()).mo36501i(new C6011q(this)).mo36428a(C12802a.m33491b()).mo36490e((Function<? super T, ? extends ObservableSource<? extends R>>) new C6012r<Object,Object>(this, cVar)).mo36428a(C12295a.m32802a()).mo36483d((Action) new C6015s(this)).mo36412a((Consumer<? super T>) new C6016t<Object>(this, cVar), (Consumer<? super Throwable>) C6017u.f15140e);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m16626a(UsernamePreviewRenderListener usernamePreviewRenderListener, C1815k kVar, File file) {
        C5980g gVar = this.f15091q;
        if (gVar != null) {
            gVar.mo13717a();
        }
        C5994a aVar = this.f15081g;
        Integer d = aVar != null ? aVar.mo13761d() : null;
        if (d != null) {
            C5980g gVar2 = new C5980g(usernamePreviewRenderListener, d.intValue(), kVar);
            Context requireContext = requireContext();
            C12932j.m33815a((Object) requireContext, "requireContext()");
            String g = m16659g();
            String str = this.f15084j;
            if (str != null) {
                gVar2.render(requireContext, g, str, file);
                this.f15091q = gVar2;
                return;
            }
            C12932j.m33820c("displayUrl");
            throw null;
        }
        C12932j.m33814a();
        throw null;
    }

    /* renamed from: a */
    static /* synthetic */ void m16638a(CardPickerFragment cardPickerFragment, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = cardPickerFragment.f15090p;
        }
        cardPickerFragment.m16650b(z);
    }
}
