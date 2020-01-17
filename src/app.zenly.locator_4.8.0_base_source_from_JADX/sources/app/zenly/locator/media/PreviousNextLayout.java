package app.zenly.locator.media;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import androidx.core.view.C0636b;

public class PreviousNextLayout extends FrameLayout {

    /* renamed from: e */
    private final C0636b f11934e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public Listener f11935f;

    public interface Listener {
        void onNext();

        void onPrevious();
    }

    /* renamed from: app.zenly.locator.media.PreviousNextLayout$a */
    class C4420a extends SimpleOnGestureListener {
        C4420a() {
        }

        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            if (PreviousNextLayout.this.f11935f == null) {
                return super.onSingleTapUp(motionEvent);
            }
            if (motionEvent.getX() < ((float) PreviousNextLayout.this.getWidth()) / 3.0f) {
                PreviousNextLayout.this.f11935f.onPrevious();
            } else {
                PreviousNextLayout.this.f11935f.onNext();
            }
            return true;
        }
    }

    public PreviousNextLayout(Context context) {
        this(context, null);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f11934e.mo3384a(motionEvent) || super.onInterceptTouchEvent(motionEvent);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f11934e.mo3384a(motionEvent) || super.onTouchEvent(motionEvent);
    }

    public void setListener(Listener listener) {
        this.f11935f = listener;
    }

    public PreviousNextLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PreviousNextLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f11934e = new C0636b(context, new C4420a());
    }
}
