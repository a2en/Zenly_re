package app.zenly.locator.onboarding;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextWatcher;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C1074l;
import app.zenly.android.feature.base.model.AvatarLoader;
import app.zenly.android.feature.polenta.widget.ScreenBar;
import app.zenly.android.feature.polenta.widget.SearchBar;
import app.zenly.locator.R;
import app.zenly.locator.contactpicker.adapter.ContactAdapter;
import app.zenly.locator.contactpicker.adapter.ContactAdapter.C2399c;
import app.zenly.locator.contactpicker.adapter.ContactAdapter.Listener;
import app.zenly.locator.contactpicker.adapter.p061m.C2418a;
import app.zenly.locator.contactpicker.sticky_header_recycler_view.C2420b;
import app.zenly.locator.core.glide.C2477e;
import app.zenly.locator.core.invitations.C2538c0;
import app.zenly.locator.core.invitations.C2545e0;
import app.zenly.locator.core.invitations.p068g0.C2594d;
import app.zenly.locator.core.manager.p069di.C2666b;
import app.zenly.locator.core.store.api.C2935a;
import app.zenly.locator.core.store.api.C2966p;
import app.zenly.locator.core.store.api.C2976r;
import app.zenly.locator.core.store.api.FriendRequestStore;
import app.zenly.locator.core.store.api.FriendStore;
import app.zenly.locator.core.store.p071di.C3015a;
import app.zenly.locator.core.store.p071di.StoreModule;
import app.zenly.locator.core.util.C3197d;
import app.zenly.locator.core.util.C3201f;
import app.zenly.locator.core.util.C3227n;
import app.zenly.locator.decision.C3444a;
import app.zenly.locator.decision.p082b.p083u.C3498n;
import app.zenly.locator.experimental.referrer.C3756e;
import app.zenly.locator.experimental.referrer.C3757f;
import app.zenly.locator.onboarding.BaseSignupController.SignupListener;
import app.zenly.locator.p135r.p137b1.C5139b;
import app.zenly.locator.p135r.p137b1.C5142c;
import app.zenly.locator.p135r.p137b1.C5143d;
import app.zenly.locator.p135r.p137b1.C5144e;
import app.zenly.locator.p135r.p137b1.C5145f;
import app.zenly.locator.p135r.p138c1.C5151b;
import app.zenly.locator.p143s.C5343a;
import app.zenly.locator.p143s.C5407g;
import app.zenly.locator.p143s.p146j.C5432b;
import app.zenly.locator.p143s.p148l.C5448c;
import app.zenly.locator.p143s.p155r.C5498a;
import app.zenly.locator.p143s.p155r.C5498a.C5500b;
import app.zenly.locator.p143s.p155r.C5498a.C5501c;
import app.zenly.locator.p208y.C6300h;
import com.airbnb.lottie.LottieAnimationView;
import com.android.volley.toolbox.C8733j;
import com.bluelinelabs.conductor.C8829e;
import com.bluelinelabs.conductor.ControllerChangeHandler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import p213co.znly.models.C7339i;
import p213co.znly.models.C7434p;
import p213co.znly.models.C7434p.C7436b;
import p213co.znly.models.UserProto$User;
import p250f.p251a.p252a.p253a.p260i.C7689e;
import p250f.p251a.p252a.p263b.p264a.p265d.C7697b;
import p250f.p251a.p252a.p263b.p264a.p272j.C7713f;
import p389io.reactivex.C12273d;
import p389io.reactivex.C12279e;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.functions.Action;
import p389io.reactivex.functions.BiFunction;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.functions.Function;
import p389io.reactivex.functions.Predicate;
import p389io.reactivex.p390h.p392c.C12295a;
import p389io.reactivex.p406n.C12785a;
import p389io.reactivex.schedulers.C12802a;

/* renamed from: app.zenly.locator.onboarding.d3 */
public class C4783d3 extends BaseSignupController {

    /* renamed from: A0 */
    private boolean f12643A0;

    /* renamed from: B0 */
    private C12785a<Boolean> f12644B0;
    /* access modifiers changed from: private */

    /* renamed from: T */
    public int f12645T;

    /* renamed from: U */
    private int f12646U;

    /* renamed from: V */
    private boolean f12647V;

    /* renamed from: W */
    private boolean f12648W;

