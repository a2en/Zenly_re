package app.zenly.locator.experimental.referrer;

import android.content.SharedPreferences;
import app.zenly.locator.core.manager.C2718k5;
import app.zenly.locator.core.models.C2896p;
import app.zenly.locator.core.store.api.C2956k0;
import app.zenly.locator.core.store.api.FriendRequestStore;
import app.zenly.locator.experimental.referrer.ReferrerDetails.InvalidReferrerException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.C12932j;
import p213co.znly.core.ZenlyCore;
import p213co.znly.models.UserProto$User;
import p389io.reactivex.C12279e;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.functions.Function;
import p389io.reactivex.functions.Predicate;

/* renamed from: app.zenly.locator.experimental.referrer.f */
public final class C3757f {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final SharedPreferences f10050a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C3756e f10051b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final ZenlyCore f10052c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final FriendRequestStore f10053d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C2718k5 f10054e;

    /* renamed from: app.zenly.locator.experimental.referrer.f$a */
    static final class C3758a<V> implements Callable<T> {

        /* renamed from: e */
        final /* synthetic */ C3757f f10055e;

        C3758a(C3757f fVar) {
            this.f10055e = fVar;
        }

        public final String call() {
            C3756e c = this.f10055e.f10051b;
            String string = this.f10055e.f10050a.getString("key:installReferrer", "");
            if (string != null) {
                C12932j.m33815a((Object) string, "sharedPreferences.getStr…Y_INSTALL_REFERRER, \"\")!!");
                return c.mo10312a(string);
            }
            C12932j.m33814a();
            throw null;
        }
    }

    /* renamed from: app.zenly.locator.experimental.referrer.f$b */
    static final class C3759b<T, R> implements Function<T, ObservableSource<? extends R>> {

        /* renamed from: e */
        final /* synthetic */ C3757f f10056e;

        /* renamed from: f */
        final /* synthetic */ boolean f10057f;

        /* renamed from: app.zenly.locator.experimental.referrer.f$b$a */
        static final class C3760a<T, R> implements Function<T, R> {

            /* renamed from: e */
            final /* synthetic */ C3759b f10058e;

            /* renamed from: f */
            final /* synthetic */ ReferrerDetails f10059f;

            C3760a(C3759b bVar, ReferrerDetails referrerDetails) {
                this.f10058e = bVar;
                this.f10059f = referrerDetails;
            }

            /* renamed from: a */
            public final boolean mo10317a(List<C2956k0> list) {
                Object obj;
                boolean z;
                C12932j.m33818b(list, "friendRequests");
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    C2956k0 k0Var = (C2956k0) obj;
                    if (C12932j.m33817a((Object) k0Var.mo9123c().getUuid(), (Object) this.f10059f.mo10278d()) || C12932j.m33817a((Object) k0Var.mo9122b().getAuthorUuid(), (Object) this.f10059f.mo10278d())) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (z) {
                        break;
                    }
                }
                boolean z2 = obj != null;
                C2896p a = this.f10058e.f10056e.f10054e.mo8779a(this.f10059f.mo10278d());
                boolean z3 = a != null && !a.f8201e;
                if (z2 || z3) {
                    return false;
                }
                return true;
            }

            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return Boolean.valueOf(mo10317a((List) obj));
            }
        }

        /* renamed from: app.zenly.locator.experimental.referrer.f$b$b */
        static final class C3761b<T> implements Predicate<Boolean> {

            /* renamed from: e */
            public static final C3761b f10060e = new C3761b();

            C3761b() {
            }

            /* renamed from: a */
            public final Boolean mo10318a(Boolean bool) {
                C12932j.m33818b(bool, "x");
                return bool;
            }

            public /* bridge */ /* synthetic */ boolean test(Object obj) {
                Boolean bool = (Boolean) obj;
                mo10318a(bool);
                return bool.booleanValue();
            }
        }

        /* renamed from: app.zenly.locator.experimental.referrer.f$b$c */
        static final class C3762c<T, R> implements Function<T, ObservableSource<? extends R>> {

            /* renamed from: e */
            final /* synthetic */ C3759b f10061e;

            /* renamed from: f */
            final /* synthetic */ ReferrerDetails f10062f;

            C3762c(C3759b bVar, ReferrerDetails referrerDetails) {
                this.f10061e = bVar;
                this.f10062f = referrerDetails;
            }

            /* renamed from: a */
            public final C12279e<UserProto$User> apply(Boolean bool) {
                C12932j.m33818b(bool, "it");
                return this.f10061e.f10056e.f10052c.userPublicStream(this.f10062f.mo10278d());
            }
        }

        C3759b(C3757f fVar, boolean z) {
            this.f10056e = fVar;
            this.f10057f = z;
        }

        /* renamed from: a */
        public final C12279e<UserProto$User> apply(String str) {
            C12932j.m33818b(str, "referrer");
            try {
                if (str.length() == 0) {
                    return C12279e.m32633q();
                }
                if (this.f10057f) {
                    return this.f10056e.f10052c.userPublicStream(ReferrerDetails.f9994e.mo10288a(str).mo10278d()).mo36487e(1);
                }
                ReferrerDetails a = ReferrerDetails.f9994e.mo10288a(str);
                return this.f10056e.f10053d.friendRequests().mo36501i(new C3760a(this, a)).mo36459b((Predicate<? super T>) C3761b.f10060e).mo36490e((Function<? super T, ? extends ObservableSource<? extends R>>) new C3762c<Object,Object>(this, a)).mo36487e(1);
            } catch (InvalidReferrerException unused) {
                return C12279e.m32633q();
            }
        }
    }

    public C3757f(SharedPreferences sharedPreferences, C3756e eVar, ZenlyCore zenlyCore, FriendRequestStore friendRequestStore, C2718k5 k5Var) {
        C12932j.m33818b(sharedPreferences, "sharedPreferences");
        C12932j.m33818b(eVar, "referrerEncryption");
        C12932j.m33818b(zenlyCore, "zenlyCore");
        C12932j.m33818b(friendRequestStore, "friendRequestStore");
        C12932j.m33818b(k5Var, "friendsManager");
        this.f10050a = sharedPreferences;
        this.f10051b = eVar;
        this.f10052c = zenlyCore;
        this.f10053d = friendRequestStore;
        this.f10054e = k5Var;
    }

    /* renamed from: a */
    public final C12279e<UserProto$User> mo10314a(boolean z) {
        C12279e<UserProto$User> e = C12279e.m32616a((Callable<? extends T>) new C3758a<Object>(this)).mo36490e((Function<? super T, ? extends ObservableSource<? extends R>>) new C3759b<Object,Object>(this, z));
        C12932j.m33815a((Object) e, "Observable.fromCallable …)\n            }\n        }");
        return e;
    }
}
