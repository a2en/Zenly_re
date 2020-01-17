package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.ParcelFileDescriptor;
import com.facebook.common.internal.C9530g;
import com.facebook.common.references.CloseableReference;
import com.facebook.common.references.ResourceReleaser;
import com.facebook.imagepipeline.image.C9730c;
import com.facebook.imagepipeline.image.C9731d;
import com.facebook.imagepipeline.image.C9733f;
import com.facebook.imagepipeline.request.C9884a;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.concurrent.Executor;
import p333g.p339c.p352d.p355b.C12060h;

/* renamed from: com.facebook.imagepipeline.producers.a0 */
public class C9793a0 implements Producer<CloseableReference<C9730c>> {

    /* renamed from: a */
    private final Executor f25715a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final ContentResolver f25716b;

    /* renamed from: com.facebook.imagepipeline.producers.a0$a */
    class C9794a extends C9836j0<CloseableReference<C9730c>> {

        /* renamed from: j */
        final /* synthetic */ ProducerListener f25717j;

        /* renamed from: k */
        final /* synthetic */ String f25718k;

        /* renamed from: l */
        final /* synthetic */ C9884a f25719l;

        C9794a(Consumer consumer, ProducerListener producerListener, String str, String str2, ProducerListener producerListener2, String str3, C9884a aVar) {
            this.f25717j = producerListener2;
            this.f25718k = str3;
            this.f25719l = aVar;
            super(consumer, producerListener, str, str2);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo25652a(Exception exc) {
            super.mo25652a(exc);
            this.f25717j.onUltimateProducerReached(this.f25718k, "VideoThumbnailProducer", false);
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void mo25655b(CloseableReference<C9730c> closeableReference) {
            super.mo25655b(closeableReference);
            this.f25717j.onUltimateProducerReached(this.f25718k, "VideoThumbnailProducer", closeableReference != null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public CloseableReference<C9730c> m24317b() throws Exception {
            String str;
            Bitmap bitmap;
            try {
                str = C9793a0.this.m24312c(this.f25719l);
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                bitmap = ThumbnailUtils.createVideoThumbnail(str, C9793a0.m24310b(this.f25719l));
            } else {
                bitmap = C9793a0.m24311b(C9793a0.this.f25716b, this.f25719l.mo26743p());
            }
            if (bitmap == null) {
                return null;
            }
            return CloseableReference.m23349a(new C9731d(bitmap, (ResourceReleaser<Bitmap>) C12060h.m31854a(), C9733f.f25573d, 0));
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo25653a(CloseableReference<C9730c> closeableReference) {
            CloseableReference.m23355b(closeableReference);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public Map<String, String> mo26612c(CloseableReference<C9730c> closeableReference) {
            return C9530g.m23258a("createdThumbnail", String.valueOf(closeableReference != null));
        }
    }

    /* renamed from: com.facebook.imagepipeline.producers.a0$b */
    class C9795b extends C9810e {

        /* renamed from: a */
        final /* synthetic */ C9836j0 f25721a;

        C9795b(C9793a0 a0Var, C9836j0 j0Var) {
            this.f25721a = j0Var;
        }

        public void onCancellationRequested() {
            this.f25721a.mo25651a();
        }
    }

    public C9793a0(Executor executor, ContentResolver contentResolver) {
        this.f25715a = executor;
        this.f25716b = contentResolver;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static int m24310b(C9884a aVar) {
        return (aVar.mo26734h() > 96 || aVar.mo26733g() > 96) ? 1 : 3;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0058 A[SYNTHETIC, Splitter:B:14:0x0058] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0075  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String m24312c(com.facebook.imagepipeline.request.C9884a r11) {
        /*
            r10 = this;
            android.net.Uri r0 = r11.mo26743p()
            boolean r1 = com.facebook.common.util.C9559e.m23391g(r0)
            if (r1 == 0) goto L_0x0013
            java.io.File r11 = r11.mo26742o()
            java.lang.String r11 = r11.getPath()
            return r11
        L_0x0013:
            boolean r11 = com.facebook.common.util.C9559e.m23390f(r0)
            r1 = 0
            if (r11 == 0) goto L_0x0078
            int r11 = android.os.Build.VERSION.SDK_INT
            r2 = 19
            if (r11 < r2) goto L_0x0046
            java.lang.String r11 = r0.getAuthority()
            java.lang.String r2 = "com.android.providers.media.documents"
            boolean r11 = r2.equals(r11)
            if (r11 == 0) goto L_0x0046
            java.lang.String r11 = android.provider.DocumentsContract.getDocumentId(r0)
            android.net.Uri r0 = android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI
            r2 = 1
            java.lang.String[] r3 = new java.lang.String[r2]
            r4 = 0
            java.lang.String r5 = ":"
            java.lang.String[] r11 = r11.split(r5)
            r11 = r11[r2]
            r3[r4] = r11
            java.lang.String r11 = "_id=?"
            r7 = r11
            r5 = r0
            r8 = r3
            goto L_0x0049
        L_0x0046:
            r5 = r0
            r7 = r1
            r8 = r7
        L_0x0049:
            android.content.ContentResolver r4 = r10.f25716b
            java.lang.String r11 = "_data"
            java.lang.String[] r6 = new java.lang.String[]{r11}
            r9 = 0
            android.database.Cursor r0 = r4.query(r5, r6, r7, r8, r9)
            if (r0 == 0) goto L_0x0073
            boolean r2 = r0.moveToFirst()     // Catch:{ all -> 0x006c }
            if (r2 == 0) goto L_0x0073
            int r11 = r0.getColumnIndexOrThrow(r11)     // Catch:{ all -> 0x006c }
            java.lang.String r11 = r0.getString(r11)     // Catch:{ all -> 0x006c }
            if (r0 == 0) goto L_0x006b
            r0.close()
        L_0x006b:
            return r11
        L_0x006c:
            r11 = move-exception
            if (r0 == 0) goto L_0x0072
            r0.close()
        L_0x0072:
            throw r11
        L_0x0073:
            if (r0 == 0) goto L_0x0078
            r0.close()
        L_0x0078:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.producers.C9793a0.m24312c(com.facebook.imagepipeline.request.a):java.lang.String");
    }

    public void produceResults(Consumer<CloseableReference<C9730c>> consumer, ProducerContext producerContext) {
        ProducerListener listener = producerContext.getListener();
        String id = producerContext.getId();
        Consumer<CloseableReference<C9730c>> consumer2 = consumer;
        ProducerListener producerListener = listener;
        C9794a aVar = new C9794a(consumer2, producerListener, "VideoThumbnailProducer", id, listener, id, producerContext.getImageRequest());
        producerContext.addCallbacks(new C9795b(this, aVar));
        this.f25715a.execute(aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static Bitmap m24311b(ContentResolver contentResolver, Uri uri) {
        if (VERSION.SDK_INT >= 10) {
            try {
                ParcelFileDescriptor openFileDescriptor = contentResolver.openFileDescriptor(uri, "r");
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                mediaMetadataRetriever.setDataSource(openFileDescriptor.getFileDescriptor());
                return mediaMetadataRetriever.getFrameAtTime(-1);
            } catch (FileNotFoundException unused) {
            }
        }
        return null;
    }
}
