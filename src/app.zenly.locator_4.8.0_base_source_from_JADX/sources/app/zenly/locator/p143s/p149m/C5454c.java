package app.zenly.locator.p143s.p149m;

import android.graphics.drawable.Animatable;
import com.facebook.common.util.C9559e;
import com.facebook.drawee.controller.C9596c;
import com.facebook.drawee.controller.ControllerListener;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;
import com.facebook.imagepipeline.image.ImageInfo;
import kotlin.C12956q;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12932j;
import p333g.p339c.p346c.p347b.p348a.C12037c;
import p333g.p339c.p346c.p347b.p348a.C12039e;

/* renamed from: app.zenly.locator.s.m.c */
public final class C5454c {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public AnimatedDrawable2 f14028a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public boolean f14029b;

    /* renamed from: c */
    private boolean f14030c;

    /* renamed from: d */
    private Function1<? super AnimatedDrawable2, C12956q> f14031d;

    /* renamed from: e */
    private final SimpleDraweeView f14032e;

    /* renamed from: f */
    private final int f14033f;

    /* renamed from: app.zenly.locator.s.m.c$a */
    public static final class C5455a extends C9596c<ImageInfo> {

        /* renamed from: b */
        final /* synthetic */ C5454c f14034b;

        C5455a(C5454c cVar) {
            this.f14034b = cVar;
        }

        /* renamed from: a */
        public void onFinalImageSet(String str, ImageInfo imageInfo, Animatable animatable) {
            if (!(animatable instanceof AnimatedDrawable2)) {
                animatable = null;
            }
            AnimatedDrawable2 animatedDrawable2 = (AnimatedDrawable2) animatable;
            if (animatedDrawable2 != null) {
                this.f14034b.f14028a = animatedDrawable2;
                Function1 a = this.f14034b.mo13039a();
                if (a != null) {
                    C12956q qVar = (C12956q) a.invoke(animatedDrawable2);
                }
                if (this.f14034b.f14029b) {
                    animatedDrawable2.start();
                }
            }
        }
    }

    public C5454c(SimpleDraweeView simpleDraweeView, int i) {
        C12932j.m33818b(simpleDraweeView, "draweeView");
        this.f14032e = simpleDraweeView;
        this.f14033f = i;
    }

    /* renamed from: b */
    public final void mo13041b() {
        if (!this.f14030c) {
            this.f14030c = true;
            SimpleDraweeView simpleDraweeView = this.f14032e;
            C12039e a = C12037c.m31712a();
            a.setOldController(this.f14032e.getController());
            a.setUri(C9559e.m23383a(this.f14033f));
            a.mo25884a((ControllerListener<? super INFO>) new C5455a<Object>(this));
            simpleDraweeView.setController(a.build());
        }
    }

    /* renamed from: c */
    public final void mo13042c() {
        this.f14029b = true;
        mo13041b();
        AnimatedDrawable2 animatedDrawable2 = this.f14028a;
        if (animatedDrawable2 != null) {
            animatedDrawable2.start();
        }
    }

    /* renamed from: d */
    public final void mo13043d() {
        this.f14029b = false;
        AnimatedDrawable2 animatedDrawable2 = this.f14028a;
        if (animatedDrawable2 != null) {
            animatedDrawable2.stop();
        }
        AnimatedDrawable2 animatedDrawable22 = this.f14028a;
        if (animatedDrawable22 != null) {
            animatedDrawable22.mo26121a(0);
        }
    }

    /* renamed from: a */
    public final Function1<AnimatedDrawable2, C12956q> mo13039a() {
        return this.f14031d;
    }

    /* renamed from: a */
    public final void mo13040a(Function1<? super AnimatedDrawable2, C12956q> function1) {
        this.f14031d = function1;
    }
}
