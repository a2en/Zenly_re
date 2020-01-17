package com.bumptech.glide.load;

import com.bumptech.glide.p301o.C9206b;
import java.security.MessageDigest;
import p214e.p228e.C7571a;
import p214e.p228e.C7584g;

/* renamed from: com.bumptech.glide.load.f */
public final class C9011f implements Key {

    /* renamed from: b */
    private final C7571a<Option<?>, Object> f23540b = new C9206b();

    /* renamed from: a */
    public void mo24518a(C9011f fVar) {
        this.f23540b.mo19593a((C7584g<? extends K, ? extends V>) fVar.f23540b);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C9011f)) {
            return false;
        }
        return this.f23540b.equals(((C9011f) obj).f23540b);
    }

    public int hashCode() {
        return this.f23540b.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Options{values=");
        sb.append(this.f23540b);
        sb.append('}');
        return sb.toString();
    }

    public void updateDiskCacheKey(MessageDigest messageDigest) {
        for (int i = 0; i < this.f23540b.size(); i++) {
            m21672a((Option) this.f23540b.mo19595b(i), this.f23540b.mo19601d(i), messageDigest);
        }
    }

    /* renamed from: a */
    public <T> C9011f mo24516a(Option<T> option, T t) {
        this.f23540b.put(option, t);
        return this;
    }

    /* renamed from: a */
    public <T> T mo24517a(Option<T> option) {
        return this.f23540b.containsKey(option) ? this.f23540b.get(option) : option.mo24223a();
    }

    /* renamed from: a */
    private static <T> void m21672a(Option<T> option, Object obj, MessageDigest messageDigest) {
        option.mo24224a(obj, messageDigest);
    }
}
