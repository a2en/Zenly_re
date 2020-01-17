package com.mapbox.mapboxsdk.maps;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.graphics.PointF;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.animation.DecelerateInterpolator;
import com.mapbox.android.gestures.C11288a;
import com.mapbox.android.gestures.C11296i;
import com.mapbox.android.gestures.MoveGestureDetector;
import com.mapbox.android.gestures.MoveGestureDetector.C11281a;
import com.mapbox.android.gestures.MoveGestureDetector.OnMoveGestureListener;
import com.mapbox.android.gestures.MultiFingerTapGestureDetector;
import com.mapbox.android.gestures.MultiFingerTapGestureDetector.OnMultiFingerTapGestureListener;
import com.mapbox.android.gestures.RotateGestureDetector;
import com.mapbox.android.gestures.RotateGestureDetector.C11282a;
import com.mapbox.android.gestures.RotateGestureDetector.OnRotateGestureListener;
import com.mapbox.android.gestures.ShoveGestureDetector;
import com.mapbox.android.gestures.ShoveGestureDetector.C11283a;
import com.mapbox.android.gestures.ShoveGestureDetector.OnShoveGestureListener;
import com.mapbox.android.gestures.StandardGestureDetector.C11285b;
import com.mapbox.android.gestures.StandardGestureDetector.StandardOnGestureListener;
import com.mapbox.android.gestures.StandardScaleGestureDetector;
import com.mapbox.android.gestures.StandardScaleGestureDetector.C11287b;
import com.mapbox.android.gestures.StandardScaleGestureDetector.StandardOnScaleGestureListener;
import com.mapbox.mapboxsdk.C11451d;
import com.mapbox.mapboxsdk.C11454g;
import com.mapbox.mapboxsdk.camera.CameraPosition;
import com.mapbox.mapboxsdk.geometry.LatLng;
import com.mapbox.mapboxsdk.maps.MapboxMap.OnFlingListener;
import com.mapbox.mapboxsdk.maps.MapboxMap.OnMapClickListener;
import com.mapbox.mapboxsdk.maps.MapboxMap.OnMapLongClickListener;
import com.mapbox.mapboxsdk.maps.MapboxMap.OnMoveListener;
import com.mapbox.mapboxsdk.maps.MapboxMap.OnRotateListener;
import com.mapbox.mapboxsdk.maps.MapboxMap.OnScaleListener;
import com.mapbox.mapboxsdk.maps.MapboxMap.OnShoveListener;
import com.mapbox.mapboxsdk.utils.C11597d;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.mapbox.mapboxsdk.maps.i */
final class C11534i {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C11568u f29892a;

    /* renamed from: b */
    private final C11555r f29893b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C11573v f29894c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C11518b f29895d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C11529e f29896e;

    /* renamed from: f */
    private final CopyOnWriteArrayList<OnMapClickListener> f29897f = new CopyOnWriteArrayList<>();

    /* renamed from: g */
    private final CopyOnWriteArrayList<OnMapLongClickListener> f29898g = new CopyOnWriteArrayList<>();

    /* renamed from: h */
    private final CopyOnWriteArrayList<OnFlingListener> f29899h = new CopyOnWriteArrayList<>();

    /* renamed from: i */
    private final CopyOnWriteArrayList<OnMoveListener> f29900i = new CopyOnWriteArrayList<>();

    /* renamed from: j */
    private final CopyOnWriteArrayList<OnRotateListener> f29901j = new CopyOnWriteArrayList<>();

    /* renamed from: k */
    private final CopyOnWriteArrayList<OnScaleListener> f29902k = new CopyOnWriteArrayList<>();

    /* renamed from: l */
    private final CopyOnWriteArrayList<OnShoveListener> f29903l = new CopyOnWriteArrayList<>();
    /* access modifiers changed from: private */

    /* renamed from: m */
    public PointF f29904m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public C11288a f29905n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public boolean f29906o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public Animator f29907p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public Animator f29908q;

    /* renamed from: r */
    private final List<Animator> f29909r = new ArrayList();

    /* renamed from: s */
    private Handler f29910s = new Handler();

    /* renamed from: t */
    private final Runnable f29911t = new C11535a();

