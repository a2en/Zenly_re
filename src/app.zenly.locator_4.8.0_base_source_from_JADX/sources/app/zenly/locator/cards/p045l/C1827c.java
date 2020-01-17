package app.zenly.locator.cards.p045l;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.C0540a;
import app.zenly.android.feature.base.model.AvatarLoader;
import app.zenly.android.feature.base.model.AvatarLoader.Request;
import app.zenly.android.feature.base.model.AvatarLoader.Request.C1333c;
import app.zenly.locator.C3891l;
import app.zenly.locator.R;
import app.zenly.locator.cards.C1809h;
import app.zenly.locator.cards.framework.CardFragment;
import app.zenly.locator.cards.framework.widget.CardBackgroundView;
import app.zenly.locator.cards.models.BestFriendV2Card;
import app.zenly.locator.cards.models.BestFriendV2Card.C1863c;
import app.zenly.locator.cards.models.Card;
import app.zenly.locator.core.glide.C2477e;
import app.zenly.locator.core.manager.MeUserManager;
import app.zenly.locator.core.manager.p069di.C2666b;
import app.zenly.locator.core.models.C2879d0;
import app.zenly.locator.core.models.C2884f;
import app.zenly.locator.core.store.api.C2936a0;
import app.zenly.locator.core.store.api.FriendStore;
import app.zenly.locator.core.store.p071di.C3015a;
import app.zenly.locator.p143s.C5343a;
import app.zenly.locator.p143s.C5343a.C5348e;
import app.zenly.locator.p143s.C5343a.C5352i;
import java.util.HashMap;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C12932j;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.p390h.p392c.C12295a;
import p389io.reactivex.p405m.C12773a;

/* renamed from: app.zenly.locator.cards.l.c */
public final class C1827c extends CardFragment {

    /* renamed from: q */
    public static final C1828a f6037q = new C1828a(null);

    /* renamed from: l */
    private FriendStore f6038l;

    /* renamed from: m */
    private MeUserManager f6039m;

    /* renamed from: n */
    private AvatarLoader f6040n;

    /* renamed from: o */
    private final C12275b f6041o = new C12275b();

    /* renamed from: p */
    private HashMap f6042p;

    /* renamed from: app.zenly.locator.cards.l.c$a */
    public static final class C1828a {
        private C1828a() {
        }

        /* renamed from: a */
        public final C1827c mo7481a(BestFriendV2Card bestFriendV2Card) {
            C12932j.m33818b(bestFriendV2Card, "model");
            C1827c cVar = new C1827c();
            cVar.setArguments(cVar.mo7406a((Card) bestFriendV2Card));
            return cVar;
        }

        public /* synthetic */ C1828a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.locator.cards.l.c$b */
    static final class C1829b<T> implements Consumer<C2936a0> {

        /* renamed from: e */
        final /* synthetic */ C1827c f6043e;

        /* renamed from: f */
        final /* synthetic */ BestFriendV2Card f6044f;

        /* renamed from: g */
        final /* synthetic */ C2879d0 f6045g;

        C1829b(C1827c cVar, BestFriendV2Card bestFriendV2Card, C2879d0 d0Var) {
            this.f6043e = cVar;
            this.f6044f = bestFriendV2Card;
            this.f6045g = d0Var;
        }

