package app.zenly.locator.core.glide;

import app.zenly.locator.p143s.p148l.C5448c;
import com.bumptech.glide.load.C9011f;
import com.bumptech.glide.load.model.C9068i;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.model.ModelLoader.C9045a;
import com.bumptech.glide.load.model.ModelLoaderFactory;
import java.io.InputStream;

/* renamed from: app.zenly.locator.core.glide.b */
final class C2473b implements ModelLoader<C2475c, InputStream> {

    /* renamed from: a */
    private final ModelLoader<String, InputStream> f7447a;

    /* renamed from: app.zenly.locator.core.glide.b$a */
    public static class C2474a implements ModelLoaderFactory<C2475c, InputStream> {
        public ModelLoader<C2475c, InputStream> build(C9068i iVar) {
            return new C2473b(iVar.mo24586a(String.class, InputStream.class));
        }

        public void teardown() {
        }
    }

    C2473b(ModelLoader<String, InputStream> modelLoader) {
        this.f7447a = modelLoader;
    }

    /* renamed from: a */
    public C9045a<InputStream> buildLoadData(C2475c cVar, int i, int i2, C9011f fVar) {
        String str = (String) C5448c.m15478a().cache(cVar.mo8481a()).mo36445a();
        if (str == null) {
            return null;
        }
        return this.f7447a.buildLoadData(str, i, i2, fVar);
    }

    /* renamed from: a */
    public boolean handles(C2475c cVar) {
        return true;
    }
}
