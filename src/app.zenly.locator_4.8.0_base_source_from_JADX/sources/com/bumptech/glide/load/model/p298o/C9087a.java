package com.bumptech.glide.load.model.p298o;

import com.bumptech.glide.load.C9011f;
import com.bumptech.glide.load.Option;
import com.bumptech.glide.load.data.C8895h;
import com.bumptech.glide.load.model.C9053c;
import com.bumptech.glide.load.model.C9060f;
import com.bumptech.glide.load.model.C9068i;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.model.ModelLoader.C9045a;
import com.bumptech.glide.load.model.ModelLoaderFactory;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.model.o.a */
public class C9087a implements ModelLoader<C9053c, InputStream> {

    /* renamed from: b */
    public static final Option<Integer> f23645b = Option.m21321a("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", Integer.valueOf(2500));

    /* renamed from: a */
    private final C9060f<C9053c, C9053c> f23646a;

    /* renamed from: com.bumptech.glide.load.model.o.a$a */
    public static class C9088a implements ModelLoaderFactory<C9053c, InputStream> {

        /* renamed from: a */
        private final C9060f<C9053c, C9053c> f23647a = new C9060f<>(500);

        public ModelLoader<C9053c, InputStream> build(C9068i iVar) {
            return new C9087a(this.f23647a);
        }

        public void teardown() {
        }
    }

    public C9087a(C9060f<C9053c, C9053c> fVar) {
        this.f23646a = fVar;
    }

    /* renamed from: a */
    public C9045a<InputStream> buildLoadData(C9053c cVar, int i, int i2, C9011f fVar) {
        C9060f<C9053c, C9053c> fVar2 = this.f23646a;
        if (fVar2 != null) {
            C9053c cVar2 = (C9053c) fVar2.mo24572a(cVar, 0, 0);
            if (cVar2 == null) {
                this.f23646a.mo24573a(cVar, 0, 0, cVar);
            } else {
                cVar = cVar2;
            }
        }
        return new C9045a<>(cVar, new C8895h(cVar, ((Integer) fVar.mo24517a(f23645b)).intValue()));
    }

    /* renamed from: a */
    public boolean handles(C9053c cVar) {
        return true;
    }
}
