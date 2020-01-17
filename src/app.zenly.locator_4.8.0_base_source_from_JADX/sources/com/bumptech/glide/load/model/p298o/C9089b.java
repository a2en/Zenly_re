package com.bumptech.glide.load.model.p298o;

import android.net.Uri;
import com.bumptech.glide.load.C9011f;
import com.bumptech.glide.load.model.C9053c;
import com.bumptech.glide.load.model.C9068i;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.model.ModelLoader.C9045a;
import com.bumptech.glide.load.model.ModelLoaderFactory;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.bumptech.glide.load.model.o.b */
public class C9089b implements ModelLoader<Uri, InputStream> {

    /* renamed from: b */
    private static final Set<String> f23648b = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"http", "https"})));

    /* renamed from: a */
    private final ModelLoader<C9053c, InputStream> f23649a;

    /* renamed from: com.bumptech.glide.load.model.o.b$a */
    public static class C9090a implements ModelLoaderFactory<Uri, InputStream> {
        public ModelLoader<Uri, InputStream> build(C9068i iVar) {
            return new C9089b(iVar.mo24586a(C9053c.class, InputStream.class));
        }

        public void teardown() {
        }
    }

    public C9089b(ModelLoader<C9053c, InputStream> modelLoader) {
        this.f23649a = modelLoader;
    }

    /* renamed from: a */
    public C9045a<InputStream> buildLoadData(Uri uri, int i, int i2, C9011f fVar) {
        return this.f23649a.buildLoadData(new C9053c(uri.toString()), i, i2, fVar);
    }

    /* renamed from: a */
    public boolean handles(Uri uri) {
        return f23648b.contains(uri.getScheme());
    }
}
