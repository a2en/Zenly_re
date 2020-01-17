package p333g.p378f.p380b.p381a;

import android.util.SparseArray;

/* renamed from: g.f.b.a.d */
class C12122d<T> extends SparseArray<SparseArray<T>> {
    public C12122d(int i) {
        super(i);
    }

    /* renamed from: a */
    public synchronized void append(int i, SparseArray<T> sparseArray) {
        super.append(i, C12121c.m31993a(sparseArray));
    }

    /* renamed from: b */
    public synchronized SparseArray<T> get(int i, SparseArray<T> sparseArray) {
        return (SparseArray) super.get(i, sparseArray);
    }

    /* renamed from: c */
    public synchronized void put(int i, SparseArray<T> sparseArray) {
        super.put(i, C12121c.m31993a(sparseArray));
    }

    public synchronized void clear() {
        super.clear();
    }

    /* renamed from: d */
    public synchronized void setValueAt(int i, SparseArray<T> sparseArray) {
        super.setValueAt(i, C12121c.m31993a(sparseArray));
    }

    public synchronized void delete(int i) {
        super.delete(i);
    }

    public synchronized int indexOfKey(int i) {
        return super.indexOfKey(i);
    }

    public synchronized int keyAt(int i) {
        return super.keyAt(i);
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

    public synchronized int size() {
        return super.size();
    }

    public synchronized SparseArray<SparseArray<T>> clone() {
        return super.clone();
    }

    public synchronized SparseArray<T> valueAt(int i) {
        return (SparseArray) super.valueAt(i);
    }

    /* renamed from: a */
    public synchronized int indexOfValue(SparseArray<T> sparseArray) {
        return super.indexOfValue(sparseArray);
    }

    public synchronized SparseArray<T> get(int i) {
        return (SparseArray) super.get(i);
    }
}
