package p389io.reactivex.internal.util;

import org.reactivestreams.Subscriber;
import p389io.reactivex.Observer;
import p389io.reactivex.functions.Predicate;

/* renamed from: io.reactivex.internal.util.AppendOnlyLinkedArrayList */
public class AppendOnlyLinkedArrayList<T> {

    /* renamed from: a */
    final int f33259a;

    /* renamed from: b */
    final Object[] f33260b;

    /* renamed from: c */
    Object[] f33261c = this.f33260b;

    /* renamed from: d */
    int f33262d;

    /* renamed from: io.reactivex.internal.util.AppendOnlyLinkedArrayList$NonThrowingPredicate */
    public interface NonThrowingPredicate<T> extends Predicate<T> {
        boolean test(T t);
    }

    public AppendOnlyLinkedArrayList(int i) {
        this.f33259a = i;
        this.f33260b = new Object[(i + 1)];
    }

    /* renamed from: a */
    public void mo36915a(T t) {
        int i = this.f33259a;
        int i2 = this.f33262d;
        if (i2 == i) {
            Object[] objArr = new Object[(i + 1)];
            this.f33261c[i] = objArr;
            this.f33261c = objArr;
            i2 = 0;
        }
        this.f33261c[i2] = t;
        this.f33262d = i2 + 1;
    }

    /* renamed from: b */
    public void mo36918b(T t) {
        this.f33260b[0] = t;
    }

    /* renamed from: a */
    public void mo36914a(NonThrowingPredicate<? super T> nonThrowingPredicate) {
        int i = this.f33259a;
        for (Object[] objArr = this.f33260b; objArr != null; objArr = objArr[i]) {
            int i2 = 0;
            while (i2 < i) {
                Object[] objArr2 = objArr[i2];
                if (objArr2 == null) {
                    continue;
                    break;
                } else if (!nonThrowingPredicate.test(objArr2)) {
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public <U> boolean mo36917a(Subscriber<? super U> subscriber) {
        Object[] objArr = this.f33260b;
        int i = this.f33259a;
        while (true) {
            int i2 = 0;
            if (objArr == null) {
                return false;
            }
            while (i2 < i) {
                Object[] objArr2 = objArr[i2];
                if (objArr2 == null) {
                    continue;
                    break;
                } else if (C12760i.m33367a((Object) objArr2, subscriber)) {
                    return true;
                } else {
                    i2++;
                }
            }
            objArr = objArr[i];
        }
    }

    /* renamed from: a */
    public <U> boolean mo36916a(Observer<? super U> observer) {
        Object[] objArr = this.f33260b;
        int i = this.f33259a;
        while (true) {
            int i2 = 0;
            if (objArr == null) {
                return false;
            }
            while (i2 < i) {
                Object[] objArr2 = objArr[i2];
                if (objArr2 == null) {
                    continue;
                    break;
                } else if (C12760i.m33369b(objArr2, observer)) {
                    return true;
                } else {
                    i2++;
                }
            }
            objArr = objArr[i];
        }
    }
}
