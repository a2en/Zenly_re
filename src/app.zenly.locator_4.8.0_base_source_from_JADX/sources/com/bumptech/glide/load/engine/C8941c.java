package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.C8882a;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.data.DataFetcher.DataCallback;
import com.bumptech.glide.load.engine.DataFetcherGenerator.FetcherReadyCallback;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.model.ModelLoader.C9045a;
import java.io.File;
import java.util.List;

/* renamed from: com.bumptech.glide.load.engine.c */
class C8941c implements DataFetcherGenerator, DataCallback<Object> {

    /* renamed from: e */
    private final List<Key> f23289e;

    /* renamed from: f */
    private final C8966f<?> f23290f;

    /* renamed from: g */
    private final FetcherReadyCallback f23291g;

    /* renamed from: h */
    private int f23292h;

    /* renamed from: i */
    private Key f23293i;

    /* renamed from: j */
    private List<ModelLoader<File, ?>> f23294j;

    /* renamed from: k */
    private int f23295k;

    /* renamed from: l */
    private volatile C9045a<?> f23296l;

    /* renamed from: m */
    private File f23297m;

    C8941c(C8966f<?> fVar, FetcherReadyCallback fetcherReadyCallback) {
        this(fVar.mo24426c(), fVar, fetcherReadyCallback);
    }

    /* renamed from: b */
    private boolean m21486b() {
        return this.f23295k < this.f23294j.size();
    }

    /* renamed from: a */
    public boolean mo24274a() {
        while (true) {
            boolean z = false;
            if (this.f23294j == null || !m21486b()) {
                this.f23292h++;
                if (this.f23292h >= this.f23289e.size()) {
                    return false;
                }
                Key key = (Key) this.f23289e.get(this.f23292h);
                this.f23297m = this.f23290f.mo24428d().get(new C8957d(key, this.f23290f.mo24436l()));
                File file = this.f23297m;
                if (file != null) {
                    this.f23293i = key;
                    this.f23294j = this.f23290f.mo24419a(file);
                    this.f23295k = 0;
                }
            } else {
                this.f23296l = null;
                while (!z && m21486b()) {
                    List<ModelLoader<File, ?>> list = this.f23294j;
                    int i = this.f23295k;
                    this.f23295k = i + 1;
                    this.f23296l = ((ModelLoader) list.get(i)).buildLoadData(this.f23297m, this.f23290f.mo24438n(), this.f23290f.mo24430f(), this.f23290f.mo24433i());
                    if (this.f23296l != null && this.f23290f.mo24427c(this.f23296l.f23580c.getDataClass())) {
                        this.f23296l.f23580c.loadData(this.f23290f.mo24434j(), this);
                        z = true;
                    }
                }
                return z;
            }
        }
    }

    public void cancel() {
        C9045a<?> aVar = this.f23296l;
        if (aVar != null) {
            aVar.f23580c.cancel();
        }
    }

    public void onDataReady(Object obj) {
        this.f23291g.onDataFetcherReady(this.f23293i, obj, this.f23296l.f23580c, C8882a.DATA_DISK_CACHE, this.f23293i);
    }

    public void onLoadFailed(Exception exc) {
        this.f23291g.onDataFetcherFailed(this.f23293i, exc, this.f23296l.f23580c, C8882a.DATA_DISK_CACHE);
    }

    C8941c(List<Key> list, C8966f<?> fVar, FetcherReadyCallback fetcherReadyCallback) {
        this.f23292h = -1;
        this.f23289e = list;
        this.f23290f = fVar;
        this.f23291g = fetcherReadyCallback;
    }
}
