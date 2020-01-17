package com.facebook.imagepipeline.cache;

import bolts.Task;
import com.facebook.binaryresource.BinaryResource;
import com.facebook.cache.common.CacheKey;
import com.facebook.cache.common.WriterCallback;
import com.facebook.cache.disk.FileCache;
import com.facebook.common.internal.C9536j;
import com.facebook.common.logging.C9543a;
import com.facebook.common.memory.C9550f;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.common.memory.PooledByteBufferFactory;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.image.C9732e;
import com.facebook.imagepipeline.systrace.FrescoSystrace;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.imagepipeline.cache.e */
public class C9678e {
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final Class<?> f25292h = C9678e.class;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final FileCache f25293a;

    /* renamed from: b */
    private final PooledByteBufferFactory f25294b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C9550f f25295c;

    /* renamed from: d */
    private final Executor f25296d;

    /* renamed from: e */
    private final Executor f25297e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C9696p f25298f = C9696p.m23831a();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final ImageCacheStatsTracker f25299g;

    /* renamed from: com.facebook.imagepipeline.cache.e$a */
    class C9679a implements Callable<C9732e> {

        /* renamed from: e */
        final /* synthetic */ AtomicBoolean f25300e;

        /* renamed from: f */
        final /* synthetic */ CacheKey f25301f;

        C9679a(AtomicBoolean atomicBoolean, CacheKey cacheKey) {
            this.f25300e = atomicBoolean;
            this.f25301f = cacheKey;
        }

        public C9732e call() throws Exception {
            CloseableReference a;
            try {
                if (FrescoSystrace.m24705c()) {
                    FrescoSystrace.m24703a("BufferedDiskCache#getAsync");
                }
                if (!this.f25300e.get()) {
                    C9732e a2 = C9678e.this.f25298f.mo26249a(this.f25301f);
                    if (a2 != null) {
                        C9543a.m23313b(C9678e.f25292h, "Found image for %s in staging area", (Object) this.f25301f.getUriString());
                        C9678e.this.f25299g.onStagingAreaHit(this.f25301f);
                    } else {
                        C9543a.m23313b(C9678e.f25292h, "Did not find image for %s in staging area", (Object) this.f25301f.getUriString());
                        C9678e.this.f25299g.onStagingAreaMiss();
                        try {
                            PooledByteBuffer a3 = C9678e.this.m23804b(this.f25301f);
                            if (a3 == null) {
                                if (FrescoSystrace.m24705c()) {
                                    FrescoSystrace.m24702a();
                                }
                                return null;
                            }
                            a = CloseableReference.m23349a(a3);
                            C9732e eVar = new C9732e(a);
                            CloseableReference.m23355b(a);
                            a2 = eVar;
                        } catch (Exception unused) {
                            if (FrescoSystrace.m24705c()) {
                                FrescoSystrace.m24702a();
                            }
                            return null;
                        } catch (Throwable th) {
                            CloseableReference.m23355b(a);
                            throw th;
                        }
                    }
                    if (!Thread.interrupted()) {
                        return a2;
                    }
                    C9543a.m23312b(C9678e.f25292h, "Host thread was interrupted, decreasing reference count");
                    if (a2 != null) {
                        a2.close();
                    }
                    throw new InterruptedException();
                }
                throw new CancellationException();
            } finally {
                if (FrescoSystrace.m24705c()) {
                    FrescoSystrace.m24702a();
                }
            }
        }
    }

    /* renamed from: com.facebook.imagepipeline.cache.e$b */
    class C9680b implements Runnable {

        /* renamed from: e */
        final /* synthetic */ CacheKey f25303e;

        /* renamed from: f */
        final /* synthetic */ C9732e f25304f;

        C9680b(CacheKey cacheKey, C9732e eVar) {
            this.f25303e = cacheKey;
            this.f25304f = eVar;
        }

        public void run() {
            try {
                if (FrescoSystrace.m24705c()) {
                    FrescoSystrace.m24703a("BufferedDiskCache#putAsync");
                }
                C9678e.this.m23807c(this.f25303e, this.f25304f);
            } finally {
                C9678e.this.f25298f.mo26252b(this.f25303e, this.f25304f);
                C9732e.m24069c(this.f25304f);
                if (FrescoSystrace.m24705c()) {
                    FrescoSystrace.m24702a();
                }
            }
        }
    }

    /* renamed from: com.facebook.imagepipeline.cache.e$c */
    class C9681c implements Callable<Void> {

        /* renamed from: e */
        final /* synthetic */ CacheKey f25306e;

        C9681c(CacheKey cacheKey) {
            this.f25306e = cacheKey;
        }

        public Void call() throws Exception {
            try {
                if (FrescoSystrace.m24705c()) {
                    FrescoSystrace.m24703a("BufferedDiskCache#remove");
                }
                C9678e.this.f25298f.mo26251b(this.f25306e);
                C9678e.this.f25293a.remove(this.f25306e);
                return null;
            } finally {
                if (FrescoSystrace.m24705c()) {
                    FrescoSystrace.m24702a();
                }
            }
        }
    }

    /* renamed from: com.facebook.imagepipeline.cache.e$d */
    class C9682d implements WriterCallback {

        /* renamed from: a */
        final /* synthetic */ C9732e f25308a;

        C9682d(C9732e eVar) {
            this.f25308a = eVar;
        }

