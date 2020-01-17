package com.facebook.imagepipeline.decoder;

import com.facebook.imagepipeline.image.C9732e;

public class DecodeException extends RuntimeException {

    /* renamed from: e */
    private final C9732e f25540e;

    public DecodeException(String str, C9732e eVar) {
        super(str);
        this.f25540e = eVar;
    }

    /* renamed from: a */
    public C9732e mo26386a() {
        return this.f25540e;
    }
}
