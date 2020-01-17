package org.greenrobot.eventbus;

/* renamed from: org.greenrobot.eventbus.m */
final class C13387m {

    /* renamed from: a */
    final Object f34751a;

    /* renamed from: b */
    final C13384k f34752b;

    /* renamed from: c */
    volatile boolean f34753c = true;

    C13387m(Object obj, C13384k kVar) {
        this.f34751a = obj;
        this.f34752b = kVar;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C13387m)) {
            return false;
        }
        C13387m mVar = (C13387m) obj;
        if (this.f34751a != mVar.f34751a || !this.f34752b.equals(mVar.f34752b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f34751a.hashCode() + this.f34752b.f34738f.hashCode();
    }
}
