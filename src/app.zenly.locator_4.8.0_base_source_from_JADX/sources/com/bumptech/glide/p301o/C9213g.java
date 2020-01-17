package com.bumptech.glide.p301o;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.bumptech.glide.o.g */
public class C9213g<T, Y> {

    /* renamed from: a */
    private final Map<T, Y> f23879a = new LinkedHashMap(100, 0.75f, true);

    /* renamed from: b */
    private final long f23880b;

    /* renamed from: c */
    private long f23881c;

    /* renamed from: d */
    private long f23882d;

    public C9213g(long j) {
        this.f23880b = j;
        this.f23881c = j;
    }

    /* renamed from: a */
    public synchronized Y mo24822a(T t) {
        return this.f23879a.get(t);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo24386a(T t, Y y) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo24387b(Y y) {
        return 1;
    }

    /* renamed from: b */
    public synchronized Y mo24824b(T t, Y y) {
        long b = (long) mo24387b(y);
        if (b >= this.f23881c) {
            mo24386a(t, y);
            return null;
        }
        if (y != null) {
            this.f23882d += b;
        }
        Y put = this.f23879a.put(t, y);
        if (put != null) {
            this.f23882d -= (long) mo24387b(put);
            if (!put.equals(y)) {
                mo24386a(t, put);
            }
        }
        m22073a();
        return put;
    }

    /* renamed from: c */
    public synchronized Y mo24825c(T t) {
        Y remove;
        remove = this.f23879a.remove(t);
        if (remove != null) {
            this.f23882d -= (long) mo24387b(remove);
        }
        return remove;
    }

    public void clearMemory() {
        mo24823a(0);
    }

    public synchronized long getCurrentSize() {
        return this.f23882d;
    }

    public synchronized long getMaxSize() {
        return this.f23881c;
    }

    public synchronized void setSizeMultiplier(float f) {
        if (f >= 0.0f) {
            this.f23881c = (long) Math.round(((float) this.f23880b) * f);
            m22073a();
        } else {
            throw new IllegalArgumentException("Multiplier must be >= 0");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public synchronized void mo24823a(long j) {
        while (this.f23882d > j) {
            Iterator it = this.f23879a.entrySet().iterator();
            Entry entry = (Entry) it.next();
            Object value = entry.getValue();
            this.f23882d -= (long) mo24387b(value);
            Object key = entry.getKey();
            it.remove();
            mo24386a(key, value);
        }
    }

    /* renamed from: a */
    private void m22073a() {
        mo24823a(this.f23881c);
    }
}
