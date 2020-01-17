package app.zenly.locator.modals;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import app.zenly.locator.R;
import app.zenly.locator.modals.C4545f2.C4546a;
import app.zenly.locator.p143s.p148l.C5448c;
import app.zenly.locator.p207x.C6272z1;
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

/* renamed from: app.zenly.locator.modals.i2 */
public final class C4560i2 extends ModalController {

    /* renamed from: T */
    public static final C4561a f12189T = new C4561a(null);
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public final ArrayList<String> f12190Q;
    /* access modifiers changed from: private */

    /* renamed from: R */
    public final C6291c f12191R;

    /* renamed from: S */
    private C6280a f12192S;

    /* renamed from: app.zenly.locator.modals.i2$a */
    public static final class C4561a {
        private C4561a() {
        }

        /* renamed from: a */
        public static /* synthetic */ C4560i2 m13401a(C4561a aVar, C6291c cVar, Set set, int i, Object obj) {
            if ((i & 2) != 0) {
                set = C12845m0.m33632a();
            }
            return aVar.mo11712a(cVar, set);
        }

        public /* synthetic */ C4561a(C12928f fVar) {
            this();
        }

        /* renamed from: a */
        public final C4560i2 mo11712a(C6291c cVar, Set<String> set) {
            C12932j.m33818b(cVar, "origin");
            C12932j.m33818b(set, "resolvedIds");
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("args:ids", new ArrayList(set));
            bundle.putString("args:origin", cVar.name());
            return new C4560i2(bundle);
        }
    }

    /* renamed from: app.zenly.locator.modals.i2$b */
    static final class C4562b extends C12933k implements Function1<Resolution, C12956q> {

        /* renamed from: f */
        final /* synthetic */ C4560i2 f12193f;

        C4562b(C4560i2 i2Var) {
            this.f12193f = i2Var;
            super(1);
        }

        /* renamed from: a */
        public final void mo11713a(Resolution resolution) {
            C12932j.m33818b(resolution, "resolution");
            C6288c.f15796c.mo14142a().mo14139a(this.f12193f.f12191R, C6294e.m17353a(resolution));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo11713a((Resolution) obj);
            return C12956q.f33541a;
        }
    }

    /* renamed from: app.zenly.locator.modals.i2$c */
    static final class C4563c extends C12933k implements Function2<Resolution, Set<? extends String>, C12956q> {

        /* renamed from: f */
        final /* synthetic */ C4560i2 f12194f;

        C4563c(C4560i2 i2Var) {
            this.f12194f = i2Var;
            super(2);
        }

        /* renamed from: a */
        public final void mo11714a(Resolution resolution, Set<String> set) {
            C12932j.m33818b(resolution, "resolution");
            C12932j.m33818b(set, "resolvedIds");
            C6288c.f15796c.mo14142a().mo14141b(this.f12194f.f12191R, C6294e.m17353a(resolution));
            C4560i2 a = C4560i2.f12189T.mo11712a(this.f12194f.f12191R, set);
            a.mo23929b(this.f12194f.mo23947l());
            C8831g k = this.f12194f.mo23946k();
            C8836h a2 = C8836h.m21058a((C8819d) a);
            a2.mo24026b(new C8816c());
            a2.mo24023a((ControllerChangeHandler) new C8816c());
            k.mo24005c(a2);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            mo11714a((Resolution) obj, (Set) obj2);
            return C12956q.f33541a;
        }
    }

    /* renamed from: app.zenly.locator.modals.i2$d */
    static final class C4564d extends C12933k implements Function2<Resolution, Set<? extends String>, C12956q> {

        /* renamed from: f */
        final /* synthetic */ C4560i2 f12195f;

        C4564d(C4560i2 i2Var) {
            this.f12195f = i2Var;
            super(2);
        }

        /* renamed from: a */
        public final void mo11715a(Resolution resolution, Set<String> set) {
            C12932j.m33818b(resolution, "resolution");
            C12932j.m33818b(set, "resolvedIds");
            C6288c.f15796c.mo14142a().mo14141b(this.f12195f.f12191R, C6294e.m17353a(resolution));
            C6288c.f15796c.mo14142a().mo14138a(this.f12195f.f12191R, set.size());
            this.f12195f.m13391F();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            mo11715a((Resolution) obj, (Set) obj2);
            return C12956q.f33541a;
        }
    }

    /* renamed from: app.zenly.locator.modals.i2$e */
    static final class C4565e extends C12933k implements Function0<C12956q> {

        /* renamed from: f */
        final /* synthetic */ C4560i2 f12196f;

        C4565e(C4560i2 i2Var) {
            this.f12196f = i2Var;
            super(0);
        }

        public final void invoke() {
            C6288c.f15796c.mo14142a().mo14138a(this.f12196f.f12191R, this.f12196f.f12190Q.size());
            this.f12196f.m13391F();
        }
    }

    public C4560i2(Bundle bundle) {
        C12932j.m33818b(bundle, "args");
        super(bundle);
        ArrayList<String> stringArrayList = bundle.getStringArrayList("args:ids");
        if (stringArrayList != null) {
            C12932j.m33815a((Object) stringArrayList, "args.getStringArrayList(KEY_IDS)!!");
            this.f12190Q = stringArrayList;
            String string = bundle.getString("args:origin");
            if (string != null) {
                C12932j.m33815a((Object) string, "args.getString(KEY_ORIGIN)!!");
                this.f12191R = C6291c.valueOf(string);
                return;
            }
            C12932j.m33814a();
            throw null;
        }
        C12932j.m33814a();
        throw null;
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public final void m13391F() {
        C5448c.m15478a().resetSyncTimeout();
        C8819d l = mo23947l();
        if (l instanceof C6272z1) {
            ((C6272z1) l).mo14119b(mo11711E());
        }
        mo23946k().mo23997a((C8819d) this);
    }

    /* renamed from: E */
    public C4545f2 mo11711E() {
        return new C4545f2(C4546a.PHONE_SETTINGS, this.f12191R.name());
    }

    /* renamed from: b */
    public Void m13398b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
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
    /* renamed from: a */
    public View mo7054a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C12932j.m33818b(layoutInflater, "inflater");
        C12932j.m33818b(viewGroup, "container");
        View inflate = layoutInflater.inflate(R.layout.controller_phone_setting_wizard, viewGroup, false);
        C12932j.m33815a((Object) inflate, "view");
        C6280a aVar = new C6280a(inflate, C12857w.m33691l(this.f12190Q), new C4562b(this), new C4563c(this), new C4564d(this), new C4565e(this), true);
        this.f12192S = aVar;
        return inflate;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo7066c(View view) {
        C12932j.m33818b(view, "view");
        C6280a aVar = this.f12192S;
        if (aVar != null) {
            aVar.mo14132c();
            super.mo7066c(view);
            return;
        }
        C12932j.m33820c("wizardViewController");
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7052b(View view) {
        C12932j.m33818b(view, "view");
        super.mo7052b(view);
        C6280a aVar = this.f12192S;
        if (aVar != null) {
            aVar.mo14131b();
        } else {
            C12932j.m33820c("wizardViewController");
            throw null;
        }
    }
}
