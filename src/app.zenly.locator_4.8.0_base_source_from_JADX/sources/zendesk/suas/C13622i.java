package zendesk.suas;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* renamed from: zendesk.suas.i */
public class C13622i implements Serializable {

    /* renamed from: e */
    private final Map<String, Object> f35161e;

    C13622i(Map<String, Object> map) {
        this.f35161e = new HashMap(map);
    }

    /* renamed from: a */
    static C13622i m35937a(C13622i iVar, C13622i iVar2) {
        if (iVar2 == null) {
            return iVar;
        }
        C13622i a = iVar2.mo39266a();
        for (String str : iVar.m35939b()) {
            if (a.mo39264a(str) == null) {
                a.mo39267a(str, iVar.mo39264a(str));
            }
        }
        return a;
    }

    /* renamed from: b */
    static String m35938b(Class cls) {
        return cls.getSimpleName();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C13622i.class != obj.getClass()) {
            return false;
        }
        return this.f35161e.equals(((C13622i) obj).f35161e);
    }

    public int hashCode() {
        return this.f35161e.hashCode();
    }

    public String toString() {
        return this.f35161e.toString();
    }

    /* renamed from: b */
    private Collection<String> m35939b() {
        return this.f35161e.keySet();
    }

    public C13622i() {
        this.f35161e = new HashMap();
    }

    /* renamed from: a */
    public Object mo39264a(String str) {
        return this.f35161e.get(str);
    }

    /* renamed from: a */
    public <E> E mo39263a(Class<E> cls) {
        E e = this.f35161e.get(m35938b(cls));
        if (cls.isInstance(e)) {
            return e;
        }
        return null;
    }

    /* renamed from: a */
    public <E> E mo39265a(String str, Class<E> cls) {
        E e = this.f35161e.get(str);
        if (cls.isInstance(e)) {
            return e;
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C13622i mo39266a() {
        return new C13622i(new HashMap(this.f35161e));
    }

    /* renamed from: a */
    public void mo39267a(String str, Object obj) {
        this.f35161e.put(str, obj);
    }
}
