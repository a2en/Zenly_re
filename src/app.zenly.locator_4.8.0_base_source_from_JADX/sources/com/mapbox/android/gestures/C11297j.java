package com.mapbox.android.gestures;

import android.graphics.PointF;
import android.view.MotionEvent;

/* renamed from: com.mapbox.android.gestures.j */
public class C11297j {
    /* renamed from: a */
    public static PointF m29095a(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        float f = 0.0f;
        float f2 = 0.0f;
        for (int i = 0; i < pointerCount; i++) {
            f += motionEvent.getX(i);
            f2 += motionEvent.getY(i);
        }
        float f3 = (float) pointerCount;
        return new PointF(f / f3, f2 / f3);
    }

    /* renamed from: b */
    public static float m29096b(MotionEvent motionEvent, int i) {
        float rawY = motionEvent.getRawY() - motionEvent.getY();
        if (i < motionEvent.getPointerCount()) {
            return motionEvent.getY(i) + rawY;
        }
        return 0.0f;
    }

    /* renamed from: a */
    public static float m29094a(MotionEvent motionEvent, int i) {
        float rawX = motionEvent.getRawX() - motionEvent.getX();
        if (i < motionEvent.getPointerCount()) {
            return motionEvent.getX(i) + rawX;
        }
        return 0.0f;
    }
}
