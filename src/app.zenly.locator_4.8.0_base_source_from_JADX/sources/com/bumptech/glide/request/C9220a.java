package com.bumptech.glide.request;

import android.content.res.Resources.Theme;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.RecyclerView.ItemAnimator;
import com.bumptech.glide.C8859g;
import com.bumptech.glide.load.C8910e;
import com.bumptech.glide.load.C9011f;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Option;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.C8978i;
import com.bumptech.glide.load.resource.bitmap.C9107c;
import com.bumptech.glide.load.resource.bitmap.C9113i;
import com.bumptech.glide.load.resource.bitmap.C9114j;
import com.bumptech.glide.load.resource.bitmap.C9115k;
import com.bumptech.glide.load.resource.bitmap.C9121m;
import com.bumptech.glide.load.resource.bitmap.C9131o;
import com.bumptech.glide.load.resource.bitmap.C9133q;
import com.bumptech.glide.load.resource.gif.C9156c;
import com.bumptech.glide.load.resource.gif.C9160f;
import com.bumptech.glide.load.resource.gif.C9162h;
import com.bumptech.glide.p300n.C9201c;
import com.bumptech.glide.p301o.C9206b;
import com.bumptech.glide.p301o.C9216j;
import com.bumptech.glide.p301o.C9217k;
import com.bumptech.glide.request.C9220a;
import java.util.Map;

/* renamed from: com.bumptech.glide.request.a */
public abstract class C9220a<T extends C9220a<T>> implements Cloneable {

    /* renamed from: A */
    private boolean f23897A;

    /* renamed from: B */
    private boolean f23898B;

    /* renamed from: C */
    private boolean f23899C = true;

    /* renamed from: D */
    private boolean f23900D;

    /* renamed from: e */
    private int f23901e;

    /* renamed from: f */
    private float f23902f = 1.0f;

    /* renamed from: g */
    private C8978i f23903g = C8978i.f23427e;

    /* renamed from: h */
    private C8859g f23904h = C8859g.NORMAL;

    /* renamed from: i */
    private Drawable f23905i;

    /* renamed from: j */
    private int f23906j;

    /* renamed from: k */
    private Drawable f23907k;

    /* renamed from: l */
    private int f23908l;

    /* renamed from: m */
    private boolean f23909m = true;

    /* renamed from: n */
    private int f23910n = -1;

    /* renamed from: o */
    private int f23911o = -1;

    /* renamed from: p */
    private Key f23912p = C9201c.m22054a();

    /* renamed from: q */
    private boolean f23913q;

    /* renamed from: r */
    private boolean f23914r = true;

    /* renamed from: s */
    private Drawable f23915s;

    /* renamed from: t */
    private int f23916t;

    /* renamed from: u */
    private C9011f f23917u = new C9011f();

    /* renamed from: v */
    private Map<Class<?>, Transformation<?>> f23918v = new C9206b();

    /* renamed from: w */
    private Class<?> f23919w = Object.class;

    /* renamed from: x */
    private boolean f23920x;

    /* renamed from: y */
    private Theme f23921y;

    /* renamed from: z */
    private boolean f23922z;

    /* renamed from: M */
    private T mo24170M() {
        return this;
    }

    /* renamed from: N */
    private T m22111N() {
        if (!this.f23920x) {
            mo24170M();
            return this;
        }
        throw new IllegalStateException("You cannot modify locked T, consider clone()");
    }

    /* renamed from: b */
    private static boolean mo24174b(int i, int i2) {
        return (i & i2) != 0;
    }

    /* renamed from: A */
    public final boolean mo24857A() {
        return this.f23909m;
    }

