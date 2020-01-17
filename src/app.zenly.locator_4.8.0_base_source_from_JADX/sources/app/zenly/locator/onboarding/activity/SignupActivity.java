package app.zenly.locator.onboarding.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.core.content.C0540a;
import app.zenly.locator.MainActivity;
import app.zenly.locator.R;
import app.zenly.locator.controllers.country.C2426b;
import app.zenly.locator.core.app.BaseActivity;
import app.zenly.locator.core.helper.C2513e;
import app.zenly.locator.core.invitations.C2545e0;
import app.zenly.locator.core.invitations.p068g0.C2593c;
import app.zenly.locator.core.invitations.p068g0.C2594d;
import app.zenly.locator.core.models.C2885g;
import app.zenly.locator.decision.C3444a;
import app.zenly.locator.onboarding.BaseSignupController;
import app.zenly.locator.onboarding.BaseSignupController.SignupListener;
import app.zenly.locator.onboarding.C4756a3;
import app.zenly.locator.onboarding.C4766b3;
import app.zenly.locator.onboarding.C4778c3;
import app.zenly.locator.onboarding.C4783d3;
import app.zenly.locator.onboarding.C4808g3;
import app.zenly.locator.onboarding.C4813h3;
import app.zenly.locator.onboarding.C4835j3;
import app.zenly.locator.onboarding.C4842k3;
import app.zenly.locator.onboarding.C4855m3;
import app.zenly.locator.onboarding.C4861n3;
import app.zenly.locator.onboarding.C4878p3;
import app.zenly.locator.onboarding.C4891r3;
import app.zenly.locator.onboarding.C4911t3;
import app.zenly.locator.onboarding.C4916u3;
import app.zenly.locator.onboarding.C4955z2;
import app.zenly.locator.onboarding.p124x3.C4942a;
import app.zenly.locator.onboarding.p125y3.C4947a;
import app.zenly.locator.p143s.C5407g;
import app.zenly.locator.p143s.p148l.C5448c;
import app.zenly.locator.p143s.p162w.C5566b;
import app.zenly.locator.p208y.C6288c;
import app.zenly.locator.p208y.C6288c.C6291c;
import app.zenly.locator.p208y.C6300h;
import com.bluelinelabs.conductor.C8811c;
import com.bluelinelabs.conductor.C8819d;
import com.bluelinelabs.conductor.C8831g;
import com.bluelinelabs.conductor.C8836h;
import com.bluelinelabs.conductor.ControllerChangeHandler;
import com.bluelinelabs.conductor.changehandler.C8816c;
import com.bluelinelabs.conductor.changehandler.C8818e;
import java.util.Locale;
import p213co.znly.core.romutils.ResolutionSolver;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.models.C7402n2.C7404b;
import p213co.znly.models.core.C7123i2;
import p213co.znly.models.core.C7174n2;
import p213co.znly.models.core.C7174n2.C7175a;
import p213co.znly.models.services.C8275s4;
import p213co.znly.models.services.C8275s4.C8277b;
import p213co.znly.models.services.C8296t4;
import p213co.znly.models.services.C8296t4.C8297a;

public class SignupActivity extends BaseActivity implements SignupListener {

    /* renamed from: n */
    private C7175a f12564n;

    /* renamed from: o */
    private C8297a f12565o = null;

    /* renamed from: p */
    private C8275s4 f12566p = null;

    /* renamed from: q */
    private BaseSignupController f12567q;

    /* renamed from: r */
    private C8831g f12568r;

    /* renamed from: s */
    private boolean f12569s;

    /* renamed from: t */
    private Intent f12570t;

    /* renamed from: u */
    private C2594d f12571u;

    /* renamed from: v */
    private C6300h f12572v;

    /* renamed from: a */
    public static Intent m13874a(Activity activity, Intent intent) {
        Intent putExtra = new Intent(activity, SignupActivity.class).addFlags(65536).putExtra("app.zenly.locator.extra.RETURN_INTENT", intent);
        if (!(activity instanceof MainActivity)) {
            putExtra.addFlags(32768);
        }
        return putExtra;
    }

    /* renamed from: b */
    public static Intent m13879b(Activity activity, Intent intent) {
        return m13874a(activity, intent).putExtra("app.zenly.locator.extra.SIGNUP_SINGLE_STEP", 50);
    }

    /* renamed from: c */
    public static Intent m13880c(Activity activity, Intent intent) {
        return m13874a(activity, intent).putExtra("app.zenly.locator.extra.SIGNUP_FULL", true);
    }

