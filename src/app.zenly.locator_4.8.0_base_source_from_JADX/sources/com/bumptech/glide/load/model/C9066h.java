package com.bumptech.glide.load.model;

import androidx.core.util.Pools$Pool;
import com.bumptech.glide.C8859g;
import com.bumptech.glide.load.C8882a;
import com.bumptech.glide.load.C9011f;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.data.DataFetcher.DataCallback;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.model.ModelLoader.C9045a;
import com.bumptech.glide.p301o.C9216j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.bumptech.glide.load.model.h */
class C9066h<Model, Data> implements ModelLoader<Model, Data> {

    /* renamed from: a */
    private final List<ModelLoader<Model, Data>> f23614a;

    /* renamed from: b */
    private final Pools$Pool<List<Throwable>> f23615b;

    /* renamed from: com.bumptech.glide.load.model.h$a */
    static class C9067a<Data> implements DataFetcher<Data>, DataCallback<Data> {

        /* renamed from: e */
        private final List<DataFetcher<Data>> f23616e;

        /* renamed from: f */
        private final Pools$Pool<List<Throwable>> f23617f;

        /* renamed from: g */
        private int f23618g = 0;

        /* renamed from: h */
        private C8859g f23619h;

        /* renamed from: i */
        private DataCallback<? super Data> f23620i;

        /* renamed from: j */
        private List<Throwable> f23621j;

        /* renamed from: k */
        private boolean f23622k;

        C9067a(List<DataFetcher<Data>> list, Pools$Pool<List<Throwable>> pools$Pool) {
            this.f23617f = pools$Pool;
            C9216j.m22086a(list);
            this.f23616e = list;
        }

        /* renamed from: a */
        private void m21739a() {
            if (!this.f23622k) {
                if (this.f23618g < this.f23616e.size() - 1) {
                    this.f23618g++;
                    loadData(this.f23619h, this.f23620i);
                } else {
                    C9216j.m22083a(this.f23621j);
                    this.f23620i.onLoadFailed(new GlideException("Fetch failed", (List<Throwable>) new ArrayList<Throwable>(this.f23621j)));
                }
            }
        }

        public void cancel() {
            this.f23622k = true;
            for (DataFetcher cancel : this.f23616e) {
                cancel.cancel();
            }
        }

        public void cleanup() {
            List<Throwable> list = this.f23621j;
            if (list != null) {
                this.f23617f.release(list);
            }
            this.f23621j = null;
            for (DataFetcher cleanup : this.f23616e) {
                cleanup.cleanup();
            }
        }

        public Class<Data> getDataClass() {
            return ((DataFetcher) this.f23616e.get(0)).getDataClass();
        }

        public C8882a getDataSource() {
            return ((DataFetcher) this.f23616e.get(0)).getDataSource();
        }

        public void loadData(C8859g gVar, DataCallback<? super Data> dataCallback) {
            this.f23619h = gVar;
            this.f23620i = dataCallback;
            this.f23621j = (List) this.f23617f.acquire();
            ((DataFetcher) this.f23616e.get(this.f23618g)).loadData(gVar, this);
            if (this.f23622k) {
                cancel();
            }
        }

        public void onDataReady(Data data) {
            if (data != null) {
                this.f23620i.onDataReady(data);
            } else {
                m21739a();
            }
        }

        public void onLoadFailed(Exception exc) {
            List<Throwable> list = this.f23621j;
            C9216j.m22083a(list);
            list.add(exc);
            m21739a();
        }
    }

    C9066h(List<ModelLoader<Model, Data>> list, Pools$Pool<List<Throwable>> pools$Pool) {
        this.f23614a = list;
        this.f23615b = pools$Pool;
    }

    public C9045a<Data> buildLoadData(Model model, int i, int i2, C9011f fVar) {
        int size = this.f23614a.size();
        ArrayList arrayList = new ArrayList(size);
        Key key = null;
        for (int i3 = 0; i3 < size; i3++) {
            ModelLoader modelLoader = (ModelLoader) this.f23614a.get(i3);
            if (modelLoader.handles(model)) {
                C9045a buildLoadData = modelLoader.buildLoadData(model, i, i2, fVar);
                if (buildLoadData != null) {
                    key = buildLoadData.f23578a;
                    arrayList.add(buildLoadData.f23580c);
                }
            }
        }
        if (arrayList.isEmpty() || key == null) {
            return null;
        }
        return new C9045a<>(key, new C9067a(arrayList, this.f23615b));
    }

    public boolean handles(Model model) {
        for (ModelLoader handles : this.f23614a) {
            if (handles.handles(model)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MultiModelLoader{modelLoaders=");
        sb.append(Arrays.toString(this.f23614a.toArray()));
        sb.append('}');
        return sb.toString();
    }
}
