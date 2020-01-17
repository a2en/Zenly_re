package app.zenly.locator.onboarding;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import app.zenly.locator.R;
import app.zenly.locator.p208y.C6295f;
import com.bluelinelabs.conductor.C8819d;
import com.bluelinelabs.conductor.C8831g;
import com.bluelinelabs.conductor.C8836h;
import com.bluelinelabs.conductor.ControllerChangeHandler;
import com.bluelinelabs.conductor.changehandler.C8816c;
import java.util.ArrayList;
import java.util.Set;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.onboarding.n3 */
public final class C4861n3 extends BaseSignupController {

    /* renamed from: U */
    public static final C4862a f12824U = new C4862a(null);

    /* renamed from: T */
    private final ArrayList<String> f12825T;

    /* renamed from: app.zenly.locator.onboarding.n3$a */
    public static final class C4862a {
        private C4862a() {
        }

        /* renamed from: a */
        public final C4861n3 mo12090a(Set<String> set) {
            C12932j.m33818b(set, "openedSteps");
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("args:ids", new ArrayList(set));
            return new C4861n3(bundle);
        }

        public /* synthetic */ C4862a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.locator.onboarding.n3$b */
    static final class C4863b implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C4861n3 f12826e;

        C4863b(C4861n3 n3Var) {
            this.f12826e = n3Var;
        }

        public final void onClick(View view) {
            this.f12826e.m14198E();
        }
    }

    public C4861n3(Bundle bundle) {
        C12932j.m33818b(bundle, "args");
        super(bundle);
        ArrayList<String> stringArrayList = bundle.getStringArrayList("args:ids");
        if (stringArrayList != null) {
            C12932j.m33815a((Object) stringArrayList, "args.getStringArrayList(KEY_IDS)!!");
            this.f12825T = stringArrayList;
            return;
        }
        C12932j.m33814a();
        throw null;
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public final void m14198E() {
        C8831g k = mo23946k();
        C8836h a = C8836h.m21058a((C8819d) C4868o3.f12832V.mo12092a(C12857w.m33691l(this.f12825T)));
        a.mo24026b(new C8816c());
        a.mo24023a((ControllerChangeHandler) new C8816c());
        k.mo24005c(a);
    }

    /* renamed from: a */
    public static final C4861n3 m14199a(Set<String> set) {
        return f12824U.mo12090a(set);
    }

    /* renamed from: B */
    public int mo7192B() {
        return 55;
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
    /* renamed from: a */
    public View mo7054a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C12932j.m33818b(layoutInflater, "inflater");
        C12932j.m33818b(viewGroup, "container");
        View inflate = layoutInflater.inflate(R.layout.controller_phone_intro_settings, viewGroup, false);
        C12932j.m33815a((Object) inflate, "view");
        new C6295f(inflate, new C4863b(this));
        if (!this.f12825T.isEmpty()) {
            m14198E();
        }
        return inflate;
    }
}
