package com.android.volley.toolbox;

import com.android.volley.AuthFailureError;
import com.android.volley.C8713d;
import com.android.volley.Request;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Map;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.conn.ConnectTimeoutException;

/* renamed from: com.android.volley.toolbox.a */
class C8720a extends C8721b {

    /* renamed from: a */
    private final HttpStack f22472a;

    C8720a(HttpStack httpStack) {
        this.f22472a = httpStack;
    }

    /* renamed from: a */
    public C8731h mo23585a(Request<?> request, Map<String, String> map) throws IOException, AuthFailureError {
        try {
            HttpResponse performRequest = this.f22472a.performRequest(request, map);
            int statusCode = performRequest.getStatusLine().getStatusCode();
            Header[] allHeaders = performRequest.getAllHeaders();
            ArrayList arrayList = new ArrayList(allHeaders.length);
            for (Header header : allHeaders) {
                arrayList.add(new C8713d(header.getName(), header.getValue()));
            }
            if (performRequest.getEntity() == null) {
                return new C8731h(statusCode, arrayList);
            }
            long contentLength = performRequest.getEntity().getContentLength();
            if (((long) ((int) contentLength)) == contentLength) {
                return new C8731h(statusCode, arrayList, (int) performRequest.getEntity().getContentLength(), performRequest.getEntity().getContent());
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Response too large: ");
            sb.append(contentLength);
            throw new IOException(sb.toString());
        } catch (ConnectTimeoutException e) {
            throw new SocketTimeoutException(e.getMessage());
        }
    }
}
