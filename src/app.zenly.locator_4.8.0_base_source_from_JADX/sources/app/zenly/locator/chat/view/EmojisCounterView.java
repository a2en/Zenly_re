package app.zenly.locator.chat.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewPropertyAnimator;
import androidx.core.content.C0540a;
import app.zenly.android.feature.polenta.widget.OutlinedTextView;
import app.zenly.locator.R;
import app.zenly.locator.core.util.C3200e0;
import app.zenly.locator.core.util.C3238u;
import p250f.p251a.p252a.p253a.p254d.C7657c;
import p250f.p251a.p252a.p253a.p256f.p257a.C7674a;
import p250f.p251a.p252a.p263b.p264a.p269h.p270a.C7706a;

public class EmojisCounterView extends OutlinedTextView {

    /* renamed from: q */
    private int f7129q = 8;

    /* renamed from: r */
    private C2356b f7130r = null;

    /* renamed from: s */
    private int f7131s = 0;

    /* renamed from: t */
    private Runnable f7132t = new C2367h(this);

    /* renamed from: app.zenly.locator.chat.view.EmojisCounterView$a */
    public enum C2355a {
        OUTBOUND,
        INBOUND
    }

    /* renamed from: app.zenly.locator.chat.view.EmojisCounterView$b */
    static class C2356b {

        /* renamed from: a */
        C2355a f7136a;

        /* renamed from: b */
        int f7137b;

        C2356b(C2355a aVar, int i) {
            this.f7136a = aVar;
            this.f7137b = i;
        }
    }

    public EmojisCounterView(Context context) {
        super(context);
    }

    /* renamed from: a */
    public void mo8279a(C2355a aVar, int i) {
        boolean z = true;
        if (i != 1) {
            boolean z2 = aVar == C2355a.INBOUND;
            C2356b bVar = this.f7130r;
            if (bVar != null) {
                if (!(aVar != bVar.f7136a || i == 2 || aVar == C2355a.INBOUND)) {
                    z = false;
                }
                if (aVar != this.f7130r.f7136a) {
                    m8398b(aVar);
                }
                animate().cancel();
                this.f7130r = null;
            } else {
                m8398b(aVar);
            }
            this.f7130r = new C2356b(aVar, i);
            setText(C7706a.m18751a(getContext(), i));
            if (z) {
                setVisibility(0);
                setAlpha(0.0f);
                setRotation(0.0f);
                setTranslationX(0.0f);
                setTranslationY((float) m8395a(aVar));
                float f = 0.01f;
                setScaleX(z2 ? 0.01f : 1.0f);
                if (!z2) {
                    f = 1.0f;
                }
                setScaleY(f);
                if (z2) {
                    m8399c(150, new C2365f(this));
                } else {
                    m8396a(150, (Runnable) new C2361b(this));
                }
            } else {
                m8397b(60, new C2363d(this));
            }
        }
    }

    /* renamed from: b */
    public /* synthetic */ void mo8280b() {
        m8400d(1200, this.f7132t);
    }

    /* renamed from: c */
    public /* synthetic */ void mo8281c() {
        m8400d(150, this.f7132t);
    }

    /* renamed from: d */
    public /* synthetic */ void mo8282d() {
        m8400d(150, this.f7132t);
    }

    /* renamed from: e */
    public /* synthetic */ void mo8283e() {
        m8401e(500, new C2362c(this));
    }

    /* renamed from: f */
    public /* synthetic */ void mo8284f() {
        m8401e(150, new C2366g(this));
    }

    /* renamed from: g */
    public /* synthetic */ void mo8285g() {
        m8401e(150, new C2364e(this));
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        setPivotX((float) (i / 2));
        setPivotY((float) (i2 / 2));
    }

    public void setColor(int i) {
        this.f7131s = i;
    }

    public void setEndVisibility(int i) {
        this.f7129q = i;
    }

