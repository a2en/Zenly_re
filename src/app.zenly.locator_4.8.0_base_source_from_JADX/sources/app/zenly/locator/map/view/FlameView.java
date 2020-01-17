package app.zenly.locator.map.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Color;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Property;
import androidx.core.content.C0540a;
import app.zenly.locator.R;
import app.zenly.locator.core.util.C3238u;
import app.zenly.locator.map.view.opengl.C4398c;
import app.zenly.locator.map.view.opengl.GLView;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.Objects;

public final class FlameView extends GLView {

    /* renamed from: A */
    private static final FloatBuffer f11675A = ByteBuffer.allocateDirect(f11677z.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();

    /* renamed from: y */
    public static final Property<FlameView, Float> f11676y = new C4359a(Float.class, "appearProgression");

    /* renamed from: z */
    private static final float[] f11677z = {-1.0f, 1.0f, 0.0f, -1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, -1.0f, 0.0f};

    /* renamed from: h */
    private final float[] f11678h = new float[3];

    /* renamed from: i */
    private final float[] f11679i = new float[3];

    /* renamed from: j */
    private C4398c f11680j;

    /* renamed from: k */
    private int f11681k;

    /* renamed from: l */
    private int f11682l;

    /* renamed from: m */
    private int f11683m;

    /* renamed from: n */
    private int f11684n;

    /* renamed from: o */
    private int f11685o;

    /* renamed from: p */
    private int f11686p;

    /* renamed from: q */
    private int f11687q;

    /* renamed from: r */
    private long f11688r;

    /* renamed from: s */
    private float f11689s;

    /* renamed from: t */
    private float f11690t = 1.0f;

    /* renamed from: u */
    private float f11691u = 0.0f;

    /* renamed from: v */
    private Bitmap f11692v;

    /* renamed from: w */
    private Bitmap f11693w;

    /* renamed from: x */
    private boolean f11694x;

    /* renamed from: app.zenly.locator.map.view.FlameView$a */
    static class C4359a extends Property<FlameView, Float> {
        C4359a(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public void set(FlameView flameView, Float f) {
            flameView.setAppearProgression(f.floatValue());
        }

        /* renamed from: a */
        public Float get(FlameView flameView) {
            return Float.valueOf(flameView.getAppearProgression());
        }
    }

    static {
        f11675A.put(f11677z).position(0);
    }

    public FlameView(Context context) {
        super(context);
        m12951i();
    }

    /* renamed from: a */
    private void m12947a(float f, float f2, float f3) {
        GLES20.glUniform1f(this.f11681k, f);
        this.f11868e.mo11556b();
        GLES20.glUniform1f(this.f11682l, f2);
        this.f11868e.mo11556b();
        GLES20.glUniform1f(this.f11684n, f3);
        this.f11868e.mo11556b();
        int i = this.f11685o;
        float[] fArr = this.f11678h;
        GLES20.glUniform3f(i, fArr[0], fArr[1], fArr[2]);
        this.f11868e.mo11556b();
        int i2 = this.f11686p;
        float[] fArr2 = this.f11679i;
        GLES20.glUniform3f(i2, fArr2[0], fArr2[1], fArr2[2]);
        this.f11868e.mo11556b();
        if (this.f11687q == 0 || this.f11694x) {
            this.f11694x = false;
            Bitmap bitmap = this.f11693w;
            if (bitmap == null) {
                bitmap = this.f11692v;
            }
            m12949a(bitmap);
            GLES20.glActiveTexture(33984);
            this.f11868e.mo11556b();
            GLES20.glBindTexture(3553, this.f11687q);
            this.f11868e.mo11556b();
            GLES20.glUniform1i(this.f11683m, 0);
            this.f11868e.mo11556b();
        }
    }

    /* renamed from: h */
    private void m12950h() {
        int i = this.f11687q;
        if (i != 0) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
            this.f11687q = 0;
        }
    }

    /* renamed from: i */
    private void m12951i() {
        this.f11680j = new C4398c(getContext(), R.raw.shader_base_vertex, R.raw.shader_flame_fragment);
        this.f11688r = SystemClock.uptimeMillis();
        this.f11689s = C3238u.m10269a(0.0f, 100.0f);
        m12948a(C0540a.m2536a(getContext(), (int) R.color.yellow), this.f11678h);
        m12948a(C0540a.m2536a(getContext(), (int) R.color.orange), this.f11679i);
        this.f11692v = Bitmap.createBitmap(1, 1, Config.ARGB_8888);
        new Canvas(this.f11692v).drawColor(C0540a.m2536a(getContext(), (int) R.color.transparent));
    }

    /* renamed from: j */
    private void m12952j() {
        this.f11680j.mo11544a(this.f11868e);
        int a = this.f11680j.mo11542a("position");
        GLES20.glEnableVertexAttribArray(a);
        this.f11868e.mo11556b();
        this.f11681k = this.f11680j.mo11545b("time");
        this.f11684n = this.f11680j.mo11545b("spiralPercentage");
        int b = this.f11680j.mo11545b("resolution");
        this.f11682l = this.f11680j.mo11545b("appearProgression");
        this.f11683m = this.f11680j.mo11545b("imgParam");
        this.f11685o = this.f11680j.mo11545b("insideColor");
        this.f11686p = this.f11680j.mo11545b("outsideColor");
        GLES20.glVertexAttribPointer(a, 3, 5126, false, 0, f11675A);
        this.f11868e.mo11556b();
        GLES20.glUniform2f(b, (float) getWidth(), (float) getHeight());
        this.f11868e.mo11556b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo11419c() {
        this.f11680j.mo11543a();
        m12950h();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo11420d() {
        m12952j();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo11421e() {
        if (!this.f11680j.mo11546b()) {
            m12947a((((float) (SystemClock.uptimeMillis() - this.f11688r)) / 1000.0f) + this.f11689s, this.f11690t, this.f11691u);
            GLES20.glEnable(3042);
            GLES20.glBlendFunc(770, 771);
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glClear(16384);
            GLES20.glDrawArrays(4, 0, 6);
            GLES20.glDisable(3042);
        }
    }

    public float getAppearProgression() {
        return this.f11690t;
    }

    public void setAppearProgression(float f) {
        this.f11690t = f;
    }

    public void setAvatar(Bitmap bitmap) {
        if (!Objects.equals(this.f11693w, bitmap)) {
            this.f11693w = bitmap;
            this.f11694x = true;
        }
    }

    public void setInsideColor(int i) {
        m12948a(i, this.f11678h);
    }

    public void setOutsideColor(int i) {
        m12948a(i, this.f11679i);
    }

    public void setSpiralPercentage(float f) {
        this.f11691u = f;
    }

    public FlameView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m12951i();
    }

    public FlameView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m12951i();
    }

    /* renamed from: a */
    private void m12949a(Bitmap bitmap) {
        int[] iArr = new int[1];
        if (this.f11687q == 0) {
            GLES20.glGenTextures(1, iArr, 0);
            this.f11868e.mo11556b();
            this.f11687q = iArr[0];
        }
        int i = this.f11687q;
        if (i != 0) {
            GLES20.glBindTexture(3553, i);
            this.f11868e.mo11556b();
            GLES20.glTexParameteri(3553, 10241, 9728);
            this.f11868e.mo11556b();
            GLES20.glTexParameteri(3553, 10240, 9728);
            this.f11868e.mo11556b();
            GLUtils.texImage2D(3553, 0, bitmap, 0);
            this.f11868e.mo11556b();
        }
        if (this.f11687q == 0) {
            throw new RuntimeException("Error loading texture.");
        }
    }

    /* renamed from: a */
    private void m12948a(int i, float[] fArr) {
        fArr[0] = ((float) Color.red(i)) / 255.0f;
        fArr[1] = ((float) Color.green(i)) / 255.0f;
        fArr[2] = ((float) Color.blue(i)) / 255.0f;
    }
}
