package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.core.graphics.drawable.C0559a;
import androidx.core.view.C0661n;
import androidx.core.widget.C0677e;
import java.lang.reflect.Field;
import p214e.p215a.C7521a;
import p214e.p215a.p218l.p219a.C7545c;

/* renamed from: androidx.appcompat.widget.n */
class C0263n extends ListView {

    /* renamed from: e */
    private final Rect f1207e = new Rect();

    /* renamed from: f */
    private int f1208f = 0;

    /* renamed from: g */
    private int f1209g = 0;

    /* renamed from: h */
    private int f1210h = 0;

    /* renamed from: i */
    private int f1211i = 0;

    /* renamed from: j */
    private int f1212j;

    /* renamed from: k */
    private Field f1213k;

    /* renamed from: l */
    private C0264a f1214l;

    /* renamed from: m */
    private boolean f1215m;

    /* renamed from: n */
    private boolean f1216n;

    /* renamed from: o */
    private boolean f1217o;

    /* renamed from: p */
    private C0661n f1218p;

    /* renamed from: q */
    private C0677e f1219q;

    /* renamed from: r */
    C0265b f1220r;

    /* renamed from: androidx.appcompat.widget.n$a */
    private static class C0264a extends C7545c {

        /* renamed from: f */
        private boolean f1221f = true;

