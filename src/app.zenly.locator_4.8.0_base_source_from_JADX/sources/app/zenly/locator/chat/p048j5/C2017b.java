package app.zenly.locator.chat.p048j5;

import com.bluelinelabs.conductor.C8819d;
import java.util.Map;
import kotlin.C12954o;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.chat.j5.b */
public enum C2017b {
    POOP;
    
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final Map<String, C2017b> f6430g = null;

    /* renamed from: h */
    public static final C2018a f6431h = null;

    /* renamed from: app.zenly.locator.chat.j5.b$a */
    public static final class C2018a {
        private C2018a() {
        }

        /* renamed from: a */
        public final C2017b mo7824a(String str) {
            C12932j.m33818b(str, "combo");
            return (C2017b) C2017b.f6430g.get(str);
        }

        public /* synthetic */ C2018a(C12928f fVar) {
            this();
        }

        /* renamed from: a */
        public final C8819d mo7825a(C2017b bVar) {
            C12932j.m33818b(bVar, "easterEgg");
            if (C2016a.f6427a[bVar.ordinal()] == 1) {
                return new C2019c();
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    static {
        f6431h = new C2018a(null);
        f6430g = C12833g0.m33543a(C12954o.m33853a("💩💩💩", POOP));
    }

    /* renamed from: a */
    public static final C2017b m7730a(String str) {
        return f6431h.mo7824a(str);
    }

    /* renamed from: a */
    public static final C8819d m7731a(C2017b bVar) {
        return f6431h.mo7825a(bVar);
    }
}
