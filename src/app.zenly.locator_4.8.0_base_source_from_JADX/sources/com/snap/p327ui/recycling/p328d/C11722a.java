package com.snap.p327ui.recycling.p328d;

import com.snap.p327ui.recycling.AdapterViewType;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.snap.ui.recycling.d.a */
public class C11722a {

    /* renamed from: e */
    private static final AtomicLong f30380e = new AtomicLong();

    /* renamed from: a */
    protected final long f30381a;

    /* renamed from: b */
    final AdapterViewType f30382b;

    /* renamed from: c */
    private String f30383c;

    /* renamed from: d */
    private String f30384d;

    public C11722a(AdapterViewType adapterViewType) {
        this(adapterViewType, m30799e());
    }

    /* renamed from: e */
    public static long m30799e() {
        return f30380e.incrementAndGet();
    }

    /* renamed from: a */
    public String mo34497a() {
        return this.f30383c;
    }

    /* renamed from: a */
    public boolean mo7088a(C11722a aVar) {
        return true;
    }

    /* renamed from: b */
    public String mo34498b() {
        return this.f30384d;
    }

    /* renamed from: c */
    public long mo34500c() {
        return this.f30381a;
    }

    /* renamed from: d */
    public AdapterViewType mo10146d() {
        return this.f30382b;
    }

    public C11722a(AdapterViewType adapterViewType, long j) {
        this.f30382b = adapterViewType;
        this.f30381a = j;
    }

    /* renamed from: b */
    public final boolean mo34499b(C11722a aVar) {
        return mo34500c() == aVar.mo34500c() && mo10146d().equals(aVar.mo10146d());
    }
}
