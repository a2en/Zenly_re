package com.facebook.cache.common;

import android.net.Uri;
import com.facebook.common.internal.C9536j;

/* renamed from: com.facebook.cache.common.e */
public class C9487e implements CacheKey {

    /* renamed from: a */
    final String f24596a;

    public C9487e(String str) {
        C9536j.m23271a(str);
        this.f24596a = str;
    }

    public boolean containsUri(Uri uri) {
        return this.f24596a.contains(uri.toString());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C9487e)) {
            return false;
        }
        return this.f24596a.equals(((C9487e) obj).f24596a);
    }

    public String getUriString() {
        return this.f24596a;
    }

    public int hashCode() {
        return this.f24596a.hashCode();
    }

    public String toString() {
        return this.f24596a;
    }
}
