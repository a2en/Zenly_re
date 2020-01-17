package androidx.core.view;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Message;
import android.view.GestureDetector;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* renamed from: androidx.core.view.b */
public final class C0636b {

    /* renamed from: a */
    private final C0637a f2782a;

    /* renamed from: androidx.core.view.b$a */
    interface C0637a {
        /* renamed from: a */
        void mo3385a(boolean z);

        boolean onTouchEvent(MotionEvent motionEvent);
    }

    /* renamed from: androidx.core.view.b$b */
    static class C0638b implements C0637a {

        /* renamed from: v */
        private static final int f2783v = ViewConfiguration.getLongPressTimeout();

        /* renamed from: w */
        private static final int f2784w = ViewConfiguration.getTapTimeout();

        /* renamed from: x */
        private static final int f2785x = ViewConfiguration.getDoubleTapTimeout();

        /* renamed from: a */
        private int f2786a;

        /* renamed from: b */
        private int f2787b;

        /* renamed from: c */
        private int f2788c;

        /* renamed from: d */
        private int f2789d;

        /* renamed from: e */
        private final Handler f2790e;

        /* renamed from: f */
        final OnGestureListener f2791f;

        /* renamed from: g */
        OnDoubleTapListener f2792g;

        /* renamed from: h */
        boolean f2793h;

        /* renamed from: i */
        boolean f2794i;

        /* renamed from: j */
        private boolean f2795j;

        /* renamed from: k */
        private boolean f2796k;

        /* renamed from: l */
        private boolean f2797l;

        /* renamed from: m */
        MotionEvent f2798m;

        /* renamed from: n */
        private MotionEvent f2799n;

        /* renamed from: o */
        private boolean f2800o;

        /* renamed from: p */
        private float f2801p;

        /* renamed from: q */
        private float f2802q;

        /* renamed from: r */
        private float f2803r;

        /* renamed from: s */
        private float f2804s;

        /* renamed from: t */
        private boolean f2805t;

        /* renamed from: u */
        private VelocityTracker f2806u;

        /* renamed from: androidx.core.view.b$b$a */
        private class C0639a extends Handler {
            C0639a() {
            }

            public void handleMessage(Message message) {
                int i = message.what;
                if (i == 1) {
                    C0638b bVar = C0638b.this;
                    bVar.f2791f.onShowPress(bVar.f2798m);
                } else if (i == 2) {
                    C0638b.this.mo3387a();
                } else if (i == 3) {
                    C0638b bVar2 = C0638b.this;
                    OnDoubleTapListener onDoubleTapListener = bVar2.f2792g;
                    if (onDoubleTapListener == null) {
                        return;
                    }
                    if (!bVar2.f2793h) {
                        onDoubleTapListener.onSingleTapConfirmed(bVar2.f2798m);
                    } else {
                        bVar2.f2794i = true;
                    }
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unknown message ");
                    sb.append(message);
                    throw new RuntimeException(sb.toString());
                }
            }

            C0639a(Handler handler) {
                super(handler.getLooper());
            }
        }

        C0638b(Context context, OnGestureListener onGestureListener, Handler handler) {
            if (handler != null) {
                this.f2790e = new C0639a(handler);
            } else {
                this.f2790e = new C0639a();
            }
            this.f2791f = onGestureListener;
            if (onGestureListener instanceof OnDoubleTapListener) {
                mo3388a((OnDoubleTapListener) onGestureListener);
            }
            m2994a(context);
        }

        /* renamed from: a */
        private void m2994a(Context context) {
            if (context == null) {
                throw new IllegalArgumentException("Context must not be null");
            } else if (this.f2791f != null) {
                this.f2805t = true;
                ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
                int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
                int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
                this.f2788c = viewConfiguration.getScaledMinimumFlingVelocity();
                this.f2789d = viewConfiguration.getScaledMaximumFlingVelocity();
                this.f2786a = scaledTouchSlop * scaledTouchSlop;
                this.f2787b = scaledDoubleTapSlop * scaledDoubleTapSlop;
            } else {
                throw new IllegalArgumentException("OnGestureListener must not be null");
            }
        }

