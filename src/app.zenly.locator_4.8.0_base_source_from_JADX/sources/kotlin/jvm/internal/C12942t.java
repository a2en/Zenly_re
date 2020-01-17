package kotlin.jvm.internal;

import kotlin.reflect.KCallable;
import kotlin.reflect.KProperty;

/* renamed from: kotlin.jvm.internal.t */
public abstract class C12942t extends C12924c implements KProperty {
    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (obj instanceof C12942t) {
            C12942t tVar = (C12942t) obj;
            if (!mo6620d().equals(tVar.mo6620d()) || !getName().equals(tVar.getName()) || !mo6621f().equals(tVar.mo6621f()) || !C12932j.m33817a(mo37240c(), tVar.mo37240c())) {
                z = false;
            }
            return z;
        } else if (obj instanceof KProperty) {
            return obj.equals(mo37238a());
        } else {
            return false;
        }
    }

    public int hashCode() {
        return (((mo6620d().hashCode() * 31) + getName().hashCode()) * 31) + mo6621f().hashCode();
    }

    public boolean isConst() {
        return mo37243e().isConst();
    }

    public boolean isLateinit() {
        return mo37243e().isLateinit();
    }

    public String toString() {
        KCallable a = mo37238a();
        if (a != this) {
            return a.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("property ");
        sb.append(getName());
        sb.append(" (Kotlin reflection is not available)");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public KProperty m33831e() {
        return (KProperty) super.mo37243e();
    }
}
