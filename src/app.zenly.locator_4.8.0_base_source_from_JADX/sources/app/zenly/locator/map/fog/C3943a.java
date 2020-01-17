package app.zenly.locator.map.fog;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.transition.ChangeBounds;
import app.zenly.android.base.widget.LinearLayout;
import app.zenly.android.feature.base.model.Avatar;
import app.zenly.android.feature.base.model.AvatarLoader;
import app.zenly.android.feature.base.model.AvatarLoader.Request;
import app.zenly.locator.R;
import app.zenly.locator.core.contracts.NavigationContract;
import app.zenly.locator.core.contracts.NavigationContract.C2467a;
import app.zenly.locator.core.glide.C2477e;
import app.zenly.locator.core.invitations.C2538c0;
import app.zenly.locator.core.manager.p069di.C2666b;
import app.zenly.locator.core.models.C2884f;
import app.zenly.locator.core.p072ui.controller.ZenlyController;
import app.zenly.locator.core.p072ui.view.C3137b;
import app.zenly.locator.core.p072ui.view.C3147g;
import app.zenly.locator.core.p072ui.view.C3150h;
import app.zenly.locator.core.p072ui.view.StatefulLayout;
import app.zenly.locator.core.store.C2931a;
import app.zenly.locator.core.store.C3027g;
import app.zenly.locator.core.store.p071di.C3015a;
import app.zenly.locator.core.util.C3220i;
import app.zenly.locator.core.widget.C3275i;
import app.zenly.locator.map.C3896a1;
import app.zenly.locator.map.fog.C3968d.C3969a;
import app.zenly.locator.p143s.C5343a;
import app.zenly.locator.p143s.p148l.C5448c;
import app.zenly.locator.p143s.p160v.p161b.C5521c;
import app.zenly.locator.p143s.p160v.p161b.C5540g;
import app.zenly.locator.p143s.p162w.C5562a;
import com.airbnb.lottie.LottieAnimationView;
import com.bluelinelabs.conductor.C8819d;
import com.bluelinelabs.conductor.C8829e;
import com.bluelinelabs.conductor.ControllerChangeHandler;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.C12956q;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12933k;
import p213co.znly.models.C7339i;
import p213co.znly.models.UserProto$User;
import p250f.p251a.p252a.p253a.p254d.C7657c;
import p250f.p251a.p252a.p253a.p256f.p257a.C7674a;
import p250f.p251a.p252a.p263b.p264a.p265d.C7697b;

/* renamed from: app.zenly.locator.map.fog.a */
public final class C3943a extends ZenlyController implements FogContract {

    /* renamed from: p0 */
    public static final C3944a f10416p0 = new C3944a(null);

    /* renamed from: P */
    private final C7339i f10417P;

    /* renamed from: Q */
    private final String f10418Q;

    /* renamed from: R */
    private C3960c f10419R;

    /* renamed from: S */
    private ConstraintLayout f10420S;

    /* renamed from: T */
    private C3147g f10421T;

    /* renamed from: U */
    private ImageView f10422U;

    /* renamed from: V */
    private StatefulLayout f10423V;

    /* renamed from: W */
    private TextView f10424W;

    /* renamed from: X */
    private StatefulLayout f10425X;

    /* renamed from: Y */
    private TextView f10426Y;

    /* renamed from: Z */
    private TextView f10427Z;

    /* renamed from: a0 */
    private View f10428a0;

    /* renamed from: b0 */
    private View f10429b0;

    /* renamed from: c0 */
    private TextView f10430c0;

    /* renamed from: d0 */
    private ProgressBar f10431d0;

    /* renamed from: e0 */
    private LottieAnimationView f10432e0;

    /* renamed from: f0 */
    private LottieAnimationView f10433f0;

    /* renamed from: g0 */
    private TextView f10434g0;

    /* renamed from: h0 */
    private StatefulLayout f10435h0;

    /* renamed from: i0 */
    private TextView f10436i0;

    /* renamed from: j0 */
    private StatefulLayout f10437j0;

    /* renamed from: k0 */
    private LinearLayout f10438k0;

    /* renamed from: l0 */
    private String f10439l0;

    /* renamed from: m0 */
    private AvatarLoader f10440m0;

    /* renamed from: n0 */
    private NavigationContract f10441n0;
    /* access modifiers changed from: private */

    /* renamed from: o0 */
    public boolean f10442o0;

    /* renamed from: app.zenly.locator.map.fog.a$a */
    public static final class C3944a {
        private C3944a() {
        }

        /* renamed from: a */
        public final FogContract mo10604a(C7339i iVar) {
            C12932j.m33818b(iVar, "contact");
            Bundle bundle = new Bundle();
            bundle.putByteArray("args:contact", iVar.toByteArray());
            return new C3943a(bundle);
        }

        public /* synthetic */ C3944a(C12928f fVar) {
            this();
        }

        /* renamed from: a */
        public final FogContract mo10605a(String str) {
            C12932j.m33818b(str, "userUuid");
            Bundle bundle = new Bundle();
            bundle.putString("args:user_uuid", str);
            return new C3943a(bundle);
        }
    }

    /* renamed from: app.zenly.locator.map.fog.a$b */
    static final class C3945b implements Runnable {

        /* renamed from: e */
        final /* synthetic */ LottieAnimationView f10443e;

        /* renamed from: f */
        final /* synthetic */ Function0 f10444f;

        C3945b(LottieAnimationView lottieAnimationView, float f, Function0 function0) {
            this.f10443e = lottieAnimationView;
            this.f10444f = function0;
        }

        /* JADX WARNING: type inference failed for: r1v1 */
        /* JADX WARNING: type inference failed for: r2v1, types: [app.zenly.locator.map.fog.b] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r4 = this;
                com.airbnb.lottie.LottieAnimationView r0 = r4.f10443e
                kotlin.jvm.functions.Function0 r1 = r4.f10444f
                if (r1 == 0) goto L_0x000c
                app.zenly.locator.map.fog.b r2 = new app.zenly.locator.map.fog.b
                r2.<init>(r1)
                r1 = r2
            L_0x000c:
                java.lang.Runnable r1 = (java.lang.Runnable) r1
                r2 = 1000(0x3e8, double:4.94E-321)
                r0.postDelayed(r1, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.map.fog.C3943a.C3945b.run():void");
        }
    }

    /* renamed from: app.zenly.locator.map.fog.a$c */
    static final class C3946c extends C12933k implements Function0<C12956q> {

        /* renamed from: f */
        public static final C3946c f10445f = new C3946c();

        C3946c() {
            super(0);
        }

        public final void invoke() {
        }
    }

    /* renamed from: app.zenly.locator.map.fog.a$d */
    static final class C3947d extends C12933k implements Function0<C12956q> {

        /* renamed from: f */
        final /* synthetic */ C3943a f10446f;

