package com.bumptech.glide.load.model;

import android.content.res.AssetManager;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.C9011f;
import com.bumptech.glide.load.data.C8893f;
import com.bumptech.glide.load.data.C8901k;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.model.ModelLoader.C9045a;
import com.bumptech.glide.p300n.C9202d;
import java.io.InputStream;

public class AssetUriLoader<Data> implements ModelLoader<Uri, Data> {

    /* renamed from: c */
    private static final int f23559c = 22;

    /* renamed from: a */
    private final AssetManager f23560a;

    /* renamed from: b */
    private final AssetFetcherFactory<Data> f23561b;

    public interface AssetFetcherFactory<Data> {
        DataFetcher<Data> buildFetcher(AssetManager assetManager, String str);
    }

    /* renamed from: com.bumptech.glide.load.model.AssetUriLoader$a */
    public static class C9028a implements ModelLoaderFactory<Uri, ParcelFileDescriptor>, AssetFetcherFactory<ParcelFileDescriptor> {

        /* renamed from: a */
        private final AssetManager f23562a;

        public C9028a(AssetManager assetManager) {
            this.f23562a = assetManager;
        }

        public ModelLoader<Uri, ParcelFileDescriptor> build(C9068i iVar) {
            return new AssetUriLoader(this.f23562a, this);
        }

        public DataFetcher<ParcelFileDescriptor> buildFetcher(AssetManager assetManager, String str) {
            return new C8893f(assetManager, str);
        }

        public void teardown() {
        }
    }

    /* renamed from: com.bumptech.glide.load.model.AssetUriLoader$b */
    public static class C9029b implements ModelLoaderFactory<Uri, InputStream>, AssetFetcherFactory<InputStream> {

        /* renamed from: a */
        private final AssetManager f23563a;

        public C9029b(AssetManager assetManager) {
            this.f23563a = assetManager;
        }

        public ModelLoader<Uri, InputStream> build(C9068i iVar) {
            return new AssetUriLoader(this.f23563a, this);
        }

        public DataFetcher<InputStream> buildFetcher(AssetManager assetManager, String str) {
            return new C8901k(assetManager, str);
        }

        public void teardown() {
        }
    }

    public AssetUriLoader(AssetManager assetManager, AssetFetcherFactory<Data> assetFetcherFactory) {
        this.f23560a = assetManager;
        this.f23561b = assetFetcherFactory;
    }

    /* renamed from: a */
    public C9045a<Data> buildLoadData(Uri uri, int i, int i2, C9011f fVar) {
        return new C9045a<>(new C9202d(uri), this.f23561b.buildFetcher(this.f23560a, uri.toString().substring(f23559c)));
    }

    /* renamed from: a */
    public boolean handles(Uri uri) {
        if (!"file".equals(uri.getScheme()) || uri.getPathSegments().isEmpty()) {
            return false;
        }
        if ("android_asset".equals(uri.getPathSegments().get(0))) {
            return true;
        }
        return false;
    }
}
