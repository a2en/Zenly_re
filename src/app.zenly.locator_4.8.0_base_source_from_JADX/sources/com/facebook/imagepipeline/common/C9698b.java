package com.facebook.imagepipeline.common;

import android.graphics.Bitmap.Config;
import android.graphics.ColorSpace;
import com.facebook.imagepipeline.decoder.ImageDecoder;
import com.facebook.imagepipeline.transformation.BitmapTransformation;

/* renamed from: com.facebook.imagepipeline.common.b */
public class C9698b {

    /* renamed from: j */
    private static final C9698b f25332j = m23842b().mo26260a();

    /* renamed from: a */
    public final int f25333a;

    /* renamed from: b */
    public final boolean f25334b;

    /* renamed from: c */
    public final boolean f25335c;

    /* renamed from: d */
    public final boolean f25336d;

    /* renamed from: e */
    public final boolean f25337e;

    /* renamed from: f */
    public final Config f25338f;

    /* renamed from: g */
    public final ImageDecoder f25339g;

    /* renamed from: h */
    public final BitmapTransformation f25340h;

    /* renamed from: i */
    public final ColorSpace f25341i;

    public C9698b(C9699c cVar) {
        this.f25333a = cVar.mo26268i();
        this.f25334b = cVar.mo26266g();
        this.f25335c = cVar.mo26269j();
        this.f25336d = cVar.mo26265f();
        this.f25337e = cVar.mo26267h();
        this.f25338f = cVar.mo26261b();
        this.f25339g = cVar.mo26264e();
        this.f25340h = cVar.mo26262c();
        this.f25341i = cVar.mo26263d();
    }

    /* renamed from: a */
    public static C9698b m23841a() {
        return f25332j;
    }

    /* renamed from: b */
    public static C9699c m23842b() {
        return new C9699c();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C9698b.class != obj.getClass()) {
            return false;
        }
        C9698b bVar = (C9698b) obj;
        return this.f25334b == bVar.f25334b && this.f25335c == bVar.f25335c && this.f25336d == bVar.f25336d && this.f25337e == bVar.f25337e && this.f25338f == bVar.f25338f && this.f25339g == bVar.f25339g && this.f25340h == bVar.f25340h && this.f25341i == bVar.f25341i;
    }

    public int hashCode() {
        int ordinal = ((((((((((this.f25333a * 31) + (this.f25334b ? 1 : 0)) * 31) + (this.f25335c ? 1 : 0)) * 31) + (this.f25336d ? 1 : 0)) * 31) + (this.f25337e ? 1 : 0)) * 31) + this.f25338f.ordinal()) * 31;
        ImageDecoder imageDecoder = this.f25339g;
        int i = 0;
        int hashCode = (ordinal + (imageDecoder != null ? imageDecoder.hashCode() : 0)) * 31;
        BitmapTransformation bitmapTransformation = this.f25340h;
        int hashCode2 = (hashCode + (bitmapTransformation != null ? bitmapTransformation.hashCode() : 0)) * 31;
        ColorSpace colorSpace = this.f25341i;
        if (colorSpace != null) {
            i = colorSpace.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return String.format(null, "%d-%b-%b-%b-%b-%b-%s-%s-%s", new Object[]{Integer.valueOf(this.f25333a), Boolean.valueOf(this.f25334b), Boolean.valueOf(this.f25335c), Boolean.valueOf(this.f25336d), Boolean.valueOf(this.f25337e), this.f25338f.name(), this.f25339g, this.f25340h, this.f25341i});
    }
}
