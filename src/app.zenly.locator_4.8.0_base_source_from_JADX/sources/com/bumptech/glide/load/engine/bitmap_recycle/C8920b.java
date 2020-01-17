package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import com.bumptech.glide.p301o.C9217k;

/* renamed from: com.bumptech.glide.load.engine.bitmap_recycle.b */
class C8920b implements C8935j {

    /* renamed from: a */
    private final C8922b f23244a = new C8922b();

    /* renamed from: b */
    private final C8926f<C8921a, Bitmap> f23245b = new C8926f<>();

    /* renamed from: com.bumptech.glide.load.engine.bitmap_recycle.b$a */
    static class C8921a implements C8936k {

        /* renamed from: a */
        private final C8922b f23246a;

        /* renamed from: b */
        private int f23247b;

        /* renamed from: c */
        private int f23248c;

        /* renamed from: d */
        private Config f23249d;

        public C8921a(C8922b bVar) {
            this.f23246a = bVar;
        }

        /* renamed from: a */
        public void mo24334a(int i, int i2, Config config) {
            this.f23247b = i;
            this.f23248c = i2;
            this.f23249d = config;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C8921a)) {
                return false;
            }
            C8921a aVar = (C8921a) obj;
            if (this.f23247b == aVar.f23247b && this.f23248c == aVar.f23248c && this.f23249d == aVar.f23249d) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i = ((this.f23247b * 31) + this.f23248c) * 31;
            Config config = this.f23249d;
            return i + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return C8920b.m21409b(this.f23247b, this.f23248c, this.f23249d);
        }

        /* renamed from: a */
        public void mo24333a() {
            this.f23246a.mo24340a(this);
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.bitmap_recycle.b$b */
    static class C8922b extends C8923c<C8921a> {
        C8922b() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C8921a mo24339a(int i, int i2, Config config) {
            C8921a aVar = (C8921a) mo24341b();
            aVar.mo24334a(i, i2, config);
            return aVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C8921a m21418a() {
            return new C8921a(this);
        }
    }

    C8920b() {
    }

    /* renamed from: c */
    private static String m21410c(Bitmap bitmap) {
        return m21409b(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
    }

    /* renamed from: a */
    public String mo24327a(Bitmap bitmap) {
        return m21410c(bitmap);
    }

    /* renamed from: b */
    public int mo24328b(Bitmap bitmap) {
        return C9217k.m22093a(bitmap);
    }

    public Bitmap get(int i, int i2, Config config) {
        return (Bitmap) this.f23245b.mo24344a(this.f23244a.mo24339a(i, i2, config));
    }

    public void put(Bitmap bitmap) {
        this.f23245b.mo24345a(this.f23244a.mo24339a(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig()), bitmap);
    }

    public Bitmap removeLast() {
        return (Bitmap) this.f23245b.mo24343a();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AttributeStrategy:\n  ");
        sb.append(this.f23245b);
        return sb.toString();
    }

    /* renamed from: b */
    static String m21409b(int i, int i2, Config config) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append(i);
        sb.append("x");
        sb.append(i2);
        sb.append("], ");
        sb.append(config);
        return sb.toString();
    }

    /* renamed from: a */
    public String mo24326a(int i, int i2, Config config) {
        return m21409b(i, i2, config);
    }
}
