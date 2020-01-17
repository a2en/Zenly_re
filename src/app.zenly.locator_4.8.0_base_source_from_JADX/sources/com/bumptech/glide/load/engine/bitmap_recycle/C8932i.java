package com.bumptech.glide.load.engine.bitmap_recycle;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.Build.VERSION;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.bumptech.glide.load.engine.bitmap_recycle.i */
public class C8932i implements BitmapPool {

    /* renamed from: k */
    private static final Config f23266k = Config.ARGB_8888;

    /* renamed from: a */
    private final C8935j f23267a;

    /* renamed from: b */
    private final Set<Config> f23268b;

    /* renamed from: c */
    private final long f23269c;

    /* renamed from: d */
    private final C8933a f23270d;

    /* renamed from: e */
    private long f23271e;

    /* renamed from: f */
    private long f23272f;

    /* renamed from: g */
    private int f23273g;

    /* renamed from: h */
    private int f23274h;

    /* renamed from: i */
    private int f23275i;

    /* renamed from: j */
    private int f23276j;

    /* renamed from: com.bumptech.glide.load.engine.bitmap_recycle.i$a */
    private interface C8933a {
        /* renamed from: a */
        void mo24356a(Bitmap bitmap);

        /* renamed from: b */
        void mo24357b(Bitmap bitmap);
    }

    /* renamed from: com.bumptech.glide.load.engine.bitmap_recycle.i$b */
    private static final class C8934b implements C8933a {
        C8934b() {
        }

        /* renamed from: a */
        public void mo24356a(Bitmap bitmap) {
        }

        /* renamed from: b */
        public void mo24357b(Bitmap bitmap) {
        }
    }

    C8932i(long j, C8935j jVar, Set<Config> set) {
        this.f23269c = j;
        this.f23271e = j;
        this.f23267a = jVar;
        this.f23268b = set;
        this.f23270d = new C8934b();
    }