        /* renamed from: a */
        public final void accept(C2936a0 a0Var) {
            Request withBorder = C1827c.m7302a(this.f6043e).load(C2884f.m9355a(a0Var.mo9074a())).withPlaceholderStrategy(C1333c.DisplayName).withFillColor(R.color.white_o30).withTextColor(R.color.white).withBorder(R.dimen.stroke_100, this.f6044f.mo7518e());
            ImageView imageView = (ImageView) this.f6043e.mo7480a(C3891l.best_friend_avatar);
            C12932j.m33815a((Object) imageView, "best_friend_avatar");
            withBorder.into(imageView);
            TextView textView = (TextView) this.f6043e.mo7480a(C3891l.names);
            C12932j.m33815a((Object) textView, "names");
            Context requireContext = this.f6043e.requireContext();
            C12932j.m33815a((Object) requireContext, "requireContext()");
            textView.setText(requireContext.getResources().getString(R.string.friendshipFacts_cards_names, new Object[]{a0Var.mo9074a().getName(), this.f6045g.mo8942e()}));
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ AvatarLoader m7302a(C1827c cVar) {
        AvatarLoader avatarLoader = cVar.f6040n;
        if (avatarLoader != null) {
            return avatarLoader;
        }
        C12932j.m33820c("avatarLoader");
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0163  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m7305b(app.zenly.locator.cards.models.BestFriendV2Card r14) {
        /*
            r13 = this;
            int r0 = r14.mo7522h()
            android.content.Context r1 = r13.requireContext()
            int r2 = r14.mo7530p()
            int r1 = androidx.core.content.C0540a.m2536a(r1, r2)
            android.content.Context r2 = r13.requireContext()
            int r3 = r14.mo7528n()
            int r2 = androidx.core.content.C0540a.m2536a(r2, r3)
            int r3 = app.zenly.locator.C3891l.streak_value
            android.view.View r3 = r13.mo7480a(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r3.setTextColor(r1)
            int r3 = app.zenly.locator.C3891l.streak_description
            android.view.View r3 = r13.mo7480a(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r3.setTextColor(r1)
            int r3 = app.zenly.locator.C3891l.streak_title
            android.view.View r3 = r13.mo7480a(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r3.setTextColor(r2)
            int r3 = app.zenly.locator.C3891l.names
            android.view.View r3 = r13.mo7480a(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r3.setTextColor(r2)
            app.zenly.locator.cards.models.BestFriendV2Card$c r3 = r14.getType()
            app.zenly.locator.cards.models.BestFriendV2Card$c r4 = app.zenly.locator.cards.models.BestFriendV2Card.C1863c.MUTUAL_LOVE
            if (r3 == r4) goto L_0x006f
            android.content.res.Resources r3 = r13.getResources()
            r4 = 2131492886(0x7f0c0016, float:1.8609237E38)
            int r3 = r3.getInteger(r4)
            float r3 = (float) r3
            int r4 = app.zenly.locator.C3891l.streak_value
            android.view.View r4 = r13.mo7480a(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r5 = 1060320051(0x3f333333, float:0.7)
            int r1 = app.zenly.locator.p143s.p151o.C5465a.m15551a(r1, r5)
            r5 = 0
            r4.setShadowLayer(r3, r5, r5, r1)
        L_0x006f:
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.DAYS
            r3 = 1
            long r3 = r1.toHours(r3)
            boolean r1 = r14.mo7531q()
            java.lang.String r5 = "names"
            if (r1 != 0) goto L_0x0104
            java.lang.Integer r1 = r14.mo7529o()
            if (r1 == 0) goto L_0x0104
            r6 = 0
            java.lang.Integer r1 = r14.mo7529o()
            int r1 = r1.intValue()
            long r8 = (long) r1
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 <= 0) goto L_0x0095
            goto L_0x0104
        L_0x0095:
            int r1 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r1 < 0) goto L_0x0104
            int r1 = app.zenly.locator.C3891l.names
            android.view.View r1 = r13.mo7480a(r1)
            r6 = r1
            android.widget.TextView r6 = (android.widget.TextView) r6
            kotlin.jvm.internal.C12932j.m33815a(r6, r5)
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 13
            r12 = 0
            app.zenly.android.base.widget.C1315a.m6318a(r6, r7, r8, r9, r10, r11, r12)
            android.content.Context r1 = r13.getContext()
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
            r5 = 2131623992(0x7f0e0038, float:1.8875151E38)
            int r6 = app.zenly.locator.C3891l.item_container_bottom
            android.view.View r6 = r13.mo7480a(r6)
            android.widget.FrameLayout r6 = (android.widget.FrameLayout) r6
            r1.inflate(r5, r6)
            int r1 = app.zenly.locator.C3891l.streak_timer
            android.view.View r1 = r13.mo7480a(r1)
            app.zenly.locator.core.widget.CircleProgressView r1 = (app.zenly.locator.core.widget.CircleProgressView) r1
            java.lang.Integer r5 = r14.mo7529o()
            int r5 = r5.intValue()
            float r5 = (float) r5
            r6 = 1120403456(0x42c80000, float:100.0)
            float r5 = r5 * r6
            float r3 = (float) r3
            float r5 = r5 / r3
            float r3 = r6 - r5
            r1.mo9658a(r3, r6)
            int r1 = app.zenly.locator.C3891l.streak_timer
            android.view.View r1 = r13.mo7480a(r1)
            app.zenly.locator.core.widget.CircleProgressView r1 = (app.zenly.locator.core.widget.CircleProgressView) r1
            r1.setCircleBackgroundColor(r2)
            int r1 = app.zenly.locator.C3891l.streak_timer
            android.view.View r1 = r13.mo7480a(r1)
            app.zenly.locator.core.widget.CircleProgressView r1 = (app.zenly.locator.core.widget.CircleProgressView) r1
            android.content.Context r2 = r13.requireContext()
            int r3 = r14.mo7518e()
            int r2 = androidx.core.content.C0540a.m2536a(r2, r3)
            r1.setCircleProgressColor(r2)
            goto L_0x012c
        L_0x0104:
            int r1 = app.zenly.locator.C3891l.names
            android.view.View r1 = r13.mo7480a(r1)
            r6 = r1
            android.widget.TextView r6 = (android.widget.TextView) r6
            kotlin.jvm.internal.C12932j.m33815a(r6, r5)
            r7 = 0
            int r8 = r14.mo7524j()
            r9 = 0
            r10 = 0
            r11 = 13
            r12 = 0
            app.zenly.android.base.widget.C1315a.m6316a(r6, r7, r8, r9, r10, r11, r12)
            int r1 = app.zenly.locator.C3891l.names
            android.view.View r1 = r13.mo7480a(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            android.content.res.ColorStateList r2 = android.content.res.ColorStateList.valueOf(r2)
            androidx.core.widget.C0680h.m3178a(r1, r2)
        L_0x012c:
            int r1 = app.zenly.locator.C3891l.streak_title
            android.view.View r1 = r13.mo7480a(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            int r2 = r14.mo7526l()
            r1.setText(r2)
            boolean r1 = r14.mo7532r()
            java.lang.String r2 = "streak_description"
            if (r1 == 0) goto L_0x0163
            int r0 = app.zenly.locator.C3891l.streak_value
            android.view.View r0 = r13.mo7480a(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            int r14 = r14.mo7525k()
            r0.setText(r14)
            int r14 = app.zenly.locator.C3891l.streak_description
            android.view.View r14 = r13.mo7480a(r14)
            android.widget.TextView r14 = (android.widget.TextView) r14
            kotlin.jvm.internal.C12932j.m33815a(r14, r2)
            r0 = 8
            r14.setVisibility(r0)
            goto L_0x01ab
        L_0x0163:
            int r1 = app.zenly.locator.C3891l.streak_value
            android.view.View r1 = r13.mo7480a(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.String r3 = "streak_value"
            kotlin.jvm.internal.C12932j.m33815a(r1, r3)
            android.content.Context r3 = r13.requireContext()
            java.lang.String r4 = "requireContext()"
            kotlin.jvm.internal.C12932j.m33815a(r3, r4)
            r4 = 4
            r5 = 0
            r6 = 0
            java.lang.String r3 = p250f.p251a.p252a.p263b.p264a.p269h.p270a.C7706a.m18754a(r3, r0, r6, r4, r5)
            r1.setText(r3)
            int r1 = app.zenly.locator.C3891l.streak_description
            android.view.View r1 = r13.mo7480a(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            kotlin.jvm.internal.C12932j.m33815a(r1, r2)
            android.content.res.Resources r3 = r13.getResources()
            int r14 = r14.mo7523i()
            java.lang.CharSequence r14 = r3.getQuantityText(r14, r0)
            r1.setText(r14)
            int r14 = app.zenly.locator.C3891l.streak_description
            android.view.View r14 = r13.mo7480a(r14)
            android.widget.TextView r14 = (android.widget.TextView) r14
            kotlin.jvm.internal.C12932j.m33815a(r14, r2)
            r14.setVisibility(r6)
        L_0x01ab:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.cards.p045l.C1827c.m7305b(app.zenly.locator.cards.models.BestFriendV2Card):void");
    }

    /* renamed from: a */
    public View mo7480a(int i) {
        if (this.f6042p == null) {
            this.f6042p = new HashMap();
        }
        View view = (View) this.f6042p.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f6042p.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: a */
    public void mo6508a() {
        HashMap hashMap = this.f6042p;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Context requireContext = requireContext();
        String str = "requireContext()";
        C12932j.m33815a((Object) requireContext, str);
        this.f6038l = C3015a.m9526a(requireContext).provideFriendStore();
        Context requireContext2 = requireContext();
        C12932j.m33815a((Object) requireContext2, str);
        this.f6039m = C2666b.m9049a(requireContext2).mo8764b();
        Context requireContext3 = requireContext();
        C12932j.m33815a((Object) requireContext3, str);
        this.f6040n = new C2477e(requireContext3);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C12932j.m33818b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.card_bff_v2, viewGroup, false);
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo6508a();
    }

    public void onPause() {
        this.f6041o.mo36401a();
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        MeUserManager meUserManager = this.f6039m;
        if (meUserManager != null) {
            C2879d0 d0Var = meUserManager.mo8756b().f8250a;
            Card c = mo7417c();
            if (c != null) {
                BestFriendV2Card bestFriendV2Card = (BestFriendV2Card) c;
                FriendStore friendStore = this.f6038l;
                if (friendStore != null) {
                    Disposable d = friendStore.friend(bestFriendV2Card.mo7520g().mo7534a()).mo36487e(1).mo36428a(C12295a.m32802a()).mo36476d((Consumer<? super T>) new C1829b<Object>(this, bestFriendV2Card, d0Var));
                    C12932j.m33815a((Object) d, "friendStore\n            …eUser.name)\n            }");
                    C12773a.m33432a(d, this.f6041o);
                    return;
                }
                C12932j.m33820c("friendStore");
                throw null;
            }
            throw new TypeCastException("null cannot be cast to non-null type app.zenly.locator.cards.models.BestFriendV2Card");
        }
        C12932j.m33820c("meUserManager");
        throw null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C12932j.m33818b(view, "view");
        super.onViewCreated(view, bundle);
        MeUserManager meUserManager = this.f6039m;
        if (meUserManager != null) {
            C2879d0 d0Var = meUserManager.mo8756b().f8250a;
            Card c = mo7417c();
            if (c != null) {
                BestFriendV2Card bestFriendV2Card = (BestFriendV2Card) c;
                m7303a(bestFriendV2Card);
                C12932j.m33815a((Object) d0Var, "meUser");
                m7304a(d0Var, bestFriendV2Card);
                m7305b(bestFriendV2Card);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type app.zenly.locator.cards.models.BestFriendV2Card");
        }
        C12932j.m33820c("meUserManager");
        throw null;
    }

    /* renamed from: a */
    private final void m7303a(BestFriendV2Card bestFriendV2Card) {
        ((CardBackgroundView) mo7480a(C3891l.card_background)).setThicknessTint(C0540a.m2536a(requireContext(), bestFriendV2Card.mo7519f()));
        int a = C0540a.m2536a(requireContext(), bestFriendV2Card.mo7518e());
        ((CardBackgroundView) mo7480a(C3891l.card_background)).mo7436a(a, a);
    }

    /* renamed from: a */
    private final void m7304a(C2879d0 d0Var, BestFriendV2Card bestFriendV2Card) {
        Context requireContext = requireContext();
        C12932j.m33815a((Object) requireContext, "requireContext()");
        Request withBorder = new C2477e(requireContext).load(C2884f.m9353a(d0Var)).withPlaceholderStrategy(C1333c.DisplayName).withFillColor(R.color.white_o30).withTextColor(R.color.white).withBorder(R.dimen.stroke_100, bestFriendV2Card.mo7518e());
        ImageView imageView = (ImageView) mo7480a(C3891l.my_avatar);
        C12932j.m33815a((Object) imageView, "my_avatar");
        withBorder.into(imageView);
    }

    /* renamed from: a */
    public void mo7407a(ImageButton imageButton) {
        C12932j.m33818b(imageButton, "settings");
        Card c = mo7417c();
        if (c != null) {
            BestFriendV2Card bestFriendV2Card = (BestFriendV2Card) c;
            int i = 0;
            if (!(bestFriendV2Card.getType() == C1863c.MUTUAL_LOVE || bestFriendV2Card.getType() == C1863c.BFF)) {
                i = 8;
            }
            imageButton.setVisibility(i);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type app.zenly.locator.cards.models.BestFriendV2Card");
    }

    /* renamed from: a */
    public void mo7413a(C1809h hVar) {
        C12932j.m33818b(hVar, "sharingOption");
        Card c = mo7417c();
        if (c != null) {
            BestFriendV2Card bestFriendV2Card = (BestFriendV2Card) c;
            C5343a U = C5343a.m15160U();
            switch (C1830d.f6046a[bestFriendV2Card.getType().ordinal()]) {
                case 1:
                    U.mo12819a(C5348e.BEST_FRIEND, hVar.mo7468a());
                    return;
                case 2:
                    U.mo12819a(C5348e.MUTUAL_LOVE, hVar.mo7468a());
                    return;
                case 3:
                    if (bestFriendV2Card.mo7527m()) {
                        U.mo12823a(C5352i.FRIENDSHIP_LAST_TIME_MET_LONG_TIME_NO_SEE, hVar.mo7468a());
                        return;
                    } else {
                        U.mo12893i(hVar.mo7468a());
                        return;
                    }
                case 4:
                    if (bestFriendV2Card.mo7527m()) {
                        U.mo12823a(C5352i.FRIENDSHIP_LAST_TIME_MET_STREAK, hVar.mo7468a());
                        return;
                    } else {
                        U.mo12896j(hVar.mo7468a());
                        return;
                    }
                case 5:
                    U.mo12823a(C5352i.FRIENDSHIP_FRIENDSHIP_AGE, hVar.mo7468a());
                    return;
                case 6:
                    U.mo12823a(C5352i.FRIENDSHIP_TIMES_MET, hVar.mo7468a());
                    return;
                case 7:
                    U.mo12823a(C5352i.FRIENDSHIP_TIME_TOGETHER, hVar.mo7468a());
                    return;
                default:
                    return;
            }
        } else {
            throw new TypeCastException("null cannot be cast to non-null type app.zenly.locator.cards.models.BestFriendV2Card");
        }
    }
}
