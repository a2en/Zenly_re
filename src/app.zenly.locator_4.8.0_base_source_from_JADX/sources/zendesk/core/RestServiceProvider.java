package zendesk.core;

import okhttp3.C13325v;

public interface RestServiceProvider {
    <E> E createRestService(Class<E> cls, String str, String str2);

    <E> E createRestService(Class<E> cls, String str, String str2, CustomNetworkConfig customNetworkConfig);

    C13325v getMediaOkHttpClient();
}
