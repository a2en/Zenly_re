package com.bumptech.glide.load.resource.bitmap;

import android.annotation.TargetApi;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.Build.VERSION;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.load.C9011f;
import com.bumptech.glide.load.Option;
import com.bumptech.glide.load.Option.CacheKeyUpdater;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.resource.bitmap.a0 */
public class C9099a0<T> implements ResourceDecoder<T, Bitmap> {

    /* renamed from: d */
    public static final Option<Long> f23670d = Option.m21322a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", Long.valueOf(-1), new C9100a());

    /* renamed from: e */
    public static final Option<Integer> f23671e = Option.m21322a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", Integer.valueOf(2), new C9101b());

    /* renamed from: f */
    private static final C9103d f23672f = new C9103d();

    /* renamed from: a */
    private final C9104e<T> f23673a;

    /* renamed from: b */
    private final BitmapPool f23674b;

    /* renamed from: c */
    private final C9103d f23675c;

    /* renamed from: com.bumptech.glide.load.resource.bitmap.a0$a */
    class C9100a implements CacheKeyUpdater<Long> {

        /* renamed from: a */
        private final ByteBuffer f23676a = ByteBuffer.allocate(8);

        C9100a() {
        }

        /* renamed from: a */
        public void update(byte[] bArr, Long l, MessageDigest messageDigest) {
            messageDigest.update(bArr);
            synchronized (this.f23676a) {
                this.f23676a.position(0);
                messageDigest.update(this.f23676a.putLong(l.longValue()).array());
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.a0$b */
    class C9101b implements CacheKeyUpdater<Integer> {

        /* renamed from: a */
        private final ByteBuffer f23677a = ByteBuffer.allocate(4);

        C9101b() {
        }

        /* renamed from: a */
        public void update(byte[] bArr, Integer num, MessageDigest messageDigest) {
            if (num != null) {
                messageDigest.update(bArr);
                synchronized (this.f23677a) {
                    this.f23677a.position(0);
                    messageDigest.update(this.f23677a.putInt(num.intValue()).array());
                }
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.a0$c */
    private static final class C9102c implements C9104e<AssetFileDescriptor> {
        private C9102c() {
        }

        /* synthetic */ C9102c(C9100a aVar) {
            this();
        }

        /* renamed from: a */
        public void mo24620a(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) {
            mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.a0$d */
    static class C9103d {
        C9103d() {
        }

        /* renamed from: a */
        public MediaMetadataRetriever mo24621a() {
            return new MediaMetadataRetriever();
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.a0$e */
    interface C9104e<T> {
        /* renamed from: a */
        void mo24620a(MediaMetadataRetriever mediaMetadataRetriever, T t);
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.a0$f */
    static final class C9105f implements C9104e<ParcelFileDescriptor> {
        C9105f() {
        }

        /* renamed from: a */
        public void mo24620a(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) {
            mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }
    }

    C9099a0(BitmapPool bitmapPool, C9104e<T> eVar) {
        this(bitmapPool, eVar, f23672f);
    }

    /* renamed from: a */
    public static ResourceDecoder<AssetFileDescriptor, Bitmap> m21799a(BitmapPool bitmapPool) {
        return new C9099a0(bitmapPool, new C9102c(null));
    }

    /* renamed from: b */
    public static ResourceDecoder<ParcelFileDescriptor, Bitmap> m21801b(BitmapPool bitmapPool) {
        return new C9099a0(bitmapPool, new C9105f());
    }

    public Resource<Bitmap> decode(T t, int i, int i2, C9011f fVar) throws IOException {
        long longValue = ((Long) fVar.mo24517a(f23670d)).longValue();
        if (longValue >= 0 || longValue == -1) {
            Integer num = (Integer) fVar.mo24517a(f23671e);
            if (num == null) {
                num = Integer.valueOf(2);
            }
            C9121m mVar = (C9121m) fVar.mo24517a(C9121m.f23701f);
            if (mVar == null) {
                mVar = C9121m.f23700e;
            }
            C9121m mVar2 = mVar;
            MediaMetadataRetriever a = this.f23675c.mo24621a();
            try {
                this.f23673a.mo24620a(a, t);
                Bitmap a2 = m21798a(a, longValue, num.intValue(), i, i2, mVar2);
                a.release();
                return C9109e.m21814a(a2, this.f23674b);
            } catch (RuntimeException e) {
                throw new IOException(e);
            } catch (Throwable th) {
                a.release();
                throw th;
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Requested frame must be non-negative, or DEFAULT_FRAME, given: ");
            sb.append(longValue);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public boolean handles(T t, C9011f fVar) {
        return true;
    }

    C9099a0(BitmapPool bitmapPool, C9104e<T> eVar, C9103d dVar) {
        this.f23674b = bitmapPool;
        this.f23673a = eVar;
        this.f23675c = dVar;
    }

    /* renamed from: a */
    private static Bitmap m21798a(MediaMetadataRetriever mediaMetadataRetriever, long j, int i, int i2, int i3, C9121m mVar) {
        Bitmap b = (VERSION.SDK_INT < 27 || i2 == Integer.MIN_VALUE || i3 == Integer.MIN_VALUE || mVar == C9121m.f23699d) ? null : m21800b(mediaMetadataRetriever, j, i, i2, i3, mVar);
        return b == null ? m21797a(mediaMetadataRetriever, j, i) : b;
    }

    @TargetApi(27)
    /* renamed from: b */
    private static Bitmap m21800b(MediaMetadataRetriever mediaMetadataRetriever, long j, int i, int i2, int i3, C9121m mVar) {
        try {
            int parseInt = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
            int parseInt2 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
            int parseInt3 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
            if (parseInt3 == 90 || parseInt3 == 270) {
                int i4 = parseInt2;
                parseInt2 = parseInt;
                parseInt = i4;
            }
            float b = mVar.mo24639b(parseInt, parseInt2, i2, i3);
            return mediaMetadataRetriever.getScaledFrameAtTime(j, i, Math.round(((float) parseInt) * b), Math.round(b * ((float) parseInt2)));
        } catch (Throwable th) {
            String str = "VideoDecoder";
            if (Log.isLoggable(str, 3)) {
                Log.d(str, "Exception trying to decode frame on oreo+", th);
            }
            return null;
        }
    }

    /* renamed from: a */
    private static Bitmap m21797a(MediaMetadataRetriever mediaMetadataRetriever, long j, int i) {
        return mediaMetadataRetriever.getFrameAtTime(j, i);
    }
}
