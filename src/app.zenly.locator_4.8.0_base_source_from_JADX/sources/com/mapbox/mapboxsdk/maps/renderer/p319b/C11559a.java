package com.mapbox.mapboxsdk.maps.renderer.p319b;

import android.content.Context;
import android.view.TextureView;
import com.mapbox.mapboxsdk.maps.renderer.MapRenderer;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.mapbox.mapboxsdk.maps.renderer.b.a */
public class C11559a extends MapRenderer {

    /* renamed from: a */
    private C11560b f29947a;

    /* renamed from: b */
    private boolean f29948b;

    public C11559a(Context context, TextureView textureView, String str, boolean z) {
        super(context, str);
        this.f29948b = z;
        this.f29947a = new C11560b(textureView, this);
        this.f29947a.start();
    }

    /* renamed from: a */
    public boolean mo33911a() {
        return this.f29948b;
    }

    public void onDestroy() {
        this.f29947a.mo33912a();
    }

    /* access modifiers changed from: protected */
    public void onDrawFrame(GL10 gl10) {
        super.onDrawFrame(gl10);
    }

    public void onStart() {
        this.f29947a.mo33915c();
    }

    public void onStop() {
        this.f29947a.mo33914b();
    }

    /* access modifiers changed from: protected */
    public void onSurfaceChanged(GL10 gl10, int i, int i2) {
        super.onSurfaceChanged(gl10, i, i2);
    }

    /* access modifiers changed from: protected */
    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        super.onSurfaceCreated(gl10, eGLConfig);
    }

    /* access modifiers changed from: protected */
    public void onSurfaceDestroyed() {
        super.onSurfaceDestroyed();
    }

    public void queueEvent(Runnable runnable) {
        this.f29947a.mo33913a(runnable);
    }

    public void requestRender() {
        this.f29947a.mo33916d();
    }
}
