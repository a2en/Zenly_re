package app.zenly.locator.onboarding;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextSwitcher;
import android.widget.TextView;
import app.zenly.android.base.util.C1297b;
import app.zenly.android.base.widget.LinearLayout;
import app.zenly.android.feature.polenta.widget.ScreenBar;
import app.zenly.locator.AuthenticatedNotifier;
import app.zenly.locator.AuthenticatedNotifierProvider;
import app.zenly.locator.R;
import app.zenly.locator.core.invitations.p068g0.C2594d;
import app.zenly.locator.core.p072ui.controller.C3103g.C3106c;
import app.zenly.locator.core.p072ui.controller.DraggableDialogController.ExitListener;
import app.zenly.locator.core.p072ui.view.CustomEditText;
import app.zenly.locator.core.util.C3227n;
import app.zenly.locator.decision.C3444a;
import app.zenly.locator.friendshipfacts.C3772c;
import app.zenly.locator.onboarding.BaseSignupController.SignupListener;
import app.zenly.locator.onboarding.p125y3.C4948b;
import app.zenly.locator.p143s.C5407g;
import app.zenly.locator.p143s.p146j.C5432b;
import app.zenly.locator.p143s.p148l.C5448c;
import app.zenly.locator.p143s.p155r.C5498a;
import app.zenly.locator.p143s.p155r.C5498a.C5500b;
import app.zenly.locator.p143s.p155r.C5498a.C5501c;
import app.zenly.locator.p143s.p159u.C5513a;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import p213co.znly.models.C7402n2;
import p213co.znly.models.services.C8247q4;
import p213co.znly.models.services.C8247q4.C8248a;
import p213co.znly.models.services.C8260r4;
import p213co.znly.models.services.C8275s4;
import p213co.znly.models.services.C8275s4.C8277b;
import p213co.znly.models.services.C8296t4;
import p213co.znly.models.services.C8296t4.C8297a;
import p213co.znly.models.services.C8309u4;
import p213co.znly.models.verify.C8454e;
import p214e.p228e.C7573b;
import p214e.p247m.p248a.C7646a;
import p250f.p251a.p252a.p253a.p256f.p257a.C7674a;
import p250f.p251a.p252a.p253a.p260i.C7689e;
import p250f.p251a.p252a.p263b.p264a.p272j.C7709b;
import p387h.p388a.C12143a;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.p390h.p392c.C12295a;

/* renamed from: app.zenly.locator.onboarding.b3 */
public class C4766b3 extends BaseSignupController {
    /* access modifiers changed from: private */

    /* renamed from: A0 */
    public static final long f12579A0 = TimeUnit.SECONDS.toMillis(2);
    /* access modifiers changed from: private */

    /* renamed from: B0 */
    public static final long f12580B0 = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: C0 */
    private static final List<C4773g> f12581C0 = C3227n.m10229a((T[]) new C4773g[]{new C4773g(R.string.signup_code_autoverify_text1), new C4773g(R.string.signup_code_autoverify_text2), new C4773g(R.string.signup_code_autoverify_text3), new C4773g(R.string.signup_code_autoverify_text4), new C4773g(R.string.signup_code_autoverify_text5), new C4773g(R.string.signup_code_autoverify_text6), new C4773g(R.string.signup_code_autoverify_text7), new C4773g(R.string.signup_code_autoverify_text8), new C4773g(R.string.signup_code_autoverify_text9), new C4773g(R.string.signup_code_autoverify_text10), new C4773g(R.string.signup_code_autoverify_text11), new C4773g(R.string.signup_code_autoverify_text12)});
    /* access modifiers changed from: private */

    /* renamed from: D0 */
    public static final C4773g f12582D0 = new C4773g(R.string.signup_code_autoverify_text_ok);
    /* access modifiers changed from: private */

    /* renamed from: E0 */
    public static final C4773g f12583E0 = new C4773g(R.string.signup_code_autoverify_text_ko);

    /* renamed from: x0 */
    private static final long f12584x0 = TimeUnit.SECONDS.toMillis(3);

    /* renamed from: y0 */
    private static final long f12585y0 = TimeUnit.SECONDS.toMillis(2);

    /* renamed from: z0 */
    private static final long f12586z0 = TimeUnit.SECONDS.toMillis(2);
    /* access modifiers changed from: private */

