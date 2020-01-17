package com.bumptech.glide.load.model;

import com.bumptech.glide.C8859g;
import com.bumptech.glide.load.C8882a;
import com.bumptech.glide.load.C9011f;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.data.DataFetcher.DataCallback;
import com.bumptech.glide.load.model.ModelLoader.C9045a;
import com.bumptech.glide.p300n.C9202d;

/* renamed from: com.bumptech.glide.load.model.m */
public class C9082m<Model> implements ModelLoader<Model, Model> {

    /* renamed from: a */
    private static final C9082m<?> f23640a = new C9082m<>();

    /* renamed from: com.bumptech.glide.load.model.m$a */
    public static class C9083a<Model> implements ModelLoaderFactory<Model, Model> {

        /* renamed from: a */
        private static final C9083a<?> f23641a = new C9083a<>();

        /* renamed from: a */
        public static <T> C9083a<T> m21760a() {
            return f23641a;
        }

        public ModelLoader<Model, Model> build(C9068i iVar) {
            return C9082m.m21759a();
        }

        public void teardown() {
        }
    }

    /* renamed from: com.bumptech.glide.load.model.m$b */
    private static class C9084b<Model> implements DataFetcher<Model> {

        /* renamed from: e */
        private final Model f23642e;

        C9084b(Model model) {
            this.f23642e = model;
        }

        public void cancel() {
        }

        public void cleanup() {
        }

        public Class<Model> getDataClass() {
            return this.f23642e.getClass();
        }

        public C8882a getDataSource() {
            return C8882a.LOCAL;
        }

        public void loadData(C8859g gVar, DataCallback<? super Model> dataCallback) {
            dataCallback.onDataReady(this.f23642e);
        }
    }

    /* renamed from: a */
    public static <T> C9082m<T> m21759a() {
        return f23640a;
    }

    public C9045a<Model> buildLoadData(Model model, int i, int i2, C9011f fVar) {
        return new C9045a<>(new C9202d(model), new C9084b(model));
    }

    public boolean handles(Model model) {
        return true;
    }
}
