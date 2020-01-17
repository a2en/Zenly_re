package app.zenly.locator.core.p072ui.view.particles;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import app.zenly.locator.core.p072ui.view.particles.ParticleAnimation.C3151a;
import app.zenly.locator.core.p072ui.view.particles.ParticlesAnimator.Choreographer;
import app.zenly.locator.core.p072ui.view.particles.ParticlesAnimator.Renderer;
import app.zenly.locator.core.util.C3200e0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import p214e.p228e.C7584g;

/* renamed from: app.zenly.locator.core.ui.view.particles.ParticleView */
public class ParticleView extends View {
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final ArrayList<ParticleAnimation> f8758e = new ArrayList<>();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final ArrayList<ParticleAnimation> f8759f = new ArrayList<>();

    /* renamed from: g */
    private ParticlesAnimator f8760g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final List<C3151a> f8761h = new ArrayList();

    /* renamed from: i */
    private final List<C3151a> f8762i = new ArrayList();

    /* renamed from: j */
    protected final Paint f8763j = new Paint();

    /* renamed from: k */
    protected final SparseArray<PorterDuffColorFilter> f8764k = new SparseArray<>();

    /* renamed from: l */
    protected final C7584g<Mode, PorterDuffXfermode> f8765l = new C7584g<>();

    /* renamed from: m */
    protected final Matrix f8766m = new Matrix();

    /* renamed from: n */
    private boolean f8767n = false;

    /* renamed from: o */
    private final Paint f8768o = new Paint();
    /* access modifiers changed from: private */

    /* renamed from: p */
    public ParticleViewListener f8769p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public boolean f8770q;

    /* renamed from: r */
    private boolean f8771r;

    /* renamed from: s */
    private Renderer f8772s = new C3153a();
    /* access modifiers changed from: private */

    /* renamed from: t */
    public Handler f8773t = new C3154b(Looper.getMainLooper());
    /* access modifiers changed from: private */

    /* renamed from: u */
    public Comparator<C3151a> f8774u = C3159a.f8820e;

    /* renamed from: app.zenly.locator.core.ui.view.particles.ParticleView$ParticleViewListener */
    public interface ParticleViewListener {
        void onParticlesAnimationFinish();

        void onParticlesAnimationStart();
    }

    /* renamed from: app.zenly.locator.core.ui.view.particles.ParticleView$a */
    class C3153a implements Renderer {
        C3153a() {
        }

        public void onNewParticle(C3151a aVar) {
            Message obtainMessage = ParticleView.this.f8773t.obtainMessage(1);
            obtainMessage.obj = aVar;
            ParticleView.this.f8773t.sendMessage(obtainMessage);
        }

        public void onParticlesAnimationFinished(ParticleAnimation particleAnimation) {
            Message obtainMessage = ParticleView.this.f8773t.obtainMessage(2);
            obtainMessage.obj = particleAnimation;
            ParticleView.this.f8773t.sendMessage(obtainMessage);
        }
    }

    /* renamed from: app.zenly.locator.core.ui.view.particles.ParticleView$b */
    class C3154b extends Handler {
        C3154b(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            int i = message.what;
            if (i == 1) {
                if (!ParticleView.this.f8770q) {
                    ParticleView.this.f8770q = true;
                    if (ParticleView.this.f8769p != null) {
                        ParticleView.this.f8769p.onParticlesAnimationStart();
                    }
                }
                C3151a aVar = (C3151a) message.obj;
                ParticleView.this.f8761h.add(aVar);
                int size = ParticleView.this.f8761h.size();
                if (size >= 2 && ((C3151a) ParticleView.this.f8761h.get(size - 2)).mo9532n() > aVar.mo9532n()) {
                    Collections.sort(ParticleView.this.f8761h, ParticleView.this.f8774u);
                }
                ParticleView.this.postInvalidateOnAnimation();
            } else if (i == 2) {
                ParticleView.this.f8758e.remove(message.obj);
                ParticleView.this.f8759f.remove(message.obj);
                if (ParticleView.this.f8758e.size() == 0) {
                    ParticleView.this.f8764k.clear();
                    ParticleView.this.f8765l.clear();
                    ParticleView.this.f8770q = false;
                    if (ParticleView.this.f8769p != null) {
                        ParticleView.this.f8769p.onParticlesAnimationFinish();
                    }
                }
            }
        }
    }

