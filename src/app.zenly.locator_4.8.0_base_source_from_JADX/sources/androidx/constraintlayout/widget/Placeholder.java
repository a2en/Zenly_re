package androidx.constraintlayout.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout.LayoutParams;

public class Placeholder extends View {

    /* renamed from: e */
    private int f2184e;

    /* renamed from: f */
    private View f2185f;

    /* renamed from: g */
    private int f2186g;

    /* renamed from: a */
    public void mo2743a(ConstraintLayout constraintLayout) {
        if (this.f2185f != null) {
            LayoutParams layoutParams = (LayoutParams) getLayoutParams();
            LayoutParams layoutParams2 = (LayoutParams) this.f2185f.getLayoutParams();
            layoutParams2.f2151m0.mo2608t(0);
            layoutParams.f2151m0.mo2611u(layoutParams2.f2151m0.mo2525A());
            layoutParams.f2151m0.mo2594m(layoutParams2.f2151m0.mo2589k());
            layoutParams2.f2151m0.mo2608t(8);
        }
    }

    /* renamed from: b */
    public void mo2744b(ConstraintLayout constraintLayout) {
        if (this.f2184e == -1 && !isInEditMode()) {
            setVisibility(this.f2186g);
        }
        this.f2185f = constraintLayout.findViewById(this.f2184e);
        View view = this.f2185f;
        if (view != null) {
            ((LayoutParams) view.getLayoutParams()).f2127a0 = true;
            this.f2185f.setVisibility(0);
            setVisibility(0);
        }
    }

    public View getContent() {
        return this.f2185f;
    }

    public int getEmptyVisibility() {
        return this.f2186g;
    }

    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize((float) rect.height());
            int height = rect.height();
            int width = rect.width();
            paint.setTextAlign(Align.LEFT);
            String str = "?";
            paint.getTextBounds(str, 0, 1, rect);
            canvas.drawText(str, ((((float) width) / 2.0f) - (((float) rect.width()) / 2.0f)) - ((float) rect.left), ((((float) height) / 2.0f) + (((float) rect.height()) / 2.0f)) - ((float) rect.bottom), paint);
        }
    }

    public void setContentId(int i) {
        if (this.f2184e != i) {
            View view = this.f2185f;
            if (view != null) {
                view.setVisibility(0);
                ((LayoutParams) this.f2185f.getLayoutParams()).f2127a0 = false;
                this.f2185f = null;
            }
            this.f2184e = i;
            if (i != -1) {
                View findViewById = ((View) getParent()).findViewById(i);
                if (findViewById != null) {
                    findViewById.setVisibility(8);
                }
            }
        }
    }

    public void setEmptyVisibility(int i) {
        this.f2186g = i;
    }
}
