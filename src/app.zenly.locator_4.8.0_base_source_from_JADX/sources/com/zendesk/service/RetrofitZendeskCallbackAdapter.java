package com.zendesk.service;

import retrofit2.C13429h;
import retrofit2.Call;
import retrofit2.Callback;

public class RetrofitZendeskCallbackAdapter<E, F> implements Callback<E> {

    /* renamed from: c */
    protected static final RequestExtractor f31275c = new C12003a();

    /* renamed from: a */
    private final C12008e<F> f31276a;

    /* renamed from: b */
    private final RequestExtractor<E, F> f31277b;

    public interface RequestExtractor<E, F> {
        F extract(E e);
    }

    /* renamed from: com.zendesk.service.RetrofitZendeskCallbackAdapter$a */
    static final class C12003a<E> implements RequestExtractor<E, E> {
        C12003a() {
        }

        public E extract(E e) {
            return e;
        }
    }

    public RetrofitZendeskCallbackAdapter(C12008e<F> eVar, RequestExtractor<E, F> requestExtractor) {
        this.f31276a = eVar;
        this.f31277b = requestExtractor;
    }

    public void onFailure(Call<E> call, Throwable th) {
        C12008e<F> eVar = this.f31276a;
        if (eVar != null) {
            eVar.onError(C12006c.m31620a(th));
        }
    }

    public void onResponse(Call<E> call, C13429h<E> hVar) {
        if (this.f31276a == null) {
            return;
        }
        if (hVar.mo38666e()) {
            this.f31276a.onSuccess(this.f31277b.extract(hVar.mo38662a()));
        } else {
            this.f31276a.onError(C12006c.m31621a((C13429h) hVar));
        }
    }

    public RetrofitZendeskCallbackAdapter(C12008e<F> eVar) {
        this(eVar, f31275c);
    }
}
