package app.zenly.locator.report.base;

import android.os.Bundle;
import android.view.View;
import app.zenly.locator.core.p072ui.controller.ZenlyController;
import app.zenly.locator.core.util.C3197d;
import com.bluelinelabs.conductor.C8819d;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.models.services.C8137k1;
import p213co.znly.models.services.C8137k1.C8138a;
import p213co.znly.models.services.C8262r5;
import p213co.znly.models.services.C8262r5.C8263a;
import p387h.p388a.C12143a;

/* renamed from: app.zenly.locator.report.base.j */
abstract class C5341j extends ZenlyController {

    /* renamed from: P */
    protected final String f13762P;

    /* renamed from: Q */
    protected final String f13763Q;
    /* access modifiers changed from: protected */

    /* renamed from: R */
    public C8263a f13764R = C8262r5.newBuilder();
    /* access modifiers changed from: protected */

    /* renamed from: S */
    public C8138a f13765S = C8137k1.newBuilder();

    /* renamed from: T */
    private C5342k f13766T;

    C5341j(Bundle bundle) {
        super(bundle);
        this.f13762P = bundle.getString("KEY_USER_NAME", null);
        this.f13763Q = bundle.getString("KEY_USER_UUID", null);
        try {
            byte[] byteArray = bundle.getByteArray("KEY_USER_REPORT_REQUEST");
            if (byteArray != null) {
                this.f13764R.clear();
                this.f13764R.mergeFrom(byteArray);
            }
            byte[] byteArray2 = bundle.getByteArray("KEY_MESSAGE_REPORT_REQUEST");
            if (byteArray2 != null) {
                this.f13765S.clear();
                this.f13765S.mergeFrom(byteArray2);
            }
        } catch (InvalidProtocolBufferException e) {
            C12143a.m32032b(e, "ReportController InvalidProtocolBufferException", new Object[0]);
        }
    }

    /* renamed from: a */
    protected static Bundle m15143a(String str, String str2, C8262r5 r5Var) {
        C3197d dVar = new C3197d(new Bundle());
        dVar.mo9610a("KEY_USER_NAME", str);
        dVar.mo9610a("KEY_USER_UUID", str2);
        dVar.mo9613a("KEY_USER_REPORT_REQUEST", r5Var != null ? r5Var.toByteArray() : null);
        return dVar.mo9605a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public void mo7192B() {
        C5342k kVar = this.f13766T;
        if (kVar != null) {
            kVar.mo12782C();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public void mo12781C() {
        C5342k kVar = this.f13766T;
        if (kVar != null) {
            kVar.mo7192B();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public Bundle mo12756D() {
        return m15142a(this.f13762P, this.f13763Q, (C8137k1) this.f13765S.build());
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public Bundle mo12757E() {
        return m15143a(this.f13762P, this.f13763Q, (C8262r5) this.f13764R.build());
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public void mo12758F() {
        C5342k kVar = this.f13766T;
        if (kVar != null) {
            kVar.mo12783D();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7052b(View view) {
        super.mo7052b(view);
        if (mo23947l() instanceof C5342k) {
            this.f13766T = (C5342k) mo23947l();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo12767c(C8819d dVar) {
        C5342k kVar = this.f13766T;
        if (kVar != null) {
            kVar.mo12785c(dVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo7053d(View view) {
        super.mo7053d(view);
        this.f13766T = null;
    }

    /* renamed from: a */
    protected static Bundle m15142a(String str, String str2, C8137k1 k1Var) {
        C3197d dVar = new C3197d(new Bundle());
        dVar.mo9610a("KEY_USER_NAME", str);
        dVar.mo9610a("KEY_USER_UUID", str2);
        dVar.mo9613a("KEY_MESSAGE_REPORT_REQUEST", k1Var != null ? k1Var.toByteArray() : null);
        return dVar.mo9605a();
    }
}