    /* renamed from: T */
    public AuthenticatedNotifier f12587T;

    /* renamed from: U */
    private C5407g f12588U;

    /* renamed from: V */
    private Handler f12589V = new Handler(Looper.getMainLooper());

    /* renamed from: W */
    private final C12275b f12590W = new C12275b();
    /* access modifiers changed from: private */

    /* renamed from: X */
    public final BroadcastReceiver f12591X = new C4767a();
    /* access modifiers changed from: private */

    /* renamed from: Y */
    public ViewGroup f12592Y;
    /* access modifiers changed from: private */

    /* renamed from: Z */
    public ScreenBar f12593Z;
    /* access modifiers changed from: private */

    /* renamed from: a0 */
    public TextView f12594a0;

    /* renamed from: b0 */
    private TextSwitcher f12595b0;
    /* access modifiers changed from: private */

    /* renamed from: c0 */
    public TextView f12596c0;
    /* access modifiers changed from: private */

    /* renamed from: d0 */
    public ProgressBar f12597d0;
    /* access modifiers changed from: private */

    /* renamed from: e0 */
    public TextView f12598e0;
    /* access modifiers changed from: private */

    /* renamed from: f0 */
    public LinearLayout f12599f0;

    /* renamed from: g0 */
    private TextView f12600g0;
    /* access modifiers changed from: private */

    /* renamed from: h0 */
    public TextView f12601h0;
    /* access modifiers changed from: private */

    /* renamed from: i0 */
    public TextView f12602i0;
    /* access modifiers changed from: private */

    /* renamed from: j0 */
    public CustomEditText f12603j0;

    /* renamed from: k0 */
    private View f12604k0;

    /* renamed from: l0 */
    private ProgressBar f12605l0;

    /* renamed from: m0 */
    private final TimeInterpolator f12606m0 = C4882q.f12848a;

    /* renamed from: n0 */
    private final ValueAnimator f12607n0 = new ValueAnimator();

    /* renamed from: o0 */
    private final Set<Runnable> f12608o0 = new C7573b();
    /* access modifiers changed from: private */

    /* renamed from: p0 */
    public int f12609p0;
    /* access modifiers changed from: private */

    /* renamed from: q0 */
    public boolean f12610q0;

    /* renamed from: r0 */
    private boolean f12611r0;

    /* renamed from: s0 */
    private int f12612s0;

    /* renamed from: t0 */
    private C8297a f12613t0;
    /* access modifiers changed from: private */

    /* renamed from: u0 */
    public C8275s4 f12614u0;
    /* access modifiers changed from: private */

    /* renamed from: v0 */
    public CodeStateMachine f12615v0 = new CodeStateMachine();

    /* renamed from: w0 */
    private C4746g f12616w0 = new C4769c();

    /* renamed from: app.zenly.locator.onboarding.b3$a */
    class C4767a extends BroadcastReceiver {
        C4767a() {
        }

        public void onReceive(Context context, Intent intent) {
            C4766b3.this.m13896M();
        }
    }

    /* renamed from: app.zenly.locator.onboarding.b3$b */
    class C4768b extends C7689e {
        C4768b() {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (charSequence.length() >= C4766b3.this.f12609p0) {
                C4766b3.this.m13930d(charSequence.toString());
            }
        }
    }

    /* renamed from: app.zenly.locator.onboarding.b3$c */
    class C4769c implements C4746g {
        C4769c() {
        }

        /* renamed from: a */
        public void mo11984a(int i) {
            if (i <= 20) {
                C4766b3.this.f12596c0.setVisibility(0);
                C4766b3.this.f12596c0.setText(C4766b3.this.mo23945j().getQuantityString(R.plurals.signup_code_autoverify_countdown, i, new Object[]{Integer.valueOf(i)}));
            } else {
                C4766b3.this.f12596c0.setVisibility(8);
            }
            C4766b3.this.m13899P();
        }

        /* renamed from: b */
        public void mo11989b(int i) {
            C4766b3.this.f12602i0.setText(C4766b3.this.mo23945j().getQuantityString(R.plurals.settings_inputcode_label_timer, i, new Object[]{Integer.valueOf(i)}));
        }

