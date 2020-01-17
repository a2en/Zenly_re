package app.zenly.locator.map;

import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.content.C0540a;
import androidx.core.graphics.drawable.C0559a;
import androidx.core.view.C0636b;
import app.zenly.android.feature.base.p009di.Provider;
import app.zenly.android.feature.base.scheduling.C1351e;
import app.zenly.android.feature.base.scheduling.ZenlySchedulers;
import app.zenly.locator.R;
import app.zenly.locator.core.app.C2453d;
import app.zenly.locator.core.contracts.MapControllerContract.C2457a;
import app.zenly.locator.core.contracts.MapControllerContract.C2458b;
import app.zenly.locator.core.contracts.MapControllerContract.C2459c;
import app.zenly.locator.core.contracts.MapControllerContract.C2460d;
import app.zenly.locator.core.contracts.MapControllerContract.C2460d.C2461a;
import app.zenly.locator.core.contracts.MapControllerContract.C2462e;
import app.zenly.locator.core.contracts.MapControllerContract.C2463f;
import app.zenly.locator.core.contracts.MapControllerContract.C2464g;
import app.zenly.locator.core.contracts.MapControllerContract.C2465h.C2466a;
import app.zenly.locator.core.contracts.NavigationContract;
import app.zenly.locator.core.manager.C2718k5;
import app.zenly.locator.core.manager.C2718k5.C2721c;
import app.zenly.locator.core.manager.C2718k5.C2723e;
import app.zenly.locator.core.manager.C2741m5;
import app.zenly.locator.core.manager.MeUserManager;
import app.zenly.locator.core.manager.MeUserManager.C2629b;
import app.zenly.locator.core.manager.MeUserManager.Listener;
import app.zenly.locator.core.manager.p069di.C2666b;
import app.zenly.locator.core.manager.p070t5.C2831a;
import app.zenly.locator.core.manager.p070t5.C2832b;
import app.zenly.locator.core.models.C2879d0;
import app.zenly.locator.core.models.C2892m;
import app.zenly.locator.core.models.C2896p;
import app.zenly.locator.core.models.C2898q.C2900b;
import app.zenly.locator.core.models.C2907v;
import app.zenly.locator.core.p072ui.controller.C3103g.C3106c;
import app.zenly.locator.core.util.C3200e0;
import app.zenly.locator.core.widget.OneTouchZoomLayout;
import app.zenly.locator.core.widget.OneTouchZoomLayout.OneTouchZoomListener;
import app.zenly.locator.core.widget.OneTouchZoomLayout.OneTouchZoomeable;
import app.zenly.locator.decision.C3444a;
import app.zenly.locator.map.base.Map;
import app.zenly.locator.map.base.Map.C3901a;
import app.zenly.locator.map.base.Map.MapListener;
import app.zenly.locator.map.base.Map.OnMapReadyCallback;
import app.zenly.locator.map.mapbox.C4129e;
import app.zenly.locator.map.marker.AvatarMarkerView;
import app.zenly.locator.map.marker.C4162a0;
import app.zenly.locator.map.marker.C4167b0;
import app.zenly.locator.map.marker.C4171c0;
import app.zenly.locator.map.marker.C4175d0;
import app.zenly.locator.map.marker.C4178e0;
import app.zenly.locator.map.marker.C4187h0;
import app.zenly.locator.map.marker.C4217i0;
import app.zenly.locator.map.marker.C4217i0.C4218a;
import app.zenly.locator.map.marker.C4220j0;
import app.zenly.locator.map.marker.C4220j0.C4221a;
import app.zenly.locator.map.marker.C4223k0;
import app.zenly.locator.map.marker.C4223k0.C4225b;
import app.zenly.locator.map.marker.C4229l0;
import app.zenly.locator.map.marker.C4234n0;
import app.zenly.locator.map.marker.C4237o0;
import app.zenly.locator.map.marker.C4240p0;
import app.zenly.locator.map.marker.FocusedMarkerOverlay;
import app.zenly.locator.map.marker.FriendMarkerAdapter;
import app.zenly.locator.map.marker.FriendMarkerAdapter.FriendMarkerAdapterListener;
import app.zenly.locator.map.marker.MarkerAdapter;
import app.zenly.locator.map.marker.MarkerManager;
import app.zenly.locator.map.marker.MarkerManager.MarkerManagerListener;
import app.zenly.locator.map.p105e1.C3934b;
import app.zenly.locator.map.p105e1.C3937c;
import app.zenly.locator.map.p107g1.C3979c;
import app.zenly.locator.map.p109i1.C4031m1;
import app.zenly.locator.map.p109i1.C4047p1;
import app.zenly.locator.map.p109i1.C4050q1;
import app.zenly.locator.map.p109i1.C4059r1;
import app.zenly.locator.map.p109i1.p110s1.C4062a;
import app.zenly.locator.map.p111j1.C4079a;
import app.zenly.locator.map.p111j1.C4081c;
import app.zenly.locator.map.p112k1.C4084a;
import app.zenly.locator.map.p112k1.C4105d;
import app.zenly.locator.map.p112k1.C4106e;
import app.zenly.locator.map.p112k1.C4109f;
import app.zenly.locator.map.p114m1.C4122b;
import app.zenly.locator.map.p116n1.C4274b;
import app.zenly.locator.map.view.CapsulesStatesView;
import app.zenly.locator.map.view.PrecisionCircleView;
import app.zenly.locator.p143s.C5407g;
import app.zenly.locator.p143s.C5407g.C5409b;
import app.zenly.locator.p143s.p148l.C5447b;
import app.zenly.locator.p143s.p148l.C5448c;
import app.zenly.locator.p143s.p150n.C5457b;
import app.zenly.locator.p143s.p150n.C5458c;
import app.zenly.locator.p143s.p150n.C5459d;
import app.zenly.locator.p143s.p150n.C5460e;
import app.zenly.locator.p143s.p150n.C5462f;
import app.zenly.locator.p143s.p150n.C5463g;
import app.zenly.locator.p143s.p150n.C5464h;
import com.mapbox.mapboxsdk.C11451d;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import p250f.p251a.p252a.p263b.p264a.p271i.C7707a;
import p387h.p388a.C12143a;
import p389io.reactivex.C12279e;
import p389io.reactivex.C12286f;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.functions.Action;
import p389io.reactivex.functions.BiFunction;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.functions.Function3;
import p389io.reactivex.functions.Predicate;
import p389io.reactivex.p406n.C12785a;

/* renamed from: app.zenly.locator.map.u0 */
public class C4303u0 extends C4407y0 {
    /* access modifiers changed from: private */

    /* renamed from: A0 */
    public boolean f11510A0 = false;

    /* renamed from: B0 */
    private C5462f f11511B0 = null;

    /* renamed from: C0 */
    private C2462e f11512C0 = C2462e.STATIC;

    /* renamed from: D0 */
    private final C12275b f11513D0 = new C12275b();

    /* renamed from: E0 */
    private final C12275b f11514E0 = new C12275b();

    /* renamed from: F0 */
    private final C5409b f11515F0 = new C4306c();

    /* renamed from: G0 */
    private View f11516G0;

    /* renamed from: H0 */
    private ComponentCallbacks f11517H0 = new C4307d();

    /* renamed from: I0 */
    private final OnMapReadyCallback f11518I0 = new C4308e();

    /* renamed from: J0 */
    private MapListener f11519J0 = new C4309f();
    /* access modifiers changed from: private */

    /* renamed from: K0 */
    public Listener f11520K0 = new C4310g();

    /* renamed from: L0 */
    private OneTouchZoomListener f11521L0 = new C4311h();

    /* renamed from: M0 */
    private OneTouchZoomeable f11522M0 = new C4312i();

    /* renamed from: N0 */
    private final CapsulesStatesView.Listener f11523N0 = new C4313j();

    /* renamed from: O0 */
    private FriendMarkerAdapterListener f11524O0 = new C3939f(this);

    /* renamed from: P */
    private final ZenlySchedulers f11525P = C1351e.m6372a(C4409z0.f11896b.mo19916a("controller"));

    /* renamed from: P0 */
    private MarkerManagerListener f11526P0 = new C4314k();
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public final C12785a<C4217i0> f11527Q = C12785a.m33447u();

    /* renamed from: Q0 */
    private FocusedMarkerOverlay.Listener<C4167b0> f11528Q0 = new C4304a();
    /* access modifiers changed from: private */

    /* renamed from: R */
    public final C12785a<C4220j0> f11529R = C12785a.m33447u();
    /* access modifiers changed from: private */

    /* renamed from: S */
    public final C12785a<Double> f11530S = C12785a.m33447u();
    /* access modifiers changed from: private */

    /* renamed from: T */
    public NavigationContract f11531T;
    /* access modifiers changed from: private */

    /* renamed from: U */
    public Map f11532U;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public MarkerManager f11533V;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public C0636b f11534W;

    /* renamed from: X */
    private MapGestureListener f11535X;

    /* renamed from: Y */
    private C4122b f11536Y;

    /* renamed from: Z */
    private PrecisionCircleView f11537Z;
    /* access modifiers changed from: private */

    /* renamed from: a0 */
    public C4237o0 f11538a0;

    /* renamed from: b0 */
    private FriendMarkerAdapter f11539b0;
    /* access modifiers changed from: private */

    /* renamed from: c0 */
    public C4175d0 f11540c0;

    /* renamed from: d0 */
    private C4187h0 f11541d0;

    /* renamed from: e0 */
    private C4240p0 f11542e0;
    /* access modifiers changed from: private */

    /* renamed from: f0 */
    public C4109f f11543f0;

    /* renamed from: g0 */
    private C4162a0 f11544g0;

    /* renamed from: h0 */
    private C4106e f11545h0;

    /* renamed from: i0 */
    private C4105d f11546i0;
    /* access modifiers changed from: private */

    /* renamed from: j0 */
    public C4084a f11547j0;

    /* renamed from: k0 */
    private OneTouchZoomLayout f11548k0;
    /* access modifiers changed from: private */

    /* renamed from: l0 */
    public Provider<C2718k5> f11549l0;
    /* access modifiers changed from: private */

    /* renamed from: m0 */
    public Provider<MeUserManager> f11550m0;

