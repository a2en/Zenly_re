package com.google.common.util.concurrent;

import com.google.common.collect.C10912r;
import com.google.common.collect.C10921u;
import com.google.common.collect.C10922v;
import java.util.ArrayList;
import java.util.logging.Logger;

public class CycleDetectingLockFactory {

    public interface Policy {
        void handlePotentialDeadlock(PotentialDeadlockException potentialDeadlockException);
    }

    public static final class PotentialDeadlockException extends C11004b {

        /* renamed from: e */
        private final C11004b f28576e;

        public String getMessage() {
            StringBuilder sb = new StringBuilder(super.getMessage());
            for (Throwable th = this.f28576e; th != null; th = th.getCause()) {
                sb.append(", ");
                sb.append(th.getMessage());
            }
            return sb.toString();
        }
    }

    /* renamed from: com.google.common.util.concurrent.CycleDetectingLockFactory$a */
    static class C11003a extends ThreadLocal<ArrayList<C11005c>> {
        C11003a() {
        }

        /* access modifiers changed from: protected */
        public ArrayList<C11005c> initialValue() {
            return C10921u.m28138a(3);
        }
    }

    /* renamed from: com.google.common.util.concurrent.CycleDetectingLockFactory$b */
    private static class C11004b extends IllegalStateException {
        static {
            C10912r.m28120a(CycleDetectingLockFactory.class.getName(), C11004b.class.getName(), C11005c.class.getName());
        }
    }

    /* renamed from: com.google.common.util.concurrent.CycleDetectingLockFactory$c */
    private static class C11005c {
    }

    static {
        C10922v vVar = new C10922v();
        vVar.mo31798g();
        vVar.mo31797f();
        Logger.getLogger(CycleDetectingLockFactory.class.getName());
        new C11003a();
    }
}
