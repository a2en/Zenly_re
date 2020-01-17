package app.zenly.locator.core.p072ui.view;

import app.zenly.android.feature.base.scheduling.C1351e;
import app.zenly.android.feature.base.scheduling.ZenlySchedulers;
import app.zenly.locator.C3819h;
import app.zenly.locator.core.widget.DecorView;
import kotlin.C12956q;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12931i;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12946x;
import kotlin.reflect.KDeclarationContainer;
import p389io.reactivex.C12286f;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.p406n.C12789c;

/* renamed from: app.zenly.locator.core.ui.view.f */
public final class C3144f {

    /* renamed from: a */
    private final ZenlySchedulers f8703a = C1351e.m6372a(C3819h.f10169b.mo19916a("inAppService"));

    /* renamed from: b */
    private final C12789c<C3140d> f8704b;

    /* renamed from: c */
    private final C12789c<C3140d> f8705c;

    /* renamed from: d */
    private final DecorView f8706d;

    /* renamed from: app.zenly.locator.core.ui.view.f$a */
    static final /* synthetic */ class C3145a extends C12931i implements Function1<C3140d, C12956q> {
        C3145a(InAppNotificationContainer inAppNotificationContainer) {
            super(1, inAppNotificationContainer);
        }

        /* renamed from: a */
        public final void mo9477a(C3140d dVar) {
            C12932j.m33818b(dVar, "p1");
            ((InAppNotificationContainer) this.f33505f).mo9409b(dVar);
        }

        /* renamed from: d */
        public final KDeclarationContainer mo6620d() {
            return C12946x.m33834a(InAppNotificationContainer.class);
        }

        /* renamed from: f */
        public final String mo6621f() {
            return "show(Lapp/zenly/locator/core/ui/view/InAppNotification;)V";
        }

        public final String getName() {
            return "show";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo9477a((C3140d) obj);
            return C12956q.f33541a;
        }
    }

    /* renamed from: app.zenly.locator.core.ui.view.f$b */
    static final /* synthetic */ class C3146b extends C12931i implements Function1<C3140d, C12956q> {
        C3146b(InAppNotificationContainer inAppNotificationContainer) {
            super(1, inAppNotificationContainer);
        }

        /* renamed from: a */
        public final void mo9478a(C3140d dVar) {
            C12932j.m33818b(dVar, "p1");
            ((InAppNotificationContainer) this.f33505f).mo9408a(dVar);
        }

        /* renamed from: d */
        public final KDeclarationContainer mo6620d() {
            return C12946x.m33834a(InAppNotificationContainer.class);
        }

        /* renamed from: f */
        public final String mo6621f() {
            return "hide(Lapp/zenly/locator/core/ui/view/InAppNotification;)V";
        }

        public final String getName() {
            return "hide";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo9478a((C3140d) obj);
            return C12956q.f33541a;
        }
    }

    public C3144f(DecorView decorView) {
        C12932j.m33818b(decorView, "decorView");
        this.f8706d = decorView;
        C12789c<C3140d> s = C12789c.m33462s();
        String str = "PublishSubject.create<InAppNotification>()";
        C12932j.m33815a((Object) s, str);
        this.f8704b = s;
        C12789c<C3140d> s2 = C12789c.m33462s();
        C12932j.m33815a((Object) s2, str);
        this.f8705c = s2;
    }

    /* renamed from: a */
    public final DecorView mo9473a() {
        return this.f8706d;
    }

    /* renamed from: b */
    public final void mo9476b(C3140d dVar) {
        C12932j.m33818b(dVar, "notification");
        this.f8704b.onNext(dVar);
    }

    /* renamed from: a */
    public final void mo9474a(C3140d dVar) {
        C12932j.m33818b(dVar, "notification");
        this.f8705c.onNext(dVar);
    }

    /* renamed from: b */
    public final Disposable mo9475b() {
        return new C12275b(this.f8704b.mo36428a((C12286f) this.f8703a.getMainThread()).mo36476d((Consumer<? super T>) new C3143e<Object>(new C3145a(this.f8706d.getInAppNotificationContainer()))), this.f8705c.mo36428a((C12286f) this.f8703a.getMainThread()).mo36476d((Consumer<? super T>) new C3143e<Object>(new C3146b(this.f8706d.getInAppNotificationContainer()))));
    }
}
