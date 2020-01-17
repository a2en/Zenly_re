package com.facebook.common.references;

import com.facebook.common.internal.C9525b;
import com.facebook.common.internal.C9536j;
import com.facebook.common.logging.C9543a;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class CloseableReference<T> implements Cloneable, Closeable {
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static Class<CloseableReference> f24739i = CloseableReference.class;

    /* renamed from: j */
    private static final ResourceReleaser<Closeable> f24740j = new C9551a();

    /* renamed from: k */
    private static final LeakHandler f24741k = new C9552b();

    /* renamed from: e */
    private boolean f24742e = false;

    /* renamed from: f */
    private final SharedReference<T> f24743f;

    /* renamed from: g */
    private final LeakHandler f24744g;

    /* renamed from: h */
    private final Throwable f24745h;

    public interface LeakHandler {
        void reportLeak(SharedReference<Object> sharedReference, Throwable th);

        boolean requiresStacktrace();
    }

    /* renamed from: com.facebook.common.references.CloseableReference$a */
    static class C9551a implements ResourceReleaser<Closeable> {
        C9551a() {
        }

        /* renamed from: a */
        public void release(Closeable closeable) {
            try {
                C9525b.m23252a(closeable, true);
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: com.facebook.common.references.CloseableReference$b */
    static class C9552b implements LeakHandler {
        C9552b() {
        }

        public void reportLeak(SharedReference<Object> sharedReference, Throwable th) {
            C9543a.m23322c(CloseableReference.f24739i, "Finalized without closing: %x %x (type = %s)", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(sharedReference)), sharedReference.mo25735c().getClass().getName());
        }

        public boolean requiresStacktrace() {
            return false;
        }
    }

    private CloseableReference(SharedReference<T> sharedReference, LeakHandler leakHandler, Throwable th) {
        C9536j.m23271a(sharedReference);
        this.f24743f = sharedReference;
        sharedReference.mo25733a();
        this.f24744g = leakHandler;
        this.f24745h = th;
    }

    /* renamed from: a */
    public static <T extends Closeable> CloseableReference<T> m23349a(T t) {
        return m23351a(t, f24740j);
    }

    /* renamed from: b */
    public synchronized T mo25724b() {
        C9536j.m23279b(!this.f24742e);
        return this.f24743f.mo25735c();
    }

    /* renamed from: c */
    public int mo25725c() {
        if (mo25728d()) {
            return System.identityHashCode(this.f24743f.mo25735c());
        }
        return 0;
    }

    public void close() {
        synchronized (this) {
            if (!this.f24742e) {
                this.f24742e = true;
                this.f24743f.mo25734b();
            }
        }
    }

    /* renamed from: d */
    public synchronized boolean mo25728d() {
        return !this.f24742e;
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        try {
            synchronized (this) {
                if (this.f24742e) {
                    super.finalize();
                    return;
                }
                this.f24744g.reportLeak(this.f24743f, this.f24745h);
                close();
                super.finalize();
            }
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }

    /* renamed from: a */
    public static <T extends Closeable> CloseableReference<T> m23350a(T t, LeakHandler leakHandler) {
        Throwable th = null;
        if (t == null) {
            return null;
        }
        ResourceReleaser<Closeable> resourceReleaser = f24740j;
        if (leakHandler.requiresStacktrace()) {
            th = new Throwable();
        }
        return new CloseableReference<>(t, resourceReleaser, leakHandler, th);
    }

    /* renamed from: c */
    public static boolean m23356c(CloseableReference<?> closeableReference) {
        return closeableReference != null && closeableReference.mo25728d();
    }

    public synchronized CloseableReference<T> clone() {
        C9536j.m23279b(mo25728d());
        return new CloseableReference<>(this.f24743f, this.f24744g, this.f24745h);
    }

    /* renamed from: b */
    public static void m23355b(CloseableReference<?> closeableReference) {
        if (closeableReference != null) {
            closeableReference.close();
        }
    }

    /* renamed from: a */
    public static <T> CloseableReference<T> m23351a(T t, ResourceReleaser<T> resourceReleaser) {
        return m23352a(t, resourceReleaser, f24741k);
    }

    /* renamed from: a */
    public static <T> CloseableReference<T> m23352a(T t, ResourceReleaser<T> resourceReleaser, LeakHandler leakHandler) {
        Throwable th = null;
        if (t == null) {
            return null;
        }
        if (leakHandler.requiresStacktrace()) {
            th = new Throwable();
        }
        return new CloseableReference<>(t, resourceReleaser, leakHandler, th);
    }

    private CloseableReference(T t, ResourceReleaser<T> resourceReleaser, LeakHandler leakHandler, Throwable th) {
        this.f24743f = new SharedReference<>(t, resourceReleaser);
        this.f24744g = leakHandler;
        this.f24745h = th;
    }

    /* renamed from: a */
    public synchronized CloseableReference<T> mo25723a() {
        if (!mo25728d()) {
            return null;
        }
        return clone();
    }

    /* renamed from: a */
    public static <T> CloseableReference<T> m23348a(CloseableReference<T> closeableReference) {
        if (closeableReference != null) {
            return closeableReference.mo25723a();
        }
        return null;
    }

    /* renamed from: a */
    public static <T> List<CloseableReference<T>> m23353a(Collection<CloseableReference<T>> collection) {
        if (collection == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(collection.size());
        for (CloseableReference a : collection) {
            arrayList.add(m23348a(a));
        }
        return arrayList;
    }

    /* renamed from: a */
    public static void m23354a(Iterable<? extends CloseableReference<?>> iterable) {
        if (iterable != null) {
            for (CloseableReference b : iterable) {
                m23355b(b);
            }
        }
    }
}
