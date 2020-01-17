package com.theartofdev.edmodo.cropper;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.net.Uri;
import android.os.AsyncTask;
import com.theartofdev.edmodo.cropper.CropImageView.C11926e;
import java.lang.ref.WeakReference;

/* renamed from: com.theartofdev.edmodo.cropper.a */
final class C11930a extends AsyncTask<Void, Void, C11931a> {

    /* renamed from: a */
    private final WeakReference<CropImageView> f31039a;

    /* renamed from: b */
    private final Bitmap f31040b;

    /* renamed from: c */
    private final Uri f31041c;

    /* renamed from: d */
    private final Context f31042d;

    /* renamed from: e */
    private final float[] f31043e;

    /* renamed from: f */
    private final int f31044f;

    /* renamed from: g */
    private final int f31045g;

    /* renamed from: h */
    private final int f31046h;

    /* renamed from: i */
    private final boolean f31047i;

    /* renamed from: j */
    private final int f31048j;

    /* renamed from: k */
    private final int f31049k;

    /* renamed from: l */
    private final int f31050l;

    /* renamed from: m */
    private final int f31051m;

    /* renamed from: n */
    private final boolean f31052n;

    /* renamed from: o */
    private final boolean f31053o;

    /* renamed from: p */
    private final C11926e f31054p;

    /* renamed from: q */
    private final Uri f31055q;

    /* renamed from: r */
    private final CompressFormat f31056r;

    /* renamed from: s */
    private final int f31057s;

    /* renamed from: com.theartofdev.edmodo.cropper.a$a */
    static final class C11931a {

        /* renamed from: a */
        public final Bitmap f31058a;

        /* renamed from: b */
        public final Uri f31059b;

        /* renamed from: c */
        final Exception f31060c;

        /* renamed from: d */
        final int f31061d;

        C11931a(Bitmap bitmap, int i) {
            this.f31058a = bitmap;
            this.f31059b = null;
            this.f31060c = null;
            this.f31061d = i;
        }

        C11931a(Uri uri, int i) {
            this.f31058a = null;
            this.f31059b = uri;
            this.f31060c = null;
            this.f31061d = i;
        }

        C11931a(Exception exc, boolean z) {
            this.f31058a = null;
            this.f31059b = null;
            this.f31060c = exc;
            this.f31061d = 1;
        }
    }

    C11930a(CropImageView cropImageView, Bitmap bitmap, float[] fArr, int i, boolean z, int i2, int i3, int i4, int i5, boolean z2, boolean z3, C11926e eVar, Uri uri, CompressFormat compressFormat, int i6) {
        CropImageView cropImageView2 = cropImageView;
        this.f31039a = new WeakReference<>(cropImageView);
        this.f31042d = cropImageView.getContext();
        this.f31040b = bitmap;
        this.f31043e = fArr;
        this.f31041c = null;
        this.f31044f = i;
        this.f31047i = z;
        this.f31048j = i2;
        this.f31049k = i3;
        this.f31050l = i4;
        this.f31051m = i5;
        this.f31052n = z2;
        this.f31053o = z3;
        this.f31054p = eVar;
        this.f31055q = uri;
        this.f31056r = compressFormat;
        this.f31057s = i6;
        this.f31045g = 0;
        this.f31046h = 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C11931a doInBackground(Void... voidArr) {
        C11935a aVar;
        boolean z = true;
        try {
            if (isCancelled()) {
                return null;
            }
            if (this.f31041c != null) {
                aVar = C11934c.m31372a(this.f31042d, this.f31041c, this.f31043e, this.f31044f, this.f31045g, this.f31046h, this.f31047i, this.f31048j, this.f31049k, this.f31050l, this.f31051m, this.f31052n, this.f31053o);
            } else if (this.f31040b == null) {
                return new C11931a((Bitmap) null, 1);
            } else {
                aVar = C11934c.m31375a(this.f31040b, this.f31043e, this.f31044f, this.f31047i, this.f31048j, this.f31049k, this.f31052n, this.f31053o);
            }
            Bitmap a = C11934c.m31363a(aVar.f31079a, this.f31050l, this.f31051m, this.f31054p);
            if (this.f31055q == null) {
                return new C11931a(a, aVar.f31080b);
            }
            C11934c.m31378a(this.f31042d, a, this.f31055q, this.f31056r, this.f31057s);
            if (a != null) {
                a.recycle();
            }
            return new C11931a(this.f31055q, aVar.f31080b);
        } catch (Exception e) {
            if (this.f31055q == null) {
                z = false;
            }
            return new C11931a(e, z);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(C11931a aVar) {
        if (aVar != null) {
            boolean z = false;
            if (!isCancelled()) {
                CropImageView cropImageView = (CropImageView) this.f31039a.get();
                if (cropImageView != null) {
                    z = true;
                    cropImageView.mo35338a(aVar);
                }
            }
            if (!z) {
                Bitmap bitmap = aVar.f31058a;
                if (bitmap != null) {
                    bitmap.recycle();
                }
            }
        }
    }

    C11930a(CropImageView cropImageView, Uri uri, float[] fArr, int i, int i2, int i3, boolean z, int i4, int i5, int i6, int i7, boolean z2, boolean z3, C11926e eVar, Uri uri2, CompressFormat compressFormat, int i8) {
        CropImageView cropImageView2 = cropImageView;
        this.f31039a = new WeakReference<>(cropImageView);
        this.f31042d = cropImageView.getContext();
        this.f31041c = uri;
        this.f31043e = fArr;
        this.f31044f = i;
        this.f31047i = z;
        this.f31048j = i4;
        this.f31049k = i5;
        this.f31045g = i2;
        this.f31046h = i3;
        this.f31050l = i6;
        this.f31051m = i7;
        this.f31052n = z2;
        this.f31053o = z3;
        this.f31054p = eVar;
        this.f31055q = uri2;
        this.f31056r = compressFormat;
        this.f31057s = i8;
        this.f31040b = null;
    }
}