        /* renamed from: b */
        private void m2996b() {
            this.f2790e.removeMessages(1);
            this.f2790e.removeMessages(2);
            this.f2790e.removeMessages(3);
            this.f2806u.recycle();
            this.f2806u = null;
            this.f2800o = false;
            this.f2793h = false;
            this.f2796k = false;
            this.f2797l = false;
            this.f2794i = false;
            if (this.f2795j) {
                this.f2795j = false;
            }
        }

        /* renamed from: c */
        private void m2997c() {
            this.f2790e.removeMessages(1);
            this.f2790e.removeMessages(2);
            this.f2790e.removeMessages(3);
            this.f2800o = false;
            this.f2796k = false;
            this.f2797l = false;
            this.f2794i = false;
            if (this.f2795j) {
                this.f2795j = false;
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:100:0x0208  */
        /* JADX WARNING: Removed duplicated region for block: B:103:0x021f  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTouchEvent(android.view.MotionEvent r13) {
            /*
                r12 = this;
                int r0 = r13.getAction()
                android.view.VelocityTracker r1 = r12.f2806u
                if (r1 != 0) goto L_0x000e
                android.view.VelocityTracker r1 = android.view.VelocityTracker.obtain()
                r12.f2806u = r1
            L_0x000e:
                android.view.VelocityTracker r1 = r12.f2806u
                r1.addMovement(r13)
                r0 = r0 & 255(0xff, float:3.57E-43)
                r1 = 6
                r2 = 1
                r3 = 0
                if (r0 != r1) goto L_0x001c
                r4 = 1
                goto L_0x001d
            L_0x001c:
                r4 = 0
            L_0x001d:
                if (r4 == 0) goto L_0x0024
                int r5 = r13.getActionIndex()
                goto L_0x0025
            L_0x0024:
                r5 = -1
            L_0x0025:
                int r6 = r13.getPointerCount()
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
            L_0x002d:
                if (r8 >= r6) goto L_0x003f
                if (r5 != r8) goto L_0x0032
                goto L_0x003c
            L_0x0032:
                float r11 = r13.getX(r8)
                float r9 = r9 + r11
                float r11 = r13.getY(r8)
                float r10 = r10 + r11
            L_0x003c:
                int r8 = r8 + 1
                goto L_0x002d
            L_0x003f:
                if (r4 == 0) goto L_0x0044
                int r4 = r6 + -1
                goto L_0x0045
            L_0x0044:
                r4 = r6
            L_0x0045:
                float r4 = (float) r4
                float r9 = r9 / r4
                float r10 = r10 / r4
                r4 = 2
                r5 = 3
                if (r0 == 0) goto L_0x01bf
                r8 = 1000(0x3e8, float:1.401E-42)
                if (r0 == r2) goto L_0x0131
                if (r0 == r4) goto L_0x00ba
                if (r0 == r5) goto L_0x00b5
                r2 = 5
                if (r0 == r2) goto L_0x00a8
                if (r0 == r1) goto L_0x005b
                goto L_0x024e
            L_0x005b:
                r12.f2801p = r9
                r12.f2803r = r9
                r12.f2802q = r10
                r12.f2804s = r10
                android.view.VelocityTracker r0 = r12.f2806u
                int r1 = r12.f2789d
                float r1 = (float) r1
                r0.computeCurrentVelocity(r8, r1)
                int r0 = r13.getActionIndex()
                int r1 = r13.getPointerId(r0)
                android.view.VelocityTracker r2 = r12.f2806u
                float r2 = r2.getXVelocity(r1)
                android.view.VelocityTracker r4 = r12.f2806u
                float r1 = r4.getYVelocity(r1)
                r4 = 0
            L_0x0080:
                if (r4 >= r6) goto L_0x024e
                if (r4 != r0) goto L_0x0085
                goto L_0x00a5
            L_0x0085:
                int r5 = r13.getPointerId(r4)
                android.view.VelocityTracker r8 = r12.f2806u
                float r8 = r8.getXVelocity(r5)
                float r8 = r8 * r2
                android.view.VelocityTracker r9 = r12.f2806u
                float r5 = r9.getYVelocity(r5)
                float r5 = r5 * r1
                float r8 = r8 + r5
                int r5 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
                if (r5 >= 0) goto L_0x00a5
                android.view.VelocityTracker r13 = r12.f2806u
                r13.clear()
                goto L_0x024e
            L_0x00a5:
                int r4 = r4 + 1
                goto L_0x0080
            L_0x00a8:
                r12.f2801p = r9
                r12.f2803r = r9
                r12.f2802q = r10
                r12.f2804s = r10
                r12.m2997c()
                goto L_0x024e
            L_0x00b5:
                r12.m2996b()
                goto L_0x024e
            L_0x00ba:
                boolean r0 = r12.f2795j
                if (r0 == 0) goto L_0x00c0
                goto L_0x024e
            L_0x00c0:
                float r0 = r12.f2801p
                float r0 = r0 - r9
                float r1 = r12.f2802q
                float r1 = r1 - r10
                boolean r6 = r12.f2800o
                if (r6 == 0) goto L_0x00d3
                android.view.GestureDetector$OnDoubleTapListener r0 = r12.f2792g
                boolean r13 = r0.onDoubleTapEvent(r13)
                r3 = r3 | r13
                goto L_0x024e
            L_0x00d3:
                boolean r6 = r12.f2796k
                if (r6 == 0) goto L_0x0111
                float r6 = r12.f2803r
                float r6 = r9 - r6
                int r6 = (int) r6
                float r7 = r12.f2804s
                float r7 = r10 - r7
                int r7 = (int) r7
                int r6 = r6 * r6
                int r7 = r7 * r7
                int r6 = r6 + r7
                int r7 = r12.f2786a
                if (r6 <= r7) goto L_0x0108
                android.view.GestureDetector$OnGestureListener r7 = r12.f2791f
                android.view.MotionEvent r8 = r12.f2798m
                boolean r13 = r7.onScroll(r8, r13, r0, r1)
                r12.f2801p = r9
                r12.f2802q = r10
                r12.f2796k = r3
                android.os.Handler r0 = r12.f2790e
                r0.removeMessages(r5)
                android.os.Handler r0 = r12.f2790e
                r0.removeMessages(r2)
                android.os.Handler r0 = r12.f2790e
                r0.removeMessages(r4)
                goto L_0x0109
            L_0x0108:
                r13 = 0
            L_0x0109:
                int r0 = r12.f2786a
                if (r6 <= r0) goto L_0x01bc
                r12.f2797l = r3
                goto L_0x01bc
            L_0x0111:
                float r2 = java.lang.Math.abs(r0)
                r4 = 1065353216(0x3f800000, float:1.0)
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 >= 0) goto L_0x0123
                float r2 = java.lang.Math.abs(r1)
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 < 0) goto L_0x024e
            L_0x0123:
                android.view.GestureDetector$OnGestureListener r2 = r12.f2791f
                android.view.MotionEvent r3 = r12.f2798m
                boolean r3 = r2.onScroll(r3, r13, r0, r1)
                r12.f2801p = r9
                r12.f2802q = r10
                goto L_0x024e
            L_0x0131:
                r12.f2793h = r3
                android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r13)
                boolean r1 = r12.f2800o
                if (r1 == 0) goto L_0x0143
                android.view.GestureDetector$OnDoubleTapListener r1 = r12.f2792g
                boolean r13 = r1.onDoubleTapEvent(r13)
                r13 = r13 | r3
                goto L_0x019b
            L_0x0143:
                boolean r1 = r12.f2795j
                if (r1 == 0) goto L_0x014f
                android.os.Handler r13 = r12.f2790e
                r13.removeMessages(r5)
                r12.f2795j = r3
                goto L_0x0191
            L_0x014f:
                boolean r1 = r12.f2796k
                if (r1 == 0) goto L_0x0166
                android.view.GestureDetector$OnGestureListener r1 = r12.f2791f
                boolean r1 = r1.onSingleTapUp(r13)
                boolean r5 = r12.f2794i
                if (r5 == 0) goto L_0x0164
                android.view.GestureDetector$OnDoubleTapListener r5 = r12.f2792g
                if (r5 == 0) goto L_0x0164
                r5.onSingleTapConfirmed(r13)
            L_0x0164:
                r13 = r1
                goto L_0x019b
            L_0x0166:
                android.view.VelocityTracker r1 = r12.f2806u
                int r5 = r13.getPointerId(r3)
                int r6 = r12.f2789d
                float r6 = (float) r6
                r1.computeCurrentVelocity(r8, r6)
                float r6 = r1.getYVelocity(r5)
                float r1 = r1.getXVelocity(r5)
                float r5 = java.lang.Math.abs(r6)
                int r7 = r12.f2788c
                float r7 = (float) r7
                int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r5 > 0) goto L_0x0193
                float r5 = java.lang.Math.abs(r1)
                int r7 = r12.f2788c
                float r7 = (float) r7
                int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r5 <= 0) goto L_0x0191
                goto L_0x0193
            L_0x0191:
                r13 = 0
                goto L_0x019b
            L_0x0193:
                android.view.GestureDetector$OnGestureListener r5 = r12.f2791f
                android.view.MotionEvent r7 = r12.f2798m
                boolean r13 = r5.onFling(r7, r13, r1, r6)
            L_0x019b:
                android.view.MotionEvent r1 = r12.f2799n
                if (r1 == 0) goto L_0x01a2
                r1.recycle()
            L_0x01a2:
                r12.f2799n = r0
                android.view.VelocityTracker r0 = r12.f2806u
                if (r0 == 0) goto L_0x01ae
                r0.recycle()
                r0 = 0
                r12.f2806u = r0
            L_0x01ae:
                r12.f2800o = r3
                r12.f2794i = r3
                android.os.Handler r0 = r12.f2790e
                r0.removeMessages(r2)
                android.os.Handler r0 = r12.f2790e
                r0.removeMessages(r4)
            L_0x01bc:
                r3 = r13
                goto L_0x024e
            L_0x01bf:
                android.view.GestureDetector$OnDoubleTapListener r0 = r12.f2792g
                if (r0 == 0) goto L_0x01fb
                android.os.Handler r0 = r12.f2790e
                boolean r0 = r0.hasMessages(r5)
                if (r0 == 0) goto L_0x01d0
                android.os.Handler r1 = r12.f2790e
                r1.removeMessages(r5)
            L_0x01d0:
                android.view.MotionEvent r1 = r12.f2798m
                if (r1 == 0) goto L_0x01f3
                android.view.MotionEvent r6 = r12.f2799n
                if (r6 == 0) goto L_0x01f3
                if (r0 == 0) goto L_0x01f3
                boolean r0 = r12.m2995a(r1, r6, r13)
                if (r0 == 0) goto L_0x01f3
                r12.f2800o = r2
                android.view.GestureDetector$OnDoubleTapListener r0 = r12.f2792g
                android.view.MotionEvent r1 = r12.f2798m
                boolean r0 = r0.onDoubleTap(r1)
                r0 = r0 | r3
                android.view.GestureDetector$OnDoubleTapListener r1 = r12.f2792g
                boolean r1 = r1.onDoubleTapEvent(r13)
                r0 = r0 | r1
                goto L_0x01fc
            L_0x01f3:
                android.os.Handler r0 = r12.f2790e
                int r1 = f2785x
                long r6 = (long) r1
                r0.sendEmptyMessageDelayed(r5, r6)
            L_0x01fb:
                r0 = 0
            L_0x01fc:
                r12.f2801p = r9
                r12.f2803r = r9
                r12.f2802q = r10
                r12.f2804s = r10
                android.view.MotionEvent r1 = r12.f2798m
                if (r1 == 0) goto L_0x020b
                r1.recycle()
            L_0x020b:
                android.view.MotionEvent r1 = android.view.MotionEvent.obtain(r13)
                r12.f2798m = r1
                r12.f2796k = r2
                r12.f2797l = r2
                r12.f2793h = r2
                r12.f2795j = r3
                r12.f2794i = r3
                boolean r1 = r12.f2805t
                if (r1 == 0) goto L_0x0237
                android.os.Handler r1 = r12.f2790e
                r1.removeMessages(r4)
                android.os.Handler r1 = r12.f2790e
                android.view.MotionEvent r3 = r12.f2798m
                long r5 = r3.getDownTime()
                int r3 = f2784w
                long r7 = (long) r3
                long r5 = r5 + r7
                int r3 = f2783v
                long r7 = (long) r3
                long r5 = r5 + r7
                r1.sendEmptyMessageAtTime(r4, r5)
            L_0x0237:
                android.os.Handler r1 = r12.f2790e
                android.view.MotionEvent r3 = r12.f2798m
                long r3 = r3.getDownTime()
                int r5 = f2784w
                long r5 = (long) r5
                long r3 = r3 + r5
                r1.sendEmptyMessageAtTime(r2, r3)
                android.view.GestureDetector$OnGestureListener r1 = r12.f2791f
                boolean r13 = r1.onDown(r13)
                r3 = r0 | r13
            L_0x024e:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.C0636b.C0638b.onTouchEvent(android.view.MotionEvent):boolean");
        }

        /* renamed from: a */
        public void mo3388a(OnDoubleTapListener onDoubleTapListener) {
            this.f2792g = onDoubleTapListener;
        }

        /* renamed from: a */
        public void mo3385a(boolean z) {
            this.f2805t = z;
        }

        /* renamed from: a */
        private boolean m2995a(MotionEvent motionEvent, MotionEvent motionEvent2, MotionEvent motionEvent3) {
            boolean z = false;
            if (!this.f2797l || motionEvent3.getEventTime() - motionEvent2.getEventTime() > ((long) f2785x)) {
                return false;
            }
            int x = ((int) motionEvent.getX()) - ((int) motionEvent3.getX());
            int y = ((int) motionEvent.getY()) - ((int) motionEvent3.getY());
            if ((x * x) + (y * y) < this.f2787b) {
                z = true;
            }
            return z;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo3387a() {
            this.f2790e.removeMessages(3);
            this.f2794i = false;
            this.f2795j = true;
            this.f2791f.onLongPress(this.f2798m);
        }
    }

    /* renamed from: androidx.core.view.b$c */
    static class C0640c implements C0637a {

        /* renamed from: a */
        private final GestureDetector f2808a;

        C0640c(Context context, OnGestureListener onGestureListener, Handler handler) {
            this.f2808a = new GestureDetector(context, onGestureListener, handler);
        }

        /* renamed from: a */
        public void mo3385a(boolean z) {
            this.f2808a.setIsLongpressEnabled(z);
        }

        public boolean onTouchEvent(MotionEvent motionEvent) {
            return this.f2808a.onTouchEvent(motionEvent);
        }
    }

    public C0636b(Context context, OnGestureListener onGestureListener) {
        this(context, onGestureListener, null);
    }

    /* renamed from: a */
    public boolean mo3384a(MotionEvent motionEvent) {
        return this.f2782a.onTouchEvent(motionEvent);
    }

    public C0636b(Context context, OnGestureListener onGestureListener, Handler handler) {
        if (VERSION.SDK_INT > 17) {
            this.f2782a = new C0640c(context, onGestureListener, handler);
        } else {
            this.f2782a = new C0638b(context, onGestureListener, handler);
        }
    }

    /* renamed from: a */
    public void mo3383a(boolean z) {
        this.f2782a.mo3385a(z);
    }
}
