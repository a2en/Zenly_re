package okhttp3;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okhttp3.C13317r.C13318a;
import okhttp3.internal.http.C13249e;
import okhttp3.p418f0.C13184e;

/* renamed from: okhttp3.y */
public final class C13331y {

    /* renamed from: a */
    final C13319s f34574a;

    /* renamed from: b */
    final String f34575b;

    /* renamed from: c */
    final C13317r f34576c;

    /* renamed from: d */
    final C13333z f34577d;

    /* renamed from: e */
    final Map<Class<?>, Object> f34578e;

    /* renamed from: f */
    private volatile C13211h f34579f;

    /* renamed from: okhttp3.y$a */
    public static class C13332a {

        /* renamed from: a */
        C13319s f34580a;

        /* renamed from: b */
        String f34581b;

        /* renamed from: c */
        C13318a f34582c;

        /* renamed from: d */
        C13333z f34583d;

        /* renamed from: e */
        Map<Class<?>, Object> f34584e;

        public C13332a() {
            this.f34584e = Collections.emptyMap();
            this.f34581b = "GET";
            this.f34582c = new C13318a();
        }

        /* renamed from: a */
        public C13332a mo38398a(C13319s sVar) {
            if (sVar != null) {
                this.f34580a = sVar;
                return this;
            }
            throw new NullPointerException("url == null");
        }

        /* renamed from: b */
        public C13332a mo38402b(String str) {
            if (str != null) {
                if (str.regionMatches(true, 0, "ws:", 0, 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("http:");
                    sb.append(str.substring(3));
                    str = sb.toString();
                } else {
                    if (str.regionMatches(true, 0, "wss:", 0, 4)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("https:");
                        sb2.append(str.substring(4));
                        str = sb2.toString();
                    }
                }
                mo38398a(C13319s.m35126e(str));
                return this;
            }
            throw new NullPointerException("url == null");
        }

        /* renamed from: a */
        public C13332a mo38394a(String str, String str2) {
            this.f34582c.mo38271a(str, str2);
            return this;
        }

        /* renamed from: a */
        public C13332a mo38393a(String str) {
            this.f34582c.mo38275c(str);
            return this;
        }

        C13332a(C13331y yVar) {
            Map<Class<?>, Object> map;
            this.f34584e = Collections.emptyMap();
            this.f34580a = yVar.f34574a;
            this.f34581b = yVar.f34575b;
            this.f34583d = yVar.f34577d;
            if (yVar.f34578e.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = new LinkedHashMap<>(yVar.f34578e);
            }
            this.f34584e = map;
            this.f34582c = yVar.f34576c.mo38265b();
        }

        /* renamed from: a */
        public C13332a mo38397a(C13317r rVar) {
            this.f34582c = rVar.mo38265b();
            return this;
        }

        /* renamed from: a */
        public C13332a mo38396a(C13211h hVar) {
            String hVar2 = hVar.toString();
            String str = "Cache-Control";
            if (hVar2.isEmpty()) {
                mo38393a(str);
                return this;
            }
            mo38403b(str, hVar2);
            return this;
        }

        /* renamed from: b */
        public C13332a mo38403b(String str, String str2) {
            this.f34582c.mo38277d(str, str2);
            return this;
        }

        /* renamed from: b */
        public C13332a mo38401b() {
            mo38395a("GET", (C13333z) null);
            return this;
        }

        /* renamed from: a */
        public C13332a mo38399a(C13333z zVar) {
            mo38395a("POST", zVar);
            return this;
        }

        /* renamed from: a */
        public C13332a mo38395a(String str, C13333z zVar) {
            if (str == null) {
                throw new NullPointerException("method == null");
            } else if (str.length() != 0) {
                String str2 = "method ";
                if (zVar != null && !C13249e.m34799b(str)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str2);
                    sb.append(str);
                    sb.append(" must not have a request body.");
                    throw new IllegalArgumentException(sb.toString());
                } else if (zVar != null || !C13249e.m34802e(str)) {
                    this.f34581b = str;
                    this.f34583d = zVar;
                    return this;
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str2);
                    sb2.append(str);
                    sb2.append(" must have a request body.");
                    throw new IllegalArgumentException(sb2.toString());
                }
            } else {
                throw new IllegalArgumentException("method.length() == 0");
            }
        }

        /* renamed from: a */
        public C13332a mo38392a(Object obj) {
            mo38391a(Object.class, (T) obj);
            return this;
        }

        /* renamed from: a */
        public <T> C13332a mo38391a(Class<? super T> cls, T t) {
            if (cls != null) {
                if (t == null) {
                    this.f34584e.remove(cls);
                } else {
                    if (this.f34584e.isEmpty()) {
                        this.f34584e = new LinkedHashMap();
                    }
                    this.f34584e.put(cls, cls.cast(t));
                }
                return this;
            }
            throw new NullPointerException("type == null");
        }

        /* renamed from: a */
        public C13331y mo38400a() {
            if (this.f34580a != null) {
                return new C13331y(this);
            }
            throw new IllegalStateException("url == null");
        }
    }

    C13331y(C13332a aVar) {
        this.f34574a = aVar.f34580a;
        this.f34575b = aVar.f34581b;
        this.f34576c = aVar.f34582c.mo38272a();
        this.f34577d = aVar.f34583d;
        this.f34578e = C13184e.m34499a(aVar.f34584e);
    }

    /* renamed from: a */
    public String mo38381a(String str) {
        return this.f34576c.mo38261a(str);
    }

    /* renamed from: b */
    public List<String> mo38383b(String str) {
        return this.f34576c.mo38264b(str);
    }

    /* renamed from: c */
    public C13317r mo38385c() {
        return this.f34576c;
    }

    /* renamed from: d */
    public boolean mo38386d() {
        return this.f34574a.mo38289h();
    }

    /* renamed from: e */
    public String mo38387e() {
        return this.f34575b;
    }

    /* renamed from: f */
    public C13332a mo38388f() {
        return new C13332a(this);
    }

    /* renamed from: g */
    public C13319s mo38389g() {
        return this.f34574a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Request{method=");
        sb.append(this.f34575b);
        sb.append(", url=");
        sb.append(this.f34574a);
        sb.append(", tags=");
        sb.append(this.f34578e);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    public C13333z mo38382a() {
        return this.f34577d;
    }

    /* renamed from: b */
    public C13211h mo38384b() {
        C13211h hVar = this.f34579f;
        if (hVar != null) {
            return hVar;
        }
        C13211h a = C13211h.m34617a(this.f34576c);
        this.f34579f = a;
        return a;
    }
}
