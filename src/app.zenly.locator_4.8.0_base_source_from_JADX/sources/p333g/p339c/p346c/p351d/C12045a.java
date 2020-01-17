package p333g.p339c.p346c.p351d;

import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PointF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import com.facebook.drawee.drawable.C9613e;
import com.facebook.drawee.drawable.C9614f;
import com.facebook.drawee.drawable.ScalingUtils.ScaleType;
import com.facebook.drawee.interfaces.SettableDraweeHierarchy;
import com.facebook.imagepipeline.systrace.FrescoSystrace;

/* renamed from: g.c.c.d.a */
public class C12045a implements SettableDraweeHierarchy {

    /* renamed from: a */
    private final Drawable f31400a = new ColorDrawable(0);

    /* renamed from: b */
    private final Resources f31401b;

    /* renamed from: c */
    private C12049e f31402c;

    /* renamed from: d */
    private final C12048d f31403d;

    /* renamed from: e */
    private final C9613e f31404e;

    /* renamed from: f */
    private final C9614f f31405f;

    C12045a(C12046b bVar) {
        if (FrescoSystrace.m24705c()) {
            FrescoSystrace.m24703a("GenericDraweeHierarchy()");
        }
        this.f31401b = bVar.mo35743p();
        this.f31402c = bVar.mo35746s();
        this.f31405f = new C9614f(this.f31400a);
        int i = 1;
        int size = (bVar.mo35737j() != null ? bVar.mo35737j().size() : 1) + (bVar.mo35740m() != null ? 1 : 0);
        Drawable[] drawableArr = new Drawable[(size + 6)];
        drawableArr[0] = m31766a(bVar.mo35728e(), null);
        drawableArr[1] = m31766a(bVar.mo35738k(), bVar.mo35739l());
        drawableArr[2] = m31767a(this.f31405f, bVar.mo35725d(), bVar.mo35722c(), bVar.mo35719b());
        drawableArr[3] = m31766a(bVar.mo35741n(), bVar.mo35742o());
        drawableArr[4] = m31766a(bVar.mo35744q(), bVar.mo35745r());
        drawableArr[5] = m31766a(bVar.mo35735h(), bVar.mo35736i());
        if (size > 0) {
            if (bVar.mo35737j() != null) {
                i = 0;
                for (Drawable a : bVar.mo35737j()) {
                    int i2 = i + 1;
                    drawableArr[i + 6] = m31766a(a, null);
                    i = i2;
                }
            }
            if (bVar.mo35740m() != null) {
                drawableArr[i + 6] = m31766a(bVar.mo35740m(), null);
            }
        }
        this.f31404e = new C9613e(drawableArr);
        this.f31404e.mo25974d(bVar.mo35733g());
        this.f31403d = new C12048d(C12051f.m31834a((Drawable) this.f31404e, this.f31402c));
        this.f31403d.mutate();
        m31773c();
        if (FrescoSystrace.m24705c()) {
            FrescoSystrace.m24702a();
        }
    }

    /* renamed from: a */
    private Drawable m31767a(Drawable drawable, ScaleType scaleType, PointF pointF, ColorFilter colorFilter) {
        drawable.setColorFilter(colorFilter);
        return C12051f.m31833a(drawable, scaleType, pointF);
    }

    /* renamed from: b */
    private void m31771b() {
        this.f31405f.setDrawable(this.f31400a);
    }

    /* renamed from: c */
    private void m31773c() {
        C9613e eVar = this.f31404e;
        if (eVar != null) {
            eVar.mo25969b();
            this.f31404e.mo25973d();
            m31768a();
            m31770a(1);
            this.f31404e.mo25975e();
            this.f31404e.mo25971c();
        }
    }

    public Drawable getTopLevelDrawable() {
        return this.f31403d;
    }

    public void reset() {
        m31771b();
        m31773c();
    }

    public void setControllerOverlay(Drawable drawable) {
        this.f31403d.mo35747c(drawable);
    }

    public void setFailure(Throwable th) {
        this.f31404e.mo25969b();
        m31768a();
        if (this.f31404e.mo25942a(5) != null) {
            m31770a(5);
        } else {
            m31770a(1);
        }
        this.f31404e.mo25971c();
    }

    public void setImage(Drawable drawable, float f, boolean z) {
        Drawable b = C12051f.m31838b(drawable, this.f31402c, this.f31401b);
        b.mutate();
        this.f31405f.setDrawable(b);
        this.f31404e.mo25969b();
        m31768a();
        m31770a(2);
        m31769a(f);
        if (z) {
            this.f31404e.mo25975e();
        }
        this.f31404e.mo25971c();
    }

    public void setProgress(float f, boolean z) {
        if (this.f31404e.mo25942a(3) != null) {
            this.f31404e.mo25969b();
            m31769a(f);
            if (z) {
                this.f31404e.mo25975e();
            }
            this.f31404e.mo25971c();
        }
    }

    public void setRetry(Throwable th) {
        this.f31404e.mo25969b();
        m31768a();
        if (this.f31404e.mo25942a(4) != null) {
            m31770a(4);
        } else {
            m31770a(1);
        }
        this.f31404e.mo25971c();
    }

    /* renamed from: b */
    private void m31772b(int i) {
        if (i >= 0) {
            this.f31404e.mo25972c(i);
        }
    }

    /* renamed from: a */
    private Drawable m31766a(Drawable drawable, ScaleType scaleType) {
        return C12051f.m31832a(C12051f.m31838b(drawable, this.f31402c, this.f31401b), scaleType);
    }

    /* renamed from: a */
    private void m31768a() {
        m31772b(1);
        m31772b(2);
        m31772b(3);
        m31772b(4);
        m31772b(5);
    }

    /* renamed from: a */
    private void m31770a(int i) {
        if (i >= 0) {
            this.f31404e.mo25970b(i);
        }
    }

    /* renamed from: a */
    private void m31769a(float f) {
        Drawable a = this.f31404e.mo25942a(3);
        if (a != null) {
            if (f >= 0.999f) {
                if (a instanceof Animatable) {
                    ((Animatable) a).stop();
                }
                m31772b(3);
            } else {
                if (a instanceof Animatable) {
                    ((Animatable) a).start();
                }
                m31770a(3);
            }
            a.setLevel(Math.round(f * 10000.0f));
        }
    }
}
