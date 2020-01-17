package app.zenly.locator.map.p107g1;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* renamed from: app.zenly.locator.map.g1.b */
class C3978b extends View {

    /* renamed from: e */
    protected View f10506e;

    /* renamed from: f */
    protected OnTouchListener f10507f;

    public C3978b(Context context) {
        super(context);
    }

    /* renamed from: a */
    public void mo10644a(View view) {
        this.f10506e = view;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        OnTouchListener onTouchListener = this.f10507f;
        if (onTouchListener != null && onTouchListener.onTouch(this, motionEvent)) {
            return true;
        }
        View view = this.f10506e;
        if (view == null) {
            return false;
        }
        view.dispatchTouchEvent(motionEvent);
        return true;
    }

    public void setOnTouchListener(OnTouchListener onTouchListener) {
        this.f10507f = onTouchListener;
        super.setOnTouchListener(onTouchListener);
    }
}
