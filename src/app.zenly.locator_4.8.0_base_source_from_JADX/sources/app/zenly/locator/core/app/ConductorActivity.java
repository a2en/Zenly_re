package app.zenly.locator.core.app;

import android.os.Bundle;
import android.view.ViewGroup;
import app.zenly.locator.R;
import com.bluelinelabs.conductor.C8811c;
import com.bluelinelabs.conductor.C8819d;
import com.bluelinelabs.conductor.C8831g;
import com.bluelinelabs.conductor.C8836h;
import kotlin.jvm.internal.C12932j;

public abstract class ConductorActivity extends BaseActivity {

    /* renamed from: n */
    private C8831g f7348n;

    /* renamed from: d */
    public boolean mo6993d() {
        C8831g gVar = this.f7348n;
        if (gVar != null) {
            return gVar.mo24011i();
        }
        C12932j.m33820c("router");
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract C8819d mo7317e();

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.content);
        if (viewGroup != null) {
            C8831g a = C8811c.m20828a(this, viewGroup, bundle);
            C12932j.m33815a((Object) a, "Conductor.attachRouter(t…nt!!, savedInstanceState)");
            this.f7348n = a;
            C8831g gVar = this.f7348n;
            String str = "router";
            if (gVar == null) {
                C12932j.m33820c(str);
                throw null;
            } else if (!gVar.mo24012j()) {
                C8831g gVar2 = this.f7348n;
                if (gVar2 != null) {
                    gVar2.mo24008d(C8836h.m21058a(mo7317e()));
                } else {
                    C12932j.m33820c(str);
                    throw null;
                }
            }
        } else {
            C12932j.m33814a();
            throw null;
        }
    }
}
