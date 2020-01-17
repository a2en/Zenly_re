package app.zenly.locator.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.C0636b;
import androidx.viewpager.widget.ViewPager.OnPageChangeListener;
import app.zenly.locator.core.util.C3200e0;
import app.zenly.locator.core.widget.ViewPager;
import app.zenly.locator.core.widget.ViewPager.C3261a;
import app.zenly.locator.core.widget.ViewPager.C3262b;

public class SwipeableEdgeLayout extends FrameLayout {

    /* renamed from: e */
    private Controller f15516e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public Listener f15517f;

    /* renamed from: g */
    private C0636b f15518g;

    /* renamed from: h */
    private boolean f15519h = true;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public boolean f15520i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public float f15521j;

    /* renamed from: k */
    private ViewPager f15522k = null;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public boolean f15523l = false;

    public interface Controller {
        int getClickableEdgeWidth();

        int getSwipeableBottomEdgeHeight();

        int getSwipeableBottomHeight();

        int getSwipeableEdgeWidth();
    }

    public interface Listener {
        void onBottomEdgeSwipe(MotionEvent motionEvent, boolean z);

        void onLeftEdgeClick();

        void onRightEdgeClick();

        boolean onSingleTapUp(MotionEvent motionEvent);
    }

    /* renamed from: app.zenly.locator.view.SwipeableEdgeLayout$a */
    class C6174a extends C3262b {
        C6174a() {
        }

        public void onPageScrollStateChanged(int i) {
            SwipeableEdgeLayout.this.f15523l = i != 0;
        }
    }

    /* renamed from: app.zenly.locator.view.SwipeableEdgeLayout$b */
    private class C6175b extends SimpleOnGestureListener {

        /* renamed from: e */
        private boolean f15525e;

        /* renamed from: f */
        private boolean f15526f;

        /* renamed from: g */
        private boolean f15527g;

        /* renamed from: h */
        private int f15528h;

        /* renamed from: i */
        private boolean f15529i;

        /* renamed from: j */
        private boolean f15530j;

        private C6175b() {
        }

        public boolean onDown(MotionEvent motionEvent) {
            this.f15525e = SwipeableEdgeLayout.this.m17110d(motionEvent.getX(), motionEvent.getY());
            this.f15528h = SwipeableEdgeLayout.this.m17104b(motionEvent.getX(), motionEvent.getY());
            this.f15526f = SwipeableEdgeLayout.this.m17101a(motionEvent.getX(), motionEvent.getY());
            this.f15527g = SwipeableEdgeLayout.this.m17108c(motionEvent.getX(), motionEvent.getY());
            this.f15529i = false;
            return false;
        }

        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            SwipeableEdgeLayout.this.f15521j = f2;
            if (!this.f15529i) {
                this.f15530j = (this.f15525e || this.f15526f) && Math.abs(f) > Math.abs(f2);
                this.f15529i = true;
                SwipeableEdgeLayout.this.f15520i = this.f15527g && Math.abs(f) < Math.abs(f2);
            }
            if (this.f15530j || SwipeableEdgeLayout.this.f15520i) {
                return true;
            }
            return false;
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            if (this.f15529i || SwipeableEdgeLayout.this.f15517f == null) {
                return false;
            }
            int i = this.f15528h;
            if (i == 1) {
                SwipeableEdgeLayout.this.f15517f.onLeftEdgeClick();
                return true;
            } else if (i != 2) {
                return SwipeableEdgeLayout.this.f15517f.onSingleTapUp(motionEvent);
            } else {
                SwipeableEdgeLayout.this.f15517f.onRightEdgeClick();
                return true;
            }
        }

