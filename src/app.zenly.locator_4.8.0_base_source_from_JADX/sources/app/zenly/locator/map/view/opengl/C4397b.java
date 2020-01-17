package app.zenly.locator.map.view.opengl;

import android.opengl.GLUtils;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import p387h.p388a.C12143a;

/* renamed from: app.zenly.locator.map.view.opengl.b */
public class C4397b {

    /* renamed from: a */
    EGL10 f11872a = ((EGL10) EGLContext.getEGL());

    /* renamed from: b */
    EGLDisplay f11873b = this.f11872a.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);

    /* renamed from: c */
    EGLConfig f11874c;

    C4397b() {
        EGLDisplay eGLDisplay = this.f11873b;
        if (eGLDisplay != EGL10.EGL_NO_DISPLAY) {
            if (this.f11872a.eglInitialize(eGLDisplay, new int[2])) {
                int[] iArr = new int[1];
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                int[] iArr2 = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344};
                this.f11874c = null;
                if (this.f11872a.eglChooseConfig(this.f11873b, iArr2, eGLConfigArr, 1, iArr)) {
                    if (iArr[0] > 0) {
                        this.f11874c = eGLConfigArr[0];
                    }
                    if (this.f11874c == null) {
                        throw new RuntimeException("eglConfig not initialized");
                    }
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("eglChooseConfig failed ");
                sb.append(GLUtils.getEGLErrorString(this.f11872a.eglGetError()));
                throw new IllegalArgumentException(sb.toString());
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("eglInitialize failed ");
            sb2.append(GLUtils.getEGLErrorString(this.f11872a.eglGetError()));
            throw new RuntimeException(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("eglGetDisplay failed ");
        sb3.append(GLUtils.getEGLErrorString(this.f11872a.eglGetError()));
        throw new RuntimeException(sb3.toString());
    }

    /* renamed from: a */
    public void mo11541a() {
        int eglGetError = this.f11872a.eglGetError();
        if (eglGetError != 12288) {
            C12143a.m32030b("EGL error = 0x%s", Integer.toHexString(eglGetError));
        }
    }
}