    /* renamed from: B */
    public final boolean mo24858B() {
        return m22115c(8);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: C */
    public boolean mo24859C() {
        return this.f23899C;
    }

    /* renamed from: D */
    public final boolean mo24860D() {
        return m22115c(256);
    }

    /* renamed from: E */
    public final boolean mo24861E() {
        return this.f23914r;
    }

    /* renamed from: F */
    public final boolean mo24862F() {
        return this.f23913q;
    }

    /* renamed from: G */
    public final boolean mo24863G() {
        return m22115c(ItemAnimator.FLAG_MOVED);
    }

    /* renamed from: H */
    public final boolean mo24864H() {
        return C9217k.m22104b(this.f23911o, this.f23910n);
    }

    /* renamed from: I */
    public T mo8506I() {
        this.f23920x = true;
        mo24170M();
        return this;
    }

    /* renamed from: J */
    public T mo8507J() {
        return mo24866a(C9121m.f23698c, (Transformation<Bitmap>) new C9113i<Bitmap>());
    }

    /* renamed from: K */
    public T mo8508K() {
        return m22114c(C9121m.f23697b, new C9114j());
    }

    /* renamed from: L */
    public T mo8509L() {
        return m22114c(C9121m.f23696a, new C9133q());
    }

    /* renamed from: a */
    public T mo8511a(float f) {
        if (this.f23922z) {
            return clone().mo8511a(f);
        }
        if (f < 0.0f || f > 1.0f) {
            throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
        }
        this.f23902f = f;
        this.f23901e |= 2;
        m22111N();
        return this;
    }

    /* renamed from: b */
    public T mo8523b(boolean z) {
        if (this.f23922z) {
            return clone().mo8523b(z);
        }
        this.f23900D = z;
        this.f23901e |= 1048576;
        m22111N();
        return this;
    }

    /* renamed from: c */
    public T mo8540c() {
        return m22116d(C9121m.f23697b, new C9114j());
    }

    /* renamed from: d */
    public T mo8541d() {
        return mo24868b(C9121m.f23697b, (Transformation<Bitmap>) new C9115k<Bitmap>());
    }

    /* renamed from: e */
    public T mo8525e() {
        return mo8515a(C9162h.f23789b, (Y) Boolean.valueOf(true));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C9220a)) {
            return false;
        }
        C9220a aVar = (C9220a) obj;
        if (Float.compare(aVar.f23902f, this.f23902f) == 0 && this.f23906j == aVar.f23906j && C9217k.m22105b((Object) this.f23905i, (Object) aVar.f23905i) && this.f23908l == aVar.f23908l && C9217k.m22105b((Object) this.f23907k, (Object) aVar.f23907k) && this.f23916t == aVar.f23916t && C9217k.m22105b((Object) this.f23915s, (Object) aVar.f23915s) && this.f23909m == aVar.f23909m && this.f23910n == aVar.f23910n && this.f23911o == aVar.f23911o && this.f23913q == aVar.f23913q && this.f23914r == aVar.f23914r && this.f23897A == aVar.f23897A && this.f23898B == aVar.f23898B && this.f23903g.equals(aVar.f23903g) && this.f23904h == aVar.f23904h && this.f23917u.equals(aVar.f23917u) && this.f23918v.equals(aVar.f23918v) && this.f23919w.equals(aVar.f23919w) && C9217k.m22105b((Object) this.f23912p, (Object) aVar.f23912p) && C9217k.m22105b((Object) this.f23921y, (Object) aVar.f23921y)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public T mo8542f() {
        return m22116d(C9121m.f23696a, new C9133q());
    }

    /* renamed from: g */
    public final C8978i mo24870g() {
        return this.f23903g;
    }

    /* renamed from: h */
    public final int mo24871h() {
        return this.f23906j;
    }

    public int hashCode() {
        return C9217k.m22094a((Object) this.f23921y, C9217k.m22094a((Object) this.f23912p, C9217k.m22094a((Object) this.f23919w, C9217k.m22094a((Object) this.f23918v, C9217k.m22094a((Object) this.f23917u, C9217k.m22094a((Object) this.f23904h, C9217k.m22094a((Object) this.f23903g, C9217k.m22095a(this.f23898B, C9217k.m22095a(this.f23897A, C9217k.m22095a(this.f23914r, C9217k.m22095a(this.f23913q, C9217k.m22090a(this.f23911o, C9217k.m22090a(this.f23910n, C9217k.m22095a(this.f23909m, C9217k.m22094a((Object) this.f23915s, C9217k.m22090a(this.f23916t, C9217k.m22094a((Object) this.f23907k, C9217k.m22090a(this.f23908l, C9217k.m22094a((Object) this.f23905i, C9217k.m22090a(this.f23906j, C9217k.m22088a(this.f23902f)))))))))))))))))))));
    }

    /* renamed from: i */
    public final Drawable mo24873i() {
        return this.f23905i;
    }

    /* renamed from: j */
    public final Drawable mo24874j() {
        return this.f23915s;
    }

    /* renamed from: k */
    public final int mo24875k() {
        return this.f23916t;
    }

    /* renamed from: l */
    public final boolean mo24876l() {
        return this.f23898B;
    }

    /* renamed from: m */
    public final C9011f mo24877m() {
        return this.f23917u;
    }

    /* renamed from: n */
    public final int mo24878n() {
        return this.f23910n;
    }

    /* renamed from: o */
    public final int mo24879o() {
        return this.f23911o;
    }

    /* renamed from: p */
    public final Drawable mo24880p() {
        return this.f23907k;
    }

    /* renamed from: q */
    public final int mo24881q() {
        return this.f23908l;
    }

    /* renamed from: r */
    public final C8859g mo24882r() {
        return this.f23904h;
    }

    /* renamed from: s */
    public final Class<?> mo24883s() {
        return this.f23919w;
    }

    /* renamed from: t */
    public final Key mo24884t() {
        return this.f23912p;
    }

    /* renamed from: u */
    public final float mo24885u() {
        return this.f23902f;
    }

    /* renamed from: v */
    public final Theme mo24886v() {
        return this.f23921y;
    }

    /* renamed from: w */
    public final Map<Class<?>, Transformation<?>> mo24887w() {
        return this.f23918v;
    }

    /* renamed from: x */
    public final boolean mo24888x() {
        return this.f23900D;
    }

    /* renamed from: y */
    public final boolean mo24889y() {
        return this.f23897A;
    }

    /* renamed from: z */
    public final boolean mo24890z() {
        return m22115c(4);
    }

    /* renamed from: c */
    private T m22114c(C9121m mVar, Transformation<Bitmap> transformation) {
        return m22112a(mVar, transformation, false);
    }

    /* renamed from: d */
    private T m22116d(C9121m mVar, Transformation<Bitmap> transformation) {
        return m22112a(mVar, transformation, true);
    }

    public T clone() {
        try {
            T t = (C9220a) super.clone();
            t.f23917u = new C9011f();
            t.f23917u.mo24518a(this.f23917u);
            t.f23918v = new C9206b();
            t.f23918v.putAll(this.f23918v);
            t.f23920x = false;
            t.f23922z = false;
            return t;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: c */
    private boolean m22115c(int i) {
        return mo24174b(this.f23901e, i);
    }

    /* renamed from: b */
    public T mo8522b(int i) {
        return mo8512a(i, i);
    }

    /* renamed from: a */
    public T mo8517a(C8978i iVar) {
        if (this.f23922z) {
            return clone().mo8517a(iVar);
        }
        C9216j.m22083a(iVar);
        this.f23903g = iVar;
        this.f23901e |= 4;
        m22111N();
        return this;
    }

    /* renamed from: b */
    public T mo8537b() {
        return mo24868b(C9121m.f23698c, (Transformation<Bitmap>) new C9113i<Bitmap>());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final T mo24868b(C9121m mVar, Transformation<Bitmap> transformation) {
        if (this.f23922z) {
            return clone().mo24868b(mVar, transformation);
        }
        mo8518a(mVar);
        return mo8516a(transformation);
    }

    /* renamed from: a */
    public T mo8513a(C8859g gVar) {
        if (this.f23922z) {
            return clone().mo8513a(gVar);
        }
        C9216j.m22083a(gVar);
        this.f23904h = gVar;
        this.f23901e |= 8;
        m22111N();
        return this;
    }

    /* renamed from: a */
    public T mo8521a(boolean z) {
        if (this.f23922z) {
            return clone().mo8521a(true);
        }
        this.f23909m = !z;
        this.f23901e |= 256;
        m22111N();
        return this;
    }

    /* renamed from: a */
    public T mo8512a(int i, int i2) {
        if (this.f23922z) {
            return clone().mo8512a(i, i2);
        }
        this.f23911o = i;
        this.f23910n = i2;
        this.f23901e |= 512;
        m22111N();
        return this;
    }

    /* renamed from: a */
    public T mo8514a(Key key) {
        if (this.f23922z) {
            return clone().mo8514a(key);
        }
        C9216j.m22083a(key);
        this.f23912p = key;
        this.f23901e |= 1024;
        m22111N();
        return this;
    }

    /* renamed from: a */
    public <Y> T mo8515a(Option<Y> option, Y y) {
        if (this.f23922z) {
            return clone().mo8515a(option, y);
        }
        C9216j.m22083a(option);
        C9216j.m22083a(y);
        this.f23917u.mo24516a(option, y);
        m22111N();
        return this;
    }

    /* renamed from: a */
    public T mo8520a(Class<?> cls) {
        if (this.f23922z) {
            return clone().mo8520a(cls);
        }
        C9216j.m22083a(cls);
        this.f23919w = cls;
        this.f23901e |= 4096;
        m22111N();
        return this;
    }

    /* renamed from: a */
    public T mo8526a(int i) {
        return mo8515a(C9107c.f23680b, (Y) Integer.valueOf(i));
    }

    /* renamed from: a */
    public T mo8518a(C9121m mVar) {
        Option<C9121m> option = C9121m.f23701f;
        C9216j.m22083a(mVar);
        return mo8515a(option, (Y) mVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final T mo24866a(C9121m mVar, Transformation<Bitmap> transformation) {
        if (this.f23922z) {
            return clone().mo24866a(mVar, transformation);
        }
        mo8518a(mVar);
        return mo24865a(transformation, false);
    }

    /* renamed from: a */
    private T m22112a(C9121m mVar, Transformation<Bitmap> transformation, boolean z) {
        T t;
        if (z) {
            t = mo24868b(mVar, transformation);
        } else {
            t = mo24866a(mVar, transformation);
        }
        t.f23899C = true;
        return t;
    }

    /* renamed from: a */
    public T mo8516a(Transformation<Bitmap> transformation) {
        return mo24865a(transformation, true);
    }

    /* renamed from: a */
    public T mo8536a(Transformation<Bitmap>... transformationArr) {
        if (transformationArr.length > 1) {
            return mo24865a((Transformation<Bitmap>) new C8910e<Bitmap>(transformationArr), true);
        }
        if (transformationArr.length == 1) {
            return mo8516a(transformationArr[0]);
        }
        m22111N();
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public T mo24865a(Transformation<Bitmap> transformation, boolean z) {
        if (this.f23922z) {
            return clone().mo24865a(transformation, z);
        }
        C9131o oVar = new C9131o(transformation, z);
        mo24867a(Bitmap.class, transformation, z);
        mo24867a(Drawable.class, (Transformation<Y>) oVar, z);
        oVar.mo24640a();
        mo24867a(BitmapDrawable.class, (Transformation<Y>) oVar, z);
        mo24867a(C9156c.class, (Transformation<Y>) new C9160f<Y>(transformation), z);
        m22111N();
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public <Y> T mo24867a(Class<Y> cls, Transformation<Y> transformation, boolean z) {
        if (this.f23922z) {
            return clone().mo24867a(cls, transformation, z);
        }
        C9216j.m22083a(cls);
        C9216j.m22083a(transformation);
        this.f23918v.put(cls, transformation);
        this.f23901e |= ItemAnimator.FLAG_MOVED;
        this.f23914r = true;
        this.f23901e |= 65536;
        this.f23899C = false;
        if (z) {
            this.f23901e |= 131072;
            this.f23913q = true;
        }
        m22111N();
        return this;
    }

    /* renamed from: a */
    public T mo8519a(C9220a<?> aVar) {
        if (this.f23922z) {
            return clone().mo8519a(aVar);
        }
        if (mo24174b(aVar.f23901e, 2)) {
            this.f23902f = aVar.f23902f;
        }
        if (mo24174b(aVar.f23901e, 262144)) {
            this.f23897A = aVar.f23897A;
        }
        if (mo24174b(aVar.f23901e, 1048576)) {
            this.f23900D = aVar.f23900D;
        }
        if (mo24174b(aVar.f23901e, 4)) {
            this.f23903g = aVar.f23903g;
        }
        if (mo24174b(aVar.f23901e, 8)) {
            this.f23904h = aVar.f23904h;
        }
        if (mo24174b(aVar.f23901e, 16)) {
            this.f23905i = aVar.f23905i;
            this.f23906j = 0;
            this.f23901e &= -33;
        }
        if (mo24174b(aVar.f23901e, 32)) {
            this.f23906j = aVar.f23906j;
            this.f23905i = null;
            this.f23901e &= -17;
        }
        if (mo24174b(aVar.f23901e, 64)) {
            this.f23907k = aVar.f23907k;
            this.f23908l = 0;
            this.f23901e &= -129;
        }
        if (mo24174b(aVar.f23901e, 128)) {
            this.f23908l = aVar.f23908l;
            this.f23907k = null;
            this.f23901e &= -65;
        }
        if (mo24174b(aVar.f23901e, 256)) {
            this.f23909m = aVar.f23909m;
        }
        if (mo24174b(aVar.f23901e, 512)) {
            this.f23911o = aVar.f23911o;
            this.f23910n = aVar.f23910n;
        }
        if (mo24174b(aVar.f23901e, 1024)) {
            this.f23912p = aVar.f23912p;
        }
        if (mo24174b(aVar.f23901e, 4096)) {
            this.f23919w = aVar.f23919w;
        }
        if (mo24174b(aVar.f23901e, 8192)) {
            this.f23915s = aVar.f23915s;
            this.f23916t = 0;
            this.f23901e &= -16385;
        }
        if (mo24174b(aVar.f23901e, 16384)) {
            this.f23916t = aVar.f23916t;
            this.f23915s = null;
            this.f23901e &= -8193;
        }
        if (mo24174b(aVar.f23901e, 32768)) {
            this.f23921y = aVar.f23921y;
        }
        if (mo24174b(aVar.f23901e, 65536)) {
            this.f23914r = aVar.f23914r;
        }
        if (mo24174b(aVar.f23901e, 131072)) {
            this.f23913q = aVar.f23913q;
        }
        if (mo24174b(aVar.f23901e, (int) ItemAnimator.FLAG_MOVED)) {
            this.f23918v.putAll(aVar.f23918v);
            this.f23899C = aVar.f23899C;
        }
        if (mo24174b(aVar.f23901e, 524288)) {
            this.f23898B = aVar.f23898B;
        }
        if (!this.f23914r) {
            this.f23918v.clear();
            this.f23901e &= -2049;
            this.f23913q = false;
            this.f23901e &= -131073;
            this.f23899C = true;
        }
        this.f23901e |= aVar.f23901e;
        this.f23917u.mo24518a(aVar.f23917u);
        m22111N();
        return this;
    }

    /* renamed from: a */
    public T mo8510a() {
        if (!this.f23920x || this.f23922z) {
            this.f23922z = true;
            return mo8506I();
        }
        throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
    }
}
