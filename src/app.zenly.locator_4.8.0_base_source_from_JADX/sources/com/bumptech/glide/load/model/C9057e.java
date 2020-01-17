package com.bumptech.glide.load.model;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.C8859g;
import com.bumptech.glide.load.C8882a;
import com.bumptech.glide.load.C9011f;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.data.DataFetcher.DataCallback;
import com.bumptech.glide.load.data.p293m.C8904b;
import com.bumptech.glide.load.model.ModelLoader.C9045a;
import com.bumptech.glide.p300n.C9202d;
import java.io.File;
import java.io.FileNotFoundException;

/* renamed from: com.bumptech.glide.load.model.e */
public final class C9057e implements ModelLoader<Uri, File> {

    /* renamed from: a */
    private final Context f23600a;

    /* renamed from: com.bumptech.glide.load.model.e$a */
    public static final class C9058a implements ModelLoaderFactory<Uri, File> {

        /* renamed from: a */
        private final Context f23601a;

        public C9058a(Context context) {
            this.f23601a = context;
        }

        public ModelLoader<Uri, File> build(C9068i iVar) {
            return new C9057e(this.f23601a);
        }

        public void teardown() {
        }
    }

    /* renamed from: com.bumptech.glide.load.model.e$b */
    private static class C9059b implements DataFetcher<File> {

        /* renamed from: g */
        private static final String[] f23602g = {"_data"};

        /* renamed from: e */
        private final Context f23603e;

        /* renamed from: f */
        private final Uri f23604f;

        C9059b(Context context, Uri uri) {
            this.f23603e = context;
            this.f23604f = uri;
        }

        public void cancel() {
        }

        public void cleanup() {
        }

        public Class<File> getDataClass() {
            return File.class;
        }

        public C8882a getDataSource() {
            return C8882a.LOCAL;
        }

        public void loadData(C8859g gVar, DataCallback<? super File> dataCallback) {
            Cursor query = this.f23603e.getContentResolver().query(this.f23604f, f23602g, null, null, null);
            String str = null;
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        str = query.getString(query.getColumnIndexOrThrow("_data"));
                    }
                } finally {
                    query.close();
                }
            }
            if (TextUtils.isEmpty(str)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to find file path for: ");
                sb.append(this.f23604f);
                dataCallback.onLoadFailed(new FileNotFoundException(sb.toString()));
                return;
            }
            dataCallback.onDataReady(new File(str));
        }
    }

    public C9057e(Context context) {
        this.f23600a = context;
    }

    /* renamed from: a */
    public C9045a<File> buildLoadData(Uri uri, int i, int i2, C9011f fVar) {
        return new C9045a<>(new C9202d(uri), new C9059b(this.f23600a, uri));
    }

    /* renamed from: a */
    public boolean handles(Uri uri) {
        return C8904b.m21372b(uri);
    }
}
