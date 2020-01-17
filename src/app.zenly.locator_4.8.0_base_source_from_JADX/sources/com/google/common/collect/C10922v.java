package com.google.common.collect;

import com.google.common.base.C10837b;
import com.google.common.base.C10838c;
import com.google.common.base.C10844f;
import com.google.common.base.C10844f.C10846b;
import com.google.common.base.C10850i;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: com.google.common.collect.v */
public final class C10922v {

    /* renamed from: a */
    boolean f28483a;

    /* renamed from: b */
    int f28484b = -1;

    /* renamed from: c */
    int f28485c = -1;

    /* renamed from: d */
    C10944p f28486d;

    /* renamed from: e */
    C10944p f28487e;

    /* renamed from: f */
    C10838c<Object> f28488f;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C10922v mo31789a(C10838c<Object> cVar) {
        C10850i.m28018b(this.f28488f == null, "key equivalence was already set to %s", (Object) this.f28488f);
        C10850i.m28004a(cVar);
        this.f28488f = cVar;
        this.f28483a = true;
        return this;
    }

    /* renamed from: b */
    public C10922v mo31792b(int i) {
        boolean z = true;
        C10850i.m28010a(this.f28484b == -1, "initial capacity was already set to %s", this.f28484b);
        if (i < 0) {
            z = false;
        }
        C10850i.m28008a(z);
        this.f28484b = i;
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public C10838c<Object> mo31794c() {
        return (C10838c) C10844f.m27992a(this.f28488f, mo31795d().mo31901a());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public C10944p mo31795d() {
        return (C10944p) C10844f.m27992a(this.f28486d, C10944p.STRONG);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public C10944p mo31796e() {
        return (C10944p) C10844f.m27992a(this.f28487e, C10944p.STRONG);
    }

    /* renamed from: f */
    public <K, V> ConcurrentMap<K, V> mo31797f() {
        if (!this.f28483a) {
            return new ConcurrentHashMap(mo31791b(), 0.75f, mo31787a());
        }
        return C10923w.m28156a(this);
    }

    /* renamed from: g */
    public C10922v mo31798g() {
        mo31790a(C10944p.WEAK);
        return this;
    }

    public String toString() {
        C10846b a = C10844f.m27991a(this);
        int i = this.f28484b;
        if (i != -1) {
            a.mo31473a("initialCapacity", i);
        }
        int i2 = this.f28485c;
        if (i2 != -1) {
            a.mo31473a("concurrencyLevel", i2);
        }
        C10944p pVar = this.f28486d;
        if (pVar != null) {
            a.mo31474a("keyStrength", (Object) C10837b.m27970a(pVar.toString()));
        }
        C10944p pVar2 = this.f28487e;
        if (pVar2 != null) {
            a.mo31474a("valueStrength", (Object) C10837b.m27970a(pVar2.toString()));
        }
        if (this.f28488f != null) {
            a.mo31472a("keyEquivalence");
        }
        return a.toString();
    }

    /* renamed from: a */
    public C10922v mo31788a(int i) {
        boolean z = true;
        C10850i.m28010a(this.f28485c == -1, "concurrency level was already set to %s", this.f28485c);
        if (i <= 0) {
            z = false;
        }
        C10850i.m28008a(z);
        this.f28485c = i;
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo31791b() {
        int i = this.f28484b;
        if (i == -1) {
            return 16;
        }
        return i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C10922v mo31793b(C10944p pVar) {
        C10850i.m28018b(this.f28487e == null, "Value strength was already set to %s", (Object) this.f28487e);
        C10850i.m28004a(pVar);
        this.f28487e = pVar;
        if (pVar != C10944p.STRONG) {
            this.f28483a = true;
        }
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo31787a() {
        int i = this.f28485c;
        if (i == -1) {
            return 4;
        }
        return i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C10922v mo31790a(C10944p pVar) {
        C10850i.m28018b(this.f28486d == null, "Key strength was already set to %s", (Object) this.f28486d);
        C10850i.m28004a(pVar);
        this.f28486d = pVar;
        if (pVar != C10944p.STRONG) {
            this.f28483a = true;
        }
        return this;
    }
}
