package app.zenly.locator.core.widget;

import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View.OnClickListener;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C1081r;

/* renamed from: app.zenly.locator.core.widget.h */
public final class C3273h extends C1081r {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final OnClickListener f9125a;

    /* renamed from: b */
    private final GestureDetector f9126b;

    /* renamed from: app.zenly.locator.core.widget.h$a */
    class C3274a extends SimpleOnGestureListener {

        /* renamed from: e */
        final /* synthetic */ RecyclerView f9127e;

        C3274a(RecyclerView recyclerView) {
            this.f9127e = recyclerView;
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            C3273h.this.f9125a.onClick(this.f9127e);
            return super.onSingleTapUp(motionEvent);
        }
    }

    public C3273h(RecyclerView recyclerView, OnClickListener onClickListener) {
        this.f9125a = onClickListener;
        this.f9126b = new GestureDetector(recyclerView.getContext(), new C3274a(recyclerView));
    }

    public boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        this.f9126b.onTouchEvent(motionEvent);
        return false;
    }
}
