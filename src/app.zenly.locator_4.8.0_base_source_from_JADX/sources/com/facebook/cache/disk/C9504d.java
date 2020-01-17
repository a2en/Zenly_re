package com.facebook.cache.disk;

import android.content.Context;
import com.facebook.binaryresource.BinaryResource;
import com.facebook.cache.common.C9483a;
import com.facebook.cache.common.CacheErrorLogger;
import com.facebook.cache.common.CacheErrorLogger.C9481a;
import com.facebook.cache.common.CacheEventListener;
import com.facebook.cache.common.CacheEventListener.C9482a;
import com.facebook.cache.common.CacheKey;
import com.facebook.cache.common.WriterCallback;
import com.facebook.cache.disk.DiskStorage.C9488a;
import com.facebook.cache.disk.DiskStorage.Entry;
import com.facebook.cache.disk.DiskStorage.Inserter;
import com.facebook.common.disk.DiskTrimmable;
import com.facebook.common.disk.DiskTrimmableRegistry;
import com.facebook.common.logging.C9543a;
import com.facebook.common.time.C9554a;
import com.facebook.common.time.Clock;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p333g.p339c.p340a.p342b.C12027a;
import p333g.p339c.p340a.p342b.C12027a.C12028a;

/* renamed from: com.facebook.cache.disk.d */
public class C9504d implements FileCache, DiskTrimmable {

    /* renamed from: r */
    private static final Class<?> f24645r = C9504d.class;

    /* renamed from: s */
    private static final long f24646s = TimeUnit.HOURS.toMillis(2);

    /* renamed from: t */
    private static final long f24647t = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a */
    private final long f24648a;

    /* renamed from: b */
    private final long f24649b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final CountDownLatch f24650c;

    /* renamed from: d */
    private long f24651d;

    /* renamed from: e */
    private final CacheEventListener f24652e;

    /* renamed from: f */
    final Set<String> f24653f;

    /* renamed from: g */
    private long f24654g;

    /* renamed from: h */
    private final long f24655h;

    /* renamed from: i */
    private final C12027a f24656i;

    /* renamed from: j */
    private final DiskStorage f24657j;

    /* renamed from: k */
    private final EntryEvictionComparatorSupplier f24658k;

    /* renamed from: l */
    private final CacheErrorLogger f24659l;

    /* renamed from: m */
    private final boolean f24660m;

    /* renamed from: n */
    private final C9506b f24661n;

    /* renamed from: o */
    private final Clock f24662o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final Object f24663p = new Object();
    /* access modifiers changed from: private */

    /* renamed from: q */
    public boolean f24664q;

    /* renamed from: com.facebook.cache.disk.d$a */
    class C9505a implements Runnable {
        C9505a() {
        }

        public void run() {
            synchronized (C9504d.this.f24663p) {
                C9504d.this.m23200b();
            }
            C9504d.this.f24664q = true;
            C9504d.this.f24650c.countDown();
        }
    }

    /* renamed from: com.facebook.cache.disk.d$b */
    static class C9506b {

        /* renamed from: a */
        private boolean f24666a = false;

        /* renamed from: b */
        private long f24667b = -1;

        /* renamed from: c */
        private long f24668c = -1;

        C9506b() {
        }

        /* renamed from: a */
        public synchronized void mo25584a(long j, long j2) {
            if (this.f24666a) {
                this.f24667b += j;
                this.f24668c += j2;
            }
        }

        /* renamed from: b */
        public synchronized void mo25586b(long j, long j2) {
            this.f24668c = j2;
            this.f24667b = j;
            this.f24666a = true;
        }

        /* renamed from: c */
        public synchronized boolean mo25587c() {
            return this.f24666a;
        }

        /* renamed from: d */
        public synchronized void mo25588d() {
            this.f24666a = false;
            this.f24668c = -1;
            this.f24667b = -1;
        }

        /* renamed from: a */
        public synchronized long mo25583a() {
            return this.f24668c;
        }

        /* renamed from: b */
        public synchronized long mo25585b() {
            return this.f24667b;
        }
    }

    /* renamed from: com.facebook.cache.disk.d$c */
    public static class C9507c {

        /* renamed from: a */
        public final long f24669a;

        /* renamed from: b */
        public final long f24670b;

        /* renamed from: c */
        public final long f24671c;

        public C9507c(long j, long j2, long j3) {
            this.f24669a = j;
            this.f24670b = j2;
            this.f24671c = j3;
        }
    }

