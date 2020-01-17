package app.zenly.locator.onboarding;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import app.zenly.android.feature.polenta.widget.EmptyView;
import app.zenly.locator.R;
import app.zenly.locator.core.invitations.p068g0.C2594d;
import app.zenly.locator.core.util.C3245z;
import app.zenly.locator.core.widget.C3275i;
import app.zenly.locator.core.widget.C3277j;
import app.zenly.locator.core.widget.TextViewLinkAction;
import app.zenly.locator.decision.C3444a;
import app.zenly.locator.onboarding.BaseSignupController.SignupListener;
import app.zenly.locator.p143s.C5343a;
import app.zenly.locator.p143s.C5343a.C5346c;
import app.zenly.locator.p143s.C5407g;
import app.zenly.locator.p143s.C5407g.C5408a;
import app.zenly.locator.p143s.p148l.C5448c;
import app.zenly.locator.p143s.p155r.C5498a;
import app.zenly.locator.p143s.p155r.C5498a.C5499a;
import app.zenly.locator.p143s.p155r.C5498a.C5500b;
import app.zenly.locator.p143s.p155r.C5498a.C5501c;
import app.zenly.locator.p143s.p162w.C5566b;
import app.zenly.locator.p143s.p162w.C5566b.C5567a;
import kotlin.C12956q;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12933k;
import kotlin.jvm.internal.C12940r;
import kotlin.jvm.internal.C12941s;
import kotlin.jvm.internal.C12946x;
import kotlin.reflect.KProperty;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.models.C6952b1;
import p213co.znly.models.C6952b1.C6954b;
import p213co.znly.models.C6952b1.C6956c;
import p213co.znly.models.C7402n2;
import p213co.znly.models.core.C7174n2.C7175a;
import p213co.znly.models.services.C8275s4;
import p213co.znly.models.services.C8275s4.C8277b;
import p213co.znly.models.services.C8296t4;
import p213co.znly.models.services.C8296t4.C8297a;
import p213co.znly.models.services.C8309u4;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.p390h.p392c.C12295a;
import p389io.reactivex.p405m.C12773a;

/* renamed from: app.zenly.locator.onboarding.h3 */
public final class C4813h3 extends BaseSignupController {

    /* renamed from: W */
    static final /* synthetic */ KProperty[] f12745W;
    /* access modifiers changed from: private */

    /* renamed from: T */
    public final C12275b f12746T;

    /* renamed from: U */
    private final Lazy f12747U;

    /* renamed from: V */
    private final Lazy f12748V;

    /* renamed from: app.zenly.locator.onboarding.h3$a */
    public static final class C4814a {
        private C4814a() {
        }

        public /* synthetic */ C4814a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.locator.onboarding.h3$b */
    static final class C4815b extends C12933k implements Function0<C12956q> {

        /* renamed from: f */
        final /* synthetic */ C4813h3 f12749f;

        /* renamed from: g */
        final /* synthetic */ EmptyView f12750g;

        /* renamed from: h */
        final /* synthetic */ Context f12751h;

        /* renamed from: i */
        final /* synthetic */ C8296t4 f12752i;

        /* renamed from: app.zenly.locator.onboarding.h3$b$a */
        static final class C4816a<T> implements Consumer<C8309u4> {

            /* renamed from: e */
            final /* synthetic */ C4815b f12753e;

            C4816a(C4815b bVar) {
                this.f12753e = bVar;
            }

            /* renamed from: a */
            public final void accept(C8309u4 u4Var) {
                this.f12753e.f12750g.setLoading(false);
                C4813h3 h3Var = this.f12753e.f12749f;
                C12932j.m33815a((Object) u4Var, "it");
                h3Var.m14098a(u4Var);
            }
        }

        /* renamed from: app.zenly.locator.onboarding.h3$b$b */
        static final class C4817b<T> implements Consumer<Throwable> {

            /* renamed from: e */
            final /* synthetic */ C4815b f12754e;

            C4817b(C4815b bVar) {
                this.f12754e = bVar;
            }

