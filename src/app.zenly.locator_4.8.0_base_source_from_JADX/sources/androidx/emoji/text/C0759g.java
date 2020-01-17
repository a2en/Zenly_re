package androidx.emoji.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.text.TextPaint;

/* renamed from: androidx.emoji.text.g */
public final class C0759g extends C0745c {

    /* renamed from: i */
    private static Paint f3111i;

    public C0759g(C0740a aVar) {
        super(aVar);
    }

    /* renamed from: c */
    private static Paint m3530c() {
        if (f3111i == null) {
            f3111i = new TextPaint();
            f3111i.setColor(EmojiCompat.m3433e().mo3685a());
            f3111i.setStyle(Style.FILL);
        }
        return f3111i;
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        if (EmojiCompat.m3433e().mo3695c()) {
            canvas.drawRect(f, (float) i3, f + ((float) mo3729b()), (float) i5, m3530c());
        }
        mo3728a().mo3712a(canvas, f, (float) i4, paint);
    }
}
