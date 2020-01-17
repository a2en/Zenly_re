package com.bumptech.glide.load;

import com.bumptech.glide.p301o.C9216j;
import java.security.MessageDigest;

public final class Option<T> {

    /* renamed from: e */
    private static final CacheKeyUpdater<Object> f23164e = new C8881a();

    /* renamed from: a */
    private final T f23165a;

    /* renamed from: b */
    private final CacheKeyUpdater<T> f23166b;

    /* renamed from: c */
    private final String f23167c;

    /* renamed from: d */
    private volatile byte[] f23168d;

    public interface CacheKeyUpdater<T> {
        void update(byte[] bArr, T t, MessageDigest messageDigest);
    }

    /* renamed from: com.bumptech.glide.load.Option$a */
    class C8881a implements CacheKeyUpdater<Object> {
        C8881a() {
        }

        public void update(byte[] bArr, Object obj, MessageDigest messageDigest) {
        }
    }

    private Option(String str, T t, CacheKeyUpdater<T> cacheKeyUpdater) {
        C9216j.m22085a(str);
        this.f23167c = str;
        this.f23165a = t;
        C9216j.m22083a(cacheKeyUpdater);
        this.f23166b = cacheKeyUpdater;
    }

    /* renamed from: a */
    public static <T> Option<T> m21320a(String str) {
        return new Option<>(str, null, m21323b());
    }

    /* renamed from: b */
    private static <T> CacheKeyUpdater<T> m21323b() {
        return f23164e;
    }

    /* renamed from: c */
    private byte[] m21324c() {
        if (this.f23168d == null) {
            this.f23168d = this.f23167c.getBytes(Key.f23163a);
        }
        return this.f23168d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Option)) {
            return false;
        }
        return this.f23167c.equals(((Option) obj).f23167c);
    }

    public int hashCode() {
        return this.f23167c.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Option{key='");
        sb.append(this.f23167c);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    public static <T> Option<T> m21321a(String str, T t) {
        return new Option<>(str, t, m21323b());
    }

    /* renamed from: a */
    public static <T> Option<T> m21322a(String str, T t, CacheKeyUpdater<T> cacheKeyUpdater) {
        return new Option<>(str, t, cacheKeyUpdater);
    }

    /* renamed from: a */
    public T mo24223a() {
        return this.f23165a;
    }

    /* renamed from: a */
    public void mo24224a(T t, MessageDigest messageDigest) {
        this.f23166b.update(m21324c(), t, messageDigest);
    }
}
