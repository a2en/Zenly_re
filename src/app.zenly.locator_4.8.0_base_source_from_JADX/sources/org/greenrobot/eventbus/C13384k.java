package org.greenrobot.eventbus;

import java.lang.reflect.Method;

/* renamed from: org.greenrobot.eventbus.k */
public class C13384k {

    /* renamed from: a */
    final Method f34733a;

    /* renamed from: b */
    final ThreadMode f34734b;

    /* renamed from: c */
    final Class<?> f34735c;

    /* renamed from: d */
    final int f34736d;

    /* renamed from: e */
    final boolean f34737e;

    /* renamed from: f */
    String f34738f;

    public C13384k(Method method, Class<?> cls, ThreadMode threadMode, int i, boolean z) {
        this.f34733a = method;
        this.f34734b = threadMode;
        this.f34735c = cls;
        this.f34736d = i;
        this.f34737e = z;
    }

    /* renamed from: a */
    private synchronized void m35466a() {
        if (this.f34738f == null) {
            StringBuilder sb = new StringBuilder(64);
            sb.append(this.f34733a.getDeclaringClass().getName());
            sb.append('#');
            sb.append(this.f34733a.getName());
            sb.append('(');
            sb.append(this.f34735c.getName());
            this.f34738f = sb.toString();
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C13384k)) {
            return false;
        }
        m35466a();
        C13384k kVar = (C13384k) obj;
        kVar.m35466a();
        return this.f34738f.equals(kVar.f34738f);
    }

    public int hashCode() {
        return this.f34733a.hashCode();
    }
}
