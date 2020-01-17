package com.mapbox.mapboxsdk.p320n.p321a;

import android.os.Build;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.mapbox.mapboxsdk.http.C11464a;
import com.mapbox.mapboxsdk.http.C11465b;
import com.mapbox.mapboxsdk.http.C11466c;
import com.mapbox.mapboxsdk.http.HttpRequest;
import com.mapbox.mapboxsdk.http.HttpResponder;
import com.mapbox.mapboxsdk.p317m.C11493a;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import javax.net.ssl.SSLException;
import okhttp3.C13167a0;
import okhttp3.C13170b0;
import okhttp3.C13312n;
import okhttp3.C13319s;
import okhttp3.C13325v;
import okhttp3.C13325v.C13327b;
import okhttp3.C13331y.C13332a;
import okhttp3.Call;
import okhttp3.Callback;

/* renamed from: com.mapbox.mapboxsdk.n.a.a */
public class C11577a implements HttpRequest {

    /* renamed from: b */
    private static final String f30036b = C11579b.m30309a(String.format("%s %s (%s) Android/%s (%s)", new Object[]{C11464a.m29600a(), "Mapbox/7.3.0", "4260644", Integer.valueOf(VERSION.SDK_INT), Build.CPU_ABI}));

    /* renamed from: c */
    private static C13325v f30037c;

    /* renamed from: a */
    private Call f30038a;

    /* renamed from: com.mapbox.mapboxsdk.n.a.a$a */
    private static class C11578a implements Callback {

        /* renamed from: a */
        private HttpResponder f30039a;

        C11578a(HttpResponder httpResponder) {
            this.f30039a = httpResponder;
        }

        public void onFailure(Call call, IOException iOException) {
            m30308a(call, iOException);
        }

        public void onResponse(Call call, C13167a0 a0Var) {
            if (a0Var.mo37796g()) {
                C11465b.m29602a(2, String.format("[HTTP] Request was successful (code = %s).", new Object[]{Integer.valueOf(a0Var.mo37793d())}));
            } else {
                C11465b.m29602a(3, String.format("[HTTP] Request with response = %s: %s", new Object[]{Integer.valueOf(a0Var.mo37793d()), !TextUtils.isEmpty(a0Var.mo37797h()) ? a0Var.mo37797h() : "No additional information"}));
            }
            C13170b0 a = a0Var.mo37789a();
            if (a == null) {
                C11465b.m29602a(6, "[HTTP] Received empty response body");
                return;
            }
            try {
                byte[] b = a.mo37824b();
                a0Var.close();
                this.f30039a.onResponse(a0Var.mo37793d(), a0Var.mo37787a("ETag"), a0Var.mo37787a("Last-Modified"), a0Var.mo37787a("Cache-Control"), a0Var.mo37787a("Expires"), a0Var.mo37787a("Retry-After"), a0Var.mo37787a("x-rate-limit-reset"), b);
            } catch (IOException e) {
                onFailure(call, e);
                a0Var.close();
            } catch (Throwable th) {
                a0Var.close();
                throw th;
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m30308a(Call call, Exception exc) {
            String message = exc.getMessage() != null ? exc.getMessage() : "Error processing the request";
            int a = m30306a(exc);
            if (!(!C11465b.f29649b || call == null || call.request() == null)) {
                C11465b.m29603a(a, message, call.request().mo38389g().toString());
            }
            this.f30039a.handleFailure(a, message);
        }

        /* renamed from: a */
        private int m30306a(Exception exc) {
            if ((exc instanceof NoRouteToHostException) || (exc instanceof UnknownHostException) || (exc instanceof SocketException) || (exc instanceof ProtocolException) || (exc instanceof SSLException)) {
                return 0;
            }
            return exc instanceof InterruptedIOException ? 1 : 2;
        }
    }

    static {
        C13327b bVar = new C13327b();
        bVar.mo38365a(m30305a());
        f30037c = bVar.mo38367a();
    }

    /* renamed from: a */
    private static C13312n m30305a() {
        C13312n nVar = new C13312n();
        nVar.mo38244a(20);
        return nVar;
    }

    public void cancelRequest() {
        Call call = this.f30038a;
        if (call != null) {
            call.cancel();
        }
    }

    public void executeRequest(HttpResponder httpResponder, long j, String str, String str2, String str3) {
        C11578a aVar = new C11578a(httpResponder);
        try {
            C13319s f = C13319s.m35127f(str);
            if (f == null) {
                C11465b.m29602a(6, String.format("[HTTP] Unable to parse resourceUrl %s", new Object[]{str}));
                return;
            }
            String a = C11466c.m29604a(f.mo38288g().toLowerCase(C11493a.f29721a), str, f.mo38295m());
            C13332a aVar2 = new C13332a();
            aVar2.mo38402b(a);
            aVar2.mo38392a((Object) a.toLowerCase(C11493a.f29721a));
            aVar2.mo38394a("User-Agent", f30036b);
            if (str2.length() > 0) {
                aVar2.mo38394a("If-None-Match", str2);
            } else if (str3.length() > 0) {
                aVar2.mo38394a("If-Modified-Since", str3);
            }
            this.f30038a = f30037c.newCall(aVar2.mo38400a());
            this.f30038a.enqueue(aVar);
        } catch (Exception e) {
            aVar.m30308a(this.f30038a, e);
        }
    }
}
