package app.zenly.locator.p207x;

import android.animation.Animator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import android.widget.Toast;
import androidx.browser.customtabs.C0296b;
import androidx.browser.customtabs.C0305d;
import androidx.core.content.C0540a;
import androidx.viewpager.widget.ViewPager.OnPageChangeListener;
import app.zenly.android.base.util.C1297b;
import app.zenly.android.feature.base.p009di.Provider;
import app.zenly.android.feature.base.scheduling.C1351e;
import app.zenly.android.feature.base.scheduling.ZenlySchedulers;
import app.zenly.locator.C3888j;
import app.zenly.locator.C5130q;
import app.zenly.locator.R;
import app.zenly.locator.brump.BumpHintView;
import app.zenly.locator.brump.C1736d;
import app.zenly.locator.chat.C2388y4;
import app.zenly.locator.chat.contract.ChatContract;
import app.zenly.locator.chat.p049k5.C2046g0;
import app.zenly.locator.chat.p059r5.C2309e;
import app.zenly.locator.chat.panel.emojis.EmojiPackController;
import app.zenly.locator.core.app.BaseActivity;
import app.zenly.locator.core.contracts.C2470a;
import app.zenly.locator.core.contracts.MapControllerContract.C2458b;
import app.zenly.locator.core.contracts.MapControllerContract.C2459c;
import app.zenly.locator.core.contracts.MapControllerContract.C2460d;
import app.zenly.locator.core.contracts.MapControllerContract.C2460d.C2461a;
import app.zenly.locator.core.contracts.MapControllerContract.C2462e;
import app.zenly.locator.core.contracts.MapControllerContract.C2463f;
import app.zenly.locator.core.contracts.MapControllerContract.C2465h.C2466a;
import app.zenly.locator.core.contracts.NavigationContract;
import app.zenly.locator.core.contracts.NavigationContract.C2467a;
import app.zenly.locator.core.contracts.NavigationContract.C2468b;
import app.zenly.locator.core.contracts.NavigationContract.C2469c;
import app.zenly.locator.core.invitations.C2542d0;
import app.zenly.locator.core.invitations.C2545e0;
import app.zenly.locator.core.invitations.p068g0.C2594d;
import app.zenly.locator.core.manager.C2687g5;
import app.zenly.locator.core.manager.C2718k5;
import app.zenly.locator.core.manager.C2800q5;
import app.zenly.locator.core.manager.C2800q5.C2801a;
import app.zenly.locator.core.manager.MeUserManager;
import app.zenly.locator.core.manager.p069di.C2660a;
import app.zenly.locator.core.manager.p069di.C2666b;
import app.zenly.locator.core.models.C2879d0;
import app.zenly.locator.core.models.C2887h;
import app.zenly.locator.core.models.C2888i;
import app.zenly.locator.core.models.C2889j;
import app.zenly.locator.core.models.C2891l;
import app.zenly.locator.core.models.C2898q.C2900b;
import app.zenly.locator.core.p072ui.activity.ChangeAvatarActivity;
import app.zenly.locator.core.p072ui.controller.ZenlyController;
import app.zenly.locator.core.p072ui.controller.ZenlyController.ChangeStartedCallback;
import app.zenly.locator.core.p072ui.view.C3140d;
import app.zenly.locator.core.p072ui.view.C3144f;
import app.zenly.locator.core.p072ui.view.SimpleInAppNotificationViewBuilder;
import app.zenly.locator.core.store.api.C2956k0;
import app.zenly.locator.core.store.api.C2998x;
import app.zenly.locator.core.store.api.FriendRequestStore;
import app.zenly.locator.core.store.api.FriendStore;
import app.zenly.locator.core.store.api.FriendshipStore;
import app.zenly.locator.core.store.p071di.C3015a;
import app.zenly.locator.core.store.p071di.StoreModule;
import app.zenly.locator.core.transition.C3061b;
import app.zenly.locator.core.util.C3198d0;
import app.zenly.locator.core.util.C3200e0;
import app.zenly.locator.core.widget.ViewPager;
import app.zenly.locator.dashboard.C3325v;
import app.zenly.locator.dashboard.p075w.C3333f;
import app.zenly.locator.decision.C3444a;
import app.zenly.locator.decision.p082b.p083u.C3498n;
import app.zenly.locator.discover.C3565n;
import app.zenly.locator.discover.C3570o;
import app.zenly.locator.discover.DiscoverManager;
import app.zenly.locator.discover.DiscoverManager.HotContentListener;
import app.zenly.locator.experimental.firstexperience.C3663a;
import app.zenly.locator.experimental.firstexperience.C3664b;
import app.zenly.locator.experimental.firstexperience.C3667d;
import app.zenly.locator.experimental.firstexperience.C3677h;
import app.zenly.locator.experimental.referrer.ReferrerDetails.C3744d;
import app.zenly.locator.inbox.InboxManager;
import app.zenly.locator.map.C3896a1;
import app.zenly.locator.map.C3906c1;
import app.zenly.locator.map.C4292t0;
import app.zenly.locator.map.C4407y0;
import app.zenly.locator.map.fog.C3943a;
import app.zenly.locator.map.fog.FogContract;
import app.zenly.locator.media.C4463s0;
import app.zenly.locator.media.C4473v0;
import app.zenly.locator.meet.C4495h0;
import app.zenly.locator.modals.C4541e2;
import app.zenly.locator.modals.C4545f2;
import app.zenly.locator.modals.ModalController;
import app.zenly.locator.modals.ModalController.ModalListener;
import app.zenly.locator.modals.ModalProvider;
import app.zenly.locator.modals.p119m2.C4597a;
import app.zenly.locator.p086e0.p087a.C3574b;
import app.zenly.locator.p135r.C5213z0;
import app.zenly.locator.p143s.C5343a;
import app.zenly.locator.p143s.C5343a.C5349f;
import app.zenly.locator.p143s.C5343a.C5355l;
import app.zenly.locator.p143s.C5343a.C5359p;
import app.zenly.locator.p143s.C5343a.C5360q;
import app.zenly.locator.p143s.C5407g;
import app.zenly.locator.p143s.p146j.C5432b;
import app.zenly.locator.p143s.p148l.C5447b;
import app.zenly.locator.p143s.p148l.C5448c;
import app.zenly.locator.p143s.p155r.C5498a;
import app.zenly.locator.p143s.p155r.C5498a.C5500b;
import app.zenly.locator.p143s.p155r.C5498a.C5501c;
import app.zenly.locator.p143s.p155r.C5502b;
import app.zenly.locator.p196u.p197b.C5943a;
import app.zenly.locator.p205v.C6155a;
import app.zenly.locator.p206w.C6177a.C6178a;
import app.zenly.locator.p208y.C6296g;
import app.zenly.locator.p208y.C6302i;
import app.zenly.locator.report.base.C5342k;
import app.zenly.locator.sharesheet.ShareSheetController;
import app.zenly.locator.support.C5724n0;
import app.zenly.locator.support.SupportActivity;
import app.zenly.locator.support.p168di.C5665b;
import app.zenly.locator.username.UsernameInputActivity;
import app.zenly.locator.username.idcard.CardPickerActivity;
import app.zenly.locator.view.SwipeableEdgeLayout;
import app.zenly.locator.view.SwipeableEdgeLayout.Controller;
import app.zenly.locator.view.SwipeableEdgeLayout.Listener;
import com.bluelinelabs.conductor.C8819d;
import com.bluelinelabs.conductor.C8831g;
import com.bluelinelabs.conductor.C8836h;
import com.bluelinelabs.conductor.ControllerChangeHandler;
import com.bluelinelabs.conductor.ControllerChangeHandler.ControllerChangeListener;
import com.bluelinelabs.conductor.changehandler.C8815b;
import com.bluelinelabs.conductor.changehandler.C8817d;
import com.bluelinelabs.conductor.changehandler.C8818e;
import com.bluelinelabs.conductor.p291j.C8851a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import kotlin.C12956q;
import kotlin.jvm.functions.Function1;
import p213co.znly.core.ZenlyCore;
import p213co.znly.models.C7339i;
import p213co.znly.models.PingProto$Conversation.C6818b;
import p213co.znly.models.PingProto$Ping2.C6824b.C6826b;
import p213co.znly.models.UserProto$User;
import p213co.znly.models.core.C7117i;
import p213co.znly.models.core.C7208s;
import p213co.znly.models.core.C7234v;
import p213co.znly.models.core.C7255y;
import p213co.znly.models.services.C7985a6.C7987b;
import p213co.znly.models.services.C8003b6;
import p213co.znly.models.services.C8224p2;
import p213co.znly.models.services.C8243q2;
import p213co.znly.models.services.C8243q2.C8244a;
import p250f.p251a.p252a.p263b.p264a.p271i.C7707a;
import p387h.p388a.C12143a;
import p389io.reactivex.C12279e;
import p389io.reactivex.C12286f;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.functions.Action;
import p389io.reactivex.functions.BiFunction;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.functions.Function;
import p389io.reactivex.functions.Predicate;
import p389io.reactivex.p390h.p392c.C12295a;
import p389io.reactivex.p406n.C12785a;

/* renamed from: app.zenly.locator.x.z1 */
public class C6272z1 extends ZenlyController implements NavigationContract, ModalListener, HotContentListener {
    /* access modifiers changed from: private */

    /* renamed from: T0 */
    public static final int f15696T0 = C3200e0.m10182a(5);
    /* access modifiers changed from: private */

    /* renamed from: U0 */
    public static final int f15697U0 = C3200e0.m10182a(136);
    /* access modifiers changed from: private */

    /* renamed from: V0 */
    public static final int f15698V0 = C3200e0.m10182a(100);
    /* access modifiers changed from: private */

    /* renamed from: W0 */
    public static final int f15699W0 = C3200e0.m10182a(72);

    /* renamed from: A0 */
    private DiscoverManager f15700A0;

    /* renamed from: B0 */
    private Float f15701B0;

    /* renamed from: C0 */
    private Float f15702C0;

    /* renamed from: D0 */
    private int f15703D0;

    /* renamed from: E0 */
    private int f15704E0;

    /* renamed from: F0 */
    private final C12275b f15705F0;

    /* renamed from: G0 */
    private final C12275b f15706G0;

    /* renamed from: H0 */
    private Provider<FriendStore> f15707H0;

    /* renamed from: I0 */
    private Provider<FriendRequestStore> f15708I0;

    /* renamed from: J0 */
    private Provider<FriendshipStore> f15709J0;

    /* renamed from: K0 */
    private Provider<MeUserManager> f15710K0;

    /* renamed from: L0 */
    private Provider<C2718k5> f15711L0;

    /* renamed from: M0 */
    private C3333f f15712M0;

    /* renamed from: N0 */
    private C6302i f15713N0;

    /* renamed from: O0 */
    private C5724n0 f15714O0;

    /* renamed from: P */
    private final ZenlySchedulers f15715P;

    /* renamed from: P0 */
    private Queue<ModalProvider> f15716P0;

    /* renamed from: Q */
    private final Handler f15717Q;

    /* renamed from: Q0 */
    private boolean f15718Q0;

    /* renamed from: R */
    private final ArrayList<C6279g> f15719R;

    /* renamed from: R0 */
    private final OnPageChangeListener f15720R0;

    /* renamed from: S */
    private final C5130q f15721S;

    /* renamed from: S0 */
    private final Runnable f15722S0;
    /* access modifiers changed from: private */

    /* renamed from: T */
    public final ArrayList<ZenlyController> f15723T;

    /* renamed from: U */
    private final ArrayList<ViewGroup> f15724U;

    /* renamed from: V */
    private final ArrayList<ViewGroup> f15725V;

    /* renamed from: W */
    private ViewGroup f15726W;

    /* renamed from: X */
    private ViewGroup f15727X;

    /* renamed from: Y */
    private View f15728Y;

    /* renamed from: Z */
    private ViewPager f15729Z;
    /* access modifiers changed from: private */

    /* renamed from: a0 */
    public ViewGroup f15730a0;

    /* renamed from: b0 */
    private ViewGroup f15731b0;

    /* renamed from: c0 */
    private ViewGroup f15732c0;

    /* renamed from: d0 */
    private ViewGroup f15733d0;
    /* access modifiers changed from: private */

    /* renamed from: e0 */
    public ViewGroup f15734e0;

    /* renamed from: f0 */
    private C4407y0 f15735f0;

    /* renamed from: g0 */
    private ZenlyController f15736g0;

    /* renamed from: h0 */
    private ZenlyController f15737h0;
    /* access modifiers changed from: private */

    /* renamed from: i0 */
    public C6248t1 f15738i0;
    /* access modifiers changed from: private */

    /* renamed from: j0 */
    public C3325v f15739j0;
    /* access modifiers changed from: private */

    /* renamed from: k0 */
    public C2470a f15740k0;

    /* renamed from: l0 */
    private boolean f15741l0;

    /* renamed from: m0 */
    private SwipeableEdgeLayout f15742m0;

    /* renamed from: n0 */
    private C8851a f15743n0;

    /* renamed from: o0 */
    private ChatContract f15744o0;

    /* renamed from: p0 */
    private C3565n f15745p0;

    /* renamed from: q0 */
    private C4292t0 f15746q0;

    /* renamed from: r0 */
    private FogContract f15747r0;

    /* renamed from: s0 */
    private C3140d f15748s0;

    /* renamed from: t0 */
    private C3140d f15749t0;

