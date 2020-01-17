package okio;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* renamed from: okio.h */
public class C13350h extends C13368t {

    /* renamed from: e */
    private C13368t f34626e;

    public C13350h(C13368t tVar) {
        if (tVar != null) {
            this.f34626e = tVar;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    /* renamed from: a */
    public final C13350h mo38539a(C13368t tVar) {
        if (tVar != null) {
            this.f34626e = tVar;
            return this;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    /* renamed from: b */
    public C13368t mo38543b() {
        return this.f34626e.mo38543b();
    }

    /* renamed from: c */
    public long mo38544c() {
        return this.f34626e.mo38544c();
    }

    /* renamed from: d */
    public boolean mo38545d() {
        return this.f34626e.mo38545d();
    }

    /* renamed from: e */
    public void mo38546e() throws IOException {
        this.f34626e.mo38546e();
    }

    /* renamed from: f */
    public long mo38547f() {
        return this.f34626e.mo38547f();
    }

    /* renamed from: g */
    public final C13368t mo38548g() {
        return this.f34626e;
    }

    /* renamed from: a */
    public C13368t mo38542a(long j, TimeUnit timeUnit) {
        return this.f34626e.mo38542a(j, timeUnit);
    }

    /* renamed from: a */
    public C13368t mo38541a(long j) {
        return this.f34626e.mo38541a(j);
    }

    /* renamed from: a */
    public C13368t mo38540a() {
        return this.f34626e.mo38540a();
    }
}
