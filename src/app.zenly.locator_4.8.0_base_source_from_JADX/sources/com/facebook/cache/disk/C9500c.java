package com.facebook.cache.disk;

import android.content.Context;
import com.facebook.cache.common.C9485c;
import com.facebook.cache.common.C9486d;
import com.facebook.cache.common.CacheErrorLogger;
import com.facebook.cache.common.CacheEventListener;
import com.facebook.common.disk.C9511a;
import com.facebook.common.disk.DiskTrimmableRegistry;
import com.facebook.common.internal.C9536j;
import com.facebook.common.internal.Supplier;
import java.io.File;

/* renamed from: com.facebook.cache.disk.c */
public class C9500c {

    /* renamed from: a */
    private final int f24620a;

    /* renamed from: b */
    private final String f24621b;

    /* renamed from: c */
    private final Supplier<File> f24622c;

    /* renamed from: d */
    private final long f24623d;

    /* renamed from: e */
    private final long f24624e;

    /* renamed from: f */
    private final long f24625f;

    /* renamed from: g */
    private final EntryEvictionComparatorSupplier f24626g;

    /* renamed from: h */
    private final CacheErrorLogger f24627h;

    /* renamed from: i */
    private final CacheEventListener f24628i;

    /* renamed from: j */
    private final DiskTrimmableRegistry f24629j;

    /* renamed from: k */
    private final Context f24630k;

    /* renamed from: l */
    private final boolean f24631l;

    /* renamed from: com.facebook.cache.disk.c$b */
    public static class C9502b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public int f24632a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public String f24633b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public Supplier<File> f24634c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public long f24635d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public long f24636e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public long f24637f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public EntryEvictionComparatorSupplier f24638g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public CacheErrorLogger f24639h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public CacheEventListener f24640i;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public DiskTrimmableRegistry f24641j;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public boolean f24642k;
        /* access modifiers changed from: private */

        /* renamed from: l */
        public final Context f24643l;

        /* renamed from: com.facebook.cache.disk.c$b$a */
        class C9503a implements Supplier<File> {
            C9503a() {
            }

            public File get() {
                return C9502b.this.f24643l.getApplicationContext().getCacheDir();
            }
        }

        private C9502b(Context context) {
            this.f24632a = 1;
            this.f24633b = "image_cache";
            this.f24635d = 41943040;
            this.f24636e = 10485760;
            this.f24637f = 2097152;
            this.f24638g = new C9498b();
            this.f24643l = context;
        }

        /* renamed from: a */
        public C9500c mo25578a() {
            C9536j.m23280b((this.f24634c == null && this.f24643l == null) ? false : true, "Either a non-null context or a base directory path or supplier must be provided.");
            if (this.f24634c == null && this.f24643l != null) {
                this.f24634c = new C9503a();
            }
            return new C9500c(this);
        }
    }

    /* renamed from: a */
    public String mo25566a() {
        return this.f24621b;
    }

    /* renamed from: b */
    public Supplier<File> mo25567b() {
        return this.f24622c;
    }

    /* renamed from: c */
    public CacheErrorLogger mo25568c() {
        return this.f24627h;
    }

    /* renamed from: d */
    public CacheEventListener mo25569d() {
        return this.f24628i;
    }

    /* renamed from: e */
    public Context mo25570e() {
        return this.f24630k;
    }

    /* renamed from: f */
    public long mo25571f() {
        return this.f24623d;
    }

    /* renamed from: g */
    public DiskTrimmableRegistry mo25572g() {
        return this.f24629j;
    }

    /* renamed from: h */
    public EntryEvictionComparatorSupplier mo25573h() {
        return this.f24626g;
    }

    /* renamed from: i */
    public boolean mo25574i() {
        return this.f24631l;
    }

    /* renamed from: j */
    public long mo25575j() {
        return this.f24624e;
    }

    /* renamed from: k */
    public long mo25576k() {
        return this.f24625f;
    }

    /* renamed from: l */
    public int mo25577l() {
        return this.f24620a;
    }

    private C9500c(C9502b bVar) {
        CacheErrorLogger cacheErrorLogger;
        CacheEventListener cacheEventListener;
        DiskTrimmableRegistry diskTrimmableRegistry;
        this.f24620a = bVar.f24632a;
        String b = bVar.f24633b;
        C9536j.m23271a(b);
        this.f24621b = b;
        Supplier<File> e = bVar.f24634c;
        C9536j.m23271a(e);
        this.f24622c = e;
        this.f24623d = bVar.f24635d;
        this.f24624e = bVar.f24636e;
        this.f24625f = bVar.f24637f;
        EntryEvictionComparatorSupplier i = bVar.f24638g;
        C9536j.m23271a(i);
        this.f24626g = i;
        if (bVar.f24639h == null) {
            cacheErrorLogger = C9485c.m23136a();
        } else {
            cacheErrorLogger = bVar.f24639h;
        }
        this.f24627h = cacheErrorLogger;
        if (bVar.f24640i == null) {
            cacheEventListener = C9486d.m23137a();
        } else {
            cacheEventListener = bVar.f24640i;
        }
        this.f24628i = cacheEventListener;
        if (bVar.f24641j == null) {
            diskTrimmableRegistry = C9511a.m23226a();
        } else {
            diskTrimmableRegistry = bVar.f24641j;
        }
        this.f24629j = diskTrimmableRegistry;
        this.f24630k = bVar.f24643l;
        this.f24631l = bVar.f24642k;
    }

    /* renamed from: a */
    public static C9502b m23166a(Context context) {
        return new C9502b(context);
    }
}
