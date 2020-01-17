package com.bumptech.glide.load.model;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.load.C9011f;
import com.bumptech.glide.load.model.ModelLoader.C9045a;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.model.j */
public class C9072j<Data> implements ModelLoader<Integer, Data> {

    /* renamed from: a */
    private final ModelLoader<Uri, Data> f23632a;

    /* renamed from: b */
    private final Resources f23633b;

    /* renamed from: com.bumptech.glide.load.model.j$a */
    public static final class C9073a implements ModelLoaderFactory<Integer, AssetFileDescriptor> {

        /* renamed from: a */
        private final Resources f23634a;

        public C9073a(Resources resources) {
            this.f23634a = resources;
        }

        public ModelLoader<Integer, AssetFileDescriptor> build(C9068i iVar) {
            return new C9072j(this.f23634a, iVar.mo24586a(Uri.class, AssetFileDescriptor.class));
        }

        public void teardown() {
        }
    }

    /* renamed from: com.bumptech.glide.load.model.j$b */
    public static class C9074b implements ModelLoaderFactory<Integer, ParcelFileDescriptor> {

        /* renamed from: a */
        private final Resources f23635a;

        public C9074b(Resources resources) {
            this.f23635a = resources;
        }

        public ModelLoader<Integer, ParcelFileDescriptor> build(C9068i iVar) {
            return new C9072j(this.f23635a, iVar.mo24586a(Uri.class, ParcelFileDescriptor.class));
        }

        public void teardown() {
        }
    }

    /* renamed from: com.bumptech.glide.load.model.j$c */
    public static class C9075c implements ModelLoaderFactory<Integer, InputStream> {

        /* renamed from: a */
        private final Resources f23636a;

        public C9075c(Resources resources) {
            this.f23636a = resources;
        }

        public ModelLoader<Integer, InputStream> build(C9068i iVar) {
            return new C9072j(this.f23636a, iVar.mo24586a(Uri.class, InputStream.class));
        }

        public void teardown() {
        }
    }

    /* renamed from: com.bumptech.glide.load.model.j$d */
    public static class C9076d implements ModelLoaderFactory<Integer, Uri> {

        /* renamed from: a */
        private final Resources f23637a;

        public C9076d(Resources resources) {
            this.f23637a = resources;
        }

        public ModelLoader<Integer, Uri> build(C9068i iVar) {
            return new C9072j(this.f23637a, C9082m.m21759a());
        }

        public void teardown() {
        }
    }

    public C9072j(Resources resources, ModelLoader<Uri, Data> modelLoader) {
        this.f23633b = resources;
        this.f23632a = modelLoader;
    }

    /* renamed from: b */
    private Uri m21751b(Integer num) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("android.resource://");
            sb.append(this.f23633b.getResourcePackageName(num.intValue()));
            sb.append('/');
            sb.append(this.f23633b.getResourceTypeName(num.intValue()));
            sb.append('/');
            sb.append(this.f23633b.getResourceEntryName(num.intValue()));
            return Uri.parse(sb.toString());
        } catch (NotFoundException e) {
            String str = "ResourceLoader";
            if (Log.isLoggable(str, 5)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Received invalid resource id: ");
                sb2.append(num);
                Log.w(str, sb2.toString(), e);
            }
            return null;
        }
    }

    /* renamed from: a */
    public C9045a<Data> buildLoadData(Integer num, int i, int i2, C9011f fVar) {
        Uri b = m21751b(num);
        if (b == null) {
            return null;
        }
        return this.f23632a.buildLoadData(b, i, i2, fVar);
    }

    /* renamed from: a */
    public boolean handles(Integer num) {
        return true;
    }
}