    /* renamed from: X */
    private AtomicBoolean f12649X;

    /* renamed from: Y */
    private int f12650Y;

    /* renamed from: Z */
    private int f12651Z;

    /* renamed from: a0 */
    private int f12652a0;

    /* renamed from: b0 */
    private C3201f<C5139b> f12653b0;

    /* renamed from: c0 */
    private View f12654c0;

    /* renamed from: d0 */
    private ScreenBar f12655d0;

    /* renamed from: e0 */
    private SearchBar f12656e0;

    /* renamed from: f0 */
    private RecyclerView f12657f0;
    /* access modifiers changed from: private */

    /* renamed from: g0 */
    public ContactAdapter f12658g0;

    /* renamed from: h0 */
    private ImageButton f12659h0;

    /* renamed from: i0 */
    private TextView f12660i0;

    /* renamed from: j0 */
    private ProgressBar f12661j0;

    /* renamed from: k0 */
    private View f12662k0;

    /* renamed from: l0 */
    private int f12663l0;

    /* renamed from: m0 */
    private TextView f12664m0;

    /* renamed from: n0 */
    private Handler f12665n0;

    /* renamed from: o0 */
    private Runnable f12666o0;

    /* renamed from: p0 */
    private boolean f12667p0;

    /* renamed from: q0 */
    private boolean f12668q0;

    /* renamed from: r0 */
    private AtomicBoolean f12669r0;

    /* renamed from: s0 */
    private AtomicBoolean f12670s0;

    /* renamed from: t0 */
    private LottieAnimationView f12671t0;

    /* renamed from: u0 */
    private View f12672u0;

    /* renamed from: v0 */
    private View f12673v0;

    /* renamed from: w0 */
    private final C12275b f12674w0;

    /* renamed from: x0 */
    private FriendStore f12675x0;

    /* renamed from: y0 */
    private FriendRequestStore f12676y0;
    /* access modifiers changed from: private */

    /* renamed from: z0 */
    public C6300h f12677z0;

    /* renamed from: app.zenly.locator.onboarding.d3$a */
    class C4784a extends C7689e {
        C4784a() {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C4783d3.this.f12658g0.getFilter().filter(charSequence);
        }
    }

    /* renamed from: app.zenly.locator.onboarding.d3$b */
    class C4785b extends ContactAdapter {
        C4785b(C4783d3 d3Var, AvatarLoader avatarLoader, Activity activity, C12275b bVar, C2538c0 c0Var, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
            super(avatarLoader, activity, bVar, c0Var, z, z2, z3, z4, z5);
        }

        /* renamed from: a */
        public void onBindHeaderViewHolder(C2418a aVar, int i) {
            long headerId = getHeaderId(i);
            if (headerId == ((long) C5142c.CONTACTS.ordinal())) {
                aVar.f7259a.setText(R.string.z_track1exp1var1_signup_inviteFriends_contacts);
            } else if (headerId == ((long) C5142c.BROADCAST_INVITE.ordinal())) {
                aVar.f7259a.setText(R.string.add_friends_section_broadcastedInvite_title);
            }
        }
    }

    /* renamed from: app.zenly.locator.onboarding.d3$c */
    class C4786c extends C2399c {
        C4786c() {
        }

        public void onItemAddClick(C5139b bVar) {
            C4783d3.this.f12677z0.mo14151a(true);
            if (C4783d3.this.f12645T == 40) {
                C5343a.m15160U().mo12792G();
            }
            C4783d3 d3Var = C4783d3.this;
            d3Var.m14003a((Context) d3Var.mo9304A(), true);
        }

        public void onItemsSelected(int i) {
            C4783d3.this.m14022c(i);
        }
    }

    /* renamed from: app.zenly.locator.onboarding.d3$d */
    static /* synthetic */ class C4787d {

        /* renamed from: a */
        static final /* synthetic */ int[] f12680a = new int[C7436b.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                co.znly.models.p$b[] r0 = p213co.znly.models.C7434p.C7436b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f12680a = r0
                int[] r0 = f12680a     // Catch:{ NoSuchFieldError -> 0x0014 }
                co.znly.models.p$b r1 = p213co.znly.models.C7434p.C7436b.SUGGESTTYPE_USER     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f12680a     // Catch:{ NoSuchFieldError -> 0x001f }
                co.znly.models.p$b r1 = p213co.znly.models.C7434p.C7436b.SUGGESTTYPE_CONTACT     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.onboarding.C4783d3.C4787d.<clinit>():void");
        }
    }

