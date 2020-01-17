package app.zenly.locator.username.idcard;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.util.AttributeSet;
import android.view.View;
import kotlin.jvm.internal.C12932j;

public final class AmbienceView extends View {

    /* renamed from: e */
    private final GradientDrawable f15050e;

    /* renamed from: f */
    private int[] f15051f;

    public AmbienceView(Context context) {
        this(context, null, 0, 6, null);
    }

    public AmbienceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public AmbienceView(Context context, AttributeSet attributeSet, int i) {
        C12932j.m33818b(context, "context");
        super(context, attributeSet, i);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setOrientation(Orientation.TL_BR);
        this.f15050e = gradientDrawable;
        this.f15051f = new int[]{-65536, -16776961};
    }

    public final int[] getColors() {
        return this.f15051f;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        C12932j.m33818b(canvas, "canvas");
        super.onDraw(canvas);
        this.f15050e.draw(canvas);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f15050e.setBounds(0, 0, i, i2);
    }

    public final void setColors(int[] iArr) {
        C12932j.m33818b(iArr, "value");
        this.f15051f = iArr;
        this.f15050e.setColors(iArr);
        invalidate();
    }

    public /* synthetic */ AmbienceView(Context context, AttributeSet attributeSet, int i, int i2, C12928f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
