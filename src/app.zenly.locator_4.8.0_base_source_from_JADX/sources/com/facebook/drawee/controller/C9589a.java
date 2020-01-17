package com.facebook.drawee.controller;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import com.facebook.common.internal.C9532i;
import com.facebook.common.internal.C9532i.C9534b;
import com.facebook.common.internal.C9536j;
import com.facebook.common.logging.C9543a;
import com.facebook.datasource.C9565b;
import com.facebook.datasource.DataSource;
import com.facebook.drawee.components.C9586a;
import com.facebook.drawee.components.C9586a.C9587a;
import com.facebook.drawee.components.C9588b;
import com.facebook.drawee.components.DeferredReleaser;
import com.facebook.drawee.components.DeferredReleaser.Releasable;
import com.facebook.drawee.gestures.GestureDetector;
import com.facebook.drawee.gestures.GestureDetector.ClickListener;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.drawee.interfaces.DraweeHierarchy;
import com.facebook.drawee.interfaces.SettableDraweeHierarchy;
import com.facebook.imagepipeline.systrace.FrescoSystrace;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.drawee.controller.a */
public abstract class C9589a<T, INFO> implements DraweeController, Releasable, ClickListener {

    /* renamed from: v */
    private static final Class<?> f24880v = C9589a.class;

    /* renamed from: a */
    private final C9586a f24881a = C9586a.m23498a();

    /* renamed from: b */
    private final DeferredReleaser f24882b;

    /* renamed from: c */
    private final Executor f24883c;

    /* renamed from: d */
    private C9588b f24884d;

    /* renamed from: e */
    private GestureDetector f24885e;

    /* renamed from: f */
    private ControllerViewportVisibilityListener f24886f;

    /* renamed from: g */
    protected ControllerListener<INFO> f24887g;

    /* renamed from: h */
    private SettableDraweeHierarchy f24888h;

    /* renamed from: i */
    private Drawable f24889i;

    /* renamed from: j */
    private String f24890j;

    /* renamed from: k */
    private Object f24891k;

    /* renamed from: l */
    private boolean f24892l;

    /* renamed from: m */
    private boolean f24893m;

    /* renamed from: n */
    private boolean f24894n;

    /* renamed from: o */
    private boolean f24895o;

    /* renamed from: p */
    private boolean f24896p;

    /* renamed from: q */
    private String f24897q;

    /* renamed from: r */
    private DataSource<T> f24898r;

    /* renamed from: s */
    private T f24899s;

    /* renamed from: t */
    private Drawable f24900t;

    /* renamed from: u */
    private boolean f24901u = true;

    /* renamed from: com.facebook.drawee.controller.a$a */
    class C9590a extends C9565b<T> {

        /* renamed from: a */
        final /* synthetic */ String f24902a;

        /* renamed from: b */
        final /* synthetic */ boolean f24903b;

        C9590a(String str, boolean z) {
            this.f24902a = str;
            this.f24903b = z;
        }

        /* renamed from: a */
        public void mo25772a(DataSource<T> dataSource) {
            C9589a.this.m23510a(this.f24902a, dataSource, dataSource.getFailureCause(), true);
        }

        /* renamed from: b */
        public void mo25773b(DataSource<T> dataSource) {
            boolean isFinished = dataSource.isFinished();
            boolean hasMultipleResults = dataSource.hasMultipleResults();
            float progress = dataSource.getProgress();
            Object result = dataSource.getResult();
            if (result != null) {
                C9589a.this.m23509a(this.f24902a, dataSource, result, progress, isFinished, this.f24903b, hasMultipleResults);
            } else if (isFinished) {
                C9589a.this.m23510a(this.f24902a, dataSource, (Throwable) new NullPointerException(), true);
            }
        }

        public void onProgressUpdate(DataSource<T> dataSource) {
            boolean isFinished = dataSource.isFinished();
            C9589a.this.m23508a(this.f24902a, dataSource, dataSource.getProgress(), isFinished);
        }
    }

    /* renamed from: com.facebook.drawee.controller.a$b */
    private static class C9591b<INFO> extends C9597d<INFO> {
        private C9591b() {
        }

        /* renamed from: a */
        public static <INFO> C9591b<INFO> m23542a(ControllerListener<? super INFO> controllerListener, ControllerListener<? super INFO> controllerListener2) {
            if (FrescoSystrace.m24705c()) {
                FrescoSystrace.m24703a("AbstractDraweeController#createInternal");
            }
            C9591b<INFO> bVar = new C9591b<>();
            bVar.mo25903a(controllerListener);
            bVar.mo25903a(controllerListener2);
            if (FrescoSystrace.m24705c()) {
                FrescoSystrace.m24702a();
            }
            return bVar;
        }
    }

