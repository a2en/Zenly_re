package com.facebook.imagepipeline.request;

import android.net.Uri;
import androidx.recyclerview.widget.RecyclerView.ItemAnimator;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.internal.C9532i;
import com.facebook.common.internal.C9532i.C9534b;
import com.facebook.common.util.C9559e;
import com.facebook.imagepipeline.common.C9697a;
import com.facebook.imagepipeline.common.C9698b;
import com.facebook.imagepipeline.common.C9700d;
import com.facebook.imagepipeline.common.C9701e;
import com.facebook.imagepipeline.common.C9702f;
import com.facebook.imagepipeline.listener.RequestListener;
import java.io.File;
import p333g.p339c.p340a.p341a.C12025a;

/* renamed from: com.facebook.imagepipeline.request.a */
public class C9884a {

    /* renamed from: a */
    private final C9885a f25966a;

    /* renamed from: b */
    private final Uri f25967b;

    /* renamed from: c */
    private final int f25968c = m24679b(this.f25967b);

    /* renamed from: d */
    private File f25969d;

    /* renamed from: e */
    private final boolean f25970e;

    /* renamed from: f */
    private final boolean f25971f;

    /* renamed from: g */
    private final C9698b f25972g;

    /* renamed from: h */
    private final C9701e f25973h;

    /* renamed from: i */
    private final C9702f f25974i;

    /* renamed from: j */
    private final C9697a f25975j;

    /* renamed from: k */
    private final C9700d f25976k;

    /* renamed from: l */
    private final C9886b f25977l;

    /* renamed from: m */
    private final boolean f25978m;

    /* renamed from: n */
    private final boolean f25979n;

    /* renamed from: o */
    private final Boolean f25980o;

    /* renamed from: p */
    private final Postprocessor f25981p;

    /* renamed from: q */
    private final RequestListener f25982q;

    /* renamed from: r */
    private final Boolean f25983r;

    /* renamed from: com.facebook.imagepipeline.request.a$a */
    public enum C9885a {
        SMALL,
        DEFAULT
    }

    /* renamed from: com.facebook.imagepipeline.request.a$b */
    public enum C9886b {
        FULL_FETCH(1),
        DISK_CACHE(2),
        ENCODED_MEMORY_CACHE(3),
        BITMAP_MEMORY_CACHE(4);
        

        /* renamed from: e */
        private int f25992e;

        private C9886b(int i) {
            this.f25992e = i;
        }

        /* renamed from: a */
        public int mo26749a() {
            return this.f25992e;
        }

        /* renamed from: a */
        public static C9886b m24700a(C9886b bVar, C9886b bVar2) {
            return bVar.mo26749a() > bVar2.mo26749a() ? bVar : bVar2;
        }
    }

    protected C9884a(ImageRequestBuilder imageRequestBuilder) {
        this.f25966a = imageRequestBuilder.mo26706c();
        this.f25967b = imageRequestBuilder.mo26715l();
        this.f25970e = imageRequestBuilder.mo26719p();
        this.f25971f = imageRequestBuilder.mo26717n();
        this.f25972g = imageRequestBuilder.mo26707d();
        this.f25973h = imageRequestBuilder.mo26712i();
        this.f25974i = imageRequestBuilder.mo26714k() == null ? C9702f.m23854e() : imageRequestBuilder.mo26714k();
        this.f25975j = imageRequestBuilder.mo26704b();
        this.f25976k = imageRequestBuilder.mo26711h();
        this.f25977l = imageRequestBuilder.mo26708e();
        this.f25978m = imageRequestBuilder.mo26716m();
        this.f25979n = imageRequestBuilder.mo26718o();
        this.f25980o = imageRequestBuilder.mo26720q();
        this.f25981p = imageRequestBuilder.mo26709f();
        this.f25982q = imageRequestBuilder.mo26710g();
        this.f25983r = imageRequestBuilder.mo26713j();
    }

    /* renamed from: a */
    public static C9884a m24677a(Uri uri) {
        if (uri == null) {
            return null;
        }
        return ImageRequestBuilder.m24645b(uri).mo26703a();
    }

    /* renamed from: b */
    public C9885a mo26727b() {
        return this.f25966a;
    }

    /* renamed from: c */
    public C9698b mo26728c() {
        return this.f25972g;
    }

    /* renamed from: d */
    public boolean mo26729d() {
        return this.f25971f;
    }

