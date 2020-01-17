package p214e.p222b.p223a.p225b;

import java.util.HashMap;
import java.util.Map.Entry;

/* renamed from: e.b.a.b.a */
public class C7557a<K, V> extends C7558b<K, V> {

    /* renamed from: i */
    private HashMap<K, C7561c<K, V>> f18976i = new HashMap<>();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C7561c<K, V> mo19442a(K k) {
        return (C7561c) this.f18976i.get(k);
    }

    /* renamed from: b */
    public V mo19443b(K k, V v) {
        C7561c a = mo19442a(k);
        if (a != null) {
            return a.f18982f;
        }
        this.f18976i.put(k, mo19447a(k, v));
        return null;
    }

    public boolean contains(K k) {
        return this.f18976i.containsKey(k);
    }

    public V remove(K k) {
        V remove = super.remove(k);
        this.f18976i.remove(k);
        return remove;
    }

    /* renamed from: b */
    public Entry<K, V> mo19444b(K k) {
        if (contains(k)) {
            return ((C7561c) this.f18976i.get(k)).f18984h;
        }
        return null;
    }
}
