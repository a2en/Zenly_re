package app.zenly.locator.p207x;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import app.zenly.android.feature.base.p009di.Provider;
import app.zenly.android.feature.base.scheduling.C1351e;
import app.zenly.android.feature.base.scheduling.ZenlySchedulers;
import app.zenly.android.feature.descendants.C1382g;
import app.zenly.android.feature.descendants.DescendantsModule;
import app.zenly.android.feature.descendants.feedback.C1380a;
import app.zenly.android.feature.descendants.feedback.C1381b;
import app.zenly.android.feature.descendants.feedback.DescendantsPrefs;
import app.zenly.android.feature.descendants.feedback.DescendantsPrefs.C1379a;
import app.zenly.locator.R;
import app.zenly.locator.core.contracts.C2470a;
import app.zenly.locator.core.glide.C2477e;
import app.zenly.locator.core.manager.MeUserManager;
import app.zenly.locator.core.manager.p069di.C2660a;
import app.zenly.locator.core.manager.p069di.C2666b;
import app.zenly.locator.core.models.C2884f;
import app.zenly.locator.core.p072ui.controller.ZenlyController;
import app.zenly.locator.core.store.api.C2936a0;
import app.zenly.locator.core.store.api.FriendStore;
import app.zenly.locator.core.store.p071di.C3015a;
import app.zenly.locator.core.store.p071di.StoreModule;
import app.zenly.locator.core.util.C3200e0;
import app.zenly.locator.core.util.C3201f;
import app.zenly.locator.core.util.C3205g;
import app.zenly.locator.descendants.C3505b;
import app.zenly.locator.experimental.map.C3736e;
import app.zenly.locator.experimental.map.NextUnlockController;
import app.zenly.locator.friendshipfacts.C3772c;
import app.zenly.locator.friendshipfacts.FriendshipFactsModule;
import app.zenly.locator.friendshipfacts.FriendshipFactsPrefs;
import app.zenly.locator.friendshipfacts.FriendshipFactsPrefs.C3764a;
import app.zenly.locator.map.C3896a1;
import app.zenly.locator.p143s.C5343a;
import app.zenly.locator.p143s.p146j.C5432b;
import app.zenly.locator.p143s.p148l.C5448c;
import app.zenly.locator.p143s.p155r.C5498a;
import app.zenly.locator.p143s.p155r.C5498a.C5500b;
import app.zenly.locator.p143s.p155r.C5498a.C5501c;
import app.zenly.locator.p196u.p197b.C5943a;
import app.zenly.locator.userprofile.p198me.appicons.C6052e;
import app.zenly.locator.userprofile.p198me.appicons.C6055g;
import com.airbnb.lottie.C8506c;
import com.airbnb.lottie.C8507d;
import com.airbnb.lottie.LottieAnimationView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p213co.znly.models.UserProto$User;
import p250f.p251a.p252a.p253a.p254d.C7657c;
import p250f.p251a.p252a.p263b.p264a.p269h.p270a.C7706a;
import p250f.p251a.p252a.p263b.p264a.p271i.C7707a;
import p250f.p251a.p252a.p263b.p264a.p272j.C7710c;
import p389io.reactivex.C12286f;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.functions.Consumer;

/* renamed from: app.zenly.locator.x.t1 */
public class C6248t1 extends ZenlyController implements OnClickListener {

    /* renamed from: A0 */
    private static final int f15630A0 = C3200e0.m10182a(16);

    /* renamed from: B0 */
    private static final C3201f<C2936a0> f15631B0 = new C6249a();

    /* renamed from: y0 */
    private static final int f15632y0 = C3200e0.m10182a(91);

    /* renamed from: z0 */
    private static final int f15633z0 = C3200e0.m10182a(80);

    /* renamed from: P */
    private final ZenlySchedulers f15634P = C1351e.m6372a(C6188a2.f15561b.mo19916a("controls"));
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public C6272z1 f15635Q;

    /* renamed from: R */
    private ViewGroup f15636R;
    /* access modifiers changed from: private */

    /* renamed from: S */
    public FrameLayout f15637S;

    /* renamed from: T */
    private ImageView f15638T;
    /* access modifiers changed from: private */