    public C9504d(DiskStorage diskStorage, EntryEvictionComparatorSupplier entryEvictionComparatorSupplier, C9507c cVar, CacheEventListener cacheEventListener, CacheErrorLogger cacheErrorLogger, DiskTrimmableRegistry diskTrimmableRegistry, Context context, Executor executor, boolean z) {
        this.f24648a = cVar.f24670b;
        long j = cVar.f24671c;
        this.f24649b = j;
        this.f24651d = j;
        this.f24656i = C12027a.m31685b();
        this.f24657j = diskStorage;
        this.f24658k = entryEvictionComparatorSupplier;
        this.f24654g = -1;
        this.f24652e = cacheEventListener;
        this.f24655h = cVar.f24669a;
        this.f24659l = cacheErrorLogger;
        this.f24661n = new C9506b();
        this.f24662o = C9554a.m23375a();
        this.f24660m = z;
        this.f24653f = new HashSet();
        if (diskTrimmableRegistry != null) {
            diskTrimmableRegistry.registerDiskTrimmable(this);
        }
        if (this.f24660m) {
            this.f24650c = new CountDownLatch(1);
            executor.execute(new C9505a());
            return;
        }
        this.f24650c = new CountDownLatch(0);
    }

    /* renamed from: d */
    private void m23204d() {
        if (this.f24656i.mo35660a(this.f24657j.isExternal() ? C12028a.EXTERNAL : C12028a.INTERNAL, this.f24649b - this.f24661n.mo25585b())) {
            this.f24651d = this.f24648a;
        } else {
            this.f24651d = this.f24649b;
        }
    }

    public void clearAll() {
        synchronized (this.f24663p) {
            try {
                this.f24657j.clearAll();
                this.f24653f.clear();
                this.f24652e.onCleared();
            } catch (IOException | NullPointerException e) {
                CacheErrorLogger cacheErrorLogger = this.f24659l;
                C9481a aVar = C9481a.EVICTION;
                Class<?> cls = f24645r;
                StringBuilder sb = new StringBuilder();
                sb.append("clearAll: ");
                sb.append(e.getMessage());
                cacheErrorLogger.logError(aVar, cls, sb.toString(), e);
            }
            this.f24661n.mo25588d();
        }
    }

    public long clearOldEntries(long j) {
        long j2;
        synchronized (this.f24663p) {
            try {
                long now = this.f24662o.now();
                Collection<Entry> entries = this.f24657j.getEntries();
                long b = this.f24661n.mo25585b();
                int i = 0;
                long j3 = 0;
                j2 = 0;
                for (Entry entry : entries) {
                    try {
                        long j4 = now;
                        long max = Math.max(1, Math.abs(now - entry.getTimestamp()));
                        if (max >= j) {
                            long remove = this.f24657j.remove(entry);
                            this.f24653f.remove(entry.getId());
                            if (remove > 0) {
                                i++;
                                j3 += remove;
                                C9510f b2 = C9510f.m23216b();
                                b2.mo25596a(entry.getId());
                                b2.mo25593a(C9482a.CONTENT_STALE);
                                b2.mo25599c(remove);
                                b2.mo25598b(b - j3);
                                this.f24652e.onEviction(b2);
                                b2.mo25597a();
                            }
                        } else {
                            j2 = Math.max(j2, max);
                        }
                        now = j4;
                    } catch (IOException e) {
                        e = e;
                        CacheErrorLogger cacheErrorLogger = this.f24659l;
                        C9481a aVar = C9481a.EVICTION;
                        Class<?> cls = f24645r;
                        StringBuilder sb = new StringBuilder();
                        sb.append("clearOldEntries: ");
                        sb.append(e.getMessage());
                        cacheErrorLogger.logError(aVar, cls, sb.toString(), e);
                        return j2;
                    }
                }
                this.f24657j.purgeUnexpectedResources();
                if (i > 0) {
                    m23200b();
                    this.f24661n.mo25584a(-j3, (long) (-i));
                }
            } catch (IOException e2) {
                e = e2;
                j2 = 0;
                CacheErrorLogger cacheErrorLogger2 = this.f24659l;
                C9481a aVar2 = C9481a.EVICTION;
                Class<?> cls2 = f24645r;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("clearOldEntries: ");
                sb2.append(e.getMessage());
                cacheErrorLogger2.logError(aVar2, cls2, sb2.toString(), e);
                return j2;
            }
        }
        return j2;
    }

    public long getCount() {
        return this.f24661n.mo25583a();
    }