        /* renamed from: g */
        final /* synthetic */ boolean f10447g;

        C3947d(C3943a aVar, boolean z) {
            this.f10446f = aVar;
            this.f10447g = z;
            super(0);
        }

        public final void invoke() {
            if (this.f10447g) {
                C3943a.m11564h(this.f10446f).mo2765a(C3943a.m11560e(this.f10446f).getId(), 3, 0, 3);
                C3943a.m11564h(this.f10446f).mo2765a(C3943a.m11560e(this.f10446f).getId(), 4, 0, 4);
                return;
            }
            C3943a.m11564h(this.f10446f).mo2765a(C3943a.m11560e(this.f10446f).getId(), 3, C3943a.m11551b(this.f10446f).getId(), 3);
            C3943a.m11564h(this.f10446f).mo2765a(C3943a.m11560e(this.f10446f).getId(), 4, C3943a.m11551b(this.f10446f).getId(), 4);
        }
    }

    /* renamed from: app.zenly.locator.map.fog.a$e */
    static final class C3948e extends C12933k implements Function0<C12956q> {

        /* renamed from: f */
        final /* synthetic */ C3943a f10448f;

        /* renamed from: g */
        final /* synthetic */ boolean f10449g;

        /* renamed from: h */
        final /* synthetic */ boolean f10450h;

        C3948e(C3943a aVar, boolean z, boolean z2) {
            this.f10448f = aVar;
            this.f10449g = z;
            this.f10450h = z2;
            super(0);
        }

        public final void invoke() {
            int i = 0;
            C3943a.m11564h(this.f10448f).mo2785d(C3943a.m11563g(this.f10448f).getId(), 0);
            C3943a.m11564h(this.f10448f).mo2785d(C3943a.m11555c(this.f10448f).getId(), this.f10449g ? 0 : 8);
            C3943a.m11564h(this.f10448f).mo2785d(C3943a.m11567k(this.f10448f).getId(), this.f10450h ? 0 : 8);
            float f = 1.0f;
            C3943a.m11564h(this.f10448f).mo2776b(C3943a.m11567k(this.f10448f).getId(), this.f10450h ? 1.0f : 0.0f);
            C3147g h = C3943a.m11564h(this.f10448f);
            int id = C3943a.m11567k(this.f10448f).getId();
            if (!this.f10450h) {
                f = 0.0f;
            }
            h.mo2781c(id, f);
            TextView f2 = C3943a.m11561f(this.f10448f);
            if (this.f10448f.f10442o0) {
                i = 8;
            }
            f2.setVisibility(i);
        }
    }

    /* renamed from: app.zenly.locator.map.fog.a$f */
    static final class C3949f implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C3943a f10451e;

        /* renamed from: f */
        final /* synthetic */ C7339i f10452f;

        C3949f(C3943a aVar, C7339i iVar) {
            this.f10451e = aVar;
            this.f10452f = iVar;
        }

        public final void onClick(View view) {
            C3960c j = C3943a.m11566j(this.f10451e);
            C2538c0 a = C2538c0.m8837a(this.f10451e.mo23920b());
            C12932j.m33815a((Object) a, "InviteManager.from(activity)");
            Context context = C3943a.m11561f(this.f10451e).getContext();
            C12932j.m33815a((Object) context, "actionText.context");
            j.mo10616a(a, context, this.f10452f);
        }
    }

    /* renamed from: app.zenly.locator.map.fog.a$g */
    static final class C3950g implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C3943a f10453e;

        /* renamed from: f */
        final /* synthetic */ C3969a f10454f;

        C3950g(C3943a aVar, C3969a aVar2) {
            this.f10453e = aVar;
            this.f10454f = aVar2;
        }