    /* renamed from: app.zenly.locator.onboarding.d3$e */
    private enum C4788e {
        STEP_0(R.string.signup_contactloader_title_loadingcontacts, C8733j.DEFAULT_IMAGE_TIMEOUT_MS, 0),
        STEP_1(R.string.signup_contactloader_title_gettingcontacts, 2000, 500),
        STEP_2(R.string.signup_contactloader_title_lotofcontacts, 2000, 600),
        STEP_3(R.string.signup_contactloader_title_peoplelikeyou, 2000, 650),
        STEP_4(R.string.signup_contactloader_title_manycontacts, 2000, 700),
        STEP_5(R.string.signup_contactloader_title_cantyouhave300, 2000, 750),
        STEP_6(R.string.signup_contactloader_title_amazing, 2000, 800),
        STEP_7(R.string.signup_contactloader_title_killourservers, 2000, 850),
        STEP_8(R.string.signup_contactloader_title_realcelebrity, 2000, 900),
        STEP_9(R.string.signup_contactloader_title_mindblown, 2000, 950),
        STEP_10(R.string.signup_contactloader_title_outofsuperlatives, 2000, 980);
        

        /* renamed from: e */
        int f12693e;

        /* renamed from: f */
        int f12694f;

        /* renamed from: g */
        int f12695g;

        private C4788e(int i, int i2, int i3) {
            this.f12694f = i;
            this.f12693e = i2;
            this.f12695g = i3;
        }

        /* renamed from: a */
        public static C4788e m14051a(int i) {
            C4788e[] values;
            int i2 = 0;
            for (C4788e eVar : values()) {
                if (i2 == i) {
                    return eVar;
                }
                i2++;
            }
            return STEP_0;
        }
    }

    public C4783d3(int i) {
        C3197d dVar = new C3197d(new Bundle());
        dVar.mo9607a("step", i);
        this(dVar.mo9605a());
    }

    /* access modifiers changed from: private */
    /* renamed from: I */
    public void mo12000E() {
        C4788e a = C4788e.m14051a(this.f12663l0);
        C5151b.m14708a(this.f12664m0, a.f12694f);
        this.f12661j0.setProgress(a.f12695g);
        int i = a.f12693e;
        if (this.f12663l0 < C4788e.values().length - 1) {
            this.f12666o0 = new C4790e0(this);
            this.f12665n0.postDelayed(this.f12666o0, (long) i);
            this.f12663l0++;
        }
    }

