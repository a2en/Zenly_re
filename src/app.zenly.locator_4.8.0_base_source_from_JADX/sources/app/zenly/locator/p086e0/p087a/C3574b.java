package app.zenly.locator.p086e0.p087a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import app.zenly.android.feature.base.scheduling.C1342b;
import app.zenly.android.feature.base.scheduling.C1351e;
import app.zenly.android.feature.base.scheduling.ZenlySchedulers;
import app.zenly.android.feature.polenta.widget.ScreenBarLayout;
import app.zenly.android.feature.polenta.widget.ScreenBarLayout.OnCollapseListener;
import app.zenly.locator.C3891l;
import app.zenly.locator.R;
import app.zenly.locator.cards.models.Card;
import app.zenly.locator.cards.models.DescendantsCard;
import app.zenly.locator.cards.models.TopPopsCard;
import app.zenly.locator.cards.models.WorldRankingCard;
import app.zenly.locator.core.invitations.C2538c0;
import app.zenly.locator.core.invitations.C2587f0;
import app.zenly.locator.core.invitations.C2623w;
import app.zenly.locator.core.invitations.C2625y;
import app.zenly.locator.core.invitations.C2625y.C2626a;
import app.zenly.locator.core.invitations.InvitationCallback;
import app.zenly.locator.core.manager.C2718k5;
import app.zenly.locator.core.manager.MeUserManager;
import app.zenly.locator.core.manager.p069di.C2666b;
import app.zenly.locator.core.models.C2879d0;
import app.zenly.locator.core.p072ui.controller.ZenlyController;
import app.zenly.locator.core.store.api.C2936a0;
import app.zenly.locator.core.store.api.C2956k0;
import app.zenly.locator.core.store.api.C2991u0;
import app.zenly.locator.core.store.api.FriendRequestStore;
import app.zenly.locator.core.store.api.FriendStore;
import app.zenly.locator.core.store.api.FriendshipStore;
import app.zenly.locator.core.store.p071di.C3015a;
import app.zenly.locator.core.util.C3201f;
import app.zenly.locator.core.util.C3205g;
import app.zenly.locator.core.util.C3245z;
import app.zenly.locator.decision.C3444a;
import app.zenly.locator.map.C3896a1;
import app.zenly.locator.p086e0.p087a.p088i.C3620a;
import app.zenly.locator.p086e0.p087a.p088i.C3621b;
import app.zenly.locator.p086e0.p087a.p088i.C3622c;
import app.zenly.locator.p086e0.p087a.p088i.C3623d;
import app.zenly.locator.p086e0.p087a.p088i.C3624e;
import app.zenly.locator.p086e0.p087a.p089j.C3625a;
import app.zenly.locator.p086e0.p087a.p089j.C3641b;
import app.zenly.locator.p086e0.p087a.p091l.C3661f;
import app.zenly.locator.p143s.C5343a;
import app.zenly.locator.p143s.C5343a.C5359p;
import app.zenly.locator.p143s.p148l.C5448c;
import app.zenly.locator.p143s.p155r.C5498a;
import app.zenly.locator.p143s.p155r.C5498a.C5499a;
import app.zenly.locator.p143s.p155r.C5498a.C5500b;
import app.zenly.locator.p143s.p155r.C5498a.C5501c;
import app.zenly.locator.p207x.C6272z1;
import app.zenly.locator.recommendation.RecommendationActivity;
import app.zenly.locator.recommendation.RecommendationActivity.C5215a;
import app.zenly.locator.view.ScreenBarBottomSheetBehavior;
import app.zenly.locator.view.ScreenBarBottomSheetBehavior.C6163b;
import com.bluelinelabs.conductor.C8819d;
import com.bluelinelabs.conductor.C8819d.C8828i;
import com.google.android.material.bottomsheet.BottomSheetBehavior.C10744c;
import com.snap.p327ui.event.C11700c;
import com.snap.p327ui.event.EventDispatcher;
import com.snap.p327ui.recycling.adapter.C11705b;
import com.snap.p327ui.recycling.factory.C11727c;
import com.snap.p327ui.recycling.prefetch.C11731a;
import com.snap.p327ui.recycling.prefetch.ViewHolderPrefetcher;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.C12899i;
import kotlin.C12954o;
import kotlin.Lazy;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12933k;
import kotlin.jvm.internal.C12940r;
import kotlin.jvm.internal.C12941s;
import kotlin.jvm.internal.C12946x;
import kotlin.reflect.KProperty;
import org.greenrobot.eventbus.C13382i;
import org.greenrobot.eventbus.ThreadMode;
import p213co.znly.core.ZenlyCore;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.models.FriendRequestProto$FriendRequest.C6812c;
import p213co.znly.models.UserProto$User;
import p213co.znly.models.core.C7180o1;
import p250f.p251a.p252a.p263b.p264a.p272j.C7713f;
import p389io.reactivex.C12271b;
import p389io.reactivex.C12279e;
import p389io.reactivex.C12286f;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.functions.BiFunction;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.functions.Function;
import p389io.reactivex.p402j.C12767a;
import p389io.reactivex.p405m.C12773a;
import p389io.reactivex.p405m.C12774b;

/* renamed from: app.zenly.locator.e0.a.b */
public final class C3574b extends ZenlyController {

    /* renamed from: l0 */
    static final /* synthetic */ KProperty[] f9624l0;

    /* renamed from: m0 */
    public static final C3575a f9625m0 = new C3575a(null);

    /* renamed from: P */
    private C3615f f9626P;

    /* renamed from: Q */
    private final ZenlySchedulers f9627Q = C1351e.m6372a(C3602d.f9686b.mo19916a("controller"));

    /* renamed from: R */
    private final C12275b f9628R = new C12275b();

    /* renamed from: S */
    private final C12275b f9629S = new C12275b();

    /* renamed from: T */
    private final Lazy f9630T;

    /* renamed from: U */
    private final Lazy f9631U;

    /* renamed from: V */
    private final Lazy f9632V;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public boolean f9633W;
    /* access modifiers changed from: private */

    /* renamed from: X */
    public boolean f9634X;

    /* renamed from: Y */
    private C3592c f9635Y;

    /* renamed from: Z */
    private C11705b f9636Z;

    /* renamed from: a0 */
    private FriendStore f9637a0;

    /* renamed from: b0 */
    private FriendRequestStore f9638b0;

    /* renamed from: c0 */
    private FriendshipStore f9639c0;

    /* renamed from: d0 */
    private MeUserManager f9640d0;

