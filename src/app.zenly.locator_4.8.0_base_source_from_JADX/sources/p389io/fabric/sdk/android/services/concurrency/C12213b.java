package p389io.fabric.sdk.android.services.concurrency;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import p389io.fabric.sdk.android.services.concurrency.Dependency;
import p389io.fabric.sdk.android.services.concurrency.PriorityProvider;
import p389io.fabric.sdk.android.services.concurrency.Task;

/* renamed from: io.fabric.sdk.android.services.concurrency.b */
public class C12213b<E extends Dependency & Task & PriorityProvider> extends PriorityBlockingQueue<E> {

    /* renamed from: e */
    final Queue<E> f31758e = new LinkedList();

    /* renamed from: f */
    private final ReentrantLock f31759f = new ReentrantLock();

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo36120a(int i, E e) {
        try {
            this.f31759f.lock();
            if (i == 1) {
                super.remove(e);
            }
            boolean offer = this.f31758e.offer(e);
            return offer;
        } finally {
            this.f31759f.unlock();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public E mo36123b(int i, Long l, TimeUnit timeUnit) throws InterruptedException {
        E e;
        if (i == 0) {
            e = (Dependency) super.take();
        } else if (i == 1) {
            e = (Dependency) super.peek();
        } else if (i == 2) {
            e = (Dependency) super.poll();
        } else if (i != 3) {
            return null;
        } else {
            e = (Dependency) super.poll(l.longValue(), timeUnit);
        }
        return e;
    }

    public void clear() {
        try {
            this.f31759f.lock();
            this.f31758e.clear();
            super.clear();
        } finally {
            this.f31759f.unlock();
        }
    }

    public boolean contains(Object obj) {
        try {
            this.f31759f.lock();
            return super.contains(obj) || this.f31758e.contains(obj);
        } finally {
            this.f31759f.unlock();
        }
    }

    public int drainTo(Collection<? super E> collection) {
        try {
            this.f31759f.lock();
            int drainTo = super.drainTo(collection) + this.f31758e.size();
            while (!this.f31758e.isEmpty()) {
                collection.add(this.f31758e.poll());
            }
            return drainTo;
        } finally {
            this.f31759f.unlock();
        }
    }

    public boolean remove(Object obj) {
        try {
            this.f31759f.lock();
            return super.remove(obj) || this.f31758e.remove(obj);
        } finally {
            this.f31759f.unlock();
        }
    }

    public boolean removeAll(Collection<?> collection) {
        try {
            this.f31759f.lock();
            return this.f31758e.removeAll(collection) | super.removeAll(collection);
        } finally {
            this.f31759f.unlock();
        }
    }

    public int size() {
        try {
            this.f31759f.lock();
            return this.f31758e.size() + super.size();
        } finally {
            this.f31759f.unlock();
        }
    }

    public <T> T[] toArray(T[] tArr) {
        try {
            this.f31759f.lock();
            return mo36122a((T[]) super.toArray(tArr), (T[]) this.f31758e.toArray(tArr));
        } finally {
            this.f31759f.unlock();
        }
    }

    public E peek() {
        try {
            return mo36118a(1, null, null);
        } catch (InterruptedException unused) {
            return null;
        }
    }

    public E take() throws InterruptedException {
        return mo36118a(0, null, null);
    }

    public E poll(long j, TimeUnit timeUnit) throws InterruptedException {
        return mo36118a(3, Long.valueOf(j), timeUnit);
    }

    public E poll() {
        try {
            return mo36118a(2, null, null);
        } catch (InterruptedException unused) {
            return null;
        }
    }

    public Object[] toArray() {
        try {
            this.f31759f.lock();
            return mo36122a((T[]) super.toArray(), (T[]) this.f31758e.toArray());
        } finally {
            this.f31759f.unlock();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public E mo36118a(int i, Long l, TimeUnit timeUnit) throws InterruptedException {
        E b;
        while (true) {
            b = mo36123b(i, l, timeUnit);
            if (b == null || mo36121a(b)) {
                return b;
            }
            mo36120a(i, b);
        }
        return b;
    }

    public int drainTo(Collection<? super E> collection, int i) {
        try {
            this.f31759f.lock();
            int drainTo = super.drainTo(collection, i);
            while (!this.f31758e.isEmpty() && drainTo <= i) {
                collection.add(this.f31758e.poll());
                drainTo++;
            }
            return drainTo;
        } finally {
            this.f31759f.unlock();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo36121a(E e) {
        return e.areDependenciesMet();
    }

    /* renamed from: a */
    public void mo36119a() {
        try {
            this.f31759f.lock();
            Iterator it = this.f31758e.iterator();
            while (it.hasNext()) {
                Dependency dependency = (Dependency) it.next();
                if (mo36121a(dependency)) {
                    super.offer(dependency);
                    it.remove();
                }
            }
        } finally {
            this.f31759f.unlock();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public <T> T[] mo36122a(T[] tArr, T[] tArr2) {
        int length = tArr.length;
        int length2 = tArr2.length;
        T[] tArr3 = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), length + length2);
        System.arraycopy(tArr, 0, tArr3, 0, length);
        System.arraycopy(tArr2, 0, tArr3, length, length2);
        return tArr3;
    }
}
