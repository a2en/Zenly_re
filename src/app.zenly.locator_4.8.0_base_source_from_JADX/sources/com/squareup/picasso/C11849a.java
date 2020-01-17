package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.squareup.picasso.Picasso.C11847d;
import com.squareup.picasso.Picasso.C11848e;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: com.squareup.picasso.a */
abstract class C11849a<T> {

    /* renamed from: a */
    final Picasso f30696a;

    /* renamed from: b */
    final C11889s f30697b;

    /* renamed from: c */
    final WeakReference<T> f30698c;

    /* renamed from: d */
    final boolean f30699d;

    /* renamed from: e */
    final int f30700e;

    /* renamed from: f */
    final int f30701f;

    /* renamed from: g */
    final int f30702g;

    /* renamed from: h */
    final Drawable f30703h;

    /* renamed from: i */
    final String f30704i;

    /* renamed from: j */
    final Object f30705j;

    /* renamed from: k */
    boolean f30706k;

    /* renamed from: l */
    boolean f30707l;

    /* renamed from: com.squareup.picasso.a$a */
    static class C11850a<M> extends WeakReference<M> {

        /* renamed from: a */
        final C11849a f30708a;

        public C11850a(C11849a aVar, M m, ReferenceQueue<? super M> referenceQueue) {
            super(m, referenceQueue);
            this.f30708a = aVar;
        }
    }

    C11849a(Picasso picasso, T t, C11889s sVar, int i, int i2, int i3, Drawable drawable, String str, Object obj, boolean z) {
        WeakReference<T> weakReference;
        this.f30696a = picasso;
        this.f30697b = sVar;
        if (t == null) {
            weakReference = null;
        } else {
            weakReference = new C11850a<>(this, t, picasso.f30668k);
        }
        this.f30698c = weakReference;
        this.f30700e = i;
        this.f30701f = i2;
        this.f30699d = z;
        this.f30702g = i3;
        this.f30703h = drawable;
        this.f30704i = str;
        if (obj == 0) {
            obj = this;
        }
        this.f30705j = obj;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo35052a() {
        this.f30707l = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo35053a(Bitmap bitmap, C11847d dVar);

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public abstract void mo35054b();

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public String mo35055c() {
        return this.f30704i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public int mo35056d() {
        return this.f30700e;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public int mo35057e() {
        return this.f30701f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public Picasso mo35058f() {
        return this.f30696a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public C11848e mo35059g() {
        return this.f30697b.f30825r;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public C11889s mo35060h() {
        return this.f30697b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public Object mo35061i() {
        return this.f30705j;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public T mo35062j() {
        WeakReference<T> weakReference = this.f30698c;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public boolean mo35063k() {
        return this.f30707l;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public boolean mo35064l() {
        return this.f30706k;
    }
}