            /* renamed from: a */
            public final void accept(Throwable th) {
                this.f12754e.f12750g.setLoading(false);
                this.f12754e.f12749f.m14092G();
            }
        }

        C4815b(C4813h3 h3Var, EmptyView emptyView, Context context, C8296t4 t4Var) {
            this.f12749f = h3Var;
            this.f12750g = emptyView;
            this.f12751h = context;
            this.f12752i = t4Var;
            super(0);
        }

        public final void invoke() {
            this.f12750g.setLoading(true);
            C5499a aVar = C5498a.f14119e;
            Context context = this.f12751h;
            C12932j.m33815a((Object) context, "context");
            C5498a.m15602a(aVar.mo13125a(context), C5501c.LIGHT, C5500b.NAV, 0, 4, null);
            C8297a aVar2 = (C8297a) this.f12752i.toBuilder();
            C12932j.m33815a((Object) aVar2, "requestBuilder");
            aVar2.mo22259a(false);
            Disposable a = C5448c.m15478a().sessionVerify((C8296t4) aVar2.build()).mo36428a(C12295a.m32802a()).mo36412a((Consumer<? super T>) new C4816a<Object>(this), (Consumer<? super Throwable>) new C4817b<Object>(this));
            C12932j.m33815a((Object) a, "ZenlyCoreProvider.get().…                       })");
            C12773a.m33432a(a, this.f12749f.f12746T);
        }
    }

    /* renamed from: app.zenly.locator.onboarding.h3$c */
    static final class C4818c extends C12933k implements Function0<C12956q> {

        /* renamed from: f */
        final /* synthetic */ C4813h3 f12755f;

        /* renamed from: g */
        final /* synthetic */ Context f12756g;

        C4818c(C4813h3 h3Var, Context context) {
            this.f12755f = h3Var;
            this.f12756g = context;
            super(0);
        }

        public final void invoke() {
            C5499a aVar = C5498a.f14119e;
            Context context = this.f12756g;
            String str = "context";
            C12932j.m33815a((Object) context, str);
            C5498a.m15602a(aVar.mo13125a(context), C5501c.LIGHT, C5500b.NAV, 0, 4, null);
            C4813h3 h3Var = this.f12755f;
            Context context2 = this.f12756g;
            C12932j.m33815a((Object) context2, str);
            h3Var.m14094a(context2, "Under review");
        }
    }

    /* renamed from: app.zenly.locator.onboarding.h3$d */
    static final class C4819d extends C12933k implements Function0<C12956q> {

        /* renamed from: f */
        final /* synthetic */ C4813h3 f12757f;

        /* renamed from: g */
        final /* synthetic */ Context f12758g;

        C4819d(C4813h3 h3Var, Context context) {
            this.f12757f = h3Var;
            this.f12758g = context;
            super(0);
        }

        public final void invoke() {
            C5499a aVar = C5498a.f14119e;
            Context context = this.f12758g;
            String str = "context";
            C12932j.m33815a((Object) context, str);
            C5498a.m15602a(aVar.mo13125a(context), C5501c.LIGHT, C5500b.NAV, 0, 4, null);
            C4813h3 h3Var = this.f12757f;
            Context context2 = this.f12758g;
            C12932j.m33815a((Object) context2, str);
            h3Var.m14094a(context2, "Deactivated");
        }
    }

    /* renamed from: app.zenly.locator.onboarding.h3$e */
    static final class C4820e extends C12933k implements Function0<C12956q> {

        /* renamed from: f */
        final /* synthetic */ C4813h3 f12759f;

        /* renamed from: g */
        final /* synthetic */ Context f12760g;

        C4820e(C4813h3 h3Var, Context context) {
            this.f12759f = h3Var;
            this.f12760g = context;
            super(0);
        }

