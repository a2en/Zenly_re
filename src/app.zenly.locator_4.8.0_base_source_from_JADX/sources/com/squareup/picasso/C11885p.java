package com.squareup.picasso;

import android.content.Context;
import android.net.Uri;
import com.squareup.okhttp.Cache;
import com.squareup.okhttp.CacheControl;
import com.squareup.okhttp.CacheControl.Builder;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.ResponseBody;
import com.squareup.picasso.Downloader.C11841a;
import com.squareup.picasso.Downloader.ResponseException;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* renamed from: com.squareup.picasso.p */
public class C11885p implements Downloader {

    /* renamed from: a */
    private final OkHttpClient f30797a;

    public C11885p(Context context) {
        this(C11851a0.m31115b(context));
    }

    /* renamed from: a */
    private static OkHttpClient m31212a() {
        OkHttpClient okHttpClient = new OkHttpClient();
        okHttpClient.setConnectTimeout(15000, TimeUnit.MILLISECONDS);
        okHttpClient.setReadTimeout(20000, TimeUnit.MILLISECONDS);
        okHttpClient.setWriteTimeout(20000, TimeUnit.MILLISECONDS);
        return okHttpClient;
    }

    public C11841a load(Uri uri, int i) throws IOException {
        CacheControl cacheControl;
        if (i == 0) {
            cacheControl = null;
        } else if (C11882n.m31204a(i)) {
            cacheControl = CacheControl.FORCE_CACHE;
        } else {
            Builder builder = new Builder();
            if (!C11882n.m31205b(i)) {
                builder.noCache();
            }
            if (!C11882n.m31206c(i)) {
                builder.noStore();
            }
            cacheControl = builder.build();
        }
        Request.Builder url = new Request.Builder().url(uri.toString());
        if (cacheControl != null) {
            url.cacheControl(cacheControl);
        }
        Response execute = this.f30797a.newCall(url.build()).execute();
        int code = execute.code();
        if (code < 300) {
            boolean z = execute.cacheResponse() != null;
            ResponseBody body = execute.body();
            return new C11841a(body.byteStream(), z, body.contentLength());
        }
        execute.body().close();
        StringBuilder sb = new StringBuilder();
        sb.append(code);
        sb.append(" ");
        sb.append(execute.message());
        throw new ResponseException(sb.toString(), i, code);
    }

    public void shutdown() {
        Cache cache = this.f30797a.getCache();
        if (cache != null) {
            try {
                cache.close();
            } catch (IOException unused) {
            }
        }
    }

    public C11885p(File file) {
        this(file, C11851a0.m31101a(file));
    }

    public C11885p(File file, long j) {
        this(m31212a());
        try {
            this.f30797a.setCache(new Cache(file, j));
        } catch (IOException unused) {
        }
    }

    public C11885p(OkHttpClient okHttpClient) {
        this.f30797a = okHttpClient;
    }
}
