package app.zenly.locator.chat.p059r5;

import android.widget.ImageView;
import app.zenly.locator.core.glide.C2485i;
import app.zenly.locator.p143s.p148l.C5448c;
import com.bumptech.glide.load.engine.C8978i;
import kotlin.jvm.internal.C12932j;
import p387h.p388a.C12143a;
import p389io.reactivex.C12286f;
import p389io.reactivex.functions.Consumer;

/* renamed from: app.zenly.locator.chat.r5.d */
public final class C2306d {

    /* renamed from: app.zenly.locator.chat.r5.d$a */
    static final class C2307a<T> implements Consumer<String> {

        /* renamed from: e */
        final /* synthetic */ C2485i f6971e;

        /* renamed from: f */
        final /* synthetic */ ImageView f6972f;

        C2307a(C2485i iVar, ImageView imageView) {
            this.f6971e = iVar;
            this.f6972f = imageView;
        }

        /* renamed from: a */
        public final void accept(String str) {
            try {
                this.f6971e.mo8550a(str).m8691a(C8978i.f23424b).m8695a(false).mo24173a(this.f6972f);
            } catch (Exception e) {
                C12143a.m32032b(e, "GlideUtils exception", new Object[0]);
            }
        }
    }

    /* renamed from: app.zenly.locator.chat.r5.d$b */
    static final class C2308b<T> implements Consumer<Throwable> {

        /* renamed from: e */
        final /* synthetic */ C2485i f6973e;

        /* renamed from: f */
        final /* synthetic */ String f6974f;

        /* renamed from: g */
        final /* synthetic */ ImageView f6975g;

        C2308b(C2485i iVar, String str, ImageView imageView) {
            this.f6973e = iVar;
            this.f6974f = str;
            this.f6975g = imageView;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C12143a.m32034c(th, "asset loading failed (falling back on network call)", new Object[0]);
            try {
                this.f6973e.mo8550a(this.f6974f).m8691a(C8978i.f23424b).m8695a(false).mo24173a(this.f6975g);
            } catch (Exception e) {
                C12143a.m32032b(e, "GlideUtils exception", new Object[0]);
            }
        }
    }

    static {
        new C2306d();
    }

    private C2306d() {
    }

    /* renamed from: a */
    public static final void m8214a(C2485i iVar, String str, ImageView imageView, C12286f fVar) {
        C12932j.m33818b(iVar, "glide");
        C12932j.m33818b(str, "asset");
        C12932j.m33818b(imageView, "img");
        C12932j.m33818b(fVar, "uiScheduler");
        C5448c.m15478a().cache(str).mo36487e(1).mo36428a(fVar).mo36412a((Consumer<? super T>) new C2307a<Object>(iVar, imageView), (Consumer<? super Throwable>) new C2308b<Object>(iVar, str, imageView));
    }
}
