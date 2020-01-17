package app.zenly.android.base.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.HorizontalScrollView;
import kotlin.jvm.internal.C12932j;

public final class ListeningHorizontalScrollView extends HorizontalScrollView {

    /* renamed from: e */
    private OnScrollChangeListener f4919e;

    public interface OnScrollChangeListener {
        void onScrollChange(ListeningHorizontalScrollView listeningHorizontalScrollView, int i, int i2, int i3, int i4);
    }

    public ListeningHorizontalScrollView(Context context) {
        this(context, null, 0, 6, null);
    }

    public ListeningHorizontalScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ ListeningHorizontalScrollView(Context context, AttributeSet attributeSet, int i, int i2, C12928f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }

    public final OnScrollChangeListener getOnScrollChangeListener() {
        return this.f4919e;
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        OnScrollChangeListener onScrollChangeListener = this.f4919e;
        if (onScrollChangeListener != null) {
            onScrollChangeListener.onScrollChange(this, i, i2, i3, i4);
        }
    }

    public final void setOnScrollChangeListener(OnScrollChangeListener onScrollChangeListener) {
        this.f4919e = onScrollChangeListener;
    }

    public ListeningHorizontalScrollView(Context context, AttributeSet attributeSet, int i) {
        C12932j.m33818b(context, "context");
        super(context, attributeSet, i);
    }
}
