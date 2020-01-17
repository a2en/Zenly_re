package app.zenly.locator.onboarding;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import app.zenly.android.feature.polenta.widget.EmptyView;
import app.zenly.locator.C3891l;
import app.zenly.locator.R;
import app.zenly.locator.core.helper.C2513e;
import app.zenly.locator.p143s.p155r.C5498a;
import app.zenly.locator.p143s.p155r.C5498a.C5500b;
import app.zenly.locator.p143s.p155r.C5498a.C5501c;
import java.util.Locale;
import kotlin.C12956q;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12933k;
import p250f.p251a.p252a.p253a.p255e.C7660b;
import p387h.p388a.C12143a;

/* renamed from: app.zenly.locator.onboarding.p3 */
public final class C4878p3 extends BaseSignupController {

    /* renamed from: T */
    private EmptyView f12844T;

    /* renamed from: U */
    private EmptyView f12845U;

    /* renamed from: app.zenly.locator.onboarding.p3$a */
    public static final class C4879a {
        private C4879a() {
        }

        public /* synthetic */ C4879a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.locator.onboarding.p3$b */
    static final class C4880b extends C12933k implements Function0<C12956q> {

        /* renamed from: f */
        final /* synthetic */ C4878p3 f12846f;

        C4880b(C4878p3 p3Var) {
            this.f12846f = p3Var;
            super(0);
        }

        public final void invoke() {
            Activity A = this.f12846f.mo9304A();
            C12932j.m33815a((Object) A, "requireActivity()");
            C7660b.m18653a(A, new Intent("android.intent.action.VIEW", Uri.parse("https://zenlyapp.cn")));
        }
    }

    /* renamed from: app.zenly.locator.onboarding.p3$c */
    static final class C4881c extends C12933k implements Function0<C12956q> {

        /* renamed from: f */
        final /* synthetic */ PendingIntent f12847f;

        C4881c(PendingIntent pendingIntent) {
            this.f12847f = pendingIntent;
            super(0);
        }

        public final void invoke() {
            this.f12847f.send();
        }
    }

    static {
        new C4879a(null);
    }

    /* renamed from: E */
    private final void m14212E() {
        Activity A = mo9304A();
        C12932j.m33815a((Object) A, "requireActivity()");
        C2513e eVar = new C2513e(A);
        if (!eVar.mo8587c()) {
            m14213F();
        } else if (eVar.mo8588d()) {
            PendingIntent a = eVar.mo8585a();
            if (a != null) {
                m14214a(a);
                return;
            }
            C12143a.m32030b("PlayServiceStatus need user resolution but doesn't have intent. Status %d", Integer.valueOf(eVar.mo8586b()));
            m14213F();
        } else {
            C5498a.m15602a(C5498a.f14119e.mo13125a(A), C5501c.LIGHT, C5500b.NAV, 0, 4, null);
            mo11926D();
        }
    }

    /* renamed from: F */
    private final void m14213F() {
        EmptyView emptyView = this.f12845U;
        if (emptyView != null) {
            emptyView.setVisibility(8);
            EmptyView emptyView2 = this.f12844T;
            if (emptyView2 != null) {
                emptyView2.setVisibility(0);
                if (C12932j.m33817a((Object) Locale.CHINA, (Object) Locale.getDefault())) {
                    emptyView2.setTitle((int) R.string.playservices_troubleshooting_china_title);
                    emptyView2.setSubtitle((int) R.string.playservices_troubleshooting_china_message);
                    emptyView2.setActionText((int) R.string.playservices_troubleshooting_china_cta);
                    emptyView2.mo6794a(new C4880b(this));
                    return;
                }
                emptyView2.setTitle((int) R.string.playservices_troubleshooting_deadEnd_title);
                emptyView2.setSubtitle((int) R.string.playservices_troubleshooting_deadEnd_message);
                return;
            }
            C12932j.m33820c("viewDeadEnd");
            throw null;
        }
        C12932j.m33820c("viewUpdateNeeded");
        throw null;
    }

    /* renamed from: B */
    public int mo7192B() {
        return 5;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo7054a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C12932j.m33818b(layoutInflater, "inflater");
        C12932j.m33818b(viewGroup, "container");
        View inflate = layoutInflater.inflate(R.layout.controller_play_services, viewGroup, false);
        C12932j.m33815a((Object) inflate, "view");
        EmptyView emptyView = (EmptyView) inflate.findViewById(C3891l.view_dead_end);
        C12932j.m33815a((Object) emptyView, "view.view_dead_end");
        this.f12844T = emptyView;
        EmptyView emptyView2 = (EmptyView) inflate.findViewById(C3891l.view_update_needed);
        C12932j.m33815a((Object) emptyView2, "view.view_update_needed");
        this.f12845U = emptyView2;
        return inflate;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7052b(View view) {
        C12932j.m33818b(view, "view");
        super.mo7052b(view);
        m14212E();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo11369g(Activity activity) {
        C12932j.m33818b(activity, "activity");
        super.mo11369g(activity);
        if (mo23949n()) {
            m14212E();
        }
    }

    public void onWindowInsetsChanged(View view, Rect rect) {
        C12932j.m33818b(view, "view");
        C12932j.m33818b(rect, "insets");
        super.onWindowInsetsChanged(view, rect);
        view.setPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: a */
    private final void m14214a(PendingIntent pendingIntent) {
        EmptyView emptyView = this.f12844T;
        if (emptyView != null) {
            emptyView.setVisibility(8);
            EmptyView emptyView2 = this.f12845U;
            String str = "viewUpdateNeeded";
            if (emptyView2 != null) {
                emptyView2.setVisibility(0);
                EmptyView emptyView3 = this.f12845U;
                if (emptyView3 != null) {
                    emptyView3.mo6794a(new C4881c(pendingIntent));
                } else {
                    C12932j.m33820c(str);
                    throw null;
                }
            } else {
                C12932j.m33820c(str);
                throw null;
            }
        } else {
            C12932j.m33820c("viewDeadEnd");
            throw null;
        }
    }
}
