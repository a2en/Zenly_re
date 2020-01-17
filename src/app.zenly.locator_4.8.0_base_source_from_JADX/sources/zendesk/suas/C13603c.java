package zendesk.suas;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: zendesk.suas.c */
class C13603c {

    /* renamed from: a */
    private final Collection<C13621h> f35137a;

    /* renamed from: b */
    private final Collection<String> f35138b;

    /* renamed from: zendesk.suas.c$a */
    static class C13604a {

        /* renamed from: a */
        private final Collection<String> f35139a;

        /* renamed from: b */
        private final C13622i f35140b;

        C13604a(Collection<String> collection, C13622i iVar) {
            this.f35139a = collection;
            this.f35140b = iVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C13622i mo39254a() {
            return this.f35140b;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public Collection<String> mo39255b() {
            return this.f35139a;
        }
    }

    C13603c(Collection<C13621h> collection) {
        m35907a(collection);
        this.f35137a = collection;
        this.f35138b = m35908b(collection);
    }

    /* renamed from: a */
    private void m35907a(Collection<C13621h> collection) {
        if (collection == null || collection.size() == 0) {
            throw new IllegalArgumentException("No reducers provided");
        }
        HashSet hashSet = new HashSet();
        for (C13621h stateKey : collection) {
            hashSet.add(stateKey.getStateKey());
        }
        if (hashSet.size() != collection.size()) {
            throw new IllegalArgumentException("Two or more reducers are tied to the same key");
        }
    }

    /* renamed from: b */
    private Collection<String> m35908b(Collection<C13621h> collection) {
        HashSet hashSet = new HashSet();
        for (C13621h stateKey : collection) {
            hashSet.add(stateKey.getStateKey());
        }
        return hashSet;
    }

    /* renamed from: b */
    public C13622i mo39253b() {
        HashMap hashMap = new HashMap(this.f35137a.size());
        for (C13621h hVar : this.f35137a) {
            hashMap.put(hVar.getStateKey(), hVar.getInitialState());
        }
        return new C13622i(hashMap);
    }

    /* renamed from: a */
    public C13604a mo39252a(C13622i iVar, C13600a<?> aVar) {
        C13622i iVar2 = new C13622i();
        HashSet hashSet = new HashSet();
        for (C13621h hVar : this.f35137a) {
            Object a = iVar.mo39264a(hVar.getStateKey());
            Object reduce = hVar.reduce(a, aVar);
            if (reduce != null) {
                iVar2.mo39267a(hVar.getStateKey(), reduce);
                hashSet.add(hVar.getStateKey());
            } else {
                iVar2.mo39267a(hVar.getStateKey(), a);
            }
        }
        return new C13604a(hashSet, iVar2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Collection<String> mo39251a() {
        return this.f35138b;
    }
}
