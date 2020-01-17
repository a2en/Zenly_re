package androidx.recyclerview.widget;

import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.core.p004os.C0569g;
import androidx.core.util.C0607i;
import androidx.core.view.C0615a;
import androidx.core.view.C0644f;
import androidx.core.view.C0645g;
import androidx.core.view.C0655j;
import androidx.core.view.NestedScrollingChild2;
import androidx.core.view.NestedScrollingChild3;
import androidx.core.view.ScrollingView;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.C0627b;
import androidx.core.view.accessibility.C0628c;
import androidx.core.view.accessibility.C0628c.C0630b;
import androidx.core.view.accessibility.C0628c.C0631c;
import androidx.customview.view.AbsSavedState;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p214e.p249n.C7650a;
import p214e.p249n.C7651b;

public class RecyclerView extends ViewGroup implements ScrollingView, NestedScrollingChild2, NestedScrollingChild3 {

    /* renamed from: C0 */
    private static final int[] f3966C0 = {16843830};

    /* renamed from: D0 */
    private static final int[] f3967D0 = {16842987};

    /* renamed from: E0 */
    static final boolean f3968E0;

    /* renamed from: F0 */
    static final boolean f3969F0 = (VERSION.SDK_INT >= 23);

    /* renamed from: G0 */
    static final boolean f3970G0 = (VERSION.SDK_INT >= 16);

    /* renamed from: H0 */
    static final boolean f3971H0 = (VERSION.SDK_INT >= 21);

    /* renamed from: I0 */
    private static final boolean f3972I0 = (VERSION.SDK_INT <= 15);

    /* renamed from: J0 */
    private static final boolean f3973J0 = (VERSION.SDK_INT <= 15);

    /* renamed from: K0 */
    private static final Class<?>[] f3974K0;

    /* renamed from: L0 */
    static final Interpolator f3975L0 = new C1065c();

    /* renamed from: A */
    boolean f3976A;

    /* renamed from: A0 */
    private Runnable f3977A0;

    /* renamed from: B */
    boolean f3978B;

    /* renamed from: B0 */
    private final C1158b f3979B0;

    /* renamed from: C */
    private boolean f3980C;

    /* renamed from: D */
    private int f3981D;

    /* renamed from: E */
    boolean f3982E;

    /* renamed from: F */
    private final AccessibilityManager f3983F;

    /* renamed from: G */
    private List<OnChildAttachStateChangeListener> f3984G;

    /* renamed from: H */
    boolean f3985H;

    /* renamed from: I */
    boolean f3986I;

    /* renamed from: J */
    private int f3987J;

    /* renamed from: K */
    private int f3988K;

    /* renamed from: L */
    private C1072j f3989L;

    /* renamed from: M */
    private EdgeEffect f3990M;

    /* renamed from: N */
    private EdgeEffect f3991N;

    /* renamed from: O */
    private EdgeEffect f3992O;

    /* renamed from: P */
    private EdgeEffect f3993P;

    /* renamed from: Q */
    ItemAnimator f3994Q;

    /* renamed from: R */
    private int f3995R;

    /* renamed from: S */
    private int f3996S;

    /* renamed from: T */
    private VelocityTracker f3997T;

    /* renamed from: U */
    private int f3998U;

    /* renamed from: V */
    private int f3999V;

    /* renamed from: W */
    private int f4000W;

    /* renamed from: a0 */
    private int f4001a0;

    /* renamed from: b0 */
    private int f4002b0;

    /* renamed from: c0 */
    private C1075m f4003c0;

    /* renamed from: d0 */
    private final int f4004d0;

    /* renamed from: e */
    private final C1080q f4005e;

    /* renamed from: e0 */
    private final int f4006e0;

    /* renamed from: f */
    final C1079p f4007f;

    /* renamed from: f0 */
    private float f4008f0;

    /* renamed from: g */
    private SavedState f4009g;

    /* renamed from: g0 */
    private float f4010g0;

    /* renamed from: h */
    C1091a f4011h;

    /* renamed from: h0 */
    private boolean f4012h0;

    /* renamed from: i */
    C1098e f4013i;

    /* renamed from: i0 */
    final C1084u f4014i0;

    /* renamed from: j */
    final C1156y f4015j;

    /* renamed from: j0 */
    C1126j f4016j0;

    /* renamed from: k */
    boolean f4017k;

    /* renamed from: k0 */
    C1128b f4018k0;

    /* renamed from: l */
    final Runnable f4019l;

    /* renamed from: l0 */
    final C1082s f4020l0;

    /* renamed from: m */
    final Rect f4021m;

    /* renamed from: m0 */
    private C1076n f4022m0;

    /* renamed from: n */
    private final Rect f4023n;

    /* renamed from: n0 */
    private List<C1076n> f4024n0;

    /* renamed from: o */
    final RectF f4025o;

    /* renamed from: o0 */
    boolean f4026o0;

    /* renamed from: p */
    C1069g f4027p;

    /* renamed from: p0 */
    boolean f4028p0;

    /* renamed from: q */
    LayoutManager f4029q;

    /* renamed from: q0 */
    private C1056a f4030q0;

    /* renamed from: r */
    RecyclerListener f4031r;

    /* renamed from: r0 */
    boolean f4032r0;

    /* renamed from: s */
    final ArrayList<C1074l> f4033s;

    /* renamed from: s0 */
    C1141q f4034s0;

    /* renamed from: t */
    private final ArrayList<OnItemTouchListener> f4035t;

    /* renamed from: t0 */
    private ChildDrawingOrderCallback f4036t0;

    /* renamed from: u */
    private OnItemTouchListener f4037u;

    /* renamed from: u0 */
    private final int[] f4038u0;

    /* renamed from: v */
    boolean f4039v;

    /* renamed from: v0 */
    private C0645g f4040v0;

    /* renamed from: w */
    boolean f4041w;

    /* renamed from: w0 */
    private final int[] f4042w0;

    /* renamed from: x */
    boolean f4043x;

    /* renamed from: x0 */
    private final int[] f4044x0;

    /* renamed from: y */
    boolean f4045y;

    /* renamed from: y0 */
    final int[] f4046y0;

    /* renamed from: z */
    private int f4047z;

    /* renamed from: z0 */
    final List<C1085v> f4048z0;

    public interface ChildDrawingOrderCallback {
        int onGetChildDrawingOrder(int i, int i2);
    }

    public static abstract class ItemAnimator {
        public static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
        public static final int FLAG_CHANGED = 2;
        public static final int FLAG_INVALIDATED = 4;
        public static final int FLAG_MOVED = 2048;
        public static final int FLAG_REMOVED = 8;
        private long mAddDuration = 120;
        private long mChangeDuration = 250;
        private ArrayList<ItemAnimatorFinishedListener> mFinishedListeners = new ArrayList<>();
        private C1056a mListener = null;
        private long mMoveDuration = 250;
        private long mRemoveDuration = 120;

        public interface ItemAnimatorFinishedListener {
            void onAnimationsFinished();
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$ItemAnimator$a */
        interface C1056a {
            /* renamed from: a */
            void mo5214a(C1085v vVar);
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$ItemAnimator$b */
        public static class C1057b {

            /* renamed from: a */
            public int f4049a;

            /* renamed from: b */
            public int f4050b;

            /* renamed from: a */
            public C1057b mo5215a(C1085v vVar) {
                mo5216a(vVar, 0);
                return this;
            }

            /* renamed from: a */
            public C1057b mo5216a(C1085v vVar, int i) {
                View view = vVar.itemView;
                this.f4049a = view.getLeft();
                this.f4050b = view.getTop();
                view.getRight();
                view.getBottom();
                return this;
            }
        }

        static int buildAdapterChangeFlagsForAnimations(C1085v vVar) {
            int i = vVar.mFlags & 14;
            if (vVar.isInvalid()) {
                return 4;
            }
            if ((i & 4) == 0) {
                int oldPosition = vVar.getOldPosition();
                int adapterPosition = vVar.getAdapterPosition();
                if (!(oldPosition == -1 || adapterPosition == -1 || oldPosition == adapterPosition)) {
                    i |= FLAG_MOVED;
                }
            }
            return i;
        }

        public abstract boolean animateAppearance(C1085v vVar, C1057b bVar, C1057b bVar2);

        public abstract boolean animateChange(C1085v vVar, C1085v vVar2, C1057b bVar, C1057b bVar2);

        public abstract boolean animateDisappearance(C1085v vVar, C1057b bVar, C1057b bVar2);

        public abstract boolean animatePersistence(C1085v vVar, C1057b bVar, C1057b bVar2);

        public abstract boolean canReuseUpdatedViewHolder(C1085v vVar);

        public boolean canReuseUpdatedViewHolder(C1085v vVar, List<Object> list) {
            return canReuseUpdatedViewHolder(vVar);
        }

        public final void dispatchAnimationFinished(C1085v vVar) {
            onAnimationFinished(vVar);
            C1056a aVar = this.mListener;
            if (aVar != null) {
                aVar.mo5214a(vVar);
            }
        }

        public final void dispatchAnimationStarted(C1085v vVar) {
            onAnimationStarted(vVar);
        }

        public final void dispatchAnimationsFinished() {
            int size = this.mFinishedListeners.size();
            for (int i = 0; i < size; i++) {
                ((ItemAnimatorFinishedListener) this.mFinishedListeners.get(i)).onAnimationsFinished();
            }
            this.mFinishedListeners.clear();
        }

        public abstract void endAnimation(C1085v vVar);

        public abstract void endAnimations();

        public long getAddDuration() {
            return this.mAddDuration;
        }

        public long getChangeDuration() {
            return this.mChangeDuration;
        }

        public long getMoveDuration() {
            return this.mMoveDuration;
        }

        public long getRemoveDuration() {
            return this.mRemoveDuration;
        }

        public abstract boolean isRunning();

        public final boolean isRunning(ItemAnimatorFinishedListener itemAnimatorFinishedListener) {
            boolean isRunning = isRunning();
            if (itemAnimatorFinishedListener != null) {
                if (!isRunning) {
                    itemAnimatorFinishedListener.onAnimationsFinished();
                } else {
                    this.mFinishedListeners.add(itemAnimatorFinishedListener);
                }
            }
            return isRunning;
        }

        public C1057b obtainHolderInfo() {
            return new C1057b();
        }

        public void onAnimationFinished(C1085v vVar) {
        }

        public void onAnimationStarted(C1085v vVar) {
        }

        public C1057b recordPostLayoutInformation(C1082s sVar, C1085v vVar) {
            C1057b obtainHolderInfo = obtainHolderInfo();
            obtainHolderInfo.mo5215a(vVar);
            return obtainHolderInfo;
        }

        public C1057b recordPreLayoutInformation(C1082s sVar, C1085v vVar, int i, List<Object> list) {
            C1057b obtainHolderInfo = obtainHolderInfo();
            obtainHolderInfo.mo5215a(vVar);
            return obtainHolderInfo;
        }

        public abstract void runPendingAnimations();

        public void setAddDuration(long j) {
            this.mAddDuration = j;
        }

        public void setChangeDuration(long j) {
            this.mChangeDuration = j;
        }

        /* access modifiers changed from: 0000 */
        public void setListener(C1056a aVar) {
            this.mListener = aVar;
        }

        public void setMoveDuration(long j) {
            this.mMoveDuration = j;
        }

        public void setRemoveDuration(long j) {
            this.mRemoveDuration = j;
        }
    }

    public static abstract class LayoutManager {

        /* renamed from: a */
        C1098e f4051a;

        /* renamed from: b */
        RecyclerView f4052b;

        /* renamed from: c */
        private final C1155b f4053c = new C1058a();

        /* renamed from: d */
        private final C1155b f4054d = new C1059b();

        /* renamed from: e */
        C1153x f4055e = new C1153x(this.f4053c);

        /* renamed from: f */
        C1153x f4056f = new C1153x(this.f4054d);

        /* renamed from: g */
        SmoothScroller f4057g;

        /* renamed from: h */
        boolean f4058h = false;

        /* renamed from: i */
        boolean f4059i = false;

        /* renamed from: j */
        boolean f4060j = false;

        /* renamed from: k */
        private boolean f4061k = true;

        /* renamed from: l */
        private boolean f4062l = true;

        /* renamed from: m */
        int f4063m;

        /* renamed from: n */
        boolean f4064n;

        /* renamed from: o */
        private int f4065o;

        /* renamed from: p */
        private int f4066p;

        /* renamed from: q */
        private int f4067q;

        /* renamed from: r */
        private int f4068r;

        public interface LayoutPrefetchRegistry {
            void addPosition(int i, int i2);
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$LayoutManager$a */
        class C1058a implements C1155b {
            C1058a() {
            }

            /* renamed from: a */
            public View mo5318a(int i) {
                return LayoutManager.this.mo5265c(i);
            }

            /* renamed from: b */
            public int mo5319b() {
                return LayoutManager.this.mo5309t() - LayoutManager.this.mo5306q();
            }

            /* renamed from: a */
            public int mo5316a() {
                return LayoutManager.this.mo5305p();
            }

            /* renamed from: b */
            public int mo5320b(View view) {
                return LayoutManager.this.mo5292i(view) + ((LayoutParams) view.getLayoutParams()).rightMargin;
            }