    public C9488a getDumpInfo() throws IOException {
        return this.f24657j.getDumpInfo();
    }

    public BinaryResource getResource(CacheKey cacheKey) {
        BinaryResource binaryResource;
        C9510f b = C9510f.m23216b();
        b.mo25594a(cacheKey);
        try {
            synchronized (this.f24663p) {
                List b2 = C9483a.m23133b(cacheKey);
                int i = 0;
                String str = null;
                binaryResource = null;
                while (true) {
                    if (i >= b2.size()) {
                        break;
                    }
                    str = (String) b2.get(i);
                    b.mo25596a(str);
                    binaryResource = this.f24657j.getResource(str, cacheKey);
                    if (binaryResource != null) {
                        break;
                    }
                    i++;
                }
                if (binaryResource == null) {
                    this.f24652e.onMiss(b);
                    this.f24653f.remove(str);
                } else {
                    this.f24652e.onHit(b);
                    this.f24653f.add(str);
                }
            }
            b.mo25597a();
            return binaryResource;
        } catch (IOException e) {
            try {
                this.f24659l.logError(C9481a.GENERIC_IO, f24645r, "getResource", e);
                b.mo25595a(e);
                this.f24652e.onReadException(b);
                return null;
            } finally {
                b.mo25597a();
            }
        }
    }

    public long getSize() {
        return this.f24661n.mo25585b();
    }

    public boolean hasKey(CacheKey cacheKey) {
        synchronized (this.f24663p) {
            if (hasKeySync(cacheKey)) {
                return true;
            }
            try {
                List b = C9483a.m23133b(cacheKey);
                for (int i = 0; i < b.size(); i++) {
                    String str = (String) b.get(i);
                    if (this.f24657j.contains(str, cacheKey)) {
                        this.f24653f.add(str);
                        return true;
                    }
                }
                return false;
            } catch (IOException unused) {
                return false;
            }
        }
    }

    public boolean hasKeySync(CacheKey cacheKey) {
        synchronized (this.f24663p) {
            List b = C9483a.m23133b(cacheKey);
            for (int i = 0; i < b.size(); i++) {
                if (this.f24653f.contains((String) b.get(i))) {
                    return true;
                }
            }
            return false;
        }
    }

    public BinaryResource insert(CacheKey cacheKey, WriterCallback writerCallback) throws IOException {
        String a;
        Inserter a2;
        C9510f b = C9510f.m23216b();
        b.mo25594a(cacheKey);
        this.f24652e.onWriteAttempt(b);
        synchronized (this.f24663p) {
            a = C9483a.m23132a(cacheKey);
        }
        b.mo25596a(a);
        try {
            a2 = m23193a(a, cacheKey);
            a2.writeData(writerCallback, cacheKey);
            BinaryResource a3 = m23192a(a2, cacheKey, a);
            b.mo25599c(a3.size());
            b.mo25598b(this.f24661n.mo25585b());
            this.f24652e.onWriteSuccess(b);
            if (!a2.cleanUp()) {
                C9543a.m23300a(f24645r, "Failed to delete temp file");
            }
            b.mo25597a();
            return a3;
        } catch (IOException e) {
            try {
                b.mo25595a(e);
                this.f24652e.onWriteException(b);
                C9543a.m23305a(f24645r, "Failed inserting a file into the cache", (Throwable) e);
                throw e;
            } catch (Throwable th) {
                b.mo25597a();
                throw th;
            }
        } catch (Throwable th2) {
            if (!a2.cleanUp()) {
                C9543a.m23300a(f24645r, "Failed to delete temp file");
            }
            throw th2;
        }
    }

    public boolean isEnabled() {
        return this.f24657j.isEnabled();
    }

