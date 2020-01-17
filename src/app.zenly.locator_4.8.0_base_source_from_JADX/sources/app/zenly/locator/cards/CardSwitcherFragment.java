package app.zenly.locator.cards;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.Space;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.C0122a.C0123a;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.FileProvider;
import androidx.fragment.app.C0815l;
import androidx.fragment.app.C0819o;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager.OnPageChangeListener;
import androidx.viewpager.widget.ViewPager.PageTransformer;
import app.zenly.android.feature.base.app.C1321b;
import app.zenly.android.feature.descendants.C1382g;
import app.zenly.android.feature.descendants.DescendantsModule;
import app.zenly.android.feature.descendants.feedback.DescendantsPrefs.C1379a;
import app.zenly.locator.C3891l;
import app.zenly.locator.R;
import app.zenly.locator.cards.CardSharingFragment.Callback;
import app.zenly.locator.cards.framework.CardFragment;
import app.zenly.locator.cards.framework.CardFragment.CardHandler;
import app.zenly.locator.cards.framework.CardFragment.ModelListener;
import app.zenly.locator.cards.framework.CardFragmentFactory;
import app.zenly.locator.cards.framework.Tiltable;
import app.zenly.locator.cards.framework.widget.AmbienceView;
import app.zenly.locator.cards.models.AppIconsCard;
import app.zenly.locator.cards.models.BestFriendV2Card;
import app.zenly.locator.cards.models.BestFriendV2Card.C1863c;
import app.zenly.locator.cards.models.Card;
import app.zenly.locator.cards.models.DescendantsCard;
import app.zenly.locator.cards.models.TopPopsCard;
import app.zenly.locator.cards.models.WorldRankingCard;
import app.zenly.locator.cards.p046m.C1847a;
import app.zenly.locator.core.analytics.tracker.AnalyticsTracker;
import app.zenly.locator.core.config.C2455a.C2456a;
import app.zenly.locator.core.invitations.C2542d0;
import app.zenly.locator.core.invitations.C2542d0.C2543a;
import app.zenly.locator.core.widget.ViewPager;
import app.zenly.locator.core.widget.ViewPager.C3262b;
import app.zenly.locator.descendants.DescendantsListActivity;
import app.zenly.locator.descendants.DescendantsListActivity.C3503a;
import app.zenly.locator.experimental.referrer.ReferrerDetails.C3744d;
import app.zenly.locator.p143s.C5343a;
import app.zenly.locator.p143s.C5343a.C5355l;
import app.zenly.locator.p143s.p146j.C5433c;
import app.zenly.locator.p143s.p148l.C5448c;
import app.zenly.locator.p143s.p153p.C5471a;
import app.zenly.locator.p143s.p153p.C5476b;
import app.zenly.locator.p143s.p155r.C5498a;
import app.zenly.locator.p143s.p155r.C5498a.C5499a;
import app.zenly.locator.p143s.p155r.C5498a.C5500b;
import app.zenly.locator.p143s.p155r.C5498a.C5501c;
import app.zenly.locator.username.idcard.BokehView;
import app.zenly.locator.userprofile.p198me.appicons.C6042a;
import app.zenly.locator.userprofile.p198me.appicons.C6050d;
import app.zenly.locator.userprofile.p198me.appicons.C6052e;
import app.zenly.locator.userprofile.p198me.appicons.C6055g;
import app.zenly.locator.userprofile.p198me.appicons.C6056h;
import app.zenly.locator.userprofile.p198me.p199g.C6081a;
import java.io.File;
import java.io.InvalidObjectException;
import java.util.ArrayList;
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
import kotlin.jvm.internal.C12940r;
import kotlin.jvm.internal.C12941s;
import kotlin.jvm.internal.C12946x;
import kotlin.reflect.KProperty;
import p333g.p382g.p383a.C12125b;
import p389io.reactivex.C12273d;
import p389io.reactivex.C12279e;
import p389io.reactivex.MaybeEmitter;
import p389io.reactivex.MaybeOnSubscribe;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.functions.Function;
import p389io.reactivex.functions.Predicate;
import p389io.reactivex.p390h.p392c.C12295a;

public final class CardSwitcherFragment extends C1321b {

    /* renamed from: u */
    static final /* synthetic */ KProperty[] f5877u;

    /* renamed from: v */
    public static final C1772b f5878v = new C1772b(null);

    /* renamed from: f */
    private List<Card> f5879f = new ArrayList();

    /* renamed from: g */
    private int f5880g;

    /* renamed from: h */
    private CardFragmentFactory f5881h = new C1773c(this);
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C1769a f5882i;

    /* renamed from: j */
    private ViewPager f5883j;

    /* renamed from: k */
    private CardSharingFragment f5884k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final ArrayList<Tiltable> f5885l = new ArrayList<>();
    /* access modifiers changed from: private */

    /* renamed from: m */
    public C5471a f5886m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public int f5887n;

    /* renamed from: o */
    private final Lazy f5888o = C12896f.m33751a(new C1774d(this));

    /* renamed from: p */
    private C6052e f5889p;

    /* renamed from: q */
    private final CardSwitcherFragment$appIconsInstalledBroadcastReceiver$1 f5890q = new CardSwitcherFragment$appIconsInstalledBroadcastReceiver$1(this);

    /* renamed from: r */
    private C1847a f5891r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public final C1780j f5892s = new C1780j(this);

    /* renamed from: t */
    private HashMap f5893t;

    /* renamed from: app.zenly.locator.cards.CardSwitcherFragment$a */
    private final class C1769a extends C0815l {

        /* renamed from: g */
        private final SparseArray<String> f5894g = new SparseArray<>();

        /* renamed from: h */
        private final HashMap<String, Integer> f5895h = new HashMap<>();
        /* access modifiers changed from: private */

        /* renamed from: i */
        public boolean f5896i;

        /* renamed from: j */
        private final FragmentManager f5897j;

        /* renamed from: k */
        final /* synthetic */ CardSwitcherFragment f5898k;

        /* renamed from: app.zenly.locator.cards.CardSwitcherFragment$a$a */
        public static final class C1770a implements ModelListener {

            /* renamed from: a */
            final /* synthetic */ C1769a f5899a;

            /* renamed from: b */
            final /* synthetic */ int f5900b;

            C1770a(C1769a aVar, int i) {
                this.f5899a = aVar;
                this.f5900b = i;
            }

            public void onModelChanged(Card card) {
                C12932j.m33818b(card, "card");
                this.f5899a.f5898k.mo7365c().set(this.f5900b, card);
                this.f5899a.f5898k.f5892s.mo7380a();
            }
        }

        /* renamed from: app.zenly.locator.cards.CardSwitcherFragment$a$b */
        public static final class C1771b implements CardHandler {

            /* renamed from: a */
            final /* synthetic */ CardFragment f5901a;

            /* renamed from: b */
            final /* synthetic */ C1769a f5902b;

