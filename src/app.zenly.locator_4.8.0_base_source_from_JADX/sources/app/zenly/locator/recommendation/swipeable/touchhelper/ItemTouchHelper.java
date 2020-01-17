package app.zenly.locator.recommendation.swipeable.touchhelper;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.util.Log;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.Interpolator;
import androidx.core.view.C0636b;
import androidx.core.view.ViewCompat;
import androidx.dynamicanimation.animation.C0725b;
import androidx.dynamicanimation.animation.C0728d;
import androidx.dynamicanimation.animation.C0730f;
import androidx.dynamicanimation.animation.C0731g;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.recyclerview.widget.ItemTouchUIUtil;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C1074l;
import androidx.recyclerview.widget.RecyclerView.C1082s;
import androidx.recyclerview.widget.RecyclerView.C1085v;
import androidx.recyclerview.widget.RecyclerView.ChildDrawingOrderCallback;
import androidx.recyclerview.widget.RecyclerView.ItemAnimator;
import androidx.recyclerview.widget.RecyclerView.LayoutManager;
import androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener;
import androidx.recyclerview.widget.RecyclerView.OnItemTouchListener;
import app.zenly.locator.R;
import com.android.volley.toolbox.C8733j;
import java.util.ArrayList;
import java.util.List;

@SuppressLint({"LogNotTimber"})
public class ItemTouchHelper extends C1074l implements OnChildAttachStateChangeListener {

    /* renamed from: A */
    private C5322h f13658A;

    /* renamed from: B */
    private final OnItemTouchListener f13659B = new C5314b();

    /* renamed from: C */
    private Rect f13660C;

    /* renamed from: D */
    private long f13661D;

    /* renamed from: a */
    final List<View> f13662a = new ArrayList();

    /* renamed from: b */
    protected final float[] f13663b = new float[2];

    /* renamed from: c */
    C1085v f13664c = null;

    /* renamed from: d */
    float f13665d;

    /* renamed from: e */
    float f13666e;

    /* renamed from: f */
    private float f13667f;

    /* renamed from: g */
    private float f13668g;

    /* renamed from: h */
    float f13669h;

    /* renamed from: i */
    float f13670i;

    /* renamed from: j */
    private float f13671j;

    /* renamed from: k */
    private float f13672k;

    /* renamed from: l */
    int f13673l = -1;

    /* renamed from: m */
    C5319g f13674m;

    /* renamed from: n */
    protected int f13675n = 0;

    /* renamed from: o */
    int f13676o;

    /* renamed from: p */
    List<C5323i> f13677p = new ArrayList();

    /* renamed from: q */
    private int f13678q;

    /* renamed from: r */
    RecyclerView f13679r;

    /* renamed from: s */
    final Runnable f13680s = new C5313a();

    /* renamed from: t */
    VelocityTracker f13681t;

    /* renamed from: u */
    private List<C1085v> f13682u;

    /* renamed from: v */
    private List<Integer> f13683v;

    /* renamed from: w */
    private ChildDrawingOrderCallback f13684w = null;

    /* renamed from: x */
    View f13685x = null;

    /* renamed from: y */
    int f13686y = -1;

    /* renamed from: z */
    C0636b f13687z;

    public interface ViewDropHandler {
        void prepareForDrop(View view, View view2, int i, int i2);
    }

    /* renamed from: app.zenly.locator.recommendation.swipeable.touchhelper.ItemTouchHelper$a */
    class C5313a implements Runnable {
        C5313a() {
        }

        public void run() {
            ItemTouchHelper itemTouchHelper = ItemTouchHelper.this;
            if (itemTouchHelper.f13664c != null && itemTouchHelper.mo12713c()) {
                ItemTouchHelper itemTouchHelper2 = ItemTouchHelper.this;
                C1085v vVar = itemTouchHelper2.f13664c;
                if (vVar != null) {
                    itemTouchHelper2.mo12703a(vVar);
                }
                ItemTouchHelper itemTouchHelper3 = ItemTouchHelper.this;
                itemTouchHelper3.f13679r.removeCallbacks(itemTouchHelper3.f13680s);
                ViewCompat.m2826a((View) ItemTouchHelper.this.f13679r, (Runnable) this);
            }
        }
    }

    /* renamed from: app.zenly.locator.recommendation.swipeable.touchhelper.ItemTouchHelper$b */
    class C5314b implements OnItemTouchListener {
        C5314b() {
        }

        public boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
            ItemTouchHelper.this.f13687z.mo3384a(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                ItemTouchHelper.this.f13673l = motionEvent.getPointerId(0);
                ItemTouchHelper.this.f13665d = motionEvent.getX();
                ItemTouchHelper.this.f13666e = motionEvent.getY();
                ItemTouchHelper.this.mo12711b();
                ItemTouchHelper itemTouchHelper = ItemTouchHelper.this;
                if (itemTouchHelper.f13664c == null) {
                    C5323i a = itemTouchHelper.mo12698a(motionEvent);
                    if (a != null) {
                        ItemTouchHelper itemTouchHelper2 = ItemTouchHelper.this;
                        itemTouchHelper2.f13665d -= a.f13718m;
                        itemTouchHelper2.f13666e -= a.f13719n;
                        itemTouchHelper2.mo12705a(a.f13710e, true);
                        if (ItemTouchHelper.this.f13662a.remove(a.f13710e.itemView)) {
                            ItemTouchHelper itemTouchHelper3 = ItemTouchHelper.this;
                            itemTouchHelper3.f13674m.mo12692a(itemTouchHelper3.f13679r, a.f13710e);
                        }
                        ItemTouchHelper.this.mo12704a(a.f13710e, a.f13711f);
                        ItemTouchHelper itemTouchHelper4 = ItemTouchHelper.this;
                        itemTouchHelper4.mo12701a(motionEvent, itemTouchHelper4.f13676o, 0);
                    }
                }
            } else if (actionMasked == 3 || actionMasked == 1) {
                ItemTouchHelper itemTouchHelper5 = ItemTouchHelper.this;
                itemTouchHelper5.f13673l = -1;
                itemTouchHelper5.mo12704a((C1085v) null, 0);
            } else {
                int i = ItemTouchHelper.this.f13673l;
                if (i != -1) {
                    int findPointerIndex = motionEvent.findPointerIndex(i);
                    if (findPointerIndex >= 0) {
                        ItemTouchHelper.this.mo12700a(actionMasked, motionEvent, findPointerIndex);
                    }
                }
            }
            VelocityTracker velocityTracker = ItemTouchHelper.this.f13681t;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            if (ItemTouchHelper.this.f13664c != null) {
                return true;
            }
            return false;
        }

        public void onRequestDisallowInterceptTouchEvent(boolean z) {
            if (z) {
                ItemTouchHelper.this.mo12704a((C1085v) null, 0);
            }
        }

