package com.airbnb.lottie.model.p284i;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import com.airbnb.lottie.C8505b;
import com.airbnb.lottie.C8506c;
import com.airbnb.lottie.C8515e;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener;
import com.airbnb.lottie.animation.keyframe.C8504o;
import com.airbnb.lottie.model.C8582e;
import com.airbnb.lottie.model.animatable.C8543b;
import com.airbnb.lottie.model.p284i.C8592d.C8594b;
import com.airbnb.lottie.p289q.C8658h;
import com.airbnb.lottie.value.C8661c;
import java.util.ArrayList;
import java.util.List;
import p214e.p228e.C7576d;

/* renamed from: com.airbnb.lottie.model.i.b */
public class C8589b extends C8586a {

    /* renamed from: A */
    private Paint f22046A = new Paint();

    /* renamed from: w */
    private BaseKeyframeAnimation<Float, Float> f22047w;

    /* renamed from: x */
    private final List<C8586a> f22048x = new ArrayList();

    /* renamed from: y */
    private final RectF f22049y = new RectF();

    /* renamed from: z */
    private final RectF f22050z = new RectF();

    /* renamed from: com.airbnb.lottie.model.i.b$a */
    static /* synthetic */ class C8590a {

        /* renamed from: a */
        static final /* synthetic */ int[] f22051a = new int[C8594b.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                com.airbnb.lottie.model.i.d$b[] r0 = com.airbnb.lottie.model.p284i.C8592d.C8594b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f22051a = r0
                int[] r0 = f22051a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.airbnb.lottie.model.i.d$b r1 = com.airbnb.lottie.model.p284i.C8592d.C8594b.ADD     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f22051a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.airbnb.lottie.model.i.d$b r1 = com.airbnb.lottie.model.p284i.C8592d.C8594b.INVERT     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.model.p284i.C8589b.C8590a.<clinit>():void");
        }
    }

    public C8589b(C8515e eVar, C8592d dVar, List<C8592d> list, C8506c cVar) {
        int i;
        super(eVar, dVar);
        C8543b s = dVar.mo23208s();
        if (s != null) {
            this.f22047w = s.createAnimation();
            mo23182a(this.f22047w);
            this.f22047w.mo22897a((AnimationListener) this);
        } else {
            this.f22047w = null;
        }
        C7576d dVar2 = new C7576d(cVar.mo22940i().size());
        int size = list.size() - 1;
        C8586a aVar = null;
        while (true) {
            if (size < 0) {
                break;
            }
            C8592d dVar3 = (C8592d) list.get(size);
            C8586a a = C8586a.m19919a(dVar3, eVar, cVar);
            if (a != null) {
                dVar2.mo19514c(a.mo23179a().mo23191b(), a);
                if (aVar != null) {
                    aVar.mo23184a(a);
                    aVar = null;
                } else {
                    this.f22048x.add(0, a);
                    int i2 = C8590a.f22051a[dVar3.mo23195f().ordinal()];
                    if (i2 == 1 || i2 == 2) {
                        aVar = a;
                    }
                }
            }
            size--;
        }
        for (i = 0; i < dVar2.mo19504a(); i++) {
            C8586a aVar2 = (C8586a) dVar2.mo19513c(dVar2.mo19505a(i));
            if (aVar2 != null) {
                C8586a aVar3 = (C8586a) dVar2.mo19513c(aVar2.mo23179a().mo23197h());
                if (aVar3 != null) {
                    aVar2.mo23186b(aVar3);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo23181a(Canvas canvas, Matrix matrix, int i) {
        String str = "CompositionLayer#draw";
        C8505b.m19651a(str);
        this.f22050z.set(0.0f, 0.0f, (float) this.f22034o.mo23199j(), (float) this.f22034o.mo23198i());
        matrix.mapRect(this.f22050z);
        boolean z = this.f22033n.mo23007r() && this.f22048x.size() > 1 && i != 255;
        if (z) {
            this.f22046A.setAlpha(i);
            C8658h.m20198a(canvas, this.f22050z, this.f22046A);
        } else {
            canvas.save();
        }
        if (z) {
            i = 255;
        }
        for (int size = this.f22048x.size() - 1; size >= 0; size--) {
            if (!this.f22050z.isEmpty() ? canvas.clipRect(this.f22050z) : true) {
                ((C8586a) this.f22048x.get(size)).draw(canvas, matrix, i);
            }
        }
        canvas.restore();
        C8505b.m19652b(str);
    }

    public <T> void addValueCallback(T t, C8661c<T> cVar) {
        super.addValueCallback(t, cVar);
        if (t != LottieProperty.f21540A) {
            return;
        }
        if (cVar == null) {
            this.f22047w = null;
            return;
        }
        this.f22047w = new C8504o(cVar);
        mo23182a(this.f22047w);
    }

    public void getBounds(RectF rectF, Matrix matrix, boolean z) {
        super.getBounds(rectF, matrix, z);
        for (int size = this.f22048x.size() - 1; size >= 0; size--) {
            this.f22049y.set(0.0f, 0.0f, 0.0f, 0.0f);
            ((C8586a) this.f22048x.get(size)).getBounds(this.f22049y, this.f22032m, true);
            rectF.union(this.f22049y);
        }
    }

    /* renamed from: a */
    public void mo23180a(float f) {
        super.mo23180a(f);
        if (this.f22047w != null) {
            f = ((((Float) this.f22047w.mo22903f()).floatValue() * this.f22034o.mo23189a().mo22938g()) - this.f22034o.mo23189a().mo22943l()) / (this.f22033n.mo22984e().mo22935d() + 0.01f);
        }
        if (this.f22034o.mo23209t() != 0.0f) {
            f /= this.f22034o.mo23209t();
        }
        if (this.f22047w == null) {
            f -= this.f22034o.mo23205p();
        }
        for (int size = this.f22048x.size() - 1; size >= 0; size--) {
            ((C8586a) this.f22048x.get(size)).mo23180a(f);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo23183a(C8582e eVar, int i, List<C8582e> list, C8582e eVar2) {
        for (int i2 = 0; i2 < this.f22048x.size(); i2++) {
            ((C8586a) this.f22048x.get(i2)).resolveKeyPath(eVar, i, list, eVar2);
        }
    }
}
