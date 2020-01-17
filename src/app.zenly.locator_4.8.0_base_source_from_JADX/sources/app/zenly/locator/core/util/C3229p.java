package app.zenly.locator.core.util;

import android.content.Context;
import app.zenly.locator.p143s.C5407g;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.core.util.p */
public enum C3229p {
    SI,
    UK,
    US;
    

    /* renamed from: i */
    public static final C3230a f9009i = null;

    /* renamed from: app.zenly.locator.core.util.p$a */
    public static final class C3230a {
        private C3230a() {
        }

        /* renamed from: a */
        public final C3229p mo9649a(Context context) {
            C12932j.m33818b(context, "context");
            int j = C5407g.f13966d.mo12991a(context).mo12988j();
            if (j == 1) {
                return C3229p.SI;
            }
            if (j == 2) {
                return C3229p.US;
            }
            if (j != 3) {
                return C3229p.SI;
            }
            return C3229p.UK;
        }

        public /* synthetic */ C3230a(C12928f fVar) {
            this();
        }
    }

    static {
        f9009i = new C3230a(null);
    }

    /* renamed from: a */
    public static final C3229p m10233a(Context context) {
        return f9009i.mo9649a(context);
    }
}