    /* renamed from: d */
    public static Intent m13882d(Activity activity, Intent intent) {
        return m13874a(activity, intent).putExtra("app.zenly.locator.extra.SIGNUP_SINGLE_STEP", 40);
    }

    /* renamed from: e */
    public static Intent m13883e(Activity activity, Intent intent) {
        return m13874a(activity, intent).putExtra("app.zenly.locator.extra.SIGNUP_SINGLE_STEP", 5);
    }

    /* renamed from: g */
    private void m13884g() {
        this.f12572v.mo14158e();
        this.f12564n.clear();
    }

    /* renamed from: h */
    private boolean m13885h() {
        boolean a = C3444a.m10686a(this).mo6511a("feature:skipBroadcastInviteFeature");
        if (C2545e0.m8883a(this, Locale.getDefault(), true).isEmpty()) {
            return true;
        }
        if (!a || !this.f12571u.mo8707e()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo6505a() {
        return true;
    }

    /* renamed from: f */
    public boolean mo11998f() {
        return C0540a.m2537a((Context) this, "android.permission.ACCESS_FINE_LOCATION") == 0;
    }

    public C7175a getCache() {
        if (this.f12564n == null) {
            this.f12564n = C7174n2.newBuilder();
        }
        return this.f12564n;
    }

    public void moveBack() {
        m13876a(m13877b(this.f12567q.mo7192B()), true);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.f12568r.mo23857a(i, i2, intent);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        SharedPreferences h = C5407g.m15386a((Context) this).mo12986h();
        this.f12571u = new C2594d(h);
        this.f12572v = new C6300h(h);
        this.f12568r = C8811c.m20828a(this, (ViewGroup) findViewById(R.id.content), bundle);
        getWindow().setSoftInputMode(16);
        this.f12564n = (C7175a) ((C7174n2) C5448c.m15478a().sessionCacheGet().mo36487e(1).mo36446a(C7174n2.getDefaultInstance())).toBuilder();
        Intent intent = getIntent();
        if (!(intent == null || !intent.hasExtra("app.zenly.locator.extra.CLEAR_CACHE") || this.f12564n == null)) {
            m13884g();
        }
        this.f12570t = intent != null ? (Intent) intent.getParcelableExtra("app.zenly.locator.extra.RETURN_INTENT") : null;
        C7175a aVar = this.f12564n;
        if (aVar == null || !aVar.hasBirthdate() || !m13881c(this.f12564n)) {
            if (intent != null) {
                String str = "app.zenly.locator.extra.SIGNUP_SINGLE_STEP";
                if (intent.hasExtra(str)) {
                    this.f12569s = true;
                    m13876a(intent.getIntExtra(str, 10), false);
                    return;
                }
            }
            if (intent != null && intent.hasExtra("app.zenly.locator.extra.SIGNUP_FULL")) {
                C7175a aVar2 = this.f12564n;
                if (aVar2 != null) {
                    String name = aVar2.getName();
                    String phoneNumber = this.f12564n.getPhoneNumber();
                    Timestamp birthdate = this.f12564n.getBirthdate();
                    m13884g();
                    this.f12564n.setName(name);
                    this.f12564n.mo19168a(phoneNumber);
                    this.f12564n.mo19163a(birthdate);
                    saveCache();
                    if (C5407g.m15386a((Context) this).mo12989k()) {
                        m13876a(10, false);
                    } else {
                        m13876a(20, false);
                    }
                    return;
                }
            }
            int a = mo11997a(this.f12564n);
            if (a != 55 || this.f12572v.mo14152a((Context) this)) {
                if (a != 54 || !m13885h()) {
                    m13876a(a, false);
                } else {
                    this.f12571u.mo8698a(true);
                    onStateCompleted(a);
                }
                return;
            }
            onStateCompleted(a);
            return;
        }
        m13876a(C5448c.m15478a().configurationOnboardingAllowAgeGatingRetry() ? 25 : 6, false);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        ResolutionSolver.get().autoResolve(this);
    }

    /* JADX INFO: used method not loaded: app.zenly.locator.y.h.a(android.content.Context):null, types can be incorrect */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0051, code lost:
        r3 = 60;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005b, code lost:
        if (r0.f12572v.mo14152a((android.content.Context) r0) != false) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005d, code lost:
        r3 = 55;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008d, code lost:
        if (r0.f12572v.mo14152a((android.content.Context) r0) != false) goto L_0x005d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onStateCompleted(int r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            boolean r2 = r0.f12569s
            if (r2 == 0) goto L_0x0013
            android.content.Intent r1 = r0.f12570t
            if (r1 == 0) goto L_0x000f
            r0.startActivity(r1)
        L_0x000f:
            r17.finish()
            return
        L_0x0013:
            r2 = 5
            r3 = 32
            r4 = 55
            r5 = 0
            r6 = 40
            r7 = 25
            r8 = 20
            r9 = 10
            r10 = 7
            r11 = 60
            if (r1 == r2) goto L_0x015e
            if (r1 == r10) goto L_0x0151
            if (r1 == r9) goto L_0x014e
            if (r1 == r8) goto L_0x014b
            if (r1 == r7) goto L_0x013e
            if (r1 == r6) goto L_0x013b
            if (r1 == r11) goto L_0x00fa
            switch(r1) {
                case 30: goto L_0x00f7;
                case 31: goto L_0x00a0;
                case 32: goto L_0x009c;
                default: goto L_0x0035;
            }
        L_0x0035:
            switch(r1) {
                case 50: goto L_0x0098;
                case 51: goto L_0x0094;
                case 52: goto L_0x0090;
                case 53: goto L_0x0061;
                case 54: goto L_0x0055;
                case 55: goto L_0x0039;
                default: goto L_0x0038;
            }
        L_0x0038:
            return
        L_0x0039:
            app.zenly.locator.y.h r1 = r0.f12572v
            r1.mo14155b(r5)
            app.zenly.locator.y.c r1 = app.zenly.locator.p208y.C6288c.m17344b()
            app.zenly.locator.y.c$c r2 = app.zenly.locator.p208y.C6288c.C6291c.ONBOARDING
            app.zenly.locator.y.h r3 = r0.f12572v
            java.util.Set r3 = r3.mo14153b()
            int r3 = r3.size()
            r1.mo14138a(r2, r3)
        L_0x0051:
            r3 = 60
            goto L_0x0160
        L_0x0055:
            app.zenly.locator.y.h r1 = r0.f12572v
            boolean r1 = r1.mo14152a(r0)
            if (r1 == 0) goto L_0x0051
        L_0x005d:
            r3 = 55
            goto L_0x0160
        L_0x0061:
            app.zenly.android.feature.base.decision.a r1 = app.zenly.locator.decision.C3444a.m10686a(r17)
            app.zenly.locator.core.invitations.g0.d r2 = r0.f12571u
            boolean r1 = app.zenly.locator.core.invitations.p068g0.C2593c.m8906a(r1, r2)
            r2 = 1
            if (r1 == 0) goto L_0x0080
            java.util.Locale r3 = java.util.Locale.getDefault()
            java.util.List r3 = app.zenly.locator.core.invitations.C2545e0.m8883a(r0, r3, r2)
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x0080
            r3 = 54
            goto L_0x0160
        L_0x0080:
            if (r1 == 0) goto L_0x0087
            app.zenly.locator.core.invitations.g0.d r1 = r0.f12571u
            r1.mo8698a(r2)
        L_0x0087:
            app.zenly.locator.y.h r1 = r0.f12572v
            boolean r1 = r1.mo14152a(r0)
            if (r1 == 0) goto L_0x0051
            goto L_0x005d
        L_0x0090:
            r3 = 53
            goto L_0x0160
        L_0x0094:
            r3 = 52
            goto L_0x0160
        L_0x0098:
            r3 = 51
            goto L_0x0160
        L_0x009c:
            r3 = 40
            goto L_0x0160
        L_0x00a0:
            app.zenly.locator.onboarding.BaseSignupController r1 = r0.f12567q
            boolean r2 = r1 instanceof app.zenly.locator.onboarding.C4766b3
            if (r2 == 0) goto L_0x00b4
            app.zenly.locator.onboarding.b3 r1 = (app.zenly.locator.onboarding.C4766b3) r1
            co.znly.models.services.t4$a r2 = r1.mo12001F()
            r0.f12565o = r2
            co.znly.models.services.s4 r1 = r1.mo12000E()
            r0.f12566p = r1
        L_0x00b4:
            co.znly.models.services.s4 r1 = r0.f12566p
            if (r1 == 0) goto L_0x00c3
            co.znly.models.services.s4$b r1 = r1.getCode()
            co.znly.models.services.s4$b r2 = p213co.znly.models.services.C8275s4.C8277b.CODE_SUCCESS
            if (r1 == r2) goto L_0x00c3
            r3 = 7
            goto L_0x0160
        L_0x00c3:
            app.zenly.locator.experimental.referrer.b r1 = new app.zenly.locator.experimental.referrer.b
            app.zenly.locator.experimental.referrer.e r12 = new app.zenly.locator.experimental.referrer.e
            r12.<init>()
            app.zenly.locator.u.b.a r13 = new app.zenly.locator.u.b.a
            app.zenly.locator.s.a r2 = app.zenly.locator.p143s.C5343a.m15160U()
            app.zenly.locator.core.analytics.tracker.AnalyticsTracker r2 = r2.mo12806a()
            co.znly.core.ZenlyCore r4 = app.zenly.locator.p143s.p148l.C5448c.m15478a()
            r13.<init>(r2, r4)
            app.zenly.android.feature.base.decision.a r14 = app.zenly.locator.decision.C3444a.m10686a(r17)
            com.android.installreferrer.api.a$b r2 = com.android.installreferrer.api.C8695a.m20457a(r17)
            com.android.installreferrer.api.a r15 = r2.mo23483a()
            app.zenly.locator.s.g r2 = app.zenly.locator.p143s.C5407g.m15386a(r17)
            android.content.SharedPreferences r16 = r2.mo12986h()
            r11 = r1
            r11.<init>(r12, r13, r14, r15, r16)
            r1.mo10300c()
            goto L_0x0160
        L_0x00f7:
            r3 = 31
            goto L_0x0160
        L_0x00fa:
            co.znly.models.core.n2$a r1 = r0.f12564n
            boolean r1 = r1.hasSession()
            if (r1 == 0) goto L_0x0119
            app.zenly.locator.s.a r1 = app.zenly.locator.p143s.C5343a.m15160U()
            co.znly.models.core.n2$a r2 = r0.f12564n
            co.znly.models.n2 r2 = r2.getSession()
            java.lang.String r2 = r2.getUserUuid()
            co.znly.models.core.n2$a r3 = r0.f12564n
            co.znly.core.vendor.com.google.protobuf.Timestamp r3 = r3.getBirthdate()
            r1.mo12841a(r2, r3)
        L_0x0119:
            app.zenly.locator.onboarding.l3 r1 = app.zenly.locator.onboarding.C4847l3.m14146j()
            r1.mo12065a()
            android.content.Intent r1 = r0.f12570t
            if (r1 == 0) goto L_0x0137
            r1 = 2130771998(0x7f01001e, float:1.7147102E38)
            r2 = 2130772012(0x7f01002c, float:1.714713E38)
            android.app.ActivityOptions r1 = android.app.ActivityOptions.makeCustomAnimation(r0, r1, r2)
            android.content.Intent r2 = r0.f12570t
            android.os.Bundle r1 = r1.toBundle()
            r0.startActivity(r2, r1)
        L_0x0137:
            r17.finish()
            return
        L_0x013b:
            r3 = 50
            goto L_0x0160
        L_0x013e:
            co.znly.models.core.n2$a r1 = r0.f12564n
            boolean r1 = r0.m13881c(r1)
            if (r1 == 0) goto L_0x0148
            r3 = 6
            goto L_0x0160
        L_0x0148:
            r3 = 30
            goto L_0x0160
        L_0x014b:
            r3 = 25
            goto L_0x0160
        L_0x014e:
            r3 = 20
            goto L_0x0160
        L_0x0151:
            co.znly.models.services.s4 r1 = r0.f12566p
            if (r1 == 0) goto L_0x015d
            co.znly.models.services.s4$b r1 = r1.getCode()
            co.znly.models.services.s4$b r2 = p213co.znly.models.services.C8275s4.C8277b.CODE_IN_DELETION_PROCESS
            if (r1 == r2) goto L_0x0160
        L_0x015d:
            return
        L_0x015e:
            r3 = 10
        L_0x0160:
            r0.m13876a(r3, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.onboarding.activity.SignupActivity.onStateCompleted(int):void");
    }

    public void saveCache() {
        C5448c.m15478a().sessionCacheSet((C7174n2) this.f12564n.build()).mo36508m();
    }

    public void showCountryPicker(C8819d dVar) {
        C7123i2 phoneRegion = getCache().getPhoneRegion();
        C2426b bVar = new C2426b(phoneRegion == null ? null : phoneRegion.getIsoCountryCode());
        bVar.mo23929b(dVar);
        C8831g gVar = this.f12568r;
        C8836h a = C8836h.m21058a((C8819d) bVar);
        a.mo24026b(new C8818e());
        a.mo24023a((ControllerChangeHandler) new C8818e());
        gVar.mo23991a(a);
    }

    public void showWebView(C5566b bVar) {
        mo8413b().mo23991a(C8836h.m21058a((C8819d) bVar));
    }

    /* renamed from: b */
    private int m13877b(int i) {
        if (!(i == 5 || i == 6 || i == 7 || i == 10)) {
            if (i == 20) {
                return 10;
            }
            if (i == 25) {
                return 20;
            }
            if (i == 40) {
                return 31;
            }
            if (i != 60) {
                switch (i) {
                    case 30:
                        return 25;
                    case 31:
                        return 30;
                    case 32:
                        break;
                    default:
                        switch (i) {
                            case 50:
                                return 40;
                            case 51:
                                return 50;
                            case 52:
                                return 51;
                            case 53:
                                return 52;
                            case 54:
                                return 53;
                            case 55:
                                break;
                            default:
                                return 10;
                        }
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("State ");
        sb.append(i);
        sb.append(" has no previous state");
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: c */
    private boolean m13881c(C7175a aVar) {
        return m13878b(aVar) < C2885g.m9359b(this);
    }

    /* renamed from: d */
    public boolean mo6993d() {
        if (this.f12568r.mo24011i()) {
            return true;
        }
        int B = this.f12567q.mo7192B();
        if (B <= 20 || B == 40 || (B == 51 && mo7317e() && mo11998f())) {
            return false;
        }
        m13876a(m13877b(this.f12567q.mo7192B()), true);
        return true;
    }

    /* renamed from: e */
    public boolean mo7317e() {
        return C0540a.m2537a((Context) this, "android.permission.READ_CONTACTS") == 0;
    }

    /* renamed from: b */
    private int m13878b(C7175a aVar) {
        return C4947a.m14276b(C4947a.m14275a(aVar.getBirthdate()));
    }

    /* renamed from: a */
    private void m13876a(int i, boolean z) {
        this.f12567q = m13875a(i);
        C8836h a = C8836h.m21058a((C8819d) this.f12567q);
        if (i != 10) {
            a.mo24026b(z ? new C4942a() : new C8816c());
        }
        this.f12568r.mo24008d(a);
    }

    /* renamed from: a */
    private BaseSignupController m13875a(int i) {
        if (i == 5) {
            return new C4878p3();
        }
        if (i == 6) {
            return new C4911t3();
        }
        if (i == 7) {
            return new C4813h3((C8296t4) this.f12565o.build(), this.f12566p);
        }
        if (i == 10) {
            return new C4808g3();
        }
        if (i == 20) {
            return new C4842k3();
        }
        if (i == 25) {
            return new C4955z2();
        }
        if (i == 40) {
            return new C4835j3();
        }
        if (i == 60) {
            return new C4891r3();
        }
        switch (i) {
            case 30:
                return new C4855m3();
            case 31:
                return new C4766b3();
            case 32:
                return C4916u3.m14241e(this.f12564n.getSession().getIsNewUser());
            default:
                switch (i) {
                    case 50:
                        return new C4778c3();
                    case 51:
                    case 52:
                    case 53:
                        return new C4783d3(i);
                    case 54:
                        return new C4756a3();
                    case 55:
                        C6288c.m17344b().mo14140b(C6291c.ONBOARDING, ResolutionSolver.get().getResolutions(this).size());
                        this.f12572v.mo14155b(true);
                        return C4861n3.m14199a(this.f12572v.mo14149a());
                    default:
                        StringBuilder sb = new StringBuilder();
                        sb.append("State ");
                        sb.append(i);
                        sb.append(" is unknown");
                        throw new IllegalStateException(sb.toString());
                }
        }
    }

    /* renamed from: a */
    public int mo11997a(C7175a aVar) {
        if (new C2513e(this).mo8588d()) {
            return 5;
        }
        if (aVar != null && aVar.getIntroSeen()) {
            if (TextUtils.isEmpty(aVar.getName())) {
                return 20;
            }
            if (!aVar.hasBirthdate()) {
                return 25;
            }
            if (!aVar.hasSession()) {
                return 30;
            }
            if (aVar.getSession().getStatus() != C7404b.STATUS_VALID) {
                return 31;
            }
            C8275s4 s4Var = this.f12566p;
            if (s4Var != null && s4Var.getCode() != C8277b.CODE_SUCCESS) {
                return 7;
            }
            if (!mo11998f()) {
                return 40;
            }
            if (!mo7317e()) {
                return 50;
            }
            if (aVar.getContactPickerDone() < 51) {
                return 51;
            }
            if (aVar.getContactPickerDone() < 52) {
                return 52;
            }
            if (aVar.getContactPickerDone() < 53) {
                return 53;
            }
            if (C2593c.m8906a(C3444a.m10686a(this), this.f12571u) && !this.f12571u.mo8699a()) {
                return 54;
            }
            if (this.f12572v.mo14157d()) {
                return 55;
            }
        }
        return 10;
    }
}
