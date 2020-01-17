package bolts;

import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: bolts.b */
final class C6342b {

    /* renamed from: c */
    private static final C6342b f15897c = new C6342b();

    /* renamed from: a */
    private final ExecutorService f15898a;

    /* renamed from: b */
    private final Executor f15899b;

    /* renamed from: bolts.b$b */
    private static class C6344b implements Executor {

        /* renamed from: a */
        private ThreadLocal<Integer> f15900a;

        private C6344b() {
            this.f15900a = new ThreadLocal<>();
        }

        /* renamed from: a */
        private int m17441a() {
            Integer num = (Integer) this.f15900a.get();
            if (num == null) {
                num = Integer.valueOf(0);
            }
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                this.f15900a.remove();
            } else {
                this.f15900a.set(Integer.valueOf(intValue));
            }
            return intValue;
        }

        /* renamed from: b */
        private int m17442b() {
            Integer num = (Integer) this.f15900a.get();
            if (num == null) {
                num = Integer.valueOf(0);
            }
            int intValue = num.intValue() + 1;
            this.f15900a.set(Integer.valueOf(intValue));
            return intValue;
        }

        public void execute(Runnable runnable) {
            if (m17442b() <= 15) {
                try {
                    runnable.run();
                } catch (Throwable th) {
                    m17441a();
                    throw th;
                }
            } else {
                C6342b.m17438a().execute(runnable);
            }
            m17441a();
        }
    }

    private C6342b() {
        this.f15898a = !m17440c() ? Executors.newCachedThreadPool() : C6339a.m17435a();
        Executors.newSingleThreadScheduledExecutor();
        this.f15899b = new C6344b();
    }

    /* renamed from: a */
    public static ExecutorService m17438a() {
        return f15897c.f15898a;
    }

    /* renamed from: b */
    static Executor m17439b() {
        return f15897c.f15899b;
    }

    /* renamed from: c */
    private static boolean m17440c() {
        String property = System.getProperty("java.runtime.name");
        if (property == null) {
            return false;
        }
        return property.toLowerCase(Locale.US).contains("android");
    }
}