            C1771b(CardFragment cardFragment, C1769a aVar, int i) {
                this.f5901a = cardFragment;
                this.f5902b = aVar;
            }

            public void onCardCreated(Tiltable tiltable) {
                C12932j.m33818b(tiltable, "tiltable");
                if (!this.f5902b.f5898k.f5885l.contains(tiltable)) {
                    this.f5902b.f5898k.f5885l.add(tiltable);
                }
                C5471a f = this.f5902b.f5898k.f5886m;
                if (f != null) {
                    f.mo13098e();
                }
            }

            public void onCardDestroyed(Tiltable tiltable) {
                C12932j.m33818b(tiltable, "tiltable");
                this.f5902b.f5898k.f5885l.remove(tiltable);
                if (this.f5902b.f5898k.f5885l.isEmpty()) {
                    C5471a f = this.f5902b.f5898k.f5886m;
                    if (f != null) {
                        f.mo13099f();
                    }
                }
            }

            public void onCardTappedOutside() {
                FragmentActivity activity = this.f5901a.getActivity();
                if (activity != null) {
                    activity.finish();
                }
            }

            public void onMeasured(int i) {
                if (this.f5901a.mo7418d()) {
                    int d = (this.f5902b.f5898k.f5887n + ((CardSwitcherFragment.m7193h(this.f5902b.f5898k).getMeasuredWidth() - i) / 2)) / 2;
                    if (d != CardSwitcherFragment.m7193h(this.f5902b.f5898k).getPaddingLeft()) {
                        ViewPager h = CardSwitcherFragment.m7193h(this.f5902b.f5898k);
                        h.setPadding(d, h.getPaddingTop(), d, h.getPaddingBottom());
                    }
                    if (!this.f5902b.f5896i) {
                        this.f5902b.f5896i = true;
                        this.f5902b.f5898k.m7194h();
                    }
                }
            }
        }

        public C1769a(CardSwitcherFragment cardSwitcherFragment, FragmentManager fragmentManager) {
            C12932j.m33818b(fragmentManager, "fragmentManager");
            this.f5898k = cardSwitcherFragment;
            super(fragmentManager);
            this.f5897j = fragmentManager;
        }

        public int getCount() {
            return this.f5898k.mo7365c().size();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
            if (r0 != null) goto L_0x002f;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public app.zenly.locator.cards.framework.CardFragment m7217b(int r3) {
            /*
                r2 = this;
                android.util.SparseArray<java.lang.String> r0 = r2.f5894g
                java.lang.Object r0 = r0.get(r3)
                java.lang.String r0 = (java.lang.String) r0
                if (r0 == 0) goto L_0x0015
                androidx.fragment.app.FragmentManager r1 = r2.f5897j
                androidx.fragment.app.Fragment r0 = r1.mo4083b(r0)
                app.zenly.locator.cards.framework.CardFragment r0 = (app.zenly.locator.cards.framework.CardFragment) r0
                if (r0 == 0) goto L_0x0015
                goto L_0x002f
            L_0x0015:
                app.zenly.locator.cards.CardSwitcherFragment r0 = r2.f5898k
                app.zenly.locator.cards.framework.CardFragmentFactory r0 = r0.mo6614b()
                app.zenly.locator.cards.CardSwitcherFragment r1 = r2.f5898k
                java.util.List r1 = r1.mo7365c()
                java.lang.Object r1 = r1.get(r3)
                app.zenly.locator.cards.models.Card r1 = (app.zenly.locator.cards.models.Card) r1
                app.zenly.locator.cards.framework.CardFragment r0 = r0.make(r1)
                r1 = 1
                r0.mo7416b(r1)
            L_0x002f:
                app.zenly.locator.cards.CardSwitcherFragment$a$a r1 = new app.zenly.locator.cards.CardSwitcherFragment$a$a
                r1.<init>(r2, r3)
                r0.mo7412a(r1)
                app.zenly.locator.cards.CardSwitcherFragment$a$b r1 = new app.zenly.locator.cards.CardSwitcherFragment$a$b
                r1.<init>(r0, r2, r3)
                r0.mo7411a(r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.cards.CardSwitcherFragment.C1769a.m7217b(int):app.zenly.locator.cards.framework.CardFragment");
        }

        /* renamed from: a */
        public Object mo4281a(ViewGroup viewGroup, int i) {
            C12932j.m33818b(viewGroup, "container");
            Object a = super.mo4281a(viewGroup, i);
            if (a != null) {
                CardFragment cardFragment = (CardFragment) a;
                this.f5894g.append(i, cardFragment.getTag());
                HashMap<String, Integer> hashMap = this.f5895h;
                String tag = cardFragment.getTag();
                if (tag != null) {
                    C12932j.m33815a((Object) tag, "item.tag!!");
                    hashMap.put(tag, Integer.valueOf(i));
                    return cardFragment;
                }
                C12932j.m33814a();
                throw null;
            }
            throw new TypeCastException("null cannot be cast to non-null type app.zenly.locator.cards.framework.CardFragment");
        }

        /* renamed from: a */
        public void mo6403a() {
            this.f5894g.clear();
            this.f5895h.clear();
            super.mo6403a();
        }

        /* renamed from: a */
        public int mo6402a(Object obj) {
            C12932j.m33818b(obj, "item");
            Integer num = (Integer) this.f5895h.get(((CardFragment) obj).getTag());
            if (num != null) {
                num.intValue();
            }
            return -2;
        }
    }

    /* renamed from: app.zenly.locator.cards.CardSwitcherFragment$b */
    public static final class C1772b {
        private C1772b() {
        }

        /* renamed from: a */
        public final CardSwitcherFragment mo7373a() {
            return new CardSwitcherFragment();
        }

        public /* synthetic */ C1772b(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.locator.cards.CardSwitcherFragment$c */
    private final class C1773c implements CardFragmentFactory {
        public C1773c(CardSwitcherFragment cardSwitcherFragment) {
        }

        public CardFragment make(Card card) {
            C12932j.m33818b(card, "model");
            throw new InvalidObjectException("Please specify a cardFragmentFactory");
        }
    }

    /* renamed from: app.zenly.locator.cards.CardSwitcherFragment$d */
    static final class C1774d extends C12933k implements Function0<C6056h> {

        /* renamed from: f */
        final /* synthetic */ CardSwitcherFragment f5903f;

        C1774d(CardSwitcherFragment cardSwitcherFragment) {
            this.f5903f = cardSwitcherFragment;
            super(0);
        }

        public final C6056h invoke() {
            Context requireContext = this.f5903f.requireContext();
            C12932j.m33815a((Object) requireContext, "requireContext()");
            return new C6056h(requireContext);
        }
    }

    /* renamed from: app.zenly.locator.cards.CardSwitcherFragment$e */
    static final class C1775e implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ CardSwitcherFragment f5904e;

        /* renamed from: f */
        final /* synthetic */ BestFriendV2Card f5905f;

        C1775e(CardSwitcherFragment cardSwitcherFragment, BestFriendV2Card bestFriendV2Card) {
            this.f5904e = cardSwitcherFragment;
            this.f5905f = bestFriendV2Card;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            if (i == 0) {
                this.f5904e.m7187d(this.f5905f);
                return;
            }
            CardSwitcherFragment cardSwitcherFragment = this.f5904e;
            cardSwitcherFragment.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(cardSwitcherFragment.requireContext().getString(R.string.card_bff_what_is_love_url))));
        }
    }

