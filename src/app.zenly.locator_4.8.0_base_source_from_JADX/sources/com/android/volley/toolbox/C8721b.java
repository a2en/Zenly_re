package com.android.volley.toolbox;

import com.android.volley.AuthFailureError;
import com.android.volley.C8713d;
import com.android.volley.Request;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Map;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolVersion;
import org.apache.http.entity.BasicHttpEntity;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.message.BasicStatusLine;

/* renamed from: com.android.volley.toolbox.b */
public abstract class C8721b implements HttpStack {
    /* renamed from: a */
    public abstract C8731h mo23585a(Request<?> request, Map<String, String> map) throws IOException, AuthFailureError;

    @Deprecated
    public final HttpResponse performRequest(Request<?> request, Map<String, String> map) throws IOException, AuthFailureError {
        C8731h a = mo23585a(request, map);
        BasicHttpResponse basicHttpResponse = new BasicHttpResponse(new BasicStatusLine(new ProtocolVersion("HTTP", 1, 1), a.mo23609d(), ""));
        ArrayList arrayList = new ArrayList();
        for (C8713d dVar : a.mo23608c()) {
            arrayList.add(new BasicHeader(dVar.mo23571a(), dVar.mo23572b()));
        }
        basicHttpResponse.setHeaders((Header[]) arrayList.toArray(new Header[arrayList.size()]));
        InputStream a2 = a.mo23606a();
        if (a2 != null) {
            BasicHttpEntity basicHttpEntity = new BasicHttpEntity();
            basicHttpEntity.setContent(a2);
            basicHttpEntity.setContentLength((long) a.mo23607b());
            basicHttpResponse.setEntity(basicHttpEntity);
        }
        return basicHttpResponse;
    }
}
