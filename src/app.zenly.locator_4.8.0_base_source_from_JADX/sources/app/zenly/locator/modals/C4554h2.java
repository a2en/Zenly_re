package app.zenly.locator.modals;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import app.zenly.locator.R;
import app.zenly.locator.modals.C4560i2.C4561a;
import app.zenly.locator.p208y.C6288c;
import app.zenly.locator.p208y.C6288c.C6291c;
import app.zenly.locator.p208y.C6295f;
import com.bluelinelabs.conductor.C8819d;
import com.bluelinelabs.conductor.C8831g;
import com.bluelinelabs.conductor.C8836h;
import com.bluelinelabs.conductor.ControllerChangeHandler;
import com.bluelinelabs.conductor.changehandler.C8816c;
import kotlin.jvm.internal.C12932j;
import p213co.znly.core.romutils.ResolutionSolver;

/* renamed from: app.zenly.locator.modals.h2 */
public final class C4554h2 extends ModalController {

    /* renamed from: R */
    public static final C4555a f12183R = new C4555a(null);
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public final C6291c f12184Q;

    /* renamed from: app.zenly.locator.modals.h2$a */
    public static final class C4555a {
        private C4555a() {
        }

        /* renamed from: a */
        public final C4554h2 mo11709a(C6291c cVar) {
            C12932j.m33818b(cVar, "origin");
            Bundle bundle = new Bundle();
            bundle.putString("args:origin", cVar.name());
            return new C4554h2(bundle);
        }

        public /* synthetic */ C4555a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.locator.modals.h2$b */
    static final class C4556b implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C4554h2 f12185e;

        C4556b(C4554h2 h2Var) {
            this.f12185e = h2Var;
        }

        public final void onClick(View view) {
            C4560i2 a = C4561a.m13401a(C4560i2.f12189T, this.f12185e.f12184Q, null, 2, null);
            a.mo23929b(this.f12185e.mo23947l());
            C8831g k = this.f12185e.mo23946k();
            C8836h a2 = C8836h.m21058a((C8819d) a);
            a2.mo24026b(new C8816c());
            a2.mo24023a((ControllerChangeHandler) new C8816c());
            k.mo24005c(a2);
        }
    }

    public C4554h2(Bundle bundle) {
        C12932j.m33818b(bundle, "args");
        super(bundle);
        String string = bundle.getString("args:origin");
        if (string != null) {
            C12932j.m33815a((Object) string, "args.getString(KEY_ORIGIN)!!");
            this.f12184Q = C6291c.valueOf(string);
            return;
        }
        C12932j.m33814a();
        throw null;
    }

    /* renamed from: a */
    public static final C4554h2 m13384a(C6291c cVar) {
        return f12183R.mo11709a(cVar);
    }

    /* renamed from: b */
    public Void m13388b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C12932j.m33818b(layoutInflater, "inflater");
        C12932j.m33818b(viewGroup, "container");
        return null;
    }

    public boolean handleBack() {
        return true;
    }

    public void onWindowInsetsChanged(View view, Rect rect) {
        C12932j.m33818b(view, "view");
        C12932j.m33818b(rect, "insets");
        super.onWindowInsetsChanged(view, rect);
        view.setPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public void mo7097y() {
        super.mo7097y();
        C6288c.f15796c.mo14142a().mo14140b(this.f12184Q, ResolutionSolver.get().getResolutions(mo9304A()).size());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo7054a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C12932j.m33818b(layoutInflater, "inflater");
        C12932j.m33818b(viewGroup, "container");
        View inflate = layoutInflater.inflate(R.layout.controller_phone_intro_settings, viewGroup, false);
        C12932j.m33815a((Object) inflate, "view");
        new C6295f(inflate, new C4556b(this));
        return inflate;
    }
}
