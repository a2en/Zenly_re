package p333g.p378f.p380b.p381a;

import android.util.SparseArray;

/* renamed from: g.f.b.a.c */
public class C12121c<T> extends SparseArray<T> {
    public C12121c() {
    }

    /* renamed from: a */
    static <K> C12121c<K> m31993a(SparseArray<K> sparseArray) {
        if (sparseArray == null) {
            return null;
        }
        if (sparseArray instanceof C12121c) {
            return (C12121c) sparseArray;
        }
        int size = sparseArray.size();
        C12121c<K> cVar = new C12121c<>(size);
        for (int i = 0; i < size; i++) {
            cVar.append(sparseArray.keyAt(i), sparseArray.valueAt(i));
        }
        return cVar;
    }

    public synchronized void append(int i, T t) {
        super.append(i, t);
    }

    public synchronized void clear() {
        super.clear();
    }

    public synchronized void delete(int i) {
        super.delete(i);
    }

    public synchronized T get(int i) {
        return super.get(i);
    }

    public synchronized int indexOfKey(int i) {
        return super.indexOfKey(i);
    }

    public synchronized int indexOfValue(T t) {
        return super.indexOfValue(t);
    }

    public synchronized int keyAt(int i) {
        return super.keyAt(i);
    }

    public synchronized void put(int i, T t) {
        super.put(i, t);
    }

    public synchronized void remove(int i) {
        super.remove(i);
    }

    public synchronized void removeAt(int i) {
        super.removeAt(i);
    }

    public synchronized void removeAtRange(int i, int i2) {
        super.removeAtRange(i, i2);
    }

    public synchronized void setValueAt(int i, T t) {
        super.setValueAt(i, t);
    }

    public synchronized int size() {
        return super.size();
    }

    public synchronized T valueAt(int i) {
        return super.valueAt(i);
    }

    public C12121c(int i) {
        super(i);
    }

    public synchronized SparseArray<T> clone() {
        return super.clone();
    }

    public synchronized T get(int i, T t) {
        return super.get(i, t);
    }
}
