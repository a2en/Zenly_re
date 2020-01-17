package com.facebook.cache.disk;

import com.facebook.cache.common.CacheEvent;
import com.facebook.cache.common.CacheEventListener.C9482a;
import com.facebook.cache.common.CacheKey;
import java.io.IOException;

/* renamed from: com.facebook.cache.disk.f */
public class C9510f implements CacheEvent {

    /* renamed from: i */
    private static final Object f24680i = new Object();

    /* renamed from: j */
    private static C9510f f24681j;

    /* renamed from: k */
    private static int f24682k;

    /* renamed from: a */
    private CacheKey f24683a;

    /* renamed from: b */
    private String f24684b;

    /* renamed from: c */
    private long f24685c;

    /* renamed from: d */
    private long f24686d;

    /* renamed from: e */
    private long f24687e;

    /* renamed from: f */
    private IOException f24688f;

    /* renamed from: g */
    private C9482a f24689g;

    /* renamed from: h */
    private C9510f f24690h;

    private C9510f() {
    }

    /* renamed from: b */
    public static C9510f m23216b() {
        synchronized (f24680i) {
            if (f24681j == null) {
                return new C9510f();
            }
            C9510f fVar = f24681j;
            f24681j = fVar.f24690h;
            fVar.f24690h = null;
            f24682k--;
            return fVar;
        }
    }

    /* renamed from: a */
    public C9510f mo25594a(CacheKey cacheKey) {
        this.f24683a = cacheKey;
        return this;
    }

    /* renamed from: c */
    public C9510f mo25599c(long j) {
        this.f24685c = j;
        return this;
    }

    public CacheKey getCacheKey() {
        return this.f24683a;
    }

    public long getCacheLimit() {
        return this.f24686d;
    }

    public long getCacheSize() {
        return this.f24687e;
    }

    public C9482a getEvictionReason() {
        return this.f24689g;
    }

    public IOException getException() {
        return this.f24688f;
    }

    public long getItemSize() {
        return this.f24685c;
    }

    public String getResourceId() {
        return this.f24684b;
    }

    /* renamed from: c */
    private void m23217c() {
        this.f24683a = null;
        this.f24684b = null;
        this.f24685c = 0;
        this.f24686d = 0;
        this.f24687e = 0;
        this.f24688f = null;
        this.f24689g = null;
    }

    /* renamed from: a */
    public C9510f mo25596a(String str) {
        this.f24684b = str;
        return this;
    }

    /* renamed from: a */
    public C9510f mo25592a(long j) {
        this.f24686d = j;
        return this;
    }

    /* renamed from: a */
    public C9510f mo25595a(IOException iOException) {
        this.f24688f = iOException;
        return this;
    }

    /* renamed from: a */
    public C9510f mo25593a(C9482a aVar) {
        this.f24689g = aVar;
        return this;
    }

    /* renamed from: a */
    public void mo25597a() {
        synchronized (f24680i) {
            if (f24682k < 5) {
                m23217c();
                f24682k++;
                if (f24681j != null) {
                    this.f24690h = f24681j;
                }
                f24681j = this;
            }
        }
    }

    /* renamed from: b */
    public C9510f mo25598b(long j) {
        this.f24687e = j;
        return this;
    }
}