    public boolean probe(CacheKey cacheKey) {
        String str;
        String str2 = null;
        try {
            synchronized (this.f24663p) {
                try {
                    List b = C9483a.m23133b(cacheKey);
                    String str3 = null;
                    int i = 0;
                    while (i < b.size()) {
                        try {
                            String str4 = (String) b.get(i);
                            try {
                                if (this.f24657j.touch(str4, cacheKey)) {
                                    this.f24653f.add(str4);
                                    return true;
                                }
                                i++;
                                str3 = str4;
                            } catch (Throwable th) {
                                th = th;
                                try {
                                    throw th;
                                } catch (IOException e) {
                                    e = e;
                                    str2 = str;
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            str = str3;
                            throw th;
                        }
                    }
                    return false;
                } catch (Throwable th3) {
                    str = null;
                    th = th3;
                    throw th;
                }
            }
        } catch (IOException e2) {
            e = e2;
            C9510f b2 = C9510f.m23216b();
            b2.mo25594a(cacheKey);
            b2.mo25596a(str2);
            b2.mo25595a(e);
            this.f24652e.onReadException(b2);
            b2.mo25597a();
            return false;
        }
    }

    public void remove(CacheKey cacheKey) {
        synchronized (this.f24663p) {
            try {
                List b = C9483a.m23133b(cacheKey);
                for (int i = 0; i < b.size(); i++) {
                    String str = (String) b.get(i);
                    this.f24657j.remove(str);
                    this.f24653f.remove(str);
                }
            } catch (IOException e) {
                CacheErrorLogger cacheErrorLogger = this.f24659l;
                C9481a aVar = C9481a.DELETE_FILE;
                Class<?> cls = f24645r;
                StringBuilder sb = new StringBuilder();
                sb.append("delete: ");
                sb.append(e.getMessage());
                cacheErrorLogger.logError(aVar, cls, sb.toString(), e);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0034, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0036, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void trimToMinimum() {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f24663p
            monitor-enter(r0)
            r8.m23200b()     // Catch:{ all -> 0x0037 }
            com.facebook.cache.disk.d$b r1 = r8.f24661n     // Catch:{ all -> 0x0037 }
            long r1 = r1.mo25585b()     // Catch:{ all -> 0x0037 }
            long r3 = r8.f24655h     // Catch:{ all -> 0x0037 }
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x0035
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x0035
            long r3 = r8.f24655h     // Catch:{ all -> 0x0037 }
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x001f
            goto L_0x0035
        L_0x001f:
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            long r5 = r8.f24655h     // Catch:{ all -> 0x0037 }
            double r5 = (double) r5     // Catch:{ all -> 0x0037 }
            double r1 = (double) r1     // Catch:{ all -> 0x0037 }
            double r5 = r5 / r1
            double r3 = r3 - r5
            r1 = 4581421828931458171(0x3f947ae147ae147b, double:0.02)
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 <= 0) goto L_0x0033
            r8.m23197a(r3)     // Catch:{ all -> 0x0037 }
        L_0x0033:
            monitor-exit(r0)     // Catch:{ all -> 0x0037 }
            return
        L_0x0035:
            monitor-exit(r0)     // Catch:{ all -> 0x0037 }
            return
        L_0x0037:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0037 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cache.disk.C9504d.trimToMinimum():void");
    }

    public void trimToNothing() {
        clearAll();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public boolean m23200b() {
        long now = this.f24662o.now();
        if (this.f24661n.mo25587c()) {
            long j = this.f24654g;
            if (j != -1 && now - j <= f24647t) {
                return false;
            }
        }
        return m23203c();
    }

    /* renamed from: c */
    private boolean m23203c() {
        long j;
        long now = this.f24662o.now();
        long j2 = f24646s + now;
        Set<String> set = (!this.f24660m || !this.f24653f.isEmpty()) ? this.f24660m ? new HashSet<>() : null : this.f24653f;
        try {
            long j3 = -1;
            int i = 0;
            int i2 = 0;
            long j4 = 0;
            boolean z = false;
            int i3 = 0;
            for (Entry entry : this.f24657j.getEntries()) {
                i3++;
                j4 += entry.getSize();
                if (entry.getTimestamp() > j2) {
                    i++;
                    j = j2;
                    int size = (int) (((long) i2) + entry.getSize());
                    j3 = Math.max(entry.getTimestamp() - now, j3);
                    i2 = size;
                    z = true;
                } else {
                    j = j2;
                    if (this.f24660m) {
                        set.add(entry.getId());
                    }
                }
                j2 = j;
            }
            if (z) {
                CacheErrorLogger cacheErrorLogger = this.f24659l;
                C9481a aVar = C9481a.READ_INVALID_ENTRY;
                Class<?> cls = f24645r;
                StringBuilder sb = new StringBuilder();
                sb.append("Future timestamp found in ");
                sb.append(i);
                sb.append(" files , with a total size of ");
                sb.append(i2);
                sb.append(" bytes, and a maximum time delta of ");
                sb.append(j3);
                sb.append("ms");
                cacheErrorLogger.logError(aVar, cls, sb.toString(), null);
            }
            long j5 = (long) i3;
            if (!(this.f24661n.mo25583a() == j5 && this.f24661n.mo25585b() == j4)) {
                if (this.f24660m && this.f24653f != set) {
                    this.f24653f.clear();
                    this.f24653f.addAll(set);
                }
                this.f24661n.mo25586b(j4, j5);
            }
            this.f24654g = now;
            return true;
        } catch (IOException e) {
            CacheErrorLogger cacheErrorLogger2 = this.f24659l;
            C9481a aVar2 = C9481a.GENERIC_IO;
            Class<?> cls2 = f24645r;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("calcFileCacheSize: ");
            sb2.append(e.getMessage());
            cacheErrorLogger2.logError(aVar2, cls2, sb2.toString(), e);
            return false;
        }
    }

    /* renamed from: a */
    private Inserter m23193a(String str, CacheKey cacheKey) throws IOException {
        m23196a();
        return this.f24657j.insert(str, cacheKey);
    }

    /* renamed from: a */
    private BinaryResource m23192a(Inserter inserter, CacheKey cacheKey, String str) throws IOException {
        BinaryResource commit;
        synchronized (this.f24663p) {
            commit = inserter.commit(cacheKey);
            this.f24653f.add(str);
            this.f24661n.mo25584a(commit.size(), 1);
        }
        return commit;
    }

    /* renamed from: a */
    private void m23196a() throws IOException {
        synchronized (this.f24663p) {
            boolean b = m23200b();
            m23204d();
            long b2 = this.f24661n.mo25585b();
            if (b2 > this.f24651d && !b) {
                this.f24661n.mo25588d();
                m23200b();
            }
            if (b2 > this.f24651d) {
                m23198a((this.f24651d * 9) / 10, C9482a.CACHE_FULL);
            }
        }
    }

    /* renamed from: a */
    private void m23198a(long j, C9482a aVar) throws IOException {
        long j2 = j;
        try {
            Collection<Entry> a = m23195a(this.f24657j.getEntries());
            long b = this.f24661n.mo25585b();
            long j3 = b - j2;
            int i = 0;
            long j4 = 0;
            for (Entry entry : a) {
                if (j4 > j3) {
                    break;
                }
                long remove = this.f24657j.remove(entry);
                this.f24653f.remove(entry.getId());
                if (remove > 0) {
                    i++;
                    j4 += remove;
                    C9510f b2 = C9510f.m23216b();
                    b2.mo25596a(entry.getId());
                    b2.mo25593a(aVar);
                    b2.mo25599c(remove);
                    b2.mo25598b(b - j4);
                    b2.mo25592a(j2);
                    this.f24652e.onEviction(b2);
                    b2.mo25597a();
                } else {
                    C9482a aVar2 = aVar;
                }
            }
            this.f24661n.mo25584a(-j4, (long) (-i));
            this.f24657j.purgeUnexpectedResources();
        } catch (IOException e) {
            CacheErrorLogger cacheErrorLogger = this.f24659l;
            C9481a aVar3 = C9481a.EVICTION;
            Class<?> cls = f24645r;
            StringBuilder sb = new StringBuilder();
            sb.append("evictAboveSize: ");
            sb.append(e.getMessage());
            cacheErrorLogger.logError(aVar3, cls, sb.toString(), e);
            throw e;
        }
    }

    /* renamed from: a */
    private Collection<Entry> m23195a(Collection<Entry> collection) {
        long now = this.f24662o.now() + f24646s;
        ArrayList arrayList = new ArrayList(collection.size());
        ArrayList arrayList2 = new ArrayList(collection.size());
        for (Entry entry : collection) {
            if (entry.getTimestamp() > now) {
                arrayList.add(entry);
            } else {
                arrayList2.add(entry);
            }
        }
        Collections.sort(arrayList2, this.f24658k.get());
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    /* renamed from: a */
    private void m23197a(double d) {
        synchronized (this.f24663p) {
            try {
                this.f24661n.mo25588d();
                m23200b();
                long b = this.f24661n.mo25585b();
                m23198a(b - ((long) (d * ((double) b))), C9482a.CACHE_MANAGER_TRIMMED);
            } catch (IOException e) {
                CacheErrorLogger cacheErrorLogger = this.f24659l;
                C9481a aVar = C9481a.EVICTION;
                Class<?> cls = f24645r;
                StringBuilder sb = new StringBuilder();
                sb.append("trimBy: ");
                sb.append(e.getMessage());
                cacheErrorLogger.logError(aVar, cls, sb.toString(), e);
            }
        }
    }
}
