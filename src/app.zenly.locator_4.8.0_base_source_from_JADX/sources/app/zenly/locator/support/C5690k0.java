package app.zenly.locator.support;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import app.zenly.android.base.util.C1297b;
import app.zenly.android.feature.polenta.widget.ScreenBar;
import app.zenly.locator.R;
import app.zenly.locator.core.p072ui.controller.C3103g.C3106c;
import app.zenly.locator.core.p072ui.controller.DraggableDialogController.ExitListener;
import app.zenly.locator.p143s.C5343a;
import app.zenly.locator.p143s.p148l.C5447b;
import app.zenly.locator.p143s.p148l.C5448c;
import app.zenly.locator.p143s.p155r.C5498a;
import app.zenly.locator.p143s.p155r.C5498a.C5500b;
import app.zenly.locator.p143s.p155r.C5498a.C5501c;
import app.zenly.locator.report.base.ReportFeedbackController;
import app.zenly.locator.support.C5724n0.C5733d;
import app.zenly.locator.support.p168di.C5665b;
import com.bluelinelabs.conductor.C8819d;
import com.bluelinelabs.conductor.C8831g;
import com.bluelinelabs.conductor.C8836h;
import com.bluelinelabs.conductor.ControllerChangeHandler;
import com.bluelinelabs.conductor.changehandler.C8818e;
import p213co.znly.models.services.C7973a0;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.p390h.p392c.C12295a;

/* renamed from: app.zenly.locator.support.k0 */
public final class C5690k0 extends ReportFeedbackController {

    /* renamed from: Z */
    private C5724n0 f14476Z;

    /* renamed from: a0 */
    private ScreenBar f14477a0;

    /* renamed from: b0 */
    private ViewGroup f14478b0;

    /* renamed from: c0 */
    private TextView f14479c0;

    /* renamed from: d0 */
    private TextView f14480d0;

    /* renamed from: e0 */
    private C5688j0 f14481e0;

    /* renamed from: f0 */
    private final C12275b f14482f0 = new C12275b();

    /* renamed from: app.zenly.locator.support.k0$a */
    static /* synthetic */ class C5691a {

        /* renamed from: a */
        static final /* synthetic */ int[] f14483a = new int[C5733d.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                app.zenly.locator.support.n0$d[] r0 = app.zenly.locator.support.C5724n0.C5733d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f14483a = r0
                int[] r0 = f14483a     // Catch:{ NoSuchFieldError -> 0x0014 }
                app.zenly.locator.support.n0$d r1 = app.zenly.locator.support.C5724n0.C5733d.REPORT_A_PROBLEM     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f14483a     // Catch:{ NoSuchFieldError -> 0x001f }
                app.zenly.locator.support.n0$d r1 = app.zenly.locator.support.C5724n0.C5733d.ASK_A_QUESTION     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f14483a     // Catch:{ NoSuchFieldError -> 0x002a }
                app.zenly.locator.support.n0$d r1 = app.zenly.locator.support.C5724n0.C5733d.SEND_FEEDBACK     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.support.C5690k0.C5691a.<clinit>():void");
        }
    }

    public C5690k0() {
        super(new Bundle());
    }

    /* renamed from: G */
    private void m16030G() {
        if (this.f14481e0.mo13346a() != null) {
            this.f14478b0.setVisibility(0);
            this.f14479c0.setVisibility(0);
            this.f14479c0.setText(this.f14481e0.mo13346a().getComposerSubtitle());
            this.f14479c0.setOnClickListener(null);
            return;
        }
        this.f14478b0.setVisibility(8);
    }

    /* renamed from: H */
    private void m16031H() {
        int i = C5691a.f14483a[this.f14481e0.mo13356c().ordinal()];
        if (i == 1) {
            this.f13739V.setHint(R.string.report_common_troubleshooting_placeholder);
        } else if (i == 2) {
            this.f13739V.setHint(R.string.support_question_placeholder);
        } else if (i == 3) {
            this.f13739V.setHint(this.f14481e0.mo13346a().getComposerPlaceholder());
        }
    }

    /* renamed from: I */
    private void m16032I() {
        if (this.f14481e0.mo13346a() == null) {
            return;
        }
        if (this.f14481e0.mo13346a().getSubcategoriesCount() > 0) {
            this.f14480d0.setVisibility(0);
            this.f14480d0.setText(this.f14481e0.mo13354b().getTitle());
            this.f14480d0.setOnClickListener(new C5687j(this));
            return;
        }
        this.f14480d0.setVisibility(8);
    }