    /* renamed from: n0 */
    private Provider<C4059r1> f11551n0;
    /* access modifiers changed from: private */

    /* renamed from: o0 */
    public Provider<C4031m1> f11552o0;

    /* renamed from: p0 */
    private Provider<C2741m5> f11553p0;

    /* renamed from: q0 */
    private Provider<C4047p1> f11554q0;

    /* renamed from: r0 */
    private FrameLayout f11555r0;
    /* access modifiers changed from: private */

    /* renamed from: s0 */
    public boolean f11556s0 = false;

    /* renamed from: t0 */
    private boolean f11557t0 = false;
    /* access modifiers changed from: private */

    /* renamed from: u0 */
    public C5460e f11558u0;
    /* access modifiers changed from: private */

    /* renamed from: v0 */
    public boolean f11559v0;

    /* renamed from: w0 */
    private boolean f11560w0 = false;

    /* renamed from: x0 */
    private boolean f11561x0 = false;
    /* access modifiers changed from: private */

    /* renamed from: y0 */
    public String f11562y0;

    /* renamed from: z0 */
    private int f11563z0 = -1;

    /* renamed from: app.zenly.locator.map.u0$a */
    class C4304a implements FocusedMarkerOverlay.Listener<C4167b0> {
        C4304a() {
        }

        /* renamed from: a */
        public void onMarkerIsAttached(C4167b0 b0Var) {
            C4303u0.this.f11547j0.mo10748a(b0Var.mo11116o());
        }

        /* renamed from: b */
        public void onMarkerIsDetached(C4167b0 b0Var) {
            C4303u0.this.f11547j0.mo10748a((String) null);
        }
    }