        C0264a(Drawable drawable) {
            super(drawable);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo1972a(boolean z) {
            this.f1221f = z;
        }

        public void draw(Canvas canvas) {
            if (this.f1221f) {
                super.draw(canvas);
            }
        }

        public void setHotspot(float f, float f2) {
            if (this.f1221f) {
                super.setHotspot(f, f2);
            }
        }

        public void setHotspotBounds(int i, int i2, int i3, int i4) {
            if (this.f1221f) {
                super.setHotspotBounds(i, i2, i3, i4);
            }
        }

        public boolean setState(int[] iArr) {
            if (this.f1221f) {
                return super.setState(iArr);
            }
            return false;
        }

        public boolean setVisible(boolean z, boolean z2) {
            if (this.f1221f) {
                return super.setVisible(z, z2);
            }
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.n$b */
    private class C0265b implements Runnable {
        C0265b() {
        }

        /* renamed from: a */
        public void mo1978a() {
            C0263n nVar = C0263n.this;
            nVar.f1220r = null;
            nVar.removeCallbacks(this);
        }

        /* renamed from: b */
        public void mo1979b() {
            C0263n.this.post(this);
        }

        public void run() {
            C0263n nVar = C0263n.this;
            nVar.f1220r = null;
            nVar.drawableStateChanged();
        }
    }

    C0263n(Context context, boolean z) {
        super(context, null, C7521a.dropDownListViewStyle);
        this.f1216n = z;
        setCacheColorHint(0);
        try {
            this.f1213k = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f1213k.setAccessible(true);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    private void m1089b(int i, View view) {
        Drawable selector = getSelector();
        boolean z = true;
        boolean z2 = (selector == null || i == -1) ? false : true;
        if (z2) {
            selector.setVisible(false, false);
        }
        m1084a(i, view);
        if (z2) {
            Rect rect = this.f1207e;
            float exactCenterX = rect.exactCenterX();
            float exactCenterY = rect.exactCenterY();
            if (getVisibility() != 0) {
                z = false;
            }
            selector.setVisible(z, false);
            C0559a.m2640a(selector, exactCenterX, exactCenterY);
        }
    }

    /* renamed from: c */
    private void m1091c() {
        Drawable selector = getSelector();
        if (selector != null && m1090b() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    private void setSelectorEnabled(boolean z) {
        C0264a aVar = this.f1214l;
        if (aVar != null) {
            aVar.mo1972a(z);
        }
    }

    /* renamed from: a */
    public int mo1959a(int i, int i2, int i3, int i4, int i5) {
        int i6;
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        getListPaddingLeft();
        getListPaddingRight();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i7 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i8 = i7;
        View view = null;
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < count; i11++) {
            int itemViewType = adapter.getItemViewType(i11);
            if (itemViewType != i9) {
                view = null;
                i9 = itemViewType;
            }
            view = adapter.getView(i11, view, this);
            LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i12 = layoutParams.height;
            if (i12 > 0) {
                i6 = MeasureSpec.makeMeasureSpec(i12, 1073741824);
            } else {
                i6 = MeasureSpec.makeMeasureSpec(0, 0);
            }
            view.measure(i, i6);
            view.forceLayout();
            if (i11 > 0) {
                i8 += dividerHeight;
            }
            i8 += view.getMeasuredHeight();
            if (i8 >= i4) {
                if (i5 >= 0 && i11 > i5 && i10 > 0 && i8 != i4) {
                    i4 = i10;
                }
                return i4;
            }
            if (i5 >= 0 && i11 >= i5) {
                i10 = i8;
            }
        }
        return i8;
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        m1086a(canvas);
        super.dispatchDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        if (this.f1220r == null) {
            super.drawableStateChanged();
            setSelectorEnabled(true);
            m1091c();
        }
    }

    public boolean hasFocus() {
        return this.f1216n || super.hasFocus();
    }

    public boolean hasWindowFocus() {
        return this.f1216n || super.hasWindowFocus();
    }

    public boolean isFocused() {
        return this.f1216n || super.isFocused();
    }

    public boolean isInTouchMode() {
        return (this.f1216n && this.f1215m) || super.isInTouchMode();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        this.f1220r = null;
        super.onDetachedFromWindow();
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f1220r == null) {
            this.f1220r = new C0265b();
            this.f1220r.mo1979b();
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (!(pointToPosition == -1 || pointToPosition == getSelectedItemPosition())) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                }
                m1091c();
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f1212j = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        C0265b bVar = this.f1220r;
        if (bVar != null) {
            bVar.mo1978a();
        }
        return super.onTouchEvent(motionEvent);
    }

    /* access modifiers changed from: 0000 */
    public void setListSelectionHidden(boolean z) {
        this.f1215m = z;
    }

    public void setSelector(Drawable drawable) {
        this.f1214l = drawable != null ? new C0264a(drawable) : null;
        super.setSelector(this.f1214l);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f1208f = rect.left;
        this.f1209g = rect.top;
        this.f1210h = rect.right;
        this.f1211i = rect.bottom;
    }

    /* renamed from: b */
    private boolean m1090b() {
        return this.f1217o;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000c, code lost:
        if (r0 != 3) goto L_0x000e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x001e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0065  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo1960a(android.view.MotionEvent r8, int r9) {
        /*
            r7 = this;
            int r0 = r8.getActionMasked()
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L_0x0016
            r3 = 2
            if (r0 == r3) goto L_0x0014
            r9 = 3
            if (r0 == r9) goto L_0x0011
        L_0x000e:
            r9 = 0
            r3 = 1
            goto L_0x0046
        L_0x0011:
            r9 = 0
            r3 = 0
            goto L_0x0046
        L_0x0014:
            r3 = 1
            goto L_0x0017
        L_0x0016:
            r3 = 0
        L_0x0017:
            int r9 = r8.findPointerIndex(r9)
            if (r9 >= 0) goto L_0x001e
            goto L_0x0011
        L_0x001e:
            float r4 = r8.getX(r9)
            int r4 = (int) r4
            float r9 = r8.getY(r9)
            int r9 = (int) r9
            int r5 = r7.pointToPosition(r4, r9)
            r6 = -1
            if (r5 != r6) goto L_0x0031
            r9 = 1
            goto L_0x0046
        L_0x0031:
            int r3 = r7.getFirstVisiblePosition()
            int r3 = r5 - r3
            android.view.View r3 = r7.getChildAt(r3)
            float r4 = (float) r4
            float r9 = (float) r9
            r7.m1088a(r3, r5, r4, r9)
            if (r0 != r2) goto L_0x000e
            r7.m1087a(r3, r5)
            goto L_0x000e
        L_0x0046:
            if (r3 == 0) goto L_0x004a
            if (r9 == 0) goto L_0x004d
        L_0x004a:
            r7.m1083a()
        L_0x004d:
            if (r3 == 0) goto L_0x0065
            androidx.core.widget.e r9 = r7.f1219q
            if (r9 != 0) goto L_0x005a
            androidx.core.widget.e r9 = new androidx.core.widget.e
            r9.<init>(r7)
            r7.f1219q = r9
        L_0x005a:
            androidx.core.widget.e r9 = r7.f1219q
            r9.mo3499a(r2)
            androidx.core.widget.e r9 = r7.f1219q
            r9.onTouch(r7, r8)
            goto L_0x006c
        L_0x0065:
            androidx.core.widget.e r8 = r7.f1219q
            if (r8 == 0) goto L_0x006c
            r8.mo3499a(r1)
        L_0x006c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0263n.mo1960a(android.view.MotionEvent, int):boolean");
    }

    /* renamed from: a */
    private void m1087a(View view, int i) {
        performItemClick(view, i, getItemIdAtPosition(i));
    }

    /* renamed from: a */
    private void m1086a(Canvas canvas) {
        if (!this.f1207e.isEmpty()) {
            Drawable selector = getSelector();
            if (selector != null) {
                selector.setBounds(this.f1207e);
                selector.draw(canvas);
            }
        }
    }

    /* renamed from: a */
    private void m1085a(int i, View view, float f, float f2) {
        m1089b(i, view);
        Drawable selector = getSelector();
        if (selector != null && i != -1) {
            C0559a.m2640a(selector, f, f2);
        }
    }

    /* renamed from: a */
    private void m1084a(int i, View view) {
        Rect rect = this.f1207e;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f1208f;
        rect.top -= this.f1209g;
        rect.right += this.f1210h;
        rect.bottom += this.f1211i;
        try {
            boolean z = this.f1213k.getBoolean(this);
            if (view.isEnabled() != z) {
                this.f1213k.set(this, Boolean.valueOf(!z));
                if (i != -1) {
                    refreshDrawableState();
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private void m1083a() {
        this.f1217o = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f1212j - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        C0661n nVar = this.f1218p;
        if (nVar != null) {
            nVar.mo3432a();
            this.f1218p = null;
        }
    }

    /* renamed from: a */
    private void m1088a(View view, int i, float f, float f2) {
        this.f1217o = true;
        if (VERSION.SDK_INT >= 21) {
            drawableHotspotChanged(f, f2);
        }
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i2 = this.f1212j;
        if (i2 != -1) {
            View childAt = getChildAt(i2 - getFirstVisiblePosition());
            if (!(childAt == null || childAt == view || !childAt.isPressed())) {
                childAt.setPressed(false);
            }
        }
        this.f1212j = i;
        float left = f - ((float) view.getLeft());
        float top = f2 - ((float) view.getTop());
        if (VERSION.SDK_INT >= 21) {
            view.drawableHotspotChanged(left, top);
        }
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        m1085a(i, view, f, f2);
        setSelectorEnabled(false);
        refreshDrawableState();
    }
}
