package com.facebook.fresco.animation.backend;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.facebook.fresco.animation.backend.AnimationBackend;

/* renamed from: com.facebook.fresco.animation.backend.a */
public class C9628a<T extends AnimationBackend> implements AnimationBackend {

    /* renamed from: a */
    private T f25098a;

    public C9628a(T t) {
        this.f25098a = t;
    }

    public void clear() {
        T t = this.f25098a;
        if (t != null) {
            t.clear();
        }
    }

    public boolean drawFrame(Drawable drawable, Canvas canvas, int i) {
        T t = this.f25098a;
        return t != null && t.drawFrame(drawable, canvas, i);
    }

    public int getFrameCount() {
        T t = this.f25098a;
        if (t == null) {
            return 0;
        }
        return t.getFrameCount();
    }

    public int getFrameDurationMs(int i) {
        T t = this.f25098a;
        if (t == null) {
            return 0;
        }
        return t.getFrameDurationMs(i);
    }

    public int getIntrinsicHeight() {
        T t = this.f25098a;
        if (t == null) {
            return -1;
        }
        return t.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        T t = this.f25098a;
        if (t == null) {
            return -1;
        }
        return t.getIntrinsicWidth();
    }

    public int getLoopCount() {
        T t = this.f25098a;
        if (t == null) {
            return 0;
        }
        return t.getLoopCount();
    }

    public int getSizeInBytes() {
        T t = this.f25098a;
        if (t == null) {
            return 0;
        }
        return t.getSizeInBytes();
    }

    public void setAlpha(int i) {
        T t = this.f25098a;
        if (t != null) {
            t.setAlpha(i);
        }
    }

    public void setBounds(Rect rect) {
        T t = this.f25098a;
        if (t != null) {
            t.setBounds(rect);
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        T t = this.f25098a;
        if (t != null) {
            t.setColorFilter(colorFilter);
        }
    }
}
