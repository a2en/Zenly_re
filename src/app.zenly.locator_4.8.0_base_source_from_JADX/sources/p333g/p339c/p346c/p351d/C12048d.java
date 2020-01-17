package p333g.p339c.p346c.p351d;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import com.facebook.drawee.drawable.C9614f;
import com.facebook.drawee.drawable.VisibilityAwareDrawable;
import com.facebook.drawee.drawable.VisibilityCallback;

/* renamed from: g.c.c.d.d */
public class C12048d extends C9614f implements VisibilityAwareDrawable {

    /* renamed from: h */
    Drawable f31426h = null;

    /* renamed from: i */
    private VisibilityCallback f31427i;

    public C12048d(Drawable drawable) {
        super(drawable);
    }

    /* renamed from: c */
    public void mo35747c(Drawable drawable) {
        this.f31426h = drawable;
        invalidateSelf();
    }

    @SuppressLint({"WrongCall"})
    public void draw(Canvas canvas) {
        if (isVisible()) {
            VisibilityCallback visibilityCallback = this.f31427i;
            if (visibilityCallback != null) {
                visibilityCallback.onDraw();
            }
            super.draw(canvas);
            Drawable drawable = this.f31426h;
            if (drawable != null) {
                drawable.setBounds(getBounds());
                this.f31426h.draw(canvas);
            }
        }
    }

    public int getIntrinsicHeight() {
        return -1;
    }

    public int getIntrinsicWidth() {
        return -1;
    }

    public void setVisibilityCallback(VisibilityCallback visibilityCallback) {
        this.f31427i = visibilityCallback;
    }

    public boolean setVisible(boolean z, boolean z2) {
        VisibilityCallback visibilityCallback = this.f31427i;
        if (visibilityCallback != null) {
            visibilityCallback.onVisibilityChange(z);
        }
        return super.setVisible(z, z2);
    }
}
