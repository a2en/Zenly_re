package com.mapbox.mapboxsdk.maps.renderer.p319b;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import android.view.TextureView.SurfaceTextureListener;
import com.mapbox.mapboxsdk.log.Logger;
import com.mapbox.mapboxsdk.maps.renderer.egl.C11562a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.mapbox.mapboxsdk.maps.renderer.b.b */
class C11560b extends Thread implements SurfaceTextureListener {

    /* renamed from: e */
    private final C11559a f29949e;

    /* renamed from: f */
    private final C11561a f29950f;

    /* renamed from: g */
    private final Object f29951g = new Object();

    /* renamed from: h */
    private final ArrayList<Runnable> f29952h = new ArrayList<>();

    /* renamed from: i */
    private SurfaceTexture f29953i;

    /* renamed from: j */
    private int f29954j;

    /* renamed from: k */
    private int f29955k;

    /* renamed from: l */
    private boolean f29956l;

    /* renamed from: m */
    private boolean f29957m;

    /* renamed from: n */
    private boolean f29958n;

    /* renamed from: o */
    private boolean f29959o;

    /* renamed from: p */
    private boolean f29960p;

    /* renamed from: q */
    private boolean f29961q;

    /* renamed from: r */
    private boolean f29962r;

    /* renamed from: com.mapbox.mapboxsdk.maps.renderer.b.b$a */
    private static class C11561a {

        /* renamed from: a */
        private final WeakReference<TextureView> f29963a;

        /* renamed from: b */
        private boolean f29964b;

        /* renamed from: c */
        private EGL10 f29965c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public EGLConfig f29966d;

        /* renamed from: e */
        private EGLDisplay f29967e = EGL10.EGL_NO_DISPLAY;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public EGLContext f29968f = EGL10.EGL_NO_CONTEXT;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public EGLSurface f29969g = EGL10.EGL_NO_SURFACE;

        C11561a(WeakReference<TextureView> weakReference, boolean z) {
            this.f29963a = weakReference;
            this.f29964b = z;
        }

