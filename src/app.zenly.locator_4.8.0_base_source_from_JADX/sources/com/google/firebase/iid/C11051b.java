package com.google.firebase.iid;

import android.util.Base64;
import com.google.android.gms.common.internal.C10120k;
import java.security.KeyPair;

/* renamed from: com.google.firebase.iid.b */
final class C11051b {

    /* renamed from: a */
    private final KeyPair f28674a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final long f28675b;

    C11051b(KeyPair keyPair, long j) {
        this.f28674a = keyPair;
        this.f28675b = j;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final String m28464c() {
        return Base64.encodeToString(this.f28674a.getPublic().getEncoded(), 11);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final String m28465d() {
        return Base64.encodeToString(this.f28674a.getPrivate().getEncoded(), 11);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final long mo32262a() {
        return this.f28675b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final KeyPair mo32263b() {
        return this.f28674a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C11051b)) {
            return false;
        }
        C11051b bVar = (C11051b) obj;
        if (this.f28675b != bVar.f28675b || !this.f28674a.getPublic().equals(bVar.f28674a.getPublic()) || !this.f28674a.getPrivate().equals(bVar.f28674a.getPrivate())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C10120k.m25499a(this.f28674a.getPublic(), this.f28674a.getPrivate(), Long.valueOf(this.f28675b));
    }
}
