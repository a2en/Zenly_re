package app.zenly.locator.core.p072ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Property;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.C0540a;
import app.zenly.locator.C3892m;
import app.zenly.locator.R;
import p250f.p251a.p252a.p253a.p254d.C7656b;

/* renamed from: app.zenly.locator.core.ui.view.CapsuleTextView */
public class CapsuleTextView extends AppCompatTextView {

    /* renamed from: h */
    public static final Property<CapsuleTextView, Integer> f8610h = new C3118a("paddingEnd");

    /* renamed from: e */
    private final Paint f8611e = new Paint(1);

    /* renamed from: f */
    private final RectF f8612f = new RectF();

    /* renamed from: g */
    private int f8613g;

    /* renamed from: app.zenly.locator.core.ui.view.CapsuleTextView$a */
    static class C3118a extends C7656b<CapsuleTextView> {
        C3118a(String str) {
            super(str);
        }

        /* renamed from: a */
        public Integer get(CapsuleTextView capsuleTextView) {
            return Integer.valueOf(capsuleTextView.getPaddingEnd());
        }

        /* renamed from: a */
        public void mo6445b(CapsuleTextView capsuleTextView, int i) {
            capsuleTextView.setPaddingRelative(capsuleTextView.getPaddingStart(), capsuleTextView.getPaddingTop(), i, capsuleTextView.getPaddingBottom());
        }
    }

    public CapsuleTextView(Context context) {
        super(context, null);
        m9788a(context, null, 0, 0);
    }

    /* renamed from: a */
    private void m9788a(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f8613g = context.getResources().getDimensionPixelSize(R.dimen.stroke_50);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3892m.CapsuleTextView, i, i2);
        setColor(obtainStyledAttributes.getColor(0, C0540a.m2536a(getContext(), (int) R.color.gray_light)));
        obtainStyledAttributes.recycle();
    }

    public int getColor() {
        return this.f8611e.getColor();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        int height = getHeight() / 2;
        this.f8612f.set(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
        RectF rectF = this.f8612f;
        int i = this.f8613g;
        rectF.inset((float) (i / 2), (float) (i / 2));
        this.f8611e.setStyle(Style.FILL_AND_STROKE);
        this.f8611e.setStrokeWidth((float) this.f8613g);
        float f = (float) height;
        canvas.drawRoundRect(this.f8612f, f, f, this.f8611e);
        super.onDraw(canvas);
    }

    public void setColor(int i) {
        setTextColor(i);
        if (i != this.f8611e.getColor()) {
            this.f8611e.setColor(i);
            invalidate();
        }
    }

    public void setColorResource(int i) {
        setColor(C0540a.m2536a(getContext(), i));
    }

    public CapsuleTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        m9788a(context, attributeSet, 0, 0);
    }

    public CapsuleTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m9788a(context, attributeSet, i, 0);
    }
}
