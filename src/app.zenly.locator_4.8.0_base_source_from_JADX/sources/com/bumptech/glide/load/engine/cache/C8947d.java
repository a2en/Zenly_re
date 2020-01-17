package com.bumptech.glide.load.engine.cache;

import android.content.Context;
import com.bumptech.glide.load.engine.cache.DiskLruCacheFactory.CacheDirectoryGetter;
import java.io.File;

/* renamed from: com.bumptech.glide.load.engine.cache.d */
public final class C8947d extends DiskLruCacheFactory {

    /* renamed from: com.bumptech.glide.load.engine.cache.d$a */
    class C8948a implements CacheDirectoryGetter {

        /* renamed from: a */
        final /* synthetic */ Context f23310a;

        /* renamed from: b */
        final /* synthetic */ String f23311b;

        C8948a(Context context, String str) {
            this.f23310a = context;
            this.f23311b = str;
        }

        public File getCacheDirectory() {
            File cacheDir = this.f23310a.getCacheDir();
            if (cacheDir == null) {
                return null;
            }
            String str = this.f23311b;
            return str != null ? new File(cacheDir, str) : cacheDir;
        }
    }

    public C8947d(Context context) {
        this(context, "image_manager_disk_cache", 262144000);
    }

    public C8947d(Context context, String str, long j) {
        super(new C8948a(context, str), j);
    }
}
