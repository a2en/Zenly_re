package okhttp3.internal.connection;

import java.io.IOException;
import okhttp3.C13167a0;
import okhttp3.C13325v;
import okhttp3.C13331y;
import okhttp3.Interceptor;
import okhttp3.Interceptor.Chain;
import okhttp3.internal.http.C13250f;

/* renamed from: okhttp3.internal.connection.b */
public final class C13229b implements Interceptor {
    public C13229b(C13325v vVar) {
    }

    public C13167a0 intercept(Chain chain) throws IOException {
        C13250f fVar = (C13250f) chain;
        C13331y request = fVar.request();
        C13241j b = fVar.mo38073b();
        return fVar.mo38071a(request, b, b.mo38056a(chain, !request.mo38387e().equals("GET")));
    }
}
