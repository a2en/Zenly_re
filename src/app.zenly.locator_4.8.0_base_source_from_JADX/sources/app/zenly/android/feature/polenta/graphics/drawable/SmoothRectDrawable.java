package app.zenly.android.feature.polenta.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import androidx.annotation.Keep;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p250f.p251a.p252a.p263b.p279d.C7771g;
import p250f.p251a.p252a.p263b.p279d.p280h.p281a.C7772a;
import p250f.p251a.p252a.p263b.p279d.p280h.p281a.C7776c;
import p250f.p251a.p252a.p263b.p279d.p280h.p281a.C7778d;
import p250f.p251a.p252a.p263b.p279d.p282i.C7780a;

@Keep
public class SmoothRectDrawable extends Drawable {
    private static final float DEFAULT_INNER_RADIUS_RATIO = 3.0f;
    private static final float DEFAULT_THICKNESS_RATIO = 9.0f;
    /* access modifiers changed from: private */
    public static final Mode DEFAULT_TINT_MODE = Mode.SRC_IN;
    public static final int LINEAR_GRADIENT = 0;
    public static final int RADIAL_GRADIENT = 1;
    private static final int RADIUS_TYPE_FRACTION = 1;
    private static final int RADIUS_TYPE_FRACTION_PARENT = 2;
    private static final int RADIUS_TYPE_PIXELS = 0;
    public static final int SWEEP_GRADIENT = 2;
    private int mAlpha;
    private ColorFilter mColorFilter;
    private final Paint mFillPaint;
    private boolean mGradientIsDirty;
    private float mGradientRadius;
    private C1423b mGradientState;
    private Paint mLayerPaint;
    private boolean mMutated;
    private Rect mPadding;
    private final Path mPath;
    private boolean mPathIsDirty;
    private final RectF mRect;
    private final C7780a mSmoothRectBuilder;
    private Paint mStrokePaint;
    private PorterDuffColorFilter mTintFilter;

    /* renamed from: app.zenly.android.feature.polenta.graphics.drawable.SmoothRectDrawable$a */
    static /* synthetic */ class C1422a {

        /* renamed from: a */
        static final /* synthetic */ int[] f5122a = new int[C1424c.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                app.zenly.android.feature.polenta.graphics.drawable.SmoothRectDrawable$c[] r0 = app.zenly.android.feature.polenta.graphics.drawable.SmoothRectDrawable.C1424c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f5122a = r0
                int[] r0 = f5122a     // Catch:{ NoSuchFieldError -> 0x0014 }
                app.zenly.android.feature.polenta.graphics.drawable.SmoothRectDrawable$c r1 = app.zenly.android.feature.polenta.graphics.drawable.SmoothRectDrawable.C1424c.TOP_BOTTOM     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f5122a     // Catch:{ NoSuchFieldError -> 0x001f }
                app.zenly.android.feature.polenta.graphics.drawable.SmoothRectDrawable$c r1 = app.zenly.android.feature.polenta.graphics.drawable.SmoothRectDrawable.C1424c.TR_BL     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f5122a     // Catch:{ NoSuchFieldError -> 0x002a }
                app.zenly.android.feature.polenta.graphics.drawable.SmoothRectDrawable$c r1 = app.zenly.android.feature.polenta.graphics.drawable.SmoothRectDrawable.C1424c.RIGHT_LEFT     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f5122a     // Catch:{ NoSuchFieldError -> 0x0035 }
                app.zenly.android.feature.polenta.graphics.drawable.SmoothRectDrawable$c r1 = app.zenly.android.feature.polenta.graphics.drawable.SmoothRectDrawable.C1424c.BR_TL     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f5122a     // Catch:{ NoSuchFieldError -> 0x0040 }
                app.zenly.android.feature.polenta.graphics.drawable.SmoothRectDrawable$c r1 = app.zenly.android.feature.polenta.graphics.drawable.SmoothRectDrawable.C1424c.BOTTOM_TOP     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = f5122a     // Catch:{ NoSuchFieldError -> 0x004b }
                app.zenly.android.feature.polenta.graphics.drawable.SmoothRectDrawable$c r1 = app.zenly.android.feature.polenta.graphics.drawable.SmoothRectDrawable.C1424c.BL_TR     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                int[] r0 = f5122a     // Catch:{ NoSuchFieldError -> 0x0056 }
                app.zenly.android.feature.polenta.graphics.drawable.SmoothRectDrawable$c r1 = app.zenly.android.feature.polenta.graphics.drawable.SmoothRectDrawable.C1424c.LEFT_RIGHT     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: app.zenly.android.feature.polenta.graphics.drawable.SmoothRectDrawable.C1422a.<clinit>():void");
        }
    }

    /* renamed from: app.zenly.android.feature.polenta.graphics.drawable.SmoothRectDrawable$b */
    static final class C1423b extends ConstantState {

        /* renamed from: A */
        float f5123A = 0.5f;

        /* renamed from: B */
        int f5124B = 0;

        /* renamed from: C */
        boolean f5125C = false;

        /* renamed from: D */
        boolean f5126D = true;

        /* renamed from: E */
        boolean f5127E;

        /* renamed from: F */
        boolean f5128F;

        /* renamed from: G */
        ColorStateList f5129G = null;

        /* renamed from: H */
        Mode f5130H = SmoothRectDrawable.DEFAULT_TINT_MODE;

        /* renamed from: I */
        int f5131I = 160;

        /* renamed from: J */
        int[] f5132J;

        /* renamed from: K */
        int[] f5133K;

        /* renamed from: L */
        int[] f5134L;

        /* renamed from: M */
        int[] f5135M;

        /* renamed from: N */
        int[] f5136N;

        /* renamed from: O */
        int[] f5137O;

        /* renamed from: P */
        int[] f5138P;

        /* renamed from: a */
        public int f5139a;

        /* renamed from: b */
        public int f5140b = 0;

        /* renamed from: c */
        public int f5141c = 0;

        /* renamed from: d */
        public C1424c f5142d;

        /* renamed from: e */
        public ColorStateList f5143e;

        /* renamed from: f */
        public ColorStateList f5144f;

        /* renamed from: g */
        public int[] f5145g;

        /* renamed from: h */
        public int[] f5146h;

        /* renamed from: i */
        public float[] f5147i;

        /* renamed from: j */
        public float[] f5148j;

        /* renamed from: k */
        public int f5149k = -1;

        /* renamed from: l */
        public float f5150l = 0.0f;

        /* renamed from: m */
        public float f5151m = 0.0f;

        /* renamed from: n */
        public float f5152n = 0.0f;

        /* renamed from: o */
        public float f5153o = 0.0f;

        /* renamed from: p */
        public float[] f5154p = null;

        /* renamed from: q */
        public Rect f5155q = null;

        /* renamed from: r */
        public int f5156r = -1;

        /* renamed from: s */
        public int f5157s = -1;

        /* renamed from: t */
        public float f5158t = SmoothRectDrawable.DEFAULT_INNER_RADIUS_RATIO;

        /* renamed from: u */
        public float f5159u = SmoothRectDrawable.DEFAULT_THICKNESS_RATIO;

        /* renamed from: v */
        public int f5160v = -1;

        /* renamed from: w */
        public int f5161w = -1;

        /* renamed from: x */
        public boolean f5162x = false;

        /* renamed from: y */
        float f5163y = 0.5f;

        /* renamed from: z */
        float f5164z = 0.5f;

        public C1423b(C1424c cVar, int[] iArr) {
            this.f5142d = cVar;
            mo6787a(iArr);
        }

