package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import p333g.p357d.p358a.p361b.C12071f;
import p333g.p357d.p358a.p361b.C12076k;

public class SnackbarContentLayout extends LinearLayout implements ContentViewCallback {

    /* renamed from: e */
    private TextView f28254e;

    /* renamed from: f */
    private Button f28255f;

    /* renamed from: g */
    private int f28256g;

    /* renamed from: h */
    private int f28257h;

    public SnackbarContentLayout(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private boolean m27837a(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.f28254e.getPaddingTop() == i2 && this.f28254e.getPaddingBottom() == i3) {
            return z;
        }
        m27836a((View) this.f28254e, i2, i3);
        return true;
    }

    public void animateContentIn(int i, int i2) {
        this.f28254e.setAlpha(0.0f);
        long j = (long) i2;
        long j2 = (long) i;
        this.f28254e.animate().alpha(1.0f).setDuration(j).setStartDelay(j2).start();
        if (this.f28255f.getVisibility() == 0) {
            this.f28255f.setAlpha(0.0f);
            this.f28255f.animate().alpha(1.0f).setDuration(j).setStartDelay(j2).start();
        }
    }

    public void animateContentOut(int i, int i2) {
        this.f28254e.setAlpha(1.0f);
        long j = (long) i2;
        long j2 = (long) i;
        this.f28254e.animate().alpha(0.0f).setDuration(j).setStartDelay(j2).start();
        if (this.f28255f.getVisibility() == 0) {
            this.f28255f.setAlpha(1.0f);
            this.f28255f.animate().alpha(0.0f).setDuration(j).setStartDelay(j2).start();
        }
    }

    public Button getActionView() {
        return this.f28255f;
    }

    public TextView getMessageView() {
        return this.f28254e;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f28254e = (TextView) findViewById(C12071f.snackbar_text);
        this.f28255f = (Button) findViewById(C12071f.snackbar_action);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0053, code lost:
        if (m27837a(1, r0, r0 - r1) != false) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005e, code lost:
        if (m27837a(0, r0, r0) != false) goto L_0x0062;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            super.onMeasure(r8, r9)
            int r0 = r7.f28256g
            if (r0 <= 0) goto L_0x0018
            int r0 = r7.getMeasuredWidth()
            int r1 = r7.f28256g
            if (r0 <= r1) goto L_0x0018
            r8 = 1073741824(0x40000000, float:2.0)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r8)
            super.onMeasure(r8, r9)
        L_0x0018:
            android.content.res.Resources r0 = r7.getResources()
            int r1 = p333g.p357d.p358a.p361b.C12069d.design_snackbar_padding_vertical_2lines
            int r0 = r0.getDimensionPixelSize(r1)
            android.content.res.Resources r1 = r7.getResources()
            int r2 = p333g.p357d.p358a.p361b.C12069d.design_snackbar_padding_vertical
            int r1 = r1.getDimensionPixelSize(r2)
            android.widget.TextView r2 = r7.f28254e
            android.text.Layout r2 = r2.getLayout()
            int r2 = r2.getLineCount()
            r3 = 0
            r4 = 1
            if (r2 <= r4) goto L_0x003c
            r2 = 1
            goto L_0x003d
        L_0x003c:
            r2 = 0
        L_0x003d:
            if (r2 == 0) goto L_0x0056
            int r5 = r7.f28257h
            if (r5 <= 0) goto L_0x0056
            android.widget.Button r5 = r7.f28255f
            int r5 = r5.getMeasuredWidth()
            int r6 = r7.f28257h
            if (r5 <= r6) goto L_0x0056
            int r1 = r0 - r1
            boolean r0 = r7.m27837a(r4, r0, r1)
            if (r0 == 0) goto L_0x0061
            goto L_0x0062
        L_0x0056:
            if (r2 == 0) goto L_0x0059
            goto L_0x005a
        L_0x0059:
            r0 = r1
        L_0x005a:
            boolean r0 = r7.m27837a(r3, r0, r0)
            if (r0 == 0) goto L_0x0061
            goto L_0x0062
        L_0x0061:
            r4 = 0
        L_0x0062:
            if (r4 == 0) goto L_0x0067
            super.onMeasure(r8, r9)
        L_0x0067:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.SnackbarContentLayout.onMeasure(int, int):void");
    }

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C12076k.SnackbarLayout);
        this.f28256g = obtainStyledAttributes.getDimensionPixelSize(C12076k.SnackbarLayout_android_maxWidth, -1);
        this.f28257h = obtainStyledAttributes.getDimensionPixelSize(C12076k.SnackbarLayout_maxActionInlineWidth, -1);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    private static void m27836a(View view, int i, int i2) {
        if (ViewCompat.m2806F(view)) {
            ViewCompat.m2818a(view, ViewCompat.m2866s(view), i, ViewCompat.m2865r(view), i2);
        } else {
            view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), i2);
        }
    }
}
