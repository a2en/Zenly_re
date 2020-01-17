package com.airbnb.lottie.model.p284i;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build.VERSION;
import com.airbnb.lottie.C8505b;
import com.airbnb.lottie.C8506c;
import com.airbnb.lottie.C8515e;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.animation.content.DrawingContent;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener;
import com.airbnb.lottie.animation.keyframe.C8491b;
import com.airbnb.lottie.animation.keyframe.C8495f;
import com.airbnb.lottie.animation.keyframe.C8503n;
import com.airbnb.lottie.model.C8582e;
import com.airbnb.lottie.model.KeyPathElement;
import com.airbnb.lottie.model.content.C8563f;
import com.airbnb.lottie.model.content.C8563f.C8564a;
import com.airbnb.lottie.model.content.C8571k;
import com.airbnb.lottie.model.p284i.C8592d.C8593a;
import com.airbnb.lottie.model.p284i.C8592d.C8594b;
import com.airbnb.lottie.p283m.C8540a;
import com.airbnb.lottie.p289q.C8654d;
import com.airbnb.lottie.p289q.C8658h;
import com.airbnb.lottie.value.C8661c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.airbnb.lottie.model.i.a */
public abstract class C8586a implements DrawingContent, AnimationListener, KeyPathElement {

    /* renamed from: a */
    private final Path f22020a = new Path();

    /* renamed from: b */
    private final Matrix f22021b = new Matrix();

    /* renamed from: c */
    private final Paint f22022c = new C8540a(1);

    /* renamed from: d */
    private final Paint f22023d = new C8540a(1, Mode.DST_IN);

    /* renamed from: e */
    private final Paint f22024e = new C8540a(1, Mode.DST_OUT);

    /* renamed from: f */
    private final Paint f22025f = new C8540a(1);

    /* renamed from: g */
    private final Paint f22026g = new C8540a(Mode.CLEAR);

    /* renamed from: h */
    private final RectF f22027h = new RectF();

    /* renamed from: i */
    private final RectF f22028i = new RectF();

    /* renamed from: j */
    private final RectF f22029j = new RectF();

    /* renamed from: k */
    private final RectF f22030k = new RectF();

    /* renamed from: l */
    private final String f22031l;

    /* renamed from: m */
    final Matrix f22032m = new Matrix();

    /* renamed from: n */
    final C8515e f22033n;

    /* renamed from: o */
    final C8592d f22034o;

    /* renamed from: p */
    private C8495f f22035p;

    /* renamed from: q */
    private C8586a f22036q;

    /* renamed from: r */
    private C8586a f22037r;

    /* renamed from: s */
    private List<C8586a> f22038s;

    /* renamed from: t */
    private final List<BaseKeyframeAnimation<?, ?>> f22039t = new ArrayList();

    /* renamed from: u */
    final C8503n f22040u;

    /* renamed from: v */
    private boolean f22041v = true;

    /* renamed from: com.airbnb.lottie.model.i.a$a */
    class C8587a implements AnimationListener {

        /* renamed from: a */
        final /* synthetic */ C8491b f22042a;

        C8587a(C8491b bVar) {
            this.f22042a = bVar;
        }

        public void onValueChanged() {
            C8586a.this.m19925a(this.f22042a.mo22907i() == 1.0f);
        }
    }

