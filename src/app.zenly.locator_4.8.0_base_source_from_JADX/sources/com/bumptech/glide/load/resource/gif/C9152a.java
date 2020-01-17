package com.bumptech.glide.load.resource.gif;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.util.Log;
import com.bumptech.glide.gifdecoder.C8861b;
import com.bumptech.glide.gifdecoder.C8862c;
import com.bumptech.glide.gifdecoder.C8863d;
import com.bumptech.glide.gifdecoder.GifDecoder;
import com.bumptech.glide.gifdecoder.GifDecoder.BitmapProvider;
import com.bumptech.glide.load.C8883b;
import com.bumptech.glide.load.C8885d;
import com.bumptech.glide.load.C9011f;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.ImageHeaderParser.ImageType;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.p294h.C9017c;
import com.bumptech.glide.p301o.C9212f;
import com.bumptech.glide.p301o.C9217k;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Queue;

/* renamed from: com.bumptech.glide.load.resource.gif.a */
public class C9152a implements ResourceDecoder<ByteBuffer, C9156c> {

    /* renamed from: f */
    private static final C9153a f23764f = new C9153a();

    /* renamed from: g */
    private static final C9154b f23765g = new C9154b();

    /* renamed from: a */
    private final Context f23766a;

    /* renamed from: b */
    private final List<ImageHeaderParser> f23767b;

    /* renamed from: c */
    private final C9154b f23768c;

    /* renamed from: d */
    private final C9153a f23769d;

    /* renamed from: e */
    private final C9155b f23770e;

    /* renamed from: com.bumptech.glide.load.resource.gif.a$a */
    static class C9153a {
        C9153a() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public GifDecoder mo24689a(BitmapProvider bitmapProvider, C8861b bVar, ByteBuffer byteBuffer, int i) {
            return new C8863d(bitmapProvider, bVar, byteBuffer, i);
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.gif.a$b */
    static class C9154b {

        /* renamed from: a */
        private final Queue<C8862c> f23771a = C9217k.m22099a(0);

        C9154b() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public synchronized C8862c mo24690a(ByteBuffer byteBuffer) {
            C8862c cVar;
            cVar = (C8862c) this.f23771a.poll();
            if (cVar == null) {
                cVar = new C8862c();
            }
            cVar.mo24166a(byteBuffer);
            return cVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public synchronized void mo24691a(C8862c cVar) {
            cVar.mo24168a();
            this.f23771a.offer(cVar);
        }
    }

    public C9152a(Context context, List<ImageHeaderParser> list, BitmapPool bitmapPool, ArrayPool arrayPool) {
        this(context, list, bitmapPool, arrayPool, f23765g, f23764f);
    }

    /* renamed from: a */
    public boolean handles(ByteBuffer byteBuffer, C9011f fVar) throws IOException {
        return !((Boolean) fVar.mo24517a(C9162h.f23789b)).booleanValue() && C8885d.m21328a(this.f23767b, byteBuffer) == ImageType.GIF;
    }

    C9152a(Context context, List<ImageHeaderParser> list, BitmapPool bitmapPool, ArrayPool arrayPool, C9154b bVar, C9153a aVar) {
        this.f23766a = context.getApplicationContext();
        this.f23767b = list;
        this.f23769d = aVar;
        this.f23770e = new C9155b(bitmapPool, arrayPool);
        this.f23768c = bVar;
    }

    /* renamed from: a */
    public C9159e decode(ByteBuffer byteBuffer, int i, int i2, C9011f fVar) {
        C8862c a = this.f23768c.mo24690a(byteBuffer);
        try {
            C9159e a2 = m21926a(byteBuffer, i, i2, a, fVar);
            return a2;
        } finally {
            this.f23768c.mo24691a(a);
        }
    }

    /* renamed from: a */
    private C9159e m21926a(ByteBuffer byteBuffer, int i, int i2, C8862c cVar, C9011f fVar) {
        Config config;
        String str = "Decoded GIF from stream in ";
        String str2 = "BufferGifDecoder";
        long a = C9212f.m22072a();
        try {
            C8861b b = cVar.mo24169b();
            if (b.mo24163b() > 0) {
                if (b.mo24164c() == 0) {
                    if (fVar.mo24517a(C9162h.f23788a) == C8883b.PREFER_RGB_565) {
                        config = Config.RGB_565;
                    } else {
                        config = Config.ARGB_8888;
                    }
                    Config config2 = config;
                    GifDecoder a2 = this.f23769d.mo24689a(this.f23770e, b, byteBuffer, m21925a(b, i, i2));
                    a2.setDefaultBitmapConfig(config2);
                    a2.advance();
                    Bitmap nextFrame = a2.getNextFrame();
                    if (nextFrame == null) {
                        if (Log.isLoggable(str2, 2)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(str);
                            sb.append(C9212f.m22071a(a));
                            Log.v(str2, sb.toString());
                        }
                        return null;
                    }
                    C9156c cVar2 = new C9156c(this.f23766a, a2, C9017c.m21679a(), i, i2, nextFrame);
                    C9159e eVar = new C9159e(cVar2);
                    if (Log.isLoggable(str2, 2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str);
                        sb2.append(C9212f.m22071a(a));
                        Log.v(str2, sb2.toString());
                    }
                    return eVar;
                }
            }
            return null;
        } finally {
            if (Log.isLoggable(str2, 2)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(C9212f.m22071a(a));
                Log.v(str2, sb3.toString());
            }
        }
    }

    /* renamed from: a */
    private static int m21925a(C8861b bVar, int i, int i2) {
        int i3;
        int min = Math.min(bVar.mo24162a() / i2, bVar.mo24165d() / i);
        if (min == 0) {
            i3 = 0;
        } else {
            i3 = Integer.highestOneBit(min);
        }
        int max = Math.max(1, i3);
        String str = "BufferGifDecoder";
        if (Log.isLoggable(str, 2) && max > 1) {
            StringBuilder sb = new StringBuilder();
            sb.append("Downsampling GIF, sampleSize: ");
            sb.append(max);
            sb.append(", target dimens: [");
            sb.append(i);
            String str2 = "x";
            sb.append(str2);
            sb.append(i2);
            sb.append("], actual dimens: [");
            sb.append(bVar.mo24165d());
            sb.append(str2);
            sb.append(bVar.mo24162a());
            sb.append("]");
            Log.v(str, sb.toString());
        }
        return max;
    }
}
