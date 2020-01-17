package com.squareup.picasso;

import android.graphics.Bitmap.Config;
import android.net.Uri;
import com.squareup.picasso.Picasso.C11848e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: com.squareup.picasso.s */
public final class C11889s {

    /* renamed from: s */
    private static final long f30807s = TimeUnit.SECONDS.toNanos(5);

    /* renamed from: a */
    int f30808a;

    /* renamed from: b */
    long f30809b;

    /* renamed from: c */
    int f30810c;

    /* renamed from: d */
    public final Uri f30811d;

    /* renamed from: e */
    public final int f30812e;

    /* renamed from: f */
    public final String f30813f;

    /* renamed from: g */
    public final List<Transformation> f30814g;

    /* renamed from: h */
    public final int f30815h;

    /* renamed from: i */
    public final int f30816i;

    /* renamed from: j */
    public final boolean f30817j;

    /* renamed from: k */
    public final boolean f30818k;

    /* renamed from: l */
    public final boolean f30819l;

    /* renamed from: m */
    public final float f30820m;

    /* renamed from: n */
    public final float f30821n;

    /* renamed from: o */
    public final float f30822o;

    /* renamed from: p */
    public final boolean f30823p;

    /* renamed from: q */
    public final Config f30824q;

    /* renamed from: r */
    public final C11848e f30825r;

    /* renamed from: com.squareup.picasso.s$b */
    public static final class C11891b {

        /* renamed from: a */
        private Uri f30826a;

        /* renamed from: b */
        private int f30827b;

        /* renamed from: c */
        private String f30828c;

        /* renamed from: d */
        private int f30829d;

        /* renamed from: e */
        private int f30830e;

        /* renamed from: f */
        private boolean f30831f;

        /* renamed from: g */
        private boolean f30832g;

        /* renamed from: h */
        private boolean f30833h;

        /* renamed from: i */
        private float f30834i;

        /* renamed from: j */
        private float f30835j;

        /* renamed from: k */
        private float f30836k;

        /* renamed from: l */
        private boolean f30837l;

        /* renamed from: m */
        private List<Transformation> f30838m;

        /* renamed from: n */
        private Config f30839n;

        /* renamed from: o */
        private C11848e f30840o;

        C11891b(Uri uri, int i, Config config) {
            this.f30826a = uri;
            this.f30827b = i;
            this.f30839n = config;
        }

        /* renamed from: a */
        public C11891b mo35149a(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Width must be positive number or 0.");
            } else if (i2 < 0) {
                throw new IllegalArgumentException("Height must be positive number or 0.");
            } else if (i2 == 0 && i == 0) {
                throw new IllegalArgumentException("At least one dimension has to be positive number.");
            } else {
                this.f30829d = i;
                this.f30830e = i2;
                return this;
            }
        }