    /* renamed from: com.airbnb.lottie.model.i.a$b */
    static /* synthetic */ class C8588b {

        /* renamed from: a */
        static final /* synthetic */ int[] f22044a = new int[C8593a.values().length];

        /* renamed from: b */
        static final /* synthetic */ int[] f22045b = new int[C8564a.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|28) */
        /* JADX WARNING: Can't wrap try/catch for region: R(23:0|1|2|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|28) */
        /* JADX WARNING: Can't wrap try/catch for region: R(24:0|1|2|3|5|6|7|(2:9|10)|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|28) */
        /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0047 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0051 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x005c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0067 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0072 */
        static {
            /*
                com.airbnb.lottie.model.content.f$a[] r0 = com.airbnb.lottie.model.content.C8563f.C8564a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f22045b = r0
                r0 = 1
                int[] r1 = f22045b     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.airbnb.lottie.model.content.f$a r2 = com.airbnb.lottie.model.content.C8563f.C8564a.MASK_MODE_SUBTRACT     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                r1 = 2
                int[] r2 = f22045b     // Catch:{ NoSuchFieldError -> 0x001f }
                com.airbnb.lottie.model.content.f$a r3 = com.airbnb.lottie.model.content.C8563f.C8564a.MASK_MODE_INTERSECT     // Catch:{ NoSuchFieldError -> 0x001f }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                r2 = 3
                int[] r3 = f22045b     // Catch:{ NoSuchFieldError -> 0x002a }
                com.airbnb.lottie.model.content.f$a r4 = com.airbnb.lottie.model.content.C8563f.C8564a.MASK_MODE_ADD     // Catch:{ NoSuchFieldError -> 0x002a }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                com.airbnb.lottie.model.i.d$a[] r3 = com.airbnb.lottie.model.p284i.C8592d.C8593a.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f22044a = r3
                int[] r3 = f22044a     // Catch:{ NoSuchFieldError -> 0x003d }
                com.airbnb.lottie.model.i.d$a r4 = com.airbnb.lottie.model.p284i.C8592d.C8593a.SHAPE     // Catch:{ NoSuchFieldError -> 0x003d }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r3[r4] = r0     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                int[] r0 = f22044a     // Catch:{ NoSuchFieldError -> 0x0047 }
                com.airbnb.lottie.model.i.d$a r3 = com.airbnb.lottie.model.p284i.C8592d.C8593a.PRE_COMP     // Catch:{ NoSuchFieldError -> 0x0047 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0047 }
                r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0047 }
            L_0x0047:
                int[] r0 = f22044a     // Catch:{ NoSuchFieldError -> 0x0051 }
                com.airbnb.lottie.model.i.d$a r1 = com.airbnb.lottie.model.p284i.C8592d.C8593a.SOLID     // Catch:{ NoSuchFieldError -> 0x0051 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0051 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0051 }
            L_0x0051:
                int[] r0 = f22044a     // Catch:{ NoSuchFieldError -> 0x005c }
                com.airbnb.lottie.model.i.d$a r1 = com.airbnb.lottie.model.p284i.C8592d.C8593a.IMAGE     // Catch:{ NoSuchFieldError -> 0x005c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005c }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005c }
            L_0x005c:
                int[] r0 = f22044a     // Catch:{ NoSuchFieldError -> 0x0067 }
                com.airbnb.lottie.model.i.d$a r1 = com.airbnb.lottie.model.p284i.C8592d.C8593a.NULL     // Catch:{ NoSuchFieldError -> 0x0067 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0067 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0067 }
            L_0x0067:
                int[] r0 = f22044a     // Catch:{ NoSuchFieldError -> 0x0072 }
                com.airbnb.lottie.model.i.d$a r1 = com.airbnb.lottie.model.p284i.C8592d.C8593a.TEXT     // Catch:{ NoSuchFieldError -> 0x0072 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0072 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0072 }
            L_0x0072:
                int[] r0 = f22044a     // Catch:{ NoSuchFieldError -> 0x007d }
                com.airbnb.lottie.model.i.d$a r1 = com.airbnb.lottie.model.p284i.C8592d.C8593a.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x007d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007d }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x007d }
            L_0x007d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.model.p284i.C8586a.C8588b.<clinit>():void");
        }
    }

    C8586a(C8515e eVar, C8592d dVar) {
        this.f22033n = eVar;
        this.f22034o = dVar;
        StringBuilder sb = new StringBuilder();
        sb.append(dVar.mo23196g());
        sb.append("#draw");
        this.f22031l = sb.toString();
        if (dVar.mo23195f() == C8594b.INVERT) {
            this.f22025f.setXfermode(new PorterDuffXfermode(Mode.DST_OUT));
        } else {
            this.f22025f.setXfermode(new PorterDuffXfermode(Mode.DST_IN));
        }
        this.f22040u = dVar.mo23211u().mo23048a();
        this.f22040u.mo22917a((AnimationListener) this);
        if (dVar.mo23194e() != null && !dVar.mo23194e().isEmpty()) {
            this.f22035p = new C8495f(dVar.mo23194e());
            for (BaseKeyframeAnimation a : this.f22035p.mo22910a()) {
                a.mo22897a((AnimationListener) this);
            }
            for (BaseKeyframeAnimation baseKeyframeAnimation : this.f22035p.mo22912c()) {
                mo23182a(baseKeyframeAnimation);
                baseKeyframeAnimation.mo22897a((AnimationListener) this);
            }
        }
        m19934f();
    }

    /* renamed from: d */
    private void m19931d(Canvas canvas, Matrix matrix, C8563f fVar, BaseKeyframeAnimation<C8571k, Path> baseKeyframeAnimation, BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation2) {
        C8658h.m20198a(canvas, this.f22027h, this.f22023d);
        canvas.drawRect(this.f22027h, this.f22022c);
        this.f22024e.setAlpha((int) (((float) ((Integer) baseKeyframeAnimation2.mo22903f()).intValue()) * 2.55f));
        this.f22020a.set((Path) baseKeyframeAnimation.mo22903f());
        this.f22020a.transform(matrix);
        canvas.drawPath(this.f22020a, this.f22024e);
        canvas.restore();
    }

    /* renamed from: e */
    private void m19932e() {
        this.f22033n.invalidateSelf();
    }

    /* renamed from: f */
    private void m19934f() {
        boolean z = true;
        if (!this.f22034o.mo23192c().isEmpty()) {
            C8491b bVar = new C8491b(this.f22034o.mo23192c());
            bVar.mo22905h();
            bVar.mo22897a((AnimationListener) new C8587a(bVar));
            if (((Float) bVar.mo22903f()).floatValue() != 1.0f) {
                z = false;
            }
            m19925a(z);
            mo23182a((BaseKeyframeAnimation<?, ?>) bVar);
            return;
        }
        m19925a(true);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo23181a(Canvas canvas, Matrix matrix, int i);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo23183a(C8582e eVar, int i, List<C8582e> list, C8582e eVar2) {
    }

    public <T> void addValueCallback(T t, C8661c<T> cVar) {
        this.f22040u.mo22919a(t, cVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo23186b(C8586a aVar) {
        this.f22037r = aVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo23188c() {
        return this.f22036q != null;
    }

    public void draw(Canvas canvas, Matrix matrix, int i) {
        C8505b.m19651a(this.f22031l);
        if (!this.f22041v || this.f22034o.mo23212v()) {
            C8505b.m19652b(this.f22031l);
            return;
        }
        m19930d();
        String str = "Layer#parentMatrix";
        C8505b.m19651a(str);
        this.f22021b.reset();
        this.f22021b.set(matrix);
        for (int size = this.f22038s.size() - 1; size >= 0; size--) {
            this.f22021b.preConcat(((C8586a) this.f22038s.get(size)).f22040u.mo22920b());
        }
        C8505b.m19652b(str);
        int intValue = (int) ((((((float) i) / 255.0f) * ((float) (this.f22040u.mo22922c() == null ? 100 : ((Integer) this.f22040u.mo22922c().mo22903f()).intValue()))) / 100.0f) * 255.0f);
        String str2 = "Layer#drawLayer";
        if (mo23188c() || mo23187b()) {
            String str3 = "Layer#computeBounds";
            C8505b.m19651a(str3);
            getBounds(this.f22027h, this.f22021b, false);
            m19928b(this.f22027h, matrix);
            this.f22021b.preConcat(this.f22040u.mo22920b());
            m19923a(this.f22027h, this.f22021b);
            if (!this.f22027h.intersect(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight())) {
                this.f22027h.set(0.0f, 0.0f, 0.0f, 0.0f);
            }
            C8505b.m19652b(str3);
            if (!this.f22027h.isEmpty()) {
                String str4 = "Layer#saveLayer";
                C8505b.m19651a(str4);
                C8658h.m20198a(canvas, this.f22027h, this.f22022c);
                C8505b.m19652b(str4);
                m19920a(canvas);
                C8505b.m19651a(str2);
                mo23181a(canvas, this.f22021b, intValue);
                C8505b.m19652b(str2);
                if (mo23187b()) {
                    m19921a(canvas, this.f22021b);
                }
                String str5 = "Layer#restoreLayer";
                if (mo23188c()) {
                    String str6 = "Layer#drawMatte";
                    C8505b.m19651a(str6);
                    C8505b.m19651a(str4);
                    C8658h.m20199a(canvas, this.f22027h, this.f22025f, 19);
                    C8505b.m19652b(str4);
                    m19920a(canvas);
                    this.f22036q.draw(canvas, matrix, intValue);
                    C8505b.m19651a(str5);
                    canvas.restore();
                    C8505b.m19652b(str5);
                    C8505b.m19652b(str6);
                }
                C8505b.m19651a(str5);
                canvas.restore();
                C8505b.m19652b(str5);
            }
            m19926b(C8505b.m19652b(this.f22031l));
            return;
        }
        this.f22021b.preConcat(this.f22040u.mo22920b());
        C8505b.m19651a(str2);
        mo23181a(canvas, this.f22021b, intValue);
        C8505b.m19652b(str2);
        m19926b(C8505b.m19652b(this.f22031l));
    }

    public void getBounds(RectF rectF, Matrix matrix, boolean z) {
        this.f22027h.set(0.0f, 0.0f, 0.0f, 0.0f);
        m19930d();
        this.f22032m.set(matrix);
        if (z) {
            List<C8586a> list = this.f22038s;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f22032m.preConcat(((C8586a) this.f22038s.get(size)).f22040u.mo22920b());
                }
            } else {
                C8586a aVar = this.f22037r;
                if (aVar != null) {
                    this.f22032m.preConcat(aVar.f22040u.mo22920b());
                }
            }
        }
        this.f22032m.preConcat(this.f22040u.mo22920b());
    }

    public String getName() {
        return this.f22034o.mo23196g();
    }

    public void onValueChanged() {
        m19932e();
    }

    public void resolveKeyPath(C8582e eVar, int i, List<C8582e> list, C8582e eVar2) {
        if (eVar.mo23169c(getName(), i)) {
            if (!"__container".equals(getName())) {
                eVar2 = eVar2.mo23166a(getName());
                if (eVar.mo23167a(getName(), i)) {
                    list.add(eVar2.mo23165a((KeyPathElement) this));
                }
            }
            if (eVar.mo23170d(getName(), i)) {
                mo23183a(eVar, i + eVar.mo23168b(getName(), i), list, eVar2);
            }
        }
    }

    public void setContents(List<Content> list, List<Content> list2) {
    }

    /* renamed from: a */
    static C8586a m19919a(C8592d dVar, C8515e eVar, C8506c cVar) {
        switch (C8588b.f22044a[dVar.mo23193d().ordinal()]) {
            case 1:
                return new C8596f(eVar, dVar);
            case 2:
                return new C8589b(eVar, dVar, cVar.mo22934c(dVar.mo23200k()), cVar);
            case 3:
                return new C8597g(eVar, dVar);
            case 4:
                return new C8591c(eVar, dVar);
            case 5:
                return new C8595e(eVar, dVar);
            case 6:
                return new C8598h(eVar, dVar);
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("Unknown layer type ");
                sb.append(dVar.mo23193d());
                C8654d.m20155b(sb.toString());
                return null;
        }
    }

    /* renamed from: c */
    private void m19929c(Canvas canvas, Matrix matrix, C8563f fVar, BaseKeyframeAnimation<C8571k, Path> baseKeyframeAnimation, BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation2) {
        C8658h.m20198a(canvas, this.f22027h, this.f22022c);
        canvas.drawRect(this.f22027h, this.f22022c);
        this.f22020a.set((Path) baseKeyframeAnimation.mo22903f());
        this.f22020a.transform(matrix);
        this.f22022c.setAlpha((int) (((float) ((Integer) baseKeyframeAnimation2.mo22903f()).intValue()) * 2.55f));
        canvas.drawPath(this.f22020a, this.f22024e);
        canvas.restore();
    }

    /* renamed from: e */
    private void m19933e(Canvas canvas, Matrix matrix, C8563f fVar, BaseKeyframeAnimation<C8571k, Path> baseKeyframeAnimation, BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation2) {
        C8658h.m20198a(canvas, this.f22027h, this.f22024e);
        canvas.drawRect(this.f22027h, this.f22022c);
        this.f22024e.setAlpha((int) (((float) ((Integer) baseKeyframeAnimation2.mo22903f()).intValue()) * 2.55f));
        this.f22020a.set((Path) baseKeyframeAnimation.mo22903f());
        this.f22020a.transform(matrix);
        canvas.drawPath(this.f22020a, this.f22024e);
        canvas.restore();
    }

    /* renamed from: b */
    public void mo23185b(BaseKeyframeAnimation<?, ?> baseKeyframeAnimation) {
        this.f22039t.remove(baseKeyframeAnimation);
    }

    /* renamed from: b */
    private void m19926b(float f) {
        this.f22033n.mo22984e().mo22942k().mo22868a(this.f22034o.mo23196g(), f);
    }

    /* renamed from: b */
    private void m19928b(RectF rectF, Matrix matrix) {
        if (mo23188c() && this.f22034o.mo23195f() != C8594b.INVERT) {
            this.f22029j.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.f22036q.getBounds(this.f22029j, matrix, true);
            if (!rectF.intersect(this.f22029j)) {
                rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
            }
        }
    }

    /* renamed from: d */
    private void m19930d() {
        if (this.f22038s == null) {
            if (this.f22037r == null) {
                this.f22038s = Collections.emptyList();
                return;
            }
            this.f22038s = new ArrayList();
            for (C8586a aVar = this.f22037r; aVar != null; aVar = aVar.f22037r) {
                this.f22038s.add(aVar);
            }
        }
    }

    /* renamed from: f */
    private void m19935f(Canvas canvas, Matrix matrix, C8563f fVar, BaseKeyframeAnimation<C8571k, Path> baseKeyframeAnimation, BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation2) {
        this.f22020a.set((Path) baseKeyframeAnimation.mo22903f());
        this.f22020a.transform(matrix);
        canvas.drawPath(this.f22020a, this.f22024e);
    }

    /* renamed from: b */
    private void m19927b(Canvas canvas, Matrix matrix, C8563f fVar, BaseKeyframeAnimation<C8571k, Path> baseKeyframeAnimation, BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation2) {
        C8658h.m20198a(canvas, this.f22027h, this.f22023d);
        this.f22020a.set((Path) baseKeyframeAnimation.mo22903f());
        this.f22020a.transform(matrix);
        this.f22022c.setAlpha((int) (((float) ((Integer) baseKeyframeAnimation2.mo22903f()).intValue()) * 2.55f));
        canvas.drawPath(this.f22020a, this.f22022c);
        canvas.restore();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C8592d mo23179a() {
        return this.f22034o;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo23184a(C8586a aVar) {
        this.f22036q = aVar;
    }

    /* renamed from: a */
    public void mo23182a(BaseKeyframeAnimation<?, ?> baseKeyframeAnimation) {
        if (baseKeyframeAnimation != null) {
            this.f22039t.add(baseKeyframeAnimation);
        }
    }

    /* renamed from: a */
    private void m19920a(Canvas canvas) {
        String str = "Layer#clearLayer";
        C8505b.m19651a(str);
        RectF rectF = this.f22027h;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f22026g);
        C8505b.m19652b(str);
    }

    /* renamed from: a */
    private void m19923a(RectF rectF, Matrix matrix) {
        this.f22028i.set(0.0f, 0.0f, 0.0f, 0.0f);
        if (mo23187b()) {
            int size = this.f22035p.mo22911b().size();
            int i = 0;
            while (i < size) {
                C8563f fVar = (C8563f) this.f22035p.mo22911b().get(i);
                this.f22020a.set((Path) ((BaseKeyframeAnimation) this.f22035p.mo22910a().get(i)).mo22903f());
                this.f22020a.transform(matrix);
                int i2 = C8588b.f22045b[fVar.mo23094a().ordinal()];
                if (i2 == 1) {
                    return;
                }
                if ((i2 != 2 && i2 != 3) || !fVar.mo23097d()) {
                    this.f22020a.computeBounds(this.f22030k, false);
                    if (i == 0) {
                        this.f22028i.set(this.f22030k);
                    } else {
                        RectF rectF2 = this.f22028i;
                        rectF2.set(Math.min(rectF2.left, this.f22030k.left), Math.min(this.f22028i.top, this.f22030k.top), Math.max(this.f22028i.right, this.f22030k.right), Math.max(this.f22028i.bottom, this.f22030k.bottom));
                    }
                    i++;
                } else {
                    return;
                }
            }
            if (!rectF.intersect(this.f22028i)) {
                rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo23187b() {
        C8495f fVar = this.f22035p;
        return fVar != null && !fVar.mo22910a().isEmpty();
    }

    /* renamed from: a */
    private void m19921a(Canvas canvas, Matrix matrix) {
        String str = "Layer#saveLayer";
        C8505b.m19651a(str);
        C8658h.m20199a(canvas, this.f22027h, this.f22023d, 19);
        if (VERSION.SDK_INT < 28) {
            canvas.drawColor(0);
        }
        C8505b.m19652b(str);
        for (int i = 0; i < this.f22035p.mo22911b().size(); i++) {
            C8563f fVar = (C8563f) this.f22035p.mo22911b().get(i);
            BaseKeyframeAnimation baseKeyframeAnimation = (BaseKeyframeAnimation) this.f22035p.mo22910a().get(i);
            BaseKeyframeAnimation baseKeyframeAnimation2 = (BaseKeyframeAnimation) this.f22035p.mo22912c().get(i);
            int i2 = C8588b.f22045b[fVar.mo23094a().ordinal()];
            if (i2 == 1) {
                if (i == 0) {
                    this.f22022c.setColor(-16777216);
                    this.f22022c.setAlpha(255);
                    canvas.drawRect(this.f22027h, this.f22022c);
                }
                if (fVar.mo23097d()) {
                    m19933e(canvas, matrix, fVar, baseKeyframeAnimation, baseKeyframeAnimation2);
                } else {
                    m19935f(canvas, matrix, fVar, baseKeyframeAnimation, baseKeyframeAnimation2);
                }
            } else if (i2 != 2) {
                if (i2 == 3) {
                    if (fVar.mo23097d()) {
                        m19929c(canvas, matrix, fVar, baseKeyframeAnimation, baseKeyframeAnimation2);
                    } else {
                        m19922a(canvas, matrix, fVar, baseKeyframeAnimation, baseKeyframeAnimation2);
                    }
                }
            } else if (fVar.mo23097d()) {
                m19931d(canvas, matrix, fVar, baseKeyframeAnimation, baseKeyframeAnimation2);
            } else {
                m19927b(canvas, matrix, fVar, baseKeyframeAnimation, baseKeyframeAnimation2);
            }
        }
        String str2 = "Layer#restoreLayer";
        C8505b.m19651a(str2);
        canvas.restore();
        C8505b.m19652b(str2);
    }

    /* renamed from: a */
    private void m19922a(Canvas canvas, Matrix matrix, C8563f fVar, BaseKeyframeAnimation<C8571k, Path> baseKeyframeAnimation, BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation2) {
        this.f22020a.set((Path) baseKeyframeAnimation.mo22903f());
        this.f22020a.transform(matrix);
        this.f22022c.setAlpha((int) (((float) ((Integer) baseKeyframeAnimation2.mo22903f()).intValue()) * 2.55f));
        canvas.drawPath(this.f22020a, this.f22022c);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m19925a(boolean z) {
        if (z != this.f22041v) {
            this.f22041v = z;
            m19932e();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo23180a(float f) {
        this.f22040u.mo22921b(f);
        if (this.f22035p != null) {
            for (int i = 0; i < this.f22035p.mo22910a().size(); i++) {
                ((BaseKeyframeAnimation) this.f22035p.mo22910a().get(i)).mo22896a(f);
            }
        }
        if (this.f22034o.mo23209t() != 0.0f) {
            f /= this.f22034o.mo23209t();
        }
        C8586a aVar = this.f22036q;
        if (aVar != null) {
            this.f22036q.mo23180a(aVar.f22034o.mo23209t() * f);
        }
        for (int i2 = 0; i2 < this.f22039t.size(); i2++) {
            ((BaseKeyframeAnimation) this.f22039t.get(i2)).mo22896a(f);
        }
    }
}
