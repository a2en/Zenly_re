package app.zenly.android.feature.base.scheduling;

import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12933k;
import kotlin.jvm.internal.C12940r;
import kotlin.jvm.internal.C12941s;
import kotlin.jvm.internal.C12946x;
import kotlin.reflect.KProperty;

public final class AttributedException extends Exception {

    /* renamed from: f */
    static final /* synthetic */ KProperty[] f4953f;

    /* renamed from: e */
    private final Lazy f4954e;

    /* renamed from: app.zenly.android.feature.base.scheduling.AttributedException$a */
    static final class C1339a extends C12933k implements Function0<String> {

        /* renamed from: f */
        final /* synthetic */ AttributedException f4955f;

        /* renamed from: g */
        final /* synthetic */ C1344c f4956g;

        /* renamed from: h */
        final /* synthetic */ Long f4957h;

        C1339a(AttributedException attributedException, C1344c cVar, Long l) {
            this.f4955f = attributedException;
            this.f4956g = cVar;
            this.f4957h = l;
            super(0);
        }

        public final String invoke() {
            StringBuilder sb = new StringBuilder();
            sb.append(AttributedException.super.getMessage());
            sb.append(" on scheduler ");
            sb.append(this.f4956g.mo6580b());
            sb.append(" at callsite ");
            sb.append(this.f4956g.mo6579a());
            sb.append(" tid=");
            Long l = this.f4957h;
            sb.append(l != null ? l.longValue() : -1);
            sb.append(' ');
            return sb.toString();
        }
    }

    static {
        C12941s sVar = new C12941s(C12946x.m33834a(AttributedException.class), "stringRepresentation", "getStringRepresentation()Ljava/lang/String;");
        C12946x.m33839a((C12940r) sVar);
        f4953f = new KProperty[]{sVar};
    }

    public /* synthetic */ AttributedException(C1344c cVar, Throwable th, Long l, int i, C12928f fVar) {
        if ((i & 4) != 0) {
            l = null;
        }
        this(cVar, th, l);
    }

    /* renamed from: a */
    private final String m6356a() {
        Lazy lazy = this.f4954e;
        KProperty kProperty = f4953f[0];
        return (String) lazy.getValue();
    }

    public String getMessage() {
        return m6356a();
    }

    public AttributedException(C1344c cVar, Throwable th, Long l) {
        C12932j.m33818b(cVar, "attribution");
        C12932j.m33818b(th, "throwable");
        super(th);
        this.f4954e = C12896f.m33751a(new C1339a(this, cVar, l));
    }
}