            /* renamed from: a */
            public int mo5317a(View view) {
                return LayoutManager.this.mo5282f(view) - ((LayoutParams) view.getLayoutParams()).leftMargin;
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$LayoutManager$b */
        class C1059b implements C1155b {
            C1059b() {
            }

            /* renamed from: a */
            public View mo5318a(int i) {
                return LayoutManager.this.mo5265c(i);
            }

            /* renamed from: b */
            public int mo5319b() {
                return LayoutManager.this.mo5289h() - LayoutManager.this.mo5301n();
            }

            /* renamed from: a */
            public int mo5316a() {
                return LayoutManager.this.mo5308s();
            }

            /* renamed from: a */
            public int mo5317a(View view) {
                return LayoutManager.this.mo5294j(view) - ((LayoutParams) view.getLayoutParams()).topMargin;
            }

            /* renamed from: b */
            public int mo5320b(View view) {
                return LayoutManager.this.mo5279e(view) + ((LayoutParams) view.getLayoutParams()).bottomMargin;
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$LayoutManager$c */
        public static class C1060c {

            /* renamed from: a */
            public int f4071a;

            /* renamed from: b */
            public int f4072b;

            /* renamed from: c */
            public boolean f4073c;

            /* renamed from: d */
            public boolean f4074d;
        }

        /* renamed from: A */
        public Parcelable mo4971A() {
            return null;
        }

        /* renamed from: B */
        public void mo5217B() {
            RecyclerView recyclerView = this.f4052b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        /* renamed from: C */
        public void mo5218C() {
            this.f4058h = true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: D */
        public boolean mo4972D() {
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: E */
        public void mo5219E() {
            SmoothScroller smoothScroller = this.f4057g;
            if (smoothScroller != null) {
                smoothScroller.stop();
            }
        }

        /* renamed from: F */
        public boolean mo4927F() {
            return false;
        }

        /* renamed from: a */
        public int mo4929a(int i, C1079p pVar, C1082s sVar) {
            return 0;
        }

        /* renamed from: a */
        public int mo4984a(C1082s sVar) {
            return 0;
        }

        /* renamed from: a */
        public View mo4931a(View view, int i, C1079p pVar, C1082s sVar) {
            return null;
        }

        /* renamed from: a */
        public void mo4987a(int i, int i2, C1082s sVar, LayoutPrefetchRegistry layoutPrefetchRegistry) {
        }

        /* renamed from: a */
        public void mo4988a(int i, LayoutPrefetchRegistry layoutPrefetchRegistry) {
        }

        /* renamed from: a */
        public void mo4935a(Rect rect, int i, int i2) {
            mo5267c(m4967a(i, rect.width() + mo5305p() + mo5306q(), mo5299m()), m4967a(i2, rect.height() + mo5308s() + mo5301n(), mo5297l()));
        }

        /* renamed from: a */
        public void mo4989a(Parcelable parcelable) {
        }

        /* renamed from: a */
        public void mo5234a(C1069g gVar, C1069g gVar2) {
        }

        /* renamed from: a */
        public void mo4939a(RecyclerView recyclerView, int i, int i2) {
        }

        /* renamed from: a */
        public void mo4940a(RecyclerView recyclerView, int i, int i2, int i3) {
        }

        /* renamed from: a */
        public boolean mo4994a() {
            return false;
        }

        /* renamed from: a */
        public boolean mo4942a(LayoutParams layoutParams) {
            return layoutParams != null;
        }

        /* renamed from: a */
        public boolean mo5247a(C1079p pVar, C1082s sVar, View view, int i, Bundle bundle) {
            return false;
        }

        /* renamed from: a */
        public boolean mo5252a(RecyclerView recyclerView, ArrayList<View> arrayList, int i, int i2) {
            return false;
        }

        /* renamed from: b */
        public int mo4943b(int i, C1079p pVar, C1082s sVar) {
            return 0;
        }

        /* renamed from: b */
        public int mo4945b(C1082s sVar) {
            return 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo5254b(int i, int i2) {
            this.f4067q = MeasureSpec.getSize(i);
            this.f4065o = MeasureSpec.getMode(i);
            if (this.f4065o == 0 && !RecyclerView.f3969F0) {
                this.f4067q = 0;
            }
            this.f4068r = MeasureSpec.getSize(i2);
            this.f4066p = MeasureSpec.getMode(i2);
            if (this.f4066p == 0 && !RecyclerView.f3969F0) {
                this.f4068r = 0;
            }
        }

        /* renamed from: b */
        public void mo5262b(RecyclerView recyclerView) {
        }

        /* renamed from: b */
        public void mo4946b(RecyclerView recyclerView, int i, int i2) {
        }

        /* renamed from: b */
        public boolean mo4999b() {
            return false;
        }

        /* renamed from: c */
        public int mo5264c(C1079p pVar, C1082s sVar) {
            return 0;
        }

        /* renamed from: c */
        public int mo4947c(C1082s sVar) {
            return 0;
        }

        /* renamed from: c */
        public View mo5266c(View view) {
            RecyclerView recyclerView = this.f4052b;
            if (recyclerView == null) {
                return null;
            }
            View c = recyclerView.mo5070c(view);
            if (c != null && !this.f4051a.mo5653c(c)) {
                return c;
            }
            return null;
        }

        /* renamed from: c */
        public abstract LayoutParams mo4948c();

        @Deprecated
        /* renamed from: c */
        public void mo5270c(RecyclerView recyclerView) {
        }

        /* renamed from: c */
        public void mo5271c(RecyclerView recyclerView, int i, int i2) {
        }

        /* renamed from: d */
        public int mo5272d() {
            return -1;
        }

        /* renamed from: d */
        public int mo5002d(C1082s sVar) {
            return 0;
        }

        /* renamed from: d */
        public View mo5274d(View view, int i) {
            return null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo5276d(int i, int i2) {
            int e = mo5278e();
            if (e == 0) {
                this.f4052b.mo5073c(i, i2);
                return;
            }
            int i3 = Integer.MAX_VALUE;
            int i4 = Integer.MAX_VALUE;
            int i5 = Integer.MIN_VALUE;
            int i6 = Integer.MIN_VALUE;
            for (int i7 = 0; i7 < e; i7++) {
                View c = mo5265c(i7);
                Rect rect = this.f4052b.f4021m;
                mo5258b(c, rect);
                int i8 = rect.left;
                if (i8 < i3) {
                    i3 = i8;
                }
                int i9 = rect.right;
                if (i9 > i5) {
                    i5 = i9;
                }
                int i10 = rect.top;
                if (i10 < i4) {
                    i4 = i10;
                }
                int i11 = rect.bottom;
                if (i11 > i6) {
                    i6 = i11;
                }
            }
            this.f4052b.f4021m.set(i3, i4, i5, i6);
            mo4935a(this.f4052b.f4021m, i, i2);
        }

        /* renamed from: d */
        public void mo4950d(RecyclerView recyclerView) {
        }

        /* renamed from: d */
        public boolean mo5277d(C1079p pVar, C1082s sVar) {
            return false;
        }

        /* renamed from: e */
        public int mo4951e(C1082s sVar) {
            return 0;
        }

        /* renamed from: e */
        public void mo4952e(C1079p pVar, C1082s sVar) {
            Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        /* renamed from: f */
        public int mo4953f(C1082s sVar) {
            return 0;
        }

        /* renamed from: f */
        public void mo5283f(int i) {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public void mo5284f(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.f4052b = null;
                this.f4051a = null;
                this.f4067q = 0;
                this.f4068r = 0;
            } else {
                this.f4052b = recyclerView;
                this.f4051a = recyclerView.f4013i;
                this.f4067q = recyclerView.getWidth();
                this.f4068r = recyclerView.getHeight();
            }
            this.f4065o = 1073741824;
            this.f4066p = 1073741824;
        }

        /* renamed from: g */
        public void mo5288g(int i) {
            if (mo5265c(i) != null) {
                this.f4051a.mo5656e(i);
            }
        }

        /* renamed from: g */
        public void mo4955g(C1082s sVar) {
        }

        /* renamed from: h */
        public int mo5289h() {
            return this.f4068r;
        }

        /* renamed from: h */
        public void mo5006h(int i) {
        }

        /* renamed from: i */
        public int mo5291i() {
            return this.f4066p;
        }

        /* renamed from: j */
        public int mo5293j() {
            RecyclerView recyclerView = this.f4052b;
            C1069g adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.getItemCount();
            }
            return 0;
        }

        /* renamed from: k */
        public int mo5295k() {
            return ViewCompat.m2862o(this.f4052b);
        }

        /* renamed from: l */
        public int mo5298l(View view) {
            return ((LayoutParams) view.getLayoutParams()).mo5321a();
        }

        /* renamed from: m */
        public int mo5300m(View view) {
            return ((LayoutParams) view.getLayoutParams()).f4076b.right;
        }

        /* renamed from: n */
        public int mo5301n() {
            RecyclerView recyclerView = this.f4052b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        /* renamed from: o */
        public void mo5304o(View view) {
            this.f4051a.mo5655d(view);
        }

        /* renamed from: p */
        public int mo5305p() {
            RecyclerView recyclerView = this.f4052b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        /* renamed from: q */
        public int mo5306q() {
            RecyclerView recyclerView = this.f4052b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        /* renamed from: r */
        public int mo5307r() {
            RecyclerView recyclerView = this.f4052b;
            if (recyclerView != null) {
                return ViewCompat.m2866s(recyclerView);
            }
            return 0;
        }

        /* renamed from: s */
        public int mo5308s() {
            RecyclerView recyclerView = this.f4052b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        /* renamed from: t */
        public int mo5309t() {
            return this.f4067q;
        }

        /* renamed from: u */
        public int mo5310u() {
            return this.f4065o;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: v */
        public boolean mo5311v() {
            int e = mo5278e();
            for (int i = 0; i < e; i++) {
                android.view.ViewGroup.LayoutParams layoutParams = mo5265c(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: w */
        public boolean mo5312w() {
            return this.f4059i;
        }

        /* renamed from: x */
        public boolean mo5009x() {
            return this.f4060j;
        }

        /* renamed from: y */
        public final boolean mo5313y() {
            return this.f4062l;
        }

        /* renamed from: z */
        public boolean mo5314z() {
            SmoothScroller smoothScroller = this.f4057g;
            return smoothScroller != null && smoothScroller.isRunning();
        }

        /* renamed from: e */
        public int mo5278e() {
            C1098e eVar = this.f4051a;
            if (eVar != null) {
                return eVar.mo5642a();
            }
            return 0;
        }

        /* renamed from: h */
        public int mo5290h(View view) {
            Rect rect = ((LayoutParams) view.getLayoutParams()).f4076b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        /* renamed from: i */
        public int mo5292i(View view) {
            return view.getRight() + mo5300m(view);
        }

        /* renamed from: k */
        public int mo5296k(View view) {
            return ((LayoutParams) view.getLayoutParams()).f4076b.left;
        }

        /* renamed from: l */
        public int mo5297l() {
            return ViewCompat.m2863p(this.f4052b);
        }

        /* renamed from: m */
        public int mo5299m() {
            return ViewCompat.m2864q(this.f4052b);
        }

        /* renamed from: n */
        public int mo5302n(View view) {
            return ((LayoutParams) view.getLayoutParams()).f4076b.top;
        }

        /* renamed from: o */
        public int mo5303o() {
            RecyclerView recyclerView = this.f4052b;
            if (recyclerView != null) {
                return ViewCompat.m2865r(recyclerView);
            }
            return 0;
        }

        /* renamed from: e */
        public void mo5280e(int i) {
            RecyclerView recyclerView = this.f4052b;
            if (recyclerView != null) {
                recyclerView.mo5087e(i);
            }
        }

        /* renamed from: g */
        public View mo5287g() {
            RecyclerView recyclerView = this.f4052b;
            if (recyclerView == null) {
                return null;
            }
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null || this.f4051a.mo5653c(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        /* renamed from: j */
        public int mo5294j(View view) {
            return view.getTop() - mo5302n(view);
        }

        /* renamed from: c */
        public void mo5268c(View view, int i) {
            mo5227a(view, i, (LayoutParams) view.getLayoutParams());
        }

        /* renamed from: c */
        public View mo5265c(int i) {
            C1098e eVar = this.f4051a;
            if (eVar != null) {
                return eVar.mo5651c(i);
            }
            return null;
        }

        /* renamed from: e */
        public int mo5279e(View view) {
            return view.getBottom() + mo5273d(view);
        }

        /* renamed from: a */
        public static int m4967a(int i, int i2, int i3) {
            int mode = MeasureSpec.getMode(i);
            int size = MeasureSpec.getSize(i);
            if (mode == Integer.MIN_VALUE) {
                return Math.min(size, Math.max(i2, i3));
            }
            if (mode != 1073741824) {
                size = Math.max(i2, i3);
            }
            return size;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo5269c(C1079p pVar) {
            int e = pVar.mo5473e();
            for (int i = e - 1; i >= 0; i--) {
                View c = pVar.mo5465c(i);
                C1085v m = RecyclerView.m4874m(c);
                if (!m.shouldIgnore()) {
                    m.setIsRecyclable(false);
                    if (m.isTmpDetached()) {
                        this.f4052b.removeDetachedView(c, false);
                    }
                    ItemAnimator itemAnimator = this.f4052b.f3994Q;
                    if (itemAnimator != null) {
                        itemAnimator.endAnimation(m);
                    }
                    m.setIsRecyclable(true);
                    pVar.mo5453a(c);
                }
            }
            pVar.mo5466c();
            if (e > 0) {
                this.f4052b.invalidate();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo5281e(RecyclerView recyclerView) {
            mo5254b(MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        /* renamed from: g */
        public int mo5286g(View view) {
            Rect rect = ((LayoutParams) view.getLayoutParams()).f4076b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        /* renamed from: b */
        public void mo4997b(RecyclerView recyclerView, C1079p pVar) {
            mo5270c(recyclerView);
        }

        /* renamed from: a */
        public void mo4993a(String str) {
            RecyclerView recyclerView = this.f4052b;
            if (recyclerView != null) {
                recyclerView.mo5051a(str);
            }
        }

        /* renamed from: b */
        public void mo5260b(SmoothScroller smoothScroller) {
            SmoothScroller smoothScroller2 = this.f4057g;
            if (!(smoothScroller2 == null || smoothScroller == smoothScroller2 || !smoothScroller2.isRunning())) {
                this.f4057g.stop();
            }
            this.f4057g = smoothScroller;
            this.f4057g.start(this.f4052b, this);
        }

        /* renamed from: f */
        public boolean mo5285f() {
            RecyclerView recyclerView = this.f4052b;
            return recyclerView != null && recyclerView.f4017k;
        }

        /* renamed from: a */
        public final void mo5241a(boolean z) {
            if (z != this.f4062l) {
                this.f4062l = z;
                this.f4063m = 0;
                RecyclerView recyclerView = this.f4052b;
                if (recyclerView != null) {
                    recyclerView.f4007f.mo5480j();
                }
            }
        }

        /* renamed from: d */
        public void mo5275d(int i) {
            RecyclerView recyclerView = this.f4052b;
            if (recyclerView != null) {
                recyclerView.mo5078d(i);
            }
        }

        /* renamed from: f */
        public int mo5282f(View view) {
            return view.getLeft() - mo5296k(view);
        }

        /* renamed from: d */
        public int mo5273d(View view) {
            return ((LayoutParams) view.getLayoutParams()).f4076b.bottom;
        }

        /* renamed from: d */
        private boolean m4975d(RecyclerView recyclerView, int i, int i2) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int p = mo5305p();
            int s = mo5308s();
            int t = mo5309t() - mo5306q();
            int h = mo5289h() - mo5301n();
            Rect rect = this.f4052b.f4021m;
            mo5258b(focusedChild, rect);
            if (rect.left - i >= t || rect.right - i <= p || rect.top - i2 >= h || rect.bottom - i2 <= s) {
                return false;
            }
            return true;
        }

        /* renamed from: b */
        public void mo5255b(View view) {
            mo5256b(view, -1);
        }

        /* renamed from: b */
        public void mo5256b(View view, int i) {
            m4971a(view, i, false);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo5239a(RecyclerView recyclerView) {
            this.f4059i = true;
            mo5262b(recyclerView);
        }

        /* renamed from: b */
        public View mo4995b(int i) {
            int e = mo5278e();
            for (int i2 = 0; i2 < e; i2++) {
                View c = mo5265c(i2);
                C1085v m = RecyclerView.m4874m(c);
                if (m != null && m.getLayoutPosition() == i && !m.shouldIgnore() && (this.f4052b.f4020l0.mo5487d() || !m.isRemoved())) {
                    return c;
                }
            }
            return null;
        }

        /* renamed from: c */
        private int[] m4974c(View view, Rect rect) {
            int[] iArr = new int[2];
            int p = mo5305p();
            int s = mo5308s();
            int t = mo5309t() - mo5306q();
            int h = mo5289h() - mo5301n();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int width = rect.width() + left;
            int height = rect.height() + top;
            int i = left - p;
            int min = Math.min(0, i);
            int i2 = top - s;
            int min2 = Math.min(0, i2);
            int i3 = width - t;
            int max = Math.max(0, i3);
            int max2 = Math.max(0, height - h);
            if (mo5295k() != 1) {
                if (min == 0) {
                    min = Math.min(i, max);
                }
                max = min;
            } else if (max == 0) {
                max = Math.max(min, i3);
            }
            if (min2 == 0) {
                min2 = Math.min(i2, max2);
            }
            iArr[0] = max;
            iArr[1] = min2;
            return iArr;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo5240a(RecyclerView recyclerView, C1079p pVar) {
            this.f4059i = false;
            mo4997b(recyclerView, pVar);
        }

        /* renamed from: a */
        public boolean mo5253a(Runnable runnable) {
            RecyclerView recyclerView = this.f4052b;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        /* renamed from: b */
        public void mo5259b(View view, C1079p pVar) {
            mo5304o(view);
            pVar.mo5463b(view);
        }

        /* renamed from: a */
        public LayoutParams mo4934a(android.view.ViewGroup.LayoutParams layoutParams) {
            if (layoutParams instanceof LayoutParams) {
                return new LayoutParams((LayoutParams) layoutParams);
            }
            if (layoutParams instanceof MarginLayoutParams) {
                return new LayoutParams((MarginLayoutParams) layoutParams);
            }
            return new LayoutParams(layoutParams);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public boolean mo5263b(View view, int i, int i2, LayoutParams layoutParams) {
            return !this.f4061k || !m4973b(view.getMeasuredWidth(), i, layoutParams.width) || !m4973b(view.getMeasuredHeight(), i2, layoutParams.height);
        }

        /* renamed from: b */
        private static boolean m4973b(int i, int i2, int i3) {
            int mode = MeasureSpec.getMode(i2);
            int size = MeasureSpec.getSize(i2);
            boolean z = false;
            if (i3 > 0 && i != i3) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                if (size >= i) {
                    z = true;
                }
                return z;
            } else if (mode == 0) {
                return true;
            } else {
                if (mode != 1073741824) {
                    return false;
                }
                if (size == i) {
                    z = true;
                }
                return z;
            }
        }

        /* renamed from: a */
        public LayoutParams mo4933a(Context context, AttributeSet attributeSet) {
            return new LayoutParams(context, attributeSet);
        }

        /* renamed from: a */
        public void mo4992a(RecyclerView recyclerView, C1082s sVar, int i) {
            Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
        }

        /* renamed from: b */
        public void mo5257b(View view, int i, int i2, int i3, int i4) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Rect rect = layoutParams.f4076b;
            view.layout(i + rect.left + layoutParams.leftMargin, i2 + rect.top + layoutParams.topMargin, (i3 - rect.right) - layoutParams.rightMargin, (i4 - rect.bottom) - layoutParams.bottomMargin);
        }

        /* renamed from: a */
        public void mo5223a(View view) {
            mo5224a(view, -1);
        }

        /* renamed from: a */
        public void mo5224a(View view, int i) {
            m4971a(view, i, true);
        }

        /* renamed from: a */
        private void m4971a(View view, int i, boolean z) {
            C1085v m = RecyclerView.m4874m(view);
            if (z || m.isRemoved()) {
                this.f4052b.f4015j.mo5812a(m);
            } else {
                this.f4052b.f4015j.mo5823g(m);
            }
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (m.wasReturnedFromScrap() || m.isScrap()) {
                if (m.isScrap()) {
                    m.unScrap();
                } else {
                    m.clearReturnedFromScrapFlag();
                }
                this.f4051a.mo5645a(view, i, view.getLayoutParams(), false);
            } else if (view.getParent() == this.f4052b) {
                int b = this.f4051a.mo5649b(view);
                if (i == -1) {
                    i = this.f4051a.mo5642a();
                }
                if (b == -1) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                    sb.append(this.f4052b.indexOfChild(view));
                    sb.append(this.f4052b.mo5122i());
                    throw new IllegalStateException(sb.toString());
                } else if (b != i) {
                    this.f4052b.f4029q.mo5221a(b, i);
                }
            } else {
                this.f4051a.mo5646a(view, i, false);
                layoutParams.f4077c = true;
                SmoothScroller smoothScroller = this.f4057g;
                if (smoothScroller != null && smoothScroller.isRunning()) {
                    this.f4057g.onChildAttachedToWindow(view);
                }
            }
            if (layoutParams.f4078d) {
                m.itemView.invalidate();
                layoutParams.f4078d = false;
            }
        }

        /* renamed from: b */
        public void mo5258b(View view, Rect rect) {
            RecyclerView.m4867b(view, rect);
        }

        /* renamed from: b */
        public void mo5261b(C1079p pVar) {
            for (int e = mo5278e() - 1; e >= 0; e--) {
                if (!RecyclerView.m4874m(mo5265c(e)).shouldIgnore()) {
                    mo5222a(e, pVar);
                }
            }
        }

        /* renamed from: c */
        public void mo5267c(int i, int i2) {
            this.f4052b.setMeasuredDimension(i, i2);
        }

        /* renamed from: b */
        public int mo4944b(C1079p pVar, C1082s sVar) {
            RecyclerView recyclerView = this.f4052b;
            if (recyclerView == null || recyclerView.f4027p == null || !mo4999b()) {
                return 1;
            }
            return this.f4052b.f4027p.getItemCount();
        }

        /* renamed from: a */
        public void mo5220a(int i) {
            m4970a(i, mo5265c(i));
        }

        /* renamed from: a */
        private void m4970a(int i, View view) {
            this.f4051a.mo5643a(i);
        }

        /* renamed from: a */
        public void mo5227a(View view, int i, LayoutParams layoutParams) {
            C1085v m = RecyclerView.m4874m(view);
            if (m.isRemoved()) {
                this.f4052b.f4015j.mo5812a(m);
            } else {
                this.f4052b.f4015j.mo5823g(m);
            }
            this.f4051a.mo5645a(view, i, layoutParams, m.isRemoved());
        }

        /* renamed from: a */
        public void mo5221a(int i, int i2) {
            View c = mo5265c(i);
            if (c != null) {
                mo5220a(i);
                mo5268c(c, i2);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot move a child from non-existing index:");
            sb.append(i);
            sb.append(this.f4052b.toString());
            throw new IllegalArgumentException(sb.toString());
        }

        /* renamed from: a */
        public void mo5230a(View view, C1079p pVar) {
            m4972a(pVar, this.f4051a.mo5649b(view), view);
        }

        /* renamed from: a */
        public void mo5222a(int i, C1079p pVar) {
            View c = mo5265c(i);
            mo5288g(i);
            pVar.mo5463b(c);
        }

        /* renamed from: a */
        public void mo5235a(C1079p pVar) {
            for (int e = mo5278e() - 1; e >= 0; e--) {
                m4972a(pVar, e, mo5265c(e));
            }
        }

        /* renamed from: a */
        private void m4972a(C1079p pVar, int i, View view) {
            C1085v m = RecyclerView.m4874m(view);
            if (!m.shouldIgnore()) {
                if (!m.isInvalid() || m.isRemoved() || this.f4052b.f4027p.hasStableIds()) {
                    mo5220a(i);
                    pVar.mo5468c(view);
                    this.f4052b.f4015j.mo5820d(m);
                } else {
                    mo5288g(i);
                    pVar.mo5464b(m);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo5243a(View view, int i, int i2, LayoutParams layoutParams) {
            return view.isLayoutRequested() || !this.f4061k || !m4973b(view.getWidth(), i, layoutParams.width) || !m4973b(view.getHeight(), i2, layoutParams.height);
        }

        /* renamed from: a */
        public void mo5225a(View view, int i, int i2) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Rect h = this.f4052b.mo5118h(view);
            int i3 = i2 + h.top + h.bottom;
            int a = m4968a(mo5309t(), mo5310u(), mo5305p() + mo5306q() + layoutParams.leftMargin + layoutParams.rightMargin + i + h.left + h.right, layoutParams.width, mo4994a());
            int a2 = m4968a(mo5289h(), mo5291i(), mo5308s() + mo5301n() + layoutParams.topMargin + layoutParams.bottomMargin + i3, layoutParams.height, mo4999b());
            if (mo5243a(view, a, a2, layoutParams)) {
                view.measure(a, a2);
            }
        }

        /* renamed from: a */
        public static int m4968a(int i, int i2, int i3, int i4, boolean z) {
            int i5;
            int i6 = i - i3;
            int i7 = 0;
            int max = Math.max(0, i6);
            if (z) {
                if (i4 < 0) {
                    if (i4 == -1) {
                        if (i2 == Integer.MIN_VALUE || (i2 != 0 && i2 == 1073741824)) {
                            i5 = max;
                        } else {
                            i2 = 0;
                            i5 = 0;
                        }
                        i7 = i2;
                        max = i5;
                        return MeasureSpec.makeMeasureSpec(max, i7);
                    }
                    max = 0;
                    return MeasureSpec.makeMeasureSpec(max, i7);
                }
            } else if (i4 < 0) {
                if (i4 == -1) {
                    i7 = i2;
                } else {
                    if (i4 == -2) {
                        if (i2 == Integer.MIN_VALUE || i2 == 1073741824) {
                            i7 = Integer.MIN_VALUE;
                        }
                    }
                    max = 0;
                }
                return MeasureSpec.makeMeasureSpec(max, i7);
            }
            max = i4;
            i7 = 1073741824;
            return MeasureSpec.makeMeasureSpec(max, i7);
        }

        /* renamed from: a */
        public void mo5226a(View view, int i, int i2, int i3, int i4) {
            Rect rect = ((LayoutParams) view.getLayoutParams()).f4076b;
            view.layout(i + rect.left, i2 + rect.top, i3 - rect.right, i4 - rect.bottom);
        }

        /* renamed from: a */
        public void mo5231a(View view, boolean z, Rect rect) {
            if (z) {
                Rect rect2 = ((LayoutParams) view.getLayoutParams()).f4076b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.f4052b != null) {
                Matrix matrix = view.getMatrix();
                if (matrix != null && !matrix.isIdentity()) {
                    RectF rectF = this.f4052b.f4025o;
                    rectF.set(rect);
                    matrix.mapRect(rectF);
                    rect.set((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom));
                }
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        /* renamed from: a */
        public void mo5228a(View view, Rect rect) {
            RecyclerView recyclerView = this.f4052b;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.mo5118h(view));
            }
        }

        /* renamed from: a */
        public boolean mo5248a(RecyclerView recyclerView, View view, Rect rect, boolean z) {
            return mo5249a(recyclerView, view, rect, z, false);
        }

        /* renamed from: a */
        public boolean mo5249a(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
            int[] c = m4974c(view, rect);
            int i = c[0];
            int i2 = c[1];
            if ((z2 && !m4975d(recyclerView, i, i2)) || (i == 0 && i2 == 0)) {
                return false;
            }
            if (z) {
                recyclerView.scrollBy(i, i2);
            } else {
                recyclerView.mo5123i(i, i2);
            }
            return true;
        }

        /* renamed from: a */
        public boolean mo5245a(View view, boolean z, boolean z2) {
            boolean z3 = this.f4055e.mo5803a(view, 24579) && this.f4056f.mo5803a(view, 24579);
            return z ? z3 : !z3;
        }

        @Deprecated
        /* renamed from: a */
        public boolean mo5250a(RecyclerView recyclerView, View view, View view2) {
            return mo5314z() || recyclerView.mo5133n();
        }

        /* renamed from: a */
        public boolean mo5251a(RecyclerView recyclerView, C1082s sVar, View view, View view2) {
            return mo5250a(recyclerView, view, view2);
        }

        /* renamed from: a */
        public void mo4941a(RecyclerView recyclerView, int i, int i2, Object obj) {
            mo5271c(recyclerView, i, i2);
        }

        /* renamed from: a */
        public void mo5236a(C1079p pVar, C1082s sVar, int i, int i2) {
            this.f4052b.mo5073c(i, i2);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo5233a(SmoothScroller smoothScroller) {
            if (this.f4057g == smoothScroller) {
                this.f4057g = null;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo5232a(C0628c cVar) {
            RecyclerView recyclerView = this.f4052b;
            mo5238a(recyclerView.f4007f, recyclerView.f4020l0, cVar);
        }

        /* renamed from: a */
        public void mo5238a(C1079p pVar, C1082s sVar, C0628c cVar) {
            if (this.f4052b.canScrollVertically(-1) || this.f4052b.canScrollHorizontally(-1)) {
                cVar.mo3317a(8192);
                cVar.mo3358k(true);
            }
            if (this.f4052b.canScrollVertically(1) || this.f4052b.canScrollHorizontally(1)) {
                cVar.mo3317a(4096);
                cVar.mo3358k(true);
            }
            cVar.mo3324a((Object) C0630b.m2981a(mo4944b(pVar, sVar), mo4930a(pVar, sVar), mo5277d(pVar, sVar), mo5264c(pVar, sVar)));
        }

        /* renamed from: a */
        public void mo4990a(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f4052b;
            mo5237a(recyclerView.f4007f, recyclerView.f4020l0, accessibilityEvent);
        }

        /* renamed from: a */
        public void mo5237a(C1079p pVar, C1082s sVar, AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f4052b;
            if (recyclerView != null && accessibilityEvent != null) {
                boolean z = true;
                if (!recyclerView.canScrollVertically(1) && !this.f4052b.canScrollVertically(-1) && !this.f4052b.canScrollHorizontally(-1) && !this.f4052b.canScrollHorizontally(1)) {
                    z = false;
                }
                accessibilityEvent.setScrollable(z);
                C1069g gVar = this.f4052b.f4027p;
                if (gVar != null) {
                    accessibilityEvent.setItemCount(gVar.getItemCount());
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo5229a(View view, C0628c cVar) {
            C1085v m = RecyclerView.m4874m(view);
            if (m != null && !m.isRemoved() && !this.f4051a.mo5653c(m.itemView)) {
                RecyclerView recyclerView = this.f4052b;
                mo4936a(recyclerView.f4007f, recyclerView.f4020l0, view, cVar);
            }
        }

        /* renamed from: a */
        public void mo4936a(C1079p pVar, C1082s sVar, View view, C0628c cVar) {
            cVar.mo3331b((Object) C0631c.m2982a(mo4999b() ? mo5298l(view) : 0, 1, mo4994a() ? mo5298l(view) : 0, 1, false, false));
        }

        /* renamed from: a */
        public int mo4930a(C1079p pVar, C1082s sVar) {
            RecyclerView recyclerView = this.f4052b;
            if (recyclerView == null || recyclerView.f4027p == null || !mo4994a()) {
                return 1;
            }
            return this.f4052b.f4027p.getItemCount();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo5242a(int i, Bundle bundle) {
            RecyclerView recyclerView = this.f4052b;
            return mo5246a(recyclerView.f4007f, recyclerView.f4020l0, i, bundle);
        }

        /* JADX WARNING: Removed duplicated region for block: B:24:0x0070 A[ADDED_TO_REGION] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo5246a(androidx.recyclerview.widget.RecyclerView.C1079p r2, androidx.recyclerview.widget.RecyclerView.C1082s r3, int r4, android.os.Bundle r5) {
            /*
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r2 = r1.f4052b
                r3 = 0
                if (r2 != 0) goto L_0x0006
                return r3
            L_0x0006:
                r5 = 4096(0x1000, float:5.74E-42)
                r0 = 1
                if (r4 == r5) goto L_0x0042
                r5 = 8192(0x2000, float:1.14794E-41)
                if (r4 == r5) goto L_0x0012
                r2 = 0
            L_0x0010:
                r4 = 0
                goto L_0x006e
            L_0x0012:
                r4 = -1
                boolean r2 = r2.canScrollVertically(r4)
                if (r2 == 0) goto L_0x0029
                int r2 = r1.mo5289h()
                int r5 = r1.mo5308s()
                int r2 = r2 - r5
                int r5 = r1.mo5301n()
                int r2 = r2 - r5
                int r2 = -r2
                goto L_0x002a
            L_0x0029:
                r2 = 0
            L_0x002a:
                androidx.recyclerview.widget.RecyclerView r5 = r1.f4052b
                boolean r4 = r5.canScrollHorizontally(r4)
                if (r4 == 0) goto L_0x0010
                int r4 = r1.mo5309t()
                int r5 = r1.mo5305p()
                int r4 = r4 - r5
                int r5 = r1.mo5306q()
                int r4 = r4 - r5
                int r4 = -r4
                goto L_0x006e
            L_0x0042:
                boolean r2 = r2.canScrollVertically(r0)
                if (r2 == 0) goto L_0x0057
                int r2 = r1.mo5289h()
                int r4 = r1.mo5308s()
                int r2 = r2 - r4
                int r4 = r1.mo5301n()
                int r2 = r2 - r4
                goto L_0x0058
            L_0x0057:
                r2 = 0
            L_0x0058:
                androidx.recyclerview.widget.RecyclerView r4 = r1.f4052b
                boolean r4 = r4.canScrollHorizontally(r0)
                if (r4 == 0) goto L_0x0010
                int r4 = r1.mo5309t()
                int r5 = r1.mo5305p()
                int r4 = r4 - r5
                int r5 = r1.mo5306q()
                int r4 = r4 - r5
            L_0x006e:
                if (r2 != 0) goto L_0x0073
                if (r4 != 0) goto L_0x0073
                return r3
            L_0x0073:
                androidx.recyclerview.widget.RecyclerView r3 = r1.f4052b
                r3.mo5123i(r4, r2)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.LayoutManager.mo5246a(androidx.recyclerview.widget.RecyclerView$p, androidx.recyclerview.widget.RecyclerView$s, int, android.os.Bundle):boolean");
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo5244a(View view, int i, Bundle bundle) {
            RecyclerView recyclerView = this.f4052b;
            return mo5247a(recyclerView.f4007f, recyclerView.f4020l0, view, i, bundle);
        }

        /* renamed from: a */
        public static C1060c m4969a(Context context, AttributeSet attributeSet, int i, int i2) {
            C1060c cVar = new C1060c();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7651b.RecyclerView, i, i2);
            cVar.f4071a = obtainStyledAttributes.getInt(C7651b.RecyclerView_android_orientation, 1);
            cVar.f4072b = obtainStyledAttributes.getInt(C7651b.RecyclerView_spanCount, 1);
            cVar.f4073c = obtainStyledAttributes.getBoolean(C7651b.RecyclerView_reverseLayout, false);
            cVar.f4074d = obtainStyledAttributes.getBoolean(C7651b.RecyclerView_stackFromEnd, false);
            obtainStyledAttributes.recycle();
            return cVar;
        }
    }

    public static class LayoutParams extends MarginLayoutParams {

        /* renamed from: a */
        C1085v f4075a;

        /* renamed from: b */
        final Rect f4076b = new Rect();

        /* renamed from: c */
        boolean f4077c = true;

        /* renamed from: d */
        boolean f4078d = false;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: a */
        public int mo5321a() {
            return this.f4075a.getLayoutPosition();
        }

        /* renamed from: b */
        public boolean mo5322b() {
            return this.f4075a.isUpdated();
        }

        /* renamed from: c */
        public boolean mo5323c() {
            return this.f4075a.isRemoved();
        }

        /* renamed from: d */
        public boolean mo5324d() {
            return this.f4075a.isInvalid();
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public interface OnChildAttachStateChangeListener {
        void onChildViewAttachedToWindow(View view);

        void onChildViewDetachedFromWindow(View view);
    }

    public interface OnItemTouchListener {
        boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent);

        void onRequestDisallowInterceptTouchEvent(boolean z);

        void onTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent);
    }

    public interface RecyclerListener {
        void onViewRecycled(C1085v vVar);
    }

    public static class SavedState extends AbsSavedState {
        public static final Creator<SavedState> CREATOR = new C1061a();

        /* renamed from: g */
        Parcelable f4079g;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$SavedState$a */
        static class C1061a implements ClassLoaderCreator<SavedState> {
            C1061a() {
            }

            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                classLoader = LayoutManager.class.getClassLoader();
            }
            this.f4079g = parcel.readParcelable(classLoader);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo5331a(SavedState savedState) {
            this.f4079g = savedState.f4079g;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.f4079g, 0);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public static abstract class SmoothScroller {
        private LayoutManager mLayoutManager;
        private boolean mPendingInitialRun;
        private RecyclerView mRecyclerView;
        private final C1062a mRecyclingAction = new C1062a(0, 0);
        private boolean mRunning;
        private boolean mStarted;
        private int mTargetPosition = -1;
        private View mTargetView;

        public interface ScrollVectorProvider {
            PointF computeScrollVectorForPosition(int i);
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$SmoothScroller$a */
        public static class C1062a {

            /* renamed from: a */
            private int f4080a;

            /* renamed from: b */
            private int f4081b;

            /* renamed from: c */
            private int f4082c;

            /* renamed from: d */
            private int f4083d;

            /* renamed from: e */
            private Interpolator f4084e;

            /* renamed from: f */
            private boolean f4085f;

            /* renamed from: g */
            private int f4086g;

            public C1062a(int i, int i2) {
                this(i, i2, Integer.MIN_VALUE, null);
            }

            /* renamed from: b */
            private void m5128b() {
                if (this.f4084e != null && this.f4082c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                } else if (this.f4082c < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }

            /* renamed from: a */
            public void mo5353a(int i) {
                this.f4083d = i;
            }

            public C1062a(int i, int i2, int i3, Interpolator interpolator) {
                this.f4083d = -1;
                this.f4085f = false;
                this.f4086g = 0;
                this.f4080a = i;
                this.f4081b = i2;
                this.f4082c = i3;
                this.f4084e = interpolator;
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public boolean mo5356a() {
                return this.f4083d >= 0;
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public void mo5355a(RecyclerView recyclerView) {
                int i = this.f4083d;
                if (i >= 0) {
                    this.f4083d = -1;
                    recyclerView.mo5072c(i);
                    this.f4085f = false;
                    return;
                }
                if (this.f4085f) {
                    m5128b();
                    recyclerView.f4014i0.mo5493a(this.f4080a, this.f4081b, this.f4082c, this.f4084e);
                    this.f4086g++;
                    if (this.f4086g > 10) {
                        Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    this.f4085f = false;
                } else {
                    this.f4086g = 0;
                }
            }

            /* renamed from: a */
            public void mo5354a(int i, int i2, int i3, Interpolator interpolator) {
                this.f4080a = i;
                this.f4081b = i2;
                this.f4082c = i3;
                this.f4084e = interpolator;
                this.f4085f = true;
            }
        }

        public PointF computeScrollVectorForPosition(int i) {
            LayoutManager layoutManager = getLayoutManager();
            if (layoutManager instanceof ScrollVectorProvider) {
                return ((ScrollVectorProvider) layoutManager).computeScrollVectorForPosition(i);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("You should override computeScrollVectorForPosition when the LayoutManager does not implement ");
            sb.append(ScrollVectorProvider.class.getCanonicalName());
            Log.w("RecyclerView", sb.toString());
            return null;
        }

        public View findViewByPosition(int i) {
            return this.mRecyclerView.f4029q.mo4995b(i);
        }

        public int getChildCount() {
            return this.mRecyclerView.f4029q.mo5278e();
        }

        public int getChildPosition(View view) {
            return this.mRecyclerView.mo5089f(view);
        }

        public LayoutManager getLayoutManager() {
            return this.mLayoutManager;
        }

        public int getTargetPosition() {
            return this.mTargetPosition;
        }

        public boolean isPendingInitialRun() {
            return this.mPendingInitialRun;
        }

        public boolean isRunning() {
            return this.mRunning;
        }

        /* access modifiers changed from: protected */
        public void normalize(PointF pointF) {
            float f = pointF.x;
            float f2 = f * f;
            float f3 = pointF.y;
            float sqrt = (float) Math.sqrt((double) (f2 + (f3 * f3)));
            pointF.x /= sqrt;
            pointF.y /= sqrt;
        }

        /* access modifiers changed from: 0000 */
        public void onAnimation(int i, int i2) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (this.mTargetPosition == -1 || recyclerView == null) {
                stop();
            }
            if (this.mPendingInitialRun && this.mTargetView == null && this.mLayoutManager != null) {
                PointF computeScrollVectorForPosition = computeScrollVectorForPosition(this.mTargetPosition);
                if (!(computeScrollVectorForPosition == null || (computeScrollVectorForPosition.x == 0.0f && computeScrollVectorForPosition.y == 0.0f))) {
                    recyclerView.mo5038a((int) Math.signum(computeScrollVectorForPosition.x), (int) Math.signum(computeScrollVectorForPosition.y), (int[]) null);
                }
            }
            this.mPendingInitialRun = false;
            View view = this.mTargetView;
            if (view != null) {
                if (getChildPosition(view) == this.mTargetPosition) {
                    onTargetFound(this.mTargetView, recyclerView.f4020l0, this.mRecyclingAction);
                    this.mRecyclingAction.mo5355a(recyclerView);
                    stop();
                } else {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    this.mTargetView = null;
                }
            }
            if (this.mRunning) {
                onSeekTargetStep(i, i2, recyclerView.f4020l0, this.mRecyclingAction);
                boolean a = this.mRecyclingAction.mo5356a();
                this.mRecyclingAction.mo5355a(recyclerView);
                if (a && this.mRunning) {
                    this.mPendingInitialRun = true;
                    recyclerView.f4014i0.mo5491a();
                }
            }
        }

        /* access modifiers changed from: protected */
        public void onChildAttachedToWindow(View view) {
            if (getChildPosition(view) == getTargetPosition()) {
                this.mTargetView = view;
            }
        }

        /* access modifiers changed from: protected */
        public abstract void onSeekTargetStep(int i, int i2, C1082s sVar, C1062a aVar);

        /* access modifiers changed from: protected */
        public abstract void onStart();

        /* access modifiers changed from: protected */
        public abstract void onStop();

        /* access modifiers changed from: protected */
        public abstract void onTargetFound(View view, C1082s sVar, C1062a aVar);

        public void setTargetPosition(int i) {
            this.mTargetPosition = i;
        }

        /* access modifiers changed from: 0000 */
        public void start(RecyclerView recyclerView, LayoutManager layoutManager) {
            recyclerView.f4014i0.mo5494b();
            if (this.mStarted) {
                StringBuilder sb = new StringBuilder();
                sb.append("An instance of ");
                sb.append(getClass().getSimpleName());
                sb.append(" was started more than once. Each instance of");
                sb.append(getClass().getSimpleName());
                sb.append(" is intended to only be used once. You should create a new instance for each use.");
                Log.w("RecyclerView", sb.toString());
            }
            this.mRecyclerView = recyclerView;
            this.mLayoutManager = layoutManager;
            int i = this.mTargetPosition;
            if (i != -1) {
                this.mRecyclerView.f4020l0.f4109a = i;
                this.mRunning = true;
                this.mPendingInitialRun = true;
                this.mTargetView = findViewByPosition(getTargetPosition());
                onStart();
                this.mRecyclerView.f4014i0.mo5491a();
                this.mStarted = true;
                return;
            }
            throw new IllegalArgumentException("Invalid target position");
        }

        /* access modifiers changed from: protected */
        public final void stop() {
            if (this.mRunning) {
                this.mRunning = false;
                onStop();
                this.mRecyclerView.f4020l0.f4109a = -1;
                this.mTargetView = null;
                this.mTargetPosition = -1;
                this.mPendingInitialRun = false;
                this.mLayoutManager.mo5233a(this);
                this.mLayoutManager = null;
                this.mRecyclerView = null;
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$a */
    class C1063a implements Runnable {
        C1063a() {
        }

        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f4045y && !recyclerView.isLayoutRequested()) {
                RecyclerView recyclerView2 = RecyclerView.this;
                if (!recyclerView2.f4039v) {
                    recyclerView2.requestLayout();
                } else if (recyclerView2.f3978B) {
                    recyclerView2.f3976A = true;
                } else {
                    recyclerView2.mo5060b();
                }
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$b */
    class C1064b implements Runnable {
        C1064b() {
        }

        public void run() {
            ItemAnimator itemAnimator = RecyclerView.this.f3994Q;
            if (itemAnimator != null) {
                itemAnimator.runPendingAnimations();
            }
            RecyclerView.this.f4032r0 = false;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$c */
    static class C1065c implements Interpolator {
        C1065c() {
        }

        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$d */
    class C1066d implements C1158b {
        C1066d() {
        }

        /* renamed from: a */
        public void mo5361a(C1085v vVar, C1057b bVar, C1057b bVar2) {
            RecyclerView.this.mo5050a(vVar, bVar, bVar2);
        }

        /* renamed from: b */
        public void mo5362b(C1085v vVar, C1057b bVar, C1057b bVar2) {
            RecyclerView.this.f4007f.mo5469c(vVar);
            RecyclerView.this.mo5067b(vVar, bVar, bVar2);
        }

        /* renamed from: c */
        public void mo5363c(C1085v vVar, C1057b bVar, C1057b bVar2) {
            vVar.setIsRecyclable(false);
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f3985H) {
                if (recyclerView.f3994Q.animateChange(vVar, vVar, bVar, bVar2)) {
                    RecyclerView.this.mo5155s();
                }
            } else if (recyclerView.f3994Q.animatePersistence(vVar, bVar, bVar2)) {
                RecyclerView.this.mo5155s();
            }
        }

        /* renamed from: a */
        public void mo5360a(C1085v vVar) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f4029q.mo5259b(vVar.itemView, recyclerView.f4007f);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$e */
    class C1067e implements C1100b {
        C1067e() {
        }

        /* renamed from: a */
        public int mo5364a() {
            return RecyclerView.this.getChildCount();
        }

        /* renamed from: b */
        public void mo5370b() {
            int a = mo5364a();
            for (int i = 0; i < a; i++) {
                View a2 = mo5365a(i);
                RecyclerView.this.mo5062b(a2);
                a2.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        /* renamed from: c */
        public int mo5372c(View view) {
            return RecyclerView.this.indexOfChild(view);
        }

        /* renamed from: d */
        public void mo5374d(View view) {
            C1085v m = RecyclerView.m4874m(view);
            if (m != null) {
                m.onLeftHiddenState(RecyclerView.this);
            }
        }

        /* renamed from: a */
        public void mo5367a(View view, int i) {
            RecyclerView.this.addView(view, i);
            RecyclerView.this.mo5040a(view);
        }

        /* renamed from: c */
        public void mo5373c(int i) {
            View childAt = RecyclerView.this.getChildAt(i);
            if (childAt != null) {
                RecyclerView.this.mo5062b(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i);
        }

        /* renamed from: a */
        public View mo5365a(int i) {
            return RecyclerView.this.getChildAt(i);
        }

        /* renamed from: a */
        public void mo5368a(View view, int i, android.view.ViewGroup.LayoutParams layoutParams) {
            C1085v m = RecyclerView.m4874m(view);
            if (m != null) {
                if (m.isTmpDetached() || m.shouldIgnore()) {
                    m.clearTmpDetachFlag();
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Called attach on a child which is not detached: ");
                    sb.append(m);
                    sb.append(RecyclerView.this.mo5122i());
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            RecyclerView.this.attachViewToParent(view, i, layoutParams);
        }

        /* renamed from: b */
        public C1085v mo5369b(View view) {
            return RecyclerView.m4874m(view);
        }

        /* renamed from: b */
        public void mo5371b(int i) {
            View a = mo5365a(i);
            if (a != null) {
                C1085v m = RecyclerView.m4874m(a);
                if (m != null) {
                    if (!m.isTmpDetached() || m.shouldIgnore()) {
                        m.addFlags(256);
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("called detach on an already detached child ");
                        sb.append(m);
                        sb.append(RecyclerView.this.mo5122i());
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
            }
            RecyclerView.this.detachViewFromParent(i);
        }

        /* renamed from: a */
        public void mo5366a(View view) {
            C1085v m = RecyclerView.m4874m(view);
            if (m != null) {
                m.onEnteredHiddenState(RecyclerView.this);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$f */
    class C1068f implements C1092a {
        C1068f() {
        }

        /* renamed from: a */
        public C1085v mo5375a(int i) {
            C1085v a = RecyclerView.this.mo5029a(i, true);
            if (a != null && !RecyclerView.this.f4013i.mo5653c(a.itemView)) {
                return a;
            }
            return null;
        }

        /* renamed from: b */
        public void mo5379b(int i, int i2) {
            RecyclerView.this.mo5037a(i, i2, false);
            RecyclerView.this.f4026o0 = true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo5382c(C1093b bVar) {
            int i = bVar.f4197a;
            if (i == 1) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.f4029q.mo4939a(recyclerView, bVar.f4198b, bVar.f4200d);
            } else if (i == 2) {
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.f4029q.mo4946b(recyclerView2, bVar.f4198b, bVar.f4200d);
            } else if (i == 4) {
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.f4029q.mo4941a(recyclerView3, bVar.f4198b, bVar.f4200d, bVar.f4199c);
            } else if (i == 8) {
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.f4029q.mo4940a(recyclerView4, bVar.f4198b, bVar.f4200d, 1);
            }
        }

        /* renamed from: d */
        public void mo5383d(int i, int i2) {
            RecyclerView.this.mo5037a(i, i2, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f4026o0 = true;
            recyclerView.f4020l0.f4112d += i2;
        }

        /* renamed from: a */
        public void mo5377a(int i, int i2, Object obj) {
            RecyclerView.this.mo5036a(i, i2, obj);
            RecyclerView.this.f4028p0 = true;
        }

        /* renamed from: b */
        public void mo5380b(C1093b bVar) {
            mo5382c(bVar);
        }

        /* renamed from: a */
        public void mo5378a(C1093b bVar) {
            mo5382c(bVar);
        }

        /* renamed from: a */
        public void mo5376a(int i, int i2) {
            RecyclerView.this.mo5097g(i, i2);
            RecyclerView.this.f4026o0 = true;
        }

        /* renamed from: c */
        public void mo5381c(int i, int i2) {
            RecyclerView.this.mo5092f(i, i2);
            RecyclerView.this.f4026o0 = true;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$g */
    public static abstract class C1069g<VH extends C1085v> {
        private boolean mHasStableIds = false;
        private final C1070h mObservable = new C1070h();

        public final void bindViewHolder(VH vh, int i) {
            vh.mPosition = i;
            if (hasStableIds()) {
                vh.mItemId = getItemId(i);
            }
            vh.setFlags(1, 519);
            C0569g.m2680a("RV OnBindView");
            onBindViewHolder(vh, i, vh.getUnmodifiedPayloads());
            vh.clearPayload();
            android.view.ViewGroup.LayoutParams layoutParams = vh.itemView.getLayoutParams();
            if (layoutParams instanceof LayoutParams) {
                ((LayoutParams) layoutParams).f4077c = true;
            }
            C0569g.m2679a();
        }

        public final VH createViewHolder(ViewGroup viewGroup, int i) {
            try {
                C0569g.m2680a("RV CreateView");
                VH onCreateViewHolder = onCreateViewHolder(viewGroup, i);
                if (onCreateViewHolder.itemView.getParent() == null) {
                    onCreateViewHolder.mItemViewType = i;
                    return onCreateViewHolder;
                }
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            } finally {
                C0569g.m2679a();
            }
        }

        public abstract int getItemCount();

        public long getItemId(int i) {
            return -1;
        }

        public int getItemViewType(int i) {
            return 0;
        }

        public final boolean hasObservers() {
            return this.mObservable.mo5414a();
        }

        public final boolean hasStableIds() {
            return this.mHasStableIds;
        }

        public final void notifyDataSetChanged() {
            this.mObservable.mo5415b();
        }

        public final void notifyItemChanged(int i) {
            this.mObservable.mo5416b(i, 1);
        }

        public final void notifyItemInserted(int i) {
            this.mObservable.mo5417c(i, 1);
        }

        public final void notifyItemMoved(int i, int i2) {
            this.mObservable.mo5412a(i, i2);
        }

        public final void notifyItemRangeChanged(int i, int i2) {
            this.mObservable.mo5416b(i, i2);
        }

        public final void notifyItemRangeInserted(int i, int i2) {
            this.mObservable.mo5417c(i, i2);
        }

        public final void notifyItemRangeRemoved(int i, int i2) {
            this.mObservable.mo5418d(i, i2);
        }

        public final void notifyItemRemoved(int i) {
            this.mObservable.mo5418d(i, 1);
        }

        public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        }

        public abstract void onBindViewHolder(VH vh, int i);

        public void onBindViewHolder(VH vh, int i, List<Object> list) {
            onBindViewHolder(vh, i);
        }

        public abstract VH onCreateViewHolder(ViewGroup viewGroup, int i);

        public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        }

        public boolean onFailedToRecycleView(VH vh) {
            return false;
        }

        public void onViewAttachedToWindow(VH vh) {
        }

        public void onViewDetachedFromWindow(VH vh) {
        }

        public void onViewRecycled(VH vh) {
        }

        public void registerAdapterDataObserver(C1071i iVar) {
            this.mObservable.registerObserver(iVar);
        }

        public void setHasStableIds(boolean z) {
            if (!hasObservers()) {
                this.mHasStableIds = z;
                return;
            }
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }

        public void unregisterAdapterDataObserver(C1071i iVar) {
            this.mObservable.unregisterObserver(iVar);
        }

        public final void notifyItemChanged(int i, Object obj) {
            this.mObservable.mo5413a(i, 1, obj);
        }

        public final void notifyItemRangeChanged(int i, int i2, Object obj) {
            this.mObservable.mo5413a(i, i2, obj);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$h */
    static class C1070h extends Observable<C1071i> {
        C1070h() {
        }

        /* renamed from: a */
        public boolean mo5414a() {
            return !this.mObservers.isEmpty();
        }

        /* renamed from: b */
        public void mo5415b() {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C1071i) this.mObservers.get(size)).mo5419a();
            }
        }

        /* renamed from: c */
        public void mo5417c(int i, int i2) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C1071i) this.mObservers.get(size)).mo5423b(i, i2);
            }
        }

        /* renamed from: d */
        public void mo5418d(int i, int i2) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C1071i) this.mObservers.get(size)).mo5424c(i, i2);
            }
        }

        /* renamed from: a */
        public void mo5413a(int i, int i2, Object obj) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C1071i) this.mObservers.get(size)).mo5422a(i, i2, obj);
            }
        }

        /* renamed from: b */
        public void mo5416b(int i, int i2) {
            mo5413a(i, i2, null);
        }

        /* renamed from: a */
        public void mo5412a(int i, int i2) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C1071i) this.mObservers.get(size)).mo5421a(i, i2, 1);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$i */
    public static abstract class C1071i {
        /* renamed from: a */
        public void mo5419a() {
        }

        /* renamed from: a */
        public void mo5420a(int i, int i2) {
        }

        /* renamed from: a */
        public void mo5421a(int i, int i2, int i3) {
        }

        /* renamed from: a */
        public void mo5422a(int i, int i2, Object obj) {
            mo5420a(i, i2);
        }

        /* renamed from: b */
        public void mo5423b(int i, int i2) {
        }

        /* renamed from: c */
        public void mo5424c(int i, int i2) {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$j */
    public static class C1072j {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public EdgeEffect mo5425a(RecyclerView recyclerView, int i) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$k */
    private class C1073k implements C1056a {
        C1073k() {
        }

        /* renamed from: a */
        public void mo5214a(C1085v vVar) {
            vVar.setIsRecyclable(true);
            if (vVar.mShadowedHolder != null && vVar.mShadowingHolder == null) {
                vVar.mShadowedHolder = null;
            }
            vVar.mShadowingHolder = null;
            if (!vVar.shouldBeKeptAsChild() && !RecyclerView.this.mo5130k(vVar.itemView) && vVar.isTmpDetached()) {
                RecyclerView.this.removeDetachedView(vVar.itemView, false);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$l */
    public static abstract class C1074l {
        @Deprecated
        public void getItemOffsets(Rect rect, int i, RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        @Deprecated
        public void onDraw(Canvas canvas, RecyclerView recyclerView) {
        }

        public void onDraw(Canvas canvas, RecyclerView recyclerView, C1082s sVar) {
            onDraw(canvas, recyclerView);
        }

        @Deprecated
        public void onDrawOver(Canvas canvas, RecyclerView recyclerView) {
        }

        public void onDrawOver(Canvas canvas, RecyclerView recyclerView, C1082s sVar) {
            onDrawOver(canvas, recyclerView);
        }

        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1082s sVar) {
            getItemOffsets(rect, ((LayoutParams) view.getLayoutParams()).mo5321a(), recyclerView);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$m */
    public static abstract class C1075m {
        /* renamed from: a */
        public abstract boolean mo5432a(int i, int i2);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$n */
    public static abstract class C1076n {
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$o */
    public static class C1077o {

        /* renamed from: a */
        SparseArray<C1078a> f4093a = new SparseArray<>();

        /* renamed from: b */
        private int f4094b = 0;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$o$a */
        static class C1078a {

            /* renamed from: a */
            final ArrayList<C1085v> f4095a = new ArrayList<>();

            /* renamed from: b */
            int f4096b = 5;

            /* renamed from: c */
            long f4097c = 0;

            /* renamed from: d */
            long f4098d = 0;

            C1078a() {
            }
        }

        /* renamed from: a */
        public C1085v mo5436a(int i) {
            C1078a aVar = (C1078a) this.f4093a.get(i);
            if (aVar != null && !aVar.f4095a.isEmpty()) {
                ArrayList<C1085v> arrayList = aVar.f4095a;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (!((C1085v) arrayList.get(size)).isAttachedToTransitionOverlay()) {
                        return (C1085v) arrayList.remove(size);
                    }
                }
            }
            return null;
        }

        /* renamed from: b */
        public void mo5442b() {
            for (int i = 0; i < this.f4093a.size(); i++) {
                ((C1078a) this.f4093a.valueAt(i)).f4095a.clear();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo5445c() {
            this.f4094b--;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo5443b(int i, long j) {
            C1078a b = m5173b(i);
            b.f4097c = mo5435a(b.f4097c, j);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public boolean mo5444b(int i, long j, long j2) {
            long j3 = m5173b(i).f4097c;
            return j3 == 0 || j + j3 < j2;
        }

        /* renamed from: b */
        private C1078a m5173b(int i) {
            C1078a aVar = (C1078a) this.f4093a.get(i);
            if (aVar != null) {
                return aVar;
            }
            C1078a aVar2 = new C1078a();
            this.f4093a.put(i, aVar2);
            return aVar2;
        }

        /* renamed from: a */
        public void mo5440a(C1085v vVar) {
            int itemViewType = vVar.getItemViewType();
            ArrayList<C1085v> arrayList = m5173b(itemViewType).f4095a;
            if (((C1078a) this.f4093a.get(itemViewType)).f4096b > arrayList.size()) {
                vVar.resetInternal();
                arrayList.add(vVar);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public long mo5435a(long j, long j2) {
            return j == 0 ? j2 : ((j / 4) * 3) + (j2 / 4);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo5438a(int i, long j) {
            C1078a b = m5173b(i);
            b.f4098d = mo5435a(b.f4098d, j);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo5441a(int i, long j, long j2) {
            long j3 = m5173b(i).f4098d;
            return j3 == 0 || j + j3 < j2;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo5437a() {
            this.f4094b++;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo5439a(C1069g gVar, C1069g gVar2, boolean z) {
            if (gVar != null) {
                mo5445c();
            }
            if (!z && this.f4094b == 0) {
                mo5442b();
            }
            if (gVar2 != null) {
                mo5437a();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$p */
    public final class C1079p {

        /* renamed from: a */
        final ArrayList<C1085v> f4099a = new ArrayList<>();

        /* renamed from: b */
        ArrayList<C1085v> f4100b = null;

        /* renamed from: c */
        final ArrayList<C1085v> f4101c = new ArrayList<>();

        /* renamed from: d */
        private final List<C1085v> f4102d = Collections.unmodifiableList(this.f4099a);

        /* renamed from: e */
        private int f4103e = 2;

        /* renamed from: f */
        int f4104f = 2;

        /* renamed from: g */
        C1077o f4105g;

        /* renamed from: h */
        private C1083t f4106h;

        public C1079p() {
        }

        /* renamed from: e */
        private void m5187e(C1085v vVar) {
            if (RecyclerView.this.mo5132m()) {
                View view = vVar.itemView;
                if (ViewCompat.m2860m(view) == 0) {
                    ViewCompat.m2852g(view, 1);
                }
                C0615a b = ViewCompat.m2833b(view);
                if (b == null || b.getClass().equals(C0615a.class)) {
                    vVar.addFlags(16384);
                    ViewCompat.m2824a(view, RecyclerView.this.f4034s0.mo5765b());
                }
            }
        }

        /* renamed from: a */
        public void mo5450a() {
            this.f4099a.clear();
            mo5479i();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public View mo5459b(int i, boolean z) {
            return mo5448a(i, z, Long.MAX_VALUE).itemView;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo5468c(View view) {
            C1085v m = RecyclerView.m4874m(view);
            if (!m.hasAnyOfTheFlags(12) && m.isUpdated() && !RecyclerView.this.mo5055a(m)) {
                if (this.f4100b == null) {
                    this.f4100b = new ArrayList<>();
                }
                m.setScrapContainer(this, true);
                this.f4100b.add(m);
            } else if (!m.isInvalid() || m.isRemoved() || RecyclerView.this.f4027p.hasStableIds()) {
                m.setScrapContainer(this, false);
                this.f4099a.add(m);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.");
                sb.append(RecyclerView.this.mo5122i());
                throw new IllegalArgumentException(sb.toString());
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public boolean mo5472d(C1085v vVar) {
            if (vVar.isRemoved()) {
                return RecyclerView.this.f4020l0.mo5487d();
            }
            int i = vVar.mPosition;
            if (i < 0 || i >= RecyclerView.this.f4027p.getItemCount()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Inconsistency detected. Invalid view holder adapter position");
                sb.append(vVar);
                sb.append(RecyclerView.this.mo5122i());
                throw new IndexOutOfBoundsException(sb.toString());
            }
            boolean z = false;
            if (!RecyclerView.this.f4020l0.mo5487d() && RecyclerView.this.f4027p.getItemViewType(vVar.mPosition) != vVar.getItemViewType()) {
                return false;
            }
            if (!RecyclerView.this.f4027p.hasStableIds()) {
                return true;
            }
            if (vVar.getItemId() == RecyclerView.this.f4027p.getItemId(vVar.mPosition)) {
                z = true;
            }
            return z;
        }

        /* renamed from: f */
        public void mo5476f(int i) {
            this.f4103e = i;
            mo5480j();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: g */
        public void mo5477g() {
            int size = this.f4101c.size();
            for (int i = 0; i < size; i++) {
                LayoutParams layoutParams = (LayoutParams) ((C1085v) this.f4101c.get(i)).itemView.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.f4077c = true;
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: h */
        public void mo5478h() {
            int size = this.f4101c.size();
            for (int i = 0; i < size; i++) {
                C1085v vVar = (C1085v) this.f4101c.get(i);
                if (vVar != null) {
                    vVar.addFlags(6);
                    vVar.addChangePayload(null);
                }
            }
            C1069g gVar = RecyclerView.this.f4027p;
            if (gVar == null || !gVar.hasStableIds()) {
                mo5479i();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: i */
        public void mo5479i() {
            for (int size = this.f4101c.size() - 1; size >= 0; size--) {
                mo5474e(size);
            }
            this.f4101c.clear();
            if (RecyclerView.f3971H0) {
                RecyclerView.this.f4018k0.mo5722a();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: j */
        public void mo5480j() {
            LayoutManager layoutManager = RecyclerView.this.f4029q;
            this.f4104f = this.f4103e + (layoutManager != null ? layoutManager.f4063m : 0);
            for (int size = this.f4101c.size() - 1; size >= 0 && this.f4101c.size() > this.f4104f; size--) {
                mo5474e(size);
            }
        }

        /* renamed from: b */
        public void mo5463b(View view) {
            C1085v m = RecyclerView.m4874m(view);
            if (m.isTmpDetached()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (m.isScrap()) {
                m.unScrap();
            } else if (m.wasReturnedFromScrap()) {
                m.clearReturnedFromScrapFlag();
            }
            mo5464b(m);
            if (RecyclerView.this.f3994Q != null && !m.isRecyclable()) {
                RecyclerView.this.f3994Q.endAnimation(m);
            }
        }

        /* renamed from: a */
        private boolean m5186a(C1085v vVar, int i, int i2, long j) {
            vVar.mOwnerRecyclerView = RecyclerView.this;
            int itemViewType = vVar.getItemViewType();
            long nanoTime = RecyclerView.this.getNanoTime();
            if (j != Long.MAX_VALUE && !this.f4105g.mo5441a(itemViewType, nanoTime, j)) {
                return false;
            }
            RecyclerView.this.f4027p.bindViewHolder(vVar, i);
            this.f4105g.mo5438a(vVar.getItemViewType(), RecyclerView.this.getNanoTime() - nanoTime);
            m5187e(vVar);
            if (RecyclerView.this.f4020l0.mo5487d()) {
                vVar.mPreLayoutPosition = i2;
            }
            return true;
        }

        /* renamed from: f */
        public List<C1085v> mo5475f() {
            return this.f4102d;
        }

        /* renamed from: f */
        private void m5188f(C1085v vVar) {
            View view = vVar.itemView;
            if (view instanceof ViewGroup) {
                m5185a((ViewGroup) view, false);
            }
        }

        /* renamed from: d */
        public View mo5470d(int i) {
            return mo5459b(i, false);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo5474e(int i) {
            mo5458a((C1085v) this.f4101c.get(i), true);
            this.f4101c.remove(i);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo5464b(C1085v vVar) {
            boolean z;
            boolean z2 = false;
            if (vVar.isScrap() || vVar.itemView.getParent() != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Scrapped or attached views may not be recycled. isScrap:");
                sb.append(vVar.isScrap());
                sb.append(" isAttached:");
                if (vVar.itemView.getParent() != null) {
                    z2 = true;
                }
                sb.append(z2);
                sb.append(RecyclerView.this.mo5122i());
                throw new IllegalArgumentException(sb.toString());
            } else if (vVar.isTmpDetached()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
                sb2.append(vVar);
                sb2.append(RecyclerView.this.mo5122i());
                throw new IllegalArgumentException(sb2.toString());
            } else if (!vVar.shouldIgnore()) {
                boolean doesTransientStatePreventRecycling = vVar.doesTransientStatePreventRecycling();
                C1069g gVar = RecyclerView.this.f4027p;
                if ((gVar != null && doesTransientStatePreventRecycling && gVar.onFailedToRecycleView(vVar)) || vVar.isRecyclable()) {
                    if (this.f4104f <= 0 || vVar.hasAnyOfTheFlags(526)) {
                        z = false;
                    } else {
                        int size = this.f4101c.size();
                        if (size >= this.f4104f && size > 0) {
                            mo5474e(0);
                            size--;
                        }
                        if (RecyclerView.f3971H0 && size > 0 && !RecyclerView.this.f4018k0.mo5725a(vVar.mPosition)) {
                            int i = size - 1;
                            while (i >= 0) {
                                if (!RecyclerView.this.f4018k0.mo5725a(((C1085v) this.f4101c.get(i)).mPosition)) {
                                    break;
                                }
                                i--;
                            }
                            size = i + 1;
                        }
                        this.f4101c.add(size, vVar);
                        z = true;
                    }
                    if (!z) {
                        mo5458a(vVar, true);
                        z2 = true;
                    }
                } else {
                    z = false;
                }
                RecyclerView.this.f4015j.mo5824h(vVar);
                if (!z && !z2 && doesTransientStatePreventRecycling) {
                    vVar.mOwnerRecyclerView = null;
                }
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.");
                sb3.append(RecyclerView.this.mo5122i());
                throw new IllegalArgumentException(sb3.toString());
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public C1077o mo5471d() {
            if (this.f4105g == null) {
                this.f4105g = new C1077o();
            }
            return this.f4105g;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo5469c(C1085v vVar) {
            if (vVar.mInChangeScrap) {
                this.f4100b.remove(vVar);
            } else {
                this.f4099a.remove(vVar);
            }
            vVar.mScrapContainer = null;
            vVar.mInChangeScrap = false;
            vVar.clearReturnedFromScrapFlag();
        }

        /* renamed from: a */
        public int mo5446a(int i) {
            if (i < 0 || i >= RecyclerView.this.f4020l0.mo5482a()) {
                StringBuilder sb = new StringBuilder();
                sb.append("invalid position ");
                sb.append(i);
                sb.append(". State item count is ");
                sb.append(RecyclerView.this.f4020l0.mo5482a());
                sb.append(RecyclerView.this.mo5122i());
                throw new IndexOutOfBoundsException(sb.toString());
            } else if (!RecyclerView.this.f4020l0.mo5487d()) {
                return i;
            } else {
                return RecyclerView.this.f4011h.mo5624b(i);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public int mo5473e() {
            return this.f4099a.size();
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x002b  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x005f  */
        /* JADX WARNING: Removed duplicated region for block: B:78:0x01a1  */
        /* JADX WARNING: Removed duplicated region for block: B:81:0x01c4  */
        /* JADX WARNING: Removed duplicated region for block: B:94:0x01fd  */
        /* JADX WARNING: Removed duplicated region for block: B:95:0x020b  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public androidx.recyclerview.widget.RecyclerView.C1085v mo5448a(int r17, boolean r18, long r19) {
            /*
                r16 = this;
                r6 = r16
                r3 = r17
                r0 = r18
                if (r3 < 0) goto L_0x022e
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$s r1 = r1.f4020l0
                int r1 = r1.mo5482a()
                if (r3 >= r1) goto L_0x022e
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$s r1 = r1.f4020l0
                boolean r1 = r1.mo5487d()
                r2 = 0
                r7 = 1
                r8 = 0
                if (r1 == 0) goto L_0x0027
                androidx.recyclerview.widget.RecyclerView$v r1 = r16.mo5460b(r17)
                if (r1 == 0) goto L_0x0028
                r4 = 1
                goto L_0x0029
            L_0x0027:
                r1 = r2
            L_0x0028:
                r4 = 0
            L_0x0029:
                if (r1 != 0) goto L_0x005d
                androidx.recyclerview.widget.RecyclerView$v r1 = r16.mo5447a(r17, r18)
                if (r1 == 0) goto L_0x005d
                boolean r5 = r6.mo5472d(r1)
                if (r5 != 0) goto L_0x005c
                if (r0 != 0) goto L_0x005a
                r5 = 4
                r1.addFlags(r5)
                boolean r5 = r1.isScrap()
                if (r5 == 0) goto L_0x004e
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                android.view.View r9 = r1.itemView
                r5.removeDetachedView(r9, r8)
                r1.unScrap()
                goto L_0x0057
            L_0x004e:
                boolean r5 = r1.wasReturnedFromScrap()
                if (r5 == 0) goto L_0x0057
                r1.clearReturnedFromScrapFlag()
            L_0x0057:
                r6.mo5464b(r1)
            L_0x005a:
                r1 = r2
                goto L_0x005d
            L_0x005c:
                r4 = 1
            L_0x005d:
                if (r1 != 0) goto L_0x0180
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.a r5 = r5.f4011h
                int r5 = r5.mo5624b(r3)
                if (r5 < 0) goto L_0x0148
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$g r9 = r9.f4027p
                int r9 = r9.getItemCount()
                if (r5 >= r9) goto L_0x0148
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$g r9 = r9.f4027p
                int r9 = r9.getItemViewType(r5)
                androidx.recyclerview.widget.RecyclerView r10 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$g r10 = r10.f4027p
                boolean r10 = r10.hasStableIds()
                if (r10 == 0) goto L_0x0096
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$g r1 = r1.f4027p
                long r10 = r1.getItemId(r5)
                androidx.recyclerview.widget.RecyclerView$v r1 = r6.mo5449a(r10, r9, r0)
                if (r1 == 0) goto L_0x0096
                r1.mPosition = r5
                r4 = 1
            L_0x0096:
                if (r1 != 0) goto L_0x00eb
                androidx.recyclerview.widget.RecyclerView$t r0 = r6.f4106h
                if (r0 == 0) goto L_0x00eb
                android.view.View r0 = r0.mo5490a(r6, r3, r9)
                if (r0 == 0) goto L_0x00eb
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$v r1 = r1.mo5094g(r0)
                if (r1 == 0) goto L_0x00ce
                boolean r0 = r1.shouldIgnore()
                if (r0 != 0) goto L_0x00b1
                goto L_0x00eb
            L_0x00b1:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "getViewForPositionAndType returned a view that is ignored. You must call stopIgnoring before returning this view."
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = r2.mo5122i()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x00ce:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "getViewForPositionAndType returned a view which does not have a ViewHolder"
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = r2.mo5122i()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x00eb:
                if (r1 != 0) goto L_0x0101
                androidx.recyclerview.widget.RecyclerView$o r0 = r16.mo5471d()
                androidx.recyclerview.widget.RecyclerView$v r1 = r0.mo5436a(r9)
                if (r1 == 0) goto L_0x0101
                r1.resetInternal()
                boolean r0 = androidx.recyclerview.widget.RecyclerView.f3968E0
                if (r0 == 0) goto L_0x0101
                r6.m5188f(r1)
            L_0x0101:
                if (r1 != 0) goto L_0x0180
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                long r0 = r0.getNanoTime()
                r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r5 = (r19 > r10 ? 1 : (r19 == r10 ? 0 : -1))
                if (r5 == 0) goto L_0x011f
                androidx.recyclerview.widget.RecyclerView$o r10 = r6.f4105g
                r11 = r9
                r12 = r0
                r14 = r19
                boolean r5 = r10.mo5444b(r11, r12, r14)
                if (r5 != 0) goto L_0x011f
                return r2
            L_0x011f:
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$g r5 = r2.f4027p
                androidx.recyclerview.widget.RecyclerView$v r2 = r5.createViewHolder(r2, r9)
                boolean r5 = androidx.recyclerview.widget.RecyclerView.f3971H0
                if (r5 == 0) goto L_0x013a
                android.view.View r5 = r2.itemView
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.m4873l(r5)
                if (r5 == 0) goto L_0x013a
                java.lang.ref.WeakReference r10 = new java.lang.ref.WeakReference
                r10.<init>(r5)
                r2.mNestedRecyclerView = r10
            L_0x013a:
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                long r10 = r5.getNanoTime()
                androidx.recyclerview.widget.RecyclerView$o r5 = r6.f4105g
                long r10 = r10 - r0
                r5.mo5443b(r9, r10)
                r10 = r2
                goto L_0x0181
            L_0x0148:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Inconsistency detected. Invalid item position "
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = "(offset:"
                r1.append(r2)
                r1.append(r5)
                java.lang.String r2 = ").state:"
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$s r2 = r2.f4020l0
                int r2 = r2.mo5482a()
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = r2.mo5122i()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x0180:
                r10 = r1
            L_0x0181:
                r9 = r4
                if (r9 == 0) goto L_0x01ba
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$s r0 = r0.f4020l0
                boolean r0 = r0.mo5487d()
                if (r0 != 0) goto L_0x01ba
                r0 = 8192(0x2000, float:1.14794E-41)
                boolean r1 = r10.hasAnyOfTheFlags(r0)
                if (r1 == 0) goto L_0x01ba
                r10.setFlags(r8, r0)
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$s r0 = r0.f4020l0
                boolean r0 = r0.f4119k
                if (r0 == 0) goto L_0x01ba
                int r0 = androidx.recyclerview.widget.RecyclerView.ItemAnimator.buildAdapterChangeFlagsForAnimations(r10)
                r0 = r0 | 4096(0x1000, float:5.74E-42)
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$ItemAnimator r2 = r1.f3994Q
                androidx.recyclerview.widget.RecyclerView$s r1 = r1.f4020l0
                java.util.List r4 = r10.getUnmodifiedPayloads()
                androidx.recyclerview.widget.RecyclerView$ItemAnimator$b r0 = r2.recordPreLayoutInformation(r1, r10, r0, r4)
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                r1.mo5049a(r10, r0)
            L_0x01ba:
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$s r0 = r0.f4020l0
                boolean r0 = r0.mo5487d()
                if (r0 == 0) goto L_0x01cd
                boolean r0 = r10.isBound()
                if (r0 == 0) goto L_0x01cd
                r10.mPreLayoutPosition = r3
                goto L_0x01e0
            L_0x01cd:
                boolean r0 = r10.isBound()
                if (r0 == 0) goto L_0x01e2
                boolean r0 = r10.needsUpdate()
                if (r0 != 0) goto L_0x01e2
                boolean r0 = r10.isInvalid()
                if (r0 == 0) goto L_0x01e0
                goto L_0x01e2
            L_0x01e0:
                r0 = 0
                goto L_0x01f5
            L_0x01e2:
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.a r0 = r0.f4011h
                int r2 = r0.mo5624b(r3)
                r0 = r16
                r1 = r10
                r3 = r17
                r4 = r19
                boolean r0 = r0.m5186a(r1, r2, r3, r4)
            L_0x01f5:
                android.view.View r1 = r10.itemView
                android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
                if (r1 != 0) goto L_0x020b
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                android.view.ViewGroup$LayoutParams r1 = r1.generateDefaultLayoutParams()
                androidx.recyclerview.widget.RecyclerView$LayoutParams r1 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r1
                android.view.View r2 = r10.itemView
                r2.setLayoutParams(r1)
                goto L_0x0223
            L_0x020b:
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                boolean r2 = r2.checkLayoutParams(r1)
                if (r2 != 0) goto L_0x0221
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                android.view.ViewGroup$LayoutParams r1 = r2.generateLayoutParams(r1)
                androidx.recyclerview.widget.RecyclerView$LayoutParams r1 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r1
                android.view.View r2 = r10.itemView
                r2.setLayoutParams(r1)
                goto L_0x0223
            L_0x0221:
                androidx.recyclerview.widget.RecyclerView$LayoutParams r1 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r1
            L_0x0223:
                r1.f4075a = r10
                if (r9 == 0) goto L_0x022a
                if (r0 == 0) goto L_0x022a
                goto L_0x022b
            L_0x022a:
                r7 = 0
            L_0x022b:
                r1.f4078d = r7
                return r10
            L_0x022e:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Invalid item position "
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = "("
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = "). Item count:"
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$s r2 = r2.f4020l0
                int r2 = r2.mo5482a()
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = r2.mo5122i()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C1079p.mo5448a(int, boolean, long):androidx.recyclerview.widget.RecyclerView$v");
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public View mo5465c(int i) {
            return ((C1085v) this.f4099a.get(i)).itemView;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo5466c() {
            this.f4099a.clear();
            ArrayList<C1085v> arrayList = this.f4100b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo5467c(int i, int i2) {
            int i3 = i2 + i;
            for (int size = this.f4101c.size() - 1; size >= 0; size--) {
                C1085v vVar = (C1085v) this.f4101c.get(size);
                if (vVar != null) {
                    int i4 = vVar.mPosition;
                    if (i4 >= i && i4 < i3) {
                        vVar.addFlags(2);
                        mo5474e(size);
                    }
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public C1085v mo5460b(int i) {
            ArrayList<C1085v> arrayList = this.f4100b;
            if (arrayList != null) {
                int size = arrayList.size();
                if (size != 0) {
                    int i2 = 0;
                    int i3 = 0;
                    while (i3 < size) {
                        C1085v vVar = (C1085v) this.f4100b.get(i3);
                        if (vVar.wasReturnedFromScrap() || vVar.getLayoutPosition() != i) {
                            i3++;
                        } else {
                            vVar.addFlags(32);
                            return vVar;
                        }
                    }
                    if (RecyclerView.this.f4027p.hasStableIds()) {
                        int b = RecyclerView.this.f4011h.mo5624b(i);
                        if (b > 0 && b < RecyclerView.this.f4027p.getItemCount()) {
                            long itemId = RecyclerView.this.f4027p.getItemId(b);
                            while (i2 < size) {
                                C1085v vVar2 = (C1085v) this.f4100b.get(i2);
                                if (vVar2.wasReturnedFromScrap() || vVar2.getItemId() != itemId) {
                                    i2++;
                                } else {
                                    vVar2.addFlags(32);
                                    return vVar2;
                                }
                            }
                        }
                    }
                }
            }
            return null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo5462b(int i, int i2) {
            int i3;
            int i4;
            int i5;
            if (i < i2) {
                i5 = i;
                i4 = i2;
                i3 = -1;
            } else {
                i4 = i;
                i5 = i2;
                i3 = 1;
            }
            int size = this.f4101c.size();
            for (int i6 = 0; i6 < size; i6++) {
                C1085v vVar = (C1085v) this.f4101c.get(i6);
                if (vVar != null) {
                    int i7 = vVar.mPosition;
                    if (i7 >= i5 && i7 <= i4) {
                        if (i7 == i) {
                            vVar.offsetPosition(i2 - i, false);
                        } else {
                            vVar.offsetPosition(i3, false);
                        }
                    }
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo5461b() {
            int size = this.f4101c.size();
            for (int i = 0; i < size; i++) {
                ((C1085v) this.f4101c.get(i)).clearOldPosition();
            }
            int size2 = this.f4099a.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((C1085v) this.f4099a.get(i2)).clearOldPosition();
            }
            ArrayList<C1085v> arrayList = this.f4100b;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    ((C1085v) this.f4100b.get(i3)).clearOldPosition();
                }
            }
        }

        /* renamed from: a */
        private void m5185a(ViewGroup viewGroup, boolean z) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    m5185a((ViewGroup) childAt, true);
                }
            }
            if (z) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                } else {
                    int visibility = viewGroup.getVisibility();
                    viewGroup.setVisibility(4);
                    viewGroup.setVisibility(visibility);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo5458a(C1085v vVar, boolean z) {
            RecyclerView.m4871e(vVar);
            if (vVar.hasAnyOfTheFlags(16384)) {
                vVar.setFlags(0, 16384);
                ViewCompat.m2824a(vVar.itemView, (C0615a) null);
            }
            if (z) {
                mo5457a(vVar);
            }
            vVar.mOwnerRecyclerView = null;
            mo5471d().mo5440a(vVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo5453a(View view) {
            C1085v m = RecyclerView.m4874m(view);
            m.mScrapContainer = null;
            m.mInChangeScrap = false;
            m.clearReturnedFromScrapFlag();
            mo5464b(m);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C1085v mo5447a(int i, boolean z) {
            int size = this.f4099a.size();
            int i2 = 0;
            int i3 = 0;
            while (i3 < size) {
                C1085v vVar = (C1085v) this.f4099a.get(i3);
                if (vVar.wasReturnedFromScrap() || vVar.getLayoutPosition() != i || vVar.isInvalid() || (!RecyclerView.this.f4020l0.f4116h && vVar.isRemoved())) {
                    i3++;
                } else {
                    vVar.addFlags(32);
                    return vVar;
                }
            }
            if (!z) {
                View b = RecyclerView.this.f4013i.mo5650b(i);
                if (b != null) {
                    C1085v m = RecyclerView.m4874m(b);
                    RecyclerView.this.f4013i.mo5658f(b);
                    int b2 = RecyclerView.this.f4013i.mo5649b(b);
                    if (b2 != -1) {
                        RecyclerView.this.f4013i.mo5643a(b2);
                        mo5468c(b);
                        m.addFlags(8224);
                        return m;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("layout index should not be -1 after unhiding a view:");
                    sb.append(m);
                    sb.append(RecyclerView.this.mo5122i());
                    throw new IllegalStateException(sb.toString());
                }
            }
            int size2 = this.f4101c.size();
            while (i2 < size2) {
                C1085v vVar2 = (C1085v) this.f4101c.get(i2);
                if (vVar2.isInvalid() || vVar2.getLayoutPosition() != i || vVar2.isAttachedToTransitionOverlay()) {
                    i2++;
                } else {
                    if (!z) {
                        this.f4101c.remove(i2);
                    }
                    return vVar2;
                }
            }
            return null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C1085v mo5449a(long j, int i, boolean z) {
            for (int size = this.f4099a.size() - 1; size >= 0; size--) {
                C1085v vVar = (C1085v) this.f4099a.get(size);
                if (vVar.getItemId() == j && !vVar.wasReturnedFromScrap()) {
                    if (i == vVar.getItemViewType()) {
                        vVar.addFlags(32);
                        if (vVar.isRemoved() && !RecyclerView.this.f4020l0.mo5487d()) {
                            vVar.setFlags(2, 14);
                        }
                        return vVar;
                    } else if (!z) {
                        this.f4099a.remove(size);
                        RecyclerView.this.removeDetachedView(vVar.itemView, false);
                        mo5453a(vVar.itemView);
                    }
                }
            }
            int size2 = this.f4101c.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                C1085v vVar2 = (C1085v) this.f4101c.get(size2);
                if (vVar2.getItemId() == j && !vVar2.isAttachedToTransitionOverlay()) {
                    if (i == vVar2.getItemViewType()) {
                        if (!z) {
                            this.f4101c.remove(size2);
                        }
                        return vVar2;
                    } else if (!z) {
                        mo5474e(size2);
                        return null;
                    }
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo5457a(C1085v vVar) {
            RecyclerListener recyclerListener = RecyclerView.this.f4031r;
            if (recyclerListener != null) {
                recyclerListener.onViewRecycled(vVar);
            }
            C1069g gVar = RecyclerView.this.f4027p;
            if (gVar != null) {
                gVar.onViewRecycled(vVar);
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f4020l0 != null) {
                recyclerView.f4015j.mo5824h(vVar);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo5454a(C1069g gVar, C1069g gVar2, boolean z) {
            mo5450a();
            mo5471d().mo5439a(gVar, gVar2, z);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo5451a(int i, int i2) {
            int size = this.f4101c.size();
            for (int i3 = 0; i3 < size; i3++) {
                C1085v vVar = (C1085v) this.f4101c.get(i3);
                if (vVar != null && vVar.mPosition >= i) {
                    vVar.offsetPosition(i2, true);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo5452a(int i, int i2, boolean z) {
            int i3 = i + i2;
            for (int size = this.f4101c.size() - 1; size >= 0; size--) {
                C1085v vVar = (C1085v) this.f4101c.get(size);
                if (vVar != null) {
                    int i4 = vVar.mPosition;
                    if (i4 >= i3) {
                        vVar.offsetPosition(-i2, z);
                    } else if (i4 >= i) {
                        vVar.addFlags(8);
                        mo5474e(size);
                    }
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo5456a(C1083t tVar) {
            this.f4106h = tVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo5455a(C1077o oVar) {
            C1077o oVar2 = this.f4105g;
            if (oVar2 != null) {
                oVar2.mo5445c();
            }
            this.f4105g = oVar;
            if (this.f4105g != null && RecyclerView.this.getAdapter() != null) {
                this.f4105g.mo5437a();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$q */
    private class C1080q extends C1071i {
        C1080q() {
        }

        /* renamed from: a */
        public void mo5419a() {
            RecyclerView.this.mo5051a((String) null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f4020l0.f4115g = true;
            recyclerView.mo5068b(true);
            if (!RecyclerView.this.f4011h.mo5627c()) {
                RecyclerView.this.requestLayout();
            }
        }

        /* renamed from: b */
        public void mo5423b(int i, int i2) {
            RecyclerView.this.mo5051a((String) null);
            if (RecyclerView.this.f4011h.mo5626b(i, i2)) {
                mo5481b();
            }
        }

        /* renamed from: c */
        public void mo5424c(int i, int i2) {
            RecyclerView.this.mo5051a((String) null);
            if (RecyclerView.this.f4011h.mo5629c(i, i2)) {
                mo5481b();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo5481b() {
            if (RecyclerView.f3970G0) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.f4041w && recyclerView.f4039v) {
                    ViewCompat.m2826a((View) recyclerView, recyclerView.f4019l);
                    return;
                }
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            recyclerView2.f3982E = true;
            recyclerView2.requestLayout();
        }

        /* renamed from: a */
        public void mo5422a(int i, int i2, Object obj) {
            RecyclerView.this.mo5051a((String) null);
            if (RecyclerView.this.f4011h.mo5623a(i, i2, obj)) {
                mo5481b();
            }
        }

        /* renamed from: a */
        public void mo5421a(int i, int i2, int i3) {
            RecyclerView.this.mo5051a((String) null);
            if (RecyclerView.this.f4011h.mo5622a(i, i2, i3)) {
                mo5481b();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$r */
    public static class C1081r implements OnItemTouchListener {
        public void onRequestDisallowInterceptTouchEvent(boolean z) {
        }

        public void onTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$s */
    public static class C1082s {

        /* renamed from: a */
        int f4109a = -1;

        /* renamed from: b */
        private SparseArray<Object> f4110b;

        /* renamed from: c */
        int f4111c = 0;

        /* renamed from: d */
        int f4112d = 0;

        /* renamed from: e */
        int f4113e = 1;

        /* renamed from: f */
        int f4114f = 0;

        /* renamed from: g */
        boolean f4115g = false;

        /* renamed from: h */
        boolean f4116h = false;

        /* renamed from: i */
        boolean f4117i = false;

        /* renamed from: j */
        boolean f4118j = false;

        /* renamed from: k */
        boolean f4119k = false;

        /* renamed from: l */
        boolean f4120l = false;

        /* renamed from: m */
        int f4121m;

        /* renamed from: n */
        long f4122n;

        /* renamed from: o */
        int f4123o;

        /* renamed from: p */
        int f4124p;

        /* renamed from: q */
        int f4125q;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo5483a(int i) {
            if ((this.f4113e & i) == 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("Layout state should be one of ");
                sb.append(Integer.toBinaryString(i));
                sb.append(" but it is ");
                sb.append(Integer.toBinaryString(this.f4113e));
                throw new IllegalStateException(sb.toString());
            }
        }

        /* renamed from: b */
        public int mo5485b() {
            return this.f4109a;
        }

        /* renamed from: c */
        public boolean mo5486c() {
            return this.f4109a != -1;
        }

        /* renamed from: d */
        public boolean mo5487d() {
            return this.f4116h;
        }

        /* renamed from: e */
        public boolean mo5488e() {
            return this.f4120l;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("State{mTargetPosition=");
            sb.append(this.f4109a);
            sb.append(", mData=");
            sb.append(this.f4110b);
            sb.append(", mItemCount=");
            sb.append(this.f4114f);
            sb.append(", mIsMeasuring=");
            sb.append(this.f4118j);
            sb.append(", mPreviousLayoutItemCount=");
            sb.append(this.f4111c);
            sb.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
            sb.append(this.f4112d);
            sb.append(", mStructureChanged=");
            sb.append(this.f4115g);
            sb.append(", mInPreLayout=");
            sb.append(this.f4116h);
            sb.append(", mRunSimpleAnimations=");
            sb.append(this.f4119k);
            sb.append(", mRunPredictiveAnimations=");
            sb.append(this.f4120l);
            sb.append('}');
            return sb.toString();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo5484a(C1069g gVar) {
            this.f4113e = 1;
            this.f4114f = gVar.getItemCount();
            this.f4116h = false;
            this.f4117i = false;
            this.f4118j = false;
        }

        /* renamed from: a */
        public int mo5482a() {
            return this.f4116h ? this.f4111c - this.f4112d : this.f4114f;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$t */
    public static abstract class C1083t {
        /* renamed from: a */
        public abstract View mo5490a(C1079p pVar, int i, int i2);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$u */
    class C1084u implements Runnable {

        /* renamed from: e */
        private int f4126e;

        /* renamed from: f */
        private int f4127f;

        /* renamed from: g */
        OverScroller f4128g;

        /* renamed from: h */
        Interpolator f4129h = RecyclerView.f3975L0;

        /* renamed from: i */
        private boolean f4130i = false;

        /* renamed from: j */
        private boolean f4131j = false;

        C1084u() {
            this.f4128g = new OverScroller(RecyclerView.this.getContext(), RecyclerView.f3975L0);
        }

        /* renamed from: c */
        private void m5240c() {
            RecyclerView.this.removeCallbacks(this);
            ViewCompat.m2826a((View) RecyclerView.this, (Runnable) this);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo5491a() {
            if (this.f4130i) {
                this.f4131j = true;
            } else {
                m5240c();
            }
        }

        /* renamed from: b */
        public void mo5494b() {
            RecyclerView.this.removeCallbacks(this);
            this.f4128g.abortAnimation();
        }

        public void run() {
            int i;
            int i2;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f4029q == null) {
                mo5494b();
                return;
            }
            this.f4131j = false;
            this.f4130i = true;
            recyclerView.mo5060b();
            OverScroller overScroller = this.f4128g;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i3 = currX - this.f4126e;
                int i4 = currY - this.f4127f;
                this.f4126e = currX;
                this.f4127f = currY;
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.f4046y0;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.dispatchNestedPreScroll(i3, i4, iArr, null, 1)) {
                    int[] iArr2 = RecyclerView.this.f4046y0;
                    i3 -= iArr2[0];
                    i4 -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.mo5061b(i3, i4);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.f4027p != null) {
                    int[] iArr3 = recyclerView3.f4046y0;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.mo5038a(i3, i4, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.f4046y0;
                    i = iArr4[0];
                    i2 = iArr4[1];
                    i3 -= i;
                    i4 -= i2;
                    SmoothScroller smoothScroller = recyclerView4.f4029q.f4057g;
                    if (smoothScroller != null && !smoothScroller.isPendingInitialRun() && smoothScroller.isRunning()) {
                        int a = RecyclerView.this.f4020l0.mo5482a();
                        if (a == 0) {
                            smoothScroller.stop();
                        } else if (smoothScroller.getTargetPosition() >= a) {
                            smoothScroller.setTargetPosition(a - 1);
                            smoothScroller.onAnimation(i, i2);
                        } else {
                            smoothScroller.onAnimation(i, i2);
                        }
                    }
                } else {
                    i2 = 0;
                    i = 0;
                }
                if (!RecyclerView.this.f4033s.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.f4046y0;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.dispatchNestedScroll(i, i2, i3, i4, null, 1, iArr5);
                int[] iArr6 = RecyclerView.this.f4046y0;
                int i5 = i3 - iArr6[0];
                int i6 = i4 - iArr6[1];
                if (!(i == 0 && i2 == 0)) {
                    RecyclerView.this.mo5079d(i, i2);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i5 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i6 != 0));
                SmoothScroller smoothScroller2 = RecyclerView.this.f4029q.f4057g;
                if ((smoothScroller2 != null && smoothScroller2.isPendingInitialRun()) || !z) {
                    mo5491a();
                    RecyclerView recyclerView6 = RecyclerView.this;
                    C1126j jVar = recyclerView6.f4016j0;
                    if (jVar != null) {
                        jVar.mo5717a(recyclerView6, i5, i6);
                    }
                } else {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i7 = i5 < 0 ? -currVelocity : i5 > 0 ? currVelocity : 0;
                        if (i6 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i6 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.mo5033a(i7, currVelocity);
                    }
                    if (RecyclerView.f3971H0) {
                        RecyclerView.this.f4018k0.mo5722a();
                    }
                }
            }
            SmoothScroller smoothScroller3 = RecyclerView.this.f4029q.f4057g;
            if (smoothScroller3 != null && smoothScroller3.isPendingInitialRun()) {
                smoothScroller3.onAnimation(0, 0);
            }
            this.f4130i = false;
            if (this.f4131j) {
                m5240c();
            } else {
                RecyclerView.this.setScrollState(0);
                RecyclerView.this.stopNestedScroll(1);
            }
        }

        /* renamed from: a */
        public void mo5492a(int i, int i2) {
            RecyclerView.this.setScrollState(2);
            this.f4127f = 0;
            this.f4126e = 0;
            Interpolator interpolator = this.f4129h;
            Interpolator interpolator2 = RecyclerView.f3975L0;
            if (interpolator != interpolator2) {
                this.f4129h = interpolator2;
                this.f4128g = new OverScroller(RecyclerView.this.getContext(), RecyclerView.f3975L0);
            }
            this.f4128g.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            mo5491a();
        }

        /* renamed from: a */
        public void mo5493a(int i, int i2, int i3, Interpolator interpolator) {
            if (i3 == Integer.MIN_VALUE) {
                i3 = m5239a(i, i2, 0, 0);
            }
            int i4 = i3;
            if (interpolator == null) {
                interpolator = RecyclerView.f3975L0;
            }
            if (this.f4129h != interpolator) {
                this.f4129h = interpolator;
                this.f4128g = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f4127f = 0;
            this.f4126e = 0;
            RecyclerView.this.setScrollState(2);
            this.f4128g.startScroll(0, 0, i, i2, i4);
            if (VERSION.SDK_INT < 23) {
                this.f4128g.computeScrollOffset();
            }
            mo5491a();
        }

        /* renamed from: a */
        private float m5238a(float f) {
            return (float) Math.sin((double) ((f - 0.5f) * 0.47123894f));
        }

        /* renamed from: a */
        private int m5239a(int i, int i2, int i3, int i4) {
            int i5;
            int abs = Math.abs(i);
            int abs2 = Math.abs(i2);
            boolean z = abs > abs2;
            int sqrt = (int) Math.sqrt((double) ((i3 * i3) + (i4 * i4)));
            int sqrt2 = (int) Math.sqrt((double) ((i * i) + (i2 * i2)));
            RecyclerView recyclerView = RecyclerView.this;
            int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
            int i6 = width / 2;
            float f = (float) width;
            float f2 = (float) i6;
            float a = f2 + (m5238a(Math.min(1.0f, (((float) sqrt2) * 1.0f) / f)) * f2);
            if (sqrt > 0) {
                i5 = Math.round(Math.abs(a / ((float) sqrt)) * 1000.0f) * 4;
            } else {
                if (!z) {
                    abs = abs2;
                }
                i5 = (int) (((((float) abs) / f) + 1.0f) * 300.0f);
            }
            return Math.min(i5, 2000);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$v */
    public static abstract class C1085v {
        static final int FLAG_ADAPTER_FULLUPDATE = 1024;
        static final int FLAG_ADAPTER_POSITION_UNKNOWN = 512;
        static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
        static final int FLAG_BOUNCED_FROM_HIDDEN_LIST = 8192;
        static final int FLAG_BOUND = 1;
        static final int FLAG_IGNORE = 128;
        static final int FLAG_INVALID = 4;
        static final int FLAG_MOVED = 2048;
        static final int FLAG_NOT_RECYCLABLE = 16;
        static final int FLAG_REMOVED = 8;
        static final int FLAG_RETURNED_FROM_SCRAP = 32;
        static final int FLAG_SET_A11Y_ITEM_DELEGATE = 16384;
        static final int FLAG_TMP_DETACHED = 256;
        static final int FLAG_UPDATE = 2;
        private static final List<Object> FULLUPDATE_PAYLOADS = Collections.emptyList();
        static final int PENDING_ACCESSIBILITY_STATE_NOT_SET = -1;
        public final View itemView;
        int mFlags;
        boolean mInChangeScrap = false;
        private int mIsRecyclableCount = 0;
        long mItemId = -1;
        int mItemViewType = -1;
        WeakReference<RecyclerView> mNestedRecyclerView;
        int mOldPosition = -1;
        RecyclerView mOwnerRecyclerView;
        List<Object> mPayloads = null;
        int mPendingAccessibilityState = -1;
        int mPosition = -1;
        int mPreLayoutPosition = -1;
        C1079p mScrapContainer = null;
        C1085v mShadowedHolder = null;
        C1085v mShadowingHolder = null;
        List<Object> mUnmodifiedPayloads = null;
        private int mWasImportantForAccessibilityBeforeHidden = 0;

        public C1085v(View view) {
            if (view != null) {
                this.itemView = view;
                return;
            }
            throw new IllegalArgumentException("itemView may not be null");
        }

        private void createPayloadsIfNeeded() {
            if (this.mPayloads == null) {
                this.mPayloads = new ArrayList();
                this.mUnmodifiedPayloads = Collections.unmodifiableList(this.mPayloads);
            }
        }

        /* access modifiers changed from: 0000 */
        public void addChangePayload(Object obj) {
            if (obj == null) {
                addFlags(FLAG_ADAPTER_FULLUPDATE);
            } else if ((FLAG_ADAPTER_FULLUPDATE & this.mFlags) == 0) {
                createPayloadsIfNeeded();
                this.mPayloads.add(obj);
            }
        }

        /* access modifiers changed from: 0000 */
        public void addFlags(int i) {
            this.mFlags = i | this.mFlags;
        }

        /* access modifiers changed from: 0000 */
        public void clearOldPosition() {
            this.mOldPosition = -1;
            this.mPreLayoutPosition = -1;
        }

        /* access modifiers changed from: 0000 */
        public void clearPayload() {
            List<Object> list = this.mPayloads;
            if (list != null) {
                list.clear();
            }
            this.mFlags &= -1025;
        }

        /* access modifiers changed from: 0000 */
        public void clearReturnedFromScrapFlag() {
            this.mFlags &= -33;
        }

        /* access modifiers changed from: 0000 */
        public void clearTmpDetachFlag() {
            this.mFlags &= -257;
        }

        /* access modifiers changed from: 0000 */
        public boolean doesTransientStatePreventRecycling() {
            return (this.mFlags & 16) == 0 && ViewCompat.m2873z(this.itemView);
        }

        /* access modifiers changed from: 0000 */
        public void flagRemovedAndOffsetPosition(int i, int i2, boolean z) {
            addFlags(8);
            offsetPosition(i2, z);
            this.mPosition = i;
        }

        public final int getAdapterPosition() {
            RecyclerView recyclerView = this.mOwnerRecyclerView;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.mo5058b(this);
        }

        public final long getItemId() {
            return this.mItemId;
        }

        public final int getItemViewType() {
            return this.mItemViewType;
        }

        public final int getLayoutPosition() {
            int i = this.mPreLayoutPosition;
            return i == -1 ? this.mPosition : i;
        }

        public final int getOldPosition() {
            return this.mOldPosition;
        }

        @Deprecated
        public final int getPosition() {
            int i = this.mPreLayoutPosition;
            return i == -1 ? this.mPosition : i;
        }

        /* access modifiers changed from: 0000 */
        public List<Object> getUnmodifiedPayloads() {
            if ((this.mFlags & FLAG_ADAPTER_FULLUPDATE) != 0) {
                return FULLUPDATE_PAYLOADS;
            }
            List<Object> list = this.mPayloads;
            if (list == null || list.size() == 0) {
                return FULLUPDATE_PAYLOADS;
            }
            return this.mUnmodifiedPayloads;
        }

        /* access modifiers changed from: 0000 */
        public boolean hasAnyOfTheFlags(int i) {
            return (i & this.mFlags) != 0;
        }

        /* access modifiers changed from: 0000 */
        public boolean isAdapterPositionUnknown() {
            return (this.mFlags & FLAG_ADAPTER_POSITION_UNKNOWN) != 0 || isInvalid();
        }

        /* access modifiers changed from: 0000 */
        public boolean isAttachedToTransitionOverlay() {
            return (this.itemView.getParent() == null || this.itemView.getParent() == this.mOwnerRecyclerView) ? false : true;
        }

        /* access modifiers changed from: 0000 */
        public boolean isBound() {
            return (this.mFlags & 1) != 0;
        }

        /* access modifiers changed from: 0000 */
        public boolean isInvalid() {
            return (this.mFlags & 4) != 0;
        }

        public final boolean isRecyclable() {
            return (this.mFlags & 16) == 0 && !ViewCompat.m2873z(this.itemView);
        }

        /* access modifiers changed from: 0000 */
        public boolean isRemoved() {
            return (this.mFlags & 8) != 0;
        }

        /* access modifiers changed from: 0000 */
        public boolean isScrap() {
            return this.mScrapContainer != null;
        }

        /* access modifiers changed from: 0000 */
        public boolean isTmpDetached() {
            return (this.mFlags & FLAG_TMP_DETACHED) != 0;
        }

        /* access modifiers changed from: 0000 */
        public boolean isUpdated() {
            return (this.mFlags & 2) != 0;
        }

        /* access modifiers changed from: 0000 */
        public boolean needsUpdate() {
            return (this.mFlags & 2) != 0;
        }

        /* access modifiers changed from: 0000 */
        public void offsetPosition(int i, boolean z) {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
            if (this.mPreLayoutPosition == -1) {
                this.mPreLayoutPosition = this.mPosition;
            }
            if (z) {
                this.mPreLayoutPosition += i;
            }
            this.mPosition += i;
            if (this.itemView.getLayoutParams() != null) {
                ((LayoutParams) this.itemView.getLayoutParams()).f4077c = true;
            }
        }

        /* access modifiers changed from: 0000 */
        public void onEnteredHiddenState(RecyclerView recyclerView) {
            int i = this.mPendingAccessibilityState;
            if (i != -1) {
                this.mWasImportantForAccessibilityBeforeHidden = i;
            } else {
                this.mWasImportantForAccessibilityBeforeHidden = ViewCompat.m2860m(this.itemView);
            }
            recyclerView.mo5056a(this, 4);
        }

        /* access modifiers changed from: 0000 */
        public void onLeftHiddenState(RecyclerView recyclerView) {
            recyclerView.mo5056a(this, this.mWasImportantForAccessibilityBeforeHidden);
            this.mWasImportantForAccessibilityBeforeHidden = 0;
        }

        /* access modifiers changed from: 0000 */
        public void resetInternal() {
            this.mFlags = 0;
            this.mPosition = -1;
            this.mOldPosition = -1;
            this.mItemId = -1;
            this.mPreLayoutPosition = -1;
            this.mIsRecyclableCount = 0;
            this.mShadowedHolder = null;
            this.mShadowingHolder = null;
            clearPayload();
            this.mWasImportantForAccessibilityBeforeHidden = 0;
            this.mPendingAccessibilityState = -1;
            RecyclerView.m4871e(this);
        }

        /* access modifiers changed from: 0000 */
        public void saveOldPosition() {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
        }

        /* access modifiers changed from: 0000 */
        public void setFlags(int i, int i2) {
            this.mFlags = (i & i2) | (this.mFlags & (~i2));
        }

        public final void setIsRecyclable(boolean z) {
            int i = this.mIsRecyclableCount;
            this.mIsRecyclableCount = z ? i - 1 : i + 1;
            int i2 = this.mIsRecyclableCount;
            if (i2 < 0) {
                this.mIsRecyclableCount = 0;
                StringBuilder sb = new StringBuilder();
                sb.append("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ");
                sb.append(this);
                Log.e("View", sb.toString());
            } else if (!z && i2 == 1) {
                this.mFlags |= 16;
            } else if (z && this.mIsRecyclableCount == 0) {
                this.mFlags &= -17;
            }
        }

        /* access modifiers changed from: 0000 */
        public void setScrapContainer(C1079p pVar, boolean z) {
            this.mScrapContainer = pVar;
            this.mInChangeScrap = z;
        }

        /* access modifiers changed from: 0000 */
        public boolean shouldBeKeptAsChild() {
            return (this.mFlags & 16) != 0;
        }

        /* access modifiers changed from: 0000 */
        public boolean shouldIgnore() {
            return (this.mFlags & FLAG_IGNORE) != 0;
        }

        /* access modifiers changed from: 0000 */
        public void stopIgnoring() {
            this.mFlags &= -129;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ViewHolder{");
            sb.append(Integer.toHexString(hashCode()));
            sb.append(" position=");
            sb.append(this.mPosition);
            sb.append(" id=");
            sb.append(this.mItemId);
            sb.append(", oldPos=");
            sb.append(this.mOldPosition);
            sb.append(", pLpos:");
            sb.append(this.mPreLayoutPosition);
            StringBuilder sb2 = new StringBuilder(sb.toString());
            if (isScrap()) {
                sb2.append(" scrap ");
                sb2.append(this.mInChangeScrap ? "[changeScrap]" : "[attachedScrap]");
            }
            if (isInvalid()) {
                sb2.append(" invalid");
            }
            if (!isBound()) {
                sb2.append(" unbound");
            }
            if (needsUpdate()) {
                sb2.append(" update");
            }
            if (isRemoved()) {
                sb2.append(" removed");
            }
            if (shouldIgnore()) {
                sb2.append(" ignored");
            }
            if (isTmpDetached()) {
                sb2.append(" tmpDetached");
            }
            if (!isRecyclable()) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(" not recyclable(");
                sb3.append(this.mIsRecyclableCount);
                sb3.append(")");
                sb2.append(sb3.toString());
            }
            if (isAdapterPositionUnknown()) {
                sb2.append(" undefined adapter position");
            }
            if (this.itemView.getParent() == null) {
                sb2.append(" no parent");
            }
            sb2.append("}");
            return sb2.toString();
        }

        /* access modifiers changed from: 0000 */
        public void unScrap() {
            this.mScrapContainer.mo5469c(this);
        }

        /* access modifiers changed from: 0000 */
        public boolean wasReturnedFromScrap() {
            return (this.mFlags & 32) != 0;
        }
    }

    static {
        int i = VERSION.SDK_INT;
        f3968E0 = i == 18 || i == 19 || i == 20;
        Class cls = Integer.TYPE;
        f3974K0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
    }

    public RecyclerView(Context context) {
        this(context, null);
    }

    /* renamed from: A */
    private void m4838A() {
        boolean z = true;
        this.f4020l0.mo5483a(1);
        mo5048a(this.f4020l0);
        this.f4020l0.f4118j = false;
        mo5182w();
        this.f4015j.mo5810a();
        mo5148q();
        m4846I();
        m4851N();
        C1082s sVar = this.f4020l0;
        if (!sVar.f4119k || !this.f4028p0) {
            z = false;
        }
        sVar.f4117i = z;
        this.f4028p0 = false;
        this.f4026o0 = false;
        C1082s sVar2 = this.f4020l0;
        sVar2.f4116h = sVar2.f4120l;
        sVar2.f4114f = this.f4027p.getItemCount();
        m4863a(this.f4038u0);
        if (this.f4020l0.f4119k) {
            int a = this.f4013i.mo5642a();
            for (int i = 0; i < a; i++) {
                C1085v m = m4874m(this.f4013i.mo5651c(i));
                if (!m.shouldIgnore() && (!m.isInvalid() || this.f4027p.hasStableIds())) {
                    this.f4015j.mo5818c(m, this.f3994Q.recordPreLayoutInformation(this.f4020l0, m, ItemAnimator.buildAdapterChangeFlagsForAnimations(m), m.getUnmodifiedPayloads()));
                    if (this.f4020l0.f4117i && m.isUpdated() && !m.isRemoved() && !m.shouldIgnore() && !m.isInvalid()) {
                        this.f4015j.mo5811a(mo5069c(m), m);
                    }
                }
            }
        }
        if (this.f4020l0.f4120l) {
            mo5181v();
            C1082s sVar3 = this.f4020l0;
            boolean z2 = sVar3.f4115g;
            sVar3.f4115g = false;
            this.f4029q.mo4952e(this.f4007f, sVar3);
            this.f4020l0.f4115g = z2;
            for (int i2 = 0; i2 < this.f4013i.mo5642a(); i2++) {
                C1085v m2 = m4874m(this.f4013i.mo5651c(i2));
                if (!m2.shouldIgnore() && !this.f4015j.mo5819c(m2)) {
                    int buildAdapterChangeFlagsForAnimations = ItemAnimator.buildAdapterChangeFlagsForAnimations(m2);
                    boolean hasAnyOfTheFlags = m2.hasAnyOfTheFlags(8192);
                    if (!hasAnyOfTheFlags) {
                        buildAdapterChangeFlagsForAnimations |= 4096;
                    }
                    C1057b recordPreLayoutInformation = this.f3994Q.recordPreLayoutInformation(this.f4020l0, m2, buildAdapterChangeFlagsForAnimations, m2.getUnmodifiedPayloads());
                    if (hasAnyOfTheFlags) {
                        mo5049a(m2, recordPreLayoutInformation);
                    } else {
                        this.f4015j.mo5813a(m2, recordPreLayoutInformation);
                    }
                }
            }
            mo5031a();
        } else {
            mo5031a();
        }
        mo5149r();
        mo5074c(false);
        this.f4020l0.f4113e = 2;
    }

    /* renamed from: B */
    private void m4839B() {
        mo5182w();
        mo5148q();
        this.f4020l0.mo5483a(6);
        this.f4011h.mo5625b();
        this.f4020l0.f4114f = this.f4027p.getItemCount();
        C1082s sVar = this.f4020l0;
        sVar.f4112d = 0;
        sVar.f4116h = false;
        this.f4029q.mo4952e(this.f4007f, sVar);
        C1082s sVar2 = this.f4020l0;
        sVar2.f4115g = false;
        this.f4009g = null;
        sVar2.f4119k = sVar2.f4119k && this.f3994Q != null;
        this.f4020l0.f4113e = 4;
        mo5149r();
        mo5074c(false);
    }

    /* renamed from: C */
    private void m4840C() {
        this.f4020l0.mo5483a(4);
        mo5182w();
        mo5148q();
        C1082s sVar = this.f4020l0;
        sVar.f4113e = 1;
        if (sVar.f4119k) {
            for (int a = this.f4013i.mo5642a() - 1; a >= 0; a--) {
                C1085v m = m4874m(this.f4013i.mo5651c(a));
                if (!m.shouldIgnore()) {
                    long c = mo5069c(m);
                    C1057b recordPostLayoutInformation = this.f3994Q.recordPostLayoutInformation(this.f4020l0, m);
                    C1085v a2 = this.f4015j.mo5809a(c);
                    if (a2 == null || a2.shouldIgnore()) {
                        this.f4015j.mo5816b(m, recordPostLayoutInformation);
                    } else {
                        boolean b = this.f4015j.mo5817b(a2);
                        boolean b2 = this.f4015j.mo5817b(m);
                        if (!b || a2 != m) {
                            C1057b f = this.f4015j.mo5822f(a2);
                            this.f4015j.mo5816b(m, recordPostLayoutInformation);
                            C1057b e = this.f4015j.mo5821e(m);
                            if (f == null) {
                                m4855a(c, m, a2);
                            } else {
                                m4859a(a2, m, f, e, b, b2);
                            }
                        } else {
                            this.f4015j.mo5816b(m, recordPostLayoutInformation);
                        }
                    }
                }
            }
            this.f4015j.mo5814a(this.f3979B0);
        }
        this.f4029q.mo5269c(this.f4007f);
        C1082s sVar2 = this.f4020l0;
        sVar2.f4111c = sVar2.f4114f;
        this.f3985H = false;
        this.f3986I = false;
        sVar2.f4119k = false;
        sVar2.f4120l = false;
        this.f4029q.f4058h = false;
        ArrayList<C1085v> arrayList = this.f4007f.f4100b;
        if (arrayList != null) {
            arrayList.clear();
        }
        LayoutManager layoutManager = this.f4029q;
        if (layoutManager.f4064n) {
            layoutManager.f4063m = 0;
            layoutManager.f4064n = false;
            this.f4007f.mo5480j();
        }
        this.f4029q.mo4955g(this.f4020l0);
        mo5149r();
        mo5074c(false);
        this.f4015j.mo5810a();
        int[] iArr = this.f4038u0;
        if (m4872j(iArr[0], iArr[1])) {
            mo5079d(0, 0);
        }
        m4847J();
        m4849L();
    }

    /* renamed from: D */
    private View m4841D() {
        int i = this.f4020l0.f4121m;
        if (i == -1) {
            i = 0;
        }
        int a = this.f4020l0.mo5482a();
        int i2 = i;
        while (i2 < a) {
            C1085v b = mo5059b(i2);
            if (b == null) {
                break;
            } else if (b.itemView.hasFocusable()) {
                return b.itemView;
            } else {
                i2++;
            }
        }
        int min = Math.min(a, i);
        while (true) {
            min--;
            if (min < 0) {
                return null;
            }
            C1085v b2 = mo5059b(min);
            if (b2 == null) {
                return null;
            }
            if (b2.itemView.hasFocusable()) {
                return b2.itemView;
            }
        }
    }

    /* renamed from: E */
    private boolean m4842E() {
        int a = this.f4013i.mo5642a();
        for (int i = 0; i < a; i++) {
            C1085v m = m4874m(this.f4013i.mo5651c(i));
            if (m != null && !m.shouldIgnore() && m.isUpdated()) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: F */
    private void m4843F() {
        if (ViewCompat.m2861n(this) == 0) {
            ViewCompat.m2854h(this, 8);
        }
    }

    /* renamed from: G */
    private void m4844G() {
        this.f4013i = new C1098e(new C1067e());
    }

    /* renamed from: H */
    private boolean m4845H() {
        return this.f3994Q != null && this.f4029q.mo4927F();
    }

    /* renamed from: I */
    private void m4846I() {
        if (this.f3985H) {
            this.f4011h.mo5632f();
            if (this.f3986I) {
                this.f4029q.mo4950d(this);
            }
        }
        if (m4845H()) {
            this.f4011h.mo5631e();
        } else {
            this.f4011h.mo5625b();
        }
        boolean z = false;
        boolean z2 = this.f4026o0 || this.f4028p0;
        this.f4020l0.f4119k = this.f4045y && this.f3994Q != null && (this.f3985H || z2 || this.f4029q.f4058h) && (!this.f3985H || this.f4027p.hasStableIds());
        C1082s sVar = this.f4020l0;
        if (sVar.f4119k && z2 && !this.f3985H && m4845H()) {
            z = true;
        }
        sVar.f4120l = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00ab, code lost:
        if (r0.isFocusable() != false) goto L_0x00af;
     */
    /* renamed from: J */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m4847J() {
        /*
            r7 = this;
            boolean r0 = r7.f4012h0
            if (r0 == 0) goto L_0x00b2
            androidx.recyclerview.widget.RecyclerView$g r0 = r7.f4027p
            if (r0 == 0) goto L_0x00b2
            boolean r0 = r7.hasFocus()
            if (r0 == 0) goto L_0x00b2
            int r0 = r7.getDescendantFocusability()
            r1 = 393216(0x60000, float:5.51013E-40)
            if (r0 == r1) goto L_0x00b2
            int r0 = r7.getDescendantFocusability()
            r1 = 131072(0x20000, float:1.83671E-40)
            if (r0 != r1) goto L_0x0026
            boolean r0 = r7.isFocused()
            if (r0 == 0) goto L_0x0026
            goto L_0x00b2
        L_0x0026:
            boolean r0 = r7.isFocused()
            if (r0 != 0) goto L_0x0055
            android.view.View r0 = r7.getFocusedChild()
            boolean r1 = f3973J0
            if (r1 == 0) goto L_0x004c
            android.view.ViewParent r1 = r0.getParent()
            if (r1 == 0) goto L_0x0040
            boolean r1 = r0.hasFocus()
            if (r1 != 0) goto L_0x004c
        L_0x0040:
            androidx.recyclerview.widget.e r0 = r7.f4013i
            int r0 = r0.mo5642a()
            if (r0 != 0) goto L_0x0055
            r7.requestFocus()
            return
        L_0x004c:
            androidx.recyclerview.widget.e r1 = r7.f4013i
            boolean r0 = r1.mo5653c(r0)
            if (r0 != 0) goto L_0x0055
            return
        L_0x0055:
            androidx.recyclerview.widget.RecyclerView$s r0 = r7.f4020l0
            long r0 = r0.f4122n
            r2 = -1
            r4 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L_0x0071
            androidx.recyclerview.widget.RecyclerView$g r0 = r7.f4027p
            boolean r0 = r0.hasStableIds()
            if (r0 == 0) goto L_0x0071
            androidx.recyclerview.widget.RecyclerView$s r0 = r7.f4020l0
            long r0 = r0.f4122n
            androidx.recyclerview.widget.RecyclerView$v r0 = r7.mo5030a(r0)
            goto L_0x0072
        L_0x0071:
            r0 = r4
        L_0x0072:
            if (r0 == 0) goto L_0x008a
            androidx.recyclerview.widget.e r1 = r7.f4013i
            android.view.View r5 = r0.itemView
            boolean r1 = r1.mo5653c(r5)
            if (r1 != 0) goto L_0x008a
            android.view.View r1 = r0.itemView
            boolean r1 = r1.hasFocusable()
            if (r1 != 0) goto L_0x0087
            goto L_0x008a
        L_0x0087:
            android.view.View r4 = r0.itemView
            goto L_0x0096
        L_0x008a:
            androidx.recyclerview.widget.e r0 = r7.f4013i
            int r0 = r0.mo5642a()
            if (r0 <= 0) goto L_0x0096
            android.view.View r4 = r7.m4841D()
        L_0x0096:
            if (r4 == 0) goto L_0x00b2
            androidx.recyclerview.widget.RecyclerView$s r0 = r7.f4020l0
            int r0 = r0.f4123o
            long r5 = (long) r0
            int r1 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x00ae
            android.view.View r0 = r4.findViewById(r0)
            if (r0 == 0) goto L_0x00ae
            boolean r1 = r0.isFocusable()
            if (r1 == 0) goto L_0x00ae
            goto L_0x00af
        L_0x00ae:
            r0 = r4
        L_0x00af:
            r0.requestFocus()
        L_0x00b2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m4847J():void");
    }

    /* renamed from: K */
    private void m4848K() {
        boolean z;
        EdgeEffect edgeEffect = this.f3990M;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = this.f3990M.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.f3991N;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z |= this.f3991N.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f3992O;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z |= this.f3992O.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f3993P;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z |= this.f3993P.isFinished();
        }
        if (z) {
            ViewCompat.m2808H(this);
        }
    }

    /* renamed from: L */
    private void m4849L() {
        C1082s sVar = this.f4020l0;
        sVar.f4122n = -1;
        sVar.f4121m = -1;
        sVar.f4123o = -1;
    }

    /* renamed from: M */
    private void m4850M() {
        VelocityTracker velocityTracker = this.f3997T;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        stopNestedScroll(0);
        m4848K();
    }

    /* renamed from: N */
    private void m4851N() {
        int i;
        C1085v vVar = null;
        View focusedChild = (!this.f4012h0 || !hasFocus() || this.f4027p == null) ? null : getFocusedChild();
        if (focusedChild != null) {
            vVar = mo5076d(focusedChild);
        }
        if (vVar == null) {
            m4849L();
            return;
        }
        this.f4020l0.f4122n = this.f4027p.hasStableIds() ? vVar.getItemId() : -1;
        C1082s sVar = this.f4020l0;
        if (this.f3985H) {
            i = -1;
        } else if (vVar.isRemoved()) {
            i = vVar.mOldPosition;
        } else {
            i = vVar.getAdapterPosition();
        }
        sVar.f4121m = i;
        this.f4020l0.f4123o = m4875n(vVar.itemView);
    }

    /* renamed from: O */
    private void m4852O() {
        this.f4014i0.mo5494b();
        LayoutManager layoutManager = this.f4029q;
        if (layoutManager != null) {
            layoutManager.mo5219E();
        }
    }

    /* renamed from: d */
    private void m4870d(C1085v vVar) {
        View view = vVar.itemView;
        boolean z = view.getParent() == this;
        this.f4007f.mo5469c(mo5094g(view));
        if (vVar.isTmpDetached()) {
            this.f4013i.mo5645a(view, -1, view.getLayoutParams(), true);
        } else if (!z) {
            this.f4013i.mo5647a(view, true);
        } else {
            this.f4013i.mo5644a(view);
        }
    }

    private C0645g getScrollingChildHelper() {
        if (this.f4040v0 == null) {
            this.f4040v0 = new C0645g(this);
        }
        return this.f4040v0;
    }

    /* renamed from: j */
    private boolean m4872j(int i, int i2) {
        m4863a(this.f4038u0);
        int[] iArr = this.f4038u0;
        return (iArr[0] == i && iArr[1] == i2) ? false : true;
    }

    /* renamed from: y */
    private void m4876y() {
        m4850M();
        setScrollState(0);
    }

    /* renamed from: z */
    private void m4877z() {
        int i = this.f3981D;
        this.f3981D = 0;
        if (i != 0 && mo5132m()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            obtain.setEventType(ItemAnimator.FLAG_MOVED);
            C0627b.m2910a(obtain, i);
            sendAccessibilityEventUnchecked(obtain);
        }
    }

    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        LayoutManager layoutManager = this.f4029q;
        if (layoutManager == null || !layoutManager.mo5252a(this, arrayList, i, i2)) {
            super.addFocusables(arrayList, i, i2);
        }
    }

    /* renamed from: b */
    public void mo5063b(OnChildAttachStateChangeListener onChildAttachStateChangeListener) {
        List<OnChildAttachStateChangeListener> list = this.f3984G;
        if (list != null) {
            list.remove(onChildAttachStateChangeListener);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo5072c(int i) {
        if (this.f4029q != null) {
            setScrollState(2);
            this.f4029q.mo5006h(i);
            awakenScrollBars();
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && this.f4029q.mo4942a((LayoutParams) layoutParams);
    }

    public int computeHorizontalScrollExtent() {
        LayoutManager layoutManager = this.f4029q;
        int i = 0;
        if (layoutManager == null) {
            return 0;
        }
        if (layoutManager.mo4994a()) {
            i = this.f4029q.mo4984a(this.f4020l0);
        }
        return i;
    }

    public int computeHorizontalScrollOffset() {
        LayoutManager layoutManager = this.f4029q;
        int i = 0;
        if (layoutManager == null) {
            return 0;
        }
        if (layoutManager.mo4994a()) {
            i = this.f4029q.mo4945b(this.f4020l0);
        }
        return i;
    }

    public int computeHorizontalScrollRange() {
        LayoutManager layoutManager = this.f4029q;
        int i = 0;
        if (layoutManager == null) {
            return 0;
        }
        if (layoutManager.mo4994a()) {
            i = this.f4029q.mo4947c(this.f4020l0);
        }
        return i;
    }

    public int computeVerticalScrollExtent() {
        LayoutManager layoutManager = this.f4029q;
        int i = 0;
        if (layoutManager == null) {
            return 0;
        }
        if (layoutManager.mo4999b()) {
            i = this.f4029q.mo5002d(this.f4020l0);
        }
        return i;
    }

    public int computeVerticalScrollOffset() {
        LayoutManager layoutManager = this.f4029q;
        int i = 0;
        if (layoutManager == null) {
            return 0;
        }
        if (layoutManager.mo4999b()) {
            i = this.f4029q.mo4951e(this.f4020l0);
        }
        return i;
    }

    public int computeVerticalScrollRange() {
        LayoutManager layoutManager = this.f4029q;
        int i = 0;
        if (layoutManager == null) {
            return 0;
        }
        if (layoutManager.mo4999b()) {
            i = this.f4029q.mo4953f(this.f4020l0);
        }
        return i;
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().mo3394a(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().mo3393a(f, f2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().mo3399a(i, i2, iArr, iArr2);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().mo3397a(i, i2, i3, i4, iArr);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    /* access modifiers changed from: protected */
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    /* access modifiers changed from: protected */
    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    public void draw(Canvas canvas) {
        boolean z;
        boolean z2;
        super.draw(canvas);
        int size = this.f4033s.size();
        boolean z3 = false;
        for (int i = 0; i < size; i++) {
            ((C1074l) this.f4033s.get(i)).onDrawOver(canvas, this, this.f4020l0);
        }
        EdgeEffect edgeEffect = this.f3990M;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.f4017k ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((float) ((-getHeight()) + paddingBottom), 0.0f);
            EdgeEffect edgeEffect2 = this.f3990M;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.f3991N;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f4017k) {
                canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f3991N;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.f3992O;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f4017k ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate((float) (-paddingTop), (float) (-width));
            EdgeEffect edgeEffect6 = this.f3992O;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.f3993P;
        if (edgeEffect7 == null || edgeEffect7.isFinished()) {
            z2 = z;
        } else {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f4017k) {
                canvas.translate((float) ((-getWidth()) + getPaddingRight()), (float) ((-getHeight()) + getPaddingBottom()));
            } else {
                canvas.translate((float) (-getWidth()), (float) (-getHeight()));
            }
            EdgeEffect edgeEffect8 = this.f3993P;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z3 = true;
            }
            z2 = z3 | z;
            canvas.restoreToCount(save4);
        }
        if (!z2 && this.f3994Q != null && this.f4033s.size() > 0 && this.f3994Q.isRunning()) {
            z2 = true;
        }
        if (z2) {
            ViewCompat.m2808H(this);
        }
    }

    public boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    /* renamed from: e */
    public boolean mo5088e(int i, int i2) {
        LayoutManager layoutManager = this.f4029q;
        int i3 = 0;
        if (layoutManager == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        } else if (this.f3978B) {
            return false;
        } else {
            boolean a = layoutManager.mo4994a();
            boolean b = this.f4029q.mo4999b();
            if (!a || Math.abs(i) < this.f4004d0) {
                i = 0;
            }
            if (!b || Math.abs(i2) < this.f4004d0) {
                i2 = 0;
            }
            if (i == 0 && i2 == 0) {
                return false;
            }
            float f = (float) i;
            float f2 = (float) i2;
            if (!dispatchNestedPreFling(f, f2)) {
                boolean z = a || b;
                dispatchNestedFling(f, f2, z);
                C1075m mVar = this.f4003c0;
                if (mVar != null && mVar.mo5432a(i, i2)) {
                    return true;
                }
                if (z) {
                    if (a) {
                        i3 = 1;
                    }
                    if (b) {
                        i3 |= 2;
                    }
                    startNestedScroll(i3, 1);
                    int i4 = this.f4006e0;
                    int max = Math.max(-i4, Math.min(i, i4));
                    int i5 = this.f4006e0;
                    this.f4014i0.mo5492a(max, Math.max(-i5, Math.min(i2, i5)));
                    return true;
                }
            }
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo5090f() {
        if (this.f3990M == null) {
            this.f3990M = this.f3989L.mo5425a(this, 0);
            if (this.f4017k) {
                this.f3990M.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                this.f3990M.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    /* renamed from: f */
    public void mo5091f(int i) {
    }

    public View focusSearch(View view, int i) {
        View view2;
        boolean z;
        View d = this.f4029q.mo5274d(view, i);
        if (d != null) {
            return d;
        }
        boolean z2 = this.f4027p != null && this.f4029q != null && !mo5133n() && !this.f3978B;
        FocusFinder instance = FocusFinder.getInstance();
        if (!z2 || !(i == 2 || i == 1)) {
            View findNextFocus = instance.findNextFocus(this, view, i);
            if (findNextFocus != null || !z2) {
                view2 = findNextFocus;
            } else {
                mo5060b();
                if (mo5070c(view) == null) {
                    return null;
                }
                mo5182w();
                view2 = this.f4029q.mo4931a(view, i, this.f4007f, this.f4020l0);
                mo5074c(false);
            }
        } else {
            if (this.f4029q.mo4999b()) {
                int i2 = i == 2 ? 130 : 33;
                z = instance.findNextFocus(this, view, i2) == null;
                if (f3972I0) {
                    i = i2;
                }
            } else {
                z = false;
            }
            if (!z && this.f4029q.mo4994a()) {
                int i3 = (this.f4029q.mo5295k() == 1) ^ (i == 2) ? 66 : 17;
                z = instance.findNextFocus(this, view, i3) == null;
                if (f3972I0) {
                    i = i3;
                }
            }
            if (z) {
                mo5060b();
                if (mo5070c(view) == null) {
                    return null;
                }
                mo5182w();
                this.f4029q.mo4931a(view, i, this.f4007f, this.f4020l0);
                mo5074c(false);
            }
            view2 = instance.findNextFocus(this, view, i);
        }
        if (view2 == null || view2.hasFocusable()) {
            if (!m4865a(view, view2, i)) {
                view2 = super.focusSearch(view, i);
            }
            return view2;
        } else if (getFocusedChild() == null) {
            return super.focusSearch(view, i);
        } else {
            m4857a(view2, (View) null);
            return view;
        }
    }

    /* renamed from: g */
    public void mo5096g(int i) {
        if (!this.f3978B) {
            mo5183x();
            LayoutManager layoutManager = this.f4029q;
            if (layoutManager == null) {
                Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
                return;
            }
            layoutManager.mo5006h(i);
            awakenScrollBars();
        }
    }

    /* access modifiers changed from: protected */
    public android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        LayoutManager layoutManager = this.f4029q;
        if (layoutManager != null) {
            return layoutManager.mo4948c();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("RecyclerView has no LayoutManager");
        sb.append(mo5122i());
        throw new IllegalStateException(sb.toString());
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        LayoutManager layoutManager = this.f4029q;
        if (layoutManager != null) {
            return layoutManager.mo4933a(getContext(), attributeSet);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("RecyclerView has no LayoutManager");
        sb.append(mo5122i());
        throw new IllegalStateException(sb.toString());
    }

    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public C1069g getAdapter() {
        return this.f4027p;
    }

    public int getBaseline() {
        LayoutManager layoutManager = this.f4029q;
        if (layoutManager != null) {
            return layoutManager.mo5272d();
        }
        return super.getBaseline();
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i, int i2) {
        ChildDrawingOrderCallback childDrawingOrderCallback = this.f4036t0;
        if (childDrawingOrderCallback == null) {
            return super.getChildDrawingOrder(i, i2);
        }
        return childDrawingOrderCallback.onGetChildDrawingOrder(i, i2);
    }

    public boolean getClipToPadding() {
        return this.f4017k;
    }

    public C1141q getCompatAccessibilityDelegate() {
        return this.f4034s0;
    }

    public C1072j getEdgeEffectFactory() {
        return this.f3989L;
    }

    public ItemAnimator getItemAnimator() {
        return this.f3994Q;
    }

    public int getItemDecorationCount() {
        return this.f4033s.size();
    }

    public LayoutManager getLayoutManager() {
        return this.f4029q;
    }

    public int getMaxFlingVelocity() {
        return this.f4006e0;
    }

    public int getMinFlingVelocity() {
        return this.f4004d0;
    }

    /* access modifiers changed from: 0000 */
    public long getNanoTime() {
        if (f3971H0) {
            return System.nanoTime();
        }
        return 0;
    }

    public C1075m getOnFlingListener() {
        return this.f4003c0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f4012h0;
    }

    public C1077o getRecycledViewPool() {
        return this.f4007f.mo5471d();
    }

    public int getScrollState() {
        return this.f3995R;
    }

    /* renamed from: h */
    public void mo5120h(int i) {
        if (!this.f3978B) {
            LayoutManager layoutManager = this.f4029q;
            if (layoutManager == null) {
                Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            } else {
                layoutManager.mo4992a(this, this.f4020l0, i);
            }
        }
    }

    /* renamed from: h */
    public void mo5121h(int i, int i2) {
    }

    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().mo3392a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public String mo5122i() {
        StringBuilder sb = new StringBuilder();
        sb.append(" ");
        sb.append(super.toString());
        sb.append(", adapter:");
        sb.append(this.f4027p);
        sb.append(", layout:");
        sb.append(this.f4029q);
        sb.append(", context:");
        sb.append(getContext());
        return sb.toString();
    }

    /* renamed from: i */
    public void mo5124i(View view) {
    }

    public boolean isAttachedToWindow() {
        return this.f4039v;
    }

    public final boolean isLayoutSuppressed() {
        return this.f3978B;
    }

    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().mo3401b();
    }

    /* renamed from: j */
    public void mo5127j(View view) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public void mo5129k() {
        this.f4011h = new C1091a(new C1068f());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public void mo5131l() {
        this.f3993P = null;
        this.f3991N = null;
        this.f3992O = null;
        this.f3990M = null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public boolean mo5132m() {
        AccessibilityManager accessibilityManager = this.f3983F;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    /* renamed from: n */
    public boolean mo5133n() {
        return this.f3987J > 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public void mo5134o() {
        int b = this.f4013i.mo5648b();
        for (int i = 0; i < b; i++) {
            ((LayoutParams) this.f4013i.mo5654d(i).getLayoutParams()).f4077c = true;
        }
        this.f4007f.mo5477g();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004f, code lost:
        if (r0 >= 30.0f) goto L_0x0054;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAttachedToWindow() {
        /*
            r4 = this;
            super.onAttachedToWindow()
            r0 = 0
            r4.f3987J = r0
            r1 = 1
            r4.f4039v = r1
            boolean r2 = r4.f4045y
            if (r2 == 0) goto L_0x0014
            boolean r2 = r4.isLayoutRequested()
            if (r2 != 0) goto L_0x0014
            goto L_0x0015
        L_0x0014:
            r1 = 0
        L_0x0015:
            r4.f4045y = r1
            androidx.recyclerview.widget.RecyclerView$LayoutManager r1 = r4.f4029q
            if (r1 == 0) goto L_0x001e
            r1.mo5239a(r4)
        L_0x001e:
            r4.f4032r0 = r0
            boolean r0 = f3971H0
            if (r0 == 0) goto L_0x0067
            java.lang.ThreadLocal<androidx.recyclerview.widget.j> r0 = androidx.recyclerview.widget.C1126j.f4319i
            java.lang.Object r0 = r0.get()
            androidx.recyclerview.widget.j r0 = (androidx.recyclerview.widget.C1126j) r0
            r4.f4016j0 = r0
            androidx.recyclerview.widget.j r0 = r4.f4016j0
            if (r0 != 0) goto L_0x0062
            androidx.recyclerview.widget.j r0 = new androidx.recyclerview.widget.j
            r0.<init>()
            r4.f4016j0 = r0
            android.view.Display r0 = androidx.core.view.ViewCompat.m2857j(r4)
            r1 = 1114636288(0x42700000, float:60.0)
            boolean r2 = r4.isInEditMode()
            if (r2 != 0) goto L_0x0052
            if (r0 == 0) goto L_0x0052
            float r0 = r0.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 < 0) goto L_0x0052
            goto L_0x0054
        L_0x0052:
            r0 = 1114636288(0x42700000, float:60.0)
        L_0x0054:
            androidx.recyclerview.widget.j r1 = r4.f4016j0
            r2 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r2 = r2 / r0
            long r2 = (long) r2
            r1.f4323g = r2
            java.lang.ThreadLocal<androidx.recyclerview.widget.j> r0 = androidx.recyclerview.widget.C1126j.f4319i
            r0.set(r1)
        L_0x0062:
            androidx.recyclerview.widget.j r0 = r4.f4016j0
            r0.mo5716a(r4)
        L_0x0067:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ItemAnimator itemAnimator = this.f3994Q;
        if (itemAnimator != null) {
            itemAnimator.endAnimations();
        }
        mo5183x();
        this.f4039v = false;
        LayoutManager layoutManager = this.f4029q;
        if (layoutManager != null) {
            layoutManager.mo5240a(this, this.f4007f);
        }
        this.f4048z0.clear();
        removeCallbacks(this.f3977A0);
        this.f4015j.mo5815b();
        if (f3971H0) {
            C1126j jVar = this.f4016j0;
            if (jVar != null) {
                jVar.mo5718b(this);
                this.f4016j0 = null;
            }
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.f4033s.size();
        for (int i = 0; i < size; i++) {
            ((C1074l) this.f4033s.get(i)).onDraw(canvas, this, this.f4020l0);
        }
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f;
        float f2;
        if (this.f4029q != null && !this.f3978B && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f2 = this.f4029q.mo4999b() ? -motionEvent.getAxisValue(9) : 0.0f;
                if (this.f4029q.mo4994a()) {
                    f = motionEvent.getAxisValue(10);
                    if (!(f2 == 0.0f && f == 0.0f)) {
                        mo5053a((int) (f * this.f4008f0), (int) (f2 * this.f4010g0), motionEvent);
                    }
                }
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.f4029q.mo4999b()) {
                        f2 = -axisValue;
                    } else if (this.f4029q.mo4994a()) {
                        f = axisValue;
                        f2 = 0.0f;
                        mo5053a((int) (f * this.f4008f0), (int) (f2 * this.f4010g0), motionEvent);
                    }
                }
                f2 = 0.0f;
            }
            f = 0.0f;
            mo5053a((int) (f * this.f4008f0), (int) (f2 * this.f4010g0), motionEvent);
        }
        return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2 = false;
        if (this.f3978B) {
            return false;
        }
        this.f4037u = null;
        if (m4868b(motionEvent)) {
            m4876y();
            return true;
        }
        LayoutManager layoutManager = this.f4029q;
        if (layoutManager == null) {
            return false;
        }
        boolean a = layoutManager.mo4994a();
        boolean b = this.f4029q.mo4999b();
        if (this.f3997T == null) {
            this.f3997T = VelocityTracker.obtain();
        }
        this.f3997T.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.f3980C) {
                this.f3980C = false;
            }
            this.f3996S = motionEvent.getPointerId(0);
            int x = (int) (motionEvent.getX() + 0.5f);
            this.f4000W = x;
            this.f3998U = x;
            int y = (int) (motionEvent.getY() + 0.5f);
            this.f4001a0 = y;
            this.f3999V = y;
            if (this.f3995R == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                stopNestedScroll(1);
            }
            int[] iArr = this.f4044x0;
            iArr[1] = 0;
            iArr[0] = 0;
            int i = a ? 1 : 0;
            if (b) {
                i |= 2;
            }
            startNestedScroll(i, 0);
        } else if (actionMasked == 1) {
            this.f3997T.clear();
            stopNestedScroll(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f3996S);
            if (findPointerIndex < 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("Error processing scroll; pointer index for id ");
                sb.append(this.f3996S);
                sb.append(" not found. Did any MotionEvents get skipped?");
                Log.e("RecyclerView", sb.toString());
                return false;
            }
            int x2 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y2 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.f3995R != 1) {
                int i2 = x2 - this.f3998U;
                int i3 = y2 - this.f3999V;
                if (!a || Math.abs(i2) <= this.f4002b0) {
                    z = false;
                } else {
                    this.f4000W = x2;
                    z = true;
                }
                if (b && Math.abs(i3) > this.f4002b0) {
                    this.f4001a0 = y2;
                    z = true;
                }
                if (z) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            m4876y();
        } else if (actionMasked == 5) {
            this.f3996S = motionEvent.getPointerId(actionIndex);
            int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f4000W = x3;
            this.f3998U = x3;
            int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f4001a0 = y3;
            this.f3999V = y3;
        } else if (actionMasked == 6) {
            m4869c(motionEvent);
        }
        if (this.f3995R == 1) {
            z2 = true;
        }
        return z2;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C0569g.m2680a("RV OnLayout");
        mo5071c();
        C0569g.m2679a();
        this.f4045y = true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        LayoutManager layoutManager = this.f4029q;
        if (layoutManager == null) {
            mo5073c(i, i2);
            return;
        }
        boolean z = false;
        if (layoutManager.mo5009x()) {
            int mode = MeasureSpec.getMode(i);
            int mode2 = MeasureSpec.getMode(i2);
            this.f4029q.mo5236a(this.f4007f, this.f4020l0, i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            if (!z && this.f4027p != null) {
                if (this.f4020l0.f4113e == 1) {
                    m4838A();
                }
                this.f4029q.mo5254b(i, i2);
                this.f4020l0.f4118j = true;
                m4839B();
                this.f4029q.mo5276d(i, i2);
                if (this.f4029q.mo4972D()) {
                    this.f4029q.mo5254b(MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    this.f4020l0.f4118j = true;
                    m4839B();
                    this.f4029q.mo5276d(i, i2);
                }
            }
        } else if (this.f4041w) {
            this.f4029q.mo5236a(this.f4007f, this.f4020l0, i, i2);
        } else {
            if (this.f3982E) {
                mo5182w();
                mo5148q();
                m4846I();
                mo5149r();
                C1082s sVar = this.f4020l0;
                if (sVar.f4120l) {
                    sVar.f4116h = true;
                } else {
                    this.f4011h.mo5625b();
                    this.f4020l0.f4116h = false;
                }
                this.f3982E = false;
                mo5074c(false);
            } else if (this.f4020l0.f4120l) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            C1069g gVar = this.f4027p;
            if (gVar != null) {
                this.f4020l0.f4114f = gVar.getItemCount();
            } else {
                this.f4020l0.f4114f = 0;
            }
            mo5182w();
            this.f4029q.mo5236a(this.f4007f, this.f4020l0, i, i2);
            mo5074c(false);
            this.f4020l0.f4116h = false;
        }
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (mo5133n()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        this.f4009g = (SavedState) parcelable;
        super.onRestoreInstanceState(this.f4009g.mo3548a());
        LayoutManager layoutManager = this.f4029q;
        if (layoutManager != null) {
            Parcelable parcelable2 = this.f4009g.f4079g;
            if (parcelable2 != null) {
                layoutManager.mo4989a(parcelable2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SavedState savedState2 = this.f4009g;
        if (savedState2 != null) {
            savedState.mo5331a(savedState2);
        } else {
            LayoutManager layoutManager = this.f4029q;
            if (layoutManager != null) {
                savedState.f4079g = layoutManager.mo4971A();
            } else {
                savedState.f4079g = null;
            }
        }
        return savedState;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 || i2 != i4) {
            mo5131l();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x011f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r6 = r17
            r7 = r18
            boolean r0 = r6.f3978B
            r8 = 0
            if (r0 != 0) goto L_0x01cc
            boolean r0 = r6.f3980C
            if (r0 == 0) goto L_0x000f
            goto L_0x01cc
        L_0x000f:
            boolean r0 = r17.m4864a(r18)
            r9 = 1
            if (r0 == 0) goto L_0x001a
            r17.m4876y()
            return r9
        L_0x001a:
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r6.f4029q
            if (r0 != 0) goto L_0x001f
            return r8
        L_0x001f:
            boolean r10 = r0.mo4994a()
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r6.f4029q
            boolean r11 = r0.mo4999b()
            android.view.VelocityTracker r0 = r6.f3997T
            if (r0 != 0) goto L_0x0033
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r6.f3997T = r0
        L_0x0033:
            int r0 = r18.getActionMasked()
            int r1 = r18.getActionIndex()
            if (r0 != 0) goto L_0x0043
            int[] r2 = r6.f4044x0
            r2[r9] = r8
            r2[r8] = r8
        L_0x0043:
            android.view.MotionEvent r12 = android.view.MotionEvent.obtain(r18)
            int[] r2 = r6.f4044x0
            r3 = r2[r8]
            float r3 = (float) r3
            r2 = r2[r9]
            float r2 = (float) r2
            r12.offsetLocation(r3, r2)
            r2 = 1056964608(0x3f000000, float:0.5)
            if (r0 == 0) goto L_0x019b
            if (r0 == r9) goto L_0x0159
            r3 = 2
            if (r0 == r3) goto L_0x008c
            r3 = 3
            if (r0 == r3) goto L_0x0087
            r3 = 5
            if (r0 == r3) goto L_0x006b
            r1 = 6
            if (r0 == r1) goto L_0x0066
            goto L_0x01c1
        L_0x0066:
            r17.m4869c(r18)
            goto L_0x01c1
        L_0x006b:
            int r0 = r7.getPointerId(r1)
            r6.f3996S = r0
            float r0 = r7.getX(r1)
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.f4000W = r0
            r6.f3998U = r0
            float r0 = r7.getY(r1)
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.f4001a0 = r0
            r6.f3999V = r0
            goto L_0x01c1
        L_0x0087:
            r17.m4876y()
            goto L_0x01c1
        L_0x008c:
            int r0 = r6.f3996S
            int r0 = r7.findPointerIndex(r0)
            if (r0 >= 0) goto L_0x00b2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Error processing scroll; pointer index for id "
            r0.append(r1)
            int r1 = r6.f3996S
            r0.append(r1)
            java.lang.String r1 = " not found. Did any MotionEvents get skipped?"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "RecyclerView"
            android.util.Log.e(r1, r0)
            return r8
        L_0x00b2:
            float r1 = r7.getX(r0)
            float r1 = r1 + r2
            int r13 = (int) r1
            float r0 = r7.getY(r0)
            float r0 = r0 + r2
            int r14 = (int) r0
            int r0 = r6.f4000W
            int r15 = r0 - r13
            int r0 = r6.f4001a0
            int r16 = r0 - r14
            int[] r3 = r6.f4046y0
            r3[r8] = r8
            r3[r9] = r8
            int[] r4 = r6.f4042w0
            r5 = 0
            r0 = r17
            r1 = r15
            r2 = r16
            boolean r0 = r0.dispatchNestedPreScroll(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x00f5
            int[] r0 = r6.f4046y0
            r1 = r0[r8]
            int r15 = r15 - r1
            r0 = r0[r9]
            int r16 = r16 - r0
            int[] r0 = r6.f4044x0
            r1 = r0[r8]
            int[] r2 = r6.f4042w0
            r3 = r2[r8]
            int r1 = r1 + r3
            r0[r8] = r1
            r1 = r0[r9]
            r2 = r2[r9]
            int r1 = r1 + r2
            r0[r9] = r1
        L_0x00f5:
            int r0 = r6.f3995R
            if (r0 == r9) goto L_0x0122
            if (r10 == 0) goto L_0x010a
            int r0 = java.lang.Math.abs(r15)
            int r1 = r6.f4002b0
            if (r0 <= r1) goto L_0x010a
            if (r15 <= 0) goto L_0x0107
            int r15 = r15 - r1
            goto L_0x0108
        L_0x0107:
            int r15 = r15 + r1
        L_0x0108:
            r0 = 1
            goto L_0x010b
        L_0x010a:
            r0 = 0
        L_0x010b:
            if (r11 == 0) goto L_0x011d
            int r1 = java.lang.Math.abs(r16)
            int r2 = r6.f4002b0
            if (r1 <= r2) goto L_0x011d
            if (r16 <= 0) goto L_0x011a
            int r16 = r16 - r2
            goto L_0x011c
        L_0x011a:
            int r16 = r16 + r2
        L_0x011c:
            r0 = 1
        L_0x011d:
            if (r0 == 0) goto L_0x0122
            r6.setScrollState(r9)
        L_0x0122:
            r0 = r16
            int r1 = r6.f3995R
            if (r1 != r9) goto L_0x01c1
            int[] r1 = r6.f4042w0
            r2 = r1[r8]
            int r13 = r13 - r2
            r6.f4000W = r13
            r1 = r1[r9]
            int r14 = r14 - r1
            r6.f4001a0 = r14
            if (r10 == 0) goto L_0x0138
            r1 = r15
            goto L_0x0139
        L_0x0138:
            r1 = 0
        L_0x0139:
            if (r11 == 0) goto L_0x013d
            r2 = r0
            goto L_0x013e
        L_0x013d:
            r2 = 0
        L_0x013e:
            boolean r1 = r6.mo5053a(r1, r2, r7)
            if (r1 == 0) goto L_0x014b
            android.view.ViewParent r1 = r17.getParent()
            r1.requestDisallowInterceptTouchEvent(r9)
        L_0x014b:
            androidx.recyclerview.widget.j r1 = r6.f4016j0
            if (r1 == 0) goto L_0x01c1
            if (r15 != 0) goto L_0x0153
            if (r0 == 0) goto L_0x01c1
        L_0x0153:
            androidx.recyclerview.widget.j r1 = r6.f4016j0
            r1.mo5717a(r6, r15, r0)
            goto L_0x01c1
        L_0x0159:
            android.view.VelocityTracker r0 = r6.f3997T
            r0.addMovement(r12)
            android.view.VelocityTracker r0 = r6.f3997T
            r1 = 1000(0x3e8, float:1.401E-42)
            int r2 = r6.f4006e0
            float r2 = (float) r2
            r0.computeCurrentVelocity(r1, r2)
            r0 = 0
            if (r10 == 0) goto L_0x0175
            android.view.VelocityTracker r1 = r6.f3997T
            int r2 = r6.f3996S
            float r1 = r1.getXVelocity(r2)
            float r1 = -r1
            goto L_0x0176
        L_0x0175:
            r1 = 0
        L_0x0176:
            if (r11 == 0) goto L_0x0182
            android.view.VelocityTracker r2 = r6.f3997T
            int r3 = r6.f3996S
            float r2 = r2.getYVelocity(r3)
            float r2 = -r2
            goto L_0x0183
        L_0x0182:
            r2 = 0
        L_0x0183:
            int r3 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r3 != 0) goto L_0x018b
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0193
        L_0x018b:
            int r0 = (int) r1
            int r1 = (int) r2
            boolean r0 = r6.mo5088e(r0, r1)
            if (r0 != 0) goto L_0x0196
        L_0x0193:
            r6.setScrollState(r8)
        L_0x0196:
            r17.m4850M()
            r8 = 1
            goto L_0x01c1
        L_0x019b:
            int r0 = r7.getPointerId(r8)
            r6.f3996S = r0
            float r0 = r18.getX()
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.f4000W = r0
            r6.f3998U = r0
            float r0 = r18.getY()
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.f4001a0 = r0
            r6.f3999V = r0
            if (r10 == 0) goto L_0x01b9
            r0 = 1
            goto L_0x01ba
        L_0x01b9:
            r0 = 0
        L_0x01ba:
            if (r11 == 0) goto L_0x01be
            r0 = r0 | 2
        L_0x01be:
            r6.startNestedScroll(r0, r8)
        L_0x01c1:
            if (r8 != 0) goto L_0x01c8
            android.view.VelocityTracker r0 = r6.f3997T
            r0.addMovement(r12)
        L_0x01c8:
            r12.recycle()
            return r9
        L_0x01cc:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: p */
    public void mo5147p() {
        int b = this.f4013i.mo5648b();
        for (int i = 0; i < b; i++) {
            C1085v m = m4874m(this.f4013i.mo5654d(i));
            if (m != null && !m.shouldIgnore()) {
                m.addFlags(6);
            }
        }
        mo5134o();
        this.f4007f.mo5478h();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: q */
    public void mo5148q() {
        this.f3987J++;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: r */
    public void mo5149r() {
        mo5052a(true);
    }

    /* access modifiers changed from: protected */
    public void removeDetachedView(View view, boolean z) {
        C1085v m = m4874m(view);
        if (m != null) {
            if (m.isTmpDetached()) {
                m.clearTmpDetachFlag();
            } else if (!m.shouldIgnore()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(m);
                sb.append(mo5122i());
                throw new IllegalArgumentException(sb.toString());
            }
        }
        view.clearAnimation();
        mo5062b(view);
        super.removeDetachedView(view, z);
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.f4029q.mo5251a(this, this.f4020l0, view, view2) && view2 != null) {
            m4857a(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.f4029q.mo5248a(this, view, rect, z);
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        int size = this.f4035t.size();
        for (int i = 0; i < size; i++) {
            ((OnItemTouchListener) this.f4035t.get(i)).onRequestDisallowInterceptTouchEvent(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void requestLayout() {
        if (this.f4047z != 0 || this.f3978B) {
            this.f3976A = true;
        } else {
            super.requestLayout();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: s */
    public void mo5155s() {
        if (!this.f4032r0 && this.f4039v) {
            ViewCompat.m2826a((View) this, this.f3977A0);
            this.f4032r0 = true;
        }
    }

    public void scrollBy(int i, int i2) {
        LayoutManager layoutManager = this.f4029q;
        if (layoutManager == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.f3978B) {
            boolean a = layoutManager.mo4994a();
            boolean b = this.f4029q.mo4999b();
            if (a || b) {
                if (!a) {
                    i = 0;
                }
                if (!b) {
                    i2 = 0;
                }
                mo5053a(i, i2, (MotionEvent) null);
            }
        }
    }

    public void scrollTo(int i, int i2) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!mo5054a(accessibilityEvent)) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        }
    }

    public void setAccessibilityDelegateCompat(C1141q qVar) {
        this.f4034s0 = qVar;
        ViewCompat.m2824a((View) this, (C0615a) this.f4034s0);
    }

    public void setAdapter(C1069g gVar) {
        setLayoutFrozen(false);
        m4858a(gVar, false, true);
        mo5068b(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(ChildDrawingOrderCallback childDrawingOrderCallback) {
        if (childDrawingOrderCallback != this.f4036t0) {
            this.f4036t0 = childDrawingOrderCallback;
            setChildrenDrawingOrderEnabled(this.f4036t0 != null);
        }
    }

    public void setClipToPadding(boolean z) {
        if (z != this.f4017k) {
            mo5131l();
        }
        this.f4017k = z;
        super.setClipToPadding(z);
        if (this.f4045y) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(C1072j jVar) {
        C0607i.m2773a(jVar);
        this.f3989L = jVar;
        mo5131l();
    }

    public void setHasFixedSize(boolean z) {
        this.f4041w = z;
    }

    public void setItemAnimator(ItemAnimator itemAnimator) {
        ItemAnimator itemAnimator2 = this.f3994Q;
        if (itemAnimator2 != null) {
            itemAnimator2.endAnimations();
            this.f3994Q.setListener(null);
        }
        this.f3994Q = itemAnimator;
        ItemAnimator itemAnimator3 = this.f3994Q;
        if (itemAnimator3 != null) {
            itemAnimator3.setListener(this.f4030q0);
        }
    }

    public void setItemViewCacheSize(int i) {
        this.f4007f.mo5476f(i);
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setLayoutManager(LayoutManager layoutManager) {
        if (layoutManager != this.f4029q) {
            mo5183x();
            if (this.f4029q != null) {
                ItemAnimator itemAnimator = this.f3994Q;
                if (itemAnimator != null) {
                    itemAnimator.endAnimations();
                }
                this.f4029q.mo5261b(this.f4007f);
                this.f4029q.mo5269c(this.f4007f);
                this.f4007f.mo5450a();
                if (this.f4039v) {
                    this.f4029q.mo5240a(this, this.f4007f);
                }
                this.f4029q.mo5284f((RecyclerView) null);
                this.f4029q = null;
            } else {
                this.f4007f.mo5450a();
            }
            this.f4013i.mo5652c();
            this.f4029q = layoutManager;
            if (layoutManager != null) {
                if (layoutManager.f4052b == null) {
                    this.f4029q.mo5284f(this);
                    if (this.f4039v) {
                        this.f4029q.mo5239a(this);
                    }
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("LayoutManager ");
                    sb.append(layoutManager);
                    sb.append(" is already attached to a RecyclerView:");
                    sb.append(layoutManager.f4052b.mo5122i());
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            this.f4007f.mo5480j();
            requestLayout();
        }
    }

    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    public void setNestedScrollingEnabled(boolean z) {
        getScrollingChildHelper().mo3391a(z);
    }

    public void setOnFlingListener(C1075m mVar) {
        this.f4003c0 = mVar;
    }

    @Deprecated
    public void setOnScrollListener(C1076n nVar) {
        this.f4022m0 = nVar;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.f4012h0 = z;
    }

    public void setRecycledViewPool(C1077o oVar) {
        this.f4007f.mo5455a(oVar);
    }

    public void setRecyclerListener(RecyclerListener recyclerListener) {
        this.f4031r = recyclerListener;
    }

    /* access modifiers changed from: 0000 */
    public void setScrollState(int i) {
        if (i != this.f3995R) {
            this.f3995R = i;
            if (i != 2) {
                m4852O();
            }
            mo5032a(i);
        }
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i != 1) {
                StringBuilder sb = new StringBuilder();
                sb.append("setScrollingTouchSlop(): bad argument constant ");
                sb.append(i);
                sb.append("; using default value");
                Log.w("RecyclerView", sb.toString());
            } else {
                this.f4002b0 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
        }
        this.f4002b0 = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(C1083t tVar) {
        this.f4007f.mo5456a(tVar);
    }

    public boolean startNestedScroll(int i) {
        return getScrollingChildHelper().mo3402b(i);
    }

    public void stopNestedScroll() {
        getScrollingChildHelper().mo3403c();
    }

    public final void suppressLayout(boolean z) {
        if (z != this.f3978B) {
            mo5051a("Do not suppressLayout in layout or scroll");
            if (!z) {
                this.f3978B = false;
                if (!(!this.f3976A || this.f4029q == null || this.f4027p == null)) {
                    requestLayout();
                }
                this.f3976A = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f3978B = true;
            this.f3980C = true;
            mo5183x();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: t */
    public void mo5179t() {
        ItemAnimator itemAnimator = this.f3994Q;
        if (itemAnimator != null) {
            itemAnimator.endAnimations();
        }
        LayoutManager layoutManager = this.f4029q;
        if (layoutManager != null) {
            layoutManager.mo5261b(this.f4007f);
            this.f4029q.mo5269c(this.f4007f);
        }
        this.f4007f.mo5450a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: u */
    public void mo5180u() {
        int a = this.f4013i.mo5642a();
        for (int i = 0; i < a; i++) {
            View c = this.f4013i.mo5651c(i);
            C1085v g = mo5094g(c);
            if (g != null) {
                C1085v vVar = g.mShadowingHolder;
                if (vVar != null) {
                    View view = vVar.itemView;
                    int left = c.getLeft();
                    int top = c.getTop();
                    if (left != view.getLeft() || top != view.getTop()) {
                        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: v */
    public void mo5181v() {
        int b = this.f4013i.mo5648b();
        for (int i = 0; i < b; i++) {
            C1085v m = m4874m(this.f4013i.mo5654d(i));
            if (!m.shouldIgnore()) {
                m.saveOldPosition();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: w */
    public void mo5182w() {
        this.f4047z++;
        if (this.f4047z == 1 && !this.f3978B) {
            this.f3976A = false;
        }
    }

    /* renamed from: x */
    public void mo5183x() {
        setScrollState(0);
        m4852O();
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: l */
    static RecyclerView m4873l(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView l = m4873l(viewGroup.getChildAt(i));
            if (l != null) {
                return l;
            }
        }
        return null;
    }

    /* renamed from: m */
    static C1085v m4874m(View view) {
        if (view == null) {
            return null;
        }
        return ((LayoutParams) view.getLayoutParams()).f4075a;
    }

    /* renamed from: n */
    private int m4875n(View view) {
        int id = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id = view.getId();
            }
        }
        return id;
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return getScrollingChildHelper().mo3400a(i, i2, iArr, iArr2, i3);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return getScrollingChildHelper().mo3398a(i, i2, i3, i4, iArr, i5);
    }

    public boolean hasNestedScrollingParent(int i) {
        return getScrollingChildHelper().mo3395a(i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public boolean mo5130k(View view) {
        mo5182w();
        boolean e = this.f4013i.mo5657e(view);
        if (e) {
            C1085v m = m4874m(view);
            this.f4007f.mo5469c(m);
            this.f4007f.mo5464b(m);
        }
        mo5074c(!e);
        return e;
    }

    public boolean startNestedScroll(int i, int i2) {
        return getScrollingChildHelper().mo3396a(i, i2);
    }

    public void stopNestedScroll(int i) {
        getScrollingChildHelper().mo3404c(i);
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4005e = new C1080q();
        this.f4007f = new C1079p();
        this.f4015j = new C1156y();
        this.f4019l = new C1063a();
        this.f4021m = new Rect();
        this.f4023n = new Rect();
        this.f4025o = new RectF();
        this.f4033s = new ArrayList<>();
        this.f4035t = new ArrayList<>();
        this.f4047z = 0;
        this.f3985H = false;
        this.f3986I = false;
        this.f3987J = 0;
        this.f3988K = 0;
        this.f3989L = new C1072j();
        this.f3994Q = new C1101f();
        this.f3995R = 0;
        this.f3996S = -1;
        this.f4008f0 = Float.MIN_VALUE;
        this.f4010g0 = Float.MIN_VALUE;
        boolean z = true;
        this.f4012h0 = true;
        this.f4014i0 = new C1084u();
        this.f4018k0 = f3971H0 ? new C1128b() : null;
        this.f4020l0 = new C1082s();
        this.f4026o0 = false;
        this.f4028p0 = false;
        this.f4030q0 = new C1073k();
        this.f4032r0 = false;
        this.f4038u0 = new int[2];
        this.f4042w0 = new int[2];
        this.f4044x0 = new int[2];
        this.f4046y0 = new int[2];
        this.f4048z0 = new ArrayList();
        this.f3977A0 = new C1064b();
        this.f3979B0 = new C1066d();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f3967D0, i, 0);
            this.f4017k = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        } else {
            this.f4017k = true;
        }
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f4002b0 = viewConfiguration.getScaledTouchSlop();
        this.f4008f0 = C0655j.m3054b(viewConfiguration, context);
        this.f4010g0 = C0655j.m3055c(viewConfiguration, context);
        this.f4004d0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f4006e0 = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.f3994Q.setListener(this.f4030q0);
        mo5129k();
        m4844G();
        m4843F();
        if (ViewCompat.m2860m(this) == 0) {
            ViewCompat.m2852g(this, 1);
        }
        this.f3983F = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new C1141q(this));
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, C7651b.RecyclerView, i, 0);
            String string = obtainStyledAttributes2.getString(C7651b.RecyclerView_layoutManager);
            if (obtainStyledAttributes2.getInt(C7651b.RecyclerView_android_descendantFocusability, -1) == -1) {
                setDescendantFocusability(262144);
            }
            this.f4043x = obtainStyledAttributes2.getBoolean(C7651b.RecyclerView_fastScrollEnabled, false);
            if (this.f4043x) {
                mo5039a((StateListDrawable) obtainStyledAttributes2.getDrawable(C7651b.RecyclerView_fastScrollVerticalThumbDrawable), obtainStyledAttributes2.getDrawable(C7651b.RecyclerView_fastScrollVerticalTrackDrawable), (StateListDrawable) obtainStyledAttributes2.getDrawable(C7651b.RecyclerView_fastScrollHorizontalThumbDrawable), obtainStyledAttributes2.getDrawable(C7651b.RecyclerView_fastScrollHorizontalTrackDrawable));
            }
            obtainStyledAttributes2.recycle();
            m4856a(context, string, attributeSet, i, 0);
            if (VERSION.SDK_INT >= 21) {
                TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, f3966C0, i, 0);
                boolean z2 = obtainStyledAttributes3.getBoolean(0, true);
                obtainStyledAttributes3.recycle();
                z = z2;
            }
        } else {
            setDescendantFocusability(262144);
        }
        setNestedScrollingEnabled(z);
    }

    /* renamed from: b */
    public void mo5065b(C1074l lVar) {
        LayoutManager layoutManager = this.f4029q;
        if (layoutManager != null) {
            layoutManager.mo4993a("Cannot remove item decoration during a scroll  or layout");
        }
        this.f4033s.remove(lVar);
        if (this.f4033s.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        mo5134o();
        requestLayout();
    }

    public final void dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        getScrollingChildHelper().mo3390a(i, i2, i3, i4, iArr, i5, iArr2);
    }

    /* renamed from: i */
    public void mo5123i(int i, int i2) {
        mo5034a(i, i2, (Interpolator) null);
    }

    /* renamed from: j */
    public boolean mo5128j() {
        return !this.f4045y || this.f3985H || this.f4011h.mo5627c();
    }

    /* access modifiers changed from: protected */
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        LayoutManager layoutManager = this.f4029q;
        if (layoutManager != null) {
            return layoutManager.mo4934a(layoutParams);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("RecyclerView has no LayoutManager");
        sb.append(mo5122i());
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: a */
    private void m4856a(Context context, String str, AttributeSet attributeSet, int i, int i2) {
        ClassLoader classLoader;
        Constructor constructor;
        String str2 = ": Could not instantiate the LayoutManager: ";
        if (str != null) {
            String trim = str.trim();
            if (!trim.isEmpty()) {
                String a = m4853a(context, trim);
                try {
                    if (isInEditMode()) {
                        classLoader = getClass().getClassLoader();
                    } else {
                        classLoader = context.getClassLoader();
                    }
                    Class asSubclass = Class.forName(a, false, classLoader).asSubclass(LayoutManager.class);
                    Object[] objArr = null;
                    try {
                        constructor = asSubclass.getConstructor(f3974K0);
                        objArr = new Object[]{context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
                    } catch (NoSuchMethodException e) {
                        constructor = asSubclass.getConstructor(new Class[0]);
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((LayoutManager) constructor.newInstance(objArr));
                } catch (NoSuchMethodException e2) {
                    e2.initCause(e);
                    StringBuilder sb = new StringBuilder();
                    sb.append(attributeSet.getPositionDescription());
                    sb.append(": Error creating LayoutManager ");
                    sb.append(a);
                    throw new IllegalStateException(sb.toString(), e2);
                } catch (ClassNotFoundException e3) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(attributeSet.getPositionDescription());
                    sb2.append(": Unable to find LayoutManager ");
                    sb2.append(a);
                    throw new IllegalStateException(sb2.toString(), e3);
                } catch (InvocationTargetException e4) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(attributeSet.getPositionDescription());
                    sb3.append(str2);
                    sb3.append(a);
                    throw new IllegalStateException(sb3.toString(), e4);
                } catch (InstantiationException e5) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(attributeSet.getPositionDescription());
                    sb4.append(str2);
                    sb4.append(a);
                    throw new IllegalStateException(sb4.toString(), e5);
                } catch (IllegalAccessException e6) {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(attributeSet.getPositionDescription());
                    sb5.append(": Cannot access non-public constructor ");
                    sb5.append(a);
                    throw new IllegalStateException(sb5.toString(), e6);
                } catch (ClassCastException e7) {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(attributeSet.getPositionDescription());
                    sb6.append(": Class is not a LayoutManager ");
                    sb6.append(a);
                    throw new IllegalStateException(sb6.toString(), e7);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo5074c(boolean z) {
        if (this.f4047z < 1) {
            this.f4047z = 1;
        }
        if (!z && !this.f3978B) {
            this.f3976A = false;
        }
        if (this.f4047z == 1) {
            if (z && this.f3976A && !this.f3978B && this.f4029q != null && this.f4027p != null) {
                mo5071c();
            }
            if (!this.f3978B) {
                this.f3976A = false;
            }
        }
        this.f4047z--;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public void mo5119h() {
        if (this.f3991N == null) {
            this.f3991N = this.f3989L.mo5425a(this, 1);
            if (this.f4017k) {
                this.f3991N.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                this.f3991N.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo5095g() {
        if (this.f3992O == null) {
            this.f3992O = this.f3989L.mo5425a(this, 2);
            if (this.f4017k) {
                this.f3992O.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                this.f3992O.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    /* renamed from: d */
    public C1085v mo5076d(View view) {
        View c = mo5070c(view);
        if (c == null) {
            return null;
        }
        return mo5094g(c);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo5092f(int i, int i2) {
        int b = this.f4013i.mo5648b();
        for (int i3 = 0; i3 < b; i3++) {
            C1085v m = m4874m(this.f4013i.mo5654d(i3));
            if (m != null && !m.shouldIgnore() && m.mPosition >= i) {
                m.offsetPosition(i2, false);
                this.f4020l0.f4115g = true;
            }
        }
        this.f4007f.mo5451a(i, i2);
        requestLayout();
    }

    /* renamed from: b */
    public void mo5066b(C1076n nVar) {
        List<C1076n> list = this.f4024n0;
        if (list != null) {
            list.remove(nVar);
        }
    }

    /* renamed from: d */
    public void mo5078d(int i) {
        int a = this.f4013i.mo5642a();
        for (int i2 = 0; i2 < a; i2++) {
            this.f4013i.mo5651c(i2).offsetLeftAndRight(i);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo5060b() {
        String str = "RV FullInvalidate";
        if (!this.f4045y || this.f3985H) {
            C0569g.m2680a(str);
            mo5071c();
            C0569g.m2679a();
        } else if (this.f4011h.mo5627c()) {
            if (this.f4011h.mo5628c(4) && !this.f4011h.mo5628c(11)) {
                C0569g.m2680a("RV PartialInvalidate");
                mo5182w();
                mo5148q();
                this.f4011h.mo5631e();
                if (!this.f3976A) {
                    if (m4842E()) {
                        mo5071c();
                    } else {
                        this.f4011h.mo5618a();
                    }
                }
                mo5074c(true);
                mo5149r();
                C0569g.m2679a();
            } else if (this.f4011h.mo5627c()) {
                C0569g.m2680a(str);
                mo5071c();
                C0569g.m2679a();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo5079d(int i, int i2) {
        this.f3988K++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX, scrollY);
        mo5121h(i, i2);
        C1076n nVar = this.f4022m0;
        if (nVar != null) {
            nVar.onScrolled(this, i, i2);
        }
        List<C1076n> list = this.f4024n0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((C1076n) this.f4024n0.get(size)).onScrolled(this, i, i2);
            }
        }
        this.f3988K--;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public Rect mo5118h(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (!layoutParams.f4077c) {
            return layoutParams.f4076b;
        }
        if (this.f4020l0.mo5487d() && (layoutParams.mo5322b() || layoutParams.mo5324d())) {
            return layoutParams.f4076b;
        }
        Rect rect = layoutParams.f4076b;
        rect.set(0, 0, 0, 0);
        int size = this.f4033s.size();
        for (int i = 0; i < size; i++) {
            this.f4021m.set(0, 0, 0, 0);
            ((C1074l) this.f4033s.get(i)).getItemOffsets(this.f4021m, view, this, this.f4020l0);
            int i2 = rect.left;
            Rect rect2 = this.f4021m;
            rect.left = i2 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        layoutParams.f4077c = false;
        return rect;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo5097g(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int b = this.f4013i.mo5648b();
        if (i < i2) {
            i5 = i;
            i4 = i2;
            i3 = -1;
        } else {
            i4 = i;
            i5 = i2;
            i3 = 1;
        }
        for (int i6 = 0; i6 < b; i6++) {
            C1085v m = m4874m(this.f4013i.mo5654d(i6));
            if (m != null) {
                int i7 = m.mPosition;
                if (i7 >= i5 && i7 <= i4) {
                    if (i7 == i) {
                        m.offsetPosition(i2 - i, false);
                    } else {
                        m.offsetPosition(i3, false);
                    }
                    this.f4020l0.f4115g = true;
                }
            }
        }
        this.f4007f.mo5462b(i, i2);
        requestLayout();
    }

    /* renamed from: c */
    private void m4869c(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f3996S) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f3996S = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.f4000W = x;
            this.f3998U = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.f4001a0 = y;
            this.f3999V = y;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo5086e() {
        if (this.f3993P == null) {
            this.f3993P = this.f3989L.mo5425a(this, 3);
            if (this.f4017k) {
                this.f3993P.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                this.f3993P.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    /* renamed from: f */
    public int mo5089f(View view) {
        C1085v m = m4874m(view);
        if (m != null) {
            return m.getLayoutPosition();
        }
        return -1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo5073c(int i, int i2) {
        setMeasuredDimension(LayoutManager.m4967a(i, getPaddingLeft() + getPaddingRight(), ViewCompat.m2864q(this)), LayoutManager.m4967a(i2, getPaddingTop() + getPaddingBottom(), ViewCompat.m2863p(this)));
    }

    /* renamed from: e */
    public int mo5085e(View view) {
        C1085v m = m4874m(view);
        if (m != null) {
            return m.getAdapterPosition();
        }
        return -1;
    }

    /* renamed from: g */
    public C1085v mo5094g(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return m4874m(view);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("View ");
        sb.append(view);
        sb.append(" is not a direct child of ");
        sb.append(this);
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo5077d() {
        for (int size = this.f4048z0.size() - 1; size >= 0; size--) {
            C1085v vVar = (C1085v) this.f4048z0.get(size);
            if (vVar.itemView.getParent() == this && !vVar.shouldIgnore()) {
                int i = vVar.mPendingAccessibilityState;
                if (i != -1) {
                    ViewCompat.m2852g(vVar.itemView, i);
                    vVar.mPendingAccessibilityState = -1;
                }
            }
        }
        this.f4048z0.clear();
    }

    /* renamed from: e */
    public void mo5087e(int i) {
        int a = this.f4013i.mo5642a();
        for (int i2 = 0; i2 < a; i2++) {
            this.f4013i.mo5651c(i2).offsetTopAndBottom(i);
        }
    }

    /* renamed from: a */
    private String m4853a(Context context, String str) {
        if (str.charAt(0) == '.') {
            StringBuilder sb = new StringBuilder();
            sb.append(context.getPackageName());
            sb.append(str);
            return sb.toString();
        } else if (str.contains(".")) {
            return str;
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(RecyclerView.class.getPackage().getName());
            sb2.append('.');
            sb2.append(str);
            return sb2.toString();
        }
    }

    /* renamed from: e */
    static void m4871e(C1085v vVar) {
        WeakReference<RecyclerView> weakReference = vVar.mNestedRecyclerView;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view != vVar.itemView) {
                    ViewParent parent = view.getParent();
                    view = parent instanceof View ? (View) parent : null;
                } else {
                    return;
                }
            }
            vVar.mNestedRecyclerView = null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo5071c() {
        String str = "RecyclerView";
        if (this.f4027p == null) {
            Log.e(str, "No adapter attached; skipping layout");
        } else if (this.f4029q == null) {
            Log.e(str, "No layout manager attached; skipping layout");
        } else {
            C1082s sVar = this.f4020l0;
            sVar.f4118j = false;
            if (sVar.f4113e == 1) {
                m4838A();
                this.f4029q.mo5281e(this);
                m4839B();
            } else if (!this.f4011h.mo5630d() && this.f4029q.mo5309t() == getWidth() && this.f4029q.mo5289h() == getHeight()) {
                this.f4029q.mo5281e(this);
            } else {
                this.f4029q.mo5281e(this);
                m4839B();
            }
            m4840C();
        }
    }

    /* renamed from: a */
    public void mo5044a(C1069g gVar, boolean z) {
        setLayoutFrozen(false);
        m4858a(gVar, true, z);
        mo5068b(true);
        requestLayout();
    }

    /* renamed from: a */
    private void m4858a(C1069g gVar, boolean z, boolean z2) {
        C1069g gVar2 = this.f4027p;
        if (gVar2 != null) {
            gVar2.unregisterAdapterDataObserver(this.f4005e);
            this.f4027p.onDetachedFromRecyclerView(this);
        }
        if (!z || z2) {
            mo5179t();
        }
        this.f4011h.mo5632f();
        C1069g gVar3 = this.f4027p;
        this.f4027p = gVar;
        if (gVar != null) {
            gVar.registerAdapterDataObserver(this.f4005e);
            gVar.onAttachedToRecyclerView(this);
        }
        LayoutManager layoutManager = this.f4029q;
        if (layoutManager != null) {
            layoutManager.mo5234a(gVar3, this.f4027p);
        }
        this.f4007f.mo5454a(gVar3, this.f4027p, z);
        this.f4020l0.f4115g = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo5061b(int i, int i2) {
        boolean z;
        EdgeEffect edgeEffect = this.f3990M;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            z = false;
        } else {
            this.f3990M.onRelease();
            z = this.f3990M.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f3992O;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.f3992O.onRelease();
            z |= this.f3992O.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f3991N;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.f3991N.onRelease();
            z |= this.f3991N.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f3993P;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.f3993P.onRelease();
            z |= this.f3993P.isFinished();
        }
        if (z) {
            ViewCompat.m2808H(this);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public long mo5069c(C1085v vVar) {
        return this.f4027p.hasStableIds() ? vVar.getItemId() : (long) vVar.mPosition;
    }

    /* renamed from: c */
    public View mo5070c(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = (View) parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    /* renamed from: a */
    public void mo5042a(OnChildAttachStateChangeListener onChildAttachStateChangeListener) {
        if (this.f3984G == null) {
            this.f3984G = new ArrayList();
        }
        this.f3984G.add(onChildAttachStateChangeListener);
    }

    /* renamed from: b */
    public void mo5064b(OnItemTouchListener onItemTouchListener) {
        this.f4035t.remove(onItemTouchListener);
        if (this.f4037u == onItemTouchListener) {
            this.f4037u = null;
        }
    }

    /* renamed from: b */
    private boolean m4868b(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.f4035t.size();
        int i = 0;
        while (i < size) {
            OnItemTouchListener onItemTouchListener = (OnItemTouchListener) this.f4035t.get(i);
            if (!onItemTouchListener.onInterceptTouchEvent(this, motionEvent) || action == 3) {
                i++;
            } else {
                this.f4037u = onItemTouchListener;
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo5046a(C1074l lVar, int i) {
        LayoutManager layoutManager = this.f4029q;
        if (layoutManager != null) {
            layoutManager.mo4993a("Cannot add item decoration during a scroll  or layout");
        }
        if (this.f4033s.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i < 0) {
            this.f4033s.add(lVar);
        } else {
            this.f4033s.add(i, lVar);
        }
        mo5134o();
        requestLayout();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo5067b(C1085v vVar, C1057b bVar, C1057b bVar2) {
        m4870d(vVar);
        vVar.setIsRecyclable(false);
        if (this.f3994Q.animateDisappearance(vVar, bVar, bVar2)) {
            mo5155s();
        }
    }

    /* renamed from: a */
    public void mo5045a(C1074l lVar) {
        mo5046a(lVar, -1);
    }

    /* renamed from: a */
    public void mo5047a(C1076n nVar) {
        if (this.f4024n0 == null) {
            this.f4024n0 = new ArrayList();
        }
        this.f4024n0.add(nVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo5068b(boolean z) {
        this.f3986I = z | this.f3986I;
        this.f3985H = true;
        mo5147p();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5038a(int i, int i2, int[] iArr) {
        mo5182w();
        mo5148q();
        C0569g.m2680a("RV Scroll");
        mo5048a(this.f4020l0);
        int a = i != 0 ? this.f4029q.mo4929a(i, this.f4007f, this.f4020l0) : 0;
        int b = i2 != 0 ? this.f4029q.mo4943b(i2, this.f4007f, this.f4020l0) : 0;
        C0569g.m2679a();
        mo5180u();
        mo5149r();
        mo5074c(false);
        if (iArr != null) {
            iArr[0] = a;
            iArr[1] = b;
        }
    }

    /* renamed from: b */
    public C1085v mo5059b(int i) {
        C1085v vVar = null;
        if (this.f3985H) {
            return null;
        }
        int b = this.f4013i.mo5648b();
        for (int i2 = 0; i2 < b; i2++) {
            C1085v m = m4874m(this.f4013i.mo5654d(i2));
            if (m != null && !m.isRemoved() && mo5058b(m) == i) {
                if (!this.f4013i.mo5653c(m.itemView)) {
                    return m;
                }
                vVar = m;
            }
        }
        return vVar;
    }

    /* renamed from: b */
    static void m4867b(View view, Rect rect) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        Rect rect2 = layoutParams.f4076b;
        rect.set((view.getLeft() - rect2.left) - layoutParams.leftMargin, (view.getTop() - rect2.top) - layoutParams.topMargin, view.getRight() + rect2.right + layoutParams.rightMargin, view.getBottom() + rect2.bottom + layoutParams.bottomMargin);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo5053a(int i, int i2, MotionEvent motionEvent) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = i;
        int i8 = i2;
        MotionEvent motionEvent2 = motionEvent;
        mo5060b();
        if (this.f4027p != null) {
            int[] iArr = this.f4046y0;
            iArr[0] = 0;
            iArr[1] = 0;
            mo5038a(i7, i8, iArr);
            int[] iArr2 = this.f4046y0;
            int i9 = iArr2[0];
            int i10 = iArr2[1];
            i6 = i10;
            i5 = i9;
            i4 = i7 - i9;
            i3 = i8 - i10;
        } else {
            i6 = 0;
            i5 = 0;
            i4 = 0;
            i3 = 0;
        }
        if (!this.f4033s.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.f4046y0;
        iArr3[0] = 0;
        iArr3[1] = 0;
        int i11 = i6;
        int i12 = i5;
        dispatchNestedScroll(i5, i6, i4, i3, this.f4042w0, 0, iArr3);
        int[] iArr4 = this.f4046y0;
        int i13 = i4 - iArr4[0];
        int i14 = i3 - iArr4[1];
        int i15 = this.f4000W;
        int[] iArr5 = this.f4042w0;
        this.f4000W = i15 - iArr5[0];
        this.f4001a0 -= iArr5[1];
        int[] iArr6 = this.f4044x0;
        iArr6[0] = iArr6[0] + iArr5[0];
        iArr6[1] = iArr6[1] + iArr5[1];
        if (getOverScrollMode() != 2) {
            if (motionEvent2 != null && !C0644f.m3008a(motionEvent2, 8194)) {
                m4854a(motionEvent.getX(), (float) i13, motionEvent.getY(), (float) i14);
            }
            mo5061b(i, i2);
        }
        int i16 = i12;
        int i17 = i11;
        if (!(i16 == 0 && i17 == 0)) {
            mo5079d(i16, i17);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        if (i16 == 0 && i17 == 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo5062b(View view) {
        C1085v m = m4874m(view);
        mo5127j(view);
        C1069g gVar = this.f4027p;
        if (!(gVar == null || m == null)) {
            gVar.onViewDetachedFromWindow(m);
        }
        List<OnChildAttachStateChangeListener> list = this.f3984G;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((OnChildAttachStateChangeListener) this.f3984G.get(size)).onChildViewDetachedFromWindow(view);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo5058b(C1085v vVar) {
        if (vVar.hasAnyOfTheFlags(524) || !vVar.isBound()) {
            return -1;
        }
        return this.f4011h.mo5615a(vVar.mPosition);
    }

    /* renamed from: a */
    public void mo5034a(int i, int i2, Interpolator interpolator) {
        mo5035a(i, i2, interpolator, Integer.MIN_VALUE);
    }

    /* renamed from: a */
    public void mo5035a(int i, int i2, Interpolator interpolator, int i3) {
        LayoutManager layoutManager = this.f4029q;
        if (layoutManager == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.f3978B) {
            boolean z = false;
            if (!layoutManager.mo4994a()) {
                i = 0;
            }
            if (!this.f4029q.mo4999b()) {
                i2 = 0;
            }
            if (!(i == 0 && i2 == 0)) {
                if (i3 == Integer.MIN_VALUE || i3 > 0) {
                    z = true;
                }
                if (z) {
                    this.f4014i0.mo5493a(i, i2, i3, interpolator);
                } else {
                    scrollBy(i, i2);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0056  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m4854a(float r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = 1
            r2 = 0
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 >= 0) goto L_0x0021
            r6.mo5090f()
            android.widget.EdgeEffect r3 = r6.f3990M
            float r4 = -r8
            int r5 = r6.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            float r9 = r0 - r9
            androidx.core.widget.C0675c.m3162a(r3, r4, r9)
        L_0x001f:
            r9 = 1
            goto L_0x003c
        L_0x0021:
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 <= 0) goto L_0x003b
            r6.mo5095g()
            android.widget.EdgeEffect r3 = r6.f3992O
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r4 = r8 / r4
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            androidx.core.widget.C0675c.m3162a(r3, r4, r9)
            goto L_0x001f
        L_0x003b:
            r9 = 0
        L_0x003c:
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 >= 0) goto L_0x0056
            r6.mo5119h()
            android.widget.EdgeEffect r9 = r6.f3991N
            float r0 = -r10
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r0 = r0 / r3
            int r3 = r6.getWidth()
            float r3 = (float) r3
            float r7 = r7 / r3
            androidx.core.widget.C0675c.m3162a(r9, r0, r7)
            goto L_0x0072
        L_0x0056:
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 <= 0) goto L_0x0071
            r6.mo5086e()
            android.widget.EdgeEffect r9 = r6.f3993P
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r3 = r10 / r3
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r7 = r7 / r4
            float r0 = r0 - r7
            androidx.core.widget.C0675c.m3162a(r9, r3, r0)
            goto L_0x0072
        L_0x0071:
            r1 = r9
        L_0x0072:
            if (r1 != 0) goto L_0x007c
            int r7 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r7 != 0) goto L_0x007c
            int r7 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r7 == 0) goto L_0x007f
        L_0x007c:
            androidx.core.view.ViewCompat.m2808H(r6)
        L_0x007f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m4854a(float, float, float, float):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5033a(int i, int i2) {
        if (i < 0) {
            mo5090f();
            if (this.f3990M.isFinished()) {
                this.f3990M.onAbsorb(-i);
            }
        } else if (i > 0) {
            mo5095g();
            if (this.f3992O.isFinished()) {
                this.f3992O.onAbsorb(i);
            }
        }
        if (i2 < 0) {
            mo5119h();
            if (this.f3991N.isFinished()) {
                this.f3991N.onAbsorb(-i2);
            }
        } else if (i2 > 0) {
            mo5086e();
            if (this.f3993P.isFinished()) {
                this.f3993P.onAbsorb(i2);
            }
        }
        if (i != 0 || i2 != 0) {
            ViewCompat.m2808H(this);
        }
    }

    /* renamed from: a */
    private boolean m4865a(View view, View view2, int i) {
        int i2;
        boolean z = false;
        if (!(view2 == null || view2 == this)) {
            if (mo5070c(view2) == null) {
                return false;
            }
            if (view == null || mo5070c(view) == null) {
                return true;
            }
            this.f4021m.set(0, 0, view.getWidth(), view.getHeight());
            this.f4023n.set(0, 0, view2.getWidth(), view2.getHeight());
            offsetDescendantRectToMyCoords(view, this.f4021m);
            offsetDescendantRectToMyCoords(view2, this.f4023n);
            char c = 65535;
            int i3 = this.f4029q.mo5295k() == 1 ? -1 : 1;
            Rect rect = this.f4021m;
            int i4 = rect.left;
            int i5 = this.f4023n.left;
            if ((i4 < i5 || rect.right <= i5) && this.f4021m.right < this.f4023n.right) {
                i2 = 1;
            } else {
                Rect rect2 = this.f4021m;
                int i6 = rect2.right;
                int i7 = this.f4023n.right;
                i2 = ((i6 > i7 || rect2.left >= i7) && this.f4021m.left > this.f4023n.left) ? -1 : 0;
            }
            Rect rect3 = this.f4021m;
            int i8 = rect3.top;
            int i9 = this.f4023n.top;
            if ((i8 < i9 || rect3.bottom <= i9) && this.f4021m.bottom < this.f4023n.bottom) {
                c = 1;
            } else {
                Rect rect4 = this.f4021m;
                int i10 = rect4.bottom;
                int i11 = this.f4023n.bottom;
                if ((i10 <= i11 && rect4.top < i11) || this.f4021m.top <= this.f4023n.top) {
                    c = 0;
                }
            }
            if (i != 1) {
                if (i == 2) {
                    if (c > 0 || (c == 0 && i2 * i3 >= 0)) {
                        z = true;
                    }
                    return z;
                } else if (i == 17) {
                    if (i2 < 0) {
                        z = true;
                    }
                    return z;
                } else if (i == 33) {
                    if (c < 0) {
                        z = true;
                    }
                    return z;
                } else if (i == 66) {
                    if (i2 > 0) {
                        z = true;
                    }
                    return z;
                } else if (i == 130) {
                    if (c > 0) {
                        z = true;
                    }
                    return z;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid direction: ");
                    sb.append(i);
                    sb.append(mo5122i());
                    throw new IllegalArgumentException(sb.toString());
                }
            } else if (c < 0 || (c == 0 && i2 * i3 <= 0)) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: a */
    private void m4857a(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.f4021m.set(0, 0, view3.getWidth(), view3.getHeight());
        android.view.ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof LayoutParams) {
            LayoutParams layoutParams2 = (LayoutParams) layoutParams;
            if (!layoutParams2.f4077c) {
                Rect rect = layoutParams2.f4076b;
                Rect rect2 = this.f4021m;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.f4021m);
            offsetRectIntoDescendantCoords(view, this.f4021m);
        }
        this.f4029q.mo5249a(this, view, this.f4021m, !this.f4045y, view2 == null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5051a(String str) {
        if (mo5133n()) {
            if (str == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Cannot call this method while RecyclerView is computing a layout or scrolling");
                sb.append(mo5122i());
                throw new IllegalStateException(sb.toString());
            }
            throw new IllegalStateException(str);
        } else if (this.f3988K > 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("");
            sb2.append(mo5122i());
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(sb2.toString()));
        }
    }

    /* renamed from: a */
    public void mo5043a(OnItemTouchListener onItemTouchListener) {
        this.f4035t.add(onItemTouchListener);
    }

    /* renamed from: a */
    private boolean m4864a(MotionEvent motionEvent) {
        OnItemTouchListener onItemTouchListener = this.f4037u;
        if (onItemTouchListener != null) {
            onItemTouchListener.onTouchEvent(this, motionEvent);
            int action = motionEvent.getAction();
            if (action == 3 || action == 1) {
                this.f4037u = null;
            }
            return true;
        } else if (motionEvent.getAction() == 0) {
            return false;
        } else {
            return m4868b(motionEvent);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5052a(boolean z) {
        this.f3987J--;
        if (this.f3987J < 1) {
            this.f3987J = 0;
            if (z) {
                m4877z();
                mo5077d();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo5054a(AccessibilityEvent accessibilityEvent) {
        if (!mo5133n()) {
            return false;
        }
        int a = accessibilityEvent != null ? C0627b.m2909a(accessibilityEvent) : 0;
        if (a == 0) {
            a = 0;
        }
        this.f3981D = a | this.f3981D;
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo5048a(C1082s sVar) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.f4014i0.f4128g;
            sVar.f4124p = overScroller.getFinalX() - overScroller.getCurrX();
            sVar.f4125q = overScroller.getFinalY() - overScroller.getCurrY();
            return;
        }
        sVar.f4124p = 0;
        sVar.f4125q = 0;
    }

    /* renamed from: a */
    private void m4855a(long j, C1085v vVar, C1085v vVar2) {
        int a = this.f4013i.mo5642a();
        for (int i = 0; i < a; i++) {
            C1085v m = m4874m(this.f4013i.mo5651c(i));
            if (m != vVar && mo5069c(m) == j) {
                C1069g gVar = this.f4027p;
                String str = " \n View Holder 2:";
                if (gVar == null || !gVar.hasStableIds()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
                    sb.append(m);
                    sb.append(str);
                    sb.append(vVar);
                    sb.append(mo5122i());
                    throw new IllegalStateException(sb.toString());
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
                sb2.append(m);
                sb2.append(str);
                sb2.append(vVar);
                sb2.append(mo5122i());
                throw new IllegalStateException(sb2.toString());
            }
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Problem while matching changed view holders with the newones. The pre-layout information for the change holder ");
        sb3.append(vVar2);
        sb3.append(" cannot be found but it is necessary for ");
        sb3.append(vVar);
        sb3.append(mo5122i());
        Log.e("RecyclerView", sb3.toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5049a(C1085v vVar, C1057b bVar) {
        vVar.setFlags(0, 8192);
        if (this.f4020l0.f4117i && vVar.isUpdated() && !vVar.isRemoved() && !vVar.shouldIgnore()) {
            this.f4015j.mo5811a(mo5069c(vVar), vVar);
        }
        this.f4015j.mo5818c(vVar, bVar);
    }

    /* renamed from: a */
    private void m4863a(int[] iArr) {
        int a = this.f4013i.mo5642a();
        if (a == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < a; i3++) {
            C1085v m = m4874m(this.f4013i.mo5651c(i3));
            if (!m.shouldIgnore()) {
                int layoutPosition = m.getLayoutPosition();
                if (layoutPosition < i) {
                    i = layoutPosition;
                }
                if (layoutPosition > i2) {
                    i2 = layoutPosition;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5050a(C1085v vVar, C1057b bVar, C1057b bVar2) {
        vVar.setIsRecyclable(false);
        if (this.f3994Q.animateAppearance(vVar, bVar, bVar2)) {
            mo5155s();
        }
    }

    /* renamed from: a */
    private void m4859a(C1085v vVar, C1085v vVar2, C1057b bVar, C1057b bVar2, boolean z, boolean z2) {
        vVar.setIsRecyclable(false);
        if (z) {
            m4870d(vVar);
        }
        if (vVar != vVar2) {
            if (z2) {
                m4870d(vVar2);
            }
            vVar.mShadowedHolder = vVar2;
            m4870d(vVar);
            this.f4007f.mo5469c(vVar);
            vVar2.setIsRecyclable(false);
            vVar2.mShadowingHolder = vVar;
        }
        if (this.f3994Q.animateChange(vVar, vVar2, bVar, bVar2)) {
            mo5155s();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5031a() {
        int b = this.f4013i.mo5648b();
        for (int i = 0; i < b; i++) {
            C1085v m = m4874m(this.f4013i.mo5654d(i));
            if (!m.shouldIgnore()) {
                m.clearOldPosition();
            }
        }
        this.f4007f.mo5461b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5037a(int i, int i2, boolean z) {
        int i3 = i + i2;
        int b = this.f4013i.mo5648b();
        for (int i4 = 0; i4 < b; i4++) {
            C1085v m = m4874m(this.f4013i.mo5654d(i4));
            if (m != null && !m.shouldIgnore()) {
                int i5 = m.mPosition;
                if (i5 >= i3) {
                    m.offsetPosition(-i2, z);
                    this.f4020l0.f4115g = true;
                } else if (i5 >= i) {
                    m.flagRemovedAndOffsetPosition(i - 1, -i2, z);
                    this.f4020l0.f4115g = true;
                }
            }
        }
        this.f4007f.mo5452a(i, i2, z);
        requestLayout();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5036a(int i, int i2, Object obj) {
        int b = this.f4013i.mo5648b();
        int i3 = i + i2;
        for (int i4 = 0; i4 < b; i4++) {
            View d = this.f4013i.mo5654d(i4);
            C1085v m = m4874m(d);
            if (m != null && !m.shouldIgnore()) {
                int i5 = m.mPosition;
                if (i5 >= i && i5 < i3) {
                    m.addFlags(2);
                    m.addChangePayload(obj);
                    ((LayoutParams) d.getLayoutParams()).f4077c = true;
                }
            }
        }
        this.f4007f.mo5467c(i, i2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo5055a(C1085v vVar) {
        ItemAnimator itemAnimator = this.f3994Q;
        return itemAnimator == null || itemAnimator.canReuseUpdatedViewHolder(vVar, vVar.getUnmodifiedPayloads());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C1085v mo5029a(int i, boolean z) {
        int b = this.f4013i.mo5648b();
        C1085v vVar = null;
        for (int i2 = 0; i2 < b; i2++) {
            C1085v m = m4874m(this.f4013i.mo5654d(i2));
            if (m != null && !m.isRemoved()) {
                if (z) {
                    if (m.mPosition != i) {
                        continue;
                    }
                } else if (m.getLayoutPosition() != i) {
                    continue;
                }
                if (!this.f4013i.mo5653c(m.itemView)) {
                    return m;
                }
                vVar = m;
            }
        }
        return vVar;
    }

    /* renamed from: a */
    public C1085v mo5030a(long j) {
        C1069g gVar = this.f4027p;
        C1085v vVar = null;
        if (gVar != null && gVar.hasStableIds()) {
            int b = this.f4013i.mo5648b();
            for (int i = 0; i < b; i++) {
                C1085v m = m4874m(this.f4013i.mo5654d(i));
                if (m != null && !m.isRemoved() && m.getItemId() == j) {
                    if (!this.f4013i.mo5653c(m.itemView)) {
                        return m;
                    }
                    vVar = m;
                }
            }
        }
        return vVar;
    }

    /* renamed from: a */
    public View mo5028a(float f, float f2) {
        for (int a = this.f4013i.mo5642a() - 1; a >= 0; a--) {
            View c = this.f4013i.mo5651c(a);
            float translationX = c.getTranslationX();
            float translationY = c.getTranslationY();
            if (f >= ((float) c.getLeft()) + translationX && f <= ((float) c.getRight()) + translationX && f2 >= ((float) c.getTop()) + translationY && f2 <= ((float) c.getBottom()) + translationY) {
                return c;
            }
        }
        return null;
    }

    /* renamed from: a */
    public void mo5041a(View view, Rect rect) {
        m4867b(view, rect);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5032a(int i) {
        LayoutManager layoutManager = this.f4029q;
        if (layoutManager != null) {
            layoutManager.mo5283f(i);
        }
        mo5091f(i);
        C1076n nVar = this.f4022m0;
        if (nVar != null) {
            nVar.onScrollStateChanged(this, i);
        }
        List<C1076n> list = this.f4024n0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((C1076n) this.f4024n0.get(size)).onScrollStateChanged(this, i);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5040a(View view) {
        C1085v m = m4874m(view);
        mo5124i(view);
        C1069g gVar = this.f4027p;
        if (!(gVar == null || m == null)) {
            gVar.onViewAttachedToWindow(m);
        }
        List<OnChildAttachStateChangeListener> list = this.f3984G;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((OnChildAttachStateChangeListener) this.f3984G.get(size)).onChildViewAttachedToWindow(view);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo5056a(C1085v vVar, int i) {
        if (mo5133n()) {
            vVar.mPendingAccessibilityState = i;
            this.f4048z0.add(vVar);
            return false;
        }
        ViewCompat.m2852g(vVar.itemView, i);
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5039a(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Trying to set fast scroller without both required drawables.");
            sb.append(mo5122i());
            throw new IllegalArgumentException(sb.toString());
        }
        Resources resources = getContext().getResources();
        new C1121i(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(C7650a.fastscroll_default_thickness), resources.getDimensionPixelSize(C7650a.fastscroll_minimum_range), resources.getDimensionPixelOffset(C7650a.fastscroll_margin));
    }
}
