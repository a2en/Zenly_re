package com.zendesk.service;

import com.zendesk.util.C12017g;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import okhttp3.C13317r;
import retrofit2.C13429h;

/* renamed from: com.zendesk.service.c */
public class C12006c implements ErrorResponse {

    /* renamed from: a */
    private Throwable f31282a;

    /* renamed from: b */
    private C13429h f31283b;

    private C12006c(Throwable th) {
        this.f31282a = th;
    }

    /* renamed from: a */
    public static C12006c m31620a(Throwable th) {
        return new C12006c(th);
    }

    public String getReason() {
        Throwable th = this.f31282a;
        if (th != null) {
            return th.getMessage();
        }
        StringBuilder sb = new StringBuilder();
        C13429h hVar = this.f31283b;
        if (hVar != null) {
            if (C12017g.m31658b(hVar.mo38667f())) {
                sb.append(this.f31283b.mo38667f());
            } else {
                sb.append(this.f31283b.mo38663b());
            }
        }
        return sb.toString();
    }

    public String getResponseBody() {
        C13429h hVar = this.f31283b;
        if (!(hVar == null || hVar.mo38664c() == null)) {
            try {
                return new String(this.f31283b.mo38664c().mo37824b(), "UTF-8");
            } catch (UnsupportedEncodingException unused) {
                throw new AssertionError("UTF-8 must be supported");
            } catch (IOException unused2) {
            }
        }
        return "";
    }

    public String getResponseBodyType() {
        C13429h hVar = this.f31283b;
        return (hVar == null || hVar.mo38664c() == null) ? "" : this.f31283b.mo38664c().mo37828e().toString();
    }

    public List<C12005b> getResponseHeaders() {
        if (this.f31282a != null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        C13429h hVar = this.f31283b;
        if (!(hVar == null || hVar.mo38665d() == null || this.f31283b.mo38665d().mo38266c() <= 0)) {
            C13317r d = this.f31283b.mo38665d();
            for (String str : d.mo38262a()) {
                arrayList.add(new C12005b(str, d.mo38261a(str)));
            }
        }
        return arrayList;
    }

    public int getStatus() {
        C13429h hVar = this.f31283b;
        if (hVar != null) {
            return hVar.mo38663b();
        }
        return -1;
    }

    public String getUrl() {
        C13429h hVar = this.f31283b;
        return (hVar == null || hVar.mo38668g().mo37803n() == null || this.f31283b.mo38668g().mo37803n().mo38389g() == null) ? "" : this.f31283b.mo38668g().mo37803n().mo38389g().toString();
    }

    public boolean isConversionError() {
        return isNetworkError();
    }

    public boolean isHTTPError() {
        if (this.f31282a == null) {
            C13429h hVar = this.f31283b;
            if (hVar != null && !hVar.mo38666e()) {
                return true;
            }
        }
        return false;
    }

    public boolean isNetworkError() {
        Throwable th = this.f31282a;
        return th != null && (th instanceof IOException);
    }

    /* renamed from: a */
    public static C12006c m31621a(C13429h hVar) {
        return new C12006c(hVar);
    }

    private C12006c(C13429h hVar) {
        this.f31283b = hVar;
    }
}