    /* renamed from: a */
    private static Bitmap m21454a(int i, int i2, Config config) {
        if (config == null) {
            config = f23266k;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    /* renamed from: b */
    private synchronized Bitmap m21459b(int i, int i2, Config config) {
        Bitmap bitmap;
        m21457a(config);
        bitmap = this.f23267a.get(i, i2, config != null ? config : f23266k);
        if (bitmap == null) {
            if (Log.isLoggable("LruBitmapPool", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Missing bitmap=");
                sb.append(this.f23267a.mo24326a(i, i2, config));
                Log.d("LruBitmapPool", sb.toString());
            }
            this.f23274h++;
        } else {
            this.f23273g++;
            this.f23272f -= (long) this.f23267a.mo24328b(bitmap);
            this.f23270d.mo24356a(bitmap);
            m21461b(bitmap);
        }
        if (Log.isLoggable("LruBitmapPool", 2)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Get bitmap=");
            sb2.append(this.f23267a.mo24326a(i, i2, config));
            Log.v("LruBitmapPool", sb2.toString());
        }
        m21455a();
        return bitmap;
    }

    /* renamed from: c */
    private void m21462c() {
        m21456a(this.f23271e);
    }

    @TargetApi(26)
    /* renamed from: d */
    private static Set<Config> m21463d() {
        HashSet hashSet = new HashSet(Arrays.asList(Config.values()));
        if (VERSION.SDK_INT >= 19) {
            hashSet.add(null);
        }
        if (VERSION.SDK_INT >= 26) {
            hashSet.remove(Config.HARDWARE);
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: e */
    private static C8935j m21464e() {
        if (VERSION.SDK_INT >= 19) {
            return new C8937l();
        }
        return new C8920b();
    }

    public void clearMemory() {
        String str = "LruBitmapPool";
        if (Log.isLoggable(str, 3)) {
            Log.d(str, "clearMemory");
        }
        m21456a(0);
    }

    public Bitmap get(int i, int i2, Config config) {
        Bitmap b = m21459b(i, i2, config);
        if (b == null) {
            return m21454a(i, i2, config);
        }
        b.eraseColor(0);
        return b;
    }

    public Bitmap getDirty(int i, int i2, Config config) {
        Bitmap b = m21459b(i, i2, config);
        return b == null ? m21454a(i, i2, config) : b;
    }

    public long getMaxSize() {
        return this.f23271e;
    }

    public synchronized void put(Bitmap bitmap) {
        if (bitmap != null) {
            try {
                if (!bitmap.isRecycled()) {
                    if (bitmap.isMutable() && ((long) this.f23267a.mo24328b(bitmap)) <= this.f23271e) {
                        if (this.f23268b.contains(bitmap.getConfig())) {
                            int b = this.f23267a.mo24328b(bitmap);
                            this.f23267a.put(bitmap);
                            this.f23270d.mo24357b(bitmap);
                            this.f23275i++;
                            this.f23272f += (long) b;
                            if (Log.isLoggable("LruBitmapPool", 2)) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("Put bitmap in pool=");
                                sb.append(this.f23267a.mo24327a(bitmap));
                                Log.v("LruBitmapPool", sb.toString());
                            }
                            m21455a();
                            m21462c();
                            return;
                        }
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Reject bitmap from pool, bitmap: ");
                        sb2.append(this.f23267a.mo24327a(bitmap));
                        sb2.append(", is mutable: ");
                        sb2.append(bitmap.isMutable());
                        sb2.append(", is allowed config: ");
                        sb2.append(this.f23268b.contains(bitmap.getConfig()));
                        Log.v("LruBitmapPool", sb2.toString());
                    }
                    bitmap.recycle();
                    return;
                }
                throw new IllegalStateException("Cannot pool recycled bitmap");
            } finally {
            }
        } else {
            throw new NullPointerException("Bitmap must not be null");
        }
    }

    public synchronized void setSizeMultiplier(float f) {
        this.f23271e = (long) Math.round(((float) this.f23269c) * f);
        m21462c();
    }

    @SuppressLint({"InlinedApi"})
    public void trimMemory(int i) {
        String str = "LruBitmapPool";
        if (Log.isLoggable(str, 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("trimMemory, level=");
            sb.append(i);
            Log.d(str, sb.toString());
        }
        if (i >= 40 || (VERSION.SDK_INT >= 23 && i >= 20)) {
            clearMemory();
        } else if (i >= 20 || i == 15) {
            m21456a(getMaxSize() / 2);
        }
    }

    @TargetApi(26)
    /* renamed from: a */
    private static void m21457a(Config config) {
        if (VERSION.SDK_INT >= 26 && config == Config.HARDWARE) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot create a mutable Bitmap with config: ");
            sb.append(config);
            sb.append(". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    @TargetApi(19)
    /* renamed from: a */
    private static void m21458a(Bitmap bitmap) {
        if (VERSION.SDK_INT >= 19) {
            bitmap.setPremultiplied(true);
        }
    }

    public C8932i(long j) {
        this(j, m21464e(), m21463d());
    }

    /* renamed from: a */
    private synchronized void m21456a(long j) {
        while (this.f23272f > j) {
            Bitmap removeLast = this.f23267a.removeLast();
            if (removeLast == null) {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    Log.w("LruBitmapPool", "Size mismatch, resetting");
                    m21460b();
                }
                this.f23272f = 0;
                return;
            }
            this.f23270d.mo24356a(removeLast);
            this.f23272f -= (long) this.f23267a.mo24328b(removeLast);
            this.f23276j++;
            if (Log.isLoggable("LruBitmapPool", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Evicting bitmap=");
                sb.append(this.f23267a.mo24327a(removeLast));
                Log.d("LruBitmapPool", sb.toString());
            }
            m21455a();
            removeLast.recycle();
        }
    }

    /* renamed from: b */
    private static void m21461b(Bitmap bitmap) {
        bitmap.setHasAlpha(true);
        m21458a(bitmap);
    }

    /* renamed from: b */
    private void m21460b() {
        StringBuilder sb = new StringBuilder();
        sb.append("Hits=");
        sb.append(this.f23273g);
        sb.append(", misses=");
        sb.append(this.f23274h);
        sb.append(", puts=");
        sb.append(this.f23275i);
        sb.append(", evictions=");
        sb.append(this.f23276j);
        sb.append(", currentSize=");
        sb.append(this.f23272f);
        sb.append(", maxSize=");
        sb.append(this.f23271e);
        sb.append("\nStrategy=");
        sb.append(this.f23267a);
        Log.v("LruBitmapPool", sb.toString());
    }

    /* renamed from: a */
    private void m21455a() {
        if (Log.isLoggable("LruBitmapPool", 2)) {
            m21460b();
        }
    }
}
