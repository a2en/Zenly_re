package com.facebook.drawee.controller;

import android.content.Context;
import android.graphics.drawable.Animatable;
import com.facebook.common.internal.C9532i;
import com.facebook.common.internal.C9532i.C9534b;
import com.facebook.common.internal.C9536j;
import com.facebook.common.internal.Supplier;
import com.facebook.datasource.C9566c;
import com.facebook.datasource.C9568d;
import com.facebook.datasource.C9572e;
import com.facebook.datasource.DataSource;
import com.facebook.drawee.controller.C9592b;
import com.facebook.drawee.gestures.GestureDetector;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.drawee.interfaces.SimpleDraweeControllerBuilder;
import com.facebook.imagepipeline.systrace.FrescoSystrace;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.facebook.drawee.controller.b */
public abstract class C9592b<BUILDER extends C9592b<BUILDER, REQUEST, IMAGE, INFO>, REQUEST, IMAGE, INFO> implements SimpleDraweeControllerBuilder {

    /* renamed from: p */
    private static final ControllerListener<Object> f24905p = new C9593a();

    /* renamed from: q */
    private static final NullPointerException f24906q = new NullPointerException("No image request was specified!");

    /* renamed from: r */
    private static final AtomicLong f24907r = new AtomicLong();

    /* renamed from: a */
    private final Context f24908a;

    /* renamed from: b */
    private final Set<ControllerListener> f24909b;

    /* renamed from: c */
    private Object f24910c;

    /* renamed from: d */
    private REQUEST f24911d;

    /* renamed from: e */
    private REQUEST f24912e;

    /* renamed from: f */
    private REQUEST[] f24913f;

    /* renamed from: g */
    private boolean f24914g;

    /* renamed from: h */
    private Supplier<DataSource<IMAGE>> f24915h;

    /* renamed from: i */
    private ControllerListener<? super INFO> f24916i;

    /* renamed from: j */
    private ControllerViewportVisibilityListener f24917j;

    /* renamed from: k */
    private boolean f24918k;

    /* renamed from: l */
    private boolean f24919l;

    /* renamed from: m */
    private boolean f24920m;

    /* renamed from: n */
    private String f24921n;

    /* renamed from: o */
    private DraweeController f24922o;

    /* renamed from: com.facebook.drawee.controller.b$a */
    static class C9593a extends C9596c<Object> {
        C9593a() {
        }

        public void onFinalImageSet(String str, Object obj, Animatable animatable) {
            if (animatable != null) {
                animatable.start();
            }
        }
    }

    /* renamed from: com.facebook.drawee.controller.b$b */
    class C9594b implements Supplier<DataSource<IMAGE>> {

        /* renamed from: a */
        final /* synthetic */ DraweeController f24923a;

        /* renamed from: b */
        final /* synthetic */ String f24924b;

        /* renamed from: c */
        final /* synthetic */ Object f24925c;

        /* renamed from: d */
        final /* synthetic */ Object f24926d;

        /* renamed from: e */
        final /* synthetic */ C9595c f24927e;

        C9594b(DraweeController draweeController, String str, Object obj, Object obj2, C9595c cVar) {
            this.f24923a = draweeController;
            this.f24924b = str;
            this.f24925c = obj;
            this.f24926d = obj2;
            this.f24927e = cVar;
        }

        public String toString() {
            C9534b a = C9532i.m23262a((Object) this);
            a.mo25665a("request", (Object) this.f24925c.toString());
            return a.toString();
        }

        public DataSource<IMAGE> get() {
            return C9592b.this.mo25882a(this.f24923a, this.f24924b, this.f24925c, this.f24926d, this.f24927e);
        }
    }

    /* renamed from: com.facebook.drawee.controller.b$c */
    public enum C9595c {
        FULL_FETCH,
        DISK_CACHE,
        BITMAP_MEMORY_CACHE
    }

    protected C9592b(Context context, Set<ControllerListener> set) {
        this.f24908a = context;
        this.f24909b = set;
        m23544l();
    }

    /* renamed from: k */
    protected static String m23543k() {
        return String.valueOf(f24907r.getAndIncrement());
    }

