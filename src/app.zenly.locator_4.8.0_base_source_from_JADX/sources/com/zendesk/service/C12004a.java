package com.zendesk.service;

import com.zendesk.util.C12010a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.zendesk.service.a */
public class C12004a implements ErrorResponse {

    /* renamed from: a */
    private final String f31279a;

    public C12004a(String str) {
        this.f31279a = str;
    }

    public String getReason() {
        return this.f31279a;
    }

    public String getResponseBody() {
        return this.f31279a;
    }

    public String getResponseBodyType() {
        return "text/plain; charset=UTF8";
    }

    public List<C12005b> getResponseHeaders() {
        return C12010a.m31641c(new ArrayList());
    }

    public int getStatus() {
        return -1;
    }

    public String getUrl() {
        return "";
    }

    public boolean isConversionError() {
        return false;
    }

    public boolean isHTTPError() {
        return false;
    }

    public boolean isNetworkError() {
        return false;
    }
}