    public C9589a(DeferredReleaser deferredReleaser, Executor executor, String str, Object obj) {
        this.f24882b = deferredReleaser;
        this.f24883c = executor;
        m23513c(str, obj);
    }

    /* renamed from: c */
    private synchronized void m23513c(String str, Object obj) {
        if (FrescoSystrace.m24705c()) {
            FrescoSystrace.m24703a("AbstractDraweeController#init");
        }
        this.f24881a.mo25834a(C9587a.ON_INIT_CONTROLLER);
        if (!this.f24901u && this.f24882b != null) {
            this.f24882b.mo25830a((Releasable) this);
        }
        this.f24892l = false;
        this.f24894n = false;
        mo35691j();
        this.f24896p = false;
        if (this.f24884d != null) {
            this.f24884d.mo25836a();
        }
        if (this.f24885e != null) {
            this.f24885e.mo26027a();
            this.f24885e.mo26028a((ClickListener) this);
        }
        if (this.f24887g instanceof C9591b) {
            ((C9591b) this.f24887g).mo25902a();
        } else {
            this.f24887g = null;
        }
        this.f24886f = null;
        if (this.f24888h != null) {
            this.f24888h.reset();
            this.f24888h.setControllerOverlay(null);
            this.f24888h = null;
        }
        this.f24889i = null;
        if (C9543a.m23311a(2)) {
            C9543a.m23303a(f24880v, "controller %x %s -> %s: initialize", Integer.valueOf(System.identityHashCode(this)), this.f24890j, str);
        }
        this.f24890j = str;
        this.f24891k = obj;
        if (FrescoSystrace.m24705c()) {
            FrescoSystrace.m24702a();
        }
    }

    /* renamed from: d */
    private void m23514d(String str, T t) {
        if (C9543a.m23311a(2)) {
            C9543a.m23315b(f24880v, "controller %x %s: %s: image: %s %x", Integer.valueOf(System.identityHashCode(this)), this.f24890j, str, mo25853b(t), Integer.valueOf(mo25857c(t)));
        }
    }

    /* renamed from: j */
    private void mo35691j() {
        boolean z = this.f24893m;
        this.f24893m = false;
        this.f24895o = false;
        DataSource<T> dataSource = this.f24898r;
        if (dataSource != null) {
            dataSource.close();
            this.f24898r = null;
        }
        Drawable drawable = this.f24900t;
        if (drawable != null) {
            mo25846a(drawable);
        }
        if (this.f24897q != null) {
            this.f24897q = null;
        }
        this.f24900t = null;
        T t = this.f24899s;
        if (t != null) {
            m23514d("release", t);
            mo25862e(this.f24899s);
            this.f24899s = null;
        }
        if (z) {
            mo25852b().onRelease(this.f24890j);
        }
    }

