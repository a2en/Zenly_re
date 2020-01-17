package com.bumptech.glide.load.resource.gif;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import android.view.Gravity;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat.C1258a;
import com.bumptech.glide.Glide;
import com.bumptech.glide.gifdecoder.GifDecoder;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.resource.gif.GifFrameLoader.FrameCallback;
import com.bumptech.glide.p301o.C9216j;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bumptech.glide.load.resource.gif.c */
public class C9156c extends Drawable implements FrameCallback, Animatable, Animatable2Compat {

    /* renamed from: e */
    private final C9157a f23774e;

    /* renamed from: f */
    private boolean f23775f;

    /* renamed from: g */
    private boolean f23776g;

    /* renamed from: h */
    private boolean f23777h;

    /* renamed from: i */
    private boolean f23778i;

    /* renamed from: j */
    private int f23779j;

    /* renamed from: k */
    private int f23780k;

    /* renamed from: l */
    private boolean f23781l;

    /* renamed from: m */
    private Paint f23782m;

    /* renamed from: n */
    private Rect f23783n;

    /* renamed from: o */
    private List<C1258a> f23784o;

    /* renamed from: com.bumptech.glide.load.resource.gif.c$a */
    static final class C9157a extends ConstantState {

        /* renamed from: a */
        final GifFrameLoader f23785a;

        C9157a(GifFrameLoader gifFrameLoader) {
            this.f23785a = gifFrameLoader;
        }

        public int getChangingConfigurations() {
            return 0;
        }

        public Drawable newDrawable(Resources resources) {
            return newDrawable();
        }

        public Drawable newDrawable() {
            return new C9156c(this);
        }
    }

    public C9156c(Context context, GifDecoder gifDecoder, Transformation<Bitmap> transformation, int i, int i2, Bitmap bitmap) {
        GifFrameLoader gifFrameLoader = new GifFrameLoader(Glide.m21128a(context), gifDecoder, i, i2, transformation, bitmap);
        this(new C9157a(gifFrameLoader));
    }

    /* renamed from: g */
    private Callback m21932g() {
        Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        return callback;
    }

    /* renamed from: h */
    private Rect m21933h() {
        if (this.f23783n == null) {
            this.f23783n = new Rect();
        }
        return this.f23783n;
    }

    /* renamed from: i */
    private Paint m21934i() {
        if (this.f23782m == null) {
            this.f23782m = new Paint(2);
        }
        return this.f23782m;
    }

    /* renamed from: j */
    private void m21935j() {
        List<C1258a> list = this.f23784o;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((C1258a) this.f23784o.get(i)).mo6128a(this);
            }
        }
    }

    /* renamed from: k */
    private void m21936k() {
        this.f23779j = 0;
    }

    /* renamed from: l */
    private void m21937l() {
        C9216j.m22087a(!this.f23777h, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.f23774e.f23785a.mo24677f() == 1) {
            invalidateSelf();
        } else if (!this.f23775f) {
            this.f23775f = true;
            this.f23774e.f23785a.mo24670a((FrameCallback) this);
            invalidateSelf();
        }
    }

    /* renamed from: m */
    private void m21938m() {
        this.f23775f = false;
        this.f23774e.f23785a.mo24673b(this);
    }

    /* renamed from: a */
    public void mo24693a(Transformation<Bitmap> transformation, Bitmap bitmap) {
        this.f23774e.f23785a.mo24669a(transformation, bitmap);
    }

    /* renamed from: b */
    public Bitmap mo24694b() {
        return this.f23774e.f23785a.mo24676e();
    }

    /* renamed from: c */
    public int mo24695c() {
        return this.f23774e.f23785a.mo24677f();
    }

    public void clearAnimationCallbacks() {
        List<C1258a> list = this.f23784o;
        if (list != null) {
            list.clear();
        }
    }

    /* renamed from: d */
    public int mo24696d() {
        return this.f23774e.f23785a.mo24675d();
    }

    public void draw(Canvas canvas) {
        if (!this.f23777h) {
            if (this.f23781l) {
                Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), m21933h());
                this.f23781l = false;
            }
            canvas.drawBitmap(this.f23774e.f23785a.mo24674c(), null, m21933h(), m21934i());
        }
    }

    /* renamed from: e */
    public int mo24698e() {
        return this.f23774e.f23785a.mo24679h();
    }

    /* renamed from: f */
    public void mo24699f() {
        this.f23777h = true;
        this.f23774e.f23785a.mo24668a();
    }

    public ConstantState getConstantState() {
        return this.f23774e;
    }

    public int getIntrinsicHeight() {
        return this.f23774e.f23785a.mo24678g();
    }

    public int getIntrinsicWidth() {
        return this.f23774e.f23785a.mo24680i();
    }

    public int getOpacity() {
        return -2;
    }

    public boolean isRunning() {
        return this.f23775f;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f23781l = true;
    }

    public void onFrameReady() {
        if (m21932g() == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        if (mo24696d() == mo24695c() - 1) {
            this.f23779j++;
        }
        int i = this.f23780k;
        if (i != -1 && this.f23779j >= i) {
            m21935j();
            stop();
        }
    }

    public void registerAnimationCallback(C1258a aVar) {
        if (aVar != null) {
            if (this.f23784o == null) {
                this.f23784o = new ArrayList();
            }
            this.f23784o.add(aVar);
        }
    }

    public void setAlpha(int i) {
        m21934i().setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        m21934i().setColorFilter(colorFilter);
    }

    public boolean setVisible(boolean z, boolean z2) {
        C9216j.m22087a(!this.f23777h, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.f23778i = z;
        if (!z) {
            m21938m();
        } else if (this.f23776g) {
            m21937l();
        }
        return super.setVisible(z, z2);
    }

    public void start() {
        this.f23776g = true;
        m21936k();
        if (this.f23778i) {
            m21937l();
        }
    }

    public void stop() {
        this.f23776g = false;
        m21938m();
    }

    public boolean unregisterAnimationCallback(C1258a aVar) {
        List<C1258a> list = this.f23784o;
        if (list == null || aVar == null) {
            return false;
        }
        return list.remove(aVar);
    }

    /* renamed from: a */
    public ByteBuffer mo24692a() {
        return this.f23774e.f23785a.mo24672b();
    }

    C9156c(C9157a aVar) {
        this.f23778i = true;
        this.f23780k = -1;
        C9216j.m22083a(aVar);
        this.f23774e = aVar;
    }
}
