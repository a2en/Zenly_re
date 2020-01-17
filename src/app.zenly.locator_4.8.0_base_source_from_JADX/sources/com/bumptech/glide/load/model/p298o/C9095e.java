package com.bumptech.glide.load.model.p298o;

import com.bumptech.glide.load.C9011f;
import com.bumptech.glide.load.model.C9053c;
import com.bumptech.glide.load.model.C9068i;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.model.ModelLoader.C9045a;
import com.bumptech.glide.load.model.ModelLoaderFactory;
import java.io.InputStream;
import java.net.URL;

/* renamed from: com.bumptech.glide.load.model.o.e */
public class C9095e implements ModelLoader<URL, InputStream> {

    /* renamed from: a */
    private final ModelLoader<C9053c, InputStream> f23654a;

    /* renamed from: com.bumptech.glide.load.model.o.e$a */
    public static class C9096a implements ModelLoaderFactory<URL, InputStream> {
        public ModelLoader<URL, InputStream> build(C9068i iVar) {
            return new C9095e(iVar.mo24586a(C9053c.class, InputStream.class));
        }

        public void teardown() {
        }
    }

    public C9095e(ModelLoader<C9053c, InputStream> modelLoader) {
        this.f23654a = modelLoader;
    }

    /* renamed from: a */
    public C9045a<InputStream> buildLoadData(URL url, int i, int i2, C9011f fVar) {
        return this.f23654a.buildLoadData(new C9053c(url), i, i2, fVar);
    }

    /* renamed from: a */
    public boolean handles(URL url) {
        return true;
    }
}
