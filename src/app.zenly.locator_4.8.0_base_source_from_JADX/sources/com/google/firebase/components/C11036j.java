package com.google.firebase.components;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.firebase.components.j */
class C11036j {

    /* renamed from: com.google.firebase.components.j$b */
    private static class C11038b {

        /* renamed from: a */
        private final C11025d<?> f28637a;

        /* renamed from: b */
        private final Set<C11038b> f28638b = new HashSet();

        /* renamed from: c */
        private final Set<C11038b> f28639c = new HashSet();

        C11038b(C11025d<?> dVar) {
            this.f28637a = dVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo32193a(C11038b bVar) {
            this.f28638b.add(bVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo32195b(C11038b bVar) {
            this.f28639c.add(bVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo32196c(C11038b bVar) {
            this.f28639c.remove(bVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public boolean mo32198d() {
            return this.f28639c.isEmpty();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C11025d<?> mo32192a() {
            return this.f28637a;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public Set<C11038b> mo32194b() {
            return this.f28638b;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public boolean mo32197c() {
            return this.f28638b.isEmpty();
        }
    }

    /* renamed from: com.google.firebase.components.j$c */
    private static class C11039c {

        /* renamed from: a */
        private final Class<?> f28640a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final boolean f28641b;

        public boolean equals(Object obj) {
            if (!(obj instanceof C11039c)) {
                return false;
            }
            C11039c cVar = (C11039c) obj;
            if (!cVar.f28640a.equals(this.f28640a) || cVar.f28641b != this.f28641b) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return ((this.f28640a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f28641b).hashCode();
        }

        private C11039c(Class<?> cls, boolean z) {
            this.f28640a = cls;
            this.f28641b = z;
        }
    }

    /* renamed from: a */
    static void m28431a(List<C11025d<?>> list) {
        Set<C11038b> b = m28432b(list);
        Set a = m28430a(b);
        int i = 0;
        while (!a.isEmpty()) {
            C11038b bVar = (C11038b) a.iterator().next();
            a.remove(bVar);
            i++;
            for (C11038b bVar2 : bVar.mo32194b()) {
                bVar2.mo32196c(bVar);
                if (bVar2.mo32198d()) {
                    a.add(bVar2);
                }
            }
        }
        if (i != list.size()) {
            ArrayList arrayList = new ArrayList();
            for (C11038b bVar3 : b) {
                if (!bVar3.mo32198d() && !bVar3.mo32197c()) {
                    arrayList.add(bVar3.mo32192a());
                }
            }
            throw new DependencyCycleException(arrayList);
        }
    }

    /* renamed from: b */
    private static Set<C11038b> m28432b(List<C11025d<?>> list) {
        HashMap hashMap = new HashMap(list.size());
        for (C11025d dVar : list) {
            C11038b bVar = new C11038b(dVar);
            Iterator it = dVar.mo32177c().iterator();
            while (true) {
                if (it.hasNext()) {
                    Class cls = (Class) it.next();
                    C11039c cVar = new C11039c(cls, !dVar.mo32181g());
                    if (!hashMap.containsKey(cVar)) {
                        hashMap.put(cVar, new HashSet());
                    }
                    Set set = (Set) hashMap.get(cVar);
                    if (set.isEmpty() || cVar.f28641b) {
                        set.add(bVar);
                    } else {
                        throw new IllegalArgumentException(String.format("Multiple components provide %s.", new Object[]{cls}));
                    }
                }
            }
        }
        for (Set<C11038b> it2 : hashMap.values()) {
            for (C11038b bVar2 : it2) {
                for (C11040k kVar : bVar2.mo32192a().mo32175a()) {
                    if (kVar.mo32202b()) {
                        Set<C11038b> set2 = (Set) hashMap.get(new C11039c(kVar.mo32201a(), kVar.mo32204d()));
                        if (set2 != null) {
                            for (C11038b bVar3 : set2) {
                                bVar2.mo32193a(bVar3);
                                bVar3.mo32195b(bVar2);
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        for (Set addAll : hashMap.values()) {
            hashSet.addAll(addAll);
        }
        return hashSet;
    }

    /* renamed from: a */
    private static Set<C11038b> m28430a(Set<C11038b> set) {
        HashSet hashSet = new HashSet();
        for (C11038b bVar : set) {
            if (bVar.mo32198d()) {
                hashSet.add(bVar);
            }
        }
        return hashSet;
    }
}
