package com.facebook.common.references;

import com.facebook.common.internal.C9536j;
import com.facebook.common.logging.C9543a;
import java.util.IdentityHashMap;
import java.util.Map;

public class SharedReference<T> {

    /* renamed from: d */
    private static final Map<Object, Integer> f24746d = new IdentityHashMap();

    /* renamed from: a */
    private T f24747a;

    /* renamed from: b */
    private int f24748b = 1;

    /* renamed from: c */
    private final ResourceReleaser<T> f24749c;

    public static class NullReferenceException extends RuntimeException {
        public NullReferenceException() {
            super("Null shared reference");
        }
    }

    public SharedReference(T t, ResourceReleaser<T> resourceReleaser) {
        C9536j.m23271a(t);
        this.f24747a = t;
        C9536j.m23271a(resourceReleaser);
        this.f24749c = resourceReleaser;
        m23363a((Object) t);
    }

    /* renamed from: a */
    private static void m23363a(Object obj) {
        synchronized (f24746d) {
            Integer num = (Integer) f24746d.get(obj);
            if (num == null) {
                f24746d.put(obj, Integer.valueOf(1));
            } else {
                f24746d.put(obj, Integer.valueOf(num.intValue() + 1));
            }
        }
    }

    /* renamed from: b */
    private static void m23365b(Object obj) {
        synchronized (f24746d) {
            Integer num = (Integer) f24746d.get(obj);
            if (num == null) {
                C9543a.m23325d("SharedReference", "No entry in sLiveObjects for value of type %s", obj.getClass());
            } else if (num.intValue() == 1) {
                f24746d.remove(obj);
            } else {
                f24746d.put(obj, Integer.valueOf(num.intValue() - 1));
            }
        }
    }

    /* renamed from: e */
    private synchronized int m23366e() {
        m23367f();
        C9536j.m23275a(this.f24748b > 0);
        this.f24748b--;
        return this.f24748b;
    }

    /* renamed from: f */
    private void m23367f() {
        if (!m23364a(this)) {
            throw new NullReferenceException();
        }
    }

    /* renamed from: c */
    public synchronized T mo25735c() {
        return this.f24747a;
    }

    /* renamed from: d */
    public synchronized boolean mo25736d() {
        return this.f24748b > 0;
    }

    /* renamed from: a */
    public static boolean m23364a(SharedReference<?> sharedReference) {
        return sharedReference != null && sharedReference.mo25736d();
    }

    /* renamed from: a */
    public synchronized void mo25733a() {
        m23367f();
        this.f24748b++;
    }

    /* renamed from: b */
    public void mo25734b() {
        T t;
        if (m23366e() == 0) {
            synchronized (this) {
                t = this.f24747a;
                this.f24747a = null;
            }
            this.f24749c.release(t);
            m23365b(t);
        }
    }
}
