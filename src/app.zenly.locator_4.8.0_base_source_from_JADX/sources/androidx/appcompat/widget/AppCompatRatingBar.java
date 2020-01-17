package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import p214e.p215a.C7521a;

public class AppCompatRatingBar extends RatingBar {

    /* renamed from: e */
    private final C0256h f871e;

    public AppCompatRatingBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C7521a.ratingBarStyle);
    }

    /* access modifiers changed from: protected */
    public synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap a = this.f871e.mo1913a();
        if (a != null) {
            setMeasuredDimension(View.resolveSizeAndState(a.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }

    public AppCompatRatingBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f871e = new C0256h(this);
        this.f871e.mo1914a(attributeSet, i);
    }
}
