package app.zenly.locator.p207x;

import app.zenly.locator.modals.C4545f2;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.x.y1 */
public abstract class C6268y1 {

    /* renamed from: a */
    public static final C6269a f15693a = new C6269a(null);

    /* renamed from: app.zenly.locator.x.y1$a */
    public static final class C6269a {
        private C6269a() {
        }

        /* renamed from: a */
        public final C6268y1 mo14088a(C4545f2 f2Var) {
            C12932j.m33818b(f2Var, "modalUuid");
            int i = C6265x1.f15690a[f2Var.mo11703a().ordinal()];
            if (i == 1) {
                return new C6262w1(f2Var);
            }
            if (i == 2) {
                return new C6200d2(f2Var);
            }
            if (i != 3) {
                return C6192b2.f15567b;
            }
            return new C6245s1(f2Var);
        }

        public /* synthetic */ C6269a(C12928f fVar) {
            this();
        }
    }

    private C6268y1() {
    }

    /* renamed from: b */
    public static final C6268y1 m17172b(C4545f2 f2Var) {
        return f15693a.mo14088a(f2Var);
    }

    /* renamed from: a */
    public abstract boolean mo14059a(C4545f2 f2Var);

    public /* synthetic */ C6268y1(C12928f fVar) {
        this();
    }
}
