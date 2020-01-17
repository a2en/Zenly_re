package com.mapbox.mapboxsdk.style.sources;

import androidx.annotation.Keep;
import com.mapbox.geojson.Feature;
import com.mapbox.geojson.FeatureCollection;
import com.mapbox.mapboxsdk.geometry.LatLngBounds;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;

public class CustomGeometrySource extends Source {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final AtomicInteger f30061f = new AtomicInteger();

    /* renamed from: a */
    private final Lock f30062a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public ThreadPoolExecutor f30063b;

    /* renamed from: c */
    private GeometryTileProvider f30064c;

    /* renamed from: d */
    private final Map<C11592c, C11591b> f30065d;

    /* renamed from: e */
    private final Map<C11592c, AtomicBoolean> f30066e;

    /* renamed from: com.mapbox.mapboxsdk.style.sources.CustomGeometrySource$a */
    class C11590a implements ThreadFactory {

        /* renamed from: e */
        final AtomicInteger f30067e = new AtomicInteger();

        /* renamed from: f */
        final int f30068f = CustomGeometrySource.f30061f.getAndIncrement();

        C11590a(CustomGeometrySource customGeometrySource) {
        }

        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format(Locale.US, "%s-%d-%d", new Object[]{"CustomGeom", Integer.valueOf(this.f30068f), Integer.valueOf(this.f30067e.getAndIncrement())}));
        }
    }

    /* renamed from: com.mapbox.mapboxsdk.style.sources.CustomGeometrySource$b */
    static class C11591b implements Runnable {

        /* renamed from: e */
        private final C11592c f30069e;

        /* renamed from: f */
        private final GeometryTileProvider f30070f;

        /* renamed from: g */
        private final Map<C11592c, C11591b> f30071g;

        /* renamed from: h */
        private final Map<C11592c, AtomicBoolean> f30072h;

        /* renamed from: i */
        private final WeakReference<CustomGeometrySource> f30073i;

        /* renamed from: j */
        private final AtomicBoolean f30074j;

        C11591b(C11592c cVar, GeometryTileProvider geometryTileProvider, Map<C11592c, C11591b> map, Map<C11592c, AtomicBoolean> map2, CustomGeometrySource customGeometrySource, AtomicBoolean atomicBoolean) {
            this.f30069e = cVar;
            this.f30070f = geometryTileProvider;
            this.f30071g = map;
            this.f30072h = map2;
            this.f30073i = new WeakReference<>(customGeometrySource);
            this.f30074j = atomicBoolean;
        }

        /* renamed from: a */
        private Boolean m30364a() {
            return Boolean.valueOf(this.f30074j.get());
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C11591b.class != obj.getClass()) {
                return false;
            }
            return this.f30069e.equals(((C11591b) obj).f30069e);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0023, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0037, code lost:
            if (m30364a().booleanValue() != false) goto L_0x006a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0039, code lost:
            r0 = r5.f30070f;
            r1 = r5.f30069e;
            r0 = r0.getFeaturesForBounds(com.mapbox.mapboxsdk.geometry.LatLngBounds.m29579a(r1.f30075a, r1.f30076b, r1.f30077c), r5.f30069e.f30075a);
            r1 = (com.mapbox.mapboxsdk.style.sources.CustomGeometrySource) r5.f30073i.get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x005f, code lost:
            if (m30364a().booleanValue() != false) goto L_0x006a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0061, code lost:
            if (r1 == null) goto L_0x006a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0063, code lost:
            if (r0 == null) goto L_0x006a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0065, code lost:
            com.mapbox.mapboxsdk.style.sources.CustomGeometrySource.m30363a(r1, r5.f30069e, r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x006a, code lost:
            r1 = r5.f30071g;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x006c, code lost:
            monitor-enter(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
            r0 = r5.f30072h;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x006f, code lost:
            monitor-enter(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
            r5.f30072h.remove(r5.f30069e);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x007f, code lost:
            if (r5.f30071g.containsKey(r5.f30069e) == false) goto L_0x00a5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x0081, code lost:
            r2 = (com.mapbox.mapboxsdk.style.sources.CustomGeometrySource.C11591b) r5.f30071g.get(r5.f30069e);
            r3 = (com.mapbox.mapboxsdk.style.sources.CustomGeometrySource) r5.f30073i.get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x0093, code lost:
            if (r3 == null) goto L_0x009e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x0095, code lost:
            if (r2 == null) goto L_0x009e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x0097, code lost:
            com.mapbox.mapboxsdk.style.sources.CustomGeometrySource.m30359a(r3).execute(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x009e, code lost:
            r5.f30071g.remove(r5.f30069e);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a5, code lost:
            monitor-exit(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
            monitor-exit(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a7, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r5 = this;
                java.util.Map<com.mapbox.mapboxsdk.style.sources.CustomGeometrySource$c, com.mapbox.mapboxsdk.style.sources.CustomGeometrySource$b> r0 = r5.f30071g
                monitor-enter(r0)
                java.util.Map<com.mapbox.mapboxsdk.style.sources.CustomGeometrySource$c, java.util.concurrent.atomic.AtomicBoolean> r1 = r5.f30072h     // Catch:{ all -> 0x00b1 }
                monitor-enter(r1)     // Catch:{ all -> 0x00b1 }
                java.util.Map<com.mapbox.mapboxsdk.style.sources.CustomGeometrySource$c, java.util.concurrent.atomic.AtomicBoolean> r2 = r5.f30072h     // Catch:{ all -> 0x00ae }
                com.mapbox.mapboxsdk.style.sources.CustomGeometrySource$c r3 = r5.f30069e     // Catch:{ all -> 0x00ae }
                boolean r2 = r2.containsKey(r3)     // Catch:{ all -> 0x00ae }
                if (r2 == 0) goto L_0x0024
                java.util.Map<com.mapbox.mapboxsdk.style.sources.CustomGeometrySource$c, com.mapbox.mapboxsdk.style.sources.CustomGeometrySource$b> r2 = r5.f30071g     // Catch:{ all -> 0x00ae }
                com.mapbox.mapboxsdk.style.sources.CustomGeometrySource$c r3 = r5.f30069e     // Catch:{ all -> 0x00ae }
                boolean r2 = r2.containsKey(r3)     // Catch:{ all -> 0x00ae }
                if (r2 != 0) goto L_0x0021
                java.util.Map<com.mapbox.mapboxsdk.style.sources.CustomGeometrySource$c, com.mapbox.mapboxsdk.style.sources.CustomGeometrySource$b> r2 = r5.f30071g     // Catch:{ all -> 0x00ae }
                com.mapbox.mapboxsdk.style.sources.CustomGeometrySource$c r3 = r5.f30069e     // Catch:{ all -> 0x00ae }
                r2.put(r3, r5)     // Catch:{ all -> 0x00ae }
            L_0x0021:
                monitor-exit(r1)     // Catch:{ all -> 0x00ae }
                monitor-exit(r0)     // Catch:{ all -> 0x00b1 }
                return
            L_0x0024:
                java.util.Map<com.mapbox.mapboxsdk.style.sources.CustomGeometrySource$c, java.util.concurrent.atomic.AtomicBoolean> r2 = r5.f30072h     // Catch:{ all -> 0x00ae }
                com.mapbox.mapboxsdk.style.sources.CustomGeometrySource$c r3 = r5.f30069e     // Catch:{ all -> 0x00ae }
                java.util.concurrent.atomic.AtomicBoolean r4 = r5.f30074j     // Catch:{ all -> 0x00ae }
                r2.put(r3, r4)     // Catch:{ all -> 0x00ae }
                monitor-exit(r1)     // Catch:{ all -> 0x00ae }
                monitor-exit(r0)     // Catch:{ all -> 0x00b1 }
                java.lang.Boolean r0 = r5.m30364a()
                boolean r0 = r0.booleanValue()
                if (r0 != 0) goto L_0x006a
                com.mapbox.mapboxsdk.style.sources.GeometryTileProvider r0 = r5.f30070f
                com.mapbox.mapboxsdk.style.sources.CustomGeometrySource$c r1 = r5.f30069e
                int r2 = r1.f30075a
                int r3 = r1.f30076b
                int r1 = r1.f30077c
                com.mapbox.mapboxsdk.geometry.LatLngBounds r1 = com.mapbox.mapboxsdk.geometry.LatLngBounds.m29579a(r2, r3, r1)
                com.mapbox.mapboxsdk.style.sources.CustomGeometrySource$c r2 = r5.f30069e
                int r2 = r2.f30075a
                com.mapbox.geojson.FeatureCollection r0 = r0.getFeaturesForBounds(r1, r2)
                java.lang.ref.WeakReference<com.mapbox.mapboxsdk.style.sources.CustomGeometrySource> r1 = r5.f30073i
                java.lang.Object r1 = r1.get()
                com.mapbox.mapboxsdk.style.sources.CustomGeometrySource r1 = (com.mapbox.mapboxsdk.style.sources.CustomGeometrySource) r1
                java.lang.Boolean r2 = r5.m30364a()
                boolean r2 = r2.booleanValue()
                if (r2 != 0) goto L_0x006a
                if (r1 == 0) goto L_0x006a
                if (r0 == 0) goto L_0x006a
                com.mapbox.mapboxsdk.style.sources.CustomGeometrySource$c r2 = r5.f30069e
                r1.m30362a(r2, r0)
            L_0x006a:
                java.util.Map<com.mapbox.mapboxsdk.style.sources.CustomGeometrySource$c, com.mapbox.mapboxsdk.style.sources.CustomGeometrySource$b> r1 = r5.f30071g
                monitor-enter(r1)
                java.util.Map<com.mapbox.mapboxsdk.style.sources.CustomGeometrySource$c, java.util.concurrent.atomic.AtomicBoolean> r0 = r5.f30072h     // Catch:{ all -> 0x00ab }
                monitor-enter(r0)     // Catch:{ all -> 0x00ab }
                java.util.Map<com.mapbox.mapboxsdk.style.sources.CustomGeometrySource$c, java.util.concurrent.atomic.AtomicBoolean> r2 = r5.f30072h     // Catch:{ all -> 0x00a8 }
                com.mapbox.mapboxsdk.style.sources.CustomGeometrySource$c r3 = r5.f30069e     // Catch:{ all -> 0x00a8 }
                r2.remove(r3)     // Catch:{ all -> 0x00a8 }
                java.util.Map<com.mapbox.mapboxsdk.style.sources.CustomGeometrySource$c, com.mapbox.mapboxsdk.style.sources.CustomGeometrySource$b> r2 = r5.f30071g     // Catch:{ all -> 0x00a8 }
                com.mapbox.mapboxsdk.style.sources.CustomGeometrySource$c r3 = r5.f30069e     // Catch:{ all -> 0x00a8 }
                boolean r2 = r2.containsKey(r3)     // Catch:{ all -> 0x00a8 }
                if (r2 == 0) goto L_0x00a5
                java.util.Map<com.mapbox.mapboxsdk.style.sources.CustomGeometrySource$c, com.mapbox.mapboxsdk.style.sources.CustomGeometrySource$b> r2 = r5.f30071g     // Catch:{ all -> 0x00a8 }
                com.mapbox.mapboxsdk.style.sources.CustomGeometrySource$c r3 = r5.f30069e     // Catch:{ all -> 0x00a8 }
                java.lang.Object r2 = r2.get(r3)     // Catch:{ all -> 0x00a8 }
                com.mapbox.mapboxsdk.style.sources.CustomGeometrySource$b r2 = (com.mapbox.mapboxsdk.style.sources.CustomGeometrySource.C11591b) r2     // Catch:{ all -> 0x00a8 }
                java.lang.ref.WeakReference<com.mapbox.mapboxsdk.style.sources.CustomGeometrySource> r3 = r5.f30073i     // Catch:{ all -> 0x00a8 }
                java.lang.Object r3 = r3.get()     // Catch:{ all -> 0x00a8 }
                com.mapbox.mapboxsdk.style.sources.CustomGeometrySource r3 = (com.mapbox.mapboxsdk.style.sources.CustomGeometrySource) r3     // Catch:{ all -> 0x00a8 }
                if (r3 == 0) goto L_0x009e
                if (r2 == 0) goto L_0x009e
                java.util.concurrent.ThreadPoolExecutor r3 = r3.f30063b     // Catch:{ all -> 0x00a8 }
                r3.execute(r2)     // Catch:{ all -> 0x00a8 }
            L_0x009e:
                java.util.Map<com.mapbox.mapboxsdk.style.sources.CustomGeometrySource$c, com.mapbox.mapboxsdk.style.sources.CustomGeometrySource$b> r2 = r5.f30071g     // Catch:{ all -> 0x00a8 }
                com.mapbox.mapboxsdk.style.sources.CustomGeometrySource$c r3 = r5.f30069e     // Catch:{ all -> 0x00a8 }
                r2.remove(r3)     // Catch:{ all -> 0x00a8 }
            L_0x00a5:
                monitor-exit(r0)     // Catch:{ all -> 0x00a8 }
                monitor-exit(r1)     // Catch:{ all -> 0x00ab }
                return
            L_0x00a8:
                r2 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x00a8 }
                throw r2     // Catch:{ all -> 0x00ab }
            L_0x00ab:
                r0 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x00ab }
                throw r0
            L_0x00ae:
                r2 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x00ae }
                throw r2     // Catch:{ all -> 0x00b1 }
            L_0x00b1:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x00b1 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mapbox.mapboxsdk.style.sources.CustomGeometrySource.C11591b.run():void");
        }
    }

    /* renamed from: com.mapbox.mapboxsdk.style.sources.CustomGeometrySource$c */
    static class C11592c {

        /* renamed from: a */
        public int f30075a;

        /* renamed from: b */
        public int f30076b;

        /* renamed from: c */
        public int f30077c;

        C11592c(int i, int i2, int i3) {
            this.f30075a = i;
            this.f30076b = i2;
            this.f30077c = i3;
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (obj == this) {
                return true;
            }
            if (obj == null || C11592c.class != obj.getClass() || !(obj instanceof C11592c)) {
                return false;
            }
            C11592c cVar = (C11592c) obj;
            if (!(this.f30075a == cVar.f30075a && this.f30076b == cVar.f30076b && this.f30077c == cVar.f30077c)) {
                z = false;
            }
            return z;
        }

        public int hashCode() {
            return Arrays.hashCode(new int[]{this.f30075a, this.f30076b, this.f30077c});
        }
    }

    @Keep
    private void cancelTile(int i, int i2, int i3) {
        C11592c cVar = new C11592c(i, i2, i3);
        synchronized (this.f30065d) {
            synchronized (this.f30066e) {
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f30066e.get(cVar);
                if (atomicBoolean == null || !atomicBoolean.compareAndSet(false, true)) {
                    C11591b bVar = new C11591b(cVar, null, null, null, null, null);
                    if (!this.f30063b.getQueue().remove(bVar)) {
                        this.f30065d.remove(cVar);
                    }
                }
            }
        }
    }

    @Keep
    private void fetchTile(int i, int i2, int i3) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        C11592c cVar = new C11592c(i, i2, i3);
        C11591b bVar = new C11591b(cVar, this.f30064c, this.f30065d, this.f30066e, this, atomicBoolean);
        synchronized (this.f30065d) {
            synchronized (this.f30066e) {
                if (this.f30063b.getQueue().contains(bVar)) {
                    this.f30063b.remove(bVar);
                    m30361a(bVar);
                } else if (this.f30066e.containsKey(cVar)) {
                    this.f30065d.put(cVar, bVar);
                } else {
                    m30361a(bVar);
                }
            }
        }
    }

    @Keep
    private boolean isCancelled(int i, int i2, int i3) {
        return ((AtomicBoolean) this.f30066e.get(new C11592c(i, i2, i3))).get();
    }

    @Keep
    private native void nativeInvalidateBounds(LatLngBounds latLngBounds);

    @Keep
    private native void nativeInvalidateTile(int i, int i2, int i3);

    @Keep
    private native void nativeSetTileData(int i, int i2, int i3, FeatureCollection featureCollection);

    @Keep
    private native Feature[] querySourceFeatures(Object[] objArr);

    @Keep
    private void releaseThreads() {
        this.f30062a.lock();
        try {
            this.f30063b.shutdownNow();
        } finally {
            this.f30062a.unlock();
        }
    }

    @Keep
    private void startThreads() {
        this.f30062a.lock();
        try {
            if (this.f30063b != null && !this.f30063b.isShutdown()) {
                this.f30063b.shutdownNow();
            }
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(4, 4, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new C11590a(this));
            this.f30063b = threadPoolExecutor;
        } finally {
            this.f30062a.unlock();
        }
    }

    /* access modifiers changed from: protected */
    @Keep
    public native void finalize() throws Throwable;

    /* access modifiers changed from: protected */
    @Keep
    public native void initialize(String str, Object obj);

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m30362a(C11592c cVar, FeatureCollection featureCollection) {
        nativeSetTileData(cVar.f30075a, cVar.f30076b, cVar.f30077c, featureCollection);
    }

    /* renamed from: a */
    private void m30361a(C11591b bVar) {
        this.f30062a.lock();
        try {
            if (this.f30063b != null && !this.f30063b.isShutdown()) {
                this.f30063b.execute(bVar);
            }
        } finally {
            this.f30062a.unlock();
        }
    }
}