    /* renamed from: b */
    private void m8397b(long j, Runnable runnable) {
        float a = m8394a(this.f7130r.f7137b);
        float a2 = C3238u.m10269a(-10.0f, 10.0f);
        float a3 = (float) C3200e0.m10183a(getContext(), 6);
        double a4 = (double) C3238u.m10269a(0.0f, 6.2831855f);
        float cos = ((float) Math.cos(a4)) * a3;
        float sin = ((float) Math.sin(a4)) * a3;
        float f = 1.3f * a;
        ViewPropertyAnimator translationY = animate().setDuration(j / 2).setInterpolator(C7657c.m18645c()).alpha(1.0f).scaleX(f).scaleY(f).rotation(getRotation() - ((getRotation() - a2) / 2.0f)).translationX(getTranslationX() - ((getTranslationX() - cos) / 2.0f)).translationY(getTranslationY() - ((getTranslationY() - sin) / 2.0f));
        C2360a aVar = new C2360a(this, a, a2, cos, sin, runnable);
        translationY.withEndAction(aVar);
    }

    /* renamed from: c */
    private void m8399c(long j, Runnable runnable) {
        float a = m8394a(this.f7130r.f7137b);
        animate().setDuration(j).setInterpolator(C7657c.m18650f()).alpha(1.0f).rotation(0.0f).scaleX(a).scaleY(a).translationX(C3238u.m10269a(-40.0f, 40.0f)).translationY(0.0f).withEndAction(runnable);
    }

    /* renamed from: d */
    private void m8400d(long j, Runnable runnable) {
        animate().setDuration(j).setInterpolator(C7657c.m18643b()).alpha(0.0f).rotation(C3238u.m10269a(-10.0f, 10.0f)).translationX(C3238u.m10269a(-40.0f, 40.0f)).translationY(40.0f).withEndAction(runnable);
    }

    /* renamed from: e */
    private void m8401e(long j, Runnable runnable) {
        float a = m8394a(this.f7130r.f7137b);
        animate().setDuration(j).setInterpolator(C7657c.m18649e()).alpha(1.0f).scaleX(a).scaleY(a).translationY(0.0f).withEndAction(runnable);
    }

    public EmojisCounterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public EmojisCounterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: b */
    private void m8398b(C2355a aVar) {
        if (C7674a.m18692a(this.f7131s)) {
            setTextColor(C0540a.m2536a(getContext(), this.f7131s));
            setStrokeColor(C0540a.m2536a(getContext(), (int) R.color.white));
        } else if (aVar == C2355a.INBOUND) {
            setTextColor(C0540a.m2536a(getContext(), (int) R.color.blue_light));
            setStrokeColor(C0540a.m2536a(getContext(), (int) R.color.blue_black));
        } else {
            setTextColor(C0540a.m2536a(getContext(), (int) R.color.pink));
            setStrokeColor(C0540a.m2536a(getContext(), (int) R.color.blue_black));
        }
    }

    /* renamed from: a */
    private void m8396a(long j, Runnable runnable) {
        float a = m8394a(this.f7130r.f7137b);
        animate().setDuration(j).setInterpolator(C7657c.m18650f()).alpha(1.0f).rotation(0.0f).scaleX(a).scaleY(a).translationY(0.0f).withEndAction(runnable);
    }

    /* renamed from: a */
    public /* synthetic */ void mo8278a(float f, float f2, float f3, float f4, Runnable runnable) {
        animate().setInterpolator(C7657c.m18641a()).scaleX(f).scaleY(f).rotation(f2).translationX(f3).translationY(f4).withEndAction(runnable);
    }

    /* renamed from: a */
    public /* synthetic */ void mo8277a() {
        this.f7130r = null;
        setVisibility(this.f7129q);
    }

    /* renamed from: a */
    private float m8394a(int i) {
        return ((((float) Math.min(100, i)) / 100.0f) * 1.0f) + 1.0f;
    }

    /* renamed from: a */
    private int m8395a(C2355a aVar) {
        return C3200e0.m10183a(getContext(), aVar == C2355a.INBOUND ? 40 : -10);
    }
}
