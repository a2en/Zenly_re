package p333g.p339c.p346c.p347b.p348a;

import android.content.Context;
import android.content.res.Resources;
import com.facebook.common.executors.C9520g;
import com.facebook.common.internal.Supplier;
import com.facebook.drawee.backends.pipeline.info.ImagePerfDataListener;
import com.facebook.drawee.components.DeferredReleaser;
import com.facebook.drawee.controller.ControllerListener;
import com.facebook.imagepipeline.cache.MemoryCache;
import com.facebook.imagepipeline.core.C9711e;
import com.facebook.imagepipeline.core.C9716g;
import com.facebook.imagepipeline.drawable.DrawableFactory;
import java.util.Set;

/* renamed from: g.c.c.b.a.f */
public class C12041f implements Supplier<C12039e> {

    /* renamed from: a */
    private final Context f31365a;

    /* renamed from: b */
    private final C9711e f31366b;

    /* renamed from: c */
    private final C12042g f31367c;

    /* renamed from: d */
    private final Set<ControllerListener> f31368d;

    /* renamed from: e */
    private final ImagePerfDataListener f31369e;

    public C12041f(Context context, C12036b bVar) {
        this(context, C9716g.m23972o(), bVar);
    }

    public C12041f(Context context, C9716g gVar, C12036b bVar) {
        this(context, gVar, null, bVar);
    }

    public C12039e get() {
        return new C12039e(this.f31365a, this.f31367c, this.f31366b, this.f31368d).mo35696a(this.f31369e);
    }

    public C12041f(Context context, C9716g gVar, Set<ControllerListener> set, C12036b bVar) {
        this.f31365a = context;
        this.f31366b = gVar.mo26346f();
        if (bVar == null) {
            this.f31367c = new C12042g();
            C12042g gVar2 = this.f31367c;
            Resources resources = context.getResources();
            DeferredReleaser c = DeferredReleaser.m23495c();
            DrawableFactory a = gVar.mo26341a(context);
            C9520g a2 = C9520g.m23241a();
            MemoryCache b = this.f31366b.mo26308b();
            if (bVar != null) {
                bVar.mo35673a();
                throw null;
            } else if (bVar == null) {
                gVar2.mo35699a(resources, c, a, a2, b, null, null);
                this.f31368d = set;
                if (bVar == null) {
                    this.f31369e = null;
                } else {
                    bVar.mo35675c();
                    throw null;
                }
            } else {
                bVar.mo35674b();
                throw null;
            }
        } else {
            bVar.mo35676d();
            throw null;
        }
    }
}
