package com.facebook.imagepipeline.animated.factory;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.Build.VERSION;
import com.facebook.common.internal.C9536j;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.animated.base.AnimatedDrawableBackend;
import com.facebook.imagepipeline.animated.base.AnimatedImage;
import com.facebook.imagepipeline.animated.base.C9656b;
import com.facebook.imagepipeline.animated.base.C9657c;
import com.facebook.imagepipeline.animated.impl.AnimatedDrawableBackendProvider;
import com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor;
import com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor.Callback;
import com.facebook.imagepipeline.common.C9698b;
import com.facebook.imagepipeline.image.C9728a;
import com.facebook.imagepipeline.image.C9730c;
import com.facebook.imagepipeline.image.C9731d;
import com.facebook.imagepipeline.image.C9732e;
import com.facebook.imagepipeline.image.C9733f;
import java.util.ArrayList;
import java.util.List;
import p333g.p339c.p352d.p355b.C12058f;

/* renamed from: com.facebook.imagepipeline.animated.factory.b */
public class C9659b implements AnimatedImageFactory {

    /* renamed from: c */
    static AnimatedImageDecoder f25235c = m23748a("com.facebook.animated.gif.GifImage");

    /* renamed from: d */
    static AnimatedImageDecoder f25236d = m23748a("com.facebook.animated.webp.WebPImage");

    /* renamed from: a */
    private final AnimatedDrawableBackendProvider f25237a;

    /* renamed from: b */
    private final C12058f f25238b;

    /* renamed from: com.facebook.imagepipeline.animated.factory.b$a */
    class C9660a implements Callback {
        C9660a(C9659b bVar) {
        }

        public CloseableReference<Bitmap> getCachedBitmap(int i) {
            return null;
        }

        public void onIntermediateResult(int i, Bitmap bitmap) {
        }
    }

    /* renamed from: com.facebook.imagepipeline.animated.factory.b$b */
    class C9661b implements Callback {

        /* renamed from: a */
        final /* synthetic */ List f25239a;

        C9661b(C9659b bVar, List list) {
            this.f25239a = list;
        }

        public CloseableReference<Bitmap> getCachedBitmap(int i) {
            return CloseableReference.m23348a((CloseableReference) this.f25239a.get(i));
        }

        public void onIntermediateResult(int i, Bitmap bitmap) {
        }
    }

    public C9659b(AnimatedDrawableBackendProvider animatedDrawableBackendProvider, C12058f fVar) {
        this.f25237a = animatedDrawableBackendProvider;
        this.f25238b = fVar;
    }

    /* renamed from: a */
    private static AnimatedImageDecoder m23748a(String str) {
        try {
            return (AnimatedImageDecoder) Class.forName(str).newInstance();
        } catch (Throwable unused) {
            return null;
        }
    }

    public C9730c decodeGif(C9732e eVar, C9698b bVar, Config config) {
        AnimatedImage animatedImage;
        if (f25235c != null) {
            CloseableReference b = eVar.mo26421b();
            C9536j.m23271a(b);
            try {
                PooledByteBuffer pooledByteBuffer = (PooledByteBuffer) b.mo25724b();
                if (pooledByteBuffer.getByteBuffer() != null) {
                    animatedImage = f25235c.decode(pooledByteBuffer.getByteBuffer());
                } else {
                    animatedImage = f25235c.decode(pooledByteBuffer.getNativePtr(), pooledByteBuffer.size());
                }
                return m23749a(bVar, animatedImage, config);
            } finally {
                CloseableReference.m23355b(b);
            }
        } else {
            throw new UnsupportedOperationException("To encode animated gif please add the dependency to the animated-gif module");
        }
    }

