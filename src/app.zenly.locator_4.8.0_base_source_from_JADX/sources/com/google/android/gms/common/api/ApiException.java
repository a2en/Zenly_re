package com.google.android.gms.common.api;

public class ApiException extends Exception {

    /* renamed from: e */
    protected final Status f26268e;

    public ApiException(Status status) {
        int a = status.mo27059a();
        String b = status.mo27060b() != null ? status.mo27060b() : "";
        StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 13);
        sb.append(a);
        sb.append(": ");
        sb.append(b);
        super(sb.toString());
        this.f26268e = status;
    }

    /* renamed from: a */
    public int mo27035a() {
        return this.f26268e.mo27059a();
    }

    @Deprecated
    /* renamed from: b */
    public String mo27036b() {
        return this.f26268e.mo27060b();
    }
}
