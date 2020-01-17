package app.zenly.locator.core.glide;

import android.content.Context;
import android.net.Uri;
import app.zenly.android.feature.base.model.Avatar;
import app.zenly.android.feature.base.model.Avatar.C1327a;
import com.bumptech.glide.load.C9011f;
import com.bumptech.glide.load.model.C9068i;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.model.ModelLoader.C9045a;
import com.bumptech.glide.load.model.ModelLoaderFactory;
import java.io.InputStream;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p253a.p256f.p257a.C7674a;
import p250f.p251a.p252a.p263b.p264a.p272j.C7711d;

/* renamed from: app.zenly.locator.core.glide.a */
public final class C2471a implements ModelLoader<Avatar, InputStream> {

    /* renamed from: a */
    private final Context f7444a;

    /* renamed from: b */
    private final ModelLoader<Uri, InputStream> f7445b;

    /* renamed from: app.zenly.locator.core.glide.a$a */
    public static final class C2472a implements ModelLoaderFactory<Avatar, InputStream> {

        /* renamed from: a */
        private final Context f7446a;

        public C2472a(Context context) {
            C12932j.m33818b(context, "context");
            this.f7446a = context;
        }

        public ModelLoader<Avatar, InputStream> build(C9068i iVar) {
            C12932j.m33818b(iVar, "multiFactory");
            Context context = this.f7446a;
            ModelLoader a = iVar.mo24586a(Uri.class, InputStream.class);
            C12932j.m33815a((Object) a, "multiFactory.build(Uri::… InputStream::class.java)");
            return new C2471a(context, a);
        }

        public void teardown() {
        }
    }

    public C2471a(Context context, ModelLoader<Uri, InputStream> modelLoader) {
        C12932j.m33818b(context, "context");
        C12932j.m33818b(modelLoader, "uriLoader");
        this.f7444a = context;
        this.f7445b = modelLoader;
    }

    /* renamed from: a */
    public C9045a<InputStream> buildLoadData(Avatar avatar, int i, int i2, C9011f fVar) {
        C12932j.m33818b(avatar, "avatar");
        C12932j.m33818b(fVar, "options");
        C1327a forSize = avatar.forSize(i);
        Uri a = forSize != null ? forSize.mo6526a() : null;
        if ((a != null ? a.getPath() : null) == null) {
            return null;
        }
        int a2 = C1327a.f4934c.mo6531a(a);
        if (C7674a.m18692a(a2)) {
            a = m8574a(a2);
        }
        return this.f7445b.buildLoadData(a, i, i2, fVar);
    }

    /* renamed from: a */
    public boolean handles(Avatar avatar) {
        C12932j.m33818b(avatar, "avatar");
        return true;
    }

    /* renamed from: a */
    private final Uri m8574a(int i) {
        return C7711d.m18771a(this.f7444a, i);
    }
}
