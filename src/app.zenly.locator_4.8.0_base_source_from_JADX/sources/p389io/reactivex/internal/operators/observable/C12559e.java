package p389io.reactivex.internal.operators.observable;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.Observer;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.exceptions.C12285a;
import p389io.reactivex.internal.disposables.C12458b;
import p389io.reactivex.internal.disposables.C12459c;
import p389io.reactivex.p393i.p394a.C12324b;

/* renamed from: io.reactivex.internal.operators.observable.e */
public final class C12559e<T, U extends Collection<? super T>> extends C12538a<T, U> {

    /* renamed from: f */
    final int f32601f;

    /* renamed from: g */
    final int f32602g;

    /* renamed from: h */
    final Callable<U> f32603h;

    /* renamed from: io.reactivex.internal.operators.observable.e$a */
    static final class C12560a<T, U extends Collection<? super T>> implements Observer<T>, Disposable {

        /* renamed from: e */
        final Observer<? super U> f32604e;

        /* renamed from: f */
        final int f32605f;

        /* renamed from: g */
        final Callable<U> f32606g;

        /* renamed from: h */
        U f32607h;

        /* renamed from: i */
        int f32608i;

        /* renamed from: j */
        Disposable f32609j;

        C12560a(Observer<? super U> observer, int i, Callable<U> callable) {
            this.f32604e = observer;
            this.f32605f = i;
            this.f32606g = callable;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo36730a() {
            try {
                U call = this.f32606g.call();
                C12324b.m32836a(call, "Empty buffer supplied");
                this.f32607h = (Collection) call;
                return true;
            } catch (Throwable th) {
                C12285a.m32748b(th);
                this.f32607h = null;
                Disposable disposable = this.f32609j;
                if (disposable == null) {
                    C12459c.m32985a(th, this.f32604e);
                } else {
                    disposable.dispose();
                    this.f32604e.onError(th);
                }
                return false;
            }
        }

        public void dispose() {
            this.f32609j.dispose();
        }

        public boolean isDisposed() {
            return this.f32609j.isDisposed();
        }

        public void onComplete() {
            U u = this.f32607h;
            if (u != null) {
                this.f32607h = null;
                if (!u.isEmpty()) {
                    this.f32604e.onNext(u);
                }
                this.f32604e.onComplete();
            }
        }

        public void onError(Throwable th) {
            this.f32607h = null;
            this.f32604e.onError(th);
        }

        public void onNext(T t) {
            U u = this.f32607h;
            if (u != null) {
                u.add(t);
                int i = this.f32608i + 1;
                this.f32608i = i;
                if (i >= this.f32605f) {
                    this.f32604e.onNext(u);
                    this.f32608i = 0;
                    mo36730a();
                }
            }
        }

        public void onSubscribe(Disposable disposable) {
            if (C12458b.m32974a(this.f32609j, disposable)) {
                this.f32609j = disposable;
                this.f32604e.onSubscribe(this);
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.e$b */
    static final class C12561b<T, U extends Collection<? super T>> extends AtomicBoolean implements Observer<T>, Disposable {
        private static final long serialVersionUID = -8223395059921494546L;

        /* renamed from: e */
        final Observer<? super U> f32610e;

        /* renamed from: f */
        final int f32611f;

        /* renamed from: g */
        final int f32612g;

        /* renamed from: h */
        final Callable<U> f32613h;

        /* renamed from: i */
        Disposable f32614i;

        /* renamed from: j */
        final ArrayDeque<U> f32615j = new ArrayDeque<>();

        /* renamed from: k */
        long f32616k;

        C12561b(Observer<? super U> observer, int i, int i2, Callable<U> callable) {
            this.f32610e = observer;
            this.f32611f = i;
            this.f32612g = i2;
            this.f32613h = callable;
        }

        public void dispose() {
            this.f32614i.dispose();
        }

        public boolean isDisposed() {
            return this.f32614i.isDisposed();
        }

        public void onComplete() {
            while (!this.f32615j.isEmpty()) {
                this.f32610e.onNext(this.f32615j.poll());
            }
            this.f32610e.onComplete();
        }

        public void onError(Throwable th) {
            this.f32615j.clear();
            this.f32610e.onError(th);
        }

        public void onNext(T t) {
            long j = this.f32616k;
            this.f32616k = 1 + j;
            if (j % ((long) this.f32612g) == 0) {
                try {
                    Object call = this.f32613h.call();
                    C12324b.m32836a(call, "The bufferSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.");
                    this.f32615j.offer((Collection) call);
                } catch (Throwable th) {
                    this.f32615j.clear();
                    this.f32614i.dispose();
                    this.f32610e.onError(th);
                    return;
                }
            }
            Iterator it = this.f32615j.iterator();
            while (it.hasNext()) {
                Collection collection = (Collection) it.next();
                collection.add(t);
                if (this.f32611f <= collection.size()) {
                    it.remove();
                    this.f32610e.onNext(collection);
                }
            }
        }

        public void onSubscribe(Disposable disposable) {
            if (C12458b.m32974a(this.f32614i, disposable)) {
                this.f32614i = disposable;
                this.f32610e.onSubscribe(this);
            }
        }
    }

    public C12559e(ObservableSource<T> observableSource, int i, int i2, Callable<U> callable) {
        super(observableSource);
        this.f32601f = i;
        this.f32602g = i2;
        this.f32603h = callable;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo35836a(Observer<? super U> observer) {
        int i = this.f32602g;
        int i2 = this.f32601f;
        if (i == i2) {
            C12560a aVar = new C12560a(observer, i2, this.f32603h);
            if (aVar.mo36730a()) {
                this.f32549e.subscribe(aVar);
                return;
            }
            return;
        }
        this.f32549e.subscribe(new C12561b(observer, i2, i, this.f32603h));
    }
}
