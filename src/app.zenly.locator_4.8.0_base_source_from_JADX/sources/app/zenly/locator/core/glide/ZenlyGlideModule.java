package app.zenly.locator.core.glide;

import android.content.Context;
import app.zenly.android.feature.base.model.Avatar;
import app.zenly.locator.core.glide.C2471a.C2472a;
import app.zenly.locator.core.glide.C2473b.C2474a;
import com.bumptech.glide.Glide;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.model.ModelLoaderFactory;
import com.bumptech.glide.module.C9194a;
import java.io.InputStream;

public class ZenlyGlideModule extends C9194a {
    /* renamed from: a */
    public void mo8471a(Context context, Glide glide, Registry registry) {
        registry.mo24117b(Avatar.class, InputStream.class, (ModelLoaderFactory<Model, Data>) new C2472a<Model,Data>(context));
        registry.mo24117b(C2475c.class, InputStream.class, (ModelLoaderFactory<Model, Data>) new C2474a<Model,Data>());
    }

    /* renamed from: a */
    public boolean mo8472a() {
        return false;
    }
}