        public final void onClick(View view) {
            this.f10453e.m11543a(C2467a.OTHER, this.f10454f.mo10634e());
        }
    }

    /* renamed from: app.zenly.locator.map.fog.a$h */
    static final class C3951h implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C3943a f10455e;

        /* renamed from: f */
        final /* synthetic */ C3969a f10456f;

        C3951h(C3943a aVar, C3969a aVar2) {
            this.f10455e = aVar;
            this.f10456f = aVar2;
        }

        public final void onClick(View view) {
            this.f10455e.m11543a(C2467a.MARKER, this.f10456f.mo10634e());
        }
    }

    /* renamed from: app.zenly.locator.map.fog.a$i */
    static final class C3952i implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C3943a f10457e;

        /* renamed from: f */
        final /* synthetic */ C3969a f10458f;

        C3952i(C3943a aVar, C3969a aVar2) {
            this.f10457e = aVar;
            this.f10458f = aVar2;
        }

        public final void onClick(View view) {
            C3960c j = C3943a.m11566j(this.f10457e);
            C2538c0 a = C2538c0.m8837a(this.f10457e.mo23920b());
            C12932j.m33815a((Object) a, "InviteManager.from(activity)");
            Context context = C3943a.m11561f(this.f10457e).getContext();
            C12932j.m33815a((Object) context, "actionText.context");
            j.mo10615a(a, context, this.f10458f.mo10634e(), this.f10458f.mo10631b(), this.f10458f.mo10633d().size());
        }
    }

    /* renamed from: app.zenly.locator.map.fog.a$j */
    static final class C3953j extends C12933k implements Function0<C12956q> {

        /* renamed from: f */
        public static final C3953j f10459f = new C3953j();

        C3953j() {
            super(0);
        }

        public final void invoke() {
        }
    }

    /* renamed from: app.zenly.locator.map.fog.a$k */
    static final class C3954k extends C12933k implements Function0<C12956q> {

        /* renamed from: f */
        final /* synthetic */ C3943a f10460f;

        /* renamed from: g */
        final /* synthetic */ Function0 f10461g;

        C3954k(C3943a aVar, Function0 function0) {
            this.f10460f = aVar;
            this.f10461g = function0;
            super(0);
        }

        public final void invoke() {
            if (!this.f10460f.f10442o0) {
                C7697b.m18729a(C3943a.m11561f(this.f10460f), 100, this.f10461g);
            } else {
                this.f10461g.invoke();
            }
        }
    }

    /* renamed from: app.zenly.locator.map.fog.a$l */
    static final class C3955l implements OnTouchListener {

        /* renamed from: e */
        final /* synthetic */ C3943a f10462e;

        C3955l(C3943a aVar) {
            this.f10462e = aVar;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            this.f10462e.m11538F();
            return true;
        }
    }

    /* renamed from: app.zenly.locator.map.fog.a$m */
    static final class C3956m extends C12933k implements Function0<C12956q> {

        /* renamed from: f */
        final /* synthetic */ C3943a f10463f;

        /* renamed from: app.zenly.locator.map.fog.a$m$a */
        static final class C3957a extends C12933k implements Function0<C12956q> {

            /* renamed from: f */
            final /* synthetic */ C3956m f10464f;

            C3957a(C3956m mVar) {
                this.f10464f = mVar;
                super(0);
            }

            public final void invoke() {
                C3943a.m11548a(this.f10464f.f10463f, false, null, 2, null);
                this.f10464f.f10463f.m11537E();
            }
        }

        C3956m(C3943a aVar) {
            this.f10463f = aVar;
            super(0);
        }

        public final void invoke() {
            this.f10463f.m11550a(true, (Function0<C12956q>) new C3957a<C12956q>(this));
        }
    }

    /* renamed from: app.zenly.locator.map.fog.a$n */
    static final class C3958n extends C12933k implements Function0<C12956q> {

        /* renamed from: f */
        final /* synthetic */ C3943a f10465f;

        /* renamed from: g */
        final /* synthetic */ Function0 f10466g;

        C3958n(C3943a aVar, Function0 function0) {
            this.f10465f = aVar;
            this.f10466g = function0;
            super(0);
        }

        public final void invoke() {
            C7697b.m18729a(C3943a.m11558d(this.f10465f), 100, this.f10466g);
        }
    }

    public C3943a(Bundle bundle) {
        C7339i iVar;
        C12932j.m33818b(bundle, "args");
        super(bundle);
        try {
            iVar = C7339i.parseFrom(bundle.getByteArray("args:contact"));
        } catch (Exception unused) {
            iVar = null;
        }
        this.f10417P = iVar;
        this.f10418Q = bundle.getString("args:user_uuid", null);
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public final void m11537E() {
        TextView textView = this.f10424W;
        if (textView != null) {
            CharSequence text = textView.getText();
            C12932j.m33815a((Object) text, "title.text");
            boolean z = true;
            boolean z2 = text.length() > 0;
            C3960c cVar = this.f10419R;
            if (cVar != null) {
                boolean b = cVar.mo10617b();
                TextView textView2 = this.f10427Z;
                if (textView2 != null) {
                    CharSequence text2 = textView2.getText();
                    C12932j.m33815a((Object) text2, "section.text");
                    boolean z3 = text2.length() > 0;
                    TextView textView3 = this.f10430c0;
                    if (textView3 != null) {
                        CharSequence text3 = textView3.getText();
                        C12932j.m33815a((Object) text3, "actionText.text");
                        boolean z4 = (text3.length() > 0) || this.f10442o0;
                        TextView textView4 = this.f10436i0;
                        if (textView4 != null) {
                            CharSequence text4 = textView4.getText();
                            C12932j.m33815a((Object) text4, "body.text");
                            boolean z5 = (text4.length() > 0) && !this.f10442o0;
                            LinearLayout linearLayout = this.f10438k0;
                            if (linearLayout != null) {
                                if (linearLayout.getChildCount() <= 0 || this.f10417P != null || this.f10442o0) {
                                    z = false;
                                }
                                C3147g gVar = this.f10421T;
                                String str = "constraintSet";
                                if (gVar != null) {
                                    StatefulLayout statefulLayout = this.f10423V;
                                    if (statefulLayout != null) {
                                        gVar.mo9480a(statefulLayout, z2);
                                        C3147g gVar2 = this.f10421T;
                                        if (gVar2 != null) {
                                            StatefulLayout statefulLayout2 = this.f10425X;
                                            if (statefulLayout2 != null) {
                                                gVar2.mo9480a(statefulLayout2, b);
                                                C3147g gVar3 = this.f10421T;
                                                if (gVar3 != null) {
                                                    StatefulLayout statefulLayout3 = this.f10435h0;
                                                    if (statefulLayout3 != null) {
                                                        gVar3.mo9480a(statefulLayout3, z5);
                                                        C3147g gVar4 = this.f10421T;
                                                        if (gVar4 != null) {
                                                            StatefulLayout statefulLayout4 = this.f10437j0;
                                                            if (statefulLayout4 != null) {
                                                                gVar4.mo9480a(statefulLayout4, z);
                                                                C3147g gVar5 = this.f10421T;
                                                                if (gVar5 != null) {
                                                                    gVar5.mo9481a(Long.valueOf(500), (Function0<C12956q>) new C3948e<C12956q>(this, z4, z3));
                                                                } else {
                                                                    C12932j.m33820c(str);
                                                                    throw null;
                                                                }
                                                            } else {
                                                                C12932j.m33820c("friendsAvatarsLayout");
                                                                throw null;
                                                            }
                                                        } else {
                                                            C12932j.m33820c(str);
                                                            throw null;
                                                        }
                                                    } else {
                                                        C12932j.m33820c("bodyLayout");
                                                        throw null;
                                                    }
                                                } else {
                                                    C12932j.m33820c(str);
                                                    throw null;
                                                }
                                            } else {
                                                C12932j.m33820c("subtitleLayout");
                                                throw null;
                                            }
                                        } else {
                                            C12932j.m33820c(str);
                                            throw null;
                                        }
                                    } else {
                                        C12932j.m33820c("titleLayout");
                                        throw null;
                                    }
                                } else {
                                    C12932j.m33820c(str);
                                    throw null;
                                }
                            } else {
                                C12932j.m33820c("friendsAvatars");
                                throw null;
                            }
                        } else {
                            C12932j.m33820c("body");
                            throw null;
                        }
                    } else {
                        C12932j.m33820c("actionText");
                        throw null;
                    }
                } else {
                    C12932j.m33820c("section");
                    throw null;
                }
            } else {
                C12932j.m33820c("presenter");
                throw null;
            }
        } else {
            C12932j.m33820c("title");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public final void m11538F() {
        NavigationContract navigationContract = this.f10441n0;
        if (navigationContract != null) {
            navigationContract.onFogUserClickOutside();
        }
    }

    /* renamed from: G */
    private final void m11539G() {
        TextView textView = this.f10427Z;
        String str = "section";
        if (textView == null) {
            C12932j.m33820c(str);
            throw null;
        } else if (textView != null) {
            textView.setText(textView.getContext().getString(R.string.fogview_trivia_location, new Object[]{this.f10439l0}));
        } else {
            C12932j.m33820c(str);
            throw null;
        }
    }

    /* renamed from: H */
    private final void m11540H() {
        TextView textView = this.f10424W;
        if (textView != null) {
            textView.setText(this.f10439l0);
            C3147g gVar = this.f10421T;
            if (gVar != null) {
                StatefulLayout statefulLayout = this.f10423V;
                if (statefulLayout != null) {
                    gVar.mo9483b(statefulLayout);
                } else {
                    C12932j.m33820c("titleLayout");
                    throw null;
                }
            } else {
                C12932j.m33820c("constraintSet");
                throw null;
            }
        } else {
            C12932j.m33820c("title");
            throw null;
        }
    }

    /* renamed from: b */
    public static final /* synthetic */ View m11551b(C3943a aVar) {
        View view = aVar.f10428a0;
        if (view != null) {
            return view;
        }
        C12932j.m33820c("actionContainer");
        throw null;
    }

    /* renamed from: b */
    public static final FogContract m11552b(C7339i iVar) {
        return f10416p0.mo10604a(iVar);
    }

    /* renamed from: c */
    public static final /* synthetic */ View m11555c(C3943a aVar) {
        View view = aVar.f10429b0;
        if (view != null) {
            return view;
        }
        C12932j.m33820c("actionLayout");
        throw null;
    }

    /* renamed from: d */
    public static final /* synthetic */ ProgressBar m11558d(C3943a aVar) {
        ProgressBar progressBar = aVar.f10431d0;
        if (progressBar != null) {
            return progressBar;
        }
        C12932j.m33820c("actionProgress");
        throw null;
    }

    /* renamed from: e */
    public static final FogContract m11559e(String str) {
        return f10416p0.mo10605a(str);
    }

    /* renamed from: e */
    public static final /* synthetic */ LottieAnimationView m11560e(C3943a aVar) {
        LottieAnimationView lottieAnimationView = aVar.f10433f0;
        if (lottieAnimationView != null) {
            return lottieAnimationView;
        }
        C12932j.m33820c("actionSuccessAnim");
        throw null;
    }

    /* renamed from: f */
    public static final /* synthetic */ TextView m11561f(C3943a aVar) {
        TextView textView = aVar.f10430c0;
        if (textView != null) {
            return textView;
        }
        C12932j.m33820c("actionText");
        throw null;
    }

    /* renamed from: g */
    public static final /* synthetic */ ImageView m11563g(C3943a aVar) {
        ImageView imageView = aVar.f10422U;
        if (imageView != null) {
            return imageView;
        }
        C12932j.m33820c("avatar");
        throw null;
    }

    /* renamed from: h */
    public static final /* synthetic */ C3147g m11564h(C3943a aVar) {
        C3147g gVar = aVar.f10421T;
        if (gVar != null) {
            return gVar;
        }
        C12932j.m33820c("constraintSet");
        throw null;
    }

    /* renamed from: j */
    public static final /* synthetic */ C3960c m11566j(C3943a aVar) {
        C3960c cVar = aVar.f10419R;
        if (cVar != null) {
            return cVar;
        }
        C12932j.m33820c("presenter");
        throw null;
    }

    /* renamed from: k */
    public static final /* synthetic */ TextView m11567k(C3943a aVar) {
        TextView textView = aVar.f10427Z;
        if (textView != null) {
            return textView;
        }
        C12932j.m33820c("section");
        throw null;
    }

    /* renamed from: B */
    public final void mo7192B() {
        this.f10442o0 = false;
        m11546a(this, null, 1, null);
    }

    /* renamed from: C */
    public final void mo10598C() {
        this.f10442o0 = false;
        m11546a(this, null, 1, null);
    }

    /* renamed from: D */
    public final void mo10599D() {
        this.f10442o0 = true;
        m11562f((String) null);
        m11549a(C12848o.m33640a());
        m11554b((Function0<C12956q>) new C3956m<C12956q>(this));
    }

    public void bumpAvatar() {
    }

    public C7339i getContact() {
        return this.f10417P;
    }

    public String getDisplayName() {
        return this.f10439l0;
    }

    public String getUserUuid() {
        return this.f10418Q;
    }

    public void onWindowInsetsChanged(View view, Rect rect) {
        C12932j.m33818b(view, "view");
        C12932j.m33818b(rect, "insets");
        super.onWindowInsetsChanged(view, rect);
        view.setPadding(rect.left, rect.top, rect.right, view.getPaddingBottom());
    }

    public void setBottomInset(int i) {
        if (mo23949n()) {
            ConstraintLayout constraintLayout = this.f10420S;
            if (constraintLayout != null) {
                float min = 1.0f - Math.min(((float) i) / ((float) constraintLayout.getResources().getDimensionPixelSize(R.dimen.chat_peek_height)), 1.0f);
                View[] viewArr = new View[8];
                StatefulLayout statefulLayout = this.f10425X;
                if (statefulLayout != null) {
                    viewArr[0] = statefulLayout;
                    TextView textView = this.f10427Z;
                    if (textView != null) {
                        viewArr[1] = textView;
                        StatefulLayout statefulLayout2 = this.f10435h0;
                        if (statefulLayout2 != null) {
                            viewArr[2] = statefulLayout2;
                            StatefulLayout statefulLayout3 = this.f10437j0;
                            if (statefulLayout3 != null) {
                                viewArr[3] = statefulLayout3;
                                View view = this.f10429b0;
                                if (view != null) {
                                    viewArr[4] = view;
                                    LottieAnimationView lottieAnimationView = this.f10432e0;
                                    if (lottieAnimationView != null) {
                                        viewArr[5] = lottieAnimationView;
                                        LottieAnimationView lottieAnimationView2 = this.f10433f0;
                                        if (lottieAnimationView2 != null) {
                                            viewArr[6] = lottieAnimationView2;
                                            TextView textView2 = this.f10434g0;
                                            if (textView2 != null) {
                                                viewArr[7] = textView2;
                                                for (View alpha : viewArr) {
                                                    alpha.setAlpha(min);
                                                }
                                                return;
                                            }
                                            C12932j.m33820c("actionSuccessText");
                                            throw null;
                                        }
                                        C12932j.m33820c("actionSuccessAnim");
                                        throw null;
                                    }
                                    C12932j.m33820c("actionSuccessSparklesAnim");
                                    throw null;
                                }
                                C12932j.m33820c("actionLayout");
                                throw null;
                            }
                            C12932j.m33820c("friendsAvatarsLayout");
                            throw null;
                        }
                        C12932j.m33820c("bodyLayout");
                        throw null;
                    }
                    C12932j.m33820c("section");
                    throw null;
                }
                C12932j.m33820c("subtitleLayout");
                throw null;
            }
            C12932j.m33820c("view");
            throw null;
        }
    }

    /* renamed from: f */
    private final void m11562f(String str) {
        TextView textView = this.f10436i0;
        if (textView != null) {
            textView.setText(str);
            C3147g gVar = this.f10421T;
            if (gVar != null) {
                StatefulLayout statefulLayout = this.f10435h0;
                if (statefulLayout != null) {
                    gVar.mo9483b(statefulLayout);
                } else {
                    C12932j.m33820c("bodyLayout");
                    throw null;
                }
            } else {
                C12932j.m33820c("constraintSet");
                throw null;
            }
        } else {
            C12932j.m33820c("body");
            throw null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7052b(View view) {
        C12932j.m33818b(view, "view");
        super.mo7052b(view);
        String str = "null cannot be cast to non-null type app.zenly.locator.core.contracts.NavigationContract";
        if (mo23947l() instanceof NavigationContract) {
            C8819d l = mo23947l();
            if (l != null) {
                this.f10441n0 = (NavigationContract) l;
            } else {
                throw new TypeCastException(str);
            }
        } else if (mo23920b() instanceof NavigationContract) {
            Activity b = mo23920b();
            if (b != null) {
                this.f10441n0 = (NavigationContract) b;
            } else {
                throw new TypeCastException(str);
            }
        }
        LottieAnimationView lottieAnimationView = this.f10432e0;
        String str2 = "actionSuccessSparklesAnim";
        if (lottieAnimationView != null) {
            if (lottieAnimationView.getVisibility() == 0) {
                LottieAnimationView lottieAnimationView2 = this.f10432e0;
                if (lottieAnimationView2 != null) {
                    lottieAnimationView2.mo22807d();
                } else {
                    C12932j.m33820c(str2);
                    throw null;
                }
            }
            C3960c cVar = this.f10419R;
            if (cVar != null) {
                cVar.mo10618c();
                C5562a c = C3896a1.f10317n.mo10527a().mo10511c();
                ImageView imageView = this.f10422U;
                if (imageView != null) {
                    c.mo13172b((View) imageView);
                } else {
                    C12932j.m33820c("avatar");
                    throw null;
                }
            } else {
                C12932j.m33820c("presenter");
                throw null;
            }
        } else {
            C12932j.m33820c(str2);
            throw null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo9309c(ControllerChangeHandler controllerChangeHandler, C8829e eVar) {
        C12932j.m33818b(controllerChangeHandler, "changeHandler");
        C12932j.m33818b(eVar, "changeType");
        super.mo9309c(controllerChangeHandler, eVar);
        if (eVar.f22921e) {
            C3147g gVar = this.f10421T;
            String str = "constraintSet";
            if (gVar != null) {
                StatefulLayout statefulLayout = this.f10423V;
                if (statefulLayout != null) {
                    gVar.mo9479a(statefulLayout);
                    C3147g gVar2 = this.f10421T;
                    if (gVar2 != null) {
                        StatefulLayout statefulLayout2 = this.f10425X;
                        if (statefulLayout2 != null) {
                            gVar2.mo9479a(statefulLayout2);
                            if (this.f10417P == null) {
                                C3147g gVar3 = this.f10421T;
                                if (gVar3 != null) {
                                    StatefulLayout statefulLayout3 = this.f10435h0;
                                    if (statefulLayout3 != null) {
                                        gVar3.mo9479a(statefulLayout3);
                                        C3147g gVar4 = this.f10421T;
                                        if (gVar4 != null) {
                                            StatefulLayout statefulLayout4 = this.f10437j0;
                                            if (statefulLayout4 != null) {
                                                gVar4.mo9479a(statefulLayout4);
                                            } else {
                                                C12932j.m33820c("friendsAvatarsLayout");
                                                throw null;
                                            }
                                        } else {
                                            C12932j.m33820c(str);
                                            throw null;
                                        }
                                    } else {
                                        C12932j.m33820c("bodyLayout");
                                        throw null;
                                    }
                                } else {
                                    C12932j.m33820c(str);
                                    throw null;
                                }
                            }
                            m11537E();
                            return;
                        }
                        C12932j.m33820c("subtitleLayout");
                        throw null;
                    }
                    C12932j.m33820c(str);
                    throw null;
                }
                C12932j.m33820c("titleLayout");
                throw null;
            }
            C12932j.m33820c(str);
            throw null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo7053d(View view) {
        C12932j.m33818b(view, "view");
        C3960c cVar = this.f10419R;
        if (cVar != null) {
            cVar.mo10619d();
            this.f10441n0 = null;
            LottieAnimationView lottieAnimationView = this.f10432e0;
            if (lottieAnimationView != null) {
                lottieAnimationView.mo22797a();
                C5562a c = C3896a1.f10317n.mo10527a().mo10511c();
                ImageView imageView = this.f10422U;
                if (imageView != null) {
                    c.mo13171a((View) imageView);
                    super.mo7053d(view);
                    return;
                }
                C12932j.m33820c("avatar");
                throw null;
            }
            C12932j.m33820c("actionSuccessSparklesAnim");
            throw null;
        }
        C12932j.m33820c("presenter");
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7065a(Context context) {
        C12932j.m33818b(context, "context");
        C2931a provideAlreadyOnZenlyStore = C3015a.m9526a(context).provideAlreadyOnZenlyStore();
        C3027g provideFriendRequestStore = C3015a.m9526a(context).provideFriendRequestStore();
        this.f10419R = new C3960c(this, new C3968d(C5448c.m15478a(), C2666b.m9049a(context).mo8763a(), provideAlreadyOnZenlyStore, provideFriendRequestStore), this.f10417P, this.f10418Q);
    }

    /* renamed from: d */
    public final void mo10603d(String str) {
        C12932j.m33818b(str, "userUuid");
        NavigationContract navigationContract = this.f10441n0;
        if (navigationContract != null) {
            navigationContract.onFogDisplayFriend(str);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo7054a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        C12932j.m33818b(layoutInflater2, "inflater");
        C12932j.m33818b(viewGroup2, "container");
        boolean z = false;
        View inflate = layoutInflater2.inflate(R.layout.controller_fog, viewGroup2, false);
        if (inflate != null) {
            this.f10420S = (ConstraintLayout) inflate;
            ConstraintLayout constraintLayout = this.f10420S;
            String str = "view";
            if (constraintLayout != null) {
                View findViewById = constraintLayout.findViewById(R.id.fog_avatar);
                C12932j.m33815a((Object) findViewById, "view.findViewById(R.id.fog_avatar)");
                this.f10422U = (ImageView) findViewById;
                ConstraintLayout constraintLayout2 = this.f10420S;
                if (constraintLayout2 != null) {
                    View findViewById2 = constraintLayout2.findViewById(R.id.fog_title_layout);
                    C12932j.m33815a((Object) findViewById2, "view.findViewById(R.id.fog_title_layout)");
                    this.f10423V = (StatefulLayout) findViewById2;
                    ConstraintLayout constraintLayout3 = this.f10420S;
                    if (constraintLayout3 != null) {
                        View findViewById3 = constraintLayout3.findViewById(R.id.fog_title);
                        C12932j.m33815a((Object) findViewById3, "view.findViewById(R.id.fog_title)");
                        this.f10424W = (TextView) findViewById3;
                        ConstraintLayout constraintLayout4 = this.f10420S;
                        if (constraintLayout4 != null) {
                            View findViewById4 = constraintLayout4.findViewById(R.id.fog_subtitle_layout);
                            C12932j.m33815a((Object) findViewById4, "view.findViewById(R.id.fog_subtitle_layout)");
                            this.f10425X = (StatefulLayout) findViewById4;
                            ConstraintLayout constraintLayout5 = this.f10420S;
                            if (constraintLayout5 != null) {
                                View findViewById5 = constraintLayout5.findViewById(R.id.fog_subtitle);
                                C12932j.m33815a((Object) findViewById5, "view.findViewById(R.id.fog_subtitle)");
                                this.f10426Y = (TextView) findViewById5;
                                ConstraintLayout constraintLayout6 = this.f10420S;
                                if (constraintLayout6 != null) {
                                    View findViewById6 = constraintLayout6.findViewById(R.id.fog_section);
                                    C12932j.m33815a((Object) findViewById6, "view.findViewById(R.id.fog_section)");
                                    this.f10427Z = (TextView) findViewById6;
                                    ConstraintLayout constraintLayout7 = this.f10420S;
                                    if (constraintLayout7 != null) {
                                        View findViewById7 = constraintLayout7.findViewById(R.id.fog_action_container);
                                        C12932j.m33815a((Object) findViewById7, "view.findViewById(R.id.fog_action_container)");
                                        this.f10428a0 = findViewById7;
                                        ConstraintLayout constraintLayout8 = this.f10420S;
                                        if (constraintLayout8 != null) {
                                            View findViewById8 = constraintLayout8.findViewById(R.id.fog_action_layout);
                                            C12932j.m33815a((Object) findViewById8, "view.findViewById(R.id.fog_action_layout)");
                                            this.f10429b0 = findViewById8;
                                            ConstraintLayout constraintLayout9 = this.f10420S;
                                            if (constraintLayout9 != null) {
                                                View findViewById9 = constraintLayout9.findViewById(R.id.fog_action_text);
                                                C12932j.m33815a((Object) findViewById9, "view.findViewById(R.id.fog_action_text)");
                                                this.f10430c0 = (TextView) findViewById9;
                                                ConstraintLayout constraintLayout10 = this.f10420S;
                                                if (constraintLayout10 != null) {
                                                    View findViewById10 = constraintLayout10.findViewById(R.id.fog_action_progress);
                                                    C12932j.m33815a((Object) findViewById10, "view.findViewById(R.id.fog_action_progress)");
                                                    this.f10431d0 = (ProgressBar) findViewById10;
                                                    ConstraintLayout constraintLayout11 = this.f10420S;
                                                    if (constraintLayout11 != null) {
                                                        View findViewById11 = constraintLayout11.findViewById(R.id.fog_action_success);
                                                        C12932j.m33815a((Object) findViewById11, "view.findViewById(R.id.fog_action_success)");
                                                        this.f10433f0 = (LottieAnimationView) findViewById11;
                                                        ConstraintLayout constraintLayout12 = this.f10420S;
                                                        if (constraintLayout12 != null) {
                                                            View findViewById12 = constraintLayout12.findViewById(R.id.fog_action_success_text);
                                                            C12932j.m33815a((Object) findViewById12, "view.findViewById(R.id.fog_action_success_text)");
                                                            this.f10434g0 = (TextView) findViewById12;
                                                            ConstraintLayout constraintLayout13 = this.f10420S;
                                                            if (constraintLayout13 != null) {
                                                                View findViewById13 = constraintLayout13.findViewById(R.id.fog_action_success_sparkles);
                                                                C12932j.m33815a((Object) findViewById13, "view.findViewById(R.id.f…_action_success_sparkles)");
                                                                this.f10432e0 = (LottieAnimationView) findViewById13;
                                                                ConstraintLayout constraintLayout14 = this.f10420S;
                                                                if (constraintLayout14 != null) {
                                                                    View findViewById14 = constraintLayout14.findViewById(R.id.fog_body_layout);
                                                                    C12932j.m33815a((Object) findViewById14, "view.findViewById(R.id.fog_body_layout)");
                                                                    this.f10435h0 = (StatefulLayout) findViewById14;
                                                                    ConstraintLayout constraintLayout15 = this.f10420S;
                                                                    if (constraintLayout15 != null) {
                                                                        View findViewById15 = constraintLayout15.findViewById(R.id.fog_body);
                                                                        C12932j.m33815a((Object) findViewById15, "view.findViewById(R.id.fog_body)");
                                                                        this.f10436i0 = (TextView) findViewById15;
                                                                        ConstraintLayout constraintLayout16 = this.f10420S;
                                                                        if (constraintLayout16 != null) {
                                                                            View findViewById16 = constraintLayout16.findViewById(R.id.fog_mutual_friends_avatars_layout);
                                                                            C12932j.m33815a((Object) findViewById16, "view.findViewById(R.id.f…l_friends_avatars_layout)");
                                                                            this.f10437j0 = (StatefulLayout) findViewById16;
                                                                            ConstraintLayout constraintLayout17 = this.f10420S;
                                                                            if (constraintLayout17 != null) {
                                                                                View findViewById17 = constraintLayout17.findViewById(R.id.fog_mutual_friends_avatars);
                                                                                C12932j.m33815a((Object) findViewById17, "view.findViewById(R.id.fog_mutual_friends_avatars)");
                                                                                this.f10438k0 = (LinearLayout) findViewById17;
                                                                                ConstraintLayout constraintLayout18 = this.f10420S;
                                                                                if (constraintLayout18 != null) {
                                                                                    Context context = constraintLayout18.getContext();
                                                                                    C12932j.m33815a((Object) context, "view.context");
                                                                                    this.f10440m0 = new C2477e(context);
                                                                                    ConstraintLayout constraintLayout19 = this.f10420S;
                                                                                    if (constraintLayout19 != null) {
                                                                                        constraintLayout19.setOnTouchListener(new C3955l(this));
                                                                                        ConstraintLayout constraintLayout20 = this.f10420S;
                                                                                        if (constraintLayout20 != null) {
                                                                                            this.f10421T = new C3147g(constraintLayout20);
                                                                                            TextView textView = this.f10427Z;
                                                                                            if (textView != null) {
                                                                                                C7697b.m18736b(textView, 0, null, 2, null);
                                                                                                ProgressBar progressBar = this.f10431d0;
                                                                                                if (progressBar != null) {
                                                                                                    C7697b.m18736b(progressBar, 0, null, 2, null);
                                                                                                    LottieAnimationView lottieAnimationView = this.f10433f0;
                                                                                                    if (lottieAnimationView != null) {
                                                                                                        C7697b.m18736b(lottieAnimationView, 0, null, 2, null);
                                                                                                        TextView textView2 = this.f10434g0;
                                                                                                        if (textView2 != null) {
                                                                                                            C7697b.m18736b(textView2, 0, null, 2, null);
                                                                                                            LottieAnimationView lottieAnimationView2 = this.f10432e0;
                                                                                                            if (lottieAnimationView2 != null) {
                                                                                                                C7697b.m18736b(lottieAnimationView2, 0, null, 2, null);
                                                                                                                C5343a U = C5343a.m15160U();
                                                                                                                if (this.f10418Q != null) {
                                                                                                                    z = true;
                                                                                                                }
                                                                                                                U.mo12849a(z);
                                                                                                                ConstraintLayout constraintLayout21 = this.f10420S;
                                                                                                                if (constraintLayout21 != null) {
                                                                                                                    return constraintLayout21;
                                                                                                                }
                                                                                                                C12932j.m33820c(str);
                                                                                                                throw null;
                                                                                                            }
                                                                                                            C12932j.m33820c("actionSuccessSparklesAnim");
                                                                                                            throw null;
                                                                                                        }
                                                                                                        C12932j.m33820c("actionSuccessText");
                                                                                                        throw null;
                                                                                                    }
                                                                                                    C12932j.m33820c("actionSuccessAnim");
                                                                                                    throw null;
                                                                                                }
                                                                                                C12932j.m33820c("actionProgress");
                                                                                                throw null;
                                                                                            }
                                                                                            C12932j.m33820c("section");
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
            C12932j.m33820c(str);
            throw null;
        }
        throw new TypeCastException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
    }

    /* renamed from: b */
    private final void m11553b(int i) {
        TextView textView = this.f10430c0;
        if (textView != null) {
            C3275i.m10384a(textView, i);
        } else {
            C12932j.m33820c("actionText");
            throw null;
        }
    }

    /* renamed from: c */
    private final void m11556c(int i) {
        TextView textView = this.f10426Y;
        if (textView != null) {
            C3275i.m10384a(textView, i);
            C3147g gVar = this.f10421T;
            if (gVar != null) {
                StatefulLayout statefulLayout = this.f10425X;
                if (statefulLayout != null) {
                    gVar.mo9483b(statefulLayout);
                } else {
                    C12932j.m33820c("subtitleLayout");
                    throw null;
                }
            } else {
                C12932j.m33820c("constraintSet");
                throw null;
            }
        } else {
            C12932j.m33820c("subtitle");
            throw null;
        }
    }

    /* renamed from: b */
    private final void m11554b(Function0<C12956q> function0) {
        ProgressBar progressBar = this.f10431d0;
        if (progressBar != null) {
            C7697b.m18735b(progressBar, 100, new C3954k(this, function0));
        } else {
            C12932j.m33820c("actionProgress");
            throw null;
        }
    }

    /* renamed from: c */
    private final void m11557c(Function0<C12956q> function0) {
        TextView textView = this.f10430c0;
        if (textView != null) {
            C7697b.m18735b(textView, 100, new C3958n(this, function0));
        } else {
            C12932j.m33820c("actionText");
            throw null;
        }
    }

    /* renamed from: a */
    public final void mo10601a(C7339i iVar) {
        C12932j.m33818b(iVar, "contact");
        this.f10439l0 = C3220i.m10211a(iVar);
        m11542a(C2884f.m9357a(iVar));
        m11540H();
        m11556c(C7674a.f19294a);
        m11553b((int) R.string.fogview_button_invite);
        TextView textView = this.f10430c0;
        if (textView != null) {
            textView.setOnClickListener(new C3949f(this, iVar));
            C3147g gVar = this.f10421T;
            if (gVar == null) {
                C12932j.m33820c("constraintSet");
                throw null;
            } else if (gVar.mo9484c()) {
                m11537E();
            }
        } else {
            C12932j.m33820c("actionText");
            throw null;
        }
    }

    /* renamed from: a */
    public final void mo10600a(C3969a aVar, boolean z) {
        C12932j.m33818b(aVar, "fogUserInfo");
        ConstraintLayout constraintLayout = this.f10420S;
        if (constraintLayout != null) {
            Context context = constraintLayout.getContext();
            this.f10439l0 = aVar.mo10628a();
            m11542a(C2884f.m9355a(aVar.mo10634e()));
            m11556c(aVar.mo10636f() ? C7674a.f19294a : R.string.fogview_trivia_notContact);
            m11540H();
            ImageView imageView = this.f10422U;
            if (imageView != null) {
                imageView.setOnClickListener(new C3951h(this, aVar));
                View[] viewArr = new View[3];
                TextView textView = this.f10424W;
                if (textView != null) {
                    viewArr[0] = textView;
                    TextView textView2 = this.f10436i0;
                    if (textView2 != null) {
                        viewArr[1] = textView2;
                        LinearLayout linearLayout = this.f10438k0;
                        if (linearLayout != null) {
                            viewArr[2] = linearLayout;
                            for (View onClickListener : viewArr) {
                                onClickListener.setOnClickListener(new C3950g(this, aVar));
                            }
                            if (z) {
                                if (aVar.mo10631b()) {
                                    m11539G();
                                    m11553b((int) R.string.fogview_button_remind);
                                    m11541a(aVar.mo10632c());
                                    m11549a(C12848o.m33640a());
                                } else {
                                    m11553b((int) R.string.fogview_button_addFriend);
                                    String b = C5540g.m15724b(context, aVar.mo10633d());
                                    if (!(!aVar.mo10633d().isEmpty())) {
                                        b = null;
                                    }
                                    m11562f(b);
                                    m11549a(aVar.mo10633d());
                                }
                                TextView textView3 = this.f10430c0;
                                if (textView3 != null) {
                                    textView3.setOnClickListener(new C3952i(this, aVar));
                                } else {
                                    C12932j.m33820c("actionText");
                                    throw null;
                                }
                            } else {
                                m11553b(C7674a.f19294a);
                                m11562f((String) null);
                                m11549a(C12848o.m33640a());
                            }
                            C3147g gVar = this.f10421T;
                            if (gVar == null) {
                                C12932j.m33820c("constraintSet");
                                throw null;
                            } else if (gVar.mo9484c()) {
                                m11537E();
                            }
                        } else {
                            C12932j.m33820c("friendsAvatars");
                            throw null;
                        }
                    } else {
                        C12932j.m33820c("body");
                        throw null;
                    }
                } else {
                    C12932j.m33820c("title");
                    throw null;
                }
            } else {
                C12932j.m33820c("avatar");
                throw null;
            }
        } else {
            C12932j.m33820c("view");
            throw null;
        }
    }

    /* renamed from: a */
    private final void m11542a(Avatar avatar) {
        AvatarLoader avatarLoader = this.f10440m0;
        if (avatarLoader != null) {
            Request load = avatarLoader.load(avatar);
            ImageView imageView = this.f10422U;
            String str = "avatar";
            if (imageView != null) {
                Context context = imageView.getContext();
                C12932j.m33815a((Object) context, "avatar.context");
                Request withOverride = load.withOverride(context.getResources().getDimensionPixelSize(R.dimen.avatar_size_400));
                ImageView imageView2 = this.f10422U;
                if (imageView2 != null) {
                    withOverride.into(imageView2);
                } else {
                    C12932j.m33820c(str);
                    throw null;
                }
            } else {
                C12932j.m33820c(str);
                throw null;
            }
        } else {
            C12932j.m33820c("avatarLoader");
            throw null;
        }
    }

    /* renamed from: a */
    private final void m11541a(long j) {
        String str;
        ConstraintLayout constraintLayout = this.f10420S;
        String str2 = "view";
        if (constraintLayout != null) {
            Context context = constraintLayout.getContext();
            C3960c cVar = this.f10419R;
            if (cVar != null) {
                long a = cVar.mo10613a(j);
                if (a < TimeUnit.MINUTES.toMillis(1)) {
                    str = context.getString(R.string.fogview_inviteSent_timeLapse_now);
                } else {
                    Object[] objArr = new Object[1];
                    ConstraintLayout constraintLayout2 = this.f10420S;
                    if (constraintLayout2 != null) {
                        Context context2 = constraintLayout2.getContext();
                        C12932j.m33815a((Object) context2, "view.context");
                        objArr[0] = C5521c.m15672c(context2, a);
                        str = context.getString(R.string.fogview_inviteSent_timeLapse, objArr);
                    } else {
                        C12932j.m33820c(str2);
                        throw null;
                    }
                }
                C12932j.m33815a((Object) str, "if (elapsedTime < TimeUn…)\n            )\n        }");
                TextView textView = this.f10436i0;
                if (textView != null) {
                    textView.setClickable(false);
                    m11562f(str);
                    return;
                }
                C12932j.m33820c("body");
                throw null;
            }
            C12932j.m33820c("presenter");
            throw null;
        }
        C12932j.m33820c(str2);
        throw null;
    }

    /* renamed from: a */
    private final void m11549a(List<UserProto$User> list) {
        LinearLayout linearLayout = this.f10438k0;
        if (linearLayout != null) {
            C3137b.m9865a(linearLayout, list);
            C3147g gVar = this.f10421T;
            if (gVar != null) {
                StatefulLayout statefulLayout = this.f10437j0;
                if (statefulLayout != null) {
                    gVar.mo9483b(statefulLayout);
                } else {
                    C12932j.m33820c("friendsAvatarsLayout");
                    throw null;
                }
            } else {
                C12932j.m33820c("constraintSet");
                throw null;
            }
        } else {
            C12932j.m33820c("friendsAvatars");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m11543a(C2467a aVar, UserProto$User userProto$User) {
        NavigationContract navigationContract = this.f10441n0;
        if (navigationContract != null) {
            navigationContract.onChatClick(aVar, userProto$User.getUuid());
        }
    }

    /* renamed from: a */
    public final void mo10602a(Function0<C12956q> function0) {
        C12932j.m33818b(function0, "startAction");
        this.f10442o0 = false;
        m11557c(function0);
    }

    /* renamed from: a */
    static /* synthetic */ void m11546a(C3943a aVar, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            function0 = C3953j.f10459f;
        }
        aVar.m11554b(function0);
    }

    /* renamed from: a */
    static /* synthetic */ void m11548a(C3943a aVar, boolean z, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            function0 = C3946c.f10445f;
        }
        aVar.m11550a(z, function0);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m11550a(boolean z, Function0<C12956q> function0) {
        boolean z2 = z;
        String str = "actionSuccessText";
        String str2 = "actionSuccessSparklesAnim";
        String str3 = "actionSuccessAnim";
        if (z2) {
            TextView textView = this.f10434g0;
            if (textView != null) {
                C7697b.m18736b(textView, 0, null, 3, null);
                LottieAnimationView lottieAnimationView = this.f10433f0;
                if (lottieAnimationView != null) {
                    lottieAnimationView.mo22807d();
                    LottieAnimationView lottieAnimationView2 = this.f10433f0;
                    if (lottieAnimationView2 != null) {
                        C7697b.m18730a(lottieAnimationView2, 0, null, 3, null);
                        LottieAnimationView lottieAnimationView3 = this.f10432e0;
                        if (lottieAnimationView3 != null) {
                            lottieAnimationView3.mo22807d();
                            LottieAnimationView lottieAnimationView4 = this.f10432e0;
                            if (lottieAnimationView4 != null) {
                                C7697b.m18730a(lottieAnimationView4, 0, null, 3, null);
                            } else {
                                C12932j.m33820c(str2);
                                throw null;
                            }
                        } else {
                            C12932j.m33820c(str2);
                            throw null;
                        }
                    } else {
                        C12932j.m33820c(str3);
                        throw null;
                    }
                } else {
                    C12932j.m33820c(str3);
                    throw null;
                }
            } else {
                C12932j.m33820c(str);
                throw null;
            }
        } else {
            TextView textView2 = this.f10434g0;
            if (textView2 != null) {
                C7697b.m18730a(textView2, 0, null, 3, null);
                m11539G();
                TextView textView3 = this.f10427Z;
                if (textView3 != null) {
                    C7697b.m18730a(textView3, 0, null, 3, null);
                } else {
                    C12932j.m33820c("section");
                    throw null;
                }
            } else {
                C12932j.m33820c(str);
                throw null;
            }
        }
        float f = z2 ? 2.5f : 0.75f;
        LottieAnimationView[] lottieAnimationViewArr = new LottieAnimationView[2];
        LottieAnimationView lottieAnimationView5 = this.f10432e0;
        if (lottieAnimationView5 != null) {
            lottieAnimationViewArr[0] = lottieAnimationView5;
            LottieAnimationView lottieAnimationView6 = this.f10433f0;
            if (lottieAnimationView6 != null) {
                lottieAnimationViewArr[1] = lottieAnimationView6;
                for (LottieAnimationView lottieAnimationView7 : lottieAnimationViewArr) {
                    lottieAnimationView7.animate().scaleX(f).scaleY(f).setDuration(300).setInterpolator(C7657c.m18650f()).withEndAction(new C3945b(lottieAnimationView7, f, function0)).start();
                }
                ChangeBounds changeBounds = new ChangeBounds();
                changeBounds.mo6006a(C7657c.m18648d(0.2f));
                C3147g gVar = this.f10421T;
                if (gVar != null) {
                    C3150h.m9892a(gVar, Long.valueOf(300), changeBounds, new C3947d(this, z2));
                } else {
                    C12932j.m33820c("constraintSet");
                    throw null;
                }
            } else {
                C12932j.m33820c(str3);
                throw null;
            }
        } else {
            C12932j.m33820c(str2);
            throw null;
        }
    }
}
