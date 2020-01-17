package androidx.dynamicanimation.animation;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.dynamicanimation.animation.DynamicAnimation;
import java.util.ArrayList;

public abstract class DynamicAnimation<T extends DynamicAnimation<T>> implements C0719b {

    /* renamed from: m */
    public static final C0716q f2980m = new C0707h("translationY");

    /* renamed from: n */
    public static final C0716q f2981n = new C0709j("scaleX");

    /* renamed from: o */
    public static final C0716q f2982o = new C0710k("scaleY");

    /* renamed from: p */
    public static final C0716q f2983p = new C0711l("rotation");

    /* renamed from: q */
    public static final C0716q f2984q = new C0712m("rotationX");

    /* renamed from: r */
    public static final C0716q f2985r = new C0713n("rotationY");

    /* renamed from: s */
    public static final C0716q f2986s = new C0702c("alpha");

    /* renamed from: a */
    float f2987a;

    /* renamed from: b */
    float f2988b;

    /* renamed from: c */
    boolean f2989c;

    /* renamed from: d */
    final Object f2990d;

    /* renamed from: e */
    final C0727c f2991e;

    /* renamed from: f */
    boolean f2992f;

    /* renamed from: g */
    float f2993g;

    /* renamed from: h */
    float f2994h;

    /* renamed from: i */
    private long f2995i;

    /* renamed from: j */
    private float f2996j;

    /* renamed from: k */
    private final ArrayList<OnAnimationEndListener> f2997k;

    /* renamed from: l */
    private final ArrayList<OnAnimationUpdateListener> f2998l;