    /* renamed from: U */
    public FrameLayout f15639U;

    /* renamed from: V */
    private ImageView f15640V;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public FrameLayout f15641W;

    /* renamed from: X */
    private ImageView f15642X;
    /* access modifiers changed from: private */

    /* renamed from: Y */
    public ViewGroup f15643Y;

    /* renamed from: Z */
    private ViewGroup f15644Z;

    /* renamed from: a0 */
    private View f15645a0;
    /* access modifiers changed from: private */

    /* renamed from: b0 */
    public ConstraintLayout f15646b0;

    /* renamed from: c0 */
    private ImageView f15647c0;
    /* access modifiers changed from: private */

    /* renamed from: d0 */
    public LottieAnimationView f15648d0;

    /* renamed from: e0 */
    private final List<View> f15649e0 = new ArrayList();

    /* renamed from: f0 */
    private TextView f15650f0;

    /* renamed from: g0 */
    private boolean f15651g0;

    /* renamed from: h0 */
    private boolean f15652h0;

    /* renamed from: i0 */
    private int f15653i0;

    /* renamed from: j0 */
    private long f15654j0;

    /* renamed from: k0 */
    private C2470a f15655k0;

    /* renamed from: l0 */
    private boolean f15656l0;

    /* renamed from: m0 */
    private final C12275b f15657m0 = new C12275b();

    /* renamed from: n0 */
    private C6052e f15658n0;

    /* renamed from: o0 */
    private Provider<C1381b> f15659o0;

    /* renamed from: p0 */
    private Provider<C1380a> f15660p0;

    /* renamed from: q0 */
    private Provider<DescendantsPrefs> f15661q0;

    /* renamed from: r0 */
    private Provider<FriendshipFactsPrefs> f15662r0;

    /* renamed from: s0 */
    private Provider<FriendStore> f15663s0;

    /* renamed from: t0 */
    private NextUnlockController f15664t0;

    /* renamed from: u0 */
    private Consumer<UserProto$User> f15665u0 = new C6216j(this);

    /* renamed from: v0 */
    private Consumer<Throwable> f15666v0 = C6228n.f15608e;

    /* renamed from: w0 */
    private ZenlySchedulers f15667w0 = C1351e.m6372a(C3505b.f9488b.mo19916a("preferences"));

    /* renamed from: x0 */
    private Provider<MeUserManager> f15668x0;

    /* renamed from: app.zenly.locator.x.t1$a */
    static class C6249a extends C3201f<C2936a0> {
        C6249a() {
        }

        /* renamed from: a */
        public int compare(C2936a0 a0Var, C2936a0 a0Var2) {
            return C3205g.m10193c().compare(a0Var.mo9074a(), a0Var2.mo9074a());
        }
    }

    /* renamed from: app.zenly.locator.x.t1$b */
    class C6250b extends C5432b {
        C6250b() {
        }

        /* renamed from: a */
        public void mo7336a(Animator animator, boolean z) {
            C6248t1.this.f15643Y.setVisibility(8);
            C6248t1.this.f15637S.setVisibility(8);
            C6248t1.this.f15641W.setVisibility(8);
        }
    }

    /* renamed from: app.zenly.locator.x.t1$c */
    class C6251c extends C5432b {

        /* renamed from: b */
        final /* synthetic */ float f15670b;

        /* renamed from: c */
        final /* synthetic */ float f15671c;

        C6251c(float f, float f2) {
            this.f15670b = f;
            this.f15671c = f2;
        }

        /* renamed from: a */
        public void mo7336a(Animator animator, boolean z) {
            C6248t1.this.f15639U.setVisibility(8);
            C6248t1.this.f15639U.setScaleX(this.f15670b);
            C6248t1.this.f15639U.setScaleY(this.f15671c);
        }
    }

    /* renamed from: app.zenly.locator.x.t1$d */
    class C6252d extends C5432b {

        /* renamed from: b */
        final /* synthetic */ boolean f15673b;

        /* renamed from: c */
        final /* synthetic */ int f15674c;

        C6252d(boolean z, int i) {
            this.f15673b = z;
            this.f15674c = i;
        }

