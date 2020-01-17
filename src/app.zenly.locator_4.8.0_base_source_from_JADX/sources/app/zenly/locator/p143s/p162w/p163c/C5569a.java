package app.zenly.locator.p143s.p162w.p163c;

import android.content.Context;
import android.graphics.Bitmap;
import app.zenly.locator.core.glide.C2476d;
import app.zenly.locator.core.helper.C2510c;
import app.zenly.locator.p143s.p148l.C5448c;
import com.bumptech.glide.load.engine.C8978i;
import java.util.concurrent.Future;
import kotlin.jvm.internal.C12932j;
import p213co.znly.core.ZenlyCore;
import p213co.znly.models.services.C8338v3;
import p389io.reactivex.C12279e;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.functions.Function;

/* renamed from: app.zenly.locator.s.w.c.a */
public final class C5569a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final String f14230a = C2510c.m8763a(this.f14233d);
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final ZenlyCore f14231b = C5448c.m15478a();

    /* renamed from: c */
    private final C12279e<C8338v3> f14232c;

    /* renamed from: d */
    private final Context f14233d;

    /* renamed from: app.zenly.locator.s.w.c.a$a */
    static final class C5570a<T, R> implements Function<T, ObservableSource<? extends R>> {

        /* renamed from: e */
        final /* synthetic */ C5569a f14234e;

        /* renamed from: f */
        final /* synthetic */ String f14235f;

        C5570a(C5569a aVar, String str) {
            this.f14234e = aVar;
            this.f14235f = str;
        }

        /* renamed from: a */
        public final C12279e<String> apply(C8338v3 v3Var) {
            C12932j.m33818b(v3Var, "it");
            ZenlyCore a = this.f14234e.f14231b;
            StringBuilder sb = new StringBuilder();
            sb.append(v3Var.getRootUrl());
            sb.append(this.f14235f);
            sb.append(this.f14234e.f14230a);
            sb.append(".png");
            return a.cache(sb.toString());
        }
    }

    /* renamed from: app.zenly.locator.s.w.c.a$b */
    static final class C5571b<T, R> implements Function<T, ObservableSource<? extends R>> {

        /* renamed from: e */
        final /* synthetic */ C5569a f14236e;

        C5571b(C5569a aVar) {
            this.f14236e = aVar;
        }

        /* renamed from: a */
        public final C12279e<Bitmap> apply(String str) {
            C12932j.m33818b(str, "it");
            return this.f14236e.mo13180b(str);
        }
    }

    public C5569a(Context context) {
        C12932j.m33818b(context, "context");
        this.f14233d = context;
        C12279e<C8338v3> b = this.f14231b.pingManifestStream().mo36487e(1).mo36447b();
        C12932j.m33815a((Object) b, "core.pingManifestStream().take(1).cache()");
        this.f14232c = b;
    }

    /* renamed from: c */
    public final C12279e<Bitmap> mo13181c(String str) {
        C12932j.m33818b(str, "uuid");
        C12279e<Bitmap> e = mo13179a(str).mo36490e((Function<? super T, ? extends ObservableSource<? extends R>>) new C5571b<Object,Object>(this));
        C12932j.m33815a((Object) e, "getLocalUrl(uuid)\n      …latMap { loadBitmap(it) }");
        return e;
    }

    /* renamed from: a */
    public final C12279e<String> mo13179a(String str) {
        C12932j.m33818b(str, "uuid");
        C12279e<String> e = this.f14232c.mo36490e((Function<? super T, ? extends ObservableSource<? extends R>>) new C5570a<Object,Object>(this, str));
        C12932j.m33815a((Object) e, "manifestCache\n          …$uuid$scaleSuffix.png\") }");
        return e;
    }

    /* renamed from: b */
    public final C12279e<Bitmap> mo13180b(String str) {
        C12932j.m33818b(str, "path");
        C12279e<Bitmap> a = C12279e.m32617a((Future<? extends T>) C2476d.m8582a(this.f14233d).m8714a().m8684a(str).m8691a(C8978i.f23424b).m8695a(false).mo24170M());
        C12932j.m33815a((Object) a, "Observable.fromFuture(\n …      .submit()\n        )");
        return a;
    }
}