    public interface OnAnimationEndListener {
        void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z, float f, float f2);
    }

    public interface OnAnimationUpdateListener {
        void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f, float f2);
    }

    /* renamed from: androidx.dynamicanimation.animation.DynamicAnimation$a */
    static class C0700a extends C0716q {
        C0700a(String str) {
            super(str, null);
        }

        /* renamed from: a */
        public void mo3631a(View view, float f) {
            view.setY(f);
        }

        /* renamed from: a */
        public float mo3629a(View view) {
            return view.getY();
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.DynamicAnimation$b */
    static class C0701b extends C0716q {
        C0701b(String str) {
            super(str, null);
        }

        /* renamed from: a */
        public void mo3631a(View view, float f) {
            ViewCompat.m2845d(view, f);
        }

        /* renamed from: a */
        public float mo3629a(View view) {
            return ViewCompat.m2870w(view);
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.DynamicAnimation$c */
    static class C0702c extends C0716q {
        C0702c(String str) {
            super(str, null);
        }

        /* renamed from: a */
        public void mo3631a(View view, float f) {
            view.setAlpha(f);
        }

        /* renamed from: a */
        public float mo3629a(View view) {
            return view.getAlpha();
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.DynamicAnimation$d */
    static class C0703d extends C0716q {
        C0703d(String str) {
            super(str, null);
        }

        /* renamed from: a */
        public void mo3631a(View view, float f) {
            view.setScrollX((int) f);
        }

        /* renamed from: a */
        public float mo3629a(View view) {
            return (float) view.getScrollX();
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.DynamicAnimation$e */
    static class C0704e extends C0716q {
        C0704e(String str) {
            super(str, null);
        }

        /* renamed from: a */
        public void mo3631a(View view, float f) {
            view.setScrollY((int) f);
        }

        /* renamed from: a */
        public float mo3629a(View view) {
            return (float) view.getScrollY();
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.DynamicAnimation$f */
    class C0705f extends C0727c {

        /* renamed from: a */
        final /* synthetic */ C0728d f2999a;

        C0705f(DynamicAnimation dynamicAnimation, String str, C0728d dVar) {
            this.f2999a = dVar;
            super(str);
        }

        /* renamed from: a */
        public float mo3629a(Object obj) {
            return this.f2999a.mo3670a();
        }

        /* renamed from: a */
        public void mo3631a(Object obj, float f) {
            this.f2999a.mo3671a(f);
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.DynamicAnimation$g */
    static class C0706g extends C0716q {
        C0706g(String str) {
            super(str, null);
        }

        /* renamed from: a */
        public void mo3631a(View view, float f) {
            view.setTranslationX(f);
        }

        /* renamed from: a */
        public float mo3629a(View view) {
            return view.getTranslationX();
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.DynamicAnimation$h */
    static class C0707h extends C0716q {
        C0707h(String str) {
            super(str, null);
        }

        /* renamed from: a */
        public void mo3631a(View view, float f) {
            view.setTranslationY(f);
        }

        /* renamed from: a */
        public float mo3629a(View view) {
            return view.getTranslationY();
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.DynamicAnimation$i */
    static class C0708i extends C0716q {
        C0708i(String str) {
            super(str, null);
        }

        /* renamed from: a */
        public void mo3631a(View view, float f) {
            ViewCompat.m2841c(view, f);
        }

        /* renamed from: a */
        public float mo3629a(View view) {
            return ViewCompat.m2868u(view);
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.DynamicAnimation$j */
    static class C0709j extends C0716q {
        C0709j(String str) {
            super(str, null);
        }

        /* renamed from: a */
        public void mo3631a(View view, float f) {
            view.setScaleX(f);
        }

        /* renamed from: a */
        public float mo3629a(View view) {
            return view.getScaleX();
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.DynamicAnimation$k */
    static class C0710k extends C0716q {
        C0710k(String str) {
            super(str, null);
        }

        /* renamed from: a */
        public void mo3631a(View view, float f) {
            view.setScaleY(f);
        }

        /* renamed from: a */
        public float mo3629a(View view) {
            return view.getScaleY();
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.DynamicAnimation$l */
    static class C0711l extends C0716q {
        C0711l(String str) {
            super(str, null);
        }

        /* renamed from: a */
        public void mo3631a(View view, float f) {
            view.setRotation(f);
        }

        /* renamed from: a */
        public float mo3629a(View view) {
            return view.getRotation();
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.DynamicAnimation$m */
    static class C0712m extends C0716q {
        C0712m(String str) {
            super(str, null);
        }

        /* renamed from: a */
        public void mo3631a(View view, float f) {
            view.setRotationX(f);
        }

        /* renamed from: a */
        public float mo3629a(View view) {
            return view.getRotationX();
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.DynamicAnimation$n */
    static class C0713n extends C0716q {
        C0713n(String str) {
            super(str, null);
        }

        /* renamed from: a */
        public void mo3631a(View view, float f) {
            view.setRotationY(f);
        }

        /* renamed from: a */
        public float mo3629a(View view) {
            return view.getRotationY();
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.DynamicAnimation$o */
    static class C0714o extends C0716q {
        C0714o(String str) {
            super(str, null);
        }

        /* renamed from: a */
        public void mo3631a(View view, float f) {
            view.setX(f);
        }

        /* renamed from: a */
        public float mo3629a(View view) {
            return view.getX();
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.DynamicAnimation$p */
    static class C0715p {

        /* renamed from: a */
        float f3000a;

        /* renamed from: b */
        float f3001b;

        C0715p() {
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.DynamicAnimation$q */
    public static abstract class C0716q extends C0727c<View> {
        /* synthetic */ C0716q(String str, C0706g gVar) {
            this(str);
        }

        private C0716q(String str) {
            super(str);
        }
    }

    static {
        new C0706g("translationX");
        new C0708i("translationZ");
        new C0714o("x");
        new C0700a("y");
        new C0701b("z");
        new C0703d("scrollX");
        new C0704e("scrollY");
    }

    DynamicAnimation(C0728d dVar) {
        this.f2987a = 0.0f;
        this.f2988b = Float.MAX_VALUE;
        this.f2989c = false;
        this.f2992f = false;
        this.f2993g = Float.MAX_VALUE;
        this.f2994h = -this.f2993g;
        this.f2995i = 0;
        this.f2997k = new ArrayList<>();
        this.f2998l = new ArrayList<>();
        this.f2990d = null;
        this.f2991e = new C0705f(this, "FloatValueHolder", dVar);
        this.f2996j = 1.0f;
    }

    /* renamed from: f */
    private void mo3675f() {
        if (!this.f2992f) {
            this.f2992f = true;
            if (!this.f2989c) {
                this.f2988b = mo3674e();
            }
            float f = this.f2988b;
            if (f > this.f2993g || f < this.f2994h) {
                throw new IllegalArgumentException("Starting value need to be in between min value and max value");
            }
            C0717a.m3392c().mo3661a(this, 0);
        }
    }

    /* renamed from: a */
    public T mo3612a(float f) {
        this.f2993g = f;
        return this;
    }

    /* renamed from: b */
    public T mo3618b(float f) {
        this.f2994h = f;
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public abstract boolean mo3619b(long j);

    /* renamed from: c */
    public T mo3620c(float f) {
        if (f > 0.0f) {
            this.f2996j = f;
            mo3625f(f * 0.75f);
            return this;
        }
        throw new IllegalArgumentException("Minimum visible change must be positive.");
    }

    /* renamed from: d */
    public void mo3622d() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        } else if (!this.f2992f) {
            mo3675f();
        }
    }

    /* renamed from: e */
    public T mo3624e(float f) {
        this.f2988b = f;
        this.f2989c = true;
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public abstract void mo3625f(float f);

    /* renamed from: a */
    public T mo3613a(OnAnimationEndListener onAnimationEndListener) {
        if (!this.f2997k.contains(onAnimationEndListener)) {
            this.f2997k.add(onAnimationEndListener);
        }
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public float mo3617b() {
        return this.f2996j * 0.75f;
    }

    /* renamed from: e */
    private float mo3674e() {
        return this.f2991e.mo3629a(this.f2990d);
    }

    /* renamed from: a */
    public T mo3614a(OnAnimationUpdateListener onAnimationUpdateListener) {
        if (!mo3621c()) {
            if (!this.f2998l.contains(onAnimationUpdateListener)) {
                this.f2998l.add(onAnimationUpdateListener);
            }
            return this;
        }
        throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
    }

    /* renamed from: c */
    public boolean mo3621c() {
        return this.f2992f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo3623d(float f) {
        this.f2991e.mo3631a(this.f2990d, f);
        for (int i = 0; i < this.f2998l.size(); i++) {
            if (this.f2998l.get(i) != null) {
                ((OnAnimationUpdateListener) this.f2998l.get(i)).onAnimationUpdate(this, this.f2988b, this.f2987a);
            }
        }
        m3314a(this.f2998l);
    }

    /* renamed from: a */
    private static <T> void m3314a(ArrayList<T> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    /* renamed from: a */
    public void mo3615a() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be canceled on the main thread");
        } else if (this.f2992f) {
            m3315a(true);
        }
    }

    <K> DynamicAnimation(K k, C0727c<K> cVar) {
        this.f2987a = 0.0f;
        this.f2988b = Float.MAX_VALUE;
        this.f2989c = false;
        this.f2992f = false;
        this.f2993g = Float.MAX_VALUE;
        this.f2994h = -this.f2993g;
        this.f2995i = 0;
        this.f2997k = new ArrayList<>();
        this.f2998l = new ArrayList<>();
        this.f2990d = k;
        this.f2991e = cVar;
        C0727c cVar2 = this.f2991e;
        if (cVar2 == f2983p || cVar2 == f2984q || cVar2 == f2985r) {
            this.f2996j = 0.1f;
        } else if (cVar2 == f2986s) {
            this.f2996j = 0.00390625f;
        } else if (cVar2 == f2981n || cVar2 == f2982o) {
            this.f2996j = 0.00390625f;
        } else {
            this.f2996j = 1.0f;
        }
    }

    /* renamed from: a */
    public boolean mo3616a(long j) {
        long j2 = this.f2995i;
        if (j2 == 0) {
            this.f2995i = j;
            mo3623d(this.f2988b);
            return false;
        }
        long j3 = j - j2;
        this.f2995i = j;
        boolean b = mo3619b(j3);
        this.f2988b = Math.min(this.f2988b, this.f2993g);
        this.f2988b = Math.max(this.f2988b, this.f2994h);
        mo3623d(this.f2988b);
        if (b) {
            m3315a(false);
        }
        return b;
    }

    /* renamed from: a */
    private void m3315a(boolean z) {
        this.f2992f = false;
        C0717a.m3392c().mo3660a((C0719b) this);
        this.f2995i = 0;
        this.f2989c = false;
        for (int i = 0; i < this.f2997k.size(); i++) {
            if (this.f2997k.get(i) != null) {
                ((OnAnimationEndListener) this.f2997k.get(i)).onAnimationEnd(this, z, this.f2988b, this.f2987a);
            }
        }
        m3314a(this.f2997k);
    }
}
