package zendesk.core;

import android.content.Context;
import com.zendesk.util.C12014d;
import com.zendesk.util.C12017g;
import java.io.IOException;
import java.util.Locale;
import okhttp3.C13167a0;
import okhttp3.C13331y;
import okhttp3.C13331y.C13332a;
import okhttp3.Interceptor;
import okhttp3.Interceptor.Chain;

class AcceptLanguageHeaderInterceptor implements Interceptor {
    private Context context;

    public AcceptLanguageHeaderInterceptor(Context context2) {
        this.context = context2;
    }

    public C13167a0 intercept(Chain chain) throws IOException {
        C13331y request = chain.request();
        Locale currentLocale = DeviceInfo.getCurrentLocale(this.context);
        String str = "Accept-Language";
        if (!C12017g.m31659c(request.mo38381a(str)) || currentLocale == null) {
            return chain.proceed(request);
        }
        C13332a f = request.mo38388f();
        f.mo38394a(str, C12014d.m31647a(currentLocale));
        return chain.proceed(f.mo38400a());
    }
}