    /* renamed from: k */
    private boolean mo35692k() {
        if (this.f24895o) {
            C9588b bVar = this.f24884d;
            if (bVar != null && bVar.mo25840d()) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Drawable mo25844a(T t);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public T mo25845a() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo25846a(Drawable drawable);

    /* renamed from: b */
    public void mo25855b(ControllerListener<? super INFO> controllerListener) {
        C9536j.m23271a(controllerListener);
        ControllerListener<INFO> controllerListener2 = this.f24887g;
        if (controllerListener2 instanceof C9591b) {
            ((C9591b) controllerListener2).mo25904b(controllerListener);
            return;
        }
        if (controllerListener2 == controllerListener) {
            this.f24887g = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo25856b(String str, T t) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract DataSource<T> mo25859d();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract INFO mo25860d(T t);

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public GestureDetector mo25861e() {
        return this.f24885e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract void mo25862e(T t);

    /* renamed from: f */
    public String mo25863f() {
        return this.f24890j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public C9588b mo25864g() {
        if (this.f24884d == null) {
            this.f24884d = new C9588b();
        }
        return this.f24884d;
    }

    public Animatable getAnimatable() {
        Drawable drawable = this.f24900t;
        if (drawable instanceof Animatable) {
            return (Animatable) drawable;
        }
        return null;
    }

    public String getContentDescription() {
        return this.f24897q;
    }

    public DraweeHierarchy getHierarchy() {
        return this.f24888h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public boolean mo25868h() {
        return mo35692k();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo25869i() {
        if (FrescoSystrace.m24705c()) {
            FrescoSystrace.m24703a("AbstractDraweeController#submitRequest");
        }
        Object a = mo25845a();
        if (a != null) {
            if (FrescoSystrace.m24705c()) {
                FrescoSystrace.m24703a("AbstractDraweeController#submitRequest->cache");
            }
            this.f24898r = null;
            this.f24893m = true;
            this.f24895o = false;
            this.f24881a.mo25834a(C9587a.ON_SUBMIT_CACHE_HIT);
            mo25852b().onSubmit(this.f24890j, this.f24891k);
            mo25856b(this.f24890j, a);
            m23509a(this.f24890j, this.f24898r, a, 1.0f, true, true, true);
            if (FrescoSystrace.m24705c()) {
                FrescoSystrace.m24702a();
            }
            if (FrescoSystrace.m24705c()) {
                FrescoSystrace.m24702a();
            }
            return;
        }
        this.f24881a.mo25834a(C9587a.ON_DATASOURCE_SUBMIT);
        mo25852b().onSubmit(this.f24890j, this.f24891k);
        this.f24888h.setProgress(0.0f, true);
        this.f24893m = true;
        this.f24895o = false;
        this.f24898r = mo25859d();
        if (C9543a.m23311a(2)) {
            C9543a.m23303a(f24880v, "controller %x %s: submitRequest: dataSource: %x", Integer.valueOf(System.identityHashCode(this)), this.f24890j, Integer.valueOf(System.identityHashCode(this.f24898r)));
        }
        this.f24898r.subscribe(new C9590a(this.f24890j, this.f24898r.hasResult()), this.f24883c);
        if (FrescoSystrace.m24705c()) {
            FrescoSystrace.m24702a();
        }
    }

    public void onAttach() {
        if (FrescoSystrace.m24705c()) {
            FrescoSystrace.m24703a("AbstractDraweeController#onAttach");
        }
        if (C9543a.m23311a(2)) {
            C9543a.m23303a(f24880v, "controller %x %s: onAttach: %s", Integer.valueOf(System.identityHashCode(this)), this.f24890j, this.f24893m ? "request already submitted" : "request needs submit");
        }
        this.f24881a.mo25834a(C9587a.ON_ATTACH_CONTROLLER);
        C9536j.m23271a(this.f24888h);
        this.f24882b.mo25830a((Releasable) this);
        this.f24892l = true;
        if (!this.f24893m) {
            mo25869i();
        }
        if (FrescoSystrace.m24705c()) {
            FrescoSystrace.m24702a();
        }
    }

    public boolean onClick() {
        if (C9543a.m23311a(2)) {
            C9543a.m23302a(f24880v, "controller %x %s: onClick", (Object) Integer.valueOf(System.identityHashCode(this)), (Object) this.f24890j);
        }
        if (!mo35692k()) {
            return false;
        }
        this.f24884d.mo25838b();
        this.f24888h.reset();
        mo25869i();
        return true;
    }

    public void onDetach() {
        if (FrescoSystrace.m24705c()) {
            FrescoSystrace.m24703a("AbstractDraweeController#onDetach");
        }
        if (C9543a.m23311a(2)) {
            C9543a.m23302a(f24880v, "controller %x %s: onDetach", (Object) Integer.valueOf(System.identityHashCode(this)), (Object) this.f24890j);
        }
        this.f24881a.mo25834a(C9587a.ON_DETACH_CONTROLLER);
        this.f24892l = false;
        this.f24882b.mo25831b(this);
        if (FrescoSystrace.m24705c()) {
            FrescoSystrace.m24702a();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (C9543a.m23311a(2)) {
            C9543a.m23303a(f24880v, "controller %x %s: onTouchEvent %s", Integer.valueOf(System.identityHashCode(this)), this.f24890j, motionEvent);
        }
        GestureDetector gestureDetector = this.f24885e;
        if (gestureDetector == null) {
            return false;
        }
        if (!gestureDetector.mo26030b() && !mo25868h()) {
            return false;
        }
        this.f24885e.mo26029a(motionEvent);
        return true;
    }

    public void onViewportVisibilityHint(boolean z) {
        ControllerViewportVisibilityListener controllerViewportVisibilityListener = this.f24886f;
        if (controllerViewportVisibilityListener != null) {
            if (z && !this.f24894n) {
                controllerViewportVisibilityListener.onDraweeViewportEntry(this.f24890j);
            } else if (!z && this.f24894n) {
                controllerViewportVisibilityListener.onDraweeViewportExit(this.f24890j);
            }
        }
        this.f24894n = z;
    }

    public void release() {
        this.f24881a.mo25834a(C9587a.ON_RELEASE_CONTROLLER);
        C9588b bVar = this.f24884d;
        if (bVar != null) {
            bVar.mo25839c();
        }
        GestureDetector gestureDetector = this.f24885e;
        if (gestureDetector != null) {
            gestureDetector.mo26031c();
        }
        SettableDraweeHierarchy settableDraweeHierarchy = this.f24888h;
        if (settableDraweeHierarchy != null) {
            settableDraweeHierarchy.reset();
        }
        mo35691j();
    }

    public void setContentDescription(String str) {
        this.f24897q = str;
    }

    public void setHierarchy(DraweeHierarchy draweeHierarchy) {
        if (C9543a.m23311a(2)) {
            C9543a.m23303a(f24880v, "controller %x %s: setHierarchy: %s", Integer.valueOf(System.identityHashCode(this)), this.f24890j, draweeHierarchy);
        }
        this.f24881a.mo25834a(draweeHierarchy != null ? C9587a.ON_SET_HIERARCHY : C9587a.ON_CLEAR_HIERARCHY);
        if (this.f24893m) {
            this.f24882b.mo25830a((Releasable) this);
            release();
        }
        SettableDraweeHierarchy settableDraweeHierarchy = this.f24888h;
        if (settableDraweeHierarchy != null) {
            settableDraweeHierarchy.setControllerOverlay(null);
            this.f24888h = null;
        }
        if (draweeHierarchy != null) {
            C9536j.m23275a(draweeHierarchy instanceof SettableDraweeHierarchy);
            this.f24888h = (SettableDraweeHierarchy) draweeHierarchy;
            this.f24888h.setControllerOverlay(this.f24889i);
        }
    }

    public String toString() {
        C9534b a = C9532i.m23262a((Object) this);
        a.mo25666a("isAttached", this.f24892l);
        a.mo25666a("isRequestSubmitted", this.f24893m);
        a.mo25666a("hasFetchFailed", this.f24895o);
        a.mo25664a("fetchedImage", mo25857c(this.f24899s));
        a.mo25665a("events", (Object) this.f24881a.toString());
        return a.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo25850a(String str, Object obj) {
        m23513c(str, obj);
        this.f24901u = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public ControllerListener<INFO> mo25852b() {
        ControllerListener<INFO> controllerListener = this.f24887g;
        return controllerListener == null ? C9596c.m23565a() : controllerListener;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo25849a(GestureDetector gestureDetector) {
        this.f24885e = gestureDetector;
        GestureDetector gestureDetector2 = this.f24885e;
        if (gestureDetector2 != null) {
            gestureDetector2.mo26028a((ClickListener) this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo25854b(Drawable drawable) {
        this.f24889i = drawable;
        SettableDraweeHierarchy settableDraweeHierarchy = this.f24888h;
        if (settableDraweeHierarchy != null) {
            settableDraweeHierarchy.setControllerOverlay(this.f24889i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo25851a(boolean z) {
        this.f24896p = z;
    }

    /* renamed from: a */
    public void mo25847a(ControllerListener<? super INFO> controllerListener) {
        C9536j.m23271a(controllerListener);
        ControllerListener<INFO> controllerListener2 = this.f24887g;
        if (controllerListener2 instanceof C9591b) {
            ((C9591b) controllerListener2).mo25903a(controllerListener);
        } else if (controllerListener2 != null) {
            this.f24887g = C9591b.m23542a(controllerListener2, controllerListener);
        } else {
            this.f24887g = controllerListener;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String mo25853b(T t) {
        return t != null ? t.getClass().getSimpleName() : "<null>";
    }

    /* renamed from: a */
    public void mo25848a(ControllerViewportVisibilityListener controllerViewportVisibilityListener) {
        this.f24886f = controllerViewportVisibilityListener;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m23509a(String str, DataSource<T> dataSource, T t, float f, boolean z, boolean z2, boolean z3) {
        Drawable a;
        T t2;
        Drawable drawable;
        String str2;
        try {
            if (FrescoSystrace.m24705c()) {
                FrescoSystrace.m24703a("AbstractDraweeController#onNewResultInternal");
            }
            if (!m23512a(str, dataSource)) {
                m23514d("ignore_old_datasource @ onNewResult", t);
                mo25862e(t);
                dataSource.close();
                if (FrescoSystrace.m24705c()) {
                    FrescoSystrace.m24702a();
                }
                return;
            }
            this.f24881a.mo25834a(z ? C9587a.ON_DATASOURCE_RESULT : C9587a.ON_DATASOURCE_RESULT_INT);
            try {
                a = mo25844a(t);
                t2 = this.f24899s;
                drawable = this.f24900t;
                this.f24899s = t;
                this.f24900t = a;
                str2 = "release_previous_result @ onNewResult";
                if (z) {
                    m23514d("set_final_result @ onNewResult", t);
                    this.f24898r = null;
                    this.f24888h.setImage(a, 1.0f, z2);
                    mo25852b().onFinalImageSet(str, mo25860d(t), getAnimatable());
                } else if (z3) {
                    m23514d("set_temporary_result @ onNewResult", t);
                    this.f24888h.setImage(a, 1.0f, z2);
                    mo25852b().onFinalImageSet(str, mo25860d(t), getAnimatable());
                } else {
                    m23514d("set_intermediate_result @ onNewResult", t);
                    this.f24888h.setImage(a, f, z2);
                    mo25852b().onIntermediateImageSet(str, mo25860d(t));
                }
                if (!(drawable == null || drawable == a)) {
                    mo25846a(drawable);
                }
                if (!(t2 == null || t2 == t)) {
                    m23514d(str2, t2);
                    mo25862e(t2);
                }
                if (FrescoSystrace.m24705c()) {
                    FrescoSystrace.m24702a();
                }
            } catch (Exception e) {
                m23514d("drawable_failed @ onNewResult", t);
                mo25862e(t);
                m23510a(str, dataSource, (Throwable) e, z);
                if (FrescoSystrace.m24705c()) {
                    FrescoSystrace.m24702a();
                }
            }
        } catch (Throwable th) {
            if (FrescoSystrace.m24705c()) {
                FrescoSystrace.m24702a();
            }
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public Drawable mo25858c() {
        return this.f24889i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public int mo25857c(T t) {
        return System.identityHashCode(t);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m23510a(String str, DataSource<T> dataSource, Throwable th, boolean z) {
        if (FrescoSystrace.m24705c()) {
            FrescoSystrace.m24703a("AbstractDraweeController#onFailureInternal");
        }
        if (!m23512a(str, dataSource)) {
            m23511a("ignore_old_datasource @ onFailure", th);
            dataSource.close();
            if (FrescoSystrace.m24705c()) {
                FrescoSystrace.m24702a();
            }
            return;
        }
        this.f24881a.mo25834a(z ? C9587a.ON_DATASOURCE_FAILURE : C9587a.ON_DATASOURCE_FAILURE_INT);
        if (z) {
            m23511a("final_failed @ onFailure", th);
            this.f24898r = null;
            this.f24895o = true;
            if (this.f24896p) {
                Drawable drawable = this.f24900t;
                if (drawable != null) {
                    this.f24888h.setImage(drawable, 1.0f, true);
                    mo25852b().onFailure(this.f24890j, th);
                }
            }
            if (mo35692k()) {
                this.f24888h.setRetry(th);
            } else {
                this.f24888h.setFailure(th);
            }
            mo25852b().onFailure(this.f24890j, th);
        } else {
            m23511a("intermediate_failed @ onFailure", th);
            mo25852b().onIntermediateImageFailed(this.f24890j, th);
        }
        if (FrescoSystrace.m24705c()) {
            FrescoSystrace.m24702a();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m23508a(String str, DataSource<T> dataSource, float f, boolean z) {
        if (!m23512a(str, dataSource)) {
            m23511a("ignore_old_datasource @ onProgress", (Throwable) null);
            dataSource.close();
            return;
        }
        if (!z) {
            this.f24888h.setProgress(f, false);
        }
    }

    /* renamed from: a */
    private boolean m23512a(String str, DataSource<T> dataSource) {
        boolean z = true;
        if (dataSource == null && this.f24898r == null) {
            return true;
        }
        if (!str.equals(this.f24890j) || dataSource != this.f24898r || !this.f24893m) {
            z = false;
        }
        return z;
    }

    /* renamed from: a */
    private void m23511a(String str, Throwable th) {
        if (C9543a.m23311a(2)) {
            C9543a.m23304a(f24880v, "controller %x %s: %s: failure: %s", Integer.valueOf(System.identityHashCode(this)), this.f24890j, str, th);
        }
    }
}