    public ParticleView(Context context) {
        super(context);
        mo9420a();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.f8761h.size();
        if (size > 0) {
            for (int i = 0; i < size; i++) {
                C3151a aVar = (C3151a) this.f8761h.get(i);
                if (!aVar.mo9536r()) {
                    aVar.mo9539u();
                    Bitmap d = aVar.mo9522d();
                    float h = aVar.mo9526h();
                    float i2 = aVar.mo9527i();
                    float j = aVar.mo9528j();
                    int f = aVar.mo9524f();
                    float l = aVar.mo9530l();
                    float m = aVar.mo9531m();
                    float k = aVar.mo9529k();
                    float g = aVar.mo9525g();
                    float f2 = l - (k / 2.0f);
                    float f3 = m - (g / 2.0f);
                    float width = k / ((float) d.getWidth());
                    float height = g / ((float) d.getHeight());
                    this.f8766m.reset();
                    this.f8766m.postScale(width, height);
                    this.f8766m.postRotate(h, i2, j);
                    this.f8766m.postTranslate(f2, f3);
                    m9957a(aVar.mo9523e(), aVar.mo9533o(), f);
                    canvas.drawBitmap(d, this.f8766m, this.f8763j);
                } else {
                    Canvas canvas2 = canvas;
                    this.f8762i.add(aVar);
                }
            }
            if (this.f8762i.size() > 0) {
                int size2 = this.f8762i.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    C3151a aVar2 = (C3151a) this.f8762i.get(i3);
                    this.f8761h.remove(aVar2);
                    aVar2.mo9514a();
                }
                this.f8762i.clear();
            }
            postInvalidateOnAnimation();
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f8760g.mo9549a(i, i2, i3, i4);
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        boolean z = i == 0;
        if (z != this.f8767n) {
            this.f8767n = z;
            if (z) {
                Iterator it = this.f8759f.iterator();
                while (it.hasNext()) {
                    ((ParticleAnimation) it.next()).mo9507o();
                }
                this.f8759f.clear();
                return;
            }
            Iterator it2 = this.f8758e.iterator();
            while (it2.hasNext()) {
                ParticleAnimation particleAnimation = (ParticleAnimation) it2.next();
                if (!particleAnimation.mo9501i()) {
                    this.f8759f.add(particleAnimation);
                    particleAnimation.mo9505m();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo9420a() {
        this.f8760g = new ParticlesAnimator();
        this.f8760g.mo9551a((Choreographer) new C3188j());
        this.f8760g.mo9552a(this.f8772s);
        this.f8768o.setColor(-16777216);
        this.f8768o.setTextSize((float) C3200e0.m10183a(getContext(), 20));
    }

    /* renamed from: a */
    public void mo9542a(ParticleAnimation particleAnimation) {
        if (isLaidOut()) {
            particleAnimation.mo9490a(getWidth(), getHeight(), 0, 0);
        }
        if (this.f8771r) {
            particleAnimation.mo9505m();
        }
        this.f8758e.add(particleAnimation);
        this.f8760g.mo9550a(particleAnimation);
    }

    /* renamed from: a */
    public ParticleView mo9541a(ParticleViewListener particleViewListener) {
        this.f8769p = particleViewListener;
        return this;
    }

    public ParticleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo9420a();
    }

    /* renamed from: a */
    private void m9957a(int i, Mode mode, int i2) {
        if (i != 0) {
            PorterDuffColorFilter porterDuffColorFilter = (PorterDuffColorFilter) this.f8764k.get(i);
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i, Mode.SRC_IN);
                this.f8764k.put(i, porterDuffColorFilter);
            }
            this.f8763j.setColorFilter(porterDuffColorFilter);
        } else {
            this.f8763j.setColorFilter(null);
        }
        if (mode != C3151a.f8725u) {
            PorterDuffXfermode porterDuffXfermode = (PorterDuffXfermode) this.f8765l.get(mode);
            if (porterDuffXfermode == null) {
                porterDuffXfermode = new PorterDuffXfermode(mode);
                this.f8765l.put(mode, porterDuffXfermode);
            }
            this.f8763j.setXfermode(porterDuffXfermode);
        } else {
            this.f8763j.setXfermode(null);
        }
        this.f8763j.setAlpha(i2);
    }

    public ParticleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo9420a();
    }
}
