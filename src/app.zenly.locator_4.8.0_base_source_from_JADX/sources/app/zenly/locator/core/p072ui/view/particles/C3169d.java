package app.zenly.locator.core.p072ui.view.particles;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build.VERSION;
import androidx.core.content.C0540a;
import app.zenly.locator.core.p072ui.view.particles.ParticleAnimation.C3151a;
import app.zenly.locator.core.util.C3238u;
import p250f.p251a.p252a.p253a.p254d.C7657c;

/* renamed from: app.zenly.locator.core.ui.view.particles.d */
public class C3169d extends ParticleAnimation<C3170a> {

    /* renamed from: k */
    private int[] f8882k;

    /* renamed from: l */
    private int f8883l;

    /* renamed from: m */
    private int f8884m;

    /* renamed from: app.zenly.locator.core.ui.view.particles.d$a */
    public final class C3170a extends C3151a {

        /* renamed from: v */
        private final double f8885v;

        /* renamed from: w */
        private final double f8886w;

        /* renamed from: x */
        private int f8887x;

        /* renamed from: y */
        private int f8888y;

        protected C3170a(C3169d dVar, Bitmap bitmap, int i, int i2, int i3) {
            super(bitmap, ((float) i) / 2.0f, ((float) i2) / 2.0f, (float) bitmap.getWidth(), (float) bitmap.getHeight());
            this.f8887x = i;
            this.f8888y = i2;
            this.f8742q = i3;
            if (VERSION.SDK_INT <= 26) {
                this.f8743r = Mode.LIGHTEN;
            }
            double a = C3238u.m10268a(0.0d, 6.283185307179586d);
            this.f8885v = ((double) C3238u.m10269a(0.3f, 1.0f)) * Math.cos(a);
            this.f8886w = ((double) C3238u.m10269a(0.3f, 1.0f)) * Math.sin(a);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo9517a(int i, int i2, int i3, int i4) {
            super.mo9517a(i, i2, i3, i4);
            this.f8887x = i;
            this.f8888y = i2;
            this.f8727b = ((float) this.f8887x) / 2.0f;
            this.f8728c = ((float) this.f8888y) / 2.0f;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public long mo9519b() {
            return 2000;
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public TimeInterpolator mo9521c() {
            return C7657c.m18645c();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo9515a(float f) {
            double d = (double) f;
            this.f8733h = (float) (((double) this.f8727b) + (((double) (((float) this.f8887x) / 2.0f)) * this.f8885v * d));
            this.f8734i = (float) (((double) this.f8728c) + (((double) (((float) this.f8888y) / 2.0f)) * this.f8886w * d));
            if (f > 0.8f) {
                this.f8737l = (int) ((1.0f - ((f - 0.8f) / 0.2f)) * 255.0f);
            }
        }
    }

    public C3169d(Context context, int[] iArr) {
        this.f8882k = iArr;
        mo9489a(((BitmapDrawable) C0540a.m2546c(context, 2131231215)).getBitmap(), 100);
    }

    /* renamed from: a */
    public long mo9487a() {
        return 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C3170a m10063a(Bitmap bitmap) {
        C3170a aVar = new C3170a(this, bitmap, this.f8883l, this.f8884m, C3238u.m10271a(this.f8882k));
        return aVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo9490a(int i, int i2, int i3, int i4) {
        super.mo9490a(i, i2, i3, i4);
        this.f8883l = i;
        this.f8884m = i2;
    }
}
