package p333g.p339c.p340a.p342b;

import android.annotation.SuppressLint;
import android.os.Build.VERSION;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import com.facebook.common.internal.C9542m;
import java.io.File;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: g.c.a.b.a */
public class C12027a {

    /* renamed from: h */
    private static C12027a f31323h;

    /* renamed from: i */
    private static final long f31324i = TimeUnit.MINUTES.toMillis(2);

    /* renamed from: a */
    private volatile StatFs f31325a = null;

    /* renamed from: b */
    private volatile File f31326b;

    /* renamed from: c */
    private volatile StatFs f31327c = null;

    /* renamed from: d */
    private volatile File f31328d;

    /* renamed from: e */
    private long f31329e;

    /* renamed from: f */
    private final Lock f31330f = new ReentrantLock();

    /* renamed from: g */
    private volatile boolean f31331g = false;

    /* renamed from: g.c.a.b.a$a */
    public enum C12028a {
        INTERNAL,
        EXTERNAL
    }

    protected C12027a() {
    }

    /* renamed from: a */
    private void m31684a() {
        if (!this.f31331g) {
            this.f31330f.lock();
            try {
                if (!this.f31331g) {
                    this.f31326b = Environment.getDataDirectory();
                    this.f31328d = Environment.getExternalStorageDirectory();
                    m31687d();
                    this.f31331g = true;
                }
            } finally {
                this.f31330f.unlock();
            }
        }
    }

    /* renamed from: b */
    public static synchronized C12027a m31685b() {
        C12027a aVar;
        synchronized (C12027a.class) {
            if (f31323h == null) {
                f31323h = new C12027a();
            }
            aVar = f31323h;
        }
        return aVar;
    }

    /* renamed from: c */
    private void m31686c() {
        if (this.f31330f.tryLock()) {
            try {
                if (SystemClock.uptimeMillis() - this.f31329e > f31324i) {
                    m31687d();
                }
            } finally {
                this.f31330f.unlock();
            }
        }
    }

    /* renamed from: d */
    private void m31687d() {
        this.f31325a = m31682a(this.f31325a, this.f31326b);
        this.f31327c = m31682a(this.f31327c, this.f31328d);
        this.f31329e = SystemClock.uptimeMillis();
    }

    /* renamed from: a */
    public boolean mo35660a(C12028a aVar, long j) {
        m31684a();
        long a = mo35659a(aVar);
        return a <= 0 || a < j;
    }

    @SuppressLint({"DeprecatedMethod"})
    /* renamed from: a */
    public long mo35659a(C12028a aVar) {
        long j;
        long j2;
        m31684a();
        m31686c();
        StatFs statFs = aVar == C12028a.INTERNAL ? this.f31325a : this.f31327c;
        if (statFs == null) {
            return 0;
        }
        if (VERSION.SDK_INT >= 18) {
            j2 = statFs.getBlockSizeLong();
            j = statFs.getAvailableBlocksLong();
        } else {
            j2 = (long) statFs.getBlockSize();
            j = (long) statFs.getAvailableBlocks();
        }
        return j2 * j;
    }

    /* renamed from: a */
    private StatFs m31682a(StatFs statFs, File file) {
        if (file == null || !file.exists()) {
            return null;
        }
        if (statFs == null) {
            try {
                statFs = m31683a(file.getAbsolutePath());
            } catch (IllegalArgumentException unused) {
                return null;
            } catch (Throwable th) {
                C9542m.m23285a(th);
                throw null;
            }
        } else {
            statFs.restat(file.getAbsolutePath());
        }
        return statFs;
    }

    /* renamed from: a */
    protected static StatFs m31683a(String str) {
        return new StatFs(str);
    }
}
