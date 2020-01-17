package com.zendesk.service;

import com.zendesk.util.C12016f;

public class ZendeskException extends Exception {

    /* renamed from: e */
    private final ErrorResponse f31278e;

    public String toString() {
        ErrorResponse errorResponse = this.f31278e;
        return String.format("ZendeskException{details=%s,errorResponse=%s,cause=%s}", new Object[]{super.toString(), errorResponse == null ? "null" : errorResponse.getReason(), C12016f.m31651a(getCause())});
    }
}