        public void onTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
            ItemTouchHelper.this.f13687z.mo3384a(motionEvent);
            VelocityTracker velocityTracker = ItemTouchHelper.this.f13681t;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            if (ItemTouchHelper.this.f13673l != -1) {
                int actionMasked = motionEvent.getActionMasked();
                int findPointerIndex = motionEvent.findPointerIndex(ItemTouchHelper.this.f13673l);
                if (findPointerIndex >= 0) {
                    ItemTouchHelper.this.mo12700a(actionMasked, motionEvent, findPointerIndex);
                }
                ItemTouchHelper itemTouchHelper = ItemTouchHelper.this;
                C1085v vVar = itemTouchHelper.f13664c;
                if (vVar != null) {
                    int i = 0;
                    if (actionMasked != 1) {
                        if (actionMasked != 2) {
                            if (actionMasked == 3) {
                                VelocityTracker velocityTracker2 = itemTouchHelper.f13681t;
                                if (velocityTracker2 != null) {
                                    velocityTracker2.clear();
                                }
                            } else if (actionMasked == 6) {
                                int actionIndex = motionEvent.getActionIndex();
                                if (motionEvent.getPointerId(actionIndex) == ItemTouchHelper.this.f13673l) {
                                    if (actionIndex == 0) {
                                        i = 1;
                                    }
                                    ItemTouchHelper.this.f13673l = motionEvent.getPointerId(i);
                                    ItemTouchHelper itemTouchHelper2 = ItemTouchHelper.this;
                                    itemTouchHelper2.mo12701a(motionEvent, itemTouchHelper2.f13676o, actionIndex);
                                }
                            }
                        } else if (findPointerIndex >= 0) {
                            itemTouchHelper.mo12701a(motionEvent, itemTouchHelper.f13676o, findPointerIndex);
                            ItemTouchHelper.this.mo12703a(vVar);
                            ItemTouchHelper itemTouchHelper3 = ItemTouchHelper.this;
                            itemTouchHelper3.f13679r.removeCallbacks(itemTouchHelper3.f13680s);
                            ItemTouchHelper.this.f13680s.run();
                            ItemTouchHelper.this.f13679r.invalidate();
                        }
                    }
                    ItemTouchHelper.this.mo12704a((C1085v) null, 0);
                    ItemTouchHelper.this.f13673l = -1;
                }
            }
        }
    }

    /* renamed from: app.zenly.locator.recommendation.swipeable.touchhelper.ItemTouchHelper$c */
    class C5315c extends C5323i {

        /* renamed from: r */
        final /* synthetic */ int f13690r;

        /* renamed from: s */
        final /* synthetic */ C1085v f13691s;

        /* renamed from: t */
        final /* synthetic */ ItemTouchHelper f13692t;

        C5315c(ItemTouchHelper itemTouchHelper, C1085v vVar, int i, int i2, float f, float f2, float f3, float f4, int i3, C1085v vVar2) {
            this.f13692t = itemTouchHelper;
            this.f13690r = i3;
            this.f13691s = vVar2;
            super(vVar, i, i2, f, f2, f3, f4);
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (!this.f13720o) {
                if (this.f13690r <= 0) {
                    ItemTouchHelper itemTouchHelper = this.f13692t;
                    itemTouchHelper.f13674m.mo12692a(itemTouchHelper.f13679r, this.f13691s);
                } else {
                    this.f13692t.f13662a.add(this.f13691s.itemView);
                    this.f13717l = true;
                    int i = this.f13690r;
                    if (i > 0) {
                        this.f13692t.mo12707a((C5323i) this, i);
                    }
                }
                ItemTouchHelper itemTouchHelper2 = this.f13692t;
                View view = itemTouchHelper2.f13685x;
                View view2 = this.f13691s.itemView;
                if (view == view2) {
                    itemTouchHelper2.mo12702a(view2);
                }
            }
        }
    }

    /* renamed from: app.zenly.locator.recommendation.swipeable.touchhelper.ItemTouchHelper$d */
    class C5316d implements Runnable {

        /* renamed from: e */
        final /* synthetic */ C5323i f13693e;

        /* renamed from: f */
        final /* synthetic */ int f13694f;

        C5316d(C5323i iVar, int i) {
            this.f13693e = iVar;
            this.f13694f = i;
        }

        public void run() {
            RecyclerView recyclerView = ItemTouchHelper.this.f13679r;
            if (recyclerView != null && recyclerView.isAttachedToWindow()) {
                C5323i iVar = this.f13693e;
                if (!iVar.f13720o && iVar.f13710e.getAdapterPosition() != -1) {
                    ItemAnimator itemAnimator = ItemTouchHelper.this.f13679r.getItemAnimator();
                    if ((itemAnimator == null || !itemAnimator.isRunning(null)) && !ItemTouchHelper.this.mo12709a()) {
                        ItemTouchHelper.this.f13674m.mo12694b(this.f13693e.f13710e, this.f13694f);
                    } else {
                        ItemTouchHelper.this.f13679r.post(this);
                    }
                }
            }
        }
    }

    /* renamed from: app.zenly.locator.recommendation.swipeable.touchhelper.ItemTouchHelper$e */
    class C5317e implements ChildDrawingOrderCallback {
        C5317e() {
        }

        public int onGetChildDrawingOrder(int i, int i2) {
            ItemTouchHelper itemTouchHelper = ItemTouchHelper.this;
            View view = itemTouchHelper.f13685x;
            if (view == null) {
                return i2;
            }
            int i3 = itemTouchHelper.f13686y;
            if (i3 == -1) {
                i3 = itemTouchHelper.f13679r.indexOfChild(view);
                ItemTouchHelper.this.f13686y = i3;
            }
            if (i2 == i - 1) {
                return i3;
            }
            if (i2 >= i3) {
                i2++;
            }
            return i2;
        }
    }

    /* renamed from: app.zenly.locator.recommendation.swipeable.touchhelper.ItemTouchHelper$f */
    class C5318f extends C5323i {

        /* renamed from: r */
        final /* synthetic */ C1085v f13697r;

        /* renamed from: s */
        final /* synthetic */ int f13698s;

        /* renamed from: t */
        final /* synthetic */ ItemTouchHelper f13699t;

        C5318f(ItemTouchHelper itemTouchHelper, C1085v vVar, int i, int i2, float f, float f2, float f3, float f4, C1085v vVar2, int i3) {
            this.f13699t = itemTouchHelper;
            this.f13697r = vVar2;
            this.f13698s = i3;
            super(vVar, i, i2, f, f2, f3, f4);
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (!this.f13720o) {
                this.f13699t.f13662a.add(this.f13697r.itemView);
                this.f13717l = true;
                this.f13699t.mo12707a((C5323i) this, this.f13698s);
                ItemTouchHelper itemTouchHelper = this.f13699t;
                View view = itemTouchHelper.f13685x;
                View view2 = this.f13697r.itemView;
                if (view == view2) {
                    itemTouchHelper.mo12702a(view2);
                }
            }
        }
    }

    /* renamed from: app.zenly.locator.recommendation.swipeable.touchhelper.ItemTouchHelper$g */
    public static abstract class C5319g {

        /* renamed from: b */
        private static final ItemTouchUIUtil f13700b = new C5325b();

        /* renamed from: c */
        private static final Interpolator f13701c = new C5320a();

        /* renamed from: d */
        private static final Interpolator f13702d = new C5321b();

        /* renamed from: a */
        private int f13703a = -1;

        /* renamed from: app.zenly.locator.recommendation.swipeable.touchhelper.ItemTouchHelper$g$a */
        static class C5320a implements Interpolator {
            C5320a() {
            }

            public float getInterpolation(float f) {
                return f * f * f * f * f;
            }
        }

        /* renamed from: app.zenly.locator.recommendation.swipeable.touchhelper.ItemTouchHelper$g$b */
        static class C5321b implements Interpolator {
            C5321b() {
            }

            public float getInterpolation(float f) {
                float f2 = f - 1.0f;
                return (f2 * f2 * f2 * f2 * f2) + 1.0f;
            }
        }

        /* renamed from: b */
        public static int m15060b(int i, int i2) {
            int i3;
            int i4 = i & 789516;
            if (i4 == 0) {
                return i;
            }
            int i5 = i & (~i4);
            if (i2 == 0) {
                i3 = i4 << 2;
            } else {
                int i6 = i4 << 1;
                i5 |= -789517 & i6;
                i3 = (i6 & 789516) << 2;
            }
            return i5 | i3;
        }

        /* renamed from: c */
        public static int m15061c(int i, int i2) {
            return i2 << (i * 8);
        }

        /* renamed from: d */
        public static int m15062d(int i, int i2) {
            return m15061c(2, i) | m15061c(1, i2) | m15061c(0, i2 | i);
        }

        /* renamed from: a */
        public float mo12718a(float f) {
            return f;
        }

        /* renamed from: a */
        public float mo12719a(C1085v vVar) {
            return 0.5f;
        }

        /* renamed from: a */
        public int mo12720a() {
            return 0;
        }

        /* renamed from: a */
        public int mo12721a(int i, int i2) {
            int i3;
            int i4 = i & 3158064;
            if (i4 == 0) {
                return i;
            }
            int i5 = i & (~i4);
            if (i2 == 0) {
                i3 = i4 >> 2;
            } else {
                int i6 = i4 >> 1;
                i5 |= -3158065 & i6;
                i3 = (i6 & 3158064) >> 2;
            }
            return i5 | i3;
        }

        /* renamed from: a */
        public abstract long mo12690a(RecyclerView recyclerView, int i, float f, float f2);

        /* JADX WARNING: Removed duplicated region for block: B:13:0x0056  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0078  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x009a  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public androidx.recyclerview.widget.RecyclerView.C1085v mo12723a(androidx.recyclerview.widget.RecyclerView.C1085v r15, java.util.List<androidx.recyclerview.widget.RecyclerView.C1085v> r16, int r17, int r18) {
            /*
                r14 = this;
                r0 = r15
                android.view.View r1 = r0.itemView
                int r1 = r1.getWidth()
                int r1 = r17 + r1
                android.view.View r2 = r0.itemView
                int r2 = r2.getHeight()
                int r2 = r18 + r2
                android.view.View r3 = r0.itemView
                int r3 = r3.getLeft()
                int r3 = r17 - r3
                android.view.View r4 = r0.itemView
                int r4 = r4.getTop()
                int r4 = r18 - r4
                int r5 = r16.size()
                r6 = 0
                r7 = -1
                r8 = 0
            L_0x0028:
                if (r8 >= r5) goto L_0x00be
                r9 = r16
                java.lang.Object r10 = r9.get(r8)
                androidx.recyclerview.widget.RecyclerView$v r10 = (androidx.recyclerview.widget.RecyclerView.C1085v) r10
                if (r3 <= 0) goto L_0x0053
                android.view.View r11 = r10.itemView
                int r11 = r11.getRight()
                int r11 = r11 - r1
                if (r11 >= 0) goto L_0x0053
                android.view.View r12 = r10.itemView
                int r12 = r12.getRight()
                android.view.View r13 = r0.itemView
                int r13 = r13.getRight()
                if (r12 <= r13) goto L_0x0053
                int r11 = java.lang.Math.abs(r11)
                if (r11 <= r7) goto L_0x0053
                r6 = r10
                goto L_0x0054
            L_0x0053:
                r11 = r7
            L_0x0054:
                if (r3 >= 0) goto L_0x0076
                android.view.View r7 = r10.itemView
                int r7 = r7.getLeft()
                int r7 = r7 - r17
                if (r7 <= 0) goto L_0x0076
                android.view.View r12 = r10.itemView
                int r12 = r12.getLeft()
                android.view.View r13 = r0.itemView
                int r13 = r13.getLeft()
                if (r12 >= r13) goto L_0x0076
                int r7 = java.lang.Math.abs(r7)
                if (r7 <= r11) goto L_0x0076
                r11 = r7
                r6 = r10
            L_0x0076:
                if (r4 >= 0) goto L_0x0098
                android.view.View r7 = r10.itemView
                int r7 = r7.getTop()
                int r7 = r7 - r18
                if (r7 <= 0) goto L_0x0098
                android.view.View r12 = r10.itemView
                int r12 = r12.getTop()
                android.view.View r13 = r0.itemView
                int r13 = r13.getTop()
                if (r12 >= r13) goto L_0x0098
                int r7 = java.lang.Math.abs(r7)
                if (r7 <= r11) goto L_0x0098
                r11 = r7
                r6 = r10
            L_0x0098:
                if (r4 <= 0) goto L_0x00b9
                android.view.View r7 = r10.itemView
                int r7 = r7.getBottom()
                int r7 = r7 - r2
                if (r7 >= 0) goto L_0x00b9
                android.view.View r12 = r10.itemView
                int r12 = r12.getBottom()
                android.view.View r13 = r0.itemView
                int r13 = r13.getBottom()
                if (r12 <= r13) goto L_0x00b9
                int r7 = java.lang.Math.abs(r7)
                if (r7 <= r11) goto L_0x00b9
                r6 = r10
                goto L_0x00ba
            L_0x00b9:
                r7 = r11
            L_0x00ba:
                int r8 = r8 + 1
                goto L_0x0028
            L_0x00be:
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.recommendation.swipeable.touchhelper.ItemTouchHelper.C5319g.mo12723a(androidx.recyclerview.widget.RecyclerView$v, java.util.List, int, int):androidx.recyclerview.widget.RecyclerView$v");
        }

        /* renamed from: a */
        public boolean mo12727a(RecyclerView recyclerView, C1085v vVar, C1085v vVar2) {
            return true;
        }

        /* renamed from: b */
        public float mo12728b(float f) {
            return f;
        }

        /* renamed from: b */
        public abstract float mo12693b(C1085v vVar);

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final int mo12729b(RecyclerView recyclerView, C1085v vVar) {
            return mo12721a(mo12696c(recyclerView, vVar), ViewCompat.m2862o(recyclerView));
        }

        /* renamed from: b */
        public abstract void mo12694b(C1085v vVar, int i);

        /* renamed from: b */
        public boolean mo12732b() {
            return true;
        }

        /* renamed from: b */
        public abstract boolean mo12695b(RecyclerView recyclerView, C1085v vVar, C1085v vVar2);

        /* renamed from: c */
        public abstract int mo12696c(RecyclerView recyclerView, C1085v vVar);

        /* renamed from: c */
        public boolean mo12733c() {
            return true;
        }

        /* renamed from: d */
        public abstract int mo12697d(RecyclerView recyclerView, C1085v vVar);

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public boolean mo12734e(RecyclerView recyclerView, C1085v vVar) {
            return (mo12729b(recyclerView, vVar) & 16711680) != 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public boolean mo12735f(RecyclerView recyclerView, C1085v vVar) {
            return (mo12729b(recyclerView, vVar) & 65280) != 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo12731b(Canvas canvas, RecyclerView recyclerView, C1085v vVar, List<C5323i> list, int i, float f, float f2) {
            Canvas canvas2 = canvas;
            List<C5323i> list2 = list;
            int size = list.size();
            boolean z = false;
            for (int i2 = 0; i2 < size; i2++) {
                C5323i iVar = (C5323i) list2.get(i2);
                int save = canvas.save();
                mo12730b(canvas, recyclerView, iVar.f13710e, iVar.f13718m, iVar.f13719n, iVar.f13711f, false);
                canvas.restoreToCount(save);
            }
            if (vVar != null) {
                int save2 = canvas.save();
                mo12730b(canvas, recyclerView, vVar, f, f2, i, true);
                canvas.restoreToCount(save2);
            }
            for (int i3 = size - 1; i3 >= 0; i3--) {
                C5323i iVar2 = (C5323i) list2.get(i3);
                if (iVar2.f13721p && !iVar2.f13717l) {
                    list2.remove(i3);
                } else if (!iVar2.f13721p) {
                    z = true;
                }
            }
            if (z) {
                recyclerView.invalidate();
            }
        }

        /* renamed from: b */
        public void mo12730b(Canvas canvas, RecyclerView recyclerView, C1085v vVar, float f, float f2, int i, boolean z) {
            f13700b.onDrawOver(canvas, recyclerView, vVar.itemView, f, f2, i, z);
        }

        /* renamed from: a */
        public void mo12725a(C1085v vVar, int i) {
            if (vVar != null) {
                f13700b.onSelected(vVar.itemView);
            }
        }

        /* renamed from: a */
        private int m15059a(RecyclerView recyclerView) {
            if (this.f13703a == -1) {
                this.f13703a = recyclerView.getResources().getDimensionPixelSize(R.dimen.item_touch_helper_max_drag_scroll_per_frame);
            }
            return this.f13703a;
        }

        /* renamed from: a */
        public void mo12726a(RecyclerView recyclerView, C1085v vVar, int i, C1085v vVar2, int i2, int i3, int i4) {
            LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof ViewDropHandler) {
                ((ViewDropHandler) layoutManager).prepareForDrop(vVar.itemView, vVar2.itemView, i3, i4);
                return;
            }
            if (layoutManager.mo4994a()) {
                if (layoutManager.mo5282f(vVar2.itemView) <= recyclerView.getPaddingLeft()) {
                    recyclerView.mo5096g(i2);
                }
                if (layoutManager.mo5292i(vVar2.itemView) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                    recyclerView.mo5096g(i2);
                }
            }
            if (layoutManager.mo4999b()) {
                if (layoutManager.mo5294j(vVar2.itemView) <= recyclerView.getPaddingTop()) {
                    recyclerView.mo5096g(i2);
                }
                if (layoutManager.mo5279e(vVar2.itemView) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                    recyclerView.mo5096g(i2);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo12724a(Canvas canvas, RecyclerView recyclerView, C1085v vVar, List<C5323i> list, int i, float f, float f2) {
            Canvas canvas2 = canvas;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                C5323i iVar = (C5323i) list.get(i2);
                iVar.mo12746c();
                int save = canvas.save();
                mo12691a(canvas, recyclerView, iVar.f13710e, iVar.f13718m, iVar.f13719n, iVar.f13711f, false);
                canvas.restoreToCount(save);
            }
            if (vVar != null) {
                int save2 = canvas.save();
                mo12691a(canvas, recyclerView, vVar, f, f2, i, true);
                canvas.restoreToCount(save2);
            }
        }

        /* renamed from: a */
        public void mo12692a(RecyclerView recyclerView, C1085v vVar) {
            f13700b.clearView(vVar.itemView);
        }

        /* renamed from: a */
        public void mo12691a(Canvas canvas, RecyclerView recyclerView, C1085v vVar, float f, float f2, int i, boolean z) {
            f13700b.onDraw(canvas, recyclerView, vVar.itemView, f, f2, i, z);
        }

        /* renamed from: a */
        public int mo12722a(RecyclerView recyclerView, int i, int i2, int i3, long j) {
            float f = 1.0f;
            int signum = (int) (((float) (((int) Math.signum((float) i2)) * m15059a(recyclerView))) * f13702d.getInterpolation(Math.min(1.0f, (((float) Math.abs(i2)) * 1.0f) / ((float) i))));
            if (j <= 2000) {
                f = ((float) j) / 2000.0f;
            }
            int interpolation = (int) (((float) signum) * f13701c.getInterpolation(f));
            if (interpolation == 0) {
                return i2 > 0 ? 1 : -1;
            }
            return interpolation;
        }
    }

    /* renamed from: app.zenly.locator.recommendation.swipeable.touchhelper.ItemTouchHelper$h */
    private class C5322h extends SimpleOnGestureListener {

        /* renamed from: e */
        private boolean f13704e = true;

        C5322h() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo12738a() {
            this.f13704e = false;
        }

        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        public void onLongPress(MotionEvent motionEvent) {
            if (this.f13704e) {
                View b = ItemTouchHelper.this.mo12710b(motionEvent);
                if (b != null) {
                    C1085v g = ItemTouchHelper.this.f13679r.mo5094g(b);
                    if (g != null) {
                        ItemTouchHelper itemTouchHelper = ItemTouchHelper.this;
                        if (itemTouchHelper.f13674m.mo12734e(itemTouchHelper.f13679r, g)) {
                            int pointerId = motionEvent.getPointerId(0);
                            int i = ItemTouchHelper.this.f13673l;
                            if (pointerId == i) {
                                int findPointerIndex = motionEvent.findPointerIndex(i);
                                float x = motionEvent.getX(findPointerIndex);
                                float y = motionEvent.getY(findPointerIndex);
                                ItemTouchHelper itemTouchHelper2 = ItemTouchHelper.this;
                                itemTouchHelper2.f13665d = x;
                                itemTouchHelper2.f13666e = y;
                                itemTouchHelper2.f13670i = 0.0f;
                                itemTouchHelper2.f13669h = 0.0f;
                                if (itemTouchHelper2.f13674m.mo12733c()) {
                                    ItemTouchHelper.this.mo12704a(g, 2);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: app.zenly.locator.recommendation.swipeable.touchhelper.ItemTouchHelper$i */
    static class C5323i implements AnimatorListener {

        /* renamed from: a */
        final float f13706a;

        /* renamed from: b */
        final float f13707b;

        /* renamed from: c */
        final float f13708c;

        /* renamed from: d */
        final float f13709d;

        /* renamed from: e */
        final C1085v f13710e;

        /* renamed from: f */
        final int f13711f;

        /* renamed from: g */
        private ValueAnimator f13712g;

        /* renamed from: h */
        private DynamicAnimation f13713h;

        /* renamed from: i */
        private final C0728d f13714i = new C0728d();

        /* renamed from: j */
        private final C0728d f13715j = new C0728d();

        /* renamed from: k */
        private DynamicAnimation f13716k;

        /* renamed from: l */
        protected boolean f13717l;

        /* renamed from: m */
        float f13718m;

        /* renamed from: n */
        float f13719n;

        /* renamed from: o */
        boolean f13720o = false;

        /* renamed from: p */
        boolean f13721p = false;

        /* renamed from: q */
        private float f13722q;

        C5323i(C1085v vVar, int i, int i2, float f, float f2, float f3, float f4) {
            this.f13711f = i2;
            this.f13710e = vVar;
            this.f13706a = f;
            this.f13707b = f2;
            this.f13708c = f3;
            this.f13709d = f4;
            if (f3 == 0.0f && f4 == 0.0f) {
                C0731g gVar = new C0731g();
                gVar.mo3684c(200.0f);
                gVar.mo3680a(0.75f);
                C0730f fVar = new C0730f(this.f13714i);
                fVar.mo3672a(gVar);
                fVar.mo3620c(0.002f);
                C0730f fVar2 = fVar;
                fVar2.mo3624e(this.f13706a);
                C0730f fVar3 = fVar2;
                fVar3.mo3677g(this.f13708c);
                this.f13713h = fVar3;
                C0730f fVar4 = new C0730f(this.f13715j);
                fVar4.mo3672a(gVar);
                fVar4.mo3620c(0.002f);
                C0730f fVar5 = fVar4;
                fVar5.mo3624e(this.f13707b);
                C0730f fVar6 = fVar5;
                fVar6.mo3677g(this.f13709d);
                this.f13716k = fVar6;
                return;
            }
            this.f13713h = new C0725b(this.f13714i);
            this.f13712g = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            this.f13712g.addUpdateListener(new C5324a(this));
            this.f13712g.setTarget(vVar.itemView);
            this.f13712g.addListener(this);
            mo12742a(0.0f);
        }

        /* renamed from: a */
        public /* synthetic */ void mo12744a(ValueAnimator valueAnimator) {
            mo12742a(valueAnimator.getAnimatedFraction());
        }

        /* renamed from: b */
        public void mo12745b() {
            this.f13710e.setIsRecyclable(false);
            ValueAnimator valueAnimator = this.f13712g;
            if (valueAnimator != null) {
                valueAnimator.start();
                return;
            }
            this.f13713h.mo3622d();
            this.f13716k.mo3622d();
        }

        /* renamed from: c */
        public void mo12746c() {
            float f = this.f13706a;
            float f2 = this.f13708c;
            if (f == f2) {
                this.f13718m = this.f13710e.itemView.getTranslationX();
            } else if (this.f13712g != null) {
                this.f13718m = f + (this.f13722q * (f2 - f));
            } else {
                this.f13718m = this.f13714i.mo3670a();
            }
            float f3 = this.f13707b;
            float f4 = this.f13709d;
            if (f3 == f4) {
                this.f13719n = this.f13710e.itemView.getTranslationY();
            } else if (this.f13712g != null) {
                this.f13719n = f3 + (this.f13722q * (f4 - f3));
            } else {
                this.f13719n = this.f13715j.mo3670a();
            }
        }

        public void onAnimationCancel(Animator animator) {
            mo12742a(1.0f);
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f13721p) {
                this.f13710e.setIsRecyclable(true);
            }
            this.f13721p = true;
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }

        /* renamed from: a */
        public void mo12743a(long j) {
            ValueAnimator valueAnimator = this.f13712g;
            if (valueAnimator != null) {
                valueAnimator.setDuration(j);
            }
        }

        /* renamed from: a */
        public void mo12741a() {
            ValueAnimator valueAnimator = this.f13712g;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                return;
            }
            this.f13713h.mo3615a();
            this.f13716k.mo3615a();
        }

        /* renamed from: a */
        public void mo12742a(float f) {
            this.f13722q = f;
        }
    }

    public ItemTouchHelper(C5319g gVar) {
        this.f13674m = gVar;
    }

    /* renamed from: a */
    private static boolean m15031a(View view, float f, float f2, float f3, float f4) {
        return f >= f3 && f <= f3 + ((float) view.getWidth()) && f2 >= f4 && f2 <= f4 + ((float) view.getHeight());
    }

    /* renamed from: d */
    private int m15036d(C1085v vVar) {
        if (this.f13675n == 2) {
            return 0;
        }
        int d = this.f13674m.mo12697d(this.f13679r, vVar);
        int a = (this.f13674m.mo12721a(d, ViewCompat.m2862o(this.f13679r)) & 65280) >> 8;
        if (a == 0) {
            return 0;
        }
        int i = (d & 65280) >> 8;
        if (Math.abs(this.f13669h) > Math.abs(this.f13670i)) {
            int b = m15032b(vVar, a);
            if (b > 0) {
                return (i & b) == 0 ? C5319g.m15060b(b, ViewCompat.m2862o(this.f13679r)) : b;
            }
            int c = m15033c(vVar, a);
            if (c > 0) {
                return c;
            }
        } else {
            int c2 = m15033c(vVar, a);
            if (c2 > 0) {
                return c2;
            }
            int b2 = m15032b(vVar, a);
            if (b2 > 0) {
                if ((i & b2) == 0) {
                    b2 = C5319g.m15060b(b2, ViewCompat.m2862o(this.f13679r));
                }
                return b2;
            }
        }
        return 0;
    }

    /* renamed from: e */
    private void m15038e() {
        this.f13679r.mo5065b((C1074l) this);
        this.f13679r.mo5064b(this.f13659B);
        this.f13679r.mo5063b((OnChildAttachStateChangeListener) this);
        for (int size = this.f13677p.size() - 1; size >= 0; size--) {
            this.f13674m.mo12692a(this.f13679r, ((C5323i) this.f13677p.get(0)).f13710e);
        }
        this.f13677p.clear();
        this.f13685x = null;
        this.f13686y = -1;
        m15039f();
        m15042i();
    }

    /* renamed from: f */
    private void m15039f() {
        VelocityTracker velocityTracker = this.f13681t;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f13681t = null;
        }
    }

    /* renamed from: g */
    private void m15040g() {
        this.f13678q = ViewConfiguration.get(this.f13679r.getContext()).getScaledTouchSlop();
        this.f13679r.mo5045a((C1074l) this);
        this.f13679r.mo5043a(this.f13659B);
        this.f13679r.mo5042a((OnChildAttachStateChangeListener) this);
        m15041h();
    }

    /* renamed from: h */
    private void m15041h() {
        this.f13658A = new C5322h();
        this.f13687z = new C0636b(this.f13679r.getContext(), this.f13658A);
    }

    /* renamed from: i */
    private void m15042i() {
        C5322h hVar = this.f13658A;
        if (hVar != null) {
            hVar.mo12738a();
            this.f13658A = null;
        }
        if (this.f13687z != null) {
            this.f13687z = null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo12711b() {
        VelocityTracker velocityTracker = this.f13681t;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.f13681t = VelocityTracker.obtain();
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00c5, code lost:
        if (r1 > 0) goto L_0x00c9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0104 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0110  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo12713c() {
        /*
            r16 = this;
            r0 = r16
            androidx.recyclerview.widget.RecyclerView$v r1 = r0.f13664c
            r2 = 0
            r3 = -9223372036854775808
            if (r1 != 0) goto L_0x000c
            r0.f13661D = r3
            return r2
        L_0x000c:
            long r5 = java.lang.System.currentTimeMillis()
            long r7 = r0.f13661D
            int r1 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x0019
            r7 = 0
            goto L_0x001b
        L_0x0019:
            long r7 = r5 - r7
        L_0x001b:
            androidx.recyclerview.widget.RecyclerView r1 = r0.f13679r
            androidx.recyclerview.widget.RecyclerView$LayoutManager r1 = r1.getLayoutManager()
            android.graphics.Rect r9 = r0.f13660C
            if (r9 != 0) goto L_0x002c
            android.graphics.Rect r9 = new android.graphics.Rect
            r9.<init>()
            r0.f13660C = r9
        L_0x002c:
            androidx.recyclerview.widget.RecyclerView$v r9 = r0.f13664c
            android.view.View r9 = r9.itemView
            android.graphics.Rect r10 = r0.f13660C
            r1.mo5228a(r9, r10)
            boolean r9 = r1.mo4994a()
            r10 = 0
            if (r9 == 0) goto L_0x007f
            float r9 = r0.f13671j
            float r11 = r0.f13669h
            float r9 = r9 + r11
            int r9 = (int) r9
            android.graphics.Rect r11 = r0.f13660C
            int r11 = r11.left
            int r11 = r9 - r11
            androidx.recyclerview.widget.RecyclerView r12 = r0.f13679r
            int r12 = r12.getPaddingLeft()
            int r11 = r11 - r12
            float r12 = r0.f13669h
            int r12 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r12 >= 0) goto L_0x0059
            if (r11 >= 0) goto L_0x0059
            r12 = r11
            goto L_0x0080
        L_0x0059:
            float r11 = r0.f13669h
            int r11 = (r11 > r10 ? 1 : (r11 == r10 ? 0 : -1))
            if (r11 <= 0) goto L_0x007f
            androidx.recyclerview.widget.RecyclerView$v r11 = r0.f13664c
            android.view.View r11 = r11.itemView
            int r11 = r11.getWidth()
            int r9 = r9 + r11
            android.graphics.Rect r11 = r0.f13660C
            int r11 = r11.right
            int r9 = r9 + r11
            androidx.recyclerview.widget.RecyclerView r11 = r0.f13679r
            int r11 = r11.getWidth()
            androidx.recyclerview.widget.RecyclerView r12 = r0.f13679r
            int r12 = r12.getPaddingRight()
            int r11 = r11 - r12
            int r9 = r9 - r11
            if (r9 <= 0) goto L_0x007f
            r12 = r9
            goto L_0x0080
        L_0x007f:
            r12 = 0
        L_0x0080:
            boolean r1 = r1.mo4999b()
            if (r1 == 0) goto L_0x00c8
            float r1 = r0.f13672k
            float r9 = r0.f13670i
            float r1 = r1 + r9
            int r1 = (int) r1
            android.graphics.Rect r9 = r0.f13660C
            int r9 = r9.top
            int r9 = r1 - r9
            androidx.recyclerview.widget.RecyclerView r11 = r0.f13679r
            int r11 = r11.getPaddingTop()
            int r9 = r9 - r11
            float r11 = r0.f13670i
            int r11 = (r11 > r10 ? 1 : (r11 == r10 ? 0 : -1))
            if (r11 >= 0) goto L_0x00a3
            if (r9 >= 0) goto L_0x00a3
            r1 = r9
            goto L_0x00c9
        L_0x00a3:
            float r9 = r0.f13670i
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 <= 0) goto L_0x00c8
            androidx.recyclerview.widget.RecyclerView$v r9 = r0.f13664c
            android.view.View r9 = r9.itemView
            int r9 = r9.getHeight()
            int r1 = r1 + r9
            android.graphics.Rect r9 = r0.f13660C
            int r9 = r9.bottom
            int r1 = r1 + r9
            androidx.recyclerview.widget.RecyclerView r9 = r0.f13679r
            int r9 = r9.getHeight()
            androidx.recyclerview.widget.RecyclerView r10 = r0.f13679r
            int r10 = r10.getPaddingBottom()
            int r9 = r9 - r10
            int r1 = r1 - r9
            if (r1 <= 0) goto L_0x00c8
            goto L_0x00c9
        L_0x00c8:
            r1 = 0
        L_0x00c9:
            if (r12 == 0) goto L_0x00e2
            app.zenly.locator.recommendation.swipeable.touchhelper.ItemTouchHelper$g r9 = r0.f13674m
            androidx.recyclerview.widget.RecyclerView r10 = r0.f13679r
            androidx.recyclerview.widget.RecyclerView$v r11 = r0.f13664c
            android.view.View r11 = r11.itemView
            int r11 = r11.getWidth()
            androidx.recyclerview.widget.RecyclerView r13 = r0.f13679r
            int r13 = r13.getWidth()
            r14 = r7
            int r12 = r9.mo12722a(r10, r11, r12, r13, r14)
        L_0x00e2:
            r14 = r12
            if (r1 == 0) goto L_0x0101
            app.zenly.locator.recommendation.swipeable.touchhelper.ItemTouchHelper$g r9 = r0.f13674m
            androidx.recyclerview.widget.RecyclerView r10 = r0.f13679r
            androidx.recyclerview.widget.RecyclerView$v r11 = r0.f13664c
            android.view.View r11 = r11.itemView
            int r11 = r11.getHeight()
            androidx.recyclerview.widget.RecyclerView r12 = r0.f13679r
            int r13 = r12.getHeight()
            r12 = r1
            r1 = r14
            r14 = r7
            int r7 = r9.mo12722a(r10, r11, r12, r13, r14)
            r12 = r1
            r1 = r7
            goto L_0x0102
        L_0x0101:
            r12 = r14
        L_0x0102:
            if (r12 != 0) goto L_0x010a
            if (r1 == 0) goto L_0x0107
            goto L_0x010a
        L_0x0107:
            r0.f13661D = r3
            return r2
        L_0x010a:
            long r7 = r0.f13661D
            int r2 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x0112
            r0.f13661D = r5
        L_0x0112:
            androidx.recyclerview.widget.RecyclerView r2 = r0.f13679r
            r2.scrollBy(r12, r1)
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.recommendation.swipeable.touchhelper.ItemTouchHelper.mo12713c():boolean");
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1082s sVar) {
        rect.setEmpty();
    }

    public void onChildViewAttachedToWindow(View view) {
    }

    public void onChildViewDetachedFromWindow(View view) {
        mo12702a(view);
        C1085v g = this.f13679r.mo5094g(view);
        if (g != null) {
            C1085v vVar = this.f13664c;
            if (vVar == null || g != vVar) {
                mo12705a(g, false);
                if (this.f13662a.remove(g.itemView)) {
                    this.f13674m.mo12692a(this.f13679r, g);
                }
            } else {
                mo12704a((C1085v) null, 0);
            }
        }
    }

    public void onDraw(Canvas canvas, RecyclerView recyclerView, C1082s sVar) {
        float f;
        float f2;
        this.f13686y = -1;
        if (this.f13664c != null) {
            mo12708a(this.f13663b);
            float[] fArr = this.f13663b;
            float f3 = fArr[0];
            f = fArr[1];
            f2 = f3;
        } else {
            f2 = 0.0f;
            f = 0.0f;
        }
        this.f13674m.mo12724a(canvas, recyclerView, this.f13664c, this.f13677p, this.f13675n, f2, f);
    }

    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, C1082s sVar) {
        float f;
        float f2;
        if (this.f13664c != null) {
            mo12708a(this.f13663b);
            float[] fArr = this.f13663b;
            float f3 = fArr[0];
            f = fArr[1];
            f2 = f3;
        } else {
            f2 = 0.0f;
            f = 0.0f;
        }
        this.f13674m.mo12731b(canvas, recyclerView, this.f13664c, this.f13677p, this.f13675n, f2, f);
    }

    /* renamed from: a */
    public void mo12706a(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f13679r;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                m15038e();
            }
            this.f13679r = recyclerView;
            if (recyclerView != null) {
                Resources resources = recyclerView.getResources();
                this.f13667f = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_velocity);
                this.f13668g = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_max_velocity);
                m15040g();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public View mo12710b(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        C1085v vVar = this.f13664c;
        if (vVar != null) {
            View view = vVar.itemView;
            if (m15031a(view, x, y, this.f13671j + this.f13669h, this.f13672k + this.f13670i)) {
                return view;
            }
        }
        for (int size = this.f13677p.size() - 1; size >= 0; size--) {
            C5323i iVar = (C5323i) this.f13677p.get(size);
            View view2 = iVar.f13710e.itemView;
            if (m15031a(view2, x, y, iVar.f13718m, iVar.f13719n)) {
                return view2;
            }
        }
        return this.f13679r.mo5028a(x, y);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo12708a(float[] fArr) {
        if ((this.f13676o & 12) != 0) {
            fArr[0] = (this.f13671j + this.f13669h) - ((float) this.f13664c.itemView.getLeft());
        } else {
            fArr[0] = this.f13664c.itemView.getTranslationX();
        }
        if ((this.f13676o & 3) != 0) {
            fArr[1] = (this.f13672k + this.f13670i) - ((float) this.f13664c.itemView.getTop());
        } else {
            fArr[1] = this.f13664c.itemView.getTranslationY();
        }
    }

    /* renamed from: b */
    public void mo12712b(C1085v vVar) {
        String str = "ItemTouchHelper";
        if (!this.f13674m.mo12735f(this.f13679r, vVar)) {
            Log.e(str, "Start swipe has been called but swiping is not enabled");
        } else if (vVar.itemView.getParent() != this.f13679r) {
            Log.e(str, "Start swipe has been called with a view holder which is not a child of the RecyclerView controlled by this ItemTouchHelper.");
        } else {
            mo12711b();
            this.f13670i = 0.0f;
            this.f13669h = 0.0f;
            mo12704a(vVar, 1);
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0145  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo12704a(androidx.recyclerview.widget.RecyclerView.C1085v r23, int r24) {
        /*
            r22 = this;
            r11 = r22
            r12 = r23
            r13 = r24
            androidx.recyclerview.widget.RecyclerView$v r0 = r11.f13664c
            if (r12 != r0) goto L_0x000f
            int r0 = r11.f13675n
            if (r13 != r0) goto L_0x000f
            return
        L_0x000f:
            r0 = -9223372036854775808
            r11.f13661D = r0
            int r4 = r11.f13675n
            r14 = 1
            r11.mo12705a(r12, r14)
            r11.f13675n = r13
            r15 = 2
            if (r13 != r15) goto L_0x0030
            if (r12 == 0) goto L_0x0028
            android.view.View r0 = r12.itemView
            r11.f13685x = r0
            r22.m15037d()
            goto L_0x0030
        L_0x0028:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Must pass a ViewHolder when dragging"
            r0.<init>(r1)
            throw r0
        L_0x0030:
            int r0 = r13 * 8
            r10 = 8
            int r0 = r0 + r10
            int r0 = r14 << r0
            int r16 = r0 + -1
            androidx.recyclerview.widget.RecyclerView$v r9 = r11.f13664c
            r8 = 0
            if (r9 == 0) goto L_0x00fd
            android.view.View r0 = r9.itemView
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == 0) goto L_0x00e9
            if (r4 != r15) goto L_0x004a
            r7 = 0
            goto L_0x004f
        L_0x004a:
            int r0 = r11.m15036d(r9)
            r7 = r0
        L_0x004f:
            android.view.VelocityTracker r0 = r11.f13681t
            float r17 = r0.getXVelocity()
            r22.m15039f()
            r0 = 4
            r1 = 0
            if (r7 == r14) goto L_0x0081
            if (r7 == r15) goto L_0x0081
            if (r7 == r0) goto L_0x006f
            if (r7 == r10) goto L_0x006f
            r2 = 16
            if (r7 == r2) goto L_0x006f
            r2 = 32
            if (r7 == r2) goto L_0x006f
            r18 = 0
        L_0x006c:
            r19 = 0
            goto L_0x0094
        L_0x006f:
            float r2 = r11.f13669h
            float r2 = java.lang.Math.signum(r2)
            androidx.recyclerview.widget.RecyclerView r3 = r11.f13679r
            int r3 = r3.getWidth()
            float r3 = (float) r3
            float r2 = r2 * r3
            r18 = r2
            goto L_0x006c
        L_0x0081:
            float r2 = r11.f13670i
            float r2 = java.lang.Math.signum(r2)
            androidx.recyclerview.widget.RecyclerView r3 = r11.f13679r
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r2 = r2 * r3
            r19 = r2
            r18 = 0
        L_0x0094:
            if (r4 != r15) goto L_0x0099
            r3 = 8
            goto L_0x009e
        L_0x0099:
            if (r7 <= 0) goto L_0x009d
            r3 = 2
            goto L_0x009e
        L_0x009d:
            r3 = 4
        L_0x009e:
            float[] r0 = r11.f13663b
            r11.mo12708a(r0)
            float[] r0 = r11.f13663b
            r20 = r0[r8]
            r6 = r0[r14]
            app.zenly.locator.recommendation.swipeable.touchhelper.ItemTouchHelper$c r5 = new app.zenly.locator.recommendation.swipeable.touchhelper.ItemTouchHelper$c
            r0 = r5
            r1 = r22
            r2 = r9
            r14 = r5
            r5 = r20
            r21 = r7
            r7 = r18
            r8 = r19
            r19 = r9
            r9 = r21
            r21 = 8
            r10 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            float r18 = r18 - r20
            float r18 = r18 / r17
            float r0 = java.lang.Math.abs(r18)
            r1 = 1148846080(0x447a0000, float:1000.0)
            float r0 = r0 * r1
            long r0 = (long) r0
            r2 = 250(0xfa, double:1.235E-321)
            r4 = 100
            long r0 = java.lang.Math.max(r4, r0)
            long r0 = java.lang.Math.min(r2, r0)
            r14.mo12743a(r0)
            java.util.List<app.zenly.locator.recommendation.swipeable.touchhelper.ItemTouchHelper$i> r0 = r11.f13677p
            r0.add(r14)
            r14.mo12745b()
            r8 = 1
            goto L_0x00f9
        L_0x00e9:
            r0 = r9
            r21 = 8
            android.view.View r1 = r0.itemView
            r11.mo12702a(r1)
            app.zenly.locator.recommendation.swipeable.touchhelper.ItemTouchHelper$g r1 = r11.f13674m
            androidx.recyclerview.widget.RecyclerView r2 = r11.f13679r
            r1.mo12692a(r2, r0)
            r8 = 0
        L_0x00f9:
            r0 = 0
            r11.f13664c = r0
            goto L_0x0100
        L_0x00fd:
            r21 = 8
            r8 = 0
        L_0x0100:
            if (r12 == 0) goto L_0x0132
            app.zenly.locator.recommendation.swipeable.touchhelper.ItemTouchHelper$g r0 = r11.f13674m
            androidx.recyclerview.widget.RecyclerView r1 = r11.f13679r
            int r0 = r0.mo12729b(r1, r12)
            r0 = r0 & r16
            int r1 = r11.f13675n
            int r1 = r1 * 8
            int r0 = r0 >> r1
            r11.f13676o = r0
            android.view.View r0 = r12.itemView
            int r0 = r0.getLeft()
            float r0 = (float) r0
            r11.f13671j = r0
            android.view.View r0 = r12.itemView
            int r0 = r0.getTop()
            float r0 = (float) r0
            r11.f13672k = r0
            r11.f13664c = r12
            if (r13 != r15) goto L_0x0132
            androidx.recyclerview.widget.RecyclerView$v r0 = r11.f13664c
            android.view.View r0 = r0.itemView
            r1 = 0
            r0.performHapticFeedback(r1)
            goto L_0x0133
        L_0x0132:
            r1 = 0
        L_0x0133:
            androidx.recyclerview.widget.RecyclerView r0 = r11.f13679r
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == 0) goto L_0x0143
            androidx.recyclerview.widget.RecyclerView$v r2 = r11.f13664c
            if (r2 == 0) goto L_0x0140
            r1 = 1
        L_0x0140:
            r0.requestDisallowInterceptTouchEvent(r1)
        L_0x0143:
            if (r8 != 0) goto L_0x014e
            androidx.recyclerview.widget.RecyclerView r0 = r11.f13679r
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r0.getLayoutManager()
            r0.mo5218C()
        L_0x014e:
            app.zenly.locator.recommendation.swipeable.touchhelper.ItemTouchHelper$g r0 = r11.f13674m
            androidx.recyclerview.widget.RecyclerView$v r1 = r11.f13664c
            int r2 = r11.f13675n
            r0.mo12725a(r1, r2)
            androidx.recyclerview.widget.RecyclerView r0 = r11.f13679r
            r0.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.recommendation.swipeable.touchhelper.ItemTouchHelper.mo12704a(androidx.recyclerview.widget.RecyclerView$v, int):void");
    }

    /* renamed from: d */
    private void m15037d() {
        if (VERSION.SDK_INT < 21) {
            if (this.f13684w == null) {
                this.f13684w = new C5317e();
            }
            this.f13679r.setChildDrawingOrderCallback(this.f13684w);
        }
    }

    /* renamed from: b */
    private int m15032b(C1085v vVar, int i) {
        if ((i & 12) != 0) {
            int i2 = 8;
            int i3 = this.f13669h > 0.0f ? 8 : 4;
            VelocityTracker velocityTracker = this.f13681t;
            if (velocityTracker != null && this.f13673l > -1) {
                C5319g gVar = this.f13674m;
                float f = this.f13668g;
                gVar.mo12728b(f);
                velocityTracker.computeCurrentVelocity(C8733j.DEFAULT_IMAGE_TIMEOUT_MS, f);
                float xVelocity = this.f13681t.getXVelocity(this.f13673l);
                float yVelocity = this.f13681t.getYVelocity(this.f13673l);
                if (xVelocity <= 0.0f) {
                    i2 = 4;
                }
                float abs = Math.abs(xVelocity);
                if ((i2 & i) != 0 && i3 == i2) {
                    C5319g gVar2 = this.f13674m;
                    float f2 = this.f13667f;
                    gVar2.mo12718a(f2);
                    if (abs >= f2 && abs > Math.abs(yVelocity)) {
                        return i2;
                    }
                }
            }
            float width = ((float) this.f13679r.getWidth()) * this.f13674m.mo12693b(vVar);
            if ((i & i3) != 0 && Math.abs(this.f13669h) > width) {
                return i3;
            }
        }
        return 0;
    }

    /* renamed from: c */
    private List<C1085v> m15035c(C1085v vVar) {
        C1085v vVar2 = vVar;
        List<C1085v> list = this.f13682u;
        if (list == null) {
            this.f13682u = new ArrayList();
            this.f13683v = new ArrayList();
        } else {
            list.clear();
            this.f13683v.clear();
        }
        int a = this.f13674m.mo12720a();
        int round = Math.round(this.f13671j + this.f13669h) - a;
        int round2 = Math.round(this.f13672k + this.f13670i) - a;
        int i = a * 2;
        int width = vVar2.itemView.getWidth() + round + i;
        int height = vVar2.itemView.getHeight() + round2 + i;
        int i2 = (round + width) / 2;
        int i3 = (round2 + height) / 2;
        LayoutManager layoutManager = this.f13679r.getLayoutManager();
        int e = layoutManager.mo5278e();
        int i4 = 0;
        while (i4 < e) {
            View c = layoutManager.mo5265c(i4);
            if (c != vVar2.itemView && c.getBottom() >= round2 && c.getTop() <= height && c.getRight() >= round && c.getLeft() <= width) {
                C1085v g = this.f13679r.mo5094g(c);
                if (this.f13674m.mo12727a(this.f13679r, this.f13664c, g)) {
                    int abs = Math.abs(i2 - ((c.getLeft() + c.getRight()) / 2));
                    int abs2 = Math.abs(i3 - ((c.getTop() + c.getBottom()) / 2));
                    int i5 = (abs * abs) + (abs2 * abs2);
                    int size = this.f13682u.size();
                    int i6 = 0;
                    int i7 = 0;
                    while (i6 < size && i5 > ((Integer) this.f13683v.get(i6)).intValue()) {
                        i7++;
                        i6++;
                        C1085v vVar3 = vVar;
                    }
                    this.f13682u.add(i7, g);
                    this.f13683v.add(i7, Integer.valueOf(i5));
                }
            }
            i4++;
            vVar2 = vVar;
        }
        return this.f13682u;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo12707a(C5323i iVar, int i) {
        this.f13679r.post(new C5316d(iVar, i));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo12709a() {
        int size = this.f13677p.size();
        for (int i = 0; i < size; i++) {
            if (!((C5323i) this.f13677p.get(i)).f13721p) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo12703a(C1085v vVar) {
        if (!this.f13679r.isLayoutRequested() && this.f13675n == 2) {
            float a = this.f13674m.mo12719a(vVar);
            int i = (int) (this.f13671j + this.f13669h);
            int i2 = (int) (this.f13672k + this.f13670i);
            if (((float) Math.abs(i2 - vVar.itemView.getTop())) >= ((float) vVar.itemView.getHeight()) * a || ((float) Math.abs(i - vVar.itemView.getLeft())) >= ((float) vVar.itemView.getWidth()) * a) {
                List c = m15035c(vVar);
                if (c.size() != 0) {
                    C1085v a2 = this.f13674m.mo12723a(vVar, c, i, i2);
                    if (a2 == null) {
                        this.f13682u.clear();
                        this.f13683v.clear();
                        return;
                    }
                    int adapterPosition = a2.getAdapterPosition();
                    int adapterPosition2 = vVar.getAdapterPosition();
                    if (this.f13674m.mo12695b(this.f13679r, vVar, a2)) {
                        this.f13674m.mo12726a(this.f13679r, vVar, adapterPosition2, a2, adapterPosition, i, i2);
                    }
                }
            }
        }
    }

    /* renamed from: c */
    private C1085v m15034c(MotionEvent motionEvent) {
        LayoutManager layoutManager = this.f13679r.getLayoutManager();
        int i = this.f13673l;
        if (i == -1) {
            return null;
        }
        int findPointerIndex = motionEvent.findPointerIndex(i);
        float x = motionEvent.getX(findPointerIndex) - this.f13665d;
        float y = motionEvent.getY(findPointerIndex) - this.f13666e;
        float abs = Math.abs(x);
        float abs2 = Math.abs(y);
        int i2 = this.f13678q;
        if (abs < ((float) i2) && abs2 < ((float) i2)) {
            return null;
        }
        if (abs > abs2 && layoutManager.mo4994a()) {
            return null;
        }
        if (abs2 > abs && layoutManager.mo4999b()) {
            return null;
        }
        View b = mo12710b(motionEvent);
        if (b == null) {
            return null;
        }
        return this.f13679r.mo5094g(b);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo12705a(C1085v vVar, boolean z) {
        for (int size = this.f13677p.size() - 1; size >= 0; size--) {
            C5323i iVar = (C5323i) this.f13677p.get(size);
            if (iVar.f13710e == vVar) {
                iVar.f13720o |= z;
                if (!iVar.f13721p) {
                    iVar.mo12741a();
                }
                this.f13677p.remove(size);
                return;
            }
        }
    }

    /* renamed from: c */
    private int m15033c(C1085v vVar, int i) {
        if ((i & 3) != 0) {
            int i2 = 2;
            int i3 = this.f13670i > 0.0f ? 2 : 1;
            VelocityTracker velocityTracker = this.f13681t;
            if (velocityTracker != null && this.f13673l > -1) {
                C5319g gVar = this.f13674m;
                float f = this.f13668g;
                gVar.mo12728b(f);
                velocityTracker.computeCurrentVelocity(C8733j.DEFAULT_IMAGE_TIMEOUT_MS, f);
                float xVelocity = this.f13681t.getXVelocity(this.f13673l);
                float yVelocity = this.f13681t.getYVelocity(this.f13673l);
                if (yVelocity <= 0.0f) {
                    i2 = 1;
                }
                float abs = Math.abs(yVelocity);
                if ((i2 & i) != 0 && i2 == i3) {
                    C5319g gVar2 = this.f13674m;
                    float f2 = this.f13667f;
                    gVar2.mo12718a(f2);
                    if (abs >= f2 && abs > Math.abs(xVelocity)) {
                        return i2;
                    }
                }
            }
            float height = ((float) this.f13679r.getHeight()) * this.f13674m.mo12693b(vVar);
            if ((i & i3) != 0 && Math.abs(this.f13670i) > height) {
                return i3;
            }
        }
        return 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo12700a(int i, MotionEvent motionEvent, int i2) {
        if (this.f13664c == null && i == 2 && this.f13675n != 2 && this.f13674m.mo12732b() && this.f13679r.getScrollState() != 1) {
            C1085v c = m15034c(motionEvent);
            if (c != null) {
                int b = (this.f13674m.mo12729b(this.f13679r, c) & 65280) >> 8;
                if (b != 0) {
                    float x = motionEvent.getX(i2);
                    float f = x - this.f13665d;
                    float y = motionEvent.getY(i2) - this.f13666e;
                    float abs = Math.abs(f);
                    float abs2 = Math.abs(y);
                    int i3 = this.f13678q;
                    if (abs >= ((float) i3) || abs2 >= ((float) i3)) {
                        if (abs > abs2) {
                            if (f < 0.0f && (b & 4) == 0) {
                                return;
                            }
                            if (f > 0.0f && (b & 8) == 0) {
                                return;
                            }
                        } else if (y < 0.0f && (b & 1) == 0) {
                            return;
                        } else {
                            if (y > 0.0f && (2 & b) == 0) {
                                return;
                            }
                        }
                        if (this.f13664c == null) {
                            this.f13665d += f;
                            this.f13666e += y;
                        }
                        this.f13670i = 0.0f;
                        this.f13669h = 0.0f;
                        this.f13673l = motionEvent.getPointerId(0);
                        mo12704a(c, 1);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C5323i mo12698a(MotionEvent motionEvent) {
        if (this.f13677p.isEmpty()) {
            return null;
        }
        View b = mo12710b(motionEvent);
        for (int size = this.f13677p.size() - 1; size >= 0; size--) {
            C5323i iVar = (C5323i) this.f13677p.get(size);
            if (iVar.f13710e.itemView == b) {
                return iVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo12701a(MotionEvent motionEvent, int i, int i2) {
        float x = motionEvent.getX(i2);
        float y = motionEvent.getY(i2);
        this.f13669h = x - this.f13665d;
        this.f13670i = y - this.f13666e;
        float height = (float) ((View) this.f13679r.getParent()).getHeight();
        if (height > 0.0f) {
            this.f13670i = Math.signum(this.f13670i) * (1.0f - (1.0f / (((Math.abs(this.f13670i) * 0.55f) / height) + 1.0f))) * height;
        }
        if ((i & 4) == 0) {
            this.f13669h = Math.max(0.0f, this.f13669h);
        }
        if ((i & 8) == 0) {
            this.f13669h = Math.min(0.0f, this.f13669h);
        }
        if ((i & 1) == 0) {
            this.f13670i = Math.max(0.0f, this.f13670i);
        }
        if ((i & 2) == 0) {
            this.f13670i = Math.min(0.0f, this.f13670i);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo12702a(View view) {
        if (view == this.f13685x) {
            this.f13685x = null;
            if (this.f13684w != null) {
                this.f13679r.setChildDrawingOrderCallback(null);
            }
        }
    }

    /* renamed from: a */
    public void mo12699a(int i) {
        int i2 = i;
        if (this.f13673l == -1) {
            C1085v b = this.f13679r.mo5059b(0);
            if (b != null && (this.f13674m.mo12697d(this.f13679r, b) & i2) == i2) {
                int i3 = i2 == 1 ? -this.f13679r.getHeight() : i2 == 2 ? this.f13679r.getHeight() : 0;
                int i4 = i2 == 8 ? this.f13679r.getWidth() : i2 == 4 ? -this.f13679r.getWidth() : 0;
                mo12712b(b);
                mo12708a(this.f13663b);
                float[] fArr = this.f13663b;
                float f = fArr[0];
                float f2 = fArr[1];
                float f3 = (float) i4;
                float f4 = (float) i3;
                float f5 = f3;
                C5318f fVar = r0;
                C5318f fVar2 = new C5318f(this, b, 2, 1, f, f2, f3, f4, b, i);
                fVar.mo12743a(this.f13674m.mo12690a(this.f13679r, 2, f5 - f, f4 - f2));
                this.f13677p.add(fVar);
                fVar.mo12745b();
                this.f13664c = null;
                this.f13679r.getParent().requestDisallowInterceptTouchEvent(false);
                this.f13674m.mo12725a(this.f13664c, this.f13675n);
                this.f13679r.invalidate();
            }
        }
    }
}
