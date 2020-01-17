package com.squareup.picasso;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import com.squareup.picasso.C11893u.C11894a;
import com.squareup.picasso.Picasso.C11847d;
import java.io.IOException;

/* renamed from: com.squareup.picasso.b */
class C11858b extends C11893u {

    /* renamed from: b */
    private static final int f30710b = 22;

    /* renamed from: a */
    private final AssetManager f30711a;

    public C11858b(Context context) {
        this.f30711a = context.getAssets();
    }

    /* renamed from: c */
    static String m31125c(C11889s sVar) {
        return sVar.f30811d.toString().substring(f30710b);
    }

    /* renamed from: a */
    public boolean mo35069a(C11889s sVar) {
        Uri uri = sVar.f30811d;
        if (!"file".equals(uri.getScheme()) || uri.getPathSegments().isEmpty()) {
            return false;
        }
        if ("android_asset".equals(uri.getPathSegments().get(0))) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public C11894a mo35068a(C11889s sVar, int i) throws IOException {
        return new C11894a(this.f30711a.open(m31125c(sVar)), C11847d.DISK);
    }
}
