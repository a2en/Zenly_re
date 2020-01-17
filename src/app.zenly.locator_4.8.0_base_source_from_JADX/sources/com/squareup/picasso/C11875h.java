package com.squareup.picasso;

import android.content.Context;
import android.media.ExifInterface;
import android.net.Uri;
import com.squareup.picasso.C11893u.C11894a;
import com.squareup.picasso.Picasso.C11847d;
import java.io.IOException;

/* renamed from: com.squareup.picasso.h */
class C11875h extends C11868e {
    C11875h(Context context) {
        super(context);
    }

    /* renamed from: a */
    public boolean mo35069a(C11889s sVar) {
        return "file".equals(sVar.f30811d.getScheme());
    }

    /* renamed from: a */
    public C11894a mo35068a(C11889s sVar, int i) throws IOException {
        return new C11894a(null, mo35093c(sVar), C11847d.DISK, m31186a(sVar.f30811d));
    }

    /* renamed from: a */
    static int m31186a(Uri uri) throws IOException {
        int attributeInt = new ExifInterface(uri.getPath()).getAttributeInt("Orientation", 1);
        if (attributeInt == 3) {
            return 180;
        }
        if (attributeInt != 6) {
            return attributeInt != 8 ? 0 : 270;
        }
        return 90;
    }
}