    /* renamed from: J */
    private void m16033J() {
        int i = C5691a.f14483a[this.f14481e0.mo13356c().ordinal()];
        if (i == 1) {
            this.f14477a0.setTitle((int) R.string.support_helpcenter_troubleshooting_create_ticket);
        } else if (i != 2) {
            this.f14477a0.setTitle(this.f14481e0.mo13356c().mo13427c());
        } else {
            this.f14477a0.setTitle((int) R.string.support_question_title);
        }
    }

    /* renamed from: K */
    private void m16034K() {
        C1297b.m6237a((View) this.f13739V);
        C5693l0 l0Var = new C5693l0();
        l0Var.mo23929b(mo23947l());
        C8831g k = mo23946k();
        C8836h a = C8836h.m21058a((C8819d) l0Var);
        a.mo24026b(new C8818e());
        a.mo24023a((ControllerChangeHandler) new C8818e());
        k.mo23991a(a);
    }

    /* renamed from: L */
    private void m16035L() {
        C1297b.m6241b(this.f13739V);
        Toast.makeText(mo23920b(), R.string.commons_content_oopserror, 0).show();
    }

    /* renamed from: M */
    private void m16036M() {
        C3106c cVar = new C3106c(mo23920b());
        cVar.mo9331a(2131231400);
        cVar.mo9349f((int) R.string.commons_label_thanks);
        cVar.mo9348e((int) R.string.support_report_success_message);
        cVar.mo9345c((int) R.string.support_report_success_button);
        cVar.mo9300a((ExitListener) new C5785p(this)).mo9344b().mo9296j(mo23920b());
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public void mo7192B() {
        C5498a.m15600a((Context) mo23920b()).mo13123a(C5501c.LIGHT, C5500b.NAV);
        mo23946k().mo23997a((C8819d) this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public void mo12781C() {
        mo23946k().mo24015o();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7065a(Context context) {
        this.f14476Z = C5665b.m15987a(context).mo13329a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7052b(View view) {
        super.mo7052b(view);
        if (mo23947l() instanceof C5659d0) {
            this.f14481e0 = ((C5659d0) mo23947l()).mo7192B();
            m16033J();
            m16030G();
            m16032I();
            m16031H();
            C1297b.m6241b(this.f13739V);
            mo12770a((OnReasonListener) new C5685i(this, view));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo7053d(View view) {
        super.mo7053d(view);
        mo12771e(false);
        this.f14482f0.mo36401a();
    }

    /* renamed from: e */
    public /* synthetic */ void mo7061e(View view) {
        C5498a.m15600a((Context) mo23920b()).mo13123a(C5501c.LIGHT, C5500b.NAV);
        m16034K();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo7054a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View a = super.mo7054a(layoutInflater, viewGroup);
        this.f14477a0 = (ScreenBar) a.findViewById(R.id.screen_bar);
        this.f14478b0 = (ViewGroup) a.findViewById(R.id.report_feedback_description_container);
        this.f14479c0 = (TextView) a.findViewById(R.id.report_feedback_description);
        this.f14480d0 = (TextView) a.findViewById(R.id.report_feedback_tag);
        ((ImageView) a.findViewById(R.id.report_feedback_next)).setImageResource(2131231403);
        return a;
    }

    /* renamed from: a */
    public /* synthetic */ void mo13358a(View view, String str) {
        C5498a.m15600a((Context) mo23920b()).mo13123a(C5501c.LIGHT, C5500b.NAV);
        mo12771e(true);
        this.f14481e0.mo13351a(str);
        this.f14482f0.add(this.f14476Z.mo13394a(this.f14481e0.mo13347a(view.getContext(), this.f14476Z)).mo36428a(C12295a.m32802a()).mo36412a((Consumer<? super T>) new C5692l<Object>(this), (Consumer<? super Throwable>) new C5689k<Object>(this)));
    }

    /* renamed from: a */
    public /* synthetic */ void mo13359a(C7973a0 a0Var) throws Exception {
        String d = C5447b.m15477d(C5448c.m15478a());
        C5343a.m15160U().mo12797L();
        C5343a.m15160U().mo12862b(d);
        mo12771e(false);
        m16036M();
    }

    /* renamed from: a */
    public /* synthetic */ void mo13360a(Throwable th) throws Exception {
        mo12771e(false);
        m16035L();
    }
}
