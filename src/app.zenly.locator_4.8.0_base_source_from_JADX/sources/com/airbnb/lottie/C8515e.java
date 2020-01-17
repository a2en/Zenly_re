package com.airbnb.lottie;

import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.os.Build.VERSION;
import android.view.View;
import com.airbnb.lottie.model.C8582e;
import com.airbnb.lottie.model.C8584g;
import com.airbnb.lottie.model.p284i.C8589b;
import com.airbnb.lottie.p285n.C8602a;
import com.airbnb.lottie.p285n.C8603b;
import com.airbnb.lottie.p287p.C8643s;
import com.airbnb.lottie.p289q.C8654d;
import com.airbnb.lottie.p289q.C8655e;
import com.airbnb.lottie.p289q.C8657g;
import com.airbnb.lottie.value.C8661c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.airbnb.lottie.e */
public class C8515e extends Drawable implements Callback, Animatable {

    /* renamed from: e */
    private final Matrix f21785e = new Matrix();

    /* renamed from: f */
    private C8506c f21786f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C8655e f21787g = new C8655e();

    /* renamed from: h */
    private float f21788h = 1.0f;

    /* renamed from: i */
    private boolean f21789i = true;

    /* renamed from: j */
    private final ArrayList<C8530o> f21790j;

    /* renamed from: k */
    private final AnimatorUpdateListener f21791k;

    /* renamed from: l */
    private C8603b f21792l;

    /* renamed from: m */
    private String f21793m;

    /* renamed from: n */
    private ImageAssetDelegate f21794n;

    /* renamed from: o */
    private C8602a f21795o;

    /* renamed from: p */
    C8469a f21796p;

    /* renamed from: q */
    C8539l f21797q;

    /* renamed from: r */
    private boolean f21798r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public C8589b f21799s;

    /* renamed from: t */
    private int f21800t;

    /* renamed from: u */
    private boolean f21801u;

    /* renamed from: v */
    private boolean f21802v;

    /* renamed from: w */
    private boolean f21803w;

    /* renamed from: com.airbnb.lottie.e$a */
    class C8516a implements C8530o {

        /* renamed from: a */
        final /* synthetic */ String f21804a;

        C8516a(String str) {
            this.f21804a = str;
        }

        /* renamed from: a */
        public void mo23019a(C8506c cVar) {
            C8515e.this.mo22982d(this.f21804a);
        }
    }

    /* renamed from: com.airbnb.lottie.e$b */
    class C8517b implements C8530o {

        /* renamed from: a */
        final /* synthetic */ int f21806a;

        /* renamed from: b */
        final /* synthetic */ int f21807b;

        C8517b(int i, int i2) {
            this.f21806a = i;
            this.f21807b = i2;
        }

        /* renamed from: a */
        public void mo23019a(C8506c cVar) {
            C8515e.this.mo22959a(this.f21806a, this.f21807b);
        }
    }

    /* renamed from: com.airbnb.lottie.e$c */
    class C8518c implements C8530o {

        /* renamed from: a */
        final /* synthetic */ int f21809a;

        C8518c(int i) {
            this.f21809a = i;
        }

        /* renamed from: a */
        public void mo23019a(C8506c cVar) {
            C8515e.this.mo22958a(this.f21809a);
        }
    }

    /* renamed from: com.airbnb.lottie.e$d */
    class C8519d implements C8530o {

        /* renamed from: a */
        final /* synthetic */ float f21811a;

        C8519d(float f) {
            this.f21811a = f;
        }

        /* renamed from: a */
        public void mo23019a(C8506c cVar) {
            C8515e.this.mo22974c(this.f21811a);
        }
    }

    /* renamed from: com.airbnb.lottie.e$e */
    class C8520e implements C8530o {

        /* renamed from: a */
        final /* synthetic */ C8582e f21813a;

        /* renamed from: b */
        final /* synthetic */ Object f21814b;

        /* renamed from: c */
        final /* synthetic */ C8661c f21815c;

        C8520e(C8582e eVar, Object obj, C8661c cVar) {
            this.f21813a = eVar;
            this.f21814b = obj;
            this.f21815c = cVar;
        }

        /* renamed from: a */
        public void mo23019a(C8506c cVar) {
            C8515e.this.mo22964a(this.f21813a, this.f21814b, this.f21815c);
        }
    }