        /* renamed from: b */
        private void m6495b(int i, int i2) {
            int i3 = this.f5160v;
            if (i3 > 0) {
                this.f5160v = SmoothRectDrawable.scaleFromDensity(i3, i, i2, true);
            }
            int i4 = this.f5161w;
            if (i4 > 0) {
                this.f5161w = SmoothRectDrawable.scaleFromDensity(i4, i, i2, true);
            }
            Rect rect = this.f5155q;
            if (rect != null) {
                rect.left = SmoothRectDrawable.scaleFromDensity(rect.left, i, i2, false);
                Rect rect2 = this.f5155q;
                rect2.top = SmoothRectDrawable.scaleFromDensity(rect2.top, i, i2, false);
                Rect rect3 = this.f5155q;
                rect3.right = SmoothRectDrawable.scaleFromDensity(rect3.right, i, i2, false);
                Rect rect4 = this.f5155q;
                rect4.bottom = SmoothRectDrawable.scaleFromDensity(rect4.bottom, i, i2, false);
            }
            float f = this.f5152n;
            if (f > 0.0f) {
                this.f5152n = SmoothRectDrawable.scaleFromDensity(f, i, i2);
            }
            float[] fArr = this.f5154p;
            if (fArr != null) {
                fArr[0] = (float) SmoothRectDrawable.scaleFromDensity((int) fArr[0], i, i2, true);
                float[] fArr2 = this.f5154p;
                fArr2[1] = (float) SmoothRectDrawable.scaleFromDensity((int) fArr2[1], i, i2, true);
                float[] fArr3 = this.f5154p;
                fArr3[2] = (float) SmoothRectDrawable.scaleFromDensity((int) fArr3[2], i, i2, true);
                float[] fArr4 = this.f5154p;
                fArr4[3] = (float) SmoothRectDrawable.scaleFromDensity((int) fArr4[3], i, i2, true);
            }
            int i5 = this.f5149k;
            if (i5 > 0) {
                this.f5149k = SmoothRectDrawable.scaleFromDensity(i5, i, i2, true);
            }
            if (this.f5150l > 0.0f) {
                this.f5150l = SmoothRectDrawable.scaleFromDensity(this.f5151m, i, i2);
            }
            float f2 = this.f5151m;
            if (f2 > 0.0f) {
                this.f5151m = SmoothRectDrawable.scaleFromDensity(f2, i, i2);
            }
            if (this.f5124B == 0) {
                this.f5123A = SmoothRectDrawable.scaleFromDensity(this.f5123A, i, i2);
            }
            int i6 = this.f5156r;
            if (i6 > 0) {
                this.f5156r = SmoothRectDrawable.scaleFromDensity(i6, i, i2, true);
            }
            int i7 = this.f5157s;
            if (i7 > 0) {
                this.f5157s = SmoothRectDrawable.scaleFromDensity(i7, i, i2, true);
            }
        }

        public boolean canApplyTheme() {
            if (this.f5132J == null && this.f5133K == null && this.f5134L == null && this.f5135M == null && this.f5136N == null && this.f5137O == null && this.f5138P == null) {
                ColorStateList colorStateList = this.f5129G;
                if (colorStateList == null || !C7772a.m18876a(colorStateList)) {
                    ColorStateList colorStateList2 = this.f5144f;
                    if (colorStateList2 == null || !C7772a.m18876a(colorStateList2)) {
                        ColorStateList colorStateList3 = this.f5143e;
                        if ((colorStateList3 == null || !C7772a.m18876a(colorStateList3)) && !super.canApplyTheme()) {
                            return false;
                        }
                    }
                }
            }
            return true;
        }

        public int getChangingConfigurations() {
            int i = this.f5139a;
            ColorStateList colorStateList = this.f5144f;
            int i2 = 0;
            int changingConfigurations = i | (colorStateList != null ? colorStateList.getChangingConfigurations() : 0);
            ColorStateList colorStateList2 = this.f5143e;
            int changingConfigurations2 = changingConfigurations | (colorStateList2 != null ? colorStateList2.getChangingConfigurations() : 0);
            ColorStateList colorStateList3 = this.f5129G;
            if (colorStateList3 != null) {
                i2 = colorStateList3.getChangingConfigurations();
            }
            return changingConfigurations2 | i2;
        }

        public Drawable newDrawable() {
            return new SmoothRectDrawable(this, null, null);
        }

        /* renamed from: a */
        public final void mo6782a(int i) {
            int i2 = this.f5131I;
            if (i2 != i) {
                this.f5131I = i;
                m6495b(i2, i);
            }
        }

        public Drawable newDrawable(Resources resources) {
            return new SmoothRectDrawable(SmoothRectDrawable.resolveDensity(resources, this.f5131I) != this.f5131I ? new C1423b(this, resources) : this, resources, null);
        }

        /* renamed from: a */
        public void mo6780a(float f, float f2) {
            this.f5163y = f;
            this.f5164z = f2;
        }

        /* renamed from: a */
        public void mo6787a(int[] iArr) {
            this.f5145g = iArr;
            this.f5143e = null;
            m6493a();
        }

        /* renamed from: a */
        public void mo6785a(ColorStateList colorStateList) {
            this.f5145g = null;
            this.f5143e = colorStateList;
            m6493a();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m6493a() {
            boolean z = false;
            this.f5127E = false;
            this.f5128F = false;
            if (this.f5145g != null) {
                int i = 0;
                while (true) {
                    int[] iArr = this.f5145g;
                    if (i >= iArr.length) {
                        break;
                    } else if (SmoothRectDrawable.isOpaque(iArr[i])) {
                        i++;
                    } else {
                        return;
                    }
                }
            }
            if (this.f5145g != null || this.f5143e != null) {
                this.f5128F = true;
                if (this.f5153o <= 0.0f && this.f5152n <= 0.0f && this.f5154p == null) {
                    z = true;
                }
                this.f5127E = z;
            }
        }

        /* renamed from: a */
        public void mo6784a(int i, ColorStateList colorStateList, float f, float f2) {
            this.f5149k = i;
            this.f5144f = colorStateList;
            this.f5150l = f;
            this.f5151m = f2;
            m6493a();
        }

        /* renamed from: a */
        public void mo6779a(float f) {
            if (f < 0.0f) {
                f = 0.0f;
            }
            this.f5152n = f;
            this.f5153o = 0.0f;
            this.f5154p = null;
            m6493a();
        }

        public C1423b(C1423b bVar, Resources resources) {
            this.f5139a = bVar.f5139a;
            this.f5140b = bVar.f5140b;
            this.f5141c = bVar.f5141c;
            this.f5142d = bVar.f5142d;
            this.f5143e = bVar.f5143e;
            int[] iArr = bVar.f5145g;
            if (iArr != null) {
                this.f5145g = (int[]) iArr.clone();
            }
            float[] fArr = bVar.f5148j;
            if (fArr != null) {
                this.f5148j = (float[]) fArr.clone();
            }
            this.f5144f = bVar.f5144f;
            this.f5149k = bVar.f5149k;
            this.f5150l = bVar.f5150l;
            this.f5151m = bVar.f5151m;
            this.f5152n = bVar.f5152n;
            this.f5153o = bVar.f5153o;
            float[] fArr2 = bVar.f5154p;
            if (fArr2 != null) {
                this.f5154p = (float[]) fArr2.clone();
            }
            Rect rect = bVar.f5155q;
            if (rect != null) {
                this.f5155q = new Rect(rect);
            }
            this.f5156r = bVar.f5156r;
            this.f5157s = bVar.f5157s;
            this.f5158t = bVar.f5158t;
            this.f5159u = bVar.f5159u;
            this.f5160v = bVar.f5160v;
            this.f5161w = bVar.f5161w;
            this.f5162x = bVar.f5162x;
            this.f5163y = bVar.f5163y;
            this.f5164z = bVar.f5164z;
            this.f5123A = bVar.f5123A;
            this.f5124B = bVar.f5124B;
            this.f5125C = bVar.f5125C;
            this.f5126D = bVar.f5126D;
            this.f5127E = bVar.f5127E;
            this.f5128F = bVar.f5128F;
            this.f5129G = bVar.f5129G;
            this.f5130H = bVar.f5130H;
            this.f5132J = bVar.f5132J;
            this.f5133K = bVar.f5133K;
            this.f5134L = bVar.f5134L;
            this.f5135M = bVar.f5135M;
            this.f5136N = bVar.f5136N;
            this.f5137O = bVar.f5137O;
            this.f5138P = bVar.f5138P;
            this.f5131I = SmoothRectDrawable.resolveDensity(resources, bVar.f5131I);
            int i = bVar.f5131I;
            int i2 = this.f5131I;
            if (i != i2) {
                m6495b(i, i2);
            }
        }

        /* renamed from: b */
        public void mo6789b(int i) {
            this.f5140b = i;
        }

        /* renamed from: a */
        public void mo6786a(float[] fArr) {
            this.f5154p = fArr;
            if (fArr == null) {
                this.f5152n = 0.0f;
                this.f5153o = 0.0f;
            }
            m6493a();
        }

        /* renamed from: b */
        public void mo6788b(float f) {
            if (f < 0.0f) {
                f = 0.0f;
            }
            if (f > 1.0f) {
                f = 1.0f;
            }
            this.f5153o = f;
            this.f5152n = 0.0f;
            this.f5154p = null;
            m6493a();
        }

        /* renamed from: a */
        public void mo6783a(int i, int i2) {
            this.f5156r = i;
            this.f5157s = i2;
        }

        /* renamed from: a */
        public void mo6781a(float f, int i) {
            this.f5123A = f;
            this.f5124B = i;
        }
    }

