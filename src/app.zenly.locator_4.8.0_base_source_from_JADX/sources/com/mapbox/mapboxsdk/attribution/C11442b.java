package com.mapbox.mapboxsdk.attribution;

import android.graphics.Bitmap;
import android.graphics.PointF;

/* renamed from: com.mapbox.mapboxsdk.attribution.b */
public class C11442b {

    /* renamed from: a */
    private Bitmap f29604a;

    /* renamed from: b */
    private PointF f29605b;

    /* renamed from: c */
    private boolean f29606c;

    public C11442b(Bitmap bitmap, PointF pointF, boolean z) {
        this.f29604a = bitmap;
        this.f29605b = pointF;
        this.f29606c = z;
    }

    /* renamed from: a */
    public PointF mo33300a() {
        return this.f29605b;
    }

    /* renamed from: b */
    public Bitmap mo33301b() {
        return this.f29604a;
    }

    /* renamed from: c */
    public boolean mo33302c() {
        return this.f29606c;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || C11442b.class != obj.getClass()) {
            return false;
        }
        C11442b bVar = (C11442b) obj;
        Bitmap bitmap = this.f29604a;
        if (bitmap == null ? bVar.f29604a != null : !bitmap.equals(bVar.f29604a)) {
            return false;
        }
        PointF pointF = this.f29605b;
        PointF pointF2 = bVar.f29605b;
        if (pointF != null) {
            z = pointF.equals(pointF2);
        } else if (pointF2 != null) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        Bitmap bitmap = this.f29604a;
        int i = 0;
        int hashCode = (bitmap != null ? bitmap.hashCode() : 0) * 31;
        PointF pointF = this.f29605b;
        if (pointF != null) {
            i = pointF.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AttributionLayout{logo=");
        sb.append(this.f29604a);
        sb.append(", anchorPoint=");
        sb.append(this.f29605b);
        sb.append('}');
        return sb.toString();
    }
}
