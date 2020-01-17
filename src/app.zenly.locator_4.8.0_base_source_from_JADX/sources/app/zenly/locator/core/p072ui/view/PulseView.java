package app.zenly.locator.core.p072ui.view;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import androidx.core.content.C0540a;
import app.zenly.locator.R;
import app.zenly.locator.p143s.p151o.C5465a;
import p250f.p251a.p252a.p253a.p254d.C7655a;
import p250f.p251a.p252a.p253a.p254d.C7657c;

/* renamed from: app.zenly.locator.core.ui.view.PulseView */
public class PulseView extends View {

    /* renamed from: l */
    private static final Property<PulseView, Float> f8654l = new C3130a("color");

    /* renamed from: e */
    private final ObjectAnimator f8655e;

    /* renamed from: f */
    private final Paint f8656f;

    /* renamed from: g */
    private final int f8657g;

    /* renamed from: h */
    private final int f8658h;

    /* renamed from: i */
    private float f8659i;

    /* renamed from: j */
    private float f8660j;

    /* renamed from: k */
    private float f8661k;

    /* renamed from: app.zenly.locator.core.ui.view.PulseView$a */
    static class C3130a extends C7655a<PulseView> {
        C3130a(String str) {
            super(str);
        }

        /* renamed from: a */
        public Float get(PulseView pulseView) {
            return Float.valueOf(pulseView.getRadius());
        }

        /* renamed from: a */
        public void mo6441b(PulseView pulseView, float f) {
            pulseView.setRadius(f);
        }
    }

    public PulseView(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: private */
    public float getRadius() {
        return this.f8661k;
    }

    /* access modifiers changed from: private */
    public void setRadius(float f) {
        if (this.f8661k != f) {
            this.f8661k = f;
            invalidate();
        }
    }

    /* renamed from: b */
    public void mo9425b() {
        this.f8655e.cancel();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        this.f8656f.setColor(this.f8658h);
        float f = this.f8660j;
        canvas.drawCircle(f, f, this.f8661k, this.f8656f);
        this.f8656f.setColor(this.f8657g);
        float f2 = this.f8660j;
        canvas.drawCircle(f2, f2, this.f8659i, this.f8656f);
        super.onDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        float min = ((float) Math.min(i, i2)) / 2.0f;
        float f = min / 1.5f;
        this.f8661k = f;
        this.f8659i = f;
        this.f8660j = min;
        this.f8655e.setFloatValues(new float[]{this.f8659i, this.f8660j});
    }

    public PulseView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PulseView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f8656f = new Paint();
        this.f8657g = C0540a.m2536a(getContext(), (int) R.color.green);
        this.f8658h = C5465a.m15551a(this.f8657g, 0.5f);
        this.f8655e = ObjectAnimator.ofFloat(this, f8654l, new float[]{0.0f});
        this.f8655e.setRepeatCount(-1);
        this.f8655e.setRepeatMode(2);
        this.f8655e.setDuration(1000);
        this.f8655e.setInterpolator(C7657c.m18642a(1.4f));
    }

    /* renamed from: a */
    public void mo9424a() {
        this.f8655e.start();
    }
}
