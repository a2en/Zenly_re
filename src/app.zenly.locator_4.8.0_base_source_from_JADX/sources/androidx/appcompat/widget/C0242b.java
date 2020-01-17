package androidx.appcompat.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;

/* renamed from: androidx.appcompat.widget.b */
class C0242b extends Drawable {

    /* renamed from: a */
    final ActionBarContainer f1113a;

    public C0242b(ActionBarContainer actionBarContainer) {
        this.f1113a = actionBarContainer;
    }

    public void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f1113a;
        if (actionBarContainer.f751l) {
            Drawable drawable = actionBarContainer.f750k;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f748i;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        ActionBarContainer actionBarContainer2 = this.f1113a;
        Drawable drawable3 = actionBarContainer2.f749j;
        if (drawable3 != null && actionBarContainer2.f752m) {
            drawable3.draw(canvas);
        }
    }

    public int getOpacity() {
        return 0;
    }

    public void getOutline(Outline outline) {
        ActionBarContainer actionBarContainer = this.f1113a;
        if (actionBarContainer.f751l) {
            Drawable drawable = actionBarContainer.f750k;
            if (drawable != null) {
                drawable.getOutline(outline);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f748i;
        if (drawable2 != null) {
            drawable2.getOutline(outline);
        }
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }
}
