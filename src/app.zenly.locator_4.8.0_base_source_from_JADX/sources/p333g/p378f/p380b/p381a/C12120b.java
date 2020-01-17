package p333g.p378f.p380b.p381a;

import android.util.LongSparseArray;
import android.util.SparseArray;

/* renamed from: g.f.b.a.b */
class C12120b<T> extends LongSparseArray<SparseArray<T>> {
    public C12120b(int i) {
        super(i);
    }

    /* renamed from: a */
    public synchronized void setValueAt(int i, SparseArray<T> sparseArray) {
        super.setValueAt(i, C12121c.m31993a(sparseArray));
    }

    /* renamed from: b */
    public synchronized SparseArray<T> get(long j, SparseArray<T> sparseArray) {
        return (SparseArray) super.get(j, sparseArray);
    }

    /* renamed from: c */
    public synchronized void put(long j, SparseArray<T> sparseArray) {
        super.put(j, C12121c.m31993a(sparseArray));
    }

    public synchronized void clear() {
        super.clear();
    }

    public synchronized void delete(long j) {
        super.delete(j);
    }

    public synchronized int indexOfKey(long j) {
        return super.indexOfKey(j);
    }

    public synchronized long keyAt(int i) {
        return super.keyAt(i);
    }

    public synchronized void remove(long j) {
        super.remove(j);
    }

    public synchronized void removeAt(int i) {
        super.removeAt(i);
    }

    public synchronized int size() {
        return super.size();
    }

    public synchronized LongSparseArray<SparseArray<T>> clone() {
        return super.clone();
    }

    public synchronized SparseArray<T> valueAt(int i) {
        return (SparseArray) super.valueAt(i);
    }

    /* renamed from: a */
    public synchronized void append(long j, SparseArray<T> sparseArray) {
        super.append(j, C12121c.m31993a(sparseArray));
    }

    public synchronized SparseArray<T> get(long j) {
        return (SparseArray) super.get(j);
    }

    /* renamed from: a */
    public synchronized int indexOfValue(SparseArray<T> sparseArray) {
        return super.indexOfValue(sparseArray);
    }
}