    /* renamed from: app.zenly.android.feature.polenta.graphics.drawable.SmoothRectDrawable$c */
    public enum C1424c {
        TOP_BOTTOM,
        TR_BL,
        RIGHT_LEFT,
        BR_TL,
        BOTTOM_TOP,
        BL_TR,
        LEFT_RIGHT,
        TL_BR
    }

    /* synthetic */ SmoothRectDrawable(C1423b bVar, Resources resources, C1422a aVar) {
        this(bVar, resources);
    }

    private void applyThemeChildElements(Theme theme) {
        C1423b bVar = this.mGradientState;
        int[] iArr = bVar.f5133K;
        if (iArr != null) {
            TypedArray a = C7776c.m18880a(theme, iArr, C7771g.SmoothRectDrawableSize);
            updateGradientDrawableSize(a);
            a.recycle();
        }
        int[] iArr2 = bVar.f5134L;
        if (iArr2 != null) {
            TypedArray a2 = C7776c.m18880a(theme, iArr2, C7771g.SmoothRectDrawableGradient);
            try {
                updateGradientDrawableGradient(theme.getResources(), a2);
            } catch (XmlPullParserException e) {
                rethrowAsRuntimeException(e);
            } catch (Throwable th) {
                a2.recycle();
                throw th;
            }
            a2.recycle();
        }
        int[] iArr3 = bVar.f5135M;
        if (iArr3 != null) {
            TypedArray a3 = C7776c.m18880a(theme, iArr3, C7771g.SmoothRectDrawableSolid);
            updateGradientDrawableSolid(a3);
            a3.recycle();
        }
        int[] iArr4 = bVar.f5136N;
        if (iArr4 != null) {
            TypedArray a4 = C7776c.m18880a(theme, iArr4, C7771g.SmoothRectDrawableStroke);
            updateGradientDrawableStroke(a4);
            a4.recycle();
        }
        int[] iArr5 = bVar.f5137O;
        if (iArr5 != null) {
            TypedArray a5 = C7776c.m18880a(theme, iArr5, C7771g.SmoothRectDrawableCorners);
            updateDrawableCorners(a5);
            a5.recycle();
        }
        int[] iArr6 = bVar.f5138P;
        if (iArr6 != null) {
            TypedArray a6 = C7776c.m18880a(theme, iArr6, C7771g.SmoothRectDrawablePadding);
            updateGradientDrawablePadding(a6);
            a6.recycle();
        }
    }

