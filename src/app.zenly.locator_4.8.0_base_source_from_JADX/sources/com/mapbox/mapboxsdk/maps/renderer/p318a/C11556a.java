package com.mapbox.mapboxsdk.maps.renderer.p318a;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.opengl.GLSurfaceView.Renderer;
import android.view.SurfaceHolder;
import com.mapbox.mapboxsdk.maps.renderer.MapRenderer;
import com.mapbox.mapboxsdk.maps.renderer.egl.C11562a;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.mapbox.mapboxsdk.maps.renderer.a.a */
public class C11556a extends MapRenderer implements Renderer {

    /* renamed from: a */
    private final GLSurfaceView f29945a;

    /* renamed from: com.mapbox.mapboxsdk.maps.renderer.a.a$a */
    class C11557a extends C11558b {
        C11557a() {
        }

        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            C11556a.this.onSurfaceDestroyed();
        }
    }

    public C11556a(Context context, GLSurfaceView gLSurfaceView, String str) {
        super(context, str);
        this.f29945a = gLSurfaceView;
        gLSurfaceView.setEGLContextClientVersion(2);
        gLSurfaceView.setEGLConfigChooser(new C11562a());
        gLSurfaceView.setRenderer(this);
        gLSurfaceView.setRenderMode(0);
        gLSurfaceView.setPreserveEGLContextOnPause(true);
        gLSurfaceView.getHolder().addCallback(new C11557a());
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void onDrawFrame(GL10 gl10) {
        super.onDrawFrame(gl10);
    }

    public void onPause() {
        super.onPause();
    }

    public void onResume() {
        super.onResume();
    }

    public void onStart() {
        this.f29945a.onResume();
    }

    public void onStop() {
        this.f29945a.onPause();
    }

    public void onSurfaceChanged(GL10 gl10, int i, int i2) {
        super.onSurfaceChanged(gl10, i, i2);
    }

    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        super.onSurfaceCreated(gl10, eGLConfig);
    }

    public void queueEvent(Runnable runnable) {
        this.f29945a.queueEvent(runnable);
    }

    public void requestRender() {
        this.f29945a.requestRender();
    }
}
