package com.bumptech.glide.load.model;

import com.bumptech.glide.load.C9011f;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.p301o.C9216j;
import java.util.Collections;
import java.util.List;

public interface ModelLoader<Model, Data> {

    /* renamed from: com.bumptech.glide.load.model.ModelLoader$a */
    public static class C9045a<Data> {

        /* renamed from: a */
        public final Key f23578a;

        /* renamed from: b */
        public final List<Key> f23579b;

        /* renamed from: c */
        public final DataFetcher<Data> f23580c;

        public C9045a(Key key, DataFetcher<Data> dataFetcher) {
            this(key, Collections.emptyList(), dataFetcher);
        }

        public C9045a(Key key, List<Key> list, DataFetcher<Data> dataFetcher) {
            C9216j.m22083a(key);
            this.f23578a = key;
            C9216j.m22083a(list);
            this.f23579b = list;
            C9216j.m22083a(dataFetcher);
            this.f23580c = dataFetcher;
        }
    }

    C9045a<Data> buildLoadData(Model model, int i, int i2, C9011f fVar);

    boolean handles(Model model);
}
