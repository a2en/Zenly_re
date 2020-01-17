package com.bumptech.glide;

import android.content.Context;
import com.bumptech.glide.Glide.RequestOptionsFactory;
import com.bumptech.glide.load.engine.C8984j;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.engine.bitmap_recycle.C8924d;
import com.bumptech.glide.load.engine.bitmap_recycle.C8929h;
import com.bumptech.glide.load.engine.bitmap_recycle.C8932i;
import com.bumptech.glide.load.engine.cache.C8947d;
import com.bumptech.glide.load.engine.cache.C8949e;
import com.bumptech.glide.load.engine.cache.C8950f;
import com.bumptech.glide.load.engine.cache.C8950f.C8951a;
import com.bumptech.glide.load.engine.cache.DiskCache.Factory;
import com.bumptech.glide.load.engine.cache.MemoryCache;
import com.bumptech.glide.load.engine.executor.GlideExecutor;
import com.bumptech.glide.manager.C9185d;
import com.bumptech.glide.manager.ConnectivityMonitorFactory;
import com.bumptech.glide.manager.RequestManagerRetriever;
import com.bumptech.glide.manager.RequestManagerRetriever.RequestManagerFactory;
import com.bumptech.glide.request.C9224d;
import com.bumptech.glide.request.RequestListener;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p214e.p228e.C7571a;

/* renamed from: com.bumptech.glide.c */
public final class C8854c {

    /* renamed from: a */
    private final Map<Class<?>, C8871k<?, ?>> f23005a = new C7571a();

    /* renamed from: b */
    private C8984j f23006b;

    /* renamed from: c */
    private BitmapPool f23007c;

    /* renamed from: d */
    private ArrayPool f23008d;

    /* renamed from: e */
    private MemoryCache f23009e;

    /* renamed from: f */
    private GlideExecutor f23010f;

    /* renamed from: g */
    private GlideExecutor f23011g;

    /* renamed from: h */
    private Factory f23012h;

    /* renamed from: i */
    private C8950f f23013i;

    /* renamed from: j */
    private ConnectivityMonitorFactory f23014j;

    /* renamed from: k */
    private int f23015k = 4;

    /* renamed from: l */
    private RequestOptionsFactory f23016l = new C8855a(this);

    /* renamed from: m */
    private RequestManagerFactory f23017m;

    /* renamed from: n */
    private GlideExecutor f23018n;

    /* renamed from: o */
    private boolean f23019o;

    /* renamed from: p */
    private List<RequestListener<Object>> f23020p;

    /* renamed from: q */
    private boolean f23021q;

    /* renamed from: r */
    private boolean f23022r;

    /* renamed from: s */
    private int f23023s = 700;

    /* renamed from: t */
    private int f23024t = 128;

    /* renamed from: com.bumptech.glide.c$a */
    class C8855a implements RequestOptionsFactory {
        C8855a(C8854c cVar) {
        }

        public C9224d build() {
            return new C9224d();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo24124a(RequestManagerFactory requestManagerFactory) {
        this.f23017m = requestManagerFactory;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Glide mo24123a(Context context) {
        Context context2 = context;
        if (this.f23010f == null) {
            this.f23010f = GlideExecutor.m21518d();
        }
        if (this.f23011g == null) {
            this.f23011g = GlideExecutor.m21517c();
        }
        if (this.f23018n == null) {
            this.f23018n = GlideExecutor.m21515b();
        }
        if (this.f23013i == null) {
            this.f23013i = new C8951a(context2).mo24391a();
        }
        if (this.f23014j == null) {
            this.f23014j = new C9185d();
        }
        if (this.f23007c == null) {
            int b = this.f23013i.mo24389b();
            if (b > 0) {
                this.f23007c = new C8932i((long) b);
            } else {
                this.f23007c = new C8924d();
            }
        }
        if (this.f23008d == null) {
            this.f23008d = new C8929h(this.f23013i.mo24388a());
        }
        if (this.f23009e == null) {
            this.f23009e = new C8949e((long) this.f23013i.mo24390c());
        }
        if (this.f23012h == null) {
            this.f23012h = new C8947d(context2);
        }
        if (this.f23006b == null) {
            C8984j jVar = new C8984j(this.f23009e, this.f23012h, this.f23011g, this.f23010f, GlideExecutor.m21519e(), this.f23018n, this.f23019o);
            this.f23006b = jVar;
        }
        List<RequestListener<Object>> list = this.f23020p;
        if (list == null) {
            this.f23020p = Collections.emptyList();
        } else {
            this.f23020p = Collections.unmodifiableList(list);
        }
        Context context3 = context;
        Glide glide = new Glide(context3, this.f23006b, this.f23009e, this.f23007c, this.f23008d, new RequestManagerRetriever(this.f23017m), this.f23014j, this.f23015k, this.f23016l, this.f23005a, this.f23020p, this.f23021q, this.f23022r, this.f23023s, this.f23024t);
        return glide;
    }
}