    /* renamed from: com.mapbox.mapboxsdk.maps.i$a */
    class C11535a implements Runnable {
        C11535a() {
        }

        public void run() {
            C11534i.this.mo33840a();
        }
    }

    /* renamed from: com.mapbox.mapboxsdk.maps.i$b */
    class C11536b implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ PointF f29913a;

        C11536b(PointF pointF) {
            this.f29913a = pointF;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C11534i.this.f29892a.mo33937a((double) ((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f29913a);
        }
    }

    /* renamed from: com.mapbox.mapboxsdk.maps.i$c */
    class C11537c extends AnimatorListenerAdapter {
        C11537c() {
        }

        public void onAnimationCancel(Animator animator) {
            C11534i.this.f29892a.mo33932a();
        }

        public void onAnimationEnd(Animator animator) {
            C11534i.this.m30058d();
        }

        public void onAnimationStart(Animator animator) {
            C11534i.this.f29892a.mo33932a();
            C11534i.this.f29896e.onCameraMoveStarted(3);
        }
    }

    /* renamed from: com.mapbox.mapboxsdk.maps.i$d */
    private final class C11538d extends C11281a {
        private C11538d() {
        }

        public boolean onMove(MoveGestureDetector moveGestureDetector, float f, float f2) {
            if (!(f == 0.0f && f2 == 0.0f)) {
                C11534i.this.f29896e.onCameraMoveStarted(1);
                C11534i.this.f29892a.mo33934a((double) (-f), (double) (-f2), 0);
                C11534i.this.mo33857c(moveGestureDetector);
            }
            return true;
        }

        public boolean onMoveBegin(MoveGestureDetector moveGestureDetector) {
            if (!C11534i.this.f29894c.mo33962J()) {
                return false;
            }
            C11534i.this.m30055c();
            C11534i.this.m30047a("Pan", moveGestureDetector.mo32821f());
            C11534i.this.mo33843a(moveGestureDetector);
            return true;
        }

        public void onMoveEnd(MoveGestureDetector moveGestureDetector, float f, float f2) {
            C11534i.this.m30058d();
            C11534i.this.mo33851b(moveGestureDetector);
        }

        /* synthetic */ C11538d(C11534i iVar, C11535a aVar) {
            this();
        }
    }

    /* renamed from: com.mapbox.mapboxsdk.maps.i$e */
    private final class C11539e extends C11282a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public PointF f29917a;

        /* renamed from: b */
        private final float f29918b;

        /* renamed from: c */
        private final float f29919c;

        /* renamed from: d */
        private final float f29920d;

        /* renamed from: com.mapbox.mapboxsdk.maps.i$e$a */
        class C11540a implements AnimatorUpdateListener {
            C11540a() {
            }

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                C11534i.this.f29892a.mo33936a(C11534i.this.f29892a.mo33946c() + ((double) ((Float) valueAnimator.getAnimatedValue()).floatValue()), C11539e.this.f29917a.x, C11539e.this.f29917a.y, 0);
            }
        }

        /* renamed from: com.mapbox.mapboxsdk.maps.i$e$b */
        class C11541b extends AnimatorListenerAdapter {
            C11541b() {
            }

            public void onAnimationCancel(Animator animator) {
                C11534i.this.f29892a.mo33932a();
            }

            public void onAnimationEnd(Animator animator) {
                C11534i.this.m30058d();
            }

            public void onAnimationStart(Animator animator) {
                C11534i.this.f29892a.mo33932a();
                C11534i.this.f29896e.onCameraMoveStarted(3);
            }
        }

        public C11539e(float f, float f2, float f3) {
            this.f29918b = f;
            this.f29919c = f2;
            this.f29920d = f3;
        }

        public boolean onRotate(RotateGestureDetector rotateGestureDetector, float f, float f2) {
            C11534i.this.f29896e.onCameraMoveStarted(1);
            m30090a(rotateGestureDetector);
            double c = C11534i.this.f29892a.mo33946c() + ((double) f);
            C11568u g = C11534i.this.f29892a;
            PointF pointF = this.f29917a;
            g.mo33935a(c, pointF.x, pointF.y);
            C11534i.this.mo33858c(rotateGestureDetector);
            return true;
        }

