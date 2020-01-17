package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import androidx.appcompat.view.menu.ShowableListMenu;

/* renamed from: androidx.appcompat.widget.o */
public abstract class C0266o implements OnTouchListener, OnAttachStateChangeListener {

    /* renamed from: e */
    private final float f1223e;

    /* renamed from: f */
    private final int f1224f;

    /* renamed from: g */
    private final int f1225g;

    /* renamed from: h */
    final View f1226h;

    /* renamed from: i */
    private Runnable f1227i;

    /* renamed from: j */
    private Runnable f1228j;

    /* renamed from: k */
    private boolean f1229k;

    /* renamed from: l */
    private int f1230l;

    /* renamed from: m */
    private final int[] f1231m = new int[2];

    /* renamed from: androidx.appcompat.widget.o$a */
    private class C0267a implements Runnable {
        C0267a() {
        }

        public void run() {
            ViewParent parent = C0266o.this.f1226h.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.o$b */
    private class C0268b implements Runnable {
        C0268b() {
        }

        public void run() {
            C0266o.this.mo1981d();
        }
    }

    public C0266o(View view) {
        this.f1226h = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f1223e = (float) ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.f1224f = ViewConfiguration.getTapTimeout();
        this.f1225g = (this.f1224f + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    /* renamed from: a */
    private boolean m1097a(MotionEvent motionEvent) {
        View view = this.f1226h;
        ShowableListMenu a = mo695a();
        if (a != null && a.isShowing()) {
            C0263n nVar = (C0263n) a.getListView();
            if (nVar != null && nVar.isShown()) {
                MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                m1099a(view, obtainNoHistory);
                m1101b(nVar, obtainNoHistory);
                boolean a2 = nVar.mo1960a(obtainNoHistory, this.f1230l);
                obtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                boolean z = true;
                boolean z2 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                if (!a2 || !z2) {
                    z = false;
                }
                return z;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
        if (r1 != 3) goto L_0x006d;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m1100b(android.view.MotionEvent r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.f1226h
            boolean r1 = r0.isEnabled()
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            int r1 = r6.getActionMasked()
            if (r1 == 0) goto L_0x0041
            r3 = 1
            if (r1 == r3) goto L_0x003d
            r4 = 2
            if (r1 == r4) goto L_0x001a
            r6 = 3
            if (r1 == r6) goto L_0x003d
            goto L_0x006d
        L_0x001a:
            int r1 = r5.f1230l
            int r1 = r6.findPointerIndex(r1)
            if (r1 < 0) goto L_0x006d
            float r4 = r6.getX(r1)
            float r6 = r6.getY(r1)
            float r1 = r5.f1223e
            boolean r6 = m1098a(r0, r4, r6, r1)
            if (r6 != 0) goto L_0x006d
            r5.m1102e()
            android.view.ViewParent r6 = r0.getParent()
            r6.requestDisallowInterceptTouchEvent(r3)
            return r3
        L_0x003d:
            r5.m1102e()
            goto L_0x006d
        L_0x0041:
            int r6 = r6.getPointerId(r2)
            r5.f1230l = r6
            java.lang.Runnable r6 = r5.f1227i
            if (r6 != 0) goto L_0x0052
            androidx.appcompat.widget.o$a r6 = new androidx.appcompat.widget.o$a
            r6.<init>()
            r5.f1227i = r6
        L_0x0052:
            java.lang.Runnable r6 = r5.f1227i
            int r1 = r5.f1224f
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
            java.lang.Runnable r6 = r5.f1228j
            if (r6 != 0) goto L_0x0065
            androidx.appcompat.widget.o$b r6 = new androidx.appcompat.widget.o$b
            r6.<init>()
            r5.f1228j = r6
        L_0x0065:
            java.lang.Runnable r6 = r5.f1228j
            int r1 = r5.f1225g
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
        L_0x006d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0266o.m1100b(android.view.MotionEvent):boolean");
    }

    /* renamed from: e */
    private void m1102e() {
        Runnable runnable = this.f1228j;
        if (runnable != null) {
            this.f1226h.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f1227i;
        if (runnable2 != null) {
            this.f1226h.removeCallbacks(runnable2);
        }
    }

    /* renamed from: a */
    public abstract ShowableListMenu mo695a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract boolean mo696b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo1219c() {
        ShowableListMenu a = mo695a();
        if (a != null && a.isShowing()) {
            a.dismiss();
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo1981d() {
        m1102e();
        View view = this.f1226h;
        if (view.isEnabled() && !view.isLongClickable() && mo696b()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            this.f1229k = true;
        }
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        boolean z2 = this.f1229k;
        if (z2) {
            z = m1097a(motionEvent) || !mo1219c();
        } else {
            z = m1100b(motionEvent) && mo696b();
            if (z) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f1226h.onTouchEvent(obtain);
                obtain.recycle();
            }
        }
        this.f1229k = z;
        if (z || z2) {
            return true;
        }
        return false;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        this.f1229k = false;
        this.f1230l = -1;
        Runnable runnable = this.f1227i;
        if (runnable != null) {
            this.f1226h.removeCallbacks(runnable);
        }
    }

    /* renamed from: a */
    private static boolean m1098a(View view, float f, float f2, float f3) {
        float f4 = -f3;
        return f >= f4 && f2 >= f4 && f < ((float) (view.getRight() - view.getLeft())) + f3 && f2 < ((float) (view.getBottom() - view.getTop())) + f3;
    }

    /* renamed from: a */
    private boolean m1099a(View view, MotionEvent motionEvent) {
        int[] iArr = this.f1231m;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation((float) iArr[0], (float) iArr[1]);
        return true;
    }

    /* renamed from: b */
    private boolean m1101b(View view, MotionEvent motionEvent) {
        int[] iArr = this.f1231m;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation((float) (-iArr[0]), (float) (-iArr[1]));
        return true;
    }
}