    /* renamed from: e */
    public C9886b mo26730e() {
        return this.f25977l;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C9884a)) {
            return false;
        }
        C9884a aVar = (C9884a) obj;
        if (!C9532i.m23264a(this.f25967b, aVar.f25967b) || !C9532i.m23264a(this.f25966a, aVar.f25966a) || !C9532i.m23264a(this.f25969d, aVar.f25969d) || !C9532i.m23264a(this.f25975j, aVar.f25975j) || !C9532i.m23264a(this.f25972g, aVar.f25972g) || !C9532i.m23264a(this.f25973h, aVar.f25973h) || !C9532i.m23264a(this.f25974i, aVar.f25974i)) {
            return false;
        }
        Postprocessor postprocessor = this.f25981p;
        CacheKey cacheKey = null;
        Object postprocessorCacheKey = postprocessor != null ? postprocessor.getPostprocessorCacheKey() : null;
        Postprocessor postprocessor2 = aVar.f25981p;
        if (postprocessor2 != null) {
            cacheKey = postprocessor2.getPostprocessorCacheKey();
        }
        return C9532i.m23264a(postprocessorCacheKey, cacheKey);
    }

    /* renamed from: f */
    public Postprocessor mo26732f() {
        return this.f25981p;
    }

    /* renamed from: g */
    public int mo26733g() {
        C9701e eVar = this.f25973h;
        return eVar != null ? eVar.f25356b : ItemAnimator.FLAG_MOVED;
    }

    /* renamed from: h */
    public int mo26734h() {
        C9701e eVar = this.f25973h;
        return eVar != null ? eVar.f25355a : ItemAnimator.FLAG_MOVED;
    }

    public int hashCode() {
        Postprocessor postprocessor = this.f25981p;
        return C9532i.m23261a(this.f25966a, this.f25967b, this.f25969d, this.f25975j, this.f25972g, this.f25973h, this.f25974i, postprocessor != null ? postprocessor.getPostprocessorCacheKey() : null, this.f25983r);
    }

    /* renamed from: i */
    public C9700d mo26736i() {
        return this.f25976k;
    }

    /* renamed from: j */
    public boolean mo26737j() {
        return this.f25970e;
    }

    /* renamed from: k */
    public RequestListener mo26738k() {
        return this.f25982q;
    }

    /* renamed from: l */
    public C9701e mo26739l() {
        return this.f25973h;
    }

    /* renamed from: m */
    public Boolean mo26740m() {
        return this.f25983r;
    }

    /* renamed from: n */
    public C9702f mo26741n() {
        return this.f25974i;
    }

    /* renamed from: o */
    public synchronized File mo26742o() {
        if (this.f25969d == null) {
            this.f25969d = new File(this.f25967b.getPath());
        }
        return this.f25969d;
    }

    /* renamed from: p */
    public Uri mo26743p() {
        return this.f25967b;
    }

    /* renamed from: q */
    public int mo26744q() {
        return this.f25968c;
    }

    /* renamed from: r */
    public boolean mo26745r() {
        return this.f25978m;
    }

    /* renamed from: s */
    public boolean mo26746s() {
        return this.f25979n;
    }

    /* renamed from: t */
    public Boolean mo26747t() {
        return this.f25980o;
    }

    public String toString() {
        C9534b a = C9532i.m23262a((Object) this);
        a.mo25665a("uri", (Object) this.f25967b);
        a.mo25665a("cacheChoice", (Object) this.f25966a);
        a.mo25665a("decodeOptions", (Object) this.f25972g);
        a.mo25665a("postprocessor", (Object) this.f25981p);
        a.mo25665a("priority", (Object) this.f25976k);
        a.mo25665a("resizeOptions", (Object) this.f25973h);
        a.mo25665a("rotationOptions", (Object) this.f25974i);
        a.mo25665a("bytesRange", (Object) this.f25975j);
        a.mo25665a("resizingAllowedOverride", (Object) this.f25983r);
        return a.toString();
    }

    /* renamed from: a */
    public static C9884a m24678a(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return m24677a(Uri.parse(str));
    }

    /* renamed from: b */
    private static int m24679b(Uri uri) {
        if (uri == null) {
            return -1;
        }
        if (C9559e.m23393i(uri)) {
            return 0;
        }
        if (C9559e.m23391g(uri)) {
            return C12025a.m31680c(C12025a.m31679b(uri.getPath())) ? 2 : 3;
        }
        if (C9559e.m23390f(uri)) {
            return 4;
        }
        if (C9559e.m23387c(uri)) {
            return 5;
        }
        if (C9559e.m23392h(uri)) {
            return 6;
        }
        if (C9559e.m23386b(uri)) {
            return 7;
        }
        if (C9559e.m23394j(uri)) {
            return 8;
        }
        return -1;
    }

    /* renamed from: a */
    public C9697a mo26726a() {
        return this.f25975j;
    }
}
