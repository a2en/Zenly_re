package com.facebook.imagepipeline.memory;

import android.util.SparseArray;
import java.util.LinkedList;

/* renamed from: com.facebook.imagepipeline.memory.e */
public class C9747e<T> {

    /* renamed from: a */
    protected final SparseArray<C9749b<T>> f25646a = new SparseArray<>();

    /* renamed from: b */
    C9749b<T> f25647b;

    /* renamed from: c */
    C9749b<T> f25648c;

    /* renamed from: com.facebook.imagepipeline.memory.e$b */
    static class C9749b<I> {

        /* renamed from: a */
        C9749b<I> f25649a;

        /* renamed from: b */
        int f25650b;

        /* renamed from: c */
        LinkedList<I> f25651c;

        /* renamed from: d */
        C9749b<I> f25652d;

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("LinkedEntry(key: ");
            sb.append(this.f25650b);
            sb.append(")");
            return sb.toString();
        }

        private C9749b(C9749b<I> bVar, int i, LinkedList<I> linkedList, C9749b<I> bVar2) {
            this.f25649a = bVar;
            this.f25650b = i;
            this.f25651c = linkedList;
            this.f25652d = bVar2;
        }
    }

    /* renamed from: b */
    private void m24193b(C9749b<T> bVar) {
        if (this.f25647b != bVar) {
            m24194c(bVar);
            C9749b<T> bVar2 = this.f25647b;
            if (bVar2 == null) {
                this.f25647b = bVar;
                this.f25648c = bVar;
                return;
            }
            bVar.f25652d = bVar2;
            bVar2.f25649a = bVar;
            this.f25647b = bVar;
        }
    }

    /* renamed from: c */
    private synchronized void m24194c(C9749b<T> bVar) {
        C9749b<I> bVar2 = bVar.f25649a;
        C9749b<I> bVar3 = bVar.f25652d;
        if (bVar2 != null) {
            bVar2.f25652d = bVar3;
        }
        if (bVar3 != null) {
            bVar3.f25649a = bVar2;
        }
        bVar.f25649a = null;
        bVar.f25652d = null;
        if (bVar == this.f25647b) {
            this.f25647b = bVar3;
        }
        if (bVar == this.f25648c) {
            this.f25648c = bVar2;
        }
    }

    /* renamed from: a */
    public synchronized T mo26536a(int i) {
        C9749b bVar = (C9749b) this.f25646a.get(i);
        if (bVar == null) {
            return null;
        }
        T pollFirst = bVar.f25651c.pollFirst();
        m24193b(bVar);
        return pollFirst;
    }

    /* renamed from: a */
    public synchronized void mo26537a(int i, T t) {
        C9749b bVar = (C9749b) this.f25646a.get(i);
        if (bVar == null) {
            bVar = new C9749b(null, i, new LinkedList(), null);
            this.f25646a.put(i, bVar);
        }
        bVar.f25651c.addLast(t);
        m24193b(bVar);
    }

    /* renamed from: a */
    public synchronized T mo26535a() {
        C9749b<T> bVar = this.f25648c;
        if (bVar == null) {
            return null;
        }
        T pollLast = bVar.f25651c.pollLast();
        m24192a(bVar);
        return pollLast;
    }

    /* renamed from: a */
    private void m24192a(C9749b<T> bVar) {
        if (bVar != null && bVar.f25651c.isEmpty()) {
            m24194c(bVar);
            this.f25646a.remove(bVar.f25650b);
        }
    }
}
