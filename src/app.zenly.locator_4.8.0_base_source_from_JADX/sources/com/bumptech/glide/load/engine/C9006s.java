package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.C8882a;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.data.DataFetcher.DataCallback;
import com.bumptech.glide.load.engine.DataFetcherGenerator.FetcherReadyCallback;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.model.ModelLoader.C9045a;
import java.io.File;
import java.util.List;

/* renamed from: com.bumptech.glide.load.engine.s */
class C9006s implements DataFetcherGenerator, DataCallback<Object> {

    /* renamed from: e */
    private final FetcherReadyCallback f23512e;

    /* renamed from: f */
    private final C8966f<?> f23513f;

    /* renamed from: g */
    private int f23514g;

    /* renamed from: h */
    private int f23515h = -1;

    /* renamed from: i */
    private Key f23516i;

    /* renamed from: j */
    private List<ModelLoader<File, ?>> f23517j;

    /* renamed from: k */
    private int f23518k;

    /* renamed from: l */
    private volatile C9045a<?> f23519l;

    /* renamed from: m */
    private File f23520m;

    /* renamed from: n */
    private C9007t f23521n;

    C9006s(C8966f<?> fVar, FetcherReadyCallback fetcherReadyCallback) {
        this.f23513f = fVar;
        this.f23512e = fetcherReadyCallback;
    }

    /* renamed from: b */
    private boolean m21665b() {
        return this.f23518k < this.f23517j.size();
    }

    /* renamed from: a */
    public boolean mo24274a() {
        List c = this.f23513f.mo24426c();
        boolean z = false;
        if (c.isEmpty()) {
            return false;
        }
        List k = this.f23513f.mo24435k();
        if (!k.isEmpty()) {
            while (true) {
                if (this.f23517j == null || !m21665b()) {
                    this.f23515h++;
                    if (this.f23515h >= k.size()) {
                        this.f23514g++;
                        if (this.f23514g >= c.size()) {
                            return false;
                        }
                        this.f23515h = 0;
                    }
                    Key key = (Key) c.get(this.f23514g);
                    Class cls = (Class) k.get(this.f23515h);
                    Key key2 = key;
                    C9007t tVar = new C9007t(this.f23513f.mo24424b(), key2, this.f23513f.mo24436l(), this.f23513f.mo24438n(), this.f23513f.mo24430f(), this.f23513f.mo24423b(cls), cls, this.f23513f.mo24433i());
                    this.f23521n = tVar;
                    this.f23520m = this.f23513f.mo24428d().get(this.f23521n);
                    File file = this.f23520m;
                    if (file != null) {
                        this.f23516i = key;
                        this.f23517j = this.f23513f.mo24419a(file);
                        this.f23518k = 0;
                    }
                } else {
                    this.f23519l = null;
                    while (!z && m21665b()) {
                        List<ModelLoader<File, ?>> list = this.f23517j;
                        int i = this.f23518k;
                        this.f23518k = i + 1;
                        this.f23519l = ((ModelLoader) list.get(i)).buildLoadData(this.f23520m, this.f23513f.mo24438n(), this.f23513f.mo24430f(), this.f23513f.mo24433i());
                        if (this.f23519l != null && this.f23513f.mo24427c(this.f23519l.f23580c.getDataClass())) {
                            this.f23519l.f23580c.loadData(this.f23513f.mo24434j(), this);
                            z = true;
                        }
                    }
                    return z;
                }
            }
        } else if (File.class.equals(this.f23513f.mo24437m())) {
            return false;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to find any load path from ");
            sb.append(this.f23513f.mo24432h());
            sb.append(" to ");
            sb.append(this.f23513f.mo24437m());
            throw new IllegalStateException(sb.toString());
        }
    }

    public void cancel() {
        C9045a<?> aVar = this.f23519l;
        if (aVar != null) {
            aVar.f23580c.cancel();
        }
    }

    public void onDataReady(Object obj) {
        this.f23512e.onDataFetcherReady(this.f23516i, obj, this.f23519l.f23580c, C8882a.RESOURCE_DISK_CACHE, this.f23521n);
    }

    public void onLoadFailed(Exception exc) {
        this.f23512e.onDataFetcherFailed(this.f23521n, exc, this.f23519l.f23580c, C8882a.RESOURCE_DISK_CACHE);
    }
}
