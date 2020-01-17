package app.zenly.locator.map.view.opengl;

import android.os.Looper;
import android.view.Choreographer;
import android.view.Choreographer.FrameCallback;
import java.util.LinkedList;
import java.util.List;

/* renamed from: app.zenly.locator.map.view.opengl.e */
public class C4400e extends Thread implements FrameCallback {

    /* renamed from: j */
    private static C4400e f11880j = new C4400e();

    /* renamed from: e */
    private boolean f11881e = false;

    /* renamed from: f */
    private boolean f11882f = true;

    /* renamed from: g */
    private volatile C4399d f11883g;

    /* renamed from: h */
    private volatile C4397b f11884h;

    /* renamed from: i */
    private final List<GLView> f11885i = new LinkedList();

    private C4400e() {
        super("Zenly OpenGLViews render");
        start();
    }

    /* renamed from: d */
    public static C4400e m13092d() {
        return f11880j;
    }

    /* renamed from: e */
    private void m13093e() {
        if (this.f11883g != null) {
            this.f11883g.sendMessage(this.f11883g.obtainMessage(2));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo11549a(GLView gLView) {
        synchronized (this.f11885i) {
            this.f11885i.add(gLView);
        }
        if (gLView.mo11532b()) {
            mo11552c();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo11551b(GLView gLView) {
        synchronized (this.f11885i) {
            this.f11885i.remove(gLView);
        }
        gLView.mo11530a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo11552c() {
        if (this.f11883g != null) {
            this.f11883g.sendMessage(this.f11883g.obtainMessage(1));
        }
    }

    public void doFrame(long j) {
        Choreographer.getInstance().postFrameCallback(this);
        if (this.f11881e) {
            m13093e();
        }
    }

    public void run() {
        this.f11884h = new C4397b();
        Looper.prepare();
        this.f11883g = new C4399d(this);
        this.f11881e = true;
        Looper.loop();
        this.f11881e = false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo11550b() {
        if (this.f11882f) {
            Choreographer.getInstance().postFrameCallback(this);
            this.f11882f = false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo11548a() {
        boolean z;
        synchronized (this.f11885i) {
            z = false;
            for (GLView gLView : this.f11885i) {
                if (gLView.mo11532b()) {
                    gLView.mo11531a(this.f11884h);
                    z = true;
                }
            }
        }
        if (!z) {
            Choreographer.getInstance().removeFrameCallback(this);
            this.f11882f = true;
        }
    }
}