        public final void invoke() {
            C5499a aVar = C5498a.f14119e;
            Context context = this.f12760g;
            String str = "context";
            C12932j.m33815a((Object) context, str);
            C5498a.m15602a(aVar.mo13125a(context), C5501c.LIGHT, C5500b.NAV, 0, 4, null);
            C4813h3 h3Var = this.f12759f;
            Context context2 = this.f12760g;
            C12932j.m33815a((Object) context2, str);
            h3Var.m14094a(context2, "Suspended");
        }
    }

    /* renamed from: app.zenly.locator.onboarding.h3$f */
    public static final class C4821f implements TextViewLinkAction {

        /* renamed from: a */
        final /* synthetic */ C4813h3 f12761a;

        C4821f(C4813h3 h3Var) {
            this.f12761a = h3Var;
        }

        public void execute(C3277j jVar) {
            C12932j.m33818b(jVar, "link");
            C4813h3 h3Var = this.f12761a;
            C5567a aVar = C5566b.f14227Q;
            String c = jVar.mo9729c();
            if (c != null) {
                h3Var.mo11927a(aVar.mo13178a(c));
            } else {
                C12932j.m33814a();
                throw null;
            }
        }
    }

    /* renamed from: app.zenly.locator.onboarding.h3$g */
    public static final class C4822g implements TextViewLinkAction {

        /* renamed from: a */
        final /* synthetic */ C4813h3 f12762a;

        C4822g(C4813h3 h3Var) {
            this.f12762a = h3Var;
        }

        public void execute(C3277j jVar) {
            C12932j.m33818b(jVar, "link");
            C4813h3 h3Var = this.f12762a;
            C5567a aVar = C5566b.f14227Q;
            String c = jVar.mo9729c();
            if (c != null) {
                h3Var.mo11927a(aVar.mo13178a(c));
            } else {
                C12932j.m33814a();
                throw null;
            }
        }
    }

    /* renamed from: app.zenly.locator.onboarding.h3$h */
    public static final class C4823h implements TextViewLinkAction {

        /* renamed from: a */
        final /* synthetic */ C4813h3 f12763a;

        C4823h(C4813h3 h3Var) {
            this.f12763a = h3Var;
        }

        public void execute(C3277j jVar) {
            C12932j.m33818b(jVar, "link");
            C4813h3 h3Var = this.f12763a;
            C5567a aVar = C5566b.f14227Q;
            String c = jVar.mo9729c();
            if (c != null) {
                h3Var.mo11927a(aVar.mo13178a(c));
            } else {
                C12932j.m33814a();
                throw null;
            }
        }
    }

    /* renamed from: app.zenly.locator.onboarding.h3$i */
    static final class C4824i extends C12933k implements Function0<C8275s4> {

        /* renamed from: f */
        final /* synthetic */ C4813h3 f12764f;

        C4824i(C4813h3 h3Var) {
            this.f12764f = h3Var;
            super(0);
        }

        public final C8275s4 invoke() {
            try {
                return C8275s4.parseFrom(this.f12764f.mo23933c().getByteArray("InvalidSessionController.verifyError"));
            } catch (InvalidProtocolBufferException unused) {
                return null;
            }
        }
    }

    /* renamed from: app.zenly.locator.onboarding.h3$j */
    static final class C4825j extends C12933k implements Function0<C8296t4> {

        /* renamed from: f */
        final /* synthetic */ C4813h3 f12765f;

        C4825j(C4813h3 h3Var) {
            this.f12765f = h3Var;
            super(0);
        }

        public final C8296t4 invoke() {
            try {
                return C8296t4.parseFrom(this.f12765f.mo23933c().getByteArray("InvalidSessionController.verifyRequest"));
            } catch (InvalidProtocolBufferException unused) {
                return null;
            }
        }
    }

    static {
        Class<C4813h3> cls = C4813h3.class;
        C12941s sVar = new C12941s(C12946x.m33834a((Class) cls), "verifyRequest", "getVerifyRequest()Lco/znly/models/services/ZenlyProto$SessionVerifyRequest;");
        C12946x.m33839a((C12940r) sVar);
        C12941s sVar2 = new C12941s(C12946x.m33834a((Class) cls), "verifyError", "getVerifyError()Lco/znly/models/services/ZenlyProto$SessionVerifyError;");
        C12946x.m33839a((C12940r) sVar2);
        f12745W = new KProperty[]{sVar, sVar2};
        new C4814a(null);
    }

