package com.mapbox.mapboxsdk.http;

public interface HttpRequest {
    void cancelRequest();

    void executeRequest(HttpResponder httpResponder, long j, String str, String str2, String str3);
}
