package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AvailabilityException;
import com.google.android.gms.tasks.C10694d;
import java.util.Map;
import java.util.Set;
import p214e.p228e.C7571a;

/* renamed from: com.google.android.gms.common.api.internal.r0 */
public final class C10049r0 {

    /* renamed from: a */
    private final C7571a<C10011b<?>, ConnectionResult> f26417a;

    /* renamed from: b */
    private final C7571a<C10011b<?>, String> f26418b;

    /* renamed from: c */
    private final C10694d<Map<C10011b<?>, String>> f26419c;

    /* renamed from: d */
    private int f26420d;

    /* renamed from: e */
    private boolean f26421e;

    /* renamed from: a */
    public final Set<C10011b<?>> mo27224a() {
        return this.f26417a.keySet();
    }

    /* renamed from: a */
    public final void mo27225a(C10011b<?> bVar, ConnectionResult connectionResult, String str) {
        this.f26417a.put(bVar, connectionResult);
        this.f26418b.put(bVar, str);
        this.f26420d--;
        if (!connectionResult.isSuccess()) {
            this.f26421e = true;
        }
        if (this.f26420d == 0) {
            if (this.f26421e) {
                this.f26419c.mo29326a((Exception) new AvailabilityException(this.f26417a));
                return;
            }
            this.f26419c.mo29327a(this.f26418b);
        }
    }
}