    /* renamed from: l */
    private void m23544l() {
        this.f24910c = null;
        this.f24911d = null;
        this.f24912e = null;
        this.f24913f = null;
        this.f24914g = true;
        this.f24916i = null;
        this.f24917j = null;
        this.f24918k = false;
        this.f24919l = false;
        this.f24922o = null;
        this.f24921n = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract DataSource<IMAGE> mo25882a(DraweeController draweeController, String str, REQUEST request, Object obj, C9595c cVar);

    /* renamed from: a */
    public BUILDER mo25885a(REQUEST request) {
        this.f24911d = request;
        mo25896h();
        return this;
    }

    /* renamed from: b */
    public Object mo25887b() {
        return this.f24910c;
    }

    /* renamed from: c */
    public String mo25890c() {
        return this.f24921n;
    }

    /* renamed from: d */
    public ControllerViewportVisibilityListener mo25892d() {
        return this.f24917j;
    }

    /* renamed from: e */
    public REQUEST mo25893e() {
        return this.f24911d;
    }

    /* renamed from: f */
    public DraweeController mo25894f() {
        return this.f24922o;
    }

    /* renamed from: g */
    public boolean mo25895g() {
        return this.f24920m;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final BUILDER mo25896h() {
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract C9589a mo25897i();

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo25898j() {
        boolean z = false;
        C9536j.m23280b(this.f24913f == null || this.f24911d == null, "Cannot specify both ImageRequest and FirstAvailableImageRequests!");
        if (this.f24915h == null || (this.f24913f == null && this.f24911d == null && this.f24912e == null)) {
            z = true;
        }
        C9536j.m23280b(z, "Cannot specify DataSourceSupplier with other ImageRequests! Use one or the other.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo25888b(C9589a aVar) {
        if (aVar.mo25861e() == null) {
            aVar.mo25849a(GestureDetector.m23625a(this.f24908a));
        }
    }

    public C9589a build() {
        mo25898j();
        if (this.f24911d == null && this.f24913f == null) {
            REQUEST request = this.f24912e;
            if (request != null) {
                this.f24911d = request;
                this.f24912e = null;
            }
        }
        return mo25883a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo25891c(C9589a aVar) {
        if (this.f24918k) {
            aVar.mo25864g().mo25837a(this.f24918k);
            mo25888b(aVar);
        }
    }

    public BUILDER setCallerContext(Object obj) {
        this.f24910c = obj;
        mo25896h();
        return this;
    }

    public BUILDER setOldController(DraweeController draweeController) {
        this.f24922o = draweeController;
        mo25896h();
        return this;
    }

    /* renamed from: a */
    public BUILDER mo25884a(ControllerListener<? super INFO> controllerListener) {
        this.f24916i = controllerListener;
        mo25896h();
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C9589a mo25883a() {
        if (FrescoSystrace.m24705c()) {
            FrescoSystrace.m24703a("AbstractDraweeControllerBuilder#buildController");
        }
        C9589a i = mo25897i();
        i.mo25851a(mo25895g());
        i.setContentDescription(mo25890c());
        i.mo25848a(mo25892d());
        mo25891c(i);
        mo25886a(i);
        if (FrescoSystrace.m24705c()) {
            FrescoSystrace.m24702a();
        }
        return i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Supplier<DataSource<IMAGE>> mo25878a(DraweeController draweeController, String str) {
        Supplier<DataSource<IMAGE>> supplier = this.f24915h;
        if (supplier != null) {
            return supplier;
        }
        Supplier<DataSource<IMAGE>> supplier2 = null;
        REQUEST request = this.f24911d;
        if (request != null) {
            supplier2 = mo25879a(draweeController, str, request);
        } else {
            REQUEST[] requestArr = this.f24913f;
            if (requestArr != null) {
                supplier2 = mo25881a(draweeController, str, requestArr, this.f24914g);
            }
        }
        if (!(supplier2 == null || this.f24912e == null)) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(supplier2);
            arrayList.add(mo25879a(draweeController, str, this.f24912e));
            supplier2 = C9572e.m23434a(arrayList, false);
        }
        if (supplier2 == null) {
            supplier2 = C9566c.m23419a(f24906q);
        }
        return supplier2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Supplier<DataSource<IMAGE>> mo25881a(DraweeController draweeController, String str, REQUEST[] requestArr, boolean z) {
        ArrayList arrayList = new ArrayList(requestArr.length * 2);
        if (z) {
            for (REQUEST a : requestArr) {
                arrayList.add(mo25880a(draweeController, str, a, C9595c.BITMAP_MEMORY_CACHE));
            }
        }
        for (REQUEST a2 : requestArr) {
            arrayList.add(mo25879a(draweeController, str, a2));
        }
        return C9568d.m23421a((List<Supplier<DataSource<T>>>) arrayList);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Supplier<DataSource<IMAGE>> mo25879a(DraweeController draweeController, String str, REQUEST request) {
        return mo25880a(draweeController, str, request, C9595c.FULL_FETCH);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Supplier<DataSource<IMAGE>> mo25880a(DraweeController draweeController, String str, REQUEST request, C9595c cVar) {
        C9594b bVar = new C9594b(draweeController, str, request, mo25887b(), cVar);
        return bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo25886a(C9589a aVar) {
        Set<ControllerListener> set = this.f24909b;
        if (set != null) {
            for (ControllerListener a : set) {
                aVar.mo25847a(a);
            }
        }
        ControllerListener<? super INFO> controllerListener = this.f24916i;
        if (controllerListener != null) {
            aVar.mo25847a(controllerListener);
        }
        if (this.f24919l) {
            aVar.mo25847a(f24905p);
        }
    }
}