    /* renamed from: J */
    private C12279e<C5145f> m13994J() {
        List list;
        C5144e eVar = new C5144e();
        eVar.mo12501b(this.f12643A0);
        C12279e i = this.f12676y0.friendRequests().mo36432a((Consumer<? super Throwable>) C4839k0.f12786e).mo36455b((Consumer<? super T>) new C4885q2<Object>(eVar)).mo36501i(C4875p0.f12840e);
        C12279e i2 = C5448c.m15478a().contactsStream().mo36459b((Predicate<? super T>) C4944y0.f12938e).mo36455b((Consumer<? super T>) new C4915u2<Object>(eVar)).mo36432a((Consumer<? super Throwable>) C4883q0.f12849e).mo36501i(C4888r0.f12853e);
        C12273d b = C5448c.m15478a().onboardingContactsSuggestions().mo36459b((Predicate<? super T>) C4946y2.f12940e).mo36432a((Consumer<? super Throwable>) C4865o0.f12828e).mo36500i().mo36389b(10, TimeUnit.SECONDS).mo36393b((Consumer<? super T>) new C4805g0<Object>(eVar)).mo36379a((Action) new C4791e1(this)).mo36394b((Function<? super T, ? extends R>) C4827i0.f12767e);
        Boolean valueOf = Boolean.valueOf(true);
        C12279e b2 = b.mo36395b(valueOf).mo36383a(valueOf).mo36396b();
        C12279e i3 = this.f12675x0.friends().mo36432a((Consumer<? super Throwable>) C4764b1.f12576e).mo36455b((Consumer<? super T>) new C4910t2<Object>(eVar)).mo36501i(C4776c1.f12633e);
        C12279e e = C2966p.m9484a().onboardingContactsAlreadyOnZenly().mo36537a((Consumer<? super Throwable>) C4754a1.f12551e).mo36534a(30, TimeUnit.SECONDS).mo36549c((Consumer<? super T>) new C4941x2<Object>(eVar)).mo36536a((Action) new C4908t0(this)).mo36552d((Function<? super T, ? extends R>) C4833j1.f12775e).mo36539a(valueOf).mo36553e();
        C12279e i4 = C2976r.m9492a().onboardingContactsSoonOnZenly().mo36537a((Consumer<? super Throwable>) C4832j0.f12774e).mo36549c((Consumer<? super T>) new C4845l1<Object>(eVar)).mo36553e().mo36501i(C4913u0.f12883e);
        C3757f fVar = new C3757f(C5407g.m15386a((Context) mo9304A()).mo12986h(), new C3756e(), C5448c.m15478a(), C3015a.m9526a(mo9304A()).provideFriendRequestStore(), C2666b.m9049a(mo9304A()).mo8763a());
        C12279e i5 = fVar.mo10314a(true).mo36455b((Consumer<? super T>) new C4752a<Object>(eVar)).mo36501i(C4858n0.f12821e);
        C12279e b3 = C12279e.m32616a((Callable<? extends T>) new C4810h0<Object>(this)).mo36432a((Consumer<? super Throwable>) C4795f0.f12702e).mo36455b((Consumer<? super T>) new C4890r2<Object>(eVar)).mo36501i(C4844l0.f12791e).mo36452b(C12802a.m33490a());
        int i6 = this.f12646U;
        if (i6 == 51) {
            list = C3227n.m10229a((T[]) new C12279e[]{e, i, i5});
        } else if (i6 == 52) {
            list = C3227n.m10229a((T[]) new C12279e[]{e, i4, i2, i3, i, b3});
        } else {
            list = C3227n.m10229a((T[]) new C12279e[]{b2, i});
        }
        return C12279e.m32624c((Iterable<? extends ObservableSource<? extends T>>) list).mo36473c(valueOf).mo36492f(100, TimeUnit.MILLISECONDS).mo36501i(new C4953z0(eVar)).mo36501i(C4905s2.f12876e);
    }

    /* renamed from: K */
    private void m13995K() {
        C7697b.m18741d(this.f12662k0);
    }

    @SuppressLint({"CheckResult"})
    /* renamed from: L */
    private void m13996L() {
        C5448c.m15478a().userMeTraits().mo36487e(1).mo36428a(C12295a.m32802a()).mo36412a((Consumer<? super T>) C4852m0.f12804e, (Consumer<? super Throwable>) C4811h1.f12743e);
    }

    /* renamed from: g */
    private void m14031g(View view) {
        this.f12654c0 = view.findViewById(R.id.contact_picker_header);
        this.f12657f0 = (RecyclerView) view.findViewById(R.id.contact_picker_recycler);
        this.f12659h0 = (ImageButton) view.findViewById(R.id.button_next);
        this.f12660i0 = (TextView) view.findViewById(R.id.button_next_primary);
        this.f12661j0 = (ProgressBar) view.findViewById(R.id.contact_picker_progressbar);
        this.f12671t0 = (LottieAnimationView) view.findViewById(R.id.lottie_animation_view);
        this.f12672u0 = view.findViewById(R.id.loading_success);
        this.f12662k0 = view.findViewById(R.id.loading_layout);
        this.f12664m0 = (TextView) view.findViewById(R.id.text_view_loading_title);
        this.f12673v0 = view.findViewById(R.id.contact_container);
        this.f12655d0 = (ScreenBar) view.findViewById(R.id.screen_bar);
        this.f12656e0 = (SearchBar) view.findViewById(R.id.search_bar);
        int i = this.f12645T;
        if (i == 20) {
            this.f12655d0.setTitle((int) R.string.signup_contactpicker_title_alreadyonzenly);
        } else if (i == 30) {
            this.f12655d0.setTitle((int) R.string.signup_contactpicker_title_soononzenly);
        } else {
            this.f12655d0.setTitle((int) R.string.signup_contactpicker_title_suggested);
        }
        this.f12656e0.setVisibility(this.f12667p0 ? 0 : 8);
        this.f12656e0.mo6898a((TextWatcher) new C4784a());
        this.f12659h0.setOnClickListener(new C4903s0(this));
        this.f12660i0.setOnClickListener(new C4930w0(this));
        if (this.f12647V) {
            C7697b.m18738c(this.f12662k0);
            mo12000E();
        } else {
            C7697b.m18741d(this.f12662k0);
        }
        C4785b bVar = new C4785b(this, new C2477e(mo23920b()), mo23920b(), this.f12674w0, C2538c0.m8837a(mo23920b()), true, false, true, true, this.f12645T == 30 && this.f12643A0);
        this.f12658g0 = bVar;
        this.f12658g0.mo8327a((Listener) new C4786c());
        this.f12657f0.mo5045a((C1074l) new C2420b(this.f12658g0));
        this.f12657f0.setAdapter(this.f12658g0);
    }

