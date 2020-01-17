package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import android.widget.ImageView;
import com.bumptech.glide.Glide.RequestOptionsFactory;
import com.bumptech.glide.load.engine.C8984j;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.request.C9224d;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.C9236g;
import com.bumptech.glide.request.target.C9238i;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.bumptech.glide.d */
public class C8856d extends ContextWrapper {

    /* renamed from: k */
    static final C8871k<?, ?> f23025k = new C8853b();

    /* renamed from: a */
    private final ArrayPool f23026a;

    /* renamed from: b */
    private final Registry f23027b;

    /* renamed from: c */
    private final C9236g f23028c;

    /* renamed from: d */
    private final RequestOptionsFactory f23029d;

    /* renamed from: e */
    private final List<RequestListener<Object>> f23030e;

    /* renamed from: f */
    private final Map<Class<?>, C8871k<?, ?>> f23031f;

    /* renamed from: g */
    private final C8984j f23032g;

    /* renamed from: h */
    private final boolean f23033h;

    /* renamed from: i */
    private final int f23034i;

    /* renamed from: j */
    private C9224d f23035j;

    public C8856d(Context context, ArrayPool arrayPool, Registry registry, C9236g gVar, RequestOptionsFactory requestOptionsFactory, Map<Class<?>, C8871k<?, ?>> map, List<RequestListener<Object>> list, C8984j jVar, boolean z, int i) {
        super(context.getApplicationContext());
        this.f23026a = arrayPool;
        this.f23027b = registry;
        this.f23028c = gVar;
        this.f23029d = requestOptionsFactory;
        this.f23030e = list;
        this.f23031f = map;
        this.f23032g = jVar;
        this.f23033h = z;
        this.f23034i = i;
    }

    /* renamed from: a */
    public <T> C8871k<?, T> mo24125a(Class<T> cls) {
        C8871k<?, T> kVar = (C8871k) this.f23031f.get(cls);
        if (kVar == null) {
            for (Entry entry : this.f23031f.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    kVar = (C8871k) entry.getValue();
                }
            }
        }
        return kVar == null ? f23025k : kVar;
    }

    /* renamed from: b */
    public List<RequestListener<Object>> mo24128b() {
        return this.f23030e;
    }

    /* renamed from: c */
    public synchronized C9224d mo24129c() {
        if (this.f23035j == null) {
            this.f23035j = (C9224d) this.f23029d.build().mo8506I();
        }
        return this.f23035j;
    }

    /* renamed from: d */
    public C8984j mo24130d() {
        return this.f23032g;
    }

    /* renamed from: e */
    public int mo24131e() {
        return this.f23034i;
    }

    /* renamed from: f */
    public Registry mo24132f() {
        return this.f23027b;
    }

    /* renamed from: g */
    public boolean mo24133g() {
        return this.f23033h;
    }

    /* renamed from: a */
    public <X> C9238i<ImageView, X> mo24127a(ImageView imageView, Class<X> cls) {
        return this.f23028c.mo24918a(imageView, cls);
    }

    /* renamed from: a */
    public ArrayPool mo24126a() {
        return this.f23026a;
    }
}
