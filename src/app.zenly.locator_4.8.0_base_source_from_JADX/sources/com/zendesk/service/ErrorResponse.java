package com.zendesk.service;

import java.util.List;

public interface ErrorResponse {
    String getReason();

    String getResponseBody();

    String getResponseBodyType();

    List<C12005b> getResponseHeaders();

    int getStatus();

    String getUrl();

    @Deprecated
    boolean isConversionError();

    boolean isHTTPError();

    @Deprecated
    boolean isNetworkError();
}
