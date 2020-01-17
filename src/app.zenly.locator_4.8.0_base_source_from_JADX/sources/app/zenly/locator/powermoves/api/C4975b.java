package app.zenly.locator.powermoves.api;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import app.zenly.locator.powermoves.p127b.C4984a;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.C12932j;
import p389io.reactivex.C12271b;
import p389io.reactivex.C12291g;
import p389io.reactivex.schedulers.C12802a;

/* renamed from: app.zenly.locator.powermoves.api.b */
public final class C4975b implements SharedPrefService {

    /* renamed from: b */
    public static final C4976a f12990b = new C4976a(null);
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final SharedPreferences f12991a;

    /* renamed from: app.zenly.locator.powermoves.api.b$a */
    public static final class C4976a {
        private C4976a() {
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final String m14335a() {
            return "app.zenly.locator.powermoves";
        }

        public /* synthetic */ C4976a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.locator.powermoves.api.b$b */
    static final class C4977b<V> implements Callable<T> {

        /* renamed from: e */
        final /* synthetic */ C4975b f12992e;

        C4977b(C4975b bVar) {
            this.f12992e = bVar;
        }

        public final boolean call() {
            return this.f12992e.f12991a.getBoolean("UNLOCK_GIFT", false);
        }
    }

    /* renamed from: app.zenly.locator.powermoves.api.b$c */
    static final class C4978c<V> implements Callable<T> {

        /* renamed from: e */
        final /* synthetic */ C4975b f12993e;

        /* renamed from: f */
        final /* synthetic */ C4984a f12994f;

        C4978c(C4975b bVar, C4984a aVar) {
            this.f12993e = bVar;
            this.f12994f = aVar;
        }

        public final boolean call() {
            SharedPreferences a = this.f12993e.f12991a;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f12994f.mo12216e());
            sb.append("_READ");
            return a.getBoolean(sb.toString(), false);
        }
    }

    /* renamed from: app.zenly.locator.powermoves.api.b$d */
    static final class C4979d<V> implements Callable<Object> {

        /* renamed from: e */
        final /* synthetic */ C4975b f12995e;

        C4979d(C4975b bVar) {
            this.f12995e = bVar;
        }

        public final Editor call() {
            Editor edit = this.f12995e.f12991a.edit();
            edit.putBoolean("UNLOCK_GIFT", true);
            edit.apply();
            return edit;
        }
    }

    /* renamed from: app.zenly.locator.powermoves.api.b$e */
    static final class C4980e<V> implements Callable<Object> {

        /* renamed from: e */
        final /* synthetic */ C4975b f12996e;

        /* renamed from: f */
        final /* synthetic */ C4984a f12997f;

        C4980e(C4975b bVar, C4984a aVar) {
            this.f12996e = bVar;
            this.f12997f = aVar;
        }

        public final Editor call() {
            Editor edit = this.f12996e.f12991a.edit();
            StringBuilder sb = new StringBuilder();
            sb.append(this.f12997f.mo12216e());
            sb.append("_READ");
            edit.putBoolean(sb.toString(), true);
            edit.apply();
            return edit;
        }
    }

    public C4975b(Context context) {
        C12932j.m33818b(context, "context");
        this.f12991a = context.getSharedPreferences(f12990b.m14335a(), 0);
    }

    public C12291g<Boolean> hasAlreadyUnlockGift() {
        C12291g<Boolean> b = C12291g.m32769c((Callable<? extends T>) new C4977b<Object>(this)).mo36544b(C12802a.m33491b()).mo36543b();
        C12932j.m33815a((Object) b, "Single.fromCallable {\n  …(Schedulers.io()).cache()");
        return b;
    }

    public C12291g<Boolean> isPowerMoveRead(C4984a aVar) {
        C12932j.m33818b(aVar, "powerMove");
        C12291g<Boolean> b = C12291g.m32769c((Callable<? extends T>) new C4978c<Object>(this, aVar)).mo36544b(C12802a.m33491b()).mo36543b();
        C12932j.m33815a((Object) b, "Single.fromCallable {\n  …(Schedulers.io()).cache()");
        return b;
    }

    public C12271b setHasUnlockGift() {
        C12271b a = C12271b.m32507b((Callable<?>) new C4979d<Object>(this)).mo36350b(C12802a.m33491b()).mo36338a();
        C12932j.m33815a((Object) a, "Completable.fromCallable…(Schedulers.io()).cache()");
        return a;
    }

    public C12271b setPowermoveAsRead(C4984a aVar) {
        C12932j.m33818b(aVar, "powerMove");
        C12271b a = C12271b.m32507b((Callable<?>) new C4980e<Object>(this, aVar)).mo36350b(C12802a.m33491b()).mo36338a();
        C12932j.m33815a((Object) a, "Completable.fromCallable…(Schedulers.io()).cache()");
        return a;
    }
}
