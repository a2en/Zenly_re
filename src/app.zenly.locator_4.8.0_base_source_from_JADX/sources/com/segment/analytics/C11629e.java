package com.segment.analytics;

import android.util.Base64;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* renamed from: com.segment.analytics.e */
public class C11629e {
    /* renamed from: e */
    private String m30479e(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("Basic ");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(":");
        sb.append(Base64.encodeToString(sb2.toString().getBytes(), 2));
        return sb.toString();
    }

    /* renamed from: a */
    public HttpURLConnection mo34293a(String str) throws IOException {
        HttpURLConnection b = mo34294b("https://mobile-service.segment.com/v1/attribution");
        b.setRequestProperty("Authorization", m30479e(str));
        b.setRequestMethod("POST");
        b.setDoOutput(true);
        return b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public HttpURLConnection mo34294b(String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setConnectTimeout(15000);
        httpURLConnection.setReadTimeout(20000);
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setDoInput(true);
        return httpURLConnection;
    }

    /* renamed from: c */
    public HttpURLConnection mo34295c(String str) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append("https://cdn-settings.segment.com/v1/projects/");
        sb.append(str);
        sb.append("/settings");
        return mo34294b(sb.toString());
    }

    /* renamed from: d */
    public HttpURLConnection mo34296d(String str) throws IOException {
        HttpURLConnection b = mo34294b("https://api.segment.io/v1/import");
        b.setRequestProperty("Authorization", m30479e(str));
        b.setRequestProperty("Content-Encoding", "gzip");
        b.setDoOutput(true);
        b.setChunkedStreamingMode(0);
        return b;
    }
}
