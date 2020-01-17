package p213co.znly.cardgenerator;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.view.Surface;

/* renamed from: co.znly.cardgenerator.b */
class C6353b {

    /* renamed from: a */
    private EGLDisplay f15925a = EGL14.EGL_NO_DISPLAY;

    /* renamed from: b */
    private EGLContext f15926b = EGL14.EGL_NO_CONTEXT;

    /* renamed from: c */
    private EGLSurface f15927c = EGL14.EGL_NO_SURFACE;

    /* renamed from: d */
    private Surface f15928d;

    C6353b(Surface surface) {
        if (surface != null) {
            this.f15928d = surface;
            m17476d();
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: d */
    private void m17476d() {
        this.f15925a = EGL14.eglGetDisplay(0);
        EGLDisplay eGLDisplay = this.f15925a;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            int[] iArr = new int[2];
            if (EGL14.eglInitialize(eGLDisplay, iArr, 0, iArr, 1)) {
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                int[] iArr2 = new int[1];
                EGL14.eglChooseConfig(this.f15925a, new int[]{12324, 8, 12323, 8, 12322, 8, 12325, 16, 12352, 4, 12338, 1, 12337, 4, 12610, 1, 12344}, 0, eGLConfigArr, 0, eGLConfigArr.length, iArr2, 0);
                if (iArr2[0] != 0) {
                    EGL14.eglSwapInterval(this.f15925a, 0);
                    this.f15926b = EGL14.eglCreateContext(this.f15925a, eGLConfigArr[0], EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
                    m17475a("eglCreateContext");
                    this.f15927c = EGL14.eglCreateWindowSurface(this.f15925a, eGLConfigArr[0], this.f15928d, new int[]{12344}, 0);
                    m17475a("eglCreateWindowSurface");
                    return;
                }
                throw new RuntimeException("EGL: no config available");
            }
            throw new RuntimeException("unable to initialize EGL14");
        }
        throw new RuntimeException("unable to get EGL14 display");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo14223a() {
        EGLDisplay eGLDisplay = this.f15925a;
        EGLSurface eGLSurface = this.f15927c;
        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f15926b);
        m17475a("eglMakeCurrent");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo14225b() {
        EGLDisplay eGLDisplay = this.f15925a;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            EGL14.eglDestroySurface(this.f15925a, this.f15927c);
            EGL14.eglDestroyContext(this.f15925a, this.f15926b);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.f15925a);
        }
        this.f15928d.release();
        this.f15925a = EGL14.EGL_NO_DISPLAY;
        this.f15926b = EGL14.EGL_NO_CONTEXT;
        this.f15927c = EGL14.EGL_NO_SURFACE;
        this.f15928d = null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo14226c() {
        boolean eglSwapBuffers = EGL14.eglSwapBuffers(this.f15925a, this.f15927c);
        m17475a("eglSwapBuffers");
        return eglSwapBuffers;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo14224a(long j) {
        EGLExt.eglPresentationTimeANDROID(this.f15925a, this.f15927c, j);
        m17475a("eglPresentationTimeANDROID");
    }

    /* renamed from: a */
    private void m17475a(String str) {
        int eglGetError = EGL14.eglGetError();
        if (eglGetError != 12288) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(": EGL error: 0x");
            sb.append(Integer.toHexString(eglGetError));
            throw new RuntimeException(sb.toString());
        }
    }
}