        /* renamed from: a */
        public void mo7336a(Animator animator, boolean z) {
            if (C6248t1.this.f15635Q != null) {
                C6248t1.this.f15635Q.mo14116a(this.f15673b, this.f15674c);
            }
        }

        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            C6248t1.this.f15646b0.setVisibility(0);
            if (C6248t1.this.f15648d0.getComposition() != null) {
                C6248t1.this.f15648d0.mo22807d();
            }
        }
    }

    /* renamed from: app.zenly.locator.x.t1$e */
    static /* synthetic */ class C6253e {

        /* renamed from: a */
        static final /* synthetic */ int[] f15676a = new int[C2470a.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                app.zenly.locator.core.contracts.a[] r0 = app.zenly.locator.core.contracts.C2470a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f15676a = r0
                int[] r0 = f15676a     // Catch:{ NoSuchFieldError -> 0x0014 }
                app.zenly.locator.core.contracts.a r1 = app.zenly.locator.core.contracts.C2470a.INBOX     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f15676a     // Catch:{ NoSuchFieldError -> 0x001f }
                app.zenly.locator.core.contracts.a r1 = app.zenly.locator.core.contracts.C2470a.MAP     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f15676a     // Catch:{ NoSuchFieldError -> 0x002a }
                app.zenly.locator.core.contracts.a r1 = app.zenly.locator.core.contracts.C2470a.MY_PROFILE     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.p207x.C6248t1.C6253e.<clinit>():void");
        }
    }

    /* renamed from: F */
    private boolean m17127F() {
        int b = ((DescendantsPrefs) this.f15661q0.get()).getAllPreferences().mo6640b();
        if (C7710c.m18767b(b, 1) || C7710c.m18767b(b, 8) || this.f15658n0.mo13872d() || ((FriendshipFactsPrefs) this.f15662r0.get()).currentState() == C3764a.UNLOCKABLE) {
            return true;
        }
        return false;
    }

    /* renamed from: G */
    private void m17128G() {
        int i;
        int i2;
        boolean z = this.f15654j0 > 0;
        if (z && this.f15655k0 == C2470a.INBOX) {
            i2 = 2131231288;
            i = 2131231290;
        } else if (z) {
            i2 = 2131231295;
            i = 2131231297;
        } else {
            C2470a aVar = this.f15655k0;
            if (aVar == C2470a.INBOX) {
                i2 = 2131231287;
                i = 2131231289;
            } else if (aVar == C2470a.MAP) {
                i2 = 2131231298;
                i = 2131231299;
            } else {
                i2 = 2131231294;
                i = 2131231296;
            }
        }
        this.f15637S.setBackgroundResource(i2);
        this.f15638T.setImageResource(i);
    }

    /* renamed from: H */
    private void m17129H() {
        int i;
        boolean z = this.f15653i0 > 0;
        int i2 = 2131231283;
        if (z && this.f15655k0 == C2470a.MAP) {
            i = 2131231288;
            if (!this.f15652h0) {
                i2 = 2131231285;
            }
        } else if (this.f15655k0 == C2470a.MAP) {
            i = 2131231291;
            i2 = this.f15652h0 ? 2131231284 : 2131231286;
        } else if (z) {
            i = 2131231295;
        } else {
            i = 2131231294;
            i2 = 2131231282;
        }
        this.f15639U.setBackgroundResource(i);
        this.f15640V.setImageResource(i2);
        if (this.f15655k0 != C2470a.MAP || !z || !this.f15652h0) {
            this.f15650f0.setVisibility(8);
            this.f15640V.setVisibility(0);
            return;
        }
        this.f15650f0.setVisibility(0);
        TextView textView = this.f15650f0;
        textView.setText(m17135b(textView.getContext()));
        this.f15640V.setVisibility(8);
    }

    /* renamed from: I */
    private void m17130I() {
        int i;
        int i2;
        boolean F = m17127F();
        if (F && this.f15655k0 == C2470a.MY_PROFILE) {
            i2 = 2131231288;
            i = 2131231293;
        } else if (F) {
            i2 = 2131231295;
            i = 2131231302;
        } else {
            C2470a aVar = this.f15655k0;
            if (aVar == C2470a.MY_PROFILE) {
                i2 = 2131231287;
                i = 2131231292;
            } else if (aVar == C2470a.MAP) {
                i2 = 2131231298;
                i = 2131231300;
            } else {
                i2 = 2131231294;
                i = 2131231301;
            }
        }
        this.f15641W.setBackgroundResource(i2);
        this.f15642X.setImageResource(i);
    }

    /* renamed from: B */
    public void mo7192B() {
        View m = mo23948m();
        if (m != null) {
            this.f15664t0.onEnterDiscoverMode();
            boolean z = this.f15653i0 > 0;
            int i = this.f15653i0;
            m.performHapticFeedback(0);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f15643Y, View.TRANSLATION_Y, new float[]{0.0f, (float) (-C3200e0.m10183a((Context) mo23920b(), -100))});
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f15643Y, View.ALPHA, new float[]{1.0f, 0.0f});
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f15637S, View.TRANSLATION_X, new float[]{0.0f, (float) C3200e0.m10183a((Context) mo23920b(), -100)});
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.f15637S, View.ALPHA, new float[]{1.0f, 0.0f});
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.f15641W, View.TRANSLATION_X, new float[]{0.0f, (float) C3200e0.m10183a((Context) mo23920b(), 100)});
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.f15641W, View.ALPHA, new float[]{1.0f, 0.0f});
            ofFloat6.addListener(new C6250b());
            float scaleX = this.f15639U.getScaleX();
            ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(this.f15639U, View.SCALE_X, new float[]{1.0f, 0.0f});
            ofFloat7.setDuration(200);
            ofFloat7.setInterpolator(C7657c.m18641a());
            float scaleY = this.f15639U.getScaleY();
            ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(this.f15639U, View.SCALE_Y, new float[]{1.0f, 0.0f});
            ofFloat8.setDuration(200);
            ofFloat8.setInterpolator(C7657c.m18641a());
            ofFloat8.addListener(new C6251c(scaleX, scaleY));
            ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(this.f15646b0, View.SCALE_X, new float[]{0.0f, 1.0f});
            ofFloat9.setStartDelay(200);
            ofFloat9.setInterpolator(C7657c.m18650f());
            ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(this.f15646b0, View.SCALE_Y, new float[]{0.0f, 1.0f});
            ofFloat10.setStartDelay(200);
            ofFloat10.setInterpolator(C7657c.m18650f());
            ofFloat10.addListener(new C6252d(z, i));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ofFloat9, ofFloat10});
            animatorSet.start();
            this.f15651g0 = true;
            ((MeUserManager) this.f15668x0.get()).mo8754a(true);
            if (this.f15648d0.getComposition() == null) {
                C8507d.m19679a((Context) mo9304A(), (int) R.raw.lottie_discover_globe).mo23032b(new C6210h(this));
            }
        }
    }

    /* renamed from: C */
    public void mo14068C() {
        this.f15664t0.onExitDiscoverMode();
        this.f15643Y.setTranslationY(0.0f);
        this.f15643Y.setAlpha(1.0f);
        this.f15637S.setTranslationX(0.0f);
        this.f15637S.setAlpha(1.0f);
        this.f15641W.setTranslationX(0.0f);
        this.f15641W.setAlpha(1.0f);
        this.f15639U.setAlpha(1.0f);
        this.f15648d0.mo22797a();
        this.f15646b0.setVisibility(8);
        this.f15643Y.setVisibility(0);
        this.f15637S.setVisibility(0);
        this.f15641W.setVisibility(0);
        this.f15639U.setVisibility(0);
        m17129H();
        this.f15651g0 = false;
        ((MeUserManager) this.f15668x0.get()).mo8754a(false);
    }

    /* renamed from: D */
    public void mo14069D() {
        this.f15664t0.onDisplayGathering();
    }

    /* renamed from: E */
    public void mo14070E() {
        this.f15664t0.onGatheringCleared();
    }

    public void onClick(View view) {
        if (this.f15635Q != null) {
            C5498a.m15600a(view.getContext()).mo13123a(C5501c.LIGHT, C5500b.NAV);
            int id = view.getId();
            if (id != R.id.button_map) {
                boolean z = true;
                if (id != R.id.button_profile) {
                    switch (id) {
                        case R.id.button_dashboard /*2131427545*/:
                            this.f15635Q.mo14092F();
                            break;
                        case R.id.button_discover /*2131427546*/:
                            this.f15635Q.mo14091E();
                            break;
                        case R.id.button_inbox /*2131427547*/:
                            if (this.f15655k0 != C2470a.MY_PROFILE) {
                                z = false;
                            }
                            this.f15656l0 = z;
                            this.f15635Q.mo14100a(C2470a.INBOX);
                            break;
                    }
                } else {
                    if (this.f15655k0 != C2470a.INBOX) {
                        z = false;
                    }
                    this.f15656l0 = z;
                    this.f15635Q.mo14100a(C2470a.MY_PROFILE);
                }
            } else {
                this.f15635Q.mo14100a(C2470a.MAP);
            }
        }
    }

    public void onWindowInsetsChanged(View view, Rect rect) {
        super.onWindowInsetsChanged(view, rect);
        view.setPadding(rect.left, rect.top, rect.right, view.getPaddingBottom());
    }

    /* renamed from: w */
    public boolean mo7339w() {
        return false;
    }

    /* renamed from: a */
    public /* synthetic */ void mo14077a(UserProto$User userProto$User) throws Exception {
        if (this.f15635Q.mo14090D()) {
            ((C1381b) this.f15659o0.get()).mo6647a(((DescendantsPrefs) this.f15661q0.get()).getAllPreferences(), userProto$User.getEvents().getInviterCount(), false);
            ((FriendshipFactsPrefs) this.f15662r0.get()).onUserUpdate(userProto$User, false);
        }
    }

    /* renamed from: b */
    public boolean mo14083b(MotionEvent motionEvent) {
        for (View view : this.f15649e0) {
            if (C3200e0.m10185a(view, motionEvent)) {
                onClick(view);
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo7066c(View view) {
        this.f15649e0.clear();
        super.mo7066c(view);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo7053d(View view) {
        this.f15657m0.mo36401a();
        this.f15635Q = null;
        this.f15664t0.onDetach();
        super.mo7053d(view);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7052b(View view) {
        super.mo7052b(view);
        C7707a.m18760a("controls:onAttach");
        this.f15635Q = (C6272z1) mo23947l();
        int childCount = this.f15644Z.getChildCount();
        C7707a.m18761b("viewport:subscribe");
        this.f15657m0.add(C3896a1.m11470r().mo10518h().mo36428a((C12286f) this.f15634P.getMainThread()).mo36476d((Consumer<? super T>) new C6225m<Object>(this)));
        C7707a.m18759a();
        C7707a.m18761b("bestfriend:subscribe");
        this.f15657m0.add(((FriendStore) this.f15663s0.get()).bestFriends().mo36501i(C6219k.f15599e).mo36428a((C12286f) this.f15634P.getMainThread()).mo36412a((Consumer<? super T>) new C6207g<Object>(this, childCount, view), (Consumer<? super Throwable>) C6204f.f15580e));
        C7707a.m18759a();
        C7707a.m18761b("userme:subscribe");
        this.f15657m0.add(C5448c.m15478a().userMeStream().mo36428a((C12286f) this.f15634P.getMainThread()).mo36412a(this.f15665u0, this.f15666v0));
        C7707a.m18759a();
        this.f15657m0.add(((DescendantsPrefs) this.f15661q0.get()).observeAllPreferences().mo36477d().mo36428a((C12286f) this.f15667w0.getMainThread()).mo36476d((Consumer<? super T>) new C6222l<Object>(this)));
        this.f15657m0.add(((FriendshipFactsPrefs) this.f15662r0.get()).observeState().mo36428a((C12286f) this.f15667w0.getMainThread()).mo36476d((Consumer<? super T>) new C6201e<Object>(this)));
        this.f15657m0.add(this.f15658n0.mo13870c().mo36428a((C12286f) this.f15667w0.getMainThread()).mo36476d((Consumer<? super T>) new C6213i<Object>(this)));
        C7707a.m18759a();
        this.f15664t0.onAttach(this.f15635Q, mo9304A());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7065a(Context context) {
        StoreModule a = C3015a.m9526a(context);
        a.getClass();
        this.f15663s0 = new C6185a(a);
        this.f15658n0 = C6055g.m16803a(context);
        DescendantsModule a2 = C1382g.m6431a(context);
        a2.getClass();
        this.f15659o0 = new C6193c(a2);
        DescendantsModule a3 = C1382g.m6431a(context);
        a3.getClass();
        this.f15661q0 = new C6221k1(a3);
        FriendshipFactsModule a4 = C3772c.m11231a(context);
        a4.getClass();
        this.f15662r0 = new C6227m1(a4);
        DescendantsModule a5 = C1382g.m6431a(context);
        a5.getClass();
        this.f15660p0 = new C6233o1(a5);
        C2660a a6 = C2666b.m9049a(context);
        a6.getClass();
        this.f15668x0 = new C6189b(a6);
        this.f15664t0 = C3736e.m11156a(C5448c.m15478a(), new C5943a(C5343a.m15160U().mo12806a(), C5448c.m15478a()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo7054a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C7707a.m18760a("controls:onCreateView");
        View inflate = layoutInflater.inflate(R.layout.controller_controls, viewGroup, false);
        this.f15636R = (ViewGroup) inflate;
        this.f15637S = (FrameLayout) inflate.findViewById(R.id.button_inbox);
        this.f15638T = (ImageView) inflate.findViewById(R.id.button_inbox_image);
        this.f15639U = (FrameLayout) inflate.findViewById(R.id.button_map);
        this.f15640V = (ImageView) inflate.findViewById(R.id.button_map_image);
        this.f15641W = (FrameLayout) inflate.findViewById(R.id.button_profile);
        this.f15642X = (ImageView) inflate.findViewById(R.id.button_profile_image);
        this.f15643Y = (ViewGroup) inflate.findViewById(R.id.button_dashboard);
        this.f15645a0 = inflate.findViewById(R.id.button_search);
        this.f15646b0 = (ConstraintLayout) inflate.findViewById(R.id.button_discover);
        this.f15650f0 = (TextView) inflate.findViewById(R.id.discover_count);
        this.f15647c0 = (ImageView) inflate.findViewById(R.id.img_button_discover);
        this.f15648d0 = (LottieAnimationView) inflate.findViewById(R.id.lottie_button_discover);
        this.f15649e0.add(this.f15639U);
        this.f15649e0.add(this.f15637S);
        this.f15649e0.add(this.f15643Y);
        this.f15649e0.add(this.f15641W);
        this.f15646b0.setOnClickListener(this);
        this.f15644Z = (ViewGroup) inflate.findViewById(R.id.button_best_friends);
        C7707a.m18759a();
        this.f15664t0.onCreateView(inflate);
        return inflate;
    }

    /* renamed from: a */
    public boolean mo14080a(MotionEvent motionEvent) {
        for (View a : this.f15649e0) {
            if (C3200e0.m10185a(a, motionEvent)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public /* synthetic */ void mo14079a(Boolean bool) throws Exception {
        if (this.f15652h0 != bool.booleanValue()) {
            this.f15652h0 = bool.booleanValue();
            m17129H();
        }
    }

    /* renamed from: a */
    static /* synthetic */ List m17132a(List list) throws Exception {
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList, f15631B0);
        return arrayList;
    }

    /* renamed from: a */
    public /* synthetic */ void mo14072a(int i, View view, List list) throws Exception {
        if (list.size() < i) {
            this.f15645a0.setVisibility(0);
            this.f15644Z.setVisibility(8);
            return;
        }
        this.f15645a0.setVisibility(8);
        this.f15644Z.setVisibility(0);
        for (int i2 = 0; i2 < i; i2++) {
            new C2477e(view.getContext()).load(C2884f.m9355a(((C2936a0) list.get(i2)).mo9074a())).into((ImageView) this.f15644Z.getChildAt((i - 1) - i2));
        }
    }

    /* renamed from: b */
    public /* synthetic */ void mo14082b(Boolean bool) throws Exception {
        m17130I();
    }

    /* renamed from: b */
    public void mo14081b(int i) {
        int i2 = this.f15653i0;
        if (i2 != i) {
            if (i2 == 0) {
                C5498a.m15600a((Context) mo23920b()).mo13124a(C5501c.HEAVY, C5500b.REWARD, 2);
            }
            this.f15653i0 = i;
            m17129H();
        }
    }

    /* renamed from: b */
    private String m17135b(Context context) {
        return C7706a.m18752a(context, this.f15653i0, 9);
    }

    /* renamed from: a */
    public /* synthetic */ void mo14074a(C1379a aVar) throws Exception {
        m17130I();
    }

    /* renamed from: a */
    public /* synthetic */ void mo14076a(C3764a aVar) throws Exception {
        m17130I();
    }

    /* renamed from: a */
    public void mo14075a(C2470a aVar) {
        if (aVar != this.f15655k0) {
            int i = C6253e.f15676a[aVar.ordinal()];
            if (i == 1 || i == 2 || i == 3) {
                if (((C1380a) this.f15660p0.get()).mo6646a(((DescendantsPrefs) this.f15661q0.get()).getAllPreferences(), 1)) {
                    m17130I();
                }
                this.f15636R.setVisibility(0);
                this.f15637S.setVisibility(0);
                this.f15641W.setVisibility(0);
                this.f15639U.setVisibility(0);
                this.f15646b0.setVisibility(8);
                this.f15648d0.mo22797a();
                this.f15655k0 = aVar;
                m17128G();
                m17129H();
                m17130I();
                return;
            }
            this.f15636R.setVisibility(8);
        }
    }

    /* renamed from: a */
    public /* synthetic */ void mo14078a(C8506c cVar) {
        this.f15648d0.setComposition(cVar);
        this.f15647c0.setVisibility(4);
        if (this.f15651g0) {
            this.f15648d0.mo22807d();
        }
    }

    /* renamed from: a */
    public void mo14071a(int i, float f) {
        View m = mo23948m();
        if (m != null) {
            float f2 = i == 1 ? f : i == 2 ? 1.0f : 0.0f;
            this.f15642X.setRotation(9.0f * f2);
            float f3 = (f2 * 0.205f) + 1.0f;
            this.f15641W.setScaleX(f3);
            this.f15641W.setScaleY(f3);
            float f4 = i == 0 ? 1.0f - f : 0.0f;
            this.f15638T.setRotation(-9.0f * f4);
            float f5 = (f4 * 0.205f) + 1.0f;
            this.f15637S.setScaleX(f5);
            this.f15637S.setScaleY(f5);
            if (this.f15656l0) {
                if (f == 0.0f && (i == 0 || i == 2)) {
                    this.f15656l0 = false;
                } else {
                    return;
                }
            }
            if (i != 1) {
                f = 1.0f - f;
            }
            float f6 = 1.0f - f;
            float f7 = (0.205f * f6) + 1.0f;
            this.f15639U.setScaleX(f7);
            this.f15639U.setScaleY(f7);
            float f8 = (float) ((int) (((float) f15633z0) * f));
            this.f15643Y.setTranslationY(f8);
            this.f15643Y.setAlpha(f6);
            this.f15639U.setTranslationY(f8);
            int measuredWidth = (m.getMeasuredWidth() / 2) - f15630A0;
            int i2 = f15632y0;
            int i3 = (int) (((float) ((measuredWidth - i2) - (i2 / 2))) * f);
            this.f15637S.setTranslationX((float) i3);
            this.f15641W.setTranslationX((float) (-i3));
            this.f15664t0.onViewPagerScrolled(f, f15633z0);
        }
    }

    /* renamed from: a */
    public void mo14073a(long j) {
        long j2 = this.f15654j0;
        if (j2 != j) {
            if (j2 == 0 && mo9313v()) {
                C5498a.m15600a((Context) mo23920b()).mo13124a(C5501c.HEAVY, C5500b.REWARD, 2);
            }
            this.f15654j0 = j;
            m17128G();
        }
    }
}
