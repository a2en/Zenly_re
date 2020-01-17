package app.zenly.locator.map.view;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import app.zenly.android.base.view.C1309a;
import app.zenly.locator.C3892m;
import app.zenly.locator.R;
import app.zenly.locator.core.util.C3200e0;
import app.zenly.locator.map.p111j1.C4079a;
import app.zenly.locator.p143s.p146j.C5432b;
import java.util.Objects;
import p250f.p251a.p252a.p253a.p254d.C7657c;

public class HeaderView extends ConstraintLayout {

    /* renamed from: A */
    private C4079a f11695A = null;

    /* renamed from: B */
    private MainLabelAnimator f11696B;

    /* renamed from: C */
    private C4366b f11697C;

    /* renamed from: D */
    private TextView f11698D;

    /* renamed from: E */
    private TextView f11699E;

    /* renamed from: F */
    private boolean f11700F;

    /* renamed from: G */
    private int f11701G;

    /* renamed from: H */
    private int f11702H;

    /* renamed from: I */
    private int f11703I;

    /* renamed from: J */
    private int f11704J;

    /* renamed from: K */
    private int f11705K;

    /* renamed from: L */
    private int f11706L;

    /* renamed from: M */
    private boolean f11707M;

    /* renamed from: N */
    private float f11708N;

    /* renamed from: z */
    private C4079a f11709z = new C4079a();

    private static class MainLabelAnimator {

