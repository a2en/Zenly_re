package com.crashlytics.android.answers;

import android.app.Activity;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.crashlytics.android.answers.b0 */
final class C9257b0 {

    /* renamed from: a */
    public final C9262c0 f24035a;

    /* renamed from: b */
    public final long f24036b;

    /* renamed from: c */
    public final C9260c f24037c;

    /* renamed from: d */
    public final Map<String, String> f24038d;

    /* renamed from: e */
    public final String f24039e;

    /* renamed from: f */
    public final Map<String, Object> f24040f;

    /* renamed from: g */
    public final String f24041g;

    /* renamed from: h */
    public final Map<String, Object> f24042h;

    /* renamed from: i */
    private String f24043i;

    /* renamed from: com.crashlytics.android.answers.b0$b */
    static class C9259b {

        /* renamed from: a */
        final C9260c f24044a;

        /* renamed from: b */
        final long f24045b = System.currentTimeMillis();

        /* renamed from: c */
        Map<String, String> f24046c = null;

        /* renamed from: d */
        String f24047d = null;

        /* renamed from: e */
        Map<String, Object> f24048e = null;

        /* renamed from: f */
        String f24049f = null;

        /* renamed from: g */
        Map<String, Object> f24050g = null;

        public C9259b(C9260c cVar) {
            this.f24044a = cVar;
        }

        /* renamed from: a */
        public C9259b mo24964a(String str) {
            this.f24047d = str;
            return this;
        }

        /* renamed from: b */
        public C9259b mo24967b(Map<String, String> map) {
            this.f24046c = map;
            return this;
        }

        /* renamed from: a */
        public C9259b mo24965a(Map<String, Object> map) {
            this.f24048e = map;
            return this;
        }

        /* renamed from: a */
        public C9257b0 mo24966a(C9262c0 c0Var) {
            C9257b0 b0Var = new C9257b0(c0Var, this.f24045b, this.f24044a, this.f24046c, this.f24047d, this.f24048e, this.f24049f, this.f24050g);
            return b0Var;
        }
    }

    /* renamed from: com.crashlytics.android.answers.b0$c */
    enum C9260c {
        START,
        RESUME,
        PAUSE,
        STOP,
        CRASH,
        INSTALL,
        CUSTOM,
        PREDEFINED
    }

    /* renamed from: a */
    public static C9259b m22304a(C9260c cVar, Activity activity) {
        Map singletonMap = Collections.singletonMap("activity", activity.getClass().getName());
        C9259b bVar = new C9259b(cVar);
        bVar.mo24967b(singletonMap);
        return bVar;
    }

    public String toString() {
        if (this.f24043i == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            sb.append(C9257b0.class.getSimpleName());
            sb.append(": ");
            sb.append("timestamp=");
            sb.append(this.f24036b);
            sb.append(", type=");
            sb.append(this.f24037c);
            sb.append(", details=");
            sb.append(this.f24038d);
            sb.append(", customType=");
            sb.append(this.f24039e);
            sb.append(", customAttributes=");
            sb.append(this.f24040f);
            sb.append(", predefinedType=");
            sb.append(this.f24041g);
            sb.append(", predefinedAttributes=");
            sb.append(this.f24042h);
            sb.append(", metadata=[");
            sb.append(this.f24035a);
            sb.append("]]");
            this.f24043i = sb.toString();
        }
        return this.f24043i;
    }

    private C9257b0(C9262c0 c0Var, long j, C9260c cVar, Map<String, String> map, String str, Map<String, Object> map2, String str2, Map<String, Object> map3) {
        this.f24035a = c0Var;
        this.f24036b = j;
        this.f24037c = cVar;
        this.f24038d = map;
        this.f24039e = str;
        this.f24040f = map2;
        this.f24041g = str2;
        this.f24042h = map3;
    }

    /* renamed from: a */
    public static C9259b m22303a(long j) {
        C9259b bVar = new C9259b(C9260c.INSTALL);
        bVar.mo24967b(Collections.singletonMap("installedAt", String.valueOf(j)));
        return bVar;
    }

    /* renamed from: a */
    public static C9259b m22306a(String str) {
        Map singletonMap = Collections.singletonMap("sessionId", str);
        C9259b bVar = new C9259b(C9260c.CRASH);
        bVar.mo24967b(singletonMap);
        return bVar;
    }

    /* renamed from: a */
    public static C9259b m22307a(String str, String str2) {
        C9259b a = m22306a(str);
        a.mo24965a(Collections.singletonMap("exceptionName", str2));
        return a;
    }

    /* renamed from: a */
    public static C9259b m22305a(C9279l lVar) {
        C9259b bVar = new C9259b(C9260c.CUSTOM);
        bVar.mo24964a(lVar.mo25009b());
        bVar.mo24965a(lVar.mo24975a());
        return bVar;
    }
}
