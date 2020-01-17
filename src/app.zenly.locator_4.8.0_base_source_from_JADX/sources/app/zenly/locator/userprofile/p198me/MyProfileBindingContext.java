package app.zenly.locator.userprofile.p198me;

import app.zenly.android.feature.base.scheduling.C1351e;
import app.zenly.android.feature.base.scheduling.ZenlySchedulers;
import com.snap.p327ui.recycling.BindingContext;
import kotlin.C12956q;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12931i;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12946x;
import kotlin.reflect.KDeclarationContainer;
import p250f.p251a.p252a.p263b.p264a.p266e.C7702b;
import p389io.reactivex.C12279e;
import p389io.reactivex.C12286f;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.p405m.C12773a;

/* renamed from: app.zenly.locator.userprofile.me.MyProfileBindingContext */
public final class MyProfileBindingContext implements BindingContext {

    /* renamed from: a */
    private final C12275b f15187a = new C12275b();

    /* renamed from: b */
    private final ZenlySchedulers f15188b = C1351e.m6372a(new C7702b("profile").mo19916a("bindingContext"));

    /* renamed from: c */
    private final C12279e<Boolean> f15189c;

    /* renamed from: app.zenly.locator.userprofile.me.MyProfileBindingContext$VisibilityChangeCallback */
    public interface VisibilityChangeCallback {
        void onVisibilityChange(boolean z);
    }

    /* renamed from: app.zenly.locator.userprofile.me.MyProfileBindingContext$a */
    static final /* synthetic */ class C6029a extends C12931i implements Function1<Boolean, C12956q> {
        C6029a(VisibilityChangeCallback visibilityChangeCallback) {
            super(1, visibilityChangeCallback);
        }

        /* renamed from: a */
        public final void mo13818a(boolean z) {
            ((VisibilityChangeCallback) this.f33505f).onVisibilityChange(z);
        }

        /* renamed from: d */
        public final KDeclarationContainer mo6620d() {
            return C12946x.m33834a(VisibilityChangeCallback.class);
        }

        /* renamed from: f */
        public final String mo6621f() {
            return "onVisibilityChange(Z)V";
        }

        public final String getName() {
            return "onVisibilityChange";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo13818a(((Boolean) obj).booleanValue());
            return C12956q.f33541a;
        }
    }

    public MyProfileBindingContext(C12279e<Boolean> eVar) {
        C12932j.m33818b(eVar, "visibilityObservable");
        this.f15189c = eVar;
    }

    /* renamed from: a */
    public final void mo13816a(VisibilityChangeCallback visibilityChangeCallback) {
        C12932j.m33818b(visibilityChangeCallback, "callback");
        Disposable d = this.f15189c.mo36428a((C12286f) this.f15188b.getMainThread()).mo36476d((Consumer<? super T>) new C6041a<Object>(new C6029a(visibilityChangeCallback)));
        C12932j.m33815a((Object) d, "visibilityObservable\n   …back::onVisibilityChange)");
        C12773a.m33432a(d, this.f15187a);
    }

    /* renamed from: a */
    public final void mo13815a() {
        this.f15187a.mo36401a();
    }
}