        public boolean onRotateBegin(RotateGestureDetector rotateGestureDetector) {
            if (!C11534i.this.f29894c.mo33959G()) {
                return false;
            }
            C11534i.this.m30055c();
            if (C11534i.this.f29894c.mo33956D()) {
                C11534i.this.f29905n.mo32803f().mo32775b(this.f29918b);
                C11534i.this.f29905n.mo32803f().mo32779n();
            }
            m30090a(rotateGestureDetector);
            C11534i.this.m30047a("Rotation", this.f29917a);
            C11534i.this.mo33844a(rotateGestureDetector);
            return true;
        }

        public void onRotateEnd(RotateGestureDetector rotateGestureDetector, float f, float f2, float f3) {
            if (C11534i.this.f29894c.mo33956D()) {
                C11534i.this.f29905n.mo32803f().mo32775b(this.f29920d);
            }
            C11534i.this.mo33852b(rotateGestureDetector);
            if (!C11534i.this.f29894c.mo33960H() || Math.abs(f3) < this.f29919c) {
                C11534i.this.m30058d();
                return;
            }
            boolean z = f3 < 0.0f;
            float a = C11597d.m30383a((float) Math.pow((double) f3, 2.0d), 1.5f, 20.0f);
            long log = (long) (Math.log((double) (1.0f + a)) * 500.0d);
            if (z) {
                a = -a;
            }
            C11534i.this.f29908q = m30088a(a, log);
            C11534i iVar = C11534i.this;
            iVar.m30051b(iVar.f29908q);
        }

        /* renamed from: a */
        private void m30090a(RotateGestureDetector rotateGestureDetector) {
            if (C11534i.this.f29904m != null) {
                this.f29917a = C11534i.this.f29904m;
            } else {
                this.f29917a = rotateGestureDetector.mo32821f();
            }
        }

