package p389io.reactivex.internal.operators.observable;

import p389io.reactivex.C12279e;
import p389io.reactivex.Observer;
import p389io.reactivex.internal.observers.C12464c;
import p389io.reactivex.p393i.p394a.C12324b;

/* renamed from: io.reactivex.internal.operators.observable.b0 */
public final class C12546b0<T> extends C12279e<T> {

    /* renamed from: e */
    final T[] f32563e;

    /* renamed from: io.reactivex.internal.operators.observable.b0$a */
    static final class C12547a<T> extends C12464c<T> {

        /* renamed from: e */
        final Observer<? super T> f32564e;

        /* renamed from: f */
        final T[] f32565f;

        /* renamed from: g */
        int f32566g;

        /* renamed from: h */
        boolean f32567h;

        /* renamed from: i */
        volatile boolean f32568i;

        C12547a(Observer<? super T> observer, T[] tArr) {
            this.f32564e = observer;
            this.f32565f = tArr;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo36728a() {
            T[] tArr = this.f32565f;
            int length = tArr.length;
            for (int i = 0; i < length && !isDisposed(); i++) {
                T t = tArr[i];
                if (t == null) {
                    Observer<? super T> observer = this.f32564e;
                    StringBuilder sb = new StringBuilder();
                    sb.append("The element at index ");
                    sb.append(i);
                    sb.append(" is null");
                    observer.onError(new NullPointerException(sb.toString()));
                    return;
                }
                this.f32564e.onNext(t);
            }
            if (!isDisposed()) {
                this.f32564e.onComplete();
            }
        }

        public void clear() {
            this.f32566g = this.f32565f.length;
        }

        public void dispose() {
            this.f32568i = true;
        }

        public boolean isDisposed() {
            return this.f32568i;
        }

        public boolean isEmpty() {
            return this.f32566g == this.f32565f.length;
        }

        public T poll() {
            int i = this.f32566g;
            T[] tArr = this.f32565f;
            if (i == tArr.length) {
                return null;
            }
            this.f32566g = i + 1;
            return C12324b.m32836a(tArr[i], "The array element is null");
        }

        public int requestFusion(int i) {
            if ((i & 1) == 0) {
                return 0;
            }
            this.f32567h = true;
            return 1;
        }
    }

    public C12546b0(T[] tArr) {
        this.f32563e = tArr;
    }

    /* renamed from: a */
    public void mo35836a(Observer<? super T> observer) {
        C12547a aVar = new C12547a(observer, this.f32563e);
        observer.onSubscribe(aVar);
        if (!aVar.f32567h) {
            aVar.mo36728a();
        }
    }
}
