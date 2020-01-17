package com.bumptech.glide.load.data;

import android.text.TextUtils;
import android.util.Log;
import com.appsflyer.share.Constants;
import com.bumptech.glide.C8859g;
import com.bumptech.glide.load.C8882a;
import com.bumptech.glide.load.HttpException;
import com.bumptech.glide.load.data.DataFetcher.DataCallback;
import com.bumptech.glide.load.model.C9053c;
import com.bumptech.glide.p301o.C9207c;
import com.bumptech.glide.p301o.C9212f;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.bumptech.glide.load.data.h */
public class C8895h implements DataFetcher<InputStream> {

    /* renamed from: k */
    static final C8897b f23198k = new C8896a();

    /* renamed from: e */
    private final C9053c f23199e;

    /* renamed from: f */
    private final int f23200f;

    /* renamed from: g */
    private final C8897b f23201g;

    /* renamed from: h */
    private HttpURLConnection f23202h;

    /* renamed from: i */
    private InputStream f23203i;

    /* renamed from: j */
    private volatile boolean f23204j;

    /* renamed from: com.bumptech.glide.load.data.h$a */
    private static class C8896a implements C8897b {
        C8896a() {
        }

        /* renamed from: a */
        public HttpURLConnection mo24264a(URL url) throws IOException {
            return (HttpURLConnection) url.openConnection();
        }
    }

    /* renamed from: com.bumptech.glide.load.data.h$b */
    interface C8897b {
        /* renamed from: a */
        HttpURLConnection mo24264a(URL url) throws IOException;
    }

    public C8895h(C9053c cVar, int i) {
        this(cVar, i, f23198k);
    }

    /* renamed from: a */
    private InputStream m21349a(URL url, int i, URL url2, Map<String, String> map) throws IOException {
        if (i < 5) {
            if (url2 != null) {
                try {
                    if (url.toURI().equals(url2.toURI())) {
                        throw new HttpException("In re-direct loop");
                    }
                } catch (URISyntaxException unused) {
                }
            }
            this.f23202h = this.f23201g.mo24264a(url);
            for (Entry entry : map.entrySet()) {
                this.f23202h.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            this.f23202h.setConnectTimeout(this.f23200f);
            this.f23202h.setReadTimeout(this.f23200f);
            this.f23202h.setUseCaches(false);
            this.f23202h.setDoInput(true);
            this.f23202h.setInstanceFollowRedirects(false);
            this.f23202h.connect();
            this.f23203i = this.f23202h.getInputStream();
            if (this.f23204j) {
                return null;
            }
            int responseCode = this.f23202h.getResponseCode();
            if (m21350a(responseCode)) {
                return m21348a(this.f23202h);
            }
            if (m21351b(responseCode)) {
                String headerField = this.f23202h.getHeaderField(Constants.HTTP_REDIRECT_URL_HEADER_FIELD);
                if (!TextUtils.isEmpty(headerField)) {
                    URL url3 = new URL(url, headerField);
                    cleanup();
                    return m21349a(url3, i + 1, url, map);
                }
                throw new HttpException("Received empty or null redirect url");
            } else if (responseCode == -1) {
                throw new HttpException(responseCode);
            } else {
                throw new HttpException(this.f23202h.getResponseMessage(), responseCode);
            }
        } else {
            throw new HttpException("Too many (> 5) redirects!");
        }
    }

    /* renamed from: b */
    private static boolean m21351b(int i) {
        return i / 100 == 3;
    }

    public void cancel() {
        this.f23204j = true;
    }

    public void cleanup() {
        InputStream inputStream = this.f23203i;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f23202h;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f23202h = null;
    }

    public Class<InputStream> getDataClass() {
        return InputStream.class;
    }

    public C8882a getDataSource() {
        return C8882a.REMOTE;
    }

    public void loadData(C8859g gVar, DataCallback<? super InputStream> dataCallback) {
        StringBuilder sb;
        String str = "Finished http url fetcher fetch in ";
        String str2 = "HttpUrlFetcher";
        long a = C9212f.m22072a();
        try {
            dataCallback.onDataReady(m21349a(this.f23199e.mo24561c(), 0, null, this.f23199e.mo24560b()));
            if (Log.isLoggable(str2, 2)) {
                sb = new StringBuilder();
                sb.append(str);
                sb.append(C9212f.m22071a(a));
                Log.v(str2, sb.toString());
            }
        } catch (IOException e) {
            if (Log.isLoggable(str2, 3)) {
                Log.d(str2, "Failed to load data for url", e);
            }
            dataCallback.onLoadFailed(e);
            if (Log.isLoggable(str2, 2)) {
                sb = new StringBuilder();
            }
        } catch (Throwable th) {
            if (Log.isLoggable(str2, 2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(C9212f.m22071a(a));
                Log.v(str2, sb2.toString());
            }
            throw th;
        }
    }

    C8895h(C9053c cVar, int i, C8897b bVar) {
        this.f23199e = cVar;
        this.f23200f = i;
        this.f23201g = bVar;
    }

    /* renamed from: a */
    private static boolean m21350a(int i) {
        return i / 100 == 2;
    }

    /* renamed from: a */
    private InputStream m21348a(HttpURLConnection httpURLConnection) throws IOException {
        if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
            this.f23203i = C9207c.m22065a(httpURLConnection.getInputStream(), (long) httpURLConnection.getContentLength());
        } else {
            String str = "HttpUrlFetcher";
            if (Log.isLoggable(str, 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Got non empty content encoding: ");
                sb.append(httpURLConnection.getContentEncoding());
                Log.d(str, sb.toString());
            }
            this.f23203i = httpURLConnection.getInputStream();
        }
        return this.f23203i;
    }
}
