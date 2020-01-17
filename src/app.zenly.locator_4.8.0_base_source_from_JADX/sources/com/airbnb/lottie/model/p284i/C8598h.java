package com.airbnb.lottie.model.p284i;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import com.airbnb.lottie.C8506c;
import com.airbnb.lottie.C8515e;
import com.airbnb.lottie.C8539l;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.content.C8474c;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener;
import com.airbnb.lottie.animation.keyframe.C8502m;
import com.airbnb.lottie.animation.keyframe.C8504o;
import com.airbnb.lottie.model.C8555b;
import com.airbnb.lottie.model.C8555b.C8556a;
import com.airbnb.lottie.model.C8557c;
import com.airbnb.lottie.model.C8581d;
import com.airbnb.lottie.model.animatable.C8542a;
import com.airbnb.lottie.model.animatable.C8543b;
import com.airbnb.lottie.model.animatable.C8552k;
import com.airbnb.lottie.model.content.C8573m;
import com.airbnb.lottie.p289q.C8658h;
import com.airbnb.lottie.value.C8661c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p214e.p228e.C7576d;

/* renamed from: com.airbnb.lottie.model.i.h */
public class C8598h extends C8586a {

    /* renamed from: A */
    private final Paint f22098A = new C8600b(this, 1);

    /* renamed from: B */
    private final Map<C8581d, List<C8474c>> f22099B = new HashMap();

    /* renamed from: C */
    private final C7576d<String> f22100C = new C7576d<>();

    /* renamed from: D */
    private final C8502m f22101D;

    /* renamed from: E */
    private final C8515e f22102E;

    /* renamed from: F */
    private final C8506c f22103F;

    /* renamed from: G */
    private BaseKeyframeAnimation<Integer, Integer> f22104G;

    /* renamed from: H */
    private BaseKeyframeAnimation<Integer, Integer> f22105H;

    /* renamed from: I */
    private BaseKeyframeAnimation<Float, Float> f22106I;

    /* renamed from: J */
    private BaseKeyframeAnimation<Float, Float> f22107J;

    /* renamed from: w */
    private final StringBuilder f22108w = new StringBuilder(2);

    /* renamed from: x */
    private final RectF f22109x = new RectF();

    /* renamed from: y */
    private final Matrix f22110y = new Matrix();

    /* renamed from: z */
    private final Paint f22111z = new C8599a(this, 1);

    /* renamed from: com.airbnb.lottie.model.i.h$a */
    class C8599a extends Paint {
        C8599a(C8598h hVar, int i) {
            super(i);
            setStyle(Style.FILL);
        }
    }

    /* renamed from: com.airbnb.lottie.model.i.h$b */
    class C8600b extends Paint {
        C8600b(C8598h hVar, int i) {
            super(i);
            setStyle(Style.STROKE);
        }
    }

    /* renamed from: com.airbnb.lottie.model.i.h$c */
    static /* synthetic */ class C8601c {

        /* renamed from: a */
        static final /* synthetic */ int[] f22112a = new int[C8556a.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                com.airbnb.lottie.model.b$a[] r0 = com.airbnb.lottie.model.C8555b.C8556a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f22112a = r0
                int[] r0 = f22112a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.airbnb.lottie.model.b$a r1 = com.airbnb.lottie.model.C8555b.C8556a.LEFT_ALIGN     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f22112a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.airbnb.lottie.model.b$a r1 = com.airbnb.lottie.model.C8555b.C8556a.RIGHT_ALIGN     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f22112a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.airbnb.lottie.model.b$a r1 = com.airbnb.lottie.model.C8555b.C8556a.CENTER     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.model.p284i.C8598h.C8601c.<clinit>():void");
        }
    }

