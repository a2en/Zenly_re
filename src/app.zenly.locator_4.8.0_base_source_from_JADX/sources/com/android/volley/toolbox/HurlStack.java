package com.android.volley.toolbox;

import com.android.volley.AuthFailureError;
import com.android.volley.C8713d;
import com.android.volley.Request;
import java.io.DataOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

public class HurlStack extends C8721b {

    /* renamed from: a */
    private final UrlRewriter f22469a;

    /* renamed from: b */
    private final SSLSocketFactory f22470b;

    public interface UrlRewriter {
        String rewriteUrl(String str);
    }

    /* renamed from: com.android.volley.toolbox.HurlStack$a */
    static class C8719a extends FilterInputStream {

        /* renamed from: e */
        private final HttpURLConnection f22471e;

        C8719a(HttpURLConnection httpURLConnection) {
            super(HurlStack.m20520b(httpURLConnection));
            this.f22471e = httpURLConnection;
        }

        public void close() throws IOException {
            super.close();
            this.f22471e.disconnect();
        }
    }

    public HurlStack() {
        this(null);
    }

    /* renamed from: a */
    private static boolean m20519a(int i, int i2) {
        return (i == 4 || (100 <= i2 && i2 < 200) || i2 == 204 || i2 == 304) ? false : true;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static InputStream m20520b(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getInputStream();
        } catch (IOException unused) {
            return httpURLConnection.getErrorStream();
        }
    }

    public HurlStack(UrlRewriter urlRewriter) {
        this(urlRewriter, null);
    }

    /* renamed from: a */
    public C8731h mo23585a(Request<?> request, Map<String, String> map) throws IOException, AuthFailureError {
        String str;
        String url = request.getUrl();
        HashMap hashMap = new HashMap();
        hashMap.putAll(map);
        hashMap.putAll(request.getHeaders());
        UrlRewriter urlRewriter = this.f22469a;
        if (urlRewriter != null) {
            str = urlRewriter.rewriteUrl(url);
            if (str == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("URL blocked by rewriter: ");
                sb.append(url);
                throw new IOException(sb.toString());
            }
        } else {
            str = url;
        }
        HttpURLConnection a = m20515a(new URL(str), request);
        boolean z = false;
        try {
            for (String str2 : hashMap.keySet()) {
                a.setRequestProperty(str2, (String) hashMap.get(str2));
            }
            m20521b(a, request);
            int responseCode = a.getResponseCode();
            if (responseCode == -1) {
                throw new IOException("Could not retrieve response code from HttpUrlConnection.");
            } else if (!m20519a(request.getMethod(), responseCode)) {
                C8731h hVar = new C8731h(responseCode, m20516a(a.getHeaderFields()));
                a.disconnect();
                return hVar;
            } else {
                z = true;
                return new C8731h(responseCode, m20516a(a.getHeaderFields()), a.getContentLength(), new C8719a(a));
            }
        } catch (Throwable th) {
            if (!z) {
                a.disconnect();
            }
            throw th;
        }
    }

    public HurlStack(UrlRewriter urlRewriter, SSLSocketFactory sSLSocketFactory) {
        this.f22469a = urlRewriter;
        this.f22470b = sSLSocketFactory;
    }

    /* renamed from: b */
    static void m20521b(HttpURLConnection httpURLConnection, Request<?> request) throws IOException, AuthFailureError {
        String str = "POST";
        switch (request.getMethod()) {
            case -1:
                byte[] postBody = request.getPostBody();
                if (postBody != null) {
                    httpURLConnection.setRequestMethod(str);
                    m20518a(httpURLConnection, request, postBody);
                    return;
                }
                return;
            case 0:
                httpURLConnection.setRequestMethod("GET");
                return;
            case 1:
                httpURLConnection.setRequestMethod(str);
                m20517a(httpURLConnection, request);
                return;
            case 2:
                httpURLConnection.setRequestMethod("PUT");
                m20517a(httpURLConnection, request);
                return;
            case 3:
                httpURLConnection.setRequestMethod("DELETE");
                return;
            case 4:
                httpURLConnection.setRequestMethod("HEAD");
                return;
            case 5:
                httpURLConnection.setRequestMethod("OPTIONS");
                return;
            case 6:
                httpURLConnection.setRequestMethod("TRACE");
                return;
            case 7:
                httpURLConnection.setRequestMethod("PATCH");
                m20517a(httpURLConnection, request);
                return;
            default:
                throw new IllegalStateException("Unknown method type.");
        }
    }

    /* renamed from: a */
    static List<C8713d> m20516a(Map<String, List<String>> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Entry entry : map.entrySet()) {
            if (entry.getKey() != null) {
                for (String dVar : (List) entry.getValue()) {
                    arrayList.add(new C8713d((String) entry.getKey(), dVar));
                }
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public HttpURLConnection mo23586a(URL url) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
        return httpURLConnection;
    }

    /* renamed from: a */
    private HttpURLConnection m20515a(URL url, Request<?> request) throws IOException {
        HttpURLConnection a = mo23586a(url);
        int timeoutMs = request.getTimeoutMs();
        a.setConnectTimeout(timeoutMs);
        a.setReadTimeout(timeoutMs);
        a.setUseCaches(false);
        a.setDoInput(true);
        if ("https".equals(url.getProtocol())) {
            SSLSocketFactory sSLSocketFactory = this.f22470b;
            if (sSLSocketFactory != null) {
                ((HttpsURLConnection) a).setSSLSocketFactory(sSLSocketFactory);
            }
        }
        return a;
    }

    /* renamed from: a */
    private static void m20517a(HttpURLConnection httpURLConnection, Request<?> request) throws IOException, AuthFailureError {
        byte[] body = request.getBody();
        if (body != null) {
            m20518a(httpURLConnection, request, body);
        }
    }

    /* renamed from: a */
    private static void m20518a(HttpURLConnection httpURLConnection, Request<?> request, byte[] bArr) throws IOException {
        httpURLConnection.setDoOutput(true);
        String str = "Content-Type";
        if (!httpURLConnection.getRequestProperties().containsKey(str)) {
            httpURLConnection.setRequestProperty(str, request.getBodyContentType());
        }
        DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
        dataOutputStream.write(bArr);
        dataOutputStream.close();
    }
}