    /* renamed from: e0 */
    private C2718k5 f9641e0;

    /* renamed from: f0 */
    private C3617g f9642f0;

    /* renamed from: g0 */
    private C3603e f9643g0;

    /* renamed from: h0 */
    private RecyclerView f9644h0;

    /* renamed from: i0 */
    private ScreenBarBottomSheetBehavior<View> f9645i0;

    /* renamed from: j0 */
    private boolean f9646j0;
    /* access modifiers changed from: private */

    /* renamed from: k0 */
    public String f9647k0;

    /* renamed from: app.zenly.locator.e0.a.b$a */
    public static final class C3575a {
        private C3575a() {
        }

        /* renamed from: a */
        public final C3574b mo10053a(String str, C5359p pVar) {
            C12932j.m33818b(str, "userUuid");
            C12932j.m33818b(pVar, "gestureType");
            Bundle bundle = new Bundle();
            bundle.putString("args:user_uuid", str);
            bundle.putSerializable("args:gesture_type", pVar);
            return new C3574b(bundle);
        }

        public /* synthetic */ C3575a(C12928f fVar) {
            this();
        }

        /* renamed from: a */
        public final C3574b mo10052a(String str) {
            C12932j.m33818b(str, "userUuid");
            Bundle bundle = new Bundle();
            bundle.putString("args:user_uuid", str);
            return new C3574b(bundle);
        }
    }

    /* renamed from: app.zenly.locator.e0.a.b$b */
    public final class C3576b {

        /* renamed from: a */
        private final Context f9648a;

        /* renamed from: b */
        final /* synthetic */ C3574b f9649b;

        public C3576b(C3574b bVar, Context context) {
            C12932j.m33818b(context, "context");
            this.f9649b = bVar;
            this.f9648a = context;
        }

        @C13382i(threadMode = ThreadMode.MAIN)
        public final void onAddFriend(C3620a aVar) {
            C12932j.m33818b(aVar, "event");
            C2538c0.m8837a(this.f9649b.mo23920b()).mo8670a(C2626a.m8955a(C2625y.f7738e, C2587f0.PROFILE_OTHER_FRIEND_LIST, aVar.mo10108a(), aVar.mo10109b(), null, false, 16, null), (InvitationCallback) new C2623w(this.f9648a, false));
        }

        @C13382i(threadMode = ThreadMode.MAIN)
        public final void onClick(C3622c cVar) {
            C12932j.m33818b(cVar, "event");
            C5343a.m15160U().mo12895j(cVar.mo10111a());
            C5498a.m15602a(C5498a.f14119e.mo13125a(this.f9648a), C5501c.LIGHT, C5500b.NAV, 0, 4, null);
            int a = cVar.mo10111a();
            String quantityString = this.f9648a.getResources().getQuantityString(R.plurals.cards_descendants_subtitle_profileOther, cVar.mo10111a(), new Object[]{Integer.valueOf(cVar.mo10111a()), cVar.mo10112b().getName()});
            C12932j.m33815a((Object) quantityString, "context.resources.getQua…er.name\n                )");
            DescendantsCard descendantsCard = new DescendantsCard(a, 0, quantityString, false);
            if (descendantsCard.mo7552e() == 0) {
                C3574b.m10850f(this.f9649b).mo10093a((Card) descendantsCard, new Card[0]);
                return;
            }
            String str = "event.user.uuid";
            if (descendantsCard.mo7552e() >= 10) {
                C3615f f = C3574b.m10850f(this.f9649b);
                String uuid = cVar.mo10112b().getUuid();
                C12932j.m33815a((Object) uuid, str);
                int e = descendantsCard.mo7552e();
                String uuid2 = cVar.mo10112b().getUuid();
                C12932j.m33815a((Object) uuid2, str);
                f.mo10093a((Card) descendantsCard, new TopPopsCard(uuid, false), new WorldRankingCard(e, uuid2, false));
                return;
            }
            C3615f f2 = C3574b.m10850f(this.f9649b);
            String uuid3 = cVar.mo10112b().getUuid();
            C12932j.m33815a((Object) uuid3, str);
            f2.mo10093a((Card) descendantsCard, new TopPopsCard(uuid3, false));
        }

        @C13382i(threadMode = ThreadMode.MAIN)
        public final void onClick(C3623d dVar) {
            C12932j.m33818b(dVar, "event");
            C5343a.m15160U().mo12788C();
            C5498a.m15602a(C5498a.f14119e.mo13125a(this.f9648a), C5501c.LIGHT, C5500b.NAV, 0, 4, null);
            if (dVar.mo10113a().mo10171i() > 0) {
                C3661f a = dVar.mo10113a();
                String i = this.f9649b.getUserUuid();
                C12932j.m33815a((Object) i, "userUuid");
                String username = dVar.mo10113a().mo10172j().getUsername();
                C12932j.m33815a((Object) username, "event.model.user.username");
                List a2 = a.mo10167a(i, username, dVar.mo10113a().mo10169g(), true);
                if (!a2.isEmpty()) {
                    C3615f.m10912a(C3574b.m10850f(this.f9649b), a2, 0, 2, null);
                    return;
                }
            }
            C3574b.m10850f(this.f9649b).mo10102c(dVar.mo10113a().mo10172j());
        }

        @C13382i(threadMode = ThreadMode.MAIN)
        public final void onClick(C3621b bVar) {
            C12932j.m33818b(bVar, "event");
            C3574b.m10850f(this.f9649b).mo10098a(bVar.mo10110a());
        }

        @C13382i(threadMode = ThreadMode.MAIN)
        public final void onClick(C3624e eVar) {
            C12932j.m33818b(eVar, "event");
            C3574b bVar = this.f9649b;
            C5215a aVar = RecommendationActivity.f13462o;
            Context context = this.f9648a;
            String i = bVar.getUserUuid();
            C12932j.m33815a((Object) i, "userUuid");
            bVar.mo23902a(aVar.mo12543a(context, i, C3574b.m10855j(this.f9649b), "fragment:recommendationFriendsOther"));
        }
    }

    /* renamed from: app.zenly.locator.e0.a.b$c */
    static final class C3577c extends C12933k implements Function0<C5359p> {

        /* renamed from: f */
        final /* synthetic */ Bundle f9650f;

        C3577c(Bundle bundle) {
            this.f9650f = bundle;
            super(0);
        }

        public final C5359p invoke() {
            return (C5359p) this.f9650f.getSerializable("args:gesture_type");
        }
    }