        /* synthetic */ C6175b(SwipeableEdgeLayout swipeableEdgeLayout, C6174a aVar) {
            this();
        }
    }

    public SwipeableEdgeLayout(Context context) {
        super(context);
        m17100a();
    }

    private int getBottomEdgeHeight() {
        Controller controller = this.f15516e;
        if (controller != null) {
            return controller.getSwipeableBottomEdgeHeight();
        }
        return 0;
    }

    private int getBottomHeight() {
        Controller controller = this.f15516e;
        if (controller != null) {
            return controller.getSwipeableBottomHeight();
        }
        return -1;
    }

    private int getClickableEdgeWidth() {
        Controller controller = this.f15516e;
        if (controller != null) {
            return controller.getClickableEdgeWidth();
        }
        return -1;
    }

    private int getEdgeWidth() {
        Controller controller = this.f15516e;
        if (controller != null) {
            return controller.getSwipeableEdgeWidth();
        }
        return -1;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f15522k == null) {
            int i = 0;
            while (true) {
                if (i >= getChildCount()) {
                    break;
                }
                View childAt = getChildAt(i);
                if (childAt instanceof ViewPager) {
                    this.f15522k = (ViewPager) childAt;
                    this.f15522k.mo6331a((OnPageChangeListener) new C6174a());
                    break;
                }
                i++;
            }
            if (this.f15522k == null) {
                return false;
            }
        }
        if (this.f15523l) {
            return true;
        }
        if (!this.f15519h) {
            ViewPager viewPager = this.f15522k;
            if (viewPager != null) {
                viewPager.setMode(C3261a.DISABLED);
            }
            return false;
        }
        if (getEdgeWidth() == -1) {
            this.f15522k.setMode(C3261a.ENABLED);
        } else {
            this.f15522k.setMode(C3261a.FORWARDED_ONLY);
        }
        return this.f15518g.mo3384a(motionEvent);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean a = this.f15518g.mo3384a(motionEvent);
        boolean z = true;
        if (a || motionEvent.getActionMasked() == 1) {
            if (motionEvent.getPointerCount() > 1) {
                motionEvent.setAction(3);
                a = false;
            }
            if (!this.f15520i) {
                this.f15522k.mo9720a(motionEvent);
            } else if (this.f15517f != null) {
                motionEvent.offsetLocation(0.0f, (float) getBottomEdgeHeight());
                Listener listener = this.f15517f;
                if (this.f15521j <= 0.0f) {
                    z = false;
                }
                listener.onBottomEdgeSwipe(motionEvent, z);
            }
        }
        return a;
    }

    public void setController(Controller controller) {
        this.f15516e = controller;
    }

    public void setListener(Listener listener) {
        this.f15517f = listener;
    }

    public void setSwipeEnabled(boolean z) {
        this.f15519h = z;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public boolean m17108c(float f, float f2) {
        int bottomEdgeHeight = getBottomEdgeHeight();
        return bottomEdgeHeight != 0 && f2 >= ((float) (getMeasuredHeight() - bottomEdgeHeight));
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public boolean m17110d(float f, float f2) {
        int edgeWidth = getEdgeWidth();
        return edgeWidth != -1 && (f <= ((float) edgeWidth) || f >= ((float) (getMeasuredWidth() - edgeWidth)));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public int m17104b(float f, float f2) {
        int clickableEdgeWidth = getClickableEdgeWidth();
        if (f2 <= ((float) (getMeasuredHeight() - C3200e0.m10183a(getContext(), 140))) && clickableEdgeWidth > 0) {
            if (f <= ((float) clickableEdgeWidth)) {
                return 1;
            }
            if (f < ((float) (getMeasuredWidth() - clickableEdgeWidth)) || f2 < ((float) C3200e0.m10183a(getContext(), 40))) {
                return 0;
            }
            return 2;
        }
        return 0;
    }

    /* renamed from: a */
    private void m17100a() {
        this.f15518g = new C0636b(getContext(), new C6175b(this, null));
    }

    public SwipeableEdgeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m17100a();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m17101a(float f, float f2) {
        int bottomHeight = getBottomHeight();
        return bottomHeight != -1 && f2 >= ((float) (getMeasuredHeight() - bottomHeight));
    }
}