        /* renamed from: b */
        public C11891b mo35152b() {
            if (!this.f30832g) {
                this.f30831f = true;
                return this;
            }
            throw new IllegalStateException("Center crop can not be used after calling centerInside");
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public boolean mo35153c() {
            return (this.f30826a == null && this.f30827b == 0) ? false : true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public boolean mo35154d() {
            return (this.f30829d == 0 && this.f30830e == 0) ? false : true;
        }

        /* renamed from: a */
        public C11891b mo35150a(Transformation transformation) {
            if (transformation == null) {
                throw new IllegalArgumentException("Transformation must not be null.");
            } else if (transformation.key() != null) {
                if (this.f30838m == null) {
                    this.f30838m = new ArrayList(2);
                }
                this.f30838m.add(transformation);
                return this;
            } else {
                throw new IllegalArgumentException("Transformation key must not be null.");
            }
        }

        /* renamed from: a */
        public C11889s mo35151a() {
            if (this.f30832g && this.f30831f) {
                throw new IllegalStateException("Center crop and center inside can not be used together.");
            } else if (this.f30831f && this.f30829d == 0 && this.f30830e == 0) {
                throw new IllegalStateException("Center crop requires calling resize with positive width and height.");
            } else if (this.f30832g && this.f30829d == 0 && this.f30830e == 0) {
                throw new IllegalStateException("Center inside requires calling resize with positive width and height.");
            } else {
                if (this.f30840o == null) {
                    this.f30840o = C11848e.NORMAL;
                }
                C11889s sVar = r2;
                C11889s sVar2 = new C11889s(this.f30826a, this.f30827b, this.f30828c, this.f30838m, this.f30829d, this.f30830e, this.f30831f, this.f30832g, this.f30833h, this.f30834i, this.f30835j, this.f30836k, this.f30837l, this.f30839n, this.f30840o);
                return sVar;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public String mo35141a() {
        Uri uri = this.f30811d;
        if (uri != null) {
            return String.valueOf(uri.getPath());
        }
        return Integer.toHexString(this.f30812e);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo35142b() {
        return this.f30814g != null;
    }

    /* renamed from: c */
    public boolean mo35143c() {
        return (this.f30815h == 0 && this.f30816i == 0) ? false : true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public String mo35144d() {
        long nanoTime = System.nanoTime() - this.f30809b;
        if (nanoTime > f30807s) {
            StringBuilder sb = new StringBuilder();
            sb.append(mo35147g());
            sb.append('+');
            sb.append(TimeUnit.NANOSECONDS.toSeconds(nanoTime));
            sb.append('s');
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(mo35147g());
        sb2.append('+');
        sb2.append(TimeUnit.NANOSECONDS.toMillis(nanoTime));
        sb2.append("ms");
        return sb2.toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public boolean mo35145e() {
        return mo35143c() || this.f30820m != 0.0f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public boolean mo35146f() {
        return mo35145e() || mo35142b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public String mo35147g() {
        StringBuilder sb = new StringBuilder();
        sb.append("[R");
        sb.append(this.f30808a);
        sb.append(']');
        return sb.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Request{");
        int i = this.f30812e;
        if (i > 0) {
            sb.append(i);
        } else {
            sb.append(this.f30811d);
        }
        List<Transformation> list = this.f30814g;
        if (list != null && !list.isEmpty()) {
            for (Transformation transformation : this.f30814g) {
                sb.append(' ');
                sb.append(transformation.key());
            }
        }
        if (this.f30813f != null) {
            sb.append(" stableKey(");
            sb.append(this.f30813f);
            sb.append(')');
        }
        if (this.f30815h > 0) {
            sb.append(" resize(");
            sb.append(this.f30815h);
            sb.append(',');
            sb.append(this.f30816i);
            sb.append(')');
        }
        if (this.f30817j) {
            sb.append(" centerCrop");
        }
        if (this.f30818k) {
            sb.append(" centerInside");
        }
        if (this.f30820m != 0.0f) {
            sb.append(" rotation(");
            sb.append(this.f30820m);
            if (this.f30823p) {
                sb.append(" @ ");
                sb.append(this.f30821n);
                sb.append(',');
                sb.append(this.f30822o);
            }
            sb.append(')');
        }
        if (this.f30824q != null) {
            sb.append(' ');
            sb.append(this.f30824q);
        }
        sb.append('}');
        return sb.toString();
    }

    private C11889s(Uri uri, int i, String str, List<Transformation> list, int i2, int i3, boolean z, boolean z2, boolean z3, float f, float f2, float f3, boolean z4, Config config, C11848e eVar) {
        this.f30811d = uri;
        this.f30812e = i;
        this.f30813f = str;
        if (list == null) {
            this.f30814g = null;
        } else {
            this.f30814g = Collections.unmodifiableList(list);
        }
        this.f30815h = i2;
        this.f30816i = i3;
        this.f30817j = z;
        this.f30818k = z2;
        this.f30819l = z3;
        this.f30820m = f;
        this.f30821n = f2;
        this.f30822o = f3;
        this.f30823p = z4;
        this.f30824q = config;
        this.f30825r = eVar;
    }
}
