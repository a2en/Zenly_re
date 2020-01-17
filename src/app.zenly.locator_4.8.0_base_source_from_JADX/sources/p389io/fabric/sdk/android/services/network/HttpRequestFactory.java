package p389io.fabric.sdk.android.services.network;

import java.util.Map;

/* renamed from: io.fabric.sdk.android.services.network.HttpRequestFactory */
public interface HttpRequestFactory {
    HttpRequest buildHttpRequest(C12241c cVar, String str);

    HttpRequest buildHttpRequest(C12241c cVar, String str, Map<String, String> map);

    PinningInfoProvider getPinningInfoProvider();

    void setPinningInfoProvider(PinningInfoProvider pinningInfoProvider);
}
