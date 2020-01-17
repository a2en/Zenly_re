package app.zenly.locator.onboarding;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import app.zenly.locator.R;
import app.zenly.locator.onboarding.BaseSignupController.SignupListener;
import app.zenly.locator.p143s.C5407g;
import app.zenly.locator.p143s.C5407g.C5408a;
import app.zenly.locator.p208y.C6280a;
import app.zenly.locator.p208y.C6288c;
import app.zenly.locator.p208y.C6288c.C6291c;
import app.zenly.locator.p208y.C6294e;
import app.zenly.locator.p208y.C6300h;
import com.bluelinelabs.conductor.C8819d;
import com.bluelinelabs.conductor.C8831g;
import com.bluelinelabs.conductor.C8836h;
import com.bluelinelabs.conductor.ControllerChangeHandler;
import com.bluelinelabs.conductor.changehandler.C8816c;
import java.util.ArrayList;
import java.util.Set;
import kotlin.C12956q;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12933k;
import p213co.znly.core.romutils.Resolution;

/* renamed from: app.zenly.locator.onboarding.o3 */
public final class C4868o3 extends BaseSignupController {

    /* renamed from: V */
    public static final C4869a f12832V = new C4869a(null);

    /* renamed from: T */
    private final ArrayList<String> f12833T;

    /* renamed from: U */
    private C6280a f12834U;

    /* renamed from: app.zenly.locator.onboarding.o3$a */
    public static final class C4869a {
        private C4869a() {
        }

        /* renamed from: a */
        public final C4868o3 mo12092a(Set<String> set) {
            C12932j.m33818b(set, "resolvedIds");
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("args:ids", new ArrayList(set));
            return new C4868o3(bundle);
        }

        public /* synthetic */ C4869a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.locator.onboarding.o3$b */
    static final class C4870b extends C12933k implements Function1<Resolution, C12956q> {

        /* renamed from: f */
        final /* synthetic */ C6300h f12835f;

        C4870b(C6300h hVar) {
            this.f12835f = hVar;
            super(1);
        }

        /* renamed from: a */
        public final void mo12093a(Resolution resolution) {
            C12932j.m33818b(resolution, "resolution");
            if (!resolution.isStateReadable()) {
                C6300h hVar = this.f12835f;
                hVar.mo14150a(C12847n0.m33637a(hVar.mo14149a(), resolution.getId().name()));
            }
            C6300h hVar2 = this.f12835f;
            hVar2.mo14154b(C12847n0.m33637a(hVar2.mo14153b(), resolution.getId().name()));
            C6288c.f15796c.mo14142a().mo14139a(C6291c.ONBOARDING, C6294e.m17353a(resolution));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo12093a((Resolution) obj);
            return C12956q.f33541a;
        }
    }

    /* renamed from: app.zenly.locator.onboarding.o3$c */
    static final class C4871c extends C12933k implements Function2<Resolution, Set<? extends String>, C12956q> {

        /* renamed from: f */
        final /* synthetic */ C4868o3 f12836f;

        C4871c(C4868o3 o3Var) {
            this.f12836f = o3Var;
            super(2);
        }

        /* renamed from: a */
        public final void mo12094a(Resolution resolution, Set<String> set) {
            C12932j.m33818b(resolution, "resolution");
            C12932j.m33818b(set, "resolvedIds");
            C6288c.f15796c.mo14142a().mo14141b(C6291c.ONBOARDING, C6294e.m17353a(resolution));
            C8831g k = this.f12836f.mo23946k();
            C8836h a = C8836h.m21058a((C8819d) C4868o3.f12832V.mo12092a(set));
            a.mo24026b(new C8816c());
            a.mo24023a((ControllerChangeHandler) new C8816c());
            k.mo24005c(a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            mo12094a((Resolution) obj, (Set) obj2);
            return C12956q.f33541a;
        }
    }

    /* renamed from: app.zenly.locator.onboarding.o3$d */
    static final class C4872d extends C12933k implements Function2<Resolution, Set<? extends String>, C12956q> {

        /* renamed from: f */
        final /* synthetic */ C4868o3 f12837f;

        C4872d(C4868o3 o3Var) {
            this.f12837f = o3Var;
            super(2);
        }

        /* renamed from: a */
        public final void mo12095a(Resolution resolution, Set<String> set) {
            C12932j.m33818b(resolution, "resolution");
            C12932j.m33818b(set, "<anonymous parameter 1>");
            C6288c.f15796c.mo14142a().mo14141b(C6291c.ONBOARDING, C6294e.m17353a(resolution));
            this.f12837f.mo11926D();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            mo12095a((Resolution) obj, (Set) obj2);
            return C12956q.f33541a;
        }
    }

    /* renamed from: app.zenly.locator.onboarding.o3$e */
    static final class C4873e extends C12933k implements Function0<C12956q> {

        /* renamed from: f */
        final /* synthetic */ C4868o3 f12838f;

        C4873e(C4868o3 o3Var) {
            this.f12838f = o3Var;
            super(0);
        }

        public final void invoke() {
            C4868o3 o3Var = this.f12838f;
            o3Var.f12511Q = (SignupListener) o3Var.mo23920b();
            this.f12838f.mo11926D();
        }
    }

    public C4868o3(Bundle bundle) {
        C12932j.m33818b(bundle, "args");
        super(bundle);
        ArrayList<String> stringArrayList = bundle.getStringArrayList("args:ids");
        if (stringArrayList != null) {
            C12932j.m33815a((Object) stringArrayList, "args.getStringArrayList(KEY_IDS)!!");
            this.f12833T = stringArrayList;
            return;
        }
        C12932j.m33814a();
        throw null;
    }

    /* renamed from: B */
    public int mo7192B() {
        return 55;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo7054a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C12932j.m33818b(layoutInflater, "inflater");
        C12932j.m33818b(viewGroup, "container");
        View inflate = layoutInflater.inflate(R.layout.controller_phone_setting_wizard, viewGroup, false);
        C5408a aVar = C5407g.f13966d;
        C12932j.m33815a((Object) inflate, "view");
        Context context = inflate.getContext();
        C12932j.m33815a((Object) context, "view.context");
        View view = inflate;
        C6280a aVar2 = new C6280a(view, C12857w.m33691l(this.f12833T), new C4870b(new C6300h(aVar.mo12991a(context).mo12986h())), new C4871c(this), new C4872d(this), new C4873e(this), false, 64, null);
        this.f12834U = aVar2;
        return inflate;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7052b(View view) {
        C12932j.m33818b(view, "view");
        super.mo7052b(view);
        C6280a aVar = this.f12834U;
        if (aVar != null) {
            aVar.mo14131b();
        } else {
            C12932j.m33820c("wizardViewController");
            throw null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo7066c(View view) {
        C12932j.m33818b(view, "view");
        C6280a aVar = this.f12834U;
        if (aVar != null) {
            aVar.mo14132c();
            super.mo7066c(view);
            return;
        }
        C12932j.m33820c("wizardViewController");
        throw null;
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
}
