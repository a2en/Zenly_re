package com.theartofdev.edmodo.cropper;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.DisplayMetrics;
import java.lang.ref.WeakReference;

/* renamed from: com.theartofdev.edmodo.cropper.b */
final class C11932b extends AsyncTask<Void, Void, C11933a> {

    /* renamed from: a */
    private final WeakReference<CropImageView> f31062a;

    /* renamed from: b */
    private final Uri f31063b;

    /* renamed from: c */
    private final Context f31064c;

    /* renamed from: d */
    private final int f31065d;

    /* renamed from: e */
    private final int f31066e;

    /* renamed from: com.theartofdev.edmodo.cropper.b$a */
    public static final class C11933a {

        /* renamed from: a */
        public final Uri f31067a;

        /* renamed from: b */
        public final Bitmap f31068b;

        /* renamed from: c */
        public final int f31069c;

        /* renamed from: d */
        public final int f31070d;

        /* renamed from: e */
        public final Exception f31071e;

        C11933a(Uri uri, Bitmap bitmap, int i, int i2) {
            this.f31067a = uri;
            this.f31068b = bitmap;
            this.f31069c = i;
            this.f31070d = i2;
            this.f31071e = null;
        }

        C11933a(Uri uri, Exception exc) {
            this.f31067a = uri;
            this.f31068b = null;
            this.f31069c = 0;
            this.f31070d = 0;
            this.f31071e = exc;
        }
    }

    public C11932b(CropImageView cropImageView, Uri uri) {
        this.f31063b = uri;
        this.f31062a = new WeakReference<>(cropImageView);
        this.f31064c = cropImageView.getContext();
        DisplayMetrics displayMetrics = cropImageView.getResources().getDisplayMetrics();
        float f = displayMetrics.density;
        double d = f > 1.0f ? (double) (1.0f / f) : 1.0d;
        this.f31065d = (int) (((double) displayMetrics.widthPixels) * d);
        this.f31066e = (int) (((double) displayMetrics.heightPixels) * d);
    }

    /* renamed from: a */
    public Uri mo35426a() {
        return this.f31063b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C11933a doInBackground(Void... voidArr) {
        try {
            if (!isCancelled()) {
                C11935a a = C11934c.m31370a(this.f31064c, this.f31063b, this.f31065d, this.f31066e);
                if (!isCancelled()) {
                    C11936b a2 = C11934c.m31376a(a.f31079a, this.f31064c, this.f31063b);
                    return new C11933a(this.f31063b, a2.f31081a, a.f31080b, a2.f31082b);
                }
            }
            return null;
        } catch (Exception e) {
            return new C11933a(this.f31063b, e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(C11933a aVar) {
        if (aVar != null) {
            boolean z = false;
            if (!isCancelled()) {
                CropImageView cropImageView = (CropImageView) this.f31062a.get();
                if (cropImageView != null) {
                    z = true;
                    cropImageView.mo35339a(aVar);
                }
            }
            if (!z) {
                Bitmap bitmap = aVar.f31068b;
                if (bitmap != null) {
                    bitmap.recycle();
                }
            }
        }
    }
}
