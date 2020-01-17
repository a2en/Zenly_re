package app.zenly.locator.modals.p118l2;

import android.content.Context;
import android.graphics.Bitmap;
import app.zenly.locator.chat.panel.emojis.C2234d0;
import app.zenly.locator.p143s.p162w.p163c.C5569a;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C12932j;
import p387h.p388a.C12143a;
import p389io.reactivex.C12279e;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.functions.Predicate;
import p389io.reactivex.p390h.p392c.C12295a;
import p389io.reactivex.p405m.C12773a;

/* renamed from: app.zenly.locator.modals.l2.b */
public final class C4581b {

    /* renamed from: a */
    private final C4587c f12217a = new C4587c();

    /* renamed from: b */
    private final C12275b f12218b = new C12275b();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C4578a f12219c;

    /* renamed from: d */
    private final String f12220d;

    /* renamed from: app.zenly.locator.modals.l2.b$a */
    static final class C4582a<T> implements Consumer<C2234d0> {

        /* renamed from: e */
        final /* synthetic */ C4581b f12221e;

        C4582a(C4581b bVar) {
            this.f12221e = bVar;
        }

        /* renamed from: a */
        public final void accept(C2234d0 d0Var) {
            C4578a a = this.f12221e.f12219c;
            C12932j.m33815a((Object) d0Var, "p");
            a.mo11716a(d0Var);
        }
    }

    /* renamed from: app.zenly.locator.modals.l2.b$b */
    static final class C4583b<T> implements Consumer<Throwable> {

        /* renamed from: e */
        public static final C4583b f12222e = new C4583b();

        C4583b() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C12143a.m32032b(th, "Failed getting pack", new Object[0]);
        }
    }

    /* renamed from: app.zenly.locator.modals.l2.b$c */
    static final class C4584c<T> implements Predicate<List<Bitmap>> {

        /* renamed from: e */
        public static final C4584c f12223e = new C4584c();

        C4584c() {
        }

        /* renamed from: a */
        public final boolean test(List<Bitmap> list) {
            C12932j.m33818b(list, "emojis");
            return !list.isEmpty();
        }
    }

    /* renamed from: app.zenly.locator.modals.l2.b$d */
    static final class C4585d<T> implements Consumer<List<Bitmap>> {

        /* renamed from: e */
        final /* synthetic */ C4581b f12224e;

        C4585d(C4581b bVar) {
            this.f12224e = bVar;
        }

        /* renamed from: a */
        public final void accept(List<Bitmap> list) {
            C4578a a = this.f12224e.f12219c;
            C12932j.m33815a((Object) list, "emojis");
            a.mo11717a(list);
        }
    }

    /* renamed from: app.zenly.locator.modals.l2.b$e */
    static final class C4586e<T> implements Consumer<Throwable> {

        /* renamed from: e */
        public static final C4586e f12225e = new C4586e();

        C4586e() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C12143a.m32032b(th, "Failed getting emoji bitmaps", new Object[0]);
        }
    }

    public C4581b(C4578a aVar, String str) {
        C12932j.m33818b(aVar, "controller");
        C12932j.m33818b(str, "uuid");
        this.f12219c = aVar;
        this.f12220d = str;
    }

    /* renamed from: b */
    private final void m13421b(Context context) {
        C12279e a = this.f12217a.mo11728a(this.f12220d);
        Disposable a2 = a.mo36428a(C12295a.m32802a()).mo36412a((Consumer<? super T>) new C4582a<Object>(this), (Consumer<? super Throwable>) C4583b.f12222e);
        C12932j.m33815a((Object) a2, "pack\n            .observ…ng pack\") }\n            )");
        C12773a.m33432a(a2, this.f12218b);
        Disposable a3 = a.mo36427a(this.f12217a.mo11727a(new C5569a(context))).mo36511n().mo36532a((Predicate<? super T>) C4584c.f12223e).mo36375a(500, TimeUnit.MILLISECONDS).mo36378a(C12295a.m32802a()).mo36385a((Consumer<? super T>) new C4585d<Object>(this), (Consumer<? super Throwable>) C4586e.f12225e);
        C12932j.m33815a((Object) a3, "pack\n            .compos…bitmaps\") }\n            )");
        C12773a.m33432a(a3, this.f12218b);
    }

    /* renamed from: a */
    public final void mo11720a() {
        this.f12218b.mo36401a();
    }

    /* renamed from: a */
    public final void mo11721a(Context context) {
        C12932j.m33818b(context, "context");
        m13421b(context);
    }
}
