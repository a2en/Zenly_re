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
import com.bumptech.glide.p300n.C9202d;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.model.o.c */
public class C9091c implements ModelLoader<Uri, InputStream> {

    /* renamed from: a */
    private final Context f23650a;

    /* renamed from: com.bumptech.glide.load.model.o.c$a */
    public static class C9092a implements ModelLoaderFactory<Uri, InputStream> {

        /* renamed from: a */
        private final Context f23651a;

        public C9092a(Context context) {
            this.f23651a = context;
        }

        public ModelLoader<Uri, InputStream> build(C9068i iVar) {
            return new C9091c(this.f23651a);
        }

        public void teardown() {
        }
    }

    public C9091c(Context context) {
        this.f23650a = context.getApplicationContext();
    }

    /* renamed from: a */
    public C9045a<InputStream> buildLoadData(Uri uri, int i, int i2, C9011f fVar) {
        if (C8904b.m21370a(i, i2)) {
            return new C9045a<>(new C9202d(uri), C8905c.m21375a(this.f23650a, uri));
        }
        return null;
    }

    /* renamed from: a */
    public boolean handles(Uri uri) {
        return C8904b.m21371a(uri);
    }
}
