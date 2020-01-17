package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import com.squareup.picasso.C11889s.C11891b;
import com.squareup.picasso.Picasso.C11847d;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.squareup.picasso.t */
public class C11892t {

    /* renamed from: m */
    private static final AtomicInteger f30841m = new AtomicInteger();

    /* renamed from: a */
    private final Picasso f30842a;

    /* renamed from: b */
    private final C11891b f30843b;

    /* renamed from: c */
    private boolean f30844c;

    /* renamed from: d */
    private boolean f30845d;

    /* renamed from: e */
    private boolean f30846e = true;

    /* renamed from: f */
    private int f30847f;

    /* renamed from: g */
    private int f30848g;

    /* renamed from: h */
    private int f30849h;

    /* renamed from: i */
    private int f30850i;

    /* renamed from: j */
    private Drawable f30851j;

    /* renamed from: k */
    private Drawable f30852k;

    /* renamed from: l */
    private Object f30853l;

    C11892t(Picasso picasso, Uri uri, int i) {
        if (!picasso.f30672o) {
            this.f30842a = picasso;
            this.f30843b = new C11891b(uri, i, picasso.f30669l);
            return;
        }
        throw new IllegalStateException("Picasso instance already shut down. Cannot submit new requests.");
    }

    /* renamed from: f */
    private Drawable m31234f() {
        if (this.f30847f != 0) {
            return this.f30842a.f30662e.getResources().getDrawable(this.f30847f);
        }
        return this.f30851j;
    }

    /* renamed from: a */
    public C11892t mo35156a(int i, int i2) {
        this.f30843b.mo35149a(i, i2);
        return this;
    }

    /* renamed from: b */
    public C11892t mo35161b() {
        this.f30845d = true;
        return this;
    }

    /* renamed from: c */
    public C11892t mo35162c() {
        this.f30844c = true;
        return this;
    }

    /* renamed from: d */
    public C11892t mo35163d() {
        if (this.f30847f != 0) {
            throw new IllegalStateException("Placeholder resource already set.");
        } else if (this.f30851j == null) {
            this.f30846e = false;
            return this;
        } else {
            throw new IllegalStateException("Placeholder image already set.");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public C11892t mo35164e() {
        this.f30845d = false;
        return this;
    }

    /* renamed from: a */
    public C11892t mo35155a() {
        this.f30843b.mo35152b();
        return this;
    }

    /* renamed from: a */
    public C11892t mo35157a(Transformation transformation) {
        this.f30843b.mo35150a(transformation);
        return this;
    }

    /* renamed from: a */
    public void mo35160a(Target target) {
        long nanoTime = System.nanoTime();
        C11851a0.m31109a();
        if (target == null) {
            throw new IllegalArgumentException("Target must not be null.");
        } else if (!this.f30845d) {
            Drawable drawable = null;
            if (!this.f30843b.mo35153c()) {
                this.f30842a.mo35032a(target);
                if (this.f30846e) {
                    drawable = m31234f();
                }
                target.onPrepareLoad(drawable);
                return;
            }
            C11889s a = m31233a(nanoTime);
            String a2 = C11851a0.m31107a(a);
            if (C11881m.m31202a(this.f30849h)) {
                Bitmap b = this.f30842a.mo35035b(a2);
                if (b != null) {
                    this.f30842a.mo35032a(target);
                    target.onBitmapLoaded(b, C11847d.MEMORY);
                    return;
                }
            }
            if (this.f30846e) {
                drawable = m31234f();
            }
            target.onPrepareLoad(drawable);
            C11900y yVar = new C11900y(this.f30842a, target, a, this.f30849h, this.f30850i, this.f30852k, a2, this.f30853l, this.f30848g);
            this.f30842a.mo35033a((C11849a) yVar);
        } else {
            throw new IllegalStateException("Fit cannot be used with a Target.");
        }
    }

    /* renamed from: a */
    public void mo35158a(ImageView imageView) {
        mo35159a(imageView, (Callback) null);
    }

    /* renamed from: a */
    public void mo35159a(ImageView imageView, Callback callback) {
        ImageView imageView2 = imageView;
        Callback callback2 = callback;
        long nanoTime = System.nanoTime();
        C11851a0.m31109a();
        if (imageView2 == null) {
            throw new IllegalArgumentException("Target must not be null.");
        } else if (!this.f30843b.mo35153c()) {
            this.f30842a.mo35030a(imageView2);
            if (this.f30846e) {
                C11886q.m31216a(imageView2, m31234f());
            }
        } else {
            if (this.f30845d) {
                if (!this.f30843b.mo35154d()) {
                    int width = imageView.getWidth();
                    int height = imageView.getHeight();
                    if (width == 0 || height == 0) {
                        if (this.f30846e) {
                            C11886q.m31216a(imageView2, m31234f());
                        }
                        this.f30842a.mo35031a(imageView2, new C11869f(this, imageView2, callback2));
                        return;
                    }
                    this.f30843b.mo35149a(width, height);
                } else {
                    throw new IllegalStateException("Fit cannot be used with resize.");
                }
            }
            C11889s a = m31233a(nanoTime);
            String a2 = C11851a0.m31107a(a);
            if (C11881m.m31202a(this.f30849h)) {
                Bitmap b = this.f30842a.mo35035b(a2);
                if (b != null) {
                    this.f30842a.mo35030a(imageView2);
                    Picasso picasso = this.f30842a;
                    C11886q.m31215a(imageView, picasso.f30662e, b, C11847d.MEMORY, this.f30844c, picasso.f30670m);
                    if (this.f30842a.f30671n) {
                        String g = a.mo35147g();
                        StringBuilder sb = new StringBuilder();
                        sb.append("from ");
                        sb.append(C11847d.MEMORY);
                        C11851a0.m31113a("Main", "completed", g, sb.toString());
                    }
                    if (callback2 != null) {
                        callback.onSuccess();
                    }
                    return;
                }
            }
            if (this.f30846e) {
                C11886q.m31216a(imageView2, m31234f());
            }
            C11876i iVar = new C11876i(this.f30842a, imageView, a, this.f30849h, this.f30850i, this.f30848g, this.f30852k, a2, this.f30853l, callback, this.f30844c);
            this.f30842a.mo35033a((C11849a) iVar);
        }
    }

    /* renamed from: a */
    private C11889s m31233a(long j) {
        int andIncrement = f30841m.getAndIncrement();
        C11889s a = this.f30843b.mo35151a();
        a.f30808a = andIncrement;
        a.f30809b = j;
        boolean z = this.f30842a.f30671n;
        String str = "Main";
        if (z) {
            C11851a0.m31113a(str, "created", a.mo35147g(), a.toString());
        }
        C11889s a2 = this.f30842a.mo35025a(a);
        if (a2 != a) {
            a2.f30808a = andIncrement;
            a2.f30809b = j;
            if (z) {
                String d = a2.mo35144d();
                StringBuilder sb = new StringBuilder();
                sb.append("into ");
                sb.append(a2);
                C11851a0.m31113a(str, "changed", d, sb.toString());
            }
        }
        return a2;
    }
}
