package com.google.android.gms.common.images;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.C10101c;
import com.google.android.gms.internal.base.C10262d;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import p214e.p228e.C7577e;

public final class ImageManager {
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final Object f26482i = new Object();
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static HashSet<Uri> f26483j = new HashSet<>();
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f26484a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Handler f26485b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final ExecutorService f26486c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C10080a f26487d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C10262d f26488e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final Map<C10084b, ImageReceiver> f26489f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final Map<Uri, ImageReceiver> f26490g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final Map<Uri, Long> f26491h;

    @KeepName
    private final class ImageReceiver extends ResultReceiver {

        /* renamed from: e */
        private final Uri f26492e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public final ArrayList<C10084b> f26493f;

        /* renamed from: g */
        private final /* synthetic */ ImageManager f26494g;

        public final void onReceiveResult(int i, Bundle bundle) {
            this.f26494g.f26486c.execute(new C10081b(this.f26492e, (ParcelFileDescriptor) bundle.getParcelable("com.google.android.gms.extra.fileDescriptor")));
        }
    }

    public interface OnImageLoadedListener {
        void onImageLoaded(Uri uri, Drawable drawable, boolean z);
    }

    /* renamed from: com.google.android.gms.common.images.ImageManager$a */
    private static final class C10080a extends C7577e<C10083a, Bitmap> {
    }

    /* renamed from: com.google.android.gms.common.images.ImageManager$b */
    private final class C10081b implements Runnable {

        /* renamed from: e */
        private final Uri f26495e;

        /* renamed from: f */
        private final ParcelFileDescriptor f26496f;

        public C10081b(Uri uri, ParcelFileDescriptor parcelFileDescriptor) {
            this.f26495e = uri;
            this.f26496f = parcelFileDescriptor;
        }

        public final void run() {
            boolean z;
            Bitmap bitmap;
            C10101c.m25431b("LoadBitmapFromDiskRunnable can't be executed in the main thread");
            ParcelFileDescriptor parcelFileDescriptor = this.f26496f;
            String str = "ImageManager";
            boolean z2 = false;
            Bitmap bitmap2 = null;
            if (parcelFileDescriptor != null) {
                try {
                    bitmap2 = BitmapFactory.decodeFileDescriptor(parcelFileDescriptor.getFileDescriptor());
                } catch (OutOfMemoryError e) {
                    String valueOf = String.valueOf(this.f26495e);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
                    sb.append("OOM while loading bitmap for uri: ");
                    sb.append(valueOf);
                    Log.e(str, sb.toString(), e);
                    z2 = true;
                }
                try {
                    this.f26496f.close();
                } catch (IOException e2) {
                    Log.e(str, "closed failed", e2);
                }
                z = z2;
                bitmap = bitmap2;
            } else {
                bitmap = null;
                z = false;
            }
            CountDownLatch countDownLatch = new CountDownLatch(1);
            Handler g = ImageManager.this.f26485b;
            C10082c cVar = new C10082c(this.f26495e, bitmap, z, countDownLatch);
            g.post(cVar);
            try {
                countDownLatch.await();
            } catch (InterruptedException unused) {
                String valueOf2 = String.valueOf(this.f26495e);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 32);
                sb2.append("Latch interrupted while posting ");
                sb2.append(valueOf2);
                Log.w(str, sb2.toString());
            }
        }
    }

    /* renamed from: com.google.android.gms.common.images.ImageManager$c */
    private final class C10082c implements Runnable {

        /* renamed from: e */
        private final Uri f26498e;

        /* renamed from: f */
        private final Bitmap f26499f;

        /* renamed from: g */
        private final CountDownLatch f26500g;

        /* renamed from: h */
        private boolean f26501h;

        public C10082c(Uri uri, Bitmap bitmap, boolean z, CountDownLatch countDownLatch) {
            this.f26498e = uri;
            this.f26499f = bitmap;
            this.f26501h = z;
            this.f26500g = countDownLatch;
        }

        public final void run() {
            C10101c.m25430a("OnBitmapLoadedRunnable must be executed in the main thread");
            boolean z = this.f26499f != null;
            if (ImageManager.this.f26487d != null) {
                if (this.f26501h) {
                    ImageManager.this.f26487d.mo19522a();
                    System.gc();
                    this.f26501h = false;
                    ImageManager.this.f26485b.post(this);
                    return;
                } else if (z) {
                    ImageManager.this.f26487d.mo19521a(new C10083a(this.f26498e), this.f26499f);
                }
            }
            ImageReceiver imageReceiver = (ImageReceiver) ImageManager.this.f26490g.remove(this.f26498e);
            if (imageReceiver != null) {
                ArrayList a = imageReceiver.f26493f;
                int size = a.size();
                for (int i = 0; i < size; i++) {
                    C10084b bVar = (C10084b) a.get(i);
                    if (z) {
                        bVar.mo27348a(ImageManager.this.f26484a, this.f26499f, false);
                    } else {
                        ImageManager.this.f26491h.put(this.f26498e, Long.valueOf(SystemClock.elapsedRealtime()));
                        bVar.mo27349a(ImageManager.this.f26484a, ImageManager.this.f26488e, false);
                    }
                    ImageManager.this.f26489f.remove(bVar);
                }
            }
            this.f26500g.countDown();
            synchronized (ImageManager.f26482i) {
                ImageManager.f26483j.remove(this.f26498e);
            }
        }
    }
}
