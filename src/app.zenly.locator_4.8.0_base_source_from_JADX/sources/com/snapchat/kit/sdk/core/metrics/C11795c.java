package com.snapchat.kit.sdk.core.metrics;

import com.google.gson.p315j.C11256a;
import com.google.gson.p315j.C11258c;
import java.util.Objects;

/* renamed from: com.snapchat.kit.sdk.core.metrics.c */
public class C11795c<T> {
    @C11256a
    @C11258c("retry_count")

    /* renamed from: a */
    private int f30557a;
    @C11256a
    @C11258c("event")

    /* renamed from: b */
    private T f30558b;

    public C11795c(T t) {
        this(t, 0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo34667a() {
        this.f30557a++;
    }

    /* renamed from: b */
    public int mo34668b() {
        return this.f30557a;
    }

    /* renamed from: c */
    public T mo34669c() {
        return this.f30558b;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (!(obj instanceof C11795c)) {
            return false;
        }
        C11795c cVar = (C11795c) obj;
        if (Objects.equals(Integer.valueOf(this.f30557a), Integer.valueOf(cVar.f30557a)) && Objects.equals(this.f30558b, cVar.f30558b)) {
            z = true;
        }
        return z;
    }

    public C11795c(T t, int i) {
        this.f30557a = i;
        this.f30558b = t;
    }
}
