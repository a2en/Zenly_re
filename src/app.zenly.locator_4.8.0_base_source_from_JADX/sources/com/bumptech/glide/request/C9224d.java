package com.bumptech.glide.request;

import android.graphics.Bitmap;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.C8978i;

/* renamed from: com.bumptech.glide.request.d */
public class C9224d extends C9220a<C9224d> {

    /* renamed from: E */
    private static C9224d f23940E;

    /* renamed from: F */
    private static C9224d f23941F;

    /* renamed from: b */
    public static C9224d m22185b(C8978i iVar) {
        return (C9224d) new C9224d().mo8517a(iVar);
    }

    /* renamed from: c */
    public static C9224d m22187c(boolean z) {
        if (z) {
            if (f23940E == null) {
                f23940E = (C9224d) ((C9224d) new C9224d().mo8521a(true)).mo8510a();
            }
            return f23940E;
        }
        if (f23941F == null) {
            f23941F = (C9224d) ((C9224d) new C9224d().mo8521a(false)).mo8510a();
        }
        return f23941F;
    }

    /* renamed from: b */
    public static C9224d m22183b(Key key) {
        return (C9224d) new C9224d().mo8514a(key);
    }

    /* renamed from: b */
    public static C9224d m22184b(Transformation<Bitmap> transformation) {
        return (C9224d) new C9224d().mo8516a(transformation);
    }

    /* renamed from: b */
    public static C9224d m22186b(Class<?> cls) {
        return (C9224d) new C9224d().mo8520a(cls);
    }
}
