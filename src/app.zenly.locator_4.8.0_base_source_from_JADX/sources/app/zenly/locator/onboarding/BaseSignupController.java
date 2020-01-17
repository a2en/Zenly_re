package app.zenly.locator.onboarding;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import app.zenly.locator.core.p072ui.controller.ZenlyController;
import app.zenly.locator.p143s.p162w.C5566b;
import com.bluelinelabs.conductor.C8819d;
import p213co.znly.models.core.C7174n2.C7175a;
import p387h.p388a.C12143a;

public abstract class BaseSignupController extends ZenlyController {

    /* renamed from: P */
    private final Handler f12510P = new Handler();

    /* renamed from: Q */
    protected SignupListener f12511Q;

    /* renamed from: R */
    private boolean f12512R;

    /* renamed from: S */
    private final Runnable f12513S = new C4789e(this);

    public interface SignupListener {
        C7175a getCache();

        void moveBack();

        void onStateCompleted(int i);

        void saveCache();

        void showCountryPicker(C8819d dVar);

        void showWebView(C5566b bVar);
    }

    public BaseSignupController() {
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public void mo11925C() {
        SignupListener signupListener = this.f12511Q;
        if (signupListener != null && !this.f12512R) {
            signupListener.onStateCompleted(mo7192B());
            this.f12512R = true;
        }
    }

    /* renamed from: B */
    public abstract int mo7192B();

    /* access modifiers changed from: 0000 */
    /* renamed from: D */
    public void mo11926D() {
        this.f12510P.removeCallbacks(this.f12513S);
        mo11925C();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo11927a(C5566b bVar) {
        SignupListener signupListener = this.f12511Q;
        if (signupListener != null) {
            signupListener.showWebView(bVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7052b(View view) {
        try {
            this.f12511Q = (SignupListener) mo23920b();
        } catch (ClassCastException e) {
            C12143a.m32032b(e, "Cannot cast activity into SignupListener", new Object[0]);
        }
        super.mo7052b(view);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo7053d(View view) {
        this.f12511Q = null;
        super.mo7053d(view);
    }

    public BaseSignupController(Bundle bundle) {
        super(bundle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo11928b(int i) {
        this.f12510P.postDelayed(this.f12513S, (long) i);
    }
}
