package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.bumptech.glide.load.engine.C8978i;
import com.bumptech.glide.load.resource.gif.C9156c;
import com.bumptech.glide.manager.C9190h;
import com.bumptech.glide.manager.C9193j;
import com.bumptech.glide.manager.ConnectivityMonitor;
import com.bumptech.glide.manager.ConnectivityMonitor.ConnectivityListener;
import com.bumptech.glide.manager.ConnectivityMonitorFactory;
import com.bumptech.glide.manager.Lifecycle;
import com.bumptech.glide.manager.LifecycleListener;
import com.bumptech.glide.manager.RequestManagerTreeNode;
import com.bumptech.glide.p301o.C9217k;
import com.bumptech.glide.request.C9220a;
import com.bumptech.glide.request.C9224d;
import com.bumptech.glide.request.Request;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.C9231d;
import com.bumptech.glide.request.target.Target;
import com.bumptech.glide.request.transition.Transition;
import java.io.File;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.bumptech.glide.j */
public class C8867j implements ComponentCallbacks2, LifecycleListener, C8858f<C8865i<Drawable>> {

    /* renamed from: q */
    private static final C9224d f23110q = ((C9224d) C9224d.m22186b(Bitmap.class).mo8506I());

    /* renamed from: e */
    protected final Glide f23111e;

    /* renamed from: f */
    protected final Context f23112f;

    /* renamed from: g */
    final Lifecycle f23113g;

    /* renamed from: h */
    private final C9190h f23114h;

    /* renamed from: i */
    private final RequestManagerTreeNode f23115i;

    /* renamed from: j */
    private final C9193j f23116j;

    /* renamed from: k */
    private final Runnable f23117k;

    /* renamed from: l */
    private final Handler f23118l;

    /* renamed from: m */
    private final ConnectivityMonitor f23119m;

    /* renamed from: n */
    private final CopyOnWriteArrayList<RequestListener<Object>> f23120n;

    /* renamed from: o */
    private C9224d f23121o;

    /* renamed from: p */
    private boolean f23122p;

    /* renamed from: com.bumptech.glide.j$a */
    class C8868a implements Runnable {
        C8868a() {
        }

        public void run() {
            C8867j jVar = C8867j.this;
            jVar.f23113g.addListener(jVar);
        }
    }

    /* renamed from: com.bumptech.glide.j$b */
    private static class C8869b extends C9231d<View, Object> {
        C8869b(View view) {
            super(view);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo8503a(Drawable drawable) {
        }

        public void onLoadFailed(Drawable drawable) {
        }

        public void onResourceReady(Object obj, Transition<? super Object> transition) {
        }
    }

    /* renamed from: com.bumptech.glide.j$c */
    private class C8870c implements ConnectivityListener {

        /* renamed from: a */
        private final C9190h f23124a;

        C8870c(C9190h hVar) {
            this.f23124a = hVar;
        }

        public void onConnectivityChanged(boolean z) {
            if (z) {
                synchronized (C8867j.this) {
                    this.f23124a.mo24778d();
                }
            }
        }
    }

    static {
        C9224d dVar = (C9224d) C9224d.m22186b(C9156c.class).mo8506I();
        C9224d dVar2 = (C9224d) ((C9224d) C9224d.m22185b(C8978i.f23425c).mo8513a(C8859g.LOW)).mo8521a(true);
    }