    /* renamed from: app.zenly.locator.map.u0$b */
    static /* synthetic */ class C4305b {

        /* renamed from: a */
        static final /* synthetic */ int[] f11565a = new int[C4218a.values().length];

        /* renamed from: b */
        static final /* synthetic */ int[] f11566b = new int[C4221a.values().length];

        /* renamed from: c */
        static final /* synthetic */ int[] f11567c = new int[C2629b.values().length];

        /* renamed from: d */
        static final /* synthetic */ int[] f11568d = new int[C2466a.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(37:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|20|21|22|(2:23|24)|25|(2:27|28)|29|31|32|33|34|35|37|38|39|40|41|42|43|44|45|46|47|48|(3:49|50|52)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(39:0|(2:1|2)|3|5|6|7|(2:9|10)|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|(2:27|28)|29|31|32|33|34|35|37|38|39|40|41|42|43|44|45|46|47|48|(3:49|50|52)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(41:0|(2:1|2)|3|5|6|7|(2:9|10)|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|(2:27|28)|29|31|32|33|34|35|37|38|39|40|41|42|43|44|45|46|47|48|49|50|52) */
        /* JADX WARNING: Can't wrap try/catch for region: R(42:0|(2:1|2)|3|5|6|7|(2:9|10)|11|13|14|15|17|18|19|20|21|22|23|24|25|(2:27|28)|29|31|32|33|34|35|37|38|39|40|41|42|43|44|45|46|47|48|49|50|52) */
        /* JADX WARNING: Can't wrap try/catch for region: R(43:0|1|2|3|5|6|7|(2:9|10)|11|13|14|15|17|18|19|20|21|22|23|24|25|(2:27|28)|29|31|32|33|34|35|37|38|39|40|41|42|43|44|45|46|47|48|49|50|52) */
        /* JADX WARNING: Can't wrap try/catch for region: R(44:0|1|2|3|5|6|7|(2:9|10)|11|13|14|15|17|18|19|20|21|22|23|24|25|27|28|29|31|32|33|34|35|37|38|39|40|41|42|43|44|45|46|47|48|49|50|52) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0048 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0052 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x005c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00a1 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00ab */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00b5 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00bf */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00c9 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00d4 */
        static {
            /*
                app.zenly.locator.core.contracts.MapControllerContract$h$a[] r0 = app.zenly.locator.core.contracts.MapControllerContract.C2465h.C2466a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f11568d = r0
                r0 = 1
                int[] r1 = f11568d     // Catch:{ NoSuchFieldError -> 0x0014 }
                app.zenly.locator.core.contracts.MapControllerContract$h$a r2 = app.zenly.locator.core.contracts.MapControllerContract.C2465h.C2466a.SELECT     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                r1 = 2
                int[] r2 = f11568d     // Catch:{ NoSuchFieldError -> 0x001f }
                app.zenly.locator.core.contracts.MapControllerContract$h$a r3 = app.zenly.locator.core.contracts.MapControllerContract.C2465h.C2466a.SWITCH     // Catch:{ NoSuchFieldError -> 0x001f }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                r2 = 3
                int[] r3 = f11568d     // Catch:{ NoSuchFieldError -> 0x002a }
                app.zenly.locator.core.contracts.MapControllerContract$h$a r4 = app.zenly.locator.core.contracts.MapControllerContract.C2465h.C2466a.LOST_POSITION     // Catch:{ NoSuchFieldError -> 0x002a }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                r3 = 4
                int[] r4 = f11568d     // Catch:{ NoSuchFieldError -> 0x0035 }
                app.zenly.locator.core.contracts.MapControllerContract$h$a r5 = app.zenly.locator.core.contracts.MapControllerContract.C2465h.C2466a.UNSELECT     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                app.zenly.locator.core.manager.MeUserManager$b[] r4 = app.zenly.locator.core.manager.MeUserManager.C2629b.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f11567c = r4
                int[] r4 = f11567c     // Catch:{ NoSuchFieldError -> 0x0048 }
                app.zenly.locator.core.manager.MeUserManager$b r5 = app.zenly.locator.core.manager.MeUserManager.C2629b.CONFIGURATION_CHANGE     // Catch:{ NoSuchFieldError -> 0x0048 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0048 }
                r4[r5] = r0     // Catch:{ NoSuchFieldError -> 0x0048 }
            L_0x0048:
                int[] r4 = f11567c     // Catch:{ NoSuchFieldError -> 0x0052 }
                app.zenly.locator.core.manager.MeUserManager$b r5 = app.zenly.locator.core.manager.MeUserManager.C2629b.USER_UPDATE     // Catch:{ NoSuchFieldError -> 0x0052 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0052 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0052 }
            L_0x0052:
                int[] r4 = f11567c     // Catch:{ NoSuchFieldError -> 0x005c }
                app.zenly.locator.core.manager.MeUserManager$b r5 = app.zenly.locator.core.manager.MeUserManager.C2629b.LOCATION_CHANGE     // Catch:{ NoSuchFieldError -> 0x005c }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x005c }
                r4[r5] = r2     // Catch:{ NoSuchFieldError -> 0x005c }
            L_0x005c:
                int[] r4 = f11567c     // Catch:{ NoSuchFieldError -> 0x0066 }
                app.zenly.locator.core.manager.MeUserManager$b r5 = app.zenly.locator.core.manager.MeUserManager.C2629b.VIEWPORT_CHANGE     // Catch:{ NoSuchFieldError -> 0x0066 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0066 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0066 }
            L_0x0066:
                r4 = 5
                int[] r5 = f11567c     // Catch:{ NoSuchFieldError -> 0x0071 }
                app.zenly.locator.core.manager.MeUserManager$b r6 = app.zenly.locator.core.manager.MeUserManager.C2629b.HAS_BRUMP_CHANGE     // Catch:{ NoSuchFieldError -> 0x0071 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0071 }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x0071 }
            L_0x0071:
                app.zenly.locator.map.marker.j0$a[] r5 = app.zenly.locator.map.marker.C4220j0.C4221a.values()
                int r5 = r5.length
                int[] r5 = new int[r5]
                f11566b = r5
                int[] r5 = f11566b     // Catch:{ NoSuchFieldError -> 0x0084 }
                app.zenly.locator.map.marker.j0$a r6 = app.zenly.locator.map.marker.C4220j0.C4221a.FOLLOW     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r5[r6] = r0     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r5 = f11566b     // Catch:{ NoSuchFieldError -> 0x008e }
                app.zenly.locator.map.marker.j0$a r6 = app.zenly.locator.map.marker.C4220j0.C4221a.UNFOLLOW     // Catch:{ NoSuchFieldError -> 0x008e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x008e }
                r5[r6] = r1     // Catch:{ NoSuchFieldError -> 0x008e }
            L_0x008e:
                app.zenly.locator.map.marker.i0$a[] r5 = app.zenly.locator.map.marker.C4217i0.C4218a.values()
                int r5 = r5.length
                int[] r5 = new int[r5]
                f11565a = r5
                int[] r5 = f11565a     // Catch:{ NoSuchFieldError -> 0x00a1 }
                app.zenly.locator.map.marker.i0$a r6 = app.zenly.locator.map.marker.C4217i0.C4218a.CLICK     // Catch:{ NoSuchFieldError -> 0x00a1 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a1 }
                r5[r6] = r0     // Catch:{ NoSuchFieldError -> 0x00a1 }
            L_0x00a1:
                int[] r0 = f11565a     // Catch:{ NoSuchFieldError -> 0x00ab }
                app.zenly.locator.map.marker.i0$a r5 = app.zenly.locator.map.marker.C4217i0.C4218a.LOST_POSITION     // Catch:{ NoSuchFieldError -> 0x00ab }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x00ab }
                r0[r5] = r1     // Catch:{ NoSuchFieldError -> 0x00ab }
            L_0x00ab:
                int[] r0 = f11565a     // Catch:{ NoSuchFieldError -> 0x00b5 }
                app.zenly.locator.map.marker.i0$a r1 = app.zenly.locator.map.marker.C4217i0.C4218a.SELECT     // Catch:{ NoSuchFieldError -> 0x00b5 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b5 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b5 }
            L_0x00b5:
                int[] r0 = f11565a     // Catch:{ NoSuchFieldError -> 0x00bf }
                app.zenly.locator.map.marker.i0$a r1 = app.zenly.locator.map.marker.C4217i0.C4218a.FOCUS     // Catch:{ NoSuchFieldError -> 0x00bf }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00bf }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x00bf }
            L_0x00bf:
                int[] r0 = f11565a     // Catch:{ NoSuchFieldError -> 0x00c9 }
                app.zenly.locator.map.marker.i0$a r1 = app.zenly.locator.map.marker.C4217i0.C4218a.SWITCH     // Catch:{ NoSuchFieldError -> 0x00c9 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c9 }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x00c9 }
            L_0x00c9:
                int[] r0 = f11565a     // Catch:{ NoSuchFieldError -> 0x00d4 }
                app.zenly.locator.map.marker.i0$a r1 = app.zenly.locator.map.marker.C4217i0.C4218a.UNSELECT     // Catch:{ NoSuchFieldError -> 0x00d4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d4 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00d4 }
            L_0x00d4:
                int[] r0 = f11565a     // Catch:{ NoSuchFieldError -> 0x00df }
                app.zenly.locator.map.marker.i0$a r1 = app.zenly.locator.map.marker.C4217i0.C4218a.RESELECT     // Catch:{ NoSuchFieldError -> 0x00df }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00df }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00df }
            L_0x00df:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.map.C4303u0.C4305b.<clinit>():void");
        }
    }

    /* renamed from: app.zenly.locator.map.u0$c */
    class C4306c extends C5409b {
        C4306c() {
        }

        /* renamed from: b */
        public void mo11008b(C5407g gVar, int i) {
            C4303u0.this.m12817c(i);
        }
    }

    /* renamed from: app.zenly.locator.map.u0$d */
    class C4307d implements ComponentCallbacks {
        C4307d() {
        }

        public void onConfigurationChanged(Configuration configuration) {
        }

        public void onLowMemory() {
            C4303u0.this.f11532U.onLowMemory();
        }
    }

    /* renamed from: app.zenly.locator.map.u0$e */
    class C4308e implements OnMapReadyCallback {
        C4308e() {
        }

        public void onMapReady(Map map) {
            C2453d.m8559e();
            C4303u0.this.f11556s0 = true;
            C2907v b = ((MeUserManager) C4303u0.this.f11550m0.get()).mo8756b();
            if (b.f8255f != null) {
                C4303u0.this.f11520K0.onMeUserUpdate(C2629b.VIEWPORT_CHANGE, b);
            }
        }
    }

    /* renamed from: app.zenly.locator.map.u0$f */
    class C4309f implements MapListener {
        C4309f() {
        }

        public void onMapCameraMove() {
            C4303u0.this.f11533V.mo10948h();
            C5464h visibleRegion = C4303u0.this.f11532U.getVisibleRegion();
            ((C2718k5) C4303u0.this.f11549l0.get()).mo8785a(visibleRegion);
            ((MeUserManager) C4303u0.this.f11550m0.get()).mo8753a(visibleRegion);
            C4303u0.this.f11530S.onNext(Double.valueOf(C4303u0.this.f11532U.getCurrentZoom()));
            ((C4031m1) C4303u0.this.f11552o0.get()).mo10680a(C4303u0.this.f11532U.getCameraPosition(), C4303u0.this.f11532U.getHorizontalDistanceAtCenter(), C4303u0.this.f11532U.getVerticalDistanceAtCenter());
            ((C4031m1) C4303u0.this.f11552o0.get()).mo10676a(C4303u0.this.f11532U.getCurrentZoom());
        }

        public boolean onMapTouch(View view, MotionEvent motionEvent) {
            if (C4303u0.this.f11531T != null) {
                C4303u0.this.f11531T.onMapTouch(motionEvent);
            }
            return C4303u0.this.f11534W.mo3384a(motionEvent);
        }
    }

    /* renamed from: app.zenly.locator.map.u0$g */
    class C4310g implements Listener {
        C4310g() {
        }

        /* renamed from: a */
        public /* synthetic */ void mo11378a(boolean z) {
            if (C4303u0.this.f11556s0) {
                C4303u0.this.f11510A0 = !z;
                C3896a1.m11470r().mo10525o();
            }
        }

        public void onMeUserUpdate(C2629b bVar, C2907v vVar) {
            C4303u0.this.f11538a0.mo11234a(bVar, vVar);
            int i = C4305b.f11567c[bVar.ordinal()];
            boolean z = true;
            if (i == 1) {
                C2892m mVar = vVar.f8251b;
                if (mVar == null || !mVar.mo8966a()) {
                    C4303u0.this.f11532U.setTileOverlay(null);
                } else {
                    C4303u0.this.f11532U.setTileOverlay("https://cache.zen.ly/openskimap2x/{z}/{x}/{y}.png");
                }
            } else if (i == 2) {
                for (C4171c0 c0Var : C4303u0.this.f11540c0.mo10901a()) {
                    if (c0Var.mo11021L().f8227d) {
                        c0Var.mo11067a((C4178e0) C4303u0.this.f11538a0.mo11236e(), vVar.f8250a);
                    }
                }
            } else if (i == 3) {
                C4303u0.this.f11533V.mo10920a(vVar.f8252c.mo13060b(), vVar.f8252c.mo13062c());
            } else if (i != 4) {
                if (i == 5) {
                    for (C4171c0 c0Var2 : C4303u0.this.f11540c0.mo10901a()) {
                        if (c0Var2.mo11021L().f8227d) {
                            c0Var2.mo11074m(vVar.f8258i);
                        }
                    }
                }
            } else if (C4303u0.this.f11556s0) {
                if (C4303u0.this.f11558u0 != null) {
                    z = false;
                }
                if (!C5457b.m15505a(vVar.f8255f, C4303u0.this.f11558u0)) {
                    C4303u0.this.f11558u0 = vVar.f8255f;
                    if (z) {
                        C2453d.m8564j();
                        C5458c a = C4274b.m12687a(C4303u0.this.f11532U, C4303u0.this.f11558u0, 0);
                        a.f14044e = Math.max(a.f14044e - 2.0d, 0.0d);
                        C4303u0.this.f11532U.moveCamera(a, new C3991i(this));
                    } else if (C4303u0.this.f11559v0 && !C4303u0.this.f11533V.mo10946f()) {
                        C4303u0 u0Var = C4303u0.this;
                        u0Var.m12798a(u0Var.f11558u0);
                    }
                }
            }
        }
    }

    /* renamed from: app.zenly.locator.map.u0$h */
    class C4311h implements OneTouchZoomListener {

        /* renamed from: a */
        private double f11574a;

        /* renamed from: b */
        private final C5459d f11575b = new C5459d();

        /* renamed from: c */
        private final C5459d f11576c = new C5459d();

        /* renamed from: d */
        private C4178e0 f11577d = null;

        C4311h() {
        }

        /* renamed from: a */
        private double m12895a() {
            return (C4303u0.this.f11532U.getMetersPerPixelAtLatitude(this.f11575b.mo13060b()) * ((double) C4303u0.this.f11532U.getMapViewWidth())) / 2.0d;
        }

        public void onZoomLevelChanged(float f) {
            if (f != 0.0f) {
                C4178e0 e0Var = this.f11577d;
                if (e0Var != null && e0Var.mo11019A()) {
                    double maxZoom = C4303u0.this.f11532U.getMaxZoom();
                    double d = (double) f;
                    if (d > this.f11574a && !C4303u0.this.f11533V.mo10947g() && d <= maxZoom) {
                        double pow = 1.0d - (Math.pow(2.0d, maxZoom - d) / Math.pow(2.0d, maxZoom - this.f11574a));
                        double d2 = this.f11574a;
                        C5457b.m15502a(this.f11575b, this.f11577d.mo11114k(), Math.min(1.0d, pow + (((d - d2) / (maxZoom - d2)) * 0.20000000298023224d)), this.f11576c);
                    } else if (d > this.f11574a || C4303u0.this.f11533V.mo10947g()) {
                        this.f11576c.mo13061b(this.f11577d.mo11114k().mo13060b());
                        this.f11576c.mo13063c(this.f11577d.mo11114k().mo13062c());
                    } else {
                        this.f11576c.mo13061b(this.f11575b.mo13060b());
                        this.f11576c.mo13063c(this.f11575b.mo13062c());
                    }
                } else if (C4303u0.this.f11533V.mo10943d() != null || C4303u0.this.f11533V.mo10945e()) {
                    this.f11576c.mo13061b(C4303u0.this.f11532U.getCameraPosition().f14041b);
                    this.f11576c.mo13063c(C4303u0.this.f11532U.getCameraPosition().f14042c);
                } else {
                    this.f11576c.mo13061b(this.f11575b.mo13060b());
                    this.f11576c.mo13063c(this.f11575b.mo13062c());
                }
                C4303u0.this.f11532U.moveCamera(new C5458c().mo10956a(this.f11576c).mo10961e((double) f), null);
            }
        }

        public void onZoomStarted() {
            C5458c cameraPosition = C4303u0.this.f11532U.getCameraPosition();
            this.f11575b.mo13061b(cameraPosition.f14041b);
            this.f11575b.mo13063c(cameraPosition.f14042c);
            this.f11574a = cameraPosition.f14044e;
            C4178e0 d = C4303u0.this.f11533V.mo10943d();
            C2464g gVar = (C2464g) C3896a1.m11470r().mo10513d().mo36963s();
            if (gVar == C2464g.ORIGIN && C4303u0.this.f11543f0.mo10776a() != null) {
                this.f11577d = C4303u0.this.f11543f0.mo10776a();
            } else if (gVar == C2464g.DESTINATION && C4303u0.this.f11543f0.mo10785c() != null) {
                this.f11577d = C4303u0.this.f11543f0.mo10785c();
            } else if (C4303u0.this.f11533V.mo10947g()) {
                this.f11577d = d;
            } else if (d != null || C4303u0.this.f11533V.mo10945e()) {
                this.f11577d = null;
            } else {
                this.f11577d = C4303u0.this.m12782a(this.f11575b, m12895a());
            }
            C4303u0.this.f11533V.mo10928a(false);
            C4303u0.this.mo11372h(false);
        }

        public void onZoomStopped() {
            this.f11577d = null;
        }
    }

    /* renamed from: app.zenly.locator.map.u0$i */
    class C4312i implements OneTouchZoomeable {
        C4312i() {
        }

        public double getCurrentZoom() {
            return C4303u0.this.f11532U.getCameraPosition().f14044e;
        }

        public double getMaxZoom() {
            return C4303u0.this.f11532U.getMaxZoom();
        }

        public double getMinZoom() {
            return C4303u0.this.f11532U.getMinZoom();
        }

        public boolean isAvailable() {
            return C4303u0.this.f11532U.isReady();
        }
    }

    /* renamed from: app.zenly.locator.map.u0$j */
    class C4313j implements CapsulesStatesView.Listener {
        C4313j() {
        }

        public void onCalloutClick(C2457a aVar) {
            if (C4303u0.this.f11562y0 != null) {
                if (aVar == C2457a.HEADING) {
                    new C3934b(C4303u0.this.f11547j0, ((C2718k5) C4303u0.this.f11549l0.get()).mo8779a(C4303u0.this.f11562y0)).mo10581a(C4303u0.this.mo9304A());
                } else if (aVar == C2457a.SLEEPING) {
                    new C3937c(C4303u0.this.f11547j0, ((C2718k5) C4303u0.this.f11549l0.get()).mo8779a(C4303u0.this.f11562y0)).mo10584a(C4303u0.this.mo9304A());
                } else if (aVar == C2457a.LOCATION_DISABLED) {
                    C4303u0.this.f11531T.onLocationDisabledCalloutClick();
                } else {
                    C3106c a = C4317v0.m12896a(C4303u0.this.mo23920b(), aVar, ((C2718k5) C4303u0.this.f11549l0.get()).mo8779a(C4303u0.this.f11562y0).f8198b);
                    if (a != null) {
                        a.mo9344b().mo9296j(C4303u0.this.mo23920b());
                    }
                }
            }
        }
    }

    /* renamed from: app.zenly.locator.map.u0$k */
    class C4314k implements MarkerManagerListener {
        C4314k() {
        }

        public void onFollowMarkerChange(boolean z) {
            C3896a1.m11470r().mo10510b(z);
        }

        public void onMarkerSelectionChange(C4217i0 i0Var) {
            C4303u0.this.f11527Q.onNext(i0Var);
            C4303u0.this.f11543f0.mo10783a(i0Var);
            C4178e0 e0Var = i0Var.f11311b;
            if (e0Var instanceof C4167b0) {
                C4303u0.this.m12786a(new C2459c(C4303u0.m12806b(i0Var.f11310a), ((C4167b0) i0Var.f11311b).mo11025P(), i0Var.f11312c));
            } else if (e0Var instanceof C4171c0) {
                C4303u0.this.m12788a(new C2463f(C4303u0.m12806b(i0Var.f11310a), ((C4171c0) i0Var.f11311b).mo11063M(), i0Var.f11312c));
            }
        }

        public void onMarkersSelectionChange(C4220j0 j0Var) {
            C4303u0.this.f11529R.onNext(j0Var);
            ArrayList arrayList = new ArrayList();
            for (C4178e0 e0Var : j0Var.f11324b) {
                if (e0Var instanceof C4167b0) {
                    arrayList.add(((C4167b0) e0Var).mo11025P());
                }
            }
            C4303u0.this.m12787a(new C2460d(C4303u0.m12805b(j0Var.f11323a), arrayList, j0Var.f11325c));
        }
    }

    /* renamed from: app.zenly.locator.map.u0$l */
    private class C4315l {

        /* renamed from: a */
        C2458b f11582a;

        /* renamed from: b */
        boolean f11583b;

        /* renamed from: c */
        boolean f11584c;

        private C4315l(C4303u0 u0Var) {
        }

        /* synthetic */ C4315l(C4303u0 u0Var, C4306c cVar) {
            this(u0Var);
        }
    }

    /* renamed from: G */
    static /* synthetic */ void m12760G() throws Exception {
    }

    /* renamed from: H */
    static /* synthetic */ void m12761H() throws Exception {
        String str = "ContextualLabeling onComplete";
        C12143a.m32027a(str, new Object[0]);
        C5448c.m15478a().logInfo(str);
    }

    /* renamed from: I */
    private void m12762I() {
        if (this.f11561x0) {
            this.f11561x0 = false;
            if (mo9313v()) {
                this.f11532U.onPause();
                this.f11533V.mo10949i();
            }
        }
    }

    /* renamed from: J */
    private void m12763J() {
        C7707a.m18761b("map:onMapStart");
        if (!this.f11561x0) {
            this.f11561x0 = true;
            if (mo9313v()) {
                this.f11532U.onResume();
                this.f11533V.mo10950j();
            }
        }
        C7707a.m18759a();
    }

    /* renamed from: K */
    private void m12764K() {
        C7707a.m18761b("map:onMapStart");
        if (!this.f11560w0) {
            this.f11560w0 = true;
            this.f11532U.onStart();
        }
        C7707a.m18759a();
    }

    /* renamed from: L */
    private void m12765L() {
        if (this.f11560w0) {
            this.f11560w0 = false;
            this.f11532U.onStop();
        }
    }

    /* renamed from: M */
    private void m12766M() {
        C4081c f = ((C4059r1) this.f11551n0.get()).mo10729f();
        if (C3896a1.m11470r().mo10517g() == null || f == null || f.mo10746a()) {
            m12832i(false);
        } else {
            m12832i(true);
        }
    }

    /* renamed from: N */
    private void m12767N() {
        int i = mo9313v() ? 0 : 8;
        C4109f fVar = this.f11543f0;
        if (fVar != null) {
            fVar.mo10777a(i);
        }
        C4187h0 h0Var = this.f11541d0;
        if (h0Var != null) {
            h0Var.setVisibility(i);
        }
        C4240p0 p0Var = this.f11542e0;
        if (p0Var != null) {
            p0Var.setVisibility(i);
        }
        C4162a0 a0Var = this.f11544g0;
        if (a0Var != null) {
            a0Var.setVisibility(i);
        }
    }

    /* renamed from: O */
    private Disposable m12768O() {
        return C12279e.m32630h(5000, TimeUnit.MILLISECONDS).mo36428a((C12286f) this.f11525P.getComputation()).mo36509m(new C4285q(this)).mo36509m(C3992i0.f10543e).mo36459b((Predicate<? super T>) C4114l.f10767e).mo36474c().mo36553e().mo36426a((ObservableSource<? extends U>) ((MeUserManager) this.f11550m0.get()).mo8759c().mo36487e(1), (BiFunction<? super T, ? super U, ? extends R>) C3894a.f10314a).mo36428a((C12286f) this.f11525P.getMainThread()).mo36413a((Consumer<? super T>) C4287r.f11484e, (Consumer<? super Throwable>) C4291t.f11487e, (Action) C4402w.f11890a);
    }

    /* renamed from: P */
    private Disposable m12769P() {
        return ((C2718k5) this.f11549l0.get()).mo8792c().mo36428a((C12286f) this.f11525P.getMainThread()).mo36476d((Consumer<? super T>) new C4406y<Object>(this));
    }

    /* renamed from: Q */
    private Disposable m12770Q() {
        return ((C2718k5) this.f11549l0.get()).mo8793d().mo36428a((C12286f) this.f11525P.getMainThread()).mo36476d((Consumer<? super T>) new C4078j0<Object>(this));
    }

    /* renamed from: R */
    private Disposable m12771R() {
        return C12279e.m32610a((ObservableSource<? extends T1>) ((C2741m5) this.f11553p0.get()).mo8804a(), (ObservableSource<? extends T2>) C3896a1.m11470r().mo10496a(), (BiFunction<? super T1, ? super T2, ? extends R>) C4288r0.f11485a).mo36428a((C12286f) this.f11525P.getMainThread()).mo36476d((Consumer<? super T>) new C4404x<Object>(this));
    }

    /* renamed from: S */
    private Disposable m12772S() {
        return ((C4059r1) this.f11551n0.get()).mo10728e().mo36428a((C12286f) this.f11525P.getMainThread()).mo36476d((Consumer<? super T>) new C4270n0<Object>(this));
    }

    /* renamed from: T */
    private Disposable m12773T() {
        return C3896a1.m11470r().mo10519i().mo36509m(new C4082k(this)).mo36428a((C12286f) this.f11525P.getMainThread()).mo36413a((Consumer<? super T>) new C3989h0<Object>(this), (Consumer<? super Throwable>) C3911d0.f10370e, (Action) C4269n.f11444a);
    }

    /* renamed from: U */
    private void m12774U() {
        C3900b1 a = C3900b1.m11503a(C5407g.m15386a((Context) mo23920b()).mo12981e(), C3900b1.GOOGLE_MAP);
        boolean z = true;
        this.f11546i0.mo10772a(a.f10336e != 3);
        if (this.f11532U.getMapStyle() != C3901a.HYBRID && !this.f11532U.isNightModeEnabled()) {
            z = false;
        }
        int i = z ? a.f10338g : a.f10337f;
        this.f11546i0.mo10771a(i);
        this.f11545h0.mo10775a(z);
        this.f11543f0.mo10781a(z);
        C3896a1.m11470r().mo10496a().onNext(Boolean.valueOf(z));
        Drawable foreground = this.f11548k0.getForeground();
        if (foreground != null) {
            C0559a.m2642a(foreground, ColorStateList.valueOf(i));
        }
    }

    /* renamed from: B */
    public void mo7192B() {
        C4167b0 b0Var = (C4167b0) this.f11544g0.getMarker();
        if (b0Var != null) {
            ((AvatarMarkerView) b0Var.mo11112g()).mo10836d();
        }
    }

    /* renamed from: C */
    public String mo11335C() {
        return this.f11562y0;
    }

    /* renamed from: D */
    public void mo11336D() {
        this.f11545h0.mo10774a((Runnable) C3974g.f10503e);
    }

    /* renamed from: E */
    public /* synthetic */ void mo11337E() {
        boolean z = true;
        this.f11557t0 = true;
        C3896a1.m11470r().mo10524n();
        C4175d0 d0Var = this.f11540c0;
        if (C3896a1.m11470r().mo10508b().mo36963s() != C2458b.NORMAL) {
            z = false;
        }
        d0Var.mo11082a(z);
        ((C2718k5) this.f11549l0.get()).mo8783a();
        ((C4059r1) this.f11551n0.get()).mo10698a();
    }

    public void onWindowInsetsChanged(View view, Rect rect) {
        super.onWindowInsetsChanged(view, rect);
        this.f11555r0.setPadding(rect.left, rect.top, rect.right, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo11371h(Activity activity) {
        super.mo11371h(activity);
        m12764K();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo11373i(Activity activity) {
        super.mo11373i(activity);
        m12765L();
    }

    /* renamed from: d */
    static /* synthetic */ void m12821d(Throwable th) throws Exception {
        C12143a.m32032b(th, "ContextualLabeling onError", new Object[0]);
        C5448c.m15478a().logError(String.format(Locale.ENGLISH, "ContextualLabeling onError %s", new Object[]{th.getMessage()}));
    }

    /* renamed from: e */
    public /* synthetic */ void mo7061e(View view) {
        this.f11531T.onFootstepsClicked();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo11367f(Activity activity) {
        super.mo11367f(activity);
        m12762I();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo11369g(Activity activity) {
        super.mo11369g(activity);
        if (this.f11532U.isReady()) {
            m12763J();
        }
    }

    /* renamed from: i */
    private void m12832i(boolean z) {
        this.f11532U.setNightModeEnabled(z);
        m12774U();
    }

    /* renamed from: b */
    public /* synthetic */ MeUserManager mo11361b(Context context) {
        MeUserManager b = C2666b.m9049a(context).mo8764b();
        b.mo8760c(!mo9313v());
        return b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo7066c(View view) {
        this.f11556s0 = false;
        C3896a1.m11470r().mo10509b((C4407y0) this);
        this.f11548k0.mo9694b(this.f11521L0);
        this.f11533V.mo10924a((MarkerManagerListener) null);
        Activity b = mo23920b();
        if (b != null) {
            b.unregisterComponentCallbacks(this.f11517H0);
        }
        this.f11513D0.mo36401a();
        this.f11532U.onDestroy();
        C4122b bVar = this.f11536Y;
        if (bVar != null) {
            bVar.mo10798a();
        }
        super.mo7066c(view);
    }

    /* renamed from: e */
    public void mo11366e(boolean z) {
        mo11336D();
        C2907v b = ((MeUserManager) this.f11550m0.get()).mo8756b();
        this.f11538a0.mo11234a(null, b);
        C5459d dVar = b.f8252c;
        if (dVar != null) {
            this.f11533V.mo10920a(dVar.mo13060b(), b.f8252c.mo13062c());
        }
        if (!this.f11510A0) {
            this.f11532U.animateCamera(C4274b.m12687a(this.f11532U, this.f11558u0, 0), 500, new C4118m(this, z));
            return;
        }
        C3896a1.m11470r().mo10512c(false);
        this.f11539b0.mo10873a(z);
    }

    /* renamed from: h */
    public void mo11372h(boolean z) {
        if (this.f11559v0 != z) {
            this.f11559v0 = z;
            if (this.f11559v0) {
                mo11358a(false, false);
                m12798a(this.f11558u0);
            }
            C3896a1.m11470r().mo10512c(this.f11559v0);
        }
    }

    /* renamed from: f */
    public void mo11368f(boolean z) {
        ((C4031m1) this.f11552o0.get()).mo10681a(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static C2466a m12806b(C4218a aVar) {
        switch (C4305b.f11565a[aVar.ordinal()]) {
            case 1:
                return C2466a.CLICK;
            case 2:
                return C2466a.LOST_POSITION;
            case 3:
                return C2466a.SELECT;
            case 4:
                return C2466a.FOCUS;
            case 5:
                return C2466a.SWITCH;
            case 6:
                return C2466a.UNSELECT;
            case 7:
                return C2466a.RESELECT;
            default:
                return null;
        }
    }

    /* renamed from: f */
    private void m12827f(boolean z, boolean z2) {
        if (this.f11533V.mo10943d() == null) {
            return;
        }
        if ((this.f11533V.mo10943d() instanceof C4167b0) || (this.f11533V.mo10943d() instanceof C4229l0) || (this.f11533V.mo10943d() instanceof C4234n0)) {
            this.f11533V.mo10929a(z, z2);
        }
    }

    /* renamed from: g */
    public void mo11370g(boolean z) {
        MapGestureListener mapGestureListener = this.f11535X;
        if (mapGestureListener != null) {
            mapGestureListener.mo10490a(z);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo7053d(View view) {
        super.mo7053d(view);
        this.f11531T = null;
        C5407g.m15386a(view.getContext()).mo12976b(this.f11515F0);
        this.f11539b0.mo10875d();
        ((C4059r1) this.f11551n0.get()).mo10702d();
        ((MeUserManager) this.f11550m0.get()).mo8757b(this.f11520K0);
        this.f11514E0.mo36401a();
        this.f11547j0.mo10753e();
        m12762I();
        m12765L();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7065a(Context context) {
        super.mo7065a(context);
        this.f11549l0 = new C4119m0(context);
        this.f11550m0 = new C4316v(this, context);
        this.f11554q0 = new C4284p0(context);
        this.f11551n0 = new C4289s(context);
        this.f11553p0 = new C3905c0(context);
        this.f11552o0 = new C4115l0(context);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static C2461a m12805b(C4221a aVar) {
        int i = C4305b.f11566b[aVar.ordinal()];
        if (i == 1) {
            return C2461a.FOLLOW;
        }
        if (i != 2) {
            return null;
        }
        return C2461a.UNFOLLOW;
    }

    /* renamed from: e */
    private void m12825e(boolean z, boolean z2) {
        if (this.f11533V.mo10943d() != null && (this.f11533V.mo10943d() instanceof C4171c0)) {
            this.f11533V.mo10929a(z, z2);
        }
    }

    /* renamed from: c */
    public /* synthetic */ void mo11365c(boolean z, boolean z2) {
        if (this.f11533V.mo10946f() || !z2) {
            C3896a1.m11470r().mo10512c(false);
        } else {
            mo11372h(true);
        }
        this.f11539b0.mo10873a(z);
    }

    /* renamed from: b */
    static /* synthetic */ boolean m12813b(C4217i0 i0Var) throws Exception {
        C4178e0 e0Var = i0Var.f11311b;
        return e0Var == null || e0Var.mo11121v();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo7054a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C7707a.m18760a("map:onCreateView");
        C3896a1.m11470r().mo10500a((C4407y0) this);
        FrameLayout frameLayout = (FrameLayout) layoutInflater.inflate(R.layout.controller_map, viewGroup, false);
        this.f11555r0 = (FrameLayout) frameLayout.findViewById(R.id.header_container);
        this.f11548k0 = (OneTouchZoomLayout) frameLayout.findViewById(R.id.one_touch_zoom_container);
        this.f11545h0 = new C4106e(frameLayout);
        this.f11546i0 = new C4105d(frameLayout);
        this.f11516G0 = frameLayout.findViewById(R.id.btn_footsteps);
        this.f11516G0.setOnClickListener(new C4282o0(this));
        C7707a.m18760a("createMapProvider");
        int e = C5407g.m15386a(layoutInflater.getContext()).mo12981e();
        if (e == 1) {
            C11451d.m29564a(layoutInflater.getContext(), C5448c.m15478a().getMapBoxKey());
            this.f11532U = new C4129e(layoutInflater.getContext());
        } else if (e == 3) {
            this.f11536Y = new C4122b();
            this.f11532U = this.f11536Y.mo10797a(layoutInflater.getContext());
        } else {
            this.f11532U = new C3979c(layoutInflater.getContext());
        }
        frameLayout.addView(this.f11532U.getMapContainer(), 0);
        C2453d.m8553a(e);
        this.f11532U.onCreate(null);
        this.f11533V = new MarkerManager(mo23920b(), this.f11532U);
        C7707a.m18759a();
        C7707a.m18760a("precisionView");
        this.f11537Z = new PrecisionCircleView(mo23920b());
        this.f11532U.addOverlay(this.f11537Z);
        this.f11533V.mo10927a(this.f11537Z);
        C7707a.m18759a();
        C7707a.m18760a("friendOverlay");
        this.f11539b0 = new FriendMarkerAdapter();
        this.f11539b0.mo10871a(this.f11524O0);
        this.f11541d0 = new C4187h0(layoutInflater.getContext());
        this.f11541d0.setAutoMinimize(true);
        this.f11541d0.mo11134a((MarkerAdapter) this.f11539b0);
        mo11354a(this.f11541d0);
        C7707a.m18759a();
        C7707a.m18760a("GatheringMarkerAdapter");
        this.f11540c0 = new C4175d0(layoutInflater.getContext());
        this.f11540c0.mo11080a(this.f11512C0);
        this.f11541d0.mo11134a((MarkerAdapter) this.f11540c0);
        C7707a.m18759a();
        C7707a.m18760a("UserMarkersOverlay");
        this.f11538a0 = new C4237o0(layoutInflater.getContext());
        this.f11542e0 = new C4240p0(layoutInflater.getContext());
        this.f11542e0.mo11134a((MarkerAdapter) this.f11538a0);
        mo11354a((C4187h0) this.f11542e0);
        C7707a.m18759a();
        C7707a.m18760a("HeadingOverlay");
        this.f11543f0 = new C4109f(mo9304A(), this);
        C7707a.m18759a();
        C7707a.m18760a("FriendFocusedMarkerOverlay");
        this.f11544g0 = new C4162a0(layoutInflater.getContext());
        this.f11544g0.setListener(this.f11528Q0);
        this.f11539b0.mo10902a((FocusedMarkerOverlay<M>) this.f11544g0);
        m12789a((FocusedMarkerOverlay) this.f11544g0);
        C7707a.m18759a();
        C7707a.m18760a("MapGestureListener");
        MapGestureListener mapGestureListener = new MapGestureListener(layoutInflater.getContext(), this.f11532U, this.f11533V, this.f11543f0, new C4281o(this));
        this.f11535X = mapGestureListener;
        this.f11534W = new C0636b(layoutInflater.getContext(), this.f11535X);
        this.f11534W.mo3383a(false);
        C7707a.m18759a();
        C7707a.m18760a("CapsuleStatesViewPresenter");
        this.f11544g0.setCapsulesStateListener(this.f11523N0);
        this.f11547j0 = new C4084a(this.f11544g0.getCapsulesStatesView(), this.f11549l0, new C4050q1(C5448c.m15478a()));
        this.f11548k0.setZoomeable(this.f11522M0);
        this.f11532U.setListener(this.f11519J0);
        this.f11532U.setOnMapReadyCallback(this.f11518I0);
        this.f11533V.mo10924a(this.f11526P0);
        this.f11548k0.mo9691a(this.f11521L0);
        this.f11513D0.add(C12279e.m32609a((ObservableSource<? extends T1>) this.f11527Q.mo36485d(new C4217i0()).mo36459b((Predicate<? super T>) C4083k0.f10713e), (ObservableSource<? extends T2>) this.f11529R.mo36485d(new C4220j0()), (ObservableSource<? extends T3>) C3896a1.m11470r().mo10508b().mo36485d(C2458b.NORMAL), (Function3<? super T1, ? super T2, ? super T3, ? extends R>) new C3975g0<Object,Object,Object,Object>(this)).mo36477d().mo36412a((Consumer<? super T>) new C3895a0<Object>(this), (Consumer<? super Throwable>) C4283p.f11480e));
        this.f11513D0.add(C3896a1.m11470r().mo10513d().mo36477d().mo36476d((Consumer<? super T>) new C4302u<Object>(this)));
        C2896p pVar = new C2896p();
        pVar.f8197a = "";
        C4167b0 b0Var = new C4167b0(viewGroup.getContext(), pVar);
        this.f11513D0.add(this.f11527Q.mo36485d(new C4217i0()).mo36459b((Predicate<? super T>) C3899b0.f10331e).mo36501i(new C3932e0(b0Var)).mo36477d().mo36412a((Consumer<? super T>) new C3988h<Object>(this, b0Var), (Consumer<? super Throwable>) C4077j.f10692e));
        mo23920b().registerComponentCallbacks(this.f11517H0);
        m12767N();
        C7707a.m18759a();
        return frameLayout;
    }

    /* renamed from: d */
    public void mo9311d(boolean z) {
        if (z != mo9313v()) {
            super.mo9311d(z);
            Provider<MeUserManager> provider = this.f11550m0;
            if (provider != null) {
                ((MeUserManager) provider.get()).mo8760c(!z);
            }
            m12767N();
            if (this.f11561x0) {
                if (mo9313v()) {
                    this.f11532U.onResume();
                    this.f11533V.mo10950j();
                } else {
                    this.f11532U.onPause();
                    this.f11533V.mo10949i();
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m12817c(int i) {
        if (i == 1) {
            this.f11532U.setMapStyle(C3901a.STANDARD);
        } else if (i == 2) {
            this.f11532U.setMapStyle(C3901a.HYBRID);
        } else if (i == 3) {
            this.f11532U.setMapStyle(C3901a.ZENLY);
        }
        m12774U();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7052b(View view) {
        super.mo7052b(view);
        C7707a.m18760a("map:onAttach");
        if (mo23947l() instanceof NavigationContract) {
            this.f11531T = (NavigationContract) mo23947l();
        } else if (mo23920b() instanceof NavigationContract) {
            this.f11531T = (NavigationContract) mo23920b();
        }
        C5407g a = C5407g.m15386a(view.getContext());
        a.mo12971a(this.f11515F0);
        m12817c(a.mo12983f());
        ((MeUserManager) this.f11550m0.get()).mo8752a(this.f11520K0);
        m12764K();
        m12763J();
        if (this.f11557t0) {
            ((C2718k5) this.f11549l0.get()).mo8783a();
            ((C4059r1) this.f11551n0.get()).mo10698a();
        }
        this.f11514E0.mo36403a(m12773T(), m12769P(), m12770Q(), m12771R(), m12772S(), m12768O());
        this.f11547j0.mo10750b();
        C7707a.m18759a();
    }

    /* renamed from: d */
    private void m12822d(boolean z, boolean z2) {
        if (this.f11533V.mo10945e()) {
            this.f11533V.mo10934a(null, z, z2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo11363b(View view, Bundle bundle) {
        super.mo11363b(view, bundle);
        this.f11532U.onSaveInstanceState(bundle);
    }

    /* renamed from: b */
    private void m12810b(C4171c0 c0Var, C2896p pVar) {
        C4167b0 b0Var = (C4167b0) this.f11539b0.mo10900a(pVar.f8197a);
        if (b0Var != null) {
            c0Var.mo11068a((C4178e0) b0Var);
            if (b0Var.mo11026Q() == c0Var) {
                b0Var.mo11035a((C4171c0) null);
            }
        }
    }

    /* renamed from: b */
    public void mo11362b(int i) {
        ((C2741m5) this.f11553p0.get()).mo8805a(i);
    }

    /* renamed from: b */
    public /* synthetic */ void mo11364b(boolean z, boolean z2) {
        if (z) {
            this.f11533V.mo10928a(false);
            this.f11533V.mo10938b(true);
        }
    }

    /* renamed from: b */
    private void m12809b(C2459c cVar) {
        ((C2718k5) this.f11549l0.get()).mo8784a(cVar);
        ((MeUserManager) this.f11550m0.get()).mo8750a(cVar);
        ((C4031m1) this.f11552o0.get()).mo10679a(cVar);
        ((C2741m5) this.f11553p0.get()).mo8807a(cVar);
        int i = C4305b.f11568d[cVar.f7400a.ordinal()];
        if (i == 1 || i == 2) {
            Provider<C4047p1> provider = this.f11554q0;
            if (provider != null) {
                ((C4047p1) provider.get()).mo10705a(cVar.f7380c.f8198b);
            }
            this.f11562y0 = cVar.f7380c.f8198b.mo8945g();
        } else if (i == 3 || i == 4) {
            this.f11562y0 = null;
        }
        m12766M();
    }

    /* renamed from: a */
    public /* synthetic */ void mo11353a(C4178e0 e0Var) {
        this.f11526P0.onMarkerSelectionChange(new C4217i0(C4218a.CLICK, e0Var, true));
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0026  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ app.zenly.locator.map.C4303u0.C4315l mo11338a(app.zenly.locator.map.marker.C4217i0 r4, app.zenly.locator.map.marker.C4220j0 r5, app.zenly.locator.core.contracts.MapControllerContract.C2458b r6) throws java.lang.Exception {
        /*
            r3 = this;
            app.zenly.locator.map.u0$l r0 = new app.zenly.locator.map.u0$l
            r1 = 0
            r0.<init>(r3, r1)
            r0.f11582a = r6
            app.zenly.locator.map.marker.e0 r6 = r4.f11311b
            boolean r6 = r6 instanceof app.zenly.locator.map.marker.C4167b0
            r1 = 1
            r2 = 0
            if (r6 == 0) goto L_0x001c
            app.zenly.locator.map.marker.i0$a r4 = r4.f11310a
            app.zenly.locator.map.marker.i0$a r6 = app.zenly.locator.map.marker.C4217i0.C4218a.FOCUS
            if (r4 == r6) goto L_0x001a
            app.zenly.locator.map.marker.i0$a r6 = app.zenly.locator.map.marker.C4217i0.C4218a.RESELECT
            if (r4 != r6) goto L_0x001c
        L_0x001a:
            r4 = 1
            goto L_0x001d
        L_0x001c:
            r4 = 0
        L_0x001d:
            r0.f11583b = r4
            app.zenly.locator.map.marker.j0$a r4 = r5.f11323a
            app.zenly.locator.map.marker.j0$a r5 = app.zenly.locator.map.marker.C4220j0.C4221a.FOLLOW
            if (r4 != r5) goto L_0x0026
            goto L_0x0027
        L_0x0026:
            r1 = 0
        L_0x0027:
            r0.f11584c = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.map.C4303u0.mo11338a(app.zenly.locator.map.marker.i0, app.zenly.locator.map.marker.j0, app.zenly.locator.core.contracts.MapControllerContract$b):app.zenly.locator.map.u0$l");
    }

    /* renamed from: a */
    public /* synthetic */ void mo11355a(C4315l lVar) throws Exception {
        this.f11540c0.mo11082a(lVar.f11582a == C2458b.NORMAL);
        int i = 8;
        if (!C3444a.m10686a(mo9304A()).mo6511a("feature:footsteps")) {
            this.f11516G0.setVisibility(8);
        } else if (lVar.f11582a == C2458b.NORMAL) {
            View view = this.f11516G0;
            if (!lVar.f11583b) {
                i = 0;
            }
            view.setVisibility(i);
        }
        if (lVar.f11582a != C2458b.NORMAL || lVar.f11583b || lVar.f11584c) {
            C4234n0 e = this.f11538a0.mo11236e();
            if (e.mo11125z() || e.mo11123x()) {
                e.mo11036a(C4225b.NORMAL);
            } else {
                e.mo11036a(C4225b.SMALL);
            }
            this.f11541d0.setAutoMinimize(false);
            ArrayList<C4223k0> arrayList = new ArrayList<>(this.f11539b0.mo10901a());
            arrayList.addAll(this.f11540c0.mo10901a());
            for (C4223k0 k0Var : arrayList) {
                if (k0Var.mo11125z() || k0Var.mo11123x()) {
                    k0Var.mo11036a(C4225b.NORMAL);
                    k0Var.mo11041j(false);
                } else if (lVar.f11582a == C2458b.MEET || lVar.f11584c) {
                    k0Var.mo11041j(true);
                } else {
                    k0Var.mo11036a(C4225b.SMALL);
                    k0Var.mo11041j(false);
                }
            }
            return;
        }
        this.f11538a0.mo11236e().mo11036a(C4225b.NORMAL);
        this.f11541d0.setAutoMinimize(true);
        ArrayList<C4223k0> arrayList2 = new ArrayList<>(this.f11539b0.mo10901a());
        arrayList2.addAll(this.f11540c0.mo10901a());
        for (C4223k0 a : arrayList2) {
            a.mo11036a(C4225b.NORMAL);
        }
    }

    /* renamed from: a */
    public /* synthetic */ void mo11347a(C2464g gVar) throws Exception {
        this.f11533V.mo10923a(gVar);
        this.f11543f0.mo10779a(gVar);
    }

    /* renamed from: a */
    static /* synthetic */ boolean m12802a(C4217i0 i0Var) throws Exception {
        C4178e0 e0Var = i0Var.f11311b;
        return e0Var == null || e0Var.mo11121v();
    }

    /* renamed from: a */
    static /* synthetic */ C4167b0 m12779a(C4167b0 b0Var, C4217i0 i0Var) throws Exception {
        C4178e0 e0Var = i0Var.f11311b;
        return (e0Var instanceof C4167b0) && e0Var.mo11122w() ? (C4167b0) i0Var.f11311b : b0Var;
    }

    /* renamed from: a */
    public /* synthetic */ void mo11352a(C4167b0 b0Var, C4167b0 b0Var2) throws Exception {
        if (b0Var2 == b0Var) {
            this.f11543f0.mo10780a((C4167b0) null);
        } else {
            this.f11543f0.mo10780a(b0Var2);
        }
    }

    /* renamed from: a */
    public /* synthetic */ ObservableSource mo11339a(Boolean bool) throws Exception {
        if (bool.booleanValue()) {
            return ((C4031m1) this.f11552o0.get()).mo10675a();
        }
        return C12279e.m32626e(new C4079a());
    }

    /* renamed from: a */
    public /* synthetic */ void mo11351a(C4079a aVar) throws Exception {
        C7707a.m18761b("handleWelcomeMessage");
        this.f11545h0.mo10773a(aVar);
        C7707a.m18759a();
    }

    /* renamed from: a */
    public /* synthetic */ void mo11348a(C2721c cVar) throws Exception {
        C7707a.m18761b("handleFriendsEvent");
        if (cVar.mo8799a()) {
            HashSet hashSet = new HashSet();
            for (C2896p pVar : cVar.f7933a.values()) {
                hashSet.add(m12778a((C4167b0) this.f11539b0.mo10900a(pVar.f8197a), pVar));
            }
            ArrayList<C4167b0> arrayList = new ArrayList<>();
            for (C4167b0 b0Var : this.f11539b0.mo10901a()) {
                if (!hashSet.contains(b0Var)) {
                    arrayList.add(b0Var);
                }
            }
            for (C4167b0 a : arrayList) {
                m12790a(a);
            }
        } else {
            for (C2831a aVar : cVar.f7934b.values()) {
                C2896p c = aVar.mo8858c();
                C4167b0 b0Var2 = (C4167b0) this.f11539b0.mo10900a(c.f8197a);
                if (b0Var2 == null) {
                    m12778a(b0Var2, c);
                } else {
                    b0Var2.mo11032a(c, aVar.mo8857b(), false);
                    if (b0Var2.mo11026Q() != null && C2831a.m9302a(aVar.mo8857b(), 2)) {
                        b0Var2.mo11026Q().mo11067a((C4178e0) b0Var2, b0Var2.mo11025P().f8198b);
                    }
                }
            }
        }
        C7707a.m18759a();
    }

    /* renamed from: a */
    public /* synthetic */ void mo11349a(C2723e eVar) throws Exception {
        C7707a.m18761b("handleGatheringEvent");
        if (eVar.mo8801a()) {
            int i = this.f11563z0;
            if (i != -1) {
                this.f11533V.mo10944d(false);
            }
            for (C4167b0 a : this.f11539b0.mo10901a()) {
                a.mo11035a((C4171c0) null);
            }
            this.f11540c0.mo10907c();
            for (C2900b bVar : ((C2718k5) this.f11549l0.get()).mo8790b()) {
                C4171c0 a2 = m12780a(bVar);
                if (bVar.f8224a == i) {
                    this.f11533V.mo10931a((C4178e0) a2, false);
                }
            }
        } else {
            for (int i2 = 0; i2 < eVar.f7936b.size(); i2++) {
                C2832b bVar2 = (C2832b) eVar.f7936b.valueAt(i2);
                C2900b bVar3 = (C2900b) bVar2.mo8866c();
                C4171c0 a3 = this.f11540c0.mo11079a(bVar3.f8224a);
                if (C2832b.m9308a(bVar2.mo8864b(), 2)) {
                    m12791a(a3);
                } else if (a3 == null) {
                    m12780a(bVar3);
                } else {
                    m12792a(a3, bVar2);
                }
            }
        }
        C7707a.m18759a();
    }

    /* renamed from: a */
    public /* synthetic */ void mo11344a(Pair pair) throws Exception {
        List list = (List) pair.first;
        Boolean bool = (Boolean) pair.second;
        if (list.size() == 0) {
            C5462f fVar = this.f11511B0;
            if (fVar != null) {
                fVar.mo10659a();
                this.f11511B0 = null;
                return;
            }
        }
        if (list.size() > 0) {
            int a = C0540a.m2536a((Context) mo9304A(), bool.booleanValue() ? R.color.blue_light : R.color.blue_black);
            C5462f fVar2 = this.f11511B0;
            if (fVar2 == null) {
                Map map = this.f11532U;
                C5463g gVar = new C5463g();
                gVar.mo13077a(list);
                gVar.mo13075a((float) C3200e0.m10183a((Context) mo9304A(), 10));
                gVar.mo13076a(a);
                this.f11511B0 = map.addPolyline(gVar);
                return;
            }
            fVar2.mo10662a(list);
            this.f11511B0.mo10660a(a);
        }
    }

    /* renamed from: a */
    public /* synthetic */ void mo11350a(C4062a aVar) throws Exception {
        if ((aVar.mo10730a() & 450) != 0) {
            m12766M();
        }
    }

    /* renamed from: a */
    public /* synthetic */ ObservableSource mo11340a(Long l) throws Exception {
        return ((C2718k5) this.f11549l0.get()).mo8792c().mo36487e(1);
    }

    /* renamed from: a */
    static /* synthetic */ boolean m12801a(C2896p pVar) throws Exception {
        return pVar.mo8979d() && pVar.f8215s > 0.0f;
    }

    /* renamed from: a */
    private C4167b0 m12778a(C4167b0 b0Var, C2896p pVar) {
        C4171c0 c0Var;
        if (!(b0Var != null)) {
            b0Var = new C4167b0(mo23920b(), pVar);
            this.f11539b0.mo10872a(b0Var);
        } else {
            b0Var.mo11032a(pVar, 0, true);
        }
        int i = pVar.f8216t;
        if (i == -1) {
            c0Var = null;
        } else {
            c0Var = this.f11540c0.mo11079a(i);
        }
        if (c0Var != b0Var.mo11026Q()) {
            if (b0Var.mo11026Q() != null) {
                b0Var.mo11026Q().mo11068a((C4178e0) b0Var);
            }
            b0Var.mo11035a(c0Var);
            if (c0Var != null) {
                C2879d0 d0Var = pVar.f8198b;
                if (d0Var != null) {
                    c0Var.mo11067a((C4178e0) b0Var, d0Var);
                }
            }
        }
        return b0Var;
    }

    /* renamed from: a */
    private void m12790a(C4167b0 b0Var) {
        if (b0Var != null) {
            b0Var.mo11118s();
            if (b0Var.mo11026Q() != null) {
                b0Var.mo11026Q().mo11068a((C4178e0) b0Var);
            }
            this.f11539b0.mo10874b(b0Var);
        }
    }

    /* renamed from: a */
    private void m12791a(C4171c0 c0Var) {
        if (c0Var != null) {
            c0Var.mo11118s();
            this.f11540c0.mo11083b(c0Var);
            for (C4178e0 e0Var : c0Var.mo11064N()) {
                if (e0Var instanceof C4167b0) {
                    C4167b0 b0Var = (C4167b0) e0Var;
                    if (b0Var.mo11026Q() == c0Var) {
                        b0Var.mo11035a((C4171c0) null);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private C4171c0 m12780a(C2900b bVar) {
        C4171c0 c0Var = new C4171c0(mo23920b(), bVar);
        this.f11540c0.mo11081a(c0Var);
        Iterator it = bVar.f8240l.iterator();
        while (it.hasNext()) {
            C2896p pVar = (C2896p) it.next();
            if (pVar.f8198b != null) {
                m12793a(c0Var, pVar);
            }
        }
        if (bVar.f8227d) {
            C2907v b = ((MeUserManager) this.f11550m0.get()).mo8756b();
            c0Var.mo11067a((C4178e0) this.f11538a0.mo11236e(), b.f8250a);
            c0Var.mo11074m(b.f8258i);
        }
        return c0Var;
    }

    /* renamed from: a */
    private void m12792a(C4171c0 c0Var, C2832b<C2900b> bVar) {
        c0Var.mo11066a(bVar.mo8866c(), bVar.mo8864b());
        if (C2832b.m9308a(bVar.mo8864b(), 4)) {
            Iterator it = bVar.mo8860a().iterator();
            while (it.hasNext()) {
                C2896p pVar = (C2896p) it.next();
                if (pVar.f8198b != null) {
                    m12793a(c0Var, pVar);
                }
            }
        }
        if (C2832b.m9308a(bVar.mo8864b(), 8)) {
            Iterator it2 = bVar.mo8867d().iterator();
            while (it2.hasNext()) {
                m12810b(c0Var, (C2896p) it2.next());
            }
        }
        if (C2832b.m9308a(bVar.mo8864b(), 32)) {
            C2907v b = ((MeUserManager) this.f11550m0.get()).mo8756b();
            C2879d0 d0Var = b.f8250a;
            if (((C2900b) bVar.mo8866c()).f8227d) {
                c0Var.mo11067a((C4178e0) this.f11538a0.mo11236e(), d0Var);
                c0Var.mo11074m(b.f8258i);
                return;
            }
            c0Var.mo11068a((C4178e0) this.f11538a0.mo11236e());
            c0Var.mo11074m(false);
        }
    }

    /* renamed from: a */
    private void m12793a(C4171c0 c0Var, C2896p pVar) {
        C4167b0 b0Var = (C4167b0) this.f11539b0.mo10900a(pVar.f8197a);
        if (b0Var == null) {
            b0Var = m12778a((C4167b0) null, pVar);
        }
        b0Var.mo11035a(c0Var);
        c0Var.mo11067a((C4178e0) b0Var, pVar.f8198b);
    }

    /* renamed from: a */
    public void mo11343a(int i, int i2, int i3, int i4) {
        this.f11532U.setMapPadding(i, i2, i3, i4);
        this.f11533V.mo10921a(i, i2, i3, i4);
    }

    /* renamed from: a */
    public void mo11345a(C2458b bVar) {
        this.f11533V.mo10922a(bVar);
        ((C2741m5) this.f11553p0.get()).mo8806a(bVar);
        ((C4031m1) this.f11552o0.get()).mo10678a(bVar);
        this.f11544g0.setFocusMode(bVar);
        this.f11547j0.mo10747a(bVar);
        this.f11543f0.mo10778a(bVar);
        C3896a1.m11470r().mo10499a(C2464g.AUTO);
        C3896a1.m11470r().mo10508b().onNext(bVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public C4178e0 m12782a(C5459d dVar, double d) {
        return m12783a(dVar, this.f11541d0.getAttachedMarkers(), true, d);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0016, code lost:
        if (((double) r9.mo10738a()) <= r10) goto L_0x001a;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private app.zenly.locator.map.marker.C4178e0 m12783a(app.zenly.locator.p143s.p150n.C5459d r7, java.util.List<app.zenly.locator.map.marker.C4178e0> r8, boolean r9, double r10) {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
            if (r9 == 0) goto L_0x0019
            app.zenly.locator.map.j1.b r9 = new app.zenly.locator.map.j1.b
            app.zenly.locator.map.marker.o0 r2 = r6.f11538a0
            app.zenly.locator.map.marker.l0 r2 = r2.mo11235d()
            r9.<init>(r2, r7, r0)
            float r2 = r9.mo10738a()
            double r2 = (double) r2
            int r4 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r4 > 0) goto L_0x0019
            goto L_0x001a
        L_0x0019:
            r9 = r1
        L_0x001a:
            java.util.Iterator r8 = r8.iterator()
        L_0x001e:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L_0x004e
            java.lang.Object r2 = r8.next()
            app.zenly.locator.map.marker.e0 r2 = (app.zenly.locator.map.marker.C4178e0) r2
            boolean r3 = r2.mo11019A()
            if (r3 == 0) goto L_0x001e
            boolean r3 = r2.mo11020B()
            if (r3 == 0) goto L_0x001e
            app.zenly.locator.map.j1.b r3 = new app.zenly.locator.map.j1.b
            r3.<init>(r2, r7, r0)
            float r2 = r3.mo10738a()
            double r4 = (double) r2
            int r2 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r2 > 0) goto L_0x001e
            if (r9 == 0) goto L_0x004c
            int r2 = r3.compareTo(r9)
            if (r2 >= 0) goto L_0x001e
        L_0x004c:
            r9 = r3
            goto L_0x001e
        L_0x004e:
            if (r9 == 0) goto L_0x0054
            app.zenly.locator.map.marker.e0 r1 = r9.mo10740b()
        L_0x0054:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.map.C4303u0.m12783a(app.zenly.locator.s.n.d, java.util.List, boolean, double):app.zenly.locator.map.marker.e0");
    }

    /* renamed from: a */
    public boolean mo11360a(String str, boolean z, int i) {
        C4178e0 e0Var;
        if (TextUtils.equals(this.f11562y0, str)) {
            return true;
        }
        this.f11562y0 = str;
        if (this.f11559v0) {
            mo11372h(false);
        }
        if (TextUtils.equals(str, C5447b.m15477d(C5448c.m15478a()))) {
            e0Var = this.f11538a0.mo11236e();
        } else {
            C4178e0 a = this.f11539b0.mo10900a(str);
            if (a == null || !a.mo11019A()) {
                C2896p a2 = ((C2718k5) this.f11549l0.get()).mo8779a(str);
                if (a2 != null && a2.mo8979d()) {
                    e0Var = m12778a((C4167b0) a, a2);
                }
            }
            e0Var = a;
        }
        if (e0Var == null || !e0Var.mo11019A()) {
            this.f11533V.mo10944d(z);
            this.f11562y0 = null;
            return false;
        }
        this.f11533V.mo10932a(e0Var, z, i);
        return true;
    }

    /* renamed from: a */
    public void mo11357a(List<String> list, boolean z) {
        if (this.f11559v0) {
            mo11372h(false);
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (TextUtils.equals(str, C5447b.m15477d(C5448c.m15478a()))) {
                arrayList.add(this.f11538a0.mo11236e());
            } else {
                C4167b0 b0Var = (C4167b0) this.f11539b0.mo10900a(str);
                if (b0Var != null) {
                    arrayList.add(b0Var);
                }
            }
        }
        this.f11533V.mo10933a((List<C4178e0>) arrayList, z);
    }

    /* renamed from: a */
    public boolean mo11359a(int i, boolean z) {
        if (i == this.f11563z0) {
            return true;
        }
        C4171c0 a = i != -1 ? this.f11540c0.mo11079a(i) : null;
        if (a != null) {
            this.f11533V.mo10930a((C4178e0) a);
            return true;
        }
        mo11358a(z, false);
        return false;
    }

    /* renamed from: a */
    public void mo11358a(boolean z, boolean z2) {
        m12827f(z, z2);
        m12822d(z, z2);
        m12825e(z, z2);
    }

    /* renamed from: a */
    public C12279e<Boolean> mo11342a(C2879d0[] d0VarArr, float f, int i) {
        C2907v b = ((MeUserManager) this.f11550m0.get()).mo8756b();
        ArrayList arrayList = new ArrayList();
        for (C2879d0 d0Var : d0VarArr) {
            if (TextUtils.equals(d0Var.mo8945g(), b.f8250a.mo8945g())) {
                C5459d dVar = b.f8252c;
                if (dVar != null) {
                    arrayList.add(new C5459d(dVar.mo13060b(), dVar.mo13062c()));
                }
            } else {
                C5459d dVar2 = ((C2718k5) this.f11549l0.get()).mo8779a(d0Var.mo8945g()).f8199c;
                if (dVar2 != null) {
                    arrayList.add(dVar2);
                }
            }
        }
        C5460e a = C5460e.m15530a((List<C5459d>) arrayList);
        C5458c e = new C5458c().mo10961e((double) f);
        e.mo13052b(a.mo13067a().mo13060b());
        e.mo13053c(a.mo13067a().mo13062c());
        return m12785a(e, i);
    }

    /* renamed from: a */
    public C12279e<Boolean> mo11341a(C5459d dVar, float f, int i) {
        C5458c e = new C5458c().mo10961e((double) f);
        e.mo13052b(dVar.mo13060b());
        e.mo13053c(dVar.mo13062c());
        return m12785a(e, i);
    }

    /* renamed from: a */
    private C12279e<Boolean> m12785a(C5458c cVar, int i) {
        if (this.f11533V.mo10945e()) {
            this.f11533V.mo10942c(false);
        }
        if (this.f11533V.mo10946f()) {
            this.f11533V.mo10944d(false);
        }
        if (this.f11559v0) {
            mo11372h(false);
        }
        C12785a u = C12785a.m33447u();
        C4408z zVar = new C4408z(u);
        if (i > 0) {
            this.f11532U.animateCamera(cVar, i, zVar);
        } else {
            this.f11532U.moveCamera(cVar, zVar);
        }
        return u;
    }

    /* renamed from: a */
    static /* synthetic */ void m12799a(C12785a aVar, boolean z) {
        aVar.onNext(Boolean.valueOf(z));
        aVar.onComplete();
    }

    /* renamed from: a */
    public void mo11346a(C2462e eVar) {
        this.f11512C0 = eVar;
        C4175d0 d0Var = this.f11540c0;
        if (d0Var != null) {
            d0Var.mo11080a(eVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m12798a(C5460e eVar) {
        mo11356a(eVar, 300, false);
    }

    /* renamed from: a */
    public void mo11356a(C5460e eVar, long j, boolean z) {
        this.f11533V.mo10938b(false);
        C5458c a = C4274b.m12687a(this.f11532U, eVar, 0);
        a.mo13049a(0.0d);
        a.mo13054d(0.0d);
        this.f11532U.animateCamera(a, (int) j, new C3940f0(this, z));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m12786a(C2459c cVar) {
        if (cVar.f7400a == C2466a.SWITCH) {
            this.f11563z0 = -1;
        }
        if (cVar.f7400a != C2466a.RESELECT || !cVar.f7380c.f8222z.mo8994c()) {
            m12809b(cVar);
            NavigationContract navigationContract = this.f11531T;
            if (navigationContract != null) {
                navigationContract.onMapFriendSelection(cVar);
            }
            return;
        }
        if (C3896a1.m11470r().mo10513d().mo36963s() != C2464g.MARKER) {
            C3896a1.m11470r().mo10499a(C2464g.MARKER);
        } else {
            C3896a1.m11470r().mo10499a(C2464g.AUTO);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m12787a(C2460d dVar) {
        ((MeUserManager) this.f11550m0.get()).mo8751a(dVar);
        NavigationContract navigationContract = this.f11531T;
        if (navigationContract != null) {
            navigationContract.onMapFriendsSelection(dVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m12788a(C2463f fVar) {
        if (fVar.f7400a == C2466a.SWITCH) {
            String str = this.f11562y0;
            if (str != null) {
                if (TextUtils.equals(str, C5447b.m15477d(C5448c.m15478a()))) {
                    this.f11562y0 = null;
                } else {
                    m12809b(new C2459c(C2466a.UNSELECT, ((C4167b0) this.f11539b0.mo10900a(this.f11562y0)).mo11025P(), fVar.f7401b));
                }
            }
        }
        int i = C4305b.f11568d[fVar.f7400a.ordinal()];
        if (i == 1 || i == 2) {
            this.f11563z0 = fVar.f7391c;
        } else if (i == 3 || i == 4) {
            this.f11563z0 = -1;
        }
        NavigationContract navigationContract = this.f11531T;
        if (navigationContract != null) {
            navigationContract.onMapGatheringSelection(fVar);
        }
    }

    /* renamed from: a */
    public void mo11354a(C4187h0 h0Var) {
        h0Var.setMap(this.f11532U);
        this.f11533V.mo10926a(h0Var);
        this.f11532U.addOverlay(h0Var);
    }

    /* renamed from: a */
    private void m12789a(FocusedMarkerOverlay focusedMarkerOverlay) {
        focusedMarkerOverlay.setMap(this.f11532U);
        this.f11532U.addOverlay(focusedMarkerOverlay);
    }
}
