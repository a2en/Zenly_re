package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.net.NetworkInfo;
import com.squareup.picasso.Picasso.C11847d;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.squareup.picasso.u */
public abstract class C11893u {

    /* renamed from: com.squareup.picasso.u$a */
    public static final class C11894a {

        /* renamed from: a */
        private final C11847d f30854a;

        /* renamed from: b */
        private final Bitmap f30855b;

        /* renamed from: c */
        private final InputStream f30856c;

        /* renamed from: d */
        private final int f30857d;

        public C11894a(Bitmap bitmap, C11847d dVar) {
            C11851a0.m31104a(bitmap, "bitmap == null");
            this(bitmap, null, dVar, 0);
        }

        /* renamed from: a */
        public Bitmap mo35165a() {
            return this.f30855b;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public int mo35166b() {
            return this.f30857d;
        }

        /* renamed from: c */
        public C11847d mo35167c() {
            return this.f30854a;
        }

        /* renamed from: d */
        public InputStream mo35168d() {
            return this.f30856c;
        }

        public C11894a(InputStream inputStream, C11847d dVar) {
            C11851a0.m31104a(inputStream, "stream == null");
            this(null, inputStream, dVar, 0);
        }

        C11894a(Bitmap bitmap, InputStream inputStream, C11847d dVar, int i) {
            boolean z = true;
            boolean z2 = bitmap != null;
            if (inputStream == null) {
                z = false;
            }
            if (z ^ z2) {
                this.f30855b = bitmap;
                this.f30856c = inputStream;
                C11851a0.m31104a(dVar, "loadedFrom == null");
                this.f30854a = dVar;
                this.f30857d = i;
                return;
            }
            throw new AssertionError();
        }
    }

    /* renamed from: a */
    static boolean m31247a(Options options) {
        return options != null && options.inJustDecodeBounds;
    }

    /* renamed from: b */
    static Options m31248b(C11889s sVar) {
        boolean c = sVar.mo35143c();
        boolean z = sVar.f30824q != null;
        Options options = null;
        if (c || z) {
            options = new Options();
            options.inJustDecodeBounds = c;
            if (z) {
                options.inPreferredConfig = sVar.f30824q;
            }
        }
        return options;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo35130a() {
        return 0;
    }

    /* renamed from: a */
    public abstract C11894a mo35068a(C11889s sVar, int i) throws IOException;

    /* renamed from: a */
    public abstract boolean mo35069a(C11889s sVar);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo35131a(boolean z, NetworkInfo networkInfo) {
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo35132b() {
        return false;
    }

    /* renamed from: a */
    static void m31246a(int i, int i2, Options options, C11889s sVar) {
        m31245a(i, i2, options.outWidth, options.outHeight, options, sVar);
    }

    /* renamed from: a */
    static void m31245a(int i, int i2, int i3, int i4, Options options, C11889s sVar) {
        int i5;
        double floor;
        if (i4 > i2 || i3 > i) {
            if (i2 == 0) {
                floor = Math.floor((double) (((float) i3) / ((float) i)));
            } else if (i == 0) {
                floor = Math.floor((double) (((float) i4) / ((float) i2)));
            } else {
                int floor2 = (int) Math.floor((double) (((float) i4) / ((float) i2)));
                int floor3 = (int) Math.floor((double) (((float) i3) / ((float) i)));
                i5 = sVar.f30818k ? Math.max(floor2, floor3) : Math.min(floor2, floor3);
            }
            i5 = (int) floor;
        } else {
            i5 = 1;
        }
        options.inSampleSize = i5;
        options.inJustDecodeBounds = false;
    }
}
