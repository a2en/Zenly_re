package com.facebook.cache.disk;

import com.facebook.binaryresource.BinaryResource;
import com.facebook.cache.common.CacheErrorLogger;
import com.facebook.cache.common.CacheErrorLogger.C9481a;
import com.facebook.cache.disk.DiskStorage.C9488a;
import com.facebook.cache.disk.DiskStorage.Entry;
import com.facebook.cache.disk.DiskStorage.Inserter;
import com.facebook.common.file.C9521a;
import com.facebook.common.file.FileUtils;
import com.facebook.common.file.FileUtils.CreateDirectoryException;
import com.facebook.common.internal.C9536j;
import com.facebook.common.internal.Supplier;
import com.facebook.common.logging.C9543a;
import java.io.File;
import java.io.IOException;
import java.util.Collection;

/* renamed from: com.facebook.cache.disk.e */
public class C9508e implements DiskStorage {

    /* renamed from: f */
    private static final Class<?> f24672f = C9508e.class;

    /* renamed from: a */
    private final int f24673a;

    /* renamed from: b */
    private final Supplier<File> f24674b;

    /* renamed from: c */
    private final String f24675c;

    /* renamed from: d */
    private final CacheErrorLogger f24676d;

    /* renamed from: e */
    volatile C9509a f24677e = new C9509a(null, null);

    /* renamed from: com.facebook.cache.disk.e$a */
    static class C9509a {

        /* renamed from: a */
        public final DiskStorage f24678a;

        /* renamed from: b */
        public final File f24679b;

        C9509a(File file, DiskStorage diskStorage) {
            this.f24678a = diskStorage;
            this.f24679b = file;
        }
    }

    public C9508e(int i, Supplier<File> supplier, String str, CacheErrorLogger cacheErrorLogger) {
        this.f24673a = i;
        this.f24676d = cacheErrorLogger;
        this.f24674b = supplier;
        this.f24675c = str;
    }

    /* renamed from: c */
    private void m23211c() throws IOException {
        File file = new File((File) this.f24674b.get(), this.f24675c);
        mo25590a(file);
        this.f24677e = new C9509a(file, new C9490a(file, this.f24673a, this.f24676d));
    }

    /* renamed from: d */
    private boolean m23212d() {
        C9509a aVar = this.f24677e;
        if (aVar.f24678a != null) {
            File file = aVar.f24679b;
            if (file != null && file.exists()) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo25589a() {
        if (this.f24677e.f24678a != null && this.f24677e.f24679b != null) {
            C9521a.m23246b(this.f24677e.f24679b);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public synchronized DiskStorage mo25591b() throws IOException {
        DiskStorage diskStorage;
        if (m23212d()) {
            mo25589a();
            m23211c();
        }
        diskStorage = this.f24677e.f24678a;
        C9536j.m23271a(diskStorage);
        return diskStorage;
    }

    public void clearAll() throws IOException {
        mo25591b().clearAll();
    }

    public boolean contains(String str, Object obj) throws IOException {
        return mo25591b().contains(str, obj);
    }

    public C9488a getDumpInfo() throws IOException {
        return mo25591b().getDumpInfo();
    }

    public Collection<Entry> getEntries() throws IOException {
        return mo25591b().getEntries();
    }

    public BinaryResource getResource(String str, Object obj) throws IOException {
        return mo25591b().getResource(str, obj);
    }

    public String getStorageName() {
        try {
            return mo25591b().getStorageName();
        } catch (IOException unused) {
            return "";
        }
    }

    public Inserter insert(String str, Object obj) throws IOException {
        return mo25591b().insert(str, obj);
    }

    public boolean isEnabled() {
        try {
            return mo25591b().isEnabled();
        } catch (IOException unused) {
            return false;
        }
    }

    public boolean isExternal() {
        try {
            return mo25591b().isExternal();
        } catch (IOException unused) {
            return false;
        }
    }

    public void purgeUnexpectedResources() {
        try {
            mo25591b().purgeUnexpectedResources();
        } catch (IOException e) {
            C9543a.m23305a(f24672f, "purgeUnexpectedResources", (Throwable) e);
        }
    }

    public long remove(Entry entry) throws IOException {
        return mo25591b().remove(entry);
    }

    public boolean touch(String str, Object obj) throws IOException {
        return mo25591b().touch(str, obj);
    }

    public long remove(String str) throws IOException {
        return mo25591b().remove(str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo25590a(File file) throws IOException {
        try {
            FileUtils.m23242a(file);
            C9543a.m23301a(f24672f, "Created cache directory %s", (Object) file.getAbsolutePath());
        } catch (CreateDirectoryException e) {
            this.f24676d.logError(C9481a.WRITE_CREATE_DIR, f24672f, "createRootDirectoryIfNecessary", e);
            throw e;
        }
    }
}
