package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import android.util.Log;
import com.bumptech.glide.C8859g;
import com.bumptech.glide.load.C8882a;
import com.bumptech.glide.load.data.DataFetcher.DataCallback;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.data.b */
public abstract class C8887b<T> implements DataFetcher<T> {

    /* renamed from: e */
    private final String f23183e;

    /* renamed from: f */
    private final AssetManager f23184f;

    /* renamed from: g */
    private T f23185g;

    public C8887b(AssetManager assetManager, String str) {
        this.f23184f = assetManager;
        this.f23183e = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo24247a(AssetManager assetManager, String str) throws IOException;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo24248a(T t) throws IOException;

    public void cancel() {
    }

    public void cleanup() {
        T t = this.f23185g;
        if (t != null) {
            try {
                mo24248a(t);
            } catch (IOException unused) {
            }
        }
    }

    public C8882a getDataSource() {
        return C8882a.LOCAL;
    }

    public void loadData(C8859g gVar, DataCallback<? super T> dataCallback) {
        try {
            this.f23185g = mo24247a(this.f23184f, this.f23183e);
            dataCallback.onDataReady(this.f23185g);
        } catch (IOException e) {
            String str = "AssetPathFetcher";
            if (Log.isLoggable(str, 3)) {
                Log.d(str, "Failed to load data from asset manager", e);
            }
            dataCallback.onLoadFailed(e);
        }
    }
}
