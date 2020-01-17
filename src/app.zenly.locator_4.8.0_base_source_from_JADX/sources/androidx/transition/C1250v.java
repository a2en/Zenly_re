package androidx.transition;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;

/* renamed from: androidx.transition.v */
class C1250v implements C1253x {

    /* renamed from: a */
    protected C1251a f4660a;

    /* renamed from: androidx.transition.v$a */
    static class C1251a extends ViewGroup {

        /* renamed from: e */
        ViewGroup f4661e;

        /* renamed from: f */
        View f4662f;

        /* renamed from: g */
        ArrayList<Drawable> f4663g = null;

        /* renamed from: h */
        C1250v f4664h;

        static {
            try {
                ViewGroup.class.getDeclaredMethod("invalidateChildInParentFast", new Class[]{Integer.TYPE, Integer.TYPE, Rect.class});
            } catch (NoSuchMethodException unused) {
            }
        }

        C1251a(Context context, ViewGroup viewGroup, View view, C1250v vVar) {
            super(context);
            this.f4661e = viewGroup;
            this.f4662f = view;
            setRight(viewGroup.getWidth());
            setBottom(viewGroup.getHeight());
            viewGroup.addView(this);
            this.f4664h = vVar;
        }

        /* renamed from: a */
        public void mo6105a(Drawable drawable) {
            if (this.f4663g == null) {
                this.f4663g = new ArrayList<>();
            }
            if (!this.f4663g.contains(drawable)) {
                this.f4663g.add(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback(this);
            }
        }

        /* renamed from: b */
        public void mo6108b(Drawable drawable) {
            ArrayList<Drawable> arrayList = this.f4663g;
            if (arrayList != null) {
                arrayList.remove(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback(null);
            }
        }

        /* access modifiers changed from: protected */
        public void dispatchDraw(Canvas canvas) {
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            this.f4661e.getLocationOnScreen(iArr);
            this.f4662f.getLocationOnScreen(iArr2);
            canvas.translate((float) (iArr2[0] - iArr[0]), (float) (iArr2[1] - iArr[1]));
            canvas.clipRect(new Rect(0, 0, this.f4662f.getWidth(), this.f4662f.getHeight()));
            super.dispatchDraw(canvas);
            ArrayList<Drawable> arrayList = this.f4663g;
            int size = arrayList == null ? 0 : arrayList.size();
            for (int i = 0; i < size; i++) {
                ((Drawable) this.f4663g.get(i)).draw(canvas);
            }
        }

        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
            if (this.f4661e != null) {
                rect.offset(iArr[0], iArr[1]);
                if (this.f4661e instanceof ViewGroup) {
                    iArr[0] = 0;
                    iArr[1] = 0;
                    int[] iArr2 = new int[2];
                    m5999a(iArr2);
                    rect.offset(iArr2[0], iArr2[1]);
                    return super.invalidateChildInParent(iArr, rect);
                }
                invalidate(rect);
            }
            return null;
        }

        public void invalidateDrawable(Drawable drawable) {
            invalidate(drawable.getBounds());
        }

        /* access modifiers changed from: protected */
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        }

        /* access modifiers changed from: protected */
        public boolean verifyDrawable(Drawable drawable) {
            if (!super.verifyDrawable(drawable)) {
                ArrayList<Drawable> arrayList = this.f4663g;
                if (arrayList == null || !arrayList.contains(drawable)) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: b */
        public void mo6109b(View view) {
            super.removeView(view);
            if (mo6107a()) {
                this.f4661e.removeView(this);
            }
        }

        /* renamed from: a */
        public void mo6106a(View view) {
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (!(viewGroup == this.f4661e || viewGroup.getParent() == null || !ViewCompat.m2802B(viewGroup))) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    this.f4661e.getLocationOnScreen(iArr2);
                    ViewCompat.m2846d(view, iArr[0] - iArr2[0]);
                    ViewCompat.m2848e(view, iArr[1] - iArr2[1]);
                }
                viewGroup.removeView(view);
                if (view.getParent() != null) {
                    viewGroup.removeView(view);
                }
            }
            super.addView(view, getChildCount() - 1);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo6107a() {
            if (getChildCount() == 0) {
                ArrayList<Drawable> arrayList = this.f4663g;
                if (arrayList == null || arrayList.size() == 0) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: a */
        private void m5999a(int[] iArr) {
            int[] iArr2 = new int[2];
            int[] iArr3 = new int[2];
            this.f4661e.getLocationOnScreen(iArr2);
            this.f4662f.getLocationOnScreen(iArr3);
            iArr[0] = iArr3[0] - iArr2[0];
            iArr[1] = iArr3[1] - iArr2[1];
        }
    }

    C1250v(Context context, ViewGroup viewGroup, View view) {
        this.f4660a = new C1251a(context, viewGroup, view, this);
    }

    /* renamed from: c */
    static C1250v m5995c(View view) {
        ViewGroup d = m5996d(view);
        if (d == null) {
            return null;
        }
        int childCount = d.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = d.getChildAt(i);
            if (childAt instanceof C1251a) {
                return ((C1251a) childAt).f4664h;
            }
        }
        return new C1243p(d.getContext(), d, view);
    }

    /* renamed from: d */
    static ViewGroup m5996d(View view) {
        while (view != null) {
            if (view.getId() == 16908290 && (view instanceof ViewGroup)) {
                return (ViewGroup) view;
            }
            if (view.getParent() instanceof ViewGroup) {
                view = (ViewGroup) view.getParent();
            }
        }
        return null;
    }

    /* renamed from: a */
    public void mo6102a(Drawable drawable) {
        this.f4660a.mo6105a(drawable);
    }

    /* renamed from: b */
    public void mo6103b(Drawable drawable) {
        this.f4660a.mo6108b(drawable);
    }
}