        /* access modifiers changed from: private */
        /* renamed from: g */
        public void m30164g() {
            EGLContext eGLContext = this.f29968f;
            if (eGLContext != EGL10.EGL_NO_CONTEXT) {
                if (!this.f29965c.eglDestroyContext(this.f29967e, eGLContext)) {
                    Logger.m29686w("Mbgl-TextureViewRenderThread", String.format("Could not destroy egl context. Display %s, Context %s", new Object[]{this.f29967e, this.f29968f}));
                }
                this.f29968f = EGL10.EGL_NO_CONTEXT;
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: h */
        public void m30165h() {
            EGLSurface eGLSurface = this.f29969g;
            if (eGLSurface != EGL10.EGL_NO_SURFACE) {
                if (!this.f29965c.eglDestroySurface(this.f29967e, eGLSurface)) {
                    Logger.m29686w("Mbgl-TextureViewRenderThread", String.format("Could not destroy egl surface. Display %s, Surface %s", new Object[]{this.f29967e, this.f29969g}));
                }
                this.f29969g = EGL10.EGL_NO_SURFACE;
            }
        }

        /* renamed from: i */
        private void m30166i() {
            EGLDisplay eGLDisplay = this.f29967e;
            if (eGLDisplay != EGL10.EGL_NO_DISPLAY) {
                if (!this.f29965c.eglTerminate(eGLDisplay)) {
                    Logger.m29686w("Mbgl-TextureViewRenderThread", String.format("Could not terminate egl. Display %s", new Object[]{this.f29967e}));
                }
                this.f29967e = EGL10.EGL_NO_DISPLAY;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public int mo33927f() {
            if (!this.f29965c.eglSwapBuffers(this.f29967e, this.f29969g)) {
                return this.f29965c.eglGetError();
            }
            return 12288;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo33922a() {
            m30165h();
            m30164g();
            m30166i();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public GL10 mo33923b() {
            return (GL10) this.f29968f.getGL();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public boolean mo33924c() {
            m30165h();
            TextureView textureView = (TextureView) this.f29963a.get();
            if (textureView != null) {
                this.f29969g = this.f29965c.eglCreateWindowSurface(this.f29967e, this.f29966d, textureView.getSurfaceTexture(), new int[]{12344});
            } else {
                this.f29969g = EGL10.EGL_NO_SURFACE;
            }
            EGLSurface eGLSurface = this.f29969g;
            if (eGLSurface != null && eGLSurface != EGL10.EGL_NO_SURFACE) {
                return mo33925d();
            }
            if (this.f29965c.eglGetError() == 12299) {
                Logger.m29680e("Mbgl-TextureViewRenderThread", "createWindowSurface returned EGL_BAD_NATIVE_WINDOW.");
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public boolean mo33925d() {
            EGL10 egl10 = this.f29965c;
            EGLDisplay eGLDisplay = this.f29967e;
            EGLSurface eGLSurface = this.f29969g;
            if (egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f29968f)) {
                return true;
            }
            Logger.m29686w("Mbgl-TextureViewRenderThread", String.format("eglMakeCurrent: %s", new Object[]{Integer.valueOf(this.f29965c.eglGetError())}));
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo33926e() {
            this.f29965c = (EGL10) EGLContext.getEGL();
            if (this.f29967e == EGL10.EGL_NO_DISPLAY) {
                this.f29967e = this.f29965c.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
                EGLDisplay eGLDisplay = this.f29967e;
                if (eGLDisplay != EGL10.EGL_NO_DISPLAY) {
                    if (!this.f29965c.eglInitialize(eGLDisplay, new int[2])) {
                        throw new RuntimeException("eglInitialize failed");
                    }
                } else {
                    throw new RuntimeException("eglGetDisplay failed");
                }
            }
            if (this.f29963a == null) {
                this.f29966d = null;
                this.f29968f = EGL10.EGL_NO_CONTEXT;
            } else if (this.f29968f == EGL10.EGL_NO_CONTEXT) {
                this.f29966d = new C11562a(this.f29964b).chooseConfig(this.f29965c, this.f29967e);
                this.f29968f = this.f29965c.eglCreateContext(this.f29967e, this.f29966d, EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
            }
            if (this.f29968f == EGL10.EGL_NO_CONTEXT) {
                throw new RuntimeException("createContext");
            }
        }
    }

    C11560b(TextureView textureView, C11559a aVar) {
        textureView.setOpaque(!aVar.mo33911a());
        textureView.setSurfaceTextureListener(this);
        this.f29949e = aVar;
        this.f29950f = new C11561a(new WeakReference(textureView), aVar.mo33911a());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo33913a(Runnable runnable) {
        if (runnable != null) {
            synchronized (this.f29951g) {
                this.f29952h.add(runnable);
                this.f29951g.notifyAll();
            }
            return;
        }
        throw new IllegalArgumentException("runnable must not be null");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo33914b() {
        synchronized (this.f29951g) {
            this.f29958n = true;
            this.f29951g.notifyAll();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo33915c() {
        synchronized (this.f29951g) {
            this.f29958n = false;
            this.f29951g.notifyAll();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo33916d() {
        synchronized (this.f29951g) {
            this.f29956l = true;
            this.f29951g.notifyAll();
        }
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        synchronized (this.f29951g) {
            this.f29953i = surfaceTexture;
            this.f29954j = i;
            this.f29955k = i2;
            this.f29956l = true;
            this.f29951g.notifyAll();
        }
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        synchronized (this.f29951g) {
            this.f29953i = null;
            this.f29960p = true;
            this.f29956l = false;
            this.f29951g.notifyAll();
        }
        return true;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        synchronized (this.f29951g) {
            this.f29954j = i;
            this.f29955k = i2;
            this.f29957m = true;
            this.f29956l = true;
            this.f29951g.notifyAll();
        }
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0000, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0086, code lost:
        if (r2 == null) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        r2.run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x008d, code lost:
        r1 = r9.f29950f.mo33923b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0093, code lost:
        if (r3 == false) goto L_0x00bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0095, code lost:
        r9.f29950f.mo33926e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00a0, code lost:
        if (r9.f29950f.mo33924c() != false) goto L_0x00ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00a2, code lost:
        r1 = r9.f29951g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00a4, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        r9.f29960p = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00a7, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00ad, code lost:
        r9.f29949e.onSurfaceCreated(r1, com.mapbox.mapboxsdk.maps.renderer.p319b.C11560b.C11561a.m30163e(r9.f29950f));
        r9.f29949e.onSurfaceChanged(r1, r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00bf, code lost:
        if (r6 == false) goto L_0x00cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00c1, code lost:
        r9.f29950f.mo33924c();
        r9.f29949e.onSurfaceChanged(r1, r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00cf, code lost:
        if (r9.f29957m == false) goto L_0x00da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00d1, code lost:
        r9.f29949e.onSurfaceChanged(r1, r7, r8);
        r9.f29957m = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00e2, code lost:
        if (com.mapbox.mapboxsdk.maps.renderer.p319b.C11560b.C11561a.m30162d(r9.f29950f) != javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE) goto L_0x00e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00e6, code lost:
        r9.f29949e.onDrawFrame(r1);
        r1 = r9.f29950f.mo33927f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00f3, code lost:
        if (r1 == 12288) goto L_0x0000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00f7, code lost:
        if (r1 == 12302) goto L_0x0119;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x00f9, code lost:
        com.mapbox.mapboxsdk.log.Logger.m29686w("Mbgl-TextureViewRenderThread", java.lang.String.format("eglSwapBuffer error: %s. Waiting or new surface", new java.lang.Object[]{java.lang.Integer.valueOf(r1)}));
        r1 = r9.f29951g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x010e, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:?, code lost:
        r9.f29953i = null;
        r9.f29960p = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0113, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0119, code lost:
        com.mapbox.mapboxsdk.log.Logger.m29686w("Mbgl-TextureViewRenderThread", "Context lost. Waiting for re-aquire");
        r1 = r9.f29951g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0122, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:?, code lost:
        r9.f29953i = null;
        r9.f29960p = true;
        r9.f29959o = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0129, code lost:
        monitor-exit(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r9 = this;
        L_0x0000:
            r0 = 1
            java.lang.Object r1 = r9.f29951g     // Catch:{ InterruptedException -> 0x014e, all -> 0x0139 }
            monitor-enter(r1)     // Catch:{ InterruptedException -> 0x014e, all -> 0x0139 }
        L_0x0004:
            boolean r2 = r9.f29961q     // Catch:{ all -> 0x0136 }
            if (r2 == 0) goto L_0x001d
            monitor-exit(r1)     // Catch:{ all -> 0x0136 }
            com.mapbox.mapboxsdk.maps.renderer.b.b$a r1 = r9.f29950f
            r1.mo33922a()
            java.lang.Object r2 = r9.f29951g
            monitor-enter(r2)
            r9.f29962r = r0     // Catch:{ all -> 0x001a }
            java.lang.Object r0 = r9.f29951g     // Catch:{ all -> 0x001a }
            r0.notifyAll()     // Catch:{ all -> 0x001a }
            monitor-exit(r2)     // Catch:{ all -> 0x001a }
            return
        L_0x001a:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x001a }
            throw r0
        L_0x001d:
            java.util.ArrayList<java.lang.Runnable> r2 = r9.f29952h     // Catch:{ all -> 0x0136 }
            boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x0136 }
            r3 = -1
            r4 = 0
            r5 = 0
            if (r2 != 0) goto L_0x0035
            java.util.ArrayList<java.lang.Runnable> r2 = r9.f29952h     // Catch:{ all -> 0x0136 }
            java.lang.Object r2 = r2.remove(r5)     // Catch:{ all -> 0x0136 }
            java.lang.Runnable r2 = (java.lang.Runnable) r2     // Catch:{ all -> 0x0136 }
        L_0x0030:
            r3 = 0
            r6 = 0
            r7 = -1
            r8 = -1
            goto L_0x0085
        L_0x0035:
            boolean r2 = r9.f29960p     // Catch:{ all -> 0x0136 }
            if (r2 == 0) goto L_0x0041
            com.mapbox.mapboxsdk.maps.renderer.b.b$a r2 = r9.f29950f     // Catch:{ all -> 0x0136 }
            r2.m30165h()     // Catch:{ all -> 0x0136 }
            r9.f29960p = r5     // Catch:{ all -> 0x0136 }
            goto L_0x004c
        L_0x0041:
            boolean r2 = r9.f29959o     // Catch:{ all -> 0x0136 }
            if (r2 == 0) goto L_0x004e
            com.mapbox.mapboxsdk.maps.renderer.b.b$a r2 = r9.f29950f     // Catch:{ all -> 0x0136 }
            r2.m30164g()     // Catch:{ all -> 0x0136 }
            r9.f29959o = r5     // Catch:{ all -> 0x0136 }
        L_0x004c:
            r2 = r4
            goto L_0x0030
        L_0x004e:
            android.graphics.SurfaceTexture r2 = r9.f29953i     // Catch:{ all -> 0x0136 }
            if (r2 == 0) goto L_0x012f
            boolean r2 = r9.f29958n     // Catch:{ all -> 0x0136 }
            if (r2 != 0) goto L_0x012f
            boolean r2 = r9.f29956l     // Catch:{ all -> 0x0136 }
            if (r2 == 0) goto L_0x012f
            int r3 = r9.f29954j     // Catch:{ all -> 0x0136 }
            int r2 = r9.f29955k     // Catch:{ all -> 0x0136 }
            com.mapbox.mapboxsdk.maps.renderer.b.b$a r6 = r9.f29950f     // Catch:{ all -> 0x0136 }
            javax.microedition.khronos.egl.EGLContext r6 = r6.f29968f     // Catch:{ all -> 0x0136 }
            javax.microedition.khronos.egl.EGLContext r7 = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT     // Catch:{ all -> 0x0136 }
            if (r6 != r7) goto L_0x006e
            r8 = r2
            r7 = r3
            r2 = r4
            r3 = 1
        L_0x006c:
            r6 = 0
            goto L_0x0085
        L_0x006e:
            com.mapbox.mapboxsdk.maps.renderer.b.b$a r6 = r9.f29950f     // Catch:{ all -> 0x0136 }
            javax.microedition.khronos.egl.EGLSurface r6 = r6.f29969g     // Catch:{ all -> 0x0136 }
            javax.microedition.khronos.egl.EGLSurface r7 = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE     // Catch:{ all -> 0x0136 }
            if (r6 != r7) goto L_0x007e
            r8 = r2
            r7 = r3
            r2 = r4
            r3 = 0
            r6 = 1
            goto L_0x0085
        L_0x007e:
            r9.f29956l = r5     // Catch:{ all -> 0x0136 }
            r8 = r2
            r7 = r3
            r2 = r4
            r3 = 0
            goto L_0x006c
        L_0x0085:
            monitor-exit(r1)     // Catch:{ all -> 0x0136 }
            if (r2 == 0) goto L_0x008d
            r2.run()     // Catch:{ InterruptedException -> 0x014e, all -> 0x0139 }
            goto L_0x0000
        L_0x008d:
            com.mapbox.mapboxsdk.maps.renderer.b.b$a r1 = r9.f29950f     // Catch:{ InterruptedException -> 0x014e, all -> 0x0139 }
            javax.microedition.khronos.opengles.GL10 r1 = r1.mo33923b()     // Catch:{ InterruptedException -> 0x014e, all -> 0x0139 }
            if (r3 == 0) goto L_0x00bf
            com.mapbox.mapboxsdk.maps.renderer.b.b$a r2 = r9.f29950f     // Catch:{ InterruptedException -> 0x014e, all -> 0x0139 }
            r2.mo33926e()     // Catch:{ InterruptedException -> 0x014e, all -> 0x0139 }
            com.mapbox.mapboxsdk.maps.renderer.b.b$a r2 = r9.f29950f     // Catch:{ InterruptedException -> 0x014e, all -> 0x0139 }
            boolean r2 = r2.mo33924c()     // Catch:{ InterruptedException -> 0x014e, all -> 0x0139 }
            if (r2 != 0) goto L_0x00ad
            java.lang.Object r1 = r9.f29951g     // Catch:{ InterruptedException -> 0x014e, all -> 0x0139 }
            monitor-enter(r1)     // Catch:{ InterruptedException -> 0x014e, all -> 0x0139 }
            r9.f29960p = r0     // Catch:{ all -> 0x00aa }
            monitor-exit(r1)     // Catch:{ all -> 0x00aa }
            goto L_0x0000
        L_0x00aa:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00aa }
            throw r2     // Catch:{ InterruptedException -> 0x014e, all -> 0x0139 }
        L_0x00ad:
            com.mapbox.mapboxsdk.maps.renderer.b.a r2 = r9.f29949e     // Catch:{ InterruptedException -> 0x014e, all -> 0x0139 }
            com.mapbox.mapboxsdk.maps.renderer.b.b$a r3 = r9.f29950f     // Catch:{ InterruptedException -> 0x014e, all -> 0x0139 }
            javax.microedition.khronos.egl.EGLConfig r3 = r3.f29966d     // Catch:{ InterruptedException -> 0x014e, all -> 0x0139 }
            r2.onSurfaceCreated(r1, r3)     // Catch:{ InterruptedException -> 0x014e, all -> 0x0139 }
            com.mapbox.mapboxsdk.maps.renderer.b.a r2 = r9.f29949e     // Catch:{ InterruptedException -> 0x014e, all -> 0x0139 }
            r2.onSurfaceChanged(r1, r7, r8)     // Catch:{ InterruptedException -> 0x014e, all -> 0x0139 }
            goto L_0x0000
        L_0x00bf:
            if (r6 == 0) goto L_0x00cd
            com.mapbox.mapboxsdk.maps.renderer.b.b$a r2 = r9.f29950f     // Catch:{ InterruptedException -> 0x014e, all -> 0x0139 }
            r2.mo33924c()     // Catch:{ InterruptedException -> 0x014e, all -> 0x0139 }
            com.mapbox.mapboxsdk.maps.renderer.b.a r2 = r9.f29949e     // Catch:{ InterruptedException -> 0x014e, all -> 0x0139 }
            r2.onSurfaceChanged(r1, r7, r8)     // Catch:{ InterruptedException -> 0x014e, all -> 0x0139 }
            goto L_0x0000
        L_0x00cd:
            boolean r2 = r9.f29957m     // Catch:{ InterruptedException -> 0x014e, all -> 0x0139 }
            if (r2 == 0) goto L_0x00da
            com.mapbox.mapboxsdk.maps.renderer.b.a r2 = r9.f29949e     // Catch:{ InterruptedException -> 0x014e, all -> 0x0139 }
            r2.onSurfaceChanged(r1, r7, r8)     // Catch:{ InterruptedException -> 0x014e, all -> 0x0139 }
            r9.f29957m = r5     // Catch:{ InterruptedException -> 0x014e, all -> 0x0139 }
            goto L_0x0000
        L_0x00da:
            com.mapbox.mapboxsdk.maps.renderer.b.b$a r2 = r9.f29950f     // Catch:{ InterruptedException -> 0x014e, all -> 0x0139 }
            javax.microedition.khronos.egl.EGLSurface r2 = r2.f29969g     // Catch:{ InterruptedException -> 0x014e, all -> 0x0139 }
            javax.microedition.khronos.egl.EGLSurface r3 = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE     // Catch:{ InterruptedException -> 0x014e, all -> 0x0139 }
            if (r2 != r3) goto L_0x00e6
            goto L_0x0000
        L_0x00e6:
            com.mapbox.mapboxsdk.maps.renderer.b.a r2 = r9.f29949e     // Catch:{ InterruptedException -> 0x014e, all -> 0x0139 }
            r2.onDrawFrame(r1)     // Catch:{ InterruptedException -> 0x014e, all -> 0x0139 }
            com.mapbox.mapboxsdk.maps.renderer.b.b$a r1 = r9.f29950f     // Catch:{ InterruptedException -> 0x014e, all -> 0x0139 }
            int r1 = r1.mo33927f()     // Catch:{ InterruptedException -> 0x014e, all -> 0x0139 }
            r2 = 12288(0x3000, float:1.7219E-41)
            if (r1 == r2) goto L_0x0000
            r2 = 12302(0x300e, float:1.7239E-41)
            if (r1 == r2) goto L_0x0119
            java.lang.String r2 = "Mbgl-TextureViewRenderThread"
            java.lang.String r3 = "eglSwapBuffer error: %s. Waiting or new surface"
            java.lang.Object[] r6 = new java.lang.Object[r0]     // Catch:{ InterruptedException -> 0x014e, all -> 0x0139 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ InterruptedException -> 0x014e, all -> 0x0139 }
            r6[r5] = r1     // Catch:{ InterruptedException -> 0x014e, all -> 0x0139 }
            java.lang.String r1 = java.lang.String.format(r3, r6)     // Catch:{ InterruptedException -> 0x014e, all -> 0x0139 }
            com.mapbox.mapboxsdk.log.Logger.m29686w(r2, r1)     // Catch:{ InterruptedException -> 0x014e, all -> 0x0139 }
            java.lang.Object r1 = r9.f29951g     // Catch:{ InterruptedException -> 0x014e, all -> 0x0139 }
            monitor-enter(r1)     // Catch:{ InterruptedException -> 0x014e, all -> 0x0139 }
            r9.f29953i = r4     // Catch:{ all -> 0x0116 }
            r9.f29960p = r0     // Catch:{ all -> 0x0116 }
            monitor-exit(r1)     // Catch:{ all -> 0x0116 }
            goto L_0x0000
        L_0x0116:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0116 }
            throw r2     // Catch:{ InterruptedException -> 0x014e, all -> 0x0139 }
        L_0x0119:
            java.lang.String r1 = "Mbgl-TextureViewRenderThread"
            java.lang.String r2 = "Context lost. Waiting for re-aquire"
            com.mapbox.mapboxsdk.log.Logger.m29686w(r1, r2)     // Catch:{ InterruptedException -> 0x014e, all -> 0x0139 }
            java.lang.Object r1 = r9.f29951g     // Catch:{ InterruptedException -> 0x014e, all -> 0x0139 }
            monitor-enter(r1)     // Catch:{ InterruptedException -> 0x014e, all -> 0x0139 }
            r9.f29953i = r4     // Catch:{ all -> 0x012c }
            r9.f29960p = r0     // Catch:{ all -> 0x012c }
            r9.f29959o = r0     // Catch:{ all -> 0x012c }
            monitor-exit(r1)     // Catch:{ all -> 0x012c }
            goto L_0x0000
        L_0x012c:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x012c }
            throw r2     // Catch:{ InterruptedException -> 0x014e, all -> 0x0139 }
        L_0x012f:
            java.lang.Object r2 = r9.f29951g     // Catch:{ all -> 0x0136 }
            r2.wait()     // Catch:{ all -> 0x0136 }
            goto L_0x0004
        L_0x0136:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0136 }
            throw r2     // Catch:{ InterruptedException -> 0x014e, all -> 0x0139 }
        L_0x0139:
            r1 = move-exception
            com.mapbox.mapboxsdk.maps.renderer.b.b$a r2 = r9.f29950f
            r2.mo33922a()
            java.lang.Object r2 = r9.f29951g
            monitor-enter(r2)
            r9.f29962r = r0     // Catch:{ all -> 0x014b }
            java.lang.Object r0 = r9.f29951g     // Catch:{ all -> 0x014b }
            r0.notifyAll()     // Catch:{ all -> 0x014b }
            monitor-exit(r2)     // Catch:{ all -> 0x014b }
            throw r1
        L_0x014b:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x014b }
            throw r0
        L_0x014e:
            com.mapbox.mapboxsdk.maps.renderer.b.b$a r1 = r9.f29950f
            r1.mo33922a()
            java.lang.Object r1 = r9.f29951g
            monitor-enter(r1)
            r9.f29962r = r0     // Catch:{ all -> 0x015f }
            java.lang.Object r0 = r9.f29951g     // Catch:{ all -> 0x015f }
            r0.notifyAll()     // Catch:{ all -> 0x015f }
            monitor-exit(r1)     // Catch:{ all -> 0x015f }
            return
        L_0x015f:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x015f }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.mapboxsdk.maps.renderer.p319b.C11560b.run():void");
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:7|8|9|10|19|16|5) */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x000b, code lost:
        continue;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0015 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo33912a() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f29951g
            monitor-enter(r0)
            r1 = 1
            r2.f29961q = r1     // Catch:{ all -> 0x001f }
            java.lang.Object r1 = r2.f29951g     // Catch:{ all -> 0x001f }
            r1.notifyAll()     // Catch:{ all -> 0x001f }
        L_0x000b:
            boolean r1 = r2.f29962r     // Catch:{ all -> 0x001f }
            if (r1 != 0) goto L_0x001d
            java.lang.Object r1 = r2.f29951g     // Catch:{ InterruptedException -> 0x0015 }
            r1.wait()     // Catch:{ InterruptedException -> 0x0015 }
            goto L_0x000b
        L_0x0015:
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x001f }
            r1.interrupt()     // Catch:{ all -> 0x001f }
            goto L_0x000b
        L_0x001d:
            monitor-exit(r0)     // Catch:{ all -> 0x001f }
            return
        L_0x001f:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001f }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.mapboxsdk.maps.renderer.p319b.C11560b.mo33912a():void");
    }
}
