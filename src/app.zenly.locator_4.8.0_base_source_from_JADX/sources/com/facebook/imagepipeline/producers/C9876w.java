package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import android.media.ExifInterface;
import android.net.Uri;
import android.util.Pair;
import com.facebook.common.internal.C9530g;
import com.facebook.common.logging.C9543a;
import com.facebook.common.memory.C9548d;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.common.memory.PooledByteBufferFactory;
import com.facebook.common.references.CloseableReference;
import com.facebook.common.util.C9559e;
import com.facebook.imageformat.C9650b;
import com.facebook.imagepipeline.common.C9701e;
import com.facebook.imagepipeline.image.C9732e;
import com.facebook.imagepipeline.request.C9884a;
import com.facebook.imageutils.C9896a;
import com.facebook.imageutils.C9899c;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.imagepipeline.producers.w */
public class C9876w implements ThumbnailProducer<C9732e> {

    /* renamed from: a */
    private final Executor f25936a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final PooledByteBufferFactory f25937b;

    /* renamed from: c */
    private final ContentResolver f25938c;

    /* renamed from: com.facebook.imagepipeline.producers.w$a */
    class C9877a extends C9836j0<C9732e> {

        /* renamed from: j */
        final /* synthetic */ C9884a f25939j;

        C9877a(Consumer consumer, ProducerListener producerListener, String str, String str2, C9884a aVar) {
            this.f25939j = aVar;
            super(consumer, producerListener, str, str2);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo25653a(C9732e eVar) {
            C9732e.m24069c(eVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public C9732e m24627b() throws Exception {
            ExifInterface a = C9876w.this.mo26683a(this.f25939j.mo26743p());
            if (a == null || !a.hasThumbnail()) {
                return null;
            }
            return C9876w.this.m24620a(C9876w.this.f25937b.newByteBuffer(a.getThumbnail()), a);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public Map<String, String> mo26612c(C9732e eVar) {
            return C9530g.m23258a("createdThumbnail", Boolean.toString(eVar != null));
        }
    }

    /* renamed from: com.facebook.imagepipeline.producers.w$b */
    class C9878b extends C9810e {

        /* renamed from: a */
        final /* synthetic */ C9836j0 f25941a;

        C9878b(C9876w wVar, C9836j0 j0Var) {
            this.f25941a = j0Var;
        }

        public void onCancellationRequested() {
            this.f25941a.mo25651a();
        }
    }

    public C9876w(Executor executor, PooledByteBufferFactory pooledByteBufferFactory, ContentResolver contentResolver) {
        this.f25936a = executor;
        this.f25937b = pooledByteBufferFactory;
        this.f25938c = contentResolver;
    }

    public boolean canProvideImageForSize(C9701e eVar) {
        return C9861o0.m24554a(512, 512, eVar);
    }

    public void produceResults(Consumer<C9732e> consumer, ProducerContext producerContext) {
        Consumer<C9732e> consumer2 = consumer;
        C9877a aVar = new C9877a(consumer2, producerContext.getListener(), "LocalExifThumbnailProducer", producerContext.getId(), producerContext.getImageRequest());
        producerContext.addCallbacks(new C9878b(this, aVar));
        this.f25936a.execute(aVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public ExifInterface mo26683a(Uri uri) {
        String a = C9559e.m23384a(this.f25938c, uri);
        try {
            if (mo26684a(a)) {
                return new ExifInterface(a);
            }
        } catch (IOException unused) {
        } catch (StackOverflowError unused2) {
            C9543a.m23300a(C9876w.class, "StackOverflowError in ExifInterface constructor");
        }
        return null;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: private */
    /* renamed from: a */
    public C9732e m24620a(PooledByteBuffer pooledByteBuffer, ExifInterface exifInterface) {
        Pair a = C9896a.m24734a((InputStream) new C9548d(pooledByteBuffer));
        int a2 = m24618a(exifInterface);
        int i = -1;
        int intValue = a != null ? ((Integer) a.first).intValue() : -1;
        if (a != null) {
            i = ((Integer) a.second).intValue();
        }
        CloseableReference a3 = CloseableReference.m23349a(pooledByteBuffer);
        try {
            C9732e eVar = new C9732e(a3);
            CloseableReference.m23355b(a3);
            eVar.mo26418a(C9650b.f25197a);
            eVar.mo26429e(a2);
            eVar.mo26433g(intValue);
            eVar.mo26427d(i);
            return eVar;
        } catch (Throwable th) {
            CloseableReference.m23355b(a3);
            throw th;
        }
    }

    /* renamed from: a */
    private int m24618a(ExifInterface exifInterface) {
        return C9899c.m24738a(Integer.parseInt(exifInterface.getAttribute("Orientation")));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo26684a(String str) throws IOException {
        boolean z = false;
        if (str == null) {
            return false;
        }
        File file = new File(str);
        if (file.exists() && file.canRead()) {
            z = true;
        }
        return z;
    }
}
