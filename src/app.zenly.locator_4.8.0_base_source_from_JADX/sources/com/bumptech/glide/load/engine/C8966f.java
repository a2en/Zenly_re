package com.bumptech.glide.load.engine;

import com.bumptech.glide.C8856d;
import com.bumptech.glide.C8859g;
import com.bumptech.glide.Registry.NoModelLoaderAvailableException;
import com.bumptech.glide.Registry.NoSourceEncoderAvailableException;
import com.bumptech.glide.load.C9011f;
import com.bumptech.glide.load.Encoder;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.ResourceEncoder;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.load.engine.cache.DiskCache;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.model.ModelLoader.C9045a;
import com.bumptech.glide.load.p294h.C9017c;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.bumptech.glide.load.engine.f */
final class C8966f<Transcode> {

    /* renamed from: a */
    private final List<C9045a<?>> f23347a = new ArrayList();

    /* renamed from: b */
    private final List<Key> f23348b = new ArrayList();

    /* renamed from: c */
    private C8856d f23349c;

    /* renamed from: d */
    private Object f23350d;

    /* renamed from: e */
    private int f23351e;

    /* renamed from: f */
    private int f23352f;

    /* renamed from: g */
    private Class<?> f23353g;

    /* renamed from: h */
    private C8972e f23354h;

    /* renamed from: i */
    private C9011f f23355i;

    /* renamed from: j */
    private Map<Class<?>, Transformation<?>> f23356j;

    /* renamed from: k */
    private Class<Transcode> f23357k;

    /* renamed from: l */
    private boolean f23358l;

    /* renamed from: m */
    private boolean f23359m;

    /* renamed from: n */
    private Key f23360n;

    /* renamed from: o */
    private C8859g f23361o;

    /* renamed from: p */
    private C8978i f23362p;

    /* renamed from: q */
    private boolean f23363q;

    /* renamed from: r */
    private boolean f23364r;

    C8966f() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public <R> void mo24421a(C8856d dVar, Object obj, Key key, int i, int i2, C8978i iVar, Class<?> cls, Class<R> cls2, C8859g gVar, C9011f fVar, Map<Class<?>, Transformation<?>> map, boolean z, boolean z2, C8972e eVar) {
        this.f23349c = dVar;
        this.f23350d = obj;
        this.f23360n = key;
        this.f23351e = i;
        this.f23352f = i2;
        this.f23362p = iVar;
        this.f23353g = cls;
        this.f23354h = eVar;
        this.f23357k = cls2;
        this.f23361o = gVar;
        this.f23355i = fVar;
        this.f23356j = map;
        this.f23363q = z;
        this.f23364r = z2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public ArrayPool mo24424b() {
        return this.f23349c.mo24126a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo24427c(Class<?> cls) {
        return mo24418a(cls) != null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public DiskCache mo24428d() {
        return this.f23354h.mo24456a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public C8978i mo24429e() {
        return this.f23362p;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public int mo24430f() {
        return this.f23352f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public List<C9045a<?>> mo24431g() {
        if (!this.f23358l) {
            this.f23358l = true;
            this.f23347a.clear();
            List a = this.f23349c.mo24132f().mo24116a(this.f23350d);
            int size = a.size();
            for (int i = 0; i < size; i++) {
                C9045a buildLoadData = ((ModelLoader) a.get(i)).buildLoadData(this.f23350d, this.f23351e, this.f23352f, this.f23355i);
                if (buildLoadData != null) {
                    this.f23347a.add(buildLoadData);
                }
            }
        }
        return this.f23347a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public Class<?> mo24432h() {
        return this.f23350d.getClass();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public C9011f mo24433i() {
        return this.f23355i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public C8859g mo24434j() {
        return this.f23361o;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public List<Class<?>> mo24435k() {
        return this.f23349c.mo24132f().mo24119b(this.f23350d.getClass(), this.f23353g, this.f23357k);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public Key mo24436l() {
        return this.f23360n;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public Class<?> mo24437m() {
        return this.f23357k;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public int mo24438n() {
        return this.f23351e;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public boolean mo24439o() {
        return this.f23364r;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public <Z> Transformation<Z> mo24423b(Class<Z> cls) {
        Transformation<Z> transformation = (Transformation) this.f23356j.get(cls);
        if (transformation == null) {
            Iterator it = this.f23356j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Entry entry = (Entry) it.next();
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    transformation = (Transformation) entry.getValue();
                    break;
                }
            }
        }
        if (transformation != null) {
            return transformation;
        }
        if (!this.f23356j.isEmpty() || !this.f23363q) {
            return C9017c.m21679a();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Missing transformation for ");
        sb.append(cls);
        sb.append(". If you wish to ignore unknown resource types, use the optional transformation methods.");
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public List<Key> mo24426c() {
        if (!this.f23359m) {
            this.f23359m = true;
            this.f23348b.clear();
            List g = mo24431g();
            int size = g.size();
            for (int i = 0; i < size; i++) {
                C9045a aVar = (C9045a) g.get(i);
                if (!this.f23348b.contains(aVar.f23578a)) {
                    this.f23348b.add(aVar.f23578a);
                }
                for (int i2 = 0; i2 < aVar.f23579b.size(); i2++) {
                    if (!this.f23348b.contains(aVar.f23579b.get(i2))) {
                        this.f23348b.add(aVar.f23579b.get(i2));
                    }
                }
            }
        }
        return this.f23348b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo24425b(Resource<?> resource) {
        return this.f23349c.mo24132f().mo24120b(resource);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo24420a() {
        this.f23349c = null;
        this.f23350d = null;
        this.f23360n = null;
        this.f23353g = null;
        this.f23357k = null;
        this.f23355i = null;
        this.f23361o = null;
        this.f23356j = null;
        this.f23362p = null;
        this.f23347a.clear();
        this.f23358l = false;
        this.f23348b.clear();
        this.f23359m = false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public <Data> C9003q<Data, ?, Transcode> mo24418a(Class<Data> cls) {
        return this.f23349c.mo24132f().mo24114a(cls, this.f23353g, this.f23357k);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public <Z> ResourceEncoder<Z> mo24417a(Resource<Z> resource) {
        return this.f23349c.mo24132f().mo24113a(resource);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public List<ModelLoader<File, ?>> mo24419a(File file) throws NoModelLoaderAvailableException {
        return this.f23349c.mo24132f().mo24116a(file);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo24422a(Key key) {
        List g = mo24431g();
        int size = g.size();
        for (int i = 0; i < size; i++) {
            if (((C9045a) g.get(i)).f23578a.equals(key)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public <X> Encoder<X> mo24416a(X x) throws NoSourceEncoderAvailableException {
        return this.f23349c.mo24132f().mo24121c(x);
    }
}