        /* renamed from: c */
        public /* synthetic */ void mo12014c() {
            C4766b3.this.f12603j0.requestFocus();
            C1297b.m6241b(C4766b3.this.f12603j0);
        }

        /* renamed from: b */
        public void mo11988b() {
            C4766b3.this.m13928c((int) R.string.settings_inputcode_alertitle_expired);
            C4766b3.this.f12615v0.mo11964o();
        }

        /* renamed from: b */
        public /* synthetic */ void mo12013b(View view) {
            C4766b3.this.m13904a(100, 500);
            C4766b3.this.m13906a(view, 0, 200, (Runnable) new C4804g(this, view));
        }

        /* renamed from: a */
        public void mo11983a() {
            C4766b3.this.f12601h0.setText(R.string.settings_inputcode_button_callme);
            C4766b3.this.f12601h0.setVisibility(0);
            C4766b3.this.f12602i0.setVisibility(8);
            C5498a.m15600a((Context) C4766b3.this.mo23920b()).mo13124a(C5501c.MEDIUM, C5500b.ERROR, 2);
        }

        /* renamed from: a */
        public void mo11987a(boolean z) {
            if (!z) {
                C7646a.m18632a((Context) C4766b3.this.mo23920b()).mo19784a(C4766b3.this.f12591X);
            } else if (!C4766b3.this.m13896M()) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("app.zenly.locator.action.VERIFICATION_CODE_STORED");
                C7646a.m18632a((Context) C4766b3.this.mo23920b()).mo19785a(C4766b3.this.f12591X, intentFilter);
            }
        }

        /* renamed from: a */
        public void mo11986a(Throwable th) {
            if (C4948b.m14277a(th.getMessage())) {
                C4766b3.this.m13903a((int) R.string.signup_error_nonetwork_title, (int) R.string.signup_error_nonetwork_subtitle);
            } else if (C4948b.m14280d(th.getMessage())) {
                C5498a.m15600a((Context) C4766b3.this.mo23920b()).mo13123a(C5501c.MEDIUM, C5500b.ERROR);
                C4766b3.this.m13903a((int) R.string.settings_inputcode_alertcontent_invalidcode, 0);
            } else if (C4948b.m14279c(th.getMessage())) {
                C4766b3.this.m13928c((int) R.string.settings_inputcode_alertitle_toomanytries);
                C4766b3.this.f12615v0.mo11964o();
            } else {
                C4766b3.this.m13903a((int) R.string.commons_content_oopserror, 0);
            }
            C4766b3.this.f12610q0 = false;
        }

        /* renamed from: a */
        public void mo11985a(int i, int i2) {
            View view;
            if (i == 2 || i == 3) {
                view = C4766b3.this.f12592Y;
            } else if (i != 4) {
                view = null;
            } else {
                C1297b.m6236a(C4766b3.this.mo23920b());
                view = C4766b3.this.f12599f0;
            }
            boolean n = C4766b3.this.mo23949n();
            if (i2 == 1) {
                C4766b3.this.f12597d0.setProgress(10);
                C4766b3.this.m13899P();
                C4766b3 b3Var = C4766b3.this;
                b3Var.m13907a(view, (View) b3Var.f12592Y, n, (Runnable) null);
            } else if (i2 != 2) {
                boolean z = false;
                if (i2 == 3) {
                    C4766b3.this.f12597d0.setVisibility(4);
                    C4766b3.this.f12593Z.setVisibility(4);
                    C4766b3.this.f12594a0.setVisibility(4);
                    C4766b3.this.f12596c0.setVisibility(8);
                    C4766b3.this.f12598e0.setVisibility(0);
                    C4766b3.this.m13908a(C4766b3.f12583E0, n);
                } else if (i2 == 4) {
                    C4766b3.this.f12603j0.setMaxLength(C4766b3.this.f12609p0);
                    StringBuilder sb = new StringBuilder();
                    for (int i3 = 0; i3 < C4766b3.this.f12609p0; i3++) {
                        if (i3 > 0) {
                            sb.append(" ");
                        }
                        sb.append("•");
                    }
                    C4766b3.this.f12603j0.setHint(sb);
                    if (C4766b3.this.f12511Q.getCache().getChallengeType() == C8454e.NUMERIC) {
                        C4766b3.this.f12603j0.setRawInputType(2);
                    } else {
                        C4766b3.this.f12603j0.setRawInputType(1);
                    }
                    if (C4766b3.this.f12615v0.mo11961l()) {
                        C4766b3.this.f12602i0.setVisibility(8);
                        C4766b3.this.f12601h0.setVisibility(0);
                    } else {
                        C4766b3.this.f12602i0.setVisibility(0);
                        C4766b3.this.f12601h0.setVisibility(8);
                    }
                    C4766b3 b3Var2 = C4766b3.this;
                    b3Var2.m13907a(view, (View) b3Var2.f12599f0, n, (Runnable) new C4794f(this));
                } else if (i2 == 5) {
                    if (!(C4766b3.this.f12614u0 == null || C4766b3.this.f12614u0.getCode() == C8277b.CODE_SUCCESS)) {
                        z = true;
                    }
                    if (z) {
                        C5498a.m15600a(view.getContext()).mo13123a(C5501c.LIGHT, C5500b.NAV);
                        C4766b3.this.mo11926D();
                        return;
                    }
                    C4766b3.this.f12587T.setAuthenticated(true);
                    long j = 0;
                    if (i == 2) {
                        j = Math.max(C4766b3.f12579A0, C4766b3.f12579A0 - C4766b3.this.f12615v0.mo11959j());
                    }
                    C4766b3.this.m13922a((Runnable) new C4809h(this, view), j);
                }
            } else {
                C4766b3.this.f12596c0.setText(R.string.signup_code_autoverify_countdown_ok);
                C4766b3.this.m13904a(95, C4766b3.f12580B0);
                C4766b3.this.m13908a(C4766b3.f12582D0, n);
                C4766b3 b3Var3 = C4766b3.this;
                b3Var3.m13930d(b3Var3.f12615v0.mo11950d());
            }
        }

