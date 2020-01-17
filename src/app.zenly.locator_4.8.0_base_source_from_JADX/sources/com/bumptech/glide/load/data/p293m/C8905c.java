package com.bumptech.glide.load.data.p293m;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore.Images.Thumbnails;
import android.provider.MediaStore.Video;
import android.util.Log;
import com.bumptech.glide.C8859g;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.C8882a;
import com.bumptech.glide.load.data.C8892e;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.data.DataFetcher.DataCallback;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.data.m.c */
public class C8905c implements DataFetcher<InputStream> {

    /* renamed from: e */
    private final Uri f23211e;

    /* renamed from: f */
    private final C8909e f23212f;

    /* renamed from: g */
    private InputStream f23213g;

    /* renamed from: com.bumptech.glide.load.data.m.c$a */
    static class C8906a implements C8908d {

        /* renamed from: b */
        private static final String[] f23214b = {"_data"};

        /* renamed from: a */
        private final ContentResolver f23215a;

        C8906a(ContentResolver contentResolver) {
            this.f23215a = contentResolver;
        }

        /* renamed from: a */
        public Cursor mo24271a(Uri uri) {
            String lastPathSegment = uri.getLastPathSegment();
            return this.f23215a.query(Thumbnails.EXTERNAL_CONTENT_URI, f23214b, "kind = 1 AND image_id = ?", new String[]{lastPathSegment}, null);
        }
    }

    /* renamed from: com.bumptech.glide.load.data.m.c$b */
    static class C8907b implements C8908d {

        /* renamed from: b */
        private static final String[] f23216b = {"_data"};

        /* renamed from: a */
        private final ContentResolver f23217a;

        C8907b(ContentResolver contentResolver) {
            this.f23217a = contentResolver;
        }

        /* renamed from: a */
        public Cursor mo24271a(Uri uri) {
            String lastPathSegment = uri.getLastPathSegment();
            return this.f23217a.query(Video.Thumbnails.EXTERNAL_CONTENT_URI, f23216b, "kind = 1 AND video_id = ?", new String[]{lastPathSegment}, null);
        }
    }

    C8905c(Uri uri, C8909e eVar) {
        this.f23211e = uri;
        this.f23212f = eVar;
    }

    /* renamed from: a */
    public static C8905c m21375a(Context context, Uri uri) {
        return m21376a(context, uri, new C8906a(context.getContentResolver()));
    }

    /* renamed from: b */
    public static C8905c m21378b(Context context, Uri uri) {
        return m21376a(context, uri, new C8907b(context.getContentResolver()));
    }

    public void cancel() {
    }

    public void cleanup() {
        InputStream inputStream = this.f23213g;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    public Class<InputStream> getDataClass() {
        return InputStream.class;
    }

    public C8882a getDataSource() {
        return C8882a.LOCAL;
    }

    public void loadData(C8859g gVar, DataCallback<? super InputStream> dataCallback) {
        try {
            this.f23213g = m21377a();
            dataCallback.onDataReady(this.f23213g);
        } catch (FileNotFoundException e) {
            String str = "MediaStoreThumbFetcher";
            if (Log.isLoggable(str, 3)) {
                Log.d(str, "Failed to find thumbnail file", e);
            }
            dataCallback.onLoadFailed(e);
        }
    }

    /* renamed from: a */
    private static C8905c m21376a(Context context, Uri uri, C8908d dVar) {
        return new C8905c(uri, new C8909e(Glide.m21128a(context).mo24095g().mo24115a(), dVar, Glide.m21128a(context).mo24089b(), context.getContentResolver()));
    }

    /* renamed from: a */
    private InputStream m21377a() throws FileNotFoundException {
        InputStream b = this.f23212f.mo24273b(this.f23211e);
        int a = b != null ? this.f23212f.mo24272a(this.f23211e) : -1;
        return a != -1 ? new C8892e(b, a) : b;
    }
}