    /* renamed from: com.airbnb.lottie.e$f */
    class C8521f implements AnimatorUpdateListener {
        C8521f() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (C8515e.this.f21799s != null) {
                C8515e.this.f21799s.mo23180a(C8515e.this.f21787g.mo23270f());
            }
        }
    }

    /* renamed from: com.airbnb.lottie.e$g */
    class C8522g implements C8530o {
        C8522g() {
        }

        /* renamed from: a */
        public void mo23019a(C8506c cVar) {
            C8515e.this.mo23014t();
        }
    }

    /* renamed from: com.airbnb.lottie.e$h */
    class C8523h implements C8530o {
        C8523h() {
        }

        /* renamed from: a */
        public void mo23019a(C8506c cVar) {
            C8515e.this.mo23017v();
        }
    }

    /* renamed from: com.airbnb.lottie.e$i */
    class C8524i implements C8530o {

        /* renamed from: a */
        final /* synthetic */ int f21820a;

        C8524i(int i) {
            this.f21820a = i;
        }

        /* renamed from: a */
        public void mo23019a(C8506c cVar) {
            C8515e.this.mo22975c(this.f21820a);
        }
    }

    /* renamed from: com.airbnb.lottie.e$j */
    class C8525j implements C8530o {

        /* renamed from: a */
        final /* synthetic */ float f21822a;

        C8525j(float f) {
            this.f21822a = f;
        }

        /* renamed from: a */
        public void mo23019a(C8506c cVar) {
            C8515e.this.mo22969b(this.f21822a);
        }
    }

    /* renamed from: com.airbnb.lottie.e$k */
    class C8526k implements C8530o {

        /* renamed from: a */
        final /* synthetic */ int f21824a;

        C8526k(int i) {
            this.f21824a = i;
        }

        /* renamed from: a */
        public void mo23019a(C8506c cVar) {
            C8515e.this.mo22970b(this.f21824a);
        }
    }

    /* renamed from: com.airbnb.lottie.e$l */
    class C8527l implements C8530o {

        /* renamed from: a */
        final /* synthetic */ float f21826a;

        C8527l(float f) {
            this.f21826a = f;
        }

        /* renamed from: a */
        public void mo23019a(C8506c cVar) {
            C8515e.this.mo22957a(this.f21826a);
        }
    }

    /* renamed from: com.airbnb.lottie.e$m */
    class C8528m implements C8530o {

        /* renamed from: a */
        final /* synthetic */ String f21828a;

        C8528m(String str) {
            this.f21828a = str;
        }

        /* renamed from: a */
        public void mo23019a(C8506c cVar) {
            C8515e.this.mo22987e(this.f21828a);
        }
    }

    /* renamed from: com.airbnb.lottie.e$n */
    class C8529n implements C8530o {

        /* renamed from: a */
        final /* synthetic */ String f21830a;

        C8529n(String str) {
            this.f21830a = str;
        }

        /* renamed from: a */
        public void mo23019a(C8506c cVar) {
            C8515e.this.mo22976c(this.f21830a);
        }
    }

    /* renamed from: com.airbnb.lottie.e$o */
    private interface C8530o {
        /* renamed from: a */
        void mo23019a(C8506c cVar);
    }

    static {
        Class<C8515e> cls = C8515e.class;
    }

    public C8515e() {
        new HashSet();
        this.f21790j = new ArrayList<>();
        this.f21791k = new C8521f();
        this.f21800t = 255;
        this.f21803w = false;
        this.f21787g.addUpdateListener(this.f21791k);
    }

    /* renamed from: A */
    private C8603b m19693A() {
        if (getCallback() == null) {
            return null;
        }
        C8603b bVar = this.f21792l;
        if (bVar != null && !bVar.mo23217a(m19699y())) {
            this.f21792l = null;
        }
        if (this.f21792l == null) {
            this.f21792l = new C8603b(getCallback(), this.f21793m, this.f21794n, this.f21786f.mo22939h());
        }
        return this.f21792l;
    }

    /* renamed from: B */
    private void m19694B() {
        if (this.f21786f != null) {
            float n = mo23003n();
            setBounds(0, 0, (int) (((float) this.f21786f.mo22924a().width()) * n), (int) (((float) this.f21786f.mo22924a().height()) * n));
        }
    }

    /* renamed from: x */
    private void m19698x() {
        this.f21799s = new C8589b(this, C8643s.m20129a(this.f21786f), this.f21786f.mo22940i(), this.f21786f);
    }

    /* renamed from: y */
    private Context m19699y() {
        Callback callback = getCallback();
        if (callback != null && (callback instanceof View)) {
            return ((View) callback).getContext();
        }
        return null;
    }

    /* renamed from: z */
    private C8602a m19700z() {
        if (getCallback() == null) {
            return null;
        }
        if (this.f21795o == null) {
            this.f21795o = new C8602a(getCallback(), this.f21796p);
        }
        return this.f21795o;
    }

    /* renamed from: c */
    public boolean mo22978c() {
        return this.f21798r;
    }

    /* renamed from: d */
    public void mo22979d() {
        this.f21790j.clear();
        this.f21787g.mo23269e();
    }

    public void draw(Canvas canvas) {
        float f;
        this.f21803w = false;
        String str = "Drawable#draw";
        C8505b.m19651a(str);
        if (this.f21799s != null) {
            float f2 = this.f21788h;
            float a = m19695a(canvas);
            if (f2 > a) {
                f = this.f21788h / a;
            } else {
                a = f2;
                f = 1.0f;
            }
            int i = -1;
            if (f > 1.0f) {
                i = canvas.save();
                float width = ((float) this.f21786f.mo22924a().width()) / 2.0f;
                float height = ((float) this.f21786f.mo22924a().height()) / 2.0f;
                float f3 = width * a;
                float f4 = height * a;
                canvas.translate((mo23003n() * width) - f3, (mo23003n() * height) - f4);
                canvas.scale(f, f, f3, f4);
            }
            this.f21785e.reset();
            this.f21785e.preScale(a, a);
            this.f21799s.draw(canvas, this.f21785e, this.f21800t);
            C8505b.m19652b(str);
            if (i > 0) {
                canvas.restoreToCount(i);
            }
        }
    }

    /* renamed from: e */
    public void mo22987e(String str) {
        C8506c cVar = this.f21786f;
        if (cVar == null) {
            this.f21790j.add(new C8528m(str));
            return;
        }
        C8584g b = cVar.mo22930b(str);
        if (b != null) {
            mo22975c((int) b.f22016b);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot find marker with name ");
        sb.append(str);
        sb.append(".");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: f */
    public int mo22988f() {
        return (int) this.f21787g.mo23271g();
    }

    /* renamed from: g */
    public String mo22989g() {
        return this.f21793m;
    }

    public int getAlpha() {
        return this.f21800t;
    }

    public int getIntrinsicHeight() {
        C8506c cVar = this.f21786f;
        if (cVar == null) {
            return -1;
        }
        return (int) (((float) cVar.mo22924a().height()) * mo23003n());
    }

    public int getIntrinsicWidth() {
        C8506c cVar = this.f21786f;
        if (cVar == null) {
            return -1;
        }
        return (int) (((float) cVar.mo22924a().width()) * mo23003n());
    }

    public int getOpacity() {
        return -3;
    }

    /* renamed from: h */
    public float mo22994h() {
        return this.f21787g.mo23275h();
    }

    /* renamed from: i */
    public float mo22995i() {
        return this.f21787g.mo23276i();
    }

    public void invalidateDrawable(Drawable drawable) {
        Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public void invalidateSelf() {
        if (!this.f21803w) {
            this.f21803w = true;
            Callback callback = getCallback();
            if (callback != null) {
                callback.invalidateDrawable(this);
            }
        }
    }

    public boolean isRunning() {
        return mo23006q();
    }

    /* renamed from: j */
    public PerformanceTracker mo22999j() {
        C8506c cVar = this.f21786f;
        if (cVar != null) {
            return cVar.mo22942k();
        }
        return null;
    }

    /* renamed from: k */
    public float mo23000k() {
        return this.f21787g.mo23270f();
    }

    /* renamed from: l */
    public int mo23001l() {
        return this.f21787g.getRepeatCount();
    }

    /* renamed from: m */
    public int mo23002m() {
        return this.f21787g.getRepeatMode();
    }

    /* renamed from: n */
    public float mo23003n() {
        return this.f21788h;
    }

    /* renamed from: o */
    public float mo23004o() {
        return this.f21787g.mo23278j();
    }

    /* renamed from: p */
    public C8539l mo23005p() {
        return this.f21797q;
    }

    /* renamed from: q */
    public boolean mo23006q() {
        return this.f21787g.isRunning();
    }

    /* renamed from: r */
    public boolean mo23007r() {
        return this.f21802v;
    }

    /* renamed from: s */
    public void mo23008s() {
        this.f21790j.clear();
        this.f21787g.mo23279k();
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    public void setAlpha(int i) {
        this.f21800t = i;
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        C8654d.m20155b("Use addColorFilter instead.");
    }

    public void start() {
        mo23014t();
    }

    public void stop() {
        mo22979d();
    }

    /* renamed from: t */
    public void mo23014t() {
        if (this.f21799s == null) {
            this.f21790j.add(new C8522g());
            return;
        }
        if (this.f21789i || mo23001l() == 0) {
            this.f21787g.mo23280l();
        }
        if (!this.f21789i) {
            mo22958a((int) (mo23004o() < 0.0f ? mo22995i() : mo22994h()));
        }
    }

    /* renamed from: u */
    public void mo23015u() {
        this.f21787g.removeAllListeners();
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    /* renamed from: v */
    public void mo23017v() {
        if (this.f21799s == null) {
            this.f21790j.add(new C8523h());
            return;
        }
        if (this.f21789i) {
            this.f21787g.mo23283o();
        }
    }

    /* renamed from: w */
    public boolean mo23018w() {
        return this.f21797q == null && this.f21786f.mo22931b().mo19615a() > 0;
    }

    /* renamed from: a */
    public void mo22966a(boolean z) {
        if (this.f21798r != z) {
            if (VERSION.SDK_INT < 19) {
                C8654d.m20155b("Merge paths are not supported pre-Kit Kat.");
                return;
            }
            this.f21798r = z;
            if (this.f21786f != null) {
                m19698x();
            }
        }
    }

    /* renamed from: b */
    public void mo22972b(String str) {
        this.f21793m = str;
    }

    /* renamed from: c */
    public void mo22977c(boolean z) {
        this.f21801u = z;
        C8506c cVar = this.f21786f;
        if (cVar != null) {
            cVar.mo22932b(z);
        }
    }

    /* renamed from: b */
    public void mo22973b(boolean z) {
        this.f21802v = z;
    }

    /* renamed from: d */
    public void mo22982d(String str) {
        C8506c cVar = this.f21786f;
        if (cVar == null) {
            this.f21790j.add(new C8516a(str));
            return;
        }
        C8584g b = cVar.mo22930b(str);
        if (b != null) {
            int i = (int) b.f22016b;
            mo22959a(i, ((int) b.f22017c) + i);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot find marker with name ");
        sb.append(str);
        sb.append(".");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: b */
    public void mo22968b() {
        if (this.f21787g.isRunning()) {
            this.f21787g.cancel();
        }
        this.f21786f = null;
        this.f21799s = null;
        this.f21792l = null;
        this.f21787g.mo23267d();
        invalidateSelf();
    }

    /* renamed from: c */
    public void mo22975c(int i) {
        if (this.f21786f == null) {
            this.f21790j.add(new C8524i(i));
        } else {
            this.f21787g.mo23261a(i);
        }
    }

    /* renamed from: e */
    public void mo22985e(float f) {
        this.f21787g.mo23264c(f);
    }

    /* renamed from: e */
    public void mo22986e(int i) {
        this.f21787g.setRepeatMode(i);
    }

    /* renamed from: a */
    public boolean mo22967a(C8506c cVar) {
        if (this.f21786f == cVar) {
            return false;
        }
        this.f21803w = false;
        mo22968b();
        this.f21786f = cVar;
        m19698x();
        this.f21787g.mo23262a(cVar);
        mo22974c(this.f21787g.getAnimatedFraction());
        mo22980d(this.f21788h);
        m19694B();
        Iterator it = new ArrayList(this.f21790j).iterator();
        while (it.hasNext()) {
            ((C8530o) it.next()).mo23019a(cVar);
            it.remove();
        }
        this.f21790j.clear();
        cVar.mo22932b(this.f21801u);
        return true;
    }

    /* renamed from: c */
    public void mo22976c(String str) {
        C8506c cVar = this.f21786f;
        if (cVar == null) {
            this.f21790j.add(new C8529n(str));
            return;
        }
        C8584g b = cVar.mo22930b(str);
        if (b != null) {
            mo22970b((int) (b.f22016b + b.f22017c));
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot find marker with name ");
        sb.append(str);
        sb.append(".");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: e */
    public C8506c mo22984e() {
        return this.f21786f;
    }

    /* renamed from: d */
    public void mo22981d(int i) {
        this.f21787g.setRepeatCount(i);
    }

    /* renamed from: d */
    public void mo22980d(float f) {
        this.f21788h = f;
        m19694B();
    }

    /* renamed from: b */
    public void mo22969b(float f) {
        C8506c cVar = this.f21786f;
        if (cVar == null) {
            this.f21790j.add(new C8525j(f));
        } else {
            mo22975c((int) C8657g.m20191c(cVar.mo22943l(), this.f21786f.mo22936e(), f));
        }
    }

    /* renamed from: c */
    public void mo22974c(float f) {
        if (this.f21786f == null) {
            this.f21790j.add(new C8519d(f));
            return;
        }
        String str = "Drawable#setProgress";
        C8505b.m19651a(str);
        this.f21787g.mo23259a(C8657g.m20191c(this.f21786f.mo22943l(), this.f21786f.mo22936e(), f));
        C8505b.m19652b(str);
    }

    /* renamed from: b */
    public void mo22970b(int i) {
        if (this.f21786f == null) {
            this.f21790j.add(new C8526k(i));
        } else {
            this.f21787g.mo23263b(((float) i) + 0.99f);
        }
    }

    /* renamed from: b */
    public void mo22971b(AnimatorListener animatorListener) {
        this.f21787g.removeListener(animatorListener);
    }

    /* renamed from: a */
    public void mo22957a(float f) {
        C8506c cVar = this.f21786f;
        if (cVar == null) {
            this.f21790j.add(new C8527l(f));
        } else {
            mo22970b((int) C8657g.m20191c(cVar.mo22943l(), this.f21786f.mo22936e(), f));
        }
    }

    /* renamed from: a */
    public void mo22959a(int i, int i2) {
        if (this.f21786f == null) {
            this.f21790j.add(new C8517b(i, i2));
        } else {
            this.f21787g.mo23260a((float) i, ((float) i2) + 0.99f);
        }
    }

    /* renamed from: a */
    public void mo22960a(AnimatorListener animatorListener) {
        this.f21787g.addListener(animatorListener);
    }

    /* renamed from: a */
    public void mo22958a(int i) {
        if (this.f21786f == null) {
            this.f21790j.add(new C8518c(i));
        } else {
            this.f21787g.mo23259a((float) i);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo22965a(Boolean bool) {
        this.f21789i = bool.booleanValue();
    }

    /* renamed from: a */
    public void mo22961a(ImageAssetDelegate imageAssetDelegate) {
        this.f21794n = imageAssetDelegate;
        C8603b bVar = this.f21792l;
        if (bVar != null) {
            bVar.mo23216a(imageAssetDelegate);
        }
    }

    /* renamed from: a */
    public void mo22962a(C8469a aVar) {
        this.f21796p = aVar;
        C8602a aVar2 = this.f21795o;
        if (aVar2 != null) {
            aVar2.mo23214a(aVar);
        }
    }

    /* renamed from: a */
    public void mo22963a(C8539l lVar) {
        this.f21797q = lVar;
    }

    /* renamed from: a */
    public void mo22956a() {
        this.f21790j.clear();
        this.f21787g.cancel();
    }

    /* renamed from: a */
    public List<C8582e> mo22955a(C8582e eVar) {
        if (this.f21799s == null) {
            C8654d.m20155b("Cannot resolve KeyPath. Composition is not set yet.");
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        this.f21799s.resolveKeyPath(eVar, 0, arrayList, new C8582e(new String[0]));
        return arrayList;
    }

    /* renamed from: a */
    public <T> void mo22964a(C8582e eVar, T t, C8661c<T> cVar) {
        if (this.f21799s == null) {
            this.f21790j.add(new C8520e(eVar, t, cVar));
            return;
        }
        boolean z = true;
        if (eVar.mo23164a() != null) {
            eVar.mo23164a().addValueCallback(t, cVar);
        } else {
            List a = mo22955a(eVar);
            for (int i = 0; i < a.size(); i++) {
                ((C8582e) a.get(i)).mo23164a().addValueCallback(t, cVar);
            }
            z = true ^ a.isEmpty();
        }
        if (z) {
            invalidateSelf();
            if (t == LottieProperty.f21540A) {
                mo22974c(mo23000k());
            }
        }
    }

    /* renamed from: a */
    public Bitmap mo22953a(String str) {
        C8603b A = m19693A();
        if (A != null) {
            return A.mo23215a(str);
        }
        return null;
    }

    /* renamed from: a */
    public Typeface mo22954a(String str, String str2) {
        C8602a z = m19700z();
        if (z != null) {
            return z.mo23213a(str, str2);
        }
        return null;
    }

    /* renamed from: a */
    private float m19695a(Canvas canvas) {
        return Math.min(((float) canvas.getWidth()) / ((float) this.f21786f.mo22924a().width()), ((float) canvas.getHeight()) / ((float) this.f21786f.mo22924a().height()));
    }
}
