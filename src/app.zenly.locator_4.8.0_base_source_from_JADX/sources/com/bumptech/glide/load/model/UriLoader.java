package com.bumptech.glide.load.model;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.C9011f;
import com.bumptech.glide.load.data.C8886a;
import com.bumptech.glide.load.data.C8894g;
import com.bumptech.glide.load.data.C8902l;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.model.ModelLoader.C9045a;
import com.bumptech.glide.p300n.C9202d;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class UriLoader<Data> implements ModelLoader<Uri, Data> {

    /* renamed from: b */
    private static final Set<String> f23581b = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"file", "android.resource", "content"})));

    /* renamed from: a */
    private final LocalUriFetcherFactory<Data> f23582a;

    public interface LocalUriFetcherFactory<Data> {
        DataFetcher<Data> build(Uri uri);
    }

    /* renamed from: com.bumptech.glide.load.model.UriLoader$a */
    public static final class C9046a implements ModelLoaderFactory<Uri, AssetFileDescriptor>, LocalUriFetcherFactory<AssetFileDescriptor> {

        /* renamed from: a */
        private final ContentResolver f23583a;

        public C9046a(ContentResolver contentResolver) {
            this.f23583a = contentResolver;
        }

        public ModelLoader<Uri, AssetFileDescriptor> build(C9068i iVar) {
            return new UriLoader(this);
        }

        public void teardown() {
        }

        public DataFetcher<AssetFileDescriptor> build(Uri uri) {
            return new C8886a(this.f23583a, uri);
        }
    }

    /* renamed from: com.bumptech.glide.load.model.UriLoader$b */
    public static class C9047b implements ModelLoaderFactory<Uri, ParcelFileDescriptor>, LocalUriFetcherFactory<ParcelFileDescriptor> {

        /* renamed from: a */
        private final ContentResolver f23584a;

        public C9047b(ContentResolver contentResolver) {
            this.f23584a = contentResolver;
        }

        public DataFetcher<ParcelFileDescriptor> build(Uri uri) {
            return new C8894g(this.f23584a, uri);
        }

        public void teardown() {
        }

        public ModelLoader<Uri, ParcelFileDescriptor> build(C9068i iVar) {
            return new UriLoader(this);
        }
    }

    /* renamed from: com.bumptech.glide.load.model.UriLoader$c */
    public static class C9048c implements ModelLoaderFactory<Uri, InputStream>, LocalUriFetcherFactory<InputStream> {

        /* renamed from: a */
        private final ContentResolver f23585a;

        public C9048c(ContentResolver contentResolver) {
            this.f23585a = contentResolver;
        }

        public DataFetcher<InputStream> build(Uri uri) {
            return new C8902l(this.f23585a, uri);
        }

        public void teardown() {
        }

        public ModelLoader<Uri, InputStream> build(C9068i iVar) {
            return new UriLoader(this);
        }
    }

    public UriLoader(LocalUriFetcherFactory<Data> localUriFetcherFactory) {
        this.f23582a = localUriFetcherFactory;
    }

    /* renamed from: a */
    public C9045a<Data> buildLoadData(Uri uri, int i, int i2, C9011f fVar) {
        return new C9045a<>(new C9202d(uri), this.f23582a.build(uri));
    }

    /* renamed from: a */
    public boolean handles(Uri uri) {
        return f23581b.contains(uri.getScheme());
    }
}
