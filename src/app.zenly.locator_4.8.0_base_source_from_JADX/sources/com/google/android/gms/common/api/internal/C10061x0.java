package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.PendingResult.StatusListener;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.C10694d;
import com.google.android.gms.tasks.OnCompleteListener;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.WeakHashMap;

/* renamed from: com.google.android.gms.common.api.internal.x0 */
public final class C10061x0 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Map<BasePendingResult<?>, Boolean> f26439a = Collections.synchronizedMap(new WeakHashMap());
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Map<C10694d<?>, Boolean> f26440b = Collections.synchronizedMap(new WeakHashMap());

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo27239a(BasePendingResult<? extends Result> basePendingResult, boolean z) {
        this.f26439a.put(basePendingResult, Boolean.valueOf(z));
        basePendingResult.mo27048a((StatusListener) new C10038m(this, basePendingResult));
    }

    /* renamed from: b */
    public final void mo27242b() {
        m25277a(false, C10016d.f26339n);
    }

    /* renamed from: c */
    public final void mo27243c() {
        m25277a(true, C10035k0.f26399a);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final <TResult> void mo27240a(C10694d<TResult> dVar, boolean z) {
        this.f26440b.put(dVar, Boolean.valueOf(z));
        dVar.mo29325a().mo29299a((OnCompleteListener<TResult>) new C10036l<TResult>(this, dVar));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo27241a() {
        return !this.f26439a.isEmpty() || !this.f26440b.isEmpty();
    }

    /* renamed from: a */
    private final void m25277a(boolean z, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (this.f26439a) {
            hashMap = new HashMap(this.f26439a);
        }
        synchronized (this.f26440b) {
            hashMap2 = new HashMap(this.f26440b);
        }
        for (Entry entry : hashMap.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).mo27111b(status);
            }
        }
        for (Entry entry2 : hashMap2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((C10694d) entry2.getKey()).mo29328b((Exception) new ApiException(status));
            }
        }
    }
}