    /* renamed from: B */
    public int mo7192B() {
        return this.f12646U;
    }

    /* renamed from: F */
    public /* synthetic */ void mo12023F() throws Exception {
        this.f12670s0.set(true);
    }

    /* renamed from: G */
    public /* synthetic */ void mo12024G() throws Exception {
        this.f12669r0.set(true);
    }

    /* renamed from: H */
    public /* synthetic */ List mo12025H() throws Exception {
        return C2545e0.m8883a(mo9304A(), Locale.getDefault(), true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo9310d(ControllerChangeHandler controllerChangeHandler, C8829e eVar) {
        super.mo9310d(controllerChangeHandler, eVar);
        this.f12644B0.onNext(Boolean.valueOf(false));
    }

    /* renamed from: e */
    public /* synthetic */ void mo7061e(View view) {
        C5498a.m15600a(view.getContext()).mo13123a(C5501c.LIGHT, C5500b.NAV);
        m14029e(false);
    }

    /* renamed from: f */
    public /* synthetic */ void mo7857f(View view) {
        C5498a.m15600a(view.getContext()).mo13123a(C5501c.LIGHT, C5500b.NAV);
        boolean z = !this.f12658g0.mo8342c().isEmpty();
        m14003a(view.getContext(), z);
        if (z) {
            this.f12649X.set(true);
            this.f12658g0.mo8325a(this.f12659h0.getContext());
            m14008a((C5432b) new C4793e3(this));
            return;
        }
        m14029e(false);
    }

    public void onWindowInsetsChanged(View view, Rect rect) {
        super.onWindowInsetsChanged(view, rect);
        View view2 = this.f12654c0;
        view2.setPadding(rect.left, rect.top, rect.right, view2.getPaddingBottom());
        RecyclerView recyclerView = this.f12657f0;
        recyclerView.setPadding(rect.left, recyclerView.getPaddingTop(), rect.right, this.f12657f0.getPaddingBottom());
        View view3 = this.f12673v0;
        view3.setPadding(view3.getPaddingLeft(), this.f12673v0.getPaddingTop(), this.f12673v0.getPaddingRight(), rect.bottom);
        this.f12672u0.setPadding(rect.left, rect.top, rect.right, rect.bottom);
        this.f12662k0.setPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: b */
    static /* synthetic */ C5143d m14014b(Pair pair) throws Exception {
        return (C5143d) pair.second;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo9309c(ControllerChangeHandler controllerChangeHandler, C8829e eVar) {
        super.mo9309c(controllerChangeHandler, eVar);
        this.f12644B0.onNext(Boolean.valueOf(true));
    }

    /* renamed from: b */
    public /* synthetic */ void mo12028b(C5143d dVar) throws Exception {
        this.f12650Y = dVar.mo12490a().size();
        this.f12651Z = dVar.mo12491b().size();
        this.f12652a0 = dVar.mo12494e().size();
        if (this.f12646U == 51 && this.f12669r0.get()) {
            this.f12665n0.removeCallbacks(this.f12666o0);
            m14010a((Runnable) new C4796f1(this, dVar));
        } else if (this.f12646U != 53 || !this.f12670s0.get()) {
            C7697b.m18728a((View) this.f12657f0, 300);
        } else {
            C7697b.m18728a((View) this.f12657f0, 300);
            if (dVar.mo12494e().isEmpty()) {
                m14029e(true);
            }
        }
        if (this.f12668q0) {
            this.f12658g0.mo8341b(dVar.mo12490a());
        } else {
            m14022c(this.f12658g0.mo8342c().size());
        }
        m14023c(dVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo7066c(View view) {
        this.f12657f0.setAdapter(null);
        this.f12674w0.mo36401a();
        super.mo7066c(view);
    }

    public C4783d3(Bundle bundle) {
        super(bundle);
        this.f12649X = new AtomicBoolean(false);
        this.f12650Y = -1;
        this.f12651Z = -1;
        this.f12652a0 = -1;
        this.f12663l0 = 0;
        this.f12665n0 = new Handler();
        this.f12669r0 = new AtomicBoolean(false);
        this.f12670s0 = new AtomicBoolean(false);
        this.f12674w0 = new C12275b();
        this.f12644B0 = C12785a.m33446h(Boolean.valueOf(true));
        this.f12646U = bundle.getInt("step", 51);
        int i = this.f12646U;
        if (i == 51) {
            this.f12645T = 20;
            this.f12647V = true;
        } else if (i == 52) {
            this.f12645T = 30;
            this.f12667p0 = true;
            this.f12647V = false;
        } else {
            this.f12645T = 40;
            this.f12647V = false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m14029e(boolean z) {
        if (!this.f12648W) {
            this.f12648W = true;
            SignupListener signupListener = this.f12511Q;
            if (signupListener != null) {
                signupListener.getCache().mo19170b(this.f12646U);
                this.f12511Q.saveCache();
            }
            int i = this.f12646U;
            if (i == 51) {
                C4847l3.m14146j().mo12070a(z, this.f12650Y, this.f12658g0.mo8336b());
            } else if (i == 52) {
                C4847l3.m14146j().mo12066a(this.f12651Z, this.f12658g0.mo8336b());
            } else if (i == 53) {
                m13996L();
                C4847l3.m14146j().mo12076b(z, this.f12652a0, this.f12658g0.mo8336b());
            }
            mo11926D();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7065a(Context context) {
        StoreModule a = C3015a.m9526a(context);
        this.f12675x0 = a.provideFriendStore();
        this.f12676y0 = a.provideFriendRequestStore();
        this.f12677z0 = new C6300h(C5407g.m15386a(context).mo12986h());
        this.f12643A0 = C3444a.m10686a(context).mo6511a("feature:SocialNetworkInOnboarding");
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m14022c(int i) {
        if (i > 0) {
            this.f12660i0.setText(this.f12657f0.getContext().getResources().getQuantityString(R.plurals.ping_pack_button_addfriends, i, new Object[]{Integer.valueOf(i)}));
            this.f12660i0.setVisibility(0);
            this.f12659h0.setVisibility(8);
            return;
        }
        this.f12660i0.setText("");
        this.f12660i0.setVisibility(8);
        this.f12659h0.setVisibility(0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo7054a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.controller_contact_picker_signup, viewGroup, false);
        this.f12653b0 = C5139b.m14652a(C7713f.m18776a(inflate.getContext()));
        m14031g(inflate);
        UserProto$User userMeCache = C5448c.m15478a().userMeCache();
        if (userMeCache != null && C3498n.f9481a.isOpen()) {
            List rolesList = userMeCache.getRolesList();
            if (this.f12646U == 51 && !rolesList.contains("tech_staff") && !rolesList.contains("already_not_selected")) {
                z = true;
            }
            this.f12668q0 = z;
        }
        this.f12674w0.add(C12279e.m32610a((ObservableSource<? extends T1>) this.f12644B0, (ObservableSource<? extends T2>) m13994J().mo36459b((Predicate<? super T>) new C4923v0<Object>(this)).mo36501i(new C4840k1(this)), (BiFunction<? super T1, ? super T2, ? extends R>) C4932w2.f12926a).mo36459b((Predicate<? super T>) C4781d1.f12640e).mo36501i(C4828i1.f12768e).mo36477d().mo36428a(C12295a.m32802a()).mo36412a((Consumer<? super T>) new C4806g1<Object>(this), (Consumer<? super Throwable>) C4939x0.f12934e));
        return inflate;
    }

    /* renamed from: c */
    private void m14023c(C5143d dVar) {
        this.f12658g0.mo8324a();
        if (this.f12645T == 20 && !dVar.mo12490a().isEmpty()) {
            this.f12658g0.mo8335a(dVar.mo12490a());
        } else if (this.f12645T == 30 && !dVar.mo12491b().isEmpty()) {
            if (!dVar.mo12493d().isEmpty()) {
                C5139b bVar = new C5139b(C5142c.BROADCAST_INVITE);
                bVar.mo12475a(dVar.mo12493d());
                this.f12658g0.mo8332a(bVar);
            }
            this.f12658g0.mo8335a(dVar.mo12491b());
        } else if (this.f12645T == 40 && !dVar.mo12494e().isEmpty()) {
            this.f12658g0.mo8335a(dVar.mo12494e());
        }
        this.f12658g0.notifyDataSetChanged();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public C5143d m14015b(C5145f fVar) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        UserProto$User e = fVar.mo12514e();
        for (C2935a aVar : fVar.mo12510b()) {
            C5139b bVar = new C5139b(C5142c.ALREADY_ON_ZENLY);
            bVar.mo12474a(aVar.mo9069a());
            UserProto$User b = aVar.mo9070b();
            bVar.mo12473a(b);
            if (!fVar.mo12511b(bVar) && (e == null || !e.getUuid().equals(b.getUuid()))) {
                arrayList.add(bVar);
            }
        }
        for (C7339i iVar : fVar.mo12508a()) {
            C5139b bVar2 = new C5139b(C5142c.CONTACTS);
            bVar2.mo12474a(iVar);
            UserProto$User a = fVar.mo12506a(bVar2);
            if (a != null) {
                bVar2.mo12473a(a);
                bVar2.mo12476a(true);
            } else {
                UserProto$User a2 = fVar.mo12507a(iVar);
                if (a2 != null) {
                    bVar2.mo12473a(a2);
                } else {
                    bVar2.mo12472a(fVar.mo12509b(iVar));
                }
                bVar2.mo12478b(fVar.mo12511b(bVar2));
            }
            arrayList2.add(bVar2);
        }
        for (C7434p pVar : fVar.mo12516g()) {
            if (C4787d.f12680a[pVar.getType().ordinal()] == 1) {
                C5139b bVar3 = new C5139b(C5142c.SUGGESTED);
                bVar3.mo12473a(pVar.getUser());
                if (!fVar.mo12511b(bVar3) && (e == null || !e.getUuid().equals(pVar.getUser().getUuid()))) {
                    arrayList3.add(bVar3);
                }
            }
        }
        Collections.sort(arrayList2, this.f12653b0);
        Collections.sort(arrayList, this.f12653b0);
        if (e != null) {
            C5139b bVar4 = new C5139b(C5142c.ALREADY_ON_ZENLY);
            bVar4.mo12473a(e);
            bVar4.mo12479c(true);
            arrayList.add(0, bVar4);
        }
        C5143d dVar = new C5143d(fVar.mo12514e(), arrayList, arrayList3, arrayList2, fVar.mo12513d() ? fVar.mo12515f() : Collections.emptyList());
        return dVar;
    }

    /* renamed from: a */
    public /* synthetic */ boolean mo12027a(C5145f fVar) throws Exception {
        return !this.f12649X.get();
    }

    /* renamed from: a */
    public /* synthetic */ void mo12026a(C5143d dVar) {
        m13995K();
        C7697b.m18728a((View) this.f12657f0, 300);
        if (dVar.mo12490a().isEmpty()) {
            m14029e(true);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m14003a(Context context, boolean z) {
        C2594d dVar = new C2594d(C5407g.m15386a(context).mo12986h());
        if (z) {
            dVar.mo8708f(true);
        }
    }

    /* renamed from: a */
    static /* synthetic */ boolean m14013a(C7339i iVar) throws Exception {
        return iVar.getPhoneNumbersCount() > 0;
    }

    /* renamed from: a */
    private void m14008a(C5432b bVar) {
        C5151b.m14710a(this.f12671t0, this.f12672u0, bVar);
    }

    /* renamed from: a */
    private void m14010a(Runnable runnable) {
        this.f12661j0.setProgress(C8733j.DEFAULT_IMAGE_TIMEOUT_MS);
        this.f12665n0.removeCallbacks(this.f12666o0);
        this.f12666o0 = runnable;
        this.f12665n0.postDelayed(this.f12666o0, 1000);
    }
}
