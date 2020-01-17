package p214e.p229f.p232b;

/* renamed from: e.f.b.h */
class C7604h<T> implements C7603g<T> {

    /* renamed from: a */
    private final Object[] f19167a;

    /* renamed from: b */
    private int f19168b;

    C7604h(int i) {
        if (i > 0) {
            this.f19167a = new Object[i];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    /* renamed from: a */
    public void mo19719a(T[] tArr, int i) {
        if (i > tArr.length) {
            i = tArr.length;
        }
        for (int i2 = 0; i2 < i; i2++) {
            T t = tArr[i2];
            int i3 = this.f19168b;
            Object[] objArr = this.f19167a;
            if (i3 < objArr.length) {
                objArr[i3] = t;
                this.f19168b = i3 + 1;
            }
        }
    }

    public T acquire() {
        int i = this.f19168b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        T[] tArr = this.f19167a;
        T t = tArr[i2];
        tArr[i2] = null;
        this.f19168b = i - 1;
        return t;
    }

    public boolean release(T t) {
        int i = this.f19168b;
        Object[] objArr = this.f19167a;
        if (i >= objArr.length) {
            return false;
        }
        objArr[i] = t;
        this.f19168b = i + 1;
        return true;
    }
}
