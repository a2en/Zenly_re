package app.zenly.locator.map.marker;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import app.zenly.locator.R;
import app.zenly.locator.p143s.p146j.C5432b;
import p250f.p251a.p252a.p253a.p254d.C7657c;

public class UserCollapsedMarkerView extends MarkerView {
    /* access modifiers changed from: private */

    /* renamed from: h */
    public FrameLayout f11063h;

    /* renamed from: i */
    private View f11064i;

    /* renamed from: j */
    private View f11065j;

    /* renamed from: k */
    private ValueAnimator f11066k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public boolean f11067l;

    /* renamed from: app.zenly.locator.map.marker.UserCollapsedMarkerView$a */
    class C4160a extends C5432b {
        C4160a() {
        }

        /* renamed from: a */
        public void mo7336a(Animator animator, boolean z) {
            if (UserCollapsedMarkerView.this.f11067l) {
                UserCollapsedMarkerView.this.m12178f();
                UserCollapsedMarkerView.this.f11063h.setVisibility(4);
            }
        }
    }

    public UserCollapsedMarkerView(Context context) {
        super(context);
        m12177e();
    }

    /* renamed from: e */
    private void m12177e() {
        View.inflate(getContext(), R.layout.map_view_user_collapsed_marker, this);
        this.f11063h = (FrameLayout) findViewById(R.id.container);
        this.f11064i = findViewById(R.id.pulse);
        this.f11065j = findViewById(R.id.blue_dot);
        this.f11064i.setScaleX(0.18f);
        this.f11064i.setScaleY(0.18f);
        this.f11064i.setAlpha(0.9f);
        this.f11066k = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f, 0.0f});
        this.f11066k.setDuration(2500);
        this.f11066k.setRepeatCount(-1);
        this.f11066k.setInterpolator(C7657c.m18644b(0.8f));
        this.f11066k.addUpdateListener(new C4265w(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m12178f() {
        if (this.f11066k.isStarted()) {
            this.f11066k.cancel();
            this.f11066k.setFloatValues(new float[]{0.0f, 1.0f, 0.0f});
            this.f11064i.setScaleX(0.18f);
            this.f11064i.setScaleY(0.18f);
            this.f11064i.setAlpha(0.9f);
        }
    }

    /* renamed from: d */
    public void mo10990d() {
        if (!this.f11066k.isStarted()) {
            this.f11066k.start();
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        setPivotX((float) (i / 2));
        setPivotY((float) (i2 / 2));
    }

    /* renamed from: a */
    public /* synthetic */ void mo10988a(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (valueAnimator.getAnimatedFraction() > 0.5f) {
            float f = 1.0f - floatValue;
            float f2 = (0.82f * f) + 0.18f;
            this.f11064i.setScaleX(f2);
            this.f11064i.setScaleY(f2);
            this.f11064i.setAlpha(0.9f - (f * 0.9f));
        }
        float f3 = (floatValue * 0.25f) + 0.75f;
        this.f11065j.setScaleX(f3);
        this.f11065j.setScaleY(f3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo10831b() {
        if (!this.f11067l) {
            mo10990d();
        }
    }

    /* renamed from: c */
    public void mo10834c() {
        m12178f();
    }

    /* renamed from: a */
    public void mo10989a(boolean z, boolean z2) {
        if (z != this.f11067l) {
            this.f11067l = z;
            this.f11063h.animate().cancel();
            if (!z) {
                this.f11063h.setVisibility(0);
                if (mo10979a()) {
                    mo10990d();
                }
                if (getVisibility() == 8 || !z2) {
                    this.f11063h.setScaleX(1.0f);
                    this.f11063h.setScaleY(1.0f);
                } else {
                    this.f11063h.animate().setDuration(200).scaleX(1.0f).scaleY(1.0f).setListener(null);
                }
            } else if (getVisibility() == 8 || !z2) {
                this.f11063h.setVisibility(4);
                this.f11063h.setScaleX(0.0f);
                this.f11063h.setScaleY(0.0f);
            } else {
                this.f11063h.animate().setDuration(200).scaleX(0.0f).scaleY(0.0f).setListener(new C4160a());
            }
        }
    }
}