        public void write(OutputStream outputStream) throws IOException {
            C9678e.this.f25295c.mo25722a(this.f25308a.mo26434h(), outputStream);
        }
    }

    public C9678e(FileCache fileCache, PooledByteBufferFactory pooledByteBufferFactory, C9550f fVar, Executor executor, Executor executor2, ImageCacheStatsTracker imageCacheStatsTracker) {
        this.f25293a = fileCache;
        this.f25294b = pooledByteBufferFactory;
        this.f25295c = fVar;
        this.f25296d = executor;
        this.f25297e = executor2;
        this.f25299g = imageCacheStatsTracker;
    }

    /* renamed from: b */
    private Task<C9732e> m23803b(CacheKey cacheKey, AtomicBoolean atomicBoolean) {
        try {
            return Task.m17417a(new C9679a(atomicBoolean, cacheKey), this.f25296d);
        } catch (Exception e) {
            C9543a.m23316b(f25292h, e, "Failed to schedule disk-cache read for %s", cacheKey.getUriString());
            return Task.m17420b(e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m23807c(CacheKey cacheKey, C9732e eVar) {
        C9543a.m23313b(f25292h, "About to write to disk-cache for key %s", (Object) cacheKey.getUriString());
        try {
            this.f25293a.insert(cacheKey, new C9682d(eVar));
            C9543a.m23313b(f25292h, "Successful disk-cache write for key %s", (Object) cacheKey.getUriString());
        } catch (IOException e) {
            C9543a.m23316b(f25292h, e, "Failed to write to disk-cache for key %s", cacheKey.getUriString());
        }
    }

    /* renamed from: a */
    public Task<C9732e> mo26232a(CacheKey cacheKey, AtomicBoolean atomicBoolean) {
        try {
            if (FrescoSystrace.m24705c()) {
                FrescoSystrace.m24703a("BufferedDiskCache#get");
            }
            C9732e a = this.f25298f.mo26249a(cacheKey);
            if (a != null) {
                return m23802b(cacheKey, a);
            }
            Task<C9732e> b = m23803b(cacheKey, atomicBoolean);
            if (FrescoSystrace.m24705c()) {
                FrescoSystrace.m24702a();
            }
            return b;
        } finally {
            if (FrescoSystrace.m24705c()) {
                FrescoSystrace.m24702a();
            }
        }
    }

    /* renamed from: b */
    private Task<C9732e> m23802b(CacheKey cacheKey, C9732e eVar) {
        C9543a.m23313b(f25292h, "Found image for %s in staging area", (Object) cacheKey.getUriString());
        this.f25299g.onStagingAreaHit(cacheKey);
        return Task.m17421b(eVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public PooledByteBuffer m23804b(CacheKey cacheKey) throws IOException {
        InputStream openStream;
        try {
            C9543a.m23313b(f25292h, "Disk cache read for %s", (Object) cacheKey.getUriString());
            BinaryResource resource = this.f25293a.getResource(cacheKey);
            if (resource == null) {
                C9543a.m23313b(f25292h, "Disk cache miss for %s", (Object) cacheKey.getUriString());
                this.f25299g.onDiskCacheMiss();
                return null;
            }
            C9543a.m23313b(f25292h, "Found entry in disk cache for %s", (Object) cacheKey.getUriString());
            this.f25299g.onDiskCacheHit(cacheKey);
            openStream = resource.openStream();
            PooledByteBuffer newByteBuffer = this.f25294b.newByteBuffer(openStream, (int) resource.size());
            openStream.close();
            C9543a.m23313b(f25292h, "Successful read from disk cache for %s", (Object) cacheKey.getUriString());
            return newByteBuffer;
        } catch (IOException e) {
            C9543a.m23316b(f25292h, e, "Exception reading from cache for %s", cacheKey.getUriString());
            this.f25299g.onDiskCacheGetFail();
            throw e;
        } catch (Throwable th) {
            openStream.close();
            throw th;
        }
    }

    /* renamed from: a */
    public void mo26233a(CacheKey cacheKey, C9732e eVar) {
        C9732e b;
        try {
            if (FrescoSystrace.m24705c()) {
                FrescoSystrace.m24703a("BufferedDiskCache#put");
            }
            C9536j.m23271a(cacheKey);
            C9536j.m23275a(C9732e.m24071e(eVar));
            this.f25298f.mo26250a(cacheKey, eVar);
            b = C9732e.m24068b(eVar);
            this.f25297e.execute(new C9680b(cacheKey, b));
        } catch (Exception e) {
            C9543a.m23316b(f25292h, e, "Failed to schedule disk-cache write for %s", cacheKey.getUriString());
            this.f25298f.mo26252b(cacheKey, eVar);
            C9732e.m24069c(b);
        } catch (Throwable th) {
            if (FrescoSystrace.m24705c()) {
                FrescoSystrace.m24702a();
            }
            throw th;
        }
        if (FrescoSystrace.m24705c()) {
            FrescoSystrace.m24702a();
        }
    }

    /* renamed from: a */
    public Task<Void> mo26231a(CacheKey cacheKey) {
        C9536j.m23271a(cacheKey);
        this.f25298f.mo26251b(cacheKey);
        try {
            return Task.m17417a(new C9681c(cacheKey), this.f25297e);
        } catch (Exception e) {
            C9543a.m23316b(f25292h, e, "Failed to schedule disk-cache remove for %s", cacheKey.getUriString());
            return Task.m17420b(e);
        }
    }
}
