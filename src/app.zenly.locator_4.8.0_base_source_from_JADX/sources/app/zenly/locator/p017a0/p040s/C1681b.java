package app.zenly.locator.p017a0.p040s;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import app.zenly.locator.R;
import app.zenly.locator.core.p072ui.controller.ZenlyController;
import app.zenly.locator.p017a0.p040s.C1675a.C1676a;
import app.zenly.locator.p208y.C6295f;
import com.bluelinelabs.conductor.C8819d;
import com.bluelinelabs.conductor.C8831g;
import com.bluelinelabs.conductor.C8836h;
import com.bluelinelabs.conductor.ControllerChangeHandler;
import com.bluelinelabs.conductor.changehandler.C8816c;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.a0.s.b */
public final class C1681b extends ZenlyController {

    /* renamed from: P */
    public static final C1682a f5730P = new C1682a(null);

    /* renamed from: app.zenly.locator.a0.s.b$a */
    public static final class C1682a {
        private C1682a() {
        }

        /* renamed from: a */
        public final C1681b mo7296a() {
            Bundle bundle = Bundle.EMPTY;
            C12932j.m33815a((Object) bundle, "Bundle.EMPTY");
            return new C1681b(bundle);
        }

        public /* synthetic */ C1682a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.locator.a0.s.b$b */
    static final class C1683b implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C1681b f5731e;

        C1683b(C1681b bVar) {
            this.f5731e = bVar;
        }

        public final void onClick(View view) {
            C8831g k = this.f5731e.mo23946k();
            C8836h a = C8836h.m21058a((C8819d) C1676a.m7009a(C1675a.f5723R, null, 1, null));
            a.mo24026b(new C8816c());
            a.mo24023a((ControllerChangeHandler) new C8816c());
            k.mo24005c(a);
        }
    }

    public C1681b(Bundle bundle) {
        C12932j.m33818b(bundle, "args");
        super(bundle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo7054a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C12932j.m33818b(layoutInflater, "inflater");
        C12932j.m33818b(viewGroup, "container");
        View inflate = layoutInflater.inflate(R.layout.controller_phone_intro_settings, viewGroup, false);
        C12932j.m33815a((Object) inflate, "view");
        new C6295f(inflate, new C1683b(this));
        return inflate;
    }

    public void onWindowInsetsChanged(View view, Rect rect) {
        C12932j.m33818b(view, "view");
        C12932j.m33818b(rect, "insets");
        super.onWindowInsetsChanged(view, rect);
        view.setPadding(rect.left, rect.top, rect.right, rect.bottom);
    }
}