        /* renamed from: a */
        private final ValueAnimator f11710a = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final ValueAnimator f11711b = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});

        /* renamed from: c */
        private final ValueAnimator f11712c = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final ObjectAnimator f11713d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public final TextView f11714e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public final TextView f11715f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public final Callback f11716g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public String f11717h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public String f11718i;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public ValueAnimator f11719j;

        /* renamed from: k */
        private final C5432b f11720k;

        /* renamed from: l */
        private final AnimatorUpdateListener f11721l;

        /* renamed from: m */
        private final AnimatorUpdateListener f11722m;

        /* renamed from: n */
        private final AnimatorUpdateListener f11723n;

        public interface Callback {
            void onAnimationComplete();
        }

        /* renamed from: app.zenly.locator.map.view.HeaderView$MainLabelAnimator$a */
        class C4360a extends C5432b {
            C4360a() {
            }

            /* renamed from: a */
            private void m12976a(TextView textView, String str) {
                textView.setText(str);
                textView.setVisibility(TextUtils.isEmpty(str) ? 8 : 0);
            }

            public void onAnimationStart(Animator animator) {
                super.onAnimationStart(animator);
                if (animator == MainLabelAnimator.this.f11711b) {
                    m12976a(MainLabelAnimator.this.f11714e, MainLabelAnimator.this.f11717h);
                    m12976a(MainLabelAnimator.this.f11715f, MainLabelAnimator.this.f11718i);
                } else {
                    m12976a(MainLabelAnimator.this.f11714e, MainLabelAnimator.this.f11718i);
                    m12976a(MainLabelAnimator.this.f11715f, MainLabelAnimator.this.f11717h);
                }
                if (animator == MainLabelAnimator.this.f11713d) {
                    MainLabelAnimator.this.f11714e.setVisibility(8);
                }
            }

            /* renamed from: a */
            public void mo7336a(Animator animator, boolean z) {
                if (!z) {
                    MainLabelAnimator.this.f11719j = null;
                    MainLabelAnimator.this.f11718i = "";
                    int i = 8;
                    MainLabelAnimator.this.f11714e.setVisibility(8);
                    MainLabelAnimator.this.f11714e.setScaleX(1.0f);
                    MainLabelAnimator.this.f11714e.setScaleY(1.0f);
                    MainLabelAnimator.this.f11714e.setAlpha(1.0f);
                    MainLabelAnimator.this.f11715f.setText(MainLabelAnimator.this.f11717h);
                    MainLabelAnimator.this.f11715f.setScaleX(1.0f);
                    MainLabelAnimator.this.f11715f.setScaleY(1.0f);
                    MainLabelAnimator.this.f11715f.setAlpha(1.0f);
                    TextView d = MainLabelAnimator.this.f11715f;
                    if (!TextUtils.isEmpty(MainLabelAnimator.this.f11717h)) {
                        i = 0;
                    }
                    d.setVisibility(i);
                    MainLabelAnimator.this.f11716g.onAnimationComplete();
                }
            }
        }

        /* renamed from: app.zenly.locator.map.view.HeaderView$MainLabelAnimator$b */
        class C4361b implements AnimatorUpdateListener {
            C4361b() {
            }

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                MainLabelAnimator.this.f11714e.setAlpha(1.0f - floatValue);
                MainLabelAnimator.this.f11715f.setAlpha(floatValue);
            }
        }

        /* renamed from: app.zenly.locator.map.view.HeaderView$MainLabelAnimator$c */
        class C4362c implements AnimatorUpdateListener {
            C4362c() {
            }

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                MainLabelAnimator.this.f11714e.setScaleX(floatValue);
                MainLabelAnimator.this.f11714e.setScaleY(floatValue);
                MainLabelAnimator.this.f11714e.setAlpha(floatValue);
                float f = floatValue + 1.0f;
                MainLabelAnimator.this.f11715f.setScaleX(f);
                MainLabelAnimator.this.f11715f.setScaleY(f);
                MainLabelAnimator.this.f11715f.setAlpha(1.0f - floatValue);
            }
        }

        /* renamed from: app.zenly.locator.map.view.HeaderView$MainLabelAnimator$d */
        class C4363d implements AnimatorUpdateListener {
            C4363d() {
            }

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f = 1.0f - floatValue;
                MainLabelAnimator.this.f11714e.setScaleX(f);
                MainLabelAnimator.this.f11714e.setScaleY(f);
                MainLabelAnimator.this.f11714e.setAlpha(f);
                float f2 = 2.0f - floatValue;
                MainLabelAnimator.this.f11715f.setScaleX(f2);
                MainLabelAnimator.this.f11715f.setScaleY(f2);
                MainLabelAnimator.this.f11715f.setAlpha(floatValue);
            }
        }

        /* renamed from: app.zenly.locator.map.view.HeaderView$MainLabelAnimator$e */
        enum C4364e {
            ALPHA,
            ZOOM_IN,
            ZOOM_OUT,
            OVERSHOOT
        }

        public MainLabelAnimator(TextView textView, TextView textView2, Callback callback) {
            String str = "";
            this.f11717h = str;
            this.f11718i = str;
            this.f11720k = new C4360a();
            this.f11721l = new C4361b();
            this.f11722m = new C4362c();
            this.f11723n = new C4363d();
            this.f11714e = textView;
            this.f11715f = textView2;
            this.f11716g = callback;
            this.f11713d = ObjectAnimator.ofFloat(this.f11715f, C1309a.f4895a, new float[]{0.0f, 1.0f});
            this.f11713d.setInterpolator(C7657c.m18650f());
            this.f11710a.addListener(this.f11720k);
            this.f11711b.addListener(this.f11720k);
            this.f11712c.addListener(this.f11720k);
            this.f11713d.addListener(this.f11720k);
            this.f11710a.addUpdateListener(this.f11721l);
            this.f11711b.addUpdateListener(this.f11722m);
            this.f11712c.addUpdateListener(this.f11723n);
        }

        /* renamed from: b */
        public boolean mo11442b() {
            return this.f11719j != null;
        }

        /* renamed from: a */
        public void mo11441a(String str, C4364e eVar) {
            ValueAnimator valueAnimator = this.f11719j;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f11718i = this.f11717h;
            this.f11717h = str;
            int i = C4365a.f11733a[eVar.ordinal()];
            if (i == 1) {
                this.f11719j = this.f11710a;
            } else if (i == 2) {
                this.f11719j = this.f11711b;
            } else if (i == 3) {
                this.f11719j = this.f11712c;
            } else if (i == 4) {
                this.f11719j = this.f11713d;
            }
            this.f11719j.setFloatValues(new float[]{0.0f, 1.0f});
            this.f11719j.setDuration(300);
            this.f11719j.start();
        }

        /* renamed from: a */
        public void mo11440a(int i) {
            this.f11714e.setTextColor(i);
            this.f11715f.setTextColor(i);
        }

        /* renamed from: a */
        public void mo11439a() {
            ValueAnimator valueAnimator = this.f11719j;
            if (valueAnimator != this.f11713d) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f11719j.cancel();
                this.f11719j.setFloatValues(new float[]{floatValue, 1.0f});
                this.f11719j.setDuration((long) ((1.0f - floatValue) * 50.0f));
                this.f11719j.start();
            }
        }
    }

    /* renamed from: app.zenly.locator.map.view.HeaderView$a */
    static /* synthetic */ class C4365a {

        /* renamed from: a */
        static final /* synthetic */ int[] f11733a = new int[C4364e.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        static {
            /*
                app.zenly.locator.map.view.HeaderView$MainLabelAnimator$e[] r0 = app.zenly.locator.map.view.HeaderView.MainLabelAnimator.C4364e.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f11733a = r0
                int[] r0 = f11733a     // Catch:{ NoSuchFieldError -> 0x0014 }
                app.zenly.locator.map.view.HeaderView$MainLabelAnimator$e r1 = app.zenly.locator.map.view.HeaderView.MainLabelAnimator.C4364e.ALPHA     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f11733a     // Catch:{ NoSuchFieldError -> 0x001f }
                app.zenly.locator.map.view.HeaderView$MainLabelAnimator$e r1 = app.zenly.locator.map.view.HeaderView.MainLabelAnimator.C4364e.ZOOM_IN     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f11733a     // Catch:{ NoSuchFieldError -> 0x002a }
                app.zenly.locator.map.view.HeaderView$MainLabelAnimator$e r1 = app.zenly.locator.map.view.HeaderView.MainLabelAnimator.C4364e.ZOOM_OUT     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f11733a     // Catch:{ NoSuchFieldError -> 0x0035 }
                app.zenly.locator.map.view.HeaderView$MainLabelAnimator$e r1 = app.zenly.locator.map.view.HeaderView.MainLabelAnimator.C4364e.OVERSHOOT     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.map.view.HeaderView.C4365a.<clinit>():void");
        }
    }

    /* renamed from: app.zenly.locator.map.view.HeaderView$b */
    private static class C4366b {

        /* renamed from: a */
        private final TextView f11734a;

        /* renamed from: b */
        private final TextView f11735b;

        /* renamed from: c */
        private final Animator f11736c;

        /* renamed from: d */
        private final Animator f11737d;

        /* renamed from: e */
        private final ObjectAnimator f11738e;

        /* renamed from: f */
        private final ObjectAnimator f11739f;

        /* renamed from: app.zenly.locator.map.view.HeaderView$b$a */
        class C4367a extends C5432b {

            /* renamed from: b */
            final /* synthetic */ View f11740b;

            C4367a(C4366b bVar, View view) {
                this.f11740b = view;
            }

            /* renamed from: a */
            public void mo7336a(Animator animator, boolean z) {
                if (!z) {
                    this.f11740b.setVisibility(8);
                }
            }
        }

        /* synthetic */ C4366b(TextView textView, TextView textView2, C4365a aVar) {
            this(textView, textView2);
        }

        /* renamed from: b */
        private void m12984b(String str) {
            m12983b(this.f11734a, this.f11736c, this.f11738e);
            this.f11734a.setText(str);
        }

        /* renamed from: c */
        private void m12985c() {
            m12979a(this.f11734a, this.f11736c, this.f11738e);
            this.f11734a.setText("");
        }

        /* renamed from: a */
        public void mo11448a(C4079a aVar) {
            if (!TextUtils.isEmpty(aVar.f10696c)) {
                m12984b(aVar.f10696c);
            } else {
                m12985c();
            }
            if (!TextUtils.isEmpty(aVar.f10695b)) {
                m12980a(aVar.f10695b);
            } else {
                m12982b();
            }
        }

        private C4366b(TextView textView, TextView textView2) {
            this.f11734a = textView;
            this.f11735b = textView2;
            this.f11736c = m12981b((View) this.f11734a);
            this.f11737d = m12981b((View) this.f11735b);
            this.f11738e = m12978a((View) this.f11734a);
            this.f11739f = m12978a((View) this.f11735b);
        }

        /* renamed from: b */
        private void m12982b() {
            m12979a(this.f11735b, this.f11737d, this.f11739f);
            this.f11735b.setText("");
        }

        /* renamed from: b */
        private Animator m12981b(View view) {
            AnimatorSet animatorSet = new AnimatorSet();
            int i = -C3200e0.m10183a(view.getContext(), 10);
            animatorSet.playTogether(new Animator[]{ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{0.0f, 1.0f}), ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, new float[]{(float) i, 0.0f})});
            return animatorSet;
        }

        /* renamed from: a */
        public void mo11447a() {
            m12985c();
            m12982b();
        }

        /* renamed from: a */
        private void m12980a(String str) {
            m12983b(this.f11735b, this.f11737d, this.f11739f);
            this.f11735b.setText(str);
        }

        /* renamed from: a */
        private ObjectAnimator m12978a(View view) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{1.0f, 0.0f});
            ofFloat.setDuration(50);
            ofFloat.addListener(new C4367a(this, view));
            return ofFloat;
        }

        /* renamed from: b */
        private void m12983b(View view, Animator animator, ObjectAnimator objectAnimator) {
            objectAnimator.cancel();
            if (!animator.isRunning() && view.getAlpha() != 1.0f) {
                animator.start();
                view.setVisibility(0);
            }
        }

        /* renamed from: a */
        private void m12979a(View view, Animator animator, ObjectAnimator objectAnimator) {
            animator.cancel();
            if (!objectAnimator.isRunning() && view.getVisibility() != 8) {
                objectAnimator.setFloatValues(new float[]{view.getAlpha(), 0.0f});
                objectAnimator.setDuration((long) (view.getAlpha() * 50.0f));
                objectAnimator.start();
            }
        }
    }

    public HeaderView(Context context) {
        super(context);
        mo11432a(context, null, 0);
    }

    /* renamed from: b */
    private void m12958b() {
        super.setAlpha(this.f11708N * (this.f11707M ? 0.5f : 1.0f));
    }

    /* renamed from: c */
    private void m12959c() {
        this.f11696B.mo11440a(this.f11700F ? this.f11702H : this.f11701G);
        this.f11698D.setTextColor(this.f11700F ? this.f11704J : this.f11703I);
        this.f11699E.setTextColor(this.f11700F ? this.f11706L : this.f11705K);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo11432a(Context context, AttributeSet attributeSet, int i) {
        ViewGroup.inflate(context, R.layout.view_header, this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3892m.HeaderView, i, 0);
        this.f11701G = obtainStyledAttributes.getColor(0, -16777216);
        this.f11702H = obtainStyledAttributes.getColor(1, -1);
        this.f11703I = obtainStyledAttributes.getColor(4, -16777216);
        this.f11704J = obtainStyledAttributes.getColor(5, -1);
        this.f11705K = obtainStyledAttributes.getColor(2, -16777216);
        this.f11706L = obtainStyledAttributes.getColor(3, -1);
        obtainStyledAttributes.recycle();
        this.f11696B = new MainLabelAnimator((TextView) findViewById(R.id.tv_label_1), (TextView) findViewById(R.id.tv_label_2), new C4382a(this));
        this.f11698D = (TextView) findViewById(R.id.tv_street);
        this.f11699E = (TextView) findViewById(R.id.tv_meta);
        this.f11697C = new C4366b(this.f11698D, this.f11699E, null);
        this.f11708N = super.getAlpha();
        m12959c();
    }

    public float getAlpha() {
        return this.f11708N;
    }

    public int getMainLabelBrightModeColor() {
        return this.f11701G;
    }

    public int getMainLabelDarkModeColor() {
        return this.f11702H;
    }

    public void setAlpha(float f) {
        this.f11708N = f;
        m12958b();
    }

    public void setContextualLabeling(C4079a aVar) {
        boolean z;
        if (Objects.equals(this.f11709z, aVar) && this.f11695A == null) {
            return;
        }
        if (TextUtils.equals(this.f11709z.f10694a, aVar.f10694a) && aVar.f10698e == this.f11709z.f10698e && this.f11695A == null) {
            this.f11709z = aVar;
            if (!this.f11696B.mo11442b()) {
                this.f11697C.mo11448a(aVar);
            }
        } else if (this.f11696B.mo11442b()) {
            boolean z2 = this.f11695A != null;
            this.f11695A = aVar;
            if (!z2) {
                this.f11696B.mo11439a();
            }
        } else {
            this.f11697C.mo11447a();
            C4079a aVar2 = this.f11709z;
            this.f11709z = aVar;
            if (!aVar.f10694a.isEmpty()) {
                z = aVar.f10698e;
            } else {
                z = this.f11707M;
            }
            if (z != this.f11707M) {
                this.f11707M = z;
                this.f11696B.mo11441a(this.f11709z.f10694a, C4364e.OVERSHOOT);
                m12958b();
            } else {
                if (!TextUtils.isEmpty(this.f11709z.f10694a) && !TextUtils.isEmpty(aVar2.f10694a)) {
                    C4079a aVar3 = this.f11709z;
                    int i = aVar3.f10697d;
                    int i2 = aVar2.f10697d;
                    if (i != i2) {
                        if (i < i2) {
                            this.f11696B.mo11441a(aVar3.f10694a, C4364e.ZOOM_OUT);
                        } else {
                            this.f11696B.mo11441a(aVar3.f10694a, C4364e.ZOOM_IN);
                        }
                    }
                }
                this.f11696B.mo11441a(this.f11709z.f10694a, C4364e.ALPHA);
            }
        }
    }

    public HeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.headerViewStyle);
        mo11432a(context, attributeSet, R.attr.headerViewStyle);
    }

    public HeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo11432a(context, attributeSet, i);
    }

    /* renamed from: a */
    public /* synthetic */ void mo2248a() {
        C4079a aVar = this.f11695A;
        if (aVar != null) {
            this.f11695A = null;
            setContextualLabeling(aVar);
            return;
        }
        this.f11697C.mo11448a(this.f11709z);
    }

    /* renamed from: a */
    public void mo11433a(boolean z) {
        if (this.f11700F != z) {
            this.f11700F = z;
            m12959c();
        }
    }
}
