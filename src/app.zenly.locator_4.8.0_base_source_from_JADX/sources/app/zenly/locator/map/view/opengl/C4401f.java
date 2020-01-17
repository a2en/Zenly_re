package app.zenly.locator.map.view.opengl;

import android.graphics.SurfaceTexture;
import android.opengl.GLUtils;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL11;
import p387h.p388a.C12143a;

/* renamed from: app.zenly.locator.map.view.opengl.f */
public class C4401f {

    /* renamed from: a */
    private final C4397b f11886a;

    /* renamed from: b */
    final EGLSurface f11887b;

    /* renamed from: c */
    final EGLContext f11888c;

    /* renamed from: d */
    final GL11 f11889d;

    C4401f(C4397b bVar, SurfaceTexture surfaceTexture) {
        this.f11886a = bVar;
        this.f11888c = bVar.f11872a.eglCreateContext(bVar.f11873b, bVar.f11874c, EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
        bVar.mo11541a();
        this.f11887b = bVar.f11872a.eglCreateWindowSurface(bVar.f11873b, bVar.f11874c, surfaceTexture, null);
        bVar.mo11541a();
        EGLSurface eGLSurface = this.f11887b;
        if (eGLSurface == null || eGLSurface == EGL10.EGL_NO_SURFACE) {
            int eglGetError = bVar.f11872a.eglGetError();
            if (eglGetError == 12299) {
                C12143a.m32030b("eglCreateWindowSurface returned EGL10.EGL_BAD_NATIVE_WINDOW", new Object[0]);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("eglCreateWindowSurface failed ");
            sb.append(GLUtils.getEGLErrorString(eglGetError));
            throw new RuntimeException(sb.toString());
        }
        this.f11889d = (GL11) this.f11888c.getGL();
        bVar.mo11541a();
    }

    /* renamed from: a */
    public void mo11555a() {
        if (!this.f11888c.equals(this.f11886a.f11872a.eglGetCurrentContext()) || !this.f11887b.equals(this.f11886a.f11872a.eglGetCurrentSurface(12377))) {
            this.f11886a.mo11541a();
            C4397b bVar = this.f11886a;
            EGL10 egl10 = bVar.f11872a;
            EGLDisplay eGLDisplay = bVar.f11873b;
            EGLSurface eGLSurface = this.f11887b;
            if (egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f11888c)) {
                this.f11886a.mo11541a();
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("eglMakeCurrent failed ");
            sb.append(GLUtils.getEGLErrorString(this.f11886a.f11872a.eglGetError()));
            throw new RuntimeException(sb.toString());
        }
    }

    /* renamed from: b */
    public void mo11556b() {
        int glGetError = this.f11889d.glGetError();
        if (glGetError != 0) {
            C12143a.m32030b("GL error = 0x%s", Integer.toHexString(glGetError));
        }
    }

    /* renamed from: c */
    public void mo11557c() {
        C4397b bVar = this.f11886a;
        bVar.f11872a.eglDestroyContext(bVar.f11873b, this.f11888c);
        C4397b bVar2 = this.f11886a;
        bVar2.f11872a.eglDestroySurface(bVar2.f11873b, this.f11887b);
    }
}
