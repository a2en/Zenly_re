package com.mapbox.mapboxsdk.annotations;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import java.nio.ByteBuffer;

@Deprecated
/* renamed from: com.mapbox.mapboxsdk.annotations.d */
public class C11426d {

    /* renamed from: a */
    private Bitmap f29572a;

    /* renamed from: b */
    private String f29573b;

    C11426d(String str, Bitmap bitmap) {
        this.f29573b = str;
        this.f29572a = bitmap;
    }

    /* renamed from: a */
    public Bitmap mo33269a() {
        Bitmap bitmap = this.f29572a;
        if (bitmap != null) {
            Config config = bitmap.getConfig();
            Config config2 = Config.ARGB_8888;
            if (config != config2) {
                this.f29572a = this.f29572a.copy(config2, false);
            }
        }
        return this.f29572a;
    }

    /* renamed from: b */
    public String mo33270b() {
        return this.f29573b;
    }

    /* renamed from: c */
    public float mo33271c() {
        Bitmap bitmap = this.f29572a;
        if (bitmap != null) {
            float density = (float) bitmap.getDensity();
            if (density == 0.0f) {
                density = 160.0f;
            }
            return density / 160.0f;
        }
        throw new IllegalStateException("Required to set a Icon before calling getScale");
    }

    /* renamed from: d */
    public byte[] mo33272d() {
        Bitmap bitmap = this.f29572a;
        if (bitmap != null) {
            ByteBuffer allocate = ByteBuffer.allocate(bitmap.getRowBytes() * this.f29572a.getHeight());
            this.f29572a.copyPixelsToBuffer(allocate);
            return allocate.array();
        }
        throw new IllegalStateException("Required to set a Icon before calling toBytes");
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || C11426d.class != obj.getClass()) {
            return false;
        }
        C11426d dVar = (C11426d) obj;
        if (!this.f29572a.equals(dVar.f29572a) || !this.f29573b.equals(dVar.f29573b)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        Bitmap bitmap = this.f29572a;
        int hashCode = bitmap != null ? bitmap.hashCode() : 0;
        String str = this.f29573b;
        return str != null ? (hashCode * 31) + str.hashCode() : hashCode;
    }
}
