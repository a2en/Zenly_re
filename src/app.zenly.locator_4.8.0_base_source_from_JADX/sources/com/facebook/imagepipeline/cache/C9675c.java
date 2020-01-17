package com.facebook.imagepipeline.cache;

import android.net.Uri;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.internal.C9532i;
import com.facebook.common.internal.C9536j;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.facebook.common.util.C9555a;
import com.facebook.imagepipeline.common.C9698b;
import com.facebook.imagepipeline.common.C9701e;
import com.facebook.imagepipeline.common.C9702f;

/* renamed from: com.facebook.imagepipeline.cache.c */
public class C9675c implements CacheKey {

    /* renamed from: a */
    private final String f25284a;

    /* renamed from: b */
    private final C9701e f25285b;

    /* renamed from: c */
    private final C9702f f25286c;

    /* renamed from: d */
    private final C9698b f25287d;

    /* renamed from: e */
    private final CacheKey f25288e;

    /* renamed from: f */
    private final String f25289f;

    /* renamed from: g */
    private final int f25290g;

    public C9675c(String str, C9701e eVar, C9702f fVar, C9698b bVar, CacheKey cacheKey, String str2, Object obj) {
        C9536j.m23271a(str);
        this.f25284a = str;
        this.f25285b = eVar;
        this.f25286c = fVar;
        this.f25287d = bVar;
        this.f25288e = cacheKey;
        this.f25289f = str2;
        Integer valueOf = Integer.valueOf(str.hashCode());
        if (eVar == null) {
            this.f25290g = C9555a.m23379a((Object) valueOf, (Object) Integer.valueOf(0), (Object) Integer.valueOf(fVar.hashCode()), (Object) this.f25287d, (Object) this.f25288e, (Object) str2);
            RealtimeSinceBootClock.get().now();
            return;
        }
        eVar.hashCode();
        throw null;
    }

    public boolean containsUri(Uri uri) {
        return getUriString().contains(uri.toString());
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (!(obj instanceof C9675c)) {
            return false;
        }
        C9675c cVar = (C9675c) obj;
        if (this.f25290g == cVar.f25290g && this.f25284a.equals(cVar.f25284a) && C9532i.m23264a(this.f25285b, cVar.f25285b) && C9532i.m23264a(this.f25286c, cVar.f25286c) && C9532i.m23264a(this.f25287d, cVar.f25287d) && C9532i.m23264a(this.f25288e, cVar.f25288e) && C9532i.m23264a(this.f25289f, cVar.f25289f)) {
            z = true;
        }
        return z;
    }

    public String getUriString() {
        return this.f25284a;
    }

    public int hashCode() {
        return this.f25290g;
    }

    public String toString() {
        return String.format(null, "%s_%s_%s_%s_%s_%s_%d", new Object[]{this.f25284a, this.f25285b, this.f25286c, this.f25287d, this.f25288e, this.f25289f, Integer.valueOf(this.f25290g)});
    }
}
