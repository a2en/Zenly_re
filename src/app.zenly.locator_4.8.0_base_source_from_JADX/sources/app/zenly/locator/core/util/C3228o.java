package app.zenly.locator.core.util;

import java.util.ArrayList;
import java.util.Collection;

/* renamed from: app.zenly.locator.core.util.o */
public class C3228o<E> extends ArrayList<E> {

    /* renamed from: e */
    private int f9003e = 0;

    /* renamed from: f */
    private final ArrayList<Object> f9004f = new ArrayList<>();

    /* renamed from: a */
    public boolean mo9641a() {
        return this.f9003e > 0;
    }

    /* renamed from: b */
    public void mo9642b() {
        this.f9003e++;
    }

    /* renamed from: c */
    public void mo9643c() {
        this.f9003e--;
        if (this.f9003e < 0) {
            this.f9003e = 0;
        }
        if (this.f9003e == 0 && this.f9004f.size() > 0) {
            int size = this.f9004f.size();
            for (int i = 0; i < size; i++) {
                remove(this.f9004f.get(i));
            }
            this.f9004f.clear();
        }
    }

    public boolean contains(Object obj) {
        boolean contains = super.contains(obj);
        boolean contains2 = this.f9004f.contains(obj);
        if (contains && contains2) {
            int size = size();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                if (get(i2) == obj) {
                    i++;
                }
            }
            int size2 = this.f9004f.size();
            int i3 = 0;
            for (int i4 = 0; i4 < size2; i4++) {
                if (this.f9004f.get(i4) == obj) {
                    i3++;
                }
            }
            contains2 = i3 >= i;
        }
        if (!contains || contains2) {
            return false;
        }
        return true;
    }

    public boolean remove(Object obj) {
        if (!mo9641a()) {
            return super.remove(obj);
        }
        if (!contains(obj)) {
            return false;
        }
        this.f9004f.add(obj);
        return true;
    }

    public boolean removeAll(Collection<?> collection) {
        boolean z;
        if (!mo9641a()) {
            return super.removeAll(collection);
        }
        int size = collection.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                z = false;
                break;
            } else if (contains(collection)) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (!z) {
            return false;
        }
        this.f9004f.addAll(collection);
        return true;
    }

    /* access modifiers changed from: protected */
    public void removeRange(int i, int i2) {
        if (!mo9641a()) {
            super.removeRange(i, i2);
            return;
        }
        while (i < i2) {
            this.f9004f.add(get(i));
            i++;
        }
    }

    public E remove(int i) {
        if (!mo9641a()) {
            return super.remove(i);
        }
        E e = get(i);
        if (e != null) {
            this.f9004f.add(e);
        }
        return e;
    }
}
