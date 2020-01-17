package com.bumptech.glide.load.model;

import android.net.Uri;
import com.bumptech.glide.load.C9011f;
import com.bumptech.glide.load.model.ModelLoader.C9045a;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.bumptech.glide.load.model.n */
public class C9085n<Data> implements ModelLoader<Uri, Data> {

    /* renamed from: b */
    private static final Set<String> f23643b = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"http", "https"})));

    /* renamed from: a */
    private final ModelLoader<C9053c, Data> f23644a;

    /* renamed from: com.bumptech.glide.load.model.n$a */
    public static class C9086a implements ModelLoaderFactory<Uri, InputStream> {
        public ModelLoader<Uri, InputStream> build(C9068i iVar) {
            return new C9085n(iVar.mo24586a(C9053c.class, InputStream.class));
        }

        public void teardown() {
        }
    }

    public C9085n(ModelLoader<C9053c, Data> modelLoader) {
        this.f23644a = modelLoader;
    }

    /* renamed from: a */
    public C9045a<Data> buildLoadData(Uri uri, int i, int i2, C9011f fVar) {
        return this.f23644a.buildLoadData(new C9053c(uri.toString()), i, i2, fVar);
    }

    /* renamed from: a */
    public boolean handles(Uri uri) {
        return f23643b.contains(uri.getScheme());
    }
}