    public C4813h3(Bundle bundle) {
        C12932j.m33818b(bundle, "bundle");
        super(bundle);
        this.f12746T = new C12275b();
        this.f12747U = C12896f.m33751a(new C4825j(this));
        this.f12748V = C12896f.m33751a(new C4824i(this));
    }

    /* renamed from: E */
    private final C8275s4 m14090E() {
        Lazy lazy = this.f12748V;
        KProperty kProperty = f12745W[1];
        return (C8275s4) lazy.getValue();
    }

    /* renamed from: F */
    private final C8296t4 m14091F() {
        Lazy lazy = this.f12747U;
        KProperty kProperty = f12745W[0];
        return (C8296t4) lazy.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: G */
    public final void m14092G() {
        View m = mo23948m();
        if (m != null) {
            C5499a aVar = C5498a.f14119e;
            C12932j.m33815a((Object) m, "it");
            Context context = m.getContext();
            C12932j.m33815a((Object) context, "it.context");
            C5498a.m15602a(aVar.mo13125a(context), C5501c.LIGHT, C5500b.NAV, 0, 4, null);
            new Builder(m.getContext()).setTitle(R.string.onboarding_support_modal_reactivation_title).setMessage(R.string.onboarding_support_modal_reactivation_message).create().show();
        }
    }

    /* renamed from: c */
    private final void m14101c(TextView textView) {
        C3277j jVar = new C3277j(R.string.onboarding_support_footer_replace_tos, R.string.app_settings_termsurl, null, 4, null);
        C3275i.m10385a(textView, R.string.onboarding_support_footer_tos, C12846n.m33635a(jVar), new C4823h(this));
    }

    /* renamed from: B */
    public int mo7192B() {
        return 7;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo7053d(View view) {
        C12932j.m33818b(view, "view");
        this.f12746T.mo36401a();
        super.mo7053d(view);
    }

    public void onWindowInsetsChanged(View view, Rect rect) {
        C12932j.m33818b(view, "view");
        C12932j.m33818b(rect, "insets");
        super.onWindowInsetsChanged(view, rect);
        view.setPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: b */
    private final void m14099b(TextView textView) {
        C3277j jVar = new C3277j(R.string.onboarding_support_footer_replace_tos, R.string.app_settings_termsurl, null, 4, null);
        C3277j jVar2 = new C3277j(R.string.onboarding_support_footer_replace_pp, R.string.app_settings_privacyurl, null, 4, null);
        C3275i.m10385a(textView, R.string.onboarding_support_footer_pptos, C12848o.m33643b((Object[]) new C3277j[]{jVar, jVar2}), new C4822g(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo7054a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        String str;
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        C12932j.m33818b(layoutInflater2, "inflater");
        C12932j.m33818b(viewGroup2, "container");
        View inflate = layoutInflater2.inflate(R.layout.controller_invalid_session, viewGroup2, false);
        View findViewById = inflate.findViewById(R.id.main_empty_view);
        C12932j.m33815a((Object) findViewById, "view.findViewById(R.id.main_empty_view)");
        EmptyView emptyView = (EmptyView) findViewById;
        View findViewById2 = inflate.findViewById(R.id.footer);
        C12932j.m33815a((Object) findViewById2, "view.findViewById(R.id.footer)");
        TextView textView = (TextView) findViewById2;
        C12932j.m33815a((Object) inflate, "view");
        Context context = inflate.getContext();
        if (m14091F() == null || m14090E() == null) {
            return inflate;
        }
        C8296t4 F = m14091F();
        if (F != null) {
            C8275s4 E = m14090E();
            if (E != null) {
                C8277b code = E.getCode();
                if (code != null) {
                    int i = C4830i3.f12772c[code.ordinal()];
                    String str2 = "context.resources.getQua…sage, daysLeft, daysLeft)";
                    String str3 = "context";
                    if (i == 1) {
                        emptyView.setImageResource(2131231634);
                        emptyView.setTitle((int) R.string.onboarding_support_deactivation_title);
                        Timestamp deletionDate = E.getDeletionDate();
                        C12932j.m33815a((Object) deletionDate, "error.deletionDate");
                        int b = C3245z.m10283b(deletionDate);
                        C12932j.m33815a((Object) context, str3);
                        String quantityString = context.getResources().getQuantityString(R.plurals.onboarding_support_deactivation_message, b, new Object[]{Integer.valueOf(b)});
                        C12932j.m33815a((Object) quantityString, str2);
                        if (b <= 1) {
                            quantityString = context.getString(R.string.onboarding_support_deactivation_message_tomorrow);
                            C12932j.m33815a((Object) quantityString, "context.getString(R.stri…ivation_message_tomorrow)");
                        }
                        emptyView.setSubtitle((CharSequence) quantityString);
                        emptyView.setActionText((int) R.string.onboarding_support_deactivation_button);
                        emptyView.mo6794a(new C4815b(this, emptyView, context, F));
                        m14095a(textView);
                        C5343a.m15160U().mo12816a(C5346c.DELETION);
                    } else if (i == 2) {
                        C6952b1 phoneNumberProbation = E.getPhoneNumberProbation();
                        String str4 = "error.phoneNumberProbation";
                        C12932j.m33815a((Object) phoneNumberProbation, str4);
                        C6956c type = phoneNumberProbation.getType();
                        if (type != null) {
                            int i2 = C4830i3.f12771b[type.ordinal()];
                            if (i2 != 1) {
                                String str5 = "";
                                if (i2 == 2) {
                                    emptyView.setImageResource(2131231635);
                                    emptyView.setTitle((int) R.string.onboarding_support_ban_title);
                                    emptyView.setSubtitle((int) R.string.onboarding_support_ban_message);
                                    emptyView.setActionText(str5);
                                    m14099b(textView);
                                    C5343a.m15160U().mo12816a(C5346c.BANNED);
                                    C5499a aVar = C5498a.f14119e;
                                    C12932j.m33815a((Object) context, str3);
                                    aVar.mo13125a(context).mo13124a(C5501c.HEAVY, C5500b.ERROR, 2);
                                } else if (i2 == 3) {
                                    C6952b1 phoneNumberProbation2 = E.getPhoneNumberProbation();
                                    C12932j.m33815a((Object) phoneNumberProbation2, str4);
                                    Timestamp until = phoneNumberProbation2.getUntil();
                                    String str6 = "error.phoneNumberProbation.until";
                                    C12932j.m33815a((Object) until, str6);
                                    int b2 = C3245z.m10283b(until);
                                    C6952b1 phoneNumberProbation3 = E.getPhoneNumberProbation();
                                    C12932j.m33815a((Object) phoneNumberProbation3, str4);
                                    C6954b reason = phoneNumberProbation3.getReason();
                                    if (reason != null) {
                                        int i3 = C4830i3.f12770a[reason.ordinal()];
                                        if (i3 == 1) {
                                            emptyView.setImageResource(2131231630);
                                            emptyView.setTitle((int) R.string.onboarding_support_gdpr_title);
                                            C12932j.m33815a((Object) context, str3);
                                            String quantityString2 = context.getResources().getQuantityString(R.plurals.onboarding_support_gpdr_message, b2, new Object[]{Integer.valueOf(b2)});
                                            C12932j.m33815a((Object) quantityString2, str2);
                                            if (b2 <= 1) {
                                                quantityString2 = context.getString(R.string.onboarding_support_gpdr_message_tomorrow);
                                                C12932j.m33815a((Object) quantityString2, "context.getString(R.stri…rt_gpdr_message_tomorrow)");
                                            }
                                            emptyView.setSubtitle((CharSequence) quantityString2);
                                            emptyView.setActionText(str5);
                                            m14099b(textView);
                                            C5343a.m15160U().mo12816a(C5346c.GDPR);
                                        } else if (i3 == 2) {
                                            emptyView.setImageResource(2131231635);
                                            emptyView.setTitle((int) R.string.onboarding_support_block_title);
                                            C6952b1 phoneNumberProbation4 = E.getPhoneNumberProbation();
                                            C12932j.m33815a((Object) phoneNumberProbation4, str4);
                                            Timestamp until2 = phoneNumberProbation4.getUntil();
                                            C12932j.m33815a((Object) until2, str6);
                                            int d = C3245z.m10285d(until2) + 1;
                                            if (d >= 0 && 48 >= d) {
                                                C12932j.m33815a((Object) context, str3);
                                                str = context.getResources().getQuantityString(R.plurals.onboarding_support_block_message_hours, d, new Object[]{Integer.valueOf(d)});
                                            } else {
                                                C12932j.m33815a((Object) context, str3);
                                                str = context.getResources().getQuantityString(R.plurals.onboarding_support_block_message_days, b2, new Object[]{Integer.valueOf(b2)});
                                            }
                                            C12932j.m33815a((Object) str, "when (hoursLeft) {\n     …                        }");
                                            emptyView.setSubtitle((CharSequence) str);
                                            emptyView.setActionText((int) R.string.onboarding_support_block_button);
                                            emptyView.setActionImportance(1);
                                            emptyView.mo6794a(new C4819d(this, context));
                                            m14101c(textView);
                                            C5343a.m15160U().mo12816a(C5346c.SUSPENDED_BLOCKED_TOO_MANY_TIMES);
                                        }
                                    }
                                    emptyView.setImageResource(2131231635);
                                    emptyView.setTitle((int) R.string.onboarding_support_suspension_title);
                                    C12932j.m33815a((Object) context, str3);
                                    String quantityString3 = context.getResources().getQuantityString(R.plurals.onboarding_support_suspension_message, b2, new Object[]{Integer.valueOf(b2)});
                                    C12932j.m33815a((Object) quantityString3, str2);
                                    if (b2 <= 1) {
                                        quantityString3 = context.getString(R.string.onboarding_support_suspension_message_tomorrow);
                                        C12932j.m33815a((Object) quantityString3, "context.getString(R.stri…pension_message_tomorrow)");
                                    }
                                    emptyView.setSubtitle((CharSequence) quantityString3);
                                    emptyView.setActionText((int) R.string.onboarding_support_suspension_button);
                                    emptyView.setActionImportance(1);
                                    emptyView.mo6794a(new C4820e(this, context));
                                    m14101c(textView);
                                    C5343a.m15160U().mo12816a(C5346c.SUSPENDED);
                                }
                            } else {
                                emptyView.setImageResource(2131231634);
                                emptyView.setTitle((int) R.string.onboarding_support_report_title);
                                emptyView.setSubtitle((int) R.string.onboarding_support_report_message);
                                emptyView.setActionText((int) R.string.onboarding_support_report_button);
                                emptyView.setActionImportance(1);
                                emptyView.mo6794a(new C4818c(this, context));
                                m14101c(textView);
                                C5343a.m15160U().mo12816a(C5346c.UNDER_REVIEW);
                            }
                        }
                    }
                }
                return inflate;
            }
            C12932j.m33814a();
            throw null;
        }
        C12932j.m33814a();
        throw null;
    }

    public C4813h3(C8296t4 t4Var, C8275s4 s4Var) {
        C12932j.m33818b(t4Var, "verifyRequest");
        C12932j.m33818b(s4Var, "verifyError");
        Bundle bundle = new Bundle();
        bundle.putByteArray("InvalidSessionController.verifyRequest", t4Var.toByteArray());
        bundle.putByteArray("InvalidSessionController.verifyError", s4Var.toByteArray());
        this(bundle);
    }

    /* renamed from: a */
    private final void m14095a(TextView textView) {
        C3277j jVar = new C3277j(R.string.onboarding_support_footer_replace_pp, R.string.app_settings_privacyurl, null, 4, null);
        C3275i.m10385a(textView, R.string.onboarding_support_footer_pp, C12846n.m33635a(jVar), new C4821f(this));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r0 != null) goto L_0x000f;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m14094a(android.content.Context r6, java.lang.String r7) {
        /*
            r5 = this;
            co.znly.models.services.t4 r0 = r5.m14091F()
            if (r0 == 0) goto L_0x000d
            java.lang.String r0 = r0.getPhoneNumber()
            if (r0 == 0) goto L_0x000d
            goto L_0x000f
        L_0x000d:
            java.lang.String r0 = "unknown"
        L_0x000f:
            r1 = 2132018264(0x7f140458, float:1.967483E38)
            java.lang.String r1 = r6.getString(r1)
            java.lang.String r2 = "context.getString(R.string.signup_legal_email)"
            kotlin.jvm.internal.C12932j.m33815a(r1, r2)
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r3 = "android.intent.action.SENDTO"
            r2.<init>(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "mailto:"
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            android.net.Uri r1 = android.net.Uri.parse(r1)
            r2.setData(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r7)
            java.lang.String r7 = " account requesting contact: "
            r1.append(r7)
            r1.append(r0)
            java.lang.String r7 = r1.toString()
            java.lang.String r0 = "android.intent.extra.SUBJECT"
            r2.putExtra(r0, r7)
            boolean r7 = p250f.p251a.p252a.p253a.p255e.C7660b.m18653a(r6, r2)
            if (r7 != 0) goto L_0x006f
            android.app.AlertDialog$Builder r7 = new android.app.AlertDialog$Builder
            r7.<init>(r6)
            r6 = 2132017893(0x7f1402e5, float:1.9674077E38)
            android.app.AlertDialog$Builder r6 = r7.setTitle(r6)
            r7 = 2132017892(0x7f1402e4, float:1.9674075E38)
            android.app.AlertDialog$Builder r6 = r6.setMessage(r7)
            r6.show()
        L_0x006f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.onboarding.C4813h3.m14094a(android.content.Context, java.lang.String):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m14098a(C8309u4 u4Var) {
        if (u4Var.hasError()) {
            C8275s4 error = u4Var.getError();
            C12932j.m33815a((Object) error, "response.error");
            if (error.getCode() != C8277b.CODE_SUCCESS) {
                m14092G();
                return;
            }
        }
        SignupListener signupListener = this.f12511Q;
        if (signupListener != null) {
            C12932j.m33815a((Object) signupListener, "mListener");
            C7175a cache = signupListener.getCache();
            C12932j.m33815a((Object) cache, "mListener.cache");
            cache.mo19165a(u4Var.getSession());
            this.f12511Q.saveCache();
        }
        C7402n2 session = u4Var.getSession();
        C12932j.m33815a((Object) session, "response.session");
        boolean isNewUser = session.getIsNewUser();
        C4847l3.f12795c.mo12083a().mo12075b(!isNewUser);
        Activity A = mo9304A();
        String str = "requireActivity()";
        C12932j.m33815a((Object) A, str);
        if (C3444a.m10686a(A).mo6511a("feature:broadcastInvite")) {
            C5408a aVar = C5407g.f13966d;
            Activity A2 = mo9304A();
            C12932j.m33815a((Object) A2, str);
            new C2594d(aVar.mo12991a(A2).mo12986h()).mo8712h(isNewUser);
        }
        C5343a.m15160U().mo12872d();
        View m = mo23948m();
        if (m != null) {
            C5499a aVar2 = C5498a.f14119e;
            C12932j.m33815a((Object) m, "it");
            Context context = m.getContext();
            C12932j.m33815a((Object) context, "it.context");
            C5498a.m15602a(aVar2.mo13125a(context), C5501c.LIGHT, C5500b.NAV, 0, 4, null);
        }
        mo11926D();
    }
}
