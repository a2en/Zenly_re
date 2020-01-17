package com.bumptech.glide.load.model;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import com.bumptech.glide.load.C9011f;
import com.bumptech.glide.load.model.ModelLoader.C9045a;
import java.io.File;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.model.l */
public class C9078l<Data> implements ModelLoader<String, Data> {

    /* renamed from: a */
    private final ModelLoader<Uri, Data> f23639a;

    /* renamed from: com.bumptech.glide.load.model.l$a */
    public static final class C9079a implements ModelLoaderFactory<String, AssetFileDescriptor> {
        public ModelLoader<String, AssetFileDescriptor> build(C9068i iVar) {
            return new C9078l(iVar.mo24586a(Uri.class, AssetFileDescriptor.class));
        }

        public void teardown() {
        }
    }

    /* renamed from: com.bumptech.glide.load.model.l$b */
    public static class C9080b implements ModelLoaderFactory<String, ParcelFileDescriptor> {
        public ModelLoader<String, ParcelFileDescriptor> build(C9068i iVar) {
            return new C9078l(iVar.mo24586a(Uri.class, ParcelFileDescriptor.class));
        }

        public void teardown() {
        }
    }

    /* renamed from: com.bumptech.glide.load.model.l$c */
    public static class C9081c implements ModelLoaderFactory<String, InputStream> {
        public ModelLoader<String, InputStream> build(C9068i iVar) {
            return new C9078l(iVar.mo24586a(Uri.class, InputStream.class));
        }

        public void teardown() {
        }
    }

    public C9078l(ModelLoader<Uri, Data> modelLoader) {
        this.f23639a = modelLoader;
    }

    /* renamed from: b */
    private static Uri m21755b(String str) {
        Uri uri;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.charAt(0) == '/') {
            uri = m21756c(str);
        } else {
            Uri parse = Uri.parse(str);
            uri = parse.getScheme() == null ? m21756c(str) : parse;
        }
        return uri;
    }

    /* renamed from: c */
    private static Uri m21756c(String str) {
        return Uri.fromFile(new File(str));
    }

    /* renamed from: a */
    public C9045a<Data> buildLoadData(String str, int i, int i2, C9011f fVar) {
        Uri b = m21755b(str);
        if (b == null || !this.f23639a.handles(b)) {
            return null;
        }
        return this.f23639a.buildLoadData(b, i, i2, fVar);
    }

    /* renamed from: a */
    public boolean handles(String str) {
        return true;
    }
}
