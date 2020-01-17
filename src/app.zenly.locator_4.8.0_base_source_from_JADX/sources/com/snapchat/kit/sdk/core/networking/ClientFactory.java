package com.snapchat.kit.sdk.core.networking;

import com.google.gson.C11125d;
import okhttp3.C13204g;
import okhttp3.C13325v;
import okhttp3.C13325v.C13327b;
import okhttp3.Interceptor;
import retrofit2.C13430i.C13432b;
import retrofit2.Converter.C13389a;
import retrofit2.p424l.p425a.C13439a;
import retrofit2.p424l.p426b.C13442a;

public class ClientFactory {

    /* renamed from: a */
    private final C13204g f30566a;

    /* renamed from: b */
    private final C11125d f30567b;

    /* renamed from: c */
    private final C11806e f30568c;

    /* renamed from: d */
    private final C11804c f30569d;

    ClientFactory(C13204g gVar, C11125d dVar, C11806e eVar, C11804c cVar) {
        this.f30566a = gVar;
        this.f30567b = dVar;
        this.f30568c = eVar;
        this.f30569d = cVar;
    }

    /* renamed from: a */
    private <T> T m30982a(C11806e eVar, String str, Class<T> cls, C13389a aVar) {
        C13327b bVar = new C13327b();
        bVar.mo38363a(this.f30566a);
        bVar.mo38362a((Interceptor) eVar);
        C13325v a = bVar.mo38367a();
        C13432b bVar2 = new C13432b();
        bVar2.mo38683a(str);
        bVar2.mo38686a(a);
        bVar2.mo38687a(aVar);
        return bVar2.mo38688a().mo38670a(cls);
    }

    public <T> T generateClient(Class<T> cls) {
        return generateClient("https://api.snapkit.com", cls);
    }

    public <T> T generateFingerprintedClient(String str, Class<T> cls) {
        return m30982a(this.f30569d, str, cls, C13442a.m35614a());
    }

    public <T> T generateClient(String str, Class<T> cls) {
        return m30982a(this.f30568c, str, cls, C13439a.m35610a(this.f30567b));
    }
}
