package app.zenly.locator.powermoves.api;

import android.content.Context;
import app.zenly.locator.powermoves.p127b.C4984a;
import app.zenly.locator.powermoves.p127b.C4984a.C4985a;
import app.zenly.locator.powermoves.p127b.C4984a.C4985a.C4986a;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.C12899i;
import kotlin.jvm.internal.C12932j;
import p389io.reactivex.C12271b;
import p389io.reactivex.C12279e;
import p389io.reactivex.C12291g;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.SingleSource;
import p389io.reactivex.functions.Function;
import p389io.reactivex.functions.Predicate;
import p389io.reactivex.p405m.C12774b;
import p389io.reactivex.p405m.C12777c;
import p389io.reactivex.schedulers.C12802a;

/* renamed from: app.zenly.locator.powermoves.api.a */
public final class C4966a implements PowerMovesService {

    /* renamed from: a */
    private final C4981c f12980a = C4981c.f12999b;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C4975b f12981b;

    /* renamed from: app.zenly.locator.powermoves.api.a$a */
    static final class C4967a<T, R> implements Function<T, R> {

        /* renamed from: e */
        public static final C4967a f12982e = new C4967a();

        C4967a() {
        }

        /* renamed from: a */
        public final boolean mo12194a(C12899i<Boolean, Boolean> iVar) {
            C12932j.m33818b(iVar, "<name for destructuring parameter 0>");
            Boolean bool = (Boolean) iVar.mo37202a();
            Boolean bool2 = (Boolean) iVar.mo37203b();
            C12932j.m33815a((Object) bool, "areAllRead");
            return bool.booleanValue() && !bool2.booleanValue();
        }

        public /* bridge */ /* synthetic */ Object apply(Object obj) {
            return Boolean.valueOf(mo12194a((C12899i) obj));
        }
    }

    /* renamed from: app.zenly.locator.powermoves.api.a$b */
    static final class C4968b<T, R> implements Function<T, SingleSource<? extends R>> {

        /* renamed from: e */
        final /* synthetic */ C4966a f12983e;

        /* renamed from: app.zenly.locator.powermoves.api.a$b$a */
        static final class C4969a<V> implements Callable<Boolean> {

            /* renamed from: e */
            final /* synthetic */ Boolean f12984e;

            C4969a(Boolean bool) {
                this.f12984e = bool;
            }

            public final Boolean call() {
                return this.f12984e;
            }
        }

        C4968b(C4966a aVar) {
            this.f12983e = aVar;
        }

        /* renamed from: a */
        public final C12291g<Boolean> apply(Boolean bool) {
            C12932j.m33818b(bool, "isJustUnlock");
            if (bool.booleanValue()) {
                return this.f12983e.f12981b.setHasUnlockGift().mo36348a((Callable<? extends T>) new C4969a<Object>(bool));
            }
            return C12291g.m32767b(bool);
        }
    }

    /* renamed from: app.zenly.locator.powermoves.api.a$c */
    static final class C4970c<T, R> implements Function<T, ObservableSource<? extends R>> {

        /* renamed from: e */
        public static final C4970c f12985e = new C4970c();

        C4970c() {
        }

        /* renamed from: a */
        public final C12279e<C4984a> apply(List<C4984a> list) {
            C12932j.m33818b(list, "it");
            return C12279e.m32623b((Iterable<? extends T>) list);
        }
    }

    /* renamed from: app.zenly.locator.powermoves.api.a$d */
    static final class C4971d<T, R> implements Function<T, ObservableSource<? extends R>> {

        /* renamed from: e */
        final /* synthetic */ C4966a f12986e;

        C4971d(C4966a aVar) {
            this.f12986e = aVar;
        }

        /* renamed from: a */
        public final C12279e<C12899i<C4984a, Boolean>> apply(C4984a aVar) {
            C12932j.m33818b(aVar, "it");
            C12774b bVar = C12774b.f33320a;
            C12279e e = C12279e.m32626e(aVar);
            C12932j.m33815a((Object) e, "Observable.just(it)");
            C12279e e2 = this.f12986e.f12981b.isPowerMoveRead(aVar).mo36553e();
            C12932j.m33815a((Object) e2, "sharedPrefService.isPowe…veRead(it).toObservable()");
            return bVar.mo36956b(e, e2);
        }
    }

    /* renamed from: app.zenly.locator.powermoves.api.a$e */
    static final class C4972e<T, R> implements Function<T, R> {

