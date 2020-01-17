package app.zenly.locator.p017a0.p023o;

import android.app.Activity;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import app.zenly.android.feature.polenta.widget.ScreenBar;
import app.zenly.locator.R;
import app.zenly.locator.core.p072ui.controller.ZenlyController;
import app.zenly.locator.core.widget.C3275i;
import app.zenly.locator.core.widget.C3277j;
import app.zenly.locator.core.widget.TextViewLinkAction;
import app.zenly.locator.p143s.C5343a;
import app.zenly.locator.support.C5647b0;
import app.zenly.locator.support.C5806t;
import com.bluelinelabs.conductor.C8819d;
import com.bluelinelabs.conductor.C8831g;
import com.bluelinelabs.conductor.C8836h;
import com.bluelinelabs.conductor.ControllerChangeHandler;
import com.bluelinelabs.conductor.changehandler.C8816c;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p263b.p264a.p272j.C7709b;

/* renamed from: app.zenly.locator.a0.o.a */
public final class C1553a extends ZenlyController {

    /* renamed from: P */
    public static final C1554a f5470P = new C1554a(null);

    /* renamed from: app.zenly.locator.a0.o.a$a */
    public static final class C1554a {
        private C1554a() {
        }

        /* renamed from: a */
        public final C1553a mo7098a() {
            return new C1553a(null, 1, null);
        }

        public /* synthetic */ C1554a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.locator.a0.o.a$b */
    static final class C1555b implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C1553a f5471e;

        C1555b(C1553a aVar) {
            this.f5471e = aVar;
        }

        public final void onClick(View view) {
            Activity A = this.f5471e.mo9304A();
            C12932j.m33815a((Object) A, "requireActivity()");
            String string = A.getResources().getString(R.string.app_data_safety_how_long_we_keep_data);
            C12932j.m33815a((Object) string, "requireActivity().resour…ty_how_long_we_keep_data)");
            this.f5471e.m6753c(C5647b0.f14401S.mo13282a(string));
        }
    }

    /* renamed from: app.zenly.locator.a0.o.a$c */
    static final class C1556c implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C1553a f5472e;

        C1556c(C1553a aVar) {
            this.f5472e = aVar;
        }

        public final void onClick(View view) {
            Activity A = this.f5472e.mo9304A();
            C12932j.m33815a((Object) A, "requireActivity()");
            String string = A.getResources().getString(R.string.app_data_safety_what_happens_with_data);
            C12932j.m33815a((Object) string, "requireActivity().resour…y_what_happens_with_data)");
            this.f5472e.m6753c(C5647b0.f14401S.mo13282a(string));
        }
    }

    /* renamed from: app.zenly.locator.a0.o.a$d */
    public static final class C1557d implements TextViewLinkAction {

        /* renamed from: a */
        final /* synthetic */ C1553a f5473a;

        C1557d(C1553a aVar) {
            this.f5473a = aVar;
        }

        public void execute(C3277j jVar) {
            C12932j.m33818b(jVar, "link");
            this.f5473a.m6753c(new C5806t());
        }
    }

    public C1553a() {
        this(null, 1, null);
    }

    public C1553a(Bundle bundle) {
        super(bundle);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final void m6753c(C8819d dVar) {
        C8831g k = mo23946k();
        C8836h a = C8836h.m21058a(dVar);
        a.mo24026b(new C8816c());
        a.mo24023a((ControllerChangeHandler) new C8816c());
        k.mo23991a(a);
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
        C5343a.m15160U().mo12906r();
    }

    public /* synthetic */ C1553a(Bundle bundle, int i, C12928f fVar) {
        if ((i & 1) != 0) {
            bundle = null;
        }
        this(bundle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo7054a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C12932j.m33818b(layoutInflater, "inflater");
        C12932j.m33818b(viewGroup, "container");
        View inflate = layoutInflater.inflate(R.layout.controller_data_safety, viewGroup, false);
        ScreenBar screenBar = (ScreenBar) inflate.findViewById(R.id.screen_bar);
        Activity A = mo9304A();
        C12932j.m33815a((Object) A, "requireActivity()");
        screenBar.setTitle((CharSequence) C7709b.m18762a(A, R.string.settings_dataSafety_title));
        ((TextView) inflate.findViewById(R.id.btn_how_long_keep_data)).setOnClickListener(new C1555b(this));
        ((TextView) inflate.findViewById(R.id.btn_what_happens_with_data)).setOnClickListener(new C1556c(this));
        TextView textView = (TextView) inflate.findViewById(R.id.tv_footer);
        C12932j.m33815a((Object) textView, "tvFooter");
        C3277j jVar = new C3277j(R.string.settings_dataSafety_footer_deleteAccount, 0, null, 6, null);
        C3275i.m10385a(textView, R.string.settings_dataSafety_footer, C12846n.m33635a(jVar), new C1557d(this));
        C12932j.m33815a((Object) inflate, "view");
        return inflate;
    }
}