    /* renamed from: app.zenly.locator.e0.a.b$d */
    public static final class C3578d<T1, T2, R> implements BiFunction<T1, T2, R> {
        public final R apply(T1 t1, T2 t2) {
            return C12954o.m33853a((UserProto$User) t1, (Boolean) t2);
        }
    }

    /* renamed from: app.zenly.locator.e0.a.b$e */
    static final class C3579e<T, R> implements Function<T, R> {

        /* renamed from: e */
        final /* synthetic */ C3574b f9651e;

        C3579e(C3574b bVar) {
            this.f9651e = bVar;
        }

        /* renamed from: a */
        public final boolean mo10059a(Map<String, C2936a0> map) {
            C12932j.m33818b(map, "it");
            return map.containsKey(this.f9651e.getUserUuid());
        }

        public /* bridge */ /* synthetic */ Object apply(Object obj) {
            return Boolean.valueOf(mo10059a((Map) obj));
        }
    }

    /* renamed from: app.zenly.locator.e0.a.b$f */
    static final class C3580f<T> implements Consumer<C12899i<? extends UserProto$User, ? extends Boolean>> {

        /* renamed from: e */
        final /* synthetic */ C3574b f9652e;

        C3580f(C3574b bVar) {
            this.f9652e = bVar;
        }

        /* renamed from: a */
        public final void accept(C12899i<UserProto$User, Boolean> iVar) {
            UserProto$User userProto$User = (UserProto$User) iVar.mo37202a();
            Boolean bool = (Boolean) iVar.mo37203b();
            if (this.f9652e.f9633W) {
                C3592c a = C3574b.m10840a(this.f9652e);
                C12932j.m33815a((Object) userProto$User, "user");
                a.mo10071b(userProto$User);
                this.f9652e.f9633W = false;
            }
            if (this.f9652e.f9634X) {
                C5343a U = C5343a.m15160U();
                C12932j.m33815a((Object) bool, "isFriend");
                U.mo12832a(userProto$User, bool.booleanValue(), this.f9652e.m10837B());
                this.f9652e.f9634X = false;
            }
        }
    }

    /* renamed from: app.zenly.locator.e0.a.b$g */
    static final class C3581g<T, R> implements Function<T, R> {

        /* renamed from: e */
        public static final C3581g f9653e = new C3581g();

        C3581g() {
        }

        /* renamed from: a */
        public final Timestamp apply(C2991u0 u0Var) {
            C12932j.m33818b(u0Var, "it");
            return u0Var.mo9175a().getCreatedAt();
        }
    }

    /* renamed from: app.zenly.locator.e0.a.b$h */
    static final class C3582h<T, R> implements Function<T, R> {

        /* renamed from: e */
        public static final C3582h f9654e = new C3582h();

        C3582h() {
        }

        /* renamed from: a */
        public final long mo10062a(Timestamp timestamp) {
            C12932j.m33818b(timestamp, "it");
            return C3245z.m10288g(timestamp);
        }

        public /* bridge */ /* synthetic */ Object apply(Object obj) {
            return Long.valueOf(mo10062a((Timestamp) obj));
        }
    }

    /* renamed from: app.zenly.locator.e0.a.b$i */
    static final class C3583i<T, R> implements Function<T, R> {

        /* renamed from: e */
        final /* synthetic */ C3574b f9655e;

        C3583i(C3574b bVar) {
            this.f9655e = bVar;
        }

        /* renamed from: a */
        public final boolean mo10063a(List<C2956k0> list) {
            boolean z;
            C12932j.m33818b(list, "requests");
            if ((list instanceof Collection) && list.isEmpty()) {
                return false;
            }
            for (C2956k0 k0Var : list) {
                if (!C12932j.m33817a((Object) k0Var.mo9122b().getTargetUuid(), (Object) this.f9655e.getUserUuid()) || k0Var.mo9122b().getStatus() != C6812c.pending) {
                    z = false;
                    continue;
                } else {
                    z = true;
                    continue;
                }
                if (z) {
                    return true;
                }
            }
            return false;
        }

        public /* bridge */ /* synthetic */ Object apply(Object obj) {
            return Boolean.valueOf(mo10063a((List) obj));
        }
    }

    /* renamed from: app.zenly.locator.e0.a.b$j */
    static final class C3584j<T, R> implements Function<T, R> {

        /* renamed from: e */
        public static final C3584j f9656e = new C3584j();

        C3584j() {
        }

        /* renamed from: a */
        public final List<UserProto$User> apply(C7180o1 o1Var) {
            C12932j.m33818b(o1Var, "it");
            return o1Var.getFriendsList();
        }
    }

    /* renamed from: app.zenly.locator.e0.a.b$k */
    static final class C3585k<T, R> implements Function<T, R> {

        /* renamed from: e */
        final /* synthetic */ C3574b f9657e;

        C3585k(C3574b bVar) {
            this.f9657e = bVar;
        }

        /* renamed from: a */
        public final C3641b apply(UserProto$User userProto$User) {
            C12932j.m33818b(userProto$User, "it");
            C3574b bVar = this.f9657e;
            String name = userProto$User.getName();
            C12932j.m33815a((Object) name, "it.name");
            bVar.f9647k0 = name;
            C2718k5 b = C3574b.m10843b(this.f9657e);
            C2879d0 d0Var = C3574b.m10849e(this.f9657e).mo8756b().f8250a;
            C12932j.m33815a((Object) d0Var, "meUserManager.meUser.user");
            Activity A = this.f9657e.mo9304A();
            C12932j.m33815a((Object) A, "requireActivity()");
            return new C3641b(b, d0Var, C3444a.m10686a(A), userProto$User);
        }
    }

    /* renamed from: app.zenly.locator.e0.a.b$l */
    public static final class C3586l implements OnCollapseListener {

        /* renamed from: a */
        final /* synthetic */ View f9658a;

        /* renamed from: b */
        final /* synthetic */ int f9659b;

        /* renamed from: c */
        final /* synthetic */ int f9660c;

        /* renamed from: d */
        final /* synthetic */ int f9661d;

        C3586l(View view, int i, int i2, int i3) {
            this.f9658a = view;
            this.f9659b = i;
            this.f9660c = i2;
            this.f9661d = i3;
        }

