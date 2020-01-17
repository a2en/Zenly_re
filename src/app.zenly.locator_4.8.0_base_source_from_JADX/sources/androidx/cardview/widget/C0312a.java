package androidx.cardview.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* renamed from: androidx.cardview.widget.a */
class C0312a extends C0315c {

    /* renamed from: androidx.cardview.widget.a$a */
    class C0313a implements C0321a {
        C0313a(C0312a aVar) {
        }

        /* renamed from: a */
        public void mo2186a(Canvas canvas, RectF rectF, float f, Paint paint) {
            canvas.drawRoundRect(rectF, f, f, paint);
        }
    }

    C0312a() {
    }

    /* renamed from: a */
    public void mo2185a() {
        C0320g.f1380r = new C0313a(this);
    }
}