    public C8867j(Glide glide, Lifecycle lifecycle, RequestManagerTreeNode requestManagerTreeNode, Context context) {
        this(glide, lifecycle, requestManagerTreeNode, new C9190h(), glide.mo24092d(), context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public synchronized void mo8551a(C9224d dVar) {
        this.f23121o = (C9224d) ((C9224d) dVar.clone()).mo8510a();
    }

    /* renamed from: b */
    public C8865i<Drawable> mo8552b() {
        return mo8547a(Drawable.class);
    }

    /* renamed from: c */
    public C8865i<File> mo8553c() {
        return mo8547a(File.class).m21234a((C9220a<?>) C9224d.m22187c(true));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public List<RequestListener<Object>> mo24181d() {
        return this.f23120n;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public synchronized C9224d mo24182e() {
        return this.f23121o;
    }

    /* renamed from: f */
    public synchronized void mo24183f() {
        this.f23114h.mo24775b();
    }

    /* renamed from: g */
    public synchronized void mo24184g() {
        mo24183f();
        for (C8867j f : this.f23115i.getDescendants()) {
            f.mo24183f();
        }
    }

    /* renamed from: h */
    public synchronized void mo24185h() {
        this.f23114h.mo24777c();
    }

    /* renamed from: i */
    public synchronized void mo24186i() {
        this.f23114h.mo24779e();
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public synchronized void onDestroy() {
        this.f23116j.onDestroy();
        for (Target a : this.f23116j.mo24790b()) {
            mo24177a(a);
        }
        this.f23116j.mo24788a();
        this.f23114h.mo24773a();
        this.f23113g.removeListener(this);
        this.f23113g.removeListener(this.f23119m);
        this.f23118l.removeCallbacks(this.f23117k);
        this.f23111e.mo24090b(this);
    }

    public void onLowMemory() {
    }

    public synchronized void onStart() {
        mo24186i();
        this.f23116j.onStart();
    }

    public synchronized void onStop() {
        mo24185h();
        this.f23116j.onStop();
    }

    public void onTrimMemory(int i) {
        if (i == 60 && this.f23122p) {
            mo24184g();
        }
    }

    public synchronized String toString() {
        StringBuilder sb;
        sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("{tracker=");
        sb.append(this.f23114h);
        sb.append(", treeNode=");
        sb.append(this.f23115i);
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: c */
    private void m21242c(Target<?> target) {
        boolean b = mo24180b(target);
        Request request = target.getRequest();
        if (!b && !this.f23111e.mo24088a(target) && request != null) {
            target.setRequest(null);
            request.clear();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public synchronized boolean mo24180b(Target<?> target) {
        Request request = target.getRequest();
        if (request == null) {
            return true;
        }
        if (!this.f23114h.mo24774a(request)) {
            return false;
        }
        this.f23116j.mo24791b(target);
        target.setRequest(null);
        return true;
    }

    /* renamed from: a */
    public C8865i<Bitmap> mo8543a() {
        return mo8547a(Bitmap.class).m21234a((C9220a<?>) f23110q);
    }

    C8867j(Glide glide, Lifecycle lifecycle, RequestManagerTreeNode requestManagerTreeNode, C9190h hVar, ConnectivityMonitorFactory connectivityMonitorFactory, Context context) {
        this.f23116j = new C9193j();
        this.f23117k = new C8868a();
        this.f23118l = new Handler(Looper.getMainLooper());
        this.f23111e = glide;
        this.f23113g = lifecycle;
        this.f23115i = requestManagerTreeNode;
        this.f23114h = hVar;
        this.f23112f = context;
        this.f23119m = connectivityMonitorFactory.build(context.getApplicationContext(), new C8870c(hVar));
        if (C9217k.m22106c()) {
            this.f23118l.post(this.f23117k);
        } else {
            lifecycle.addListener(this);
        }
        lifecycle.addListener(this.f23119m);
        this.f23120n = new CopyOnWriteArrayList<>(glide.mo24094f().mo24128b());
        mo8551a(glide.mo24094f().mo24129c());
        glide.mo24087a(this);
    }

    /* renamed from: a */
    public C8865i<Drawable> mo8544a(Drawable drawable) {
        return mo8552b().mo8527a(drawable);
    }

    /* renamed from: a */
    public C8865i<Drawable> mo8550a(String str) {
        return mo8552b().mo8534a(str);
    }

    /* renamed from: a */
    public C8865i<Drawable> mo8545a(Uri uri) {
        return mo8552b().mo8528a(uri);
    }

    /* renamed from: a */
    public C8865i<Drawable> mo8546a(File file) {
        return mo8552b().mo8531a(file);
    }

    /* renamed from: a */
    public C8865i<Drawable> mo8548a(Integer num) {
        return mo8552b().mo8532a(num);
    }

    /* renamed from: a */
    public C8865i<Drawable> mo8549a(Object obj) {
        return mo8552b().mo8533a(obj);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public <T> C8871k<?, T> mo24179b(Class<T> cls) {
        return this.f23111e.mo24094f().mo24125a(cls);
    }

    /* renamed from: a */
    public <ResourceType> C8865i<ResourceType> mo8547a(Class<ResourceType> cls) {
        return new C8865i<>(this.f23111e, this, cls, this.f23112f);
    }

    /* renamed from: a */
    public void mo24176a(View view) {
        mo24177a((Target<?>) new C8869b<Object>(view));
    }

    /* renamed from: a */
    public void mo24177a(Target<?> target) {
        if (target != null) {
            m21242c(target);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized void mo24178a(Target<?> target, Request request) {
        this.f23116j.mo24789a(target);
        this.f23114h.mo24776b(request);
    }
}
