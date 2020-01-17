package com.facebook.cache.common;

import android.net.Uri;
import java.util.List;

/* renamed from: com.facebook.cache.common.b */
public class C9484b implements CacheKey {

    /* renamed from: a */
    final List<CacheKey> f24593a;

    /* renamed from: a */
    public List<CacheKey> mo25522a() {
        return this.f24593a;
    }

    public boolean containsUri(Uri uri) {
        for (int i = 0; i < this.f24593a.size(); i++) {
            if (((CacheKey) this.f24593a.get(i)).containsUri(uri)) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C9484b)) {
            return false;
        }
        return this.f24593a.equals(((C9484b) obj).f24593a);
    }

    public String getUriString() {
        return ((CacheKey) this.f24593a.get(0)).getUriString();
    }

    public int hashCode() {
        return this.f24593a.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MultiCacheKey:");
        sb.append(this.f24593a.toString());
        return sb.toString();
    }
}
