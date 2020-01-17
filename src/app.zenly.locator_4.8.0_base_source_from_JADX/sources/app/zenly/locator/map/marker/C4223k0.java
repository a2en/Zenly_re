package app.zenly.locator.map.marker;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import app.zenly.locator.map.marker.MarkerView;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p253a.p254d.C7657c;

/* renamed from: app.zenly.locator.map.marker.k0 */
public abstract class C4223k0<V extends MarkerView> extends C4178e0<V> {

    /* renamed from: A */
    private float f11331A = 1.0f;

    /* renamed from: B */
    private float f11332B;

    /* renamed from: C */
    private float f11333C;

    /* renamed from: D */
    private float f11334D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public float f11335E;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public float f11336F;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public float f11337G;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public ValueAnimator f11338H;

    /* renamed from: I */
    private C4225b f11339I;

    /* renamed from: J */
    private final AnimatorUpdateListener f11340J;

    /* renamed from: z */
    private float f11341z = 0.3f;

    /* renamed from: app.zenly.locator.map.marker.k0$a */
    public static final class C4224a {
        private C4224a() {
        }

        public /* synthetic */ C4224a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.locator.map.marker.k0$b */
    public enum C4225b {
        HIDDEN,
        NORMAL,
        SMALL
    }

    /* renamed from: app.zenly.locator.map.marker.k0$c */
    public static final class C4226c implements AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ C4223k0 f11346a;

        public C4226c(C4223k0 k0Var) {
            this.f11346a = k0Var;
        }

        public void onAnimationCancel(Animator animator) {
            C12932j.m33818b(animator, "animator");
        }

        public void onAnimationEnd(Animator animator) {
            C12932j.m33818b(animator, "animator");
            this.f11346a.f11338H = null;
        }

        public void onAnimationRepeat(Animator animator) {
            C12932j.m33818b(animator, "animator");
        }

        public void onAnimationStart(Animator animator) {
            C12932j.m33818b(animator, "animator");
        }
    }

    /* renamed from: app.zenly.locator.map.marker.k0$d */
    static final class C4227d implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C4223k0 f11347a;

        C4227d(C4223k0 k0Var) {
            this.f11347a = k0Var;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float f;
            C12932j.m33815a((Object) valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                float floatValue = ((Float) animatedValue).floatValue();
                C4223k0 k0Var = this.f11347a;
                if (floatValue < 1.0f) {
                    f = k0Var.f11335E + ((this.f11347a.f11336F - this.f11347a.f11335E) * floatValue);
                } else {
                    f = k0Var.f11336F;
                }
                k0Var.f11337G = f;
                MarkerView g = this.f11347a.mo11112g();
                if (g != null) {
                    g.setScale(this.f11347a.f11337G);
                    return;
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    static {
        new C4224a(null);
    }

    protected C4223k0(Context context, String str) {
        C12932j.m33818b(context, "context");
        C12932j.m33818b(str, "uuid");
        super(context, str);
        float f = this.f11331A;
        this.f11333C = f;
        this.f11334D = -1.0f;
        this.f11335E = f;
        this.f11336F = f;
        this.f11337G = f;
        this.f11339I = C4225b.NORMAL;
        this.f11340J = new C4227d(this);
    }

    /* renamed from: L */
    private final boolean mo11021L() {
        float f = this.f11332B * 0.3f;
        float p = mo11117p() * 0.4f;
        float f2 = this.f11332B;
        float a = C12973l.m33884a((f2 > 0.8f ? (1.0f - C12973l.m33892c((f2 - 0.8f) / 0.1f, 1.0f)) * (f + p) : f + p) + 0.29999995f, this.f11341z, this.f11331A);
        if (a == this.f11333C) {
            return false;
        }
        this.f11333C = a;
        return true;
    }

    /* renamed from: l */
    private final void mo11044l(boolean z) {
        float f;
        C4225b bVar = this.f11339I;
        if (bVar == C4225b.HIDDEN) {
            f = 0.0f;
        } else if (bVar == C4225b.SMALL) {
            f = this.f11341z;
        } else if (Float.compare(this.f11334D, -1.0f) == 0) {
            f = this.f11333C;
        } else {
            f = this.f11334D;
        }
        float f2 = (this.f11338H != null ? this.f11336F : this.f11337G) - f;
        if (Math.abs(f2) >= 0.01f) {
            if (this.f11338H == null || z) {
                ValueAnimator valueAnimator = this.f11338H;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                this.f11338H = null;
                if (!z || Math.abs(f2) <= 0.1f) {
                    this.f11335E = f;
                    this.f11337G = f;
                    this.f11336F = f;
                    MarkerView g = mo11112g();
                    if (g != null) {
                        g.setScale(this.f11337G);
                    }
                } else {
                    this.f11335E = this.f11337G;
                    this.f11336F = f;
                    if (this.f11338H == null) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                        ofFloat.setDuration(300);
                        ofFloat.setInterpolator(C7657c.m18649e());
                        ofFloat.addUpdateListener(this.f11340J);
                        ofFloat.addListener(new C4226c(this));
                        this.f11338H = ofFloat;
                    }
                    ValueAnimator valueAnimator2 = this.f11338H;
                    if (valueAnimator2 != null) {
                        valueAnimator2.start();
                    }
                }
            } else {
                this.f11336F = f;
            }
        }
    }

    /* renamed from: J */
    public final float mo11219J() {
        return this.f11331A;
    }

    /* renamed from: K */
    public final float mo11220K() {
        return this.f11341z;
    }

    /* renamed from: u */
    public boolean mo11120u() {
        return super.mo11120u() && this.f11339I != C4225b.HIDDEN;
    }

    /* renamed from: a */
    public void mo11033a() {
        MarkerView g = mo11112g();
        if (g != null) {
            g.setScale(this.f11337G);
        }
    }

    /* renamed from: a */
    public void mo11036a(C4225b bVar) {
        C12932j.m33818b(bVar, "displayMode");
        if (this.f11339I != bVar) {
            this.f11339I = bVar;
            mo11044l(true);
        }
    }

    /* renamed from: a */
    public void mo11034a(float f, float f2) {
        super.mo11034a(f, f2);
        this.f11332B = f;
        if (mo11021L() && Float.compare(this.f11334D, -1.0f) == 0 && this.f11339I == C4225b.NORMAL) {
            mo11044l(false);
        }
    }

    /* renamed from: a */
    public final void mo11221a(float f, boolean z) {
        this.f11334D = f;
        mo11021L();
        mo11044l(z);
    }
}
