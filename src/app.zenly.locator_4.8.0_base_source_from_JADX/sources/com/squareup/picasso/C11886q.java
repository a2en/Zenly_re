package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.SystemClock;
import android.widget.ImageView;
import com.squareup.picasso.Picasso.C11847d;

/* renamed from: com.squareup.picasso.q */
final class C11886q extends BitmapDrawable {

    /* renamed from: h */
    private static final Paint f30798h = new Paint();

    /* renamed from: a */
    private final boolean f30799a;

    /* renamed from: b */
    private final float f30800b;

    /* renamed from: c */
    private final C11847d f30801c;

    /* renamed from: d */
    Drawable f30802d;

    /* renamed from: e */
    long f30803e;

    /* renamed from: f */
    boolean f30804f;

    /* renamed from: g */
    int f30805g = 255;

    C11886q(Context context, Bitmap bitmap, Drawable drawable, C11847d dVar, boolean z, boolean z2) {
        super(context.getResources(), bitmap);
        this.f30799a = z2;
        this.f30800b = context.getResources().getDisplayMetrics().density;
        this.f30801c = dVar;
        if (dVar != C11847d.MEMORY && !z) {
            this.f30802d = drawable;
            this.f30804f = true;
            this.f30803e = SystemClock.uptimeMillis();
        }
    }

    /* renamed from: a */
    static void m31215a(ImageView imageView, Context context, Bitmap bitmap, C11847d dVar, boolean z, boolean z2) {
        Drawable drawable = imageView.getDrawable();
        if (drawable instanceof AnimationDrawable) {
            ((AnimationDrawable) drawable).stop();
        }
        C11886q qVar = new C11886q(context, bitmap, drawable, dVar, z, z2);
        imageView.setImageDrawable(qVar);
    }

    public void draw(Canvas canvas) {
        if (!this.f30804f) {
            super.draw(canvas);
        } else {
            float uptimeMillis = ((float) (SystemClock.uptimeMillis() - this.f30803e)) / 200.0f;
            if (uptimeMillis >= 1.0f) {
                this.f30804f = false;
                this.f30802d = null;
                super.draw(canvas);
            } else {
                Drawable drawable = this.f30802d;
                if (drawable != null) {
                    drawable.draw(canvas);
                }
                super.setAlpha((int) (((float) this.f30805g) * uptimeMillis));
                super.draw(canvas);
                super.setAlpha(this.f30805g);
                if (VERSION.SDK_INT <= 10) {
                    invalidateSelf();
                }
            }
        }
        if (this.f30799a) {
            m31214a(canvas);
        }
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f30802d;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        super.onBoundsChange(rect);
    }

    public void setAlpha(int i) {
        this.f30805g = i;
        Drawable drawable = this.f30802d;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
        super.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f30802d;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        super.setColorFilter(colorFilter);
    }

    /* renamed from: a */
    static void m31216a(ImageView imageView, Drawable drawable) {
        imageView.setImageDrawable(drawable);
        if (imageView.getDrawable() instanceof AnimationDrawable) {
            ((AnimationDrawable) imageView.getDrawable()).start();
        }
    }

    /* renamed from: a */
    private void m31214a(Canvas canvas) {
        f30798h.setColor(-1);
        canvas.drawPath(m31213a(new Point(0, 0), (int) (this.f30800b * 16.0f)), f30798h);
        f30798h.setColor(this.f30801c.f30691e);
        canvas.drawPath(m31213a(new Point(0, 0), (int) (this.f30800b * 15.0f)), f30798h);
    }

    /* renamed from: a */
    private static Path m31213a(Point point, int i) {
        Point point2 = new Point(point.x + i, point.y);
        Point point3 = new Point(point.x, point.y + i);
        Path path = new Path();
        path.moveTo((float) point.x, (float) point.y);
        path.lineTo((float) point2.x, (float) point2.y);
        path.lineTo((float) point3.x, (float) point3.y);
        return path;
    }
}
