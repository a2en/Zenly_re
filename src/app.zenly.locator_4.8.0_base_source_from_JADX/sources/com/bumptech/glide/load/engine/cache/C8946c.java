package com.bumptech.glide.load.engine.cache;

import android.util.Log;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.cache.DiskCache.Writer;
import com.bumptech.glide.p292l.C8872a;
import com.bumptech.glide.p292l.C8872a.C8875c;
import com.bumptech.glide.p292l.C8872a.C8877e;
import java.io.File;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.engine.cache.c */
public class C8946c implements DiskCache {

    /* renamed from: a */
    private final C8954g f23305a;

    /* renamed from: b */
    private final File f23306b;

    /* renamed from: c */
    private final long f23307c;

    /* renamed from: d */
    private final C8943b f23308d = new C8943b();

    /* renamed from: e */
    private C8872a f23309e;

    @Deprecated
    protected C8946c(File file, long j) {
        this.f23306b = file;
        this.f23307c = j;
        this.f23305a = new C8954g();
    }

    /* renamed from: a */
    public static DiskCache m21493a(File file, long j) {
        return new C8946c(file, j);
    }

    /* renamed from: b */
    private synchronized void m21494b() {
        this.f23309e = null;
    }

    public synchronized void clear() {
        try {
            m21492a().mo24199a();
        } catch (IOException e) {
            try {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to clear disk cache or disk cache cleared externally", e);
                }
            } catch (Throwable th) {
                m21494b();
                throw th;
            }
        }
        m21494b();
    }

    public void delete(Key key) {
        try {
            m21492a().mo24201c(this.f23305a.mo24394a(key));
        } catch (IOException e) {
            String str = "DiskLruCacheWrapper";
            if (Log.isLoggable(str, 5)) {
                Log.w(str, "Unable to delete from disk cache", e);
            }
        }
    }

    public File get(Key key) {
        String a = this.f23305a.mo24394a(key);
        String str = "DiskLruCacheWrapper";
        if (Log.isLoggable(str, 2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Get: Obtained: ");
            sb.append(a);
            sb.append(" for for Key: ");
            sb.append(key);
            Log.v(str, sb.toString());
        }
        try {
            C8877e b = m21492a().mo24200b(a);
            if (b != null) {
                return b.mo24212a(0);
            }
            return null;
        } catch (IOException e) {
            if (!Log.isLoggable(str, 5)) {
                return null;
            }
            Log.w(str, "Unable to get from disk cache", e);
            return null;
        }
    }

    public void put(Key key, Writer writer) {
        C8875c a;
        String str = "DiskLruCacheWrapper";
        String a2 = this.f23305a.mo24394a(key);
        this.f23308d.mo24380a(a2);
        try {
            if (Log.isLoggable(str, 2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Put: Obtained: ");
                sb.append(a2);
                sb.append(" for for Key: ");
                sb.append(key);
                Log.v(str, sb.toString());
            }
            try {
                C8872a a3 = m21492a();
                if (a3.mo24200b(a2) == null) {
                    a = a3.mo24198a(a2);
                    if (a != null) {
                        if (writer.write(a.mo24205a(0))) {
                            a.mo24208c();
                        }
                        a.mo24207b();
                        this.f23308d.mo24381b(a2);
                        return;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Had two simultaneous puts for: ");
                    sb2.append(a2);
                    throw new IllegalStateException(sb2.toString());
                }
            } catch (IOException e) {
                if (Log.isLoggable(str, 5)) {
                    Log.w(str, "Unable to put to disk cache", e);
                }
            } catch (Throwable th) {
                a.mo24207b();
                throw th;
            }
        } finally {
            this.f23308d.mo24381b(a2);
        }
    }

    /* renamed from: a */
    private synchronized C8872a m21492a() throws IOException {
        if (this.f23309e == null) {
            this.f23309e = C8872a.m21269a(this.f23306b, 1, 1, this.f23307c);
        }
        return this.f23309e;
    }
}
