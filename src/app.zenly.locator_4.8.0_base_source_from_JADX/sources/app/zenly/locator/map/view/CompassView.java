package app.zenly.locator.map.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.util.AttributeSet;
import android.view.View;

public class CompassView extends View {

    /* renamed from: e */
    private final Paint f11671e;

    /* renamed from: f */
    private final Shader f11672f;

    /* renamed from: g */
    private final Matrix f11673g;

    /* renamed from: h */
    private final Path f11674h;

    public CompassView(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        int width = getWidth() / 2;
        this.f11674h.reset();
        float f = (float) width;
        this.f11674h.moveTo(f, 0.0f);
        this.f11674h.lineTo((float) (width * 2), (float) getHeight());
        this.f11674h.lineTo(0.0f, (float) getHeight());
        this.f11674h.lineTo(f, 0.0f);
        this.f11674h.close();
        canvas.drawPath(this.f11674h, this.f11671e);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f11673g.setScale(1.0f, (float) i2);
        this.f11672f.setLocalMatrix(this.f11673g);
    }

    public CompassView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CompassView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f11671e = new Paint();
        this.f11673g = new Matrix();
        this.f11674h = new Path();
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, Color.argb(20, 0, 0, 0), Color.argb(0, 0, 0, 0), TileMode.CLAMP);
        this.f11672f = linearGradient;
        this.f11671e.setShader(this.f11672f);
    }
}
