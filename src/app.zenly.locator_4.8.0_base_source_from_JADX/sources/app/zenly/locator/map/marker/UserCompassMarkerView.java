package app.zenly.locator.map.marker;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import app.zenly.locator.R;
import p250f.p251a.p252a.p253a.p254d.C7657c;

public class UserCompassMarkerView extends MarkerView {

    /* renamed from: h */
    private ValueAnimator f11069h;

    /* renamed from: i */
    private Float f11070i;

    /* renamed from: j */
    private int f11071j;

    public UserCompassMarkerView(Context context) {
        super(context);
        m12185d();
    }

    /* renamed from: d */
    private void m12185d() {
        View.inflate(getContext(), R.layout.map_view_compass_marker, this);
        this.f11069h = new ValueAnimator();
        this.f11069h.addUpdateListener(new C4266x(this));
        this.f11069h.setInterpolator(C7657c.m18649e());
    }

    /* renamed from: a */
    public /* synthetic */ void mo10992a(ValueAnimator valueAnimator) {
        this.f11070i = Float.valueOf(((Float) valueAnimator.getAnimatedValue()).floatValue());
        setRotation((this.f11070i.floatValue() - ((float) this.f11071j)) % 360.0f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo10831b() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo10834c() {
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        setPivotX((float) (i / 2));
        setPivotY(0.0f);
    }

    public void setBearing(int i) {
        this.f11071j = i;
        Float f = this.f11070i;
        if (f != null) {
            setRotation((f.floatValue() - ((float) this.f11071j)) % 360.0f);
        }
    }

    public void setHeading(int i) {
        float f = (float) ((i + 180) % 360);
        Float f2 = this.f11070i;
        if (f2 == null) {
            this.f11070i = Float.valueOf(0.0f);
        } else {
            this.f11070i = Float.valueOf((f2.floatValue() + 360.0f) % 360.0f);
        }
        if (mo10979a()) {
            this.f11069h.cancel();
            if (Math.abs(f - this.f11070i.floatValue()) < 180.0f) {
                this.f11069h.setFloatValues(new float[]{this.f11070i.floatValue(), f});
            } else if (f < this.f11070i.floatValue()) {
                this.f11069h.setFloatValues(new float[]{this.f11070i.floatValue(), f + 360.0f});
            } else {
                this.f11069h.setFloatValues(new float[]{this.f11070i.floatValue(), f - 360.0f});
            }
            this.f11069h.setDuration(250);
            this.f11069h.start();
            return;
        }
        this.f11070i = Float.valueOf((((float) i) + 180.0f) % 360.0f);
        setRotation((this.f11070i.floatValue() - ((float) this.f11071j)) % 360.0f);
    }
}