        /* renamed from: a */
        public /* synthetic */ void mo12012a(View view) {
            C5498a.m15600a(view.getContext()).mo13123a(C5501c.LIGHT, C5500b.NAV);
            C4766b3.this.mo11926D();
        }
    }

    /* renamed from: app.zenly.locator.onboarding.b3$d */
    class C4770d extends C5432b {

        /* renamed from: b */
        final /* synthetic */ int f12620b;

        C4770d(int i) {
            this.f12620b = i;
        }

        /* renamed from: a */
        public void mo7336a(Animator animator, boolean z) {
            if (!z) {
                C4766b3.this.f12597d0.setProgress(this.f12620b * 10);
            }
            animator.removeListener(this);
        }
    }

    /* renamed from: app.zenly.locator.onboarding.b3$e */
    class C4771e extends C5432b {

        /* renamed from: b */
        final /* synthetic */ View f12622b;

        /* renamed from: c */
        final /* synthetic */ ValueAnimator f12623c;

        /* renamed from: d */
        final /* synthetic */ Runnable f12624d;

        C4771e(View view, ValueAnimator valueAnimator, Runnable runnable) {
            this.f12622b = view;
            this.f12623c = valueAnimator;
            this.f12624d = runnable;
        }

        /* renamed from: a */
        public void mo7336a(Animator animator, boolean z) {
            View view = this.f12622b;
            if (view != null) {
                view.setVisibility(8);
                this.f12622b.setTranslationX(0.0f);
            }
            this.f12623c.removeListener(this);
            Runnable runnable = this.f12624d;
            if (runnable != null) {
                C4766b3.this.m13921a(runnable);
            }
        }
    }

    /* renamed from: app.zenly.locator.onboarding.b3$f */
    class C4772f extends C5432b {

        /* renamed from: b */
        final /* synthetic */ Runnable f12626b;

        C4772f(Runnable runnable) {
            this.f12626b = runnable;
        }

        /* renamed from: a */
        public void mo7336a(Animator animator, boolean z) {
            if (C4766b3.this.mo23949n()) {
                this.f12626b.run();
            }
        }
    }

    /* renamed from: app.zenly.locator.onboarding.b3$g */
    private static class C4773g {

        /* renamed from: a */
        final int f12628a;

        C4773g(int i) {
            this.f12628a = i;
        }
    }

    public C4766b3() {
        this.f12615v0.mo11941a(this.f12616w0);
    }

    /* renamed from: L */
    private void m13895L() {
        SignupListener signupListener = this.f12511Q;
        if (signupListener != null && signupListener.getCache() != null && this.f12511Q.getCache().hasSession()) {
            C7402n2 session = this.f12511Q.getCache().getSession();
            C8248a newBuilder = C8247q4.newBuilder();
            newBuilder.mo22224a(session.getUuid());
            this.f12590W.add(C5448c.m15478a().sessionRequestCall((C8247q4) newBuilder.build()).mo36428a(C12295a.m32802a()).mo36412a((Consumer<? super T>) new C4929w<Object>(this), (Consumer<? super Throwable>) new C4907t<Object>(this)));
            this.f12601h0.setText(R.string.settings_inputcode_button_pleasewait);
            C1297b.m6236a(mo23920b());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: M */
    public boolean m13896M() {
        String i = this.f12588U.mo12987i();
        if (i == null) {
            return false;
        }
        this.f12615v0.mo11944a(i);
        this.f12588U.mo12972a((String) null);
        return true;
    }

    /* renamed from: N */
    private void m13897N() {
        long j;
        int i;
        long i2 = this.f12615v0.mo11958i();
        int a = m13901a(i2);
        C4773g gVar = (C4773g) f12581C0.get(a);
        this.f12612s0 = 0;
        m13908a(gVar, false);
        int i3 = 30;
        if (a == 0) {
            i = 10;
            j = f12584x0;
        } else if (a != 1) {
            i3 = 90;
            long i4 = this.f12615v0.mo11958i() + this.f12615v0.mo11954f();
            long j2 = f12584x0;
            long j3 = i4 - j2;
            long j4 = f12585y0;
            j = j3 - j4;
            i2 = (i2 - j2) - j4;
            i = 50;
        } else {
            j = f12585y0;
            i2 -= f12584x0;
            i = 30;
            i3 = 50;
        }
        float f = ((float) i2) / ((float) j);
        this.f12597d0.setProgress((int) ((((float) i) + (((float) (i3 - i)) * f)) * 10.0f));
        m13905a(i3, j, f);
    }

    /* renamed from: O */
    private void m13898O() {
        this.f12603j0.setCustomEnabled(false);
        this.f12601h0.setEnabled(false);
        this.f12604k0.setVisibility(8);
        this.f12605l0.setVisibility(0);
    }

    /* access modifiers changed from: private */
    /* renamed from: P */
    public void m13899P() {
        long i = this.f12615v0.mo11958i();
        int a = m13901a(i);
        C4773g gVar = (C4773g) f12581C0.get(a);
        if (a != this.f12612s0) {
            this.f12612s0 = a;
            m13908a(gVar, a != 0);
            if (a == 0) {
                m13904a(30, f12584x0 - i);
            } else if (a == 1) {
                m13904a(50, (f12584x0 + f12585y0) - i);
            } else if (a == 2) {
                m13904a(90, this.f12615v0.mo11954f());
            }
        }
    }

    /* renamed from: B */
    public int mo7192B() {
        return 31;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: D */
    public void mo11926D() {
        this.f12615v0.mo11964o();
        super.mo11926D();
    }

    /* renamed from: E */
    public C8275s4 mo12000E() {
        return this.f12614u0;
    }

    /* renamed from: F */
    public C8297a mo12001F() {
        return this.f12613t0;
    }

    /* renamed from: G */
    public /* synthetic */ void mo12002G() {
        this.f12603j0.requestFocus();
        C1297b.m6241b(this.f12603j0);
    }

    public void onWindowInsetsChanged(View view, Rect rect) {
        super.onWindowInsetsChanged(view, rect);
        view.setPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m13928c(int i) {
        if (!this.f12611r0) {
            Activity b = mo23920b();
            if (b != null) {
                Builder onCancelListener = new Builder(b).setTitle(i).setMessage(R.string.settings_inputcode_alertcontent_pleaseresubmit).setNeutralButton(17039379, new C4831j(this)).setOnCancelListener(new C4826i(this));
                onCancelListener.setOnDismissListener(new C4902s(this));
                this.f12611r0 = true;
                onCancelListener.show();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7052b(View view) {
        super.mo7052b(view);
        this.f12609p0 = this.f12511Q.getCache().getChallengeSize();
        String phoneNumberNormalizeInternational = C5448c.m15478a().phoneNumberNormalizeInternational(this.f12511Q.getCache().getPhoneNumber());
        this.f12594a0.setText(phoneNumberNormalizeInternational);
        this.f12600g0.setText(mo23945j().getString(R.string.settings_inputcode_view_subtitle_sentto, new Object[]{phoneNumberNormalizeInternational}));
        this.f12615v0.mo11965p();
        int c = this.f12615v0.mo11949c();
        if (c == 0) {
            this.f12592Y.setVisibility(8);
            this.f12599f0.setVisibility(8);
            this.f12612s0 = -1;
            if (C5513a.m15633b(mo23920b()) == 0) {
                this.f12615v0.mo11943a(this.f12511Q.getCache().getEventInfo());
            } else {
                this.f12615v0.mo11948b(this.f12511Q.getCache().getEventInfo());
            }
        } else if (c == 1) {
            m13897N();
        } else if (c == 2) {
            m13930d(this.f12615v0.mo11950d());
        } else if (c == 5) {
            this.f12587T.setAuthenticated(true);
            C5498a.m15600a(view.getContext()).mo13123a(C5501c.LIGHT, C5500b.NAV);
            mo11926D();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo7053d(View view) {
        this.f12615v0.mo11963n();
        this.f12607n0.cancel();
        this.f12590W.mo36401a();
        for (Runnable removeCallbacks : this.f12608o0) {
            this.f12589V.removeCallbacks(removeCallbacks);
        }
        this.f12608o0.clear();
        super.mo7053d(view);
    }

    /* renamed from: e */
    public /* synthetic */ void mo7061e(View view) {
        C5498a.m15600a(view.getContext()).mo13123a(C5501c.LIGHT, C5500b.NAV);
        this.f12615v0.mo11960k();
    }

    /* renamed from: f */
    public /* synthetic */ void mo7857f(View view) {
        C5498a.m15600a(view.getContext()).mo13123a(C5501c.LIGHT, C5500b.NAV);
        if (this.f12603j0.length() >= this.f12609p0) {
            m13930d(this.f12603j0.getText().toString());
        } else {
            m13903a((int) R.string.settings_inputcode_alertcontent_empty_auto_verif, 0);
        }
    }

    /* renamed from: g */
    public /* synthetic */ void mo12010g(View view) {
        C5498a.m15600a(view.getContext()).mo13123a(C5501c.LIGHT, C5500b.NAV);
        m13895L();
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m13930d(String str) {
        SignupListener signupListener = this.f12511Q;
        if (!(signupListener == null || signupListener.getCache() == null || !this.f12511Q.getCache().hasSession())) {
            if (this.f12615v0.mo11949c() == 4) {
                if (!this.f12610q0) {
                    m13898O();
                    this.f12610q0 = true;
                } else {
                    return;
                }
            }
            this.f12613t0 = C8296t4.newBuilder();
            this.f12613t0.mo22258a(str);
            this.f12613t0.mo22262d(this.f12511Q.getCache().getName());
            this.f12613t0.mo22260b(this.f12511Q.getCache().getPhoneNumber());
            this.f12613t0.mo22261c(this.f12511Q.getCache().getSession().getUuid());
            this.f12613t0.mo22257a(this.f12511Q.getCache().getBirthdate());
            this.f12613t0.mo22259a(true);
            this.f12590W.add(C5448c.m15478a().sessionVerify((C8296t4) this.f12613t0.build()).mo36428a(C12295a.m32802a()).mo36412a((Consumer<? super T>) new C4864o<Object>(this), (Consumer<? super Throwable>) new C4912u<Object>(this)));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7065a(Context context) {
        this.f12587T = ((AuthenticatedNotifierProvider) mo23920b().getApplication()).provideAuthenticatedNotifier();
        this.f12588U = C5407g.m15386a(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo7054a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.controller_code, viewGroup, false);
        this.f12592Y = (ViewGroup) inflate.findViewById(R.id.signup_code_auto);
        this.f12593Z = (ScreenBar) inflate.findViewById(R.id.screen_bar);
        this.f12594a0 = (TextView) inflate.findViewById(R.id.signup_code_auto_phonenumber);
        this.f12596c0 = (TextView) inflate.findViewById(R.id.signup_code_auto_countdown);
        this.f12597d0 = (ProgressBar) inflate.findViewById(R.id.signup_code_auto_progress);
        this.f12598e0 = (TextView) inflate.findViewById(R.id.signup_code_auto_manualbutton);
        this.f12595b0 = (TextSwitcher) inflate.findViewById(R.id.signup_code_auto_wait);
        this.f12599f0 = (LinearLayout) inflate.findViewById(R.id.signup_code_manual);
        this.f12600g0 = (TextView) inflate.findViewById(R.id.signup_code_manual_phonenumber);
        this.f12601h0 = (TextView) inflate.findViewById(R.id.signup_code_manual_callme);
        this.f12602i0 = (TextView) inflate.findViewById(R.id.signup_code_manual_countdown);
        this.f12603j0 = (CustomEditText) inflate.findViewById(R.id.signup_code_manual_codeinput);
        this.f12604k0 = inflate.findViewById(R.id.signup_code_manual_nextbutton);
        this.f12605l0 = (ProgressBar) inflate.findViewById(R.id.signup_code_manual_progress);
        this.f12598e0.setOnClickListener(new C4843l(this));
        this.f12603j0.setOnEditorActionListener(new C4838k(this));
        this.f12603j0.addTextChangedListener(new C4768b());
        inflate.findViewById(R.id.signup_code_manual_nextbutton).setOnClickListener(new C4887r(this));
        this.f12601h0.setOnClickListener(new C4851m(this));
        this.f12607n0.setInterpolator(this.f12606m0);
        this.f12607n0.addUpdateListener(new C4874p(this));
        return inflate;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo9307b(Bundle bundle) {
        bundle.putParcelable("state", this.f12615v0);
        super.mo9307b(bundle);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m13926b(Throwable th) {
        if ((this.f12615v0.mo11949c() == 0 || this.f12615v0.mo11949c() == 3) && C4948b.m14277a(th.getMessage())) {
            this.f12615v0.mo11960k();
            return;
        }
        C4847l3.m14146j().mo12071a(false, this.f12615v0.mo11949c() == 2);
        this.f12615v0.mo11945a(th);
    }

    /* renamed from: b */
    public /* synthetic */ void mo12009b(DialogInterface dialogInterface) {
        this.f12611r0 = false;
    }

    /* renamed from: a */
    public /* synthetic */ boolean mo12008a(TextView textView, int i, KeyEvent keyEvent) {
        if (this.f12603j0.length() < this.f12609p0 || i != 5) {
            return false;
        }
        m13930d(this.f12603j0.getText().toString());
        return true;
    }

    /* renamed from: a */
    public /* synthetic */ void mo12003a(ValueAnimator valueAnimator) {
        this.f12597d0.setProgress(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo9305a(Bundle bundle) {
        super.mo9305a(bundle);
        this.f12615v0 = (CodeStateMachine) bundle.getParcelable("state");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m13908a(C4773g gVar, boolean z) {
        if (z) {
            TextView textView = (TextView) this.f12595b0.getNextView();
            this.f12595b0.setText(mo23945j().getString(gVar.f12628a));
            return;
        }
        ((TextView) this.f12595b0.getCurrentView()).setText(gVar.f12628a);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m13920a(C8309u4 u4Var) {
        SignupListener signupListener = this.f12511Q;
        if (signupListener != null) {
            signupListener.getCache().mo19165a(u4Var.getSession());
            this.f12511Q.saveCache();
        }
        C4847l3.m14146j().mo12071a(true, this.f12615v0.mo11949c() == 2);
        if (u4Var.hasError()) {
            this.f12614u0 = u4Var.getError();
        } else {
            this.f12614u0 = null;
        }
        C8275s4 s4Var = this.f12614u0;
        if (s4Var == null || s4Var.getCode() == C8277b.CODE_SUCCESS) {
            boolean isNewUser = u4Var.getSession().getIsNewUser();
            if (C3444a.m10686a(mo9304A()).mo6511a("feature:broadcastInvite")) {
                new C2594d(C5407g.m15386a((Context) mo9304A()).mo12986h()).mo8712h(isNewUser);
            }
            C3772c.m11231a(mo9304A()).provideFriendshipFactsPrefs().onUserLogged(u4Var.getMe());
            C4847l3.m14146j().mo12075b(!isNewUser);
            this.f12615v0.mo11946a(u4Var.getSession().getIsNewUser());
            return;
        }
        this.f12615v0.mo11942a(this.f12614u0);
    }

    /* renamed from: a */
    public /* synthetic */ void mo12006a(C8260r4 r4Var) throws Exception {
        this.f12615v0.mo11948b(r4Var.getVerifyInfo());
        this.f12602i0.setVisibility(0);
        this.f12601h0.setVisibility(8);
    }

    /* renamed from: a */
    public /* synthetic */ void mo12007a(Throwable th) throws Exception {
        C12143a.m32032b(th, "sessionRequestCall error", new Object[0]);
        this.f12615v0.mo11962m();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m13903a(int i, int i2) {
        Context context = this.f12603j0.getContext();
        this.f12603j0.setCustomEnabled(true);
        this.f12601h0.setEnabled(true);
        this.f12604k0.setVisibility(0);
        this.f12605l0.setVisibility(8);
        C1297b.m6237a((View) this.f12603j0);
        C3106c cVar = new C3106c(context);
        cVar.mo9331a(2131231414);
        cVar.mo9345c((int) R.string.commons_button_ok);
        C3106c a = cVar.mo9300a((ExitListener) new C4857n(this));
        if (C7674a.m18692a(i)) {
            a.mo9346c(C7709b.m18762a(context, i));
        }
        if (C7674a.m18692a(i2)) {
            a.mo9341b(C7709b.m18762a(context, i2));
        }
        a.mo9344b().mo9296j(mo23920b());
    }

    /* renamed from: a */
    public /* synthetic */ void mo12005a(DialogInterface dialogInterface, int i) {
        SignupListener signupListener = this.f12511Q;
        if (signupListener != null) {
            signupListener.moveBack();
        }
        this.f12611r0 = false;
    }

    /* renamed from: a */
    public /* synthetic */ void mo12004a(DialogInterface dialogInterface) {
        this.f12611r0 = false;
    }

    /* renamed from: a */
    private int m13901a(long j) {
        long j2 = f12584x0;
        if (j < j2) {
            return 0;
        }
        long j3 = f12585y0;
        if (j < j2 + j3) {
            return 1;
        }
        return Math.min(((int) (((j - j2) - j3) / f12586z0)) + 2, f12581C0.size() - 1);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m13904a(int i, long j) {
        m13905a(i, j, 0.0f);
    }

    /* renamed from: a */
    private void m13905a(int i, long j, float f) {
        this.f12607n0.cancel();
        this.f12607n0.setIntValues(new int[]{this.f12597d0.getProgress(), i * 10});
        this.f12607n0.setDuration(j);
        this.f12607n0.setCurrentPlayTime((long) (f * ((float) j)));
        this.f12607n0.addListener(new C4770d(i));
        this.f12607n0.start();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m13907a(View view, View view2, boolean z, Runnable runnable) {
        if (!z || !mo23949n()) {
            if (view != null) {
                view.setVisibility(8);
            }
            view2.setVisibility(0);
            if (runnable != null) {
                m13921a(runnable);
                return;
            }
            return;
        }
        float width = (float) mo23948m().getWidth();
        view2.setVisibility(0);
        view2.setTranslationX(width);
        ValueAnimator duration = ValueAnimator.ofFloat(new float[]{0.0f, -1.0f}).setDuration(250);
        duration.addUpdateListener(new C4922v(width, view, view2));
        duration.addListener(new C4771e(view, duration, runnable));
        duration.start();
    }

    /* renamed from: a */
    static /* synthetic */ void m13902a(float f, View view, View view2, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * f;
        if (view != null) {
            view.setTranslationX(floatValue);
        }
        view2.setTranslationX(f + floatValue);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m13906a(View view, long j, long j2, Runnable runnable) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{1.0f, 0.0f});
        ofFloat.setDuration(j2);
        ofFloat.addListener(new C4772f(runnable));
        ofFloat.setStartDelay(j);
        ofFloat.start();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m13921a(Runnable runnable) {
        this.f12589V.post(runnable);
        this.f12608o0.add(runnable);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m13922a(Runnable runnable, long j) {
        this.f12589V.postDelayed(runnable, j);
        this.f12608o0.add(runnable);
    }
}
