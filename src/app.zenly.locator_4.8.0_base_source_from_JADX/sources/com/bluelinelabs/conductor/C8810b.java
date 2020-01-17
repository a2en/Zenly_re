package com.bluelinelabs.conductor;

import android.os.Bundle;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.bluelinelabs.conductor.b */
class C8810b implements Iterable<C8836h> {

    /* renamed from: e */
    private final Deque<C8836h> f22841e = new ArrayDeque();

    C8810b() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo23875a(C8836h hVar) {
        this.f22841e.push(hVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public Iterator<C8836h> mo23878b() {
        return this.f22841e.descendingIterator();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public C8836h mo23880c() {
        if (this.f22841e.size() > 0) {
            return (C8836h) this.f22841e.getLast();
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    public boolean isEmpty() {
        return this.f22841e.isEmpty();
    }

    public Iterator<C8836h> iterator() {
        return this.f22841e.iterator();
    }

    /* access modifiers changed from: 0000 */
    public C8836h peek() {
        return (C8836h) this.f22841e.peek();
    }

    /* access modifiers changed from: 0000 */
    public C8836h pop() {
        C8836h hVar = (C8836h) this.f22841e.pop();
        hVar.f22940a.mo23899a();
        return hVar;
    }

    /* access modifiers changed from: 0000 */
    public int size() {
        return this.f22841e.size();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public List<C8836h> mo23873a() {
        ArrayList arrayList = new ArrayList();
        while (!isEmpty()) {
            arrayList.add(pop());
        }
        return arrayList;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo23879b(Bundle bundle) {
        ArrayList arrayList = new ArrayList(this.f22841e.size());
        for (C8836h e : this.f22841e) {
            arrayList.add(e.mo24030e());
        }
        bundle.putParcelableArrayList("Backstack.entries", arrayList);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo23876a(List<C8836h> list) {
        this.f22841e.clear();
        for (C8836h push : list) {
            this.f22841e.push(push);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo23877a(C8819d dVar) {
        for (C8836h hVar : this.f22841e) {
            if (dVar == hVar.f22940a) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo23874a(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("Backstack.entries");
        if (parcelableArrayList != null) {
            Collections.reverse(parcelableArrayList);
            Iterator it = parcelableArrayList.iterator();
            while (it.hasNext()) {
                this.f22841e.push(new C8836h((Bundle) it.next()));
            }
        }
    }
}