    public C9730c decodeWebP(C9732e eVar, C9698b bVar, Config config) {
        AnimatedImage animatedImage;
        if (f25236d != null) {
            CloseableReference b = eVar.mo26421b();
            C9536j.m23271a(b);
            try {
                PooledByteBuffer pooledByteBuffer = (PooledByteBuffer) b.mo25724b();
                if (pooledByteBuffer.getByteBuffer() != null) {
                    animatedImage = f25236d.decode(pooledByteBuffer.getByteBuffer());
                } else {
                    animatedImage = f25236d.decode(pooledByteBuffer.getNativePtr(), pooledByteBuffer.size());
                }
                return m23749a(bVar, animatedImage, config);
            } finally {
                CloseableReference.m23355b(b);
            }
        } else {
            throw new UnsupportedOperationException("To encode animated webp please add the dependency to the animated-webp module");
        }
    }

    /* renamed from: a */
    private C9730c m23749a(C9698b bVar, AnimatedImage animatedImage, Config config) {
        List list;
        CloseableReference closeableReference = null;
        try {
            int frameCount = bVar.f25335c ? animatedImage.getFrameCount() - 1 : 0;
            if (bVar.f25337e) {
                C9731d dVar = new C9731d(m23747a(animatedImage, config, frameCount), C9733f.f25573d, 0);
                CloseableReference.m23355b(null);
                CloseableReference.m23354a(null);
                return dVar;
            }
            if (bVar.f25336d) {
                list = m23750a(animatedImage, config);
                try {
                    closeableReference = CloseableReference.m23348a((CloseableReference) list.get(frameCount));
                } catch (Throwable th) {
                    th = th;
                    CloseableReference.m23355b(null);
                    CloseableReference.m23354a((Iterable<? extends CloseableReference<?>>) list);
                    throw th;
                }
            } else {
                list = null;
            }
            if (bVar.f25334b && closeableReference == null) {
                closeableReference = m23747a(animatedImage, config, frameCount);
            }
            C9657c b = C9656b.m23731b(animatedImage);
            b.mo26181a(closeableReference);
            b.mo26180a(frameCount);
            b.mo26182a(list);
            C9728a aVar = new C9728a(b.mo26179a());
            CloseableReference.m23355b(closeableReference);
            CloseableReference.m23354a((Iterable<? extends CloseableReference<?>>) list);
            return aVar;
        } catch (Throwable th2) {
            th = th2;
            list = null;
            CloseableReference.m23355b(null);
            CloseableReference.m23354a((Iterable<? extends CloseableReference<?>>) list);
            throw th;
        }
    }

    /* renamed from: a */
    private CloseableReference<Bitmap> m23747a(AnimatedImage animatedImage, Config config, int i) {
        CloseableReference<Bitmap> a = m23746a(animatedImage.getWidth(), animatedImage.getHeight(), config);
        new AnimatedImageCompositor(this.f25237a.get(C9656b.m23730a(animatedImage), null), new C9660a(this)).mo26189a(i, (Bitmap) a.mo25724b());
        return a;
    }

    /* renamed from: a */
    private List<CloseableReference<Bitmap>> m23750a(AnimatedImage animatedImage, Config config) {
        AnimatedDrawableBackend animatedDrawableBackend = this.f25237a.get(C9656b.m23730a(animatedImage), null);
        ArrayList arrayList = new ArrayList(animatedDrawableBackend.getFrameCount());
        AnimatedImageCompositor animatedImageCompositor = new AnimatedImageCompositor(animatedDrawableBackend, new C9661b(this, arrayList));
        for (int i = 0; i < animatedDrawableBackend.getFrameCount(); i++) {
            CloseableReference a = m23746a(animatedDrawableBackend.getWidth(), animatedDrawableBackend.getHeight(), config);
            animatedImageCompositor.mo26189a(i, (Bitmap) a.mo25724b());
            arrayList.add(a);
        }
        return arrayList;
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    private CloseableReference<Bitmap> m23746a(int i, int i2, Config config) {
        CloseableReference<Bitmap> b = this.f25238b.mo35770b(i, i2, config);
        ((Bitmap) b.mo25724b()).eraseColor(0);
        if (VERSION.SDK_INT >= 12) {
            ((Bitmap) b.mo25724b()).setHasAlpha(true);
        }
        return b;
    }
}
