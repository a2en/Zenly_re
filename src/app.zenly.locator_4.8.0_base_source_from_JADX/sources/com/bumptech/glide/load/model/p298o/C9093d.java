package com.bumptech.glide.load.model.p298o;

import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.load.C9011f;
import com.bumptech.glide.load.data.p293m.C8904b;
import com.bumptech.glide.load.data.p293m.C8905c;
import com.bumptech.glide.load.model.C9068i;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.model.ModelLoader.C9045a;
import com.bumptech.glide.load.model.ModelLoaderFactory;
import com.bumptech.glide.load.resource.bitmap.C9099a0;
import com.bumptech.glide.p300n.C9202d;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.model.o.d */
public class C9093d implements ModelLoader<Uri, InputStream> {

    /* renamed from: a */
    private final Context f23652a;

    /* renamed from: com.bumptech.glide.load.model.o.d$a */
    public static class C9094a implements ModelLoaderFactory<Uri, InputStream> {

        /* renamed from: a */
        private final Context f23653a;

        public C9094a(Context context) {
            this.f23653a = context;
        }

        public ModelLoader<Uri, InputStream> build(C9068i iVar) {
            return new C9093d(this.f23653a);
        }

        public void teardown() {
        }
    }

    public C9093d(Context context) {
        this.f23652a = context.getApplicationContext();
    }

    /* renamed from: a */
    public C9045a<InputStream> buildLoadData(Uri uri, int i, int i2, C9011f fVar) {
        if (!C8904b.m21370a(i, i2) || !m21769a(fVar)) {
            return null;
        }
        return new C9045a<>(new C9202d(uri), C8905c.m21378b(this.f23652a, uri));
    }

    /* renamed from: a */
    private boolean m21769a(C9011f fVar) {
        Long l = (Long) fVar.mo24517a(C9099a0.f23670d);
        return l != null && l.longValue() == -1;
    }

    /* renamed from: a */
    public boolean handles(Uri uri) {
        return C8904b.m21373c(uri);
    }
}