    private void buildPathIfDirty() {
        C1423b bVar = this.mGradientState;
        if (this.mPathIsDirty) {
            ensureValidRect();
            this.mSmoothRectBuilder.mo19986a(this.mRect);
            if (bVar.f5153o > 0.0f) {
                this.mSmoothRectBuilder.mo19989b(Math.min(this.mRect.width(), this.mRect.height()) * bVar.f5153o);
            } else {
                float[] fArr = bVar.f5154p;
                if (fArr != null) {
                    this.mSmoothRectBuilder.mo19987a(fArr);
                } else {
                    this.mSmoothRectBuilder.mo19989b(bVar.f5152n);
                }
            }
            this.mSmoothRectBuilder.mo19984a(this.mPath);
            this.mPathIsDirty = false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0065, code lost:
        r9 = r9 * r4;
        r12 = r1;
        r13 = r5;
        r14 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006a, code lost:
        r15 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0096, code lost:
        r12 = r1;
        r13 = r5;
        r15 = r13;
        r14 = r9 * r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00ae, code lost:
        r9 = r9 * r4;
        r12 = r1;
        r14 = r12;
        r13 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00b4, code lost:
        r1 = r0.mFillPaint;
        r11 = new android.graphics.LinearGradient(r12, r13, r14, r15, r3, r6.f5148j, android.graphics.Shader.TileMode.CLAMP);
        r1.setShader(r11);
     */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x012a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean ensureValidRect() {
        /*
            r20 = this;
            r0 = r20
            boolean r1 = r0.mGradientIsDirty
            r2 = 1
            if (r1 == 0) goto L_0x01b0
            r1 = 0
            r0.mGradientIsDirty = r1
            android.graphics.Rect r3 = r20.getBounds()
            android.graphics.Paint r4 = r0.mStrokePaint
            r5 = 0
            if (r4 == 0) goto L_0x001c
            float r4 = r4.getStrokeWidth()
            r6 = 1056964608(0x3f000000, float:0.5)
            float r4 = r4 * r6
            goto L_0x001d
        L_0x001c:
            r4 = 0
        L_0x001d:
            app.zenly.android.feature.polenta.graphics.drawable.SmoothRectDrawable$b r6 = r0.mGradientState
            android.graphics.RectF r7 = r0.mRect
            int r8 = r3.left
            float r8 = (float) r8
            float r8 = r8 + r4
            int r9 = r3.top
            float r9 = (float) r9
            float r9 = r9 + r4
            int r10 = r3.right
            float r10 = (float) r10
            float r10 = r10 - r4
            int r3 = r3.bottom
            float r3 = (float) r3
            float r3 = r3 - r4
            r7.set(r8, r9, r10, r3)
            int[] r3 = r6.f5145g
            if (r3 == 0) goto L_0x01b0
            android.graphics.RectF r4 = r0.mRect
            int r7 = r6.f5140b
            r8 = 1176256512(0x461c4000, float:10000.0)
            r9 = 1065353216(0x3f800000, float:1.0)
            if (r7 != 0) goto L_0x00c9
            boolean r1 = r6.f5125C
            if (r1 == 0) goto L_0x004e
            int r1 = r20.getLevel()
            float r1 = (float) r1
            float r9 = r1 / r8
        L_0x004e:
            int[] r1 = app.zenly.android.feature.polenta.graphics.drawable.SmoothRectDrawable.C1422a.f5122a
            app.zenly.android.feature.polenta.graphics.drawable.SmoothRectDrawable$c r5 = r6.f5142d
            int r5 = r5.ordinal()
            r1 = r1[r5]
            switch(r1) {
                case 1: goto L_0x00a8;
                case 2: goto L_0x009d;
                case 3: goto L_0x0090;
                case 4: goto L_0x0085;
                case 5: goto L_0x007e;
                case 6: goto L_0x0073;
                case 7: goto L_0x006c;
                default: goto L_0x005b;
            }
        L_0x005b:
            float r1 = r4.left
            float r5 = r4.top
            float r7 = r4.right
            float r7 = r7 * r9
            float r4 = r4.bottom
        L_0x0065:
            float r9 = r9 * r4
            r12 = r1
            r13 = r5
            r14 = r7
        L_0x006a:
            r15 = r9
            goto L_0x00b4
        L_0x006c:
            float r1 = r4.left
            float r5 = r4.top
            float r4 = r4.right
            goto L_0x0096
        L_0x0073:
            float r1 = r4.left
            float r5 = r4.bottom
            float r7 = r4.right
            float r7 = r7 * r9
            float r4 = r4.top
            goto L_0x0065
        L_0x007e:
            float r1 = r4.left
            float r5 = r4.bottom
            float r4 = r4.top
            goto L_0x00ae
        L_0x0085:
            float r1 = r4.right
            float r5 = r4.bottom
            float r7 = r4.left
            float r7 = r7 * r9
            float r4 = r4.top
            goto L_0x0065
        L_0x0090:
            float r1 = r4.right
            float r5 = r4.top
            float r4 = r4.left
        L_0x0096:
            float r9 = r9 * r4
            r12 = r1
            r13 = r5
            r15 = r13
            r14 = r9
            goto L_0x00b4
        L_0x009d:
            float r1 = r4.right
            float r5 = r4.top
            float r7 = r4.left
            float r7 = r7 * r9
            float r4 = r4.bottom
            goto L_0x0065
        L_0x00a8:
            float r1 = r4.left
            float r5 = r4.top
            float r4 = r4.bottom
        L_0x00ae:
            float r9 = r9 * r4
            r12 = r1
            r14 = r12
            r13 = r5
            goto L_0x006a
        L_0x00b4:
            android.graphics.Paint r1 = r0.mFillPaint
            android.graphics.LinearGradient r4 = new android.graphics.LinearGradient
            float[] r5 = r6.f5148j
            android.graphics.Shader$TileMode r18 = android.graphics.Shader.TileMode.CLAMP
            r11 = r4
            r16 = r3
            r17 = r5
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            r1.setShader(r4)
            goto L_0x01a5
        L_0x00c9:
            r10 = 2
            if (r7 != r2) goto L_0x013c
            float r1 = r4.left
            float r7 = r4.right
            float r7 = r7 - r1
            float r9 = r6.f5163y
            float r7 = r7 * r9
            float r12 = r1 + r7
            float r1 = r4.top
            float r7 = r4.bottom
            float r7 = r7 - r1
            float r9 = r6.f5164z
            float r7 = r7 * r9
            float r13 = r1 + r7
            float r1 = r6.f5123A
            int r7 = r6.f5124B
            if (r7 != r2) goto L_0x0101
            int r7 = r6.f5156r
            if (r7 < 0) goto L_0x00ee
            float r7 = (float) r7
            goto L_0x00f2
        L_0x00ee:
            float r7 = r4.width()
        L_0x00f2:
            int r9 = r6.f5157s
            if (r9 < 0) goto L_0x00f8
            float r4 = (float) r9
            goto L_0x00fc
        L_0x00f8:
            float r4 = r4.height()
        L_0x00fc:
            float r4 = java.lang.Math.min(r7, r4)
            goto L_0x010f
        L_0x0101:
            if (r7 != r10) goto L_0x0111
            float r7 = r4.width()
            float r4 = r4.height()
            float r4 = java.lang.Math.min(r7, r4)
        L_0x010f:
            float r1 = r1 * r4
        L_0x0111:
            boolean r4 = r6.f5125C
            if (r4 == 0) goto L_0x011d
            int r4 = r20.getLevel()
            float r4 = (float) r4
            float r4 = r4 / r8
            float r1 = r1 * r4
        L_0x011d:
            r0.mGradientRadius = r1
            int r4 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r4 > 0) goto L_0x012a
            r1 = 981668463(0x3a83126f, float:0.001)
            r14 = 981668463(0x3a83126f, float:0.001)
            goto L_0x012b
        L_0x012a:
            r14 = r1
        L_0x012b:
            android.graphics.Paint r1 = r0.mFillPaint
            android.graphics.RadialGradient r4 = new android.graphics.RadialGradient
            r16 = 0
            android.graphics.Shader$TileMode r17 = android.graphics.Shader.TileMode.CLAMP
            r11 = r4
            r15 = r3
            r11.<init>(r12, r13, r14, r15, r16, r17)
            r1.setShader(r4)
            goto L_0x01a5
        L_0x013c:
            if (r7 != r10) goto L_0x01a5
            float r5 = r4.left
            float r7 = r4.right
            float r7 = r7 - r5
            float r10 = r6.f5163y
            float r7 = r7 * r10
            float r5 = r5 + r7
            float r7 = r4.top
            float r4 = r4.bottom
            float r4 = r4 - r7
            float r10 = r6.f5164z
            float r4 = r4 * r10
            float r7 = r7 + r4
            r4 = 0
            boolean r10 = r6.f5125C
            if (r10 == 0) goto L_0x019b
            int[] r4 = r6.f5146h
            int r10 = r3.length
            if (r4 == 0) goto L_0x0161
            int r11 = r4.length
            int r12 = r10 + 1
            if (r11 == r12) goto L_0x0167
        L_0x0161:
            int r4 = r10 + 1
            int[] r4 = new int[r4]
            r6.f5146h = r4
        L_0x0167:
            java.lang.System.arraycopy(r3, r1, r4, r1, r10)
            int r11 = r10 + -1
            r3 = r3[r11]
            r4[r10] = r3
            float[] r3 = r6.f5147i
            float r11 = (float) r11
            float r11 = r9 / r11
            if (r3 == 0) goto L_0x017c
            int r12 = r3.length
            int r13 = r10 + 1
            if (r12 == r13) goto L_0x0182
        L_0x017c:
            int r3 = r10 + 1
            float[] r3 = new float[r3]
            r6.f5147i = r3
        L_0x0182:
            int r12 = r20.getLevel()
            float r12 = (float) r12
            float r12 = r12 / r8
        L_0x0188:
            if (r1 >= r10) goto L_0x0194
            float r8 = (float) r1
            float r8 = r8 * r11
            float r8 = r8 * r12
            r3[r1] = r8
            int r1 = r1 + 1
            goto L_0x0188
        L_0x0194:
            r3[r10] = r9
            r19 = r4
            r4 = r3
            r3 = r19
        L_0x019b:
            android.graphics.Paint r1 = r0.mFillPaint
            android.graphics.SweepGradient r8 = new android.graphics.SweepGradient
            r8.<init>(r5, r7, r3, r4)
            r1.setShader(r8)
        L_0x01a5:
            android.content.res.ColorStateList r1 = r6.f5143e
            if (r1 != 0) goto L_0x01b0
            android.graphics.Paint r1 = r0.mFillPaint
            r3 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1.setColor(r3)
        L_0x01b0:
            android.graphics.RectF r1 = r0.mRect
            boolean r1 = r1.isEmpty()
            r1 = r1 ^ r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: app.zenly.android.feature.polenta.graphics.drawable.SmoothRectDrawable.ensureValidRect():boolean");
    }

    private static float getFloatOrFraction(TypedArray typedArray, int i, float f) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue == null) {
            return f;
        }
        return peekValue.type == 6 ? peekValue.getFraction(1.0f, 1.0f) : peekValue.getFloat();
    }

    private void inflateChildElements(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next != 1) {
                int depth2 = xmlPullParser.getDepth();
                if (depth2 < depth && next == 3) {
                    return;
                }
                if (next == 2 && depth2 <= depth) {
                    String name = xmlPullParser.getName();
                    if (name.equals("size")) {
                        TypedArray obtainAttributes = obtainAttributes(resources, theme, attributeSet, C7771g.SmoothRectDrawableSize);
                        updateGradientDrawableSize(obtainAttributes);
                        obtainAttributes.recycle();
                    } else if (name.equals("gradient")) {
                        TypedArray obtainAttributes2 = obtainAttributes(resources, theme, attributeSet, C7771g.SmoothRectDrawableGradient);
                        updateGradientDrawableGradient(resources, obtainAttributes2);
                        obtainAttributes2.recycle();
                    } else if (name.equals("solid")) {
                        TypedArray obtainAttributes3 = obtainAttributes(resources, theme, attributeSet, C7771g.SmoothRectDrawableSolid);
                        updateGradientDrawableSolid(obtainAttributes3);
                        obtainAttributes3.recycle();
                    } else if (name.equals("stroke")) {
                        TypedArray obtainAttributes4 = obtainAttributes(resources, theme, attributeSet, C7771g.SmoothRectDrawableStroke);
                        updateGradientDrawableStroke(obtainAttributes4);
                        obtainAttributes4.recycle();
                    } else if (name.equals("corners")) {
                        TypedArray obtainAttributes5 = obtainAttributes(resources, theme, attributeSet, C7771g.SmoothRectDrawableCorners);
                        updateDrawableCorners(obtainAttributes5);
                        obtainAttributes5.recycle();
                    } else if (name.equals("padding")) {
                        TypedArray obtainAttributes6 = obtainAttributes(resources, theme, attributeSet, C7771g.SmoothRectDrawablePadding);
                        updateGradientDrawablePadding(obtainAttributes6);
                        obtainAttributes6.recycle();
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Bad element under <shape>: ");
                        sb.append(name);
                        Log.w("drawable", sb.toString());
                    }
                }
            } else {
                return;
            }
        }
    }

    static boolean isOpaque(int i) {
        return ((i >> 24) & 255) == 255;
    }

    private boolean isOpaqueForState() {
        if (this.mGradientState.f5149k >= 0) {
            Paint paint = this.mStrokePaint;
            if (paint != null && !isOpaque(paint.getColor())) {
                return false;
            }
        }
        if (this.mGradientState.f5145g != null || isOpaque(this.mFillPaint.getColor())) {
            return true;
        }
        return false;
    }

    private int modulateAlpha(int i) {
        int i2 = this.mAlpha;
        return (i * (i2 + (i2 >> 7))) >> 8;
    }

    protected static TypedArray obtainAttributes(Resources resources, Theme theme, AttributeSet attributeSet, int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static Mode parseTintMode(int i, Mode mode) {
        if (i == 3) {
            return Mode.SRC_OVER;
        }
        if (i == 5) {
            return Mode.SRC_IN;
        }
        if (i == 9) {
            return Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return Mode.MULTIPLY;
            case 15:
                return Mode.SCREEN;
            case 16:
                return Mode.ADD;
            default:
                return mode;
        }
    }

    static int resolveDensity(Resources resources, int i) {
        if (resources != null) {
            i = resources.getDisplayMetrics().densityDpi;
        }
        if (i == 0) {
            return 160;
        }
        return i;
    }

    static void rethrowAsRuntimeException(Exception exc) throws RuntimeException {
        RuntimeException runtimeException = new RuntimeException(exc);
        runtimeException.setStackTrace(new StackTraceElement[0]);
        throw runtimeException;
    }

    static float scaleFromDensity(float f, int i, int i2) {
        return (f * ((float) i2)) / ((float) i);
    }

    static int scaleFromDensity(int i, int i2, int i3, boolean z) {
        if (!(i == 0 || i2 == i3)) {
            float f = ((float) (i3 * i)) / ((float) i2);
            if (!z) {
                return (int) f;
            }
            int round = Math.round(f);
            if (round != 0) {
                return round;
            }
            if (i > 0) {
                return 1;
            }
            i = -1;
        }
        return i;
    }

    private void setStrokeInternal(int i, int i2, float f, float f2) {
        if (this.mStrokePaint == null) {
            this.mStrokePaint = new Paint(1);
            this.mStrokePaint.setStyle(Style.STROKE);
        }
        this.mStrokePaint.setStrokeWidth((float) i);
        this.mStrokePaint.setColor(i2);
        DashPathEffect dashPathEffect = null;
        if (f > 0.0f) {
            dashPathEffect = new DashPathEffect(new float[]{f, f2}, 0.0f);
        }
        this.mStrokePaint.setPathEffect(dashPathEffect);
        invalidateSelf();
    }

    private void updateDrawableCorners(TypedArray typedArray) {
        C1423b bVar = this.mGradientState;
        bVar.f5139a |= typedArray.getChangingConfigurations();
        int dimensionPixelSize = typedArray.getDimensionPixelSize(C7771g.SmoothRectDrawableCorners_radius, (int) bVar.f5152n);
        setCornerRadius((float) dimensionPixelSize);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(C7771g.SmoothRectDrawableCorners_topLeftRadius, dimensionPixelSize);
        int dimensionPixelSize3 = typedArray.getDimensionPixelSize(C7771g.SmoothRectDrawableCorners_topRightRadius, dimensionPixelSize);
        int dimensionPixelSize4 = typedArray.getDimensionPixelSize(C7771g.SmoothRectDrawableCorners_bottomLeftRadius, dimensionPixelSize);
        int dimensionPixelSize5 = typedArray.getDimensionPixelSize(C7771g.SmoothRectDrawableCorners_bottomRightRadius, dimensionPixelSize);
        if (!(dimensionPixelSize2 == dimensionPixelSize && dimensionPixelSize3 == dimensionPixelSize && dimensionPixelSize4 == dimensionPixelSize && dimensionPixelSize5 == dimensionPixelSize)) {
            float f = (float) dimensionPixelSize2;
            float f2 = (float) dimensionPixelSize3;
            float f3 = (float) dimensionPixelSize5;
            float f4 = (float) dimensionPixelSize4;
            setCornerRadii(new float[]{f, f, f2, f2, f3, f3, f4, f4});
        }
        if (typedArray.hasValue(C7771g.SmoothRectDrawableCorners_radiusRatio)) {
            setCornerRadiusRatio(typedArray.getFloat(C7771g.SmoothRectDrawableCorners_radiusRatio, bVar.f5153o));
        }
    }

    private void updateGradientDrawableGradient(Resources resources, TypedArray typedArray) throws XmlPullParserException {
        float f;
        C1423b bVar = this.mGradientState;
        bVar.f5139a |= typedArray.getChangingConfigurations();
        bVar.f5134L = C7778d.m18883a(typedArray);
        bVar.f5163y = getFloatOrFraction(typedArray, C7771g.SmoothRectDrawableGradient_centerX, bVar.f5163y);
        bVar.f5164z = getFloatOrFraction(typedArray, C7771g.SmoothRectDrawableGradient_centerY, bVar.f5164z);
        bVar.f5125C = typedArray.getBoolean(C7771g.SmoothRectDrawableGradient_useLevel, bVar.f5125C);
        bVar.f5140b = typedArray.getInt(C7771g.SmoothRectDrawableGradient_type, bVar.f5140b);
        int i = 0;
        int color = typedArray.getColor(C7771g.SmoothRectDrawableGradient_startColor, 0);
        boolean hasValue = typedArray.hasValue(C7771g.SmoothRectDrawableGradient_centerColor);
        int color2 = typedArray.getColor(C7771g.SmoothRectDrawableGradient_centerColor, 0);
        int color3 = typedArray.getColor(C7771g.SmoothRectDrawableGradient_endColor, 0);
        if (hasValue) {
            bVar.f5145g = new int[3];
            int[] iArr = bVar.f5145g;
            iArr[0] = color;
            iArr[1] = color2;
            iArr[2] = color3;
            bVar.f5148j = new float[3];
            float[] fArr = bVar.f5148j;
            fArr[0] = 0.0f;
            float f2 = bVar.f5163y;
            if (f2 == 0.5f) {
                f2 = bVar.f5164z;
            }
            fArr[1] = f2;
            bVar.f5148j[2] = 1.0f;
        } else {
            bVar.f5145g = new int[2];
            int[] iArr2 = bVar.f5145g;
            iArr2[0] = color;
            iArr2[1] = color3;
        }
        if (bVar.f5140b == 0) {
            int i2 = ((int) typedArray.getFloat(C7771g.SmoothRectDrawableGradient_angle, (float) bVar.f5141c)) % 360;
            if (i2 % 45 == 0) {
                bVar.f5141c = i2;
                if (i2 == 0) {
                    bVar.f5142d = C1424c.LEFT_RIGHT;
                } else if (i2 == 45) {
                    bVar.f5142d = C1424c.BL_TR;
                } else if (i2 == 90) {
                    bVar.f5142d = C1424c.BOTTOM_TOP;
                } else if (i2 == 135) {
                    bVar.f5142d = C1424c.BR_TL;
                } else if (i2 == 180) {
                    bVar.f5142d = C1424c.RIGHT_LEFT;
                } else if (i2 == 225) {
                    bVar.f5142d = C1424c.TR_BL;
                } else if (i2 == 270) {
                    bVar.f5142d = C1424c.TOP_BOTTOM;
                } else if (i2 == 315) {
                    bVar.f5142d = C1424c.TL_BR;
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(typedArray.getPositionDescription());
                sb.append("<gradient> tag requires 'angle' attribute to be a multiple of 45");
                throw new XmlPullParserException(sb.toString());
            }
        } else {
            TypedValue peekValue = typedArray.peekValue(C7771g.SmoothRectDrawableGradient_gradientRadius);
            if (peekValue != null) {
                int i3 = peekValue.type;
                if (i3 == 6) {
                    f = peekValue.getFraction(1.0f, 1.0f);
                    i = ((peekValue.data >> 0) & 15) == 1 ? 2 : 1;
                } else {
                    f = i3 == 5 ? peekValue.getDimension(resources.getDisplayMetrics()) : peekValue.getFloat();
                }
                bVar.f5123A = f;
                bVar.f5124B = i;
            } else if (bVar.f5140b == 1) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(typedArray.getPositionDescription());
                sb2.append("<gradient> tag requires 'gradientRadius' attribute with radial type");
                throw new XmlPullParserException(sb2.toString());
            }
        }
    }

    private void updateGradientDrawablePadding(TypedArray typedArray) {
        C1423b bVar = this.mGradientState;
        bVar.f5139a |= typedArray.getChangingConfigurations();
        if (bVar.f5155q == null) {
            bVar.f5155q = new Rect();
        }
        Rect rect = bVar.f5155q;
        rect.set(typedArray.getDimensionPixelOffset(C7771g.SmoothRectDrawablePadding_left, rect.left), typedArray.getDimensionPixelOffset(C7771g.SmoothRectDrawablePadding_top, rect.top), typedArray.getDimensionPixelOffset(C7771g.SmoothRectDrawablePadding_right, rect.right), typedArray.getDimensionPixelOffset(C7771g.SmoothRectDrawablePadding_bottom, rect.bottom));
        this.mPadding = rect;
    }

    private void updateGradientDrawableSize(TypedArray typedArray) {
        C1423b bVar = this.mGradientState;
        bVar.f5139a |= typedArray.getChangingConfigurations();
        bVar.f5133K = C7778d.m18883a(typedArray);
        bVar.f5156r = typedArray.getDimensionPixelSize(C7771g.SmoothRectDrawableSize_width, bVar.f5156r);
        bVar.f5157s = typedArray.getDimensionPixelSize(C7771g.SmoothRectDrawableSize_height, bVar.f5157s);
    }

    private void updateGradientDrawableSolid(TypedArray typedArray) {
        C1423b bVar = this.mGradientState;
        bVar.f5139a |= typedArray.getChangingConfigurations();
        bVar.f5135M = C7778d.m18883a(typedArray);
        ColorStateList colorStateList = typedArray.getColorStateList(C7771g.SmoothRectDrawableSolid_color);
        if (colorStateList != null) {
            setColor(colorStateList);
        }
    }

    private void updateGradientDrawableStroke(TypedArray typedArray) {
        C1423b bVar = this.mGradientState;
        bVar.f5139a |= typedArray.getChangingConfigurations();
        bVar.f5136N = C7778d.m18883a(typedArray);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(C7771g.SmoothRectDrawableStroke_width, Math.max(0, bVar.f5149k));
        float dimension = typedArray.getDimension(C7771g.SmoothRectDrawableStroke_dashWidth, bVar.f5150l);
        ColorStateList colorStateList = typedArray.getColorStateList(C7771g.SmoothRectDrawableStroke_color);
        if (colorStateList == null) {
            colorStateList = bVar.f5144f;
        }
        if (dimension != 0.0f) {
            setStroke(dimensionPixelSize, colorStateList, dimension, typedArray.getDimension(C7771g.SmoothRectDrawableStroke_dashGap, bVar.f5151m));
        } else {
            setStroke(dimensionPixelSize, colorStateList);
        }
    }

    private void updateLocalState(Resources resources) {
        C1423b bVar = this.mGradientState;
        if (bVar.f5143e != null) {
            this.mFillPaint.setColor(bVar.f5143e.getColorForState(getState(), 0));
        } else if (bVar.f5145g == null) {
            this.mFillPaint.setColor(0);
        } else {
            this.mFillPaint.setColor(-16777216);
        }
        this.mPadding = bVar.f5155q;
        if (bVar.f5149k >= 0) {
            this.mStrokePaint = new Paint(1);
            this.mStrokePaint.setStyle(Style.STROKE);
            this.mStrokePaint.setStrokeWidth((float) bVar.f5149k);
            if (bVar.f5144f != null) {
                this.mStrokePaint.setColor(bVar.f5144f.getColorForState(getState(), 0));
            }
            float f = bVar.f5150l;
            if (f != 0.0f) {
                this.mStrokePaint.setPathEffect(new DashPathEffect(new float[]{f, bVar.f5151m}, 0.0f));
            }
        }
        this.mTintFilter = updateTintFilter(this.mTintFilter, bVar.f5129G, bVar.f5130H);
        this.mGradientIsDirty = true;
        bVar.m6493a();
    }

    private void updateStateFromTypedArray(TypedArray typedArray) {
        C1423b bVar = this.mGradientState;
        bVar.f5139a |= typedArray.getChangingConfigurations();
        bVar.f5162x = typedArray.getBoolean(C7771g.SmoothRectDrawable_dither, bVar.f5162x);
        int i = typedArray.getInt(C7771g.SmoothRectDrawable_tintMode, -1);
        if (i != -1) {
            bVar.f5130H = parseTintMode(i, Mode.SRC_IN);
        }
        ColorStateList colorStateList = typedArray.getColorStateList(C7771g.SmoothRectDrawable_tint);
        if (colorStateList != null) {
            bVar.f5129G = colorStateList;
        }
    }

    public void applyTheme(Theme theme) {
        super.applyTheme(theme);
        C1423b bVar = this.mGradientState;
        if (bVar != null) {
            bVar.mo6782a(resolveDensity(theme.getResources(), 0));
            int[] iArr = bVar.f5132J;
            if (iArr != null) {
                TypedArray a = C7776c.m18880a(theme, iArr, C7771g.SmoothRectDrawable);
                updateStateFromTypedArray(a);
                a.recycle();
            }
            ColorStateList colorStateList = bVar.f5129G;
            if (colorStateList != null && C7772a.m18876a(colorStateList)) {
                bVar.f5129G = C7772a.m18874a(bVar.f5129G, theme);
            }
            ColorStateList colorStateList2 = bVar.f5143e;
            if (colorStateList2 != null && C7772a.m18876a(colorStateList2)) {
                bVar.f5143e = C7772a.m18874a(bVar.f5143e, theme);
            }
            ColorStateList colorStateList3 = bVar.f5144f;
            if (colorStateList3 != null && C7772a.m18876a(colorStateList3)) {
                bVar.f5144f = C7772a.m18874a(bVar.f5144f, theme);
            }
            applyThemeChildElements(theme);
            updateLocalState(theme.getResources());
        }
    }

    public boolean canApplyTheme() {
        C1423b bVar = this.mGradientState;
        return (bVar != null && bVar.canApplyTheme()) || super.canApplyTheme();
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0125  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void draw(android.graphics.Canvas r17) {
        /*
            r16 = this;
            r0 = r16
            r7 = r17
            boolean r1 = r16.ensureValidRect()
            if (r1 != 0) goto L_0x000b
            return
        L_0x000b:
            android.graphics.Paint r1 = r0.mFillPaint
            int r8 = r1.getAlpha()
            android.graphics.Paint r1 = r0.mStrokePaint
            r2 = 0
            if (r1 == 0) goto L_0x001c
            int r1 = r1.getAlpha()
            r9 = r1
            goto L_0x001d
        L_0x001c:
            r9 = 0
        L_0x001d:
            int r1 = r0.modulateAlpha(r8)
            int r3 = r0.modulateAlpha(r9)
            r4 = 1
            r10 = 0
            if (r3 <= 0) goto L_0x0037
            android.graphics.Paint r5 = r0.mStrokePaint
            if (r5 == 0) goto L_0x0037
            float r5 = r5.getStrokeWidth()
            int r5 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r5 <= 0) goto L_0x0037
            r11 = 1
            goto L_0x0038
        L_0x0037:
            r11 = 0
        L_0x0038:
            if (r1 <= 0) goto L_0x003c
            r5 = 1
            goto L_0x003d
        L_0x003c:
            r5 = 0
        L_0x003d:
            app.zenly.android.feature.polenta.graphics.drawable.SmoothRectDrawable$b r12 = r0.mGradientState
            android.graphics.ColorFilter r6 = r0.mColorFilter
            if (r6 == 0) goto L_0x0044
            goto L_0x0046
        L_0x0044:
            android.graphics.PorterDuffColorFilter r6 = r0.mTintFilter
        L_0x0046:
            r13 = r6
            if (r11 == 0) goto L_0x0057
            if (r5 == 0) goto L_0x0057
            r5 = 255(0xff, float:3.57E-43)
            if (r3 >= r5) goto L_0x0057
            int r6 = r0.mAlpha
            if (r6 < r5) goto L_0x0055
            if (r13 == 0) goto L_0x0057
        L_0x0055:
            r14 = 1
            goto L_0x0058
        L_0x0057:
            r14 = 0
        L_0x0058:
            if (r14 == 0) goto L_0x00a5
            android.graphics.Paint r1 = r0.mLayerPaint
            if (r1 != 0) goto L_0x0065
            android.graphics.Paint r1 = new android.graphics.Paint
            r1.<init>()
            r0.mLayerPaint = r1
        L_0x0065:
            android.graphics.Paint r1 = r0.mLayerPaint
            boolean r2 = r12.f5162x
            r1.setDither(r2)
            android.graphics.Paint r1 = r0.mLayerPaint
            int r2 = r0.mAlpha
            r1.setAlpha(r2)
            android.graphics.Paint r1 = r0.mLayerPaint
            r1.setColorFilter(r13)
            android.graphics.Paint r1 = r0.mStrokePaint
            float r1 = r1.getStrokeWidth()
            android.graphics.RectF r2 = r0.mRect
            float r3 = r2.left
            float r3 = r3 - r1
            float r4 = r2.top
            float r4 = r4 - r1
            float r5 = r2.right
            float r5 = r5 + r1
            float r2 = r2.bottom
            float r6 = r2 + r1
            android.graphics.Paint r15 = r0.mLayerPaint
            r1 = r17
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r15
            r1.saveLayer(r2, r3, r4, r5, r6)
            android.graphics.Paint r1 = r0.mFillPaint
            r2 = 0
            r1.setColorFilter(r2)
            android.graphics.Paint r1 = r0.mStrokePaint
            r1.setColorFilter(r2)
            goto L_0x00d8
        L_0x00a5:
            android.graphics.Paint r2 = r0.mFillPaint
            r2.setAlpha(r1)
            android.graphics.Paint r1 = r0.mFillPaint
            boolean r2 = r12.f5162x
            r1.setDither(r2)
            android.graphics.Paint r1 = r0.mFillPaint
            r1.setColorFilter(r13)
            if (r13 == 0) goto L_0x00c5
            android.content.res.ColorStateList r1 = r12.f5143e
            if (r1 != 0) goto L_0x00c5
            android.graphics.Paint r1 = r0.mFillPaint
            int r2 = r0.mAlpha
            int r2 = r2 << 24
            r1.setColor(r2)
        L_0x00c5:
            if (r11 == 0) goto L_0x00d8
            android.graphics.Paint r1 = r0.mStrokePaint
            r1.setAlpha(r3)
            android.graphics.Paint r1 = r0.mStrokePaint
            boolean r2 = r12.f5162x
            r1.setDither(r2)
            android.graphics.Paint r1 = r0.mStrokePaint
            r1.setColorFilter(r13)
        L_0x00d8:
            float[] r1 = r12.f5154p
            if (r1 != 0) goto L_0x010c
            float r1 = r12.f5152n
            int r1 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r1 > 0) goto L_0x010c
            float r1 = r12.f5153o
            int r1 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r1 <= 0) goto L_0x00e9
            goto L_0x010c
        L_0x00e9:
            android.graphics.Paint r1 = r0.mFillPaint
            int r1 = r1.getColor()
            if (r1 != 0) goto L_0x00fb
            if (r13 != 0) goto L_0x00fb
            android.graphics.Paint r1 = r0.mFillPaint
            android.graphics.Shader r1 = r1.getShader()
            if (r1 == 0) goto L_0x0102
        L_0x00fb:
            android.graphics.RectF r1 = r0.mRect
            android.graphics.Paint r2 = r0.mFillPaint
            r7.drawRect(r1, r2)
        L_0x0102:
            if (r11 == 0) goto L_0x011f
            android.graphics.RectF r1 = r0.mRect
            android.graphics.Paint r2 = r0.mStrokePaint
            r7.drawRect(r1, r2)
            goto L_0x011f
        L_0x010c:
            r16.buildPathIfDirty()
            android.graphics.Path r1 = r0.mPath
            android.graphics.Paint r2 = r0.mFillPaint
            r7.drawPath(r1, r2)
            if (r11 == 0) goto L_0x011f
            android.graphics.Path r1 = r0.mPath
            android.graphics.Paint r2 = r0.mStrokePaint
            r7.drawPath(r1, r2)
        L_0x011f:
            if (r14 == 0) goto L_0x0125
            r17.restore()
            goto L_0x0131
        L_0x0125:
            android.graphics.Paint r1 = r0.mFillPaint
            r1.setAlpha(r8)
            if (r11 == 0) goto L_0x0131
            android.graphics.Paint r1 = r0.mStrokePaint
            r1.setAlpha(r9)
        L_0x0131:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: app.zenly.android.feature.polenta.graphics.drawable.SmoothRectDrawable.draw(android.graphics.Canvas):void");
    }

    public int getAlpha() {
        return this.mAlpha;
    }

    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.mGradientState.getChangingConfigurations();
    }

    public ColorStateList getColor() {
        return this.mGradientState.f5143e;
    }

    public ColorFilter getColorFilter() {
        return this.mColorFilter;
    }

    public int[] getColors() {
        int[] iArr = this.mGradientState.f5145g;
        if (iArr == null) {
            return null;
        }
        return (int[]) iArr.clone();
    }

    public ConstantState getConstantState() {
        this.mGradientState.f5139a = getChangingConfigurations();
        return this.mGradientState;
    }

    public float[] getCornerRadii() {
        return (float[]) this.mGradientState.f5154p.clone();
    }

    public float getCornerRadius() {
        return this.mGradientState.f5152n;
    }

    public float getCornerRadiusRatio() {
        return this.mGradientState.f5153o;
    }

    public float getGradientCenterX() {
        return this.mGradientState.f5163y;
    }

    public float getGradientCenterY() {
        return this.mGradientState.f5164z;
    }

    public float getGradientRadius() {
        if (this.mGradientState.f5140b != 1) {
            return 0.0f;
        }
        ensureValidRect();
        return this.mGradientRadius;
    }

    public int getGradientType() {
        return this.mGradientState.f5140b;
    }

    public int getIntrinsicHeight() {
        return this.mGradientState.f5157s;
    }

    public int getIntrinsicWidth() {
        return this.mGradientState.f5156r;
    }

    public int getOpacity() {
        return (this.mAlpha != 255 || !this.mGradientState.f5127E || !isOpaqueForState()) ? -3 : -1;
    }

    public C1424c getOrientation() {
        return this.mGradientState.f5142d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001e, code lost:
        if (r2.getAlpha() != r5.mFillPaint.getAlpha()) goto L_0x0022;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0052  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void getOutline(android.graphics.Outline r6) {
        /*
            r5 = this;
            app.zenly.android.feature.polenta.graphics.drawable.SmoothRectDrawable$b r0 = r5.mGradientState
            android.graphics.Rect r1 = r5.getBounds()
            boolean r2 = r0.f5128F
            if (r2 == 0) goto L_0x0022
            app.zenly.android.feature.polenta.graphics.drawable.SmoothRectDrawable$b r2 = r5.mGradientState
            int r2 = r2.f5149k
            if (r2 <= 0) goto L_0x0020
            android.graphics.Paint r2 = r5.mStrokePaint
            if (r2 == 0) goto L_0x0020
            int r2 = r2.getAlpha()
            android.graphics.Paint r3 = r5.mFillPaint
            int r3 = r3.getAlpha()
            if (r2 != r3) goto L_0x0022
        L_0x0020:
            r2 = 1
            goto L_0x0023
        L_0x0022:
            r2 = 0
        L_0x0023:
            r3 = 0
            if (r2 == 0) goto L_0x0035
            android.graphics.Paint r2 = r5.mFillPaint
            int r2 = r2.getAlpha()
            int r2 = r5.modulateAlpha(r2)
            float r2 = (float) r2
            r4 = 1132396544(0x437f0000, float:255.0)
            float r2 = r2 / r4
            goto L_0x0036
        L_0x0035:
            r2 = 0
        L_0x0036:
            r6.setAlpha(r2)
            float[] r2 = r0.f5154p
            if (r2 == 0) goto L_0x0052
            android.graphics.Path r2 = new android.graphics.Path
            r2.<init>()
            android.graphics.RectF r3 = new android.graphics.RectF
            r3.<init>(r1)
            float[] r0 = r0.f5154p
            android.graphics.Path$Direction r1 = android.graphics.Path.Direction.CW
            r2.addRoundRect(r3, r0, r1)
            r6.setConvexPath(r2)
            goto L_0x0078
        L_0x0052:
            float r2 = r0.f5152n
            int r4 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r4 <= 0) goto L_0x005c
            r6.setRoundRect(r1, r2)
            goto L_0x0078
        L_0x005c:
            float r0 = r0.f5153o
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x0075
            int r2 = r1.width()
            int r3 = r1.height()
            int r2 = java.lang.Math.min(r2, r3)
            float r2 = (float) r2
            float r0 = r0 * r2
            r6.setRoundRect(r1, r0)
            goto L_0x0078
        L_0x0075:
            r6.setRect(r1)
        L_0x0078:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: app.zenly.android.feature.polenta.graphics.drawable.SmoothRectDrawable.getOutline(android.graphics.Outline):void");
    }

    public boolean getPadding(Rect rect) {
        Rect rect2 = this.mPadding;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    public boolean getUseLevel() {
        return this.mGradientState.f5125C;
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) throws XmlPullParserException, IOException {
        super.inflate(resources, xmlPullParser, attributeSet, theme);
        this.mGradientState.mo6782a(resolveDensity(resources, 0));
        TypedArray obtainAttributes = obtainAttributes(resources, theme, attributeSet, C7771g.SmoothRectDrawable);
        updateStateFromTypedArray(obtainAttributes);
        obtainAttributes.recycle();
        inflateChildElements(resources, xmlPullParser, attributeSet, theme);
        updateLocalState(resources);
    }

    public boolean isStateful() {
        C1423b bVar = this.mGradientState;
        if (!super.isStateful()) {
            ColorStateList colorStateList = bVar.f5143e;
            if (colorStateList == null || !colorStateList.isStateful()) {
                ColorStateList colorStateList2 = bVar.f5144f;
                if (colorStateList2 == null || !colorStateList2.isStateful()) {
                    ColorStateList colorStateList3 = bVar.f5129G;
                    if (colorStateList3 == null || !colorStateList3.isStateful()) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public Drawable mutate() {
        if (!this.mMutated && super.mutate() == this) {
            this.mGradientState = new C1423b(this.mGradientState, (Resources) null);
            updateLocalState(null);
            this.mMutated = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.mPathIsDirty = true;
        this.mGradientIsDirty = true;
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        super.onLevelChange(i);
        this.mGradientIsDirty = true;
        this.mPathIsDirty = true;
        invalidateSelf();
        return true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0049 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onStateChange(int[] r7) {
        /*
            r6 = this;
            app.zenly.android.feature.polenta.graphics.drawable.SmoothRectDrawable$b r0 = r6.mGradientState
            android.content.res.ColorStateList r1 = r0.f5143e
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x001b
            int r1 = r1.getColorForState(r7, r3)
            android.graphics.Paint r4 = r6.mFillPaint
            int r4 = r4.getColor()
            if (r4 == r1) goto L_0x001b
            android.graphics.Paint r4 = r6.mFillPaint
            r4.setColor(r1)
            r1 = 1
            goto L_0x001c
        L_0x001b:
            r1 = 0
        L_0x001c:
            android.graphics.Paint r4 = r6.mStrokePaint
            if (r4 == 0) goto L_0x0032
            android.content.res.ColorStateList r5 = r0.f5144f
            if (r5 == 0) goto L_0x0032
            int r7 = r5.getColorForState(r7, r3)
            int r5 = r4.getColor()
            if (r5 == r7) goto L_0x0032
            r4.setColor(r7)
            r1 = 1
        L_0x0032:
            android.content.res.ColorStateList r7 = r0.f5129G
            if (r7 == 0) goto L_0x0043
            android.graphics.PorterDuff$Mode r0 = r0.f5130H
            if (r0 == 0) goto L_0x0043
            android.graphics.PorterDuffColorFilter r1 = r6.mTintFilter
            android.graphics.PorterDuffColorFilter r7 = r6.updateTintFilter(r1, r7, r0)
            r6.mTintFilter = r7
            r1 = 1
        L_0x0043:
            if (r1 == 0) goto L_0x0049
            r6.invalidateSelf()
            return r2
        L_0x0049:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: app.zenly.android.feature.polenta.graphics.drawable.SmoothRectDrawable.onStateChange(int[]):boolean");
    }

    public void setAlpha(int i) {
        if (i != this.mAlpha) {
            this.mAlpha = i;
            invalidateSelf();
        }
    }

    public void setAntiAlias(boolean z) {
        this.mFillPaint.setAntiAlias(z);
    }

    public void setColor(int i) {
        this.mGradientState.mo6785a(ColorStateList.valueOf(i));
        this.mFillPaint.setColor(i);
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        if (colorFilter != this.mColorFilter) {
            this.mColorFilter = colorFilter;
            invalidateSelf();
        }
    }

    public void setColors(int[] iArr) {
        this.mGradientState.mo6787a(iArr);
        this.mGradientIsDirty = true;
        invalidateSelf();
    }

    public void setCornerRadii(float[] fArr) {
        this.mGradientState.mo6786a(fArr);
        this.mPathIsDirty = true;
        invalidateSelf();
    }

    public void setCornerRadius(float f) {
        this.mGradientState.mo6779a(f);
        this.mPathIsDirty = true;
        invalidateSelf();
    }

    public void setCornerRadiusRatio(float f) {
        this.mGradientState.mo6788b(f);
        this.mPathIsDirty = true;
        invalidateSelf();
    }

    public void setDither(boolean z) {
        C1423b bVar = this.mGradientState;
        if (z != bVar.f5162x) {
            bVar.f5162x = z;
            invalidateSelf();
        }
    }

    public void setGradientCenter(float f, float f2) {
        this.mGradientState.mo6780a(f, f2);
        this.mGradientIsDirty = true;
        invalidateSelf();
    }

    public void setGradientRadius(float f) {
        this.mGradientState.mo6781a(f, 0);
        this.mGradientIsDirty = true;
        invalidateSelf();
    }

    public void setGradientType(int i) {
        this.mGradientState.mo6789b(i);
        this.mGradientIsDirty = true;
        invalidateSelf();
    }

    public void setOrientation(C1424c cVar) {
        this.mGradientState.f5142d = cVar;
        this.mGradientIsDirty = true;
        invalidateSelf();
    }

    public void setSize(int i, int i2) {
        this.mGradientState.mo6783a(i, i2);
        this.mPathIsDirty = true;
        invalidateSelf();
    }

    public void setStroke(int i, int i2) {
        setStroke(i, i2, 0.0f, 0.0f);
    }

    public void setTintList(ColorStateList colorStateList) {
        C1423b bVar = this.mGradientState;
        bVar.f5129G = colorStateList;
        this.mTintFilter = updateTintFilter(this.mTintFilter, colorStateList, bVar.f5130H);
        invalidateSelf();
    }

    public void setTintMode(Mode mode) {
        C1423b bVar = this.mGradientState;
        bVar.f5130H = mode;
        this.mTintFilter = updateTintFilter(this.mTintFilter, bVar.f5129G, mode);
        invalidateSelf();
    }

    public void setUseLevel(boolean z) {
        this.mGradientState.f5125C = z;
        this.mGradientIsDirty = true;
        invalidateSelf();
    }

    /* access modifiers changed from: 0000 */
    public PorterDuffColorFilter updateTintFilter(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public SmoothRectDrawable() {
        this(new C1423b(C1424c.TOP_BOTTOM, (int[]) null), (Resources) null);
    }

    public void setStroke(int i, ColorStateList colorStateList) {
        setStroke(i, colorStateList, 0.0f, 0.0f);
    }

    public SmoothRectDrawable(C1424c cVar, int[] iArr) {
        this(new C1423b(cVar, iArr), (Resources) null);
    }

    public void setStroke(int i, int i2, float f, float f2) {
        this.mGradientState.mo6784a(i, ColorStateList.valueOf(i2), f, f2);
        setStrokeInternal(i, i2, f, f2);
    }

    private SmoothRectDrawable(C1423b bVar, Resources resources) {
        this.mFillPaint = new Paint(1);
        this.mAlpha = 255;
        this.mPath = new Path();
        this.mRect = new RectF();
        this.mSmoothRectBuilder = new C7780a();
        this.mPathIsDirty = true;
        this.mGradientState = bVar;
        updateLocalState(resources);
    }

    public void setColor(ColorStateList colorStateList) {
        this.mGradientState.mo6785a(colorStateList);
        int i = 0;
        if (colorStateList != null) {
            i = colorStateList.getColorForState(getState(), 0);
        }
        this.mFillPaint.setColor(i);
        invalidateSelf();
    }

    public void setStroke(int i, ColorStateList colorStateList, float f, float f2) {
        this.mGradientState.mo6784a(i, colorStateList, f, f2);
        int i2 = 0;
        if (colorStateList != null) {
            i2 = colorStateList.getColorForState(getState(), 0);
        }
        setStrokeInternal(i, i2, f, f2);
    }
}
