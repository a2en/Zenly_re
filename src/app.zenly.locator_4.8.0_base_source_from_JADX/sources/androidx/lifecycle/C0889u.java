package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.lifecycle.u */
public abstract class C0889u {

    /* renamed from: a */
    private final Map<String, Object> f3510a = new HashMap();

    /* renamed from: b */
    private volatile boolean f3511b = false;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo4499a() {
        this.f3511b = true;
        Map<String, Object> map = this.f3510a;
        if (map != null) {
            synchronized (map) {
                for (Object a : this.f3510a.values()) {
                    m4092a(a);
                }
            }
        }
        mo4269b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo4269b() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public <T> T mo4498a(String str, T t) {
        T t2;
        synchronized (this.f3510a) {
            t2 = this.f3510a.get(str);
            if (t2 == null) {
                this.f3510a.put(str, t);
            }
        }
        if (t2 != null) {
            t = t2;
        }
        if (this.f3511b) {
            m4092a((Object) t);
        }
        return t;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public <T> T mo4497a(String str) {
        T t;
        synchronized (this.f3510a) {
            t = this.f3510a.get(str);
        }
        return t;
    }

    /* renamed from: a */
    private static void m4092a(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
