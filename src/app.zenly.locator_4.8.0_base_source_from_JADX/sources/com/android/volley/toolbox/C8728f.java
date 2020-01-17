package com.android.volley.toolbox;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import java.io.IOException;
import java.net.URI;
import java.util.Map;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpOptions;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpTrace;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

@Deprecated
/* renamed from: com.android.volley.toolbox.f */
public class C8728f implements HttpStack {

    /* renamed from: a */
    protected final HttpClient f22495a;

    /* renamed from: com.android.volley.toolbox.f$a */
    public static final class C8729a extends HttpEntityEnclosingRequestBase {
        public C8729a(String str) {
            setURI(URI.create(str));
        }

        public String getMethod() {
            return "PATCH";
        }
    }

    public C8728f(HttpClient httpClient) {
        this.f22495a = httpClient;
    }

    /* renamed from: a */
    private static void m20559a(HttpUriRequest httpUriRequest, Map<String, String> map) {
        for (String str : map.keySet()) {
            httpUriRequest.setHeader(str, (String) map.get(str));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo23604a(HttpUriRequest httpUriRequest) throws IOException {
    }

    public HttpResponse performRequest(Request<?> request, Map<String, String> map) throws IOException, AuthFailureError {
        HttpUriRequest a = m20557a(request, map);
        m20559a(a, map);
        m20559a(a, request.getHeaders());
        mo23604a(a);
        HttpParams params = a.getParams();
        int timeoutMs = request.getTimeoutMs();
        HttpConnectionParams.setConnectionTimeout(params, 5000);
        HttpConnectionParams.setSoTimeout(params, timeoutMs);
        return this.f22495a.execute(a);
    }

    /* renamed from: a */
    static HttpUriRequest m20557a(Request<?> request, Map<String, String> map) throws AuthFailureError {
        String str = "Content-Type";
        switch (request.getMethod()) {
            case -1:
                byte[] postBody = request.getPostBody();
                if (postBody == null) {
                    return new HttpGet(request.getUrl());
                }
                HttpPost httpPost = new HttpPost(request.getUrl());
                httpPost.addHeader(str, request.getPostBodyContentType());
                httpPost.setEntity(new ByteArrayEntity(postBody));
                return httpPost;
            case 0:
                return new HttpGet(request.getUrl());
            case 1:
                HttpPost httpPost2 = new HttpPost(request.getUrl());
                httpPost2.addHeader(str, request.getBodyContentType());
                m20558a((HttpEntityEnclosingRequestBase) httpPost2, request);
                return httpPost2;
            case 2:
                HttpPut httpPut = new HttpPut(request.getUrl());
                httpPut.addHeader(str, request.getBodyContentType());
                m20558a((HttpEntityEnclosingRequestBase) httpPut, request);
                return httpPut;
            case 3:
                return new HttpDelete(request.getUrl());
            case 4:
                return new HttpHead(request.getUrl());
            case 5:
                return new HttpOptions(request.getUrl());
            case 6:
                return new HttpTrace(request.getUrl());
            case 7:
                C8729a aVar = new C8729a(request.getUrl());
                aVar.addHeader(str, request.getBodyContentType());
                m20558a((HttpEntityEnclosingRequestBase) aVar, request);
                return aVar;
            default:
                throw new IllegalStateException("Unknown request method.");
        }
    }

    /* renamed from: a */
    private static void m20558a(HttpEntityEnclosingRequestBase httpEntityEnclosingRequestBase, Request<?> request) throws AuthFailureError {
        byte[] body = request.getBody();
        if (body != null) {
            httpEntityEnclosingRequestBase.setEntity(new ByteArrayEntity(body));
        }
    }
}
