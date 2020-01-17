package app.zenly.locator.p017a0.p040s;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import app.zenly.locator.R;
import app.zenly.locator.core.p072ui.controller.ZenlyController;
import app.zenly.locator.p208y.C6280a;
import app.zenly.locator.p208y.C6288c;
import app.zenly.locator.p208y.C6288c.C6291c;
import app.zenly.locator.p208y.C6294e;
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

/* renamed from: app.zenly.locator.a0.s.a */
public final class C1675a extends ZenlyController {

    /* renamed from: R */
    public static final C1676a f5723R = new C1676a(null);
    /* access modifiers changed from: private */

    /* renamed from: P */
    public final ArrayList<String> f5724P;

    /* renamed from: Q */
    private C6280a f5725Q;

    /* renamed from: app.zenly.locator.a0.s.a$a */
    public static final class C1676a {
        private C1676a() {
        }

        /* renamed from: a */
        public static /* synthetic */ C1675a m7009a(C1676a aVar, Set set, int i, Object obj) {
            if ((i & 1) != 0) {
                set = C12845m0.m33632a();
            }
            return aVar.mo7292a(set);
        }

        public /* synthetic */ C1676a(C12928f fVar) {
            this();
        }

        /* renamed from: a */
        public final C1675a mo7292a(Set<String> set) {
            C12932j.m33818b(set, "resolvedIds");
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("args:ids", new ArrayList(set));
            return new C1675a(bundle);
        }
    }

    /* renamed from: app.zenly.locator.a0.s.a$b */
    static final class C1677b extends C12933k implements Function1<Resolution, C12956q> {

        /* renamed from: f */
        public static final C1677b f5726f = new C1677b();

        C1677b() {
            super(1);
        }

        /* renamed from: a */
        public final void mo7293a(Resolution resolution) {
            C12932j.m33818b(resolution, "resolution");
            C6288c.f15796c.mo14142a().mo14139a(C6291c.SETTINGS, C6294e.m17353a(resolution));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo7293a((Resolution) obj);
            return C12956q.f33541a;
        }
    }

    /* renamed from: app.zenly.locator.a0.s.a$c */
    static final class C1678c extends C12933k implements Function2<Resolution, Set<? extends String>, C12956q> {

        /* renamed from: f */
        final /* synthetic */ C1675a f5727f;

        C1678c(C1675a aVar) {
            this.f5727f = aVar;
            super(2);
        }

        /* renamed from: a */
        public final void mo7294a(Resolution resolution, Set<String> set) {
            C12932j.m33818b(resolution, "resolution");
            C12932j.m33818b(set, "resolvedIds");
            C6288c.f15796c.mo14142a().mo14141b(C6291c.SETTINGS, C6294e.m17353a(resolution));
            C8831g k = this.f5727f.mo23946k();
            C8836h a = C8836h.m21058a((C8819d) C1675a.f5723R.mo7292a(set));
            a.mo24026b(new C8816c());
            a.mo24023a((ControllerChangeHandler) new C8816c());
            k.mo24005c(a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            mo7294a((Resolution) obj, (Set) obj2);
            return C12956q.f33541a;
        }
    }

    /* renamed from: app.zenly.locator.a0.s.a$d */
    static final class C1679d extends C12933k implements Function2<Resolution, Set<? extends String>, C12956q> {

        /* renamed from: f */
        final /* synthetic */ C1675a f5728f;

        C1679d(C1675a aVar) {
            this.f5728f = aVar;
            super(2);
        }

        /* renamed from: a */
        public final void mo7295a(Resolution resolution, Set<String> set) {
            C12932j.m33818b(resolution, "resolution");
            C12932j.m33818b(set, "resolvedIds");
            C6288c.f15796c.mo14142a().mo14141b(C6291c.SETTINGS, C6294e.m17353a(resolution));
            C6288c.f15796c.mo14142a().mo14138a(C6291c.SETTINGS, set.size());
            this.f5728f.mo23946k().mo24015o();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            mo7295a((Resolution) obj, (Set) obj2);
            return C12956q.f33541a;
        }
    }

    /* renamed from: app.zenly.locator.a0.s.a$e */
    static final class C1680e extends C12933k implements Function0<C12956q> {

        /* renamed from: f */
        final /* synthetic */ C1675a f5729f;

        C1680e(C1675a aVar) {
            this.f5729f = aVar;
            super(0);
        }

        public final void invoke() {
            C6288c.f15796c.mo14142a().mo14138a(C6291c.SETTINGS, this.f5729f.f5724P.size());
            this.f5729f.mo23946k().mo24015o();
        }
    }

    public C1675a(Bundle bundle) {
        C12932j.m33818b(bundle, "args");
        super(bundle);
        ArrayList<String> stringArrayList = bundle.getStringArrayList("args:ids");
        if (stringArrayList != null) {
            C12932j.m33815a((Object) stringArrayList, "args.getStringArrayList(KEY_IDS)!!");
            this.f5724P = stringArrayList;
            return;
        }
        C12932j.m33814a();
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7052b(View view) {
        C12932j.m33818b(view, "view");
        super.mo7052b(view);
        C6280a aVar = this.f5725Q;
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
        C6280a aVar = this.f5725Q;
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

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo7054a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C12932j.m33818b(layoutInflater, "inflater");
        C12932j.m33818b(viewGroup, "container");
        View inflate = layoutInflater.inflate(R.layout.controller_phone_setting_wizard, viewGroup, false);
        C12932j.m33815a((Object) inflate, "view");
        C6280a aVar = new C6280a(inflate, C12857w.m33691l(this.f5724P), C1677b.f5726f, new C1678c(this), new C1679d(this), new C1680e(this), true);
        this.f5725Q = aVar;
        return inflate;
    }
}
