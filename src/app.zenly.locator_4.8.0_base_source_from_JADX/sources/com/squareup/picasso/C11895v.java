package com.squareup.picasso;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import com.squareup.picasso.C11893u.C11894a;
import com.squareup.picasso.Picasso.C11847d;
import java.io.IOException;

/* renamed from: com.squareup.picasso.v */
class C11895v extends C11893u {

    /* renamed from: a */
    private final Context f30858a;

    C11895v(Context context) {
        this.f30858a = context;
    }

    /* renamed from: a */
    public boolean mo35069a(C11889s sVar) {
        if (sVar.f30812e != 0) {
            return true;
        }
        return "android.resource".equals(sVar.f30811d.getScheme());
    }

    /* renamed from: a */
    public C11894a mo35068a(C11889s sVar, int i) throws IOException {
        Resources a = C11851a0.m31102a(this.f30858a, sVar);
        return new C11894a(m31258a(a, C11851a0.m31099a(a, sVar), sVar), C11847d.DISK);
    }

    /* renamed from: a */
    private static Bitmap m31258a(Resources resources, int i, C11889s sVar) {
        Options b = C11893u.m31248b(sVar);
        if (C11893u.m31247a(b)) {
            BitmapFactory.decodeResource(resources, i, b);
            C11893u.m31246a(sVar.f30815h, sVar.f30816i, b, sVar);
        }
        return BitmapFactory.decodeResource(resources, i, b);
    }
}
