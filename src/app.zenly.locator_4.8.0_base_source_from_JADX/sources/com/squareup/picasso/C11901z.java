package com.squareup.picasso;

import android.content.Context;
import android.net.Uri;
import android.net.http.HttpResponseCache;
import android.os.Build.VERSION;
import com.squareup.picasso.Downloader.C11841a;
import com.squareup.picasso.Downloader.ResponseException;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* renamed from: com.squareup.picasso.z */
public class C11901z implements Downloader {

    /* renamed from: b */
    static volatile Object f30889b;

    /* renamed from: c */
    private static final Object f30890c = new Object();

    /* renamed from: d */
    private static final ThreadLocal<StringBuilder> f30891d = new C11902a();

    /* renamed from: a */
    private final Context f30892a;

    /* renamed from: com.squareup.picasso.z$a */
    static class C11902a extends ThreadLocal<StringBuilder> {
        C11902a() {
        }

        /* access modifiers changed from: protected */
        public StringBuilder initialValue() {
            return new StringBuilder();
        }
    }

    /* renamed from: com.squareup.picasso.z$b */
    private static class C11903b {
        /* renamed from: a */
        static Object m31279a(Context context) throws IOException {
            File b = C11851a0.m31115b(context);
            HttpResponseCache installed = HttpResponseCache.getInstalled();
            return installed == null ? HttpResponseCache.install(b, C11851a0.m31101a(b)) : installed;
        }

        /* renamed from: a */
        static void m31280a(Object obj) {
            try {
                ((HttpResponseCache) obj).close();
            } catch (IOException unused) {
            }
        }
    }

    public C11901z(Context context) {
        this.f30892a = context.getApplicationContext();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public HttpURLConnection mo35184a(Uri uri) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri.toString()).openConnection();
        httpURLConnection.setConnectTimeout(15000);
        httpURLConnection.setReadTimeout(20000);
        return httpURLConnection;
    }

    public C11841a load(Uri uri, int i) throws IOException {
        String str;
        if (VERSION.SDK_INT >= 14) {
            m31277a(this.f30892a);
        }
        HttpURLConnection a = mo35184a(uri);
        a.setUseCaches(true);
        if (i != 0) {
            if (C11882n.m31204a(i)) {
                str = "only-if-cached,max-age=2147483647";
            } else {
                StringBuilder sb = (StringBuilder) f30891d.get();
                sb.setLength(0);
                if (!C11882n.m31205b(i)) {
                    sb.append("no-cache");
                }
                if (!C11882n.m31206c(i)) {
                    if (sb.length() > 0) {
                        sb.append(',');
                    }
                    sb.append("no-store");
                }
                str = sb.toString();
            }
            a.setRequestProperty("Cache-Control", str);
        }
        int responseCode = a.getResponseCode();
        if (responseCode < 300) {
            long headerFieldInt = (long) a.getHeaderFieldInt("Content-Length", -1);
            return new C11841a(a.getInputStream(), C11851a0.m31114a(a.getHeaderField("X-Android-Response-Source")), headerFieldInt);
        }
        a.disconnect();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(responseCode);
        sb2.append(" ");
        sb2.append(a.getResponseMessage());
        throw new ResponseException(sb2.toString(), i, responseCode);
    }

    public void shutdown() {
        if (VERSION.SDK_INT >= 14 && f30889b != null) {
            C11903b.m31280a(f30889b);
        }
    }

    /* renamed from: a */
    private static void m31277a(Context context) {
        if (f30889b == null) {
            try {
                synchronized (f30890c) {
                    if (f30889b == null) {
                        f30889b = C11903b.m31279a(context);
                    }
                }
            } catch (IOException unused) {
            }
        }
    }
}