        /* renamed from: a */
        private Animator m30088a(float f, long j) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f, 0.0f});
            ofFloat.setDuration(j);
            ofFloat.setInterpolator(new DecelerateInterpolator());
            ofFloat.addUpdateListener(new C11540a());
            ofFloat.addListener(new C11541b());
            return ofFloat;
        }
    }

    /* renamed from: com.mapbox.mapboxsdk.maps.i$f */
    private final class C11542f extends C11287b {

        /* renamed from: a */
        private final float f29924a;

        /* renamed from: b */
        private PointF f29925b;

        /* renamed from: c */
        private boolean f29926c;

        C11542f(float f) {
            this.f29924a = f;
        }

        /* renamed from: a */
        private void m30093a(StandardScaleGestureDetector standardScaleGestureDetector) {
            if (C11534i.this.f29904m != null) {
                this.f29925b = C11534i.this.f29904m;
            } else if (this.f29926c) {
                this.f29925b = new PointF(C11534i.this.f29894c.mo34014u() / 2.0f, C11534i.this.f29894c.mo34004n() / 2.0f);
            } else {
                this.f29925b = standardScaleGestureDetector.mo32821f();
            }
        }

        public boolean onScale(StandardScaleGestureDetector standardScaleGestureDetector) {
            C11534i.this.f29896e.onCameraMoveStarted(1);
            m30093a(standardScaleGestureDetector);
            C11534i.this.f29892a.mo33945b(m30092a(standardScaleGestureDetector.mo32780q(), this.f29926c), this.f29925b);
            C11534i.this.mo33860c(standardScaleGestureDetector);
            return true;
        }

        public boolean onScaleBegin(StandardScaleGestureDetector standardScaleGestureDetector) {
            this.f29926c = standardScaleGestureDetector.mo32822g() == 1;
            if (this.f29926c) {
                C11534i.this.f29906o = false;
            }
            if (!C11534i.this.f29894c.mo33964L()) {
                return false;
            }
            if (this.f29926c) {
                if (!C11534i.this.f29894c.mo33958F()) {
                    return false;
                }
                C11534i.this.f29905n.mo32799b().mo32806a(false);
            }
            C11534i.this.m30055c();
            if (C11534i.this.f29894c.mo33955C()) {
                C11534i.this.f29905n.mo32801d().mo32739b(40.3f);
            }
            m30093a(standardScaleGestureDetector);
            C11534i.this.m30047a("Pinch", this.f29925b);
            C11534i.this.mo33846a(standardScaleGestureDetector);
            return true;
        }

        public void onScaleEnd(StandardScaleGestureDetector standardScaleGestureDetector, float f, float f2) {
            if (this.f29926c) {
                C11534i.this.f29905n.mo32799b().mo32806a(true);
            }
            if (C11534i.this.f29894c.mo33955C()) {
                C11534i.this.f29905n.mo32801d().mo32739b(15.3f);
            }
            C11534i.this.mo33854b(standardScaleGestureDetector);
            float abs = Math.abs(f) + Math.abs(f2);
            if (!C11534i.this.f29894c.mo33961I() || abs < this.f29924a) {
                C11534i.this.m30058d();
                return;
            }
            double a = m30091a((double) abs, standardScaleGestureDetector.mo32781r());
            double d = C11534i.this.f29892a.mo33947d();
            long abs2 = (long) ((Math.abs(a) * 1000.0d) / 4.0d);
            C11534i iVar = C11534i.this;
            iVar.f29907p = iVar.m30039a(d, a, this.f29925b, abs2);
            C11534i iVar2 = C11534i.this;
            iVar2.m30051b(iVar2.f29907p);
        }

        /* renamed from: a */
        private double m30091a(double d, boolean z) {
            double log = (double) ((float) Math.log((d / 1000.0d) + 1.0d));
            return z ? -log : log;
        }

        /* renamed from: a */
        private double m30092a(float f, boolean z) {
            double log = Math.log((double) f) / Math.log(1.5707963267948966d);
            if (!z) {
                return log;
            }
            boolean z2 = log < 0.0d;
            double a = C11597d.m30382a(Math.abs(log), 0.0d, 0.15000000596046448d);
            return z2 ? -a : a;
        }
    }

    /* renamed from: com.mapbox.mapboxsdk.maps.i$g */
    private final class C11543g extends C11283a {
        private C11543g() {
        }

        public boolean onShove(ShoveGestureDetector shoveGestureDetector, float f, float f2) {
            C11534i.this.f29896e.onCameraMoveStarted(1);
            C11534i.this.f29892a.mo33941a(Double.valueOf(C11597d.m30382a(C11534i.this.f29892a.mo33948e() - ((double) (f * 0.1f)), 0.0d, 60.0d)));
            C11534i.this.mo33859c(shoveGestureDetector);
            return true;
        }

        public boolean onShoveBegin(ShoveGestureDetector shoveGestureDetector) {
            if (!C11534i.this.f29894c.mo33963K()) {
                return false;
            }
            C11534i.this.m30055c();
            C11534i.this.m30047a("Pitch", shoveGestureDetector.mo32821f());
            C11534i.this.f29905n.mo32799b().mo32806a(false);
            C11534i.this.mo33845a(shoveGestureDetector);
            return true;
        }

        public void onShoveEnd(ShoveGestureDetector shoveGestureDetector, float f, float f2) {
            C11534i.this.m30058d();
            C11534i.this.f29905n.mo32799b().mo32806a(true);
            C11534i.this.mo33853b(shoveGestureDetector);
        }

        /* synthetic */ C11543g(C11534i iVar, C11535a aVar) {
            this();
        }
    }

    /* renamed from: com.mapbox.mapboxsdk.maps.i$h */
    private final class C11544h extends C11285b {
        private C11544h() {
        }

        public boolean onDoubleTapEvent(MotionEvent motionEvent) {
            PointF pointF;
            if (motionEvent.getActionMasked() == 0) {
                C11534i.this.f29906o = true;
            }
            if (motionEvent.getActionMasked() != 1) {
                return super.onDoubleTapEvent(motionEvent);
            }
            if (!C11534i.this.f29894c.mo33964L() || !C11534i.this.f29894c.mo33953A() || !C11534i.this.f29906o) {
                return false;
            }
            if (C11534i.this.f29904m != null) {
                pointF = C11534i.this.f29904m;
            } else {
                pointF = new PointF(motionEvent.getX(), motionEvent.getY());
            }
            C11534i.this.mo33842a(pointF, false);
            C11534i.this.m30047a("DoubleTap", new PointF(motionEvent.getX(), motionEvent.getY()));
            return true;
        }

        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            float f3 = f;
            float f4 = f2;
            if (!C11534i.this.f29894c.mo33962J()) {
                return false;
            }
            C11534i.this.mo33848b();
            if (!C11534i.this.f29894c.mo33954B()) {
                return false;
            }
            float t = C11534i.this.f29894c.mo34013t();
            double hypot = Math.hypot((double) (f3 / t), (double) (f4 / t));
            if (hypot < 1000.0d) {
                return false;
            }
            C11534i.this.f29892a.mo33932a();
            C11534i.this.f29896e.onCameraMoveStarted(1);
            double e = C11534i.this.f29892a.mo33948e();
            double d = 0.0d;
            if (e != 0.0d) {
                d = e / 10.0d;
            }
            double d2 = d + 1.5d;
            double d3 = (double) t;
            C11534i.this.f29892a.mo33934a((((double) f3) / d2) / d3, (((double) f4) / d2) / d3, (long) (((hypot / 7.0d) / d2) + 150.0d));
            return true;
        }

        public void onLongPress(MotionEvent motionEvent) {
            C11534i.this.mo33849b(new PointF(motionEvent.getX(), motionEvent.getY()));
        }

        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            PointF pointF = new PointF(motionEvent.getX(), motionEvent.getY());
            if (!C11534i.this.f29895d.mo33792a(pointF)) {
                if (C11534i.this.f29894c.mo34019z()) {
                    C11534i.this.f29895d.mo33786a();
                }
                C11534i.this.mo33841a(pointF);
            }
            C11534i.this.m30047a("SingleTap", new PointF(motionEvent.getX(), motionEvent.getY()));
            return true;
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            C11534i.this.f29892a.mo33932a();
            return true;
        }

        /* synthetic */ C11544h(C11534i iVar, C11535a aVar) {
            this();
        }
    }

    /* renamed from: com.mapbox.mapboxsdk.maps.i$i */
    private final class C11545i implements OnMultiFingerTapGestureListener {
        private C11545i() {
        }

        public boolean onMultiFingerTap(MultiFingerTapGestureDetector multiFingerTapGestureDetector, int i) {
            PointF pointF;
            if (!C11534i.this.f29894c.mo33964L() || i != 2) {
                return false;
            }
            C11534i.this.f29892a.mo33932a();
            C11534i.this.f29896e.onCameraMoveStarted(1);
            C11534i.this.m30047a("TwoFingerTap", multiFingerTapGestureDetector.mo32821f());
            if (C11534i.this.f29904m != null) {
                pointF = C11534i.this.f29904m;
            } else {
                pointF = multiFingerTapGestureDetector.mo32821f();
            }
            C11534i.this.mo33850b(pointF, false);
            return true;
        }

        /* synthetic */ C11545i(C11534i iVar, C11535a aVar) {
            this();
        }
    }

    C11534i(Context context, C11568u uVar, C11555r rVar, C11573v vVar, C11518b bVar, C11529e eVar) {
        this.f29895d = bVar;
        this.f29892a = uVar;
        this.f29893b = rVar;
        this.f29894c = vVar;
        this.f29896e = eVar;
        if (context != null) {
            m30045a(new C11288a(context), true);
            m30044a(context, true);
        }
    }

    /* renamed from: a */
    private boolean m30049a(double d) {
        return d >= 0.0d && d <= 25.5d;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m30058d() {
        if (m30060e()) {
            this.f29892a.mo33949f();
            this.f29896e.onCameraIdle();
        }
    }

    /* renamed from: e */
    private boolean m30060e() {
        return (!this.f29894c.mo33962J() || !this.f29905n.mo32799b().mo32827o()) && (!this.f29894c.mo33964L() || !this.f29905n.mo32803f().mo32827o()) && ((!this.f29894c.mo33959G() || !this.f29905n.mo32801d().mo32827o()) && (!this.f29894c.mo33963K() || !this.f29905n.mo32802e().mo32827o()));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo33855b(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        if (motionEvent.getButtonState() != 0 && motionEvent.getButtonState() != 1) {
            return false;
        }
        if (motionEvent.getActionMasked() == 0) {
            mo33840a();
            this.f29892a.mo33942a(true);
        }
        boolean a = this.f29905n.mo32798a(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1) {
            this.f29892a.mo33942a(false);
            if (!this.f29909r.isEmpty()) {
                this.f29910s.removeCallbacksAndMessages(null);
                for (Animator start : this.f29909r) {
                    start.start();
                }
                this.f29909r.clear();
            }
        } else if (actionMasked == 3) {
            this.f29909r.clear();
            this.f29892a.mo33942a(false);
        }
        return a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo33856c(PointF pointF) {
        if (pointF == null && this.f29894c.mo34002m() != null) {
            pointF = this.f29894c.mo34002m();
        }
        this.f29904m = pointF;
    }

    /* renamed from: a */
    private void m30044a(Context context, boolean z) {
        if (z) {
            C11544h hVar = new C11544h(this, null);
            C11538d dVar = new C11538d(this, null);
            C11542f fVar = new C11542f(context.getResources().getDimension(C11454g.mapbox_minimum_scale_velocity));
            C11539e eVar = new C11539e(context.getResources().getDimension(C11454g.mapbox_minimum_scale_span_when_rotating), context.getResources().getDimension(C11454g.mapbox_minimum_angular_velocity), context.getResources().getDimension(C11296i.mapbox_defaultScaleSpanSinceStartThreshold));
            C11543g gVar = new C11543g(this, null);
            C11545i iVar = new C11545i(this, null);
            this.f29905n.mo32794a((StandardOnGestureListener) hVar);
            this.f29905n.mo32790a((OnMoveGestureListener) dVar);
            this.f29905n.mo32795a((StandardOnScaleGestureListener) fVar);
            this.f29905n.mo32792a((OnRotateGestureListener) eVar);
            this.f29905n.mo32793a((OnShoveGestureListener) gVar);
            this.f29905n.mo32791a((OnMultiFingerTapGestureListener) iVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m30055c() {
        if (m30060e()) {
            this.f29892a.mo33932a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo33857c(MoveGestureDetector moveGestureDetector) {
        Iterator it = this.f29900i.iterator();
        while (it.hasNext()) {
            ((OnMoveListener) it.next()).onMove(moveGestureDetector);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo33858c(RotateGestureDetector rotateGestureDetector) {
        Iterator it = this.f29901j.iterator();
        while (it.hasNext()) {
            ((OnRotateListener) it.next()).onRotate(rotateGestureDetector);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo33860c(StandardScaleGestureDetector standardScaleGestureDetector) {
        Iterator it = this.f29902k.iterator();
        while (it.hasNext()) {
            ((OnScaleListener) it.next()).onScale(standardScaleGestureDetector);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo33859c(ShoveGestureDetector shoveGestureDetector) {
        Iterator it = this.f29903l.iterator();
        while (it.hasNext()) {
            ((OnShoveListener) it.next()).onShove(shoveGestureDetector);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m30051b(Animator animator) {
        this.f29909r.add(animator);
        this.f29910s.removeCallbacksAndMessages(null);
        this.f29910s.postDelayed(this.f29911t, 150);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo33850b(PointF pointF, boolean z) {
        m30048a(false, pointF, z);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo33849b(PointF pointF) {
        Iterator it = this.f29898g.iterator();
        while (it.hasNext()) {
            if (((OnMapLongClickListener) it.next()).onMapLongClick(this.f29893b.mo33889a(pointF))) {
                return;
            }
        }
    }

    /* renamed from: a */
    private void m30045a(C11288a aVar, boolean z) {
        if (z) {
            HashSet hashSet = new HashSet();
            hashSet.add(Integer.valueOf(3));
            hashSet.add(Integer.valueOf(1));
            HashSet hashSet2 = new HashSet();
            hashSet2.add(Integer.valueOf(3));
            hashSet2.add(Integer.valueOf(2));
            HashSet hashSet3 = new HashSet();
            hashSet3.add(Integer.valueOf(1));
            hashSet3.add(Integer.valueOf(6));
            aVar.mo32797a((Set<Integer>[]) new Set[]{hashSet, hashSet2, hashSet3});
        }
        this.f29905n = aVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo33848b() {
        Iterator it = this.f29899h.iterator();
        while (it.hasNext()) {
            ((OnFlingListener) it.next()).onFling();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo33851b(MoveGestureDetector moveGestureDetector) {
        Iterator it = this.f29900i.iterator();
        while (it.hasNext()) {
            ((OnMoveListener) it.next()).onMoveEnd(moveGestureDetector);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo33852b(RotateGestureDetector rotateGestureDetector) {
        Iterator it = this.f29901j.iterator();
        while (it.hasNext()) {
            ((OnRotateListener) it.next()).onRotateEnd(rotateGestureDetector);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo33854b(StandardScaleGestureDetector standardScaleGestureDetector) {
        Iterator it = this.f29902k.iterator();
        while (it.hasNext()) {
            ((OnScaleListener) it.next()).onScaleEnd(standardScaleGestureDetector);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo33853b(ShoveGestureDetector shoveGestureDetector) {
        Iterator it = this.f29903l.iterator();
        while (it.hasNext()) {
            ((OnShoveListener) it.next()).onShoveEnd(shoveGestureDetector);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo33840a() {
        this.f29910s.removeCallbacksAndMessages(null);
        this.f29909r.clear();
        m30043a(this.f29907p);
        m30043a(this.f29908q);
        m30058d();
    }

    /* renamed from: a */
    private void m30043a(Animator animator) {
        if (animator != null && animator.isStarted()) {
            animator.cancel();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo33847a(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 2 || motionEvent.getActionMasked() != 8 || !this.f29894c.mo33964L()) {
            return false;
        }
        this.f29892a.mo33932a();
        this.f29892a.mo33945b((double) motionEvent.getAxisValue(9), new PointF(motionEvent.getX(), motionEvent.getY()));
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Animator m30039a(double d, double d2, PointF pointF, long j) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{(float) d, (float) (d + d2)});
        ofFloat.setDuration(j);
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.addUpdateListener(new C11536b(pointF));
        ofFloat.addListener(new C11537c());
        return ofFloat;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo33842a(PointF pointF, boolean z) {
        m30048a(true, pointF, z);
    }

    /* renamed from: a */
    private void m30048a(boolean z, PointF pointF, boolean z2) {
        m30043a(this.f29907p);
        this.f29907p = m30039a(this.f29892a.mo33947d(), z ? 1.0d : -1.0d, pointF, 300);
        if (z2) {
            this.f29907p.start();
        } else {
            m30051b(this.f29907p);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m30047a(String str, PointF pointF) {
        TelemetryDefinition d = C11451d.m29569d();
        if (d != null) {
            CameraPosition b = this.f29892a.mo33943b();
            if (b != null) {
                double d2 = b.zoom;
                if (m30049a(d2)) {
                    LatLng a = this.f29893b.mo33889a(pointF);
                    d.onGestureInteraction(str, a.mo33334a(), a.mo33336b(), d2);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo33841a(PointF pointF) {
        Iterator it = this.f29897f.iterator();
        while (it.hasNext()) {
            if (((OnMapClickListener) it.next()).onMapClick(this.f29893b.mo33889a(pointF))) {
                return;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo33843a(MoveGestureDetector moveGestureDetector) {
        Iterator it = this.f29900i.iterator();
        while (it.hasNext()) {
            ((OnMoveListener) it.next()).onMoveBegin(moveGestureDetector);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo33844a(RotateGestureDetector rotateGestureDetector) {
        Iterator it = this.f29901j.iterator();
        while (it.hasNext()) {
            ((OnRotateListener) it.next()).onRotateBegin(rotateGestureDetector);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo33846a(StandardScaleGestureDetector standardScaleGestureDetector) {
        Iterator it = this.f29902k.iterator();
        while (it.hasNext()) {
            ((OnScaleListener) it.next()).onScaleBegin(standardScaleGestureDetector);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo33845a(ShoveGestureDetector shoveGestureDetector) {
        Iterator it = this.f29903l.iterator();
        while (it.hasNext()) {
            ((OnShoveListener) it.next()).onShoveBegin(shoveGestureDetector);
        }
    }
}
