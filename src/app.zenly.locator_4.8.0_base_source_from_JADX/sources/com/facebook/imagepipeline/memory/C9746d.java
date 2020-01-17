package com.facebook.imagepipeline.memory;

import com.facebook.common.internal.C9536j;
import com.facebook.common.logging.C9543a;
import java.util.LinkedList;
import java.util.Queue;

/* renamed from: com.facebook.imagepipeline.memory.d */
class C9746d<V> {

    /* renamed from: a */
    public final int f25641a;

    /* renamed from: b */
    public final int f25642b;

    /* renamed from: c */
    final Queue f25643c;

    /* renamed from: d */
    private final boolean f25644d;

    /* renamed from: e */
    private int f25645e;

    public C9746d(int i, int i2, int i3, boolean z) {
        boolean z2 = true;
        C9536j.m23279b(i > 0);
        C9536j.m23279b(i2 >= 0);
        if (i3 < 0) {
            z2 = false;
        }
        C9536j.m23279b(z2);
        this.f25641a = i;
        this.f25642b = i2;
        this.f25643c = new LinkedList();
        this.f25645e = i3;
        this.f25644d = z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo26527a(V v) {
        this.f25643c.add(v);
    }

    @Deprecated
    /* renamed from: b */
    public V mo26528b() {
        V g = mo26534g();
        if (g != null) {
            this.f25645e++;
        }
        return g;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public int mo26530c() {
        return this.f25643c.size();
    }

    /* renamed from: d */
    public int mo26531d() {
        return this.f25645e;
    }

    /* renamed from: e */
    public void mo26532e() {
        this.f25645e++;
    }

    /* renamed from: f */
    public boolean mo26533f() {
        return this.f25645e + mo26530c() > this.f25642b;
    }

    /* renamed from: g */
    public V mo26534g() {
        return this.f25643c.poll();
    }

    /* renamed from: a */
    public void mo26526a() {
        C9536j.m23279b(this.f25645e > 0);
        this.f25645e--;
    }

    /* renamed from: b */
    public void mo26529b(V v) {
        C9536j.m23271a(v);
        boolean z = false;
        if (this.f25644d) {
            if (this.f25645e > 0) {
                z = true;
            }
            C9536j.m23279b(z);
            this.f25645e--;
            mo26527a(v);
            return;
        }
        int i = this.f25645e;
        if (i > 0) {
            this.f25645e = i - 1;
            mo26527a(v);
            return;
        }
        C9543a.m23310a("BUCKET", "Tried to release value %s from an empty bucket!", v);
    }
}
