package app.zenly.locator.username.idcard;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.internal.C12932j;

public abstract class OverlayView extends ConstraintLayout implements Animatable {

    /* renamed from: A */
    private boolean f15146A;

    /* renamed from: z */
    private boolean f15147z;

    public OverlayView(Context context, AttributeSet attributeSet, int i) {
        C12932j.m33818b(context, "context");
        super(context, attributeSet, i);
        setClipChildren(false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo2248a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo2256b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo13777c();

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f15146A && this.f15147z) {
            this.f15146A = false;
            mo2248a();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        this.f15146A = true;
        mo2256b();
        super.onDetachedFromWindow();
    }

    public void startAnimate() {
        if (!this.f15147z) {
            this.f15147z = true;
            mo2248a();
        }
    }

    public void stopAnimate() {
        if (this.f15147z) {
            this.f15147z = false;
            mo13777c();
        }
    }
}
