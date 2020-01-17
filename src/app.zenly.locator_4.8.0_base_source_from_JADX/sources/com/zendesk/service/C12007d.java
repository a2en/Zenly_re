package com.zendesk.service;

import com.zendesk.logger.Logger;

/* renamed from: com.zendesk.service.d */
public class C12007d<T> extends C12008e<T> {

    /* renamed from: a */
    private boolean f31284a = false;

    /* renamed from: b */
    private final C12008e<T> f31285b;

    public C12007d(C12008e<T> eVar) {
        this.f31285b = eVar;
    }

    /* renamed from: a */
    public static <T> C12007d<T> m31622a(C12008e<T> eVar) {
        return new C12007d<>(eVar);
    }

    public void cancel() {
        this.f31284a = true;
    }

    public void onError(ErrorResponse errorResponse) {
        if (!this.f31284a) {
            C12008e<T> eVar = this.f31285b;
            if (eVar != null) {
                eVar.onError(errorResponse);
                return;
            }
        }
        Logger.m31606a("SafeZendeskCallback", errorResponse);
    }

    public void onSuccess(T t) {
        if (!this.f31284a) {
            C12008e<T> eVar = this.f31285b;
            if (eVar != null) {
                eVar.onSuccess(t);
                return;
            }
        }
        Logger.m31614d("SafeZendeskCallback", "Operation was a success but callback is null or was cancelled", new Object[0]);
    }
}
