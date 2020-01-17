package app.zenly.locator.report.base;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import app.zenly.locator.R;
import app.zenly.locator.chat.content.C1949d;
import app.zenly.locator.core.p072ui.controller.ZenlyController;
import app.zenly.locator.p210z.p211b.C6320k;
import app.zenly.locator.p210z.p211b.C6321l;
import app.zenly.locator.p210z.p212c.C6332i;
import com.bluelinelabs.conductor.C8819d;
import com.bluelinelabs.conductor.C8831g;
import com.bluelinelabs.conductor.C8836h;
import com.bluelinelabs.conductor.ControllerChangeHandler;
import com.bluelinelabs.conductor.changehandler.C8816c;
import java.util.List;
import p213co.znly.models.UserProto$User;
import p213co.znly.models.services.C8137k1;
import p213co.znly.models.services.C8137k1.C8138a;
import p213co.znly.models.services.C8262r5;
import p213co.znly.models.services.C8262r5.C8263a;

/* renamed from: app.zenly.locator.report.base.k */
public class C5342k extends ZenlyController {

    /* renamed from: P */
    private C8831g f13767P;

    /* renamed from: Q */
    private Runnable f13768Q;

    /* renamed from: R */
    private final ReportReasonController f13769R;

    public C5342k(Bundle bundle) {
        super(bundle);
        if (bundle.containsKey("KEY_USER_REPORT_REQUEST")) {
            this.f13769R = new C6332i(bundle);
        } else if (bundle.containsKey("KEY_MESSAGE_REPORT_REQUEST")) {
            this.f13769R = new C6321l(bundle);
        } else {
            this.f13769R = null;
        }
    }

    /* renamed from: a */
    public static C5342k m15152a(UserProto$User userProto$User) {
        C8263a newBuilder = C8262r5.newBuilder();
        newBuilder.mo22227b(userProto$User.getUuid());
        return new C5342k(C5341j.m15143a(userProto$User.getName(), userProto$User.getUuid(), (C8262r5) newBuilder.build()));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: B */
    public void mo7192B() {
        if (this.f13767P != null) {
            while (this.f13767P.mo24003c() > 0) {
                this.f13767P.mo24014n();
            }
        }
        mo23946k().mo24011i();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: C */
    public void mo12782C() {
        C8831g gVar = this.f13767P;
        if (gVar != null && !gVar.mo24011i()) {
            mo23946k().mo24011i();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: D */
    public void mo12783D() {
        Runnable runnable = this.f13768Q;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo12785c(C8819d dVar) {
        dVar.mo23929b((C8819d) this);
        C8831g gVar = this.f13767P;
        if (gVar != null) {
            C8836h a = C8836h.m21058a(dVar);
            a.mo24026b(this.f13767P.mo24003c() > 0 ? new C8816c() : null);
            a.mo24023a((ControllerChangeHandler) new C8816c());
            gVar.mo23991a(a);
        }
    }

    /* renamed from: a */
    public static C5342k m15153a(String str, C1949d dVar, List<C1949d> list) {
        C8138a newBuilder = C8137k1.newBuilder();
        newBuilder.mo22154d(str);
        newBuilder.mo22152b(dVar.f6310c.getUuid());
        newBuilder.mo22150a(C6320k.m17388a(dVar, list));
        return new C5342k(C5341j.m15142a(dVar.f6311d.getNickname(), dVar.f6311d.getUserUuid(), (C8137k1) newBuilder.build()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo7054a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.controller_reports, viewGroup, false);
        this.f13767P = mo23896a(viewGroup2);
        ReportReasonController reportReasonController = this.f13769R;
        if (reportReasonController != null) {
            mo12785c(reportReasonController);
        }
        return viewGroup2;
    }

    /* renamed from: a */
    public void mo12784a(Runnable runnable) {
        this.f13768Q = runnable;
    }
}
