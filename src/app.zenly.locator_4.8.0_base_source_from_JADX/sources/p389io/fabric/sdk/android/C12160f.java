package p389io.fabric.sdk.android;

import p389io.fabric.sdk.android.services.common.C12201t;
import p389io.fabric.sdk.android.services.concurrency.C12215d;
import p389io.fabric.sdk.android.services.concurrency.C12216e;
import p389io.fabric.sdk.android.services.concurrency.UnmetDependencyException;

/* renamed from: io.fabric.sdk.android.f */
class C12160f<Result> extends C12216e<Void, Void, Result> {

    /* renamed from: s */
    final C12161g<Result> f31605s;

    public C12160f(C12161g<Result> gVar) {
        this.f31605s = gVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo36003b(Result result) {
        this.f31605s.mo36009b(result);
        this.f31605s.f31609h.success(result);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo36004c() {
        super.mo36004c();
        C12201t a = m32136a("onPreExecute");
        try {
            boolean k = this.f31605s.mo24961k();
            a.mo36097b();
            if (k) {
                return;
            }
        } catch (UnmetDependencyException e) {
            throw e;
        } catch (Exception e2) {
            C12154c.m32113f().mo35957e("Fabric", "Failure onPreExecute()", e2);
            a.mo36097b();
        } catch (Throwable th) {
            a.mo36097b();
            mo36108a(true);
            throw th;
        }
        mo36108a(true);
    }

    public C12215d getPriority() {
        return C12215d.HIGH;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Result mo36000a(Void... voidArr) {
        C12201t a = m32136a("doInBackground");
        Result a2 = !mo36110b() ? this.f31605s.mo24942a() : null;
        a.mo36097b();
        return a2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo36002a(Result result) {
        this.f31605s.mo36007a(result);
        StringBuilder sb = new StringBuilder();
        sb.append(this.f31605s.mo24943f());
        sb.append(" Initialization was cancelled");
        this.f31605s.f31609h.failure(new InitializationException(sb.toString()));
    }

    /* renamed from: a */
    private C12201t m32136a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f31605s.mo24943f());
        sb.append(".");
        sb.append(str);
        C12201t tVar = new C12201t(sb.toString(), "KitInitialization");
        tVar.mo36096a();
        return tVar;
    }
}
