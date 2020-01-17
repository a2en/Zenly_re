package com.squareup.picasso;

import android.content.Context;
import com.squareup.picasso.C11893u.C11894a;
import com.squareup.picasso.Picasso.C11847d;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.squareup.picasso.e */
class C11868e extends C11893u {

    /* renamed from: a */
    final Context f30742a;

    C11868e(Context context) {
        this.f30742a = context;
    }

    /* renamed from: a */
    public boolean mo35069a(C11889s sVar) {
        return "content".equals(sVar.f30811d.getScheme());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public InputStream mo35093c(C11889s sVar) throws FileNotFoundException {
        return this.f30742a.getContentResolver().openInputStream(sVar.f30811d);
    }

    /* renamed from: a */
    public C11894a mo35068a(C11889s sVar, int i) throws IOException {
        return new C11894a(mo35093c(sVar), C11847d.DISK);
    }
}