        public void onCollapse(float f, int i) {
            View view = this.f9658a;
            String str = "view";
            C12932j.m33815a((Object) view, str);
            AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(C3891l.user_profile_settings_button);
            String str2 = "view.user_profile_settings_button";
            C12932j.m33815a((Object) appCompatImageView, str2);
            int height = appCompatImageView.getHeight();
            float f2 = 1.0f - (((float) i) / ((float) height));
            View view2 = this.f9658a;
            C12932j.m33815a((Object) view2, str);
            ConstraintLayout constraintLayout = (ConstraintLayout) view2.findViewById(C3891l.user_profile_avatar_layout);
            C12932j.m33815a((Object) constraintLayout, "view.user_profile_avatar_layout");
            int height2 = constraintLayout.getHeight();
            int i2 = this.f9659b;
            float f3 = (((float) i2) + ((1.0f - f) * ((float) (height2 - i2)))) / ((float) height2);
            float f4 = -f;
            float f5 = ((float) (height + this.f9660c)) * f4;
            float f6 = ((float) this.f9661d) * f;
            View view3 = this.f9658a;
            C12932j.m33815a((Object) view3, str);
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) view3.findViewById(C3891l.user_profile_settings_button);
            C12932j.m33815a((Object) appCompatImageView2, str2);
            appCompatImageView2.setAlpha(f2);
            View view4 = this.f9658a;
            C12932j.m33815a((Object) view4, str);
            AppCompatImageView appCompatImageView3 = (AppCompatImageView) view4.findViewById(C3891l.user_profile_ghost_mode_button);
            String str3 = "view.user_profile_ghost_mode_button";
            C12932j.m33815a((Object) appCompatImageView3, str3);
            appCompatImageView3.setAlpha(f2);
            View view5 = this.f9658a;
            C12932j.m33815a((Object) view5, str);
            AppCompatTextView appCompatTextView = (AppCompatTextView) view5.findViewById(C3891l.user_profile_add_button);
            String str4 = "view.user_profile_add_button";
            C12932j.m33815a((Object) appCompatTextView, str4);
            appCompatTextView.setAlpha(f2);
            View view6 = this.f9658a;
            C12932j.m33815a((Object) view6, str);
            AppCompatImageView appCompatImageView4 = (AppCompatImageView) view6.findViewById(C3891l.user_profile_phonecall_button);
            String str5 = "view.user_profile_phonecall_button";
            C12932j.m33815a((Object) appCompatImageView4, str5);
            appCompatImageView4.setAlpha(f2);
            View view7 = this.f9658a;
            C12932j.m33815a((Object) view7, str);
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) view7.findViewById(C3891l.user_profile_state_text);
            String str6 = "view.user_profile_state_text";
            C12932j.m33815a((Object) appCompatTextView2, str6);
            appCompatTextView2.setAlpha(f2);
            View view8 = this.f9658a;
            C12932j.m33815a((Object) view8, str);
            FrameLayout frameLayout = (FrameLayout) view8.findViewById(C3891l.user_profile_state_layout);
            C12932j.m33815a((Object) frameLayout, "view.user_profile_state_layout");
            frameLayout.setAlpha(f2);
            View view9 = this.f9658a;
            C12932j.m33815a((Object) view9, str);
            AppCompatImageView appCompatImageView5 = (AppCompatImageView) view9.findViewById(C3891l.user_profile_settings_button);
            C12932j.m33815a((Object) appCompatImageView5, str2);
            appCompatImageView5.setTranslationY(f5);
            View view10 = this.f9658a;
            C12932j.m33815a((Object) view10, str);
            AppCompatImageView appCompatImageView6 = (AppCompatImageView) view10.findViewById(C3891l.user_profile_ghost_mode_button);
            C12932j.m33815a((Object) appCompatImageView6, str3);
            appCompatImageView6.setTranslationY(f5);
            View view11 = this.f9658a;
            C12932j.m33815a((Object) view11, str);
            AppCompatImageView appCompatImageView7 = (AppCompatImageView) view11.findViewById(C3891l.user_profile_phonecall_button);
            C12932j.m33815a((Object) appCompatImageView7, str5);
            appCompatImageView7.setTranslationY(f5);
            View view12 = this.f9658a;
            C12932j.m33815a((Object) view12, str);
            AppCompatTextView appCompatTextView3 = (AppCompatTextView) view12.findViewById(C3891l.user_profile_add_button);
            C12932j.m33815a((Object) appCompatTextView3, str4);
            appCompatTextView3.setTranslationY(f5);
            View view13 = this.f9658a;
            C12932j.m33815a((Object) view13, str);
            AppCompatTextView appCompatTextView4 = (AppCompatTextView) view13.findViewById(C3891l.user_profile_state_text);
            C12932j.m33815a((Object) appCompatTextView4, str6);
            appCompatTextView4.setTranslationY(f5);
            View view14 = this.f9658a;
            C12932j.m33815a((Object) view14, str);
            ConstraintLayout constraintLayout2 = (ConstraintLayout) view14.findViewById(C3891l.user_profile_avatar_layout);
            constraintLayout2.setScaleX(f3);
            constraintLayout2.setScaleY(f3);
            constraintLayout2.setTranslationY(f4 * ((float) this.f9660c));
            View view15 = this.f9658a;
            C12932j.m33815a((Object) view15, str);
            AppCompatTextView appCompatTextView5 = (AppCompatTextView) view15.findViewById(C3891l.user_profile_name);
            float f7 = 0.0f;
            appCompatTextView5.setPivotX(0.0f);
            appCompatTextView5.setPivotY(((float) appCompatTextView5.getHeight()) / 2.0f);
            float f8 = 1.0f - ((f * 4.0f) / 28.0f);
            appCompatTextView5.setScaleX(f8);
            appCompatTextView5.setScaleY(f8);
            View view16 = this.f9658a;
            C12932j.m33815a((Object) view16, str);
            AppCompatTextView appCompatTextView6 = (AppCompatTextView) view16.findViewById(C3891l.user_profile_username_link);
            String str7 = "view.user_profile_username_link";
            C12932j.m33815a((Object) appCompatTextView6, str7);
            if (appCompatTextView6.getVisibility() == 8) {
                f7 = f6;
            }
            appCompatTextView5.setTranslationY(f7 + f5);
            View view17 = this.f9658a;
            C12932j.m33815a((Object) view17, str);
            AppCompatTextView appCompatTextView7 = (AppCompatTextView) view17.findViewById(C3891l.user_profile_username_link);
            C12932j.m33815a((Object) appCompatTextView7, str7);
            appCompatTextView7.setTranslationY(f5 - f6);
        }
    }

    /* renamed from: app.zenly.locator.e0.a.b$m */
    public static final class C3587m extends C10744c {

        /* renamed from: a */
        final /* synthetic */ C3574b f9662a;

        /* renamed from: b */
        final /* synthetic */ View f9663b;

        C3587m(C3574b bVar, View view) {
            this.f9662a = bVar;
            this.f9663b = view;
        }

        /* renamed from: a */
        public void mo7859a(View view, int i) {
            C12932j.m33818b(view, "bottomSheet");
            if (C3574b.m10848d(this.f9662a).mo30689c() == 5) {
                C3574b.m10848d(this.f9662a).mo14019a((C10744c) null);
                this.f9662a.mo23946k().mo23997a((C8819d) this.f9662a);
            }
        }

        /* renamed from: a */
        public void mo7858a(View view, float f) {
            C12932j.m33818b(view, "bottomSheet");
            float f2 = -C12973l.m33892c(C12973l.m33889b(f, -1.0f), 0.0f);
            View view2 = this.f9663b;
            C12932j.m33815a((Object) view2, "view");
            View findViewById = view2.findViewById(C3891l.user_profile_background);
            C12932j.m33815a((Object) findViewById, "view.user_profile_background");
            View findViewById2 = findViewById.findViewById(C3891l.user_profile_background);
            C12932j.m33815a((Object) findViewById2, "view.user_profile_backgr…d.user_profile_background");
            findViewById2.setAlpha(1.0f - f2);
            this.f9662a.m10851f(f2 == 0.0f);
        }
    }

    /* renamed from: app.zenly.locator.e0.a.b$n */
    static final class C3588n implements Runnable {

        /* renamed from: e */
        final /* synthetic */ C3574b f9664e;

        C3588n(C3574b bVar) {
            this.f9664e = bVar;
        }

        public final void run() {
            C3574b.m10848d(this.f9664e).mo30690c(4);
        }
    }

    /* renamed from: app.zenly.locator.e0.a.b$o */
    static final class C3589o<T, R> implements Function<T, R> {

        /* renamed from: e */
        final /* synthetic */ C3574b f9665e;

        C3589o(C3574b bVar) {
            this.f9665e = bVar;
        }

        /* renamed from: a */
        public final boolean mo10067a(Map<String, C2936a0> map) {
            C12932j.m33818b(map, "it");
            return map.containsKey(this.f9665e.getUserUuid());
        }

        public /* bridge */ /* synthetic */ Object apply(Object obj) {
            return Boolean.valueOf(mo10067a((Map) obj));
        }
    }

    /* renamed from: app.zenly.locator.e0.a.b$p */
    static final class C3590p extends C12933k implements Function0<C12767a<UserProto$User>> {

        /* renamed from: f */
        final /* synthetic */ C3574b f9666f;

        C3590p(C3574b bVar) {
            this.f9666f = bVar;
            super(0);
        }

        public final C12767a<UserProto$User> invoke() {
            return C5448c.m15478a().userPublicStream(this.f9666f.getUserUuid()).mo36466c((ObservableSource<? extends T>) C12279e.m32633q()).mo36505k();
        }
    }

    /* renamed from: app.zenly.locator.e0.a.b$q */
    static final class C3591q extends C12933k implements Function0<String> {

        /* renamed from: f */
        final /* synthetic */ Bundle f9667f;

        C3591q(Bundle bundle) {
            this.f9667f = bundle;
            super(0);
        }

        public final String invoke() {
            String string = this.f9667f.getString("args:user_uuid");
            if (string != null) {
                return string;
            }
            C12932j.m33814a();
            throw null;
        }
    }

    static {
        Class<C3574b> cls = C3574b.class;
        C12941s sVar = new C12941s(C12946x.m33834a((Class) cls), "gesturedType", "getGesturedType()Lapp/zenly/locator/core/Analytics$ProfileOtherOpenedGestureType;");
        C12946x.m33839a((C12940r) sVar);
        C12941s sVar2 = new C12941s(C12946x.m33834a((Class) cls), "userUuid", "getUserUuid()Ljava/lang/String;");
        C12946x.m33839a((C12940r) sVar2);
        C12941s sVar3 = new C12941s(C12946x.m33834a((Class) cls), "userObservable", "getUserObservable()Lio/reactivex/observables/ConnectableObservable;");
        C12946x.m33839a((C12940r) sVar3);
        f9624l0 = new KProperty[]{sVar, sVar2, sVar3};
    }

    public C3574b(Bundle bundle) {
        C12932j.m33818b(bundle, "args");
        super(bundle);
        this.f9630T = C12896f.m33751a(new C3577c(bundle));
        this.f9631U = C12896f.m33751a(new C3591q(bundle));
        this.f9632V = C12896f.m33751a(new C3590p(this));
        this.f9634X = true;
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public final C5359p m10837B() {
        Lazy lazy = this.f9630T;
        KProperty kProperty = f9624l0[0];
        return (C5359p) lazy.getValue();
    }

    /* renamed from: C */
    private final C12767a<UserProto$User> m10838C() {
        Lazy lazy = this.f9632V;
        KProperty kProperty = f9624l0[2];
        return (C12767a) lazy.getValue();
    }

    /* renamed from: a */
    public static final C3574b m10839a(String str, C5359p pVar) {
        return f9625m0.mo10053a(str, pVar);
    }

    /* renamed from: a */
    public static final /* synthetic */ C3592c m10840a(C3574b bVar) {
        C3592c cVar = bVar.f9635Y;
        if (cVar != null) {
            return cVar;
        }
        C12932j.m33820c("dialogLauncher");
        throw null;
    }

    /* renamed from: b */
    public static final /* synthetic */ C2718k5 m10843b(C3574b bVar) {
        C2718k5 k5Var = bVar.f9641e0;
        if (k5Var != null) {
            return k5Var;
        }
        C12932j.m33820c("friendsManager");
        throw null;
    }

    /* renamed from: d */
    public static final C3574b m10847d(String str) {
        return f9625m0.mo10052a(str);
    }

    /* renamed from: d */
    public static final /* synthetic */ ScreenBarBottomSheetBehavior m10848d(C3574b bVar) {
        ScreenBarBottomSheetBehavior<View> screenBarBottomSheetBehavior = bVar.f9645i0;
        if (screenBarBottomSheetBehavior != null) {
            return screenBarBottomSheetBehavior;
        }
        C12932j.m33820c("headerBottomSheetBehavior");
        throw null;
    }

    /* renamed from: e */
    public static final /* synthetic */ MeUserManager m10849e(C3574b bVar) {
        MeUserManager meUserManager = bVar.f9640d0;
        if (meUserManager != null) {
            return meUserManager;
        }
        C12932j.m33820c("meUserManager");
        throw null;
    }

    /* renamed from: f */
    public static final /* synthetic */ C3615f m10850f(C3574b bVar) {
        C3615f fVar = bVar.f9626P;
        if (fVar != null) {
            return fVar;
        }
        C12932j.m33820c("navigation");
        throw null;
    }

    /* access modifiers changed from: private */
    public final String getUserUuid() {
        Lazy lazy = this.f9631U;
        KProperty kProperty = f9624l0[1];
        return (String) lazy.getValue();
    }

    /* renamed from: j */
    public static final /* synthetic */ String m10855j(C3574b bVar) {
        String str = bVar.f9647k0;
        if (str != null) {
            return str;
        }
        C12932j.m33820c("username");
        throw null;
    }

    public void onWindowInsetsChanged(View view, Rect rect) {
        C12932j.m33818b(view, "view");
        C12932j.m33818b(rect, "insets");
        super.onWindowInsetsChanged(view, rect);
        ScreenBarBottomSheetBehavior<View> screenBarBottomSheetBehavior = this.f9645i0;
        if (screenBarBottomSheetBehavior != null) {
            screenBarBottomSheetBehavior.mo14018a(rect);
        } else {
            C12932j.m33820c("headerBottomSheetBehavior");
            throw null;
        }
    }

    /* renamed from: w */
    public boolean mo7339w() {
        return this.f9646j0;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public final void m10851f(boolean z) {
        if (this.f9646j0 != z) {
            this.f9646j0 = z;
            if (!this.f9646j0) {
                C3896a1 a = C3896a1.f10317n.mo10527a();
                String userUuid = getUserUuid();
                C12932j.m33815a((Object) userUuid, "userUuid");
                C3896a1.m11468a(a, userUuid, false, 0, 4, null);
            }
            C3615f fVar = this.f9626P;
            if (fVar != null) {
                fVar.mo10095a((ZenlyController) this);
            } else {
                C12932j.m33820c("navigation");
                throw null;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo7053d(View view) {
        C12932j.m33818b(view, "view");
        this.f9629S.mo36401a();
        C3603e eVar = this.f9643g0;
        if (eVar != null) {
            eVar.mo10082b();
            C3615f fVar = this.f9626P;
            if (fVar != null) {
                fVar.mo10092a((Activity) null);
                super.mo7053d(view);
                return;
            }
            C12932j.m33820c("navigation");
            throw null;
        }
        C12932j.m33820c("headerPresenter");
        throw null;
    }

    /* renamed from: e */
    public final void mo10051e(boolean z) {
        this.f9633W = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7052b(View view) {
        C6272z1 z1Var;
        C12932j.m33818b(view, "view");
        super.mo7052b(view);
        C3615f fVar = this.f9626P;
        String str = "navigation";
        if (fVar != null) {
            try {
                C8819d l = mo23947l();
                if (l != null) {
                    z1Var = (C6272z1) l;
                    fVar.mo10096a(z1Var);
                    C3615f fVar2 = this.f9626P;
                    if (fVar2 != null) {
                        fVar2.mo10092a(mo23920b());
                        C12774b bVar = C12774b.f33320a;
                        C12767a C = m10838C();
                        C12932j.m33815a((Object) C, "userObservable");
                        FriendStore friendStore = this.f9637a0;
                        if (friendStore != null) {
                            C12279e i = friendStore.friendsMap().mo36501i(new C3579e(this));
                            C12932j.m33815a((Object) i, "friendStore.friendsMap()…t.containsKey(userUuid) }");
                            Disposable d = C12279e.m32610a((ObservableSource<? extends T1>) C, (ObservableSource<? extends T2>) i, (BiFunction<? super T1, ? super T2, ? extends R>) new C3578d<Object,Object,Object>()).mo36428a((C12286f) this.f9627Q.getMainThread().mo6569a("onAttach")).mo36476d((Consumer<? super T>) new C3580f<Object>(this));
                            C12932j.m33815a((Object) d, "Observables.combineLates…          }\n            }");
                            C12773a.m33432a(d, this.f9629S);
                            C3603e eVar = this.f9643g0;
                            if (eVar != null) {
                                eVar.mo10081a();
                                C11705b bVar2 = this.f9636Z;
                                if (bVar2 != null) {
                                    C12773a.m33432a(bVar2.mo34464b(), this.f9629S);
                                    Disposable r = m10838C().mo36946r();
                                    C12932j.m33815a((Object) r, "userObservable.connect()");
                                    C12773a.m33432a(r, this.f9629S);
                                    return;
                                }
                                C12932j.m33820c("friendsListAdapter");
                                throw null;
                            }
                            C12932j.m33820c("headerPresenter");
                            throw null;
                        }
                        C12932j.m33820c("friendStore");
                        throw null;
                    }
                    C12932j.m33820c(str);
                    throw null;
                }
                throw new TypeCastException("null cannot be cast to non-null type app.zenly.locator.navigation.NavigationController");
            } catch (ClassCastException unused) {
                z1Var = null;
            }
        } else {
            C12932j.m33820c(str);
            throw null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo7066c(View view) {
        C12932j.m33818b(view, "view");
        this.f9628R.mo36401a();
        ScreenBarBottomSheetBehavior<View> screenBarBottomSheetBehavior = this.f9645i0;
        if (screenBarBottomSheetBehavior != null) {
            screenBarBottomSheetBehavior.mo14020e();
            m10851f(false);
            super.mo7066c(view);
            return;
        }
        C12932j.m33820c("headerBottomSheetBehavior");
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7065a(Context context) {
        C12932j.m33818b(context, "context");
        super.mo7065a(context);
        this.f9637a0 = C3015a.m9526a(context).provideFriendStore();
        this.f9638b0 = C3015a.m9526a(context).provideFriendRequestStore();
        this.f9639c0 = C3015a.m9526a(context).provideFriendshipStore();
        this.f9640d0 = C2666b.m9049a(context).mo8764b();
        this.f9641e0 = C2666b.m9049a(context).mo8763a();
        this.f9626P = new C3615f(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo7054a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        C12932j.m33818b(layoutInflater2, "inflater");
        C12932j.m33818b(viewGroup2, "container");
        mo23912a(C8828i.RETAIN_DETACH);
        View inflate = layoutInflater2.inflate(R.layout.controller_profile_main, viewGroup2, false);
        ZenlyCore a = C5448c.m15478a();
        C12767a C = m10838C();
        String str = "userObservable";
        C12932j.m33815a((Object) C, str);
        this.f9642f0 = new C3617g(C);
        Activity b = mo23920b();
        if (b != null) {
            C12932j.m33815a((Object) b, "activity!!");
            C3615f fVar = this.f9626P;
            String str2 = "navigation";
            if (fVar != null) {
                C3617g gVar = this.f9642f0;
                String str3 = "statusManager";
                if (gVar != null) {
                    this.f9635Y = new C3592c(b, fVar, a, gVar);
                    FriendStore friendStore = this.f9637a0;
                    String str4 = "friendStore";
                    if (friendStore != null) {
                        C12279e i = friendStore.friendsMap().mo36501i(new C3589o(this));
                        C12932j.m33815a((Object) inflate, "view");
                        String userUuid = getUserUuid();
                        String str5 = "userUuid";
                        C12932j.m33815a((Object) userUuid, str5);
                        C2538c0 a2 = C2538c0.m8837a(mo23920b());
                        C12932j.m33815a((Object) a2, "InviteManager.from(activity)");
                        C5499a aVar = C5498a.f14119e;
                        Context context = inflate.getContext();
                        String str6 = "view.context";
                        C12932j.m33815a((Object) context, str6);
                        C5498a a3 = aVar.mo13125a(context);
                        C3615f fVar2 = this.f9626P;
                        if (fVar2 != null) {
                            C3592c cVar = this.f9635Y;
                            if (cVar != null) {
                                C12767a C2 = m10838C();
                                C12932j.m33815a((Object) C2, str);
                                C3617g gVar2 = this.f9642f0;
                                if (gVar2 != null) {
                                    C12279e a4 = gVar2.mo10105a();
                                    C12932j.m33815a((Object) i, "isFriendObservable");
                                    FriendshipStore friendshipStore = this.f9639c0;
                                    String str7 = "friendshipsStore";
                                    if (friendshipStore != null) {
                                        String userUuid2 = getUserUuid();
                                        C12932j.m33815a((Object) userUuid2, str5);
                                        C12279e i2 = friendshipStore.friendship(userUuid2).mo36501i(C3581g.f9653e).mo36485d(C3245z.m10281a()).mo36501i(C3582h.f9654e);
                                        C12932j.m33815a((Object) i2, "friendshipsStore.friends…map { it.toTimeMillis() }");
                                        FriendRequestStore friendRequestStore = this.f9638b0;
                                        String str8 = "friendRequestStore";
                                        if (friendRequestStore != null) {
                                            C12767a aVar2 = C2;
                                            C12279e i3 = friendRequestStore.friendRequests().mo36501i(new C3583i(this));
                                            C12932j.m33815a((Object) i3, "friendRequestStore.frien…s.pending }\n            }");
                                            C12767a aVar3 = aVar2;
                                            C3592c cVar2 = cVar;
                                            C12279e eVar = i3;
                                            ZenlyCore zenlyCore = a;
                                            String str9 = str5;
                                            C12767a aVar4 = aVar3;
                                            String str10 = str6;
                                            C3603e eVar2 = r5;
                                            C12279e eVar3 = a4;
                                            C12279e eVar4 = i;
                                            String str11 = str;
                                            C3603e eVar5 = new C3603e(inflate, userUuid, a2, a3, fVar2, cVar2, aVar4, eVar3, eVar4, i2, eVar, this.f9627Q.getMainThread().mo6569a("ProfileOtherHeaderPresenter"));
                                            this.f9643g0 = eVar2;
                                            C11727c cVar3 = new C11727c(C12846n.m33635a(C3619h.class));
                                            C11700c cVar4 = new C11700c();
                                            Context context2 = inflate.getContext();
                                            String str12 = str10;
                                            C12932j.m33815a((Object) context2, str12);
                                            cVar4.mo34449b(new C3576b(this, context2));
                                            this.f9628R.add(cVar4);
                                            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(inflate.getContext(), 2132083208);
                                            C1342b a5 = this.f9627Q.getComputation().mo6569a("prefetcher");
                                            LayoutInflater from = LayoutInflater.from(contextThemeWrapper);
                                            C12932j.m33815a((Object) from, "LayoutInflater.from(context)");
                                            RecyclerView recyclerView = new RecyclerView(contextThemeWrapper);
                                            recyclerView.setLayoutManager(new LinearLayoutManager(contextThemeWrapper));
                                            C11731a aVar5 = new C11731a(cVar3, a5, from, recyclerView);
                                            cVar3.mo34543a((ViewHolderPrefetcher) aVar5);
                                            C12271b a6 = aVar5.mo34549a(C12835h0.m33548a(C12954o.m33853a(C3619h.PROFILE_OTHER_SECTION_FRIENDS, Integer.valueOf(1)), C12954o.m33853a(C3619h.PROFILE_OTHER_FRIEND, Integer.valueOf(7)))).mo36338a();
                                            Disposable b2 = a6.mo36351b();
                                            C12932j.m33815a((Object) b2, "prefetchDoneCompletable.subscribe()");
                                            C12773a.m33432a(b2, this.f9628R);
                                            EventDispatcher a7 = cVar4.mo34447a();
                                            C12932j.m33815a((Object) a7, "bus.eventDispatcher");
                                            String str13 = "friendList";
                                            C1342b a8 = this.f9627Q.getComputation().mo6569a(str13);
                                            C1342b a9 = this.f9627Q.getMainThread().mo6569a(str13);
                                            Context context3 = inflate.getContext();
                                            C12932j.m33815a((Object) context3, str12);
                                            C3201f e = C3205g.m10196e(C7713f.m18776a(context3));
                                            C12932j.m33815a((Object) a6, "prefetchDoneCompletable");
                                            C12767a C3 = m10838C();
                                            C12932j.m33815a((Object) C3, str11);
                                            ZenlyCore zenlyCore2 = zenlyCore;
                                            C12279e i4 = zenlyCore2.userPublicFriendsState(getUserUuid()).mo36501i(C3584j.f9656e);
                                            C12932j.m33815a((Object) i4, "core.userPublicFriendsSt…d).map { it.friendsList }");
                                            C12279e i5 = m10838C().mo36501i(new C3585k(this));
                                            C12932j.m33815a((Object) i5, "userObservable.map {\n   …      )\n                }");
                                            C12279e timeTogetherFriendState = zenlyCore2.timeTogetherFriendState(getUserUuid());
                                            C12932j.m33815a((Object) timeTogetherFriendState, "core.timeTogetherFriendState(userUuid)");
                                            FriendshipStore friendshipStore2 = this.f9639c0;
                                            if (friendshipStore2 != null) {
                                                String userUuid3 = getUserUuid();
                                                C12932j.m33815a((Object) userUuid3, str9);
                                                C12279e friendship = friendshipStore2.friendship(userUuid3);
                                                FriendStore friendStore2 = this.f9637a0;
                                                if (friendStore2 != null) {
                                                    FriendRequestStore friendRequestStore2 = this.f9638b0;
                                                    if (friendRequestStore2 != null) {
                                                        C3625a aVar6 = new C3625a(e, a6, C3, i4, i5, timeTogetherFriendState, friendship, friendStore2, friendRequestStore2);
                                                        C11705b bVar = new C11705b(cVar3, a7, a8, a9, C12846n.m33635a(aVar6), null, 32, null);
                                                        this.f9636Z = bVar;
                                                        C6163b bVar2 = ScreenBarBottomSheetBehavior.f15476b0;
                                                        ScreenBarLayout screenBarLayout = (ScreenBarLayout) inflate.findViewById(C3891l.user_profile_screen_bar_layout);
                                                        C12932j.m33815a((Object) screenBarLayout, "view.user_profile_screen_bar_layout");
                                                        FrameLayout frameLayout = (FrameLayout) inflate.findViewById(C3891l.user_profile_bottom_sheet);
                                                        C12932j.m33815a((Object) frameLayout, "view.user_profile_bottom_sheet");
                                                        this.f9645i0 = C6163b.m17095a(bVar2, screenBarLayout, null, null, frameLayout, false, 22, null);
                                                        ScreenBarBottomSheetBehavior<View> screenBarBottomSheetBehavior = this.f9645i0;
                                                        String str14 = "headerBottomSheetBehavior";
                                                        if (screenBarBottomSheetBehavior != null) {
                                                            screenBarBottomSheetBehavior.mo30687b(true);
                                                            ScreenBarBottomSheetBehavior<View> screenBarBottomSheetBehavior2 = this.f9645i0;
                                                            if (screenBarBottomSheetBehavior2 != null) {
                                                                screenBarBottomSheetBehavior2.mo30690c(5);
                                                                int dimensionPixelSize = inflate.getResources().getDimensionPixelSize(R.dimen.spacing_75);
                                                                int dimensionPixelSize2 = inflate.getResources().getDimensionPixelSize(R.dimen.spacing_100);
                                                                ((ScreenBarLayout) inflate.findViewById(C3891l.user_profile_screen_bar_layout)).setOnCollapseListener(new C3586l(inflate, inflate.getResources().getDimensionPixelSize(R.dimen.avatar_size_150) + inflate.getResources().getDimensionPixelSize(R.dimen.spacing_25) + dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize));
                                                                ScreenBarBottomSheetBehavior<View> screenBarBottomSheetBehavior3 = this.f9645i0;
                                                                if (screenBarBottomSheetBehavior3 != null) {
                                                                    screenBarBottomSheetBehavior3.mo14019a((C10744c) new C3587m(this, inflate));
                                                                    inflate.postDelayed(new C3588n(this), 150);
                                                                    RecyclerView recyclerView2 = (RecyclerView) inflate.findViewById(C3891l.user_profile_friends_list);
                                                                    C12932j.m33815a((Object) recyclerView2, "view.user_profile_friends_list");
                                                                    this.f9644h0 = recyclerView2;
                                                                    RecyclerView recyclerView3 = this.f9644h0;
                                                                    String str15 = "recyclerView";
                                                                    if (recyclerView3 != null) {
                                                                        recyclerView3.setHasFixedSize(true);
                                                                        RecyclerView recyclerView4 = this.f9644h0;
                                                                        if (recyclerView4 != null) {
                                                                            recyclerView4.setLayoutManager(new LinearLayoutManager(mo23920b()));
                                                                            RecyclerView recyclerView5 = this.f9644h0;
                                                                            if (recyclerView5 != null) {
                                                                                C11705b bVar3 = this.f9636Z;
                                                                                if (bVar3 != null) {
                                                                                    recyclerView5.setAdapter(bVar3);
                                                                                    RecyclerView recyclerView6 = this.f9644h0;
                                                                                    if (recyclerView6 != null) {
                                                                                        recyclerView6.setItemAnimator(null);
                                                                                        return inflate;
                                                                                    }
                                                                                    C12932j.m33820c(str15);
                                                                                    throw null;
                                                                                }
                                                                                C12932j.m33820c("friendsListAdapter");
                                                                                throw null;
                                                                            }
                                                                            C12932j.m33820c(str15);
                                                                            throw null;
                                                                        }
                                                                        C12932j.m33820c(str15);
                                                                        throw null;
                                                                    }
                                                                    C12932j.m33820c(str15);
                                                                    throw null;
                                                                }
                                                                C12932j.m33820c(str14);
                                                                throw null;
                                                            }
                                                            C12932j.m33820c(str14);
                                                            throw null;
                                                        }
                                                        C12932j.m33820c(str14);
                                                        throw null;
                                                    }
                                                    C12932j.m33820c(str8);
                                                    throw null;
                                                }
                                                C12932j.m33820c(str4);
                                                throw null;
                                            }
                                            C12932j.m33820c(str7);
                                            throw null;
                                        }
                                        C12932j.m33820c(str8);
                                        throw null;
                                    }
                                    C12932j.m33820c(str7);
                                    throw null;
                                }
                                C12932j.m33820c(str3);
                                throw null;
                            }
                            C12932j.m33820c("dialogLauncher");
                            throw null;
                        }
                        C12932j.m33820c(str2);
                        throw null;
                    }
                    C12932j.m33820c(str4);
                    throw null;
                }
                C12932j.m33820c(str3);
                throw null;
            }
            C12932j.m33820c(str2);
            throw null;
        }
        C12932j.m33814a();
        throw null;
    }

    /* renamed from: a */
    public void mo8182a(int i, int i2, Intent intent) {
        super.mo8182a(i, i2, intent);
        if (i == 401 && i2 == -1) {
            C3617g gVar = this.f9642f0;
            if (gVar != null) {
                gVar.mo10106a(true);
            } else {
                C12932j.m33820c("statusManager");
                throw null;
            }
        }
    }
}