    C8598h(C8515e eVar, C8592d dVar) {
        super(eVar, dVar);
        this.f22102E = eVar;
        this.f22103F = dVar.mo23189a();
        this.f22101D = dVar.mo23206q().createAnimation();
        this.f22101D.mo22897a((AnimationListener) this);
        mo23182a((BaseKeyframeAnimation<?, ?>) this.f22101D);
        C8552k r = dVar.mo23207r();
        if (r != null) {
            C8542a aVar = r.f21856a;
            if (aVar != null) {
                this.f22104G = aVar.createAnimation();
                this.f22104G.mo22897a((AnimationListener) this);
                mo23182a(this.f22104G);
            }
        }
        if (r != null) {
            C8542a aVar2 = r.f21857b;
            if (aVar2 != null) {
                this.f22105H = aVar2.createAnimation();
                this.f22105H.mo22897a((AnimationListener) this);
                mo23182a(this.f22105H);
            }
        }
        if (r != null) {
            C8543b bVar = r.f21858c;
            if (bVar != null) {
                this.f22106I = bVar.createAnimation();
                this.f22106I.mo22897a((AnimationListener) this);
                mo23182a(this.f22106I);
            }
        }
        if (r != null) {
            C8543b bVar2 = r.f21859d;
            if (bVar2 != null) {
                this.f22107J = bVar2.createAnimation();
                this.f22107J.mo22897a((AnimationListener) this);
                mo23182a(this.f22107J);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo23181a(Canvas canvas, Matrix matrix, int i) {
        canvas.save();
        if (!this.f22102E.mo23018w()) {
            canvas.setMatrix(matrix);
        }
        C8555b bVar = (C8555b) this.f22101D.mo22903f();
        C8557c cVar = (C8557c) this.f22103F.mo22937f().get(bVar.f21871b);
        if (cVar == null) {
            canvas.restore();
            return;
        }
        BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation = this.f22104G;
        if (baseKeyframeAnimation != null) {
            this.f22111z.setColor(((Integer) baseKeyframeAnimation.mo22903f()).intValue());
        } else {
            this.f22111z.setColor(bVar.f21877h);
        }
        BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation2 = this.f22105H;
        if (baseKeyframeAnimation2 != null) {
            this.f22098A.setColor(((Integer) baseKeyframeAnimation2.mo22903f()).intValue());
        } else {
            this.f22098A.setColor(bVar.f21878i);
        }
        int intValue = ((this.f22040u.mo22922c() == null ? 100 : ((Integer) this.f22040u.mo22922c().mo22903f()).intValue()) * 255) / 100;
        this.f22111z.setAlpha(intValue);
        this.f22098A.setAlpha(intValue);
        BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation3 = this.f22106I;
        if (baseKeyframeAnimation3 != null) {
            this.f22098A.setStrokeWidth(((Float) baseKeyframeAnimation3.mo22903f()).floatValue());
        } else {
            this.f22098A.setStrokeWidth((float) (bVar.f21879j * ((double) C8658h.m20192a()) * ((double) C8658h.m20194a(matrix))));
        }
        if (this.f22102E.mo23018w()) {
            m19984a(bVar, matrix, cVar, canvas);
        } else {
            m19985a(bVar, cVar, matrix, canvas);
        }
        canvas.restore();
    }

    public <T> void addValueCallback(T t, C8661c<T> cVar) {
        super.addValueCallback(t, cVar);
        if (t == LottieProperty.f21543a) {
            BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation = this.f22104G;
            if (baseKeyframeAnimation != null) {
                baseKeyframeAnimation.mo22898a(cVar);
            } else if (cVar == null) {
                if (baseKeyframeAnimation != null) {
                    mo23185b(baseKeyframeAnimation);
                }
                this.f22104G = null;
            } else {
                this.f22104G = new C8504o(cVar);
                this.f22104G.mo22897a((AnimationListener) this);
                mo23182a(this.f22104G);
            }
        } else if (t == LottieProperty.f21544b) {
            BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation2 = this.f22105H;
            if (baseKeyframeAnimation2 != null) {
                baseKeyframeAnimation2.mo22898a(cVar);
            } else if (cVar == null) {
                if (baseKeyframeAnimation2 != null) {
                    mo23185b(baseKeyframeAnimation2);
                }
                this.f22105H = null;
            } else {
                this.f22105H = new C8504o(cVar);
                this.f22105H.mo22897a((AnimationListener) this);
                mo23182a(this.f22105H);
            }
        } else if (t == LottieProperty.f21557o) {
            BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation3 = this.f22106I;
            if (baseKeyframeAnimation3 != null) {
                baseKeyframeAnimation3.mo22898a(cVar);
            } else if (cVar == null) {
                if (baseKeyframeAnimation3 != null) {
                    mo23185b(baseKeyframeAnimation3);
                }
                this.f22106I = null;
            } else {
                this.f22106I = new C8504o(cVar);
                this.f22106I.mo22897a((AnimationListener) this);
                mo23182a(this.f22106I);
            }
        } else if (t == LottieProperty.f21558p) {
            BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation4 = this.f22107J;
            if (baseKeyframeAnimation4 != null) {
                baseKeyframeAnimation4.mo22898a(cVar);
            } else if (cVar == null) {
                if (baseKeyframeAnimation4 != null) {
                    mo23185b(baseKeyframeAnimation4);
                }
                this.f22107J = null;
            } else {
                this.f22107J = new C8504o(cVar);
                this.f22107J.mo22897a((AnimationListener) this);
                mo23182a(this.f22107J);
            }
        }
    }

    public void getBounds(RectF rectF, Matrix matrix, boolean z) {
        super.getBounds(rectF, matrix, z);
        rectF.set(0.0f, 0.0f, (float) this.f22103F.mo22924a().width(), (float) this.f22103F.mo22924a().height());
    }

    /* renamed from: a */
    private void m19984a(C8555b bVar, Matrix matrix, C8557c cVar, Canvas canvas) {
        C8555b bVar2 = bVar;
        Canvas canvas2 = canvas;
        float f = ((float) bVar2.f21872c) / 100.0f;
        float a = C8658h.m20194a(matrix);
        float a2 = ((float) bVar2.f21875f) * C8658h.m20192a();
        List a3 = m19981a(bVar2.f21870a);
        int size = a3.size();
        int i = 0;
        while (i < size) {
            String str = (String) a3.get(i);
            float a4 = m19978a(str, cVar, f, a);
            canvas.save();
            m19983a(bVar2.f21873d, canvas2, a4);
            canvas2.translate(0.0f, (((float) i) * a2) - ((((float) (size - 1)) * a2) / 2.0f));
            int i2 = i;
            m19990a(str, bVar, matrix, cVar, canvas, a, f);
            canvas.restore();
            i = i2 + 1;
        }
    }

    /* renamed from: a */
    private void m19990a(String str, C8555b bVar, Matrix matrix, C8557c cVar, Canvas canvas, float f, float f2) {
        for (int i = 0; i < str.length(); i++) {
            C8581d dVar = (C8581d) this.f22103F.mo22931b().mo19617a(C8581d.m19901a(str.charAt(i), cVar.mo23061a(), cVar.mo23063c()));
            if (dVar != null) {
                m19986a(dVar, matrix, f2, bVar, canvas);
                float b = ((float) dVar.mo23162b()) * f2 * C8658h.m20192a() * f;
                float f3 = ((float) bVar.f21874e) / 10.0f;
                BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation = this.f22107J;
                if (baseKeyframeAnimation != null) {
                    f3 += ((Float) baseKeyframeAnimation.mo22903f()).floatValue();
                }
                canvas.translate(b + (f3 * f), 0.0f);
            }
        }
    }

    /* renamed from: a */
    private void m19985a(C8555b bVar, C8557c cVar, Matrix matrix, Canvas canvas) {
        float a = C8658h.m20194a(matrix);
        Typeface a2 = this.f22102E.mo22954a(cVar.mo23061a(), cVar.mo23063c());
        if (a2 != null) {
            String str = bVar.f21870a;
            C8539l p = this.f22102E.mo23005p();
            if (p == null) {
                this.f22111z.setTypeface(a2);
                this.f22111z.setTextSize((float) (bVar.f21872c * ((double) C8658h.m20192a())));
                this.f22098A.setTypeface(this.f22111z.getTypeface());
                this.f22098A.setTextSize(this.f22111z.getTextSize());
                float a3 = ((float) bVar.f21875f) * C8658h.m20192a();
                List a4 = m19981a(str);
                int size = a4.size();
                for (int i = 0; i < size; i++) {
                    String str2 = (String) a4.get(i);
                    m19983a(bVar.f21873d, canvas, this.f22098A.measureText(str2));
                    canvas.translate(0.0f, (((float) i) * a3) - ((((float) (size - 1)) * a3) / 2.0f));
                    m19989a(str2, bVar, canvas, a);
                    canvas.setMatrix(matrix);
                }
                return;
            }
            p.mo23037a(str);
            throw null;
        }
    }

    /* renamed from: a */
    private List<String> m19981a(String str) {
        String str2 = "\r";
        return Arrays.asList(str.replaceAll("\r\n", str2).replaceAll("\n", str2).split(str2));
    }

    /* renamed from: a */
    private void m19989a(String str, C8555b bVar, Canvas canvas, float f) {
        int i = 0;
        while (i < str.length()) {
            String a = m19979a(str, i);
            i += a.length();
            m19988a(a, bVar, canvas);
            float measureText = this.f22111z.measureText(a, 0, 1);
            float f2 = ((float) bVar.f21874e) / 10.0f;
            BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation = this.f22107J;
            if (baseKeyframeAnimation != null) {
                f2 += ((Float) baseKeyframeAnimation.mo22903f()).floatValue();
            }
            canvas.translate(measureText + (f2 * f), 0.0f);
        }
    }

    /* renamed from: a */
    private float m19978a(String str, C8557c cVar, float f, float f2) {
        float f3 = 0.0f;
        for (int i = 0; i < str.length(); i++) {
            C8581d dVar = (C8581d) this.f22103F.mo22931b().mo19617a(C8581d.m19901a(str.charAt(i), cVar.mo23061a(), cVar.mo23063c()));
            if (dVar != null) {
                f3 = (float) (((double) f3) + (dVar.mo23162b() * ((double) f) * ((double) C8658h.m20192a()) * ((double) f2)));
            }
        }
        return f3;
    }

    /* renamed from: a */
    private void m19983a(C8556a aVar, Canvas canvas, float f) {
        int i = C8601c.f22112a[aVar.ordinal()];
        if (i == 1) {
            return;
        }
        if (i == 2) {
            canvas.translate(-f, 0.0f);
        } else if (i == 3) {
            canvas.translate((-f) / 2.0f, 0.0f);
        }
    }

    /* renamed from: a */
    private void m19986a(C8581d dVar, Matrix matrix, float f, C8555b bVar, Canvas canvas) {
        List a = m19980a(dVar);
        for (int i = 0; i < a.size(); i++) {
            Path a2 = ((C8474c) a.get(i)).mo22884a();
            a2.computeBounds(this.f22109x, false);
            this.f22110y.set(matrix);
            this.f22110y.preTranslate(0.0f, ((float) (-bVar.f21876g)) * C8658h.m20192a());
            this.f22110y.preScale(f, f);
            a2.transform(this.f22110y);
            if (bVar.f21880k) {
                m19982a(a2, this.f22111z, canvas);
                m19982a(a2, this.f22098A, canvas);
            } else {
                m19982a(a2, this.f22098A, canvas);
                m19982a(a2, this.f22111z, canvas);
            }
        }
    }

    /* renamed from: a */
    private void m19982a(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() != Style.STROKE || paint.getStrokeWidth() != 0.0f) {
                canvas.drawPath(path, paint);
            }
        }
    }

    /* renamed from: a */
    private void m19988a(String str, C8555b bVar, Canvas canvas) {
        if (bVar.f21880k) {
            m19987a(str, this.f22111z, canvas);
            m19987a(str, this.f22098A, canvas);
            return;
        }
        m19987a(str, this.f22098A, canvas);
        m19987a(str, this.f22111z, canvas);
    }

    /* renamed from: a */
    private void m19987a(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() != Style.STROKE || paint.getStrokeWidth() != 0.0f) {
                canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
            }
        }
    }

    /* renamed from: a */
    private List<C8474c> m19980a(C8581d dVar) {
        if (this.f22099B.containsKey(dVar)) {
            return (List) this.f22099B.get(dVar);
        }
        List a = dVar.mo23161a();
        int size = a.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(new C8474c(this.f22102E, this, (C8573m) a.get(i)));
        }
        this.f22099B.put(dVar, arrayList);
        return arrayList;
    }

    /* renamed from: a */
    private String m19979a(String str, int i) {
        int codePointAt = str.codePointAt(i);
        int charCount = Character.charCount(codePointAt) + i;
        while (charCount < str.length()) {
            int codePointAt2 = str.codePointAt(charCount);
            if (!m19991a(codePointAt2)) {
                break;
            }
            charCount += Character.charCount(codePointAt2);
            codePointAt = (codePointAt * 31) + codePointAt2;
        }
        long j = (long) codePointAt;
        if (this.f22100C.mo19508a(j)) {
            return (String) this.f22100C.mo19513c(j);
        }
        this.f22108w.setLength(0);
        while (i < charCount) {
            int codePointAt3 = str.codePointAt(i);
            this.f22108w.appendCodePoint(codePointAt3);
            i += Character.charCount(codePointAt3);
        }
        String sb = this.f22108w.toString();
        this.f22100C.mo19514c(j, sb);
        return sb;
    }

    /* renamed from: a */
    private boolean m19991a(int i) {
        return Character.getType(i) == 16 || Character.getType(i) == 27 || Character.getType(i) == 6 || Character.getType(i) == 28 || Character.getType(i) == 19;
    }
}
