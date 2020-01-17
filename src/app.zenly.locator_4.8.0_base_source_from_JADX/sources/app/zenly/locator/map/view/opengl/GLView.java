package app.zenly.locator.map.view.opengl;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.TextureView;
import android.view.TextureView.SurfaceTextureListener;

public abstract class GLView extends TextureView implements SurfaceTextureListener {

    /* renamed from: e */
    protected volatile C4401f f11868e;

    /* renamed from: f */
    private volatile boolean f11869f;

    /* renamed from: g */
    private final Runnable f11870g = new C4396a(this);

    public GLView(Context context) {
        super(context);
        m13073h();
    }

    /* renamed from: h */
    private void m13073h() {
        setAlpha(0.0f);
        setOpaque(false);
        setSurfaceTextureListener(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public void m13074i() {
        setAlpha(1.0f);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized void mo11531a(C4397b bVar) {
        boolean z = this.f11868e == null;
        if (z) {
            this.f11868e = new C4401f(bVar, getSurfaceTexture());
            this.f11868e.mo11555a();
            mo11420d();
        } else {
            this.f11868e.mo11555a();
        }
        mo11421e();
        bVar.f11872a.eglSwapBuffers(bVar.f11873b, this.f11868e.f11887b);
        if (z) {
            post(this.f11870g);
        }
    }

    /* renamed from: b */
    public boolean mo11532b() {
        return this.f11869f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo11419c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo11420d();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract void mo11421e();

    /* renamed from: f */
    public void mo11533f() {
        this.f11869f = true;
        C4400e.m13092d().mo11552c();
    }

    /* renamed from: g */
    public void mo11534g() {
        this.f11869f = false;
    }

    public C4401f getRenderContext() {
        return this.f11868e;
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        C4400e.m13092d().mo11549a(this);
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C4400e.m13092d().mo11551b(this);
        setAlpha(0.0f);
        return true;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public GLView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m13073h();
    }

    public GLView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m13073h();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized void mo11530a() {
        if (this.f11868e != null) {
            removeCallbacks(this.f11870g);
            mo11419c();
            this.f11868e.mo11557c();
            this.f11868e = null;
        }
    }
}