    /* renamed from: app.zenly.locator.cards.CardSwitcherFragment$f */
    static final class C1776f implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ CardSwitcherFragment f5906e;

        /* renamed from: f */
        final /* synthetic */ BestFriendV2Card f5907f;

        C1776f(CardSwitcherFragment cardSwitcherFragment, BestFriendV2Card bestFriendV2Card) {
            this.f5906e = cardSwitcherFragment;
            this.f5907f = bestFriendV2Card;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            if (i == 0) {
                this.f5906e.m7185c(this.f5907f);
                return;
            }
            CardSwitcherFragment cardSwitcherFragment = this.f5906e;
            cardSwitcherFragment.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(cardSwitcherFragment.requireContext().getString(R.string.card_bff_what_is_best_friend_url))));
        }
    }

    /* renamed from: app.zenly.locator.cards.CardSwitcherFragment$g */
    static final class C1777g extends C12933k implements Function1<C1809h, C12273d<C1808g>> {

        /* renamed from: f */
        final /* synthetic */ CardSwitcherFragment f5908f;

        C1777g(CardSwitcherFragment cardSwitcherFragment) {
            this.f5908f = cardSwitcherFragment;
            super(1);
        }

        /* renamed from: a */
        public final C12273d<C1808g> invoke(C1809h hVar) {
            C12932j.m33818b(hVar, "it");
            return this.f5908f.m7197j();
        }
    }

    /* renamed from: app.zenly.locator.cards.CardSwitcherFragment$h */
    public static final class C1778h implements Callback {

        /* renamed from: a */
        final /* synthetic */ CardSwitcherFragment f5909a;

        C1778h(CardSwitcherFragment cardSwitcherFragment) {
            this.f5909a = cardSwitcherFragment;
        }

        public void onShare(C1809h hVar) {
            C12932j.m33818b(hVar, "option");
            C1769a a = this.f5909a.f5882i;
            CardFragment b = a != null ? a.mo4287b(CardSwitcherFragment.m7193h(this.f5909a).getCurrentItem()) : null;
            if (b != null) {
                b.mo7413a(hVar);
            }
        }
    }

    /* renamed from: app.zenly.locator.cards.CardSwitcherFragment$i */
    static final class C1779i extends C12933k implements Function3<Float, Float, Float, C12956q> {

        /* renamed from: f */
        final /* synthetic */ CardSwitcherFragment f5910f;

        C1779i(CardSwitcherFragment cardSwitcherFragment) {
            this.f5910f = cardSwitcherFragment;
            super(3);
        }

        /* renamed from: a */
        public final void mo7378a(float f, float f2, float f3) {
            ArrayList<Tiltable> g = this.f5910f.f5885l;
            ArrayList arrayList = new ArrayList(C12850p.m33647a(g, 10));
            for (Tiltable tilt : g) {
                tilt.setTilt(f, f2, f3);
                arrayList.add(C12956q.f33541a);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            mo7378a(((Number) obj).floatValue(), ((Number) obj2).floatValue(), ((Number) obj3).floatValue());
            return C12956q.f33541a;
        }
    }

    /* renamed from: app.zenly.locator.cards.CardSwitcherFragment$j */
    public static final class C1780j extends C3262b {

        /* renamed from: a */
        private int f5911a = -1;

        /* renamed from: b */
        private int f5912b;

        /* renamed from: c */
        private float f5913c;

        /* renamed from: d */
        final /* synthetic */ CardSwitcherFragment f5914d;

        /* renamed from: app.zenly.locator.cards.CardSwitcherFragment$j$a */
        static final class C1781a implements Runnable {

            /* renamed from: e */
            final /* synthetic */ C1780j f5915e;

            C1781a(C1780j jVar) {
                this.f5915e = jVar;
            }

            public final void run() {
                this.f5915e.mo7380a();
            }
        }

        /* renamed from: app.zenly.locator.cards.CardSwitcherFragment$j$b */
        static final class C1782b implements Runnable {

            /* renamed from: e */
            final /* synthetic */ C1780j f5916e;

            /* renamed from: f */
            final /* synthetic */ int f5917f;

            C1782b(C1780j jVar, int i) {
                this.f5916e = jVar;
                this.f5917f = i;
            }

            public final void run() {
                this.f5916e.f5914d.m7183c(this.f5917f);
            }
        }

        C1780j(CardSwitcherFragment cardSwitcherFragment) {
            this.f5914d = cardSwitcherFragment;
        }

        /* renamed from: a */
        public final void mo7380a() {
            if (((AmbienceView) this.f5914d.mo7360a(C3891l.ambience_view)) != null) {
                Card card = (Card) this.f5914d.mo7365c().get(this.f5912b);
                int[] iArr = {card.mo7550d(), card.mo7548b()};
                if (this.f5914d.mo7365c().size() > this.f5912b + 1) {
                    Card card2 = (Card) this.f5914d.mo7365c().get(this.f5912b + 1);
                    Object evaluate = C5433c.m15444a().evaluate(this.f5913c, iArr, new int[]{card2.mo7550d(), card2.mo7548b()});
                    C12932j.m33815a(evaluate, "TypeEvaluators.argbValue…urrentColors, nextColors)");
                    iArr = (int[]) evaluate;
                }
                float abs = Math.abs(0.5f - this.f5913c) * 2.0f;
                BokehView bokehView = (BokehView) this.f5914d.mo7360a(C3891l.bokeh_view);
                C12932j.m33815a((Object) bokehView, "bokeh_view");
                bokehView.setAlpha(abs);
                BokehView bokehView2 = (BokehView) this.f5914d.mo7360a(C3891l.foreground_bokeh_view);
                C12932j.m33815a((Object) bokehView2, "foreground_bokeh_view");
                bokehView2.setAlpha(abs);
                ((AmbienceView) this.f5914d.mo7360a(C3891l.ambience_view)).setColors(iArr);
            }
        }

        public void onPageScrolled(int i, float f, int i2) {
            this.f5912b = i;
            this.f5913c = f;
            ((TextView) this.f5914d.mo7360a(C3891l.descendants_list_btn)).post(new C1781a(this));
            float f2 = ((double) f) <= 0.5d ? 1.0f - (2.0f * f) : (f - 0.5f) * 2.0f;
            TextView textView = (TextView) this.f5914d.mo7360a(C3891l.title);
            C12932j.m33815a((Object) textView, "title");
            textView.setAlpha(f2);
            TextView textView2 = (TextView) this.f5914d.mo7360a(C3891l.descendants_list_btn);
            C12932j.m33815a((Object) textView2, "descendants_list_btn");
            textView2.setAlpha(f2);
            TextView textView3 = (TextView) this.f5914d.mo7360a(C3891l.descendants_count);
            C12932j.m33815a((Object) textView3, "descendants_count");
            textView3.setAlpha(f2);
            int round = Math.round(((float) i) + f);
            if (round != this.f5911a) {
                ((TextView) this.f5914d.mo7360a(C3891l.descendants_list_btn)).post(new C1782b(this, round));
                if (this.f5911a >= 0) {
                    C1769a a = this.f5914d.f5882i;
                    if (a != null) {
                        CardFragment b = a.mo4287b(this.f5911a);
                        if (b != null) {
                            b.mo7416b(true);
                        }
                    }
                }
                C1769a a2 = this.f5914d.f5882i;
                if (a2 != null) {
                    CardFragment b2 = a2.mo4287b(round);
                    if (b2 != null) {
                        b2.mo7416b(false);
                    }
                }
                this.f5911a = round;
            }
        }
    }

    /* renamed from: app.zenly.locator.cards.CardSwitcherFragment$k */
    static final class C1783k implements PageTransformer {

        /* renamed from: a */
        public static final C1783k f5918a = new C1783k();

        C1783k() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
        /* JADX WARNING: Removed duplicated region for block: B:9:0x002c  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void transformPage(android.view.View r4, float r5) {
            /*
                r3 = this;
                java.lang.String r0 = "page"
                kotlin.jvm.internal.C12932j.m33818b(r4, r0)
                r0 = -1
                float r0 = (float) r0
                r1 = 1063675494(0x3f666666, float:0.9)
                int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                if (r0 < 0) goto L_0x0024
                r0 = 1
                float r0 = (float) r0
                int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                if (r2 > 0) goto L_0x0024
                float r5 = java.lang.Math.abs(r5)
                r2 = 2
                float r2 = (float) r2
                float r2 = r5 / r2
                float r2 = r0 - r2
                float r1 = java.lang.Math.max(r1, r2)
                float r0 = r0 - r5
                goto L_0x0025
            L_0x0024:
                r0 = 0
            L_0x0025:
                boolean r5 = r4 instanceof app.zenly.locator.cards.framework.CardLayout
                if (r5 == 0) goto L_0x002c
                app.zenly.locator.cards.framework.CardLayout r4 = (app.zenly.locator.cards.framework.CardLayout) r4
                goto L_0x003a
            L_0x002c:
                r5 = 2131427591(0x7f0b0107, float:1.8476803E38)
                android.view.View r4 = r4.findViewById(r5)
                java.lang.String r5 = "page.findViewById(R.id.card_layout)"
                kotlin.jvm.internal.C12932j.m33815a(r4, r5)
                app.zenly.locator.cards.framework.CardLayout r4 = (app.zenly.locator.cards.framework.CardLayout) r4
            L_0x003a:
                r4.setScaleX(r1)
                r4.setScaleY(r1)
                r4.setTiltRatio(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.cards.CardSwitcherFragment.C1783k.transformPage(android.view.View, float):void");
        }
    }

    /* renamed from: app.zenly.locator.cards.CardSwitcherFragment$l */
    static final class C1784l implements View.OnClickListener {

        /* renamed from: e */
        final /* synthetic */ CardSwitcherFragment f5919e;

        C1784l(CardSwitcherFragment cardSwitcherFragment) {
            this.f5919e = cardSwitcherFragment;
        }

        public final void onClick(View view) {
            this.f5919e.m7192g();
        }
    }

    /* renamed from: app.zenly.locator.cards.CardSwitcherFragment$m */
    static final class C1785m implements View.OnClickListener {

        /* renamed from: e */
        final /* synthetic */ CardSwitcherFragment f5920e;

        C1785m(CardSwitcherFragment cardSwitcherFragment) {
            this.f5920e = cardSwitcherFragment;
        }

        public final void onClick(View view) {
            C5499a aVar = C5498a.f14119e;
            Context requireContext = this.f5920e.requireContext();
            String str = "requireContext()";
            C12932j.m33815a((Object) requireContext, str);
            C5498a.m15602a(aVar.mo13125a(requireContext), C5501c.LIGHT, C5500b.NAV, 0, 4, null);
            Card card = (Card) this.f5920e.mo7365c().get(CardSwitcherFragment.m7193h(this.f5920e).getCurrentItem());
            String str2 = "requireActivity()";
            if (card instanceof DescendantsCard) {
                DescendantsCard descendantsCard = (DescendantsCard) card;
                if (descendantsCard.mo7552e() == 0) {
                    C2543a aVar2 = C2542d0.f7602c;
                    FragmentActivity requireActivity = this.f5920e.requireActivity();
                    C12932j.m33815a((Object) requireActivity, str2);
                    aVar2.mo8682a(requireActivity).mo8681a(C3744d.Descendants);
                    C5343a.m15160U().mo12826a(C5355l.DESCENDANTS_COUNT_EMPTY);
                    return;
                }
                Context requireContext2 = this.f5920e.requireContext();
                C12932j.m33815a((Object) requireContext2, str);
                DescendantsModule a = C1382g.m6431a(requireContext2);
                C1379a allPreferences = a.provideDescendantsPrefs().getAllPreferences();
                CardSwitcherFragment cardSwitcherFragment = this.f5920e;
                C3503a aVar3 = DescendantsListActivity.f9486n;
                Context requireContext3 = cardSwitcherFragment.requireContext();
                C12932j.m33815a((Object) requireContext3, str);
                cardSwitcherFragment.startActivity(aVar3.mo9972a(requireContext3, descendantsCard.mo7552e(), allPreferences.mo6642d()));
                a.provideDescendantsActionInterceptor().mo6646a(allPreferences, 8);
                C5343a.m15160U().mo12913y();
            } else if (card instanceof TopPopsCard) {
                CardSwitcherFragment cardSwitcherFragment2 = this.f5920e;
                C3503a aVar4 = DescendantsListActivity.f9486n;
                Context requireContext4 = cardSwitcherFragment2.requireContext();
                C12932j.m33815a((Object) requireContext4, str);
                TopPopsCard topPopsCard = (TopPopsCard) card;
                cardSwitcherFragment2.startActivity(aVar4.mo9973a(requireContext4, topPopsCard.mo7565f()));
                if (topPopsCard.mo7564e()) {
                    C5343a.m15160U().mo12912x();
                } else {
                    C5343a.m15160U().mo12787B();
                }
            } else if (card instanceof WorldRankingCard) {
                C2543a aVar5 = C2542d0.f7602c;
                FragmentActivity requireActivity2 = this.f5920e.requireActivity();
                C12932j.m33815a((Object) requireActivity2, str2);
                aVar5.mo8682a(requireActivity2).mo8681a(C3744d.Descendants);
                C5343a.m15160U().mo12826a(C5355l.DESCENDANTS_WORLD_RANK_EMPTY);
            } else if (card instanceof AppIconsCard) {
                C6042a a2 = C6042a.f15226p.mo13858a(((AppIconsCard) card).mo7513e());
                if (!this.f5920e.m7190f().mo13876b(a2)) {
                    this.f5920e.m7190f().mo13873a(a2);
                    C5343a U = C5343a.m15160U();
                    C12932j.m33815a((Object) U, "Analytics.get()");
                    AnalyticsTracker a3 = U.mo12806a();
                    C12932j.m33815a((Object) a3, "Analytics.get().tracker");
                    new C6050d(a3).mo13859a(a2);
                    CardSwitcherFragment.m7179b(this.f5920e).mo13865a(a2.mo13854c());
                }
            }
        }
    }

    /* renamed from: app.zenly.locator.cards.CardSwitcherFragment$n */
    static final class C1786n implements View.OnClickListener {

        /* renamed from: e */
        final /* synthetic */ CardSwitcherFragment f5921e;

        C1786n(CardSwitcherFragment cardSwitcherFragment) {
            this.f5921e = cardSwitcherFragment;
        }

        public final void onClick(View view) {
            C5499a aVar = C5498a.f14119e;
            Context requireContext = this.f5921e.requireContext();
            C12932j.m33815a((Object) requireContext, "requireContext()");
            C5498a.m15602a(aVar.mo13125a(requireContext), C5501c.LIGHT, C5500b.NAV, 0, 4, null);
            this.f5921e.m7195i();
        }
    }

    /* renamed from: app.zenly.locator.cards.CardSwitcherFragment$o */
    static final class C1787o implements OnClickListener {

        /* renamed from: e */
        public static final C1787o f5922e = new C1787o();

        C1787o() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: app.zenly.locator.cards.CardSwitcherFragment$p */
    static final class C1788p implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ CardSwitcherFragment f5923e;

        /* renamed from: f */
        final /* synthetic */ BestFriendV2Card f5924f;

        C1788p(CardSwitcherFragment cardSwitcherFragment, BestFriendV2Card bestFriendV2Card) {
            this.f5923e = cardSwitcherFragment;
            this.f5924f = bestFriendV2Card;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f5923e.mo7362a(this.f5924f);
        }
    }

    /* renamed from: app.zenly.locator.cards.CardSwitcherFragment$q */
    static final class C1789q implements OnClickListener {

        /* renamed from: e */
        public static final C1789q f5925e = new C1789q();

        C1789q() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: app.zenly.locator.cards.CardSwitcherFragment$r */
    static final class C1790r implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ CardSwitcherFragment f5926e;

        /* renamed from: f */
        final /* synthetic */ BestFriendV2Card f5927f;

        C1790r(CardSwitcherFragment cardSwitcherFragment, BestFriendV2Card bestFriendV2Card) {
            this.f5926e = cardSwitcherFragment;
            this.f5927f = bestFriendV2Card;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f5926e.m7181b(this.f5927f);
        }
    }

    /* renamed from: app.zenly.locator.cards.CardSwitcherFragment$s */
    static final class C1791s<T> implements Predicate<Boolean> {

        /* renamed from: e */
        public static final C1791s f5928e = new C1791s();

        C1791s() {
        }

        /* renamed from: a */
        public final Boolean mo7390a(Boolean bool) {
            C12932j.m33818b(bool, "allowed");
            return bool;
        }

        public /* bridge */ /* synthetic */ boolean test(Object obj) {
            Boolean bool = (Boolean) obj;
            mo7390a(bool);
            return bool.booleanValue();
        }
    }

    /* renamed from: app.zenly.locator.cards.CardSwitcherFragment$t */
    static final class C1792t<T, R> implements Function<T, ObservableSource<? extends R>> {

        /* renamed from: e */
        final /* synthetic */ CardSwitcherFragment f5929e;

        C1792t(CardSwitcherFragment cardSwitcherFragment) {
            this.f5929e = cardSwitcherFragment;
        }

        /* renamed from: a */
        public final C12279e<File> apply(Boolean bool) {
            C12932j.m33818b(bool, "it");
            return CardSwitcherFragment.m7175a(this.f5929e, false, 1, null).mo36396b();
        }
    }

    /* renamed from: app.zenly.locator.cards.CardSwitcherFragment$u */
    static final class C1793u<T> implements Consumer<File> {

        /* renamed from: e */
        final /* synthetic */ CardSwitcherFragment f5930e;

        C1793u(CardSwitcherFragment cardSwitcherFragment) {
            this.f5930e = cardSwitcherFragment;
        }

        /* renamed from: a */
        public final void accept(File file) {
            C1769a a = this.f5930e.f5882i;
            CardFragment b = a != null ? a.mo4287b(CardSwitcherFragment.m7193h(this.f5930e).getCurrentItem()) : null;
            if (b != null) {
                b.mo7413a(C1809h.SAVE);
            }
            Toast.makeText(this.f5930e.getContext(), R.string.cards_saveScreenshot_itWorked, 0).show();
            MediaScannerConnection.scanFile(this.f5930e.getContext(), new String[]{file.toString()}, null, null);
        }
    }

    /* renamed from: app.zenly.locator.cards.CardSwitcherFragment$v */
    static final class C1794v<T> implements Consumer<Throwable> {

        /* renamed from: e */
        final /* synthetic */ CardSwitcherFragment f5931e;

        C1794v(CardSwitcherFragment cardSwitcherFragment) {
            this.f5931e = cardSwitcherFragment;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            Toast.makeText(this.f5931e.getContext(), R.string.commons_content_oopserror, 0).show();
        }
    }

    /* renamed from: app.zenly.locator.cards.CardSwitcherFragment$w */
    static final class C1795w<T, R> implements Function<T, R> {

        /* renamed from: e */
        final /* synthetic */ CardSwitcherFragment f5932e;

        C1795w(CardSwitcherFragment cardSwitcherFragment) {
            this.f5932e = cardSwitcherFragment;
        }

        /* renamed from: a */
        public final C1808g apply(File file) {
            C12932j.m33818b(file, "file");
            FragmentActivity activity = this.f5932e.getActivity();
            if (activity == null) {
                return null;
            }
            C12932j.m33815a((Object) activity, "it");
            Uri a = FileProvider.m2525a(activity, C2456a.m8571a(activity), file);
            C12932j.m33815a((Object) a, "imageUri");
            C1808g gVar = new C1808g(null, null, new C1801d(a, file), null, 11, null);
            return gVar;
        }
    }

    /* renamed from: app.zenly.locator.cards.CardSwitcherFragment$x */
    static final class C1796x<T> implements MaybeOnSubscribe<T> {

        /* renamed from: a */
        final /* synthetic */ CardSwitcherFragment f5933a;

        C1796x(CardSwitcherFragment cardSwitcherFragment) {
            this.f5933a = cardSwitcherFragment;
        }

        public final void subscribe(MaybeEmitter<Bitmap> maybeEmitter) {
            C12932j.m33818b(maybeEmitter, "emitter");
            Card card = (Card) this.f5933a.mo7365c().get(CardSwitcherFragment.m7193h(this.f5933a).getCurrentItem());
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setOrientation(Orientation.TL_BR);
            gradientDrawable.setColors(new int[]{card.mo7550d(), card.mo7548b()});
            C1769a a = this.f5933a.f5882i;
            Bitmap bitmap = null;
            CardFragment b = a != null ? a.mo4287b(CardSwitcherFragment.m7193h(this.f5933a).getCurrentItem()) : null;
            if (b != null) {
                bitmap = b.mo7405a(Config.ARGB_8888, (Drawable) gradientDrawable);
            }
            if (bitmap == null) {
                maybeEmitter.onComplete();
            } else {
                maybeEmitter.onSuccess(bitmap);
            }
        }
    }

    /* renamed from: app.zenly.locator.cards.CardSwitcherFragment$y */
    static final class C1797y<T, R> implements Function<T, R> {

        /* renamed from: e */
        final /* synthetic */ CardSwitcherFragment f5934e;

        /* renamed from: f */
        final /* synthetic */ boolean f5935f;

        C1797y(CardSwitcherFragment cardSwitcherFragment, boolean z) {
            this.f5934e = cardSwitcherFragment;
            this.f5935f = z;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0038, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0039, code lost:
            kotlin.p409io.C12901b.m33759a(r2, r6);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x003c, code lost:
            throw r0;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.io.File apply(android.graphics.Bitmap r6) {
            /*
                r5 = this;
                java.lang.String r0 = "bmp"
                kotlin.jvm.internal.C12932j.m33818b(r6, r0)
                boolean r0 = r5.f5935f
                r1 = 0
                if (r0 == 0) goto L_0x0012
                app.zenly.locator.core.util.q$a r0 = app.zenly.locator.core.util.C3231q.C3232a.PICTURES
                r2 = 2
                java.io.File r0 = app.zenly.locator.core.util.C3231q.m10241a(r0, r1, r2, r1)
                goto L_0x0024
            L_0x0012:
                app.zenly.locator.cards.CardSwitcherFragment r0 = r5.f5934e
                androidx.fragment.app.FragmentActivity r0 = r0.requireActivity()
                java.lang.String r2 = "requireActivity()"
                kotlin.jvm.internal.C12932j.m33815a(r0, r2)
                app.zenly.locator.core.util.q$a r2 = app.zenly.locator.core.util.C3231q.C3232a.PICTURES
                r3 = 4
                java.io.File r0 = app.zenly.locator.core.util.C3231q.m10236a(r0, r2, r1, r3, r1)
            L_0x0024:
                if (r0 == 0) goto L_0x003d
                java.io.FileOutputStream r2 = new java.io.FileOutputStream
                r2.<init>(r0)
                android.graphics.Bitmap$CompressFormat r3 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ all -> 0x0036 }
                r4 = 80
                r6.compress(r3, r4, r2)     // Catch:{ all -> 0x0036 }
                kotlin.p409io.C12901b.m33759a(r2, r1)
                return r0
            L_0x0036:
                r6 = move-exception
                throw r6     // Catch:{ all -> 0x0038 }
            L_0x0038:
                r0 = move-exception
                kotlin.p409io.C12901b.m33759a(r2, r6)
                throw r0
            L_0x003d:
                java.lang.Exception r6 = new java.lang.Exception
                java.lang.String r0 = "Unable to create image"
                r6.<init>(r0)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.cards.CardSwitcherFragment.C1797y.apply(android.graphics.Bitmap):java.io.File");
        }
    }

    static {
        C12941s sVar = new C12941s(C12946x.m33834a(CardSwitcherFragment.class), "appIconsShortcutInstaller", "getAppIconsShortcutInstaller()Lapp/zenly/locator/userprofile/me/appicons/AppIconsShortcutInstaller;");
        C12946x.m33839a((C12940r) sVar);
        f5877u = new KProperty[]{sVar};
    }

    /* renamed from: b */
    public static final /* synthetic */ C6052e m7179b(CardSwitcherFragment cardSwitcherFragment) {
        C6052e eVar = cardSwitcherFragment.f5889p;
        if (eVar != null) {
            return eVar;
        }
        C12932j.m33820c("appIconsPrefs");
        throw null;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public final C6056h m7190f() {
        Lazy lazy = this.f5888o;
        KProperty kProperty = f5877u[0];
        return (C6056h) lazy.getValue();
    }

    /* renamed from: h */
    public static final /* synthetic */ ViewPager m7193h(CardSwitcherFragment cardSwitcherFragment) {
        ViewPager viewPager = cardSwitcherFragment.f5883j;
        if (viewPager != null) {
            return viewPager;
        }
        C12932j.m33820c("viewPager");
        throw null;
    }

    /* renamed from: a */
    public View mo7360a(int i) {
        if (this.f5893t == null) {
            this.f5893t = new HashMap();
        }
        View view = (View) this.f5893t.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f5893t.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: a */
    public void mo6508a() {
        HashMap hashMap = this.f5893t;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public void onAttachFragment(Fragment fragment) {
        C12932j.m33818b(fragment, "childFragment");
        super.onAttachFragment(fragment);
        if (fragment instanceof CardSharingFragment) {
            this.f5884k = (CardSharingFragment) fragment;
            CardSharingFragment cardSharingFragment = this.f5884k;
            String str = "cardSharing";
            if (cardSharingFragment != null) {
                cardSharingFragment.mo7347a((Function1<? super C1809h, ? extends C12273d<C1808g>>) new C1777g<Object,Object>(this));
                CardSharingFragment cardSharingFragment2 = this.f5884k;
                if (cardSharingFragment2 != null) {
                    cardSharingFragment2.mo7346a((Callback) new C1778h(this));
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
        Context requireContext = requireContext();
        C12932j.m33815a((Object) requireContext, "requireContext()");
        this.f5886m = new C5476b(requireContext, new C1779i(this));
        this.f5891r = new C1847a(new C6081a(C5448c.m15478a()), this);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C12932j.m33818b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_card_switcher, viewGroup, false);
    }

    public void onDestroyView() {
        requireContext().unregisterReceiver(this.f5890q);
        super.onDestroyView();
        mo6508a();
    }

    public void onStart() {
        super.onStart();
        ViewPager viewPager = this.f5883j;
        if (viewPager != null) {
            m7183c(viewPager.getCurrentItem());
        } else {
            C12932j.m33820c("viewPager");
            throw null;
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        C12932j.m33818b(view, "view");
        super.onViewCreated(view, bundle);
        Context requireContext = requireContext();
        C12932j.m33815a((Object) requireContext, "requireContext()");
        this.f5889p = C6055g.m16803a(requireContext);
        requireContext().registerReceiver(this.f5890q, new IntentFilter("app.zenly.locator.action.SHORTCUT_INSTALLED"));
        FragmentManager requireFragmentManager = requireFragmentManager();
        C12932j.m33815a((Object) requireFragmentManager, "requireFragmentManager()");
        this.f5882i = new C1769a(this, requireFragmentManager);
        this.f5887n = getResources().getDimensionPixelSize(R.dimen.spacing_400);
        ViewPager viewPager = (ViewPager) mo7360a(C3891l.view_pager);
        C12932j.m33815a((Object) viewPager, "view_pager");
        this.f5883j = viewPager;
        ViewPager viewPager2 = this.f5883j;
        String str = "viewPager";
        if (viewPager2 != null) {
            viewPager2.mo6331a((OnPageChangeListener) this.f5892s);
            ViewPager viewPager3 = this.f5883j;
            if (viewPager3 != null) {
                viewPager3.setOffscreenPageLimit(2);
                ViewPager viewPager4 = this.f5883j;
                if (viewPager4 != null) {
                    viewPager4.setAdapter(this.f5882i);
                    ViewPager viewPager5 = this.f5883j;
                    if (viewPager5 != null) {
                        viewPager5.mo6332a(false, C1783k.f5918a);
                        ((ImageButton) mo7360a(C3891l.btn_settings)).setOnClickListener(new C1784l(this));
                        ((TextView) mo7360a(C3891l.descendants_list_btn)).setOnClickListener(new C1785m(this));
                        ((ImageButton) mo7360a(C3891l.btn_save)).setOnClickListener(new C1786n(this));
                        return;
                    }
                    C12932j.m33820c(str);
                    throw null;
                }
                C12932j.m33820c(str);
                throw null;
            }
            C12932j.m33820c(str);
            throw null;
        }
        C12932j.m33820c(str);
        throw null;
    }

    public void onWindowInsetsChanged(View view, Rect rect) {
        C12932j.m33818b(view, "view");
        C12932j.m33818b(rect, "insets");
        super.onWindowInsetsChanged(view, rect);
        view.setPadding(rect.left, view.getPaddingTop(), rect.right, view.getPaddingBottom());
        Space space = (Space) mo7360a(C3891l.space_top);
        String str = "space_top";
        C12932j.m33815a((Object) space, str);
        Space space2 = (Space) mo7360a(C3891l.space_top);
        C12932j.m33815a((Object) space2, str);
        LayoutParams layoutParams = space2.getLayoutParams();
        layoutParams.height = rect.top;
        space.setLayoutParams(layoutParams);
        ConstraintLayout constraintLayout = (ConstraintLayout) mo7360a(C3891l.extra_buttons_container);
        C12932j.m33815a((Object) constraintLayout, "extra_buttons_container");
        constraintLayout.setPadding(constraintLayout.getPaddingLeft(), constraintLayout.getPaddingTop(), constraintLayout.getPaddingRight(), rect.bottom);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final void m7187d(BestFriendV2Card bestFriendV2Card) {
        C0123a aVar = new C0123a(requireContext());
        aVar.mo548c(R.string.friendshipFacts_mutualLove_cards_resetMutualLove_title);
        aVar.mo537a((CharSequence) requireContext().getString(R.string.friendshipFacts_mutualLove_cards_resetMutualLove_message, new Object[]{bestFriendV2Card.mo7520g().mo7535b()}));
        aVar.mo545b(R.string.commons_button_cancel, C1789q.f5925e);
        aVar.mo549c(R.string.friendshipFacts_mutualLove_cards_resetMutualLove_button, new C1790r(this, bestFriendV2Card));
        aVar.mo550c();
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public final void m7192g() {
        C0123a aVar;
        List<Card> list = this.f5879f;
        ViewPager viewPager = this.f5883j;
        if (viewPager != null) {
            Object obj = list.get(viewPager.getCurrentItem());
            if (!(obj instanceof BestFriendV2Card)) {
                obj = null;
            }
            BestFriendV2Card bestFriendV2Card = (BestFriendV2Card) obj;
            if (bestFriendV2Card != null) {
                if (bestFriendV2Card.getType() == C1863c.MUTUAL_LOVE) {
                    aVar = new C0123a(requireContext());
                    aVar.mo541a((CharSequence[]) new String[]{requireContext().getString(R.string.friendshipFacts_mutualLove_cards_contextual_reset), requireContext().getString(R.string.friendshipFacts_mutualLove_cards_contextual_whatIs)}, (OnClickListener) new C1775e(this, bestFriendV2Card));
                } else {
                    aVar = new C0123a(requireContext());
                    aVar.mo541a((CharSequence[]) new String[]{requireContext().getString(R.string.bestFriends_cards_contextual_hide), requireContext().getString(R.string.bestFriends_cards_contextual_whatIs)}, (OnClickListener) new C1776f(this, bestFriendV2Card));
                }
                aVar.mo550c();
                return;
            }
            return;
        }
        C12932j.m33820c("viewPager");
        throw null;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public final void m7194h() {
        ViewPager viewPager = this.f5883j;
        if (viewPager != null) {
            viewPager.setCurrentItem(this.f5880g);
        } else {
            C12932j.m33820c("viewPager");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    @SuppressLint({"CheckResult"})
    /* renamed from: i */
    public final void m7195i() {
        new C12125b(requireActivity()).mo35910c("android.permission.WRITE_EXTERNAL_STORAGE").mo36428a(C12295a.m32802a()).mo36459b((Predicate<? super T>) C1791s.f5928e).mo36490e((Function<? super T, ? extends ObservableSource<? extends R>>) new C1792t<Object,Object>(this)).mo36428a(C12295a.m32802a()).mo36412a((Consumer<? super T>) new C1793u<Object>(this), (Consumer<? super Throwable>) new C1794v<Object>(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public final C12273d<C1808g> m7197j() {
        C12273d<C1808g> b = m7176a(false).mo36394b((Function<? super T, ? extends R>) new C1795w<Object,Object>(this));
        C12932j.m33815a((Object) b, "takeScreenshot(false)\n  …          }\n            }");
        return b;
    }

    /* renamed from: e */
    public final void mo7367e() {
        ProgressBar progressBar = (ProgressBar) mo7360a(C3891l.progress_view);
        C12932j.m33815a((Object) progressBar, "progress_view");
        progressBar.setVisibility(8);
        View a = mo7360a(C3891l.progress_view_bg);
        C12932j.m33815a((Object) a, "progress_view_bg");
        a.setVisibility(8);
        TextView textView = (TextView) mo7360a(C3891l.progress_view_text);
        C12932j.m33815a((Object) textView, "progress_view_text");
        textView.setVisibility(8);
        requireActivity().finish();
    }

    /* renamed from: b */
    public final void mo7364b(int i) {
        this.f5880g = i;
    }

    /* renamed from: c */
    public final List<Card> mo7365c() {
        return this.f5879f;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final void m7185c(BestFriendV2Card bestFriendV2Card) {
        C0123a aVar = new C0123a(requireContext());
        aVar.mo548c(R.string.bestFriends_cards_hide_title);
        aVar.mo537a((CharSequence) requireContext().getString(R.string.bestFriends_cards_hide_message, new Object[]{bestFriendV2Card.mo7520g().mo7535b()}));
        aVar.mo545b(R.string.commons_button_cancel, C1787o.f5922e);
        aVar.mo549c(R.string.bestFriends_cards_hide_button, new C1788p(this, bestFriendV2Card));
        aVar.mo550c();
    }

    /* renamed from: a */
    public final void mo7363a(List<Card> list) {
        C12932j.m33818b(list, "value");
        this.f5879f = list;
        C1769a aVar = this.f5882i;
        if (aVar != null) {
            aVar.mo6403a();
        }
    }

    /* renamed from: b */
    public final CardFragmentFactory mo6614b() {
        return this.f5881h;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m7181b(BestFriendV2Card bestFriendV2Card) {
        ProgressBar progressBar = (ProgressBar) mo7360a(C3891l.progress_view);
        C12932j.m33815a((Object) progressBar, "progress_view");
        progressBar.setVisibility(0);
        View a = mo7360a(C3891l.progress_view_bg);
        C12932j.m33815a((Object) a, "progress_view_bg");
        a.setVisibility(0);
        TextView textView = (TextView) mo7360a(C3891l.progress_view_text);
        C12932j.m33815a((Object) textView, "progress_view_text");
        textView.setVisibility(0);
        C1847a aVar = this.f5891r;
        if (aVar != null) {
            aVar.mo7500b(bestFriendV2Card.mo7520g().mo7534a());
        } else {
            C12932j.m33820c("presenter");
            throw null;
        }
    }

    /* renamed from: a */
    public final void mo7361a(CardFragmentFactory cardFragmentFactory) {
        C12932j.m33818b(cardFragmentFactory, "<set-?>");
        this.f5881h = cardFragmentFactory;
    }

    /* renamed from: a */
    public final void mo7362a(BestFriendV2Card bestFriendV2Card) {
        C12932j.m33818b(bestFriendV2Card, "model");
        ProgressBar progressBar = (ProgressBar) mo7360a(C3891l.progress_view);
        C12932j.m33815a((Object) progressBar, "progress_view");
        progressBar.setVisibility(0);
        View a = mo7360a(C3891l.progress_view_bg);
        C12932j.m33815a((Object) a, "progress_view_bg");
        a.setVisibility(0);
        TextView textView = (TextView) mo7360a(C3891l.progress_view_text);
        C12932j.m33815a((Object) textView, "progress_view_text");
        textView.setVisibility(0);
        C1847a aVar = this.f5891r;
        if (aVar != null) {
            aVar.mo7499a(bestFriendV2Card.mo7520g().mo7534a());
        } else {
            C12932j.m33820c("presenter");
            throw null;
        }
    }

    /* renamed from: d */
    public final void mo7366d() {
        ProgressBar progressBar = (ProgressBar) mo7360a(C3891l.progress_view);
        C12932j.m33815a((Object) progressBar, "progress_view");
        progressBar.setVisibility(8);
        View a = mo7360a(C3891l.progress_view_bg);
        C12932j.m33815a((Object) a, "progress_view_bg");
        a.setVisibility(8);
        TextView textView = (TextView) mo7360a(C3891l.progress_view_text);
        C12932j.m33815a((Object) textView, "progress_view_text");
        textView.setVisibility(8);
        Toast.makeText(requireContext(), R.string.commons_content_oopserror, 1).show();
    }

    /* renamed from: a */
    static /* synthetic */ C12273d m7175a(CardSwitcherFragment cardSwitcherFragment, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return cardSwitcherFragment.m7176a(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final void m7183c(int i) {
        C1769a aVar = this.f5882i;
        CardFragment b = aVar != null ? aVar.mo4287b(i) : null;
        if (b != null && b.isAdded() && !b.isStateSaved()) {
            TextView textView = (TextView) mo7360a(C3891l.title);
            C12932j.m33815a((Object) textView, "title");
            b.mo7408a(textView);
            TextView textView2 = (TextView) mo7360a(C3891l.descendants_list_btn);
            C12932j.m33815a((Object) textView2, "descendants_list_btn");
            TextView textView3 = (TextView) mo7360a(C3891l.descendants_count);
            C12932j.m33815a((Object) textView3, "descendants_count");
            b.mo7409a(textView2, textView3);
            ImageButton imageButton = (ImageButton) mo7360a(C3891l.btn_settings);
            C12932j.m33815a((Object) imageButton, "btn_settings");
            b.mo7407a(imageButton);
            BokehView bokehView = (BokehView) mo7360a(C3891l.bokeh_view);
            C12932j.m33815a((Object) bokehView, "bokeh_view");
            BokehView bokehView2 = (BokehView) mo7360a(C3891l.foreground_bokeh_view);
            C12932j.m33815a((Object) bokehView2, "foreground_bokeh_view");
            b.mo7414a(bokehView, bokehView2);
            String str = "cardSharing";
            if (((Card) this.f5879f.get(i)).mo7549c()) {
                C0819o b2 = getChildFragmentManager().mo4084b();
                CardSharingFragment cardSharingFragment = this.f5884k;
                if (cardSharingFragment != null) {
                    b2.mo4196f(cardSharingFragment);
                    b2.mo4176a();
                } else {
                    C12932j.m33820c(str);
                    throw null;
                }
            } else {
                C0819o b3 = getChildFragmentManager().mo4084b();
                CardSharingFragment cardSharingFragment2 = this.f5884k;
                if (cardSharingFragment2 != null) {
                    b3.mo4190c(cardSharingFragment2);
                    b3.mo4176a();
                } else {
                    C12932j.m33820c(str);
                    throw null;
                }
            }
        }
    }

    /* renamed from: a */
    private final C12273d<File> m7176a(boolean z) {
        C12273d<File> b = C12273d.m32558a((MaybeOnSubscribe<T>) new C1796x<T>(this)).mo36392b(C12295a.m32802a()).mo36394b((Function<? super T, ? extends R>) new C1797y<Object,Object>(this, z));
        C12932j.m33815a((Object) b, "Maybe.create<Bitmap> { e…  imageFile\n            }");
        return b;
    }
}
