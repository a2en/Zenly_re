package androidx.core.provider;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Message;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class SelfDestructiveThread {

    /* renamed from: a */
    private final Object f2638a = new Object();

    /* renamed from: b */
    private HandlerThread f2639b;

    /* renamed from: c */
    private Handler f2640c;

    /* renamed from: d */
    private int f2641d;

    /* renamed from: e */
    private Callback f2642e = new C0570a();

    /* renamed from: f */
    private final int f2643f;

    /* renamed from: g */
    private final int f2644g;

    /* renamed from: h */
    private final String f2645h;

    public interface ReplyCallback<T> {
        void onReply(T t);
    }

    /* renamed from: androidx.core.provider.SelfDestructiveThread$a */
    class C0570a implements Callback {
        C0570a() {
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                SelfDestructiveThread.this.mo3174a();
                return true;
            } else if (i != 1) {
                return true;
            } else {
                SelfDestructiveThread.this.mo3175a((Runnable) message.obj);
                return true;
            }
        }
    }

    /* renamed from: androidx.core.provider.SelfDestructiveThread$b */
    class C0571b implements Runnable {

        /* renamed from: e */
        final /* synthetic */ Callable f2647e;

        /* renamed from: f */
        final /* synthetic */ Handler f2648f;

        /* renamed from: g */
        final /* synthetic */ ReplyCallback f2649g;

        /* renamed from: androidx.core.provider.SelfDestructiveThread$b$a */
        class C0572a implements Runnable {

            /* renamed from: e */
            final /* synthetic */ Object f2650e;

            C0572a(Object obj) {
                this.f2650e = obj;
            }

            public void run() {
                C0571b.this.f2649g.onReply(this.f2650e);
            }
        }

        C0571b(SelfDestructiveThread selfDestructiveThread, Callable callable, Handler handler, ReplyCallback replyCallback) {
            this.f2647e = callable;
            this.f2648f = handler;
            this.f2649g = replyCallback;
        }

        public void run() {
            Object obj;
            try {
                obj = this.f2647e.call();
            } catch (Exception unused) {
                obj = null;
            }
            this.f2648f.post(new C0572a(obj));
        }
    }

    /* renamed from: androidx.core.provider.SelfDestructiveThread$c */
    class C0573c implements Runnable {

        /* renamed from: e */
        final /* synthetic */ AtomicReference f2652e;

        /* renamed from: f */
        final /* synthetic */ Callable f2653f;

        /* renamed from: g */
        final /* synthetic */ ReentrantLock f2654g;

        /* renamed from: h */
        final /* synthetic */ AtomicBoolean f2655h;

        /* renamed from: i */
        final /* synthetic */ Condition f2656i;

        C0573c(SelfDestructiveThread selfDestructiveThread, AtomicReference atomicReference, Callable callable, ReentrantLock reentrantLock, AtomicBoolean atomicBoolean, Condition condition) {
            this.f2652e = atomicReference;
            this.f2653f = callable;
            this.f2654g = reentrantLock;
            this.f2655h = atomicBoolean;
            this.f2656i = condition;
        }

        public void run() {
            try {
                this.f2652e.set(this.f2653f.call());
            } catch (Exception unused) {
            }
            this.f2654g.lock();
            try {
                this.f2655h.set(false);
                this.f2656i.signal();
            } finally {
                this.f2654g.unlock();
            }
        }
    }

    public SelfDestructiveThread(String str, int i, int i2) {
        this.f2645h = str;
        this.f2644g = i;
        this.f2643f = i2;
        this.f2641d = 0;
    }

    /* renamed from: b */
    private void m2681b(Runnable runnable) {
        synchronized (this.f2638a) {
            if (this.f2639b == null) {
                this.f2639b = new HandlerThread(this.f2645h, this.f2644g);
                this.f2639b.start();
                this.f2640c = new Handler(this.f2639b.getLooper(), this.f2642e);
                this.f2641d++;
            }
            this.f2640c.removeMessages(0);
            this.f2640c.sendMessage(this.f2640c.obtainMessage(1, runnable));
        }
    }

    /* renamed from: a */
    public <T> void mo3176a(Callable<T> callable, ReplyCallback<T> replyCallback) {
        m2681b(new C0571b(this, callable, new Handler(), replyCallback));
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:9|10|11|12|(4:25|14|15|16)(1:17)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003f */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0045 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> T mo3173a(java.util.concurrent.Callable<T> r13, int r14) throws java.lang.InterruptedException {
        /*
            r12 = this;
            java.util.concurrent.locks.ReentrantLock r7 = new java.util.concurrent.locks.ReentrantLock
            r7.<init>()
            java.util.concurrent.locks.Condition r8 = r7.newCondition()
            java.util.concurrent.atomic.AtomicReference r9 = new java.util.concurrent.atomic.AtomicReference
            r9.<init>()
            java.util.concurrent.atomic.AtomicBoolean r10 = new java.util.concurrent.atomic.AtomicBoolean
            r0 = 1
            r10.<init>(r0)
            androidx.core.provider.SelfDestructiveThread$c r11 = new androidx.core.provider.SelfDestructiveThread$c
            r0 = r11
            r1 = r12
            r2 = r9
            r3 = r13
            r4 = r7
            r5 = r10
            r6 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r12.m2681b(r11)
            r7.lock()
            boolean r13 = r10.get()     // Catch:{ all -> 0x005c }
            if (r13 != 0) goto L_0x0034
            java.lang.Object r13 = r9.get()     // Catch:{ all -> 0x005c }
            r7.unlock()
            return r13
        L_0x0034:
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x005c }
            long r0 = (long) r14     // Catch:{ all -> 0x005c }
            long r13 = r13.toNanos(r0)     // Catch:{ all -> 0x005c }
        L_0x003b:
            long r13 = r8.awaitNanos(r13)     // Catch:{ InterruptedException -> 0x003f }
        L_0x003f:
            boolean r0 = r10.get()     // Catch:{ all -> 0x005c }
            if (r0 != 0) goto L_0x004d
            java.lang.Object r13 = r9.get()     // Catch:{ all -> 0x005c }
            r7.unlock()
            return r13
        L_0x004d:
            r0 = 0
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x0054
            goto L_0x003b
        L_0x0054:
            java.lang.InterruptedException r13 = new java.lang.InterruptedException     // Catch:{ all -> 0x005c }
            java.lang.String r14 = "timeout"
            r13.<init>(r14)     // Catch:{ all -> 0x005c }
            throw r13     // Catch:{ all -> 0x005c }
        L_0x005c:
            r13 = move-exception
            r7.unlock()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.provider.SelfDestructiveThread.mo3173a(java.util.concurrent.Callable, int):java.lang.Object");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3175a(Runnable runnable) {
        runnable.run();
        synchronized (this.f2638a) {
            this.f2640c.removeMessages(0);
            this.f2640c.sendMessageDelayed(this.f2640c.obtainMessage(0), (long) this.f2643f);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3174a() {
        synchronized (this.f2638a) {
            if (!this.f2640c.hasMessages(1)) {
                this.f2639b.quit();
                this.f2639b = null;
                this.f2640c = null;
            }
        }
    }
}
