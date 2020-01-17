package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.C8859g;
import com.bumptech.glide.load.C8882a;
import com.bumptech.glide.load.data.DataFetcher.DataCallback;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.data.j */
public abstract class C8900j<T> implements DataFetcher<T> {

    /* renamed from: e */
    private final Uri f23207e;

    /* renamed from: f */
    private final ContentResolver f23208f;

    /* renamed from: g */
    private T f23209g;

    public C8900j(ContentResolver contentResolver, Uri uri) {
        this.f23208f = contentResolver;
        this.f23207e = uri;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo24244a(Uri uri, ContentResolver contentResolver) throws FileNotFoundException;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo24246a(T t) throws IOException;

    public void cancel() {
    }

    public void cleanup() {
        T t = this.f23209g;
        if (t != null) {
            try {
                mo24246a(t);
            } catch (IOException unused) {
            }
        }
    }

    public C8882a getDataSource() {
        return C8882a.LOCAL;
    }

    public final void loadData(C8859g gVar, DataCallback<? super T> dataCallback) {
        try {
            this.f23209g = mo24244a(this.f23207e, this.f23208f);
            dataCallback.onDataReady(this.f23209g);
        } catch (FileNotFoundException e) {
            String str = "LocalUriFetcher";
            if (Log.isLoggable(str, 3)) {
                Log.d(str, "Failed to open Uri", e);
            }
            dataCallback.onLoadFailed(e);
        }
    }
}
