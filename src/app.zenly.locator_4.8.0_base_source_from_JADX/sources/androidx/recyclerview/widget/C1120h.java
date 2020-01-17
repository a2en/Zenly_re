package androidx.recyclerview.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView.C1074l;
import androidx.recyclerview.widget.RecyclerView.C1082s;

/* renamed from: androidx.recyclerview.widget.h */
public class C1120h extends C1074l {

    /* renamed from: d */
    private static final int[] f4279d = {16843284};

    /* renamed from: a */
    private Drawable f4280a;

    /* renamed from: b */
    private int f4281b;

    /* renamed from: c */
    private final Rect f4282c = new Rect();

    public C1120h(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f4279d);
        this.f4280a = obtainStyledAttributes.getDrawable(0);
        if (this.f4280a == null) {
            Log.w("DividerItem", "@android:attr/listDivider was not set in the theme used for this DividerItemDecoration. Please set that attribute all call setDrawable()");
        }
        obtainStyledAttributes.recycle();
        mo5701a(i);
    }

    /* renamed from: b */
    private void m5486b(Canvas canvas, RecyclerView recyclerView) {
        int i;
        int i2;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            i2 = recyclerView.getPaddingLeft();
            i = recyclerView.getWidth() - recyclerView.getPaddingRight();
            canvas.clipRect(i2, recyclerView.getPaddingTop(), i, recyclerView.getHeight() - recyclerView.getPaddingBottom());
        } else {
            i = recyclerView.getWidth();
            i2 = 0;
        }
        int childCount = recyclerView.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = recyclerView.getChildAt(i3);
            recyclerView.mo5041a(childAt, this.f4282c);
            int round = this.f4282c.bottom + Math.round(childAt.getTranslationY());
            this.f4280a.setBounds(i2, round - this.f4280a.getIntrinsicHeight(), i, round);
            this.f4280a.draw(canvas);
        }
        canvas.restore();
    }

    /* renamed from: a */
    public void mo5701a(int i) {
        if (i == 0 || i == 1) {
            this.f4281b = i;
            return;
        }
        throw new IllegalArgumentException("Invalid orientation. It should be either HORIZONTAL or VERTICAL");
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1082s sVar) {
        Drawable drawable = this.f4280a;
        if (drawable == null) {
            rect.set(0, 0, 0, 0);
            return;
        }
        if (this.f4281b == 1) {
            rect.set(0, 0, 0, drawable.getIntrinsicHeight());
        } else {
            rect.set(0, 0, drawable.getIntrinsicWidth(), 0);
        }
    }

    public void onDraw(Canvas canvas, RecyclerView recyclerView, C1082s sVar) {
        if (recyclerView.getLayoutManager() != null && this.f4280a != null) {
            if (this.f4281b == 1) {
                m5486b(canvas, recyclerView);
            } else {
                m5485a(canvas, recyclerView);
            }
        }
    }

    /* renamed from: a */
    public void mo5702a(Drawable drawable) {
        if (drawable != null) {
            this.f4280a = drawable;
            return;
        }
        throw new IllegalArgumentException("Drawable cannot be null.");
    }

    /* renamed from: a */
    private void m5485a(Canvas canvas, RecyclerView recyclerView) {
        int i;
        int i2;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            i2 = recyclerView.getPaddingTop();
            i = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            canvas.clipRect(recyclerView.getPaddingLeft(), i2, recyclerView.getWidth() - recyclerView.getPaddingRight(), i);
        } else {
            i = recyclerView.getHeight();
            i2 = 0;
        }
        int childCount = recyclerView.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = recyclerView.getChildAt(i3);
            recyclerView.getLayoutManager().mo5258b(childAt, this.f4282c);
            int round = this.f4282c.right + Math.round(childAt.getTranslationX());
            this.f4280a.setBounds(round - this.f4280a.getIntrinsicWidth(), i2, round, i);
            this.f4280a.draw(canvas);
        }
        canvas.restore();
    }
}