        /* renamed from: e */
        public static final C4972e f12987e = new C4972e();

        C4972e() {
        }

        /* renamed from: a */
        public final C4984a apply(C12899i<C4984a, Boolean> iVar) {
            C12932j.m33818b(iVar, "<name for destructuring parameter 0>");
            C4984a aVar = (C4984a) iVar.mo37202a();
            Boolean bool = (Boolean) iVar.mo37203b();
            C4984a a = C4984a.m14338a(aVar, null, 0, 0, null, null, 31, null);
            C4986a aVar2 = C4985a.f13011h;
            C12932j.m33815a((Object) bool, "read");
            a.mo12211a(aVar2.mo12227a(bool.booleanValue()));
            return a;
        }
    }

    /* renamed from: app.zenly.locator.powermoves.api.a$f */
    static final class C4973f<T, R> implements Function<T, ObservableSource<? extends R>> {

        /* renamed from: e */
        public static final C4973f f12988e = new C4973f();

        C4973f() {
        }

        /* renamed from: a */
        public final C12279e<C4984a> apply(List<C4984a> list) {
            C12932j.m33818b(list, "it");
            return C12279e.m32623b((Iterable<? extends T>) list);
        }
    }

    /* renamed from: app.zenly.locator.powermoves.api.a$g */
    static final class C4974g<T> implements Predicate<C4984a> {

        /* renamed from: e */
        public static final C4974g f12989e = new C4974g();

        C4974g() {
        }

        /* renamed from: a */
        public final boolean test(C4984a aVar) {
            C12932j.m33818b(aVar, "it");
            return aVar.mo12218f() == C4985a.READ;
        }
    }

    public C4966a(Context context) {
        C12932j.m33818b(context, "context");
        this.f12981b = new C4975b(context);
    }

    public C12291g<Boolean> hasAlreadyUnlockGift() {
        return this.f12981b.hasAlreadyUnlockGift();
    }

    public C12291g<Boolean> isPowerMoveRead(C4984a aVar) {
        C12932j.m33818b(aVar, "powerMove");
        return this.f12981b.isPowerMoveRead(aVar);
    }

    public C12291g<Boolean> justUnlockedPowerMoves() {
        C12291g<Boolean> b = C12777c.f33323a.mo36957a(powerMovesRead(), this.f12981b.hasAlreadyUnlockGift()).mo36552d((Function<? super T, ? extends R>) C4967a.f12982e).mo36538a((Function<? super T, ? extends SingleSource<? extends R>>) new C4968b<Object,Object>(this)).mo36544b(C12802a.m33491b()).mo36543b();
        C12932j.m33815a((Object) b, "Singles.zip(powerMovesRe…(Schedulers.io()).cache()");
        return b;
    }

    public C12271b markPowerMoveAsRead(C4984a aVar) {
        C12932j.m33818b(aVar, "powerMove");
        return this.f12981b.setPowermoveAsRead(aVar);
    }

    public C12291g<C4984a> powerMove(String str) {
        C12932j.m33818b(str, "id");
        C12291g<C4984a> b = this.f12980a.powerMove(str).mo36544b(C12802a.m33491b()).mo36543b();
        C12932j.m33815a((Object) b, "powerMoveDataSource\n    …(Schedulers.io()).cache()");
        return b;
    }

    public C12291g<List<C4984a>> powerMoves() {
        C12291g<List<C4984a>> b = this.f12980a.powerMoves().mo36548c((Function<? super T, ? extends ObservableSource<? extends R>>) C4970c.f12985e).mo36490e((Function<? super T, ? extends ObservableSource<? extends R>>) new C4971d<Object,Object>(this)).mo36501i(C4972e.f12987e).mo36512o().mo36544b(C12802a.m33491b()).mo36543b();
        C12932j.m33815a((Object) b, "powerMoveDataSource.powe…(Schedulers.io()).cache()");
        return b;
    }

    public C12291g<Boolean> powerMovesRead() {
        C12291g<Boolean> b = powerMoves().mo36548c((Function<? super T, ? extends ObservableSource<? extends R>>) C4973f.f12988e).mo36444a((Predicate<? super T>) C4974g.f12989e).mo36544b(C12802a.m33491b()).mo36543b();
        C12932j.m33815a((Object) b, "powerMoves()\n           …(Schedulers.io()).cache()");
        return b;
    }

    public C12271b setHasUnlockGift() {
        return this.f12981b.setHasUnlockGift();
    }
}