    /* renamed from: u0 */
    private C6296g f15750u0;
    /* access modifiers changed from: private */

    /* renamed from: v0 */
    public boolean f15751v0;
    /* access modifiers changed from: private */

    /* renamed from: w0 */
    public boolean f15752w0;

    /* renamed from: x0 */
    private String f15753x0;

    /* renamed from: y0 */
    private final C12785a<Boolean> f15754y0;

    /* renamed from: z0 */
    private final C12785a<Boolean> f15755z0;

    /* renamed from: app.zenly.locator.x.z1$a */
    class C6273a implements Controller {
        C6273a() {
        }

        /* renamed from: a */
        private boolean m17318a() {
            return C6272z1.this.f15740k0 == C2470a.MAP && C6272z1.this.m17184S();
        }

        public int getClickableEdgeWidth() {
            C6272z1 z1Var = C6272z1.this;
            int i = 0;
            if (z1Var.mo23896a(z1Var.f15734e0).mo24003c() > 0) {
                return 0;
            }
            if (C6272z1.this.f15752w0) {
                i = C6272z1.f15698V0;
            }
            return i;
        }

        public int getSwipeableBottomEdgeHeight() {
            if (!m17318a() || (C6272z1.this.f15739j0 != null && C6272z1.this.f15739j0.mo9804C())) {
                return 0;
            }
            return C6272z1.f15699W0;
        }

        public int getSwipeableBottomHeight() {
            if (m17318a()) {
                return C6272z1.f15697U0;
            }
            return -1;
        }

        public int getSwipeableEdgeWidth() {
            if (m17318a()) {
                return C6272z1.f15696T0;
            }
            return -1;
        }
    }

    /* renamed from: app.zenly.locator.x.z1$b */
    class C6274b implements Listener {
        C6274b() {
        }

        public void onBottomEdgeSwipe(MotionEvent motionEvent, boolean z) {
            C6272z1.this.m17228b(motionEvent, z);
        }

        public void onLeftEdgeClick() {
            if (C6272z1.this.f15751v0) {
                C6272z1.this.mo14093G();
            }
        }

        public void onRightEdgeClick() {
            if (C6272z1.this.f15751v0) {
                C6272z1.this.mo14091E();
            }
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            if (C6272z1.this.f15738i0 == null || !C6272z1.this.m17184S() || ((C6272z1.this.f15739j0 != null && (C6272z1.this.f15739j0.mo9804C() || C6272z1.this.f15739j0.mo9805D())) || C2388y4.m8429d().mo8319a() != null)) {
                return false;
            }
            return C6272z1.this.f15738i0.mo14083b(motionEvent);
        }
    }

    /* renamed from: app.zenly.locator.x.z1$c */
    class C6275c extends C8851a {
        C6275c(C8819d dVar) {
            super(dVar);
        }

        /* renamed from: a */
        public void mo8132a(C8831g gVar, int i) {
            if (!gVar.mo24012j() && i < C6272z1.this.f15723T.size()) {
                gVar.mo24008d(C8836h.m21058a((C8819d) C6272z1.this.f15723T.get(i)));
            }
        }

        public int getCount() {
            return C6272z1.this.f15723T.size();
        }
    }

    /* renamed from: app.zenly.locator.x.z1$d */
    class C6276d implements OnPageChangeListener {

        /* renamed from: a */
        int f15759a = -1;

        /* renamed from: b */
        int f15760b = -1;

        /* renamed from: c */
        int f15761c = -1;

        /* renamed from: d */
        boolean f15762d = false;

        C6276d() {
        }

        public void onPageScrollStateChanged(int i) {
            if (i == 0) {
                int i2 = this.f15760b;
                if (i2 == this.f15759a || i2 == -1 || i2 >= C6272z1.this.f15723T.size()) {
                    int i3 = this.f15761c;
                    if (!(i3 == this.f15759a || i3 == -1 || i3 >= C6272z1.this.f15723T.size())) {
                        ((ZenlyController) C6272z1.this.f15723T.get(this.f15761c)).mo9311d(false);
                    }
                } else {
                    ((ZenlyController) C6272z1.this.f15723T.get(this.f15760b)).mo9311d(false);
                }
                this.f15761c = -1;
                C6272z1.this.m17198a((float) this.f15759a);
                if (C6272z1.this.f15740k0 == C2470a.INBOX) {
                    C5343a.m15160U().mo12909u();
                } else if (C6272z1.this.f15740k0 == C2470a.MY_PROFILE) {
                    C5343a.m15160U().mo12914z();
                }
            } else if (i == 1) {
                this.f15762d = true;
            }
        }

        public void onPageScrolled(int i, float f, int i2) {
            C6272z1.this.m17198a(((float) i) + f);
            if (this.f15762d) {
                this.f15761c = i == this.f15759a ? i + 1 : i;
                if (this.f15761c < C6272z1.this.f15723T.size()) {
                    ((ZenlyController) C6272z1.this.f15723T.get(this.f15761c)).mo9311d(true);
                }
                this.f15762d = false;
            }
            if (C6272z1.this.f15738i0 != null) {
                C6272z1.this.f15738i0.mo14071a(i, f);
            }
            C6272z1.this.m17199a(i, f);
        }

        public void onPageSelected(int i) {
            this.f15760b = this.f15759a;
            this.f15759a = i;
        }
    }

    /* renamed from: app.zenly.locator.x.z1$e */
    class C6277e extends C5432b {

        /* renamed from: b */
        final /* synthetic */ View f15764b;

        /* renamed from: c */
        final /* synthetic */ int f15765c;

        C6277e(View view, int i) {
            this.f15764b = view;
            this.f15765c = i;
        }

