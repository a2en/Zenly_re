package com.mapbox.android.gestures;

import android.content.Context;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import androidx.core.view.C0636b;

public class StandardGestureDetector extends C11289b<StandardOnGestureListener> {

    /* renamed from: h */
    private final C0636b f29145h;

    /* renamed from: i */
    final StandardOnGestureListener f29146i = new C11284a();

    public interface StandardOnGestureListener extends OnGestureListener, OnDoubleTapListener {
    }

    /* renamed from: com.mapbox.android.gestures.StandardGestureDetector$a */
    class C11284a implements StandardOnGestureListener {
        C11284a() {
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            return StandardGestureDetector.this.mo32722a(10) && ((StandardOnGestureListener) StandardGestureDetector.this.f29172g).onDoubleTap(motionEvent);
        }

        public boolean onDoubleTapEvent(MotionEvent motionEvent) {
            return StandardGestureDetector.this.mo32722a(11) && ((StandardOnGestureListener) StandardGestureDetector.this.f29172g).onDoubleTapEvent(motionEvent);
        }

        public boolean onDown(MotionEvent motionEvent) {
            return StandardGestureDetector.this.mo32722a(9) && ((StandardOnGestureListener) StandardGestureDetector.this.f29172g).onDown(motionEvent);
        }

        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            return StandardGestureDetector.this.mo32722a(7) && ((StandardOnGestureListener) StandardGestureDetector.this.f29172g).onFling(motionEvent, motionEvent2, f, f2);
        }

        public void onLongPress(MotionEvent motionEvent) {
            if (StandardGestureDetector.this.mo32722a(6)) {
                ((StandardOnGestureListener) StandardGestureDetector.this.f29172g).onLongPress(motionEvent);
            }
        }

        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            return StandardGestureDetector.this.mo32722a(0) && ((StandardOnGestureListener) StandardGestureDetector.this.f29172g).onScroll(motionEvent, motionEvent2, f, f2);
        }

        public void onShowPress(MotionEvent motionEvent) {
            if (StandardGestureDetector.this.mo32722a(8)) {
                ((StandardOnGestureListener) StandardGestureDetector.this.f29172g).onShowPress(motionEvent);
            }
        }

        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            return StandardGestureDetector.this.mo32722a(12) && ((StandardOnGestureListener) StandardGestureDetector.this.f29172g).onSingleTapConfirmed(motionEvent);
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return StandardGestureDetector.this.mo32722a(5) && ((StandardOnGestureListener) StandardGestureDetector.this.f29172g).onSingleTapUp(motionEvent);
        }
    }

    /* renamed from: com.mapbox.android.gestures.StandardGestureDetector$b */
    public static class C11285b implements StandardOnGestureListener {
        public boolean onDoubleTap(MotionEvent motionEvent) {
            return false;
        }

        public boolean onDoubleTapEvent(MotionEvent motionEvent) {
            return false;
        }

        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            return false;
        }

        public void onShowPress(MotionEvent motionEvent) {
        }
    }

    public StandardGestureDetector(Context context, C11288a aVar) {
        super(context, aVar);
        this.f29145h = new C0636b(context, this.f29146i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo32723a(MotionEvent motionEvent) {
        return this.f29145h.mo3384a(motionEvent);
    }
}
