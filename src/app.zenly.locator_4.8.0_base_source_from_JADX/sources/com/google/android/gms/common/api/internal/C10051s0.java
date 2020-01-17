package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.C10067c;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.internal.base.C10263e;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.common.api.internal.s0 */
public abstract class C10051s0 extends LifecycleCallback implements OnCancelListener {

    /* renamed from: f */
    protected volatile boolean f26423f;

    /* renamed from: g */
    protected final AtomicReference<C10055u0> f26424g;

    /* renamed from: h */
    private final Handler f26425h;

    /* renamed from: i */
    protected final C10067c f26426i;

    protected C10051s0(LifecycleFragment lifecycleFragment) {
        this(lifecycleFragment, C10067c.m25293a());
    }

    /* renamed from: a */
    public void mo27120a(Bundle bundle) {
        super.mo27120a(bundle);
        if (bundle != null) {
            this.f26424g.set(bundle.getBoolean("resolving_error", false) ? new C10055u0(new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo27216a(ConnectionResult connectionResult, int i);

    /* renamed from: b */
    public void mo27123b(Bundle bundle) {
        super.mo27123b(bundle);
        C10055u0 u0Var = (C10055u0) this.f26424g.get();
        if (u0Var != null) {
            bundle.putBoolean("resolving_error", true);
            bundle.putInt("failed_client_id", u0Var.mo27234b());
            bundle.putInt("failed_status", u0Var.mo27233a().getErrorCode());
            bundle.putParcelable("failed_resolution", u0Var.mo27233a().getResolution());
        }
    }

    /* renamed from: d */
    public void mo27125d() {
        super.mo27125d();
        this.f26423f = true;
    }

    /* renamed from: e */
    public void mo27126e() {
        super.mo27126e();
        this.f26423f = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract void mo27217f();

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo27228g() {
        this.f26424g.set(null);
        mo27217f();
    }

    public void onCancel(DialogInterface dialogInterface) {
        mo27216a(new ConnectionResult(13, null), m25260a((C10055u0) this.f26424g.get()));
        mo27228g();
    }

    private C10051s0(LifecycleFragment lifecycleFragment, C10067c cVar) {
        super(lifecycleFragment);
        this.f26424g = new AtomicReference<>(null);
        this.f26425h = new C10263e(Looper.getMainLooper());
        this.f26426i = cVar;
    }

    /* renamed from: b */
    public final void mo27227b(ConnectionResult connectionResult, int i) {
        C10055u0 u0Var = new C10055u0(connectionResult, i);
        if (this.f26424g.compareAndSet(null, u0Var)) {
            this.f26425h.post(new C10053t0(this, u0Var));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0064  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo27119a(int r5, int r6, android.content.Intent r7) {
        /*
            r4 = this;
            java.util.concurrent.atomic.AtomicReference<com.google.android.gms.common.api.internal.u0> r0 = r4.f26424g
            java.lang.Object r0 = r0.get()
            com.google.android.gms.common.api.internal.u0 r0 = (com.google.android.gms.common.api.internal.C10055u0) r0
            r1 = 1
            r2 = 0
            if (r5 == r1) goto L_0x0030
            r6 = 2
            if (r5 == r6) goto L_0x0010
            goto L_0x005d
        L_0x0010:
            com.google.android.gms.common.c r5 = r4.f26426i
            android.app.Activity r6 = r4.mo27118a()
            int r5 = r5.mo27284a(r6)
            if (r5 != 0) goto L_0x001d
            goto L_0x001e
        L_0x001d:
            r1 = 0
        L_0x001e:
            if (r0 != 0) goto L_0x0021
            return
        L_0x0021:
            com.google.android.gms.common.ConnectionResult r6 = r0.mo27233a()
            int r6 = r6.getErrorCode()
            r7 = 18
            if (r6 != r7) goto L_0x005e
            if (r5 != r7) goto L_0x005e
            return
        L_0x0030:
            r5 = -1
            if (r6 != r5) goto L_0x0034
            goto L_0x005e
        L_0x0034:
            if (r6 != 0) goto L_0x005d
            r5 = 13
            if (r7 == 0) goto L_0x0040
            java.lang.String r6 = "<<ResolutionFailureErrorDetail>>"
            int r5 = r7.getIntExtra(r6, r5)
        L_0x0040:
            com.google.android.gms.common.api.internal.u0 r6 = new com.google.android.gms.common.api.internal.u0
            com.google.android.gms.common.ConnectionResult r7 = new com.google.android.gms.common.ConnectionResult
            r1 = 0
            com.google.android.gms.common.ConnectionResult r3 = r0.mo27233a()
            java.lang.String r3 = r3.toString()
            r7.<init>(r5, r1, r3)
            int r5 = m25260a(r0)
            r6.<init>(r7, r5)
            java.util.concurrent.atomic.AtomicReference<com.google.android.gms.common.api.internal.u0> r5 = r4.f26424g
            r5.set(r6)
            r0 = r6
        L_0x005d:
            r1 = 0
        L_0x005e:
            if (r1 == 0) goto L_0x0064
            r4.mo27228g()
            return
        L_0x0064:
            if (r0 == 0) goto L_0x0071
            com.google.android.gms.common.ConnectionResult r5 = r0.mo27233a()
            int r6 = r0.mo27234b()
            r4.mo27216a(r5, r6)
        L_0x0071:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.C10051s0.mo27119a(int, int, android.content.Intent):void");
    }

    /* renamed from: a */
    private static int m25260a(C10055u0 u0Var) {
        if (u0Var == null) {
            return -1;
        }
        return u0Var.mo27234b();
    }
}