        /* renamed from: a */
        public void mo7336a(Animator animator, boolean z) {
            this.f15764b.setVisibility(this.f15765c);
            if (this.f15764b == C6272z1.this.f15730a0) {
                C6272z1.this.m17189X();
            }
        }

        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            this.f15764b.setVisibility(0);
        }
    }

    /* renamed from: app.zenly.locator.x.z1$f */
    static /* synthetic */ class C6278f {

        /* renamed from: a */
        static final /* synthetic */ int[] f15767a = new int[C6826b.values().length];

        /* renamed from: b */
        static final /* synthetic */ int[] f15768b = new int[C2470a.values().length];

        /* renamed from: c */
        static final /* synthetic */ int[] f15769c = new int[C2466a.values().length];

        /* renamed from: d */
        static final /* synthetic */ int[] f15770d = new int[C2469c.values().length];

        /* renamed from: e */
        static final /* synthetic */ int[] f15771e = new int[C2468b.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(45:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|21|22|(2:23|24)|25|27|28|29|30|(2:31|32)|33|35|36|37|38|39|40|41|42|43|44|(2:45|46)|47|49|50|51|52|53|54|55|57|58|59|60|62) */
        /* JADX WARNING: Can't wrap try/catch for region: R(48:0|(2:1|2)|3|5|6|7|(2:9|10)|11|(2:13|14)|15|17|18|19|21|22|(2:23|24)|25|27|28|29|30|(2:31|32)|33|35|36|37|38|39|40|41|42|43|44|45|46|47|49|50|51|52|53|54|55|57|58|59|60|62) */
        /* JADX WARNING: Can't wrap try/catch for region: R(49:0|(2:1|2)|3|5|6|7|(2:9|10)|11|(2:13|14)|15|17|18|19|21|22|(2:23|24)|25|27|28|29|30|31|32|33|35|36|37|38|39|40|41|42|43|44|45|46|47|49|50|51|52|53|54|55|57|58|59|60|62) */
        /* JADX WARNING: Can't wrap try/catch for region: R(52:0|1|2|3|5|6|7|(2:9|10)|11|13|14|15|17|18|19|21|22|23|24|25|27|28|29|30|31|32|33|35|36|37|38|39|40|41|42|43|44|45|46|47|49|50|51|52|53|54|55|57|58|59|60|62) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x004b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0069 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0073 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x009a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00a4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00ae */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00b8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x00d5 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x00df */
        /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x00fc */
        static {
            /*
                app.zenly.locator.core.contracts.NavigationContract$b[] r0 = app.zenly.locator.core.contracts.NavigationContract.C2468b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f15771e = r0
                r0 = 1
                int[] r1 = f15771e     // Catch:{ NoSuchFieldError -> 0x0014 }
                app.zenly.locator.core.contracts.NavigationContract$b r2 = app.zenly.locator.core.contracts.NavigationContract.C2468b.ADD_FRIENDS     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                r1 = 2
                int[] r2 = f15771e     // Catch:{ NoSuchFieldError -> 0x001f }
                app.zenly.locator.core.contracts.NavigationContract$b r3 = app.zenly.locator.core.contracts.NavigationContract.C2468b.BEST_FRIENDS     // Catch:{ NoSuchFieldError -> 0x001f }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                r2 = 3
                int[] r3 = f15771e     // Catch:{ NoSuchFieldError -> 0x002a }
                app.zenly.locator.core.contracts.NavigationContract$b r4 = app.zenly.locator.core.contracts.NavigationContract.C2468b.BEST_FRIENDS_UNLOCKED     // Catch:{ NoSuchFieldError -> 0x002a }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                r3 = 4
                int[] r4 = f15771e     // Catch:{ NoSuchFieldError -> 0x0035 }
                app.zenly.locator.core.contracts.NavigationContract$b r5 = app.zenly.locator.core.contracts.NavigationContract.C2468b.PRIVACY     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                r4 = 5
                int[] r5 = f15771e     // Catch:{ NoSuchFieldError -> 0x0040 }
                app.zenly.locator.core.contracts.NavigationContract$b r6 = app.zenly.locator.core.contracts.NavigationContract.C2468b.RENAME     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                r5 = 6
                int[] r6 = f15771e     // Catch:{ NoSuchFieldError -> 0x004b }
                app.zenly.locator.core.contracts.NavigationContract$b r7 = app.zenly.locator.core.contracts.NavigationContract.C2468b.SETTINGS     // Catch:{ NoSuchFieldError -> 0x004b }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r6[r7] = r5     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                int[] r6 = f15771e     // Catch:{ NoSuchFieldError -> 0x0056 }
                app.zenly.locator.core.contracts.NavigationContract$b r7 = app.zenly.locator.core.contracts.NavigationContract.C2468b.SET_USERNAME     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r8 = 7
                r6[r7] = r8     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                app.zenly.locator.core.contracts.NavigationContract$c[] r6 = app.zenly.locator.core.contracts.NavigationContract.C2469c.values()
                int r6 = r6.length
                int[] r6 = new int[r6]
                f15770d = r6
                int[] r6 = f15770d     // Catch:{ NoSuchFieldError -> 0x0069 }
                app.zenly.locator.core.contracts.NavigationContract$c r7 = app.zenly.locator.core.contracts.NavigationContract.C2469c.PRIVACY     // Catch:{ NoSuchFieldError -> 0x0069 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0069 }
                r6[r7] = r0     // Catch:{ NoSuchFieldError -> 0x0069 }
            L_0x0069:
                int[] r6 = f15770d     // Catch:{ NoSuchFieldError -> 0x0073 }
                app.zenly.locator.core.contracts.NavigationContract$c r7 = app.zenly.locator.core.contracts.NavigationContract.C2469c.ADD_FRIENDS     // Catch:{ NoSuchFieldError -> 0x0073 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0073 }
                r6[r7] = r1     // Catch:{ NoSuchFieldError -> 0x0073 }
            L_0x0073:
                int[] r6 = f15770d     // Catch:{ NoSuchFieldError -> 0x007d }
                app.zenly.locator.core.contracts.NavigationContract$c r7 = app.zenly.locator.core.contracts.NavigationContract.C2469c.MEET     // Catch:{ NoSuchFieldError -> 0x007d }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x007d }
                r6[r7] = r2     // Catch:{ NoSuchFieldError -> 0x007d }
            L_0x007d:
                app.zenly.locator.core.contracts.MapControllerContract$h$a[] r6 = app.zenly.locator.core.contracts.MapControllerContract.C2465h.C2466a.values()
                int r6 = r6.length
                int[] r6 = new int[r6]
                f15769c = r6
                int[] r6 = f15769c     // Catch:{ NoSuchFieldError -> 0x0090 }
                app.zenly.locator.core.contracts.MapControllerContract$h$a r7 = app.zenly.locator.core.contracts.MapControllerContract.C2465h.C2466a.SELECT     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r6[r7] = r0     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r6 = f15769c     // Catch:{ NoSuchFieldError -> 0x009a }
                app.zenly.locator.core.contracts.MapControllerContract$h$a r7 = app.zenly.locator.core.contracts.MapControllerContract.C2465h.C2466a.SWITCH     // Catch:{ NoSuchFieldError -> 0x009a }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x009a }
                r6[r7] = r1     // Catch:{ NoSuchFieldError -> 0x009a }
            L_0x009a:
                int[] r6 = f15769c     // Catch:{ NoSuchFieldError -> 0x00a4 }
                app.zenly.locator.core.contracts.MapControllerContract$h$a r7 = app.zenly.locator.core.contracts.MapControllerContract.C2465h.C2466a.FOCUS     // Catch:{ NoSuchFieldError -> 0x00a4 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a4 }
                r6[r7] = r2     // Catch:{ NoSuchFieldError -> 0x00a4 }
            L_0x00a4:
                int[] r6 = f15769c     // Catch:{ NoSuchFieldError -> 0x00ae }
                app.zenly.locator.core.contracts.MapControllerContract$h$a r7 = app.zenly.locator.core.contracts.MapControllerContract.C2465h.C2466a.UNSELECT     // Catch:{ NoSuchFieldError -> 0x00ae }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x00ae }
                r6[r7] = r3     // Catch:{ NoSuchFieldError -> 0x00ae }
            L_0x00ae:
                int[] r3 = f15769c     // Catch:{ NoSuchFieldError -> 0x00b8 }
                app.zenly.locator.core.contracts.MapControllerContract$h$a r6 = app.zenly.locator.core.contracts.MapControllerContract.C2465h.C2466a.RESELECT     // Catch:{ NoSuchFieldError -> 0x00b8 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b8 }
                r3[r6] = r4     // Catch:{ NoSuchFieldError -> 0x00b8 }
            L_0x00b8:
                int[] r3 = f15769c     // Catch:{ NoSuchFieldError -> 0x00c2 }
                app.zenly.locator.core.contracts.MapControllerContract$h$a r4 = app.zenly.locator.core.contracts.MapControllerContract.C2465h.C2466a.LOST_POSITION     // Catch:{ NoSuchFieldError -> 0x00c2 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c2 }
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x00c2 }
            L_0x00c2:
                app.zenly.locator.core.contracts.a[] r3 = app.zenly.locator.core.contracts.C2470a.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f15768b = r3
                int[] r3 = f15768b     // Catch:{ NoSuchFieldError -> 0x00d5 }
                app.zenly.locator.core.contracts.a r4 = app.zenly.locator.core.contracts.C2470a.INBOX     // Catch:{ NoSuchFieldError -> 0x00d5 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d5 }
                r3[r4] = r0     // Catch:{ NoSuchFieldError -> 0x00d5 }
            L_0x00d5:
                int[] r3 = f15768b     // Catch:{ NoSuchFieldError -> 0x00df }
                app.zenly.locator.core.contracts.a r4 = app.zenly.locator.core.contracts.C2470a.MAP     // Catch:{ NoSuchFieldError -> 0x00df }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x00df }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x00df }
            L_0x00df:
                int[] r3 = f15768b     // Catch:{ NoSuchFieldError -> 0x00e9 }
                app.zenly.locator.core.contracts.a r4 = app.zenly.locator.core.contracts.C2470a.MY_PROFILE     // Catch:{ NoSuchFieldError -> 0x00e9 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e9 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x00e9 }
            L_0x00e9:
                co.znly.models.PingProto$Ping2$b$b[] r2 = p213co.znly.models.PingProto$Ping2.C6824b.C6826b.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f15767a = r2
                int[] r2 = f15767a     // Catch:{ NoSuchFieldError -> 0x00fc }
                co.znly.models.PingProto$Ping2$b$b r3 = p213co.znly.models.PingProto$Ping2.C6824b.C6826b.EMOJI     // Catch:{ NoSuchFieldError -> 0x00fc }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x00fc }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x00fc }
            L_0x00fc:
                int[] r0 = f15767a     // Catch:{ NoSuchFieldError -> 0x0106 }
                co.znly.models.PingProto$Ping2$b$b r2 = p213co.znly.models.PingProto$Ping2.C6824b.C6826b.TEXT     // Catch:{ NoSuchFieldError -> 0x0106 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0106 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0106 }
            L_0x0106:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.p207x.C6272z1.C6278f.<clinit>():void");
        }
    }

    /* renamed from: app.zenly.locator.x.z1$g */
    private class C6279g implements ControllerChangeListener {

        /* renamed from: e */
        final ViewGroup f15772e;

        /* renamed from: f */
        final C8831g f15773f;

        /* renamed from: g */
        private final ChangeStartedCallback f15774g = new C6226m0(this);

        C6279g(ViewGroup viewGroup) {
            this.f15772e = viewGroup;
            this.f15773f = C6272z1.this.mo23896a(viewGroup);
            this.f15773f.mo23990a((ControllerChangeListener) this);
        }

        /* renamed from: a */
        public /* synthetic */ void mo14127a() {
            C6272z1.this.m17191Z();
            C6272z1.this.m17189X();
            C6272z1.this.m17226a0();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo14128b() {
            this.f15773f.mo24002b((ControllerChangeListener) this);
        }

        public void onChangeCompleted(C8819d dVar, C8819d dVar2, boolean z, ViewGroup viewGroup, ControllerChangeHandler controllerChangeHandler) {
            if (dVar instanceof ZenlyController) {
                ((ZenlyController) dVar).mo9308b(this.f15774g);
            }
            C6272z1.this.m17191Z();
            C6272z1.this.m17189X();
            C6272z1.this.m17226a0();
        }

        public void onChangeStarted(C8819d dVar, C8819d dVar2, boolean z, ViewGroup viewGroup, ControllerChangeHandler controllerChangeHandler) {
            if (dVar instanceof ZenlyController) {
                ((ZenlyController) dVar).mo9306a(this.f15774g);
            }
            C6272z1.this.m17206a(this.f15772e, dVar, dVar2);
        }
    }

    public C6272z1() {
        this(Bundle.EMPTY);
    }

    /* renamed from: N */
    private void m17179N() {
        if (this.f15747r0 != null) {
            m17203a(this.f15727X, (C8819d) null, (ControllerChangeHandler) new C8815b());
            this.f15747r0 = null;
        }
    }

    /* renamed from: O */
    private void m17180O() {
        if (this.f15746q0 != null) {
            m17203a(this.f15727X, (C8819d) null, (ControllerChangeHandler) new C8815b());
            this.f15746q0 = null;
            this.f15738i0.mo14070E();
        }
    }

    /* renamed from: P */
    private void m17181P() {
        if (this.f15738i0 == null) {
            C7707a.m18761b("createControls");
            this.f15738i0 = this.f15721S.mo12450b();
            this.f15738i0.mo23929b((C8819d) this);
            m17207a(this.f15730a0, (C8819d) this.f15738i0, false);
            this.f15738i0.mo9311d(true);
            this.f15738i0.mo14075a(this.f15740k0);
            C7707a.m18759a();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Q */
    public void mo7192B() {
        if (this.f15735f0 == null) {
            C7707a.m18761b("createMapLayer");
            C7707a.m18761b("createMapController");
            if (C3444a.m10686a(mo9304A()).mo6511a("feature:tharpDeepIntegration")) {
                this.f15735f0 = this.f15721S.mo12461k();
            } else {
                this.f15735f0 = this.f15721S.mo12456f();
            }
            C7707a.m18759a();
            C7707a.m18761b("configureMapController");
            this.f15735f0.mo23929b((C8819d) this);
            this.f15735f0.mo11346a(C2462e.AUTO);
            this.f15735f0.mo9311d(true);
            C7707a.m18759a();
            C7707a.m18761b("addMapToRouter");
            m17207a(this.f15726W, (C8819d) this.f15735f0, false);
            C7707a.m18759a();
            C7707a.m18759a();
        }
    }

    /* renamed from: R */
    private boolean m17183R() {
        Iterator it = this.f15724U.iterator();
        while (it.hasNext()) {
            if (m17241c((ViewGroup) it.next())) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: S */
    public boolean m17184S() {
        for (int i = 0; i < this.f15724U.size(); i++) {
            if (this.f15725V.contains((ViewGroup) this.f15724U.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: T */
    static /* synthetic */ void m17185T() {
    }

    /* renamed from: U */
    static /* synthetic */ void m17186U() {
    }

    /* renamed from: W */
    private boolean m17188W() {
        if (this.f15729Z.getCurrentItem() == m17236c(C2470a.MY_PROFILE) && this.f15729Z.getVisibility() == 0) {
            return !m17183R();
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: X */
    public void m17189X() {
        if (this.f15738i0 != null) {
            this.f15738i0.mo9311d(this.f15730a0.getVisibility() == 0 && !m17183R());
        }
    }

    /* renamed from: Y */
    private void m17190Y() {
        if (this.f15729Z.getCurrentItem() < this.f15723T.size()) {
            onControllerOpacityChange((ZenlyController) this.f15723T.get(this.f15729Z.getCurrentItem()));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Z */
    public void m17191Z() {
        C4407y0 y0Var = this.f15735f0;
        if (y0Var != null) {
            y0Var.mo9311d(mo14090D());
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m17223a(Throwable th) throws Exception {
    }

    /* access modifiers changed from: private */
    /* renamed from: a0 */
    public void m17226a0() {
        if (m17236c(C2470a.MY_PROFILE) < this.f15723T.size()) {
            ZenlyController zenlyController = (ZenlyController) this.f15723T.get(m17236c(C2470a.MY_PROFILE));
            if (zenlyController != null) {
                zenlyController.mo9311d(m17188W());
            }
        }
    }

    /* renamed from: b0 */
    private void m17235b0() {
        int max = Math.max(this.f15703D0, this.f15704E0);
        C4407y0 y0Var = this.f15735f0;
        if (y0Var != null) {
            y0Var.mo11343a(0, 0, 0, max);
        }
        FogContract fogContract = this.f15747r0;
        if (fogContract != null) {
            fogContract.setBottomInset(max);
        }
    }

    /* renamed from: c0 */
    private void m17243c0() {
        C7707a.m18761b("setupMapEmojisInteraction");
        this.f15705F0.mo36403a(EmojiPackController.f6802b0.mo36428a((C12286f) this.f15715P.getMainThread()).mo36412a((Consumer<? super T>) new C6234p<Object>(this), (Consumer<? super Throwable>) C6270z.f15694e), EmojiPackController.f6803c0.mo36428a((C12286f) this.f15715P.getMainThread()).mo36412a((Consumer<? super T>) new C6203e1<Object>(this), (Consumer<? super Throwable>) C6215i1.f15595e), EmojiPackController.m8058C().mo36428a((C12286f) this.f15715P.getMainThread()).mo36412a((Consumer<? super T>) new C6238q0<Object>(this), (Consumer<? super Throwable>) C6263x.f15688e));
        C7707a.m18759a();
    }

    /* renamed from: d0 */
    private void m17248d0() {
        C7707a.m18761b("setupSupportNotification");
        this.f15705F0.add(this.f15714O0.mo13408h().mo36428a((C12286f) this.f15715P.getMainThread()).mo36412a((Consumer<? super T>) new C6255u0<Object>(this), (Consumer<? super Throwable>) C6240r.f15621e));
        C7707a.m18759a();
    }

    /* renamed from: e0 */
    private void m17252e0() {
        this.f15750u0 = new C6296g(mo9304A(), new C6211h0(this), this.f15755z0);
        this.f15705F0.add(this.f15713N0.mo14160b(mo9304A()).mo36428a((C12286f) this.f15715P.getMainThread()).mo36412a((Consumer<? super T>) new C6246t<Object>(this), (Consumer<? super Throwable>) C6223l0.f15603e));
    }

    /* renamed from: f0 */
    private void m17256f0() {
        this.f15736g0 = this.f15721S.mo12455e();
        this.f15736g0.mo23929b((C8819d) this);
        this.f15737h0 = this.f15721S.mo12458h();
        this.f15737h0.mo23929b((C8819d) this);
        this.f15723T.add(this.f15736g0);
        this.f15723T.add(new C6256u1());
        this.f15723T.add(this.f15737h0);
        this.f15729Z.mo6331a(this.f15720R0);
        this.f15729Z.setOffscreenPageLimit(2);
        this.f15742m0.setController(new C6273a());
        this.f15742m0.setListener(new C6274b());
        this.f15743n0 = new C6275c(this);
        this.f15729Z.setAdapter(this.f15743n0);
    }

    /* renamed from: C */
    public /* synthetic */ C3144f mo14089C() {
        return mo9312u().mo8414c();
    }

    /* renamed from: D */
    public boolean mo14090D() {
        if (this.f15741l0 || this.f15729Z.getVisibility() != 0) {
            return !m17183R();
        }
        return false;
    }

    /* renamed from: E */
    public void mo14091E() {
        if (this.f15700A0 != null) {
            onDiscoverNext();
        }
    }

    /* renamed from: F */
    public void mo14092F() {
        C3325v vVar = this.f15739j0;
        if (vVar == null) {
            m17255f(true);
        } else {
            vVar.mo9808G();
        }
        C5343a.m15160U().mo12902n();
    }

    /* renamed from: G */
    public void mo14093G() {
        DiscoverManager discoverManager = this.f15700A0;
        if (discoverManager != null) {
            C3565n k = discoverManager.mo10023k();
            if (k != null) {
                m17250e((C8819d) k);
                C5343a.m15160U().mo12878e("edge_tap");
            }
        }
    }

    /* renamed from: H */
    public void mo14094H() {
        C5343a.m15160U().mo12882f("end_view_replay_button_tap");
        this.f15700A0.mo10024l();
        onDiscoverNext();
    }

    /* renamed from: I */
    public void mo14095I() {
        m17202a(this.f15732c0, (C8819d) null);
        m17202a(this.f15733d0, (C8819d) null);
        m17202a(this.f15734e0, (C8819d) null);
        m17179N();
        m17230b(C2470a.MY_PROFILE);
        m17226a0();
        mo23902a(ChangeAvatarActivity.m9604a(mo23920b()));
    }

    public void displayNoFriendController() {
        C8815b bVar = new C8815b(150);
        BaseActivity baseActivity = (BaseActivity) mo9304A();
        C3667d dVar = new C3667d();
        dVar.setNavigation(this);
        C8831g b = baseActivity.mo8413b();
        C8836h a = C8836h.m21058a((C8819d) dVar);
        a.mo24026b(bVar);
        a.mo24023a((ControllerChangeHandler) bVar);
        b.mo23991a(a);
    }

    public void displaySupport() {
        m17238c(SupportActivity.m15947a(mo23920b()));
    }

    public String getFogDisplayName() {
        FogContract fogContract = this.f15747r0;
        if (fogContract != null) {
            return fogContract.getDisplayName();
        }
        return null;
    }

    public boolean handleBack() {
        this.f15753x0 = "exit_button_tap";
        if (!m17184S()) {
            for (int size = this.f15724U.size() - 1; size >= 0; size--) {
                if (mo23896a((ViewGroup) this.f15724U.get(size)).mo24011i()) {
                    return true;
                }
            }
        }
        C3325v vVar = this.f15739j0;
        if (vVar == null || (!vVar.mo9804C() && !this.f15739j0.mo9805D())) {
            ZenlyController zenlyController = this.f15736g0;
            if (zenlyController != null && zenlyController.handleBack()) {
                return true;
            }
            if (m17188W()) {
                ZenlyController zenlyController2 = this.f15737h0;
                if (zenlyController2 != null && zenlyController2.handleBack()) {
                    return true;
                }
            }
            C2470a aVar = this.f15740k0;
            C2470a aVar2 = C2470a.MAP;
            if (aVar == aVar2) {
                return super.handleBack();
            }
            m17209a(aVar2, true);
            return true;
        }
        this.f15739j0.mo7192B();
        return true;
    }

    public void handleFriendshipFactsPlaceholderActionClick(Context context) {
        C5498a.m15600a(context).mo13123a(C5501c.LIGHT, C5500b.NAV);
        onInboxAddFriends();
    }

    public void moveMapOnUsers(C2879d0[] d0VarArr, float f, int i) {
        this.f15735f0.mo11342a(d0VarArr, f, i);
    }

    public void onChatClick(C2467a aVar, String str) {
        C8819d dVar;
        C5359p pVar = aVar == C2467a.PROFILE ? C5359p.PROFILE_BUTTON_TAP : aVar == C2467a.MARKER ? C5359p.MARKER_TAP : aVar == C2467a.MINI_AVATAR ? C5359p.CHAT_MINI_AVATAR_TAPPED : aVar == C2467a.OTHER ? C5359p.OTHER : null;
        if (pVar == null) {
            dVar = this.f15721S.mo12452c(str);
        } else {
            dVar = this.f15721S.mo12447a(str, pVar);
        }
        m17246d(dVar);
        C1297b.m6236a(mo23920b());
    }

    public void onChatDismissed(boolean z) {
        m17263h(z);
    }

    public void onChatHeightChanged(int i) {
        this.f15703D0 = i;
        m17235b0();
    }

    public void onChatMeetClick(String str) {
        m17214a(this.f15721S.mo12449b(str));
    }

    public void onContactPickerContactSelected(C7339i iVar) {
        m17245d(this.f15721S.mo12441a(iVar));
    }

    public void onContactPickerUserSelected(UserProto$User userProto$User) {
        mo14115a(userProto$User.getUuid(), false, true);
    }

    public void onControllerOpacityChange(ZenlyController zenlyController) {
        m17191Z();
        m17189X();
        m17226a0();
        int i = zenlyController instanceof C3574b;
        if ((i != 0 || (zenlyController instanceof C2046g0)) && this.f15732c0.getChildCount() > i) {
            ViewGroup viewGroup = this.f15732c0;
            viewGroup.getChildAt(viewGroup.getChildCount() - (i + 1)).setVisibility(zenlyController.mo7339w() ? 8 : 0);
        }
    }

    public void onConversationCreated(C7117i iVar) {
        m17245d(this.f15721S.mo12440a(iVar, false, false));
    }

    public void onDashboardContactClick(C7339i iVar) {
        this.f15739j0.mo7192B();
        this.f15744o0 = this.f15721S.mo12441a(iVar);
    }

    public void onDashboardManageFriendsClick() {
        C8819d g = this.f15721S.mo12457g();
        g.mo23929b((C8819d) this);
        m17203a(this.f15733d0, g, (ControllerChangeHandler) new C8818e());
    }

    public void onDashboardUserClick(String str) {
        this.f15739j0.mo7192B();
        this.f15744o0 = this.f15721S.mo12442a(str, false, true);
    }

    public void onDiscoverNext() {
        C3565n f = this.f15700A0.mo10018f();
        if (f == null) {
            C3570o oVar = new C3570o();
            oVar.mo23929b((C8819d) this);
            m17205a(this.f15732c0, (C8819d) oVar, (ControllerChangeHandler) new C8815b(), true);
            return;
        }
        m17250e((C8819d) f);
    }

    public void onFogDisplayFriend(String str) {
        m17179N();
        C3896a1.m11470r().mo10506a(str, true);
    }

    public void onFogUserClickOutside() {
        m17263h(true);
    }

    public void onFootstepsClicked() {
        C5448c.m15478a().setFootstepsStarted(true);
        C5448c.m15478a().setFootstepsOnboardingDone(true);
        ZenlyCore a = C5448c.m15478a();
        C8244a newBuilder = C8243q2.newBuilder();
        newBuilder.mo22223a(true);
        this.f15705F0.add(a.footstepsWebSet((C8243q2) newBuilder.build()).mo36490e((Function<? super T, ? extends ObservableSource<? extends R>>) C6217j0.f15597e).mo36428a(C12295a.m32802a()).mo36476d((Consumer<? super T>) new C6202e0<Object>(this)));
    }

    public void onGroupChatInfoClick(C7117i iVar) {
        C2046g0 d = C2046g0.m7766d(iVar.getInboxUuid());
        if (d != null) {
            m17239c((C8819d) d);
            C1297b.m6236a(mo23920b());
        }
    }

    public void onGroupChatMemberClick(String str) {
        mo14115a(str, true, false);
    }

    public void onInboxAddFriends() {
        C5343a.m15160U().mo12891i();
        C8819d a = this.f15721S.mo12446a();
        a.mo23929b((C8819d) this);
        m17207a(this.f15733d0, a, false);
    }

    public void onInboxContactSelected(C7339i iVar) {
        m17245d(this.f15721S.mo12441a(iVar));
    }

    public void onInboxConversationSelected(C7117i iVar) {
        boolean z = false;
        if (!iVar.hasLastMessage() || iVar.getLastMessage().getContent(0).getType() != C6826b.EMOJI || iVar.getNbPing() <= 0) {
            z = true;
        }
        if (C3498n.f9481a.isOpen()) {
            mo14115a(iVar.getInboxUuid(), z, !z);
        } else {
            C4473v0.m13258a(this, iVar.getInboxUuid(), z);
        }
    }

    public void onInboxCreateGroup() {
        ShareSheetController a = this.f15721S.mo12444a((Context) mo23920b());
        a.mo23929b((C8819d) this.f15736g0);
        m17202a(this.f15733d0, (C8819d) a);
    }

    public void onInboxMediaRequestClick(C7234v vVar) {
        mo23902a(C4473v0.m13254a((Context) mo23920b(), vVar));
    }

    public void onInboxUserSelected(UserProto$User userProto$User) {
        if (C3498n.f9481a.isOpen()) {
            mo14115a(userProto$User.getUuid(), true, false);
        } else {
            C4473v0.m13258a(this, userProto$User.getUuid(), true);
        }
    }

    public void onLocationDisabledCalloutClick() {
        ChatContract a = C2388y4.m8429d().mo8319a();
        if (a != null) {
            a.popLocationDisabledDialog();
        }
    }

    public void onMapFriendSelection(C2459c cVar) {
        if (!cVar.f7401b) {
            C2466a aVar = cVar.f7400a;
            if (!(aVar == C2466a.LOST_POSITION || aVar == C2466a.FOCUS)) {
                return;
            }
        }
        ChatContract a = C2388y4.m8429d().mo8319a();
        switch (C6278f.f15769c[cVar.f7400a.ordinal()]) {
            case 1:
            case 2:
                if (this.f15751v0) {
                    m17202a(this.f15732c0, (C8819d) null);
                }
                String g = cVar.f7380c.f8198b.mo8945g();
                C5343a.m15160U().mo12866b(cVar.f7380c.f8212p > 0);
                if (!C3498n.f9481a.isOpen()) {
                    C4473v0.m13258a(this, g, false);
                    break;
                } else {
                    mo14115a(g, false, true);
                    break;
                }
            case 3:
                if (a != null) {
                    a.enableEmojisReception();
                    break;
                }
                break;
            case 4:
                if (!this.f15751v0) {
                    if (a != null) {
                        a.dismiss(true);
                        break;
                    }
                } else if (a != null) {
                    mo23896a(this.f15732c0).mo24014n();
                    break;
                }
                break;
            case 5:
                if (!this.f15751v0) {
                    m17246d(this.f15721S.mo12447a(cVar.f7380c.f8198b.mo8945g(), C5359p.MARKER_TAP));
                    break;
                } else {
                    m17202a(this.f15732c0, (C8819d) null);
                    mo14115a(cVar.f7380c.f8198b.mo8945g(), false, false);
                    break;
                }
            case 6:
                m17213a(C3943a.m11559e(cVar.f7380c.f8198b.mo8945g()));
                break;
        }
    }

    public void onMapFriendsSelection(C2460d dVar) {
        if (dVar.f7383c && dVar.f7381a == C2461a.UNFOLLOW && C2388y4.m8429d().mo8319a() != null) {
            C2388y4.m8429d().mo8319a().dismiss(true);
        }
    }

    public void onMapGatheringSelection(C2463f fVar) {
        if (fVar.f7401b || fVar.f7400a == C2466a.LOST_POSITION) {
            C12143a.m32027a("onMapGatheringSelection: %s", fVar.toString());
            int i = C6278f.f15769c[fVar.f7400a.ordinal()];
            if (i == 2 || i == 3) {
                C3325v vVar = this.f15739j0;
                if (vVar != null) {
                    vVar.mo7192B();
                }
                if (this.f15751v0) {
                    m17180O();
                }
                m17232b(this.f15721S.mo12443a(fVar.f7391c));
            } else if (i == 4 || i == 6) {
                m17180O();
            }
        }
    }

    public void onMapRequested() {
        Iterator it = this.f15724U.iterator();
        while (it.hasNext()) {
            m17202a((ViewGroup) it.next(), (C8819d) null);
        }
        m17209a(C2470a.MAP, true);
    }

    public void onMapTouch(MotionEvent motionEvent) {
        if (this.f15745p0 != null && motionEvent.getActionMasked() == 0) {
            this.f15745p0.mo10035C();
        }
        if (this.f15738i0 != null && ((motionEvent.getActionMasked() != 0 || !this.f15738i0.mo14080a(motionEvent)) && C3896a1.m11470r().mo10521k())) {
            if (motionEvent.getActionMasked() == 0 && mo23948m() != null) {
                if (motionEvent.getY() < ((float) (mo23948m().getHeight() - f15697U0))) {
                    this.f15735f0.mo11372h(false);
                } else {
                    this.f15701B0 = Float.valueOf(motionEvent.getX());
                    this.f15702C0 = Float.valueOf(motionEvent.getY());
                }
            } else if (!(this.f15701B0 == null || this.f15702C0 == null)) {
                float x = motionEvent.getX() - this.f15701B0.floatValue();
                float y = motionEvent.getY() - this.f15702C0.floatValue();
                int scaledTouchSlop = ViewConfiguration.get(mo23920b()).getScaledTouchSlop();
                if ((y * y) + (x * x) > ((float) (scaledTouchSlop * scaledTouchSlop))) {
                    if (Math.abs(y) > Math.abs(x)) {
                        this.f15735f0.mo11372h(false);
                    }
                    this.f15701B0 = null;
                    this.f15702C0 = null;
                }
            }
        }
    }

    public void onMediaSelected(C7208s sVar) {
        C4473v0.m13257a(this, sVar);
    }

    public void onMeetHeightChanged(int i) {
        this.f15704E0 = i;
        m17235b0();
    }

    public void onMyProfileClick(C2468b bVar) {
        Intent intent;
        switch (C6278f.f15771e[bVar.ordinal()]) {
            case 1:
                C5343a.m15160U().mo12891i();
                C8819d a = this.f15721S.mo12446a();
                a.mo23929b((C8819d) this);
                m17207a(this.f15732c0, a, false);
                return;
            case 2:
            case 3:
                C8819d d = this.f15721S.mo12453d();
                d.mo23929b((C8819d) this);
                m17204a(this.f15732c0, d, bVar == C2468b.BEST_FRIENDS_UNLOCKED ? new C8815b() : new C8818e(), new C8818e(), false);
                return;
            case 4:
                m17207a(this.f15733d0, this.f15721S.mo12459i(), false);
                return;
            case 5:
                C2879d0 d0Var = ((MeUserManager) this.f15710K0.get()).mo8756b().f8250a;
                if (d0Var != null) {
                    m17202a(this.f15733d0, (C8819d) this.f15721S.mo12439a(d0Var.mo8942e()));
                    return;
                }
                return;
            case 6:
                C8819d j = this.f15721S.mo12460j();
                j.mo23929b((C8819d) this);
                m17207a(this.f15733d0, j, true);
                return;
            case 7:
                C2879d0 d0Var2 = ((MeUserManager) this.f15710K0.get()).mo8756b().f8250a;
                if (d0Var2 != null) {
                    String f = d0Var2.mo8944f();
                    if (TextUtils.isEmpty(f)) {
                        intent = UsernameInputActivity.m16514a(mo23920b(), d0Var2.mo8945g(), f, d0Var2.mo8941d());
                    } else {
                        intent = CardPickerActivity.m16616a(mo23920b(), f, d0Var2.mo8941d());
                    }
                    mo23902a(intent);
                    mo23920b().overridePendingTransition(R.anim.fade_in, R.anim.stay_still);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void onNewHotContent(int i) {
        this.f15738i0.mo14081b(i);
    }

    public void onProfileClick(C2469c cVar, String str) {
        int i = C6278f.f15770d[cVar.ordinal()];
        if (i == 1) {
            C8819d d = this.f15721S.mo12454d(str);
            d.mo23929b((C8819d) this);
            m17202a(this.f15733d0, d);
        } else if (i == 2) {
            C5343a.m15160U().mo12891i();
            C8819d a = this.f15721S.mo12446a();
            a.mo23929b((C8819d) this);
            m17207a(this.f15732c0, a, false);
        } else if (i == 3) {
            m17202a(this.f15733d0, (C8819d) null);
            mo23896a(this.f15732c0).mo24014n();
            m17214a(this.f15721S.mo12449b(str));
        }
    }

    public void onProfileItemClick(String str) {
        mo14115a(str, false, true);
    }

    public void onProfileUsernameClicked(String str, int i) {
        mo23902a(CardPickerActivity.m16617b(mo23920b(), str, i));
    }

    public void onSearchClosed() {
        ChatContract chatContract = this.f15744o0;
        if (chatContract != null) {
            m17245d(chatContract);
            this.f15744o0 = null;
        }
    }

    public void onSelectUser(ModalController modalController, C2879d0 d0Var) {
        mo14115a(d0Var.mo8945g(), false, true);
    }

    public void setNavigationEnabled(boolean z) {
        m17201a((View) this.f15730a0, z ? 0 : 4);
        this.f15742m0.setSwipeEnabled(z);
    }

    public void showReport(C5342k kVar) {
        m17207a(this.f15734e0, (C8819d) kVar, true);
    }

    public C6272z1(Bundle bundle) {
        super(bundle);
        this.f15715P = C1351e.m6372a(C6188a2.f15561b.mo19916a("controller"));
        this.f15717Q = new Handler();
        this.f15719R = new ArrayList<>();
        this.f15721S = new C5130q();
        this.f15723T = new ArrayList<>();
        this.f15724U = new ArrayList<>();
        this.f15725V = new ArrayList<>();
        this.f15740k0 = C2470a.MAP;
        this.f15741l0 = true;
        Boolean valueOf = Boolean.valueOf(false);
        this.f15751v0 = false;
        this.f15752w0 = false;
        this.f15754y0 = C12785a.m33446h(valueOf);
        this.f15755z0 = C12785a.m33446h(valueOf);
        this.f15705F0 = new C12275b();
        this.f15706G0 = new C12275b();
        this.f15716P0 = new LinkedList();
        this.f15720R0 = new C6276d();
        this.f15722S0 = new C6220k0(this);
    }

    /* renamed from: f */
    private void m17255f(boolean z) {
        if (this.f15739j0 == null) {
            C7707a.m18761b("createDashboardLayer");
            this.f15739j0 = this.f15721S.mo12451c();
            this.f15739j0.mo23929b((C8819d) this);
            m17207a(this.f15731b0, (C8819d) this.f15739j0, false);
            if (z) {
                Handler handler = this.f15717Q;
                C3325v vVar = this.f15739j0;
                vVar.getClass();
                handler.post(new C6224l1(vVar));
            }
            C7707a.m18759a();
        }
    }

    /* renamed from: b */
    public /* synthetic */ ObservableSource mo14117b(Boolean bool) throws Exception {
        return C12279e.m32610a((ObservableSource<? extends T1>) C5448c.m15478a().userMeStream(), (ObservableSource<? extends T2>) ((FriendRequestStore) this.f15708I0.get()).friendRequests(), (BiFunction<? super T1, ? super T2, ? extends R>) new C6267y0<Object,Object,Object>(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo7066c(View view) {
        super.mo7066c(view);
        C2388y4.m8429d().mo8320a(null);
        Iterator it = this.f15719R.iterator();
        while (it.hasNext()) {
            ((C6279g) it.next()).mo14128b();
        }
        this.f15719R.clear();
        this.f15724U.clear();
        this.f15725V.clear();
        this.f15723T.clear();
        C8851a aVar = this.f15743n0;
        if (aVar != null) {
            aVar.mo6403a();
        }
        this.f15706G0.mo36401a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo7053d(View view) {
        m17190Y();
        this.f15705F0.mo36401a();
        this.f15717Q.removeCallbacks(this.f15722S0);
        DiscoverManager discoverManager = this.f15700A0;
        if (discoverManager != null) {
            discoverManager.mo10022j();
        }
        if (this.f15749t0 != null) {
            mo9312u().mo8414c().mo9474a(this.f15749t0);
            this.f15749t0 = null;
        }
        super.mo7053d(view);
    }

    public void displaySupport(String str) {
        m17238c(SupportActivity.m15948a(mo23920b(), str));
    }

    /* renamed from: e */
    public /* synthetic */ void mo14124e(Boolean bool) throws Exception {
        if (!bool.booleanValue() && !this.f15716P0.isEmpty()) {
            m17215a(((ModalProvider) this.f15716P0.remove()).createController());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m17259g(boolean z) {
        BaseActivity u = mo9312u();
        if (u != null) {
            if (!z) {
                if (this.f15748s0 != null) {
                    u.mo8414c().mo9474a(this.f15748s0);
                    this.f15748s0 = null;
                }
                return;
            }
            SimpleInAppNotificationViewBuilder simpleInAppNotificationViewBuilder = new SimpleInAppNotificationViewBuilder();
            simpleInAppNotificationViewBuilder.mo9434b(u.getString(R.string.banner_ticket_replied_title));
            simpleInAppNotificationViewBuilder.mo9433a(u.getString(R.string.banner_ticket_replied_subtitle));
            simpleInAppNotificationViewBuilder.mo9432a(C0540a.m2546c(u, 2131231483));
            C3140d dVar = new C3140d(simpleInAppNotificationViewBuilder.mo9431a((Context) u), true, true, new C6199d1(this, u), C6206f1.f15582e);
            this.f15748s0 = dVar;
            u.mo8414c().mo9476b(this.f15748s0);
            C5498a.m15600a((Context) u).mo13124a(C5501c.HEAVY, C5500b.REWARD, 3);
        }
    }

    /* renamed from: h */
    private void m17263h(boolean z) {
        C3896a1.m11470r().mo10504a(true);
        if (z) {
            C3325v vVar = this.f15739j0;
            if (vVar != null) {
                vVar.mo9806E();
            }
            m17209a(C2470a.MAP, false);
            m17202a(this.f15732c0, (C8819d) null);
        } else if (mo23896a(this.f15732c0).mo24003c() > 0) {
            mo23896a(this.f15732c0).mo24014n();
            if (this.f15739j0 != null && !mo23896a(this.f15732c0).mo24012j()) {
                this.f15739j0.mo9807F();
            }
        }
        m17179N();
        m17202a(this.f15733d0, (C8819d) null);
    }

    /* renamed from: e */
    private void m17250e(C8819d dVar) {
        dVar.mo23929b((C8819d) this);
        C8831g a = mo23896a(this.f15732c0);
        this.f15732c0.setVisibility(0);
        C8836h a2 = C8836h.m21058a(dVar);
        a2.mo24026b(new C8815b());
        a2.mo24023a((ControllerChangeHandler) new C8815b());
        a.mo24005c(a2);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x012c  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo7052b(android.view.View r7) {
        /*
            r6 = this;
            java.lang.String r0 = "nav:onAttach"
            p250f.p251a.p252a.p263b.p264a.p271i.C7707a.m18761b(r0)
            super.mo7052b(r7)
            android.app.Activity r7 = r6.mo23920b()
            if (r7 != 0) goto L_0x000f
            return
        L_0x000f:
            r6.m17181P()
            r6.m17190Y()
            app.zenly.locator.chat.y4 r0 = app.zenly.locator.chat.C2388y4.m8429d()
            app.zenly.locator.chat.contract.ChatContract r0 = r0.mo8319a()
            if (r0 == 0) goto L_0x002e
            r0 = 4
            r6.m17227b(r0)
            app.zenly.locator.chat.y4 r0 = app.zenly.locator.chat.C2388y4.m8429d()
            app.zenly.locator.chat.contract.ChatContract r0 = r0.mo8319a()
            r6.m17229b(r0)
        L_0x002e:
            android.content.Intent r0 = r7.getIntent()
            r1 = 0
            if (r0 == 0) goto L_0x0047
            r2 = 0
            r7.setIntent(r2)
            int r2 = r0.getFlags()
            r3 = 1048576(0x100000, float:1.469368E-39)
            r2 = r2 & r3
            if (r2 != 0) goto L_0x0047
            boolean r0 = r6.mo14120b(r0)
            goto L_0x0048
        L_0x0047:
            r0 = 0
        L_0x0048:
            if (r0 == 0) goto L_0x005a
            android.os.Handler r0 = r6.f15717Q
            java.lang.Runnable r2 = r6.f15722S0
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS
            r4 = 3
            long r3 = r3.toMillis(r4)
            r0.postDelayed(r2, r3)
            goto L_0x005d
        L_0x005a:
            r6.mo7192B()
        L_0x005d:
            java.lang.String r0 = "initBrumpManager"
            p250f.p251a.p252a.p263b.p264a.p271i.C7707a.m18761b(r0)
            app.zenly.locator.core.manager.g5 r0 = new app.zenly.locator.core.manager.g5
            app.zenly.android.feature.base.di.Provider<app.zenly.locator.core.store.api.FriendStore> r2 = r6.f15707H0
            java.lang.Object r2 = r2.get()
            app.zenly.locator.core.store.api.FriendStore r2 = (app.zenly.locator.core.store.api.FriendStore) r2
            app.zenly.android.feature.base.di.Provider<app.zenly.locator.core.manager.k5> r3 = r6.f15711L0
            java.lang.Object r3 = r3.get()
            app.zenly.locator.core.manager.k5 r3 = (app.zenly.locator.core.manager.C2718k5) r3
            r0.<init>(r7, r2, r3)
            p250f.p251a.p252a.p263b.p264a.p271i.C7707a.m18759a()
            r6.m17252e0()
            r6.m17210a(r0)
            io.reactivex.e r7 = r0.mo8770d()
            r6.m17222a(r7)
            r6.m17243c0()
            java.lang.String r7 = "setupUnread"
            p250f.p251a.p252a.p263b.p264a.p271i.C7707a.m18761b(r7)
            io.reactivex.disposables.b r7 = r6.f15705F0
            co.znly.core.ZenlyCore r0 = app.zenly.locator.p143s.p148l.C5448c.m15478a()
            io.reactivex.e r0 = r0.chatUnreadCounters()
            app.zenly.android.feature.base.scheduling.ZenlySchedulers r2 = r6.f15715P
            app.zenly.android.feature.base.scheduling.b r2 = r2.getMainThread()
            io.reactivex.e r0 = r0.mo36428a(r2)
            app.zenly.locator.x.a1 r2 = new app.zenly.locator.x.a1
            r2.<init>(r6)
            app.zenly.locator.x.u r3 = app.zenly.locator.p207x.C6254u.f15677e
            io.reactivex.disposables.Disposable r0 = r0.mo36412a(r2, r3)
            r7.add(r0)
            p250f.p251a.p252a.p263b.p264a.p271i.C7707a.m18759a()
            java.lang.String r7 = "setupPostMapPopulatedTasks"
            p250f.p251a.p252a.p263b.p264a.p271i.C7707a.m18761b(r7)
            io.reactivex.disposables.b r7 = r6.f15705F0
            app.zenly.locator.map.a1 r0 = app.zenly.locator.map.C3896a1.m11470r()
            io.reactivex.n.a r0 = r0.mo10515e()
            app.zenly.locator.x.i0 r2 = app.zenly.locator.p207x.C6214i0.f15594e
            io.reactivex.e r0 = r0.mo36459b(r2)
            r2 = 1
            io.reactivex.e r0 = r0.mo36487e(r2)
            app.zenly.locator.x.w0 r2 = new app.zenly.locator.x.w0
            r2.<init>(r6)
            io.reactivex.disposables.Disposable r0 = r0.mo36476d(r2)
            r7.add(r0)
            p250f.p251a.p252a.p263b.p264a.p271i.C7707a.m18759a()
            app.zenly.locator.discover.DiscoverManager r7 = r6.f15700A0
            if (r7 != 0) goto L_0x00f5
            java.lang.String r7 = "initDiscoverManager"
            p250f.p251a.p252a.p263b.p264a.p271i.C7707a.m18761b(r7)
            app.zenly.locator.discover.DiscoverManager r7 = new app.zenly.locator.discover.DiscoverManager
            android.app.Activity r0 = r6.mo23920b()
            r7.<init>(r0, r6)
            r6.f15700A0 = r7
            p250f.p251a.p252a.p263b.p264a.p271i.C7707a.m18759a()
        L_0x00f5:
            app.zenly.locator.discover.DiscoverManager r7 = r6.f15700A0
            r7.mo10021i()
            r6.m17248d0()
            p250f.p251a.p252a.p263b.p264a.p271i.C7707a.m18759a()
            android.app.Activity r7 = r6.mo9304A()
            app.zenly.locator.core.manager.di.a r7 = app.zenly.locator.core.manager.p069di.C2666b.m9049a(r7)
            app.zenly.locator.core.manager.q5 r7 = r7.mo8765c()
            io.reactivex.disposables.b r0 = r6.f15705F0
            io.reactivex.n.a r2 = r7.mo8845b()
            app.zenly.android.feature.base.scheduling.ZenlySchedulers r3 = r6.f15715P
            app.zenly.android.feature.base.scheduling.b r3 = r3.getMainThread()
            io.reactivex.e r2 = r2.mo36428a(r3)
            app.zenly.locator.x.v r3 = new app.zenly.locator.x.v
            r3.<init>(r6, r7)
            io.reactivex.disposables.Disposable r7 = r2.mo36476d(r3)
            r0.add(r7)
            boolean r7 = r6.f15718Q0
            if (r7 == 0) goto L_0x014c
            r6.f15718Q0 = r1
            co.znly.models.services.q2$a r7 = p213co.znly.models.services.C8243q2.newBuilder()
            r7.mo22223a(r1)
            co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite r7 = r7.build()
            co.znly.models.services.q2 r7 = (p213co.znly.models.services.C8243q2) r7
            io.reactivex.disposables.b r0 = r6.f15705F0
            co.znly.core.ZenlyCore r1 = app.zenly.locator.p143s.p148l.C5448c.m15478a()
            io.reactivex.e r7 = r1.footstepsWebSet(r7)
            io.reactivex.disposables.Disposable r7 = r7.mo36508m()
            r0.add(r7)
        L_0x014c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.p207x.C6272z1.mo7052b(android.view.View):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7065a(Context context) {
        StoreModule a = C3015a.m9526a(context);
        a.getClass();
        this.f15707H0 = new C6185a(a);
        a.getClass();
        this.f15708I0 = new C6231o(a);
        a.getClass();
        this.f15709J0 = new C6230n1(a);
        C2660a a2 = C2666b.m9049a(context);
        a2.getClass();
        this.f15710K0 = new C6189b(a2);
        C2660a a3 = C2666b.m9049a(context);
        a3.getClass();
        this.f15711L0 = new C6239q1(a3);
        this.f15712M0 = new C3333f(C5448c.m15478a());
        this.f15713N0 = new C6302i((FriendRequestStore) this.f15708I0.get(), (FriendshipStore) this.f15709J0.get(), this.f15755z0);
        this.f15714O0 = C5665b.m15987a(context).mo13329a();
    }

    /* renamed from: f */
    public /* synthetic */ void mo14126f(Boolean bool) throws Exception {
        this.f15750u0.mo14146a(bool.booleanValue());
    }

    /* renamed from: d */
    public /* synthetic */ void mo14122d(Boolean bool) throws Exception {
        C4407y0 y0Var = this.f15735f0;
        if (y0Var != null) {
            y0Var.mo7192B();
        }
        FogContract fogContract = this.f15747r0;
        if (fogContract != null) {
            fogContract.bumpAvatar();
        }
    }

    /* renamed from: e */
    public void mo14125e(boolean z) {
        if (this.f15735f0.mo23920b() != null) {
            this.f15735f0.mo11366e(z);
        }
    }

    /* renamed from: c */
    public /* synthetic */ void mo14121c(Boolean bool) throws Exception {
        C5343a.m15160U().mo12891i();
        C8819d a = this.f15721S.mo12446a();
        a.mo23929b((C8819d) this);
        m17207a(this.f15732c0, a, false);
    }

    /* renamed from: d */
    public void mo14123d(String str) {
        this.f15753x0 = str;
        m17203a(this.f15732c0, (C8819d) null, (ControllerChangeHandler) new C8815b());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo7054a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C7707a.m18761b("nav:onCreateView");
        View inflate = layoutInflater.inflate(R.layout.controller_navigation, viewGroup, false);
        this.f15728Y = inflate.findViewById(R.id.layer_map_hiding_overlay);
        this.f15742m0 = (SwipeableEdgeLayout) inflate;
        this.f15729Z = (ViewPager) inflate.findViewById(R.id.layer_pager);
        m17256f0();
        m17209a(C2470a.MAP, false);
        this.f15726W = (ViewGroup) inflate.findViewById(R.id.layer_map);
        this.f15727X = (ViewGroup) inflate.findViewById(R.id.layer_map_overlay);
        this.f15730a0 = (ViewGroup) inflate.findViewById(R.id.layer_controls);
        this.f15731b0 = (ViewGroup) inflate.findViewById(R.id.layer_dashboard);
        this.f15732c0 = (ViewGroup) inflate.findViewById(R.id.layer_1);
        this.f15733d0 = (ViewGroup) inflate.findViewById(R.id.layer_2);
        this.f15734e0 = (ViewGroup) inflate.findViewById(R.id.layer_modal);
        this.f15724U.add(this.f15732c0);
        this.f15724U.add(this.f15733d0);
        this.f15724U.add(this.f15734e0);
        Iterator it = this.f15724U.iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup2 = (ViewGroup) it.next();
            this.f15719R.add(new C6279g(viewGroup2));
            mo23896a(viewGroup2).mo23998b(true);
        }
        this.f15706G0.add(C3896a1.m11470r().mo10519i().mo36459b((Predicate<? super T>) C6208g0.f15586e).mo36509m(new C6237q(this)).mo36486e().mo36382a((Predicate<? super T>) C6197d.f15572e).mo36378a((C12286f) this.f15715P.getMainThread()).mo36398c((Consumer<? super T>) new C6258v0<Object>(this)));
        C7707a.m18759a();
        return inflate;
    }

    /* renamed from: c */
    private boolean m17241c(ViewGroup viewGroup) {
        C8831g a = mo23896a(viewGroup);
        boolean z = false;
        if (a.mo24003c() == 0) {
            return false;
        }
        C8819d a2 = ((C8836h) a.mo24000b().get(a.mo24003c() - 1)).mo24022a();
        if (!(a2 instanceof ZenlyController)) {
            return false;
        }
        ZenlyController zenlyController = (ZenlyController) a2;
        if (zenlyController.mo7339w() && !zenlyController.mo9314x()) {
            z = true;
        }
        return z;
    }

    /* renamed from: d */
    private void m17245d(ChatContract chatContract) {
        if (!TextUtils.equals(chatContract.getUserUuid(), C5447b.m15477d(C5448c.m15478a()))) {
            C8819d dVar = (C8819d) chatContract;
            dVar.mo23929b((C8819d) this);
            m17202a(this.f15733d0, (C8819d) null);
            m17203a(this.f15732c0, dVar, (ControllerChangeHandler) null);
            m17227b(4);
            m17201a((View) this.f15730a0, 4);
            C3325v vVar = this.f15739j0;
            if (vVar != null) {
                vVar.mo7192B();
            }
        }
    }

    /* renamed from: c */
    private void m17239c(C8819d dVar) {
        dVar.mo23929b((C8819d) this);
        m17205a(this.f15733d0, dVar, (ControllerChangeHandler) null, true);
    }

    /* renamed from: c */
    private boolean m17242c(ChatContract chatContract) {
        boolean z;
        C7117i conversation = chatContract.getConversation();
        if (conversation == null) {
            z = false;
        } else if (conversation.getIsGroup()) {
            ArrayList arrayList = new ArrayList();
            for (C6818b bVar : conversation.getOthersList()) {
                if (!C2309e.m8217a(bVar)) {
                    arrayList.add(bVar.getUserUuid());
                }
            }
            arrayList.add(conversation.getMe().getUserUuid());
            C3896a1.m11470r().mo10503a((List<String>) arrayList, true);
            z = true;
        } else {
            z = C3896a1.m11470r().mo10506a(chatContract.getUserUuid(), false);
            this.f15712M0.mo9845a(chatContract.getUserUuid());
        }
        C12143a.m32027a("configureMapControllerForChat: %s", String.valueOf(z));
        return z;
    }

    /* renamed from: d */
    private void m17246d(C8819d dVar) {
        dVar.mo23929b((C8819d) this);
        m17202a(this.f15733d0, (C8819d) null);
        m17203a(this.f15732c0, dVar, (ControllerChangeHandler) new C8817d(false));
    }

    /* renamed from: c */
    private int m17236c(C2470a aVar) {
        int i = C6278f.f15768b[aVar.ordinal()];
        if (i != 1) {
            return (i == 2 || i != 3) ? 1 : 2;
        }
        return 0;
    }

    /* renamed from: c */
    private void m17238c(Intent intent) {
        mo23903a(intent, 401);
        C5343a.m15160U().mo12796K();
    }

    /* renamed from: a */
    public /* synthetic */ void mo14105a(C3663a aVar) throws Exception {
        aVar.mo10173a((BaseActivity) mo9304A());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public C3663a m17194a(UserProto$User userProto$User, List<C2956k0> list) {
        Activity A = mo9304A();
        SharedPreferences h = C5407g.m15386a((Context) mo9304A()).mo12986h();
        C2594d dVar = new C2594d(h);
        List a = C2545e0.m8883a(A, Locale.getDefault(), true);
        C5943a aVar = new C5943a(C5343a.m15160U().mo12806a(), C5448c.m15478a());
        C6178a aVar2 = new C6178a(A.getString(R.string.sms_conversion), a, dVar, C3444a.m10686a(mo9304A()), userProto$User.getCreatedAt());
        return new C3663a(aVar2, C3664b.m11016a(aVar, C3444a.m10686a(mo9304A()), userProto$User, list.size(), this, new C3677h(h)));
    }

    /* renamed from: a */
    public /* synthetic */ void mo14109a(C7255y yVar) throws Exception {
        this.f15738i0.mo14073a(yVar.getUnreadTotal());
    }

    /* renamed from: a */
    public /* synthetic */ void mo14111a(Boolean bool) throws Exception {
        if (C2388y4.m8429d().mo8319a() != null) {
            m17229b(C2388y4.m8429d().mo8319a());
        }
    }

    /* renamed from: a */
    public /* synthetic */ void mo14101a(C2800q5 q5Var, C2801a aVar) throws Exception {
        q5Var.mo8843a();
        if (aVar == C2801a.ERROR) {
            Toast.makeText(mo9304A(), R.string.settings_upload_avatar_error, 1).show();
        }
    }

    /* renamed from: b */
    public void mo14119b(C4545f2 f2Var) {
        Iterator it = this.f15716P0.iterator();
        while (it.hasNext()) {
            if (f2Var.equals(((ModalProvider) it.next()).getModalUuid())) {
                it.remove();
            }
        }
    }

    /* renamed from: a */
    public void mo8182a(int i, int i2, Intent intent) {
        C4473v0.m13256a(this, i, i2, intent);
        SupportActivity.m15949a(this, i, i2);
    }

    /* renamed from: b */
    public /* synthetic */ void mo14118b(BaseActivity baseActivity) {
        displaySupport();
        baseActivity.overridePendingTransition(R.anim.slide_in_bottom, R.anim.stay_still);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m17198a(float f) {
        C2470a aVar;
        int round = Math.round(f);
        if (round == 0) {
            aVar = C2470a.INBOX;
        } else if (round == 2) {
            aVar = C2470a.MY_PROFILE;
        } else {
            aVar = C2470a.MAP;
        }
        if (aVar != this.f15740k0) {
            this.f15740k0 = aVar;
            this.f15738i0.mo14075a(aVar);
        }
        boolean z = f > 0.0f && f < 2.0f;
        if (z != this.f15741l0) {
            this.f15741l0 = z;
            m17191Z();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m17231b(C2891l lVar) {
        BaseActivity u = mo9312u();
        if (u != null) {
            if (lVar.mo8965b() == -1) {
                if (this.f15749t0 != null) {
                    u.mo8414c().mo9474a(this.f15749t0);
                    this.f15749t0 = null;
                }
                return;
            }
            SimpleInAppNotificationViewBuilder simpleInAppNotificationViewBuilder = new SimpleInAppNotificationViewBuilder();
            simpleInAppNotificationViewBuilder.mo9434b(u.getString(R.string.bump_hint_notification_title));
            simpleInAppNotificationViewBuilder.mo9433a(u.getString(R.string.bump_hint_notification_message));
            simpleInAppNotificationViewBuilder.mo9432a(C0540a.m2546c(u, 2131231592));
            C3140d dVar = new C3140d(simpleInAppNotificationViewBuilder.mo9431a((Context) u), true, true, new C6260w(this, u, lVar), new C6191b1(this, u));
            this.f15749t0 = dVar;
            u.mo8414c().mo9476b(this.f15749t0);
            C5343a.m15160U().mo12894j();
        }
    }

    /* renamed from: a */
    private void m17222a(C12279e<C2889j> eVar) {
        C7707a.m18761b("setupModals");
        this.f15705F0.add(C4541e2.m13336a(mo23920b(), C5448c.m15478a(), C2998x.m9509a(), (FriendRequestStore) this.f15708I0.get(), (FriendshipStore) this.f15709J0.get(), eVar, this.f15713N0).mo11702a().mo36428a((C12286f) this.f15715P.getMainThread()).mo36413a((Consumer<? super T>) new C6198d0<Object>(this), (Consumer<? super Throwable>) C6235p0.f15616e, (Action) C6244s0.f15626a));
        this.f15705F0.add(this.f15754y0.mo36428a((C12286f) this.f15715P.getMainThread()).mo36412a((Consumer<? super T>) new C6271z0<Object>(this), (Consumer<? super Throwable>) C6232o0.f15613e));
        C7707a.m18759a();
    }

    /* renamed from: b */
    public boolean mo14120b(Intent intent) {
        boolean z = false;
        if (!C3888j.m11458g(intent)) {
            return false;
        }
        int d = C3888j.m11455d(intent);
        if (d != 101) {
            switch (d) {
                case 1:
                    String c = C3888j.m11454c(intent);
                    if (c != null) {
                        m17200a(intent, c, false);
                        break;
                    }
                    break;
                case 2:
                    String c2 = C3888j.m11454c(intent);
                    if (c2 != null) {
                        if (!C3888j.m11451a(intent) && C3888j.m11457f(intent) != C6826b.EMOJI) {
                            z = true;
                        }
                        m17200a(intent, c2, z);
                        return z;
                    }
                    break;
                case 3:
                    m17246d(this.f15721S.mo12448a(C3888j.m11454c(intent), true));
                    return true;
                case 4:
                    displaySupport(C3888j.m11454c(intent));
                    return true;
                case 5:
                    m17212a(C3906c1.m11509a(C3888j.m11453b(intent), R.drawable.ic_bump, 800));
                    C5343a.m15160U().mo12828a(C5360q.BUMP_RECEIVED);
                    break;
                case 6:
                    C5343a.m15160U().mo12828a(C5360q.NO_FRIENDS);
                    break;
            }
        } else {
            String c3 = C3888j.m11454c(intent);
            if (c3 == null) {
                return false;
            }
            this.f15705F0.mo36403a(C5448c.m15478a().resolveUserUsername(c3).mo36428a((C12286f) this.f15715P.getMainThread()).mo36412a((Consumer<? super T>) new C6186a0<Object>(this, c3), (Consumer<? super Throwable>) new C6241r0<Object>(this, c3)));
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036 A[Catch:{ InvalidProtocolBufferException -> 0x0053, IllegalArgumentException -> 0x004a }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void mo14106a(app.zenly.locator.modals.ModalProvider r6) throws java.lang.Exception {
        /*
            r5 = this;
            r0 = 0
            android.view.ViewGroup r1 = r5.f15734e0     // Catch:{ InvalidProtocolBufferException -> 0x0053, IllegalArgumentException -> 0x004a }
            com.bluelinelabs.conductor.g r1 = r5.mo23896a(r1)     // Catch:{ InvalidProtocolBufferException -> 0x0053, IllegalArgumentException -> 0x004a }
            java.util.List r1 = r1.mo24000b()     // Catch:{ InvalidProtocolBufferException -> 0x0053, IllegalArgumentException -> 0x004a }
            boolean r2 = r1.isEmpty()     // Catch:{ InvalidProtocolBufferException -> 0x0053, IllegalArgumentException -> 0x004a }
            if (r2 != 0) goto L_0x0033
            java.util.Queue<app.zenly.locator.modals.ModalProvider> r2 = r5.f15716P0     // Catch:{ InvalidProtocolBufferException -> 0x0053, IllegalArgumentException -> 0x004a }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ InvalidProtocolBufferException -> 0x0053, IllegalArgumentException -> 0x004a }
        L_0x0017:
            boolean r3 = r2.hasNext()     // Catch:{ InvalidProtocolBufferException -> 0x0053, IllegalArgumentException -> 0x004a }
            if (r3 == 0) goto L_0x0033
            java.lang.Object r3 = r2.next()     // Catch:{ InvalidProtocolBufferException -> 0x0053, IllegalArgumentException -> 0x004a }
            app.zenly.locator.modals.ModalProvider r3 = (app.zenly.locator.modals.ModalProvider) r3     // Catch:{ InvalidProtocolBufferException -> 0x0053, IllegalArgumentException -> 0x004a }
            app.zenly.locator.modals.f2 r4 = r6.getModalUuid()     // Catch:{ InvalidProtocolBufferException -> 0x0053, IllegalArgumentException -> 0x004a }
            app.zenly.locator.modals.f2 r3 = r3.getModalUuid()     // Catch:{ InvalidProtocolBufferException -> 0x0053, IllegalArgumentException -> 0x004a }
            boolean r3 = r4.equals(r3)     // Catch:{ InvalidProtocolBufferException -> 0x0053, IllegalArgumentException -> 0x004a }
            if (r3 == 0) goto L_0x0017
            r2 = 1
            goto L_0x0034
        L_0x0033:
            r2 = 0
        L_0x0034:
            if (r2 != 0) goto L_0x005b
            boolean r1 = r1.isEmpty()     // Catch:{ InvalidProtocolBufferException -> 0x0053, IllegalArgumentException -> 0x004a }
            if (r1 == 0) goto L_0x0044
            app.zenly.locator.modals.ModalController r6 = r6.createController()     // Catch:{ InvalidProtocolBufferException -> 0x0053, IllegalArgumentException -> 0x004a }
            r5.m17215a(r6)     // Catch:{ InvalidProtocolBufferException -> 0x0053, IllegalArgumentException -> 0x004a }
            goto L_0x005b
        L_0x0044:
            java.util.Queue<app.zenly.locator.modals.ModalProvider> r1 = r5.f15716P0     // Catch:{ InvalidProtocolBufferException -> 0x0053, IllegalArgumentException -> 0x004a }
            r1.add(r6)     // Catch:{ InvalidProtocolBufferException -> 0x0053, IllegalArgumentException -> 0x004a }
            goto L_0x005b
        L_0x004a:
            r6 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "ModalService (NavController) IllegalArgumentException"
            p387h.p388a.C12143a.m32032b(r6, r1, r0)
            goto L_0x005b
        L_0x0053:
            r6 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "ModalService (NavController) InvalidProtocolBufferException"
            p387h.p388a.C12143a.m32032b(r6, r1, r0)
        L_0x005b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.p207x.C6272z1.mo14106a(app.zenly.locator.modals.ModalProvider):void");
    }

    /* renamed from: a */
    private void m17215a(ModalController modalController) {
        modalController.mo11695a(this);
        modalController.mo23929b((C8819d) this);
        if (modalController instanceof C4597a) {
            m17203a(this.f15734e0, (C8819d) modalController, (ControllerChangeHandler) new C3061b());
        } else {
            m17207a(this.f15734e0, (C8819d) modalController, false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m17228b(MotionEvent motionEvent, boolean z) {
        C3325v vVar = this.f15739j0;
        if (vVar == null || !vVar.mo9805D()) {
            C5343a.m15160U().mo12902n();
        }
        C3325v vVar2 = this.f15739j0;
        if (vVar2 == null) {
            m17255f(false);
            this.f15717Q.post(new C6212h1(this, motionEvent, z));
            return;
        }
        vVar2.mo9809a(motionEvent, z);
    }

    /* renamed from: a */
    public void mo14107a(C4545f2 f2Var) {
        C6268y1 b = C6268y1.m17172b(f2Var);
        Iterator it = this.f15716P0.iterator();
        while (it.hasNext()) {
            if (b.mo14059a(((ModalProvider) it.next()).getModalUuid())) {
                it.remove();
            }
        }
    }

    /* renamed from: b */
    private void m17230b(C2470a aVar) {
        m17209a(aVar, true);
    }

    /* renamed from: b */
    private void m17232b(C4292t0 t0Var) {
        this.f15746q0 = t0Var;
        t0Var.mo23929b((C8819d) this);
        m17205a(this.f15727X, (C8819d) t0Var, (ControllerChangeHandler) new C8815b(), true);
        this.f15738i0.mo14069D();
    }

    /* renamed from: a */
    private void m17210a(C2687g5 g5Var) {
        C7707a.m18761b("setupBrump");
        this.f15705F0.mo36403a(g5Var.mo8769c().mo36428a((C12286f) this.f15715P.getMainThread()).mo36412a((Consumer<? super T>) new C6243s<Object>(this), (Consumer<? super Throwable>) C6264x0.f15689e), g5Var.mo8768b().mo36428a((C12286f) this.f15715P.getMainThread()).mo36412a((Consumer<? super T>) new C6247t0<Object>(this), (Consumer<? super Throwable>) C6194c0.f15569e), g5Var.mo8770d().mo36428a((C12286f) this.f15715P.getMainThread()).mo36412a((Consumer<? super T>) new C6195c1<Object>(this), (Consumer<? super Throwable>) C6209g1.f15587e), this.f15754y0.mo36509m(new C6190b0(this, g5Var)).mo36428a((C12286f) this.f15715P.getMainThread()).mo36464c(1000, TimeUnit.MILLISECONDS).mo36412a((Consumer<? super T>) new C6205f0<Object>(this), (Consumer<? super Throwable>) C6266y.f15691e));
        C7707a.m18759a();
    }

    /* renamed from: b */
    private void m17229b(ChatContract chatContract) {
        if (this.f15735f0 != null) {
            if (m17242c(chatContract)) {
                if (this.f15747r0 != null) {
                    m17179N();
                }
                m17180O();
            } else {
                m17224a(chatContract);
                this.f15735f0.mo11358a(true, false);
            }
        }
    }

    /* renamed from: b */
    private void m17227b(int i) {
        this.f15729Z.setVisibility(i);
        this.f15728Y.setVisibility(i);
        m17191Z();
        m17226a0();
    }

    /* renamed from: a */
    public /* synthetic */ void mo14103a(C2888i iVar) throws Exception {
        if (mo23920b() != null) {
            C5498a.m15600a((Context) mo23920b()).mo13124a(C5501c.LIGHT, C5500b.POSITIVE, 1);
        }
    }

    /* renamed from: a */
    public /* synthetic */ void mo14102a(C2887h hVar) throws Exception {
        if (mo23920b() != null) {
            C5502b.m15610a(mo23920b()).mo13131a(C3198d0.f8966a, -1);
            C5343a.m15160U().mo12835a(C5447b.m15477d(C5448c.m15478a()));
            C5343a.m15160U().mo12820a(C5349f.FRIEND);
            if (mo23896a(this.f15734e0).mo24003c() == 0) {
                m17208a(C1736d.m7100a(hVar));
            }
        }
    }

    /* renamed from: a */
    public /* synthetic */ void mo14104a(C2889j jVar) throws Exception {
        if (mo23920b() != null) {
            C5502b.m15610a(mo23920b()).mo13131a(C3198d0.f8966a, -1);
            C5343a.m15160U().mo12835a(C5447b.m15477d(C5448c.m15478a()));
            C5343a.m15160U().mo12820a(C5349f.NOT_FRIEND);
        }
    }

    /* renamed from: a */
    public /* synthetic */ ObservableSource mo14096a(C2687g5 g5Var, Boolean bool) throws Exception {
        if (!bool.booleanValue()) {
            return g5Var.mo8767a();
        }
        if (this.f15749t0 != null) {
            mo9312u().mo8414c().mo9474a(this.f15749t0);
            this.f15749t0 = null;
        }
        return C12279e.m32633q();
    }

    /* renamed from: a */
    public /* synthetic */ void mo14099a(BaseActivity baseActivity, C2891l lVar) {
        this.f15749t0 = null;
        C5407g.m15386a((Context) baseActivity).mo12990l();
        C5343a.m15160U().mo12897k();
        m17211a(lVar);
    }

    /* renamed from: a */
    public /* synthetic */ void mo14098a(BaseActivity baseActivity) {
        this.f15749t0 = null;
        C5407g.m15386a((Context) baseActivity).mo12990l();
    }

    /* renamed from: a */
    public /* synthetic */ void mo14112a(Integer num) throws Exception {
        C2542d0.m8880a(mo23920b()).mo8681a(C3744d.Other);
        int intValue = num.intValue();
        if (intValue == 1) {
            C5343a.m15160U().mo12826a(C5355l.EMOJI_PANEL_DESCENDANT_1);
        } else if (intValue == 2) {
            C5343a.m15160U().mo12826a(C5355l.EMOJI_PANEL_DESCENDANT_2);
        }
    }

    /* renamed from: a */
    public /* synthetic */ void mo14113a(String str, C8003b6 b6Var) throws Exception {
        if (!b6Var.hasError() || (b6Var.getError().getCode() == C7987b.ALREADY_FRIENDS && b6Var.getUsersCount() > 0)) {
            UserProto$User users = b6Var.getUsers(0);
            if (users.getUuid().equals(C5447b.m15477d(C5448c.m15478a()))) {
                mo14100a(C2470a.MY_PROFILE);
            } else {
                m17246d(this.f15721S.mo12452c(users.getUuid()));
            }
        } else {
            m17202a(this.f15733d0, (C8819d) C5213z0.m14831d(str));
        }
    }

    /* renamed from: a */
    public /* synthetic */ void mo14114a(String str, Throwable th) throws Exception {
        m17202a(this.f15733d0, (C8819d) C5213z0.m14831d(str));
    }

    /* renamed from: a */
    private void m17200a(Intent intent, String str, boolean z) {
        C5360q qVar;
        if (C3888j.m11451a(intent)) {
            qVar = C5360q.COUNTRY_CHANGE_RECEIVED;
        } else {
            qVar = m17195a(C3888j.m11457f(intent));
        }
        C5343a.m15160U().mo12828a(qVar);
        if (C5448c.m15478a().chatGetConversationCache(str) != null) {
            m17245d(this.f15721S.mo12442a(str, z, !z));
            return;
        }
        C12143a.m32030b("failed open chat deeplink from notification of type %s for uuid %s", C3888j.m11456e(intent), str);
    }

    /* renamed from: a */
    private C5360q m17195a(C6826b bVar) {
        int i = C6278f.f15767a[bVar.ordinal()];
        if (i == 1) {
            return C5360q.EMOJI_RECEIVED;
        }
        if (i != 2) {
            return null;
        }
        return C5360q.MESSAGE_RECEIVED;
    }

    /* renamed from: a */
    public void mo14100a(C2470a aVar) {
        C2470a aVar2 = C2470a.MAP;
        if (aVar == aVar2 && this.f15740k0 == aVar2 && this.f15735f0 != null) {
            if (C3896a1.m11470r().mo10521k()) {
                DiscoverManager discoverManager = this.f15700A0;
                if (discoverManager != null && !this.f15751v0) {
                    discoverManager.mo10019g();
                    if (this.f15700A0.mo10017e()) {
                        this.f15738i0.mo7192B();
                        this.f15751v0 = true;
                    } else {
                        return;
                    }
                }
            } else {
                C3896a1.m11470r().mo10522l();
                m17180O();
            }
        }
        C2470a aVar3 = C2470a.INBOX;
        if (aVar == aVar3 && this.f15740k0 == aVar3) {
            this.f15736g0.mo9315z();
        } else {
            m17230b(aVar);
        }
        if ((aVar == C2470a.INBOX || aVar == C2470a.MY_PROFILE) && m17236c(aVar) < this.f15723T.size()) {
            ((ZenlyController) this.f15723T.get(m17236c(aVar))).mo9311d(true);
        }
    }

    /* renamed from: a */
    public /* synthetic */ void mo14097a(MotionEvent motionEvent, boolean z) {
        this.f15739j0.mo9809a(motionEvent, z);
    }

    /* renamed from: a */
    public void mo14116a(boolean z, int i) {
        C3565n f = this.f15700A0.mo10018f();
        if (f != null) {
            m17250e((C8819d) f);
            C5343a.m15160U().mo12850a(z, i);
        }
    }

    /* renamed from: a */
    public void mo14108a(UserProto$User userProto$User) {
        m17202a(this.f15732c0, (C8819d) null);
        m17202a(this.f15733d0, (C8819d) null);
        m17202a(this.f15734e0, (C8819d) null);
        mo14115a(userProto$User.getUuid(), false, true);
    }

    /* renamed from: a */
    private void m17209a(C2470a aVar, boolean z) {
        int c = m17236c(aVar);
        this.f15729Z.mo6328a(c, z);
        if (!z) {
            m17199a(c, 0.0f);
        }
    }

    /* renamed from: a */
    private void m17214a(C4495h0 h0Var) {
        h0Var.mo23929b((C8819d) this);
        m17202a(this.f15733d0, (C8819d) h0Var);
    }

    /* renamed from: a */
    private void m17213a(FogContract fogContract) {
        this.f15747r0 = fogContract;
        m17235b0();
        C8819d dVar = (C8819d) fogContract;
        dVar.mo23929b((C8819d) this);
        m17205a(this.f15727X, dVar, (ControllerChangeHandler) new C8815b(), true);
    }

    /* renamed from: a */
    private void m17208a(C1736d dVar) {
        m17207a(this.f15732c0, (C8819d) null, false);
        m17207a(this.f15733d0, (C8819d) null, false);
        C3325v vVar = this.f15739j0;
        if (vVar != null) {
            vVar.mo7192B();
        }
        dVar.mo23929b((C8819d) this);
        m17207a(this.f15732c0, (C8819d) dVar, false);
    }

    /* renamed from: a */
    private void m17212a(C3906c1 c1Var) {
        m17207a(this.f15732c0, (C8819d) null, false);
        m17207a(this.f15733d0, (C8819d) null, false);
        C3325v vVar = this.f15739j0;
        if (vVar != null) {
            vVar.mo7192B();
        }
        c1Var.mo23929b((C8819d) this);
        m17207a(this.f15732c0, (C8819d) c1Var, false);
    }

    /* renamed from: a */
    private void m17211a(C2891l lVar) {
        C2470a aVar = this.f15740k0;
        C2470a aVar2 = C2470a.MAP;
        if (aVar != aVar2) {
            m17209a(aVar2, false);
        }
        m17207a(this.f15732c0, (C8819d) null, false);
        m17207a(this.f15733d0, (C8819d) null, false);
        C3325v vVar = this.f15739j0;
        if (vVar != null) {
            vVar.mo7192B();
        }
        BumpHintView bumpHintView = new BumpHintView(mo9304A());
        bumpHintView.setLayoutParams(new LayoutParams(-1, -2));
        bumpHintView.setFriends(lVar.mo8964a());
        Class<BumpHintView> cls = BumpHintView.class;
        C3140d dVar = new C3140d(bumpHintView, true, false, C6218j1.f15598e, new C6236p1(bumpHintView));
        C3144f c = mo9312u().mo8414c();
        c.mo9476b(dVar);
        bumpHintView.mo7328a((Function1<? super Boolean, C12956q>) new C6229n0<Object,C12956q>(c, dVar));
        C2900b a = ((C2718k5) this.f15711L0.get()).mo8780a(lVar.mo8965b());
        if (a != null) {
            this.f15735f0.mo11341a(a.f8225b, 17.0f, 500);
        }
    }

    /* renamed from: a */
    static /* synthetic */ C12956q m17197a(C3144f fVar, C3140d dVar, Boolean bool) {
        if (!bool.booleanValue()) {
            fVar.mo9474a(dVar);
        }
        return C12956q.f33541a;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m17206a(ViewGroup viewGroup, C8819d dVar, C8819d dVar2) {
        if (dVar2 == null && dVar != null) {
            this.f15725V.add(viewGroup);
            if (viewGroup == this.f15734e0) {
                this.f15754y0.onNext(Boolean.valueOf(true));
            }
        } else if (dVar2 != null && dVar == null) {
            this.f15725V.remove(viewGroup);
            if (viewGroup == this.f15734e0) {
                this.f15754y0.onNext(Boolean.valueOf(false));
            }
        }
        if (dVar instanceof ModalController) {
            C1297b.m6236a(mo23920b());
        }
        if (viewGroup == this.f15732c0 && dVar == null) {
            m17227b(0);
            m17201a((View) this.f15730a0, 0);
            C3896a1.m11470r().mo10504a(false);
        }
        if (dVar2 == C2388y4.m8429d().mo8319a()) {
            C2388y4.m8429d().mo8320a(null);
        }
        if (dVar instanceof ChatContract) {
            ChatContract chatContract = (ChatContract) dVar;
            m17229b(chatContract);
            C2388y4.m8429d().mo8320a(chatContract);
        }
        if (dVar instanceof C4292t0) {
            C4292t0 t0Var = (C4292t0) dVar;
            if (this.f15735f0 != null) {
                m17225a(t0Var);
            }
        }
        if (dVar instanceof C4495h0) {
            C4407y0 y0Var = this.f15735f0;
            if (y0Var != null) {
                y0Var.mo11345a(C2458b.MEET);
            }
        } else if (dVar2 instanceof C4495h0) {
            C4407y0 y0Var2 = this.f15735f0;
            if (y0Var2 != null) {
                y0Var2.mo11345a(C2458b.NORMAL);
            }
        }
        boolean z = dVar instanceof C3565n;
        if (z) {
            m17227b(4);
            m17201a((View) this.f15730a0, 0);
            C4407y0 y0Var3 = this.f15735f0;
            if (y0Var3 != null) {
                y0Var3.mo11343a(0, 0, 0, 0);
            }
        }
        if (dVar instanceof C3570o) {
            m17201a((View) this.f15730a0, 4);
        }
        boolean z2 = dVar2 instanceof C3565n;
        if ((z2 || (dVar2 instanceof C3570o)) && dVar == null) {
            if (this.f15753x0 != null) {
                C5343a.m15160U().mo12838a(this.f15753x0, this.f15700A0.mo10015c(), this.f15700A0.mo10014b(), this.f15700A0.mo10016d(), this.f15700A0.mo10010a());
            }
            this.f15751v0 = false;
            this.f15700A0.mo10020h();
            this.f15738i0.mo14068C();
            C3896a1.m11470r().mo10522l();
            this.f15735f0.mo11345a(C2458b.NORMAL);
        }
        if (z) {
            this.f15745p0 = (C3565n) dVar;
            this.f15752w0 = true;
            C4407y0 y0Var4 = this.f15735f0;
            if (y0Var4 != null) {
                y0Var4.mo11370g(false);
            }
        } else if (z2) {
            this.f15745p0 = null;
            this.f15752w0 = false;
            C4407y0 y0Var5 = this.f15735f0;
            if (y0Var5 != null) {
                y0Var5.mo11370g(true);
            }
        }
        if (dVar2 instanceof C4463s0) {
            String B = ((C4463s0) dVar2).mo7192B();
            if (InboxManager.m11316b().mo10407a(B)) {
                C4473v0.m13262b(this, B, true);
            } else {
                mo14115a(B, true, false);
            }
        }
    }

    /* renamed from: a */
    private boolean m17225a(C4292t0 t0Var) {
        return C3896a1.m11470r().mo10505a(t0Var.mo7192B(), this.f15740k0 == C2470a.MAP);
    }

    /* renamed from: a */
    private boolean m17224a(ChatContract chatContract) {
        boolean z;
        String userUuid = chatContract.getUserUuid();
        C7339i contact = chatContract.getContact();
        if (userUuid != null) {
            FogContract fogContract = this.f15747r0;
            if (fogContract == null || !TextUtils.equals(fogContract.getUserUuid(), userUuid)) {
                m17213a(C3943a.m11559e(userUuid));
                this.f15712M0.mo9845a(userUuid);
            }
        } else if (contact != null) {
            FogContract fogContract2 = this.f15747r0;
            if (fogContract2 == null || (fogContract2.getContact() != null && !TextUtils.equals(this.f15747r0.getContact().getUuid(), contact.getUuid()))) {
                m17213a(C3943a.m11552b(contact));
                this.f15712M0.mo9844a(contact);
            }
        } else {
            z = false;
            C12143a.m32027a("configureFogControllerForChat: %s", String.valueOf(z));
            return z;
        }
        z = true;
        C12143a.m32027a("configureFogControllerForChat: %s", String.valueOf(z));
        return z;
    }

    /* renamed from: a */
    private void m17202a(ViewGroup viewGroup, C8819d dVar) {
        m17207a(viewGroup, dVar, true);
    }

    /* renamed from: a */
    private void m17207a(ViewGroup viewGroup, C8819d dVar, boolean z) {
        m17203a(viewGroup, dVar, (ControllerChangeHandler) z ? new C8818e() : null);
    }

    /* renamed from: a */
    private void m17203a(ViewGroup viewGroup, C8819d dVar, ControllerChangeHandler controllerChangeHandler) {
        m17205a(viewGroup, dVar, controllerChangeHandler, false);
    }

    /* renamed from: a */
    private void m17205a(ViewGroup viewGroup, C8819d dVar, ControllerChangeHandler controllerChangeHandler, boolean z) {
        m17204a(viewGroup, dVar, controllerChangeHandler, controllerChangeHandler, z);
    }

    /* renamed from: a */
    private void m17204a(ViewGroup viewGroup, C8819d dVar, ControllerChangeHandler controllerChangeHandler, ControllerChangeHandler controllerChangeHandler2, boolean z) {
        C8831g a = mo23896a(viewGroup);
        if (dVar == null) {
            viewGroup.setVisibility(4);
            while (a.mo24003c() > 0) {
                a.mo24014n();
            }
            return;
        }
        viewGroup.setVisibility(0);
        if (!a.mo24012j()) {
            C8836h a2 = C8836h.m21058a(dVar);
            a2.mo24023a(controllerChangeHandler2);
            a2.mo24026b(controllerChangeHandler);
            a.mo24008d(a2);
        } else if (z) {
            C8836h a3 = C8836h.m21058a(dVar);
            a3.mo24023a(controllerChangeHandler2);
            a3.mo24026b(controllerChangeHandler);
            a.mo24005c(a3);
        } else {
            C8836h a4 = C8836h.m21058a(dVar);
            a4.mo24023a(controllerChangeHandler2);
            a4.mo24026b(controllerChangeHandler);
            a.mo23991a(a4);
        }
    }

    /* renamed from: a */
    public /* synthetic */ void mo14110a(C8224p2 p2Var) throws Exception {
        String a = C0296b.m1230a(mo9304A(), null);
        if (a != null) {
            this.f15718Q0 = true;
            C0296b.m1232a((Context) mo9304A(), a, (C0305d) new C6155a(mo9304A(), C5448c.m15478a(), (MeUserManager) this.f15710K0.get(), p2Var.getUrl()));
        }
    }

    /* renamed from: a */
    public void mo14115a(String str, boolean z, boolean z2) {
        m17245d(this.f15721S.mo12442a(str, z, z2));
    }

    /* renamed from: a */
    private void m17201a(View view, int i) {
        view.animate().alpha(i == 0 ? 1.0f : 0.0f).setListener(new C6277e(view, i)).start();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m17199a(int i, float f) {
        if (i == 0) {
            f = 1.0f - f;
        } else if (i != 1) {
            f = i != 2 ? 0.0f : 1.0f;
        }
        this.f15728Y.setAlpha(f);
    }
}
