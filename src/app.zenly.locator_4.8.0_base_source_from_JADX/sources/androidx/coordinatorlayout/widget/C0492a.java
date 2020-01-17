package androidx.coordinatorlayout.widget;

import androidx.core.util.C0605g;
import androidx.core.util.Pools$Pool;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import p214e.p228e.C7584g;

/* renamed from: androidx.coordinatorlayout.widget.a */
public final class C0492a<T> {

    /* renamed from: a */
    private final Pools$Pool<ArrayList<T>> f2379a = new C0605g(10);

    /* renamed from: b */
    private final C7584g<T, ArrayList<T>> f2380b = new C7584g<>();

    /* renamed from: c */
    private final ArrayList<T> f2381c = new ArrayList<>();

    /* renamed from: d */
    private final HashSet<T> f2382d = new HashSet<>();

    /* renamed from: a */
    public void mo2910a(T t) {
        if (!this.f2380b.containsKey(t)) {
            this.f2380b.put(t, null);
        }
    }

    /* renamed from: b */
    public boolean mo2913b(T t) {
        return this.f2380b.containsKey(t);
    }

    /* renamed from: c */
    public List mo2914c(T t) {
        return (List) this.f2380b.get(t);
    }

    /* renamed from: d */
    public List<T> mo2915d(T t) {
        int size = this.f2380b.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            ArrayList arrayList2 = (ArrayList) this.f2380b.mo19601d(i);
            if (arrayList2 != null && arrayList2.contains(t)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.f2380b.mo19595b(i));
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public boolean mo2916e(T t) {
        int size = this.f2380b.size();
        for (int i = 0; i < size; i++) {
            ArrayList arrayList = (ArrayList) this.f2380b.mo19601d(i);
            if (arrayList != null && arrayList.contains(t)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    private ArrayList<T> m2333c() {
        ArrayList<T> arrayList = (ArrayList) this.f2379a.acquire();
        return arrayList == null ? new ArrayList<>() : arrayList;
    }

    /* renamed from: b */
    public ArrayList<T> mo2912b() {
        this.f2381c.clear();
        this.f2382d.clear();
        int size = this.f2380b.size();
        for (int i = 0; i < size; i++) {
            m2331a(this.f2380b.mo19595b(i), this.f2381c, this.f2382d);
        }
        return this.f2381c;
    }

    /* renamed from: a */
    public void mo2911a(T t, T t2) {
        if (!this.f2380b.containsKey(t) || !this.f2380b.containsKey(t2)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList arrayList = (ArrayList) this.f2380b.get(t);
        if (arrayList == null) {
            arrayList = m2333c();
            this.f2380b.put(t, arrayList);
        }
        arrayList.add(t2);
    }

    /* renamed from: a */
    public void mo2909a() {
        int size = this.f2380b.size();
        for (int i = 0; i < size; i++) {
            ArrayList arrayList = (ArrayList) this.f2380b.mo19601d(i);
            if (arrayList != null) {
                m2332a(arrayList);
            }
        }
        this.f2380b.clear();
    }

    /* renamed from: a */
    private void m2331a(T t, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (!arrayList.contains(t)) {
            if (!hashSet.contains(t)) {
                hashSet.add(t);
                ArrayList arrayList2 = (ArrayList) this.f2380b.get(t);
                if (arrayList2 != null) {
                    int size = arrayList2.size();
                    for (int i = 0; i < size; i++) {
                        m2331a(arrayList2.get(i), arrayList, hashSet);
                    }
                }
                hashSet.remove(t);
                arrayList.add(t);
                return;
            }
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
    }

    /* renamed from: a */
    private void m2332a(ArrayList<T> arrayList) {
        arrayList.clear();
        this.f2379a.release(arrayList);
    }
}
