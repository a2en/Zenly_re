package okhttp3;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public interface Interceptor {

    public interface Chain {
        Call call();

        int connectTimeoutMillis();

        Connection connection();

        C13167a0 proceed(C13331y yVar) throws IOException;

        int readTimeoutMillis();

        C13331y request();

        Chain withConnectTimeout(int i, TimeUnit timeUnit);

        Chain withReadTimeout(int i, TimeUnit timeUnit);

        Chain withWriteTimeout(int i, TimeUnit timeUnit);

        int writeTimeoutMillis();
    }

    C13167a0 intercept(Chain chain) throws IOException;
}
